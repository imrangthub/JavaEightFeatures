package com.imran.Base64;

import java.util.Base64;

public class Base64EncodingDecoding {

	public static void main(String[] args) {
		
		
		 // Getting encoder  
        Base64.Encoder encoder = Base64.getEncoder();  
        
        // Creating byte array  
        byte[]  bytebyteArr= {1,2,3};  
        
        // encoding byte array  
        byte [] bytebyteArr2 = encoder.encode(bytebyteArr);  
        System.out.println("Encoded byte array: "+bytebyteArr2);  
        

        // Encoding string  
        String str = encoder.encodeToString("JavaTpoint".getBytes());  
        System.out.println("Encoded string: "+str);  
        
        // Getting decoder  
        Base64.Decoder decoder = Base64.getDecoder(); 
        
        // Decoding string  
        String dStr = new String(decoder.decode(str));  
        System.out.println("Decoded string: "+dStr); 
        
        



	}

}
