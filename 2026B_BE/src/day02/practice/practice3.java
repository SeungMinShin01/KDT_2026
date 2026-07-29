package day02.practice;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {

        // [1번]
        Scanner scan = new Scanner(System.in);
        // System.out.println("국어 점수 입력:");
        // int 국어점수 = scan.nextInt();
        //  System.out.println("영어 점수 입력:");
        // int 영어점수 = scan.nextInt();
        //  System.out.println("수학 점수 입력:");
        // int 수학점수 = scan.nextInt();
        // int 총점 = 국어점수 + 영어점수 + 수학점수;
        // double 평균 = (double)총점/3;

        // System.out.printf("총점: %d \n 평균: %f \n ", 총점, 평균);

        // // [2번]
        // System.out.println("원의 반지름 입력:");
        // double 반지름 = scan.nextDouble();
        // double 원의넓이 = 반지름*반지름*3.14;
        // System.out.printf("원의 넓이: %.3f \n",원의넓이);

        // // [3번]
        // System.out.println("첫 번째 실수:");
        // double num1 = scan.nextDouble();
        // System.out.println("두 번째 실수:");
        // double num2 = scan.nextDouble();
        // double percent = (num1/num2)*100;
        // System.out.printf("비율: %.1f%% \n", percent);

        // // [4번]
        // System.out.println("정수를 입력하세요:");
        // int num3 = scan.nextInt();
        // boolean result;
        // if (num3%2 == 1) {
        //     result = true;
        // }
        // else result = false;
        // System.out.printf("결과 %b \n", result);

        // // [5번]

        // System.out.println("정수를 입력하세요.");
        // int num4 = scan.nextInt();
        // boolean result2;
        // if(num4 % 7 == 0){
        //     result2 = true;
        // }
        // else result2 = false;
        // System.out.printf("결과: %b \n", result2);

        // // [6번]
        // System.out.println("아이디:");
        // String ID = scan.next();
        // System.out.println("비밀번호:");
        // String PWD = scan.next();
       
        // boolean result3 = "admin".equals(ID) && "1234".equals(PWD) ? true : false;
            
        // System.out.printf("결과: %b \n",result3);

        // // [7번]

        // System.out.println("정수를 입력하세요:");
        // int num5 = scan.nextInt();
        // System.out.printf("%b\n",num5%7 == 0 && num5%2 == 1);

        // // [8번]
        // System.out.println("1차 점수:");
        // int score1 = scan.nextInt();
        // System.out.println("2차 점수:");
        // int score2 = scan.nextInt();
        // System.out.printf("결과: %s\n", score1+score2>=150 ? "합격" : "불합격");

        // // [9번]
        // System.out.println("이름을 입력하세요:");
        // String name = scan.next();
        // System.out.printf("%s\n", "유재석".equals(name) ? name+"(방장)" : name );

        // // [10번]
        // System.out.println("밑변");
        // double 밑변 = scan.nextDouble();
        // System.out.println("높이");
        // double 높이 = scan.nextDouble();
        // System.out.printf("삼각형의 넓이: %.1f \n", 밑변*높이/2.0);

        // // [11번]
        // System.out.println("섭씨 온도");
        // double 섭씨온도 = scan.nextDouble();
        // System.out.printf("화씨 온도: %.1f \n", (섭씨온도*9.0/5.0)+32);

        // // [12번]
        // System.out.println("태어난 년도:");
        // int 년도 = scan.nextInt();

        // System.out.printf("2025년 기준 나이: %d세 \n", 2025-년도);

        // // [13번]
        // System.out.println("키(cm):");
        // double height = scan.nextDouble()/100.0;
        // System.out.println("몸무게(kg):");
        // double weight = scan.nextDouble();
        // System.out.printf("BMI 지수: %f\n", weight/(height*height));

        // [14번]
        // System.out.println("아이디:");
        // String Id2 = scan.next();
        // System.out.println("이메일:");
        // String email = scan.next();
        // System.out.printf("결과:%s\n", "admin".equals(Id2) || "admin@test.com".equals(email) ? "관리자" : "일반 사용자" );

        // [15번]
        // System.out.println("점수를 입력하세요:");
        // int score2 = scan.nextInt();
        // System.out.printf("등급: %c\n", score2>=90 && score2 < 100 ? 'A' : score2 >= 80 && score2 < 90 ? 'B' : 'C');

        // [16번]
        System.out.println("나이를 입력하세요:");
        int age2 = scan.nextInt();
        System.out.printf("%s \n", age2>=20 && age2 <= 29 ? "이벤트 대상입니다." : "이벤트 대상이 아닙니다.");
    }
}


/*[문제 16] Scanner를 이용해 나이(int)를 입력받아, 20대(20세 이상 29세 이하)에 해당하는 경우 "이벤트 대상입니다."를, 그렇지 않으면 "이벤트 대상이 아닙니다."를 출력하시오.
입력 예시:
나이를 입력하세요: 25
출력 예시:
이벤트 대상입니다. */
