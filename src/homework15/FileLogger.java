package homework15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileLogger {
    private FileLoggerConfiguration config;

    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
    }
    public void debug(String message) throws FileMaxSizeReachedException {
        log(message, LoggingLevel.DEBUG);
    }

    public void info(String message) throws FileMaxSizeReachedException {
        log(message, LoggingLevel.INFO);
    }

    private void log(String message, LoggingLevel level) throws FileMaxSizeReachedException {
        if (config.getLoggingLevel().compareTo(level) < 0) {
            return;
        }

        File file = new File(config.getFile());
        if (file.length() > config.getMaxFileSize()) {
            throw new FileMaxSizeReachedException("Max file size reached",
                    config.getMaxFileSize(), file.length(), file.getAbsolutePath());
        }

        try (FileWriter writer = new FileWriter(file, true)) {
            String log = String.format("[%s][%s] %s: [%s]%n",
                    new Date(), level, config.getFormat(), message);
            writer.write(log);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
