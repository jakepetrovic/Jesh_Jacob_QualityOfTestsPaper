package com.sap.netweaver.porta.core.mock;

import java.io.File;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.Application;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.DeployResult;
import com.sap.netweaver.porta.core.NotAuthorizedException;

/**
 * The class <code>DeployManagerMockTest</code> contains tests for the class <code>{@link DeployManagerMock}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DeployManagerMockTest {
	/**
	 * Run the DeployManagerMock() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testDeployManagerMock_1()
		throws Exception {
		DeployManagerMock result = new DeployManagerMock();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the DeployResult deploy(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testDeploy_1()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		File[] archives = new File[] {};

		DeployResult result = fixture.deploy(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult deploy(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testDeploy_2()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		File[] archives = new File[] {};

		DeployResult result = fixture.deploy(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult deploy(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testDeploy_3()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		File[] archives = new File[] {};

		DeployResult result = fixture.deploy(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult deploy(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testDeploy_4()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		File[] archives = new File[] {};

		DeployResult result = fixture.deploy(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] getApplications() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetApplications_1()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();

		Application[] result = fixture.getApplications();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] getApplications() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetApplications_2()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();

		Application[] result = fixture.getApplications();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] getApplications() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testGetApplications_3()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();

		Application[] result = fixture.getApplications();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] start(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		Application[] apps = new Application[] {};

		Application[] result = fixture.start(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] start(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testStart_2()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		Application[] apps = new Application[] {};

		Application[] result = fixture.start(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] start(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testStart_3()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		Application[] apps = new Application[] {};

		Application[] result = fixture.start(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] start(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testStart_4()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		Application[] apps = new Application[] {};

		Application[] result = fixture.start(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] stop(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		Application[] apps = new Application[] {};

		Application[] result = fixture.stop(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] stop(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testStop_2()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		Application[] apps = new Application[] {};

		Application[] result = fixture.stop(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] stop(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testStop_3()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		Application[] apps = new Application[] {};

		Application[] result = fixture.stop(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] stop(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testStop_4()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		Application[] apps = new Application[] {};

		Application[] result = fixture.stop(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult undeploy(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testUndeploy_1()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		Application[] apps = new Application[] {};

		DeployResult result = fixture.undeploy(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult undeploy(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testUndeploy_2()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		Application[] apps = new Application[] {};

		DeployResult result = fixture.undeploy(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult undeploy(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testUndeploy_3()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		Application[] apps = new Application[] {};

		DeployResult result = fixture.undeploy(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult undeploy(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testUndeploy_4()
		throws Exception {
		DeployManagerMock fixture = new DeployManagerMock();
		Application[] apps = new Application[] {};

		DeployResult result = fixture.undeploy(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
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
	 * @generatedBy CodePro at 4/8/14 10:37 AM
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
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DeployManagerMockTest.class);
	}
}