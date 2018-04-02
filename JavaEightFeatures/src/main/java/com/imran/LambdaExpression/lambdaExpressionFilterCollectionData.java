package com.imran.LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;   

class ProductTwo {
	
	int id;
	String name;
	float price;
	
	public ProductTwo(int id, String name, float price) {
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

public class lambdaExpressionFilterCollectionData {


	public static void main(String[] args) {
		
		
		List<ProductTwo> list=new ArrayList<ProductTwo>(); 
		
		list.add(new ProductTwo(1, "C", 22.32f));
		list.add(new ProductTwo(8, "Monitor", 222.32f));
		list.add(new ProductTwo(4, "A", 112.32f));
		list.add(new ProductTwo(2, "Z", 9922.32f));
		
		System.out.println("=========== List data Befor Filter ==================");
		  
		list.forEach(item->{
			System.out.println(item.getName());
		});
		
		System.out.println("=========== List data After Filter ==================");
		
		  // using lambda to filter data 
		
		Stream<ProductTwo> filterData = list.stream().filter( p-> p.price < 200);
		
		// using lambda to iterate through collection  
		
		filterData.forEach(item->{
			System.out.println(item.getName());
		});
        

	}

}
