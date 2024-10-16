package com.dp.factory.simplefactory.pizzastore.pizza;

public class PepperPizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("準備胡椒");
	}

	public static Pizza create() {
		Pizza pizza = new PepperPizza();
		pizza.setName("胡椒披薩");
		return pizza;
	}

}
