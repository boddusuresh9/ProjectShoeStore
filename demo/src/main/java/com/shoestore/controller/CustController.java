package com.shoestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.shoestore.entity.Customer;

import com.shoestore.service.CustomerService;

@Controller
public class CustController {
	@Autowired
	private CustomerService customerservice;

	public CustController(CustomerService customerservice) {
		super();
		this.customerservice = customerservice;
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/")
	public String showForm() {
		return "main";
	}

	@GetMapping("/addc")
	public String showForm2(Model model) {
		Customer c=new Customer();
		model.addAttribute("cust", c);
		return "AddCustomer";
	}

	@PostMapping("/addcustomer")
	public String addCustomerLogin(@ModelAttribute("cust") Customer cust) {
		customerservice.insert(cust);
		return "main";
	}

}
