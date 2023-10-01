package com.springcore.constructorinjection;

public class Test {
	public static void main(String[] args) {

		org.springframework.context.ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("constructorinjection.xml");

		Person person = (Person) context.getBean("person");

		System.out.println(person);

		Addition add = (Addition) context.getBean("add");

		add.doSum();

	}
}
