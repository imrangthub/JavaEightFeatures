package com.imran.forEachLoop;

import java.util.ArrayList;
import java.util.List;

//      forEach() Signature in Iterable Interface
//      default void forEach(Consumer<super T>action) 

public class JavaEightforEachLoop {

	public static void main(String[] args) {


		List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        
        System.out.println("------------Iterating by passing lambda expression--------------");
        
        gamesList.forEach(game-> {
        	System.out.println(game);
        });
        
        

	}

}
