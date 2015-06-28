package br.com.jnfe.base.adapter;

import org.junit.*;
import br.com.jnfe.base.pl006.RequestAdapterImpl;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractNFeAdapterTest</code> contains tests for the class <code>{@link AbstractNFeAdapter}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AbstractNFeAdapterTest {
	/**
	 * Run the String getNamespaceURI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetNamespaceURI_1()
		throws Exception {
		AbstractNFeAdapter fixture = new RequestAdapterImpl();

		String result = fixture.getNamespaceURI();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
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
	 * @generatedBy CodePro at 4/19/14 3:00 PM
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
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractNFeAdapterTest.class);
	}
}