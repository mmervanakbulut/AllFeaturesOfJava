package myProjects;

public class ClassesWithAttibutes {

	public static void main(String[] args) {
		
		Product product2 = new Product(2,"laptop2", "monster2", 123, 2, 321);
		
		
		Product product = new Product();
		// product.name = "lap";
		// product.id = 1;
		product.setId(1);
		product.setName("laptop");
		// product.description = "monster";
		// product.price = 20000;
		// product.stockAmont = 7;
		// product.getId();
		
		System.out.println(product.getId());
		System.out.println(product.getProductCode());
		
		ProductManager manager = new ProductManager();
		manager.Add(product);
	}

}
