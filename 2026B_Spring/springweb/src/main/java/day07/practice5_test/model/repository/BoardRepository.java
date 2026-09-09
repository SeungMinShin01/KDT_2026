package day07.practice5_test.model.repository;

import day07.practice5_test.model.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository
        extends JpaRepository<BoardEntity, Integer> {

}
