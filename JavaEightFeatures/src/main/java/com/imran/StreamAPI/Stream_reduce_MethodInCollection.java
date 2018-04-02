package com.imran.StreamAPI;

import java.util.*;  
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


public class Stream_reduce_MethodInCollection {

	public static void main(String[] args) {
		
	      List<ProductFour> productsList = new ArrayList<ProductFour>();  
	        //Adding Products  
	        productsList.add(new ProductFour(1,"HP Laptop",1f));  
	        productsList.add(new ProductFour(2,"Dell Laptop",3f));  
	        productsList.add(new ProductFour(3,"Lenevo Laptop",4f));  
	        productsList.add(new ProductFour(4,"Sony Laptop",6f));  
	        productsList.add(new ProductFour(5,"Apple Laptop",7f)); 
	        
	        // This is more compact approach for filtering data  
	        Float totalPrice = productsList.stream()  
	                    .map(product->product.price)  
	                    .reduce(10.0f,(sum, price)->sum+price);   // accumulating price  
	        System.out.println(totalPrice);  
	        
	        
	        // More precise code   
	        
	        float totalPrice2 = productsList.stream()  
	                .map(product->product.price)  
	                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
	        System.out.println(totalPrice2);  
	          
	    } 

}
