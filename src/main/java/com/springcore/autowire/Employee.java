package com.springcore.autowire;

public class Employee {
	private Address address;

	public Employee() {
	}

	public Employee(com.springcore.autowire.Address address) {
		this.address = address;
		System.out.println("Constructor Injection on Employee");
	}

	public com.springcore.autowire.Address getAddress() {
		return address;
	}

	public void setAddress(com.springcore.autowire.Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"address=" + address +
				'}';
	}
}
