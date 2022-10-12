package com.trilochan.pasal.endpoint;

import com.trilochan.pasal.dto.ProductDto;
import com.trilochan.pasal.service.ProductService;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.UUID;

@Controller("/test")
public class ProductController {

@Inject
ProductService productService;

@Post("/create")
    public ProductDto createProduct(@Body ProductDto body){
    var data = productService.createProduct(body);
    return data;
}
//@Get("/all")
//    public ProductDto getAllProduct(){
//    return null;
//}
@Delete("delete")
    public void delete(UUID id) {
        productService.deleteById(productService.deleteById(ProductDto));
    }
}
