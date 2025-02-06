package spring.ai.example.spring_ai_demo.api.models;

import org.springframework.ai.chat.messages.MessageType;

import java.util.Map;

public interface Message {
    String getContent();

    Map<String, Object> getProperties();

    MessageType getMessageType();
}
