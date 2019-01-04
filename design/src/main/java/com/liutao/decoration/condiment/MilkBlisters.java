package com.liutao.decoration.condiment;

import com.liutao.decoration.beverage.Beverage;

public class MilkBlisters extends Condiments {

    private Beverage beverage;

    public MilkBlisters(Beverage beverage){
        this.beverage = beverage;
    }

    public MilkBlisters(){
    }


    @Override
    public double cost() {
        return 5 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Milk Blisters";
    }
}
