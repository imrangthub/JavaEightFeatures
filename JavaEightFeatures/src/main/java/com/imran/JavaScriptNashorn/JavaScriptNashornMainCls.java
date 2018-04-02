package com.imran.JavaScriptNashorn;

import javax.script.*;  
import java.io.*;  

public class JavaScriptNashornMainCls {


		public static void main(String[] args) throws Exception{  
//	        // Creating script engine  
//	        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
//	        // Reading Nashorn file  
//	        ee.eval(new FileReader("js/hello.js")); 
			
			
			
			// Creating script engine  
	        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
	        // Evaluating Nashorn code  
	        ee.eval("print('Hello Nashorn');");  
	        
	        
	        // and more................................................ feature................ about java script
			
	    }  

}
