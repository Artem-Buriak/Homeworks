package homework15;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Main {
    public static String fileName = "test.txt";
    public static void main(String[] args) throws FileMaxSizeReachedException, InterruptedException {
        FileLoggerConfiguration flc = new FileLoggerConfigurationLoader().load(fileName);
        FileLogger fl = new FileLogger(flc);

        for (var i = 0; i<=100; i++) {
            Thread.sleep(20);
            try {
                fl.info("Test row "+i);
            } catch (homework15.FileMaxSizeReachedException e) {
                System.out.println(e.getMessage()+" let`s create a new File");
                SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy_HHmmss_");
                String dateFileName = formatter.format(new Date());
                Random random = new Random();
                int randomNumber = random.nextInt(100);
                fileName = dateFileName+randomNumber+"_log.txt";
                flc = new FileLoggerConfigurationLoader().load(fileName);
                fl = new FileLogger(flc);
                fl.info("Test row after exception "+i);
            }
        }
    }
}
