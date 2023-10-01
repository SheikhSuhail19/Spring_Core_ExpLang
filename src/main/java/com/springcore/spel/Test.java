package com.springcore.spel;

import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {

		org.springframework.context.ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("spelconfig.xml");

		Demo demo = context.getBean("demo", Demo.class);

		System.out.println(demo);

		SpelExpressionParser temp = new SpelExpressionParser();

		org.springframework.expression.Expression expression = temp.parseExpression("1+2+3+4+5");

		System.out.println(expression.getValue());

	}
}
