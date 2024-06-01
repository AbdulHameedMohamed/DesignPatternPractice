/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.command;

/**
 *
 * @author w
 */
public class GarageDoor {

    public GarageDoor() {
    }

    public void up() {
        System.out.println("Garage Door is Open");
    }

    public void down() {
        System.out.println("Garage Door is Closed");
    }

    public void stop() {
        System.out.println("Garage Door is Stopped");
    }

    public void lightOn() {
        System.out.println("Garage light is on");
    }

    public void lightOff() {
        System.out.println("Garage light is off");
    }
}
