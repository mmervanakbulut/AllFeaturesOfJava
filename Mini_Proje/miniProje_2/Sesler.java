package miniProje_2;

import java.util.Scanner;

public class Sesler {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Harf girin: ");
		String harf;
		harf = scanner.next();
		
		
		switch (harf.toUpperCase()) {
		case "A":
		case "I":
		case "O":
		case "U":
			System.out.println("Kalın sesli harf.");
			break;

		default:
			System.out.println("İnce sesli harf.");
			break;
		}
		
	}

}
