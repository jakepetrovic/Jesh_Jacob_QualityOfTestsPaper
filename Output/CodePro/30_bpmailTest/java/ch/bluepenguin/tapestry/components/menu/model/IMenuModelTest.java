package ch.bluepenguin.tapestry.components.menu.model;

import junit.framework.*;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.HyperlinkMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.model.impl.MenuItemList;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.renderer.IMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.DefaultMenuItemRenderer;
import java.util.Iterator;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.DirectLinkMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuModel;
import ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuItem;

/**
 * The class <code>IMenuModelTest</code> contains tests for the class <code>{@link IMenuModel}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class IMenuModelTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see IMenuModel
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private IMenuModel fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see IMenuModel
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public IMenuModel getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new DefaultMenuModel();
		}
		return fixture;
	}

	/**
	 * Run the void addMenuItem(IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture_1()
		throws Exception {
		IMenuModel fixture2 = getFixture();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture2.addMenuItem(item);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture_2()
		throws Exception {
		IMenuModel fixture2 = getFixture();
		IMenuItem item = new DefaultMenuItem(new Object());
		IMenuItemRenderer renderer = new DefaultMenuItemRenderer();

		fixture2.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture_3()
		throws Exception {
		IMenuModel fixture2 = getFixture();
		IMenuItem item = new DefaultMenuItem(new Object());
		IMenuItemRenderer renderer = new DirectLinkMenuItemRenderer();

		fixture2.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture_4()
		throws Exception {
		IMenuModel fixture2 = getFixture();
		IMenuItem item = new DefaultMenuItem(new Object());
		IMenuItemRenderer renderer = new GenericMarkupMenuItemRenderer();

		fixture2.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture_5()
		throws Exception {
		IMenuModel fixture2 = getFixture();
		IMenuItem item = new DefaultMenuItem(new Object());
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture2.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void checkMenuModelHealth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCheckMenuModelHealth_fixture_1()
		throws Exception {
		IMenuModel fixture2 = getFixture();

		fixture2.checkMenuModelHealth();

		// add additional test code here
	}

	/**
	 * Run the MenuItemList getChildList(IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetChildList_fixture_1()
		throws Exception {
		IMenuModel fixture2 = getFixture();
		IMenuItem item = new DefaultMenuItem(new Object());

		MenuItemList result = fixture2.getChildList(item);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Iterator getMenuItemsDepthFirst() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMenuItemsDepthFirst_fixture_1()
		throws Exception {
		IMenuModel fixture2 = getFixture();

		Iterator result = fixture2.getMenuItemsDepthFirst();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the MenuItemList getRootList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRootList_fixture_1()
		throws Exception {
		IMenuModel fixture2 = getFixture();

		MenuItemList result = fixture2.getRootList();

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0) null", result.toString());
		assertEquals(null, result.getMenuItem());
		assertEquals(true, result.checkConsistency());
		assertEquals(0, result.getChildrenSize());
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