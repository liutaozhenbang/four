package com.liutao.adapter.duck;

public class MallardDack implements Duck {
    @Override
    public void fly() {
        System.out.println("唐老鸭可以飞五公里");
    }

    @Override
    public void quack() {
        System.out.println("我是一只小鸭子，咿呀咿呀呦，呱呱呱...");
    }
}
