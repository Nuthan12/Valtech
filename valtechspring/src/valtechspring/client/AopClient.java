package valtechspring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import valtechspring.aop.Arithmetic;
import valtechspring.aop.SimpleInteres;
import valtechspring.aop.SimpleInterestImpl;

public class AopClient {

	public static void main(String[] args) {
		
		ApplicationContext appCtx=new ClassPathXmlApplicationContext("aop.xml");
		SimpleInteres si=(SimpleInteres) appCtx.getBean("si");
		System.out.println("Simple Interest = "+si.computeSimpleInterest(2000,3,2));
		
		Arithmetic arithmetic=(Arithmetic) appCtx.getBean("arithmetic");
		System.out.println("Arithmetic Class "+arithmetic.getClass().getName());
		
		arithmetic.add(2,3);
		arithmetic.sub(5, 3);
		arithmetic.add(10,20);
		arithmetic.add(-2,-3);
		System.out.println(arithmetic.add(-5,-3));
		
	}		

}
