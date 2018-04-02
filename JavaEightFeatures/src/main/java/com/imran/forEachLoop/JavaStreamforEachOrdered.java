package com.imran.forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamforEachOrdered {

	public static void main(String[] args) {
		   List<String> gamesList = new ArrayList<String>();  
	        gamesList.add("Football");  
	        gamesList.add("Cricket");  
	        gamesList.add("Chess");  
	        gamesList.add("Hocky");  
	        
	        System.out.println("------------Normal Iterating by passing method reference---------------"); 
             gamesList.forEach(System.out::println);
	        
	        System.out.println("------------Iterating by passing lambda expression---------------");  
	        gamesList.stream().forEachOrdered(games -> System.out.println(games));  
	        
	        System.out.println("------------Iterating by passing method reference---------------");  
	        gamesList.stream().forEachOrdered(System.out::println);  
	        
	        
	        Stream.of("AAA","BBB","CCC").parallel().forEach(s->System.out.println("Output:"+s));
	               System.out.println("------------===========================================---------------");  
	        Stream.of("AAA","BBB","CCC").parallel().forEachOrdered(s->System.out.println("Output:"+s));
	    } 

}
