package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float result = this.getValue();
        result -= 32;
        result = (result * 5)/ 9;

        Temperature finished = new Celsius(result);
        return finished;
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.getValue());
    }

    public String toString()
    {
        String desired = "";
        desired = desired + this.getValue() + " F";
        return desired;
    }
}
