package org.adligo.tests_tests.shared;

import java.util.Collections;

import org.adligo.tests.shared.AAssertions;

public class AAssertionsExtension extends AAssertions {

	public void equalsAsserts() {
		assertCollectionEquals(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
		assertEquals((byte) 'a', (byte) 'a');
		assertEquals((byte) 'a', new Byte((byte) 'a'));
		assertEquals(new Byte((byte) 'a'), (byte) 'a');
		assertEquals("a", (byte) 'a', (byte) 'a');
		assertEquals("a", (byte) 'a', new Byte((byte) 'a'));
		assertEquals("a", new Byte((byte) 'a'), (byte) 'a');
		
		assertEquals('a', 'a');
		assertEquals('a', new Character('a'));
		assertEquals(new Character('a'), 'a');
		assertEquals("a", 'a', 'a');
		assertEquals("a", 'a', new Character('a'));
		assertEquals("a", new Character('a'),'a');
		
		
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
		assertEquals((int) 0, new Integer(0));
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
	}
	
	public void notSameAsserts() {
		assertNotSame( 'a',  'b');
		assertNotSame( 'a', new Character( 'b'));
		assertNotSame(new Character( 'a'),  'b');
		assertNotSame("a",  'a',  'b');
		assertNotSame("a",  'a', new Character( 'b'));
		assertNotSame("a", new Character( 'a'),  'b');
		
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
	}
	
	public void notEqualsAsserts() {
		assertNotEquals( 'a',  'b');
		assertNotEquals( 'a', new Character( 'b'));
		assertNotEquals(new Character( 'a'),  'b');
		assertNotEquals("a",  'a',  'b');
		assertNotEquals("a",  'a', new Character( 'b'));
		assertNotEquals("a", new Character( 'a'),  'b');
		
		assertNotEquals((byte) 'a', (byte) 'b');
		assertNotEquals((byte) 'a', new Byte((byte) 'b'));
		assertNotEquals(new Byte((byte) 'a'), (byte) 'b');
		assertNotEquals("a", (byte) 'a', (byte) 'b');
		assertNotEquals("a", (byte) 'a', new Byte((byte) 'b'));
		assertNotEquals("a", new Byte((byte) 'a'), (byte) 'b');
		
		
		assertNotEquals(0.0, 1.0);
		assertNotEquals(0.0, new Double(1.0));
		assertNotEquals(new Double(0.0), 1.0);
		assertNotEquals("a", 0.0, 1.0);
		assertNotEquals("a", 0.0, new Double(1.0));
		assertNotEquals("a", new Double(0.0), 1.0);
		
		assertNotEquals((float) 0.0,(float) 1.0);
		assertNotEquals((float)0.0, new Float(1.0));
		assertNotEquals(new Float(0.0),(float) 1.0);
		assertNotEquals("a",(float) 0.0,(float) 1.0);
		assertNotEquals("a",(float) 0.0, new Float(1.0));
		assertNotEquals("a", new Float(0.0),(float) 1.0);
		
		
		assertNotEquals(0,1);
		assertNotEquals(0, new Integer(1));
		assertNotEquals(new Integer(0),1);
		assertNotEquals("a",0,1);
		assertNotEquals("a",0, new Integer(1));
		assertNotEquals("a", new Integer(0),1);
		
		assertNotEquals(0L,1L);
		assertNotEquals(0L, new Long(1));
		assertNotEquals(new Long(0),1L);
		assertNotEquals("a",0L,1L);
		assertNotEquals("a",0L, new Long(1));
		assertNotEquals("a", new Long(0),1L);
	}
	
	public void miscAsserts() {

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
