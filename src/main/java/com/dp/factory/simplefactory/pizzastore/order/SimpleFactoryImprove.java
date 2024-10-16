package com.dp.factory.simplefactory.pizzastore.order;

import java.lang.reflect.InvocationTargetException;

import com.dp.factory.simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactoryImprove {

	public static Pizza createPizza(String orderType) {
        try {
            Class<?> pizzaClass = Class.forName("com.dp.factory.simplefactory.pizzastore.pizza." + orderType + "Pizza");
            return (Pizza) pizzaClass.getMethod("create").invoke(null);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        } 
        return null;
    }
}
