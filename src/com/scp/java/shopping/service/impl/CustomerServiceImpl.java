package com.scp.java.shopping.service.impl;

import com.scp.java.shopping.pojo.Customer;
import com.scp.java.shopping.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	static public Customer[] listOfCustomers = null;
	static int count=0;
	public CustomerServiceImpl(int noofCustomers) {
		super();
		listOfCustomers = new Customer[noofCustomers];
	}

	@Override
	public boolean addCustomer(Customer cust) 
	{
		Customer c=getCustomer(cust.getCustId());
		if(c!=null || cust==null)
		{
			System.out.println("Customer is Already Exists Or Empty");
		}
		else if(listOfCustomers.length>count)
		{
			listOfCustomers[count]=cust;
			System.out.println("Customer Is Added Successfully");
			count++;
			return true;
		}
		else {
		System.out.println("Customer Storage Exceeds");
		}
		return false;
	}

	@Override
	public Customer getCustomer(int custId) 
	{
		for(Customer cust:listOfCustomers)
		{
			if(cust!=null && cust.getCustId()==custId)
			{
				//System.out.println(cust);
				return cust;
			}
		}
		return null;
	}
	@Override
	public Customer updateCustomer(Customer cust) 
	{
		Customer c=getCustomer(cust.getCustId());
		if(c!=null)
		{
			c.setCustName(cust.getCustName());
			c.setAddress(cust.getAddress());
			c.setAge(cust.getAge());
			c.setBalance(cust.getBalance());
			return getCustomer(c.getCustId());
		}
		else
		{
			System.out.println("Customer Does Not Exists So Can not Update");
		}
		return null;
	}

	@Override
	public Customer[] getAllCustomer() 
	{
		Customer[] cust=new Customer[count];
		for(int i=0;i<count;i++)
		{
			if(listOfCustomers!=null)
			{
				cust[i]=listOfCustomers[i];
			}
		}
		return cust;
	}

	@Override
	public boolean deleteCustomer(int custId) 
	{
		Customer cust=getCustomer(custId);
		if(cust!=null)
		{
			for(int i=0;i<listOfCustomers.length;i++)
			{
				if(cust.getCustId()==listOfCustomers[i].getCustId())
				{
					listOfCustomers[i]=null;
					System.out.println("Deleted Successfully");
					return true;
				}
			}
		}
		else
		{
			System.out.println("Customer Not Exists So Can Not Delete");
		}
		return false;
	}
}
