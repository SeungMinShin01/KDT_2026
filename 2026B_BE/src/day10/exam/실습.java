package day10.exam;

public class 실습 {

    public static void main(String[] args) {
        Car myCar = new Car(); // Car 객체 생성
        myCar.run(); // 오류 발생

        myCar.tire = new Tire();
        // Object생성 -> 타이어 생성 -> car.tire에 저장
        // Tire 객체 생성한 뒤, car의 타이어 타입 변수에 참조값 저장

        myCar.run();
        // car의 메소드 run 호출 run() -> tire의 roll() 호출

        myCar.tire = new HankookTire();
        // Object생성 -> 타이어 생성 -> 한국타이어 생성 -> Car.tire에 저장
        // 타이어의 자식(한국타이어) 생성뒤, car의 타이어 타입 변수에 참조값 저장

        myCar.run();
        // myCar.tire -> 한국타이어 / myCar.run() -> 한국타이어 roll()
        // car의 메소드 run() 호출 -> run()내부의 tire.roll() 호출
        // -> 한국타이어의 roll() 오버라이딩 호출[tire의 roll() 호출]

        myCar.tire = new KumhoTire();
        // Object생성 -> 타이어 생성 -> 금호타이어 생성 -> Car.tire에 저장
        // 타이어의 자식(금호타이어) 생성뒤, car의 타이어 타입 변수에 참조값 저장
        // 금호 <-> 한국 타이어는 형제 관계 // 서로 참조 불가

        myCar.run();
        // myCar.tire -> 금호타이어 / myCar.run() -> 금호타이어 roll()
        // car의 메소드 run() 호출 -> run()내부의 tire.roll() 호출
        // -> 금호타이어의 roll() 오버라이딩 호출[tire의 roll() 호출]

        System.out.println(myCar.tire instanceof Tire); // true
        System.out.println(myCar.tire instanceof KumhoTire); // true
        System.out.println(myCar.tire instanceof HankookTire); // false
        // -> 현재 myCar.tire에 저장되어있는 참조값은 금호 타이어이다.
        // -> 따라서, 금호타이어의 부모인 타이어 타입은 될 수 있지만,
        // -> 형제관계인 한국타이어의 타입은 될 수 없다.

    } // main
} // class end

class Car { // 자동차
    Tire tire; // 타이어 타입의 타이어 참조

    void run() {
        this.tire.roll(); // 타이어 타입의 메소드 실행
    }
}

class Tire { // 타이어
    void roll() { // 상위 메소드 ( 타이어 회전 )
        System.out.println("[일반] 타이어가 회전");
    }
}

class HankookTire extends Tire { // 타이어 상속
    void roll() { // 하위메소드 오버라이딩(한국타이어)
        System.out.println("[한국] 타이어가 회전(업그레이드)");
    }
}

class KumhoTire extends Tire { // 타이어 상속
    void roll() { // 하위메소드 오버라이딩(금호타이어)
        System.out.println("[금호] 타이어가 회전(업그레이드)");
    }
}