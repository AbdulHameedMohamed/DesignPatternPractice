package designpatternpractice.strategy.quack;

import designpatternpractice.strategy.QuackBehaviour;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w
 */
public class SimpleQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
