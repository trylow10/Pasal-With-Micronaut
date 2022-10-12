package com.trilochan.pasal.serviceimpl;

import com.trilochan.pasal.dto.ProductDto;
import com.trilochan.pasal.entity.Products;
import com.trilochan.pasal.mapper.ProductMapper;
import com.trilochan.pasal.repository.ProductRepository;
import com.trilochan.pasal.service.ProductService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class ProductServiceimpl implements ProductService {

    @Inject
    ProductRepository productRepository;

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        var data = ProductMapper.toEntity(productDto);
        return ProductMapper.toProductDto(productRepository.save(data));
    }

    @Override
    public ProductDto getAllProduct(ProductDto productDto) {
     var alldataInRepoEntity = ProductMapper.toEntity(productDto);
     var allDataInRepoDto = ProductMapper.toProductDto((Products) productRepository.findAll());
     return allDataInRepoDto;
    }

   

    @Override
    public ProductDto deleteById(ProductDto productDto) {
        return null;
    }
}
