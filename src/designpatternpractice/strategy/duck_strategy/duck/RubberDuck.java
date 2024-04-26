/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.strategy.duck_strategy.duck;

import designpatternpractice.strategy.duck_strategy.Duck;
import designpatternpractice.strategy.duck_strategy.FlyBehaviour;
import designpatternpractice.strategy.duck_strategy.QuackBehaviour;
import designpatternpractice.strategy.duck_strategy.fly.FlyNoWay;

/**
 *
 * @author w
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super.setFlyBehaviour(new FlyNoWay());
	//setQuackBehaviour(new SqueakQuack());        
	super.setQuackBehaviour(() -> System.out.println("Squeak"));
    }
    
    public RubberDuck(FlyBehaviour flyBehavior, QuackBehaviour quackBehaviour) {
        super(flyBehavior, quackBehaviour);
    }
    
    @Override
    protected void display() {
        System.out.println("I'm a rubber duckie");
    }
}