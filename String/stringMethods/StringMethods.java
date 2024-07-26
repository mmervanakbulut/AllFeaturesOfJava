package stringMethods;

public class StringMethods {

	public static void main(String[] args) {
		// java case sensitive yazılım dilidir.
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		System.out.println("Eleman Sayısı: " + mesaj.length());
		System.out.println("Eleman Sayısı: " + mesaj.charAt(5));
		System.out.println(mesaj.concat(" Yaşasın!")); // sonuna ekler. Kalıcı olması için değişkene atamak gerekiyor.
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // 5 dahil değil.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('e'));

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println("Substring method"+mesaj.substring(5)); // 5 dahil
		System.out.println(mesaj.substring(2, 7)); // 2 dahil 7 dahil değil
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); // baştaki ve sondaki boşlukları siler.
		

	}

}
