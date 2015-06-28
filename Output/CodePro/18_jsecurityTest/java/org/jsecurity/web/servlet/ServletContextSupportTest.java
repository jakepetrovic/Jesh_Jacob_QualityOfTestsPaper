package org.jsecurity.web.servlet;

import javax.servlet.ServletContext;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ServletContextSupportTest</code> contains tests for the class <code>{@link ServletContextSupport}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ServletContextSupportTest {
	/**
	 * Run the ServletContextSupport() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testServletContextSupport_1()
		throws Exception {
		ServletContextSupport result = new ServletContextSupport();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void bind(String,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testBind_1()
		throws Exception {
		ServletContextSupport fixture = new ServletContextSupport();
		fixture.setServletContext((ServletContext) null);
		String name = "";
		String key = "";
		Object value = new Object();

		fixture.bind(name, key, value);

		// add additional test code here
	}

	/**
	 * Run the void bind(String,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testBind_2()
		throws Exception {
		ServletContextSupport fixture = new ServletContextSupport();
		fixture.setServletContext((ServletContext) null);
		String name = "";
		String key = "";
		Object value = null;

		fixture.bind(name, key, value);

		// add additional test code here
	}

	/**
	 * Run the void bind(String,String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testBind_3()
		throws Exception {
		ServletContextSupport fixture = new ServletContextSupport();
		fixture.setServletContext((ServletContext) null);
		String name = "";
		String key = "";
		Object value = new Object();

		fixture.bind(name, key, value);

		// add additional test code here
	}

	/**
	 * Run the Object getAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testGetAttribute_1()
		throws Exception {
		ServletContextSupport fixture = new ServletContextSupport();
		fixture.setServletContext((ServletContext) null);
		String key = "";

		Object result = fixture.getAttribute(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getContextInitParam(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testGetContextInitParam_1()
		throws Exception {
		ServletContextSupport fixture = new ServletContextSupport();
		fixture.setServletContext((ServletContext) null);
		String paramName = "";

		String result = fixture.getContextInitParam(paramName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServletContext getServletContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testGetServletContext_1()
		throws Exception {
		ServletContextSupport fixture = new ServletContextSupport();
		fixture.setServletContext((ServletContext) null);

		ServletContext result = fixture.getServletContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void removeAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testRemoveAttribute_1()
		throws Exception {
		ServletContextSupport fixture = new ServletContextSupport();
		fixture.setServletContext((ServletContext) null);
		String key = "";

		fixture.removeAttribute(key);

		// add additional test code here
	}

	/**
	 * Run the void setAttribute(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testSetAttribute_1()
		throws Exception {
		ServletContextSupport fixture = new ServletContextSupport();
		fixture.setServletContext((ServletContext) null);
		String key = "";
		Object value = new Object();

		fixture.setAttribute(key, value);

		// add additional test code here
	}

	/**
	 * Run the void setServletContext(ServletContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testSetServletContext_1()
		throws Exception {
		ServletContextSupport fixture = new ServletContextSupport();
		fixture.setServletContext((ServletContext) null);
		ServletContext servletContext = null;

		fixture.setServletContext(servletContext);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
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
	 * @generatedBy CodePro at 4/19/14 3:47 PM
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
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ServletContextSupportTest.class);
	}
}