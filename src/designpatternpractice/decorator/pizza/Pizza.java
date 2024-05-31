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
public abstract class Pizza {

    String description = "Basic Pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
