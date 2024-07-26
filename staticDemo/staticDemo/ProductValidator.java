package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static ctor çalıştı.");
	}
	static {
		System.out.println("Static ctor çalıştı.");
	}
	static {
		System.out.println("Static ctor çalıştı.");
	}

	public ProductValidator() {
		// ctor'lar new ile class kullanıldığı zaman çalışır.
		// c#'ta ctor çalışır.
		System.out.println("Construcor is working.");
	}
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public void baskaOperasyon() {
		
	}
	
	// inner class
	public static class BaskaBirClass{
		public static void sil() {
			
		}
	}
	
	
	
	
	
}
