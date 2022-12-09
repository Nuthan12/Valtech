package com.valtech.spring.boot.security.jwt.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class LoginFilter extends OncePerRequestFilter{

	private UserDetailsManager userDetailsManager;
	private PasswordEncoder passwordEncoder;
	private JwtHelper jwtHelper;
	
	public LoginFilter(UserDetailsManager userDetailsManager,PasswordEncoder passwordEncoder,JwtHelper jwtHelper){
		this.userDetailsManager=userDetailsManager;
		this.passwordEncoder=passwordEncoder;
		this.jwtHelper=jwtHelper;
	}
	
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String name=request.getHeader("username");
		String pass=request.getHeader("password"); //check username password for null and then return 401;
		UserDetails user=userDetailsManager.loadUserByUsername(name); // if this fails then 401;
		System.out.println(user.getPassword()+""+pass);
		if(passwordEncoder.matches(pass, user.getPassword())){
			response.setHeader(HttpHeaders.AUTHORIZATION, jwtHelper.createToken(user));
		}
		else{
			response.setStatus(HttpServletResponse.SC_FORBIDDEN);
			response.getWriter().print("Username Password not Valid");
		}
	}
	
	@Override
	protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
		String method = request.getMethod();
		String uri = request.getRequestURI();
		boolean login = "POST".equals(method) && uri.startsWith("/login");
		return !login;    //not of login -> it will not filter login;;;;;
		
	}
	
	
	
	
	
	
	
}
