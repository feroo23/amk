package Mathematik;

import java.io.IOException;

import oop.IO;

public class Haupt {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("Wählen sie aus ");
		System.out.println(" ");
		System.out.println(" =========================================");
		System.out.println("||					 ||");
		System.out.println("||[S] für Statistische Auswertungen 	 ||");
		System.out.println("||[V] FÜr Vektorrechnung		 ||");
		System.out.println("||[M] Für Matrizenrechnung		 ||");
		System.out.println("||[B] Für Benden			 ||");
		System.out.println("||					 ||");
		System.out.println(" =========================================");
		System.out.println(" ");
		
		String eingabe = IO.readString();
		if (eingabe.equalsIgnoreCase("s"));{
			
			System.out.println(" ");
			System.out.println(" =========================================");
			System.out.println("||[M] Für Max- Minimum			||");
			System.out.println("||[S] Für Spannweite");
			
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
