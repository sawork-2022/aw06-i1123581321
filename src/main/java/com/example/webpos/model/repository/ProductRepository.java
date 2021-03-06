package com.example.webpos.model.repository;


import com.example.webpos.model.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;


import java.util.Optional;


public interface ProductRepository extends PagingAndSortingRepository<Product, String> {

    Optional<Product> findById(String s);

    Iterable<Product> findAll();
}
