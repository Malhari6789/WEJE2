package com.jspiders.fastfood.main;

import java.util.Scanner;

import com.jspiders.fastfood.food.FastFood;
import com.jspiders.fastfood.foods.Burger;
import com.jspiders.fastfood.foods.ColdCoffee;
import com.jspiders.fastfood.foods.Fries;
import com.jspiders.fastfood.foods.Pasta;
import com.jspiders.fastfood.foods.Pizza;

public class CafeMain {
	static boolean loop = true;
	static FastFood fastFood;

	public static void main(String[] args) {

		while (loop) {
			try {
				foodFactory().orderFood();
			} catch (NullPointerException e) {
				System.out.println("food not selected");
			}
		}
	}

	public static FastFood foodFactory() {
		System.out.println(
				"Select food : \n" + "1.Pizza \n" + "2.Burger \n" + "3.Pasta \n" + "4.Fries \n" + "5.ColdCoffee");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();

		switch (choice) {

		case 1:
			fastFood = new Pizza();
			loop = false;
			return fastFood;

		case 2:
			fastFood = new Burger();
			loop = false;
			return fastFood;

		case 3:
			fastFood = new Pasta();
			loop = false;
			return fastFood;

		case 4:
			fastFood = new Fries();
			loop = false;
			return fastFood;

		case 5:
			fastFood = new ColdCoffee();
			loop = false;

			return fastFood;

		default:
			System.out.println("Invalid Choice");
			loop = false;
			return fastFood;
		}

	}

}
