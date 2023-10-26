import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Com println ocorre quebra de linha!");
		System.out.print("Apenas com print, ");
		System.out.println("não ocorre quebra de linha.");
		
		int varInt = 32;
		System.out.println("\nVariável inteira: " + varInt);
		
		double varDouble = 27.946773;
		System.out.println("Variável double: " + varDouble);
		System.out.printf("Variável double formatado: %.2f%n", varDouble);
		Locale.setDefault(Locale.US);
		System.out.printf("Variável double formatado US: %.4f%n", varDouble);
		
		
		System.out.println("\nConcatenação com printf");
		
		String nome = "Maria";
		int idade = 27;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}

}
