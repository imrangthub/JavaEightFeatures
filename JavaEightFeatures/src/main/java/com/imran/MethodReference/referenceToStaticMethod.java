package com.imran.MethodReference;

//Syntax
//
//ContainingClass::staticMethodName  


interface Sayable{
	void say();
}



public class referenceToStaticMethod {
	
	public static void saySomthing() {
		System.out.println("Hello, this is from static method");
	}
	

	public static void main(String[] args) {

         Sayable sayableObj = referenceToStaticMethod::saySomthing;
         sayableObj.say();
		
	}

}
