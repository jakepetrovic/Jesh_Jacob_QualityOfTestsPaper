package ch.bluepenguin.tapestry.components.menu.model.impl;

import junit.framework.*;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.DefaultMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.DirectLinkMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.HyperlinkMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer;
import ch.bluepenguin.tapestry.components.menu.renderer.IMenuItemRenderer;

/**
 * The class <code>DefaultMenuItemTest</code> contains tests for the class <code>{@link DefaultMenuItem}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DefaultMenuItemTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture16;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture17;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture18;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture19;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture20;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture21;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture22;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture23;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture24;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture25;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture26;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture27;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture28;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture29;

	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private DefaultMenuItem fixture30;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DefaultMenuItem(new Object());
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DefaultMenuItem(new Object());
			fixture2.setContained(new Object());
			fixture2.setDepth(0);
			fixture2.setIndex(0);
			fixture2.setLeaf(false);
			fixture2.setName("");
			fixture2.setParent(new Object());
			fixture2.setRenderer(new DefaultMenuItemRenderer());
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DefaultMenuItem(new Object());
			fixture3.setContained(new Object());
			fixture3.setDepth(0);
			fixture3.setIndex(0);
			fixture3.setLeaf(false);
			fixture3.setName("0123456789");
			fixture3.setParent(new Object());
			fixture3.setRenderer(new GenericMarkupMenuItemRenderer());
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DefaultMenuItem(new Object());
			fixture4.setContained(new Object());
			fixture4.setDepth(0);
			fixture4.setIndex(0);
			fixture4.setLeaf(true);
			fixture4.setName("");
			fixture4.setParent(new Object());
			fixture4.setRenderer(new DefaultMenuItemRenderer());
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new DefaultMenuItem(new Object());
			fixture5.setContained(new Object());
			fixture5.setDepth(0);
			fixture5.setIndex(0);
			fixture5.setLeaf(true);
			fixture5.setName("An��t-1.0.txt");
			fixture5.setParent(new Object());
			fixture5.setRenderer(new DefaultMenuItemRenderer());
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new DefaultMenuItem(new Object());
			fixture6.setContained(new Object());
			fixture6.setDepth(0);
			fixture6.setIndex(1);
			fixture6.setLeaf(false);
			fixture6.setName("");
			fixture6.setParent(new Object());
			fixture6.setRenderer(new GenericMarkupMenuItemRenderer());
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new DefaultMenuItem(new Object());
			fixture7.setContained(new Object());
			fixture7.setDepth(0);
			fixture7.setIndex(1);
			fixture7.setLeaf(true);
			fixture7.setName("0123456789");
			fixture7.setParent(new Object());
			fixture7.setRenderer(new DefaultMenuItemRenderer());
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new DefaultMenuItem(new Object());
			fixture8.setContained(new Object());
			fixture8.setDepth(0);
			fixture8.setIndex(1);
			fixture8.setLeaf(true);
			fixture8.setName("An��t-1.0.txt");
			fixture8.setParent(new Object());
			fixture8.setRenderer(new GenericMarkupMenuItemRenderer());
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new DefaultMenuItem(new Object());
			fixture9.setContained(new Object());
			fixture9.setDepth(0);
			fixture9.setIndex(7);
			fixture9.setLeaf(false);
			fixture9.setName("");
			fixture9.setParent(new Object());
			fixture9.setRenderer(new DirectLinkMenuItemRenderer());
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new DefaultMenuItem(new Object());
			fixture10.setContained(new Object());
			fixture10.setDepth(0);
			fixture10.setIndex(7);
			fixture10.setLeaf(false);
			fixture10.setName("An��t-1.0.txt");
			fixture10.setParent(new Object());
			fixture10.setRenderer(new DirectLinkMenuItemRenderer());
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new DefaultMenuItem(new Object());
			fixture11.setContained(new Object());
			fixture11.setDepth(0);
			fixture11.setIndex(7);
			fixture11.setLeaf(true);
			fixture11.setName("0123456789");
			fixture11.setParent(new Object());
			fixture11.setRenderer(new GenericMarkupMenuItemRenderer());
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new DefaultMenuItem(new Object());
			fixture12.setContained(new Object());
			fixture12.setDepth(1);
			fixture12.setIndex(0);
			fixture12.setLeaf(false);
			fixture12.setName("");
			fixture12.setParent(new Object());
			fixture12.setRenderer(new GenericMarkupMenuItemRenderer());
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new DefaultMenuItem(new Object());
			fixture13.setContained(new Object());
			fixture13.setDepth(1);
			fixture13.setIndex(0);
			fixture13.setLeaf(false);
			fixture13.setName("An��t-1.0.txt");
			fixture13.setParent(new Object());
			fixture13.setRenderer(new GenericMarkupMenuItemRenderer());
		}
		return fixture13;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new DefaultMenuItem(new Object());
			fixture14.setContained(new Object());
			fixture14.setDepth(1);
			fixture14.setIndex(0);
			fixture14.setLeaf(true);
			fixture14.setName("0123456789");
			fixture14.setParent(new Object());
			fixture14.setRenderer(new DefaultMenuItemRenderer());
		}
		return fixture14;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new DefaultMenuItem(new Object());
			fixture15.setContained(new Object());
			fixture15.setDepth(1);
			fixture15.setIndex(1);
			fixture15.setLeaf(false);
			fixture15.setName("0123456789");
			fixture15.setParent(new Object());
			fixture15.setRenderer(new GenericMarkupMenuItemRenderer());
		}
		return fixture15;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new DefaultMenuItem(new Object());
			fixture16.setContained(new Object());
			fixture16.setDepth(1);
			fixture16.setIndex(1);
			fixture16.setLeaf(false);
			fixture16.setName("An��t-1.0.txt");
			fixture16.setParent(new Object());
			fixture16.setRenderer(new DirectLinkMenuItemRenderer());
		}
		return fixture16;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture17()
		throws Exception {
		if (fixture17 == null) {
			fixture17 = new DefaultMenuItem(new Object());
			fixture17.setContained(new Object());
			fixture17.setDepth(1);
			fixture17.setIndex(1);
			fixture17.setLeaf(true);
			fixture17.setName("");
			fixture17.setParent(new Object());
			fixture17.setRenderer(new DefaultMenuItemRenderer());
		}
		return fixture17;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture18()
		throws Exception {
		if (fixture18 == null) {
			fixture18 = new DefaultMenuItem(new Object());
			fixture18.setContained(new Object());
			fixture18.setDepth(1);
			fixture18.setIndex(1);
			fixture18.setLeaf(true);
			fixture18.setName("0123456789");
			fixture18.setParent(new Object());
			fixture18.setRenderer(new GenericMarkupMenuItemRenderer());
		}
		return fixture18;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture19()
		throws Exception {
		if (fixture19 == null) {
			fixture19 = new DefaultMenuItem(new Object());
			fixture19.setContained(new Object());
			fixture19.setDepth(1);
			fixture19.setIndex(7);
			fixture19.setLeaf(false);
			fixture19.setName("0123456789");
			fixture19.setParent(new Object());
			fixture19.setRenderer(new DirectLinkMenuItemRenderer());
		}
		return fixture19;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture20()
		throws Exception {
		if (fixture20 == null) {
			fixture20 = new DefaultMenuItem(new Object());
			fixture20.setContained(new Object());
			fixture20.setDepth(1);
			fixture20.setIndex(7);
			fixture20.setLeaf(true);
			fixture20.setName("");
			fixture20.setParent(new Object());
			fixture20.setRenderer(new GenericMarkupMenuItemRenderer());
		}
		return fixture20;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture21()
		throws Exception {
		if (fixture21 == null) {
			fixture21 = new DefaultMenuItem(new Object());
			fixture21.setContained(new Object());
			fixture21.setDepth(1);
			fixture21.setIndex(7);
			fixture21.setLeaf(true);
			fixture21.setName("An��t-1.0.txt");
			fixture21.setParent(new Object());
			fixture21.setRenderer(new GenericMarkupMenuItemRenderer());
		}
		return fixture21;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture22()
		throws Exception {
		if (fixture22 == null) {
			fixture22 = new DefaultMenuItem(new Object());
			fixture22.setContained(new Object());
			fixture22.setDepth(7);
			fixture22.setIndex(0);
			fixture22.setLeaf(false);
			fixture22.setName("0123456789");
			fixture22.setParent(new Object());
			fixture22.setRenderer(new GenericMarkupMenuItemRenderer());
		}
		return fixture22;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture23()
		throws Exception {
		if (fixture23 == null) {
			fixture23 = new DefaultMenuItem(new Object());
			fixture23.setContained(new Object());
			fixture23.setDepth(7);
			fixture23.setIndex(0);
			fixture23.setLeaf(true);
			fixture23.setName("");
			fixture23.setParent(new Object());
			fixture23.setRenderer(new DefaultMenuItemRenderer());
		}
		return fixture23;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture24()
		throws Exception {
		if (fixture24 == null) {
			fixture24 = new DefaultMenuItem(new Object());
			fixture24.setContained(new Object());
			fixture24.setDepth(7);
			fixture24.setIndex(0);
			fixture24.setLeaf(true);
			fixture24.setName("An��t-1.0.txt");
			fixture24.setParent(new Object());
			fixture24.setRenderer(new DefaultMenuItemRenderer());
		}
		return fixture24;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture25()
		throws Exception {
		if (fixture25 == null) {
			fixture25 = new DefaultMenuItem(new Object());
			fixture25.setContained(new Object());
			fixture25.setDepth(7);
			fixture25.setIndex(1);
			fixture25.setLeaf(false);
			fixture25.setName("");
			fixture25.setParent(new Object());
			fixture25.setRenderer(new GenericMarkupMenuItemRenderer());
		}
		return fixture25;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture26()
		throws Exception {
		if (fixture26 == null) {
			fixture26 = new DefaultMenuItem(new Object());
			fixture26.setContained(new Object());
			fixture26.setDepth(7);
			fixture26.setIndex(1);
			fixture26.setLeaf(false);
			fixture26.setName("0123456789");
			fixture26.setParent(new Object());
			fixture26.setRenderer(new DirectLinkMenuItemRenderer());
		}
		return fixture26;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture27()
		throws Exception {
		if (fixture27 == null) {
			fixture27 = new DefaultMenuItem(new Object());
			fixture27.setContained(new Object());
			fixture27.setDepth(7);
			fixture27.setIndex(1);
			fixture27.setLeaf(true);
			fixture27.setName("An��t-1.0.txt");
			fixture27.setParent(new Object());
			fixture27.setRenderer(new GenericMarkupMenuItemRenderer());
		}
		return fixture27;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture28()
		throws Exception {
		if (fixture28 == null) {
			fixture28 = new DefaultMenuItem(new Object());
			fixture28.setContained(new Object());
			fixture28.setDepth(7);
			fixture28.setIndex(7);
			fixture28.setLeaf(false);
			fixture28.setName("");
			fixture28.setParent(new Object());
			fixture28.setRenderer(new DirectLinkMenuItemRenderer());
		}
		return fixture28;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture29()
		throws Exception {
		if (fixture29 == null) {
			fixture29 = new DefaultMenuItem(new Object());
			fixture29.setContained(new Object());
			fixture29.setDepth(7);
			fixture29.setIndex(7);
			fixture29.setLeaf(false);
			fixture29.setName("An��t-1.0.txt");
			fixture29.setParent(new Object());
			fixture29.setRenderer(new DirectLinkMenuItemRenderer());
		}
		return fixture29;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultMenuItem
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public DefaultMenuItem getFixture30()
		throws Exception {
		if (fixture30 == null) {
			fixture30 = new DefaultMenuItem(new Object());
			fixture30.setContained(new Object());
			fixture30.setDepth(7);
			fixture30.setIndex(7);
			fixture30.setLeaf(true);
			fixture30.setName("0123456789");
			fixture30.setParent(new Object());
			fixture30.setRenderer(new GenericMarkupMenuItemRenderer());
		}
		return fixture30;
	}

	/**
	 * Run the DefaultMenuItem(Object) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testDefaultMenuItem_1()
		throws Exception {
		Object containedObject = new Object();

		DefaultMenuItem result = new DefaultMenuItem(containedObject);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getParent());
		assertEquals(0, result.getIndex());
		assertEquals(0, result.getDepth());
		assertEquals(true, result.isLeaf());
		assertEquals(null, result.getRenderer());
		assertEquals(new Object(), result.getContained());
	}

	/**
	 * Run the DefaultMenuItem(Object) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testDefaultMenuItem_2()
		throws Exception {
		Object containedObject = null;

		DefaultMenuItem result = new DefaultMenuItem(containedObject);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(null, result.getParent());
		assertEquals(0, result.getIndex());
		assertEquals(0, result.getDepth());
		assertEquals(true, result.isLeaf());
		assertEquals(null, result.getRenderer());
		assertEquals(null, result.getContained());
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContained() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetContained_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();

		Object result = fixture.getContained();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetDepth_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();

		int result = fixture.getDepth();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetIndex_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();

		int result = fixture.getIndex();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();

		String result = fixture.getName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetName_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();

		Object result = fixture.getParent();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetParent_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();

		Object result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IMenuItemRenderer getRenderer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetRenderer_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();

		IMenuItemRenderer result = fixture.getRenderer();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isLeaf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testIsLeaf_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();

		boolean result = fixture.isLeaf();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();
		Object myObject = new Object();

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setContained(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetContained_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();
		Object myObject = null;

		fixture.setContained(myObject);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();
		int depth = 0;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();
		int depth = 1;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setDepth(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetDepth_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();
		int depth = 7;

		fixture.setDepth(depth);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();
		int index = 0;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();
		int index = 1;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setIndex(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetIndex_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();
		int index = 7;

		fixture.setIndex(index);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();
		boolean leaf = false;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setLeaf(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetLeaf_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();
		boolean leaf = true;

		fixture.setLeaf(leaf);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetName_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();
		String name = "0123456789";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();
		Object myParent = new Object();

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetParent_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();
		Object myParent = null;

		fixture.setParent(myParent);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();
		IMenuItemRenderer renderer = new DefaultMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();
		IMenuItemRenderer renderer = new DirectLinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();
		IMenuItemRenderer renderer = new GenericMarkupMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the void setRenderer(IMenuItemRenderer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetRenderer_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();
		IMenuItemRenderer renderer = new HyperlinkMenuItemRenderer();

		fixture.setRenderer(renderer);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture1_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture1();

		String result = fixture.toString();

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
	public void testToString_fixture2_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture3_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture4_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture4();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture5_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture5();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture6_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture6();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture7_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture7();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture8_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture8();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture9_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture9();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture10_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture10();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture11_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture11();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture12_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture12();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture13_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture13();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture14_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture14();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture15_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture15();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture16_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture16();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture17_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture17();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture18_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture18();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture19_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture19();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture20_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture20();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture21_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture21();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture22_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture22();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture23_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture23();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture24_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture24();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture25_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture25();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture26_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture26();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture27_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture27();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture28_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture28();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture29_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture29();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture30_1()
		throws Exception {
		DefaultMenuItem fixture = getFixture30();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("0123456789", result);
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