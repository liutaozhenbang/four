package com.liutao.decoration.condiment;


import com.liutao.decoration.beverage.Beverage;

public abstract class Condiments extends Beverage {

    public double cost(){
        return 0.0F;
    }

    public abstract String getDescription();

}
