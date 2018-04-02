package com.imran.StreamAPI;

import java.util.*;  
import java.util.stream.Collectors;  

class ProductNine{  
    int id;  
    String name;  
    float price;  
    public ProductNine(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class StreamConvertListIntoMap {

	public static void main(String[] args) {
          
		   List<ProductNine> productsList = new ArrayList<ProductNine>();  
		   
	        //Adding Products  
	        productsList.add(new ProductNine(1,"HP Laptop",25000f));  
	        productsList.add(new ProductNine(2,"Dell Laptop",30000f));  
	        productsList.add(new ProductNine(3,"Lenevo Laptop",28000f));  
	        productsList.add(new ProductNine(4,"Sony Laptop",28000f));  
	        productsList.add(new ProductNine(5,"Apple Laptop",90000f));  
	          
	        // Converting Product List into a Map  
	        
	       Map <Integer, String> productMap = productsList.stream()
	    		   .collect(Collectors.toMap(p->p.id, p->p.name));
	       
	       System.out.println(productMap);
	       
	       
	        
	        


	}

}
