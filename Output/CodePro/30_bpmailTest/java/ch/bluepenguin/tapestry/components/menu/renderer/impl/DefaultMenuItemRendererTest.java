package ch.bluepenguin.tapestry.components.menu.renderer.impl;

import org.apache.tapestry.IMarkupWriter;
import org.apache.tapestry.engine.NullWriter;
import ch.bluepenguin.tapestry.components.menu.model.IMenuItem;
import ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuItem;
import junit.framework.*;

/**
 * The class <code>DefaultMenuItemRendererTest</code> contains tests for the class <code>{@link DefaultMenuItemRenderer}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DefaultMenuItemRendererTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItemRenderer fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItemRenderer getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new DefaultMenuItemRenderer();
		}
		return fixture;
	}

	/**
	 * Run the DefaultMenuItemRenderer() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testDefaultMenuItemRenderer_1()
		throws Exception {

		DefaultMenuItemRenderer result = new DefaultMenuItemRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void startRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStartRender_fixture_1()
		throws Exception {
		DefaultMenuItemRenderer fixture2 = getFixture();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture2.startRender(writer, item);

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