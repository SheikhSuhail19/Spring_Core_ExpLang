package com.springcore.standalone.collections;

public class Test {
	public static void main(String[] args) {

		org.springframework.context.ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("standaloneconfig.xml");

		Person person = context.getBean("person", Person.class);

		System.out.println(person);

		System.out.println(person.getFriends().getClass().getName());
		System.out.println(person.getFeeStructure().getClass().getName());
		System.out.println(person.getProps().getClass().getName());

	}
}
