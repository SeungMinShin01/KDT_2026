package day09.practice;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class practice11 {
    public static void main(String[] args) {
        // 1번
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("유재석");
        nameList.add("강호동");
        nameList.add("신동엽");
        System.out.println(nameList);

        // 2번
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("딸기");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // 3번
        for (String 변수명1 : fruits) {
            System.out.println(변수명1);
        }

        // 4번
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.remove(2);
        System.out.println(list1);

        // 5번
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("자바");
        list2.add("자바스크립트");
        System.out.println(list2);

        // 6번
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("책이름1", "저자1"));
        bookList.add(new Book("책이름2", "저자2"));
        bookList.add(new Book("책이름3", "저자3"));
        for (Book book : bookList) {
            System.out.println(book.getTitle() + " : " + book.getAuthor());
        }
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
}