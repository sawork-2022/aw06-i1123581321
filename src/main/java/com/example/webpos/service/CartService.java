package com.example.webpos.service;

import com.example.webpos.model.entity.Product;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

public interface CartService {
    Iterable<Product> products(int page);
    Set<Map.Entry<Product, Integer>> content();

    void resetCart();
    void addProduct(String id, int amount);
    void removeProduct(String id);
    void modifyCart(String id, int amount);
}
