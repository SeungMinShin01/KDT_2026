package day05;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository
        extends JpaRepository<TestEntity, Integer> {

}