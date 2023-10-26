package entities;

public class Student {
	public String name;
	public double gradeOne;
	public double gradeTwo;
	public double gradeThree;
	
	public double sumGrades() {
		return gradeOne + gradeTwo + gradeThree;
		
	}
	
	public void result() {
		double grade = sumGrades();
		
		if(grade >= 60) {
			System.out.printf("Final Grade = %.2f\n", grade);
			System.out.println("Pass!");
			
		} else {
			double miss = 60 - grade;
			System.out.printf("Final Grade = %.2f\n", grade);
			System.out.println("FAILED!");
			System.out.printf("MISSING %.2f POINTS\n", miss);
		}
	}
}
