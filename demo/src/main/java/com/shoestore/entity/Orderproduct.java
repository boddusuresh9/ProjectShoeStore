package com.shoestore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orderproduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ono;
	private int cid;
	private int pid;
	public Orderproduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orderproduct(int ono, int cid, int pid) {
		super();
		this.ono = ono;
		this.cid = cid;
		this.pid = pid;
	}
	public int getOno() {
		return ono;
	}
	public void setOno(int ono) {
		this.ono = ono;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}

}
