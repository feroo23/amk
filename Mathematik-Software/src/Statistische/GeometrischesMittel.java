package Statistische;

import oop.IO;

public class GeometrischesMittel {

	public static void main(String[] args) {
		System.out.println("Geben sie die anzahl der Daten an, die sie benutzen für die geometrische Funtkion");
		int n = IO.readInteger();


		double [] geo = new double [n];


		for (int i = 0; i < geo.length; i++) {
			geo[i] = IO.readDouble();
		}

		double produkt = 1;

		for (int i = 0; i < geo.length; i++) {
			produkt = produkt * geo[i];
		}


		produkt = Math.pow(Math.E, Math.log(produkt)/n);
		produkt = Math.round(100.0 * produkt) / 100.0;
		System.out.println(produkt);
	}
}


