/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.strategy.duck_strategy.quack;

import designpatternpractice.strategy.duck_strategy.QuackBehaviour;

/**
 *
 * @author w
 */
public class FakeQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<< Fake Quack >>");
    }
}
