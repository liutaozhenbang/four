package com.liutao.strategy.fly;

public class LowFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("低飞");
    }
}
