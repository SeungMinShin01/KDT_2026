package day06.exam;

public class exam1 {
    public static void main(String[] args) {
        /*
         * 생성자 : 인스턴스(객체) 생성할 때 사용되는 키워드
         * 선언하는 방법
         * 1) 클래스 내부
         * 2) 클래스명과 동일
         * 3) 오버로딩 지원 : 동일한 이름으로 여러개 선언 , 조건
         * 목적 : 1) 빠른 초기화 2) 객체생성 규칙/유효성검사
         * 종류 : 1) 기본생성자(매개변수없는) 2) 정의생성자(매개변수있는)
         */
        // [1] 기본생성자로 객체 생성
        Phone p1 = new Phone();
        p1.model = "Galaxy"; // 객체 내 멤버변수 초기화

        // [2] 정의생성자로 객체 생성, new 생성자명( 값1 , 값2 );
        Phone p2 = new Phone("아이폰", "파랑");

        // [3] 정의 생성자로 객체 생성
        Phone p3 = new Phone("Galaxy Tab", "black", 100000);
    }
}

class Phone {
    // ** 클래스의 가족(멤버들) **
    // 1. 멤버 변수
    String model;
    String color;
    int price;

    // 2. 생성자
    // * 생성자가 1개도 없으면 자동으로 기본생성자 생성
    // * 생성자명은 중복이 안된다.
    // -> 오버로딩( 매개변수 개수/타입/순서 가 다르면 ) 중복가능
    // * this란 외부로부터 매개변수명과 멤버변수명이 같을 경우 멤버변수명 앞에 식별 용도
    // 메소드와 다르게 생성자는 반환이 없다. (생성된 객체주소값)

    // 1) 기본생성자 : 매개변수가 없는
    Phone() {
    } // 기본생성자

    // 2) 정의생성자 : 매개변수가 있는
    Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Phone(String model, String color, int 가격) {
        this.model = model;
        this.color = color;
        price = 가격;
    }
    // 3. 메소드/함수
}
