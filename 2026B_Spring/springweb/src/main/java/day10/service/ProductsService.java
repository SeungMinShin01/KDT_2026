package day10.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day10.model.dto.ProductResponseDto;
import day10.model.entity.ProductsEntity;
import day10.model.repository.ProductsRepository;
import day10.model.dto.CategoryDto;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    public List<ProductResponseDto> productFindAll() {
        List<ProductsEntity> productsEntities = productsRepository.findAll();
        List<ProductResponseDto> productResponseDtos = new ArrayList<>();

        productsEntities.forEach((productsEntity)->{
            ProductResponseDto productResponseDto = ProductResponseDto.from(productsEntity);
            productsEntity.getCategoryEntity().forEach((name)->{
                CategoryDto 
            })
        });
    }
}
