package com.shoestore.service;

import java.util.List;


import com.shoestore.entity.Orderproduct;

public interface OrderproductService {
	void insert(Orderproduct o);
	void delete(int ono);
	List<Orderproduct> getAll();
}
