package net.sf.lavalamp.site;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BuildsTest</code> contains tests for the class <code>{@link Builds}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class BuildsTest {
	/**
	 * Run the Builds() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testBuilds_1()
		throws Exception {

		Builds result = new Builds();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/lavalamp/site/Builds : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the void add(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));
		Build build = new Build("");

		fixture.add(build);

		// add additional test code here
	}

	/**
	 * Run the boolean allSuccessful() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testAllSuccessful_1()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));

		boolean result = fixture.allSuccessful();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean allSuccessful() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testAllSuccessful_2()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));

		boolean result = fixture.allSuccessful();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean allSuccessful() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testAllSuccessful_3()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));

		boolean result = fixture.allSuccessful();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Build getBuild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetBuild_1()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));
		String buildId = "";

		Build result = fixture.getBuild(buildId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Build getBuild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = net.sf.lavalamp.site.MissingBuildException.class)
	public void testGetBuild_2()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));
		String buildId = "";

		Build result = fixture.getBuild(buildId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Build getBuild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = net.sf.lavalamp.site.MissingBuildException.class)
	public void testGetBuild_3()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));
		String buildId = "";

		Build result = fixture.getBuild(buildId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Build> getBuilds() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetBuilds_1()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));

		List<Build> result = fixture.getBuilds();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BuildsTest.class);
	}
}