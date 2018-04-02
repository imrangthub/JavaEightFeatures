package com.imran.MethodReference;

//Syntax
//
//containingObject::instanceMethodName 

interface SayableTwo{
	void say();
}

public class ReferenceToInstanceMethod {
	
	   public void saySomething(){  
	        System.out.println("Hello, this is non-static method.");  
	    }

	public static void main(String[] args) {
	
		ReferenceToInstanceMethod mainObj = new ReferenceToInstanceMethod();
		
		// Referring non-static method using reference  
		
		SayableTwo sayObj = mainObj::saySomething;
		
		sayObj.say();
		
		// Referring non-static method using anonymous object 
		SayableTwo sayObjTwo = new ReferenceToInstanceMethod()::saySomething;
		 // Calling interface method 
		sayObjTwo.say();

          

	}

}
