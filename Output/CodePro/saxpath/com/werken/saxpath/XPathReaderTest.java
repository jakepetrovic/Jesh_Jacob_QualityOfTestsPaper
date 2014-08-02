package com.werken.saxpath;

import org.junit.*;
import saxpath.XPathSyntaxException;
import saxpath.SAXPathException;
import saxpath.conformance.ConformanceXPathHandler;
import saxpath.XPathHandler;
import static org.junit.Assert.*;

/**
 * The class <code>XPathReaderTest</code> contains tests for the class <code>{@link XPathReader}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:36 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class XPathReaderTest {
	/**
	 * Run the XPathReader() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testXPathReader_1()
		throws Exception {

		XPathReader result = new XPathReader();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/werken/saxpath/XPathReader : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the int LA(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLA_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int position = 1;

		int result = fixture.LA(position);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Token LT(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLT_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int position = 1;

		Token result = fixture.LT(position);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token LT(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLT_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int position = 0;

		Token result = fixture.LT(position);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token LT(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLT_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int position = 1;

		Token result = fixture.LT(position);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void abbrStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAbbrStep_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.abbrStep();

		// add additional test code here
	}

	/**
	 * Run the void abbrStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAbbrStep_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.abbrStep();

		// add additional test code here
	}

	/**
	 * Run the void abbrStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAbbrStep_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.abbrStep();

		// add additional test code here
	}

	/**
	 * Run the void abbrStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAbbrStep_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.abbrStep();

		// add additional test code here
	}

	/**
	 * Run the void abbrStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAbbrStep_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.abbrStep();

		// add additional test code here
	}

	/**
	 * Run the void abbrStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAbbrStep_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.abbrStep();

		// add additional test code here
	}

	/**
	 * Run the void abbrStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAbbrStep_7()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.abbrStep();

		// add additional test code here
	}

	/**
	 * Run the void abbrStep() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAbbrStep_8()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.abbrStep();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAbsoluteLocationPath_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAbsoluteLocationPath_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAbsoluteLocationPath_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAbsoluteLocationPath_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAbsoluteLocationPath_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAbsoluteLocationPath_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAbsoluteLocationPath_7()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAbsoluteLocationPath_8()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAbsoluteLocationPath_9()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAbsoluteLocationPath_10()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAbsoluteLocationPath_11()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAbsoluteLocationPath_12()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAbsoluteLocationPath_13()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAbsoluteLocationPath_14()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAbsoluteLocationPath_15()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void absoluteLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAbsoluteLocationPath_16()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.absoluteLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void additiveExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAdditiveExpr_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.additiveExpr();

		// add additional test code here
	}

	/**
	 * Run the void additiveExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAdditiveExpr_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.additiveExpr();

		// add additional test code here
	}

	/**
	 * Run the void additiveExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAdditiveExpr_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.additiveExpr();

		// add additional test code here
	}

	/**
	 * Run the void additiveExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAdditiveExpr_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.additiveExpr();

		// add additional test code here
	}

	/**
	 * Run the void additiveExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAdditiveExpr_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.additiveExpr();

		// add additional test code here
	}

	/**
	 * Run the void additiveExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAdditiveExpr_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.additiveExpr();

		// add additional test code here
	}

	/**
	 * Run the void additiveExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAdditiveExpr_7()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.additiveExpr();

		// add additional test code here
	}

	/**
	 * Run the void andExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAndExpr_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.andExpr();

		// add additional test code here
	}

	/**
	 * Run the void andExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAndExpr_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.andExpr();

		// add additional test code here
	}

	/**
	 * Run the void andExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAndExpr_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.andExpr();

		// add additional test code here
	}

	/**
	 * Run the void andExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAndExpr_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.andExpr();

		// add additional test code here
	}

	/**
	 * Run the void andExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAndExpr_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.andExpr();

		// add additional test code here
	}

	/**
	 * Run the void arguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testArguments_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.arguments();

		// add additional test code here
	}

	/**
	 * Run the void arguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testArguments_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.arguments();

		// add additional test code here
	}

	/**
	 * Run the void arguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testArguments_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.arguments();

		// add additional test code here
	}

	/**
	 * Run the void arguments() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testArguments_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.arguments();

		// add additional test code here
	}

	/**
	 * Run the int axisSpecifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAxisSpecifier_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		int result = fixture.axisSpecifier();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int axisSpecifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAxisSpecifier_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		int result = fixture.axisSpecifier();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int axisSpecifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testAxisSpecifier_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		int result = fixture.axisSpecifier();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void equalityExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testEqualityExpr_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.equalityExpr();

		// add additional test code here
	}

	/**
	 * Run the void equalityExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testEqualityExpr_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.equalityExpr();

		// add additional test code here
	}

	/**
	 * Run the void equalityExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testEqualityExpr_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.equalityExpr();

		// add additional test code here
	}

	/**
	 * Run the void equalityExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testEqualityExpr_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.equalityExpr();

		// add additional test code here
	}

	/**
	 * Run the void equalityExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testEqualityExpr_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.equalityExpr();

		// add additional test code here
	}

	/**
	 * Run the void equalityExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testEqualityExpr_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.equalityExpr();

		// add additional test code here
	}

	/**
	 * Run the void equalityExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testEqualityExpr_7()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.equalityExpr();

		// add additional test code here
	}

	/**
	 * Run the void expr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testExpr_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.expr();

		// add additional test code here
	}

	/**
	 * Run the void expr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testExpr_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.expr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testFilterExpr_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testFilterExpr_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testFilterExpr_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testFilterExpr_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testFilterExpr_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testFilterExpr_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testFilterExpr_7()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testFilterExpr_8()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testFilterExpr_9()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testFilterExpr_10()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testFilterExpr_11()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testFilterExpr_12()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testFilterExpr_13()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testFilterExpr_14()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void filterExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testFilterExpr_15()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.filterExpr();

		// add additional test code here
	}

	/**
	 * Run the void functionCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testFunctionCall_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.functionCall();

		// add additional test code here
	}

	/**
	 * Run the void functionCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testFunctionCall_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.functionCall();

		// add additional test code here
	}

	/**
	 * Run the void functionCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testFunctionCall_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.functionCall();

		// add additional test code here
	}

	/**
	 * Run the void functionCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testFunctionCall_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.functionCall();

		// add additional test code here
	}

	/**
	 * Run the void functionCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testFunctionCall_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.functionCall();

		// add additional test code here
	}

	/**
	 * Run the XPathHandler getXPathHandler() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testGetXPathHandler_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		XPathHandler result = fixture.getXPathHandler();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isNodeTypeName(Token) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIsNodeTypeName_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		Token name = new Token(1, "", 1, 1);

		boolean result = fixture.isNodeTypeName(name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isNodeTypeName(Token) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIsNodeTypeName_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		Token name = new Token(1, "", 1, 1);

		boolean result = fixture.isNodeTypeName(name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isNodeTypeName(Token) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIsNodeTypeName_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		Token name = new Token(1, "", 1, 1);

		boolean result = fixture.isNodeTypeName(name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isNodeTypeName(Token) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIsNodeTypeName_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		Token name = new Token(1, "", 1, 1);

		boolean result = fixture.isNodeTypeName(name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isNodeTypeName(Token) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIsNodeTypeName_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		Token name = new Token(1, "", 1, 1);

		boolean result = fixture.isNodeTypeName(name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void literal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLiteral_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.literal();

		// add additional test code here
	}

	/**
	 * Run the void literal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testLiteral_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.literal();

		// add additional test code here
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLocationPath_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean isAbsolute = false;

		fixture.locationPath(isAbsolute);

		// add additional test code here
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLocationPath_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean isAbsolute = false;

		fixture.locationPath(isAbsolute);

		// add additional test code here
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLocationPath_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean isAbsolute = true;

		fixture.locationPath(isAbsolute);

		// add additional test code here
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLocationPath_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean isAbsolute = true;

		fixture.locationPath(isAbsolute);

		// add additional test code here
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLocationPath_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean isAbsolute = true;

		fixture.locationPath(isAbsolute);

		// add additional test code here
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLocationPath_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean isAbsolute = true;

		fixture.locationPath(isAbsolute);

		// add additional test code here
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLocationPath_7()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean isAbsolute = true;

		fixture.locationPath(isAbsolute);

		// add additional test code here
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLocationPath_8()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean isAbsolute = true;

		fixture.locationPath(isAbsolute);

		// add additional test code here
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLocationPath_9()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean isAbsolute = true;

		fixture.locationPath(isAbsolute);

		// add additional test code here
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLocationPath_10()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean isAbsolute = true;

		fixture.locationPath(isAbsolute);

		// add additional test code here
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testLocationPath_11()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean isAbsolute = true;

		fixture.locationPath(isAbsolute);

		// add additional test code here
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testLocationPath_12()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean isAbsolute = false;

		fixture.locationPath(isAbsolute);

		// add additional test code here
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testLocationPath_13()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean isAbsolute = true;

		fixture.locationPath(isAbsolute);

		// add additional test code here
	}

	/**
	 * Run the void locationPath(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testLocationPath_14()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean isAbsolute = true;

		fixture.locationPath(isAbsolute);

		// add additional test code here
	}

	/**
	 * Run the Token match(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testMatch_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int tokenType = 1;

		Token result = fixture.match(tokenType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token match(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testMatch_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int tokenType = 1;

		Token result = fixture.match(tokenType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void multiplicativeExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testMultiplicativeExpr_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.multiplicativeExpr();

		// add additional test code here
	}

	/**
	 * Run the void multiplicativeExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testMultiplicativeExpr_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.multiplicativeExpr();

		// add additional test code here
	}

	/**
	 * Run the void multiplicativeExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testMultiplicativeExpr_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.multiplicativeExpr();

		// add additional test code here
	}

	/**
	 * Run the void multiplicativeExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testMultiplicativeExpr_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.multiplicativeExpr();

		// add additional test code here
	}

	/**
	 * Run the void multiplicativeExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testMultiplicativeExpr_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.multiplicativeExpr();

		// add additional test code here
	}

	/**
	 * Run the void multiplicativeExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testMultiplicativeExpr_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.multiplicativeExpr();

		// add additional test code here
	}

	/**
	 * Run the void multiplicativeExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testMultiplicativeExpr_7()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.multiplicativeExpr();

		// add additional test code here
	}

	/**
	 * Run the void multiplicativeExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testMultiplicativeExpr_8()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.multiplicativeExpr();

		// add additional test code here
	}

	/**
	 * Run the void multiplicativeExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testMultiplicativeExpr_9()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.multiplicativeExpr();

		// add additional test code here
	}

	/**
	 * Run the void nameTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNameTest_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nameTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nameTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNameTest_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nameTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nameTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNameTest_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nameTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nameTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNameTest_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nameTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nameTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNameTest_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nameTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nameTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNameTest_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nameTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nameTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNameTest_7()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nameTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNodeTest_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNodeTest_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNodeTest_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNodeTest_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNodeTest_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNodeTest_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNodeTypeTest_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNodeTypeTest_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNodeTypeTest_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNodeTypeTest_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNodeTypeTest_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNodeTypeTest_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNodeTypeTest_7()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNodeTypeTest_8()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNodeTypeTest_9()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNodeTypeTest_10()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNodeTypeTest_11()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNodeTypeTest_12()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNodeTypeTest_13()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNodeTypeTest_14()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNodeTypeTest_15()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void nodeTypeTest(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNodeTypeTest_16()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		int axis = 1;

		fixture.nodeTypeTest(axis);

		// add additional test code here
	}

	/**
	 * Run the void numberDouble() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumberDouble_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.numberDouble();

		// add additional test code here
	}

	/**
	 * Run the void numberDouble() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNumberDouble_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.numberDouble();

		// add additional test code here
	}

	/**
	 * Run the void numberDouble() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testNumberDouble_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.numberDouble();

		// add additional test code here
	}

	/**
	 * Run the void numberInteger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumberInteger_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.numberInteger();

		// add additional test code here
	}

	/**
	 * Run the void numberInteger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testNumberInteger_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.numberInteger();

		// add additional test code here
	}

	/**
	 * Run the void numberInteger() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testNumberInteger_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.numberInteger();

		// add additional test code here
	}

	/**
	 * Run the void orExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testOrExpr_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.orExpr();

		// add additional test code here
	}

	/**
	 * Run the void orExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testOrExpr_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.orExpr();

		// add additional test code here
	}

	/**
	 * Run the void orExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testOrExpr_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.orExpr();

		// add additional test code here
	}

	/**
	 * Run the void orExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testOrExpr_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.orExpr();

		// add additional test code here
	}

	/**
	 * Run the void orExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testOrExpr_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.orExpr();

		// add additional test code here
	}

	/**
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testParse_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		String xpath = "";

		fixture.parse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testParse_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		String xpath = "";

		fixture.parse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testParse_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		String xpath = "";

		fixture.parse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testParse_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		String xpath = "";

		fixture.parse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testParse_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		String xpath = "";

		fixture.parse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void parse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testParse_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		String xpath = "";

		fixture.parse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPathExpr_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPathExpr_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPathExpr_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPathExpr_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPathExpr_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPathExpr_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPathExpr_7()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPathExpr_8()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPathExpr_9()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPathExpr_10()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPathExpr_11()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPathExpr_12()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPathExpr_13()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPathExpr_14()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testPathExpr_15()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void pathExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testPathExpr_16()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.pathExpr();

		// add additional test code here
	}

	/**
	 * Run the void predicate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPredicate_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.predicate();

		// add additional test code here
	}

	/**
	 * Run the void predicate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testPredicate_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.predicate();

		// add additional test code here
	}

	/**
	 * Run the void predicate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testPredicate_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.predicate();

		// add additional test code here
	}

	/**
	 * Run the void predicate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testPredicate_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.predicate();

		// add additional test code here
	}

	/**
	 * Run the void predicateExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPredicateExpr_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.predicateExpr();

		// add additional test code here
	}

	/**
	 * Run the void predicateExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testPredicateExpr_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.predicateExpr();

		// add additional test code here
	}

	/**
	 * Run the void predicates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPredicates_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.predicates();

		// add additional test code here
	}

	/**
	 * Run the void predicates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPredicates_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.predicates();

		// add additional test code here
	}

	/**
	 * Run the void predicates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPredicates_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.predicates();

		// add additional test code here
	}

	/**
	 * Run the void predicates() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testPredicates_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.predicates();

		// add additional test code here
	}

	/**
	 * Run the void relationalExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testRelationalExpr_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relationalExpr();

		// add additional test code here
	}

	/**
	 * Run the void relationalExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testRelationalExpr_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relationalExpr();

		// add additional test code here
	}

	/**
	 * Run the void relationalExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testRelationalExpr_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relationalExpr();

		// add additional test code here
	}

	/**
	 * Run the void relationalExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testRelationalExpr_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relationalExpr();

		// add additional test code here
	}

	/**
	 * Run the void relationalExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testRelationalExpr_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relationalExpr();

		// add additional test code here
	}

	/**
	 * Run the void relationalExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testRelationalExpr_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relationalExpr();

		// add additional test code here
	}

	/**
	 * Run the void relationalExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testRelationalExpr_7()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relationalExpr();

		// add additional test code here
	}

	/**
	 * Run the void relationalExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testRelationalExpr_8()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relationalExpr();

		// add additional test code here
	}

	/**
	 * Run the void relationalExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testRelationalExpr_9()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relationalExpr();

		// add additional test code here
	}

	/**
	 * Run the void relationalExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testRelationalExpr_10()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relationalExpr();

		// add additional test code here
	}

	/**
	 * Run the void relationalExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testRelationalExpr_11()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relationalExpr();

		// add additional test code here
	}

	/**
	 * Run the void relativeLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testRelativeLocationPath_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relativeLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void relativeLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testRelativeLocationPath_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relativeLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void relativeLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testRelativeLocationPath_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relativeLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void relativeLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testRelativeLocationPath_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relativeLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void relativeLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testRelativeLocationPath_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relativeLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void relativeLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testRelativeLocationPath_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relativeLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void relativeLocationPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testRelativeLocationPath_7()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.relativeLocationPath();

		// add additional test code here
	}

	/**
	 * Run the void setUpParse(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testSetUpParse_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		String xpath = "";

		fixture.setUpParse(xpath);

		// add additional test code here
	}

	/**
	 * Run the void setXPathHandler(XPathHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testSetXPathHandler_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		XPathHandler handler = new ConformanceXPathHandler();

		fixture.setXPathHandler(handler);

		// add additional test code here
	}

	/**
	 * Run the void step(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testStep_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean first = true;

		fixture.step(first);

		// add additional test code here
	}

	/**
	 * Run the void step(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testStep_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean first = true;

		fixture.step(first);

		// add additional test code here
	}

	/**
	 * Run the void step(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testStep_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean first = true;

		fixture.step(first);

		// add additional test code here
	}

	/**
	 * Run the void step(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testStep_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean first = true;

		fixture.step(first);

		// add additional test code here
	}

	/**
	 * Run the void step(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testStep_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean first = true;

		fixture.step(first);

		// add additional test code here
	}

	/**
	 * Run the void step(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testStep_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean first = true;

		fixture.step(first);

		// add additional test code here
	}

	/**
	 * Run the void step(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testStep_7()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean first = true;

		fixture.step(first);

		// add additional test code here
	}

	/**
	 * Run the void step(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testStep_8()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean first = true;

		fixture.step(first);

		// add additional test code here
	}

	/**
	 * Run the void step(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testStep_9()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		boolean first = true;

		fixture.step(first);

		// add additional test code here
	}

	/**
	 * Run the void throwInvalidAxis(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.XPathSyntaxException.class)
	public void testThrowInvalidAxis_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		String invalidAxis = "";

		fixture.throwInvalidAxis(invalidAxis);

		// add additional test code here
	}

	/**
	 * Run the void throwSyntaxException(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.XPathSyntaxException.class)
	public void testThrowSyntaxException_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());
		String message = "";

		fixture.throwSyntaxException(message);

		// add additional test code here
	}

	/**
	 * Run the void throwUnexpected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testThrowUnexpected_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.throwUnexpected();

		// add additional test code here
	}

	/**
	 * Run the void throwUnexpected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testThrowUnexpected_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.throwUnexpected();

		// add additional test code here
	}

	/**
	 * Run the void unaryExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testUnaryExpr_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.unaryExpr();

		// add additional test code here
	}

	/**
	 * Run the void unaryExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testUnaryExpr_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.unaryExpr();

		// add additional test code here
	}

	/**
	 * Run the void unaryExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testUnaryExpr_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.unaryExpr();

		// add additional test code here
	}

	/**
	 * Run the void unaryExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testUnaryExpr_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.unaryExpr();

		// add additional test code here
	}

	/**
	 * Run the void unaryExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testUnaryExpr_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.unaryExpr();

		// add additional test code here
	}

	/**
	 * Run the void unaryExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testUnaryExpr_6()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.unaryExpr();

		// add additional test code here
	}

	/**
	 * Run the void unionExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testUnionExpr_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.unionExpr();

		// add additional test code here
	}

	/**
	 * Run the void unionExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testUnionExpr_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.unionExpr();

		// add additional test code here
	}

	/**
	 * Run the void unionExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testUnionExpr_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.unionExpr();

		// add additional test code here
	}

	/**
	 * Run the void unionExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testUnionExpr_4()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.unionExpr();

		// add additional test code here
	}

	/**
	 * Run the void unionExpr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testUnionExpr_5()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.unionExpr();

		// add additional test code here
	}

	/**
	 * Run the void variableReference() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testVariableReference_1()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.variableReference();

		// add additional test code here
	}

	/**
	 * Run the void variableReference() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testVariableReference_2()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.variableReference();

		// add additional test code here
	}

	/**
	 * Run the void variableReference() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test(expected = saxpath.SAXPathException.class)
	public void testVariableReference_3()
		throws Exception {
		XPathReader fixture = new XPathReader();
		fixture.setXPathHandler(new ConformanceXPathHandler());

		fixture.variableReference();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
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
	 * @generatedBy CodePro at 4/8/14 10:36 AM
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
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XPathReaderTest.class);
	}
}