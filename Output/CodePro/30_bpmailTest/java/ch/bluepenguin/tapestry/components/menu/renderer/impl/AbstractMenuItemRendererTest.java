package ch.bluepenguin.tapestry.components.menu.renderer.impl;

import org.apache.tapestry.IMarkupWriter;
import org.apache.tapestry.engine.NullWriter;
import ch.bluepenguin.tapestry.components.menu.model.IMenuItem;
import ch.bluepenguin.tapestry.components.menu.model.impl.DefaultMenuItem;
import junit.framework.*;

/**
 * The class <code>AbstractMenuItemRendererTest</code> contains tests for the class <code>{@link AbstractMenuItemRenderer}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class AbstractMenuItemRendererTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private AbstractMenuItemRenderer fixture16;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new DefaultMenuItemRenderer();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new DefaultMenuItemRenderer();
			fixture2.setStyleClass("");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new DefaultMenuItemRenderer();
			fixture3.setStyleClass("0123456789");
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new DefaultMenuItemRenderer();
			fixture4.setStyleClass("An��t-1.0.txt");
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new DirectLinkMenuItemRenderer();
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new DirectLinkMenuItemRenderer();
			fixture6.setStyleClass("");
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new DirectLinkMenuItemRenderer();
			fixture7.setStyleClass("0123456789");
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new DirectLinkMenuItemRenderer();
			fixture8.setStyleClass("An��t-1.0.txt");
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new GenericMarkupMenuItemRenderer();
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new GenericMarkupMenuItemRenderer();
			fixture10.setStyleClass("");
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new GenericMarkupMenuItemRenderer();
			fixture11.setStyleClass("0123456789");
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new GenericMarkupMenuItemRenderer();
			fixture12.setStyleClass("An��t-1.0.txt");
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new HyperlinkMenuItemRenderer();
		}
		return fixture13;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new HyperlinkMenuItemRenderer();
			fixture14.setStyleClass("");
		}
		return fixture14;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new HyperlinkMenuItemRenderer();
			fixture15.setStyleClass("0123456789");
		}
		return fixture15;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractMenuItemRenderer
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public AbstractMenuItemRenderer getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new HyperlinkMenuItemRenderer();
			fixture16.setStyleClass("An��t-1.0.txt");
		}
		return fixture16;
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture1_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture1();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture2_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture2();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture3_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture3();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture4_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture4();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture5_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture5();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.DirectLinkMenuItemRenderer.startRender(DirectLinkMenuItemRenderer.java:29)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture6_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture6();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.DirectLinkMenuItemRenderer.startRender(DirectLinkMenuItemRenderer.java:29)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture7_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture7();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.DirectLinkMenuItemRenderer.startRender(DirectLinkMenuItemRenderer.java:29)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture8_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture8();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.DirectLinkMenuItemRenderer.startRender(DirectLinkMenuItemRenderer.java:29)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture9_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture9();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture10_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture10();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture11_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture11();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture12_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture12();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.GenericMarkupMenuItemRenderer.startRender(GenericMarkupMenuItemRenderer.java:58)
		//       at ch.bluepenguin.tapestry.components.menu.renderer.impl.AbstractMenuItemRenderer.render(AbstractMenuItemRenderer.java:27)
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture13_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture13();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture14_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture14();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture15_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture15();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void render(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testRender_fixture16_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture16();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.render(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture1_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture1();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture2_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture2();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture3_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture3();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture4_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture4();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture5_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture5();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture6_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture6();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture7_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture7();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture8_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture8();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture9_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture9();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture10_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture10();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture11_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture11();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture12_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture12();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture13_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture13();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture14_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture14();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture15_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture15();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture16_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture16();
		String styleClass = "0123456789";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture2_2()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture2();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture3_2()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture3();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture4_2()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture4();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture5_2()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture5();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture6_2()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture6();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture7_2()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture7();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture8_2()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture8();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture9_2()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture9();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture10_2()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture10();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture11_2()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture11();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture12_2()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture12();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture13_2()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture13();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture14_2()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture14();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void setStyleClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetStyleClass_fixture15_2()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture15();
		String styleClass = "";

		fixture.setStyleClass(styleClass);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture1_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture1();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture2_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture2();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture3_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture3();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture4_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture4();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture5_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture5();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture6_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture6();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture7_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture7();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture8_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture8();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture9_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture9();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture10_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture10();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture11_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture11();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture12_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture12();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture13_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture13();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture14_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture14();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture15_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture15();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

		// add additional test code here
	}

	/**
	 * Run the void stopRender(IMarkupWriter,IMenuItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testStopRender_fixture16_1()
		throws Exception {
		AbstractMenuItemRenderer fixture = getFixture16();
		IMarkupWriter writer = NullWriter.getSharedInstance();
		IMenuItem item = new DefaultMenuItem(new Object());

		fixture.stopRender(writer, item);

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