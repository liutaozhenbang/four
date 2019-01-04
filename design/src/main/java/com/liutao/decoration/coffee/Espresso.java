package com.liutao.decoration.coffee;

import com.liutao.decoration.beverage.Beverage;

public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "This is espresso";
    }
}
