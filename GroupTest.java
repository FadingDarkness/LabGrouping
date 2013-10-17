package edu.ilstu.it226;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GroupTest {
	Group g1, g2;
	Student st8, st9, st10;
	@Before
	public void setUp() throws Exception {
		Student st1 = new Student("Anne", false, 0),
				st2 = new Student("Bill", true, 0),
				st3 = new Student("Claire", false, 1),
				st4 = new Student("David", true, 1),
				st5 = new Student("Elena", false, 2),
				st6 = new Student("Fred", true, 2),
				st7 = new Student("Gerda", false, 3);
				
				st8 = new Student("0", true, 0);
				st9 = new Student("1", true, 4);
				st10 = new Student("2", true, 1);
		
		g1 = new Group(1);
		g1.add(st1);
		g1.add(st2);
		g1.add(st3);
		g1.add(st4);
		g1.add(st5);
		g1.add(st6);
		g1.add(st7);
	}

	@Test
	public void testCountFemales() {
		int numFemales = g1.countFemales();
		assertEquals(4, numFemales);
	}

	@Test
	public void testCountMales() {
		int numMales = g1.countMales();
		assertEquals(3, numMales);
	}

	@Test
	public void testHasPreviousMemberNoPreviousGroup() {
		assertFalse(g1.hasPreviousMember(st8));
	}
	
	@Test
	public void testHasPreviousMemberPreviousGroup() {
		assertFalse(g1.hasPreviousMember(st9));
	}

	@Test
	public void testHasPreviousMemberPreviousMember() {
		assertTrue(g1.hasPreviousMember(st10));
	}
}
