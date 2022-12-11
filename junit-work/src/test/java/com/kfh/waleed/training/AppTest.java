package com.kfh.waleed.training;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(Lifecycle.PER_CLASS)//Instance of this class now would be created only once
public class AppTest {
	
	App theApp;
	
	
	@BeforeAll
	static void callAtFirst() {
		System.out.println("beforeAll called...");
	}
	
	@AfterAll
	static void callAtEnd() {
		System.out.println("afterAll called...");
	}
	
	@BeforeEach
	void callBeforeEachTestCase() {
		theApp = new App();
		System.out.println("beforeEach called...");
	}
	
	@AfterEach
	void callAfterEachTestCase() {
		System.out.println("afterEach called...");
	}
	
	@Test
	@DisplayName("Test divide")
	void testDivide() {
//		fail("We are just about to test divide......");
		
		
		int actual = theApp.divide(200, 50);
		int expected = 4;
		assertEquals(expected, actual);
		
//		assertNull(app);
//		
//		assertNotNull(app);
//		
//		assertDoesNotThrow(new ArithmeticException(), );
		
		
		
		assertAll(
				() -> assertEquals(expected, actual),
				() -> assertEquals(50, theApp.divide(300, 3), "Division result shouldn't have been 50")
//				() -> assertNotEquals(0, app.divide(50, 0))
				);
			
	}
	
	
	@ParameterizedTest
	@ValueSource(strings = {"dalal", "madam", "rameez", "omar"})
	void testPalindrome(String data) {
		assertEquals(true, theApp.checkForPalindrome(data), "Not a palindrome string");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
//	@Disabled
//	@EnabledOnOs(OS.WINDOWS)//This would only run on windows system
	@EnabledOnJre(JRE.JAVA_11) //WOuld only run on systems having java : 11
	@DisplayName("Just another test")
	void anotherTest() {
		
		fail("Just a failure");
	}
		
}