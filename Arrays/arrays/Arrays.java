package arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Implementing an array. Array size specify by the user.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Array size: ");
		int size = scanner.nextInt();
		int[] a = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.printf("%d. array element: ", i+1);
			int num1 = scanner.nextInt();
			a[i] = num1;
		}
		
		for (int i : a) {
			System.out.println(i);
		}
		
	}

}
