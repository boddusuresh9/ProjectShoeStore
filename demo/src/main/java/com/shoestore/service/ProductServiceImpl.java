package com.shoestore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.shoestore.entity.Products;
import com.shoestore.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	private ProductRepository productrepository;

	public ProductServiceImpl(ProductRepository productrepository) {
		super();
		this.productrepository = productrepository;
	}


	@Override
	public void insert(Products p) {
		// TODO Auto-generated method stub
		productrepository.save(p);
	}

	
	@Override
	public void delete(int pno) {
		// TODO Auto-generated method stub
		productrepository.deleteById(pno);
	}

	@Override
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return productrepository.findAll();
	}
}
