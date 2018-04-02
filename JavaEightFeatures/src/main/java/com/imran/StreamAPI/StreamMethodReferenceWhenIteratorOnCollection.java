package com.imran.StreamAPI;

import java.util.*;  
import java.util.stream.Collectors;  
  
class ProductTen{  
    int id;  
    String name;  
    float price;  
      
    public ProductTen(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
          
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
} 

public class StreamMethodReferenceWhenIteratorOnCollection {

	public static void main(String[] args) {
		   List<ProductTen> productsList = new ArrayList<ProductTen>();  
	          
	        //Adding Products  
	        productsList.add(new ProductTen(1,"HP Laptop",25000f));  
	        productsList.add(new ProductTen(2,"Dell Laptop",30000f));  
	        productsList.add(new ProductTen(3,"Lenevo Laptop",28000f));  
	        productsList.add(new ProductTen(4,"Sony Laptop",28000f));  
	        productsList.add(new ProductTen(5,"Apple Laptop",90000f));  
	          
	        List<String> productPriceList =   
	                productsList.stream()  
	                            .filter(p -> p.price > 30000) // filtering data  
	                            .map(ProductTen::getName)         // fetching price by referring getPrice method  
	                            .collect(Collectors.toList());  // collecting as list  
	        System.out.println(productPriceList);  
	    } 

}
