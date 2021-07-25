package com.robert.animal.pojo;

import com.robert.animal.flyable.Flyable;
import com.robert.animal.walkable.WalkAction;

public class Bird extends Animal {

	protected Flyable flyable;

	public Bird() {
		this.walkble = new WalkAction();
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	public Flyable getFlyable() {
		return flyable;
	}
	
	public String sing() {
		return this.singable.sing();
	}

	public String swim() {
		return this.swimmable.swim();
	}

	public String fly() {
		return this.flyable.fly();
	}
}

