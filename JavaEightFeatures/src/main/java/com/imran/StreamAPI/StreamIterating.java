package com.imran.StreamAPI;

import java.util.stream.Stream;

public class StreamIterating {

    public static void main(String[] args){ 
    	
        Stream.iterate(1, element->element+1)  
        
        .filter(element->element%5==0)  
        .limit(50)  
        .forEach(System.out::println);  
        
    }  
}