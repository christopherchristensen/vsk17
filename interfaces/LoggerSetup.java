package ch.hslu.logger;

public class LoggerSetup {

    /**
     * Create a new logger setup class
     * @remarks Just for internal use
     */
    private LoggerSetup() { }

    /**
     * Create a new logger setup class
     */
    public static LoggerSetup create() {
        // TODO
    }

    /**
     * Get the log server address
     */
    public String getServerAddress() {
        // TODO
    }

    /**
     * Set the log server address
     */
    public void setServerAddress(String address) {
        // TODO
    }

    /**
     * Get the port to connect to the log server
     */
    public int getPortNumber() {
        // TODO
    }

    /**
     * Set the port to connect to the log server
     */
    public void setPortNumber(int number) {
        // TODO
    }

    /**
     * Get the minimum log level which will be reported to the server
     */
    public LogLevel getReportLevel() {
        // TODO
    }

    /**
     * Set minimum log level which should be reported to the server
     */
    public void setReportLevel(LogLevel level) {
        // TODO
    }

    /**
     * Get the maximum timeout in milisecond for the connection to the log server
     */
    public int getServerMaxTimeoutInMilliseconds() {
        // TODO
    }

    /**
     * Set the maximum timeout in milisecond for the connection to the log server
     */
    public void setServerMaxTimeoutInMillisecond(int timeout) {
        // TODO
    }

    /**
     * Create a logger with the configured parameters
     */
    public Logger createLogger() throws NoConnectionToLogServerException {
        // TODO
    }

    /**
     * Load the logger config from the config file
     */
    public void loadFromConfigFile() throws ConfigFileNotFoundException {
        // TODO
    }


}
