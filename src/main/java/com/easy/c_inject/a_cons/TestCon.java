package com.easy.c_inject.a_cons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCon {
	public static void main(String[] args) {
		String xmlPath="com/easy/c_inject/a_cons/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		User user = applicationContext.getBean("userId",User.class);
		System.out.println(user);
	}
}
