package com.pblgllgs.productservice.repository;

import com.pblgllgs.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
