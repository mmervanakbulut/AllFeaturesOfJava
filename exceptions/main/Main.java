package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader reader = null;
		int total = 0;
		try{
			reader = new BufferedReader(new FileReader("D:\\JavaProgramming\\myProjects\\exceptions\\main\\sayilar.txt"));
			String line = null;
			while((line = reader.readLine()) != null) {
				total += Integer.valueOf(line);
			}
			System.out.println("toplam = " + total);
		}catch(FileNotFoundException exception) {
			System.out.println(exception);
		} catch (IOException e) {
			e.printStackTrace();
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			}catch(Exception exception) {
				
			}
			
		}
	}

}
