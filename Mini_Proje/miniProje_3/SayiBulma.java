package miniProje_3;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,3,4,5,6,7,8,9,0};
		
		int aranacak = 0;
		
		boolean varMi = false;
		
		for (int i : sayilar) {
			if (i == aranacak) {
				System.out.println("Sayı mevcut.");
				varMi = true;
				break;
			}
		}
		
		if( varMi ) {
			System.out.println("sayi mevcut");
		}else {
			System.out.println("Sayi mevcut değil.");
		}
		
		
	}

}
