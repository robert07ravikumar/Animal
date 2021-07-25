package com.robert.animal.swimmable;

public class NoSwimAction implements Swimmable {

	@Override
	public String swim() {
		// Can't swim
		return null;
	}

}
