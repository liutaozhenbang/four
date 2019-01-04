package com.liutao.decoration.condiment;

import com.liutao.decoration.beverage.Beverage;

public class Mocha extends Condiments {

    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public Mocha(){
    }


    @Override
    public double cost() {
        return 8 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + mocha";
    }
}
