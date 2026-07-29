package day02.practice;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        //1번
        byte a = 10;
        int b = 200;
        long sum = a + b;
    
        System.out.printf("결과 %d\n", sum);

        //2번
        double z = 3.141592;
        int result2 = (int)z;
        System.out.printf("원본 double 값: %f \n 변환된 int 값: %d\n" , z , result2);

        //3번
        Scanner scan = new Scanner(System.in);
        System.out.println("키 입력:");
        double height = scan.nextDouble();
        int result3 = (int)height;
        System.out.printf("당신의 키는 약 %dcm 이군요.\n" , result3);

        //4번
      
        System.out.println("첫번째 정수 입력:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        double avg = (double)(num1+num2+num3)/3;
        System.out.printf("평균 결과 : %f", avg);

    }

    
}


/*문제 4: Scanner를 이용해 서로 다른 3개의 정수를 입력받아, 이 값들의 합을 3으로 나눈 평균을 구하시오. 단, 결과는 소수점이 포함되도록 출력되어야 한다.
입력 예시:
첫 번째 정수 입력: 11
두 번째 정수 입력: 21
세 번째 정수 입력: 21
출력 예시:
평균 결과: 17.666666666666668 */