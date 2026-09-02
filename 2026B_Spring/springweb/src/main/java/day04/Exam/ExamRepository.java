package day04.Exam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // 리포지토리(DB 조작) 담당하는 객체(빈) 등록
public interface ExamRepository
        extends JpaRepository<ExamEntity, Integer> {

    // 구현체란? 해당 인터페이스(추상) 구현한 객체
    // < 제네릭타입 > 이란? 해당 클래스내 사용할 매개 타입
    // JpaRepsitory < 조작할엔티티명 , 엔티티PK타입 >

}
