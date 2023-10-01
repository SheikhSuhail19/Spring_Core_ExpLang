package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean(name = {"student", "shagird", "pupil"})
	public Student getStudent() {
		return new Student(getSamosa());
	}

	@Bean(name = {"patty"})
	public Samosa getSamosa() {
		return new Samosa();
	}

}
