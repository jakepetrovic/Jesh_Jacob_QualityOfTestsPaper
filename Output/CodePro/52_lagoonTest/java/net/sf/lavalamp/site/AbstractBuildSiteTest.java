package net.sf.lavalamp.site;

import org.junit.*;
import net.sf.lavalamp.LavaLogger;
import net.sf.lavalamp.site.impl.BambooRemoteApi;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractBuildSiteTest</code> contains tests for the class <code>{@link AbstractBuildSite}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AbstractBuildSiteTest {
	/**
	 * Run the Getter getUrlGetter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetUrlGetter_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.logger = new LavaLogger();
		fixture.url = "";
		fixture.urlGetter = new DummyRemoteGetter();

		Getter result = fixture.getUrlGetter();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void login() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testLogin_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.logger = new LavaLogger();
		fixture.url = "";
		fixture.urlGetter = new DummyRemoteGetter();

		fixture.login();

		// add additional test code here
	}

	/**
	 * Run the void setProperties(SiteProperties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetProperties_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.logger = new LavaLogger();
		fixture.url = "";
		fixture.urlGetter = new DummyRemoteGetter();
		SiteProperties serverProperties = new SiteProperties();
		serverProperties.setUrl("");

		fixture.setProperties(serverProperties);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/lavalamp/site/SiteProperties : Unsupported major.minor version 51.0
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
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
	}

	/**
	 * Run the void setUrlGetter(Getter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetUrlGetter_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.logger = new LavaLogger();
		fixture.url = "";
		fixture.urlGetter = new DummyRemoteGetter();
		Getter urlGetter = new DummyRemoteGetter();

		fixture.setUrlGetter(urlGetter);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.logger = new LavaLogger();
		fixture.url = "";
		fixture.urlGetter = new DummyRemoteGetter();

		String result = fixture.toString();

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
		new org.junit.runner.JUnitCore().run(AbstractBuildSiteTest.class);
	}
}