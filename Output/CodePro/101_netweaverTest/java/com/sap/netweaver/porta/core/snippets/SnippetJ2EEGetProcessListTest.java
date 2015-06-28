package com.sap.netweaver.porta.core.snippets;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SnippetJ2EEGetProcessListTest</code> contains tests for the class <code>{@link SnippetJ2EEGetProcessList}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:39 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SnippetJ2EEGetProcessListTest {
	/**
	 * Run the SnippetJ2EEGetProcessList() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testSnippetJ2EEGetProcessList_1()
		throws Exception {
		SnippetJ2EEGetProcessList result = new SnippetJ2EEGetProcessList();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		SnippetJ2EEGetProcessList.main(args);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testMain_2()
		throws Exception {
		String[] args = new String[] {};

		SnippetJ2EEGetProcessList.main(args);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = java.net.MalformedURLException.class)
	public void testMain_3()
		throws Exception {
		String[] args = new String[] {};

		SnippetJ2EEGetProcessList.main(args);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testMain_4()
		throws Exception {
		String[] args = new String[] {};

		SnippetJ2EEGetProcessList.main(args);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testMain_5()
		throws Exception {
		String[] args = new String[] {};

		SnippetJ2EEGetProcessList.main(args);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
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
	 * @generatedBy CodePro at 4/8/14 10:39 AM
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
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SnippetJ2EEGetProcessListTest.class);
	}
}