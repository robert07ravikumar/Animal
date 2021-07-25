package com.robert.animal.pojo;

import com.robert.animal.singable.Singable;
import com.robert.animal.walkable.Walkble;

public class Rooster extends Animal implements Singable, Walkble {
    public Singable singable;

    public void setSingable(Singable singable) {
        this.singable = singable;
    }

    @Override
    public String sing() {
        return this.singable.sing();

    }
}
