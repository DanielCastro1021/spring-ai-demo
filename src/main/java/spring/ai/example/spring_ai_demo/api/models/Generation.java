package spring.ai.example.spring_ai_demo.api.models;

import java.util.Map;

public class Generation {
    private final String text;
    private Map<String, Object> info;

    public Generation(String text, Map<String, Object> info) {
        this.text = text;
        this.info = info;
    }

    public String getText() {
        return text;
    }

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }
}
