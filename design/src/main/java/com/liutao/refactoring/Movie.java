package com.liutao.refactoring;

/**
 * 电影影片
 */
public class Movie {
    public static final int CHILDRENS = 2;//儿童
    public static final int REGULAR = 0;//普通
    public static final int NEW_RELEASE = 1;//新片

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }


    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                price = new ReqularPrice();
                break;
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("参数不正确");
        }
    }


    public String getTitle() {
        return title;
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

}
