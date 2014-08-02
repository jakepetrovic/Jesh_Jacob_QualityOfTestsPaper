package org.jsecurity.realm.text;

import java.text.ParseException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TextConfigurationRealmTest</code> contains tests for the class <code>{@link TextConfigurationRealm}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:24 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class TextConfigurationRealmTest {
	/**
	 * Run the TextConfigurationRealm() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testTextConfigurationRealm_1()
		throws Exception {

		TextConfigurationRealm result = new TextConfigurationRealm();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/realm/text/TextConfigurationRealm : Unsupported major.minor version 51.0
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
	 * Run the void accountAndRoleCachesCreated() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testAccountAndRoleCachesCreated_1()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.accountAndRoleCachesCreated();

		// add additional test code here
	}

	/**
	 * Run the String getRoleDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testGetRoleDefinitions_1()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		String result = fixture.getRoleDefinitions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUserDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testGetUserDefinitions_1()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		String result = fixture.getUserDefinitions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void onLogout(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testOnLogout_1()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");
		PrincipalCollection accountPrincipal = new SimplePrincipalCollection();

		fixture.onLogout(accountPrincipal);

		// add additional test code here
	}

	/**
	 * Run the void processDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessDefinitions_1()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testProcessDefinitions_2()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testProcessDefinitions_3()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processRoleDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessRoleDefinitions_1()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions((String) null);

		fixture.processRoleDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processRoleDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessRoleDefinitions_2()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processRoleDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processRoleDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessRoleDefinitions_3()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processRoleDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processRoleDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessRoleDefinitions_4()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processRoleDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processRoleDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessRoleDefinitions_5()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processRoleDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processRoleDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessRoleDefinitions_6()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processRoleDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processRoleDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test(expected = java.text.ParseException.class)
	public void testProcessRoleDefinitions_7()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processRoleDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processUserDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessUserDefinitions_1()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions((String) null);
		fixture.setRoleDefinitions("");

		fixture.processUserDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processUserDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessUserDefinitions_2()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processUserDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processUserDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessUserDefinitions_3()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processUserDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processUserDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessUserDefinitions_4()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processUserDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processUserDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessUserDefinitions_5()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processUserDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processUserDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessUserDefinitions_6()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processUserDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processUserDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessUserDefinitions_7()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processUserDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processUserDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessUserDefinitions_8()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processUserDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processUserDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessUserDefinitions_9()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processUserDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processUserDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessUserDefinitions_10()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processUserDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processUserDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessUserDefinitions_11()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processUserDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processUserDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testProcessUserDefinitions_12()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processUserDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void processUserDefinitions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test(expected = java.text.ParseException.class)
	public void testProcessUserDefinitions_13()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");

		fixture.processUserDefinitions();

		// add additional test code here
	}

	/**
	 * Run the void setRoleDefinitions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testSetRoleDefinitions_1()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");
		String roleDefinitions = "";

		fixture.setRoleDefinitions(roleDefinitions);

		// add additional test code here
	}

	/**
	 * Run the void setUserDefinitions(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testSetUserDefinitions_1()
		throws Exception {
		TextConfigurationRealm fixture = new TextConfigurationRealm();
		fixture.setUserDefinitions("");
		fixture.setRoleDefinitions("");
		String userDefinitions = "";

		fixture.setUserDefinitions(userDefinitions);

		// add additional test code here
	}

	/**
	 * Run the Set<String> toLines(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testToLines_1()
		throws Exception {
		String s = "";

		Set<String> result = TextConfigurationRealm.toLines(s);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> toLines(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testToLines_2()
		throws Exception {
		String s = "";

		Set<String> result = TextConfigurationRealm.toLines(s);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, String> toMap(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testToMap_1()
		throws Exception {
		Collection<String> keyValuePairs = null;

		Map<String, String> result = TextConfigurationRealm.toMap(keyValuePairs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, String> toMap(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testToMap_2()
		throws Exception {
		Collection<String> keyValuePairs = new Vector();

		Map<String, String> result = TextConfigurationRealm.toMap(keyValuePairs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, String> toMap(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testToMap_3()
		throws Exception {
		Collection<String> keyValuePairs = new Vector();

		Map<String, String> result = TextConfigurationRealm.toMap(keyValuePairs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, String> toMap(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test
	public void testToMap_4()
		throws Exception {
		Collection<String> keyValuePairs = new Vector();

		Map<String, String> result = TextConfigurationRealm.toMap(keyValuePairs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<String, String> toMap(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	@Test(expected = java.text.ParseException.class)
	public void testToMap_5()
		throws Exception {
		Collection<String> keyValuePairs = new Vector();

		Map<String, String> result = TextConfigurationRealm.toMap(keyValuePairs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:24 PM
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
	 * @generatedBy CodePro at 4/19/14 3:24 PM
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
	 * @generatedBy CodePro at 4/19/14 3:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TextConfigurationRealmTest.class);
	}
}