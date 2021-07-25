package com.robert.animal.pojo;

import com.robert.animal.flyable.Flyable;
import com.robert.animal.walkable.Walkble;

public class Butterfly extends Animal implements Flyable, Walkble {

	private Flyable flyable;

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	@Override
	public String fly() {
		this.flyable.fly();

        return null;
    }

	@Override
	public String walk() {
		return this.walkble.walk();
	}

}
