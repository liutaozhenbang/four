package com.liutao.factory.pizza;

import com.liutao.factory.ingredient.PizzaIngredientFactory;

/**
 * 奶酪披萨
 */
public class CheesePizza extends Pizza{
    //以属性的方式注入原料工厂
    PizzaIngredientFactory ingredientFactory;

    //实例化原料工厂
    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    //获得原料
    @Override
    public void prepare() {
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }

    //不一样的装盒方式
    @Override
    public void box() {
        System.out.println("CheesePizza=== Iron box  给我装铁盒子");
    }

}
