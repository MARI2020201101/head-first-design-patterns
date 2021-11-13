package com.mari.headfirstdesignpatterns.strategy.impl;

import com.mari.headfirstdesignpatterns.strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i can fly with my wings!!!!");
    }
}
