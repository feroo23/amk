package Mathematik;

import java.io.IOException;

import Statistische.ferozh;
import oop.IO;
import wachstumsBzwZerfallsprozesse.Zerfallsprozesse;

public class Haupt {
	
	public static void main(String[] args) throws IOException {

		System.out.println("W�hlen sie aus ");
		System.out.println(" ");
		System.out.println(" =================================================");
		System.out.println("||						 ||");
		System.out.println("||[L] L�sung quadratischer Gleichungen		 ||");
		System.out.println("||[W] Wachstums- bzw. Zerfallsprozesse		 ||");
		System.out.println("||[S] f�r Statistische Auswertungen 		 ||");
		System.out.println("||[V] F�r Vektorrechnung (1-dimensional)	 ||");
		System.out.println("||[M] F�r Matrizenrechnung (2-dimensional)	 ||");
		System.out.println("||[B] F�r Benden				 ||");
		System.out.println("||						 ||");
		System.out.println(" =================================================");
		System.out.println(" ");

		String eingabe = IO.readString();

		if (eingabe.equalsIgnoreCase("s")){
			StatistischeAuswertungen();
		}
		else if (eingabe.equalsIgnoreCase("l")) {
			quadratischerGleichunge();
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
	
	}


	private static void quadratischerGleichunge() throws IOException {
		System.out.println(" ");
		System.out.println(" =================================================");
		System.out.println("||						 ||");
		System.out.println("||Quadratischer Gleichunge:				||");
		System.out.println("||						 ||");


	}


	private static void StatistischeAuswertungen() throws IOException {


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
			double anz = IO.readDouble();
			double testA = anz;
			
			double[] ergebnissA = ferozh .minMax(testA);
			
			System.out.println("Das Maximum betr�gt: " + ergebnissA[0] );
			System.out.println("Das Minimum betr�gt: " + ergebnissA[1] );
		}
		//1.2
		else if(eingabeS.equalsIgnoreCase("B")) {
			
		}
		//1.3
		else if (eingabeS.equalsIgnoreCase("C")) {

		}
		//1.4
		else if (eingabeS.equalsIgnoreCase("D")) {
			int eins = eingabe();
			
			
			
		}
		//1.5
		else if (eingabeS.equalsIgnoreCase("E")) {

		}
		//1.6
		else if (eingabeS.equalsIgnoreCase("F")) {

		}
		//1.7
		else if (eingabeS.equalsIgnoreCase("G")) {

		}
		//1.8
		else if (eingabeS.equalsIgnoreCase("H")) {

		}
		//1.8
		else if (eingabeS.equalsIgnoreCase("Z")) {
			System.out.println("programm wurde beendet! ");
		}


	}


	private static int eingabe() {
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

		}
		else if (vek.equalsIgnoreCase("b")) {

		}
		else if (vek.equalsIgnoreCase("c")) {

		}
		else if (vek.equalsIgnoreCase("z")) {
			System.out.println("programm wurde beendet! ");
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

		}
		else if (mat.equalsIgnoreCase("B")) {

		}
		else if (mat.equalsIgnoreCase("C")) {

		}
		else if (mat.equalsIgnoreCase("z")) {
			System.out.println("programm wurde beendet! ");

		}

	}

}