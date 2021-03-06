package net.sf.xisemele.impl;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MessageImplTest</code> contains tests for the class <code>{@link MessageImpl}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class MessageImplTest {
	/**
	 * Run the MessageImpl() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testMessageImpl_1()
		throws Exception {
		MessageImpl result = new MessageImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getMessage(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testGetMessage_1()
		throws Exception {
		MessageImpl fixture = new MessageImpl();
		String key = "";

		String result = fixture.getMessage(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
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
	 * @generatedBy CodePro at 4/19/14 2:47 PM
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
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MessageImplTest.class);
	}
}