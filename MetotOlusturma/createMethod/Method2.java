package createMethod;

public class Method2 {

	public static void main(String[] args) {
		
		int total = topla(3,5);
		System.out.println(total);
		
		int total2 = topla2(2,3,4,5,66,7,8,89);
		System.out.println(total2);
		
	}
	
	public static int topla(int a, int b) {
		
		return a+b;
	}
	public static int topla2(int... sayilar) { // variable argument
		int toplam = 0;
		for(int sayi: sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

}
