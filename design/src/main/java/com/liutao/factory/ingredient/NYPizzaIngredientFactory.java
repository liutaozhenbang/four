package com.liutao.factory.ingredient;

/**
 * 纽约原料工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Broccoli(),new Mushroom(),new Radish()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    @Override
    public Clams createClams() {
        return new OrdinaryClams();
    }
}
