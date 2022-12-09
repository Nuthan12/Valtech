package valtechspring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import valtechspring.tx.CarService;

public class TxTest {

	public static void main(String[] args) {
		
		ApplicationContext appCtx=new ClassPathXmlApplicationContext("hibernatetx.xml");
		CarService carService=(CarService) appCtx.getBean("carService");
		carService.updatePrice(2,1700000);
		
	}

}
