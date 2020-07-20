package com.epam.tddjunitassignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteIfFirst2ATest {
/*
 * 1 A  -  “ABCD” => “BCD” 
   2 A -  “AACD” => “CD”  
   1 A 2nd char -  “BACD” => “BCD” 
   No A -  “BBAA” => “BBAA”        
   2 A  -  “AABAA” => “BAA” 
   empty char
   single A
   single non A
   two A's
*/
	RemoveIfFirst2Chars r= new RemoveIfFirst2Chars();
	@Test
	public void test1As() {
	assertEquals("BCD",r.remove("ABCD"));
	}
	@Test
	public void test2As() {
	assertEquals("CD",r.remove("AACD"));
	}
	@Test
	public void testsecondAs() {
	assertEquals("BCD",r.remove("BACD"));
	}
	@Test
	public void testnoAs() {
	assertEquals("BBAA",r.remove("BBAA"));
	}
	@Test
	public void testmoreAs() {
	assertEquals("BAA",r.remove("AABAA"));
	}
	@Test
	public void testZeroChars() {
	assertEquals("",r.remove(""));
	}
	@Test
	public void testsingleAChars() {
	assertEquals("",r.remove("A"));
	}
	@Test
	public void testsingleChar() {
	assertEquals("B",r.remove("B"));
	}
	@Test
	public void testtwoAsChars() {
	assertEquals("",r.remove("AA"));
	}
}
