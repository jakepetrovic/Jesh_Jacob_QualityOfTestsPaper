package org.jsecurity.web;

import java.util.Collection;
import java.util.Vector;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.jsecurity.mgt.DefaultSecurityManager;
import org.jsecurity.mgt.SecurityManager;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.session.InvalidSessionException;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.jsecurity.session.mgt.DelegatingSession;
import org.jsecurity.session.mgt.SessionManager;
import org.jsecurity.subject.DelegatingSubject;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.jsecurity.subject.Subject;
import org.jsecurity.web.servlet.JSecurityHttpServletRequest;
import org.jsecurity.web.servlet.JSecurityHttpServletResponse;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultWebSecurityManagerTest</code> contains tests for the class <code>{@link DefaultWebSecurityManager}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:14 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DefaultWebSecurityManagerTest {
	/**
	 * Run the DefaultWebSecurityManager() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testDefaultWebSecurityManager_1()
		throws Exception {

		DefaultWebSecurityManager result = new DefaultWebSecurityManager();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/DefaultWebSecurityManager : Unsupported major.minor version 51.0
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
	 * Run the DefaultWebSecurityManager(Collection<Realm>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testDefaultWebSecurityManager_2()
		throws Exception {
		Collection<Realm> realms = new Vector();

		DefaultWebSecurityManager result = new DefaultWebSecurityManager(realms);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/DefaultWebSecurityManager : Unsupported major.minor version 51.0
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
	 * Run the DefaultWebSecurityManager(Realm) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testDefaultWebSecurityManager_3()
		throws Exception {
		Realm singleRealm = new SimpleAccountRealm();

		DefaultWebSecurityManager result = new DefaultWebSecurityManager(singleRealm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/DefaultWebSecurityManager : Unsupported major.minor version 51.0
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
	 * Run the void bind(Subject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_1()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());

		fixture.bind(subject);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testBind_2()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());

		fixture.bind(subject);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testBind_3()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());

		fixture.bind(subject);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_4()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_5()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_6()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_7()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_8()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_9()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_10()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_11()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_12()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_13()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_14()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_15()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_16()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_17()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testBind_18()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testBind_19()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.bind(subject, request, response);

		// add additional test code here
	}

	/**
	 * Run the Subject createSubject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testCreateSubject_1()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");

		Subject result = fixture.createSubject();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Subject createSubject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreateSubject_2()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");

		Subject result = fixture.createSubject();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Subject createSubject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreateSubject_3()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");

		Subject result = fixture.createSubject();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Subject createSubject(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testCreateSubject_4()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Subject result = fixture.createSubject(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Subject createSubject(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testCreateSubject_5()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Subject result = fixture.createSubject(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Subject createSubject(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testCreateSubject_6()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Subject result = fixture.createSubject(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Subject createSubject(Session,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testCreateSubject_7()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Session existing = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Subject result = fixture.createSubject(existing, request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Subject createSubject(PrincipalCollection,boolean,Session,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testCreateSubject_8()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		PrincipalCollection principals = new SimplePrincipalCollection();
		boolean authenticated = true;
		Session existing = new ProxiedSession(new DelegatingSession());
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Subject result = fixture.createSubject(principals, authenticated, existing, request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection getPrincipals(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testGetPrincipals_1()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Session session = null;

		PrincipalCollection result = fixture.getPrincipals(session);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection getPrincipals(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetPrincipals_2()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Session session = new ProxiedSession(new DelegatingSession());

		PrincipalCollection result = fixture.getPrincipals(session);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection getPrincipals(Session,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testGetPrincipals_3()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Session existing = null;
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		PrincipalCollection result = fixture.getPrincipals(existing, servletRequest, servletResponse);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection getPrincipals(Session,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testGetPrincipals_4()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Session existing = null;
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		PrincipalCollection result = fixture.getPrincipals(existing, servletRequest, servletResponse);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection getPrincipals(Session,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testGetPrincipals_5()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Session existing = null;
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		PrincipalCollection result = fixture.getPrincipals(existing, servletRequest, servletResponse);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSessionMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testGetSessionMode_1()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");

		String result = fixture.getSessionMode();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isAuthenticated(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testIsAuthenticated_1()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Session session = null;

		boolean result = fixture.isAuthenticated(session);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isAuthenticated(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testIsAuthenticated_2()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Session session = null;

		boolean result = fixture.isAuthenticated(session);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isAuthenticated(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testIsAuthenticated_3()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Session session = new ProxiedSession(new DelegatingSession());

		boolean result = fixture.isAuthenticated(session);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isAuthenticated(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testIsAuthenticated_4()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Session session = new ProxiedSession(new DelegatingSession());

		boolean result = fixture.isAuthenticated(session);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isAuthenticated(Session,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testIsAuthenticated_5()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Session existing = new ProxiedSession(new DelegatingSession());
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.isAuthenticated(existing, servletRequest, servletResponse);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isAuthenticated(Session,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testIsAuthenticated_6()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Session existing = new ProxiedSession(new DelegatingSession());
		ServletRequest servletRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse servletResponse = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		boolean result = fixture.isAuthenticated(existing, servletRequest, servletResponse);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isHttpSessionMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testIsHttpSessionMode_1()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("");

		boolean result = fixture.isHttpSessionMode();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isHttpSessionMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testIsHttpSessionMode_2()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");

		boolean result = fixture.isHttpSessionMode();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isHttpSessionMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testIsHttpSessionMode_3()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");

		boolean result = fixture.isHttpSessionMode();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the SessionManager newSessionManagerInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testNewSessionManagerInstance_1()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");

		SessionManager result = fixture.newSessionManagerInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SessionManager newSessionManagerInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testNewSessionManagerInstance_2()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");

		SessionManager result = fixture.newSessionManagerInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SessionManager newSessionManagerInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testNewSessionManagerInstance_3()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");

		SessionManager result = fixture.newSessionManagerInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SessionManager newSessionManagerInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testNewSessionManagerInstance_4()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");

		SessionManager result = fixture.newSessionManagerInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setRememberMeCookieMaxAge(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testSetRememberMeCookieMaxAge_1()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		Integer rememberMeMaxAge = new Integer(1);

		fixture.setRememberMeCookieMaxAge(rememberMeMaxAge);

		// add additional test code here
	}

	/**
	 * Run the void setRememberMeCookiePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testSetRememberMeCookiePath_1()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		String rememberMeCookiePath = "";

		fixture.setRememberMeCookiePath(rememberMeCookiePath);

		// add additional test code here
	}

	/**
	 * Run the void setSessionIdCookieMaxAge(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testSetSessionIdCookieMaxAge_1()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		int maxAge = 1;

		fixture.setSessionIdCookieMaxAge(maxAge);

		// add additional test code here
	}

	/**
	 * Run the void setSessionIdCookieName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testSetSessionIdCookieName_1()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		String name = "";

		fixture.setSessionIdCookieName(name);

		// add additional test code here
	}

	/**
	 * Run the void setSessionIdCookiePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testSetSessionIdCookiePath_1()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		String path = "";

		fixture.setSessionIdCookiePath(path);

		// add additional test code here
	}

	/**
	 * Run the void setSessionIdCookieSecure(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testSetSessionIdCookieSecure_1()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		boolean secure = true;

		fixture.setSessionIdCookieSecure(secure);

		// add additional test code here
	}

	/**
	 * Run the void setSessionMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testSetSessionMode_1()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		String sessionMode = "http";

		fixture.setSessionMode(sessionMode);

		// add additional test code here
	}

	/**
	 * Run the void setSessionMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testSetSessionMode_2()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		String sessionMode = "jsecurity";

		fixture.setSessionMode(sessionMode);

		// add additional test code here
	}

	/**
	 * Run the void setSessionMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testSetSessionMode_3()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("");
		String sessionMode = "http";

		fixture.setSessionMode(sessionMode);

		// add additional test code here
	}

	/**
	 * Run the void setSessionMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testSetSessionMode_4()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("");
		String sessionMode = "jsecurity";

		fixture.setSessionMode(sessionMode);

		// add additional test code here
	}

	/**
	 * Run the void setSessionMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testSetSessionMode_5()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		String sessionMode = "http";

		fixture.setSessionMode(sessionMode);

		// add additional test code here
	}

	/**
	 * Run the void setSessionMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testSetSessionMode_6()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		String sessionMode = "jsecurity";

		fixture.setSessionMode(sessionMode);

		// add additional test code here
	}

	/**
	 * Run the void setSessionMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testSetSessionMode_7()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("");
		String sessionMode = "http";

		fixture.setSessionMode(sessionMode);

		// add additional test code here
	}

	/**
	 * Run the void setSessionMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test
	public void testSetSessionMode_8()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("");
		String sessionMode = "jsecurity";

		fixture.setSessionMode(sessionMode);

		// add additional test code here
	}

	/**
	 * Run the void setSessionMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetSessionMode_9()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		String sessionMode = null;

		fixture.setSessionMode(sessionMode);

		// add additional test code here
	}

	/**
	 * Run the void setSessionMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetSessionMode_10()
		throws Exception {
		DefaultWebSecurityManager fixture = new DefaultWebSecurityManager();
		fixture.setSessionMode("http");
		String sessionMode = "";

		fixture.setSessionMode(sessionMode);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:14 PM
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
	 * @generatedBy CodePro at 4/19/14 3:14 PM
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
	 * @generatedBy CodePro at 4/19/14 3:14 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DefaultWebSecurityManagerTest.class);
	}
}