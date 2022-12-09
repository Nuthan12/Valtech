package com.valtech.spring.boot.security.test.config;

import org.springframework.context.annotation.Bean;
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
@EnableGlobalMethodSecurity(jsr250Enabled=true,securedEnabled=true,prePostEnabled=true)
public class SecurityConfig {
	
	
	
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	
	public UserDetailsManager userDetailsManager(PasswordEncoder passwordEncoder){
		InMemoryUserDetailsManager udm =new InMemoryUserDetailsManager();
		udm.createUser(User.withUsername("nuthan").password(passwordEncoder.encode("nuthan")).roles("USER").build());
		udm.createUser(User.withUsername("admin").password(passwordEncoder.encode("admin")).roles("USER","ADMIN").build());
		return udm;
	}
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
		httpSecurity.csrf().disable();
		httpSecurity.authorizeRequests().antMatchers("/hello").anonymous()
		.antMatchers("/user").hasAnyRole("USER").antMatchers("/admin").hasAnyRole("ADMIN").
		and().httpBasic();
		return httpSecurity.build();
		
	}
	
	
}
