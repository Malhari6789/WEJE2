package com.jspiders.multithreading1.resource;

public class Account {
double accountBalance;

public Account (double accountbalance) {
	super();
	this.accountBalance=accountbalance;
}
public void checkBalance() {
	System.out.println(accountBalance);
}
public synchronized void deposit(double amount) {
	accountBalance +=amount;
	checkBalance();
}
public synchronized void withdraw(double amount) {
if(accountBalance>=amount) {
	accountBalance-=amount;
	checkBalance();
}
else {
	System.out.println("Insufficient Balance...");
}
}
}
