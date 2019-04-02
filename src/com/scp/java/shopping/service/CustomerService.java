package com.scp.java.shopping.service;

import com.scp.java.shopping.pojo.Customer;

public interface CustomerService {
	public boolean addCustomer(Customer cust);
	public Customer getCustomer(int custId);
	public Customer updateCustomer(Customer cust);
	public Customer[] getAllCustomer();
	public boolean deleteCustomer(int custId);




}
