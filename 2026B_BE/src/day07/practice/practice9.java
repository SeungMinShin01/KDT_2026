package day07.practice;

public class practice9 {
    public static void main(String[] args) {
        // 1번
        Printer p1 = new Printer();
        p1.printMessage();

        // 2번
        Greeter g1 = new Greeter();
        g1.greet("승민");

        // 3번
        SimpleCalculator s1 = new SimpleCalculator();
        int result = s1.add(10, 5);
        System.out.println(result);

        // 4번
        Checker c1 = new Checker();
        if (c1.isEven(101))
            System.out.println("짝수입니다.");
        else
            System.out.println("홀수입니다.");

        // 5번
        Lamp l1 = new Lamp();
        l1.turnOn();
        System.out.println(l1.isOn);
        l1.turnOff();
        System.out.println(l1.isOn);

        // 6번
        Product pr1 = new Product();
        System.out.printf("%b\n", pr1.sell(10));

        // 7번
        Visualizer v1 = new Visualizer();
        System.out.println(v1.getStar(10));

        // 8번
        ParkingLot park1 = new ParkingLot();
        System.out.println(park1.calculateFee(65));
        System.out.println(park1.calculateFee(140));

    }
}

class Printer {
    void printMessage() {
        System.out.println("안녕하세요, 메소드입니다.");
    }
}

class Greeter {

    void greet(String name) {
        System.out.printf("안녕하세요 %s님\n", name);

    }
}

// class
class SimpleCalculator {
    int add(int x, int y) {
        return x + y;
    }
}

class Checker {
    boolean isEven(int x) {
        return x % 2 == 0;
    }
}

class Lamp {
    boolean isOn;

    void turnOn() {
        this.isOn = true;
    }

    void turnOff() {
        this.isOn = false;
    }
}

class Product {
    String name;
    int stock;

    Product() {
        this.stock = 10;
    }

    boolean sell(int stock) {
        return this.stock >= stock;
    }
}

class Visualizer {
    String getStar(int x) {
        String star = "";
        for (int i = 0; i < x; i++) {
            star += "★ ";

        }
        return star;
    }
}

class ParkingLot {
    int minute;
    int Fee;

    int calculateFee(int minute) {
        this.minute = minute - 30;
        this.Fee = 1000 + this.minute / 10 * 500;
        if (this.Fee > 20000)
            this.Fee = 20000;
        if (this.minute < 30)
            this.Fee = 1000;
        return this.Fee;
    }
}