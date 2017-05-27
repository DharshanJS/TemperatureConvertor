package com.example.dharshan.temperatureconvertor;

/**
 * Created by Dharshan on 5/27/2017.
 */

public class ConvertorUtil {

    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    // converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }
}
