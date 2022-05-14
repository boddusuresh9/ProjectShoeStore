package com.shoestore.service;

import java.util.List;


import com.shoestore.entity.Customer;
import com.shoestore.exception.CustNotFoundException;

public interface CustomerService {
	void insert(Customer c);
	void delete(int cno);
	List<Customer> getAll();
	Customer get(int eno) throws CustNotFoundException;

}
