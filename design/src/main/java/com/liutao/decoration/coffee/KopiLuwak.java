package com.liutao.decoration.coffee;

import com.liutao.decoration.beverage.Beverage;

public class KopiLuwak extends Beverage {

    private Beverage beverage;

    public KopiLuwak (Beverage beverage){
        this.beverage = beverage;
    }

    public KopiLuwak (){
    }


    @Override
    public double cost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "This is Kopi Luwak";
    }
}
