package day03.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 1. 내장톰캣지원 2. IOC/DI 컴포넌트 지원
public class AppStart {

    // 스프링 실행 : 이 클래스가 속한 패키지(day03.exam)와 하위 패키지를 스캔한다.
    public static void main(String[] args) {
        SpringApplication.run(AppStart.class, args);
    }

}
