package com.valtech.spring.security.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.bind.annotation.GetMapping;

@EnableWebSecurity
public class WebSecurityConfig {
	
	
//	public void createTablesIfNecessary(DataSource dataSource){
//		try{
//			JdbcTemplate temp=new JdbcTemplate(dataSource);
//			//temp.execute("drop table authorities");
//			temp.execute("drop Table users");
//			temp.execute("Create Table authorities (username varchar(60), authority varchar(40))");
//		}catch(Exception ex){
//			ex.printStackTrace();
//		}
//	}
	
	@Bean
	public PasswordEncoder passwordEncoder(){
//		return NoOpPasswordEncoder.getInstance();
		return new BCryptPasswordEncoder();
	}
	
//	@Bean
//	public UserDetailsManager userDetailsManager(PasswordEncoder passwordEncoder,DataSource dataSource){
//		//InMemoryUserDetailsManager manager=new InMemoryUserDetailsManager();
//		//createTablesIfNecessary(dataSource);
//		JdbcUserDetailsManager manager=new JdbcUserDetailsManager(dataSource);
//		
//		manager.createUser(User.withUsername("nuthan").password(passwordEncoder.encode("nuthan")).roles("USER").build());
//		manager.createUser(User.withUsername("admin").password(passwordEncoder.encode("admin")).roles("USER","ADMIN").build());
//		return manager;
//	}
	
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http.csrf().disable()
		.authorizeHttpRequests()
		.antMatchers("/","/user/**").hasAnyRole("USER")
		.antMatchers("/admin/**").hasAnyRole("ADMIN")
		.antMatchers(HttpMethod.DELETE).hasAnyRole("ADMIN")
		.antMatchers("/register","/login","/logout","/resetUsers").permitAll().anyRequest().authenticated();
//		http.httpBasic();
		http.formLogin().loginPage("/login").defaultSuccessUrl("/").failureForwardUrl("/login");
		return http.build();
	}
	
}
