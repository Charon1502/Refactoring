package de.dhbw.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testForStatement() {
		Customer customer = new Customer("Nico");
		System.out.println(customer.createOutput());
		assertTrue(customer.createOutput().contains("Rental Record for Nico"));
		assertTrue(customer.createOutput().contains("	Title		Days	Amount"));
		assertTrue(customer.createOutput().contains("Amount owed is 0.0"));
		assertTrue(customer.createOutput().contains("You earned 0 frequent renter points"));
	}
	
}
