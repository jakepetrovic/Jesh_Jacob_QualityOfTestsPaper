package br.com.jnfe.base;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultNamespacePrefixMapperTest</code> contains tests for the class <code>{@link DefaultNamespacePrefixMapper}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DefaultNamespacePrefixMapperTest {
	/**
	 * Run the DefaultNamespacePrefixMapper() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testDefaultNamespacePrefixMapper_1()
		throws Exception {
		DefaultNamespacePrefixMapper result = new DefaultNamespacePrefixMapper();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String[] getContextualNamespaceDecls() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetContextualNamespaceDecls_1()
		throws Exception {
		DefaultNamespacePrefixMapper fixture = new DefaultNamespacePrefixMapper();

		String[] result = fixture.getContextualNamespaceDecls();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPreferredPrefix(String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetPreferredPrefix_1()
		throws Exception {
		DefaultNamespacePrefixMapper fixture = new DefaultNamespacePrefixMapper();
		String namespaceUri = "http://www.portalfiscal.inf.br/nfe";
		String suggestion = "";
		boolean requirePrefix = true;

		String result = fixture.getPreferredPrefix(namespaceUri, suggestion, requirePrefix);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPreferredPrefix(String,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testGetPreferredPrefix_2()
		throws Exception {
		DefaultNamespacePrefixMapper fixture = new DefaultNamespacePrefixMapper();
		String namespaceUri = "";
		String suggestion = "";
		boolean requirePrefix = true;

		String result = fixture.getPreferredPrefix(namespaceUri, suggestion, requirePrefix);

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
		new org.junit.runner.JUnitCore().run(DefaultNamespacePrefixMapperTest.class);
	}
}