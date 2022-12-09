package com.valtech.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.valtech.spring.boot.entity.Product;
import com.valtech.spring.boot.service.CarService;


@Controller()
public class CarController {
	
	
	@Autowired
	private CarService carService;
	
	@PostMapping("cars/updateCar/{id}")
	public ModelAndView saveUpdateCar(@PathVariable("id") int id,@ModelAttribute Product car,@RequestParam("submit") String submit){
		
		ModelAndView view=new ModelAndView("cars/list");
		if(submit.equals("Cancel")){
			view.addObject("cars", carService.getAllCars());
			return view;
		}
		carService.update(car);
		view.addObject("cars", carService.getAllCars());
		return view;
		
	}
	
	@GetMapping("/cars/updateCar/{id}")
	public String updateCar(@PathVariable("id") int id,Model model){  //view is the super interface for everybody
		model.addAttribute("car", carService.get(id));
		return "cars/updateCar";
	}
	
	@GetMapping("/cars/newCar")
	public String newCar(){
		return "cars/newCar";
	}
	
	@GetMapping("/cars/list")
	public String list(Model model){
		System.out.println("List of Cars");
		model.addAttribute("cars", carService.getAllCars());
		return "cars/list";//prefix /cars/listSuffix/WEB-INF/views/cars/list.jsp
	}
	
	@PostMapping("/cars/newCar")
	public ModelAndView saveNewCar(@ModelAttribute Product car,@RequestParam("submit") String submit){
		ModelAndView mnv=new ModelAndView("cars/list");
		if(submit.equals("Cancel")){
			mnv.addObject("cars", carService.getAllCars());
			return mnv;
		}
		carService.createCar(car);
		mnv.getModel().put("cars", carService.getAllCars());
		return mnv;
	}
	

	
	
	
	// Url for this application will be http://localhost/8080/cars/
}
