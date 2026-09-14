package day10.service;

import java.lang.foreign.Linker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day06.activity.ProductEntity;
import day10.model.dto.ProductResponseDto;
import day10.model.entity.ProductsEntity;
import day10.model.repository.ProductsRepository;
import day10.model.dto.CategoryDto;
import day10.model.dto.ProductDto;
import day10.model.entity.CategoryEntity;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    public List<ProductResponseDto> productFindAll() {
        List<ProductsEntity> productsEntities = productsRepository.findAll();
        List<ProductResponseDto> productResponseDtos = new ArrayList<>();

        productsEntities.forEach((productsEntity) -> {
            ProductResponseDto productResponseDto = ProductResponseDto.from(productsEntity);
            productsEntity.getCategoryEntity().getProductList().forEach((productList) -> {
                String cName = productList.getName();
                productResponseDto.setCName(cName);
            });
            productResponseDtos.add(productResponseDto);
        });
        return productResponseDtos;
    }

    public ProductDto productSave(ProductDto productDto) {
        ProductsEntity productsEntity = productDto.toEntity();
        ProductsEntity savedEntity = productsRepository.save(productsEntity);
        if (savedEntity.getBno() >= 1)
            return productDto;
        return null;
    }

    public boolean productUpdate(ProductDto productDto) {
        Optional<ProductsEntity> optional = productsRepository.findById(productDto.getBno());
        if (optional.isPresent()) {
            ProductsEntity productsEntity = optional.get();
            productsEntity.setName(productDto.getName());
            productsEntity.setPrice(productDto.getPrice());
            productsEntity.getCategoryEntity().setCno(productDto.getCno());
            productsRepository.save(productsEntity);
            return true;
        }
        return false;s
    }

    public boolean productDelete(Integer bno) {
        Optional<ProductsEntity> optional = productsRepository.findById(bno);
        if (optional.isPresent()) {
            ProductsEntity productsEntity = optional.get();
            productsRepository.delete(productsEntity);
            return true;
        }
        return false;
    }
}
