package com.imran.StreamAPI;

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

public class FilteringCollectionUsingStream {

    public static void main(String[] args) {  
    	
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        
        productsList.add(new Product(1,"HP Laptop",250300f));  
        productsList.add(new Product(2,"Dell Laptop",100f));  
        productsList.add(new Product(3,"Lenevo Laptop",238000f));  
        productsList.add(new Product(4,"Sony Laptop",283000f));  
        productsList.add(new Product(5,"Apple Laptop",3000f));
        
        List<String> productPriceList2 = productsList.stream()  
        		
                                     .filter(p -> p.price < 30000)// filtering data  
                                     .map(p->p.name)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        
                    System.out.println(productPriceList2);  
        
    }  

}
