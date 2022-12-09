package com.valtech.spring.security.controllers;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.valtech.spring.security.model.RegisterUserModel;
import com.valtech.spring.security.service.ValtechUserDetailsService;

@Controller
public class HelloController {

	@Autowired
	ValtechUserDetailsService userDetailsManager;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/admin")
	public String adminPage() {
		return "/Admin/home";
	}

	 @GetMapping("/resetUsers")
	 @ResponseBody
	 public String resetUsers(){
		 System.out.println(userDetailsManager.loadUserByUsername("nuthan"));
		 System.out.println(userDetailsManager.loadUserByUsername("admin"));
		 userDetailsManager.resetUsers();
		 com.valtech.spring.security.entity.User user = new
		 com.valtech.spring.security.entity.User("nuthan",passwordEncoder.encode("nuthan"));
		 user.setRoles(Arrays.asList("USER"));
		 user.setEnabled(true);
		 userDetailsManager.createUser(user);
		 user=new com.valtech.spring.security.entity.User("admin",passwordEncoder.encode("admin"));
		 user.setRoles(Arrays.asList("USER","ADMIN"));
		 user.setEnabled(true);
		 userDetailsManager.createUser(user);
		 return "Success";
	 }

	@GetMapping("/user")
	public String userPage() {
		return "/User/home";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute RegisterUserModel registerUserModel) {
		String username = registerUserModel.getUsername();
		String password = registerUserModel.getPassword();
		String confirmpassword = registerUserModel.getConfirmpassword();
		if (registerUserModel.getPassword().equals(registerUserModel.getConfirmpassword())) {
			userDetailsManager.createUser(User.withUsername(username).password(password).roles("USER").build());
			return "login";
		} else {
			return "Register/register";
		}
	}

	@GetMapping("/register")

	public String register() {
		return "/Register/register";
	}

	// @GetMapping("/admin")
	// @ResponseBody
	// public String adminPages(){
	// return "admin";
	// }
	//
	//
	// @GetMapping("/user")
	// @ResponseBody
	// public String userPages(){
	// return "user";
	// }

	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "Success";
	}

}
