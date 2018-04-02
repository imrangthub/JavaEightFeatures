package com.imran.StreamFilter;

import java.util.*;  
import java.util.stream.Collectors;  

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

public class StreamfilterTwo {

	public static void main(String[] args) {
		
		List<ProductTwo> productsList = new ArrayList<ProductTwo>();  
        //Adding Products  
        productsList.add(new ProductTwo(1,"HP Laptop",25000f));  
        productsList.add(new ProductTwo(2,"Dell Laptop",30000f));  
        productsList.add(new ProductTwo(3,"Lenevo Laptop",28000f));  
        productsList.add(new ProductTwo(4,"Sony Laptop",28000f));  
        productsList.add(new ProductTwo(5,"Apple Laptop",90000f));  
        
        
        List<ProductTwo> pricesList =  productsList.stream()  
                    .filter(p ->p.price < 30000)   // filtering price  
//                    .map(pm ->pm.price)          // fetching price  
                    .collect(Collectors.toList());  
        System.out.println(pricesList);  
    } 

}
