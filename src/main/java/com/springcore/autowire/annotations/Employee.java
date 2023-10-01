package com.springcore.autowire.annotations;

public class Employee {
//	@org.springframework.beans.factory.annotation.Autowired
//	@org.springframework.beans.factory.annotation.Qualifier("address2")
	private Address address;

	public Employee() {
	}

//	@org.springframework.beans.factory.annotation.Autowired
	public Employee(Address address) {
		this.address = address;
		System.out.println("Constructor Injection on Employee");
	}

	public Address getAddress() {
		return address;
	}

	@org.springframework.beans.factory.annotation.Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setter Injection on Employee");
	}

	@Override
	public String toString() {
		return "Employee{" +
				"address=" + address +
				'}';
	}
}
