package com.dp.factory.simplefactory.pizzastore.order;

import com.dp.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.dp.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.dp.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.dp.factory.simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactory {

	public Pizza createPizza(String orderType) {
		Pizza pizza = null;

		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("希臘披薩");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("起司披薩");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("胡椒披薩");
		}

		return pizza;
	}
	
}
