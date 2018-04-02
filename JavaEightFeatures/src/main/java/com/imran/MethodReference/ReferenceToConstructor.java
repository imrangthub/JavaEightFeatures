package com.imran.MethodReference;

//Syntax
//
//ClassName::new  


interface Messageable{  
    Message getMessage(String msg);  
}

class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
} 

public class ReferenceToConstructor {
	

	public static void main(String[] args) {
		
		 Messageable magObj = Message::new;  
		 
		 magObj.getMessage("Hello");  
		
		


	}

}
