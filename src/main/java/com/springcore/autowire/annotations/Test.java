package com.springcore.autowire.annotations;

public class Test {
	public static void main(String[] args) {

		org.springframework.context.ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("autoannotationconfig.xml");

		Employee emp1 = context.getBean("emp1", Employee.class);

		System.out.println(emp1);

	}
}
