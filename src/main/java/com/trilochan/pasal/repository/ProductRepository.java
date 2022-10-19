package com.trilochan.pasal.repository;

import com.trilochan.pasal.entity.Product;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductRepository extends CrudRepository<Product, UUID> {

    Iterable<Product> findAll();
    Optional<Product> findById(UUID id);

    void deleteById(UUID id);


}
