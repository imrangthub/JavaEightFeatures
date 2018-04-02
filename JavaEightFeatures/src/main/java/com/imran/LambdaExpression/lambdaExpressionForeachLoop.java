package com.imran.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class lambdaExpressionForeachLoop {
	
	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<String>();  
		
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	        
	        list.forEach((item)-> {
	        	
	        	System.out.println(item);
	        	
	        });
	        
		
	}

}
