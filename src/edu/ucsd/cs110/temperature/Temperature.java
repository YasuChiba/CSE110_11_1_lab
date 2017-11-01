package edu.ucsd.cs110.temperature;

/**
 * Created by YasuhiraChiba on 2017/11/01.
 */
public abstract class Temperature {

    private float value;

    public Temperature(float v) {
        value = v;
    }
    public final float getValue() {
        return value;
    }

    public abstract Temperature toCelsius();
    public abstract Temperature toFahrenheit();
}