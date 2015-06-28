package net.sf.lavalamp.application;

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
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BuildStatusServletTest {
	/**
	 * Run the BuildStatusServlet(DeviceController) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testBuildStatusServlet_1()
		throws Exception {
		DeviceController deviceController = new DeviceController(new Vector());

		BuildStatusServlet result = new BuildStatusServlet(deviceController);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getServletInfo());
		assertEquals(null, result.getServletConfig());
	}

	/**
	 * Run the void doGet(HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testDoGet_1()
		throws Exception {
		BuildStatusServlet fixture = new BuildStatusServlet(new DeviceController(new Vector()));
		HttpServletRequest request = new HttpServletRequestWrapper((HttpServletRequest) null);
		HttpServletResponse response = new HttpServletResponseWrapper((HttpServletResponse) null);

		fixture.doGet(request, response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
	}

	/**
	 * Run the void doGet(HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testDoGet_2()
		throws Exception {
		BuildStatusServlet fixture = new BuildStatusServlet(new DeviceController(new Vector()));
		HttpServletRequest request = new HttpServletRequestWrapper((HttpServletRequest) null);
		HttpServletResponse response = new HttpServletResponseWrapper((HttpServletResponse) null);

		fixture.doGet(request, response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
	}

	/**
	 * Run the void doGet(HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testDoGet_3()
		throws Exception {
		BuildStatusServlet fixture = new BuildStatusServlet(new DeviceController(new Vector()));
		HttpServletRequest request = new HttpServletRequestWrapper((HttpServletRequest) null);
		HttpServletResponse response = new HttpServletResponseWrapper((HttpServletResponse) null);

		fixture.doGet(request, response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
	}

	/**
	 * Run the void doGet(HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testDoGet_4()
		throws Exception {
		BuildStatusServlet fixture = new BuildStatusServlet(new DeviceController(new Vector()));
		HttpServletRequest request = new HttpServletRequestWrapper((HttpServletRequest) null);
		HttpServletResponse response = new HttpServletResponseWrapper((HttpServletResponse) null);

		fixture.doGet(request, response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
	}

	/**
	 * Run the void doGet(HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testDoGet_5()
		throws Exception {
		BuildStatusServlet fixture = new BuildStatusServlet(new DeviceController(new Vector()));
		HttpServletRequest request = new HttpServletRequestWrapper((HttpServletRequest) null);
		HttpServletResponse response = new HttpServletResponseWrapper((HttpServletResponse) null);

		fixture.doGet(request, response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BuildStatusServletTest.class);
	}
}