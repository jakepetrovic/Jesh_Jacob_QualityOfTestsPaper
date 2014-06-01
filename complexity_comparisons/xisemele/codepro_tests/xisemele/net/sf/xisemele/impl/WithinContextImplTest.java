package net.sf.xisemele.impl;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WithinContextImplTest</code> contains tests for the class <code>{@link WithinContextImpl}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class WithinContextImplTest {
	/**
	 * Run the WithinContextImpl() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testWithinContextImpl_1()
		throws Exception {
		WithinContextImpl result = new WithinContextImpl();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the boolean enabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testEnabled_1()
		throws Exception {
		WithinContextImpl fixture = new WithinContextImpl();

		boolean result = fixture.enabled();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean enabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testEnabled_2()
		throws Exception {
		WithinContextImpl fixture = new WithinContextImpl();

		boolean result = fixture.enabled();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		WithinContextImpl fixture = new WithinContextImpl();

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		WithinContextImpl fixture = new WithinContextImpl();

		fixture.stop();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(WithinContextImplTest.class);
	}
}