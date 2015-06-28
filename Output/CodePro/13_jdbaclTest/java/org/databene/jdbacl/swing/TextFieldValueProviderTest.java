package org.databene.jdbacl.swing;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Document;
import javax.swing.text.GapContent;
import javax.swing.text.StyleContext;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TextFieldValueProviderTest</code> contains tests for the class <code>{@link TextFieldValueProvider}</code>.
 *
 * @generatedBy CodePro at 6/7/15 7:57 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TextFieldValueProviderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see TextFieldValueProvider
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	private TextFieldValueProvider fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see TextFieldValueProvider
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	public TextFieldValueProvider getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new TextFieldValueProvider(new JTextField(""));
		}
		return fixture;
	}

	/**
	 * Run the TextFieldValueProvider(JTextField) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testTextFieldValueProvider_1()
		throws Exception {
		JTextField field = new JTextField("");

		TextFieldValueProvider result = new TextFieldValueProvider(field);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getValue());
	}

	/**
	 * Run the TextFieldValueProvider(JTextField) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testTextFieldValueProvider_2()
		throws Exception {
		JTextField field = new JTextField("", 0);

		TextFieldValueProvider result = new TextFieldValueProvider(field);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getValue());
	}

	/**
	 * Run the TextFieldValueProvider(JTextField) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testTextFieldValueProvider_3()
		throws Exception {
		JTextField field = new JTextField("0123456789", 1);

		TextFieldValueProvider result = new TextFieldValueProvider(field);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getValue());
	}

	/**
	 * Run the TextFieldValueProvider(JTextField) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testTextFieldValueProvider_4()
		throws Exception {
		JTextField field = new JTextField();

		TextFieldValueProvider result = new TextFieldValueProvider(field);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getValue());
	}

	/**
	 * Run the TextFieldValueProvider(JTextField) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testTextFieldValueProvider_5()
		throws Exception {
		JTextField field = new JTextField(0);

		TextFieldValueProvider result = new TextFieldValueProvider(field);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getValue());
	}

	/**
	 * Run the TextFieldValueProvider(JTextField) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testTextFieldValueProvider_6()
		throws Exception {
		JTextField field = new JTextField(new DefaultStyledDocument(), "", 0);

		TextFieldValueProvider result = new TextFieldValueProvider(field);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getValue());
	}

	/**
	 * Run the TextFieldValueProvider(JTextField) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testTextFieldValueProvider_7()
		throws Exception {
		JTextField field = new JTextField(new DefaultStyledDocument(StyleContext.getDefaultStyleContext()), "0123456789", 1);

		TextFieldValueProvider result = new TextFieldValueProvider(field);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getValue());
	}

	/**
	 * Run the TextFieldValueProvider(JTextField) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testTextFieldValueProvider_8()
		throws Exception {
		JTextField field = new JTextField(new DefaultStyledDocument(new GapContent(), StyleContext.getDefaultStyleContext()), "An��t-1.0.txt", 7);

		TextFieldValueProvider result = new TextFieldValueProvider(field);

		// add additional test code here
		assertNotNull(result);
		assertEquals("An��t-1.0.txt", result.getValue());
	}

	/**
	 * Run the String getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	@Test
	public void testGetValue_fixture_1()
		throws Exception {
		TextFieldValueProvider fixture2 = getFixture();

		String result = fixture2.getValue();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 7:57 PM
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
	 * @generatedBy CodePro at 6/7/15 7:57 PM
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
	 * @generatedBy CodePro at 6/7/15 7:57 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TextFieldValueProviderTest.class);
	}
}