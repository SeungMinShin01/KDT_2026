package day08.exam.package1;

public class B {
    public void 메소드() {
        A a = new A();
        a.공개변수 = 3; // 가능
        a.일반변수 = 3; // 같은 패키지라서 가능
        // a.비공개변수=3; 불가능

    }

    private B() {
    } // 비공개생성자: 외부에서 객체생성 금지
}
