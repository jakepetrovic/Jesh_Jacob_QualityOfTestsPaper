package org.jsecurity.web.servlet;

import java.io.IOException;
import java.net.InetAddress;
import java.util.List;
import java.util.Vector;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.jsecurity.JSecurityException;
import org.jsecurity.config.Configuration;
import org.jsecurity.config.ConfigurationException;
import org.jsecurity.config.IniConfiguration;
import org.jsecurity.mgt.DefaultSecurityManager;
import org.jsecurity.mgt.SecurityManager;
import org.jsecurity.web.DefaultWebSecurityManager;
import org.jsecurity.web.config.IniWebConfiguration;
import org.jsecurity.web.config.WebConfiguration;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JSecurityFilterTest</code> contains tests for the class <code>{@link JSecurityFilter}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class JSecurityFilterTest {
	/**
	 * Run the JSecurityFilter() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testJSecurityFilter_1()
		throws Exception {

		JSecurityFilter result = new JSecurityFilter();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/servlet/JSecurityFilter : Unsupported major.minor version 51.0
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
	 * Run the void applyEmbeddedConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyEmbeddedConfig_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyEmbeddedConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyEmbeddedConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyEmbeddedConfig_2()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = null;
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyEmbeddedConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_2()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_3()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_4()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_5()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_6()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_7()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_8()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_9()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_10()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_11()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_12()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_13()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_14()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_15()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyFilterConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyFilterConfig_16()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyFilterConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyInitParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyInitParams_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";

		fixture.applyInitParams();

		// add additional test code here
	}

	/**
	 * Run the void applyInitParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyInitParams_2()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";

		fixture.applyInitParams();

		// add additional test code here
	}

	/**
	 * Run the void applyInitParams() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.config.ConfigurationException.class)
	public void testApplyInitParams_3()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";

		fixture.applyInitParams();

		// add additional test code here
	}

	/**
	 * Run the void applyUrlConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyUrlConfig_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyUrlConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the void applyUrlConfig(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testApplyUrlConfig_2()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = null;
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration conf = new IniWebConfiguration();

		fixture.applyUrlConfig(conf);

		// add additional test code here
	}

	/**
	 * Run the WebConfiguration configure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testConfigure_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";

		WebConfiguration result = fixture.configure();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the WebConfiguration configure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.JSecurityException.class)
	public void testConfigure_2()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";

		WebConfiguration result = fixture.configure();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDestroy_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDoFilterInternal_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain origChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(servletRequest, servletResponse, origChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDoFilterInternal_2()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain origChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(servletRequest, servletResponse, origChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDoFilterInternal_3()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain origChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(servletRequest, servletResponse, origChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDoFilterInternal_4()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain origChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(servletRequest, servletResponse, origChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDoFilterInternal_5()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain origChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(servletRequest, servletResponse, origChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDoFilterInternal_6()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain origChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(servletRequest, servletResponse, origChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDoFilterInternal_7()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain origChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(servletRequest, servletResponse, origChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDoFilterInternal_8()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain origChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(servletRequest, servletResponse, origChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testDoFilterInternal_9()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain origChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(servletRequest, servletResponse, origChain);

		// add additional test code here
	}

	/**
	 * Run the void doFilterInternal(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = javax.servlet.ServletException.class)
	public void testDoFilterInternal_10()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain origChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		fixture.doFilterInternal(servletRequest, servletResponse, origChain);

		// add additional test code here
	}

	/**
	 * Run the SecurityManager ensureSecurityManager(Configuration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testEnsureSecurityManager_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		Configuration config = new IniConfiguration();

		SecurityManager result = fixture.ensureSecurityManager(config);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager ensureSecurityManager(Configuration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testEnsureSecurityManager_2()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		Configuration config = new IniConfiguration();

		SecurityManager result = fixture.ensureSecurityManager(config);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager ensureSecurityManager(Configuration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testEnsureSecurityManager_3()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		Configuration config = new IniConfiguration();

		SecurityManager result = fixture.ensureSecurityManager(config);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the WebConfiguration getConfiguration() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetConfiguration_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";

		WebConfiguration result = fixture.getConfiguration();

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
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		InetAddress result = fixture.getInetAddress(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager getSecurityManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetSecurityManager_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";

		SecurityManager result = fixture.getSecurityManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isHttpSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsHttpSessions_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultWebSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";

		boolean result = fixture.isHttpSessions();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isHttpSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsHttpSessions_2()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultWebSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";

		boolean result = fixture.isHttpSessions();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isHttpSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testIsHttpSessions_3()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";

		boolean result = fixture.isHttpSessions();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void onFilterConfigSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testOnFilterConfigSet_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";

		fixture.onFilterConfigSet();

		// add additional test code here
	}

	/**
	 * Run the void setConfiguration(WebConfiguration) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSetConfiguration_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		WebConfiguration configuration = new IniWebConfiguration();

		fixture.setConfiguration(configuration);

		// add additional test code here
	}

	/**
	 * Run the void setSecurityManager(SecurityManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSetSecurityManager_1()
		throws Exception {
		JSecurityFilter fixture = new JSecurityFilter();
		fixture.setConfiguration(new IniWebConfiguration());
		fixture.setSecurityManager(new DefaultSecurityManager());
		fixture.configClassName = "";
		fixture.configUrl = "";
		fixture.filterConfig = null;
		fixture.config = "";
		SecurityManager sm = new DefaultSecurityManager();

		fixture.setSecurityManager(sm);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(JSecurityFilterTest.class);
	}
}