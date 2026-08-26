package day02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 스프링: 프레임워크 이므로 다양한 도구와 틀을 제공한다.
// @어노테이션: 코드에 추가적인 설명과 의미를 부여할 때 사용 (라벨 / 주석)
// 1. @SpringBootApplication 1) 내장 톰캣 (자동)세팅 2) 서블릿(Controller/컴포넌트) 자동 등록
// - 이 클래스가 속한 패키지(day02)와 그 하위 패키지를 스캔해서 빈을 등록한다.
@SpringBootApplication
public class AppStart {

    public static void main(String[] args) {
        // 2. Spirng 실행 , SpringBootApplication [X] SpringApplication [O]
        // SpringApplication.run(현재클래스명.class); // 클래스.class : 클레스 메타정보(멤버변수/생성자/메소드) 반환
        // args : 실행할 때 준 명령행 옵션(--server.port=8081 등)을 스프링에게 전달

        SpringApplication.run(AppStart.class, args);
        // 3. Crtl + F5 실행 , 주의할점 : 2개 이상 실행 불가능
        // 4. 실행 확인 : http://localhost:8080 / http://127.0.0.1:8080
    }
}
