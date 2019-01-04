package com.liutao.strategy.fly;


public class HeightFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("高飞");
    }
}
