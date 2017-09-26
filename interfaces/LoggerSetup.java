package ch.hslu.logger;

import java.net.InetAddress;

public interface LoggerSetup {

    InetAddress getServerAddress();
    void setServerAddress(InetAddress address);

    int getPortNumber();
    void setPortNumber(int number);

    LogLevel getReportLevel();
    void setReportLevel(LogLevel level);

    int getServerMaxTimeoutInMilliseconds();
    void setServerMaxTimeoutInMillisecond(int timeout);

    void loadFromConfigFile() throw ConfigFileNotFoundException;
}
