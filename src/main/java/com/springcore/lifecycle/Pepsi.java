package com.springcore.lifecycle;

public class Pepsi implements org.springframework.beans.factory.InitializingBean, org.springframework.beans.factory.DisposableBean {
	private double price;

	public Pepsi() {
	}

	public Pepsi(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("Setter Injection on Pepsi");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is similar to init");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("This is similar to destroy");
	}

	@Override
	public String toString() {
		return "Pepsi{" +
				"price=" + price +
				'}';
	}
}
