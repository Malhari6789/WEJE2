package com.jspiders.multithreadingwaitingandnotify.resource;

public class Pizza {
int noOfPizza;
public Pizza(int noOfPizza) {
	System.out.println(noOfPizza + " Pizzas Available ");
	this.noOfPizza=noOfPizza;
}
public int checkPizza() {
	return this.noOfPizza;
}
public synchronized void orderPizza(int noOfPizza) {
	System.out.println(" Ordering " +noOfPizza+ "  Pizzas");
	if(noOfPizza>checkPizza()) {
		try {
			System.out.println(" not available" +noOfPizza+"  please wait");
			this.wait();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	this.noOfPizza-=noOfPizza;
	System.out.println(" Successfully Delivered  "+noOfPizza+" pizzas");
	System.out.println(checkPizza() + "pizzas available");
}
public synchronized void bakePizza(int noOfPizza) {
	this.noOfPizza+=noOfPizza;
	System.out.println(" Baking" +noOfPizza+ "pizza");
	System.out.println(checkPizza()+ " Pizzas available");
    this.notify();
}
}
