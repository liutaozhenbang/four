package com.liutao.strategy.supperduck;

import com.liutao.strategy.fly.FlyBehavior;

public abstract class Duck {

    public FlyBehavior flyBehavior;

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void perFormFly(){
        flyBehavior.fly();
    }

    public void quack(){
        System.out.println("小鸭子，呱呱叫");
    }

    public abstract void display();

}
