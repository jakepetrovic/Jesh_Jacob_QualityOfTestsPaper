package org.jsecurity.codec;

import org.jsecurity.crypto.hash.Md2Hash;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CodecSupportTest</code> contains tests for the class <code>{@link CodecSupport}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class CodecSupportTest {
	/**
	 * Run the byte[] objectToBytes(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test(expected = org.jsecurity.codec.CodecException.class)
	public void testObjectToBytes_1()
		throws Exception {
		CodecSupport fixture = new Md2Hash();
		Object o = new Object();

		byte[] result = fixture.objectToBytes(o);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String objectToString(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testObjectToString_1()
		throws Exception {
		CodecSupport fixture = new Md2Hash();
		Object o = new Object();

		String result = fixture.objectToString(o);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] toBytes(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToBytes_1()
		throws Exception {
		CodecSupport fixture = new Md2Hash();
		Object o = new byte[] {};

		byte[] result = fixture.toBytes(o);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] toBytes(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToBytes_2()
		throws Exception {
		CodecSupport fixture = new Md2Hash();
		Object o = new char[] {};

		byte[] result = fixture.toBytes(o);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] toBytes(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToBytes_3()
		throws Exception {
		CodecSupport fixture = new Md2Hash();
		Object o = "";

		byte[] result = fixture.toBytes(o);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] toBytes(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToBytes_4()
		throws Exception {
		CodecSupport fixture = new Md2Hash();
		Object o = new Object();

		byte[] result = fixture.toBytes(o);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] toBytes(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testToBytes_5()
		throws Exception {
		CodecSupport fixture = new Md2Hash();
		Object o = null;

		byte[] result = fixture.toBytes(o);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] toBytes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToBytes_6()
		throws Exception {
		String source = "";

		byte[] result = CodecSupport.toBytes(source);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] toBytes(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test(expected = org.jsecurity.codec.CodecException.class)
	public void testToBytes_7()
		throws Exception {
		String source = "";

		byte[] result = CodecSupport.toBytes(source);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] toBytes(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToBytes_8()
		throws Exception {
		char[] chars = new char[] {};

		byte[] result = CodecSupport.toBytes(chars);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] toBytes(char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test(expected = org.jsecurity.codec.CodecException.class)
	public void testToBytes_9()
		throws Exception {
		char[] chars = new char[] {};

		byte[] result = CodecSupport.toBytes(chars);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] toBytes(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToBytes_10()
		throws Exception {
		String source = "";
		String encoding = "";

		byte[] result = CodecSupport.toBytes(source, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] toBytes(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test(expected = org.jsecurity.codec.CodecException.class)
	public void testToBytes_11()
		throws Exception {
		String source = "";
		String encoding = "";

		byte[] result = CodecSupport.toBytes(source, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] toBytes(char[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToBytes_12()
		throws Exception {
		char[] chars = new char[] {};
		String encoding = "";

		byte[] result = CodecSupport.toBytes(chars, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] toBytes(char[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test(expected = org.jsecurity.codec.CodecException.class)
	public void testToBytes_13()
		throws Exception {
		char[] chars = new char[] {};
		String encoding = "";

		byte[] result = CodecSupport.toBytes(chars, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the char[] toChars(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToChars_1()
		throws Exception {
		byte[] bytes = new byte[] {};

		char[] result = CodecSupport.toChars(bytes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the char[] toChars(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test(expected = org.jsecurity.codec.CodecException.class)
	public void testToChars_2()
		throws Exception {
		byte[] bytes = new byte[] {};

		char[] result = CodecSupport.toChars(bytes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the char[] toChars(byte[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToChars_3()
		throws Exception {
		byte[] bytes = new byte[] {};
		String encoding = "";

		char[] result = CodecSupport.toChars(bytes, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the char[] toChars(byte[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test(expected = org.jsecurity.codec.CodecException.class)
	public void testToChars_4()
		throws Exception {
		byte[] bytes = new byte[] {};
		String encoding = "";

		char[] result = CodecSupport.toChars(bytes, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toString(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		CodecSupport fixture = new Md2Hash();
		Object o = new byte[] {};

		String result = fixture.toString(o);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toString(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		CodecSupport fixture = new Md2Hash();
		Object o = new char[] {};

		String result = fixture.toString(o);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toString(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToString_3()
		throws Exception {
		CodecSupport fixture = new Md2Hash();
		Object o = "";

		String result = fixture.toString(o);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toString(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToString_4()
		throws Exception {
		CodecSupport fixture = new Md2Hash();
		Object o = new Object();

		String result = fixture.toString(o);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toString(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testToString_5()
		throws Exception {
		CodecSupport fixture = new Md2Hash();
		Object o = null;

		String result = fixture.toString(o);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toString(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToString_6()
		throws Exception {
		byte[] bytes = new byte[] {};

		String result = CodecSupport.toString(bytes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toString(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test(expected = org.jsecurity.codec.CodecException.class)
	public void testToString_7()
		throws Exception {
		byte[] bytes = new byte[] {};

		String result = CodecSupport.toString(bytes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toString(byte[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testToString_8()
		throws Exception {
		byte[] bytes = new byte[] {};
		String encoding = "";

		String result = CodecSupport.toString(bytes, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toString(byte[],String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test(expected = org.jsecurity.codec.CodecException.class)
	public void testToString_9()
		throws Exception {
		byte[] bytes = new byte[] {};
		String encoding = "";

		String result = CodecSupport.toString(bytes, encoding);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
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
	 * @generatedBy CodePro at 4/19/14 3:47 PM
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
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CodecSupportTest.class);
	}
}