package com.liutao.refactoring;

public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return 0;
    }

    @Override
    double getCharge(int daysRented){
        return daysRented * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
