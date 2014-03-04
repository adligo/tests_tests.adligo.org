package org.adligo.tests_tests;

import java.util.Collections;

import org.adligo.tests.AAssertions;

public class AAssertionsExtension extends AAssertions {

	public void assertMethods() {
		assertCollectionEquals(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
		assertEquals((byte) 'a', (byte) 'a');
		assertEquals((byte) 'a', new Byte((byte) 'a'));
		assertEquals(new Byte((byte) 'a'), (byte) 'a');
		assertEquals("a", (byte) 'a', (byte) 'a');
		assertEquals("a", (byte) 'a', new Byte((byte) 'a'));
		assertEquals("a", new Byte((byte) 'a'), (byte) 'a');
		
		
		assertEquals(0.0, 0.0);
		assertEquals(0.0, new Double(0.0));
		assertEquals(new Double(0.0), 0.0);
		assertEquals("a", 0.0, 0.0);
		assertEquals("a", 0.0, new Double(0.0));
		assertEquals("a", new Double(0.0), 0.0);
		
		assertEquals((float) 0.0,(float) 0.0);
		assertEquals((float)0.0, new Float(0.0));
		assertEquals(new Float(0.0),(float) 0.0);
		assertEquals("a",(float) 0.0,(float) 0.0);
		assertEquals("a",(float) 0.0, new Float(0.0));
		assertEquals("a", new Float(0.0),(float) 0.0);
		
		
		assertEquals(0,0);
		assertEquals(0, new Integer(0));
		assertEquals(new Integer(0),0);
		assertEquals("a",0,0);
		assertEquals("a",0, new Integer(0));
		assertEquals("a", new Integer(0),0);
		
		assertEquals(0L,0L);
		assertEquals(0L, new Long(0));
		assertEquals(new Long(0),0L);
		assertEquals("a",0L,0L);
		assertEquals("a",0L, new Long(0));
		assertEquals("a", new Long(0),0L);
		
		
		assertNotSame((byte) 'a', (byte) 'b');
		assertNotSame((byte) 'a', new Byte((byte) 'b'));
		assertNotSame(new Byte((byte) 'a'), (byte) 'b');
		assertNotSame("a", (byte) 'a', (byte) 'b');
		assertNotSame("a", (byte) 'a', new Byte((byte) 'b'));
		assertNotSame("a", new Byte((byte) 'a'), (byte) 'b');
		
		
		assertNotSame(0.0, 1.0);
		assertNotSame(0.0, new Double(1.0));
		assertNotSame(new Double(0.0), 1.0);
		assertNotSame("a", 0.0, 1.0);
		assertNotSame("a", 0.0, new Double(1.0));
		assertNotSame("a", new Double(0.0), 1.0);
		
		assertNotSame((float) 0.0,(float) 1.0);
		assertNotSame((float)0.0, new Float(1.0));
		assertNotSame(new Float(0.0),(float) 1.0);
		assertNotSame("a",(float) 0.0,(float) 1.0);
		assertNotSame("a",(float) 0.0, new Float(1.0));
		assertNotSame("a", new Float(0.0),(float) 1.0);
		
		
		assertNotSame(0,1);
		assertNotSame(0, new Integer(1));
		assertNotSame(new Integer(0),1);
		assertNotSame("a",0,1);
		assertNotSame("a",0, new Integer(1));
		assertNotSame("a", new Integer(0),1);
		
		assertNotSame(0L,1L);
		assertNotSame(0L, new Long(1));
		assertNotSame(new Long(0),1L);
		assertNotSame("a",0L,1L);
		assertNotSame("a",0L, new Long(1));
		assertNotSame("a", new Long(0),1L);
		
		assertTrue(true);
		assertTrue("a", true);
		assertFalse(false);
		assertFalse("a", false);
		
		assertNull(null);
		assertEquals("a", "a");
		assertEquals("a", "a", "a");
		assertNotSame("a", "b");
		assertNotSame("a", "a", "b");
		
		assertNotNull("a");
		assertNotNull("a","a");
	}
	
	@Override
	public String getPackage() {
		return AAssertions.class.getPackage().getName();
	}

}
