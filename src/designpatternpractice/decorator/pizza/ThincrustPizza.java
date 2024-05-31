/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.decorator.pizza;

/**
 *
 * @author w
 */
public class ThincrustPizza extends Pizza {

    public ThincrustPizza() {
        description = "Thin crust pizza, with tomato sauce";
    }

    public double cost() {
        return 7.99;
    }
}
