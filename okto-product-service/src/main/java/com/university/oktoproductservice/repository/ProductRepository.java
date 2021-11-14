package com.university.oktoproductservice.repository;

import com.university.oktoproductservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
