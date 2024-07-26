package myProjects;

public class MyClass {

	public static void main(String[] args) {
		// classes are reference type. Stack and Heap... Garbage Collector...
		Customer cst1;
		Customer cst2 = new Customer();
		cst1 = cst2;
		
		cst1.ekle();
		
		// primitive, value type
		int sayi1 =10;
		int sayi2=20;
		sayi1=sayi2;
		sayi1=30;
		System.out.println(sayi1);
		
		// reference type
		int[] sayilar1 = new int[] {1,2,3};
		int sayilar2[] = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 0;
		System.out.print(sayilar2[0]);
		
		
	}

}
