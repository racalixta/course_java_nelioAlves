package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// c:\temp\ws-eclipse
		// c:\temp\ws-eclipse\course_java_nelioAlves
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("\nFOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println("\n-----------------");
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("\nFILES: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		System.out.println("\n-----------------");
		
		// criando uma pasta - mkdir
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();

	}

}
