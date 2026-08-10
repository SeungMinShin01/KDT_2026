package day09.exam;

public class exam2 {
    public static void main(String[] args) {
        // 싱글톤패턴 : 프로그램내 단 *하나의* 인스턴스(객체)를 갖는 설계 구조
        // 목적: 1. 다수 인스턴스 생성 방지( 프로그램 내 인스턴스 여러개 필요없는 경우 )
        // 2. 하나 인스턴스 사용하여 메모리 공유

        View 인스턴스1 = new View();
        System.out.println(인스턴스1);
        View 인스턴스2 = new View();
        System.out.println(인스턴스2);
        Controlloer 인스턴스3 = Controlloer.getInstance();
        System.out.println(인스턴스3);
        Controlloer 인스턴스4 = Controlloer.getInstance();
        System.out.println(인스턴스4);

    }
}

class View {
} // 일반 객체 클래스

class Controlloer { // 싱글톤 클래스
    // 1. 생성자를 pribate 한다. <다른 클래스에서 생성자 사용 금지>
    private Controlloer() {
    };

    // 2. 클래스 내부에 단 하나의 인스턴스 생성한다.
    private static final Controlloer instance = new Controlloer();

    // 3. 클랫 내부에 인스턴스를 간접 사용(공유)하도록 getter 만든다.
    public static Controlloer getInstance() {
        return instance;
    }
}
