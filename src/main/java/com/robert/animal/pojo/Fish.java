package com.robert.animal.pojo;

import com.robert.animal.swimmable.SwimAction;
import com.robert.animal.swimmable.Swimmable;

public abstract class Fish extends Animal implements Swimmable {

	Fish() {
		this.swimmable = new SwimAction();
	}
	
	@Override
	public String swim() {
		return this.swimmable.swim();
		
	}
	public abstract void genre();
}

