package oop;

import java.io.IOException;

public class IOTest {

	public static void main(String[] args) throws IOException {
		double[][] tableDouble = IO.readDoubleTable();
		IO.writeDoubleTable(tableDouble);

	}
}