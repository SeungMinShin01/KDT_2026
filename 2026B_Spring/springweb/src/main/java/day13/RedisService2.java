package day13;

import java.util.List;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RedisService2 {
    private final StringRedisTemplate stringRedisTemplate;

    public String save(String data) {
        try {
            stringRedisTemplate.opsForList().rightPush("list", data);
            return "레디스저장성공";
        } catch (Exception e) {
            return "레디스저장실패";
        }
    }

    public List<String> getList() {
        return stringRedisTemplate.opsForList().range("list", 0, -1);
    }
}
