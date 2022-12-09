package valtech.ws.server;

import org.apache.cxf.frontend.ServerFactoryBean;

import valtech.ws.PointArithmetic;
import valtech.ws.PointArithmeticImpl;

public class PointArithmeticServer {
	
	
	public static void main(String[] args) {
		ServerFactoryBean server=new ServerFactoryBean();
		server.setAddress("http://localhost:6000/PointArithmetic");
		server.setServiceBean(new PointArithmeticImpl());
		server.setServiceClass(PointArithmetic.class);
		server.create();
		System.out.println("Server Running........");
	}
}
