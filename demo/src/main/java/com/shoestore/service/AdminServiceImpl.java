package com.shoestore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoestore.entity.Admin;
import com.shoestore.repository.AdminRepository;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminRepository adminrepository;
  
	@Override
	public void insert(Admin a) {
		// TODO Auto-generated method stub
		adminrepository.save(a);
	}

	@Override
	public void delete(int ano) {
		// TODO Auto-generated method stub
		adminrepository.deleteById(ano);
	}

	@Override
	public List<Admin> getAll() {
		// TODO Auto-generated method stub
		return adminrepository.findAll();
	}

	@Override
	public void deleteall() {
		// TODO Auto-generated method stub
		adminrepository.deleteAll();
	}

}
