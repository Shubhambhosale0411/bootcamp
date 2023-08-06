package com.telstra.service;

import java.util.ArrayList;

import com.telstra.model.Product;
import com.telstra.util.AppConstant;

public class ProductService {
	
		private ArrayList<Product> products=new ArrayList();
		
		public String addProduct(Product product) 
		{
			
			products.add(product);
			return AppConstant.INSERTED_INFO;
		}
		
		public ArrayList<Product> getAllProduct()
		{
			return products;
		}
		
		public void getProductByCategory(String category)
		{
			for(Product product:products)
			{
				if(product.getCategory().equalsIgnoreCase(category))
					System.out.println(product);
			}
		}
}
