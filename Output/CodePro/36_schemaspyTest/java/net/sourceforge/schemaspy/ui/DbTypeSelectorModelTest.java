package net.sourceforge.schemaspy.ui;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DbTypeSelectorModelTest</code> contains tests for the class <code>{@link DbTypeSelectorModel}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DbTypeSelectorModelTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DbTypeSelectorModel
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private DbTypeSelectorModel fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DbTypeSelectorModel
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public DbTypeSelectorModel getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new DbTypeSelectorModel("");
		}
		return fixture;
	}

	/**
	 * Run the DbTypeSelectorModel(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDbTypeSelectorModel_1()
		throws Exception {
		String defaultType = "";

		DbTypeSelectorModel result = new DbTypeSelectorModel(defaultType);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getSize());
	}

	/**
	 * Run the DbTypeSelectorModel(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDbTypeSelectorModel_2()
		throws Exception {
		String defaultType = "0123456789";

		DbTypeSelectorModel result = new DbTypeSelectorModel(defaultType);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getSize());
	}

	/**
	 * Run the Object getElementAt(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetElementAt_fixture_1()
		throws Exception {
		DbTypeSelectorModel fixture2 = getFixture();
		int index = 0;

		Object result = fixture2.getElementAt(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getElementAt(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetElementAt_fixture_2()
		throws Exception {
		DbTypeSelectorModel fixture2 = getFixture();
		int index = 1;

		Object result = fixture2.getElementAt(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbTypeSelectorModel.getElementAt(DbTypeSelectorModel.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the Object getElementAt(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetElementAt_fixture_3()
		throws Exception {
		DbTypeSelectorModel fixture2 = getFixture();
		int index = 7;

		Object result = fixture2.getElementAt(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IndexOutOfBoundsException: Index: 7, Size: 1
		//       at java.util.ArrayList.rangeCheck(ArrayList.java:635)
		//       at java.util.ArrayList.get(ArrayList.java:411)
		//       at net.sourceforge.schemaspy.ui.DbTypeSelectorModel.getElementAt(DbTypeSelectorModel.java:73)
		assertNotNull(result);
	}

	/**
	 * Run the Object getSelectedItem() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetSelectedItem_fixture_1()
		throws Exception {
		DbTypeSelectorModel fixture2 = getFixture();

		Object result = fixture2.getSelectedItem();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetSize_fixture_1()
		throws Exception {
		DbTypeSelectorModel fixture2 = getFixture();

		int result = fixture2.getSize();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void setSelectedItem(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testSetSelectedItem_fixture_1()
		throws Exception {
		DbTypeSelectorModel fixture2 = getFixture();
		Object anItem = null;

		fixture2.setSelectedItem(anItem);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
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
	 * @generatedBy CodePro at 6/7/15 4:19 PM
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
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DbTypeSelectorModelTest.class);
	}
}