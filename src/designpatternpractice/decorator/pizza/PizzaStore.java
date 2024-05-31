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
public class PizzaStore {

    public static void main(String args[]) {
        Pizza pizza = new ThincrustPizza();
        Pizza cheesePizza = new Cheese(pizza);
        Pizza greekPizza = new Olives(cheesePizza);

        System.out.println(greekPizza.getDescription()
                + " $" + greekPizza.cost());

    }
}
