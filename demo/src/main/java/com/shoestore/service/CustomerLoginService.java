package com.shoestore.service;

import java.util.List;

import com.shoestore.entity.CustomerLogin;

public interface CustomerLoginService {
	void insert(CustomerLogin cl);
	void delete();
	void deleteall();
	List<CustomerLogin> getAll();
	
	
	

}
