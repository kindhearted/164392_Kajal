package SimpleCalculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	Calculator calc;

	@Before
	public void init() {
		calc = new Calculator();
		System.out.println("before code is getting executed!!!");
	}
	
	@After
	public void afterBlock()
	{
		System.out.println("after code is getting executed!!!");

	}

	//@Ignore
	@Test
	public void testAddition() {

		int addOutput = calc.addition(9, 21);
		Assert.assertEquals(30, addOutput, 1);
	}

	@Test
	public void testSubstraction() {

		int subOutput = calc.substraction(20, 10);
		Assert.assertEquals(10, subOutput);
	}

	@Test
	public void testMultiplication() {

		int mulOutput = calc.multiplication(10, 20);
		Assert.assertEquals(200, mulOutput);
	}

	@Test
	public void testDivision() {

		int divOutput = calc.division(20, 10);
		Assert.assertEquals(2, divOutput);
	}

}
