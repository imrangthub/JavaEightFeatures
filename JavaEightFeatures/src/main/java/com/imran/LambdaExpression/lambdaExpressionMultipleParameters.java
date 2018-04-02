package com.imran.LambdaExpression;

    interface Addable {
    	public void add(int num1, int num2);
    }

public class lambdaExpressionMultipleParameters {

	public static void main(String[] args) {
		
		Addable addObj = (num1, num2)-> {
			System.out.println("Summition is: "+(num1+num2));
		};
		
		addObj.add(12, 5);
		
	}

}
