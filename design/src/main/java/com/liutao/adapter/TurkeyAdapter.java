package com.liutao.adapter;

import com.liutao.adapter.duck.Duck;
import com.liutao.adapter.turkey.Turkey;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
