package createMethod;


public class Method {
	
	
	public static void main(String[] args) {
		sayiYaz(3);
		
		mesajiYaz("hello method");
		
		
	}
	
	public static void sayiYaz(int a) {
		System.out.println(a);
	}
	
	public static String mesajiYaz(String myMesage) {
		
		System.out.println(myMesage);
		return myMesage;
	}
}
