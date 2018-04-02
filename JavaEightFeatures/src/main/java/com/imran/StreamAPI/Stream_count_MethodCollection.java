package com.imran.StreamAPI;

import java.util.*;  
class ProductSeven{  
    int id;  
    String name;  
    float price;  
    public ProductSeven(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class Stream_count_MethodCollection {

	public static void main(String[] args) {

	    List<ProductSeven> productsList = new ArrayList<ProductSeven>();  
        //Adding Products  
        productsList.add(new ProductSeven(1,"HP Laptop",25000f));  
        productsList.add(new ProductSeven(2,"Dell Laptop",30000f));  
        productsList.add(new ProductSeven(3,"Lenevo Laptop",28000f));  
        productsList.add(new ProductSeven(4,"Sony Laptop",100f));  
        productsList.add(new ProductSeven(5,"Apple Laptop",500f)); 
        
        
        // count number of products based on the filter 
        
        long countValue = productsList.stream()
        		.filter(productObj->productObj.price < 600f)
        		.count();
        
        System.out.println(countValue);

	}

}
