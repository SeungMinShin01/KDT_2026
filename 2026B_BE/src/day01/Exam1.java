package day01;

public class Exam1 {
    // public : 공개용 , 다른패키지에서도 사용가능한 클래스 뜻
    // class : 클래스 선언 사용하는 키워드
    // Exam : 클래스명은 아무거나, 단 첫글자는 대문자
        // * 클래스란? 자바에서의 가장 최소 컴파일/번역/통역시 단위
    // { 클래스 시작 뜻 , } 클래스 끝 뜻 * 클래스 { } 안에서만 코드 작성

    // ** [ 클래스 안 / main함수 밖 ] 선언/만들기 가능하다 **

    //[1] 자바 실행 시작점 생성, main함수( 번역한 코드들을 읽는 흐름 단위=메인스레드 )
    // m + 엔터 : main{ } 자동완성 , *JS에 없는 이유는 브라우저 엔진 대신

    public static void main(String[] args){ //main start
        // ** [ main함수 안 ] 선언/만들기 , 실행문 가능 **
        // [2] 콘솔 출력문 실행하기
        // so + 엔터 : System.out.println();
        System.out.println( "안녕자바"); // JS의 console.log( ) 동일한 역할
        // [3] ; ( 세미콜론 ) : 코드의 한문장이 끝났다는 뜻 , 해당 기준으로 컴파일 한다.

    } // main end
}// class end
// ** clss 밖에서는 코드 작성하지 말자 **
