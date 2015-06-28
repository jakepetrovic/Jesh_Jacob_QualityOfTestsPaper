package br.com.jnfe.base.service;

import java.math.BigDecimal;
import br.com.jnfe.base.PIS;
import br.com.jnfe.base.ICMSST;
import br.com.jnfe.base.ICMS;
import org.junit.*;
import br.com.jnfe.base.COFINS;
import br.com.jnfe.base.ICMSExt;
import br.com.jnfe.base.IPI;
import static org.junit.Assert.*;

/**
 * The class <code>NFeCalculatorImplTest</code> contains tests for the class <code>{@link NFeCalculatorImpl}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class NFeCalculatorImplTest {
	/**
	 * Run the NFeCalculatorImpl() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testNFeCalculatorImpl_1()
		throws Exception {
		NFeCalculatorImpl result = new NFeCalculatorImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the BigDecimal calculate(COFINS) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testCalculate_1()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		COFINS cofins = null;

		BigDecimal result = fixture.calculate(cofins);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BigDecimal calculate(COFINS) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testCalculate_2()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		COFINS cofins = null;

		BigDecimal result = fixture.calculate(cofins);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BigDecimal calculate(ICMS) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testCalculate_3()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		ICMS icms = null;

		BigDecimal result = fixture.calculate(icms);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BigDecimal calculate(ICMS) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testCalculate_4()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		ICMS icms = null;

		BigDecimal result = fixture.calculate(icms);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BigDecimal calculate(ICMS) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.UnsupportedOperationException.class)
	public void testCalculate_5()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		ICMS icms = null;

		BigDecimal result = fixture.calculate(icms);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BigDecimal calculate(ICMSExt) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testCalculate_6()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		ICMSExt icms = null;

		BigDecimal result = fixture.calculate(icms);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BigDecimal calculate(ICMSST) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testCalculate_7()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		ICMSST icms = null;

		BigDecimal result = fixture.calculate(icms);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BigDecimal calculate(IPI) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testCalculate_8()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		IPI ipi = null;

		BigDecimal result = fixture.calculate(ipi);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BigDecimal calculate(IPI) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testCalculate_9()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		IPI ipi = null;

		BigDecimal result = fixture.calculate(ipi);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BigDecimal calculate(PIS) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testCalculate_10()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		PIS pis = null;

		BigDecimal result = fixture.calculate(pis);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BigDecimal calculate(PIS) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testCalculate_11()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		PIS pis = null;

		BigDecimal result = fixture.calculate(pis);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BigDecimal internalCalculate(BigDecimal,BigDecimal) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testInternalCalculate_1()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		BigDecimal vBC = new BigDecimal(1.0);
		BigDecimal p = new BigDecimal(1.0);

		BigDecimal result = fixture.internalCalculate(vBC, p);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void validate(BigDecimal,BigDecimal) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testValidate_1()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		BigDecimal aliquota = new BigDecimal(1.0);
		BigDecimal vBC = new BigDecimal(1.0);

		fixture.validate(aliquota, vBC);

		// add additional test code here
	}

	/**
	 * Run the void validate(BigDecimal,BigDecimal) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testValidate_2()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		BigDecimal aliquota = null;
		BigDecimal vBC = new BigDecimal(1.0);

		fixture.validate(aliquota, vBC);

		// add additional test code here
	}

	/**
	 * Run the void validate(BigDecimal,BigDecimal) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testValidate_3()
		throws Exception {
		NFeCalculatorImpl fixture = new NFeCalculatorImpl();
		BigDecimal aliquota = new BigDecimal(1.0);
		BigDecimal vBC = null;

		fixture.validate(aliquota, vBC);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NFeCalculatorImplTest.class);
	}
}