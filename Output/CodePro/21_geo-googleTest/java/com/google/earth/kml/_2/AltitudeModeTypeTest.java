package com.google.earth.kml._2;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AltitudeModeTypeTest</code> contains tests for the class <code>{@link AltitudeModeType}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:07 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class AltitudeModeTypeTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see AltitudeModeType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private AltitudeModeType fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AltitudeModeType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private AltitudeModeType fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AltitudeModeType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	private AltitudeModeType fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AltitudeModeType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public AltitudeModeType getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = AltitudeModeType.ABSOLUTE;
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AltitudeModeType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public AltitudeModeType getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = AltitudeModeType.CLAMP_TO_GROUND;
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AltitudeModeType
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public AltitudeModeType getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = AltitudeModeType.RELATIVE_TO_GROUND;
		}
		return fixture3;
	}

	/**
	 * Run the AltitudeModeType fromValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testFromValue_1()
		throws Exception {
		String v = "";

		AltitudeModeType result = AltitudeModeType.fromValue(v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: 
		//       at com.google.earth.kml._2.AltitudeModeType.fromValue(AltitudeModeType.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the AltitudeModeType fromValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testFromValue_2()
		throws Exception {
		String v = "0123456789";

		AltitudeModeType result = AltitudeModeType.fromValue(v);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: 0123456789
		//       at com.google.earth.kml._2.AltitudeModeType.fromValue(AltitudeModeType.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the String value() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testValue_fixture1_1()
		throws Exception {
		AltitudeModeType fixture = getFixture1();

		String result = fixture.value();

		// add additional test code here
		assertEquals("absolute", result);
	}

	/**
	 * Run the String value() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testValue_fixture2_1()
		throws Exception {
		AltitudeModeType fixture = getFixture2();

		String result = fixture.value();

		// add additional test code here
		assertEquals("clampToGround", result);
	}

	/**
	 * Run the String value() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	@Test
	public void testValue_fixture3_1()
		throws Exception {
		AltitudeModeType fixture = getFixture3();

		String result = fixture.value();

		// add additional test code here
		assertEquals("relativeToGround", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 3:07 PM
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
	 * @generatedBy CodePro at 6/7/15 3:07 PM
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
	 * @generatedBy CodePro at 6/7/15 3:07 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AltitudeModeTypeTest.class);
	}
}