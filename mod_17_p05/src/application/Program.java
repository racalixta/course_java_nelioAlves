package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// c:\temp\ws-eclipse
		// c:\temp\ws-eclipse\course_java_nelioAlves  --- \in.txt
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);

		System.out.println("\ngetName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
		
	}

}
