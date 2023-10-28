package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		System.out.println();
		System.out.println("Enter order data: ");
		
		System.out.print("Status: ");
		sc.nextLine();
		String status = sc.nextLine();
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		Date orderDate = new Date();
		
		Order order = new Order(orderDate, OrderStatus.valueOf(status), new Client(name, email, birthDate));
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Enter #%d item data: \n", (i + 1));
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			
			System.out.print("Product Price: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			order.addItem(new OrderItem(quantity, productPrice, new Product(productName, productPrice)));
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		
		sc.close();

	}

}
