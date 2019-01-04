package com.liutao.factory.store;

import com.liutao.factory.ingredient.ChicagePizzaIngredientFactory;
import com.liutao.factory.ingredient.PizzaIngredientFactory;
import com.liutao.factory.pizza.CheesePizza;
import com.liutao.factory.pizza.ClamsPizza;
import com.liutao.factory.pizza.Pizza;

//芝加哥披萨店
public class ChicagoPizzaStore extends PizzaStore {

    //创建一个披萨
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagePizzaIngredientFactory();
        if ("cheesePizza".equals(type)){
            //创建奶酪披萨
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicage CheesePizza");
        }else {
            //创建蛤蛎披萨
            pizza = new ClamsPizza(ingredientFactory);
            pizza.setName("Chicage ClamsPizza");
        }
        return pizza;
    }
}
