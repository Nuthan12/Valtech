package com.valtech.product.list.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.valtech.product.list.entity.Product;
import com.valtech.product.list.service.ProductService;


@Controller()
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("products/updateProduct/{id}")
	public ModelAndView saveUpdateProduct(@PathVariable("id") int id,@ModelAttribute Product product,@RequestParam("submit") String submit){
		
		ModelAndView view=new ModelAndView("products/list");
		if(submit.equals("Cancel")){
			view.addObject("products", productService.getAllProducts());
			return view;
		}
		productService.updateProduct(product);
		view.addObject("products", productService.getAllProducts());
		return view;
		
	}
	
	@GetMapping("/products/updateProduct/{id}")
	public String updateProduct(@PathVariable("id") int id,Model model){  //view is the super interface for everybody
		model.addAttribute("product", productService.get(id));
		return "products/updateProduct";
	}
	
	@GetMapping("/products/newProduct")
	public String newProduct(){
		return "products/newProduct";
	}
	
	@GetMapping("/products/list")
	public String list(Model model){
		System.out.println("List of Products");
		//model.addAttribute("products", productService.getAllProducts());
		return "products/list";//prefix /cars/listSuffix/WEB-INF/views/cars/list.jsp
	}
	
	@PostMapping("/products/newProduct")
	public ModelAndView saveNewProduct(@ModelAttribute Product product,@RequestParam("submit") String submit){
		ModelAndView mnv=new ModelAndView("products/list");
		if(submit.equals("Cancel")){
			mnv.addObject("products", productService.getAllProducts());
			return mnv;
		}
		else{
		productService.createProduct(product);
		mnv.addObject("products", productService.getAllProducts());
		return mnv;
	}
		}
	
	
}
