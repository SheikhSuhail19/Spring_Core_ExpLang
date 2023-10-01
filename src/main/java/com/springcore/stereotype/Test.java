package com.springcore.stereotype;

public class Test {
	public static void main(String[] args) {

		org.springframework.context.ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("stereoconfig.xml");

		Student s1 = context.getBean("student1", Student.class);

		System.out.println(s1);
		System.out.println(s1.hashCode());

		Student s2 = context.getBean("student1", Student.class);

		System.out.println(s2);
		System.out.println(s2.hashCode());

		System.out.println("--------------------------------------");

		Teacher t1 = context.getBean("t1", Teacher.class);

		System.out.println(t1);
		System.out.println(t1.hashCode());

		Teacher t2 = context.getBean("t1", Teacher.class);

		System.out.println(t2);
		System.out.println(t2.hashCode());

	}
}
