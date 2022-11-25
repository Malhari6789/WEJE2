package com.multithreadingwaitingandnotify.threads;

import com.jspiders.multithreadingwaitingandnotify.resource.Pizza;

public class Cafe extends Thread{
	Pizza pizza;
	public Cafe(Pizza pizza) {
		super();
		this.pizza=pizza;
	}
	@Override
	public void run() {
	pizza.bakePizza(30);
	}

}
