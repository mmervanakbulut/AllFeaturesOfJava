package staticDemo;

public class Main {

	public static void main(String[] args) {
		
		ProductManager manager = new ProductManager();
		
		Product product = new Product();
		product.id = 1;
		product.name = "kulaklik";
		product.price = 134.12;
		
		manager.add(product);
		
		
		DatabaseHelper.Crud.Delete();
		
	}

}
