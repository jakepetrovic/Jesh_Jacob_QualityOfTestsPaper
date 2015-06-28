package com.sap.netweaver.porta.core.mock;

import java.net.InetSocketAddress;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.DeployManager;
import com.sap.netweaver.porta.core.LifecycleManager;

/**
 * The class <code>ServerMockTest</code> contains tests for the class <code>{@link ServerMock}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:36 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ServerMockTest {
	/**
	 * Run the DeployManager getDeployManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:36 AM
	 */
	@Test
	public void testGetDeployManager_1()
		throws Exception {
		ServerMock fixture = new ServerMock();

		DeployManager result = fixture.getDeployManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployManager getDeployManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:36 AM
	 */
	@Test
	public void testGetDeployManager_2()
		throws Exception {
		ServerMock fixture = new ServerMock();

		DeployManager result = fixture.getDeployManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetSocketAddress getHttpAccessPoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:36 AM
	 */
	@Test
	public void testGetHttpAccessPoint_1()
		throws Exception {
		ServerMock fixture = new ServerMock();

		InetSocketAddress result = fixture.getHttpAccessPoint();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LifecycleManager getLifecycleManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:36 AM
	 */
	@Test
	public void testGetLifecycleManager_1()
		throws Exception {
		ServerMock fixture = new ServerMock();

		LifecycleManager result = fixture.getLifecycleManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LifecycleManager getLifecycleManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:36 AM
	 */
	@Test
	public void testGetLifecycleManager_2()
		throws Exception {
		ServerMock fixture = new ServerMock();

		LifecycleManager result = fixture.getLifecycleManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSystemName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:36 AM
	 */
	@Test
	public void testGetSystemName_1()
		throws Exception {
		ServerMock fixture = new ServerMock();

		String result = fixture.getSystemName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void ping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:36 AM
	 */
	@Test
	public void testPing_1()
		throws Exception {
		ServerMock fixture = new ServerMock();

		fixture.ping();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:36 AM
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
	 * @generatedBy CodePro at 4/8/14 11:36 AM
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
	 * @generatedBy CodePro at 4/8/14 11:36 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ServerMockTest.class);
	}
}