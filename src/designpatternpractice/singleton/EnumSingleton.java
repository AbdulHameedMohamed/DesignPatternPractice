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
public enum EnumSingleton {
    UNIQUE_INSTANCE;

    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
