package day04.Exam;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequiredArgsConstructor // final 멤버변수 생성자 자동
public class ExamController {
    // * 서비스객체 (주입) 불러오기
    private final ExamService examService;

    // [1] 전체조회
    @GetMapping("/day04/exam")
    public List<ExamEntity> findAll() {
        // 서비스호출
        return examService.findAll();
    }

    // [2] 저장
    @PostMapping("/day04/exam")
    public boolean save(@RequestBody ExamEntity entity) {
        // 서비스 호출
        return examService.save(entity);
    }

    // [3] 삭제
    @DeleteMapping("/day04/exam")
    public boolean delete(@RequestParam(name = "no") int no) {
        // 서비스 호출
        return examService.delete(no);
    }

    // [4] 수정
    @PutMapping("day04/exam")
    public boolean update(@RequestBody ExamEntity entity) {
        // tjqltm ghcnf
        return examService.update(entity);
    }
}
