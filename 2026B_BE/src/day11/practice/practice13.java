package day11.practice;

import javax.xml.crypto.Data;

public class practice13 {
    public static void main(String[] args) {
        // 1번
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeSound();
        dog.makeSound();

        // 2번
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);

        // 3번
        Character character = new Character();
        Gun gun = new Gun();
        Sword sword = new Sword();
        character.useWeapon(sword);
        character.useWeapon(gun);

        // 4번
        Duck duck = new Duck();
        duck.Swin();
        duck.fly();

        // 5번
        Object obj = new Duck();
        if (obj instanceof Flyable) {
            Duck duck2 = (Duck) obj;
            duck2.fly();
        }
        if (obj instanceof Swimmable) {
            Duck duck3 = (Duck) obj;
            duck3.Swin();
        }

        // 6번
        DataAccessObject dao;
        dao = new OracleDao();
        dao.save();
        dao = new MySqlDao();
        dao.save();

        // 7번
        Greeting g = new Greeting() {
            @Override
            public void welcome() {
                System.out.println("환영 인사");
            }
        };
        g.welcome();

        // 8번
        Television television = new Television();
        television.turnOn();
        television.turnOff();
        television.setMute(false);
        television.setMute(true);

        // 9번
        System.out.println(Calculator.plus(10, 20));

    }
}

// 1번
interface Soundable {
    public abstract void makeSound();
}

class Cat implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}

class Dog implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}

// 2번
interface RemoteControl {
    public final static int MAX_VOLUME = 10;
    public final static int MIN_VOLUME = 0;

}

// 3번
interface Attackable {
    public void attack();
}

class Sword implements Attackable {
    @Override
    public void attack() {
        System.out.println("검으로 공격");
    }
}

class Gun implements Attackable {
    @Override
    public void attack() {
        System.out.println("총으로 공격");
    }
}

class Character {
    public void useWeapon(Attackable weapon) {
        weapon.attack();
    }
}

// 4번
interface Flyable {
    void fly();
}

interface Swimmable {
    void Swin();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void Swin() {
        System.out.println("물에서 헤엄친다.");
    }

    @Override
    public void fly() {
        System.out.println("하늘을 난다.");
    }
}

// 6번

interface DataAccessObject {
    void save();
}

class OracleDao implements DataAccessObject {
    @Override
    public void save() {
        System.out.println("Oracle Db에 저장");
    }
}

class MySqlDao implements DataAccessObject {
    @Override
    public void save() {
        System.out.println("MYSQL DB 저장");
    }
}

// 7번
interface Greeting {
    void welcome();
}

// 8번
interface Device {
    void turnOn();

    void turnOff();

    public default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        } else
            System.out.println("무음모드 종료");

    }
}

class Television implements Device {
    @Override
    public void turnOn() {
        System.out.println("티비가 켜진다.");
    }

    @Override
    public void turnOff() {
        System.out.println("티비가 꺼진다.");
    }
}

// 9번
interface Calculator {
    public static int plus(int x, int y) {
        int result = x + y;
        return result;
    }
}