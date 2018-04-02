package com.imran.FunctionalInterfaces;

// In the following example, a functional interface is extending to a non-functional interface.

interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  
@FunctionalInterface  
interface SayableThree extends Doable{  
    void say(String msg);   // abstract method  
} 

public class FunctionalInterfacesExtendingNonFunctionalInterface  implements SayableThree {

	  public void say(String msg){  
	        System.out.println(msg);  
	    }  
	  
	public static void main(String[] args) {
		
		

		FunctionalInterfacesExtendingNonFunctionalInterface fie = new FunctionalInterfacesExtendingNonFunctionalInterface();  
       
		fie.say("Hello there");  
        fie.doIt();  
		   


		

	}

}
