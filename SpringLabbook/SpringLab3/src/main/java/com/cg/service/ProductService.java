package com.cg.service;

import java.util.List;

import com.cg.entity.Product;

public interface ProductService {

	Product find(int productId);
    List<Product> getAll();
    void create(Product p);
}
