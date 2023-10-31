package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> prod = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("\nProduct %d data: \n", (i + 1));
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(type == 'c') {
				prod.add(new Product(name, price));
				
			} else if(type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				prod.add(new UsedProduct(name, price, date));
				
			} else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				prod.add(new ImportedProduct(name, price, customsFee));
			}
			
		}
		
		System.out.println("\nPRICE TAGS: ");
		
		for(Product p : prod) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
		
	}
}
