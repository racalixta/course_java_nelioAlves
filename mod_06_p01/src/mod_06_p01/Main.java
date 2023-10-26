package mod_06_p01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite um número (0 para sair): ");
		int x = sc.nextInt();
		
		int soma = 0;
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println("A soma dos valores é: " + soma);
		
		sc.close();
	}

}
