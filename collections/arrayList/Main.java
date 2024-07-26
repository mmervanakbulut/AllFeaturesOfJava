package arrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList sayilar = new ArrayList();
		System.out.println(sayilar.size());
		
		sayilar.add("alsdjfl");
		sayilar.add(1);
		sayilar.add(12);
		sayilar.add(4);
		// System.out.println(sayilar.size());
		// System.out.println(sayilar.get(2));
		// sayilar.set(0, 100);
		// sayilar.remove(0);
		// System.out.println(sayilar.size());
		// sayilar.clear();
		System.out.println(sayilar.size());
		
		for(Object i :sayilar) {
			System.out.println(i);
		}
		
	}

}
