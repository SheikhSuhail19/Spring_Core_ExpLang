package com.springcore.constructorinjection;

public class Person {
	private String name;
	private int personId;
	private Certi certi;

	public Person(String name, int personId) {
		this.name = name;
		this.personId = personId;
	}

	public Person(String name, int personId, Certi certi) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		System.out.println("Constructor Injection on Person");
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", personId=" + personId +
				", certi=" + certi +
				'}';
	}
}
