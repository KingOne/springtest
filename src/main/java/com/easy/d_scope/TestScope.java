package com.easy.d_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestScope {
	public static void main(String[] args) {
		String xmlPath="com/easy/d_scope/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService1 = applicationContext.getBean("userServiceId",UserService.class);
		UserService userService2 = applicationContext.getBean("userServiceId",UserService.class);
		System.out.println(userService1);
		System.out.println(userService2);
		System.out.println(userService1==userService2);
	}
}
