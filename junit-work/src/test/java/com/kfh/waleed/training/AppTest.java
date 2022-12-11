package com.kfh.waleed.training;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class AppTest {
	
	@Test
	void testDivide() {
//		fail("We are just about to test divide......");
		
		App app = new App();
		
		int actual = app.divide(200, 50);
		int expected = 4;
		assertEquals(expected, actual);
		
//		assertNull(app);
//		
//		assertNotNull(app);
//		
//		assertDoesNotThrow(new ArithmeticException(), );
		
		
		
		assertAll(
				() -> assertEquals(expected, actual),
				() -> assertEquals(50, app.divide(300, 3), "Division result shouldn't have been 50")
//				() -> assertNotEquals(0, app.divide(50, 0))
				);
			
	}
	
	
	@Test
	void anotherTest() {
		fail("Just a failure");
	}
	
	
	
	
	
	
	
	
}