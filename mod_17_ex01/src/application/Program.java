package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		// c:\temp\ws-eclipse
		// c:\temp\ws-eclipse\course_java_nelioAlves --- \in.txt
		// c:\temp\ws-eclipse\course_java_nelioAlves\mod_17_ex01\input.csv

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("Enter a file path: ");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			
			String item = br.readLine();
			
			while (item != null) {

				String[] fields = item.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				Integer quantity = Integer.parseInt(fields[2]);

				list.add(new Product(name, price, quantity));
				
				item = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				
				for(Product prod : list) {
					bw.write(prod.getName() + "," + String.format("%.2f", prod.total()));
					bw.newLine();
				}
				
				System.out.println();
				System.out.println(targetFileStr + " CREATED");
				
				
			} catch(IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
				
			}
			
		} catch(IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
			
		}
		
		sc.close();
	}

}
