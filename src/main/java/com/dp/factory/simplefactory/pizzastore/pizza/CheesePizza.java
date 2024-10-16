package com.dp.factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("準備起司給披薩");
	}

	public static Pizza create() {
		Pizza pizza = new CheesePizza();
		pizza.setName("起司披薩");
		return pizza;
	}

}
