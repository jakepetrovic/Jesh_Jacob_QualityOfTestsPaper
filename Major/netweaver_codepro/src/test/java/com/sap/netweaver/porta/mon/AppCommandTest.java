package com.sap.netweaver.porta.mon;

import java.io.IOException;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.Application;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.NotAuthorizedException;
import com.sap.netweaver.porta.core.Server;
import com.sap.netweaver.porta.core.mock.ServerMock;

/**
 * The class <code>AppCommandTest</code> contains tests for the class <code>{@link AppCommand}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:21 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AppCommandTest {
	/**
	 * Run the Application findApp(Server,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:21 AM
	 */
	@Test
	public void testFindApp_1()
		throws Exception {
		AppCommand fixture = new StartAppCommand();
		Server server = new ServerMock();
		String vendor = "";
		String name = "";

		Application result = fixture.findApp(server, vendor, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application findApp(Server,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:21 AM
	 */
	@Test
	public void testFindApp_2()
		throws Exception {
		AppCommand fixture = new StartAppCommand();
		Server server = new ServerMock();
		String vendor = "";
		String name = "";

		Application result = fixture.findApp(server, vendor, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application findApp(Server,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:21 AM
	 */
	@Test
	public void testFindApp_3()
		throws Exception {
		AppCommand fixture = new StartAppCommand();
		Server server = new ServerMock();
		String vendor = "";
		String name = "";

		Application result = fixture.findApp(server, vendor, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application findApp(Server,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:21 AM
	 */
	@Test
	public void testFindApp_4()
		throws Exception {
		AppCommand fixture = new StartAppCommand();
		Server server = new ServerMock();
		String vendor = "";
		String name = "";

		Application result = fixture.findApp(server, vendor, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application findApp(Server,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:21 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testFindApp_5()
		throws Exception {
		AppCommand fixture = new StartAppCommand();
		Server server = new ServerMock();
		String vendor = "";
		String name = "";

		Application result = fixture.findApp(server, vendor, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application findApp(Server,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:21 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testFindApp_6()
		throws Exception {
		AppCommand fixture = new StartAppCommand();
		Server server = new ServerMock();
		String vendor = "";
		String name = "";

		Application result = fixture.findApp(server, vendor, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application findApp(Server,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:21 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testFindApp_7()
		throws Exception {
		AppCommand fixture = new StartAppCommand();
		Server server = new ServerMock();
		String vendor = "";
		String name = "";

		Application result = fixture.findApp(server, vendor, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String readAppName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:21 AM
	 */
	@Test
	public void testReadAppName_1()
		throws Exception {
		AppCommand fixture = new StartAppCommand();

		String result = fixture.readAppName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String readAppName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:21 AM
	 */
	@Test(expected = java.io.IOException.class)
	public void testReadAppName_2()
		throws Exception {
		AppCommand fixture = new StartAppCommand();

		String result = fixture.readAppName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String readAppVendor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:21 AM
	 */
	@Test
	public void testReadAppVendor_1()
		throws Exception {
		AppCommand fixture = new StartAppCommand();

		String result = fixture.readAppVendor();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String readAppVendor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:21 AM
	 */
	@Test(expected = java.io.IOException.class)
	public void testReadAppVendor_2()
		throws Exception {
		AppCommand fixture = new StartAppCommand();

		String result = fixture.readAppVendor();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:21 AM
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
	 * @generatedBy CodePro at 4/8/14 11:21 AM
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
	 * @generatedBy CodePro at 4/8/14 11:21 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AppCommandTest.class);
	}
}