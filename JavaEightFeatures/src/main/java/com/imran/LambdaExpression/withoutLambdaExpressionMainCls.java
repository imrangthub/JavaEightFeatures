package com.imran.LambdaExpression;


interface Drawable{  
    public void draw();  
}  


public class withoutLambdaExpressionMainCls {
	
	   public static void main(String[] args) { 
		   
		   final String drawMessage = "This is a message from Drawable";
		   
		   Drawable drObj = new Drawable() {
			   public void draw() {
			        	System.out.println(drawMessage);
			        }
		   };
		   
		   drObj.draw();
	    }  
	}
