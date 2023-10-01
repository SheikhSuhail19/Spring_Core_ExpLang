package com.springcore.primitivetype;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		System.out.println("Constructor Injection on Student");
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
		System.out.println("Setter Injection on Student Id");
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("Setter Injection on Student Name");
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
		System.out.println("Setter Injection on Student Address");
	}

	@Override
	public String toString() {
		return "Demo{" +
				"studentId=" + studentId +
				", studentName='" + studentName + '\'' +
				", studentAddress='" + studentAddress + '\'' +
				'}';
	}
}
