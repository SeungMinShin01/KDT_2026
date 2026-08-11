package day10.exam;

public class exam2 {
    public static void main(String[] args) {
        // 1.
        A a = new A();
        // 2.
        B b = new B();
        // 3.
        C c = new C();
        // 4.
        D d = new D();
        // 5.
        E e = new E();
        // [2] 자동타입변환 / 업캐스팅
        A a2 = b; // B --> A [가능]
        Object o1 = a2; // A --> Object [가능]
        // [3] 강제타입변환 / 다운캐스팅
        B b2 = (B) a2; // A --> B [가능] 태생이 B라서
        // C c2 = (C)b; // 즉] B는 C를 포함하지 않기 때문에 불가능
        // [4] 타입확인, 인스턴스 instanceOf 타입명
        System.out.println(e instanceof Object); // e --> Object // true
        System.out.println(e instanceof C); // e --> C // true
        // System.out.println(e instanceof D); // e --> d // false
        // System.out.println(e instanceof B); // e --> B // false

    }

}

class A {
    A() {
        System.out.println("[1] A객체생성");
    }
}

class B extends A {
    B() {
        System.out.println("[2] B객체생성");
    }
}

class C extends A {
    C() {
        System.out.println("[3] C객체생성");
    }
}

class D extends B {
    D() {
        System.out.println("[4] D객체생성");
    }
}

class E extends C {
    E() {
        System.out.println("[5] E객체생성");
    }
}