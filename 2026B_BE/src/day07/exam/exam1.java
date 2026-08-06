package day07.exam;

public class exam1 {
    public static void main(String[] args) {
        /*
         * 함수란 기능을 수행하는 코드 집합
         * 메소드란 자바에서는 메소드라고 부른다
         * 메소드
         * 1) 클래스 내부 선언
         * 2) 목적 : 재사용 , 인수에 따른 서로 다른 결과물/반환
         * 3) 선언
         * 반환타입 메소드명( 타입 매개변수 ){
         * return 반환값
         * }
         * - 반환타입 : 반환값의 타입/자료형 일치해야함
         * - 메소드명 : 소문자 시작하는 카멜표기법
         */

        계산기 나만의계산기 = new 계산기();
        나만의계산기.getPi();
        나만의계산기.powerOn();
        나만의계산기.printSum(10, 5);
        나만의계산기.add(10, 5);

        // 주의할점 : this로 인스턴스 식별
        // 1. 강호동, 유재석
        사람타입 p1 = new 사람타입("강호동");
        사람타입 p2 = new 사람타입("유재석");
        // 2. 강호동 취업성공
        p1.취업성공("개발자");
        // 3. 확인
        System.out.println(p1.job);
        System.out.println(p2.job);
    }
}

class 계산기 {
    // 1. 멤버변수
    // 2. 생성자
    // 3. 메소드/함수
    // 1) 매개변수 X 반환값 O
    double getPi() {
        return 3.14;
    }

    // 2) 매개변수X , 반환값 X
    void powerOn() {
        System.out.println("On");
        return;
    }

    // 3) 매개변수O , 반환값 X
    void printSum(int x, int y) {
        System.out.println(x + y);
    }

    int add(int x, int y) {
        this.printSum(x, y);
        return x + y;
    }
}

class 사람타입 {
    // 사람이 가져야할 상태 설계 = 멤버변수
    String name;
    int age;
    String job;

    // 사람이 태어날때 초기로 가져야할 설계 = 생성자
    사람타입(String name) {
        this.name = name;
        age = 1;
    }

    // 취업/행위/상태변경 설계 = 메소드
    void 취업성공(String 취업한직업) {
        this.job = 취업한직업;
        return;
    }

}