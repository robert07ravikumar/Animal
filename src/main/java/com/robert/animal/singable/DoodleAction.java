package com.robert.animal.singable;

public class DoodleAction implements Singable {

	@Override
	public String sing() {
		System.out.println("Cock-a-doodle-doo");

		return "Cock-a-doodle-doo";
	}

}
