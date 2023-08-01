package com.telstra.test;

import org.junit.Test;

import com.telstra.Calculation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
public class CalculationTest {

	@Test
	public void testcalculation()
	{
		Calculation calculation =new Calculation();
		assertEquals(4, calculation.addition(2, 2));
		System.out.println("test addition");
	}
	@Test
	public void Eligiblitytest() {
		Calculation calculation =new Calculation();
		//assertEquals(4, calculation.addition(2, 2));
		assertTrue(calculation.checkelg(34));
		System.out.println("true condition checked");
	}
	@Before
	public void test() {
		System.out.println("before every test case");
	}
	@After
	public void test2() {
		System.out.println("After is run");
	}
	@BeforeClass
	public static void test3() {
		System.out.println("--------Before All------");
	}
	@AfterClass
	public static void test4() {
		System.out.println("--------After All------");
	}
}
