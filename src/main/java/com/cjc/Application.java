package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public void m1()
	{
		System.out.println("1 change");
	}
	public void m2()
	{
		System.out.println("1 change");
		System.out.println("2 change");
		System.out.println("3 change");
		System.out.println("4 change");
	}
	public void login()
	{
		System.out.println("new From login");
	}
}
