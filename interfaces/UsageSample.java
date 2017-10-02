package ch.hslu.logger;

import java.util.List;

public class UsageSample {
    public static void main(String[] args) throws NoConnectionToLogServerException {
        LoggerSetup setup = LoggerSetup.create();
        setup.setPortNumber(12345);
        setup.setReportLevel(LogLevel.Debug);
        setup.setServerAddress("127.0.0.1");
        setup.setServerMaxTimeoutInMillisecond(1000);

        Logger logger = setup.createLogger();
        logger.log(LogLevel.Debug, "Alles ok!");
        logger.log(LogLevel.Error, "Ohhh nein, ein Fehler");
        logger.setReportLevel(LogLevel.Warning);
        logger.log(LogLevel.Debug, "Alles ok!");

        List<LogMessage> messages = logger.geLogMessagesFromServer();
        for (LogMessage m : messages) {
            System.out.println("Message:" + m.getMessage());
            System.out.println("LogLevel: " + m.getLogLevel());
            System.out.println("CreatedAt:" + m.getCreatedAt());
            System.out.println("ReceivedAt:" + m.getReceivedAt());
        }
    }

}