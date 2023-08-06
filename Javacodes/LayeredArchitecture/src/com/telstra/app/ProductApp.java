package com.telstra.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.telstra.model.Product;
import com.telstra.service.ProductService;

public class ProductApp {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter how many products u want to enter");
		
		int size=scanner.nextInt();
		ProductService productservice=new ProductService();
		
		for(int i=1;i<=size;i++)
		{
			
			System.out.println("enter product id");
			int id=scanner.nextInt();
			
			System.out.println("enter product name");
			String name=scanner.next();
			
			
			System.out.println("enter product Category");
			String category=scanner.next();
			
			System.out.println("enter product price");
			int price=scanner.nextInt();
			
			Product product=new Product(id,name,category,price);
			productservice.addProduct(product);
		}

		
		ArrayList<Product>products=productservice.getAllProduct();
		for(Product product:products)
		{
			System.out.println(product);
		}
	}

}
