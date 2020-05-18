package de.dhbw.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testForStatement() {
		Customer customer = new Customer("Nico");
		assertNotNull(customer.createOutput());
	}
	
}
