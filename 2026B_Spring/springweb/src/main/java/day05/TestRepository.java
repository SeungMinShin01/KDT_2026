package day05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository
        extends JpaRepository<TestEntity, Integer> {

    private final TestRepository testRepository;
}