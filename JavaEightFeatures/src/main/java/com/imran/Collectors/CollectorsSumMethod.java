package com.imran.Collectors;

import java.util.stream.Collectors;  
import java.util.List;  
import java.util.ArrayList;  

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

public class CollectorsSumMethod {

	public static void main(String[] args) {


		 List<ProductThree> productsList = new ArrayList<ProductThree>();  
	        //Adding Products  
	        productsList.add(new ProductThree(1,"HP Laptop",25000f));  
	        productsList.add(new ProductThree(2,"Dell Laptop",30000f));  
	        productsList.add(new ProductThree(3,"Lenevo Laptop",28000f));  
	        productsList.add(new ProductThree(4,"Sony Laptop",28000f));  
	        productsList.add(new ProductThree(5,"Apple Laptop",90000f));  
	        
	        Double sumPrices = productsList.stream()  
	                            .collect(Collectors.summingDouble(x->x.price));  // collecting as list  
	        System.out.println("Sum of prices: "+sumPrices);  
	        
	        Integer sumId =  productsList.stream()
	        		.collect(Collectors.summingInt(x->x.id));  
	        System.out.println("Sum of id's: "+sumId);  
	        
	        

	}

}
