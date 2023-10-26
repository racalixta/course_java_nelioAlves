package application;

import java.util.Locale;
import java.util.Scanner;

import enities.Rent;
import entities.Height;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual exercício? ");
		int resp = sc.nextInt();
		System.out.println();
		
		if(resp == 1) {
			
			System.out.print("\nQuantos números você vai digitar? ");
			int n = sc.nextInt();
			int[] vector = new int[n];
			
			for(int i = 0; i < vector.length; i++) {
				System.out.print("Digite um número: ");
				n = sc.nextInt();
				vector[i] = n;
			}
			
			Negative(n, vector);
			
		} else if(resp == 2) {
			
			System.out.print("Quantas pessoas serão digitadas? ");
			int n = sc.nextInt();
			
			Height[] persons = new Height[n];
			
			for(int i = 0; i < n; i++) {
				int count = i + 1; 
				System.out.printf("Dados da pessoa %dª pessoa: \n", count);
				System.out.print("Nome: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Idade: ");
				int age = sc.nextInt();
				System.out.print("Altura: ");
				double height = sc.nextDouble();
				
				persons[i] = new Height(name, age, height);
				
			}
			
			heightAvg(persons);
			underAvg(persons);
			
		} else if(resp == 3) {
			
			System.out.print("How many rooms will be rented? ");
			Rent[] rent = new Rent[10];
			int n = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				int rentNum = i + 1;
				System.out.println("\nRent #" + rentNum);
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				System.out.print("Room: ");
				int room = sc.nextInt();
				
				rent[room] = new Rent(name, email, room);
				
			}
			
			System.out.println("\nBusy rooms: ");
			
			for(int i = 0; i < rent.length; i++) {
				if(rent[i] != null) {
					System.out.printf("%d: %s, %s \n", 
							rent[i].getRoom(), 
							rent[i].getName(), 
							rent[i].getEmail()
					);
				}
				
			}
			
			
		}
		
		sc.close();
	}
	
	public static void Negative(int quantity, int[] vector) {
		System.out.println("\nNúmeros negatios: ");
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] < 0) {
				System.out.println(vector[i]);
			}
		}
	}
	
	public static void heightAvg(Height[] persons) {
		double sum = 0.0;
		
		for(int i = 0; i < persons.length; i++) {	
			sum += persons[i].getHeight();
		
		}
		
		double avg = sum / persons.length;
		
		System.out.printf("\nAltura média: %.2f", avg);
	}
	
	public static void underAvg(Height[] persons) {
		int count = 0;
		for(int i = 0; i < persons.length; i++) {
			if(persons[i].getAge() < 16) {
				count += 1;

				
			}
		}
		
		double avg = ((double)count / persons.length) * 100;
		System.out.printf("\nPessoas com menos de 16 anos: %.1f%% \n", avg );
		underNames(persons, count);
		
	}
	
	public static void underNames(Height[] persons, int count) {
		for(int i = 0; i < persons.length; i++) {
			if(persons[i].getAge() < 16) {
				System.out.println(persons[i].getName());
				
			}
		}
		
		
	}

}
