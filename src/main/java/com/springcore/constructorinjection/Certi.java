package com.springcore.constructorinjection;

public class Certi {
	private String name;

	public Certi(String name) {
		this.name = name;
		System.out.println("Constructor Injection on Certi");
	}

	@Override
	public String toString() {
		return "Certi{" +
				"name='" + name + '\'' +
				'}';
	}
}
