/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.strategy.phone_strategy.share;

import designpatternpractice.strategy.phone_strategy.ShareStrategy;

/**
 *
 * @author w
 */
public class Social implements ShareStrategy {
    public void share() {
        System.out.println("I'm posting the photo on social media");
    }
}
