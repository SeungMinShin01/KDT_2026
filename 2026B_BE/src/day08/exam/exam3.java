package day08.exam;

import day07.practice.miniProject;

public class exam3 {
    public static void main(String[] args) {
        D 변수 = new D();
        // 변수. 고정변수 = 20; // 오류

        // [2] static : 클래스명.정적변수
        D.정적변수 = 20;
        D.정적변수 = 30; // 총 메모리 1개
        // VS 멤버변수 : 객체명.멤버변수
        D 변수1 = new D();
        변수1.멤버변수 = 20;
        D 변수2 = new D();
        변수2.멤버변수 = 30; // 총 메모리 2개

        // [3] 상수 : 클래스명.상수명
        System.out.println(D.상수);

    }

}

class D {
    // - final : 초기값(필수) 이후 수정 불가능
    public final int 고정변수 = 3;
    // - static 키워드 : (정적) 인스턴스없이 우선할당 변수
    public static int 정적변수 = 10; // 클래스/ 정적 변수
    public int 멤버변수 = 10;
    // * static 프로그램 시작시 할당되고 프로그램 종료시 사라진다.
    // - public static final : 상수
    public static final int 상수 = 30;

    // --- static은 우선할당 이므로 static이 아닌 변수/메소드 접근이 안된다.
    // ---> 해결방안 : 인스턴스/객체를 통해 멤버변수/메소드를 시용하자

}