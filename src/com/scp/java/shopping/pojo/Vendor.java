package com.scp.java.shopping.pojo;

import java.util.Arrays;

public class Vendor {
	private int vendorId;
	private String vendorName;
	private Address address;
	private double balance;
	private Product[] products = new Product[10];
	int count =0;
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Product[] getProducts(){
		return products;
	}
	
	
	public Product[] getDeletedProducts() {
		Product [] actualProducts= new Product[count];
		int cnt = 0;
		for(Product product:products){
				if(product!=null && product.isDeleted()==true){
					actualProducts[cnt]=product;
					cnt++;
				}
		}
		return actualProducts;
	}
	
	
	public Product[] getActualProducts() {
		Product [] actualProducts= new Product[count];
		int cnt = 0;
		for(Product product:products){
				if(product!=null && product.isDeleted()==false){
					actualProducts[cnt]=product;
					cnt++;
				}
		}
		return actualProducts;
	}
	public void setProducts(Product[] products) {
		for(Product prod:products){
			this.products[count]=prod;	
			count++;
		}
		
	}
	
	public void setProduct(Product product) {
		this.products[count] = product;
		count++;
	}
	
	@Override
	public String toString() {
		return "\n Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName
				+ ", address=" + address + ", balance=" + balance
				+ ", products=" + Arrays.toString(products) + "]";
	}
	public Vendor(int vendorId, String vendorName, Address address,
			double balance) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.address = address;
		this.balance = balance;
	}
	public Vendor() {
		super();
	}
	
}
