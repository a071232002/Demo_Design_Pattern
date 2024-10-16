package com.dp.factory.simplefactory.pizzastore.pizza;

public class HawaiianPizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("準備鳳梨 火腿");
	}

	public static Pizza create() {
		Pizza pizza = new HawaiianPizza();
		pizza.setName("夏威夷披薩");
		return pizza;
	}
}
