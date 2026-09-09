package day07.pratice5_Repeat.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import day07.pratice5_Repeat.model.entity.CommentEntity;

@Repository
public interface CommentRepository
                extends JpaRepository<CommentEntity, Integer> {

}
