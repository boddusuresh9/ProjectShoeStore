package com.shoestore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoestore.entity.Orderproduct;
import com.shoestore.repository.OrderproductRepository;

@Service
@Transactional
public class OrderproductServiceImpl implements OrderproductService{

	@Autowired
	private OrderproductRepository orderproductrepository;
	
	public OrderproductServiceImpl(OrderproductRepository orderproductrepository) {
		super();
		this.orderproductrepository = orderproductrepository;
	}

	@Override
	public void insert(Orderproduct o) {
		// TODO Auto-generated method stub
		orderproductrepository.save(o);
	}

	@Override
	public void delete(int ono) {
		// TODO Auto-generated method stub
		orderproductrepository.deleteById(ono);
	}

	@Override
	public List<Orderproduct> getAll() {
		// TODO Auto-generated method stub
		return orderproductrepository.findAll();
	}

}
