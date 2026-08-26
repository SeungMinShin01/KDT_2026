package day02.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

/*
    컨트롤러에 서블릿(HTTP 프로토콜을 사용 가능하게 기능/방법(GET/POST/PUT/DELETE)을 제공하는 클래스 )
    기능 달기
    * 레거시(과거) 코드는 상속받아 서블릿 구현
    * 스프링은 @Controller 포함
    // 1. 웹 기술 포함할 컨트롤러 클래스 위에 @Controller 또는 반환타입이 JSON이면 @RestController
    * HTTP Content Type: 데이터를 http를 통해 데이터 받은 곳에서 데이터 사용하는 방법 타입/규칙/가이드
    text/html , application/json , form 등등 ( DTO는 없다. )
    // 2. 해당 메소드 마다의 URL 정의
*/

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import day02.Model.Dao.BoardDao;
import day02.Model.Dto.BoardDto;

// 질문 유형 내가 알고 있는 어노테이션 말해보기 / 웹 관련된 어노테이션 말해보기 등등
// 반환타입이 boolean(=JSON)이므로 @Controller 가 아니라 @RestController 를 써야 한다.
// @Controller 로 두면 반환값 "true"를 뷰(HTML 파일) 이름으로 찾다가 에러가 난다.
@RestController
public class BoardController {
    private BoardDao bd = BoardDao.getInstance();

    // [1] 등록
    @PostMapping("/board/save")
    public boolean save(BoardDto boardDto) {
        boolean result = bd.save(boardDto);
        return result;
    }

    // [2] 전체조회
    @GetMapping("/board/findall")
    public ArrayList<BoardDto> findAll() {
        ArrayList<BoardDto> result = bd.findAll();
        return result;
    }

    // [3] 개별수정 Controller
    @PutMapping("/board/update")
    public boolean update(BoardDto boardDto) {
        return bd.update(boardDto);
    }

    // [4] 개별삭제 Controller
    @DeleteMapping("/board/delete")
    public boolean delete(int no) {
        return bd.delete(no);
    }

}
