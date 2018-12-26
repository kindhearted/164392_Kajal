package SimpleCalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

class CalculatorTest {
	Calculator calc;

	@Before
	public void init() {
		calc = new Calculator();
	}

	@Ignore
	@Test
	void testAddition() {

		int addOutput = calc.addition(9, 21);
		Assert.assertEquals(30, addOutput, 1);
	}

	@Test
	void testSubstraction() {

		int subOutput = calc.substraction(20, 10);
		Assert.assertEquals(10, subOutput);
	}

	@Test
	void testMultiplication() {

		int mulOutput = calc.multiplication(10, 20);
		Assert.assertEquals(200, mulOutput);
	}

	@Test
	void testDivision() {

		int divOutput = calc.division(20, 10);
		Assert.assertEquals(2, divOutput);
	}

}
