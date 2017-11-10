package ch.hslu.logger;

import java.util.List;

public class Logger {

    /**
     * Create a new logger
     * @remarks Just for internal use
     */
    private Logger() { }

    /**
     * Create a new logger
     */
    public static Logger create(LoggerSetup setup) throws NoConnectionToLogServerException {
        // TODO
    }

    /**
     * Log a message
     */
    public void log(LogLevel level, String message) {
        // TODO
    }

    /**
     * Set minimum log level which should be reported to the server
     */
    public void setReportLevel(LogLevel level) {
        // TODO
    }

    /**
     * Get the minimum log level which will be reported to the server
     */
    public LogLevel getReportLevel() {
        // TODO
    }

    /**
     * Get the all log messages from the server
     * @throws NoConnectionToLogServerException
     */
    public List<LogMessage> geLogMessagesFromServer() throws NoConnectionToLogServerException {
        // TODO
    }

}
