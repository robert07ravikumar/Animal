package com.robert.animal.pojo;

import com.robert.animal.swimmable.Swimmable;

public class Dolphin extends Animal implements Swimmable {

    @Override
    public String swim() {
        return this.swimmable.swim();
    }

}
