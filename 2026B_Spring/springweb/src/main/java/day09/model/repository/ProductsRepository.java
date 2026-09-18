package day09.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import day09.model.entity.ProductsEntity;

@Repository
public interface ProductsRepository
                extends JpaRepository<ProductsEntity, Integer> {

}
