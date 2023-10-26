import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			System.out.print("Digite a temperatura em graus celsius: ");
			double temp = sc.nextDouble();
			double fhr = 9.0 * temp / 5.0 + 32;
			System.out.printf("A temperatura em farenheit é: %.1f%n", fhr);
			System.out.print("Deseja continuar?(s/n) ");
			//sc.nextLine();
			resp = sc.next().charAt(0);
			System.out.println("\n---------------------");
			
		} while(resp == 's');
		
		System.out.println("Sistema encerrado!");
		sc.close();
		

	}

}
