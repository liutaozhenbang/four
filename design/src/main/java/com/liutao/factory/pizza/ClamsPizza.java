package com.liutao.factory.pizza;

import com.liutao.factory.ingredient.PizzaIngredientFactory;

/**
 * 蛤蛎披萨  注释同奶酪披萨
 */
public class ClamsPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamsPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        clams = ingredientFactory.createClams();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }

    @Override
    public void box() {
        System.out.println("CheesePizza===Cardboard box 给我装纸盒子");
    }
}
