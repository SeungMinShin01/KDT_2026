package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.BoardEntity;

@Repository
public interface BoardRepository
        extends JpaRepository<BoardEntity, Integer> {

}
