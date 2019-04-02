package com.scp.java.shopping.pojo;

public class Product {
	private int productId;
	private String productName;
	private String productCat;
	private int productQty;
	private double productPrice;
	private boolean isDeleted;
	
	public boolean isDeleted()
	{
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted)
	{
		this.isDeleted=isDeleted;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCat() {
		return productCat;
	}
	public void setProductCat(String productCat) {
		this.productCat = productCat;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, String productCat, int productQty, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCat = productCat;
		this.productQty = productQty;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCat=" + productCat
				+ ", productQty=" + productQty + ", productPrice=" + productPrice + "]";
	}
	

}
