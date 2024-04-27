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
public class WeatherStation {

    public static void main(String[] args) {
        Weather weatherData = new Weather();

        CurrentConditionsDisplay currentDisplay
                = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(new WeatherData(80, 65, 30.4f));
        System.out.println();
        weatherData.setMeasurements(new WeatherData(82, 70, 29.2f));
        System.out.println();
        weatherData.setMeasurements(new WeatherData(78, 90, 29.2f));

        weatherData.removeObserver(forecastDisplay);
        System.out.println();
        weatherData.setMeasurements(new WeatherData(62, 90, 28.1f));
    }
}
