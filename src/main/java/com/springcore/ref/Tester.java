package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Tester {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");

		A a = (com.springcore.ref.A) context.getBean("aref");
		System.out.println(a);
	}

}
