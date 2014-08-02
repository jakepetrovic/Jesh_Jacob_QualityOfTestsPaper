package org.jsecurity.web.config;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.jsecurity.config.ConfigurationException;
import org.jsecurity.mgt.RealmSecurityManager;
import org.jsecurity.util.AntPathMatcher;
import org.jsecurity.util.PatternMatcher;
import org.jsecurity.web.filter.authc.BasicHttpAuthenticationFilter;
import org.jsecurity.web.servlet.JSecurityHttpServletRequest;
import org.jsecurity.web.servlet.JSecurityHttpServletResponse;
import org.jsecurity.web.servlet.ProxiedFilterChain;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IniWebConfigurationTest</code> contains tests for the class <code>{@link IniWebConfiguration}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:31 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class IniWebConfigurationTest {
	/**
	 * Run the IniWebConfiguration() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testIniWebConfiguration_1()
		throws Exception {

		IniWebConfiguration result = new IniWebConfiguration();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/config/IniWebConfiguration : Unsupported major.minor version 51.0
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
	 * Run the void afterSecurityManagerSet(Map<String,Map<String,String>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testAfterSecurityManagerSet_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, Map<String, String>> sections = new LinkedHashMap();

		fixture.afterSecurityManagerSet(sections);

		// add additional test code here
	}

	/**
	 * Run the void assertFilter(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testAssertFilter_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		String name = "";
		Object o = new Object();

		fixture.assertFilter(name, o);

		// add additional test code here
	}

	/**
	 * Run the void assertFilter(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test(expected = org.jsecurity.config.ConfigurationException.class)
	public void testAssertFilter_2()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		String name = "";
		Object o = new Object();

		fixture.assertFilter(name, o);

		// add additional test code here
	}

	/**
	 * Run the void assertFilters(Map<String,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testAssertFilters_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, Object> map = null;

		fixture.assertFilters(map);

		// add additional test code here
	}

	/**
	 * Run the void assertFilters(Map<String,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testAssertFilters_2()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, Object> map = new LinkedHashMap();

		fixture.assertFilters(map);

		// add additional test code here
	}

	/**
	 * Run the void assertFilters(Map<String,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testAssertFilters_3()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, Object> map = new LinkedHashMap();

		fixture.assertFilters(map);

		// add additional test code here
	}

	/**
	 * Run the void assertFilters(Map<String,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testAssertFilters_4()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, Object> map = new LinkedHashMap();

		fixture.assertFilters(map);

		// add additional test code here
	}

	/**
	 * Run the void assertFilters(Map<String,?>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test(expected = org.jsecurity.config.ConfigurationException.class)
	public void testAssertFilters_5()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, Object> map = new LinkedHashMap();

		fixture.assertFilters(map);

		// add additional test code here
	}

	/**
	 * Run the FilterChain createChain(List<Filter>,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testCreateChain_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		List<Filter> filters = new Vector();
		FilterChain originalChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		FilterChain result = fixture.createChain(filters, originalChain);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, List<Filter>> createChains(Map<String,String>,Map<String,Filter>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testCreateChains_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, String> urls = null;
		Map<String, Filter> filters = new LinkedHashMap();

		Map<String, List<Filter>> result = fixture.createChains(urls, filters);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, List<Filter>> createChains(Map<String,String>,Map<String,Filter>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testCreateChains_2()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, String> urls = new LinkedHashMap();
		Map<String, Filter> filters = new LinkedHashMap();

		Map<String, List<Filter>> result = fixture.createChains(urls, filters);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, List<Filter>> createChains(Map<String,String>,Map<String,Filter>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testCreateChains_3()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, String> urls = new LinkedHashMap();
		Map<String, Filter> filters = null;

		Map<String, List<Filter>> result = fixture.createChains(urls, filters);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, List<Filter>> createChains(Map<String,String>,Map<String,Filter>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testCreateChains_4()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, String> urls = new LinkedHashMap();
		Map<String, Filter> filters = new LinkedHashMap();

		Map<String, List<Filter>> result = fixture.createChains(urls, filters);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, List<Filter>> createChains(Map<String,String>,Map<String,Filter>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testCreateChains_5()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, String> urls = new LinkedHashMap();
		Map<String, Filter> filters = new LinkedHashMap();

		Map<String, List<Filter>> result = fixture.createChains(urls, filters);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, List<Filter>> createChains(Map<String,String>,Map<String,Filter>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testCreateChains_6()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, String> urls = new LinkedHashMap();
		Map<String, Filter> filters = new LinkedHashMap();

		Map<String, List<Filter>> result = fixture.createChains(urls, filters);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, List<Filter>> createChains(Map<String,String>,Map<String,Filter>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testCreateChains_7()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, String> urls = new LinkedHashMap();
		Map<String, Filter> filters = new LinkedHashMap();

		Map<String, List<Filter>> result = fixture.createChains(urls, filters);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, List<Filter>> createChains(Map<String,String>,Map<String,Filter>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testCreateChains_8()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, String> urls = new LinkedHashMap();
		Map<String, Filter> filters = new LinkedHashMap();

		Map<String, List<Filter>> result = fixture.createChains(urls, filters);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, List<Filter>> createChains(Map<String,String>,Map<String,Filter>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testCreateChains_9()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, String> urls = new LinkedHashMap();
		Map<String, Filter> filters = new LinkedHashMap();

		Map<String, List<Filter>> result = fixture.createChains(urls, filters);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, List<Filter>> createChains(Map<String,String>,Map<String,Filter>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test(expected = org.jsecurity.config.ConfigurationException.class)
	public void testCreateChains_10()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, String> urls = new LinkedHashMap();
		Map<String, Filter> filters = new LinkedHashMap();

		Map<String, List<Filter>> result = fixture.createChains(urls, filters);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, Filter> createDefaultFilters() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testCreateDefaultFilters_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();

		Map<String, Filter> result = fixture.createDefaultFilters();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FilterChain getChain(String,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetChain_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		String chainUrl = "";
		FilterChain originalChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		FilterChain result = fixture.getChain(chainUrl, originalChain);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FilterChain getChain(String,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetChain_2()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		String chainUrl = "";
		FilterChain originalChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		FilterChain result = fixture.getChain(chainUrl, originalChain);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FilterChain getChain(String,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetChain_3()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		String chainUrl = "";
		FilterChain originalChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		FilterChain result = fixture.getChain(chainUrl, originalChain);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FilterChain getChain(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetChain_4()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain originalChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		FilterChain result = fixture.getChain(request, response, originalChain);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FilterChain getChain(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetChain_5()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain originalChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		FilterChain result = fixture.getChain(request, response, originalChain);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FilterChain getChain(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetChain_6()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain originalChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		FilterChain result = fixture.getChain(request, response, originalChain);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FilterChain getChain(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetChain_7()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain originalChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		FilterChain result = fixture.getChain(request, response, originalChain);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FilterChain getChain(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetChain_8()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain originalChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		FilterChain result = fixture.getChain(request, response, originalChain);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FilterChain getChain(ServletRequest,ServletResponse,FilterChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetChain_9()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		FilterChain originalChain = new ProxiedFilterChain((FilterChain) null, new Vector());

		FilterChain result = fixture.getChain(request, response, originalChain);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FilterConfig getFilterConfig() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetFilterConfig_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();

		FilterConfig result = fixture.getFilterConfig();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, Filter> getFilters(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetFilters_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, String> section = new LinkedHashMap();

		Map<String, Filter> result = fixture.getFilters(section);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, Filter> getFilters(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetFilters_2()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, String> section = null;

		Map<String, Filter> result = fixture.getFilters(section);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, Filter> getFilters(Map<String,String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetFilters_3()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, String> section = new LinkedHashMap();

		Map<String, Filter> result = fixture.getFilters(section);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PatternMatcher getPathMatcher() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetPathMatcher_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();

		PatternMatcher result = fixture.getPathMatcher();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPathWithinApplication(ServletRequest) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetPathWithinApplication_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);

		String result = fixture.getPathWithinApplication(request);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void initFilter(Filter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testInitFilter_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Filter filter = new BasicHttpAuthenticationFilter();

		fixture.initFilter(filter);

		// add additional test code here
	}

	/**
	 * Run the void initFilter(Filter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test(expected = org.jsecurity.config.ConfigurationException.class)
	public void testInitFilter_2()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Filter filter = new BasicHttpAuthenticationFilter();

		fixture.initFilter(filter);

		// add additional test code here
	}

	/**
	 * Run the void initFilters(Map<String,List<Filter>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testInitFilters_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, List<Filter>> chains = null;

		fixture.initFilters(chains);

		// add additional test code here
	}

	/**
	 * Run the void initFilters(Map<String,List<Filter>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testInitFilters_2()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, List<Filter>> chains = new LinkedHashMap();

		fixture.initFilters(chains);

		// add additional test code here
	}

	/**
	 * Run the void initFilters(Map<String,List<Filter>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testInitFilters_3()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, List<Filter>> chains = new LinkedHashMap();

		fixture.initFilters(chains);

		// add additional test code here
	}

	/**
	 * Run the void initFilters(Map<String,List<Filter>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testInitFilters_4()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, List<Filter>> chains = new LinkedHashMap();

		fixture.initFilters(chains);

		// add additional test code here
	}

	/**
	 * Run the void initFilters(Map<String,List<Filter>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testInitFilters_5()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, List<Filter>> chains = new LinkedHashMap();

		fixture.initFilters(chains);

		// add additional test code here
	}

	/**
	 * Run the void initFilters(Map<String,List<Filter>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testInitFilters_6()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		Map<String, List<Filter>> chains = new LinkedHashMap();

		fixture.initFilters(chains);

		// add additional test code here
	}

	/**
	 * Run the RealmSecurityManager newSecurityManagerInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testNewSecurityManagerInstance_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();

		RealmSecurityManager result = fixture.newSecurityManagerInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean pathMatches(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testPathMatches_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		String pattern = "";
		String path = "";

		boolean result = fixture.pathMatches(pattern, path);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean pathMatches(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testPathMatches_2()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		String pattern = "";
		String path = "";

		boolean result = fixture.pathMatches(pattern, path);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void setFilterConfig(FilterConfig) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testSetFilterConfig_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		FilterConfig filterConfig = null;

		fixture.setFilterConfig(filterConfig);

		// add additional test code here
	}

	/**
	 * Run the void setPathMatcher(PatternMatcher) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testSetPathMatcher_1()
		throws Exception {
		IniWebConfiguration fixture = new IniWebConfiguration();
		fixture.setFilterConfig((FilterConfig) null);
		fixture.setPathMatcher(new AntPathMatcher());
		fixture.chains = new LinkedHashMap();
		PatternMatcher pathMatcher = new AntPathMatcher();

		fixture.setPathMatcher(pathMatcher);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
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
	 * @generatedBy CodePro at 4/19/14 3:31 PM
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
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(IniWebConfigurationTest.class);
	}
}