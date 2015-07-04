package com.werken.saxpath;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TokenTest</code> contains tests for the class <code>{@link Token}</code>.
 *
 * @generatedBy CodePro at 7/4/15 1:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TokenTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Token
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private Token fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Token
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private Token fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Token
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private Token fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Token
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	private Token fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Token
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public Token getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new Token(-1, (String) null, -1, -1);
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Token
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public Token getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new Token(0, "", 0, 0);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Token
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public Token getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new Token(1, "0123456789", 1, 1);
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Token
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public Token getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new Token(7, "An��t-1.0.txt", 7, 7);
		}
		return fixture4;
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_1()
		throws Exception {
		int tokenType = 0;
		String parseText = "";
		int tokenBegin = 0;
		int tokenEnd = 0;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ (0) ()", result.toString());
		assertEquals("", result.getTokenText());
		assertEquals(0, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_2()
		throws Exception {
		int tokenType = 1;
		String parseText = "0123456789";
		int tokenBegin = 1;
		int tokenEnd = 1;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ (1) ()", result.toString());
		assertEquals("", result.getTokenText());
		assertEquals(1, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_3()
		throws Exception {
		int tokenType = 0;
		String parseText = "";
		int tokenBegin = 7;
		int tokenEnd = 7;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_4()
		throws Exception {
		int tokenType = 7;
		String parseText = "";
		int tokenBegin = 1;
		int tokenEnd = 0;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_5()
		throws Exception {
		int tokenType = 0;
		String parseText = "0123456789";
		int tokenBegin = 7;
		int tokenEnd = 1;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_6()
		throws Exception {
		int tokenType = 7;
		String parseText = "0123456789";
		int tokenBegin = 0;
		int tokenEnd = 7;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ (7) (0123456)", result.toString());
		assertEquals("0123456", result.getTokenText());
		assertEquals(7, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_7()
		throws Exception {
		int tokenType = 1;
		String parseText = "";
		int tokenBegin = 7;
		int tokenEnd = 0;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_8()
		throws Exception {
		int tokenType = 0;
		String parseText = "";
		int tokenBegin = 0;
		int tokenEnd = 1;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_9()
		throws Exception {
		int tokenType = 1;
		String parseText = "0123456789";
		int tokenBegin = 1;
		int tokenEnd = 7;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ (1) (123456)", result.toString());
		assertEquals("123456", result.getTokenText());
		assertEquals(1, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_10()
		throws Exception {
		int tokenType = 0;
		String parseText = "0123456789";
		int tokenBegin = 0;
		int tokenEnd = 0;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ (0) ()", result.toString());
		assertEquals("", result.getTokenText());
		assertEquals(0, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_11()
		throws Exception {
		int tokenType = 7;
		String parseText = "";
		int tokenBegin = 1;
		int tokenEnd = 1;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_12()
		throws Exception {
		int tokenType = 0;
		String parseText = "0123456789";
		int tokenBegin = 7;
		int tokenEnd = 7;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ (0) ()", result.toString());
		assertEquals("", result.getTokenText());
		assertEquals(0, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_13()
		throws Exception {
		int tokenType = 7;
		String parseText = "0123456789";
		int tokenBegin = 1;
		int tokenEnd = 0;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_14()
		throws Exception {
		int tokenType = 1;
		String parseText = "";
		int tokenBegin = 7;
		int tokenEnd = 1;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_15()
		throws Exception {
		int tokenType = 0;
		String parseText = "";
		int tokenBegin = 0;
		int tokenEnd = 7;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_16()
		throws Exception {
		int tokenType = 1;
		String parseText = "0123456789";
		int tokenBegin = 7;
		int tokenEnd = 0;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_17()
		throws Exception {
		int tokenType = 0;
		String parseText = "0123456789";
		int tokenBegin = 0;
		int tokenEnd = 1;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ (0) (0)", result.toString());
		assertEquals("0", result.getTokenText());
		assertEquals(0, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_18()
		throws Exception {
		int tokenType = 7;
		String parseText = "";
		int tokenBegin = 1;
		int tokenEnd = 7;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_19()
		throws Exception {
		int tokenType = 1;
		String parseText = "";
		int tokenBegin = 0;
		int tokenEnd = 0;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ (1) ()", result.toString());
		assertEquals("", result.getTokenText());
		assertEquals(1, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_20()
		throws Exception {
		int tokenType = 7;
		String parseText = "0123456789";
		int tokenBegin = 1;
		int tokenEnd = 1;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ (7) ()", result.toString());
		assertEquals("", result.getTokenText());
		assertEquals(7, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_21()
		throws Exception {
		int tokenType = 1;
		String parseText = "";
		int tokenBegin = 7;
		int tokenEnd = 7;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_22()
		throws Exception {
		int tokenType = 0;
		String parseText = "";
		int tokenBegin = 1;
		int tokenEnd = 0;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_23()
		throws Exception {
		int tokenType = 1;
		String parseText = "0123456789";
		int tokenBegin = 7;
		int tokenEnd = 1;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_24()
		throws Exception {
		int tokenType = 0;
		String parseText = "0123456789";
		int tokenBegin = 0;
		int tokenEnd = 7;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ (0) (0123456)", result.toString());
		assertEquals("0123456", result.getTokenText());
		assertEquals(0, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_25()
		throws Exception {
		int tokenType = 7;
		String parseText = "";
		int tokenBegin = 7;
		int tokenEnd = 0;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_26()
		throws Exception {
		int tokenType = 1;
		String parseText = "";
		int tokenBegin = 0;
		int tokenEnd = 1;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_27()
		throws Exception {
		int tokenType = 7;
		String parseText = "0123456789";
		int tokenBegin = 1;
		int tokenEnd = 7;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ (7) (123456)", result.toString());
		assertEquals("123456", result.getTokenText());
		assertEquals(7, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_28()
		throws Exception {
		int tokenType = 1;
		String parseText = "0123456789";
		int tokenBegin = 0;
		int tokenEnd = 0;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ (1) ()", result.toString());
		assertEquals("", result.getTokenText());
		assertEquals(1, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_29()
		throws Exception {
		int tokenType = 0;
		String parseText = "";
		int tokenBegin = 1;
		int tokenEnd = 1;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getTokenType());
	}

	/**
	 * Run the Token(int,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToken_30()
		throws Exception {
		int tokenType = 1;
		String parseText = "0123456789";
		int tokenBegin = 7;
		int tokenEnd = 7;

		Token result = new Token(tokenType, parseText, tokenBegin, tokenEnd);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[ (1) ()", result.toString());
		assertEquals("", result.getTokenText());
		assertEquals(1, result.getTokenType());
	}

	/**
	 * Run the int getTokenBegin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenBegin_fixture1_1()
		throws Exception {
		Token fixture = getFixture1();

		int result = fixture.getTokenBegin();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getTokenBegin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenBegin_fixture2_1()
		throws Exception {
		Token fixture = getFixture2();

		int result = fixture.getTokenBegin();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTokenBegin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenBegin_fixture3_1()
		throws Exception {
		Token fixture = getFixture3();

		int result = fixture.getTokenBegin();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getTokenBegin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenBegin_fixture4_1()
		throws Exception {
		Token fixture = getFixture4();

		int result = fixture.getTokenBegin();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getTokenEnd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenEnd_fixture1_1()
		throws Exception {
		Token fixture = getFixture1();

		int result = fixture.getTokenEnd();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getTokenEnd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenEnd_fixture2_1()
		throws Exception {
		Token fixture = getFixture2();

		int result = fixture.getTokenEnd();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTokenEnd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenEnd_fixture3_1()
		throws Exception {
		Token fixture = getFixture3();

		int result = fixture.getTokenEnd();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getTokenEnd() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenEnd_fixture4_1()
		throws Exception {
		Token fixture = getFixture4();

		int result = fixture.getTokenEnd();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the String getTokenText() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenText_fixture1_1()
		throws Exception {
		Token fixture = getFixture1();

		String result = fixture.getTokenText();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.Token.getTokenText(Token.java:101)
		assertNotNull(result);
	}

	/**
	 * Run the String getTokenText() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenText_fixture2_1()
		throws Exception {
		Token fixture = getFixture2();

		String result = fixture.getTokenText();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTokenText() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenText_fixture3_1()
		throws Exception {
		Token fixture = getFixture3();

		String result = fixture.getTokenText();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getTokenText() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenText_fixture4_1()
		throws Exception {
		Token fixture = getFixture4();

		String result = fixture.getTokenText();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getTokenType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenType_fixture1_1()
		throws Exception {
		Token fixture = getFixture1();

		int result = fixture.getTokenType();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getTokenType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenType_fixture2_1()
		throws Exception {
		Token fixture = getFixture2();

		int result = fixture.getTokenType();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTokenType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenType_fixture3_1()
		throws Exception {
		Token fixture = getFixture3();

		int result = fixture.getTokenType();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getTokenType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testGetTokenType_fixture4_1()
		throws Exception {
		Token fixture = getFixture4();

		int result = fixture.getTokenType();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToString_fixture1_1()
		throws Exception {
		Token fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.werken.saxpath.Token.getTokenText(Token.java:101)
		//       at com.werken.saxpath.Token.toString(Token.java:127)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToString_fixture2_1()
		throws Exception {
		Token fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[ (0) ()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToString_fixture3_1()
		throws Exception {
		Token fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[ (1) ()", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testToString_fixture4_1()
		throws Exception {
		Token fixture = getFixture4();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[ (7) ()", result);
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
		new org.junit.runner.JUnitCore().run(TokenTest.class);
	}
}