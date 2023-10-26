import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros você deseja colocar? ");
		int n = sc.nextInt();
		int soma = 0;
		for(int i = 0; i < n; i++) {
			System.out.print("Digite o numero: ");
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println("Soma dos valores: " + soma);

	}

}
