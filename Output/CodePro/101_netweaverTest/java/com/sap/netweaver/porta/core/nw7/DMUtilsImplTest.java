package com.sap.netweaver.porta.core.nw7;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.rpc.ServiceException;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.engine.services.dc.wsgate.Application;
import com.sap.engine.services.dc.wsgate.ArchiveFile;
import com.sap.engine.services.dc.wsgate.DeployResult;
import com.sap.engine.services.dc.wsgate.DeployWSPortType;
import com.sap.netweaver.porta.core.CoreException;

/**
 * The class <code>DMUtilsImplTest</code> contains tests for the class <code>{@link DMUtilsImpl}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DMUtilsImplTest {
	/**
	 * Run the com.sap.netweaver.porta.core.Application convertApplication(Application) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testConvertApplication_1()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		Application app = new Application();

		com.sap.netweaver.porta.core.Application result = fixture.convertApplication(app);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application convertApplication(Application) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testConvertApplication_2()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		com.sap.netweaver.porta.core.Application app = new ApplicationImpl(new Application());

		Application result = fixture.convertApplication(app);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] convertApplications(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testConvertApplications_1()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		Application[] apps = new Application[] {new Application()};

		com.sap.netweaver.porta.core.Application[] result = fixture.convertApplications(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] convertApplications(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testConvertApplications_2()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		Application[] apps = new Application[] {};

		com.sap.netweaver.porta.core.Application[] result = fixture.convertApplications(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] convertApplications(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testConvertApplications_3()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		com.sap.netweaver.porta.core.Application[] apps = new com.sap.netweaver.porta.core.Application[] {new ApplicationImpl(new Application())};

		Application[] result = fixture.convertApplications(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] convertApplications(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testConvertApplications_4()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		com.sap.netweaver.porta.core.Application[] apps = new com.sap.netweaver.porta.core.Application[] {};

		Application[] result = fixture.convertApplications(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResultImpl convertDeployResult(DeployResult) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testConvertDeployResult_1()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		DeployResult deployWSResult = new DeployResult(new Application[] {}, "", "");

		DeployResultImpl result = fixture.convertDeployResult(deployWSResult);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ArchiveFile[] getAsArchiveFiles(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetAsArchiveFiles_1()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		File[] archives = new File[] {new File("")};

		ArchiveFile[] result = fixture.getAsArchiveFiles(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ArchiveFile[] getAsArchiveFiles(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetAsArchiveFiles_2()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		File[] archives = new File[] {};

		ArchiveFile[] result = fixture.getAsArchiveFiles(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ArchiveFile[] getAsArchiveFiles(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetAsArchiveFiles_3()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		File[] archives = new File[] {new File("")};

		ArchiveFile[] result = fixture.getAsArchiveFiles(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ArchiveFile[] getAsArchiveFiles(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetAsArchiveFiles_4()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		File[] archives = new File[] {new File("")};

		ArchiveFile[] result = fixture.getAsArchiveFiles(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ArchiveFile[] getAsArchiveFiles(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetAsArchiveFiles_5()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		File[] archives = new File[] {new File("")};

		ArchiveFile[] result = fixture.getAsArchiveFiles(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getAsArchivePaths(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetAsArchivePaths_1()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		File[] archives = new File[] {new File("")};

		String[] result = fixture.getAsArchivePaths(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getAsArchivePaths(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetAsArchivePaths_2()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		File[] archives = new File[] {};

		String[] result = fixture.getAsArchivePaths(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getAsArchivePaths(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetAsArchivePaths_3()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		File[] archives = new File[] {new File("")};

		String[] result = fixture.getAsArchivePaths(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployWSPortType getDeployWSProxy(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetDeployWSProxy_1()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		URL wsUrl = new URL("");

		DeployWSPortType result = fixture.getDeployWSProxy(wsUrl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployWSPortType getDeployWSProxy(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetDeployWSProxy_2()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		URL wsUrl = new URL("");

		DeployWSPortType result = fixture.getDeployWSProxy(wsUrl);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getDeployWSUrl(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetDeployWSUrl_1()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		String host = "";
		int port = 1;

		URL result = fixture.getDeployWSUrl(host, port);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getDeployWSUrl(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = java.net.MalformedURLException.class)
	public void testGetDeployWSUrl_2()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		String host = "";
		int port = 1;

		URL result = fixture.getDeployWSUrl(host, port);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FileUploader getFileUploader(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetFileUploader_1()
		throws Exception {
		DMUtilsImpl fixture = new DMUtilsImpl();
		String host = "";
		int port = 1;

		FileUploader result = fixture.getFileUploader(host, port);

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
		new org.junit.runner.JUnitCore().run(DMUtilsImplTest.class);
	}
}