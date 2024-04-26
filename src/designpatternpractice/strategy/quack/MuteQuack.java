/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.strategy.quack;

import designpatternpractice.strategy.QuackBehaviour;

/**
 *
 * @author w
 */
public class MuteQuack implements QuackBehaviour {
    
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
