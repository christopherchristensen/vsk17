package ch.hslu.logger;

import java.time.LocalDateTime;

public class LogMessage {
    private LogLevel level;
    private String message;
    private LocalDateTime created_at;
    private LocalDateTime received_at;
}
