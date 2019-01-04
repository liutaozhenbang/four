package com.liutao.factory.ingredient;

/**
 * 原料工厂接口
 */
public interface PizzaIngredientFactory {

    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();

}
