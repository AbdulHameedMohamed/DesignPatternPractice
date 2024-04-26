/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.strategy.phone_strategy;

import designpatternpractice.strategy.phone_strategy.phone.BasicCameraApp;
import designpatternpractice.strategy.phone_strategy.share.Email;
import designpatternpractice.strategy.phone_strategy.share.Text;
import designpatternpractice.strategy.phone_strategy.share.Social;
import java.util.Scanner;

/**
 *
 * @author w
 */
public class PhotoWithPhone {

    public static void main(String[] args) {

        PhoneCameraApp cameraApp = new BasicCameraApp();
        String share = getSharing();
        switch (share) {
            case ("t"):
                cameraApp.setShareStrategy(new Text());
                break;
            case ("e"):
                cameraApp.setShareStrategy(new Email());
                break;
            case ("s"):
                cameraApp.setShareStrategy(new Social());
                break;
            default:
                cameraApp.setShareStrategy(new Email());
        }
        cameraApp.take();
        cameraApp.edit();
        cameraApp.save();
        cameraApp.share();
    }

    public static String getSharing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Share with text (t), email (e), or social media (s)?");
        String appName = scanner.next();
        scanner.close();
        return appName;
    }
}
