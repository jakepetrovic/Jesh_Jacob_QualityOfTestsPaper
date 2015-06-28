package bierse.view;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>KeyMapComboBoxModelTest</code> contains tests for the class <code>{@link KeyMapComboBoxModel}</code>.
 *
 * @generatedBy CodePro at 5/31/15 5:22 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class KeyMapComboBoxModelTest {
	/**
	 * Run the KeyMapComboBoxModel() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testKeyMapComboBoxModel_1()
		throws Exception {

		KeyMapComboBoxModel result = new KeyMapComboBoxModel();

		// add additional test code here
		assertNotNull(result);
		assertEquals(12, result.getSize());
	}

	/**
	 * Run the MyKeyMap getMyKeyMapForKeyCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetMyKeyMapForKeyCode_1()
		throws Exception {
		int keyCode = 0;

		MyKeyMap result = KeyMapComboBoxModel.getMyKeyMapForKeyCode(keyCode);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the MyKeyMap getMyKeyMapForKeyCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetMyKeyMapForKeyCode_2()
		throws Exception {
		int keyCode = 112;

		MyKeyMap result = KeyMapComboBoxModel.getMyKeyMapForKeyCode(keyCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("F1", result.toString());
		assertEquals("F1", result.getText());
		assertEquals(112, result.getCode());
	}

	/**
	 * Run the MyKeyMap getMyKeyMapForKeyCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetMyKeyMapForKeyCode_3()
		throws Exception {
		int keyCode = 113;

		MyKeyMap result = KeyMapComboBoxModel.getMyKeyMapForKeyCode(keyCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("F2", result.toString());
		assertEquals("F2", result.getText());
		assertEquals(113, result.getCode());
	}

	/**
	 * Run the MyKeyMap getMyKeyMapForKeyCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetMyKeyMapForKeyCode_4()
		throws Exception {
		int keyCode = 114;

		MyKeyMap result = KeyMapComboBoxModel.getMyKeyMapForKeyCode(keyCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("F3", result.toString());
		assertEquals("F3", result.getText());
		assertEquals(114, result.getCode());
	}

	/**
	 * Run the MyKeyMap getMyKeyMapForKeyCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetMyKeyMapForKeyCode_5()
		throws Exception {
		int keyCode = 115;

		MyKeyMap result = KeyMapComboBoxModel.getMyKeyMapForKeyCode(keyCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("F4", result.toString());
		assertEquals("F4", result.getText());
		assertEquals(115, result.getCode());
	}

	/**
	 * Run the MyKeyMap getMyKeyMapForKeyCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetMyKeyMapForKeyCode_6()
		throws Exception {
		int keyCode = 116;

		MyKeyMap result = KeyMapComboBoxModel.getMyKeyMapForKeyCode(keyCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("F5", result.toString());
		assertEquals("F5", result.getText());
		assertEquals(116, result.getCode());
	}

	/**
	 * Run the MyKeyMap getMyKeyMapForKeyCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetMyKeyMapForKeyCode_7()
		throws Exception {
		int keyCode = 117;

		MyKeyMap result = KeyMapComboBoxModel.getMyKeyMapForKeyCode(keyCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("F6", result.toString());
		assertEquals("F6", result.getText());
		assertEquals(117, result.getCode());
	}

	/**
	 * Run the MyKeyMap getMyKeyMapForKeyCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetMyKeyMapForKeyCode_8()
		throws Exception {
		int keyCode = 118;

		MyKeyMap result = KeyMapComboBoxModel.getMyKeyMapForKeyCode(keyCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("F7", result.toString());
		assertEquals("F7", result.getText());
		assertEquals(118, result.getCode());
	}

	/**
	 * Run the MyKeyMap getMyKeyMapForKeyCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetMyKeyMapForKeyCode_9()
		throws Exception {
		int keyCode = 119;

		MyKeyMap result = KeyMapComboBoxModel.getMyKeyMapForKeyCode(keyCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("F8", result.toString());
		assertEquals("F8", result.getText());
		assertEquals(119, result.getCode());
	}

	/**
	 * Run the MyKeyMap getMyKeyMapForKeyCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetMyKeyMapForKeyCode_10()
		throws Exception {
		int keyCode = 120;

		MyKeyMap result = KeyMapComboBoxModel.getMyKeyMapForKeyCode(keyCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("F9", result.toString());
		assertEquals("F9", result.getText());
		assertEquals(120, result.getCode());
	}

	/**
	 * Run the MyKeyMap getMyKeyMapForKeyCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetMyKeyMapForKeyCode_11()
		throws Exception {
		int keyCode = 121;

		MyKeyMap result = KeyMapComboBoxModel.getMyKeyMapForKeyCode(keyCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("F10", result.toString());
		assertEquals("F10", result.getText());
		assertEquals(121, result.getCode());
	}

	/**
	 * Run the MyKeyMap getMyKeyMapForKeyCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetMyKeyMapForKeyCode_12()
		throws Exception {
		int keyCode = 122;

		MyKeyMap result = KeyMapComboBoxModel.getMyKeyMapForKeyCode(keyCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("F11", result.toString());
		assertEquals("F11", result.getText());
		assertEquals(122, result.getCode());
	}

	/**
	 * Run the MyKeyMap getMyKeyMapForKeyCode(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testGetMyKeyMapForKeyCode_13()
		throws Exception {
		int keyCode = 123;

		MyKeyMap result = KeyMapComboBoxModel.getMyKeyMapForKeyCode(keyCode);

		// add additional test code here
		assertNotNull(result);
		assertEquals("F12", result.toString());
		assertEquals("F12", result.getText());
		assertEquals(123, result.getCode());
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
		new org.junit.runner.JUnitCore().run(KeyMapComboBoxModelTest.class);
	}
}