package com.easy.f_anno.a_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
	public static void main(String[] args) {
		String xmlPath="com/easy/f_anno/a_ioc/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = applicationContext.getBean("userServiceId",UserService.class);
		userService.addUser();
	}
}
