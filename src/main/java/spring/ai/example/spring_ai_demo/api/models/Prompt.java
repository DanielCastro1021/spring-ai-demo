package spring.ai.example.spring_ai_demo.api.models;

import java.util.List;

public class Prompt {
    List<Message> messages;

    public Prompt(List<Message> messages) {
        this.messages = messages;
    }
}
