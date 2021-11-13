package com.mari.headfirstdesignpatterns.strategy.impl;

import com.mari.headfirstdesignpatterns.strategy.QuackBehavior;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Quack implements QuackBehavior {

    private int quackCount;
    @Override
    public void quack() {
        for (int i = 0; i < quackCount; i++) {
            System.out.println("quack quack");
        }
    }
}
