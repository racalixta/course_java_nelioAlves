package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> listName = new ArrayList<>();
		List<Product> listPrice = new ArrayList<>();
		
		listName.add(new Product("TV", 900.0));
		listName.add(new Product("Notebook", 1200.0));
		listName.add(new Product("Tablet", 400.0));
		
		listPrice.add(new Product("TV", 900.0));
		listPrice.add(new Product("Notebook", 1200.0));
		listPrice.add(new Product("Tablet", 400.0));
		
		// MODO ANTIGO
		/*
		Comparator<Product> compPrice = new Comparator<Product>() {
			
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getPrice().compareTo(p2.getPrice());
			}
		};
		*/
		
		// UTILIZANDO A EXPRESSAO LAMBDA
		/*
		Comparator<Product> compPrice = (p1, p2) -> {
			return p1.getPrice().compareTo(p2.getPrice());
		};
		*/
		// POR TER APENAS UMA LINHA PODE SER RETORNADO ASSIM: 
		//Comparator<Product> compPrice = (p1, p2) -> p1.getPrice().compareTo(p2.getPrice());

		
		listName.sort(new MyComparator());
		//listPrice.sort(compPrice);
		
		// COMO FORMA DE SIMPLIFICAR - pode se colocar a expressao lambda diretamente como argumento
		listPrice.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
		
		System.out.println("List name: ");
		for(Product p : listName) {
			System.out.println(p);
		}
		System.out.println("\nList price: ");
		for(Product p : listPrice) {
			System.out.println(p);
		}

	}

}
