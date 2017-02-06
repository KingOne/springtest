package com.easy.e_lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestScope {
	public static void main(String[] args) {
		String xmlPath="com/easy/e_lifecycle/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = applicationContext.getBean("userServiceId",UserService.class);
		userService.addUser();
		((AbstractApplicationContext) applicationContext).close();
	}
}
