package oop;

import java.io.IOException;

import Mathematik.Haupt;

public class AMK {

	public static void main(String args) {

	}


	public static double[] minMax(int[] an) {
		double [] tage = new double [an];
		double summe = 0;
		double max;
		double min;
		for (int i = 0; i < tage.length; i++) {
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
		}
		double [] end = new double [2];
		end [0] = max;
		end [1] = min;

		return end;

	}
	public static double mittelwert(int[] anz) {
		double [] sum = new double [(double) anz];
		double summe = 0;
		for (int i = 0; i < sum.length; i++) {
			summe += sum [i];
		}

		double ergebnis = summe / anz;
		String.format("%.3f", ergebnis);

		return ergebnis;

	}


	public static int spannweite(int eins, int zwei) {
		int sum = eins-zwei;
		sum = sum * -1;

		return sum;

	}

	public static void weiter() throws IOException, InterruptedException {
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

	public static int[] arrErstellen(int eins){
		int[] anz = new int[ eins];
		double summe = 0;
		for (int i = 0; i < anz.length; i++) {
			System.out.print("geben sie den wert " + (i + 1) + " ein: ");
			anz [i] = IO.readInteger();
			summe += anz [i];
		}
		return anz;
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


	public static double Median(double [] eins) {

		if (eins.length % 2 == 0) {
			return (eins[(eins.length/2 - 1)] + eins[(eins.length/2)]) / 2;
		} else {
			return eins[(((eins.length + 1) / 2) - 1)];
		}

	}


	public static double Modalwert(double[] anz) {

		double mode = 0;

		for (int j = 0; j < anz.length + 1; j++) {
			for (int i = 0; i < anz.length - 1; i++) {
				if (anz[i] > anz[i + 1]) {
					double sum = anz[i];
					anz[i] = anz[i + 1];
					anz[i + 1] = sum;
				}
			}
		}
		double max = 0;
		for (double v : anz) {
			int a = 0;
			for (double o : anz) {
				if (o == v) {
					++a;
				}
			}
			if (a > max) {
				max = a;
				mode = v;
			}
		}
		return mode;
	}




	public static double Varianz(double[] eins) {

		double varianz = 0;
		double Arm = 0;
		double Ergebnis;

		for (double value : eins) {
			Arm += value;
		}
		Arm = Arm / eins.length;

		for (double v : eins) {
			varianz += (v - Arm) * (v - Arm);
		}
		Ergebnis = varianz / eins.length;

		String.format("%.3f", Ergebnis);
		return Ergebnis;
	}


	public static void Standardabweichung() {
		// TODO Auto-generated method stub

	}

}

