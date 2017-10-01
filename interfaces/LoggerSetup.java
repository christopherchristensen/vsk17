package ch.hslu.logger;

import java.net.InetAddress;

public interface LoggerSetup {

    /**
     * Get the log server address
     */
    InetAddress getServerAddress();

    /**
     * Set the log server address
     */
    void setServerAddress(InetAddress address);

    /**
     * Get the port to connect to the log server
     */
    int getPortNumber();

    /**
     * Set the port to connect to the log server
     */
    void setPortNumber(int number);

    /**
     * Get the minimum log level which will be reported to the server
     */
    LogLevel getReportLevel();

    /**
     * Set minimum log level which should be reported to the server
     */
    void setReportLevel(LogLevel level);

    /**
     * Get the maximum timeout in milisecond for the connection to the log server
     */
    int getServerMaxTimeoutInMilliseconds();

    /**
     * Set the maximum timeout in milisecond for the connection to the log server
     */
    void setServerMaxTimeoutInMillisecond(int timeout);

    /**
     * Create a logger with the configured parameters
     */
    Logger createLogger() throw NoConnectionToLogServerException;

    /**
     * Load the logger config from the config file
     */
    void loadFromConfigFile() throw ConfigFileNotFoundException;
}
