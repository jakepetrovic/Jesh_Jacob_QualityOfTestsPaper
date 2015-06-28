package bierse.view;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MyKeyMapTest</code> contains tests for the class <code>{@link MyKeyMap}</code>.
 *
 * @generatedBy CodePro at 5/31/15 5:22 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MyKeyMapTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see MyKeyMap
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	private MyKeyMap fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see MyKeyMap
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	private MyKeyMap fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MyKeyMap
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	public MyKeyMap getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new MyKeyMap("", 0);
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MyKeyMap
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	public MyKeyMap getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new MyKeyMap("0123456789", 1);
		}
		return fixture2;
	}

	/**
	 * Run the MyKeyMap(String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMyKeyMap_1()
		throws Exception {
		String text = "";
		int code = 0;

		MyKeyMap result = new MyKeyMap(text, code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals("", result.getText());
		assertEquals(0, result.getCode());
	}

	/**
	 * Run the MyKeyMap(String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMyKeyMap_2()
		throws Exception {
		String text = "0123456789";
		int code = 1;

		MyKeyMap result = new MyKeyMap(text, code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getText());
		assertEquals(1, result.getCode());
	}

	/**
	 * Run the MyKeyMap(String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMyKeyMap_3()
		throws Exception {
		String text = "";
		int code = 7;

		MyKeyMap result = new MyKeyMap(text, code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals("", result.getText());
		assertEquals(7, result.getCode());
	}

	/**
	 * Run the MyKeyMap(String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMyKeyMap_4()
		throws Exception {
		String text = "";
		int code = 1;

		MyKeyMap result = new MyKeyMap(text, code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals("", result.getText());
		assertEquals(1, result.getCode());
	}

	/**
	 * Run the MyKeyMap(String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMyKeyMap_5()
		throws Exception {
		String text = "0123456789";
		int code = 7;

		MyKeyMap result = new MyKeyMap(text, code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getText());
		assertEquals(7, result.getCode());
	}

	/**
	 * Run the MyKeyMap(String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMyKeyMap_6()
		throws Exception {
		String text = "0123456789";
		int code = 0;

		MyKeyMap result = new MyKeyMap(text, code);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.toString());
		assertEquals("0123456789", result.getText());
		assertEquals(0, result.getCode());
	}

	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetCode_fixture1_1()
		throws Exception {
		MyKeyMap fixture = getFixture1();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetCode_fixture2_1()
		throws Exception {
		MyKeyMap fixture = getFixture2();

		int result = fixture.getCode();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getText() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetText_fixture1_1()
		throws Exception {
		MyKeyMap fixture = getFixture1();

		String result = fixture.getText();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getText() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetText_fixture2_1()
		throws Exception {
		MyKeyMap fixture = getFixture2();

		String result = fixture.getText();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testToString_fixture1_1()
		throws Exception {
		MyKeyMap fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testToString_fixture2_1()
		throws Exception {
		MyKeyMap fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
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
	 * @generatedBy CodePro at 5/31/15 5:22 PM
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
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MyKeyMapTest.class);
	}
}