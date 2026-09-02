package day04.practice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

// @Component // 스프링 컨테이너 빈(객체) 등록
// @Controller // HTTP 서블릿 + @Component
@RestController // @ResponseBody: http(응답) content-type:application/json + @Controller
// 주로 뷰 반환: @Controller , 값 반환: @RestController
@RequestMapping("/test") // 해당 클래스내 공통 URL 정의
public class TestController {

    @PostMapping("") // 상위(클래스)에 "/test" 주소가 정의됨
    public boolean testWrite(@RequestBody TestDto testDto) {
        System.out.println("TestController.testWrite()");
        return true;
    }

    @GetMapping("")
    public ArrayList<TestDto> testPrint() {
        System.out.println("TestController.testPrint()");
        ArrayList<TestDto> list = new ArrayList<>();
        list.add(new TestDto(1, "내용1", "작성자1"));
        list.add(new TestDto(2, "내용2", "작성자2"));
        return list;
    }

    @GetMapping("/detail")
    public TestDto testDetail(@RequestParam int no) {
        System.out.println("TestController.testDetail()");
        return new TestDto(1, "내용1", "작성자1");
    }

    @DeleteMapping()
    public boolean testDelete(@PathVariable(name = "no") int no) {
        System.out.println("TestController.testDelete()");
        return true;
    }

    @PutMapping()
    public boolean testUpdate(@RequestBody TestDto testDto) {
        System.out.println("TestController.testUpdate()");
        return true;
    }

}
