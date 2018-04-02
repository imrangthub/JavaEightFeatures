package com.imran.LambdaExpression;

//Java Lambda Expression Syntax
//(argument-list) -> {body}  


@FunctionalInterface  //It is optional  
interface DrawableTwo{  
    public void draw();  
}  

public class lambdaExpressionMainCls {
	
	
	public static void main(String[] args) {

//        with lambda
		
		DrawableTwo drObjTwo = ()-> {
			
			System.out.println("Test lambdaExpressionMainCls");
			System.out.println("Test lambdaExpressionMainCls");
			System.out.println("Test lambdaExpressionMainCls");
			
		};
		
		
		drObjTwo.draw();
	}

}
