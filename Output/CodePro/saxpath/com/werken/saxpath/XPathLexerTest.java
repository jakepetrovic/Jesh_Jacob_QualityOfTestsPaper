package com.werken.saxpath;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>XPathLexerTest</code> contains tests for the class <code>{@link XPathLexer}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:36 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class XPathLexerTest {
	/**
	 * Run the XPathLexer() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testXPathLexer_1()
		throws Exception {

		XPathLexer result = new XPathLexer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/werken/saxpath/XPathLexer : Unsupported major.minor version 51.0
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
	 * Run the XPathLexer(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testXPathLexer_2()
		throws Exception {
		String xpath = "";

		XPathLexer result = new XPathLexer(xpath);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/werken/saxpath/XPathLexer : Unsupported major.minor version 51.0
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
	 * Run the char LA(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLA_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();
		int i = 1;

		char result = fixture.LA(i);

		// add additional test code here
		assertEquals(' ', result);
	}

	/**
	 * Run the char LA(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLA_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("aa");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();
		int i = 1;

		char result = fixture.LA(i);

		// add additional test code here
		assertEquals(' ', result);
	}

	/**
	 * Run the Token and() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAnd_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.and();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token and() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAnd_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.and();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token and() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAnd_3()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.and();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token and() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAnd_4()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.and();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token and() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAnd_5()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.and();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token at() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testAt_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.at();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token colon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testColon_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.colon();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token comma() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testComma_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.comma();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void consume() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testConsume_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		fixture.consume();

		// add additional test code here
	}

	/**
	 * Run the void consume(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testConsume_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();
		int i = 1;

		fixture.consume(i);

		// add additional test code here
	}

	/**
	 * Run the int currentPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testCurrentPosition_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		int result = fixture.currentPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Token div() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testDiv_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.div();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token div() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testDiv_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.div();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token div() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testDiv_3()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.div();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token div() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testDiv_4()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.div();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token div() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testDiv_5()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.div();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token dollar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testDollar_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.dollar();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token dots() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testDots_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.dots();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token dots() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testDots_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.dots();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token doubleColon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testDoubleColon_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.doubleColon();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int endPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testEndPosition_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		int result = fixture.endPosition();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Token equals() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.equals();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token getPreviousToken() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testGetPreviousToken_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.getPreviousToken();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getXPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testGetXPath_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		String result = fixture.getXPath();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasMoreChars() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testHasMoreChars_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		boolean result = fixture.hasMoreChars();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasMoreChars() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testHasMoreChars_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		boolean result = fixture.hasMoreChars();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Token identifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifier_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifier();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifier_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifier();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifier_3()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifier();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_3()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_4()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_5()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_6()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_7()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_8()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_9()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_10()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_11()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_12()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_13()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_14()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_15()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token identifierOrOperatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIdentifierOrOperatorName_16()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.identifierOrOperatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isIdentifierChar(char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIsIdentifierChar_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();
		char c = '.';

		boolean result = fixture.isIdentifierChar(c);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentifierChar(char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIsIdentifierChar_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();
		char c = '-';

		boolean result = fixture.isIdentifierChar(c);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentifierStartChar(char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIsIdentifierStartChar_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();
		char c = '_';

		boolean result = fixture.isIdentifierStartChar(c);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentifierStartChar(char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIsIdentifierStartChar_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();
		char c = '';

		boolean result = fixture.isIdentifierStartChar(c);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isIdentifierStartChar(char) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testIsIdentifierStartChar_3()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();
		char c = '';

		boolean result = fixture.isIdentifierStartChar(c);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Token leftBracket() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLeftBracket_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.leftBracket();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token leftParen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLeftParen_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.leftParen();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token literal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLiteral_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.literal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token literal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLiteral_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.literal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token literal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLiteral_3()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.literal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token literal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testLiteral_4()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.literal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token minus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testMinus_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.minus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token mod() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testMod_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.mod();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token mod() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testMod_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.mod();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token mod() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testMod_3()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.mod();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token mod() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testMod_4()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.mod();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token mod() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testMod_5()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.mod();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token not() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNot_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.not();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token notEquals() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNotEquals_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.notEquals();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token number() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumber_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.number();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token number() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumber_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.number();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token number() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumber_3()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.number();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token number() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumber_4()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.number();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token number() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumber_5()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.number();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token number() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumber_6()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.number();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token number() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumber_7()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.number();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token number() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumber_8()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.number();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token number() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumber_9()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.number();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token number() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumber_10()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.number();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token number() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumber_11()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.number();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token number() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumber_12()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.number();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token number() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumber_13()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.number();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token number() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testNumber_14()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.number();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token operatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testOperatorName_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.operatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token operatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testOperatorName_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.operatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token operatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testOperatorName_3()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.operatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token operatorName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testOperatorName_4()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.operatorName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token or() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testOr_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.or();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token or() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testOr_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.or();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token or() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testOr_3()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.or();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token or() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testOr_4()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.or();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token pipe() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPipe_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.pipe();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token plus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testPlus_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.plus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token relationalOperator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testRelationalOperator_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.relationalOperator();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token relationalOperator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testRelationalOperator_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.relationalOperator();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token relationalOperator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testRelationalOperator_3()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.relationalOperator();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token relationalOperator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testRelationalOperator_4()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.relationalOperator();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token rightBracket() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testRightBracket_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.rightBracket();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token rightParen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testRightParen_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.rightParen();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setPreviousToken(Token) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testSetPreviousToken_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();
		Token previousToken = new Token(1, "", 1, 1);

		fixture.setPreviousToken(previousToken);

		// add additional test code here
	}

	/**
	 * Run the void setXPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testSetXPath_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();
		String xpath = "";

		fixture.setXPath(xpath);

		// add additional test code here
	}

	/**
	 * Run the Token slashes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testSlashes_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.slashes();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token slashes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testSlashes_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.slashes();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token star() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testStar_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.star();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token whitespace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testWhitespace_1()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.whitespace();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token whitespace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testWhitespace_2()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.whitespace();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token whitespace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testWhitespace_3()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.whitespace();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token whitespace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testWhitespace_4()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.whitespace();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token whitespace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testWhitespace_5()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.whitespace();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Token whitespace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:36 AM
	 */
	@Test
	public void testWhitespace_6()
		throws Exception {
		XPathLexer fixture = new XPathLexer("");
		fixture.setXPath("");
		fixture.setPreviousToken(new Token(1, "", 1, 1));
		fixture.consume();

		Token result = fixture.whitespace();

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(XPathLexerTest.class);
	}
}