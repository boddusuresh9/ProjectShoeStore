package com.shoestore.service;

import java.util.List;

import com.shoestore.entity.Admin;
import com.shoestore.entity.Customer;

public interface AdminService {
	void insert(Admin a);
	void delete(int ano);
	void deleteall();
	List<Admin> getAll();
}
