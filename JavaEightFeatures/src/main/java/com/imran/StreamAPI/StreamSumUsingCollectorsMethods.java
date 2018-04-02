package com.imran.StreamAPI;


import java.util.*;  
import java.util.stream.Collectors;  


class ProductFive{  
    int id;  
    String name;  
    float price;  
    public ProductFive(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}


public class StreamSumUsingCollectorsMethods {
	
	 public static void main(String[] args) {  
	        List<ProductFive> productsList = new ArrayList<ProductFive>();  
	        //Adding Products  
	        productsList.add(new ProductFive(1,"HP Laptop",25000f));  
	        productsList.add(new ProductFive(2,"Dell Laptop",30000f));  
	        productsList.add(new ProductFive(3,"Lenevo Laptop",28000f));  
	        productsList.add(new ProductFive(4,"Sony Laptop",28000f));  
	        productsList.add(new ProductFive(5,"Apple Laptop",90000f)); 
	        
	        // Using Collectors's method to sum the prices.  
	        double totalPrice3 = productsList.stream()  
	                        .collect(Collectors.summingDouble(product->product.price));  
	        System.out.println(totalPrice3);  
	          
	    }  
	 
	 
	}  
