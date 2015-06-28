package org.jsecurity.web;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.jsecurity.web.servlet.JSecurityHttpServletRequest;
import org.jsecurity.web.servlet.JSecurityHttpServletResponse;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RedirectViewTest</code> contains tests for the class <code>{@link RedirectView}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:10 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class RedirectViewTest {
	/**
	 * Run the RedirectView() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testRedirectView_1()
		throws Exception {

		RedirectView result = new RedirectView();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/RedirectView : Unsupported major.minor version 51.0
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
	 * Run the RedirectView(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testRedirectView_2()
		throws Exception {
		String url = "";

		RedirectView result = new RedirectView(url);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/RedirectView : Unsupported major.minor version 51.0
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
	 * Run the RedirectView(String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testRedirectView_3()
		throws Exception {
		String url = "";
		boolean contextRelative = true;

		RedirectView result = new RedirectView(url, contextRelative);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/RedirectView : Unsupported major.minor version 51.0
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
	 * Run the RedirectView(String,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testRedirectView_4()
		throws Exception {
		String url = "";
		boolean contextRelative = true;
		boolean http10Compatible = true;

		RedirectView result = new RedirectView(url, contextRelative, http10Compatible);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/RedirectView : Unsupported major.minor version 51.0
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
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_1()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_2()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_3()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_4()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_5()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_6()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_7()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_8()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_9()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_10()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_11()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_12()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_13()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_14()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_15()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void appendQueryProperties(StringBuffer,Map,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAppendQueryProperties_16()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		StringBuffer targetUrl = new StringBuffer();
		Map model = new LinkedHashMap();
		String encodingScheme = "";

		fixture.appendQueryProperties(targetUrl, model, encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the String getUrl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetUrl_1()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");

		String result = fixture.getUrl();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map queryProperties(Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testQueryProperties_1()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		Map model = new LinkedHashMap();

		Map result = fixture.queryProperties(model);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void renderMergedOutputModel(Map,HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testRenderMergedOutputModel_1()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("/");
		fixture.setEncodingScheme("");
		Map model = new LinkedHashMap();
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		HttpServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.renderMergedOutputModel(model, request, response);

		// add additional test code here
	}

	/**
	 * Run the void renderMergedOutputModel(Map,HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testRenderMergedOutputModel_2()
		throws Exception {
		RedirectView fixture = new RedirectView("", false, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		Map model = new LinkedHashMap();
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		HttpServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.renderMergedOutputModel(model, request, response);

		// add additional test code here
	}

	/**
	 * Run the void renderMergedOutputModel(Map,HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testRenderMergedOutputModel_3()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		Map model = new LinkedHashMap();
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		HttpServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.renderMergedOutputModel(model, request, response);

		// add additional test code here
	}

	/**
	 * Run the void renderMergedOutputModel(Map,HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testRenderMergedOutputModel_4()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("/");
		fixture.setEncodingScheme("");
		Map model = new LinkedHashMap();
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		HttpServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.renderMergedOutputModel(model, request, response);

		// add additional test code here
	}

	/**
	 * Run the void renderMergedOutputModel(Map,HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testRenderMergedOutputModel_5()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		Map model = new LinkedHashMap();
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		HttpServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.renderMergedOutputModel(model, request, response);

		// add additional test code here
	}

	/**
	 * Run the void sendRedirect(HttpServletRequest,HttpServletResponse,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSendRedirect_1()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		HttpServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String targetUrl = "";
		boolean http10Compatible = false;

		fixture.sendRedirect(request, response, targetUrl, http10Compatible);

		// add additional test code here
	}

	/**
	 * Run the void sendRedirect(HttpServletRequest,HttpServletResponse,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSendRedirect_2()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		HttpServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String targetUrl = "";
		boolean http10Compatible = true;

		fixture.sendRedirect(request, response, targetUrl, http10Compatible);

		// add additional test code here
	}

	/**
	 * Run the void sendRedirect(HttpServletRequest,HttpServletResponse,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testSendRedirect_3()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		HttpServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		HttpServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		String targetUrl = "";
		boolean http10Compatible = true;

		fixture.sendRedirect(request, response, targetUrl, http10Compatible);

		// add additional test code here
	}

	/**
	 * Run the void setContextRelative(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetContextRelative_1()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		boolean contextRelative = true;

		fixture.setContextRelative(contextRelative);

		// add additional test code here
	}

	/**
	 * Run the void setEncodingScheme(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetEncodingScheme_1()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		String encodingScheme = "";

		fixture.setEncodingScheme(encodingScheme);

		// add additional test code here
	}

	/**
	 * Run the void setHttp10Compatible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetHttp10Compatible_1()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		boolean http10Compatible = true;

		fixture.setHttp10Compatible(http10Compatible);

		// add additional test code here
	}

	/**
	 * Run the void setUrl(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetUrl_1()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		String url = "";

		fixture.setUrl(url);

		// add additional test code here
	}

	/**
	 * Run the String urlEncode(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testUrlEncode_1()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		String input = "";
		String encodingScheme = "";

		String result = fixture.urlEncode(input, encodingScheme);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String urlEncode(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testUrlEncode_2()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		String input = "";
		String encodingScheme = "";

		String result = fixture.urlEncode(input, encodingScheme);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String urlEncode(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testUrlEncode_3()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		String input = "";
		String encodingScheme = "";

		String result = fixture.urlEncode(input, encodingScheme);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String urlEncode(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testUrlEncode_4()
		throws Exception {
		RedirectView fixture = new RedirectView("", true, true);
		fixture.setUrl("");
		fixture.setEncodingScheme("");
		String input = "";
		String encodingScheme = "";

		String result = fixture.urlEncode(input, encodingScheme);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RedirectViewTest.class);
	}
}