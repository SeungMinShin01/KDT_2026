package day04.practice2;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    // [1] 저장
    public boolean save(TestEntity testEntity) {
        TestEntity saved = testRepository.save(testEntity);
        if (saved.getBno() >= 1)
            return true;
        return false;
    }

    // [2] 전체 조회
    public List<TestEntity> findAll() {
        return testRepository.findAll();
    }

    // [3] 개별 조회
    public Optional<TestEntity> testDetail(int bno) {
        return testRepository.findById(bno);
    }

    // [3] 삭제
    public boolean delete(int no) {
        testRepository.deleteById(no);
        return true;
    }

    // [4] 수정
    @Transactional
    public boolean update(TestEntity testEntity) {
        Optional<TestEntity> optional = testRepository.findById(testEntity.getBno());
        if (optional.isPresent()) {
            TestEntity saveEntity = optional.get();
            saveEntity.setContent(testEntity.getContent());
            return true;
        }
        return false;
    }
}
