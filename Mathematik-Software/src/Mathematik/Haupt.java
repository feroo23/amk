package Mathematik;

import java.io.IOException;

import oop.AMK;
import oop.IO;
import wachstumsBzwZerfallsprozesse.Zerfallsprozesse;

public class Haupt {

	public static void main(String[] args) throws IOException, InterruptedException{
		AMK();
	}
	public static void AMK() throws IOException, InterruptedException {
		System.out.println("W�hlen sie aus ");
		System.out.println(" ");
		System.out.println(" =================================================");
		System.out.println("||						 ||");
		System.out.println("||[W] Wachstums- bzw. Zerfallsprozesse		 ||");
		System.out.println("||[S] f�r Statistische Auswertungen 		 ||");
		System.out.println("||[V] F�r Vektorrechnung (1-dimensional)	 ||");
		System.out.println("||[M] F�r Matrizenrechnung (2-dimensional)	 ||");
		System.out.println("||[B] F�r Benden				 ||");
		System.out.println("||						 ||");
		System.out.println(" =================================================");
		System.out.println(" ");

		String eingabe = IO.readString();
		
		if (eingabe.equalsIgnoreCase("S")){
			StatistischeAuswertungen();
		}
		else if (eingabe.equalsIgnoreCase("W")) {
			Zerfallsprozesse();
		}
		else if (eingabe.equalsIgnoreCase("V")){
			Vektorrechnung();
		}
		else if (eingabe.equalsIgnoreCase("M")) {
			Matrizenrechnung();
		}
		else if (eingabe.equalsIgnoreCase("B")) {
			System.out.println("programm wurde beendet! ");
		}
		else {
			System.out.println("Versuche es nochmal deine Auswahl an buchstaben siehst du hier [] drinnen ");	
			AMK();
		}
	}

	
	
	public static void Zerfallsprozesse() throws IOException {
		System.out.println(" ");
		System.out.println(" =================================================");
		System.out.println("||						 ||");
		System.out.println("||Zerfallsprozesse: 				 ||");
		System.out.println("||						 ||");
		System.out.println("||[A] F�r wachstum 				 ||");
		System.out.println("||[B] F�r zerfall   				 ||");
		System.out.println("||[Z] F�r Benden				 ||");
		System.out.println("||						 ||");
		System.out.println(" =================================================");

		String eingabe = IO.readString();

		if(eingabe.equalsIgnoreCase("a")) {
			Zerfallsprozesse.wachstum();
		}
		else if (eingabe.equalsIgnoreCase("b")) {
			Zerfallsprozesse.zerfall();
		}
		else if (eingabe.equalsIgnoreCase("z")) {
			System.out.println("Das Programm wurde beendet! ");
		}
		else {
			System.out.println("Versuche es nochmal deine Auswahl an buchstaben siehst du hier [] drinnen ");	
			Zerfallsprozesse();
		}
	}


	private static void quadratischerGleichunge() throws IOException {
		System.out.println(" ");
		System.out.println(" =================================================");
		System.out.println("||						 ||");
		System.out.println("||Quadratischer Gleichunge:				||");
		System.out.println("||						 ||");


	}


