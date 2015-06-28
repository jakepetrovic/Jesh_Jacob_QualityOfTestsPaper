package org.jsecurity.codec;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HexTest</code> contains tests for the class <code>{@link Hex}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:46 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class HexTest {
	/**
	 * Run the Hex() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testHex_1()
		throws Exception {
		Hex result = new Hex();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the byte[] decode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testDecode_1()
		throws Exception {
		String hex = "";

		byte[] result = Hex.decode(hex);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] decode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testDecode_2()
		throws Exception {
		String hex = "";

		byte[] result = Hex.decode(hex);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] decode(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testDecode_3()
		throws Exception {
		byte[] array = new byte[] {};

		byte[] result = Hex.decode(array);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] decode(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testDecode_4()
		throws Exception {
		char[] data = new char[] {'', ''};

		byte[] result = Hex.decode(data);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] decode(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testDecode_5()
		throws Exception {
		char[] data = new char[] {};

		byte[] result = Hex.decode(data);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] decode(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testDecode_6()
		throws Exception {
		char[] data = new char[] {};

		byte[] result = Hex.decode(data);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] decode(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testDecode_7()
		throws Exception {
		char[] data = new char[] {''};

		byte[] result = Hex.decode(data);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] decode(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testDecode_8()
		throws Exception {
		char[] data = new char[] {'', ''};

		byte[] result = Hex.decode(data);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the char[] encode(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testEncode_1()
		throws Exception {
		byte[] data = new byte[] {(byte) 1};

		char[] result = Hex.encode(data);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the char[] encode(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testEncode_2()
		throws Exception {
		byte[] data = new byte[] {};

		char[] result = Hex.encode(data);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String encodeToString(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testEncodeToString_1()
		throws Exception {
		byte[] bytes = new byte[] {};

		String result = Hex.encodeToString(bytes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int toDigit(char,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testToDigit_1()
		throws Exception {
		char ch = '';
		int index = 1;

		int result = Hex.toDigit(ch, index);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int toDigit(char,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testToDigit_2()
		throws Exception {
		char ch = '';
		int index = 1;

		int result = Hex.toDigit(ch, index);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HexTest.class);
	}
}