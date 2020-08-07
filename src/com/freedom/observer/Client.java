package com.freedom.observer;

/**
 * @author baijianliang
 * @date 2019/12/9
 * @description
 */
public class Client {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions(weatherData);
        BaiduSite baiduSite = new BaiduSite(weatherData);

        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        weatherData.setData(25, 75, 40);

        System.out.println("---------------------------------------------");
        weatherData.removeObserver(currentConditions);
        weatherData.setData(30, 80, 45);
    }
}