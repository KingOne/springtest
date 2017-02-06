package com.easy.c_inject.c_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {
	public static void main(String[] args) {
		String xmlPath="com/easy/c_inject/c_factory/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = applicationContext.getBean("userServiceId",UserService.class);
		userService.addUser();
	}
}
