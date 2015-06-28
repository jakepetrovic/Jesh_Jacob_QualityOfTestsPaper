package com.sap.netweaver.porta.ide.eclipse.util;

import org.aspectj.org.eclipse.jdt.internal.core.JavaModelStatus;
import org.eclipse.core.runtime.IStatus;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>StatusUtilTest</code> contains tests for the class <code>{@link StatusUtil}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:51 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class StatusUtilTest {
	/**
	 * Run the boolean hasEmptyMessage(IStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testHasEmptyMessage_1()
		throws Exception {
		IStatus status = new JavaModelStatus();

		boolean result = StatusUtil.hasEmptyMessage(status);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasEmptyMessage(IStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testHasEmptyMessage_2()
		throws Exception {
		IStatus status = new JavaModelStatus();

		boolean result = StatusUtil.hasEmptyMessage(status);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasEmptyMessage(IStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testHasEmptyMessage_3()
		throws Exception {
		IStatus status = new JavaModelStatus();

		boolean result = StatusUtil.hasEmptyMessage(status);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasErrorMessage(IStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testHasErrorMessage_1()
		throws Exception {
		IStatus status = new JavaModelStatus();

		boolean result = StatusUtil.hasErrorMessage(status);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasErrorMessage(IStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testHasErrorMessage_2()
		throws Exception {
		IStatus status = new JavaModelStatus();

		boolean result = StatusUtil.hasErrorMessage(status);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasErrorMessage(IStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testHasErrorMessage_3()
		throws Exception {
		IStatus status = new JavaModelStatus();

		boolean result = StatusUtil.hasErrorMessage(status);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the IStatus merge(IStatus,IStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testMerge_1()
		throws Exception {
		IStatus status = new JavaModelStatus();
		IStatus newStatus = new JavaModelStatus();

		IStatus result = StatusUtil.merge(status, newStatus);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus merge(IStatus,IStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testMerge_2()
		throws Exception {
		IStatus status = new JavaModelStatus();
		IStatus newStatus = new JavaModelStatus();

		IStatus result = StatusUtil.merge(status, newStatus);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus merge(IStatus,IStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testMerge_3()
		throws Exception {
		IStatus status = new JavaModelStatus();
		IStatus newStatus = new JavaModelStatus();

		IStatus result = StatusUtil.merge(status, newStatus);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus merge(IStatus,IStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	@Test
	public void testMerge_4()
		throws Exception {
		IStatus status = new JavaModelStatus();
		IStatus newStatus = new JavaModelStatus();

		IStatus result = StatusUtil.merge(status, newStatus);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:51 AM
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
	 * @generatedBy CodePro at 4/8/14 10:51 AM
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
	 * @generatedBy CodePro at 4/8/14 10:51 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(StatusUtilTest.class);
	}
}