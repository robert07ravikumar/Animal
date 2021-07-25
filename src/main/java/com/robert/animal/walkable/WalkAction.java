package com.robert.animal.walkable;

public class WalkAction implements Walkble {

	@Override
	public String walk() {
		System.out.println("I am walking");
		return "I am walking";
	}

}
