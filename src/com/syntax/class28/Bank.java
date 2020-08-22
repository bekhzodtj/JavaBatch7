package com.syntax.class28;

public class Bank {
	
	private long accountNumber;
	private double balance;
	
	
	//setter
	public void setAccountNumber(long accountNumber) {
		//here can be some validation point
		this.accountNumber = accountNumber;
	}
	//getter
	public long getAcoountNumber() {
		//here can be many validation point
		return accountNumber;
	}
	
	public void setBalance(double balance) {
		//here can be many validation point
		this.balance=balance;
	}
	
	public double getBalance() {
		//here can be many validation point
		return balance;
	}

}
