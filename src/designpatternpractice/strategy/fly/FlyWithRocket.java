/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.strategy.fly;

import designpatternpractice.strategy.FlyBehaviour;

/**
 *
 * @author w
 */
public class FlyWithRocket implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm Flying With A Rocket");
    }
}