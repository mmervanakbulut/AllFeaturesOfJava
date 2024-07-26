package myProjects;

public class Product {
	// constructor
	public Product(int id, String name, String description, double price, int stockAmount, int productCode) {
		System.out.println("Constructor process");
		this.id = id;
		this.productCode = productCode;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmont = stockAmount;
		
	}
	
	public Product() {
		System.out.println("Constructor process123");
	}
	
	// attribute, field
	private int id; // default olarak public gelir. c# da private gelir
	private String name;
	private String description;
	private double price;
	private int stockAmont;
	private int productCode; // getter and setter
	
	public int getId() {
		
		return id;
	}
	
	public void setId(int id) {
		this.id = id; //Product id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmont() {
		return stockAmont;
	}

	public void setStockAmont(int stockAmont) {
		this.stockAmont = stockAmont;
	}

	public String getProductCode() {
		return this.name.substring(0,3) + this.id;
	}

}
