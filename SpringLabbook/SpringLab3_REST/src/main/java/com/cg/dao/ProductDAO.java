package com.cg.dao;

import java.util.List;

import com.cg.entity.Product;

public interface ProductDAO {
	
	    public void save(Product p);
	    public Product findById(int productId);
	    public List<Product> findAll();

}
