package com.trilochan.pasal.service;

import com.trilochan.pasal.dto.ProductDto;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);

    ProductDto getAllProduct(ProductDto productDto);

    ProductDto deleteById(ProductDto productDto);
}
