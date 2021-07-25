package com.robert.animal.swimmable;

public class SwimAction implements Swimmable {

	@Override
	public String swim() {
		System.out.println("I am swimming");
		return "I am swimming";
	}

}
