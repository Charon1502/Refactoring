package de.dhbw.src;

public enum Category {

	CHILDREN(2), REGULAR(0), NEW_RELEASE(1);
	
	private int category;
	
	
	private Category(int category) {
		this.category = category;
	}
	
	
	public int getCategory() {
		return category;
	}
}
