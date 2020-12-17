package wachstumsBzwZerfallsprozesse;

import oop.IO;

public class Zerfallsprozesse {

	public static void wachstum() {
		System.out.println("Geben sie die Startmenge an");
		double startmenge = IO.readDouble();

		System.out.println("Geben sie den Faktor ein um den sie täglich erhöhen wollen");
		double faktor = IO.readDouble();

		System.out.println("Wieviele Werte wollen sie angezeigt bekommen");
		double tage = IO.readDouble();

		int starttag = 0;
		System.out.println("");
		System.out.println("Nummer\tWachstumswert");


		for (int i = 0; i <= tage; i++) {
			starttag = i;
			double ergebnis = startmenge * Math.pow(faktor, i);
			System.out.println(starttag + "\t" + ergebnis );
		}

	}

	public static void zerfall() {
		System.out.println("Geben sie die Startmenge an");
		double startmenge = IO.readDouble();
		System.out.println("Geben sie den Faktor ein");
		double faktor = IO.readDouble();
		System.out.println("Wieviele Wete wollen sie angezeigt bekommen");
		double tage = IO.readDouble();
		int starttag = 0;
		System.out.println("");
		System.out.println("Nummer\tZerfallswert");


		for (int i = 0; i <= tage; i++) {
			starttag = i;
			double ergebnis = startmenge * Math.pow(faktor, i);
			System.out.println(starttag + "\t" + ergebnis);			
		}
	}
}
