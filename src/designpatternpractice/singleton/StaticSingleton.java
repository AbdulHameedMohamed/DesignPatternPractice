/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.singleton;

/**
 *
 * @author w
 */
public class StaticSingleton {

    private static final StaticSingleton uniqueInstance = new StaticSingleton();

    private StaticSingleton() {
    }

    public static StaticSingleton getInstance() {
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a statically initialized Singleton!";
    }
}
