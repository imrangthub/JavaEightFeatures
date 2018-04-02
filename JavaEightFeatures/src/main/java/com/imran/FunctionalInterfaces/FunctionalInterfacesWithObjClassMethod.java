package com.imran.FunctionalInterfaces;

@FunctionalInterface
interface SayableTwo{
	void say(String msg);
	
	// It can contain any number of Object class methods.  
    int hashCode();  
    String toString(); 
    boolean equals(Object obj);  

	
}

public class FunctionalInterfacesWithObjClassMethod implements SayableTwo{

	  public void say(String msg){  
	        System.out.println(msg);  
	    } 
	  
	public static void main(String[] args) {

		FunctionalInterfacesWithObjClassMethod obj = new FunctionalInterfacesWithObjClassMethod();
		obj.say("Hi");
	}

}
