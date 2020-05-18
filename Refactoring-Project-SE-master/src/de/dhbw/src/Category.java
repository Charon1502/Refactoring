package de.dhbw.src;

public enum Category {

	CHILDREN(2), REGULAR(0), NEW_RELEASE(1);
	
	private int priceCode;
	
	
	private Category(int priceCode) {
		this.priceCode = priceCode;
	}
	
	
	public int getPriceCode() {
		return priceCode;
	}
}
