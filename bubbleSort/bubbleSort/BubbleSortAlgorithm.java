package bubbleSort;

import java.lang.reflect.Array;
import java.util.Set;

public class BubbleSortAlgorithm {

	public static void main(String[] args) {
		int islemSayisi = 0;
		int[] a = { 13, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 10, 11, 12};
		
		
		for (int j = 0; j < 9; j++) {

			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					islemSayisi = islemSayisi + 1;
				}

			}
		}
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("işlem sayısı: " + islemSayisi);
	}

}
