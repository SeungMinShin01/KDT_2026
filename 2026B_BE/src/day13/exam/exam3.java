package day13.exam;

import java.lang.reflect.Array;
import java.util.Arrays;

public class exam3 {
    public static void main(String[] args) {
        // 1. 문자열은 배열이다
        char str1 = '유'; // char 타입( ' ' )은 1글자만 가능!
        char[] str2 = { '유', '재', '석' }; // char 타입의 배열
        String str3 = "유재석"; // String 클래스는 배열의 멤버변수 가짐
        // 2. 문자 변환 , 아스키코드(일부특수문자 + 영문) + 유니코드(여러개언어지원)
        char str4 = 65;
        System.out.println(str4); // A
        char[] str5 = { 74, 65, 86, 65 };
        System.out.println(str5); // JAVA
        char str6 = '유';
        System.out.println((int) str6); // 50976
        // 3. 문자열 비교
        System.out.println("유재석".equals("유재석")); // true
        System.out.println("유재석" == "유재석"); // true
        System.out.println(new String("유재석").equals("유재석")); // true
        System.out.println(new String("유재석") == "유재석"); // false

        // 4. 문자열A.concat(문자열B) , 문자열 연결
        String str7 = "자바";
        String str8 = "프로그래밍";
        System.out.println(str7.concat(str8)); // 자바프로그래밍

        // 5. StringBuilder , append( ) , 문자열은 불변(수정금지)이다 , 빌더주소값 1개 지정하여 새로운 문자열 연결
        StringBuilder builder = new StringBuilder();
        builder.append(str7);
        builder.append(str8);
        System.out.println(builder); // 자바프로그래밍

        // 6. .charAt( 인덱스 ) , 문자 1개 추출
        String str9 = "자바프로그래밍";
        System.out.println(str9.charAt(2)); // 프

        // 7. .length() : 문자열내 문자 개수 반환
        System.out.println(str9.length()); // 7

        // 8. .replace(기존문자 , 새로운문자 ): 만일 기존문자가 존재하면 새로운문자로 치환하여 반환
        System.out.println(str9.replace("자바", "JAVA")); // JAVA 프로그래밍
        // 9.
        String str10 = "010339-2140421";
        System.out.println(str10.substring(6)); // -2140421
        System.out.println(str10.substring(0, 6)); // 010339
        // 10. .split( 기존문자 ) , 기존문자 기준으로 문자열 분해하여 배열 반환
        System.out.println(str10.split("-")); // [Ljava.lang.String;@3f102e87
        String[] strAry = str10.split("-");
        System.out.println(strAry[0]); // 010339
        System.out.println(strAry[1]); // 2140421

        // 11. .indexOf
        System.out.println("자바 프로그래밍 언어".indexOf("프로")); // 3
        System.out.println("자바 프로그래밍 언어".contains("프로")); // true

        // 12. .getBytes( ) , 문자열내 문자들을 바이트 배열 반환 *파일처리/네트워크 등 외부통신에서 많이 사용*
        byte[] strAry2 = "ABC".getBytes();
        System.out.println(Arrays.toString(strAry2)); // "ABC" --> [65, 66, 67]
        System.out.println(new String(strAry2)); // [65, 66, 67] --> "ABC"

    }
}
