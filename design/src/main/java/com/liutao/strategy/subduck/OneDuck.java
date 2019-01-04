package com.liutao.strategy.subduck;

import com.liutao.strategy.fly.LowFly;
import com.liutao.strategy.supperduck.Duck;

public class OneDuck extends Duck {

    public OneDuck() {
        flyBehavior = new LowFly();
    }

    @Override
    public void display() {
        System.out.println("红头小鸭");
    }

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

}
