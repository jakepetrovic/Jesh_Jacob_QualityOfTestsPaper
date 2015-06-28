package org.jsecurity.spring;

import org.jsecurity.realm.activedirectory.ActiveDirectoryRealm;
import org.jsecurity.session.mgt.DefaultSessionManager;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LifecycleBeanPostProcessorTest</code> contains tests for the class <code>{@link LifecycleBeanPostProcessor}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class LifecycleBeanPostProcessorTest {
	/**
	 * Run the LifecycleBeanPostProcessor() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testLifecycleBeanPostProcessor_1()
		throws Exception {
		LifecycleBeanPostProcessor result = new LifecycleBeanPostProcessor();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Object postProcessAfterInitialization(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPostProcessAfterInitialization_1()
		throws Exception {
		LifecycleBeanPostProcessor fixture = new LifecycleBeanPostProcessor();
		Object object = new Object();
		String name = "";

		Object result = fixture.postProcessAfterInitialization(object, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void postProcessBeforeDestruction(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPostProcessBeforeDestruction_1()
		throws Exception {
		LifecycleBeanPostProcessor fixture = new LifecycleBeanPostProcessor();
		Object object = new DefaultSessionManager();
		String name = "";

		fixture.postProcessBeforeDestruction(object, name);

		// add additional test code here
	}

	/**
	 * Run the void postProcessBeforeDestruction(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPostProcessBeforeDestruction_2()
		throws Exception {
		LifecycleBeanPostProcessor fixture = new LifecycleBeanPostProcessor();
		Object object = new DefaultSessionManager();
		String name = "";

		fixture.postProcessBeforeDestruction(object, name);

		// add additional test code here
	}

	/**
	 * Run the void postProcessBeforeDestruction(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPostProcessBeforeDestruction_3()
		throws Exception {
		LifecycleBeanPostProcessor fixture = new LifecycleBeanPostProcessor();
		Object object = new Object();
		String name = "";

		fixture.postProcessBeforeDestruction(object, name);

		// add additional test code here
	}

	/**
	 * Run the Object postProcessBeforeInitialization(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPostProcessBeforeInitialization_1()
		throws Exception {
		LifecycleBeanPostProcessor fixture = new LifecycleBeanPostProcessor();
		Object object = new ActiveDirectoryRealm();
		String name = "";

		Object result = fixture.postProcessBeforeInitialization(object, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object postProcessBeforeInitialization(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPostProcessBeforeInitialization_2()
		throws Exception {
		LifecycleBeanPostProcessor fixture = new LifecycleBeanPostProcessor();
		Object object = new ActiveDirectoryRealm();
		String name = "";

		Object result = fixture.postProcessBeforeInitialization(object, name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object postProcessBeforeInitialization(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPostProcessBeforeInitialization_3()
		throws Exception {
		LifecycleBeanPostProcessor fixture = new LifecycleBeanPostProcessor();
		Object object = new Object();
		String name = "";

		Object result = fixture.postProcessBeforeInitialization(object, name);

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
		new org.junit.runner.JUnitCore().run(LifecycleBeanPostProcessorTest.class);
	}
}