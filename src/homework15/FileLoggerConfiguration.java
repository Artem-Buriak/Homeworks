package homework15;

public class FileLoggerConfiguration {
    private String file;
    private LoggingLevel loggingLevel;
    private long maxFileSize;
    private String format;

    public FileLoggerConfiguration(String file, LoggingLevel loggingLevel, long maxFileSize, String format) {
        this.file = file;
        this.loggingLevel = loggingLevel;
        this.maxFileSize = maxFileSize;
        this.format = format;
    }

    public String getFile() {
        return file;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public long getMaxFileSize() {
        return maxFileSize;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "FileLoggerConfiguration{" +
                "file='" + file + '\'' +
                ", loggingLevel=" + loggingLevel +
                ", maxFileSize=" + maxFileSize +
                ", format='" + format + '\'' +
                '}';
    }
}
