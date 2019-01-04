package com.liutao.factory.pizza;

import com.liutao.factory.ingredient.Clams;
import com.liutao.factory.ingredient.Pepperoni;
import com.liutao.factory.ingredient.Veggies;

/**
 *  抽象的Pizza类
 */
public abstract class Pizza {

    public String name;//名称
    public Pepperoni pepperoni; //意大利辣香肠
    public Clams clams;  //蛤蛎
    public Veggies veggies[]; //蔬菜

    public abstract void prepare();

    public void bake() {
        System.out.println("bake for 25 minutes at 350  烘烤披萨25-30分钟");
    }

    public void cut() {
        System.out.println("cut the pizza into diagonal  pizza切片");
    }

    public void box() {
        System.out.println("place pizza in official PizzaStore  pizza封盒");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
