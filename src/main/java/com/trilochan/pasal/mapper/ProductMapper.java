package com.trilochan.pasal.mapper;

import com.trilochan.pasal.dto.ProductDto;
import com.trilochan.pasal.entity.Product;
import lombok.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Builder(toBuilder = true)
public class ProductMapper {

    public ProductMapper() {
    }

    public static Product toEntity(ProductDto productDto) {
        return Product.builder()
                .id(Optional.ofNullable(productDto.id()).orElse(UUID.randomUUID()))
                .name(productDto.name())
                .description(productDto.description())
                .build();

    }

    public static ProductDto toDto(Product products) {
        return ProductDto.builder()
                .id(products.getId())
                .name(products.getName())
                .description(products.getDescription())
                .build();
    }

    public static List<ProductDto> listOfProductDto(Iterable<Product> products) {
        List<ProductDto> newList = new ArrayList<>();
        products.forEach(entity -> newList.add(toDto(entity)));
        return newList;
    }
}
