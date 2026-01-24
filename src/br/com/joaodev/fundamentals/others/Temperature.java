package br.com.joaodev.fundamentals.others;

public class Temperature {
	
	public static void main(String[] args) {
		
		// (ºF - 32) x 5/9 = ºC
		final double FACTOR = 5.0 / 9.0;
		final double ADJUSTMENT = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - ADJUSTMENT) * FACTOR;
		System.out.println("The result is " + celsius + "ºC.");
		
		fahrenheit = 0;
		celsius = (fahrenheit - ADJUSTMENT) * FACTOR;
		System.out.println("The result is " + celsius + "ºC.");
	}
}
