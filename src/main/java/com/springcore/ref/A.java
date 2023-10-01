package com.springcore.ref;

public class A {
	private int x;
	private B obj;

	public A() {
	}

	public A(int x, com.springcore.ref.B obj) {
		this.x = x;
		this.obj = obj;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public com.springcore.ref.B getObj() {
		return obj;
	}

	public void setObj(com.springcore.ref.B obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "A{" +
				"x=" + x +
				", obj=" + obj +
				'}';
	}
}
