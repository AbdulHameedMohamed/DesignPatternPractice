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
public class ClassicSingleton {

    private static ClassicSingleton uniqueInstance;

    private ClassicSingleton() {
    }

    public static ClassicSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ClassicSingleton();
        }
        return uniqueInstance;
    }

    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}
