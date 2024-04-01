package com.app.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.app.service.Arithmetic;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testWithPositive() {
		//create Service class Object
		Arithmetic ar=new Arithmetic();
		float expected=30.0f;
		float actual=ar.sum(10.0f, 20.0f);
		assertEquals(expected, actual);
	}
	@Test
	public void testWithNegative() {
		//create Service class Object
		Arithmetic ar=new Arithmetic();
		float expected=-30.0f;
		float actual=ar.sum(-10.0f, -20.0f);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testWithZero() {
		//create Service class Object
		Arithmetic ar=new Arithmetic();
		float expected=0.0f;
		float actual=ar.sum(0.0f, 0.0f);
		assertEquals(expected, actual);
	}
	@Test
	public void testWithMixedValues() {
		//create Service class Object
		Arithmetic ar=new Arithmetic();
		float expected=-10.0f;
		float actual=ar.sum(10.0f, -20.0f);
		assertEquals(expected, actual);
	}
   
}
