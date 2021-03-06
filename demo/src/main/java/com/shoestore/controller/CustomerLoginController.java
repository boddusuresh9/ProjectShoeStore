package com.shoestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoestore.entity.Customer;
import com.shoestore.entity.CustomerLogin;
import com.shoestore.entity.Orderproduct;
import com.shoestore.entity.Products;
import com.shoestore.service.CustomerLoginService;
import com.shoestore.service.CustomerService;
import com.shoestore.service.OrderproductService;
import com.shoestore.service.ProductService;

@Controller

public class CustomerLoginController {
	@Autowired
	private CustomerLoginService customerloginservice;
	@Autowired
	private CustomerService customerservice;
	@Autowired
	private ProductService productservice;
	@Autowired
	private OrderproductService orderproductservice;

	public CustomerLoginController(CustomerLoginService customerloginservice) {
		super();
		this.customerloginservice = customerloginservice;
	}
	
	@GetMapping("/add")
	public String showForm1(Model model) {
		CustomerLogin cl=new CustomerLogin();
		model.addAttribute("custlog",cl);
		return "userlogin";
	}
	@PostMapping("/addcustomerLogin")
	public String addCustomerLogin(@ModelAttribute("custlog") CustomerLogin cl) {
		String s1,s2,p1,p2;
		customerloginservice.insert(cl);
		List<Customer> customers=customerservice.getAll();
		List<CustomerLogin> customerlog=customerloginservice.getAll();
		s2=customerlog.get(0).getName();
		p2=customerlog.get(0).getPassword();
		for(int i=0;i<customers.size();i++) {
			s1=customers.get(i).getName();
			p1=customers.get(i).getPassword();
			if(s1.equals(s2)) {
				if(p1.equals(p2)){
					return "customerhome";
				}
			}
		}
		return "invalidcredentials";
	}
	@GetMapping("/Productl")
	public String showproducts(Model model) {
		List<Products> products=productservice.getAll();
		model.addAttribute("prod", products);
		return "Productlc";
	}
	@GetMapping("/customerhome")
	public String showForm4() {
		return "customerhome";
	}
	@GetMapping("/addop")
	public String showForm6(Model model) {
		Orderproduct p=new Orderproduct();
		model.addAttribute("op",p);
		return "Order";
	}
	@PostMapping("/orderproduct")
	public String addCustomerLogin(@ModelAttribute("op") Orderproduct p) {
		orderproductservice.insert(p);
		return "customerhome";
	}

}
