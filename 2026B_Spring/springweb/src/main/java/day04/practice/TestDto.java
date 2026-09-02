package day04.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TestDto {
    private Integer no;
    private String content;
    private String writer;
}

/*
 * - int : 기본타입 +- 21억 저장
 * - Integer : 참조타입( int 래퍼클래스 ) + null(없다뜻) 저장
 * 주의할점 : HTTP 파싱하는 경우에 int 에는 NULL 저장 불가능
 * 권장 ! : 기본타입 대신에 래퍼타입 사용하자
 */