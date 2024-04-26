/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.strategy.duck_strategy;

/**
 *
 * @author w
 */
public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;
    
    public Duck() {
    }
    
    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        setFlyBehaviour(flyBehaviour);
        setQuackBehaviour(quackBehaviour);
    }
    
    public final void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
    
    public final void setQuackBehaviour (QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
    
    protected abstract void display();
    
    public void fly() {
        flyBehaviour.fly();
    }
    
    public void quack() {
        quackBehaviour.quack();
    }
    
    public void swim() {
        System.out.println("All Ducks Float");
    }
}