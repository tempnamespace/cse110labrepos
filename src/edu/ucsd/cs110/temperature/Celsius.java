package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(this.getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        float result = 0;
        result = (this.getValue()* 9) / 5;
        result = result + 32;
        Temperature finished = new Fahrenheit(result);
        return finished;
    }

    public String toString()
    {
        String desired = "";
        desired = desired + this.getValue() + " C";
        return desired;
    }
}