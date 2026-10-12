package day13;

import java.util.List;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/redis")
@RequiredArgsConstructor
public class RedisController2 {
    private final RedisService2 redisService;

    @GetMapping("/add")
    public String save(
            @RequestParam(name = "data") String data) {
        return redisService.save(data);

    }

    @GetMapping("/all")
    public List<String> getList() {
        return redisService.getList();
    }
}
