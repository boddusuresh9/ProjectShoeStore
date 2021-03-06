package com.shoestore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class CustomerLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clno;
	private String name;
	private String Password;
	public CustomerLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerLogin(int clno, String name, String password) {
		super();
		this.clno = clno;
		this.name = name;
		this.Password = password;
	}
	public int getClno() {
		return clno;
	}
	public void setClno(int clno) {
		this.clno = clno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}

}
