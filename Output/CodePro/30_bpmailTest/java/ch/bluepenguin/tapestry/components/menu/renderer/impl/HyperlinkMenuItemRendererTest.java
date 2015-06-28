package ch.bluepenguin.tapestry.components.menu.renderer.impl;

import org.apache.tapestry.IMarkupWriter;
import org.apache.tapestry.engine.NullWriter;
import ch.bluepenguin.tapestry.components.menu.model.IMenuItem;
import ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuItem;
import junit.framework.*;

/**
 * The class <code>HyperlinkMenuItemRendererTest</code> contains tests for the class <code>{@link HyperlinkMenuItemRenderer}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class HyperlinkMenuItemRendererTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see HyperlinkMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private HyperlinkMenuItemRenderer fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see HyperlinkMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private HyperlinkMenuItemRenderer fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see HyperlinkMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private HyperlinkMenuItemRenderer fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see HyperlinkMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private HyperlinkMenuItemRenderer fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see HyperlinkMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public HyperlinkMenuItemRenderer getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new HyperlinkMenuItemRenderer();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see HyperlinkMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public HyperlinkMenuItemRenderer getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new HyperlinkMenuItemRenderer();
			fixture2.setHyperlink("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see HyperlinkMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public HyperlinkMenuItemRenderer getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new HyperlinkMenuItemRenderer();
			fixture3.setHyperlink("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see HyperlinkMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public HyperlinkMenuItemRenderer getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new HyperlinkMenuItemRenderer();
			fixture4.setHyperlink("An��t-1.0.txt");
		}
		return fixture4;
	}

	/**
	 * Run the HyperlinkMenuItemRenderer() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHyperlinkMenuItemRenderer_1()
		throws Exception {

		HyperlinkMenuItemRenderer result = new HyperlinkMenuItemRenderer();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getHyperlink());
	}

	/**
	 * Run the String getHyperlink() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetHyperlink_fixture1_1()
		throws Exception {
		HyperlinkMenuItemRenderer fixture = getFixture1();

		String result = fixture.getHyperlink();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getHyperlink() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetHyperlink_fixture2_1()
		throws Exception {
		HyperlinkMenuItemRenderer fixture = getFixture2();

		String result = fixture.getHyperlink();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getHyperlink() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetHyperlink_fixture3_1()
		throws Exception {
		HyperlinkMenuItemRenderer fixture = getFixture3();

		String result = fixture.getHyperlink();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getHyperlink() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetHyperlink_fixture4_1()
		throws Exception {
		HyperlinkMenuItemRenderer fixture = getFixture4();

		String result = fixture.getHyperlink();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the void setHyperlink(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetHyperlink_fixture1_1()
		throws Exception {
		HyperlinkMenuItemRenderer fixture = getFixture1();
		String hyperlink = "";

		fixture.setHyperlink(hyperlink);

		// add additional test code here
	}

	/**
	 * Run the void setHyperlink(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetHyperlink_fixture2_1()
		throws Exception {
		HyperlinkMenuItemRenderer fixture = getFixture2();
		String hyperlink = "0123456789";

		fixture.setHyperlink(hyperlink);

		// add additional test code here
	}

	/**
	 * Run the void setHyperlink(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetHyperlink_fixture3_1()
		throws Exception {
		HyperlinkMenuItemRenderer fixture = getFixture3();
		String hyperlink = "0123456789";

		fixture.setHyperlink(hyperlink);

		// add additional test code here
	}

	/**
	 * Run the void setHyperlink(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetHyperlink_fixture4_1()
		throws Exception {
		HyperlinkMenuItemRenderer fixture = getFixture4();
		String hyperlink = "0123456789";

		fixture.setHyperlink(hyperlink);

		// add additional test code here
	}

	/**
	 * Run the void setHyperlink(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetHyperlink_fixture2_2()
		throws Exception {
		HyperlinkMenuItemRenderer fixture = getFixture2();
		String hyperlink = "";

		fixture.setHyperlink(hyperlink);

		// add additional test code here
	}

	/**
	 * Run the void setHyperlink(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetHyperlink_fixture3_2()
		throws Exception {
		HyperlinkMenuItemRenderer fixture = getFixture3();
		String hyperlink = "";

		fixture.setHyperlink(hyperlink);

		// add additional test code here
	}

	/**
	 * Run the void setHyperlink(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetHyperlink_fixture4_2()
		throws Exception {
		HyperlinkMenuItemRenderer fixture = getFixture4();
		String hyperlink = "";

		fixture.setHyperlink(hyperlink);

		// add additional test code here
	}

	/**
	 * Run the void setHyperlink(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetHyperlink_fixture1_2()
		throws Exception {
		HyperlinkMenuItemRenderer fixture = getFixture1();
		String hyperlink = "0123456789";

		fixture.setHyperlink(hyperlink);

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
		HyperlinkMenuItemRenderer fixture = getFixture1();
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
	public void testStartRender_fixture2_1()
		throws Exception {
		HyperlinkMenuItemRenderer fixture = getFixture2();
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
		HyperlinkMenuItemRenderer fixture = getFixture3();
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
		HyperlinkMenuItemRenderer fixture = getFixture4();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.startRender(writer, item);

		// add additional test code here
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