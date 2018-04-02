package com.imran.StreamAPI;

import java.util.*;  
class ProductSix{  
    int id;  
    String name;  
    float price;  
    public ProductSix(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class StreamFindMaxMinValue {

	public static void main(String[] args) {

	      List<ProductSix> productsList = new ArrayList<ProductSix>();  
	        //Adding Products  
	        productsList.add(new ProductSix(1,"HP Laptop",25000f));  
	        productsList.add(new ProductSix(2,"Dell Laptop",30000f));  
	        productsList.add(new ProductSix(3,"Lenevo Laptop",28000f));  
	        productsList.add(new ProductSix(4,"Sony Laptop",28000f));  
	        productsList.add(new ProductSix(5,"Apple Laptop",5000f)); 
	        
	        
	        // max() method to get max Product price 
	        ProductSix productA = productsList.stream()  
                    .max((product1, product2)->   
                    product1.price > product2.price ? 1: -1).get();  
		    System.out.println(productA.price); 
		    
		    
		    // min() method to get min Product price  
		    ProductSix productB = productsList.stream()  
		            .max((product1, product2)->   
		            product1.price < product2.price ? 1: -1).get();  
		    System.out.println(productB.price);  
		    

	}

}
