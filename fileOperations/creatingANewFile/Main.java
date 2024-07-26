package creatingANewFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		readFile();
		writeFile();
		readFile();
	}
	public static void createFile() {
		File file = new File("D:\\JavaProgramming\\myProjects\\fileOperations\\creatingANewFile\\example.txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println("Dosya oluşturuldu.");
			}else {
				System.out.println("Dosya zaten mevcut.");
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void getFileInfo() {
		File file = new File("D:\\JavaProgramming\\myProjects\\fileOperations\\creatingANewFile\\example.txt");
		if (file.exists()) {
			System.out.println("Dosya adı: " + file.getName());
			System.out.println("Dosya yolu: " + file.getAbsolutePath());
			System.out.println("Dosya yazılabilir mi? : " + file.canWrite());
			System.out.println("Dosya okunabilir mi? : " + file.canRead());
			System.out.println("Dosya boyutu : " + file.length()); // byte
		}
	}
	public static void readFile() {
		File file = new File("D:\\JavaProgramming\\myProjects\\fileOperations\\creatingANewFile\\example.txt");
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				String lineString = scan.nextLine();
				System.out.println(lineString);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void writeFile() {
		try {
			FileWriter file = new FileWriter("D:\\JavaProgramming\\myProjects\\fileOperations\\creatingANewFile\\example.txt", true);
			BufferedWriter writer = new BufferedWriter(file);
			writer.newLine();
			writer.write("Bilal");
			System.out.println("Dosyaya yazıldı..");
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
