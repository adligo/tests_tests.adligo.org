package org.adligo.tests_tests;

import java.util.Collections;

import org.adligo.tests.ATest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ATestTests extends ATest {
	
	public ATestTests() {
		super("hey");
	}
	
	@Test
	public void testMethods() {
		assertEquals("hey", getName());
		assertIsEquals("a", "a");
		assertIsEquals("a,", "a", "a");
		assertIsFalse(false);
		assertIsFalse("a", false);
		assertIsTrue(true);
		assertIsTrue("a", true);
		assertIsNotNull("a");
		assertIsNotNull("a", "a");
		assertIsNotSame("a", "b");
		assertIsNotSame("a", "a","b");
		assertIsNull(null);
		assertIsNull("a", null);
		assertCollectionEquals(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
		assertMapEquals(Collections.EMPTY_MAP, Collections.EMPTY_MAP);
		
	}

}
