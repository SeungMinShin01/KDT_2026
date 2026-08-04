package day05.exam;

class Student {

    // 1] 객체만들기
    // 1) 클래스 생성 : 1) .java 새롭게 만들기 2) 현재파일 class{} 밖
    // class 클래스명 { 상태; 행위; }
    // 2) 클래스 { } 안에서 상태(멤버변수) 와 행위(메소드) 코드 작성
    // 3) 실행문(MAIN 함수) 에서 객체 생성: 타입명 변수명 = new 생성자(인수, 인수);
    // 1. class 타입도 참조 타입이다.
    // 2. class 타입은 첫글자 대문자, 기본타입 소문자, 변수명 소문자시작 관례
    // 3. new 인스턴스화 : 클래스 기반으로 (heap) 메모리 할당
    // 4. Student 생성자 : 클래스명과 동일하며 메소드/함수 비슷한 역할

    int StudentID; // 타입 변수명; 클래스안에서 선언된 변수 -> 멤버/인스턴스 변수
    String studentName;

}

public class exam1 {
    public static void main(String[] args) {
        new Student(); // 객체생성
        Student s1 = new Student(); // 객체 생성 후 변수에 저장

        // 2] 객체 사용/참조
        // 1) 객체 저장하고 있는
        System.out.println(s1); // 1) 객체 저장하고 있는 변수명 작성
        System.out.println(s1.StudentID); // 2) 객체 저장하고 있는 변수명.멤버변수명 , null

        // 3] 객체 내 멤버변수 값 수정, 객체변수명.멤버변수명 = 새로운값
        s1.studentName = "유재석";
        s1.StudentID = 10;

        // *] 주의할점 : new 연산자 1개 당 1개의 인스턴스 생성
        Student s2 = new Student(); // 인스턴스 생성
        Student s3 = new Student();
        Student s4 = s2;
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        s2.studentName = "강호동";
        System.out.println(s2.studentName);
        System.out.println(s4.studentName);
    }

}

/*
 * 1. 객체란 상태 또는 행위를 정의하는것
 * -> 주체(개발자) vs 객체(프로그램 모든 대상)
 * -> 상태(값/자료) , 행위( 함수/메소드)
 * 2. 객체지향 프로그래밍 : 개발자(주체)가 컴퓨터내 객체(대상) 만들기
 * 3. 객체 정의 : 클래스 기반으로 객체를 정의한다.
 * 4. 클래스란 객체의 상태와 행위를 코드로 정의한 곳
 * 1) 설계클래스(객체정의용도) 2) main함수클래스(실행목적용도)
 */