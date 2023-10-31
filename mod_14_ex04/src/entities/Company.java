package entities;

public class Company extends TaxPayer {

	private int numberOfEmplouyees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, int numberOfEmplouyees) {
		super(name, anualIncome);
		this.numberOfEmplouyees = numberOfEmplouyees;
	}

	public int getNumberOfEmplouyees() {
		return numberOfEmplouyees;
	}

	public void setNumberOfEmplouyees(int numberOfEmplouyees) {
		this.numberOfEmplouyees = numberOfEmplouyees;
	}

	@Override
	public double tax() {
		double basicTax = (numberOfEmplouyees < 10) ? getAnualIncome() * 0.16 : getAnualIncome() * 0.14;
	
		return basicTax;
	}
}
