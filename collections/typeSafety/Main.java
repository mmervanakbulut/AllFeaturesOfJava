package typeSafety;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mustafa");
		names.add("Mervan");
		names.add("Bilal");
		
		Collections.sort(names);
		
		
		for(String name : names) {
			System.out.println(name);
		}
		
	}

}
