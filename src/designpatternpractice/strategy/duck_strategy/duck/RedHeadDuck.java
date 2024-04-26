/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.strategy.duck_strategy.duck;

import designpatternpractice.strategy.duck_strategy.Duck;
import designpatternpractice.strategy.duck_strategy.FlyBehaviour;
import designpatternpractice.strategy.duck_strategy.QuackBehaviour;
import designpatternpractice.strategy.duck_strategy.quack.SimpleQuack;
import designpatternpractice.strategy.duck_strategy.fly.FlyWithWings;

/**
 *
 * @author w
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super.setFlyBehaviour(new FlyWithWings());
	super.setQuackBehaviour(new SimpleQuack());
    }
    
    public RedHeadDuck(FlyBehaviour flyBehavior, QuackBehaviour quackBehaviour) {
        super(flyBehavior, quackBehaviour);
    }
    
    @Override
    protected void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
