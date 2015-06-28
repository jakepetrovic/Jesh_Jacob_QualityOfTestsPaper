package ch.bluepenguin.email.client.tapestry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.apache.tapestry.ApplicationServlet;
import org.apache.tapestry.request.RequestContext;
import com.oreilly.servlet.MultipartWrapper;
import junit.framework.*;

/**
 * The class <code>SpringEngineTest</code> contains tests for the class <code>{@link SpringEngine}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SpringEngineTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see SpringEngine
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private SpringEngine fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see SpringEngine
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public SpringEngine getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new SpringEngine();
		}
		return fixture;
	}

	/**
	 * Run the void setupForRequest(RequestContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetupForRequest_fixture_1()
		throws Exception {
		SpringEngine fixture2 = getFixture();
		RequestContext context = new RequestContext(new ApplicationServlet(), new MultipartWrapper((HttpServletRequest) null, ""), new HttpServletResponseWrapper((HttpServletResponse) null));

		fixture2.setupForRequest(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
		//       at com.oreilly.servlet.MultipartWrapper.<init>(MultipartWrapper.java:28)
	}

	/**
	 * Run the void setupForRequest(RequestContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetupForRequest_fixture_2()
		throws Exception {
		SpringEngine fixture2 = getFixture();
		RequestContext context = new RequestContext(new ApplicationServlet(), new HttpServletRequestWrapper((HttpServletRequest) null), (HttpServletResponse) null);

		fixture2.setupForRequest(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
	}

	/**
	 * Run the void setupForRequest(RequestContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetupForRequest_fixture_3()
		throws Exception {
		SpringEngine fixture2 = getFixture();
		RequestContext context = new RequestContext((ApplicationServlet) null, new MultipartWrapper((HttpServletRequest) null, "0123456789"), (HttpServletResponse) null);

		fixture2.setupForRequest(context);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
		//       at com.oreilly.servlet.MultipartWrapper.<init>(MultipartWrapper.java:28)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
		// Add additional tear down code here
	}
}