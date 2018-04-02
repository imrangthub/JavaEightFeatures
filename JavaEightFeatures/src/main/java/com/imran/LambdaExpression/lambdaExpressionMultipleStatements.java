package com.imran.LambdaExpression;

interface SayableTwo{
	String say(String msg);
}


public class lambdaExpressionMultipleStatements {

	public static void main(String[] args) {
		
		SayableTwo obj = (message)->{    // You can pass multiple statements in lambda expression 
            
			String str1 = "I would like to say, ";
			String str2 = str1+message;
			 return str2;
			
		};
		
		System.out.println(obj.say("Hello every body..!"));
       
      

	}

}
