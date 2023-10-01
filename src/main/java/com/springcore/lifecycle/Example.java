package com.springcore.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Example {
	private String subject;

	public Example() {
	}

	public Example(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		System.out.println("Setter Injection on Example");
	}

	@Override
	public String toString() {
		return "Example{" +
				"subject='" + subject + '\'' +
				'}';
	}

	@PostConstruct
	public void start() {
		System.out.println("Starting method");
	}

	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	}

}
