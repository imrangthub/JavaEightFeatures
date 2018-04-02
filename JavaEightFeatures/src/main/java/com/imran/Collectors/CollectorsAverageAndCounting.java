package com.imran.Collectors;

import java.util.stream.Collectors;  
import java.util.List;  
import java.util.ArrayList;  

class ProductFour{  
    int id;  
    String name;  
    float price;  
      
    public ProductFour(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
} 



public class CollectorsAverageAndCounting {

	public static void main(String[] args) {

	      List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        
	        Double average = productsList.stream()  
	                         .collect(Collectors.averagingDouble(p->p.price));  	        
	                        System.out.println("Average price is: "+average);  
	        
	        
	        
	        Long noOfElements = productsList.stream()  
                    .collect(Collectors.counting());  
                 System.out.println("Total elements : "+noOfElements);  
	        
	    }

}