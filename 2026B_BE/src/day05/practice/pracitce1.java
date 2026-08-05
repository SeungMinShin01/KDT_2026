package day05.practice;

import java.util.Scanner;

public class pracitce1 {
    public static void main(String[] args) {
        // practice7 문제
        // 1번
        Book b1 = new Book();
        Book b2 = new Book();

        b1.title = "이것이 자바다";
        b1.author = "신용권";
        b1.price = 300000;
        b2.title = "자바의 정석";
        b2.author = "남궁성";
        b2.price = 28000;
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);
        System.out.println(b2.title);
        System.out.println(b2.author);
        System.out.println(b2.price);

        // 2번
        Pet p1 = new Pet();
        Pet p2 = new Pet();

        p1.name = "초코";
        p1.age = 3;
        p1.species = "푸들";
        p2.name = "나비";
        p2.age = 5;
        p2.species = "코리안숏헤어";
        System.out.printf("%s, %s, %d \n%s, %s, %d\n", p1.name, p1.species, p1.age, p2.name, p2.species, p2.age);

        // 3번
        Rectangle r1 = new Rectangle();
        r1.width = 10;
        r1.height = 5;
        System.out.println(r1.width * r1.height);

        // 4번
        BankAccount bank1 = new BankAccount();
        bank1.accountNumber = "111-222-333";
        bank1.ownerName = "유재석";
        bank1.balance = 10000;
        bank1.balance += 5000;
        System.out.println(bank1.balance);
        bank1.balance -= 3000;
        System.out.println(bank1.balance);

        // 5번
        Product pd1 = new Product();
        Product pd2 = new Product();
        pd1.name = "새우깡";
        pd1.price = 2500;
        pd2.name = "콜리";
        pd2.price = 1500;
        if (pd1.price > pd2.price) {
            System.out.println(pd1.name);

        } else
            System.out.println(pd2.name);

        // 6번
        Member m1 = new Member();
        m1.id = "admin";
        m1.isLogin = false;

        System.out.printf("로그인 전 상태: %b\n", m1.isLogin);
        System.out.printf("로그인 후 상태 : %b\n", !m1.isLogin);

        // 7번
        Television t1 = new Television();
        t1.channel = 7;
        t1.volume = 20;

        t1.channel = 11;
        t1.volume -= 2;
        System.out.printf("채널 : %d 볼륨 : %d\n", t1.channel, t1.volume);

        // 8번
        Player pl1 = new Player();
        Player pl2 = new Player();

        pl1.name = "손흥민";
        pl1.power = 90;
        pl1.speed = 95;

        pl2.name = "이강인";
        pl2.power = 85;
        pl2.speed = 92;

        System.out.printf("%s\n", pl1.power + pl1.speed > pl2.power + pl2.speed ? pl1.name : pl2.name);

        // 9번
        Menulltem mi1 = new Menulltem();
        Menulltem mi2 = new Menulltem();
        Menulltem mi3 = new Menulltem();

        mi1.name = "김치찌개";
        mi1.price = 8000;
        mi1.isSignature = true;

        mi2.name = "된장찌개";
        mi2.price = 8000;
        mi2.isSignature = false;

        mi3.name = "계란찜";
        mi3.price = 3000;
        mi3.isSignature = false;

        if (mi1.isSignature == true) {
            System.out.printf("%s %d %b\n", mi1.name, mi1.price, mi1.isSignature);
        }
        if (mi2.isSignature == true) {
            System.out.printf("%s %d %b", mi2.name, mi2.price, mi2.isSignature);
        }
        if (mi3.isSignature == true) {
            System.out.printf("%s %d %b", mi3.name, mi3.price, mi3.isSignature);
        }

        Scanner scan = new Scanner(System.in);
        UserProfile u1 = new UserProfile();
        System.out.println("이름 입력");
        u1.name = scan.next();
        System.out.println("나이 입력");
        u1.age = scan.nextInt();
        System.out.println("mbti 입력");
        u1.mbti = scan.next();

        System.out.printf("--- 프로필 --- \n 이름 : %s ,나이 : %d , MBTI : %s", u1.name, u1.age, u1.mbti);

    }

}

class Book {
    String title;
    String author;
    int price;
}

class Pet {
    String name;
    String species;
    int age;
}

class Rectangle {
    int width;
    int height;
}

class BankAccount {
    String accountNumber;
    String ownerName;
    int balance;
}

class Product {
    String name;
    int price;
}

class Member {
    String id;
    boolean isLogin;
}

class Television {
    int channel;
    int volume;
}

class Player {
    String name;
    int power;
    int speed;
}

class Menulltem {
    String name;
    int price;
    boolean isSignature;
}

class UserProfile {
    String name;
    int age;
    String mbti;
}