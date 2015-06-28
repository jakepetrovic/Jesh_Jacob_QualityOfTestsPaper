package org.jsecurity.web;

import java.io.IOException;
import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.jsecurity.session.InvalidSessionException;
import org.jsecurity.web.servlet.JSecurityHttpServletRequest;
import org.jsecurity.web.servlet.JSecurityHttpServletResponse;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WebUtilsTest</code> contains tests for the class <code>{@link WebUtils}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class WebUtilsTest {
	/**
	 * Run the WebUtils() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testWebUtils_1()
		throws Exception {
		WebUtils result = new WebUtils();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void bind(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBind_1()
		throws Exception {
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		WebUtils.bind(servletRequest);

		// add additional test code here
	}

	/**
	 * Run the void bind(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBind_2()
		throws Exception {
		ServletRequest servletRequest = null;

		WebUtils.bind(servletRequest);

		// add additional test code here
	}

	/**
	 * Run the void bind(ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBind_3()
		throws Exception {
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		WebUtils.bind(servletResponse);

		// add additional test code here
	}

	/**
	 * Run the void bind(ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBind_4()
		throws Exception {
		ServletResponse servletResponse = null;

		WebUtils.bind(servletResponse);

		// add additional test code here
	}

	/**
	 * Run the void bindInetAddressToThread(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBindInetAddressToThread_1()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		WebUtils.bindInetAddressToThread(request);

		// add additional test code here
	}

	/**
	 * Run the void bindInetAddressToThread(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBindInetAddressToThread_2()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		WebUtils.bindInetAddressToThread(request);

		// add additional test code here
	}

	/**
	 * Run the String decodeRequestString(HttpServletRequest,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDecodeRequestString_1()
		throws Exception {
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		String source = "";

		String result = WebUtils.decodeRequestString(request, source);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String decodeRequestString(HttpServletRequest,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDecodeRequestString_2()
		throws Exception {
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		String source = "";

		String result = WebUtils.decodeRequestString(request, source);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String decodeRequestString(HttpServletRequest,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDecodeRequestString_3()
		throws Exception {
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		String source = "";

		String result = WebUtils.decodeRequestString(request, source);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String determineEncoding(HttpServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDetermineEncoding_1()
		throws Exception {
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String result = WebUtils.determineEncoding(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String determineEncoding(HttpServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDetermineEncoding_2()
		throws Exception {
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String result = WebUtils.determineEncoding(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SavedRequest getAndClearSavedRequest(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetAndClearSavedRequest_1()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		SavedRequest result = WebUtils.getAndClearSavedRequest(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SavedRequest getAndClearSavedRequest(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetAndClearSavedRequest_2()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		SavedRequest result = WebUtils.getAndClearSavedRequest(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getCleanParam(ServletRequest,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetCleanParam_1()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		String paramName = "";

		String result = WebUtils.getCleanParam(request, paramName);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getContextPath(HttpServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetContextPath_1()
		throws Exception {
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String result = WebUtils.getContextPath(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getContextPath(HttpServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetContextPath_2()
		throws Exception {
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String result = WebUtils.getContextPath(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetAddress getInetAddress(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetInetAddress_1()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		InetAddress result = WebUtils.getInetAddress(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetAddress getInetAddress(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetInetAddress_2()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		InetAddress result = WebUtils.getInetAddress(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPathWithinApplication(HttpServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetPathWithinApplication_1()
		throws Exception {
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String result = WebUtils.getPathWithinApplication(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPathWithinApplication(HttpServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetPathWithinApplication_2()
		throws Exception {
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String result = WebUtils.getPathWithinApplication(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPathWithinApplication(HttpServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetPathWithinApplication_3()
		throws Exception {
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String result = WebUtils.getPathWithinApplication(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRequestUri(HttpServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetRequestUri_1()
		throws Exception {
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String result = WebUtils.getRequestUri(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRequestUri(HttpServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetRequestUri_2()
		throws Exception {
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String result = WebUtils.getRequestUri(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServletRequest getRequiredServletRequest() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetRequiredServletRequest_1()
		throws Exception {

		ServletRequest result = WebUtils.getRequiredServletRequest();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServletRequest getRequiredServletRequest() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRequiredServletRequest_2()
		throws Exception {

		ServletRequest result = WebUtils.getRequiredServletRequest();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServletResponse getRequiredServletResponse() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetRequiredServletResponse_1()
		throws Exception {

		ServletResponse result = WebUtils.getRequiredServletResponse();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServletResponse getRequiredServletResponse() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRequiredServletResponse_2()
		throws Exception {

		ServletResponse result = WebUtils.getRequiredServletResponse();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SavedRequest getSavedRequest(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetSavedRequest_1()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		SavedRequest result = WebUtils.getSavedRequest(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SavedRequest getSavedRequest(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetSavedRequest_2()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		SavedRequest result = WebUtils.getSavedRequest(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isTrue(ServletRequest,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsTrue_1()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		String paramName = "";

		boolean result = WebUtils.isTrue(request, paramName);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isTrue(ServletRequest,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsTrue_2()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		String paramName = "";

		boolean result = WebUtils.isTrue(request, paramName);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isTrue(ServletRequest,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsTrue_3()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		String paramName = "";

		boolean result = WebUtils.isTrue(request, paramName);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isTrue(ServletRequest,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsTrue_4()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		String paramName = "";

		boolean result = WebUtils.isTrue(request, paramName);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isTrue(ServletRequest,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsTrue_5()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		String paramName = "";

		boolean result = WebUtils.isTrue(request, paramName);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isTrue(ServletRequest,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsTrue_6()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		String paramName = "";

		boolean result = WebUtils.isTrue(request, paramName);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isTrue(ServletRequest,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsTrue_7()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		String paramName = "";

		boolean result = WebUtils.isTrue(request, paramName);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isTrue(ServletRequest,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsTrue_8()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		String paramName = "";

		boolean result = WebUtils.isTrue(request, paramName);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isTrue(ServletRequest,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsTrue_9()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		String paramName = "";

		boolean result = WebUtils.isTrue(request, paramName);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void issueRedirect(ServletRequest,ServletResponse,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIssueRedirect_1()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";

		WebUtils.issueRedirect(request, response, url);

		// add additional test code here
	}

	/**
	 * Run the void issueRedirect(ServletRequest,ServletResponse,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testIssueRedirect_2()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";

		WebUtils.issueRedirect(request, response, url);

		// add additional test code here
	}

	/**
	 * Run the void issueRedirect(ServletRequest,ServletResponse,String,Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIssueRedirect_3()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";
		Map queryParams = new LinkedHashMap();

		WebUtils.issueRedirect(request, response, url, queryParams);

		// add additional test code here
	}

	/**
	 * Run the void issueRedirect(ServletRequest,ServletResponse,String,Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testIssueRedirect_4()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";
		Map queryParams = new LinkedHashMap();

		WebUtils.issueRedirect(request, response, url, queryParams);

		// add additional test code here
	}

	/**
	 * Run the void issueRedirect(ServletRequest,ServletResponse,String,Map,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIssueRedirect_5()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";
		Map queryParams = new LinkedHashMap();
		boolean contextRelative = true;

		WebUtils.issueRedirect(request, response, url, queryParams, contextRelative);

		// add additional test code here
	}

	/**
	 * Run the void issueRedirect(ServletRequest,ServletResponse,String,Map,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testIssueRedirect_6()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";
		Map queryParams = new LinkedHashMap();
		boolean contextRelative = true;

		WebUtils.issueRedirect(request, response, url, queryParams, contextRelative);

		// add additional test code here
	}

	/**
	 * Run the void issueRedirect(ServletRequest,ServletResponse,String,Map,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIssueRedirect_7()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";
		Map queryParams = new LinkedHashMap();
		boolean contextRelative = true;
		boolean http10Compatible = true;

		WebUtils.issueRedirect(request, response, url, queryParams, contextRelative, http10Compatible);

		// add additional test code here
	}

	/**
	 * Run the void issueRedirect(ServletRequest,ServletResponse,String,Map,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testIssueRedirect_8()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String url = "";
		Map queryParams = new LinkedHashMap();
		boolean contextRelative = true;
		boolean http10Compatible = true;

		WebUtils.issueRedirect(request, response, url, queryParams, contextRelative, http10Compatible);

		// add additional test code here
	}

	/**
	 * Run the void saveRequest(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSaveRequest_1()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		WebUtils.saveRequest(request);

		// add additional test code here
	}

	/**
	 * Run the void saveRequest(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testSaveRequest_2()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		WebUtils.saveRequest(request);

		// add additional test code here
	}

	/**
	 * Run the HttpServletRequest toHttp(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testToHttp_1()
		throws Exception {
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		HttpServletRequest result = WebUtils.toHttp(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HttpServletResponse toHttp(ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testToHttp_2()
		throws Exception {
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		HttpServletResponse result = WebUtils.toHttp(response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void unbindInetAddressFromThread() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testUnbindInetAddressFromThread_1()
		throws Exception {

		WebUtils.unbindInetAddressFromThread();

		// add additional test code here
	}

	/**
	 * Run the ServletRequest unbindServletRequest() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testUnbindServletRequest_1()
		throws Exception {

		ServletRequest result = WebUtils.unbindServletRequest();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServletResponse unbindServletResponse() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testUnbindServletResponse_1()
		throws Exception {

		ServletResponse result = WebUtils.unbindServletResponse();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
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
	 * @generatedBy CodePro at 4/19/14 3:12 PM
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
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WebUtilsTest.class);
	}
}