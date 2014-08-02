package org.jsecurity.web.attr;

import java.beans.PropertyEditor;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.jsecurity.web.servlet.JSecurityHttpServletRequest;
import org.jsecurity.web.servlet.JSecurityHttpServletResponse;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractWebAttributeTest</code> contains tests for the class <code>{@link AbstractWebAttribute}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:46 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AbstractWebAttributeTest {
	/**
	 * Run the Object fromStringValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testFromStringValue_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		String stringValue = "";

		Object result = fixture.fromStringValue(stringValue);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object fromStringValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testFromStringValue_2()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		String stringValue = "";

		Object result = fixture.fromStringValue(stringValue);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object fromStringValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testFromStringValue_3()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		String stringValue = "";

		Object result = fixture.fromStringValue(stringValue);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Class<? extends PropertyEditor> getEditorClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetEditorClass_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;

		Class<? extends PropertyEditor> result = fixture.getEditorClass();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getFromRequestParam(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetFromRequestParam_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		Object result = fixture.getFromRequestParam(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getFromRequestParam(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetFromRequestParam_2()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		Object result = fixture.getFromRequestParam(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getFromRequestParam(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetFromRequestParam_3()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		Object result = fixture.getFromRequestParam(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getFromRequestParam(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetFromRequestParam_4()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		Object result = fixture.getFromRequestParam(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isCheckRequestParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testIsCheckRequestParams_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;

		boolean result = fixture.isCheckRequestParams();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isCheckRequestParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testIsCheckRequestParams_2()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = false;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;

		boolean result = fixture.isCheckRequestParams();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isCheckRequestParamsFirst() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testIsCheckRequestParamsFirst_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;

		boolean result = fixture.isCheckRequestParamsFirst();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isCheckRequestParamsFirst() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testIsCheckRequestParamsFirst_2()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = false;
		fixture.mutable = true;

		boolean result = fixture.isCheckRequestParamsFirst();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isMutable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testIsMutable_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;

		boolean result = fixture.isMutable();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isMutable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testIsMutable_2()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = false;

		boolean result = fixture.isMutable();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Object retrieveValue(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testRetrieveValue_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Object result = fixture.retrieveValue(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object retrieveValue(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testRetrieveValue_2()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Object result = fixture.retrieveValue(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object retrieveValue(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testRetrieveValue_3()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Object result = fixture.retrieveValue(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object retrieveValue(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testRetrieveValue_4()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Object result = fixture.retrieveValue(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setCheckRequestParams(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetCheckRequestParams_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		boolean checkRequestParams = true;

		fixture.setCheckRequestParams(checkRequestParams);

		// add additional test code here
	}

	/**
	 * Run the void setCheckRequestParamsFirst(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetCheckRequestParamsFirst_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		boolean checkRequestParamsFirst = true;

		fixture.setCheckRequestParamsFirst(checkRequestParamsFirst);

		// add additional test code here
	}

	/**
	 * Run the void setEditorClass(Class<? extends PropertyEditor>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetEditorClass_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		Class<? extends PropertyEditor> editorClass = PropertyEditor.class;

		fixture.setEditorClass(editorClass);

		// add additional test code here
	}

	/**
	 * Run the void setMutable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetMutable_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		boolean mutable = true;

		fixture.setMutable(mutable);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void storeValue(T,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testStoreValue_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.storeValue(null, request, response);

		// add additional test code here
	}

	/**
	 * Run the void storeValue(T,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testStoreValue_2()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.storeValue(null, request, response);

		// add additional test code here
	}

	/**
	 * Run the void storeValue(T,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testStoreValue_3()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.storeValue(null, request, response);

		// add additional test code here
	}

	/**
	 * Run the void storeValue(T,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testStoreValue_4()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.storeValue(null, request, response);

		// add additional test code here
	}

	/**
	 * Run the void storeValue(T,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testStoreValue_5()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.storeValue(null, request, response);

		// add additional test code here
	}

	/**
	 * Run the void storeValue(T,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testStoreValue_6()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.storeValue(null, request, response);

		// add additional test code here
	}

	/**
	 * Run the String toStringValue(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testToStringValue_1()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;

		String result = fixture.toStringValue(null);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toStringValue(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testToStringValue_2()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;

		String result = fixture.toStringValue(null);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toStringValue(T) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testToStringValue_3()
		throws Exception {
		CookieAttribute fixture = new CookieAttribute();
		fixture.checkRequestParams = true;
		fixture.name = "";
		fixture.checkRequestParamsFirst = true;
		fixture.mutable = true;

		String result = fixture.toStringValue(null);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractWebAttributeTest.class);
	}
}