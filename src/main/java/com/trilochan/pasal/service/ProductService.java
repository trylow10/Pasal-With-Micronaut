package com.trilochan.pasal.service;

import com.trilochan.pasal.dto.ProductDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);
    List<ProductDto> getAllProduct();
    ProductDto findById(UUID id);
    void deleteById(UUID id);

}
