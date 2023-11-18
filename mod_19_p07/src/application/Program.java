package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		// DEMONSTRAÇÃO 1
		
		/*
		// HashSet - é o mais rapido, porem nao mantem a ordem (bom para casos que a ordem nao importa)
		// TreeSet - mais lento e ordena os dados pelo compareTo do objeto (ou comparator)
		// LinkedHashSet - velocidade intermediaria e mantem a ordem em que os elementos foram inseridos, 
		//                ^ diferente do HashSet
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		//System.out.println(set.contains("Notebook"));
		
		// ALGUMAS OPERAÇOES - TESTAR UMA A UMA
		//set.remove("Tablet");
		//set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for(String p : set) {
			System.out.println(p);
		}
		
		// FIM DA DEMONSTRAÇÂO 1
		*/
		
		// DEMONSTRAÇAO 2
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		// Union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		// Intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// Difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
		
		// FIM DA DEMONSTRACAO 2
	}
}
