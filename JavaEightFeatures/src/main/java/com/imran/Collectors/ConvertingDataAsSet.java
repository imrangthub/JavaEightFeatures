package com.imran.Collectors;

import java.util.stream.Collectors;  
import java.util.Set;  
import java.util.List;  
import java.util.ArrayList; 

class ProductTwo{  
    int id;  
    String name;  
    float price;  
      
    public ProductTwo(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  



public class ConvertingDataAsSet {

	public static void main(String[] args) {
	     List<ProductTwo>productsList = new ArrayList<ProductTwo>(); 
	     
	        //Adding Products  
	        productsList.add(new ProductTwo(1,"HP Laptop",25000f));  
	        productsList.add(new ProductTwo(2,"Dell Laptop",30000f));  
	        productsList.add(new ProductTwo(3,"Lenevo Laptop",28000f));  
	        productsList.add(new ProductTwo(4,"Sony Laptop",28000f));  
	        productsList.add(new ProductTwo(5,"Apple Laptop",90000f));  
	        
	        Set<Float>productPriceList = productsList.stream()  
	                            .map(x->x.price)         // fetching price  
	                            .collect(Collectors.toSet());   // collecting as list  
	        System.out.println(productPriceList);  
	    } 

}
