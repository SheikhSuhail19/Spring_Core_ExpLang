package com.springcore.lifecycle;

public class Test {
	public static void main(String[] args) {

		org.springframework.context.support.AbstractApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("samosaconfig.xml");

		Samosa s1 = (Samosa) context.getBean("s1");

		System.out.println(s1);

		context.registerShutdownHook();

		System.out.println("-------------------------------------");

		Pepsi p1 = (Pepsi) context.getBean("p1");

		System.out.println(p1);

		System.out.println("-------------------------------------");

		Example e1 = (Example) context.getBean("e1");

		System.out.println(e1);

	}
}
