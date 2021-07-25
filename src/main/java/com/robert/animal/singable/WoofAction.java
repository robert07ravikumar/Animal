package com.robert.animal.singable;

public class WoofAction implements Singable {

	@Override
	public String sing() {
		System.out.println("Woof, woof");
		return "Woof, woof";
	}

}
