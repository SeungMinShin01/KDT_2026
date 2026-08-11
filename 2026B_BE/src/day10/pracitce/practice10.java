package day10.pracitce;

import java.util.ArrayList;

public class practice10 {
    public static void main(String[] args) {
        // [1번]
        Student s1 = new Student("유재석", 100);
        System.out.printf("이름 : %s , id : %d\n", s1.getName(), s1.getStudentId());

        // [2번]
        Cat c1 = new Cat();
        c1.makeSound();

        // [3번]
        Computer com1 = new Computer();

        // [4번]
        Figure f1 = new Triangle();
        // 업캐스팅, 생성된 객체 Triangle은 부모인 Figure를 상속받은 자식 클래스이기 때문에, 자식 객체를 Fihure 타입 변수에
        // 저장하는 것이 가능하다.

        // [5번]
        Shape shape = new Circle();
        shape.draw();
        // 결과 : 원을 그립니다.
        // 원인 : new Circle(); -> 부모인 Shape 생성 -> Circle 생성 // Shape.draw() 메소드가 Circle
        // 자식 클래스가 생성되면서 오버라이딩됨. -> Circle.draw() 실행

        // [6번]
        Vehicle vehicle = new Bus();

    }

}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Student extends Person {
    private int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}

class Animal {
    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("고양이가 야옹하고 웁니다.");
    }
}

class Machine {

    public Machine() {
        System.out.println("부모클래스 생성자 실행");
    }

}

class Computer extends Machine {
    public Computer() {
        System.out.println("자식 클래스 생성자 실행");
    }
}

class Figure {

}

class Triangle extends Figure {

}

class Shape {
    public void draw() {
        System.out.println("도형을 그립니다.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {

        System.out.println("원을 그립니다.");
    }
}

class Vehicle {

}

class Bus extends Vehicle {
    public void checkFare() {
        System.out.println("요금을 확인합니다.");
    }
}

class Beverage {
    public void drink() {
        System.out.println("음료를 마십니다.");
    }

}

class Coke extends Beverage {
    @Override
    public void drink() {
        System.out.println("콜라를 마십니다.");
    }
}

class Coffee extends Beverage {
    @Override
    public void drink() {
        System.out.println("커피를 마십니다.");
    }
}