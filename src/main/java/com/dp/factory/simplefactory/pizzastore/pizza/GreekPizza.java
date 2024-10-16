package com.dp.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("準備材料給披薩");
	}

	public static Pizza create() {
		Pizza pizza = new GreekPizza();
		pizza.setName("希臘披薩");
		return pizza;
	}
	
}
