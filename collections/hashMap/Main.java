package hashMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> sozluk = new HashMap<String, String>();
		
		sozluk.put("book", "kitap");
		sozluk.put("add", "ekle");
		sozluk.put("delete", "sil");
		
		
		for(String item: sozluk.keySet()) {
			System.out.println("Elemen " + item + " Değer: "+ sozluk.get(item));
		}
		
		
		System.out.println(sozluk);
		System.out.println(sozluk.size());
		sozluk.remove("book");
		System.out.println(sozluk.get("book"));
		
	}

}
