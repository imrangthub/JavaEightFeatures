//package com.imran.RepeatingAnnotations;
//
//@Repeatable(Games.class)  
//@interfaceGame{  
//    String name();  
//    String day();  
//} 
//
//@interfaceGames{  
//    Game[] value();  
//}
//
//
//
////Importing required packages for repeating annotation   
//import java.lang.annotation.Repeatable;  
//import java.lang.annotation.Retention;  
//import java.lang.annotation.RetentionPolicy;  
////Declaring repeatable annotation type  
//@Repeatable(Games.class)  
//@interfaceGame{  
// String name();  
// String day();  
//}  
////Declaring container for repeatable annotation type  
//@Retention(RetentionPolicy.RUNTIME)  
//@interfaceGames{  
// Game[] value();  
//}  
////Repeating annotation  
//@Game(name = "Cricket",  day = "Sunday")  
//@Game(name = "Hockey",   day = "Friday")  
//@Game(name = "Football", day = "Saturday")  
//
//
//
//public class RepeatingAnnotationsMainCla {
//
//	public static void main(String[] args) {
//
//        // Getting annotation by type into an array  
//        Game[] game = RepeatingAnnotationsExample.class.getAnnotationsByType(Game.class);  
//        for (Gamegame2 : game) {    // Iterating values  
//            System.out.println(game2.name()+" on "+game2.day());  
//        }  
//    }  
//}  