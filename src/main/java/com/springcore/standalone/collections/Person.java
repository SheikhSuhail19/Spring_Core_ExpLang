package com.springcore.standalone.collections;

public class Person {
	private java.util.List<String> friends;
	private java.util.Map<String, Integer> feeStructure;
	private java.util.Properties props;

	public java.util.List<String> getFriends() {
		return friends;
	}

	public void setFriends(java.util.List<String> friends) {
		this.friends = friends;
	}

	public java.util.Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(java.util.Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public java.util.Properties getProps() {
		return props;
	}

	public void setProps(java.util.Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "Person{" +
				"friends=" + friends +
				", feeStructure=" + feeStructure +
				", props=" + props +
				'}';
	}
}
