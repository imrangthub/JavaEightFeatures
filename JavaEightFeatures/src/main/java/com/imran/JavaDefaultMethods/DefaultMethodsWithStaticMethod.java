package com.imran.JavaDefaultMethods;

interface SayableTwo{    
    // default method    
    default void say(){    
        System.out.println("Hello, this is default method");    
    }    
    // Abstract method    
    void sayMore(String msg);    
    // static method    
    static void sayLouder(String msg){    
        System.out.println(msg);    
    } 

}

public class DefaultMethodsWithStaticMethod implements SayableTwo{
	
	 public void sayMore(String msg){     // implementing abstract method    
	        System.out.println(msg);    
	    }    
	 
	    public static void main(String[] args) {    
	    	DefaultMethodsWithStaticMethod dm = new DefaultMethodsWithStaticMethod();    
	        dm.say();                       // calling default method    
	        dm.sayMore("Work is worship");      // calling abstract method    
	        SayableTwo.sayLouder("Helloooo...");   // calling static method    
	    }

}
