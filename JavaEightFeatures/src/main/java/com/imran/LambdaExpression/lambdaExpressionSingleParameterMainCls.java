package com.imran.LambdaExpression;

interface Sayable{                             // method define 
    public void say(String name);  
}  


public class lambdaExpressionSingleParameterMainCls {


	public static void main(String[] args) {          // method implement
		
		Sayable sayableObj = (name)->{
			System.out.println("You enter: "+name);
		};
		
		
		sayableObj.say("MD IMRAN HOSSAIN");          // method calling  


	}
	
	
	
	

}
