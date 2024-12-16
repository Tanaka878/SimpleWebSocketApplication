package org.example.websockets.config.chat;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
@Builder

public class ChatMessage {
    private final String message;
    private final String sender;
    private final MessageType type;
    private final LocalDateTime time;
}
