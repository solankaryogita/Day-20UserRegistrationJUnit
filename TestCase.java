package userregistration;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {
	
	UserRegistration registration = new UserRegistration();

	@Test
	public void testFirstName() {
		
		assertTrue(registration.firstName("Max"));
		
	}
	
	@Test
	public void testLastName() {
		assertTrue(registration.lastName("Patit"));
	}
	
}
