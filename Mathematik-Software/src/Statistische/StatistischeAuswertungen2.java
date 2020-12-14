package Statistische;

public class StatistischeAuswertungen2 {

	public static void main(String[] args) {
		    double wert;
		    double grenzwert = 0.5;
		    Scanner sc =new Scanner(System.in);
		    System.out.println("Geben Sie zum Testen eine Zahl ein.");
		    wert = sc.nextDouble();
		    if (wert < grenzwert) System.out.println("Gerade Zahl");
		    else
		    {
		        System.out.println("Ungerade Zahl");
	}

	}
}
