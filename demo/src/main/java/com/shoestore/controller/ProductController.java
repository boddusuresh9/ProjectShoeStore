package com.shoestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shoestore.entity.Customer;
import com.shoestore.entity.CustomerLogin;
import com.shoestore.entity.Products;
import com.shoestore.service.ProductService;
@Controller
public class ProductController {
	@Autowired
	private ProductService productservice;

	public ProductController() {
		super();
		// TODO Auto-generated constructor stub
	}
	@GetMapping("/addp")
	public String showForm1(Model model) {
		Products p=new Products();
		model.addAttribute("product",p);
		return "AddProduct";
	}
	@PostMapping("/addproduct")
	public String addCustomerLogin(@ModelAttribute("product") Products p) {
		productservice.insert(p);
		return "Adminhome";
	}
	@GetMapping("/Productlist")
	public String showproducts(Model model) {
		List<Products> products=productservice.getAll();
		model.addAttribute("prod", products);
		return "Productlist";
	}

}
