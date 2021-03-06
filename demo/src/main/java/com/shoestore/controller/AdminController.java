package com.shoestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shoestore.entity.Admin;
import com.shoestore.entity.Customer;
import com.shoestore.entity.CustomerLogin;
import com.shoestore.service.AdminService;
import com.shoestore.service.CustomerLoginService;
import com.shoestore.service.CustomerService;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminservice;
	@Autowired
	private CustomerLoginService customerloginservice;
	@Autowired
	private CustomerService customerservice;

	public AdminController(AdminService adminservice) {
		super();
		this.adminservice = adminservice;
	}
	@GetMapping("/custlist")
	public String showcustomers(Model model) {
		List<Customer> customers=customerservice.getAll();
		model.addAttribute("custs", customers);
		return "CustomerList";
	}

	@GetMapping("/adda")
	public String showForm2(Model model) {
		Admin a=new Admin();
		model.addAttribute("admin", a);
		return "Addadmin";
	}
	@PostMapping("/addadmin")
	public String addCustomerLogin(@ModelAttribute("admin") Admin a) {
		adminservice.insert(a);
		return "Adminhome";
	}
	@GetMapping("/addl")
	public String showForm3(Model model) {
		CustomerLogin a=new CustomerLogin();
		model.addAttribute("adminlog", a);
		return "Adminlogin";
	}
	@GetMapping("/adminhome")
	public String showForm4() {
		return "Adminhome";
	}
	@PostMapping("/addadminLogin")
	public String addadminLogin(@ModelAttribute("adminlog") CustomerLogin cl) {
		String s1,s2,p1,p2;
		customerloginservice.insert(cl);
		List<Admin> admins=adminservice.getAll();
		List<CustomerLogin> customerlog=customerloginservice.getAll();
		s2=customerlog.get(0).getName();
		p2=customerlog.get(0).getPassword();
		for(int i=0;i<admins.size();i++) {
			s1=admins.get(i).getName();
			p1=admins.get(i).getPassword();
			if(s1.equals(s2)) {
				if(p1.equals(p2)){
					customerloginservice.deleteall();
					return "Adminhome";
				}
			}
			
		}
		customerloginservice.deleteall();
		return "invalidcredentials";
	}


}
