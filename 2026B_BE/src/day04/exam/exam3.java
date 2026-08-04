package day04.exam;

import java.util.Arrays;

public class exam3 {
    public static void main(String[] args) {
        /*
         * JAVA 배열: *동일한타입*의 여러 자료들을 순서대로 저장하는 *타입*
         * 선언 : 2가지
         * - 타입[ ] 변수명 = new 타입명[ 총개수 ]; vs let 변수명 = [ ]
         * - 타입[ ] 뱐수명 = {초기값, 초기값, 초기값 }; vs let 변수명 = [ 초기값, 초기값, 초기값 ]
         * 특징 : 1) 동일한타입끼리 2) 고정(정적)길이 3) 요소초기값(자동)
         * 인덱스 : 요소(자료)들이 저장되는 순서 변호, 0번 시작
         */

        // [1] 배열의 선언
        int[] arry1 = new int[3]; // int형 3개 저장 가능한 배열 선언
        System.out.println(arry1); // [I@6c629d6e 배열(객체)의 메모리 주소값이 출력된다.
        System.out.println(Arrays.toString(arry1)); // [0, 0, 0] , 배열내 요소들의 자동 초기화
        String[] arry2 = { "유재석", "강호동", "신동엽" }; // String형 3개 초기화한 배열 선언
        // [2] 배열의 요소 호출, 인덱스
        System.out.println(arry1[0]); // 0번 인덱스의 자료 호출 , 0
        System.out.println(arry2.length); // 배열변수명.length : 요소 총개수
        System.out.println(arry2[1]); // 1번 인덱스의 자료호출, '강호동'
        // [*] 선언 이후 길이(요소) 추가 push/삭제 splice 안된다.

        arry2[0] = "유재석2"; // 기존 요소에 새로운 값으로 수정
        System.out.println(arry2[0]);

        // arry2.push("하하"); arry2[3] = "하하"; // 오류 , 즉 요소 추가 없다.
        // arry2.splice( 0, 1 ); // 오류, 즉 요소 삭제 없다.

        /*
         * 배열 메모리 : 메모리는 1byte 단위로 저장
         * - 자바 int 1개 선언 -> 4byte -> [ ] [ ] [ ] [ ] 4개의 메모리가 컴퓨터 할당
         * - 자바 new int [ 3 ] 선언 -> 4byte*3 -> [ ] [ ] [ ] [ ], *3 총 12개의 메모리 할당
         * - byte 단위별 주소값 정해진다.
         * - [ 101 ] [ 102 ] [ 103 ] [ 104 ], [ 201 ] [ 202 ] [ 203 ] [ 204 ], [ 301 ] [
         * 302 ] [ 303 ] [ 304 ]
         * - 즉, 배열은 요소내 모든 인덱스 주소값을 참조 하지 않고 *가장 앞*에 잇는 주소값 1개(101호)만 참조한다.
         * 배열명[0] = 101호
         * 배열명[1] = 타입크기만큼이동 = 201
         * 
         */

    }

}