	private static void StatistischeAuswertungen() throws IOException, InterruptedException {


		System.out.println(" ");
		System.out.println(" =================================================");
		System.out.println("||						 ||");
		System.out.println("||Statistische Auswertungen:			 ||");
		System.out.println("||						 ||");
		System.out.println("||[A] F�r Max- Minimum				 ||");
		System.out.println("||[B] F�r Spannweite				 ||");
		System.out.println("||[C] F�r max- minimum Abweichung zweier	 ||");
		System.out.println("||    benachbarter Messwerte		  	 ||");
		System.out.println("||[D] F�r Mittelberechnung(arithm;Geometrisches) ||");
		System.out.println("||[E] F�r Median				 ||");
		System.out.println("||[F] F�r Modalwert 				 ||");
		System.out.println("||[G] F�r Varianz				 ||");
		System.out.println("||[H] F�r Standardabweichung			 ||");
		System.out.println("||[Z] F�r Benden				 ||");
		System.out.println("||						 ||");
		System.out.println(" =================================================");
		System.out.println(" ");
		System.out.println(" ");
		String eingabeS = IO.readString();
		//1.1
		if(eingabeS.equalsIgnoreCase("A")) {
			System.out.println("Wie viele werte wollen sie eingeben? ");
			int eins = IO.readInteger();
			int[] an = AMK.arrErstellenint(eins);
			double[] ergebnissA = AMK.minMax(an);

			System.out.println("Das Maximum betr�gt: " + ergebnissA[0] );
			System.out.println("Das Minimum betr�gt: " + ergebnissA[1] );
			System.out.println(" ");
			System.out.println(" =================================================");
			System.out.println("||[A] F�r Wollen sie andre rechnungen machen?	 ||");
			System.out.println("||[B] F�r Durschnitt berechnen  		 ||");
			System.out.println("||[Z] F�r Benden 				 ||");
			String eingabe = IO.readString();
			
			if (eingabe.equalsIgnoreCase("A")) {
				AMK();
			}
			else if (eingabe.equalsIgnoreCase("b")) {
				double summe = 0;
				for (int i = 0; i <= eins; i++) {
					summe += an[i];
				}
				double ergebnis = summe/eins;
				String.format("%.3f", ergebnis);
				System.out.println("Der Durschnitt betr�gt " + ergebnis);
			}
			
		}
		//1.2
		else if(eingabeS.equalsIgnoreCase("B")) {
			System.out.println("Geben sie ihren Kleinsten Wert ein ");
			int eins = IO.readInteger();
			System.out.println("Geben sie ihrern Gr��ten Wert ein");
			int zwei = IO.readInteger();
			
			int ergbnis = AMK.spannweite(eins,zwei);
			
			System.out.println("Die Spannweite von " + eins + " und " + zwei + " betr�gt " + ergbnis);
			AMK.weiter();
		}
		//1.3
		else if (eingabeS.equalsIgnoreCase("C")) {
			System.out.println("Wollen sie min- maximale abweichung");
			String a = IO.readString();
			if(a.equalsIgnoreCase("max") || a.equalsIgnoreCase("maximale")) {
				int zwei = eingabe();
				double[] eingabe =AMK.arrErstellendouble(zwei);
				double ergebnis= AMK.maxAbweichung(eingabe);
				
			}
			else if (a.equalsIgnoreCase("maximale abweichung")) {
				int zwei = eingabe();
				double[] eingabe =AMK.arrErstellendouble(zwei);
				double ergebnis= AMK.maxAbweichung(eingabe);
				
			}
			else if (a.equalsIgnoreCase("min") || a.equalsIgnoreCase("minimale abweichung")) {
				int zwei = eingabe();
				double[] eingabe = AMK.arrErstellendouble(zwei);
				double ergbnis = AMK.minAbweichung(eingabe); 
			}
			
			
			
			
		}
		//1.4
		else if (eingabeS.equalsIgnoreCase("D")) {
		
			System.out.println(" ");
			System.out.println(" =================================================");
			System.out.println("||						 ||");
			System.out.println("||Mittelberechnung:			 ||");
			System.out.println("||						 ||");
			System.out.println("||[A] F�r Arithmetisches mittel 		 ||");
			System.out.println("||[B] F�r Geometrisches mittel			 ||");
			System.out.println("||[Z] F�r Benden				 ||");
			System.out.println("||						 ||");
			System.out.println(" =================================================");
			System.out.println(" ");

			String D = IO.readString();

			if (D.equalsIgnoreCase("a")){
				int eins = eingabe();
				int[] anz = AMK.arrErstellenint(eins);
				double ergebniss = AMK.mittelwert(anz);
				System.out.println("Der arithmetisches mittel betr�gt " + ergebniss);
			}
			else if (D.equalsIgnoreCase("b")) {

			}
			else if (D.equalsIgnoreCase("z")) {
				System.out.println("programm wurde beendet! ");
				
			}
			else {
				System.out.println("Versuche es nochmal deine Auswahl an buchstaben siehst du hier [] drinnen ");
				
			}
			
		}
		//1.5
		else if (eingabeS.equalsIgnoreCase("E")) {
			int eins = eingabe();
			double ergbnis = AMK.Median(eins);
			System.out.println(ergbnis);
		}
		//1.6
		else if (eingabeS.equalsIgnoreCase("F")) {
			int eins =eingabe();
			int[] anz = AMK.arrErstellenint(eins);
			double[] ergebnis = AMK.Modalwert(anz);
			System.out.println(ergebnis);
				
		}
		//1.7
		else if (eingabeS.equalsIgnoreCase("G")) {
			double[] eins = einga();
			double zwei = AMK.Varianz(eins);
		System.out.println("Die Varianz betr�gt" + zwei);
		
		}
		//1.8
		else if (eingabeS.equalsIgnoreCase("H")) {
			int eins =eingabe();
			AMK.Standardabweichung();
		}
		//1.8
		else if (eingabeS.equalsIgnoreCase("Z")) {
			System.out.println("programm wurde beendet! ");
		}
		//1.9
		else {
			System.out.println("Versuche es nochmal deine Auswahl an buchstaben siehst du hier [] drinnen ");
			StatistischeAuswertungen();
		}


	}

	
	public static int eingabe() {
		System.out.println("Wie viele werten wollen se eingeben ");
		int eingabe = IO.readInteger();
		return eingabe;
	}


