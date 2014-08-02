package org.jsecurity.io;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>XmlSerializerTest</code> contains tests for the class <code>{@link XmlSerializer}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:24 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class XmlSerializerTest {
	/**
	 * Run the Object deserialize(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testDeserialize_1()
		throws Exception {
		XmlSerializer fixture = new XmlSerializer();
		byte[] serialized = new byte[] {};

		Object result = fixture.deserialize(serialized);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object deserialize(byte[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testDeserialize_2()
		throws Exception {
		XmlSerializer fixture = new XmlSerializer();
		byte[] serialized = new byte[] {};

		Object result = fixture.deserialize(serialized);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] serialize(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testSerialize_1()
		throws Exception {
		XmlSerializer fixture = new XmlSerializer();
		Object source = new Object();

		byte[] result = fixture.serialize(source);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the byte[] serialize(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSerialize_2()
		throws Exception {
		XmlSerializer fixture = new XmlSerializer();
		Object source = null;

		byte[] result = fixture.serialize(source);

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
		new org.junit.runner.JUnitCore().run(XmlSerializerTest.class);
	}
}