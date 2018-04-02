package com.imran.LambdaExpression;

public class lambdaExpressionCreatingThread {


	public static void main(String[] args) {
		
		//Thread Example without lambda  
		
		Runnable runObj1 = new Runnable() {
			
				public void run() {
					System.out.println("Thread one (1) is running....");
				}
			
			};
			
			Thread thObj1 = new Thread(runObj1);
		 	thObj1.start();
		 	
		    //Thread Example with lambda 
		 	
		 	
		 	Runnable runObj2 = ()->{
		 		System.out.println("Thread Two (2) is running....");
		 	};
		 	
		 	Thread t2 = new Thread(runObj2);
		 	t2.start();
		 	
		 	

    

	}

}
