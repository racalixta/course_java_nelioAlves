import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String x;
		System.out.print("Digite algo: ");
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		int y;
		System.out.print("\nDigite um valor inteiro: ");
		y = sc.nextInt();
		System.out.println("O seu valor inteiro é: " + y);
		
		// por estar com o SO em ptBR deve-se digitar o numero com , = 2,1
		double w;
		System.out.print("\nDigite um valor double: ");
		w = sc.nextDouble();
		System.out.println("O seu valor double é: " + w);
		
		char z;
		System.out.print("\nDigite um char: ");
		z = sc.next().charAt(0);
		System.out.println("Seu char é: " + z);
		
		// para ler uma linha inteira utilize nextLine
		
		String s1, s2, s3;
		
		System.out.println("\nDigite algo em três linhas:");
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("\nDados Digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
