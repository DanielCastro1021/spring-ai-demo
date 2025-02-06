package spring.ai.example.spring_ai_demo.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.ai.example.spring_ai_demo.api.service.PoetryService;

@RestController
@RequestMapping("ai")
public class PoetryController {
    PoetryService poetryService;

    public PoetryController(PoetryService poetryService) {
        this.poetryService = poetryService;
    }

    @GetMapping("/cathaiku")
    public ResponseEntity<String> generateHaiku() {
        return ResponseEntity.ok(poetryService.getCatHaiku());
    }
}
