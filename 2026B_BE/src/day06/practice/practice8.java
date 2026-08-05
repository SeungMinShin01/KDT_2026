package day06.practice;

public class practice8 {
    public static void main(String[] args) {

        // 1번
        Book b1 = new Book("이것이 자바다", "신용권", 30000);
        Book b2 = new Book("자바의 정석", "남궁성", 28000);
        System.out.printf("%s %s %d \n", b1.title, b1.author, b1.price);
        System.out.printf("%s %s %d \n", b2.title, b2.author, b2.price);

        // 2번
        Rectangle r1 = new Rectangle(10, 5);
        System.out.printf("%d %d \n", r1.width, r1.height);

        // 3번
        BankAccount bank1 = new BankAccount("111-222-3333", "유재석", 10000);
        System.out.printf("%s %s %d \n", bank1.accountNumber, bank1.ownerName, bank1.balance);

        // 4번

        // 기본생성자
        Goods g1 = new Goods();

        Goods g2 = new Goods("콜라", 2000);
        System.out.printf("기본생성자: %s %d \n매개변수 생성자: %s %d \n", g1.name, g1.price, g2.name, g2.price);

        // 5번
        Member m1 = new Member();
        System.out.printf("%s %b \n", m1.id, m1.isLogin);
    }

}

class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class BankAccount {
    String accountNumber;
    String ownerName;
    int balance;

    BankAccount(String accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
}

class Goods {
    String name;
    int price;

    Goods() {
        name = "미정";
        price = 0;
    }

    Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class Member {
    String id;
    boolean isLogin;

    Member() {
        id = "guest";
        isLogin = false;
    }

}