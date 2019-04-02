package com.scp.java.shopping.service.impl;

import com.scp.java.shopping.pojo.Vendor;
import com.scp.java.shopping.service.VendorService;

public class VendorServiceImpl implements VendorService {

	public static Vendor[] listOfVendors =null;
	static int noOfVendors;
	
	public VendorServiceImpl(int noofVendor) {
		super();
		listOfVendors= new Vendor[noofVendor];
	}
	
	
	public static Vendor[] getAvailableVendors(){
			Vendor[] vendors = new Vendor[noOfVendors];
			int count=0;
			for(Vendor vendor :listOfVendors){
					if(vendor!=null){
						vendors[count] = vendor;
						count++;
					}
			}
			return vendors;
	}
	
	@Override
	public boolean addVendor(Vendor vend) {
		Vendor vendor = getVendor(vend.getVendorId());
		if(vendor==null){
			listOfVendors[noOfVendors]=vend;
			noOfVendors++;
			return true;
		}
		System.out.println("Vendor Already Exist...cannot add...!");
		return false;
	}

	@Override
	public Vendor getVendor(int vendId) {
		for(Vendor vend : listOfVendors){
			if(vend!=null && vend.getVendorId()==vendId){
				return vend;
			}
		}
		return null;
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		Vendor vend = getVendor(vendor.getVendorId());
		if(vend!=null){
			vend.setAddress(vendor.getAddress());
			vend.setBalance(vendor.getBalance());
			vend.setProducts(vendor.getProducts());
			vend.setVendorName(vendor.getVendorName());
			System.out.println("Vendor Updated Successfully...!");
			return getVendor(vendor.getVendorId());
		}
		return null;
	}

	@Override
	public Vendor[] getAllVendors() {
		return listOfVendors;
	}

	@Override
	public boolean deleteVendor(int vendorId) {
		System.out.println("Delete Functionality is yet to be implemented....!");
		return false;
	}


	

}