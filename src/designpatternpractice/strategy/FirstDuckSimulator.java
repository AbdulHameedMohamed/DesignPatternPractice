/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.strategy;

import designpatternpractice.strategy.quack.MuteQuack;
import designpatternpractice.strategy.quack.SqueakQuack;
import designpatternpractice.strategy.fly.FlyWithWings;
import designpatternpractice.strategy.fly.FlyWithRocket;
import designpatternpractice.strategy.fly.FlyNoWay;

/**
 *
 * @author w
 */
public class FirstDuckSimulator {
    public static void main(String[] args) {
 
	MallardDuck mallard = new MallardDuck();
	FlyBehaviour cantFly = new FlyNoWay();
        
        FlyBehaviour flyWithWings = new FlyWithWings();
	QuackBehaviour squeak = new SqueakQuack();
        QuackBehaviour muteQuack = new MuteQuack();
	
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
	DecoyDuck decoy = new DecoyDuck(flyWithWings, muteQuack);
 
	Duck model = new ModelDuck();

	mallard.quack();
	rubberDuckie.quack();
	decoy.quack();
   
	model.fly();
	model.setFlyBehaviour(new FlyWithRocket());
        model.setQuackBehaviour(squeak);
	model.fly();
        model.quack();
    }
}
