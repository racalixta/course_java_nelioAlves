import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int higher = max(num1, num2, num3);
		
		showResult(higher);
		
		sc.close();

	}
	
	public static int max(int a, int b, int c) {
		int aux;
		if (a > b && a > c) {
			aux = a;
		} else if (b > c) {
			aux = b;
		} else {
			aux = c;
		}
		
		return aux;
	}
	
	public static void showResult(int num) {
		System.out.println("Maior = " + num);
	}

}
