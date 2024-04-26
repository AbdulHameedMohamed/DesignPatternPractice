/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.strategy;

import designpatternpractice.strategy.quack.MuteQuack;
import designpatternpractice.strategy.fly.FlyNoWay;

/**
 *
 * @author w
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super.setFlyBehaviour(new FlyNoWay());
	super.setQuackBehaviour(new MuteQuack());
    }
    
    public DecoyDuck(FlyBehaviour flyBehavior, QuackBehaviour quackBehaviour) {
        super(flyBehavior, quackBehaviour);
    }
    
    @Override
    void display() {
        System.out.println("I'm a decoy duck");
    }
}