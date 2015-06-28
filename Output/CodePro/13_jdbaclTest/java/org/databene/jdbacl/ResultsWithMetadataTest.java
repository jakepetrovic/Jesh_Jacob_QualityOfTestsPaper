package org.databene.jdbacl;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ResultsWithMetadataTest</code> contains tests for the class <code>{@link ResultsWithMetadata}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ResultsWithMetadataTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ResultsWithMetadata
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private ResultsWithMetadata fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ResultsWithMetadata
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private ResultsWithMetadata fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ResultsWithMetadata
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public ResultsWithMetadata getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new ResultsWithMetadata(new String[] {"", "0123456789", "An��t-1.0.txt", null}, new String[][] {{"", "0123456789", "An��t-1.0.txt", null}});
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ResultsWithMetadata
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public ResultsWithMetadata getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new ResultsWithMetadata(new String[] {""}, new String[][] {{""}});
		}
		return fixture2;
	}

	/**
	 * Run the ResultsWithMetadata(String[],String[][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testResultsWithMetadata_1()
		throws Exception {
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		String[][] results = new String[][] {{"", "0123456789", "An��t-1.0.txt", null}};

		ResultsWithMetadata result = new ResultsWithMetadata(columnNames, results);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ResultsWithMetadata(String[],String[][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testResultsWithMetadata_2()
		throws Exception {
		String[] columnNames = new String[] {""};
		String[][] results = new String[][] {{""}};

		ResultsWithMetadata result = new ResultsWithMetadata(columnNames, results);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ResultsWithMetadata(String[],String[][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testResultsWithMetadata_3()
		throws Exception {
		String[] columnNames = new String[] {"0123456789"};
		String[][] results = new String[][] {{"0123456789"}};

		ResultsWithMetadata result = new ResultsWithMetadata(columnNames, results);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ResultsWithMetadata(String[],String[][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testResultsWithMetadata_4()
		throws Exception {
		String[] columnNames = new String[] {""};
		String[][] results = new String[][] {{"", "0123456789", "An��t-1.0.txt", null}};

		ResultsWithMetadata result = new ResultsWithMetadata(columnNames, results);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ResultsWithMetadata(String[],String[][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testResultsWithMetadata_5()
		throws Exception {
		String[] columnNames = new String[] {"0123456789"};
		String[][] results = new String[][] {{""}};

		ResultsWithMetadata result = new ResultsWithMetadata(columnNames, results);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ResultsWithMetadata(String[],String[][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testResultsWithMetadata_6()
		throws Exception {
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		String[][] results = new String[][] {{"0123456789"}};

		ResultsWithMetadata result = new ResultsWithMetadata(columnNames, results);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ResultsWithMetadata(String[],String[][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testResultsWithMetadata_7()
		throws Exception {
		String[] columnNames = new String[] {"0123456789"};
		String[][] results = new String[][] {{"", "0123456789", "An��t-1.0.txt", null}};

		ResultsWithMetadata result = new ResultsWithMetadata(columnNames, results);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ResultsWithMetadata(String[],String[][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testResultsWithMetadata_8()
		throws Exception {
		String[] columnNames = new String[] {"", "0123456789", "An��t-1.0.txt", null};
		String[][] results = new String[][] {{""}};

		ResultsWithMetadata result = new ResultsWithMetadata(columnNames, results);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ResultsWithMetadata(String[],String[][]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testResultsWithMetadata_9()
		throws Exception {
		String[] columnNames = new String[] {""};
		String[][] results = new String[][] {{"0123456789"}};

		ResultsWithMetadata result = new ResultsWithMetadata(columnNames, results);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getColumnLabels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetColumnLabels_fixture1_1()
		throws Exception {
		ResultsWithMetadata fixture = getFixture1();

		String[] result = fixture.getColumnLabels();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertEquals("", result[0]);
		assertEquals("0123456789", result[1]);
		assertEquals("An��t-1.0.txt", result[2]);
		assertEquals(null, result[3]);
	}

	/**
	 * Run the String[] getColumnLabels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetColumnLabels_fixture2_1()
		throws Exception {
		ResultsWithMetadata fixture = getFixture2();

		String[] result = fixture.getColumnLabels();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals("", result[0]);
	}

	/**
	 * Run the String[][] getResults() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetResults_fixture1_1()
		throws Exception {
		ResultsWithMetadata fixture = getFixture1();

		String[][] result = fixture.getResults();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertNotNull(result[0]);
		assertEquals(4, result[0].length);
		assertEquals("", result[0][0]);
		assertEquals("0123456789", result[0][1]);
		assertEquals("An��t-1.0.txt", result[0][2]);
		assertEquals(null, result[0][3]);
	}

	/**
	 * Run the String[][] getResults() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetResults_fixture2_1()
		throws Exception {
		ResultsWithMetadata fixture = getFixture2();

		String[][] result = fixture.getResults();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertNotNull(result[0]);
		assertEquals(1, result[0].length);
		assertEquals("", result[0][0]);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ResultsWithMetadataTest.class);
	}
}