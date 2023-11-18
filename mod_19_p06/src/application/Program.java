package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		// Primeiro exemplo
		//String a = "Maria";
		//String b = "Alex";
		
		//System.out.println(a.hashCode());
		//System.out.println(b.hashCode());
		
		/*
		 * O hashcode pode acontecer de conteudos diferentes terem o msm hashcode (muito raro)
		 * 
		 * já o equals é 100% confiável, porem é mais lento
		 * 
		 * pode se utilizar o hashcode para separar uma grande lista de itens (tipo 1 bilhão), quando 
		 * o hashcode for igual ao que se procura utiliza o equals para confirmar
		 * */
		
		Client  c1 = new Client("Maria", "maria@gmail.com");
		Client  c2 = new Client("Maria", "alex@gmail.com");
		//Client  c3 = new Client("Bob", "bob@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		//System.out.println(c3.hashCode());
		System.out.println();
		System.out.println(c1.equals(c2));
		//System.out.println(c2.equals(c3));
		System.out.println(c1 == c2);
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println();
		System.out.println(s1 == s2);
	}

}
