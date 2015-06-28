package ch.bluepenguin.email.client.tapestry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.apache.tapestry.ApplicationServlet;
import org.apache.tapestry.IEngine;
import org.apache.tapestry.IRequestCycle;
import org.apache.tapestry.asset.AssetService;
import org.apache.tapestry.engine.ActionService;
import org.apache.tapestry.engine.BaseEngine;
import org.apache.tapestry.engine.DirectService;
import org.apache.tapestry.engine.ExternalService;
import org.apache.tapestry.engine.IEngineService;
import org.apache.tapestry.engine.IMonitor;
import org.apache.tapestry.engine.NullMonitor;
import org.apache.tapestry.engine.RequestCycle;
import org.apache.tapestry.request.RequestContext;
import org.apache.tapestry.wml.WMLEngine;
import com.oreilly.servlet.MultipartWrapper;
import junit.framework.*;

/**
 * The class <code>HomeTest</code> contains tests for the class <code>{@link Home}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class HomeTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Home
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private Home fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Home
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public Home getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new Home();
		}
		return fixture;
	}

	/**
	 * Run the void listFolders(IRequestCycle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testListFolders_fixture_1()
		throws Exception {
		Home fixture2 = getFixture();
		IRequestCycle cycle = new RequestCycle(new SpringEngine(), new RequestContext(new ApplicationServlet(), new MultipartWrapper((HttpServletRequest) null, ""), new HttpServletResponseWrapper((HttpServletResponse) null)), new AssetService(), NullMonitor.SHARED);

		fixture2.listFolders(cycle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
		//       at com.oreilly.servlet.MultipartWrapper.<init>(MultipartWrapper.java:28)
	}

	/**
	 * Run the void listFolders(IRequestCycle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testListFolders_fixture_2()
		throws Exception {
		Home fixture2 = getFixture();
		IRequestCycle cycle = new RequestCycle(new BaseEngine(), new RequestContext(new ApplicationServlet(), new HttpServletRequestWrapper((HttpServletRequest) null), (HttpServletResponse) null), new ActionService(), (IMonitor) null);

		fixture2.listFolders(cycle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
	}

	/**
	 * Run the void listFolders(IRequestCycle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testListFolders_fixture_3()
		throws Exception {
		Home fixture2 = getFixture();
		IRequestCycle cycle = new RequestCycle(new WMLEngine(), new RequestContext((ApplicationServlet) null, new MultipartWrapper((HttpServletRequest) null, "0123456789"), (HttpServletResponse) null), new DirectService(), (IMonitor) null);

		fixture2.listFolders(cycle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
		//       at com.oreilly.servlet.MultipartWrapper.<init>(MultipartWrapper.java:28)
	}

	/**
	 * Run the void listFolders(IRequestCycle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testListFolders_fixture_4()
		throws Exception {
		Home fixture2 = getFixture();
		IRequestCycle cycle = new RequestCycle((IEngine) null, (RequestContext) null, new ExternalService(), (IMonitor) null);

		fixture2.listFolders(cycle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.apache.tapestry.AbstractPage.getVisit(AbstractPage.java:367)
		//       at ch.bluepenguin.email.client.tapestry.Home.listFolders(Home.java:16)
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