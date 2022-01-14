package oops;

import inheritance.Person;

public class Customer extends Person {
	
	private int customerId;
	private int accno;
	private int balance;
	
	
	public Customer(int customerId,String name,String gender,int accno,int balance) {
		super(name, gender);
		this.customerId =customerId ;
		this.accno = accno;
		this.balance =balance ;
		System.out.println("Customer(String, String, double, int,int) constructor");
	}
	

	public void display() {
		System.out.println("display() inside Customer");
	}
     public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public void printInfo() {
		System.out.println("Name = "+getName()+",Gender = "+getGender());
		System.out.println("Id = "+customerId+",Accno = "+accno+",Balance = "+balance);
		
	}
}
	
	
	


