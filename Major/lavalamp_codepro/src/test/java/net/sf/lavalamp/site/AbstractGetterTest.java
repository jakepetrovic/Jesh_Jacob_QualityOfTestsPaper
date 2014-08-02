package net.sf.lavalamp.site;

import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractGetterTest</code> contains tests for the class <code>{@link AbstractGetter}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AbstractGetterTest {
	/**
	 * Run the void setCredentials(UsernamePasswordCredentials) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetCredentials_1()
		throws Exception {
		DummyRemoteGetter fixture = new DummyRemoteGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		UsernamePasswordCredentials credentials = new UsernamePasswordCredentials();

		fixture.setCredentials(credentials);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractGetterTest.class);
	}
}