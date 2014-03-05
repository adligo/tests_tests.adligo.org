package org.adligo.tests_tests;

import java.util.ArrayList;
import java.util.Collections;

import junit.framework.TestCase;

import org.adligo.tests.ATest;
import org.adligo.tests.shared.AAssertions;
import org.adligo.tests.shared.AssertionStats;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ATestTests extends TestCase {
	private static AssertionStats stats = new AssertionStats();
	
	
	@AfterClass
	public static void afterClass() {
		stats.logAssertionStats(ATestTests.class, 
				AAssertions.class.getPackage().getName(),
				0);
	}
	
	@Test
	public void testMethods() {
		ATest f = new ATest();
		final ATest t = new ATest("hey");
		t.logStart();
		t.
		assertEquals("hey", t.getName());
		t.assertIsEquals("a", "a");
		t.assertIsEquals("a,", "a", "a");
		t.assertIsFalse(false);
		t.assertIsFalse("a", false);
		t.assertIsTrue(true);
		t.assertIsTrue("a", true);
		t.assertIsNotNull("a");
		t.assertIsNotNull("a", "a");
		t.assertIsNotSame("a", "b");
		t.assertIsNotSame("a", "a","b");
		t.assertIsNull(null);
		t.assertIsNull("a", null);
		t.assertCollectionEquals(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
		t.assertMapEquals(Collections.EMPTY_MAP, Collections.EMPTY_MAP);
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				t.waiter();
			}
		};
		Thread thread = new Thread(r);
		thread.start();
		t.setLastTestFinished();
	}
}
