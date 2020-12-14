package wachstumsBzwZerfallsprozesse;

import oop.IO;

public class Zerfallsprozesse {

	public static void Zerfall() {
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
		System.out.println(produkt);


	}
}
