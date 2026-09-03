package day05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    // 1. 전체조회
    @GetMapping("/test")
    public List<TestDto> 전체조회() {
        return testService.findAll();
    }
}
