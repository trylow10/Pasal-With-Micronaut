package com.trilochan.pasal.endpoint;

import com.trilochan.pasal.dto.ProductDto;
import com.trilochan.pasal.service.ProductService;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/test")
public class ProductController {

    @Inject
    ProductService productService;

    @Post("/create")
    public ProductDto createProduct(@Body ProductDto body) {
        var data = productService.createProduct(body);
        return data;
    }

    @Post("/one")
    public ProductDto findById(@Body ProductDto body) {
        var data = productService.findById(body.id());
        return data;
    }


    @Get("/all")
    public List<ProductDto> getAllProduct() {
        return productService.getAllProduct();
    }


//@Delete("delete")
//    public void delete(UUID id) {
//        productService.deleteById(productService.deleteById(ProductDto));
//    }
//}

}