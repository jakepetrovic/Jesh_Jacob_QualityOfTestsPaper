package net.sf.lavalamp.application;

import java.io.IOException;
import java.util.List;
import java.util.Vector;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import net.sf.lavalamp.device.Device;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import net.sf.lavalamp.device.DeviceController;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BuildStatusServletTest</code> contains tests for the class <code>{@link BuildStatusServlet}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class BuildStatusServletTest {
	/**
	 * Run the BuildStatusServlet(DeviceController) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testBuildStatusServlet_1()
		throws Exception {
		DeviceController deviceController = new DeviceController(new Vector());

		BuildStatusServlet result = new BuildStatusServlet(deviceController);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: net/sf/lavalamp/application/BuildStatusServlet : Unsupported major.minor version 51.0
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
	 * Run the void doGet(HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testDoGet_1()
		throws Exception {
		BuildStatusServlet fixture = new BuildStatusServlet(new DeviceController(new Vector()));
		HttpServletRequest request = new HttpServletRequestWrapper((HttpServletRequest) null);
		HttpServletResponse response = new HttpServletResponseWrapper((HttpServletResponse) null);

		fixture.doGet(request, response);

		// add additional test code here
	}

	/**
	 * Run the void doGet(HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testDoGet_2()
		throws Exception {
		BuildStatusServlet fixture = new BuildStatusServlet(new DeviceController(new Vector()));
		HttpServletRequest request = new HttpServletRequestWrapper((HttpServletRequest) null);
		HttpServletResponse response = new HttpServletResponseWrapper((HttpServletResponse) null);

		fixture.doGet(request, response);

		// add additional test code here
	}

	/**
	 * Run the void doGet(HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testDoGet_3()
		throws Exception {
		BuildStatusServlet fixture = new BuildStatusServlet(new DeviceController(new Vector()));
		HttpServletRequest request = new HttpServletRequestWrapper((HttpServletRequest) null);
		HttpServletResponse response = new HttpServletResponseWrapper((HttpServletResponse) null);

		fixture.doGet(request, response);

		// add additional test code here
	}

	/**
	 * Run the void doGet(HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testDoGet_4()
		throws Exception {
		BuildStatusServlet fixture = new BuildStatusServlet(new DeviceController(new Vector()));
		HttpServletRequest request = new HttpServletRequestWrapper((HttpServletRequest) null);
		HttpServletResponse response = new HttpServletResponseWrapper((HttpServletResponse) null);

		fixture.doGet(request, response);

		// add additional test code here
	}

	/**
	 * Run the void doGet(HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoGet_5()
		throws Exception {
		BuildStatusServlet fixture = new BuildStatusServlet(new DeviceController(new Vector()));
		HttpServletRequest request = new HttpServletRequestWrapper((HttpServletRequest) null);
		HttpServletResponse response = new HttpServletResponseWrapper((HttpServletResponse) null);

		fixture.doGet(request, response);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(BuildStatusServletTest.class);
	}
}