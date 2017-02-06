package com.easy.c_inject.a_cons;

public class User {
	private Integer uid;
	private String username;
	private Integer age;
	public User(Integer uid, String username) {
		super();
		this.uid = uid;
		this.username = username;
	}
	public User(String username, Integer age) {
		super();
		this.username = username;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", age=" + age + "]";
	}
	
}
