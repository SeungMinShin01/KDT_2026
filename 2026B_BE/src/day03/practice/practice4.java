package day03.practice;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // //[1번]
        // System.out.println("첫 번째 점수:"); 
        // int num1 = scan.nextInt();
        // System.out.println("두 번째 점수");
        // int num2 = scan.nextInt();
        // String result1;
        // if(num1 + num2 >= 90 ){
        //     result1 = "성공";
        // } else result1 = "실패";
        // System.out.println(result1);

        // // [2번]
        // System.out.println("첫 번째 정수");
        // int num3 = scan.nextInt();
        // System.out.println("두 번째 정수");
        // int num4 = scan.nextInt();
        // int max;
        // if (num3 > num4)  max = num3;
        // else max = num4;
        // System.out.println(max);

        // // [3번]
        // System.out.println("아이디:");
        // String id1 = scan.next();
        // System.out.println("비밀번호");
        // String pwd1 = scan.next();
        // boolean login;
        // if("admin".equals(id1) && "1234".equals(pwd1)){
        //     login = true;
        // }
        // else login = false;
        // System.out.println(login ? "로그인 성공" : "로그인 실패");

        // // [4번]
        // System.out.println("비밀번호를 입력하세요: ");
        // String pwd2 = scan.next();
        // String security;

        // if(pwd2.length() >= 12) security = "강함";
        // else if(pwd2.length() >=8 ) security="보통";
        // else security = "약함 (8자 이상으로 설정해주세요.)";
        // System.out.println(security);

        // // [5번]
        // System.out.println("주민등록번호(-포함)");
        // String 주민등록번호 = scan.next();
        // String 성별 = "";
        // if (주민등록번호.charAt(7)=='1' || 주민등록번호.charAt(7)=='3') {
        //     성별 = "남자";
        // }else if (주민등록번호.charAt(7) == '2' || 주민등록번호.charAt(7) == '4'){
        //     성별 = "여자";
        // }
        // System.out.println(성별);

        // // [6번]
        // System.out.println("점수를 입력하세요:");
        // int score1 = scan.nextInt();
        // String result2 = "";
        // if(score1 >= 900) result2 = "A급 경품";
        // else if(score1 >=700) result2 = "B급 경품";
        // else if(score1 >= 500) result2 = "C급 경품";
        // else result2 = "참가상";
        // System.out.println(result2);

        // // [7번]
        // System.out.println("역할을 입력하세요:");
        // String role = scan.next();
        // String result3 = "";
        // if("admin".equals(role)) result3 = "모든 기능에 접근할 수 있습니다.";
        // else if("editor".equals(role)) result3 = "콘텐츠 수정 및 생성 기능에 접근할 수 있습니다.";
        // else if ("viewer".equals(role)) result3 = "콘텐츠 조회만 가능합니다.";
        // else result3 = "정의되지 않은 역할입니다.";
        // System.out.println(result3); 

        // // [8번] 아직 안품
        // System.out.println("나이를 입력하세요.");
        // int age1 = scan.nextInt();
        // String result4 = "";
        // if(age1 < 8 ) {
        //     result4 = "무료입니다.";
        // }
        // else if (age1 <= 19){
        //     result4 = "5,000원";
        // }
        // else if (age1 < 65){
        //     result4 = "10,000원";
        // }
        // else result4 = "3,000원";
        
        // System.out.println(result4);

        // //9번
        // System.out.println("점수를 입력하세요.");
        // int score4 = scan.nextInt();
        // String grade;
        // if(score4 >= 90) grade = "A";
        // else if(score4 >= 80) grade = "B";
        // else grade = "C";

        // System.out.println(grade);


        // // 13번
        // System.out.println("연도를 입력하세요.");
        // int year = scan.nextInt();
        // if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        //     System.out.printf("%d년은 윤년입니다.", year);
        // } else System.out.printf("%d년은 평년입니다.",year);

        // // 14번
        // System.out.println("정수 1 입력:");
        // int num5 = scan.nextInt();
        //  System.out.println("정수 2 입력:");
        // int num6 = scan.nextInt();
        //  System.out.println("정수 3 입력:");
        // int num7 = scan.nextInt();
        // int tmp = 0;

        // if(num5 > num6) {
        //     tmp = num5;
        //     num5 = num6;
        //     num6 = tmp;
        // }
        // if(num5 > num7 ){
        //     tmp = num5;
        //     num5 = num7;
        //     num7 = tmp;
        // }
        // if(num6 > num7){
        //     tmp = num6;
        //     num6 = num7;
        //     num7 = tmp;
        // }
        // System.out.printf("%d, %d, %d",num5,num6,num7);

        // 15번

        // System.out.println("플레이어1 (플레이어1 (0:가위, 1:바위, 2:보):)");
        // int player1 = scan.nextInt();
        // System.out.println("플레이어2 (0:가위, 1:바위, 2:보): ");
        // int player2 = scan.nextInt();

        // if(player1 - player2 == 0){
        //     System.out.println("무승부");
        // }else if((player1-player2+3)%3 == 1){
        //     System.out.println("플레이어1 승리");
        // }else System.out.println("플레이어2 승리");
        
    }
    
}


/*[문제 10] Scanner를 이용해 총 구매 금액을 입력받습니다. 구매 금액에 따라 할인율을 적용하여 최종 결제 금액을 출력하는 프로그램을 작성하시오.
50,000원 이상: 10% 할인
30,000원 이상 50,000원 미만: 5% 할인
10,000원 이상 30,000원 미만: 1% 할인
10,000원 미만: 할인 없음
입력 예시: 총 구매 금액: 60000
출력 예시: 최종 결제 금액: 54000원 */

/*[문제 11] 1부터 12 사이의 월(Month)을 숫자로 입력받아, 해당하는 계절을 출력하는 프로그램을 작성하시오. 만약 1~12 이외의 숫자를 입력하면 '잘못된 월입니다.'를 출력하세요.
봄: 3, 4, 5월
여름: 6, 7, 8월
가을: 9, 10, 11월
겨울: 12, 1, 2월
입력 예시:
월(1~12)을 입력하세요: 9
출력 예시: 가을 */

/*[문제 12] Scanner를 이용해 서로 다른 세 개의 정수를 입력받아, 가장 큰 수를 출력하는 프로그램을 작성하시오.
입력 예시:
첫 번째 정수: 45
두 번째 정수: 12
세 번째 정수: 78
출력 예시: 가장 큰 수: 78 */

