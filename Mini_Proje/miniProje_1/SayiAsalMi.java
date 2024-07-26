package miniProje_1;

import java.util.Scanner;

public class SayiAsalMi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Argued number: ");
		int primerNumber = scanner.nextInt();
		boolean isPrimer = true;
		/*if (primerNumber == 2 || primerNumber == 3 || primerNumber == 5 || primerNumber == 7 || primerNumber == 11 ) {
			System.out.println("Primer number");
		}
		else if (primerNumber%2 == 0 || primerNumber%3 == 0 || primerNumber%5 == 0 || primerNumber%7==0 || primerNumber%11 == 0) {
			System.out.println("Is not primer number");
		}else {
			System.out.println("Primer number.");
		}*/
		
		if (primerNumber == 1) {
			System.out.println("Sayı asal değildir.");
			return;
		}
		if (primerNumber<1) {
			System.out.println("Geçersiz sayı!");
		}
		
		
		
		for (int i = 2; i < primerNumber; i++) {
			if (primerNumber%i == 0) {
				isPrimer = false;
			}
		}
		
		if(isPrimer) {
			System.out.println("Sayı asaldır.");
		}else {
			System.out.println("Sayı asal değildir");
		}
		
		
	}

}
