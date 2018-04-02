package com.imran.StreamAPI;

import java.util.*;  
import java.util.stream.Collectors;  

class ProductEight{  
    int id;  
    String name;  
    float price;  
    public ProductEight(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}



public class ConvertListIntoSet {

	public static void main(String[] args) {
        List<ProductEight> productsList = new ArrayList<ProductEight>();  
        
        //Adding Products  
        productsList.add(new ProductEight(1,"HP Laptop",25000f));  
        productsList.add(new ProductEight(2,"Dell Laptop",30000f));  
        productsList.add(new ProductEight(3,"Lenevo Laptop",28000f));  
        productsList.add(new ProductEight(4,"Sony Laptop",28000f));  
        productsList.add(new ProductEight(5,"Apple Laptop",90000f));  
          
        // Converting product List into Set  
        Set<Float> productPriceList = productsList.stream()  
            .filter(product->product.price < 30000)   // filter product on the base of price  
            .map(product->product.price)  
            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
        System.out.println(productPriceList);  
    }  
}


