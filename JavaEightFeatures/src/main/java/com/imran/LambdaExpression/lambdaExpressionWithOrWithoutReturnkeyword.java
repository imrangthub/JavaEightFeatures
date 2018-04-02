package com.imran.LambdaExpression;


interface Substractable {
	   public int substract(int num1, int num2);
}

public class lambdaExpressionWithOrWithoutReturnkeyword {


	public static void main(String[] args) {

		// Lambda expression with return keyword.    
		
		Substractable obj1 = (a, b)-> {
			return (a-b);
		};
		
		System.out.println(obj1.substract(15, 5));
		
		
		
	   // Lambda expression with out return keyword. 
		
		Substractable obj2 = (a,b)->(a-b);
		
		System.out.println(obj2.substract(55, 10));
		
		

	}

}
