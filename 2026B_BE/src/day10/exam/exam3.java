package day10.exam;

public class exam3 {

}

/*
 * 오버로딩 : 생성자명/메소드명 동일하게
 * 오버라이디 : 물려받은 메소드를 재정의
 */

class 상위클래스 {
    int value1 = 10;
    int value2 = 20;

    상위클래스() {
        System.out.println("상위클래스 생성");
    }

    void show() {
        System.out.println("상위 메소드 실행");
    }
}