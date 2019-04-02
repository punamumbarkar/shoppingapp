package com.scp.java.shopping.service.impl;

import java.util.Arrays;

import com.scp.java.shopping.pojo.Address;
import com.scp.java.shopping.pojo.Vendor;

public class ShoppingServiceImpl {
	
	public static void main(String[] args)
	{
		VendorServiceImpl ven=new VendorServiceImpl(10);
		
		Address a1=new Address(411041,"Pune","Maharashtra","India");
		Vendor v1=new Vendor(1,"Amazon", a1,1250000);
		Vendor v2=new Vendor(2,"Flipcart", a1,1050000);
		boolean isAdded1=ven.addVendor(v1);
		System.out.println("Vendor Added: "+isAdded1);
		boolean isAdded2=ven.addVendor(v2);
		System.out.println("Vendor Added: "+isAdded2);
		Vendor getV=ven.getVendor(1);
		System.out.println("Vendor: "+getV);
		
		Vendor v3=new Vendor(1,"AMAZON", a1,1500000); 
		Vendor upV=ven.updateVendor(v3);
		System.out.println("Update Vendor: "+upV);
		
		Vendor allv[]=ven.getAllVendors();
		System.out.println("Vendor List: "+Arrays.toString(allv));
		
		boolean isDeleted=ven.deleteVendor(5);
		System.out.println("Vendo Deleted: "+isDeleted);
		/*CustomerServiceImpl cust=new CustomerServiceImpl(10);
		Address a1=new Address(411041, "Pune", "Maharashtra","India");
		Customer c1=new Customer(1,"Punam",a1,24,20000);
		
		Address a2=new Address(444101, "Akot", "Maharashtra","India");
		Customer c2=new Customer(2,"Kshamata",a2,29,30000);
		
		Address a3=new Address(444647, "Amaravati", "Maharashtra","India");
		Customer c3=new Customer(3,"Sneha",a3,25,10000);
		
		Address a4=new Address(444111, "Akola", "Maharashtra","India");
		Customer c4=new Customer(4,"Shital",a4,25,25000);
		
		boolean isAdded1=cust.addCustomer(c1);
		System.out.println("Customer Added 1: "+isAdded1);
		boolean isAdded2=cust.addCustomer(c2);
		System.out.println("Customer Added 2: "+isAdded2);
		boolean isAdded3=cust.addCustomer(c3);
		System.out.println("Customer Added 3: "+isAdded3);
		boolean isAdded4=cust.addCustomer(c4);
		System.out.println("Customer Added 4: "+isAdded4);
		
		Customer getCust=cust.getCustomer(1);
		System.out.println("Get Customer:  "+getCust);
		
		System.out.println("................................Get All Customer List...................................");
		Customer c[]=cust.getAllCustomer();
		for(Customer customer:c)
		{
			System.out.println(customer);
		}
		
		System.out.println("....................................Update Customer.................................");
		Customer c5=new Customer(1,"Mitthu", a1, 24,25000);
		Customer upCust=cust.updateCustomer(c5);
		System.out.println("Update Customer: "+upCust);
		
		boolean isDeleted=cust.deleteCustomer(4);
		System.out.println("Customer Deleted: "+isDeleted);
		
		System.out.println("................................After Delete Function Customer List...................................");
		Customer cList[]=cust.getAllCustomer();
		for(Customer customer:cList)
		{
			System.out.println(customer);
		}
		*/
		
		
		
		
		
		
	}

}
