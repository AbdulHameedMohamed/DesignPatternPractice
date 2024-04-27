/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternpractice.observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author w
 */
public class Weather implements Observable {

    private final List<Observer> observers;
    private WeatherData weatherData;
    
    {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach((observer) -> {
            observer.update(weatherData);
        });
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(WeatherData weatherData) {
        this.weatherData = weatherData;
        measurementsChanged();
    }
}