package com.scp.java.shopping.service;

import com.scp.java.shopping.pojo.Product;

public interface ProductService {
	public boolean addProduct(Product product,int vendorId);
	public Product getProduct(int productId,int vendorId);
	public Product updateProduct(Product product,int vendorId);
	public Product[] getAllProducts(int vendorId);
	public boolean deleteProduct(int productId,int vendorId);


}
