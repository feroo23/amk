package Statistische;

import oop.AMK;

public class Varianz {

	public static void  main(String[] args) {
		System.out.println("Die werte Lauten");
		System.out.println("8,7,9,10, und 6");
		double[] werte = new double[5+1];
		double wert = 0;
		werte[0] = 8;
		werte[1] = 7;
		werte[2] = 9;
		werte[3] = 10;
		werte[4] = 6;
		werte[5] = 0;

		for (int i = 0; i < werte.length; i++) {
			wert= werte[i] + werte[i+1]; 
			System.out.println(wert);
		}
		wert = wert / 5 ;
		System.out.println(wert);
	}
}
