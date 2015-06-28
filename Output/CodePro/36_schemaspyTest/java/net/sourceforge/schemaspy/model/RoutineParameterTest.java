package net.sourceforge.schemaspy.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RoutineParameterTest</code> contains tests for the class <code>{@link RoutineParameter}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class RoutineParameterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see RoutineParameter
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private RoutineParameter fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see RoutineParameter
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private RoutineParameter fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see RoutineParameter
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private RoutineParameter fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see RoutineParameter
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public RoutineParameter getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new RoutineParameter("", "", "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see RoutineParameter
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public RoutineParameter getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new RoutineParameter("0123456789", "0123456789", "0123456789");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see RoutineParameter
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public RoutineParameter getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new RoutineParameter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		}
		return fixture3;
	}

	/**
	 * Run the RoutineParameter(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRoutineParameter_1()
		throws Exception {
		String name = "";
		String type = "";
		String mode = "";

		RoutineParameter result = new RoutineParameter(name, type, mode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getMode());
		assertEquals("", result.getName());
		assertEquals("", result.getType());
	}

	/**
	 * Run the RoutineParameter(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRoutineParameter_2()
		throws Exception {
		String name = "0123456789";
		String type = "0123456789";
		String mode = "0123456789";

		RoutineParameter result = new RoutineParameter(name, type, mode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getMode());
		assertEquals("0123456789", result.getName());
		assertEquals("0123456789", result.getType());
	}

	/**
	 * Run the RoutineParameter(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRoutineParameter_3()
		throws Exception {
		String name = "0123456789";
		String type = "0123456789";
		String mode = "";

		RoutineParameter result = new RoutineParameter(name, type, mode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getMode());
		assertEquals("0123456789", result.getName());
		assertEquals("0123456789", result.getType());
	}

	/**
	 * Run the RoutineParameter(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRoutineParameter_4()
		throws Exception {
		String name = "0123456789";
		String type = "";
		String mode = "0123456789";

		RoutineParameter result = new RoutineParameter(name, type, mode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getMode());
		assertEquals("0123456789", result.getName());
		assertEquals("", result.getType());
	}

	/**
	 * Run the RoutineParameter(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRoutineParameter_5()
		throws Exception {
		String name = "0123456789";
		String type = "";
		String mode = "";

		RoutineParameter result = new RoutineParameter(name, type, mode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getMode());
		assertEquals("0123456789", result.getName());
		assertEquals("", result.getType());
	}

	/**
	 * Run the RoutineParameter(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRoutineParameter_6()
		throws Exception {
		String name = "";
		String type = "0123456789";
		String mode = "0123456789";

		RoutineParameter result = new RoutineParameter(name, type, mode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getMode());
		assertEquals("", result.getName());
		assertEquals("0123456789", result.getType());
	}

	/**
	 * Run the RoutineParameter(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRoutineParameter_7()
		throws Exception {
		String name = "";
		String type = "0123456789";
		String mode = "";

		RoutineParameter result = new RoutineParameter(name, type, mode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getMode());
		assertEquals("", result.getName());
		assertEquals("0123456789", result.getType());
	}

	/**
	 * Run the RoutineParameter(String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testRoutineParameter_8()
		throws Exception {
		String name = "";
		String type = "";
		String mode = "0123456789";

		RoutineParameter result = new RoutineParameter(name, type, mode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getMode());
		assertEquals("", result.getName());
		assertEquals("", result.getType());
	}

	/**
	 * Run the String getMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMode_fixture1_1()
		throws Exception {
		RoutineParameter fixture = getFixture1();

		String result = fixture.getMode();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMode_fixture2_1()
		throws Exception {
		RoutineParameter fixture = getFixture2();

		String result = fixture.getMode();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetMode_fixture3_1()
		throws Exception {
		RoutineParameter fixture = getFixture3();

		String result = fixture.getMode();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetName_fixture1_1()
		throws Exception {
		RoutineParameter fixture = getFixture1();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetName_fixture2_1()
		throws Exception {
		RoutineParameter fixture = getFixture2();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetName_fixture3_1()
		throws Exception {
		RoutineParameter fixture = getFixture3();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetType_fixture1_1()
		throws Exception {
		RoutineParameter fixture = getFixture1();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetType_fixture2_1()
		throws Exception {
		RoutineParameter fixture = getFixture2();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetType_fixture3_1()
		throws Exception {
		RoutineParameter fixture = getFixture3();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
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
		new org.junit.runner.JUnitCore().run(RoutineParameterTest.class);
	}
}