	private static void Vektorrechnung() throws IOException {

		System.out.println(" ");
		System.out.println(" =================================================");
		System.out.println("||						 ||");
		System.out.println("||Vektorrechnung: (1-dimensional)		 ||");
		System.out.println("||						 ||");
		System.out.println("||[A]Multiplikation mit einer Zahl 		 ||");
		System.out.println("||[B]Addition zweier Vektoren			 ||");
		System.out.println("||[C]Multiplikation zweier Vektoren 		 ||");
		System.out.println("||[Z] F�r Benden				 ||");
		System.out.println("||						 ||");
		System.out.println(" =================================================");

		String vek = IO.readString();

		if(vek.equalsIgnoreCase("a")) {
			AMK.MultiplikationMitEinerZahl();
		}
		else if (vek.equalsIgnoreCase("b")) {
			AMK.AdditionZweierVektoren();
		}
		else if (vek.equalsIgnoreCase("c")) {
			AMK.MUltiplikationZweierVektoren();
		}
		else if (vek.equalsIgnoreCase("z")) {
			System.out.println("programm wurde beendet! ");
		}
		else {
			System.out.println("Versuche es nochmal deine Auswahl an buchstaben siehst du hier [] drinnen ");
			Vektorrechnung();
		}
	}

	private static void Matrizenrechnung() throws IOException {
		System.out.println(" ");
		System.out.println(" =================================================");
		System.out.println("||						 ||");
		System.out.println("||Matrizenrechnung:(2-dimensional)		 ||");
		System.out.println("||						 ||");
		System.out.println("||[A]Multiplikation mit einer Zahl		 ||");
		System.out.println("||[B]Addition zweier Matrizen			 ||");
		System.out.println("||[C]Multiplikation zweier Matrizen		 ||");
		System.out.println("||[Z] F�r Benden				 ||");
		System.out.println("||						 ||");
		System.out.println(" =================================================");
		System.out.println(" ");

		String mat = IO.readString();

		if (mat.equalsIgnoreCase("a")) {
			AMK.MultiplikationMitEinerZahl2D();
		}
		else if (mat.equalsIgnoreCase("B")) {
			AMK.AdditionZweierVektoren2D();
		}
		else if (mat.equalsIgnoreCase("C")) {
			AMK.MUltiplikationZweierVektoren2D();
		}
		else if (mat.equalsIgnoreCase("z")) {
			System.out.println("programm wurde beendet! ");
		}
		else {
			System.out.println("Versuche es nochmal deine Auswahl an buchstaben siehst du hier [] drinnen ");
			Matrizenrechnung();
		}
	}

}