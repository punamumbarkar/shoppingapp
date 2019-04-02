package com.scp.java.shopping.service.impl;

import java.util.Arrays;

import com.scp.java.shopping.pojo.Address;
import com.scp.java.shopping.pojo.Product;
import com.scp.java.shopping.pojo.Vendor;
import com.scp.java.shopping.service.ProductService;

public class ProductServiceImpl implements ProductService {
	@Override
	public boolean addProduct(Product userprod, int vendorId) {
			
			boolean vendorAvlb = false;
			
			for(Vendor ven :VendorServiceImpl.getAvailableVendors()){
				if(ven.getVendorId()==vendorId){
					vendorAvlb=true;
					break;
				}
			}
		
			if(!vendorAvlb){
				System.out.println("Vendor not available..so cannot access inventory...!");
				return false;
			}
			
			Product product = getProduct(userprod.getProductId(), vendorId);
			if(product == null){
					for(Vendor vendor : VendorServiceImpl.getAvailableVendors()){
						if(vendor.getVendorId()==vendorId){
							for(int i=0;i<vendor.getProducts().length;i++){
								if(vendor.getProducts()[i] == null){
									vendor.getProducts()[i] = userprod;
									System.out.println("Product inserted in " +vendor.getVendorName() +" 's list with index "+i);
									return true;
								}
							}
						}
								
					}
			}
			
			System.out.println("Product already exist....!");
			return false;
		
	}

	@Override
	public Product getProduct(int prodId, int vendorId) {
		boolean isProductAvailble = false;
		boolean isVendorAvailble = false;
		Product returnProduct = null;
		
		
		Vendor[] listOfVendors = VendorServiceImpl.getAvailableVendors();
		for(Vendor vend : listOfVendors){
			if(vend.getVendorId() == vendorId){
					isVendorAvailble=true;
					for (Product product :vend.getActualProducts()){
							if(product.getProductId() == prodId && product.isDeleted()==false){
								isProductAvailble=true;
								returnProduct = product;
								break; // product list break
							}
								
					}
			
					if(isProductAvailble) //vendor list la break
						break;
			}
		}

		if(isProductAvailble){
			System.out.println("Product is available");
		}else{ 
			System.out.println("Product Not Available");
			if(isVendorAvailble){
				System.out.println("Vendor is available");
			}else{
				System.out.println("Vendor is not availble");
			}
		}
		
		return returnProduct;
	}

	@Override
	public Product updateProduct(Product userprod, int vendorId) {
		Product product = getProduct(userprod.getProductId(), vendorId);
		if(product == null){
			return null;
		}
		product.setProductCat(userprod.getProductCat());
		product.setProductName(userprod.getProductName());
		product.setProductPrice(userprod.getProductPrice());
		product.setProductQty(userprod.getProductQty());
		System.out.println("Product values set properly...!");
		return getProduct(product.getProductId(),vendorId);
	}

	@Override
	public Product[] getAllProducts(int vendorId) {
		for(Vendor vendor : VendorServiceImpl.getAvailableVendors()){
			 if (vendor.getVendorId() == vendorId){
				 return vendor.getActualProducts();
			 }
		}
		System.out.println("Vendor not availble");
		return null;
	}

	@Override
	public boolean deleteProduct(int prodId, int vendorId) {
		Product product =getProduct(prodId, vendorId);
		if(product != null){
			product.setDeleted(true);
		}
		return false;
	}

	
	public void removeDeleteProducts(int vendorId){
		for(Vendor vendor :VendorServiceImpl.getAvailableVendors()){
				Product prods[] = vendor.getDeletedProducts();
				for(int i=0;i<prods.length;i++){
						if(prods[i]!=null && prods[i].isDeleted()==true){
							prods[i] = null;
						}
				}
		
		}
	}
	

	public static void main(String[] args) {
		Address ad1 = new Address(411046,"Mumbai","MH","India");
		Address ad2 = new Address(411046,"Mumbai","MH","India");
		
		VendorServiceImpl vimpl = new VendorServiceImpl(2);
		
		
		Vendor flip = new Vendor(1,"FlipKart",ad1,101010);
		Vendor amz = new Vendor(2,"Amazon",ad2,21230);
		vimpl.addVendor(flip);
		vimpl.addVendor(amz);
		System.out.println(Arrays.toString(VendorServiceImpl.listOfVendors));
		flip.getAddress().setCityName("Pune");
		System.out.println(Arrays.toString(VendorServiceImpl.listOfVendors));
 
		Product product1 = new Product(1,"Abc1","A1", 20, 20021);
		
		ProductServiceImpl impl = new ProductServiceImpl();
		impl.addProduct(product1, 2);
		impl.getAllProducts(3);
		
		System.out.println(Arrays.toString(VendorServiceImpl.listOfVendors));	
	}
	
}
