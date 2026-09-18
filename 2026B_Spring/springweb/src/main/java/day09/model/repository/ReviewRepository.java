package day09.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import day09.model.entity.ReviewsEntity;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewsEntity, Integer> {

    List<ReviewsEntity> findByProductEntity_Bno(Integer bno);
}