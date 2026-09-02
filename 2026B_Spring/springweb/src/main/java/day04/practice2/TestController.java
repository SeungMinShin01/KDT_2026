package day04.practice2;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test2")
public class TestController {
    private final TestService testService;

    // [1] 저장
    @PostMapping("")
    public boolean save(@RequestBody TestEntity testEntity) {
        return testService.save(testEntity);
    }

    // [2] 전체조회
    @GetMapping("")
    public List<TestEntity> findAll() {
        return testService.findAll();
    }

    // [3] 개별조회
    @GetMapping("/detail")
    public Optional<TestEntity> testDetail(@RequestParam int bno) {
        return testService.testDetail(bno);
    }

    // [4] 삭제
    @DeleteMapping("")
    public boolean delete(@RequestParam(name = "bno") int no) {
        return testService.delete(no);
    }

    // [5] 수정
    @PutMapping("")
    public boolean update(@RequestBody TestEntity testEntity) {
        return testService.update(testEntity);
    }
}
