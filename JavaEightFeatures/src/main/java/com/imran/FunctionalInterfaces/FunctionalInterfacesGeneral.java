package com.imran.FunctionalInterfaces;

@FunctionalInterface
interface Sayable{
	void say(String say);
}



public class FunctionalInterfacesGeneral implements Sayable {
	
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfacesGeneral obj = new FunctionalInterfacesGeneral();
		obj.say("Hello world");

	}

}
