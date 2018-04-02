package com.imran.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

public class lambdaExpressionComparator {

	public static void main(String[] args) {
		
		List<Product> list=new ArrayList<Product>(); 
		
		list.add(new Product(1, "C", 222.32f));
		list.add(new Product(8, "Monitor", 222.32f));
		list.add(new Product(4, "A", 112.32f));
		list.add(new Product(2, "Z", 9922.32f));
		
		System.out.println("Befor Sorting on the basis of name...");
		  
		list.forEach(item->{
			System.out.println(item.getName());
		});
		
		System.out.println("After Sorting on the basis of name...");
		 // implementing lambda expression  
		
		Collections.sort(list, (p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		 list.forEach(item->{
			 System.out.println(item.getName());
		 });
		 
		
		


	}

}
