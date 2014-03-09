package org.adligo.tests_tests;

import org.adligo.tests.ATest;
import org.adligo.tests.shared.AAssertions;
import org.adligo.tests_tests.shared.AAssertionsExtension;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AAssertionsTests extends ATest {
	private static AAssertionsExtension assertions = new AAssertionsExtension();
	
	public AAssertionsTests() {
		assertions.setTest(this);
		assertIsEquals(this, assertions.getTest());
	}
	
	@Test
	public void testEquals() {
		assertions.equalsAsserts();
	}

	@Test
	public void testMisc() {
		assertions.miscAsserts();
	}
	
	@Test
	public void testNotSame() {
		assertions.notSameAsserts();
	}
	
	@Test
	public void testNotEquals() {
		assertions.notEqualsAsserts();
	}

	@Override
	public String getScope() {
		// TODO Auto-generated method stub
		return AAssertions.class.getName();
	}
}
