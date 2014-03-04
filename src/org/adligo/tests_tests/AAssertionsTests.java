package org.adligo.tests_tests;

import org.adligo.tests.AAssertions;
import org.adligo.tests.ATest;
import org.adligo.tests.AssertionStats;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AAssertionsTests extends ATest {
	private static AssertionStats stats = new AssertionStats();
	private static AAssertionsExtension assertions = new AAssertionsExtension();
	
	public AAssertionsTests() {
		assertions.setTest(this);
		assertIsEquals(this, assertions.getTest());
	}
	
	
	@AfterClass
	public static void afterClass() {
		stats.logAssertionStats(ATestTests.class, 
				AAssertions.class.getPackage().getName(),
				assertions.getAssertionCount());
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
}
