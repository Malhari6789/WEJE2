package com.jspiders.designpattern.singleton;

public class SingletonLazyDemo {

	static SingletonLazyDemo obj;
	static int count;

	private SingletonLazyDemo() {
		count++;
	}

	public static SingletonLazyDemo getDemo() {
		if (obj == null) {
			obj = new SingletonLazyDemo();
			System.out.println(" Object Created " + count + " Times.");
			return obj;
		}
		System.out.println(" Object Created " + count + " Times.");
		return obj;
	}

	public static void main(String[] args) {
		SingletonLazyDemo.getDemo();
		SingletonLazyDemo.getDemo();
		SingletonLazyDemo.getDemo();
		SingletonLazyDemo.getDemo();
	}
}
