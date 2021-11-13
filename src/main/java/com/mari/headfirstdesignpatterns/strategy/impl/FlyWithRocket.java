package com.mari.headfirstdesignpatterns.strategy.impl;

import com.mari.headfirstdesignpatterns.strategy.FlyBehavior;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlyWithRocket implements FlyBehavior {

    private int speed;

    @Override
    public void fly() {
        System.out.println("fly with Rocket speed " + speed);
    }


}
