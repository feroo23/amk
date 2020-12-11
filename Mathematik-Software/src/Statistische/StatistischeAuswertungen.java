package Statistische;

import java.io.IOException;

import oop.IO;

public class StatistischeAuswertungen {

	public static void main(String[] args) throws IOException {
		System.out.print("Wie viele werte Möchten sie auswerten ");
		int anzahl = IO.readInteger();

		double [] tage = new double [anzahl];
		double summe = 0;
		double max;
		double min;
		for (int i = 0; i < tage.length; i++) {
			System.out.print("geben wert " + (i + 1) +": ");
			tage [i] = IO.readDouble();
			summe += tage [i];
		}

		max = tage[0];
		for (int i = 1; i < tage.length; i++) {
			if (max < tage[i]) {
				max = tage[i];
			}
		}

		min = tage [0];
		for (int i = 1; i < tage.length; i++) {
			if (min > tage[i]) {
				min = tage[i];
			}
		}

		double mittelwert = summe / tage.length;
		mittelwert = Math.round(100.0 * mittelwert) / 100.0;
	//	System.out.println("Der durchschnitt beträgt " + mittelwert);
		System.out.println("Das Maximum beträgt: " + max );
		System.out.println("Das minimum beträgt: " + min );
	}
}

	

