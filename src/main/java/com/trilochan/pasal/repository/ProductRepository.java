package com.trilochan.pasal.repository;

import com.trilochan.pasal.entity.Products;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.UUID;

@Repository
public interface ProductRepository extends CrudRepository<Products, UUID> {

    Iterable<Products> findAll();

}
