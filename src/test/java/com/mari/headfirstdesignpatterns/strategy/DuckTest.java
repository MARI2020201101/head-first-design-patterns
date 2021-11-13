package com.mari.headfirstdesignpatterns.strategy;

import com.mari.headfirstdesignpatterns.strategy.impl.FlyWithRocket;
import com.mari.headfirstdesignpatterns.strategy.impl.Quack;
import com.mari.headfirstdesignpatterns.strategy.impl.RedheadDuck;
import org.junit.jupiter.api.Test;

public class DuckTest {

    @Test
    public void redheadDuckTest() throws Exception {
        RedheadDuck redheadDuck = new RedheadDuck("삐약");
        redheadDuck.fly();
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.display();

        RedheadDuck redheadDuck2 = new RedheadDuck("뀨뀨", new Quack(5), new FlyWithRocket(100));
        redheadDuck2.fly();
        redheadDuck2.quack();
        redheadDuck2.swim();
        redheadDuck2.display();
    }

}
