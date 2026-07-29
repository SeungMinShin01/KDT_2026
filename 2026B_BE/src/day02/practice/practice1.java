package day02.practice;



import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        System.out.println(25);
        System.out.println("홍길동");

        //2번
        int age = 40;
        System.out.println(age);

        //3번
        String name = "유재석";
        int age2 = 20;
        double height = 172.5;
        String mooto = "멋있는좌우명";

        //4번
        System.out.println("제이름은"+ name + ", 나이는" + age2 + "세, 키는 "+ height + "cm 입니다.");

        //5번
        System.out.printf("제 이름은 %s, 나이는 %d세, 키는 %.1fcm 입니다. \n", name , age2, height);

        //6번
        System.out.println("|\\_/|\n|q p|\t/}\n( 0 )\"\"\"\\\n|\"^\"`\t |\n||_/=\\\\__|\n*/");

        //7번
        int num = 1;
        String writer = "유재석";
        String content = "안녕하세요!";
        System.out.println("==========방문록==========");
        System.out.printf("%-3s %-5s %-10s \n", "번호", "작성자" , "방문록");
        System.out.printf("%-5d %-5s %-10s \n", num, writer, content);
        System.out.println("==========================");

         //8번
        Scanner scan = new Scanner(System.in);
        System.out.println("이름을 입력하세요 :");
        String 이름 = scan.next();
        System.out.println("나이를 입력하세요 :");
        int 나이 = scan.nextInt();
        System.out.printf("%s님의 나이는 %d세 입니다", 이름, 나이);

        // 9번
        System.out.print("게시물 번호 : ");
        int 번호 = scan.nextInt();
        System.out.println("게시물 제목 : ");
        String 제목 = scan.nextLine();
        System.out.println("게시물 내용 : ");
        String 내용 = scan.nextLine();
        System.out.println("[ 1번 게시물 ]");
        System.out.printf("제목 %s \n 내용 %s\n", 제목, 내용);

        // 10번
        System.out.println("성별을 입력하세요(남/여)");
        char 성별 = scan.next().charAt(0);
        System.out.printf("입력하신 성별은 %s 입니다.", 성별);


    }
}




/*
문제 11: Scanner를 사용하여 아래 4가지 정보를 순서대로 입력받아 출력하는 코드를 작성하시오.
이름 (String), 나이 (int), 키 (double), 프로그래머 여부 (boolean)
입력 예시:
이름: 김자바
나이: 25
키: 165.8
프로그래머입니까? (true/false): true
출력 예시:
--- 자기소개 ---
이름: 김자바
나이: 25
키: 165.8cm
프로그래머 여부: true
*/
