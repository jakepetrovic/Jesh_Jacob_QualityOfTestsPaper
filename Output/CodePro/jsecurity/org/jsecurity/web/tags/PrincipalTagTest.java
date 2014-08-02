package org.jsecurity.web.tags;

import javax.servlet.jsp.JspTagException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PrincipalTagTest</code> contains tests for the class <code>{@link PrincipalTag}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class PrincipalTagTest {
	/**
	 * Run the PrincipalTag() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPrincipalTag_1()
		throws Exception {
		PrincipalTag result = new PrincipalTag();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getDefaultValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetDefaultValue_1()
		throws Exception {
		PrincipalTag fixture = new PrincipalTag();
		fixture.setType("");
		fixture.setDefaultValue("");
		fixture.setProperty("");

		String result = fixture.getDefaultValue();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getProperty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetProperty_1()
		throws Exception {
		PrincipalTag fixture = new PrincipalTag();
		fixture.setType("");
		fixture.setDefaultValue("");
		fixture.setProperty("");

		String result = fixture.getProperty();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		PrincipalTag fixture = new PrincipalTag();
		fixture.setType("");
		fixture.setDefaultValue("");
		fixture.setProperty("");

		String result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int onDoStartTag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testOnDoStartTag_1()
		throws Exception {
		PrincipalTag fixture = new PrincipalTag();
		fixture.setType((String) null);
		fixture.setDefaultValue("");
		fixture.setProperty((String) null);

		int result = fixture.onDoStartTag();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int onDoStartTag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testOnDoStartTag_2()
		throws Exception {
		PrincipalTag fixture = new PrincipalTag();
		fixture.setType((String) null);
		fixture.setDefaultValue("");
		fixture.setProperty("");

		int result = fixture.onDoStartTag();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int onDoStartTag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testOnDoStartTag_3()
		throws Exception {
		PrincipalTag fixture = new PrincipalTag();
		fixture.setType("");
		fixture.setDefaultValue("");
		fixture.setProperty("");

		int result = fixture.onDoStartTag();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int onDoStartTag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = javax.servlet.jsp.JspTagException.class)
	public void testOnDoStartTag_4()
		throws Exception {
		PrincipalTag fixture = new PrincipalTag();
		fixture.setType((String) null);
		fixture.setDefaultValue("");
		fixture.setProperty("");

		int result = fixture.onDoStartTag();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int onDoStartTag() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = javax.servlet.jsp.JspTagException.class)
	public void testOnDoStartTag_5()
		throws Exception {
		PrincipalTag fixture = new PrincipalTag();
		fixture.setType("");
		fixture.setDefaultValue("");
		fixture.setProperty("");

		int result = fixture.onDoStartTag();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setDefaultValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSetDefaultValue_1()
		throws Exception {
		PrincipalTag fixture = new PrincipalTag();
		fixture.setType("");
		fixture.setDefaultValue("");
		fixture.setProperty("");
		String defaultValue = "";

		fixture.setDefaultValue(defaultValue);

		// add additional test code here
	}

	/**
	 * Run the void setProperty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSetProperty_1()
		throws Exception {
		PrincipalTag fixture = new PrincipalTag();
		fixture.setType("");
		fixture.setDefaultValue("");
		fixture.setProperty("");
		String property = "";

		fixture.setProperty(property);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		PrincipalTag fixture = new PrincipalTag();
		fixture.setType("");
		fixture.setDefaultValue("");
		fixture.setProperty("");
		String type = "";

		fixture.setType(type);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(PrincipalTagTest.class);
	}
}