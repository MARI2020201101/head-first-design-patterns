package com.mari.headfirstdesignpatterns.strategy.impl;

import com.mari.headfirstdesignpatterns.strategy.Duck;
import com.mari.headfirstdesignpatterns.strategy.FlyBehavior;
import com.mari.headfirstdesignpatterns.strategy.QuackBehavior;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RedheadDuck extends Duck {

    public RedheadDuck(String name){
        this.setName(name);
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack(3));
    }

    public RedheadDuck(String name, QuackBehavior quackBehavior , FlyBehavior flyBehavior){
        this.setName(name);
        this.setFlyBehavior(flyBehavior);
        this.setQuackBehavior(quackBehavior);
    }
}
