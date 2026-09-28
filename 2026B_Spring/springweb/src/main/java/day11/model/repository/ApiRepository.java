package day11.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import day11.model.entity.ApiEntity;

@Repository
public interface ApiRepository
        extends JpaRepository<ApiEntity, Integer> {

}
