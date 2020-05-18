package de.dhbw.src;

public class Movie {
	
    public Category category;
    private String title;
    private int priceCode;
    
    
    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }
    
    
    public int getPriceCode() {
        return priceCode;
    }
    
    
    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    
    
    public String getTitle() {
        return title;
    };
    
    public Category getCategory() {
    	return category;
    }
}