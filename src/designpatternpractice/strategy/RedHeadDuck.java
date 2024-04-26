/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.strategy;

import designpatternpractice.strategy.quack.SimpleQuack;
import designpatternpractice.strategy.fly.FlyWithWings;

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
    void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
