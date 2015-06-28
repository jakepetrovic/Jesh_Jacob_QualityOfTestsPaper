package com.sap.netweaver.porta.core.mock;

import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.DebugSessionInfo;
import com.sap.netweaver.porta.core.NotAuthorizedException;
import com.sap.netweaver.porta.core.ServerState;

/**
 * The class <code>LifecycleManagerMockTest</code> contains tests for the class <code>{@link LifecycleManagerMock}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:59 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class LifecycleManagerMockTest {
	/**
	 * Run the LifecycleManagerMock() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test
	public void testLifecycleManagerMock_1()
		throws Exception {
		LifecycleManagerMock result = new LifecycleManagerMock();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void disableDebugging(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test
	public void testDisableDebugging_1()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();
		String key = "";

		fixture.disableDebugging(key);

		// add additional test code here
	}

	/**
	 * Run the DebugSessionInfo enableDebugging() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test
	public void testEnableDebugging_1()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		DebugSessionInfo result = fixture.enableDebugging();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState getState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test
	public void testGetState_1()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		ServerState result = fixture.getState();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void restart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test
	public void testRestart_1()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.restart();

		// add additional test code here
	}

	/**
	 * Run the void restart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test
	public void testRestart_2()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.restart();

		// add additional test code here
	}

	/**
	 * Run the void restart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testRestart_3()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.restart();

		// add additional test code here
	}

	/**
	 * Run the void restart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testRestart_4()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.restart();

		// add additional test code here
	}

	/**
	 * Run the void restart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testRestart_5()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.restart();

		// add additional test code here
	}

	/**
	 * Run the void restart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testRestart_6()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.restart();

		// add additional test code here
	}

	/**
	 * Run the void restart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testRestart_7()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.restart();

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test
	public void testStart_2()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test
	public void testStart_3()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testStart_4()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testStart_5()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.stop();

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test
	public void testStop_2()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.stop();

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test
	public void testStop_3()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.stop();

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testStop_4()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.stop();

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testStop_5()
		throws Exception {
		LifecycleManagerMock fixture = new LifecycleManagerMock();

		fixture.stop();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:59 AM
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
	 * @generatedBy CodePro at 4/8/14 10:59 AM
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
	 * @generatedBy CodePro at 4/8/14 10:59 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LifecycleManagerMockTest.class);
	}
}