package spring.ai.example.spring_ai_demo.api.models;


import java.util.List;

public class AiResponse {
    private final List<Generation> generations;

    public AiResponse(List<Generation> generations) {
        this.generations = generations;
    }

    public List<Generation> getGenerations() {
        return generations;
    }
}
