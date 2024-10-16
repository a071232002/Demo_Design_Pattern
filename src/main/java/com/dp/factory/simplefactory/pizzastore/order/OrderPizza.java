package com.dp.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.dp.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {

//	public OrderPizza() {
//		Pizza pizza = null;
//		String ordType;
//		do {
//			ordType = getType();
//			if (ordType.equals("greek")) {
//				pizza = new GreekPizza();
//				pizza.setName("希臘披薩");
//			} else if (ordType.equals("cheese")) {
//				pizza = new CheesePizza();
//				pizza.setName("起司披薩");
//			} else if (ordType.equals("cheese")) {
//				pizza = new PepperPizza();
//				pizza.setName("胡椒披薩");
//			} else {
//				break;
//			}
//
//			pizza.prepare();
//			pizza.bake();
//			pizza.cut();
//			pizza.box();
//
//		} while (true);
//	}

//	SimpleFactory simpleFactory;
//	Pizza pizza;
//
//	public OrderPizza(SimpleFactory simpleFactory) {
//		setFactroy(simpleFactory);
//	}
//
//	public void setFactroy(SimpleFactory simpleFactory) {
//		String ordType = "";
//		this.simpleFactory = simpleFactory;
//
//		do {
//			ordType = getType();
//			pizza = this.simpleFactory.createPizza(ordType);
//			if (pizza != null) {
//				pizza.prepare();
//				pizza.bake();
//				pizza.cut();
//				pizza.box();
//			} else {
//				System.out.println("訂購失敗");
//				break;
//			}
//		} while (true);
//	}
	
	Pizza pizza;
	
	public OrderPizza() {
		String ordType = "";
		do {
			ordType = getType();
			pizza = SimpleFactoryImprove.createPizza(ordType);
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("訂購失敗");
				break;
			}
		} while (true);
	}
	
	private String getType() {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza type");
			String str = input.readLine();
			str = str.substring(0, 1).toUpperCase() + str.substring(1);
			return str;
		} catch (Exception e) {
			return "";
		}
	}
}
