/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.strategy.phone_strategy.phone;

import designpatternpractice.strategy.phone_strategy.PhoneCameraApp;

/**
 *
 * @author w
 */
public class BasicCameraApp extends PhoneCameraApp {
    @Override
    public void edit() {
	System.out.println("Basic editing features");
    }
}