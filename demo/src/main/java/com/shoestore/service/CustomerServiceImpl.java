package com.shoestore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.shoestore.entity.Customer;
import com.shoestore.exception.CustNotFoundException;
import com.shoestore.repository.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public void insert(Customer c) {
		// TODO Auto-generated method stub
		customerRepository.save(c);
	}

	@Override
	public void delete(int cno) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(cno);
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		
		return customerRepository.findAll();
	}

	@Override
	public Customer get(int eno) throws CustNotFoundException {
		// TODO Auto-generated method stub
		
		Customer c;
		
			c = customerRepository.findById(eno).orElseThrow(()->new CustNotFoundException("Customer Not found"));
			return c;
		
	
		}

}
