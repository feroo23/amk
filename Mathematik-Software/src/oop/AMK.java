package oop;

import java.io.IOException;

import Mathematik.Haupt;

public class AMK {

	public static void main(String args) {

	}


	public static double[] minMax(double testA) {
		double [] tage = new double [(int) testA];
		double summe = 0;
		double max;
		double min;
		for (int i = 0; i < tage.length; i++) {
			System.out.print("geben wert " + (i + 1) +": ");
			tage [i] = IO.readDouble();
			summe += tage [i];
		}
		max = tage[0];
		min = tage[0];
		for (int i = 1; i < tage.length; i++) {
			if (max < tage[i]) {
				max = tage[i];
				for (int j = 1; j < tage.length; j++) {
					if (min > tage[j]) {
						min = tage[j];
					}
				}
			}

			double [] end = new double [2];
			end [0] = max;
			end [1] = min;

		}
		return end;

	}
	public static double mittelwert(double eins) {
		double [] tage = new double [(int) eins];
		double summe = 0;
		for (int i = 0; i < tage.length; i++) {
			System.out.print("geben wert " + (i + 1) +": ");
			tage [i] = IO.readDouble();
			summe += tage [i];
		}

		double ergebnis = summe/eins;
		String.format("%.3f", ergebnis);
		System.out.println(ergebnis);

		return ergebnis;

	}


	public static int spannweite(int eins, int zwei) {
		int sum = eins-zwei;
		sum = sum * -1;

		return sum;

	}
	public static void weiter() throws IOException {
		System.out.println("Wollen sie wietrer rechnngen machen? ");
		String eingabe = IO.readString();

		if(eingabe.equalsIgnoreCase("ja") || eingabe.equalsIgnoreCase("ye")) {
			Haupt.AMK();
		}
		else if (eingabe.equalsIgnoreCase("nein") || eingabe.equalsIgnoreCase("no")) {
			System.out.println("Das Programm wurde bendedt");
		}
		else {
			System.out.println("Hmmmmmmm ich Weiß zwar nicht was das bedeutet aber ich denke mal ");
			System.out.println("das es dir gefallen hat deshaöhb starte ich das neu ");
			System.out.println("Tipp:");
			System.out.println("Probier das nächste mal mit ja/nein yes/no");
			System.out.println("dann klappt es so wie du möchtest");
			Haupt.AMK();
		}
	}


	public static void MultiplikationMitEinerZahl() {
		// TODO Auto-generated method stub
		
	}


	public static void AdditionZweierVektoren() {
		// TODO Auto-generated method stub
		
	}


	public static void MUltiplikationZweierVektoren() {
		// TODO Auto-generated method stub
		
	}


	public static void MultiplikationMitEinerZahl2D() {
		// TODO Auto-generated method stub
		
	}


	public static void AdditionZweierVektoren2D() {
		// TODO Auto-generated method stub
		
	}


	public static void MUltiplikationZweierVektoren2D() {
		// TODO Auto-generated method stub
		
	}


	public static double Median(int eins) {
		// TODO Auto-generated method stub
		return 0;
	}


	public static void Modalwert() {
		// TODO Auto-generated method stub
		
	}


	public static void Varianz() {
		// TODO Auto-generated method stub
		
	}


	public static void Standardabweichung() {
		// TODO Auto-generated method stub
		
	}

}

