package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		// para List é necessário utilizar as wrappers class
		
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Vitor");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		System.out.println("\n---------------------\n");
		
		
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println("\n---------------------\n");
		
		//list.remove("Bob");
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String item : list) {
			System.out.println(item);
		}
		
		System.out.println("\n---------------------\n");
		
		System.out.println("Index of Ana: " + list.indexOf("Ana"));
		System.out.println("Index of Marco(nao existe mais): " + list.indexOf("Marco"));
		
		System.out.println("\n---------------------\n");
		
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String item : result) {
			System.out.println(item);
		}
		
		System.out.println("\n---------------------\n");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
