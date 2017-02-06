package com.easy.f_anno.a_ioc;

import org.springframework.stereotype.Component;

@Component("userServiceId")
public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("com.easy.f_anno.a_ioc");
	}

}
