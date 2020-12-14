package Mathematik;

import java.io.IOException;

import oop.IO;

public class Haupt {

	public static void main(String[] args) throws IOException {
	
		System.out.println("W�hlen sie aus ");
		System.out.println(" ");
		System.out.println(" =================================================");
		System.out.println("||						 ||");
		System.out.println("||[S] f�r Statistische Auswertungen 		 ||");
		System.out.println("||[V] F�r Vektorrechnung			 ||");
		System.out.println("||[M] F�r Matrizenrechnung			 ||");
		System.out.println("||[B] F�r Benden				 ||");
		System.out.println("||						 ||");
		System.out.println(" =================================================");
		System.out.println(" ");

		String eingabe = IO.readString();

		if (eingabe.equalsIgnoreCase("s")){
			StatistischeAuswertungen();
		}
		else if (eingabe.equalsIgnoreCase("V")){
			Vektorrechnung();
		}
		else if (eingabe.equalsIgnoreCase("M")) {
			Matrizenrechnung();
		}
		else if (eingabe.equalsIgnoreCase("B")) {
			System.out.println("Sind sie sich sicher?");
			
		}

	}
	

	private static void Benden() {
		
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
		System.out.println("||[B] F�r Benden				 ||");
		System.out.println("||						 ||");
		System.out.println(" =================================================");
		System.out.println(" ");

		String eingabeS = IO.readString();
		//1.1
		if(eingabeS.equalsIgnoreCase("A")) {

		}
		//1.2
		else if(eingabeS.equalsIgnoreCase("B")) {

		}
		//1.3
		else if (eingabeS.equalsIgnoreCase("C")) {

		}
		//1.4
		else if (eingabeS.equalsIgnoreCase("D")) {
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

		}


	}

	private static void Vektorrechnung() {
	
		System.out.println(" ");
		System.out.println(" =================================================");
		System.out.println("||						 ||");
		System.out.println("||Vektorrechnung:				 ||");
		System.out.println("||						 ||");
		System.out.println("||Multiplikation mit einer Zahl 		 ||");
		System.out.println("||Addition zweier Vektoren			 ||");
		System.out.println("||Multiplikation zweier Vektoren 		 ||");
		System.out.println("||						 ||");
		System.out.println(" =================================================");
		
		
	
	}

	private static void Matrizenrechnung() throws IOException {
		System.out.println(" ");
		System.out.println(" =================================================");
		System.out.println("||						 ||");
		System.out.println("||Matrizenrechnung			 	 ||");
		System.out.println("||						 ||");
		System.out.println("||Multiplikation mit einer Zahl			 ||");
		System.out.println("||Addition zweier Matrizen			 ||");
		System.out.println("||Multiplikation zweier Matrizen		 ||");
		System.out.println("||						 ||");
		System.out.println(" =================================================");
		System.out.println(" ");
		
		String mat = IO.readString();
		
		if (mat.equalsIgnoreCase(mat)) {
			
		}
		else if (mat.equalsIgnoreCase(mat)) {
			
		}
		else if (mat.equalsIgnoreCase(mat)) {
			
		}
	
	
	
	
	}




}