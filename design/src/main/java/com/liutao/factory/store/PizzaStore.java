package com.liutao.factory.store;

import com.liutao.factory.pizza.Pizza;

//抽象的披萨店
public abstract class PizzaStore {

    //下单  订购披萨
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //创建一个披萨
    abstract Pizza createPizza(String type);

}
