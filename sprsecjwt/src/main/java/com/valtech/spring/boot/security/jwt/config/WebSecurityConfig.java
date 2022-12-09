package com.valtech.spring.boot.security.jwt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true,securedEnabled=true,jsr250Enabled=true)
public class WebSecurityConfig {
	
	@Autowired
	@Lazy
	private LoginFilter loginFilter;
	
	@Autowired
	@Lazy
	private JWTFilter jwtFilter;
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
		httpSecurity.csrf().disable();
		httpSecurity.authorizeRequests().anyRequest().
		authenticated().and().antMatcher("/hello").anonymous().
		and().httpBasic();
		httpSecurity.addFilterBefore(jwtFilter, BasicAuthenticationFilter.class);
		httpSecurity.addFilterBefore(loginFilter, BasicAuthenticationFilter.class);
		return httpSecurity.build();
		
	}
	
	
	
	@Bean 
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	
	@Bean 
	public UserDetailsManager userDetailsManager(PasswordEncoder passwordEncoder){
		InMemoryUserDetailsManager udm = new InMemoryUserDetailsManager();
		udm.createUser(User.withUsername("nuthan").password(passwordEncoder.encode("nuthan")).roles("USER").build());
		udm.createUser(User.withUsername("admin").password(passwordEncoder.encode("admin")).roles("USER","ADMIN").build());
		return udm;
	}
	
}
