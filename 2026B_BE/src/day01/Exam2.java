package day01;
public class Exam2 {

    public static void main(String[] args) {
        // [1] 리터럴 : 상수, 미리 상수로 구성한 자료들
        // 3, 'a' , true
        System.out.println(3);
        System.out.println(3.14);
        System.out.println('유');
        System.out.println("유재석");
        System.out.println(true);

        // [3] 자료타입 / 자료형 : 자료(데이터) 효율적으로 분류하는 방법
        // * 효율이란? 자료 크기에 따라 적당한 타입(크기) 선정하여 빈공간(여백) 줄이기
        // C/JAVA 정적(직접)타입 VS PY/JS 동적(자동)타입
        
        // 1) boolean : ture 또는 false 저장하는 타입 , 1byte
        boolean bool1 = true; // let / const -----> boolean
        System.out.println(bool1);

        // 2) char :  ' 작은 따옴표로 감싼 문자 1개 저장하는 타입 , 2byte 유니코드 ( 코드 <--> 자연어 )
        char ch1 = 'A';
        System.out.println(ch1);

        // 3) String : "큰 따옵표로 감싼 문자 N개 저장하는 타입" , N * 2 byte로 계산
        String str1 = "abc";
        System.out.println(str1);
        // so + 엔터 

        // 4) byte : -128 ~ 127 저장하는 타입 , 1byte
        byte b1 = 100;
        System.out.println(b1); 

        // 5) short : +- 3akswjdeh , 2byte
        short sh1 = 30000;
        System.out.println(sh1);

        // 6) int +- 21억 정도, 4byte
        int i1 = 2000000000; 
        System.out.println(i1);

        // 7) long +- 21억 이상, 8byte
        long l1 = 20000000000L; 
        System.out.println(l1);

        // ===실수===  : 부동소수점 이용한 소수점 표현은 오차가 있으므로 정교한 소수점/계산 라이브러리
        // 8) float : 소수점 8자리 표현, 4byte 
        float f1 = 0.123456789F; 
        System.out.println(f1);
        // 9) double : 소수점 17자리 표현 , 8byte *(실수)리터럴 타입
        double d1 = 0.123456789123456789;
        System.out.println(d1);

        // 8가지 타입 ( 기본타입, 리터럴 저장 )
        // vs 그외(String) 타입 ( 참조타입 , 클래스/객체/배열/인터페이스 등등 )
    }
}