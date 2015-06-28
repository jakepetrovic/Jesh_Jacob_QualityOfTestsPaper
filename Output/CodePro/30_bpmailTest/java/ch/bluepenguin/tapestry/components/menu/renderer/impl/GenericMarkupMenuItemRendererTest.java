package ch.bluepenguin.tapestry.components.menu.renderer.impl;

import java.util.HashMap;
import org.apache.tapestry.IMarkupWriter;
import org.apache.tapestry.engine.NullWriter;
import ch.bluepenguin.tapestry.components.menu.renderer.IMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.model.IMenuItem;
import ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuItem;
import junit.framework.*;

/**
 * The class <code>GenericMarkupMenuItemRendererTest</code> contains tests for the class <code>{@link GenericMarkupMenuItemRenderer}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class GenericMarkupMenuItemRendererTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private GenericMarkupMenuItemRenderer fixture16;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new GenericMarkupMenuItemRenderer();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new GenericMarkupMenuItemRenderer();
			fixture2.setAttributes(new HashMap());
			fixture2.setElement("");
			fixture2.setNestedRenderer(new DefaultMenuItemRenderer());
			fixture2.setText("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new GenericMarkupMenuItemRenderer();
			fixture3.setAttributes(new HashMap(0));
			fixture3.setElement("");
			fixture3.setNestedRenderer(new DefaultMenuItemRenderer());
			fixture3.setText("");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new GenericMarkupMenuItemRenderer();
			fixture4.setAttributes(new HashMap(0));
			fixture4.setElement("");
			fixture4.setNestedRenderer(new DefaultMenuItemRenderer());
			fixture4.setText("0123456789");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new GenericMarkupMenuItemRenderer();
			fixture5.setAttributes(new HashMap(0));
			fixture5.setElement("");
			fixture5.setNestedRenderer(new DirectLinkMenuItemRenderer());
			fixture5.setText("");
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new GenericMarkupMenuItemRenderer();
			fixture6.setAttributes(new HashMap(0));
			fixture6.setElement("");
			fixture6.setNestedRenderer(new DirectLinkMenuItemRenderer());
			fixture6.setText("0123456789");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new GenericMarkupMenuItemRenderer();
			fixture7.setAttributes(new HashMap(0));
			fixture7.setElement("");
			fixture7.setNestedRenderer(new GenericMarkupMenuItemRenderer());
			fixture7.setText("");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new GenericMarkupMenuItemRenderer();
			fixture8.setAttributes(new HashMap(0));
			fixture8.setElement("0123456789");
			fixture8.setNestedRenderer(new DefaultMenuItemRenderer());
			fixture8.setText("");
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new GenericMarkupMenuItemRenderer();
			fixture9.setAttributes(new HashMap(0));
			fixture9.setElement("0123456789");
			fixture9.setNestedRenderer(new DefaultMenuItemRenderer());
			fixture9.setText("0123456789");
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new GenericMarkupMenuItemRenderer();
			fixture10.setAttributes(new HashMap(0));
			fixture10.setElement("0123456789");
			fixture10.setNestedRenderer(new DirectLinkMenuItemRenderer());
			fixture10.setText("");
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new GenericMarkupMenuItemRenderer();
			fixture11.setAttributes(new HashMap(0));
			fixture11.setElement("0123456789");
			fixture11.setNestedRenderer(new DirectLinkMenuItemRenderer());
			fixture11.setText("0123456789");
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new GenericMarkupMenuItemRenderer();
			fixture12.setAttributes(new HashMap(0));
			fixture12.setElement("0123456789");
			fixture12.setNestedRenderer(new GenericMarkupMenuItemRenderer());
			fixture12.setText("");
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new GenericMarkupMenuItemRenderer();
			fixture13.setAttributes(new HashMap(0));
			fixture13.setElement("An��t-1.0.txt");
			fixture13.setNestedRenderer(new DefaultMenuItemRenderer());
			fixture13.setText("");
		}
		return fixture13;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new GenericMarkupMenuItemRenderer();
			fixture14.setAttributes(new HashMap(0));
			fixture14.setElement("An��t-1.0.txt");
			fixture14.setNestedRenderer(new DefaultMenuItemRenderer());
			fixture14.setText("0123456789");
		}
		return fixture14;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new GenericMarkupMenuItemRenderer();
			fixture15.setAttributes(new HashMap(0));
			fixture15.setElement("An��t-1.0.txt");
			fixture15.setNestedRenderer(new DirectLinkMenuItemRenderer());
			fixture15.setText("");
		}
		return fixture15;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GenericMarkupMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public GenericMarkupMenuItemRenderer getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new GenericMarkupMenuItemRenderer();
			fixture16.setAttributes(new HashMap(0));
			fixture16.setElement("An��t-1.0.txt");
			fixture16.setNestedRenderer(new GenericMarkupMenuItemRenderer());
			fixture16.setText("");
		}
		return fixture16;
	}

	/**
	 * Run the GenericMarkupMenuItemRenderer() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGenericMarkupMenuItemRenderer_1()
		throws Exception {

		GenericMarkupMenuItemRenderer result = new GenericMarkupMenuItemRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture1_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture1();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture2_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture2();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture3_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture3();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture4_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture4();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture5_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture5();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture6_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture6();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture7_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture7();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture8_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture8();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture9_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture9();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture10_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture10();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture11_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture11();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture12_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture12();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture13_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture13();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture14_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture14();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture15_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture15();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setAttributes(HashMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetAttributes_fixture16_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture16();
		HashMap attributes = null;

		fixture.setAttributes(attributes);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture1_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture1();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture2_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture2();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture3_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture3();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture4_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture4();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture5_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture5();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture6_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture6();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture7_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture7();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture8_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture8();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture9_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture9();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture10_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture10();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture11_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture11();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture12_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture12();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture13_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture13();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture14_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture14();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture15_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture15();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture16_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture16();
		String element = "0123456789";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture2_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture2();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture3_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture3();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture4_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture4();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture5_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture5();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture6_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture6();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture7_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture7();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture8_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture8();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture9_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture9();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture10_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture10();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture11_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture11();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture12_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture12();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture13_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture13();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture14_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture14();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetElement_fixture15_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture15();
		String element = "";

		fixture.setElement(element);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture1_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture1();
		IMenuItemRenderer nested = new DefaultMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture2_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture2();
		IMenuItemRenderer nested = new DirectLinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture3_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture3();
		IMenuItemRenderer nested = new GenericMarkupMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture4_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture4();
		IMenuItemRenderer nested = new HyperlinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture5_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture5();
		IMenuItemRenderer nested = new HyperlinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture6_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture6();
		IMenuItemRenderer nested = new HyperlinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture7_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture7();
		IMenuItemRenderer nested = new HyperlinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture8_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture8();
		IMenuItemRenderer nested = new HyperlinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture9_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture9();
		IMenuItemRenderer nested = new HyperlinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture10_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture10();
		IMenuItemRenderer nested = new HyperlinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture11_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture11();
		IMenuItemRenderer nested = new HyperlinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture12_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture12();
		IMenuItemRenderer nested = new HyperlinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture13_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture13();
		IMenuItemRenderer nested = new HyperlinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture14_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture14();
		IMenuItemRenderer nested = new HyperlinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture15_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture15();
		IMenuItemRenderer nested = new HyperlinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture16_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture16();
		IMenuItemRenderer nested = new HyperlinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture2_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture2();
		IMenuItemRenderer nested = new DefaultMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture3_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture3();
		IMenuItemRenderer nested = new DirectLinkMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture4_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture4();
		IMenuItemRenderer nested = new GenericMarkupMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture5_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture5();
		IMenuItemRenderer nested = new GenericMarkupMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture6_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture6();
		IMenuItemRenderer nested = new GenericMarkupMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture7_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture7();
		IMenuItemRenderer nested = new GenericMarkupMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture8_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture8();
		IMenuItemRenderer nested = new GenericMarkupMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture9_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture9();
		IMenuItemRenderer nested = new GenericMarkupMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture10_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture10();
		IMenuItemRenderer nested = new GenericMarkupMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture11_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture11();
		IMenuItemRenderer nested = new GenericMarkupMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture12_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture12();
		IMenuItemRenderer nested = new GenericMarkupMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture13_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture13();
		IMenuItemRenderer nested = new GenericMarkupMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture14_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture14();
		IMenuItemRenderer nested = new GenericMarkupMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setNestedRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetNestedRenderer_fixture15_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture15();
		IMenuItemRenderer nested = new GenericMarkupMenuItemRenderer();

		fixture.setNestedRenderer(nested);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture1_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture1();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture2_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture2();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture3_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture3();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture4_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture4();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture5_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture5();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture6_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture6();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture7_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture7();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture8_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture8();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture9_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture9();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture10_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture10();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture11_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture11();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture12_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture12();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture13_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture13();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture14_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture14();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture15_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture15();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture16_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture16();
		String text = "0123456789";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture2_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture2();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture3_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture3();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture4_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture4();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture5_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture5();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture6_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture6();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture7_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture7();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture8_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture8();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture9_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture9();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture10_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture10();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture11_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture11();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture12_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture12();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture13_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture13();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture14_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture14();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetText_fixture15_2()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture15();
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture1_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture1();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture2_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture2();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture3_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture3();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture4_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture4();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture5_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture5();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.DirectLinkMenuItemRenderer.startRender(DirectLinkMenuItemRenderer.java:29)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture6_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture6();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.DirectLinkMenuItemRenderer.startRender(DirectLinkMenuItemRenderer.java:29)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture7_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture7();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture8_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture8();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture9_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture9();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture10_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture10();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.DirectLinkMenuItemRenderer.startRender(DirectLinkMenuItemRenderer.java:29)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture11_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture11();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.DirectLinkMenuItemRenderer.startRender(DirectLinkMenuItemRenderer.java:29)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture12_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture12();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture13_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture13();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture14_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture14();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture15_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture15();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.DirectLinkMenuItemRenderer.startRender(DirectLinkMenuItemRenderer.java:29)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture16_1()
		throws Exception {
		GenericMarkupMenuItemRenderer fixture = getFixture16();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
		// Add additional tear down code here
	}
}