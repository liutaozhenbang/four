package com.liutao.refactoring;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, Vector rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector getRentals() {
        return rentals;
    }

    public void setRentals(Vector rentals) {
        this.rentals = rentals;
    }

    public String statement() {
        Enumeration elements = rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (elements.hasMoreElements()) {
            Rental each = (Rental) elements.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getMovie().getCharge(each.getDaysRented())) + "\n";
        }
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    public double getTotalAmount() {
        double result = 0;
        Enumeration elements = rentals.elements();
        while (elements.hasMoreElements()) {
            Rental each = (Rental) elements.nextElement();
            result += each.getMovie().getCharge(each.getDaysRented());
        }
        return result;
    }

    public int getFrequentRenterPoints() {
        int result = 0;
        Enumeration elements = rentals.elements();
        while (elements.hasMoreElements()) {
            Rental each = (Rental) elements.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}