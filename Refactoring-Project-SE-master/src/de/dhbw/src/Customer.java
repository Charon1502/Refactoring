package de.dhbw.src;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
	
    private String name;
    private Vector<Rental> rentals = new Vector<Rental>();

    
    public Customer(String newname) {
        name = newname;
    };
    
    
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    };
    

    public String getName() {
        return name;
    };
    
    
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> enum_rentals = rentals.elements();	    
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) enum_rentals.nextElement();
            //determine amounts for each line
            thisAmount = amountFor(each);
            // add frequent renter points
            frequentRenterPoints ++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Category.NEW_RELEASE.getPriceCode()) && each.getDaysRented() > 1) 
                frequentRenterPoints ++;
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
    
    
    private double amountFor(Rental rental) {
        switch (rental.getMovie().getCategory()) {
            case REGULAR:
                return 2;
            case NEW_RELEASE:
                return rental.getDaysRented() * 3;
            case CHILDREN:
                return 1.5;
            default: 
                return -1;

        }
    }

}