package com.liutao.factory.store;

import com.liutao.factory.ingredient.NYPizzaIngredientFactory;
import com.liutao.factory.ingredient.PizzaIngredientFactory;
import com.liutao.factory.pizza.CheesePizza;
import com.liutao.factory.pizza.ClamsPizza;
import com.liutao.factory.pizza.Pizza;

/**
 * 纽约披萨店 注释见芝加哥披萨
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheesePizza".equals(type)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY CheesePizza");
        }else {
            pizza = new ClamsPizza(ingredientFactory);
            pizza.setName("NY ClamsPizza");
        }
        return pizza;
    }
}
