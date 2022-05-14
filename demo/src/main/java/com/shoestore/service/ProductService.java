package com.shoestore.service;

import java.util.List;

import com.shoestore.entity.Products;

public interface ProductService {
	void insert(Products p);
	void delete(int pno);
	List<Products> getAll();
}
