import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean vdd = true;
		boolean falso = false;
		
		System.out.println("Condicional simples");
		if(vdd) {
			System.out.println("Condição é verdadeira");
		}
		
		System.out.println("\nCondicional composta");
		if(falso) {
			System.out.println("Condição verdadeira");
		} else {
			System.out.println("Condição falsa");
		}
		
		System.out.println("\n-------------------------\n");
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
		
		System.out.println("\n-------------------\n");
		System.out.println("Switch case");
		System.out.println("Qual dia da semana? ");
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia ="domingo";
			break;
		case 2:
			dia ="segunda";
			break;
		case 3:
			dia ="terça";
			break;
		case 4:
			dia ="quarta";
			break;
		case 5:
			dia ="quinta";
			break;
		case 6:
			dia ="sexta";
			break;
		case 7:
			dia ="sábado";
			break;
		default:
			dia = "Valor inválido!";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		System.out.println("\n-----------------------\n");
		System.out.println("Condição ternaria");
		
		// condição ? valor_se_vdd : valor_se_falso
		
		System.out.println((vdd) ? "verdadeiro" : "falso");
		System.out.println((falso) ? "verdadeiro" : "falso");
		
		System.out.println("\n-----------------------\n");
		
		sc.close();
		
	}

}
