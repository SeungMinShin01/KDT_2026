package day07.practice.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import day07.practice.model.entity.EnrollEntity;

@Repository
public interface EnrollRepository extends JpaRepository<EnrollEntity, Integer> {

}
