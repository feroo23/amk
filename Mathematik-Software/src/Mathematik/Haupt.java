package Mathematik;

import java.io.IOException;

import oop.IO;

public class Haupt {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("W�hlen sie aus ");
		System.out.println(" ");
		System.out.println(" =========================================");
		System.out.println("||					 ||");
		System.out.println("||[S] f�r Statistische Auswertungen 	 ||");
		System.out.println("||[V] F�r Vektorrechnung		 ||");
		System.out.println("||[M] F�r Matrizenrechnung		 ||");
		System.out.println("||[B] F�r Benden			 ||");
		System.out.println("||					 ||");
		System.out.println(" =========================================");
		System.out.println(" ");
		
		String eingabe = IO.readString();
		if (eingabe.equalsIgnoreCase("s"));{
			
			System.out.println(" ");
			System.out.println(" =========================================");
			System.out.println("||[M] F�r Max- Minimum			||");
			System.out.println("||[S] F�r Spannweite");
			
		}
		if (eingabe.equalsIgnoreCase("V")){
			
		}
		if (eingabe.equalsIgnoreCase("M")) {
			
		}
		if (eingabe.equalsIgnoreCase("B")) {
			System.out.println("Das Programm wird beendet!");
			System.out.println("");
		}
		
	}

}
