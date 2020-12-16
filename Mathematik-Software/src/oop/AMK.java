package oop;

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
}
