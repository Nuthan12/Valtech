package com.valtech.jws.client;

import javax.xml.namespace.QName;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.valtech.jws.CarWebService;

@Configuration
public class WebServiceClientConfig {
	
	@Bean
	public CarWebService createCarWebServiceClientProxy(){
		JaxWsProxyFactoryBean proxy=new JaxWsProxyFactoryBean();
		proxy.setServiceClass(CarWebService.class);
		proxy.setServiceName(new QName("http://jws.valtech.com/","CarWebServiceImplService"));
		proxy.setAddress("http://localhost:8080/sprjws/services/cars");
		
		return proxy.create(CarWebService.class);
	}
	
	
	
	
	
	
	
	
	
	
}
