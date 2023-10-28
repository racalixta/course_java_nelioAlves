package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdfBirth = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for(OrderItem i : items) {
			sum += i.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment));
		sb.append("\nOrder Status: " + status);
		sb.append("\nClient: " + client.getName());
		sb.append(" (" + sdfBirth.format(client.getBirthDate()) + ") - " + client.getEmail());
		sb.append("\nOrder items: \n");
		
		
		for(OrderItem i : items) {
			sb.append(i.getProduct().getName());
			sb.append(", $" +  String.format("%.2f", i.getPrice()));
			sb.append(", Quantity: " + i.getQuantity());
			sb.append(", Subtotal: $" + String.format("%.2f", i.subTotal()));
			sb.append("\n");
		}
		
		sb.append("Total price: $" + String.format("%.2f", total()) + "\n");
		
		return sb.toString();
	}
	
	
	
	
}
