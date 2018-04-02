package com.imran.JavaDefaultMethods;


interface Sayable{  
    // Default method   
    default void say(){  
        System.out.println("Hello, this is default method");  
    } 
    
    // Abstract method  
    void sayMore(String msg);  
}  


public class JavaDefaultMethods implements Sayable{
	
	  public void sayMore(String msg){        // implementing abstract method   
	        System.out.println(msg);  
	    } 
	  

	
    public static void main(String[] args) {  
	
	JavaDefaultMethods dm = new JavaDefaultMethods(); 
		
	    dm.say();   // calling default method  
	    
	    dm.sayMore("Work is worship");  // calling abstract method
	
    }

}
