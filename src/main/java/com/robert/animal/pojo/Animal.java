package com.robert.animal.pojo;

import com.robert.animal.singable.Singable;
import com.robert.animal.swimmable.Swimmable;
import com.robert.animal.walkable.Walkble;

public class Animal {

	protected Walkble walkble;
	protected Singable singable;
	protected Swimmable swimmable;

	public Walkble getWalkble() {
		return walkble;
	}

	public void setWalkble(Walkble walkble) {
		this.walkble = walkble;
	}

	public Swimmable getSwimmable() {
		return swimmable;
	}

	public void setSingable(Singable singable) {
		this.singable = singable;
	}

	public void setSwimmable(Swimmable swimmable) {
		this.swimmable = swimmable;
	}

	public Singable getSingable() {
		return singable;
	}

	public String walk() {
		return this.walkble.walk();
	}
}