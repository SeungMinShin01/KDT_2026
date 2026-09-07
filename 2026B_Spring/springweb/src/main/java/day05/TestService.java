package day05;

import day04.Exam.AppStart;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    // 1. 전체조회
    public List<TestDto> findAll() {
        List<TestEntity> entities = testRepository.findAll();
        // 2. 모든 엔티티 -> DTO 변환하기
        // 빈 리스트 생성
        List<TestDto> list = new ArrayList<>();
        // 모든엔티티 반복하여 DTO로 변환하여 새로운 리스트 저장
        // 리스트객체.forEach( (반복변수) -> { } );
        entities.forEach((entity) -> {
            TestDto dto = TestDto.from(entity);
            list.add(dto);
        });
        // 3. 반환
        return list;
    }

    // 2. 저장
    public boolean save(TestDto testDto) {
        // 1. dto --> entity 변환함수 : toEntity 함수
        TestEntity testEntity = testDto.toEntity();
        // 2. entitu save 저장
        TestEntity saveEntity = testRepository.save(testEntity);
        // 3. 저장 결과 pk 여부 성공
        if (saveEntity.getNo() >= 1)
            return true;
        return false;
    }

    // 3. 수정
    @Transactional
    public boolean update(TestDto testDto) {
        // 1. 수정할 엔티티 찾는다. pk
        Optional<TestEntity> optional = testRepository.findById(testDto.getNo());

        // 2. 찾은 엔티티가 존재하면
        if (optional.isPresent()) {
            // 3. 엔티티 꺼낸다.
            TestEntity entity = optional.get();
            // 4. setter 메소드 이용한 수정
            entity.setPrice(testDto.getPrice());
            entity.setDescri(testDto.getDescri());
            return true;
        }
        return false;
    }
}
