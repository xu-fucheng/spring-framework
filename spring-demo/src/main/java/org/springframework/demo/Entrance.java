package org.springframework.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.demo.service.WelcomeService;

public class Entrance {
	public static void main(String[] args) {
		System.out.println("11");
		String xmlPath = "D:\\Project\\spring-framework\\spring-demo\\src\\main\\resources\\spring\\spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = (WelcomeService)applicationContext.getBean("welcomeService");
		String res = welcomeService.sayHello("hello");
		System.out.println(res);
	}
}
