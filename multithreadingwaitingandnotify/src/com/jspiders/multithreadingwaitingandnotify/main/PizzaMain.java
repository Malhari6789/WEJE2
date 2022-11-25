package com.jspiders.multithreadingwaitingandnotify.main;

import com.jspiders.multithreadingwaitingandnotify.resource.Pizza;
import com.multithreadingwaitingandnotify.threads.Cafe;
import com.multithreadingwaitingandnotify.threads.Friends;

public class PizzaMain {
public static void main(String[] args) {
	Pizza pizza = new Pizza(30);
	Friends friends = new Friends(pizza);
	Cafe cafe = new Cafe(pizza);
	friends.start();
	cafe.start();
}
}
