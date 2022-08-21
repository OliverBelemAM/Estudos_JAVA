package entities;

public class Employee {
	
	public String name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public void increadeSalary (double percentage) {
		GrossSalary += GrossSalary * percentage / 100;
	}
	
	public String toString() {
		return name + ", R$" + String.format("%.2f", NetSalary());
	}
	
}
