package edu.cnm.deepdive.temperature;

public class Converter {
               //output        //name     //input parameter
  public static double celsiusToFahrenheit(double celsius) {
   return 9.0 / 5.0 * celsius + 32;
    
    
  }
  public static double fahrenheitToCelsius(double fahrenheit) {
    double celsius = 5 * (fahrenheit - 32) / 9;
    return celsius;
  }
}
