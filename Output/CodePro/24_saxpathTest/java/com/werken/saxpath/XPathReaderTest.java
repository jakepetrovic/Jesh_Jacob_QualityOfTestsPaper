package com.werken.saxpath;

import org.junit.*;
import static org.junit.Assert.*;
import org.saxpath.XPathHandler;
import org.saxpath.XPathSyntaxException;

/**
 * The class <code>XPathReaderTest</code> contains tests for the class <code>{@link XPathReader}</code>.
 *
 * @generatedBy CodePro at 7/4/15 1:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XPathReaderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see XPathReader
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private XPathReader fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see XPathReader
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private XPathReader fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XPathReader
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public XPathReader getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new XPathReader();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XPathReader
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public XPathReader getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new XPathReader();
			fixture2.setXPathHandler(DefaultXPathHandler.getInstance());
		}
		return fixture2;
	}

	/**
	 * Run the XPathReader() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testXPathReader_1()
		throws Exception {

		XPathReader result = new XPathReader();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int LA(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLA_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();
		int position = 0;

		int result = fixture.LA(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		assertEquals(0, result);
	}

	/**
	 * Run the int LA(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLA_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();
		int position = 1;

		int result = fixture.LA(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		assertEquals(0, result);
	}

	/**
	 * Run the int LA(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLA_fixture1_2()
		throws Exception {
		XPathReader fixture = getFixture1();
		int position = 7;

		int result = fixture.LA(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		assertEquals(0, result);
	}

	/**
	 * Run the int LA(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLA_fixture1_3()
		throws Exception {
		XPathReader fixture = getFixture1();
		int position = 1;

		int result = fixture.LA(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		assertEquals(0, result);
	}

	/**
	 * Run the int LA(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLA_fixture2_2()
		throws Exception {
		XPathReader fixture = getFixture2();
		int position = 7;

		int result = fixture.LA(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		assertEquals(0, result);
	}

	/**
	 * Run the int LA(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLA_fixture2_3()
		throws Exception {
		XPathReader fixture = getFixture2();
		int position = 0;

		int result = fixture.LA(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		assertEquals(0, result);
	}

	/**
	 * Run the Token LT(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLT_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();
		int position = 0;

		Token result = fixture.LT(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		assertNotNull(result);
	}

	/**
	 * Run the Token LT(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLT_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();
		int position = 3;

		Token result = fixture.LT(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		assertNotNull(result);
	}

	/**
	 * Run the Token LT(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLT_fixture2_2()
		throws Exception {
		XPathReader fixture = getFixture2();
		int position = 0;

		Token result = fixture.LT(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		assertNotNull(result);
	}

	/**
	 * Run the Token LT(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLT_fixture1_2()
		throws Exception {
		XPathReader fixture = getFixture1();
		int position = 3;

		Token result = fixture.LT(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		assertNotNull(result);
	}

	/**
	 * Run the void abbrStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testAbbrStep_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.abbrStep();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.abbrStep(XPathReader.java:740)
	}

	/**
	 * Run the void abbrStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testAbbrStep_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.abbrStep();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.abbrStep(XPathReader.java:740)
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testAbsoluteLocationPath_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.absoluteLocationPath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.absoluteLocationPath(XPathReader.java:372)
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testAbsoluteLocationPath_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.absoluteLocationPath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.absoluteLocationPath(XPathReader.java:372)
	}

	/**
	 * Run the void additiveExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testAdditiveExpr_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.additiveExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
		//       at com.werken.saxpath.XPathReader.additiveExpr(XPathReader.java:919)
	}

	/**
	 * Run the void additiveExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testAdditiveExpr_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.additiveExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
		//       at com.werken.saxpath.XPathReader.additiveExpr(XPathReader.java:919)
	}

	/**
	 * Run the void andExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testAndExpr_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.andExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
		//       at com.werken.saxpath.XPathReader.additiveExpr(XPathReader.java:919)
		//       at com.werken.saxpath.XPathReader.relationalExpr(XPathReader.java:876)
		//       at com.werken.saxpath.XPathReader.equalityExpr(XPathReader.java:847)
		//       at com.werken.saxpath.XPathReader.andExpr(XPathReader.java:825)
	}

	/**
	 * Run the void andExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testAndExpr_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.andExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
		//       at com.werken.saxpath.XPathReader.additiveExpr(XPathReader.java:919)
		//       at com.werken.saxpath.XPathReader.relationalExpr(XPathReader.java:876)
		//       at com.werken.saxpath.XPathReader.equalityExpr(XPathReader.java:847)
		//       at com.werken.saxpath.XPathReader.andExpr(XPathReader.java:825)
	}

	/**
	 * Run the void arguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testArguments_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.arguments();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.arguments(XPathReader.java:250)
	}

	/**
	 * Run the void arguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testArguments_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.arguments();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.arguments(XPathReader.java:250)
	}

	/**
	 * Run the int axisSpecifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testAxisSpecifier_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		int result = fixture.axisSpecifier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.axisSpecifier(XPathReader.java:568)
		assertEquals(0, result);
	}

	/**
	 * Run the int axisSpecifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testAxisSpecifier_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		int result = fixture.axisSpecifier();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.axisSpecifier(XPathReader.java:568)
		assertEquals(0, result);
	}

	/**
	 * Run the void equalityExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEqualityExpr_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.equalityExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
		//       at com.werken.saxpath.XPathReader.additiveExpr(XPathReader.java:919)
		//       at com.werken.saxpath.XPathReader.relationalExpr(XPathReader.java:876)
		//       at com.werken.saxpath.XPathReader.equalityExpr(XPathReader.java:847)
	}

	/**
	 * Run the void equalityExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testEqualityExpr_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.equalityExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
		//       at com.werken.saxpath.XPathReader.additiveExpr(XPathReader.java:919)
		//       at com.werken.saxpath.XPathReader.relationalExpr(XPathReader.java:876)
		//       at com.werken.saxpath.XPathReader.equalityExpr(XPathReader.java:847)
	}

	/**
	 * Run the void expr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testExpr_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.expr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
		//       at com.werken.saxpath.XPathReader.additiveExpr(XPathReader.java:919)
		//       at com.werken.saxpath.XPathReader.relationalExpr(XPathReader.java:876)
		//       at com.werken.saxpath.XPathReader.equalityExpr(XPathReader.java:847)
		//       at com.werken.saxpath.XPathReader.andExpr(XPathReader.java:825)
		//       at com.werken.saxpath.XPathReader.orExpr(XPathReader.java:803)
		//       at com.werken.saxpath.XPathReader.expr(XPathReader.java:796)
	}

	/**
	 * Run the void expr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testExpr_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.expr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
		//       at com.werken.saxpath.XPathReader.additiveExpr(XPathReader.java:919)
		//       at com.werken.saxpath.XPathReader.relationalExpr(XPathReader.java:876)
		//       at com.werken.saxpath.XPathReader.equalityExpr(XPathReader.java:847)
		//       at com.werken.saxpath.XPathReader.andExpr(XPathReader.java:825)
		//       at com.werken.saxpath.XPathReader.orExpr(XPathReader.java:803)
		//       at com.werken.saxpath.XPathReader.expr(XPathReader.java:796)
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testFilterExpr_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.filterExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.filterExpr(XPathReader.java:270)
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testFilterExpr_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.filterExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.filterExpr(XPathReader.java:270)
	}

	/**
	 * Run the void functionCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testFunctionCall_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.functionCall();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.functionCall(XPathReader.java:224)
	}

	/**
	 * Run the void functionCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testFunctionCall_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.functionCall();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.functionCall(XPathReader.java:224)
	}

	/**
	 * Run the XPathHandler getXPathHandler() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetXPathHandler_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		XPathHandler result = fixture.getXPathHandler();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the XPathHandler getXPathHandler() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetXPathHandler_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		XPathHandler result = fixture.getXPathHandler();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isNodeTypeName(Token) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testIsNodeTypeName_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();
		Token name = new Token(-1, (String) null, -1, -1);

		boolean result = fixture.isNodeTypeName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.Token.getTokenText(Token.java:101)
		//       at com.werken.saxpath.XPathReader.isNodeTypeName(XPathReader.java:1064)
		assertTrue(result);
	}

	/**
	 * Run the boolean isNodeTypeName(Token) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testIsNodeTypeName_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();
		Token name = new Token(0, "", 0, 0);

		boolean result = fixture.isNodeTypeName(name);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNodeTypeName(Token) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testIsNodeTypeName_fixture1_2()
		throws Exception {
		XPathReader fixture = getFixture1();
		Token name = new Token(1, "0123456789", 1, 1);

		boolean result = fixture.isNodeTypeName(name);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNodeTypeName(Token) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testIsNodeTypeName_fixture2_2()
		throws Exception {
		XPathReader fixture = getFixture2();
		Token name = new Token(7, "An��t-1.0.txt", 7, 7);

		boolean result = fixture.isNodeTypeName(name);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNodeTypeName(Token) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testIsNodeTypeName_fixture2_3()
		throws Exception {
		XPathReader fixture = getFixture2();
		Token name = new Token(-1, (String) null, -1, -1);

		boolean result = fixture.isNodeTypeName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.Token.getTokenText(Token.java:101)
		//       at com.werken.saxpath.XPathReader.isNodeTypeName(XPathReader.java:1064)
		assertTrue(result);
	}

	/**
	 * Run the boolean isNodeTypeName(Token) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testIsNodeTypeName_fixture1_3()
		throws Exception {
		XPathReader fixture = getFixture1();
		Token name = new Token(0, "", 0, 0);

		boolean result = fixture.isNodeTypeName(name);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNodeTypeName(Token) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testIsNodeTypeName_fixture2_4()
		throws Exception {
		XPathReader fixture = getFixture2();
		Token name = new Token(1, "0123456789", 1, 1);

		boolean result = fixture.isNodeTypeName(name);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNodeTypeName(Token) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testIsNodeTypeName_fixture1_4()
		throws Exception {
		XPathReader fixture = getFixture1();
		Token name = new Token(7, "An��t-1.0.txt", 7, 7);

		boolean result = fixture.isNodeTypeName(name);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void literal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLiteral_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.literal();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.literal(XPathReader.java:214)
	}

	/**
	 * Run the void literal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLiteral_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.literal();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.literal(XPathReader.java:214)
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLocationPath_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();
		boolean isAbsolute = false;

		fixture.locationPath(isAbsolute);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.locationPath(XPathReader.java:336)
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLocationPath_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();
		boolean isAbsolute = true;

		fixture.locationPath(isAbsolute);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.locationPath(XPathReader.java:336)
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLocationPath_fixture2_2()
		throws Exception {
		XPathReader fixture = getFixture2();
		boolean isAbsolute = false;

		fixture.locationPath(isAbsolute);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.locationPath(XPathReader.java:336)
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLocationPath_fixture1_2()
		throws Exception {
		XPathReader fixture = getFixture1();
		boolean isAbsolute = true;

		fixture.locationPath(isAbsolute);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.locationPath(XPathReader.java:336)
	}

	/**
	 * Run the Token match(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testMatch_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();
		int tokenType = 0;

		Token result = fixture.match(tokenType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		assertNotNull(result);
	}

	/**
	 * Run the Token match(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testMatch_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();
		int tokenType = 1;

		Token result = fixture.match(tokenType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		assertNotNull(result);
	}

	/**
	 * Run the Token match(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testMatch_fixture1_2()
		throws Exception {
		XPathReader fixture = getFixture1();
		int tokenType = 7;

		Token result = fixture.match(tokenType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		assertNotNull(result);
	}

	/**
	 * Run the Token match(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testMatch_fixture1_3()
		throws Exception {
		XPathReader fixture = getFixture1();
		int tokenType = 1;

		Token result = fixture.match(tokenType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		assertNotNull(result);
	}

	/**
	 * Run the Token match(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testMatch_fixture2_2()
		throws Exception {
		XPathReader fixture = getFixture2();
		int tokenType = 7;

		Token result = fixture.match(tokenType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		assertNotNull(result);
	}

	/**
	 * Run the Token match(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testMatch_fixture2_3()
		throws Exception {
		XPathReader fixture = getFixture2();
		int tokenType = 0;

		Token result = fixture.match(tokenType);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		assertNotNull(result);
	}

	/**
	 * Run the void multiplicativeExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testMultiplicativeExpr_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.multiplicativeExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
	}

	/**
	 * Run the void multiplicativeExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testMultiplicativeExpr_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.multiplicativeExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
	}

	/**
	 * Run the void nameTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNameTest_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();
		int axis = 0;

		fixture.nameTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.nameTest(XPathReader.java:692)
	}

	/**
	 * Run the void nameTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNameTest_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();
		int axis = 1;

		fixture.nameTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.nameTest(XPathReader.java:692)
	}

	/**
	 * Run the void nameTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNameTest_fixture1_2()
		throws Exception {
		XPathReader fixture = getFixture1();
		int axis = 7;

		fixture.nameTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.nameTest(XPathReader.java:692)
	}

	/**
	 * Run the void nameTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNameTest_fixture1_3()
		throws Exception {
		XPathReader fixture = getFixture1();
		int axis = 1;

		fixture.nameTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.nameTest(XPathReader.java:692)
	}

	/**
	 * Run the void nameTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNameTest_fixture2_2()
		throws Exception {
		XPathReader fixture = getFixture2();
		int axis = 7;

		fixture.nameTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.nameTest(XPathReader.java:692)
	}

	/**
	 * Run the void nameTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNameTest_fixture2_3()
		throws Exception {
		XPathReader fixture = getFixture2();
		int axis = 0;

		fixture.nameTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.nameTest(XPathReader.java:692)
	}

	/**
	 * Run the void nodeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNodeTest_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();
		int axis = 0;

		fixture.nodeTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.nodeTest(XPathReader.java:599)
	}

	/**
	 * Run the void nodeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNodeTest_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();
		int axis = 1;

		fixture.nodeTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.nodeTest(XPathReader.java:599)
	}

	/**
	 * Run the void nodeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNodeTest_fixture1_2()
		throws Exception {
		XPathReader fixture = getFixture1();
		int axis = 7;

		fixture.nodeTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.nodeTest(XPathReader.java:599)
	}

	/**
	 * Run the void nodeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNodeTest_fixture1_3()
		throws Exception {
		XPathReader fixture = getFixture1();
		int axis = 1;

		fixture.nodeTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.nodeTest(XPathReader.java:599)
	}

	/**
	 * Run the void nodeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNodeTest_fixture2_2()
		throws Exception {
		XPathReader fixture = getFixture2();
		int axis = 7;

		fixture.nodeTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.nodeTest(XPathReader.java:599)
	}

	/**
	 * Run the void nodeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNodeTest_fixture2_3()
		throws Exception {
		XPathReader fixture = getFixture2();
		int axis = 0;

		fixture.nodeTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.nodeTest(XPathReader.java:599)
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNodeTypeTest_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();
		int axis = 0;

		fixture.nodeTypeTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.nodeTypeTest(XPathReader.java:628)
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNodeTypeTest_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.nodeTypeTest(XPathReader.java:628)
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNodeTypeTest_fixture1_2()
		throws Exception {
		XPathReader fixture = getFixture1();
		int axis = 7;

		fixture.nodeTypeTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.nodeTypeTest(XPathReader.java:628)
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNodeTypeTest_fixture1_3()
		throws Exception {
		XPathReader fixture = getFixture1();
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.nodeTypeTest(XPathReader.java:628)
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNodeTypeTest_fixture2_2()
		throws Exception {
		XPathReader fixture = getFixture2();
		int axis = 7;

		fixture.nodeTypeTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.nodeTypeTest(XPathReader.java:628)
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNodeTypeTest_fixture2_3()
		throws Exception {
		XPathReader fixture = getFixture2();
		int axis = 0;

		fixture.nodeTypeTest(axis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.nodeTypeTest(XPathReader.java:628)
	}

	/**
	 * Run the void numberDouble() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNumberDouble_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.numberDouble();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.numberDouble(XPathReader.java:200)
	}

	/**
	 * Run the void numberDouble() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNumberDouble_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.numberDouble();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.numberDouble(XPathReader.java:200)
	}

	/**
	 * Run the void numberInteger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNumberInteger_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.numberInteger();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.numberInteger(XPathReader.java:207)
	}

	/**
	 * Run the void numberInteger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testNumberInteger_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.numberInteger();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.numberInteger(XPathReader.java:207)
	}

	/**
	 * Run the void orExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testOrExpr_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.orExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
		//       at com.werken.saxpath.XPathReader.additiveExpr(XPathReader.java:919)
		//       at com.werken.saxpath.XPathReader.relationalExpr(XPathReader.java:876)
		//       at com.werken.saxpath.XPathReader.equalityExpr(XPathReader.java:847)
		//       at com.werken.saxpath.XPathReader.andExpr(XPathReader.java:825)
		//       at com.werken.saxpath.XPathReader.orExpr(XPathReader.java:803)
	}

	/**
	 * Run the void orExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testOrExpr_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.orExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
		//       at com.werken.saxpath.XPathReader.additiveExpr(XPathReader.java:919)
		//       at com.werken.saxpath.XPathReader.relationalExpr(XPathReader.java:876)
		//       at com.werken.saxpath.XPathReader.equalityExpr(XPathReader.java:847)
		//       at com.werken.saxpath.XPathReader.andExpr(XPathReader.java:825)
		//       at com.werken.saxpath.XPathReader.orExpr(XPathReader.java:803)
	}

	/**
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testParse_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();
		String xpath = "0123456789";

		fixture.parse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testParse_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();
		String xpath = "0123456789";

		fixture.parse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test(expected = org.saxpath.XPathSyntaxException.class)
	public void testParse_fixture1_2()
		throws Exception {
		XPathReader fixture = getFixture1();
		String xpath = "";

		fixture.parse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test(expected = org.saxpath.XPathSyntaxException.class)
	public void testParse_fixture2_2()
		throws Exception {
		XPathReader fixture = getFixture2();
		String xpath = "";

		fixture.parse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPathExpr_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.pathExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.pathExpr(XPathReader.java:128)
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPathExpr_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.pathExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.pathExpr(XPathReader.java:128)
	}

	/**
	 * Run the void predicate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPredicate_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.predicate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.predicate(XPathReader.java:780)
	}

	/**
	 * Run the void predicate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPredicate_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.predicate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.predicate(XPathReader.java:780)
	}

	/**
	 * Run the void predicateExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPredicateExpr_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.predicateExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
		//       at com.werken.saxpath.XPathReader.additiveExpr(XPathReader.java:919)
		//       at com.werken.saxpath.XPathReader.relationalExpr(XPathReader.java:876)
		//       at com.werken.saxpath.XPathReader.equalityExpr(XPathReader.java:847)
		//       at com.werken.saxpath.XPathReader.andExpr(XPathReader.java:825)
		//       at com.werken.saxpath.XPathReader.orExpr(XPathReader.java:803)
		//       at com.werken.saxpath.XPathReader.expr(XPathReader.java:796)
		//       at com.werken.saxpath.XPathReader.predicateExpr(XPathReader.java:791)
	}

	/**
	 * Run the void predicateExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPredicateExpr_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.predicateExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
		//       at com.werken.saxpath.XPathReader.additiveExpr(XPathReader.java:919)
		//       at com.werken.saxpath.XPathReader.relationalExpr(XPathReader.java:876)
		//       at com.werken.saxpath.XPathReader.equalityExpr(XPathReader.java:847)
		//       at com.werken.saxpath.XPathReader.andExpr(XPathReader.java:825)
		//       at com.werken.saxpath.XPathReader.orExpr(XPathReader.java:803)
		//       at com.werken.saxpath.XPathReader.expr(XPathReader.java:796)
		//       at com.werken.saxpath.XPathReader.predicateExpr(XPathReader.java:791)
	}

	/**
	 * Run the void predicates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPredicates_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.predicates();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.predicates(XPathReader.java:765)
	}

	/**
	 * Run the void predicates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testPredicates_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.predicates();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.predicates(XPathReader.java:765)
	}

	/**
	 * Run the void relationalExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testRelationalExpr_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.relationalExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
		//       at com.werken.saxpath.XPathReader.additiveExpr(XPathReader.java:919)
		//       at com.werken.saxpath.XPathReader.relationalExpr(XPathReader.java:876)
	}

	/**
	 * Run the void relationalExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testRelationalExpr_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.relationalExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
		//       at com.werken.saxpath.XPathReader.multiplicativeExpr(XPathReader.java:948)
		//       at com.werken.saxpath.XPathReader.additiveExpr(XPathReader.java:919)
		//       at com.werken.saxpath.XPathReader.relationalExpr(XPathReader.java:876)
	}

	/**
	 * Run the void relativeLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testRelativeLocationPath_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.relativeLocationPath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.relativeLocationPath(XPathReader.java:428)
	}

	/**
	 * Run the void relativeLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testRelativeLocationPath_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.relativeLocationPath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.relativeLocationPath(XPathReader.java:428)
	}

	/**
	 * Run the void setUpParse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSetUpParse_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();
		String xpath = "";

		fixture.setUpParse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void setUpParse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSetUpParse_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();
		String xpath = "0123456789";

		fixture.setUpParse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void setUpParse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSetUpParse_fixture2_2()
		throws Exception {
		XPathReader fixture = getFixture2();
		String xpath = "";

		fixture.setUpParse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void setUpParse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSetUpParse_fixture1_2()
		throws Exception {
		XPathReader fixture = getFixture1();
		String xpath = "0123456789";

		fixture.setUpParse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void setXPathHandler(XPathHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSetXPathHandler_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();
		XPathHandler handler = DefaultXPathHandler.getInstance();

		fixture.setXPathHandler(handler);

		// add additional test code here
	}

	/**
	 * Run the void setXPathHandler(XPathHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSetXPathHandler_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();
		XPathHandler handler = DefaultXPathHandler.getInstance();

		fixture.setXPathHandler(handler);

		// add additional test code here
	}

	/**
	 * Run the void step(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStep_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();
		boolean first = false;

		fixture.step(first);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.step(XPathReader.java:529)
	}

	/**
	 * Run the void step(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStep_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();
		boolean first = true;

		fixture.step(first);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.step(XPathReader.java:529)
	}

	/**
	 * Run the void step(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStep_fixture2_2()
		throws Exception {
		XPathReader fixture = getFixture2();
		boolean first = false;

		fixture.step(first);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.step(XPathReader.java:529)
	}

	/**
	 * Run the void step(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testStep_fixture1_2()
		throws Exception {
		XPathReader fixture = getFixture1();
		boolean first = true;

		fixture.step(first);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.step(XPathReader.java:529)
	}

	/**
	 * Run the void steps() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSteps_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.steps();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.steps(XPathReader.java:453)
	}

	/**
	 * Run the void steps() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testSteps_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.steps();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.steps(XPathReader.java:453)
	}

	/**
	 * Run the void throwInvalidAxis(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testThrowInvalidAxis_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();
		String invalidAxis = "";

		fixture.throwInvalidAxis(invalidAxis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.throwInvalidAxis(XPathReader.java:1092)
	}

	/**
	 * Run the void throwInvalidAxis(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testThrowInvalidAxis_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();
		String invalidAxis = "0123456789";

		fixture.throwInvalidAxis(invalidAxis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.throwInvalidAxis(XPathReader.java:1092)
	}

	/**
	 * Run the void throwInvalidAxis(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testThrowInvalidAxis_fixture2_2()
		throws Exception {
		XPathReader fixture = getFixture2();
		String invalidAxis = "";

		fixture.throwInvalidAxis(invalidAxis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.throwInvalidAxis(XPathReader.java:1092)
	}

	/**
	 * Run the void throwInvalidAxis(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testThrowInvalidAxis_fixture1_2()
		throws Exception {
		XPathReader fixture = getFixture1();
		String invalidAxis = "0123456789";

		fixture.throwInvalidAxis(invalidAxis);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.throwInvalidAxis(XPathReader.java:1092)
	}

	/**
	 * Run the void throwSyntaxException(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testThrowSyntaxException_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();
		String message = "";

		fixture.throwSyntaxException(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.throwSyntaxException(XPathReader.java:1082)
	}

	/**
	 * Run the void throwSyntaxException(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testThrowSyntaxException_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();
		String message = "0123456789";

		fixture.throwSyntaxException(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.throwSyntaxException(XPathReader.java:1082)
	}

	/**
	 * Run the void throwSyntaxException(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testThrowSyntaxException_fixture2_2()
		throws Exception {
		XPathReader fixture = getFixture2();
		String message = "";

		fixture.throwSyntaxException(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.throwSyntaxException(XPathReader.java:1082)
	}

	/**
	 * Run the void throwSyntaxException(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testThrowSyntaxException_fixture1_2()
		throws Exception {
		XPathReader fixture = getFixture1();
		String message = "0123456789";

		fixture.throwSyntaxException(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.throwSyntaxException(XPathReader.java:1082)
	}

	/**
	 * Run the void throwUnexpected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testThrowUnexpected_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.throwUnexpected();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.throwUnexpected(XPathReader.java:1104)
	}

	/**
	 * Run the void throwUnexpected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testThrowUnexpected_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.throwUnexpected();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.throwUnexpected(XPathReader.java:1104)
	}

	/**
	 * Run the void unaryExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testUnaryExpr_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.unaryExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
	}

	/**
	 * Run the void unaryExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testUnaryExpr_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.unaryExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.unaryExpr(XPathReader.java:986)
	}

	/**
	 * Run the void unionExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testUnionExpr_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.unionExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.pathExpr(XPathReader.java:128)
		//       at com.werken.saxpath.XPathReader.unionExpr(XPathReader.java:1009)
	}

	/**
	 * Run the void unionExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testUnionExpr_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.unionExpr();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.LA(XPathReader.java:1046)
		//       at com.werken.saxpath.XPathReader.pathExpr(XPathReader.java:128)
		//       at com.werken.saxpath.XPathReader.unionExpr(XPathReader.java:1009)
	}

	/**
	 * Run the void variableReference() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testVariableReference_fixture1_1()
		throws Exception {
		XPathReader fixture = getFixture1();

		fixture.variableReference();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.variableReference(XPathReader.java:313)
	}

	/**
	 * Run the void variableReference() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testVariableReference_fixture2_1()
		throws Exception {
		XPathReader fixture = getFixture2();

		fixture.variableReference();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.XPathReader.LT(XPathReader.java:1051)
		//       at com.werken.saxpath.XPathReader.match(XPathReader.java:1029)
		//       at com.werken.saxpath.XPathReader.variableReference(XPathReader.java:313)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
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
	 * @generatedBy CodePro at 7/4/15 1:00 PM
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
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XPathReaderTest.class);
	}
}