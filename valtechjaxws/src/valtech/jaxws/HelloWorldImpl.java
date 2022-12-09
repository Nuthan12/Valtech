package valtech.jaxws;

import javax.jws.WebService;

@WebService(targetNamespace = "http://jaxws.valtech/", endpointInterface = "valtech.jaxws.HelloWorld", portName = "HelloWorldImplPort", serviceName = "HelloWorldImplService")
public class HelloWorldImpl implements HelloWorld {
	
	
	@Override
	public String hello(String name){
		return "Hello "+name;
	}
	
	@Override
	public String hi(String name){
		return "Hi "+name;
	}
	
	
	
}
