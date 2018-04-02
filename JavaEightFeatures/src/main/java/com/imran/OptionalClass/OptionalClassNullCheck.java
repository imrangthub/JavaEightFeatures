package com.imran.OptionalClass;

import java.util.Optional;

public class OptionalClassNullCheck {

	public static void main(String[] args) {
		
			        String[] str = new String[10]; 

// This program terminates abnormally and throws a nullPointerException.
	 
		//	        String lowercaseString = str[5].toLowerCase();  
		//	        System.out.print(lowercaseString); 
			        
			        
	//		str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index  
	        
	        
	        Optional<String> checkNull = Optional.ofNullable(str[5]);  
	        
	        if(checkNull.isPresent()){  // check for value is present or not  
	            String lowercaseString = str[5].toLowerCase();  
	            System.out.print(lowercaseString);  
	        }else  
	            System.out.println("string value is not present");  
	        
	        
	        
	    } 

}
