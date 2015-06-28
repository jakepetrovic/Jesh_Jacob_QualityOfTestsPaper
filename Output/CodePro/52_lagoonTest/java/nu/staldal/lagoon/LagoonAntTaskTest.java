package nu.staldal.lagoon;

import java.io.File;
import java.net.URI;
import org.apache.tools.ant.BuildException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LagoonAntTaskTest</code> contains tests for the class <code>{@link LagoonAntTask}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:37 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class LagoonAntTaskTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see LagoonAntTask
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	private LagoonAntTask fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see LagoonAntTask
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public LagoonAntTask getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new LagoonAntTask();
		}
		return fixture;
	}

	/**
	 * Run the LagoonAntTask() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testLagoonAntTask_1()
		throws Exception {

		LagoonAntTask result = new LagoonAntTask();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getTaskType());
		assertEquals(null, result.getOwningTarget());
		assertEquals(null, result.getTaskName());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getProject());
	}

	/**
	 * Run the void execute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test(expected = org.apache.tools.ant.BuildException.class)
	public void testExecute_fixture_1()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();

		fixture2.execute();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testInit_fixture_1()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();

		fixture2.init();

		// add additional test code here
	}

	/**
	 * Run the void setForce(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetForce_fixture_1()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		boolean force = false;

		fixture2.setForce(force);

		// add additional test code here
	}

	/**
	 * Run the void setForce(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetForce_fixture_2()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		boolean force = true;

		fixture2.setForce(force);

		// add additional test code here
	}

	/**
	 * Run the void setPassword(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetPassword_fixture_1()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		String password = "";

		fixture2.setPassword(password);

		// add additional test code here
	}

	/**
	 * Run the void setPassword(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetPassword_fixture_2()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		String password = "0123456789";

		fixture2.setPassword(password);

		// add additional test code here
	}

	/**
	 * Run the void setPropertyFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetPropertyFile_fixture_1()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File propertyFile = null;

		fixture2.setPropertyFile(propertyFile);

		// add additional test code here
	}

	/**
	 * Run the void setSitemapFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSitemapFile_fixture_1()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sitemapFile = File.createTempFile("", "");

		fixture2.setSitemapFile(sitemapFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void setSitemapFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSitemapFile_fixture_2()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sitemapFile = File.createTempFile("", "", (File) null);

		fixture2.setSitemapFile(sitemapFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void setSitemapFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSitemapFile_fixture_3()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sitemapFile = File.createTempFile("0123456789", "0123456789");

		fixture2.setSitemapFile(sitemapFile);

		// add additional test code here
	}

	/**
	 * Run the void setSitemapFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSitemapFile_fixture_4()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sitemapFile = File.createTempFile("0123456789", "0123456789", (File) null);

		fixture2.setSitemapFile(sitemapFile);

		// add additional test code here
	}

	/**
	 * Run the void setSitemapFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSitemapFile_fixture_5()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sitemapFile = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		fixture2.setSitemapFile(sitemapFile);

		// add additional test code here
	}

	/**
	 * Run the void setSitemapFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSitemapFile_fixture_6()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sitemapFile = new File("");

		fixture2.setSitemapFile(sitemapFile);

		// add additional test code here
	}

	/**
	 * Run the void setSitemapFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSitemapFile_fixture_7()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sitemapFile = new File("", "");

		fixture2.setSitemapFile(sitemapFile);

		// add additional test code here
	}

	/**
	 * Run the void setSitemapFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSitemapFile_fixture_8()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sitemapFile = new File("0123456789", "0123456789");

		fixture2.setSitemapFile(sitemapFile);

		// add additional test code here
	}

	/**
	 * Run the void setSitemapFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSitemapFile_fixture_9()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sitemapFile = new File(URI.create(""));

		fixture2.setSitemapFile(sitemapFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
	}

	/**
	 * Run the void setSitemapFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSitemapFile_fixture_10()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sitemapFile = new File((File) null, "");

		fixture2.setSitemapFile(sitemapFile);

		// add additional test code here
	}

	/**
	 * Run the void setSitemapFile(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSitemapFile_fixture_11()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sitemapFile = new File((File) null, "0123456789");

		fixture2.setSitemapFile(sitemapFile);

		// add additional test code here
	}

	/**
	 * Run the void setSourceDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSourceDir_fixture_1()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sourceDir = File.createTempFile("", "");

		fixture2.setSourceDir(sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
	}

	/**
	 * Run the void setSourceDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSourceDir_fixture_2()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sourceDir = File.createTempFile("", "", (File) null);

		fixture2.setSourceDir(sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
	}

	/**
	 * Run the void setSourceDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSourceDir_fixture_3()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sourceDir = File.createTempFile("0123456789", "0123456789");

		fixture2.setSourceDir(sourceDir);

		// add additional test code here
	}

	/**
	 * Run the void setSourceDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSourceDir_fixture_4()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sourceDir = File.createTempFile("0123456789", "0123456789", (File) null);

		fixture2.setSourceDir(sourceDir);

		// add additional test code here
	}

	/**
	 * Run the void setSourceDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSourceDir_fixture_5()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sourceDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		fixture2.setSourceDir(sourceDir);

		// add additional test code here
	}

	/**
	 * Run the void setSourceDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSourceDir_fixture_6()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sourceDir = new File("");

		fixture2.setSourceDir(sourceDir);

		// add additional test code here
	}

	/**
	 * Run the void setSourceDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSourceDir_fixture_7()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sourceDir = new File("", "");

		fixture2.setSourceDir(sourceDir);

		// add additional test code here
	}

	/**
	 * Run the void setSourceDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSourceDir_fixture_8()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sourceDir = new File("0123456789", "0123456789");

		fixture2.setSourceDir(sourceDir);

		// add additional test code here
	}

	/**
	 * Run the void setSourceDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSourceDir_fixture_9()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sourceDir = new File(URI.create(""));

		fixture2.setSourceDir(sourceDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
	}

	/**
	 * Run the void setSourceDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSourceDir_fixture_10()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sourceDir = new File((File) null, "");

		fixture2.setSourceDir(sourceDir);

		// add additional test code here
	}

	/**
	 * Run the void setSourceDir(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetSourceDir_fixture_11()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		File sourceDir = new File((File) null, "0123456789");

		fixture2.setSourceDir(sourceDir);

		// add additional test code here
	}

	/**
	 * Run the void setTargetURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetTargetURL_fixture_1()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		String targetURL = "";

		fixture2.setTargetURL(targetURL);

		// add additional test code here
	}

	/**
	 * Run the void setTargetURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	@Test
	public void testSetTargetURL_fixture_2()
		throws Exception {
		LagoonAntTask fixture2 = getFixture();
		String targetURL = "0123456789";

		fixture2.setTargetURL(targetURL);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:37 PM
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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
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
	 * @generatedBy CodePro at 6/28/15 2:37 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LagoonAntTaskTest.class);
	}
}