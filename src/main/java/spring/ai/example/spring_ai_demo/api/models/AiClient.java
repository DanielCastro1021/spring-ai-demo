package spring.ai.example.spring_ai_demo.api.models;

public interface AiClient {
    default String generate(String message) {
        return null;
    }

    AiResponse generate(Prompt prompt);

}
