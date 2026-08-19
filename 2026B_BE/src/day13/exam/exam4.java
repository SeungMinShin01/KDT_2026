package day13.exam;

import java.util.Random;
import java.util.UUID;

public class exam4 {
    public static void main(String[] args) {
        // [1] 난수 클래스
        // 1. 랜덤 객체
        Random random = new Random();
        // 2. 랜덤 생성 , .nextXXX( ) , nextXXX( 개수 ) + 시작번호
        int value1 = random.nextInt(); // 378904417
        System.out.println(value1);
        int value2 = random.nextInt(10); // 0~9 난수
        System.out.println(value2);
        int value3 = random.nextInt(10) + 1; // 1~10 난수
        System.out.println(value3);
        boolean value4 = random.nextBoolean();
        System.out.println(value4); // true / false 난수

        // [2] UUID , 범용 고유 식별자 , 절대 중복없는 난수 생성 , 활용처: 회원번호

        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid); // 91ce0f1e-7a0a-4034-be44-fd94d3d3b07e

    }
}
