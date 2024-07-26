package classArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Customer mervan = new Customer(1,"Mervan", "Akbulut");
		customers.add(mervan);
		customers.add(new Customer(1,"Mustafa", "Akbulut"));
		customers.add(new Customer(1,"Bilal", "Akbulut"));
		
		customers.remove(mervan);
		
		for(Customer custom: customers) {
			System.out.println(custom.firstName);
		}
	}

}
