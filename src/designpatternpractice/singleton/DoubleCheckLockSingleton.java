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
public class DoubleCheckLockSingleton {

    private volatile static DoubleCheckLockSingleton uniqueInstance;

    private DoubleCheckLockSingleton() {
    }

    public static DoubleCheckLockSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckLockSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
