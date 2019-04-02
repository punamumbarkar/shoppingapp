package com.scp.java.shopping.service;

import com.scp.java.shopping.pojo.Vendor;

public interface VendorService {
	public boolean addVendor(Vendor vendor);
	public Vendor getVendor(int venId);
	public Vendor updateVendor(Vendor vendor);
	public Vendor[] getAllVendors();
	public boolean deleteVendor(int venId);
	


}
