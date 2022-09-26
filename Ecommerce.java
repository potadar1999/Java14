package com.que4;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

public class Ecommerce {
	
	List<Product> productList=new ArrayList<>();
	
	void addProductToList(Product product) {
		 productList.add(product);
	}
	
	List<Product> showAllProduct() {
		for(Product pro:productList) {
			if(pro.getName().equalsIgnoreCase(pro.getName())) {
				System.out.println("Product added successfully");
//				System.out.println(pro.getCount());
			}
			else {
				System.out.println("Count updated Product already exists");
			}
			
		}
		return productList;
	} 
		
	
	

}
