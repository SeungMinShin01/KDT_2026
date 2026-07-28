package day01;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        // [1] 출력함수
        // System(클래스).out(출력객체).print(출력함수)
        // 1. System.out.println(); 출력 후 자동 줄바꿈
        System.out.println("자바안녕1");
        // 2. System.out.print(); 출력
        System.out.print("자바안녕2");

        // [2] 이슼케이프/제어 문자 : \백슬래시 이용한 특수기능
        // \n 줄바꿈 , \t 들여쓰기 , \' , \" , \\
        System.out.println("\n자바안녕3\t자바안녕4\"\'\\");

        // 3. System.out.printf( "형식" "자료" )
        // &s : 문자열이 들어갈 자리
        // %d : 정수가 들어갈 자리
        System.out.printf("저는 %s이고 나이는 %d입니다.", "유재석" , 5);
        System.out.printf("\n저는 %s이고 나이는 %6d 입니다.", "강호동", 40);
        System.out.printf("\n저는 %s이고 나이는 %-6d 입니다.", "강호동", 40);
        System.out.printf("\n저는 %6s이고 나이는 %06d 입니다.", "강호동", 40);
        System.out.printf("\n저는 %-6s이고 나이는 %5.2f 입니다.", "강호동", 123.456789);

        // [3] 입력객체 / 함수
        // 1. Scanner : Sc + 엔터 * 코드파일 상단에 import java.util.Scanner; (해당 폴더에서 가져옵니다.)
        // 2. Scanner : 관례적으로 (클래스명으로 대문자로 시작 ) 클래스명의 소문자로 변수명 설정
        // 3. = 대입
        // 4. new : 인스턴스화, 해당 클래스로 객체를 만든다
        // 5. Scanner( System.in ) : 생성자(클래스명동일)안에 시스템입력(System.in) 객체
        // * 클래스 수업 전까지는 해당하는 한줄의 코드 사용
        Scanner scanner = new Scanner(System.in);
        // [입력함수]
        // 6. scnner.next();
        String str = scanner.next(); // 터미널(콘솔) 창에서 아무거나 입력 후 엔터 기준으로 입력 마침.
        System.out.printf("입력하신 값은 %s \n", str);

        // 7. scanner.nextInt() : 터미널(콘솔) 에서 입력받은 자료 (정수) 반환
        System.out.print("2) 정수 입력: ");
        int i = scanner.nextInt();
        System.out.printf("입력받은 자료: %d", i);
    }
}
