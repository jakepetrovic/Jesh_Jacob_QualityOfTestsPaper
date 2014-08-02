package org.jsecurity.realm.jndi;

import java.util.Collection;
import java.util.Vector;
import org.jsecurity.realm.Realm;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JndiRealmFactoryTest</code> contains tests for the class <code>{@link JndiRealmFactory}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:10 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class JndiRealmFactoryTest {
	/**
	 * Run the JndiRealmFactory() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testJndiRealmFactory_1()
		throws Exception {
		JndiRealmFactory result = new JndiRealmFactory();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Collection<String> getJndiNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetJndiNames_1()
		throws Exception {
		JndiRealmFactory fixture = new JndiRealmFactory();
		fixture.setJndiNames(new Vector());

		Collection<String> result = fixture.getJndiNames();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Realm> getRealms() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRealms_1()
		throws Exception {
		JndiRealmFactory fixture = new JndiRealmFactory();
		fixture.setJndiNames(new Vector());

		Collection<Realm> result = fixture.getRealms();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Realm> getRealms() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRealms_2()
		throws Exception {
		JndiRealmFactory fixture = new JndiRealmFactory();
		fixture.setJndiNames(new Vector());

		Collection<Realm> result = fixture.getRealms();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Realm> getRealms() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetRealms_4()
		throws Exception {
		JndiRealmFactory fixture = new JndiRealmFactory();
		fixture.setJndiNames(new Vector());

		Collection<Realm> result = fixture.getRealms();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setJndiNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetJndiNames_1()
		throws Exception {
		JndiRealmFactory fixture = new JndiRealmFactory();
		fixture.setJndiNames(new Vector());
		String commaDelimited = "";

		fixture.setJndiNames(commaDelimited);

		// add additional test code here
	}

	/**
	 * Run the void setJndiNames(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testSetJndiNames_2()
		throws Exception {
		JndiRealmFactory fixture = new JndiRealmFactory();
		fixture.setJndiNames(new Vector());
		String commaDelimited = "";

		fixture.setJndiNames(commaDelimited);

		// add additional test code here
	}

	/**
	 * Run the void setJndiNames(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetJndiNames_3()
		throws Exception {
		JndiRealmFactory fixture = new JndiRealmFactory();
		fixture.setJndiNames(new Vector());
		Collection<String> jndiNames = new Vector();

		fixture.setJndiNames(jndiNames);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(JndiRealmFactoryTest.class);
	}
}