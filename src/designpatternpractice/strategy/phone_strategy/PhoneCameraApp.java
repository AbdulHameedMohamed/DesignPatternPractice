/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.strategy.phone_strategy;

/**
 *
 * @author w
 */
public abstract class PhoneCameraApp {

    ShareStrategy shareStrategy;

    public PhoneCameraApp() {
        
    }
    public PhoneCameraApp(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }
    
    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    public void share() {
        shareStrategy.share();
    }

    public void take() {
        System.out.println("Taking the photo");
    }

    public void save() {
        System.out.println("Saving the photo");
    }

    public abstract void edit();
}