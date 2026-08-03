package day04.exam;

public class exam2 {
    public static void main(String[] args) {
        for (int 단 = 2; 단 <= 9; 단++) {
            for (int 곱 = 1; 곱 <= 9; 곱++) {
                System.out.printf("%d X %d = %d \n", 단, 곱, 단 * 곱);
            }
        }

        // 2. break; 반복문 탈출, continue; 증감식이동
        for (int i = 1; i <= 10; i++) {
            if (i == 3) // i가 3이면 증감식 이동
                continue;
            if (i == 9) // 만약에 i가 9이면 반복문 탈출
                break;
        }
        // 3. 무한루프: 실행문 계속반복, 특정조건에 따른 break 활용
        for (;;) {
            System.out.println("무한반복");
            break;
        }

        // 4. while문
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 5. 반복문과 배열 관계 : 배열내 저장된 자료들을 인덱스(저장된순서번호) 로 식별 (0 ~)
        int[] ary = { 92, 80, 75 };
        // * 배열은 인덱스가 0붙 마지막 인덱스까지 순차 저장
        for (int 인덱스 = 0; 인덱스 <= ary.length; 인덱스++) {
            System.out.println(ary[인덱스]);

        }
        // 향상된 for문, for(타입명 변수명 : 배열명 ){ }, : 콜론 기준 오른쪽 배열내 요소들을 왼쪽 변수에 하나씩 대입

        for (int data : ary) {
            System.out.println(data);
        }
    }

}
