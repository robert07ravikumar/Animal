package com.robert.animal.flyable;

public class FlyAction implements Flyable {

	@Override
	public String fly() {
		System.out.println("I am flying..");
        return null;
    }

}
