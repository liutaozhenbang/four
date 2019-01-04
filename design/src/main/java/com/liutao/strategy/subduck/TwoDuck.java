package com.liutao.strategy.subduck;

import com.liutao.strategy.fly.HeightFly;
import com.liutao.strategy.supperduck.Duck;

public class TwoDuck extends Duck {

    public TwoDuck(){
        flyBehavior = new HeightFly();
    }

    @Override
    public void display() {
        System.out.println("绿头小鸭");
    }



}
