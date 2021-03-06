package com.shoestore.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.shoestore.entity.CustomerLogin;
import com.shoestore.repository.CustomerLoginRepository;

@Service
@Transactional
public class CustomerLoginServiceImpl implements CustomerLoginService{
	private CustomerLoginRepository customerloginrepository;

	public CustomerLoginServiceImpl(CustomerLoginRepository customerloginrepository) {
		super();
		this.customerloginrepository = customerloginrepository;
	}

	
	@Override
	public void insert(CustomerLogin cl) {
		// TODO Auto-generated method stub
		customerloginrepository.save(cl);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		customerloginrepository.deleteAll();
	}

	@Override
	public List<CustomerLogin> getAll() {
		// TODO Auto-generated method stub
		return customerloginrepository.findAll();
	}
	@Override
	public void deleteall() {
		// TODO Auto-generated method stub
		customerloginrepository.deleteAll();
	}

	
}
