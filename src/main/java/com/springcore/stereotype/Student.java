package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component("student1")
//@Scope("singleton")
@Scope("prototype")
public class Student {
	@Value("Nawab")
	private String studentName;
	@Value("Lucknow")
	private String city;
	@Value("#{temp}")
	private java.util.List<String> address;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public java.util.List<String> getAddress() {
		return address;
	}

	public void setAddress(java.util.List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Demo{" +
				"studentName='" + studentName + '\'' +
				", city='" + city + '\'' +
				", address=" + address +
				'}';
	}
}
