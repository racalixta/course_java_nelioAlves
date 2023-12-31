package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Rectangle;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ex;
		System.out.println("What exercise you want to test? (1, 2, 3) ");
		ex  = sc.nextInt();
		
		System.out.println();
		
		if(ex == 1) {
			Rectangle rectangle = new Rectangle();
			
			System.out.println("Enter rectangle width and height: ");
			rectangle.width = sc.nextDouble();
			rectangle.height = sc.nextDouble();
			
			System.out.println();
			System.out.printf("\nArea: %.2f", rectangle.area());
			System.out.printf("\nPerimeter: %.2f", rectangle.perimeter());
			System.out.printf("\nDiagonal: %.2f", rectangle.diagonal());
			
			
		} else if(ex == 2) {
			Employee employee = new Employee();
			
			System.out.println("Enter the employee name, gross salary, tax: ");
			sc.nextLine();
			employee.name = sc.nextLine();
			employee.grossSalary = sc.nextDouble();
			employee.tax = sc.nextDouble();
			
			System.out.println();
			System.out.printf("\nEmployee: %s, $ %.2f", employee.name, employee.netSalary());
			
			System.out.println();
			System.out.print("Which percentage to increase salary? ");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
			
			System.out.println();
			System.out.printf("\nUpdated data: %s, $ %.2f", employee.name, employee.netSalary());
			
		} else {
			Student student = new Student();
			
			System.out.println("Enter the student name, grade one, two and three: ");
			sc.nextLine();
			student.name = sc.nextLine();
			student.gradeOne = sc.nextDouble();
			student.gradeTwo = sc.nextDouble();
			student.gradeThree = sc.nextDouble();
			
			System.out.println();
			student.result();
			
		}
		
		sc.close();

	}

}
