/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.strategy;

import designpatternpractice.strategy.quack.SimpleQuack;
import designpatternpractice.strategy.fly.FlyNoWay;

/**
 *
 * @author w
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
        super.setFlyBehaviour(new FlyNoWay());
	super.setQuackBehaviour(new SimpleQuack());
    }
    
    public ModelDuck(FlyBehaviour flyBehavior, QuackBehaviour quackBehaviour) {
        super(flyBehavior, quackBehaviour);
    }
    
    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
