package day04.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class pracitce1 {
    public static void main(String[] args) {
        // // [1번]
        // for (int i = 0; i < 10; i++) {
        // System.out.printf("%d\n", i + 1);
        // }

        // // [2번]
        // for (int i = 10; i > 0; i--) {
        // System.out.printf("%d\n", i);
        // }

        // // [3번]
        // int sum = 0;
        // for (int i = 1; i <= 50; i++) {
        // sum += i;
        // }
        // System.out.println(sum);

        // // [4번]
        // for (int i = 1; i <= 20; i++) {
        // if (i % 2 == 0)
        // System.out.println(i);
        // }

        // // [5번]
        // for (int i = 1; i <= 30; i++) {
        // if (i % 3 == 0)
        // continue;
        // System.out.println(i);
        // }

        // // [6번]
        // int i = 0;
        // int sum = 0;
        // for (;;) {
        // i++;
        // if (sum > 100) {
        // System.out.printf("%d, %d", i, sum);
        // breaj;
        // }
        // sum += i;
        // }

        // // [7번]
        // String star = "";
        // for (int i = 1; i < 6; i++) {
        // for (int j = 0; j < i; j++) {
        // star += "*";

        // }
        // star += "\n";

        // }
        // System.out.println(star);

        // // [8번]
        // String star2 = "";
        // for (int i = 5; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // star2 += "*";
        // }
        // star2 += "\n";
        // }
        // System.out.println(star2);

        // [9번]
        // Scanner scan = new Scanner(System.in);
        // int count = 0;
        // ArrayList<String> arr = new ArrayList<>();

        // while (true) {
        // String 문자열 = scan.next();
        // switch (문자열) {
        // case "end":
        // count++;
        // arr.add(문자열);
        // for (int i = 0; i < arr.size(); i++) {
        // System.out.printf("%d회 입력: %s \n", i + 1, arr.get(i));

        // }
        // System.out.printf("[안내] 프로그램을 종료 합니다. [총 %d회 입력]", count);
        // breaj;

        // default:
        // count++;
        // arr.add(문자열);
        // }

        // }

        // [10번]

        // int july1 = 3532100;
        // int july2 = 9123700;
        // int july3 = 5183400;
        // int july4 = 11738700;
        // String result = "";
        // int i = 0;

        // switch (i) {
        // case 0:
        // result += "1주차 :";
        // for (int j = 0; j < july1 / 1000000; j++) {
        // result += "■";
        // }
        // result += july1 / 10000 + "만원\n";
        // case 1:
        // result += "2주차 :";
        // for (int j = 0; j < july2 / 1000000; j++) {
        // result += "■";
        // }
        // result += july2 / 10000 + "만원\n";
        // case 2:
        // result += "3주차 :";
        // for (int j = 0; j < july3 / 1000000; j++) {
        // result += "■";
        // }
        // result += july3 / 10000 + "만원\n";
        // case 3:
        // result += "4주차 :";
        // for (int j = 0; j < july4 / 1000000; j++) {
        // result += "■";
        // }
        // result += july4 / 10000 + "만원\n";

        // default:
        // System.out.print(result);
        // break;
        // }
    }

}
