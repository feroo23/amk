package oop;

import java.io.IOException;

public class IOTest {

	public static void main(int[] args) throws IOException {
		System.out.println("Hallo");
		int moin = IO.readInteger();
		
		for (int i = 0; i <moin; i++) {
			System.out.println((Math.random() * 49));
		}



		
	}
}