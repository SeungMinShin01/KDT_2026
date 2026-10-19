package day16;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class LLMController {
    private final LLMService llmService;

    // 1.
    @GetMapping("/chat1")
    public String chat1(
            @RequestParam("promt") String prompt) {
        return llmService.chat1(prompt);
    }

    // 2.
    @GetMapping("/chat2")
    public String chat2() {
        return llmService.Chat2();
    }
}