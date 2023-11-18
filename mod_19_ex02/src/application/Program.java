package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> studentsA = new HashSet<>();
		Set<Integer> studentsB = new HashSet<>();
		Set<Integer> studentsC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int cicles = sc.nextInt();
		setStudents(cicles, studentsA, sc);
		
		System.out.print("How many students for course B? ");
		cicles = sc.nextInt();
		setStudents(cicles, studentsB, sc);

		System.out.print("How many students for course C? ");
		cicles = sc.nextInt();
		setStudents(cicles, studentsC, sc);
		
		Set<Integer> totalStudents = new HashSet<>(studentsA);
		totalStudents.addAll(studentsB);
		totalStudents.addAll(studentsC);
		
		System.out.print("\nTotal students: " + totalStudents.size());
		
		sc.close();

	}
	
	public static void setStudents(int cicles, Set<Integer> students, Scanner sc) {
		for(int i = 0; i < cicles; i++) {
			
			System.out.printf("Student #%d: ", i + 1);
			students.add(sc.nextInt());
		}
		
	}

}
