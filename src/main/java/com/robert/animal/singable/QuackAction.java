package com.robert.animal.singable;

public class QuackAction implements Singable {

	@Override
	public String sing() {
		System.out.println("Quack, quack");
		return "Quack, quack";
	}

}
