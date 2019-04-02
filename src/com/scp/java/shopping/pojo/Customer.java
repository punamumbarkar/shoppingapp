package com.scp.java.shopping.pojo;

public class Customer {
	private int custId;
	private String custName;
	private Address address;
	private int age;
	private double balance;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, Address address, int age, double balance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.address = address;
		this.age = age;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", address=" + address + ", age=" + age
				+ ", balance=" + balance + "]";
	}
	

	

}
