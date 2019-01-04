package com.liutao.factory.ingredient;

/**
 * 芝加哥原料工厂
 */
public class ChicagePizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Mushroom(), new Broccoli()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
