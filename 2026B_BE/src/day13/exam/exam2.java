package day13.exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class exam2 {
    public static void main(String[] args) {
        int value1 = 100;
        Integer value2 = 100;
        System.out.println(value2.toString());
        // 즉] 기본타입은 기능이 없으니까 참조타입으로 변환해서 기능 사용하자
        // 1. 언박싱 과 오토박싱
        int value3 = value2; // Integer(참조) --> int(기본) 변환 <언박싱>
        Integer value4 = value1; // int(기본) --> Integer(참조) 변환 <오토박싱>
        // 2. 타입변환( csv, excel , api, python, json, xml 등등)
        // XXXX.parseXXX(문자열)
        int value5 = Integer.parseInt("100"); // "100" --> 100
        double value6 = Double.parseDouble("3.14");
        boolean value7 = Boolean.parseBoolean("true");
        // 기본타입 --> 문자열 변환 , String.valueOf(리터럴)
        String s1 = 100 + ""; // 공백없이 문자열 더하기 , 100 --> "100"
        String s2 = String.valueOf(100); // 100 --> "100"

        // [2] 날짜/시간 클래스
        // 1. 현재 날짜 가져오기
        LocalDate localDate = LocalDate.now(); // now가 static메소드라 new를 쓰지 않음
        System.out.println(localDate);
        // 2. 현재 시간 가져오기
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        // 3. 현재 날짜/시간 가져오기
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        // 4. 정해진 날짜/시간 객체 생성 LocalDateTime.of(연도,월,일,시,분,초) : 오버로딩(매개변수에 따른 메소드 여러개)
        LocalDateTime localDateTime2 = LocalDateTime.of(2026, 8, 19, 11, 07, 30);
        System.out.println(localDateTime2);
        // 5. 정해진 형식으로 날짜/시간 표현 , DateTimeFormatter.ofPattern(패턴);
        // 패턴 : y연도 m월 d일 h시 m분 5초 , 날짜/시간객체.format(패턴)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy년MM월d일 h시m분5초");
        System.out.println(localDateTime2.format(formatter));
        // 6. 날짜 계산 , 날짜/시각객체.plusXXX
        LocalDateTime result1 = localDateTime2.plusDays(10);
        System.out.println(result1);
        // 7. 특정한 날짜/시간 추출 , .getXXX()
        System.out.println(localDateTime2.getHour()); // 시간 추출
        System.out.println(localDateTime2.getMonthValue()); // .getMonth() 영문, .getMonthValue() 정수
        System.out.println(localDateTime2.getDayOfYear());
    }
}
