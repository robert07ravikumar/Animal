package com.robert.animal.singable;

public class CluckAction implements Singable {

	@Override
	public String sing() {
		System.out.println("Cluck, cluck");
		return "Cluck, cluck";
	}

}
