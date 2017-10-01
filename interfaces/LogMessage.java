package ch.hslu.logger;

import java.time.LocalDateTime;

public interface LogMessage {
    LogLevel getLogLevel();
    String getMessage();
    LocalDateTime getCreatedAt();
    LocalDateTime getReceivedAt();
}
