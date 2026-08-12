package day11.exam;

public class exam3 {
    public static void main(String[] args) {
        // 1.
        Car myCar = new Car();
        // myCar.run(); // 오류 발생 because "this.tire" is null

        // 2.
        // myCar.tire = new Tire(); // 오류 발생 인터페이스로 객체생성 불가능

        // 3.
        myCar.tire = new HankookTire();
        myCar.run();

        // 4.
        myCar.tire = new KumhoTire();
        myCar.run();
        // 5.
        System.out.println(myCar.tire instanceof Tire); // true
        System.out.println(myCar.tire instanceof KumhoTire); // true
        System.out.println(myCar.tire instanceof HankookTire); // false
        // [*] 익명(클래스없이) 구현체 = 일회성 사용하는 인터페이스 구현체
        // 자체적으로 추상메소드 오버라이딩
        // new 인터페이스명 () { 오버라이딩 }
        myCar.tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("일반타이어 회전");
            }
        };
        myCar.run();
    }
}

class Car {
    Tire tire;

    void run() {
        this.tire.roll();
    }
}

interface Tire {
    void roll(); // {} 가 없는 메소드는 추상메소드
}

// 구현체
class HankookTire implements Tire {
    // 추상메소드의 { } 구현(재정의)
    @Override
    public void roll() {
        System.out.println("한국타이어 회전");
    }
}

class KumhoTire implements Tire {
    @Override
    public void roll() {
        System.out.println("금호타이어 회전");
    }
}