package day05;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        return false;
    }
}
