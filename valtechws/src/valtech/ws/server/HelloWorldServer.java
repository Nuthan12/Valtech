package valtech.ws.server;

import org.apache.cxf.frontend.ServerFactoryBean;

import valtech.ws.HelloWorld;
import valtech.ws.HelloWorldImpl;

public class HelloWorldServer {

	public static void main(String[] args) {
		
		ServerFactoryBean server = new  ServerFactoryBean();
		server.setServiceBean(new HelloWorldImpl());
		server.setServiceClass(HelloWorld.class);
		server.setAddress("http://localhost:6000/HelloWorld");
		server.create();
		System.out.println("Server Running");
	}

}
