package com.springcore.collections;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;

public class Employee {
	private String name;
	private List<String> phoneNumbers;
	private Set<String> addresses;
	private Map<String, String> courses;
	private Properties props;

	public Employee() {
	}

	public Employee(String name, java.util.List<String> phoneNumbers, java.util.Set<String> addresses, java.util.Map<String, String> courses, Properties props) {
		this.name = name;
		this.phoneNumbers = phoneNumbers;
		this.addresses = addresses;
		this.courses = courses;
		this.props = props;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.util.List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(java.util.List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public java.util.Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(java.util.Set<String> addresses) {
		this.addresses = addresses;
	}

	public java.util.Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(java.util.Map<String, String> courses) {
		this.courses = courses;
	}

	public java.util.Properties getProps() {
		return props;
	}

	public void setProps(java.util.Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", phoneNumbers=" + phoneNumbers +
				", addresses=" + addresses +
				", courses=" + courses +
				", props=" + props +
				'}';
	}
}
