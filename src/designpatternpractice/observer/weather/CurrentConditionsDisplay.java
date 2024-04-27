/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.observer.weather;

/**
 *
 * @author w
 */
public class CurrentConditionsDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    // If You Need To Implement It With Push Then Pull
    // But In This Case We Implement It With Just Push With All Data Needed.
    // private final Weather weatherData;

    public CurrentConditionsDisplay(Weather weatherData) {
        //this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(WeatherData weatherData) {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}