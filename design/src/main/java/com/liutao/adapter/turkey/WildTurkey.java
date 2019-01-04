package com.liutao.adapter.turkey;

public class WildTurkey implements Turkey{
    @Override
    public void fly() {
        System.out.println("我是一只小小鸟，怎么飞也飞不高，还只能飞一公里");
    }

    @Override
    public void gobble() {
        System.out.println("我是小野鸡，咕咕咕...");
    }
}
