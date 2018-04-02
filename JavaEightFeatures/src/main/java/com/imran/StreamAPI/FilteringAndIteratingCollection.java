package com.imran.StreamAPI;

import java.util.*;  


class ProductThree{  
    int id;  
    String name;  
    float price;  
    public ProductThree(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
} 

public class FilteringAndIteratingCollection {

	public static void main(String[] args) {
		
	     List<ProductThree> productsList = new ArrayList<ProductThree>();  
	        //Adding Products  
	        productsList.add(new ProductThree(1,"HP Laptop",25000f));  
	        productsList.add(new ProductThree(2,"Dell Laptop",30000f));  
	        productsList.add(new ProductThree(3,"Lenevo Laptop",28000f));  
	        productsList.add(new ProductThree(4,"Sony Laptop",28000f));  
	        productsList.add(new ProductThree(5,"Apple Laptop",90000f));  
	        
	        // This is more compact approach for filtering data  
	        productsList.stream()  
	                             .filter(product -> product.price < 30000)  
	                             .forEach(product -> System.out.println(product.name));    
	    }  
	} 
