package com.trilochan.pasal.endpoint;

import com.trilochan.pasal.dto.ProductDto;
import com.trilochan.pasal.service.ProductService;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;
import java.util.UUID;

@Controller("/test")
public class ProductController {

    @Inject
    ProductService productService;

    @Post("/create")
    public ProductDto createProduct(@Body ProductDto body) {
        var data = productService.createProduct(body);
        return data;
    }

//    @Post("/one")
//    public ProductDto findById(@Body ProductDto body) {
//        var data = productService.findById(body.id());
//        return data;
//    }
@Get(value="/{id}")
public ProductDto findById(@PathVariable UUID id) {
    var data = productService.findById(id);
    return data;

}
    @Get("/all")
    public List<ProductDto> getAllProduct() {
        return productService.getAllProduct();
    }
    @Delete(value = "/{id}")
    public void deleteById(@PathVariable UUID id) {
        productService.deleteById(id);
    }

    @Put("/update")
    public ProductDto updateProduct(@Body ProductDto body) {
        var data = productService.findById(body.id());
        return productService.updateProduct(body.id(),body);

    }

}