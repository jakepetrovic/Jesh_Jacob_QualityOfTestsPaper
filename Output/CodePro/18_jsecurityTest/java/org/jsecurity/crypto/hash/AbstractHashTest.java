package org.jsecurity.crypto.hash;

import java.security.MessageDigest;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractHashTest</code> contains tests for the class <code>{@link AbstractHash}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:24 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AbstractHashTest {
	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		AbstractHash fixture = new Md2Hash();
		Object o = new Md2Hash();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		AbstractHash fixture = new Md2Hash();
		Object o = new Md2Hash();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		AbstractHash fixture = new Md2Hash();
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the byte[] getBytes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testGetBytes_1()
		throws Exception {
		AbstractHash fixture = new Md2Hash();

		byte[] result = fixture.getBytes();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MessageDigest getDigest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testGetDigest_1()
		throws Exception {
		AbstractHash fixture = new Md2Hash();
		String algorithmName = "";

		MessageDigest result = fixture.getDigest(algorithmName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the MessageDigest getDigest(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetDigest_2()
		throws Exception {
		AbstractHash fixture = new Md2Hash();
		String algorithmName = "";

		MessageDigest result = fixture.getDigest(algorithmName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] hash(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testHash_1()
		throws Exception {
		AbstractHash fixture = new Md2Hash();
		byte[] bytes = new byte[] {};

		byte[] result = fixture.hash(bytes);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] hash(byte[],byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testHash_2()
		throws Exception {
		AbstractHash fixture = new Md2Hash();
		byte[] bytes = new byte[] {};
		byte[] salt = new byte[] {};

		byte[] result = fixture.hash(bytes, salt);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] hash(byte[],byte[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testHash_3()
		throws Exception {
		AbstractHash fixture = new Md2Hash();
		byte[] bytes = new byte[] {};
		byte[] salt = new byte[] {};
		int hashIterations = 1;

		byte[] result = fixture.hash(bytes, salt, hashIterations);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] hash(byte[],byte[],int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testHash_4()
		throws Exception {
		AbstractHash fixture = new Md2Hash();
		byte[] bytes = new byte[] {};
		byte[] salt = new byte[] {};
		int hashIterations = 1;

		byte[] result = fixture.hash(bytes, salt, hashIterations);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		AbstractHash fixture = new Md2Hash();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setBytes(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testSetBytes_1()
		throws Exception {
		AbstractHash fixture = new Md2Hash();
		byte[] alreadyHashedBytes = new byte[] {};

		fixture.setBytes(alreadyHashedBytes);

		// add additional test code here
	}

	/**
	 * Run the String toBase64() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testToBase64_1()
		throws Exception {
		AbstractHash fixture = new Md2Hash();

		String result = fixture.toBase64();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toBase64() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testToBase64_2()
		throws Exception {
		AbstractHash fixture = new Md2Hash();

		String result = fixture.toBase64();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toHex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testToHex_1()
		throws Exception {
		AbstractHash fixture = new Md2Hash();

		String result = fixture.toHex();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toHex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testToHex_2()
		throws Exception {
		AbstractHash fixture = new Md2Hash();

		String result = fixture.toHex();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		AbstractHash fixture = new Md2Hash();

		String result = fixture.toString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
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
	 * @generatedBy CodePro at 4/19/14 3:24 PM
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
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractHashTest.class);
	}
}