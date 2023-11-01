package model.entities;

import model.exception.BalanceException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}
	
	public Double getBalance() {
		return balance;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {	
		balance += amount;
	}
	
	public void withdraw(double amount) {
		validateWithdraw(amount);
		balance -= amount;			
	}
	
	private void validateWithdraw(double amount) {
		if(amount > getWithdrawLimit()) {
			throw new BalanceException("The amount exceeds withdraw limit");
		}
		
		if(amount > getBalance() || getBalance() < 0) {
			throw new BalanceException("Not enough balance");
		}
	}

	@Override
	public String toString() {
		return "New balance: $ " + String.format("%.2f", balance);
	}
	
	
}
