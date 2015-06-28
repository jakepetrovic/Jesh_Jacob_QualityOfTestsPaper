package ch.bluepenguin.tapestry.components.menu.model.impl;

import junit.framework.*;
import java.util.Iterator;
import ch.bluepenguin.tapestry.components.menu.model.IMenuItem;

/**
 * The class <code>MenuItemListTest</code> contains tests for the class <code>{@link MenuItemList}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MenuItemListTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see MenuItemList
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private MenuItemList fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MenuItemList
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public MenuItemList getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new MenuItemList((IMenuItem) null);
		}
		return fixture;
	}

	/**
	 * Run the MenuItemList(IMenuItem) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMenuItemList_1()
		throws Exception {
		IMenuItem parent = null;

		MenuItemList result = new MenuItemList(parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0) null", result.toString());
		assertEquals(null, result.getMenuItem());
		assertEquals(true, result.checkConsistency());
		assertEquals(0, result.getChildrenSize());
	}

	/**
	 * Run the void addChild(MenuItemList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddChild_fixture_1()
		throws Exception {
		MenuItemList fixture2 = getFixture();
		MenuItemList item = new MenuItemList((IMenuItem) null);

		fixture2.addChild(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.model.impl.MenuItemList.addChild(MenuItemList.java:24)
	}

	/**
	 * Run the boolean checkConsistency() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCheckConsistency_fixture_1()
		throws Exception {
		MenuItemList fixture2 = getFixture();

		boolean result = fixture2.checkConsistency();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Iterator getChildrenIterator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetChildrenIterator_fixture_1()
		throws Exception {
		MenuItemList fixture2 = getFixture();

		Iterator result = fixture2.getChildrenIterator();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the int getChildrenSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetChildrenSize_fixture_1()
		throws Exception {
		MenuItemList fixture2 = getFixture();

		int result = fixture2.getChildrenSize();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the IMenuItem getMenuItem() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMenuItem_fixture_1()
		throws Exception {
		MenuItemList fixture2 = getFixture();

		IMenuItem result = fixture2.getMenuItem();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture_1()
		throws Exception {
		MenuItemList fixture2 = getFixture();

		String result = fixture2.toString();

		// add additional test code here
		assertEquals("(0) null", result);
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