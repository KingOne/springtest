package com.easy.b_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestDi {
	public static void main(String[] args) {
		String xmlPath="com/easy/b_di/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		BookService userService = applicationContext.getBean("bookServiceId",BookService.class);
		userService.addBook();
	}
}
