package ch.hslu.logger;

public interface Logger {

    LogLevel DEFAULT_LOG_LEVEL = LogLevel.Debug;
    int DEFAULT_MESSAGE_AMOUNT = 20;

    void start(LoggerSetup setup);

    void log(LogLevel level, String message);

    void setReportLevel(LogLevel level);
    LogLevel getReportLevel();

    List<LogMessage> getLatestMessagesFromServer(int amount, LogLevel minLevel) throws NoConnectionToLogServerException;

    default List<LogMessage> getLatestMessagesFromServer() throws NoConnectionToLogServerException {
        return this.getLatestMessagesFromServer(DEFAULT_MESSAGE_AMOUNT, DEFAULT_LOG_LEVEL);
    }

    default List<LogMessage> getLatestMessagesFromServer(int amount) throws NoConnectionToLogServerException {
        return this.getLatestMessagesFromServer(amount, DEFAULT_LOG_LEVEL);
    }

    default List<LogMessage> getLatestMessagesFromServer(LogLevel minLevel) throws NoConnectionToLogServerException {
        return this.getLatestMessagesFromServer(DEFAULT_MESSAGE_AMOUNT, minLevel);
    }

    default void emergency(String message) {
        this.log(LogLevel.Emergency, message);
    }

    default void alert(String message) {
        this.log(LogLevel.Alert, message);
    }

    default void critical(String message) {
        this.log(LogLevel.Critical, message);
    }

    default void error(String message) {
        this.log(LogLevel.Error, message);
    }

    default void warning(String message) {
        this.log(LogLevel.Warning, message);
    }

    default void notice(String message) {
        this.log(LogLevel.Notice, message);
    }

    default void info(String message) {
        this.log(LogLevel.Info, message);
    }

    default void debug(String message) {
        this.log(LogLevel.Debug, message);
    }
}
