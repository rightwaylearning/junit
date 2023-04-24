package com.junit5.in.junit_5_test;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */
@RunWith(JUnitPlatform.class)
public class AppTest {
	private App app;
	

	@Test
	public void shouldAnswerWithTrue() {
		this.app = new App();
		String message = this.app.mymessage("Madhu");
		Assertions.assertEquals("Hello Madhu", message);
	}

	@Test
	public void validateWithNull() {
		this.app = new App();
		String message = app.mymessage(null);
		Assertions.assertEquals(null, message);
	}
	

	
}
