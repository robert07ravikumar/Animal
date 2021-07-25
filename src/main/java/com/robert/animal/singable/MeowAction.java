package com.robert.animal.singable;

public class MeowAction implements Singable {

	@Override
	public String sing() {
		System.out.println("Meow");

		return "Meow";
	}

}
