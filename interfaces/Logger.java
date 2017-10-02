package ch.hslu.logger;

import java.util.List;

public interface Logger {

    /**
     * Log a message
     */
    void log(LogLevel level, String message);

    /**
     * Set minimum log level which should be reported to the server
     */
    void setReportLevel(LogLevel level);

    /**
     * Get the minimum log level which will be reported to the server
     */
    LogLevel getReportLevel();

    /**
     * Get the all log messages from the server
     * @throws NoConnectionToLogServerException
     */
    List<LogMessage> geLogMessagesFromServer() throws NoConnectionToLogServerException;

}
