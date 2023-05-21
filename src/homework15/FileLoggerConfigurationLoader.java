package homework15;

public class FileLoggerConfigurationLoader {
    public FileLoggerConfiguration load(String fileName) {
        return new FileLoggerConfiguration(fileName,LoggingLevel.DEBUG,2000,"Message");
    }
}
