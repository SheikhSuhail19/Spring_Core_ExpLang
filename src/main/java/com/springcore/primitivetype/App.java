package com.springcore.primitivetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		com.springcore.primitivetype.Student student1 = (com.springcore.primitivetype.Student) context.getBean("student1");
		System.out.println(student1);

		com.springcore.primitivetype.Student student2 = (com.springcore.primitivetype.Student) context.getBean("student2");
		System.out.println(student2);

		com.springcore.primitivetype.Student student3 = (com.springcore.primitivetype.Student) context.getBean("student3");
		System.out.println(student3);

	}
}
