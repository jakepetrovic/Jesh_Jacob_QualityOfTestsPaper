package ch.bluepenguin.tapestry.components.menu.model.impl;

import junit.framework.*;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.DefaultMenuItemRenderer;
import java.util.Iterator;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.DirectLinkMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.HyperlinkMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.renderer.IMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.model.IMenuItem;

/**
 * The class <code>DefaultMenuModelTest</code> contains tests for the class <code>{@link DefaultMenuModel}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DefaultMenuModelTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuModel
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuModel fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuModel
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuModel fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuModel
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuModel fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuModel
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuModel fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuModel
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuModel getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DefaultMenuModel();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuModel
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuModel getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DefaultMenuModel();
			fixture2.addMenuItem(new DefaultMenuItem(new Object()), new DefaultMenuItemRenderer());
			fixture2.addMenuItem(new DefaultMenuItem(new Object()), new DefaultMenuItemRenderer());
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuModel
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuModel getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DefaultMenuModel();
			fixture3.addMenuItem(new DefaultMenuItem(new Object()), new DefaultMenuItemRenderer());
			fixture3.addMenuItem(new DefaultMenuItem(new Object()), new GenericMarkupMenuItemRenderer());
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuModel
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuModel getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DefaultMenuModel();
			fixture4.addMenuItem(new DefaultMenuItem(new Object()), new DefaultMenuItemRenderer());
			fixture4.addMenuItem((IMenuItem) null, new DirectLinkMenuItemRenderer());
		}
		return fixture4;
	}

	/**
	 * Run the DefaultMenuModel() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testDefaultMenuModel_1()
		throws Exception {

		DefaultMenuModel result = new DefaultMenuModel();

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0) null", result.displayMenuStructure());
	}

	/**
	 * Run the void addMenuItem(IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture1_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture1();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.addMenuItem(item);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture2_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture2();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.addMenuItem(item);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture3_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture3();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.addMenuItem(item);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture4_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture4();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.addMenuItem(item);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture1_2()
		throws Exception {
		DefaultMenuModel fixture = getFixture1();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new DefaultMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture3_2()
		throws Exception {
		DefaultMenuModel fixture = getFixture3();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new DirectLinkMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture1_3()
		throws Exception {
		DefaultMenuModel fixture = getFixture1();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new GenericMarkupMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture3_3()
		throws Exception {
		DefaultMenuModel fixture = getFixture3();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture2_2()
		throws Exception {
		DefaultMenuModel fixture = getFixture2();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new DefaultMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture4_2()
		throws Exception {
		DefaultMenuModel fixture = getFixture4();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new DirectLinkMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture2_3()
		throws Exception {
		DefaultMenuModel fixture = getFixture2();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new GenericMarkupMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture4_3()
		throws Exception {
		DefaultMenuModel fixture = getFixture4();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture3_4()
		throws Exception {
		DefaultMenuModel fixture = getFixture3();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new DefaultMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture1_4()
		throws Exception {
		DefaultMenuModel fixture = getFixture1();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new DirectLinkMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture3_5()
		throws Exception {
		DefaultMenuModel fixture = getFixture3();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new GenericMarkupMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture1_5()
		throws Exception {
		DefaultMenuModel fixture = getFixture1();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture4_4()
		throws Exception {
		DefaultMenuModel fixture = getFixture4();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new DefaultMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture2_4()
		throws Exception {
		DefaultMenuModel fixture = getFixture2();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new DirectLinkMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture4_5()
		throws Exception {
		DefaultMenuModel fixture = getFixture4();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new GenericMarkupMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void addMenuItem(IMenuItem,IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddMenuItem_fixture2_5()
		throws Exception {
		DefaultMenuModel fixture = getFixture2();
		IMenuItem item = null;
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.addMenuItem(item, renderer);

		// add additional test code here
	}

	/**
	 * Run the void checkMenuModelHealth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCheckMenuModelHealth_fixture1_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture1();

		fixture.checkMenuModelHealth();

		// add additional test code here
	}

	/**
	 * Run the void checkMenuModelHealth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCheckMenuModelHealth_fixture2_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture2();

		fixture.checkMenuModelHealth();

		// add additional test code here
	}

	/**
	 * Run the void checkMenuModelHealth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCheckMenuModelHealth_fixture3_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture3();

		fixture.checkMenuModelHealth();

		// add additional test code here
	}

	/**
	 * Run the void checkMenuModelHealth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testCheckMenuModelHealth_fixture4_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture4();

		fixture.checkMenuModelHealth();

		// add additional test code here
	}

	/**
	 * Run the String displayMenuStructure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testDisplayMenuStructure_fixture1_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture1();

		String result = fixture.displayMenuStructure();

		// add additional test code here
		assertEquals("(0) null", result);
	}

	/**
	 * Run the String displayMenuStructure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testDisplayMenuStructure_fixture2_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture2();

		String result = fixture.displayMenuStructure();

		// add additional test code here
		assertEquals("(0) null\n   (0) null\n   (0) null", result);
	}

	/**
	 * Run the String displayMenuStructure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testDisplayMenuStructure_fixture3_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture3();

		String result = fixture.displayMenuStructure();

		// add additional test code here
		assertEquals("(0) null\n   (0) null\n   (0) null", result);
	}

	/**
	 * Run the String displayMenuStructure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testDisplayMenuStructure_fixture4_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture4();

		String result = fixture.displayMenuStructure();

		// add additional test code here
		assertEquals("(0) null\n   (0) null", result);
	}

	/**
	 * Run the MenuItemList getChildList(IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetChildList_fixture1_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture1();
		IMenuItem item = new DefaultMenuItem(new Object());

		MenuItemList result = fixture.getChildList(item);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the MenuItemList getChildList(IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetChildList_fixture2_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture2();
		IMenuItem item = new DefaultMenuItem(new Object());

		MenuItemList result = fixture.getChildList(item);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the MenuItemList getChildList(IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetChildList_fixture3_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture3();
		IMenuItem item = new DefaultMenuItem(new Object());

		MenuItemList result = fixture.getChildList(item);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the MenuItemList getChildList(IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetChildList_fixture4_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture4();
		IMenuItem item = new DefaultMenuItem(new Object());

		MenuItemList result = fixture.getChildList(item);

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
	public void testGetMenuItemsDepthFirst_fixture1_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture1();

		Iterator result = fixture.getMenuItemsDepthFirst();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.hasNext());
	}

	/**
	 * Run the Iterator getMenuItemsDepthFirst() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMenuItemsDepthFirst_fixture2_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture2();

		Iterator result = fixture.getMenuItemsDepthFirst();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.hasNext());
	}

	/**
	 * Run the Iterator getMenuItemsDepthFirst() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMenuItemsDepthFirst_fixture3_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture3();

		Iterator result = fixture.getMenuItemsDepthFirst();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.hasNext());
	}

	/**
	 * Run the Iterator getMenuItemsDepthFirst() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetMenuItemsDepthFirst_fixture4_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture4();

		Iterator result = fixture.getMenuItemsDepthFirst();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.hasNext());
	}

	/**
	 * Run the MenuItemList getRootList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRootList_fixture1_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture1();

		MenuItemList result = fixture.getRootList();

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0) null", result.toString());
		assertEquals(null, result.getMenuItem());
		assertEquals(true, result.checkConsistency());
		assertEquals(0, result.getChildrenSize());
	}

	/**
	 * Run the MenuItemList getRootList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRootList_fixture2_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture2();

		MenuItemList result = fixture.getRootList();

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0) null", result.toString());
		assertEquals(null, result.getMenuItem());
		assertEquals(true, result.checkConsistency());
		assertEquals(2, result.getChildrenSize());
	}

	/**
	 * Run the MenuItemList getRootList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRootList_fixture3_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture3();

		MenuItemList result = fixture.getRootList();

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0) null", result.toString());
		assertEquals(null, result.getMenuItem());
		assertEquals(true, result.checkConsistency());
		assertEquals(2, result.getChildrenSize());
	}

	/**
	 * Run the MenuItemList getRootList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRootList_fixture4_1()
		throws Exception {
		DefaultMenuModel fixture = getFixture4();

		MenuItemList result = fixture.getRootList();

		// add additional test code here
		assertNotNull(result);
		assertEquals("(0) null", result.toString());
		assertEquals(null, result.getMenuItem());
		assertEquals(true, result.checkConsistency());
		assertEquals(1, result.getChildrenSize());
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