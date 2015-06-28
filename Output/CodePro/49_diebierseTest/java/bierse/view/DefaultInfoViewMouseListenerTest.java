package bierse.view;

import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.event.MouseEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultInfoViewMouseListenerTest</code> contains tests for the class <code>{@link DefaultInfoViewMouseListener}</code>.
 *
 * @generatedBy CodePro at 5/31/15 5:22 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DefaultInfoViewMouseListenerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see DefaultInfoViewMouseListener
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	private DefaultInfoViewMouseListener fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see DefaultInfoViewMouseListener
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	public DefaultInfoViewMouseListener getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new DefaultInfoViewMouseListener(new JFrame(""));
		}
		return fixture;
	}

	/**
	 * Run the DefaultInfoViewMouseListener(JFrame) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testDefaultInfoViewMouseListener_1()
		throws Exception {
		JFrame defaultInfoFrame = new JFrame("");

		DefaultInfoViewMouseListener result = new DefaultInfoViewMouseListener(defaultInfoFrame);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DefaultInfoViewMouseListener(JFrame) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testDefaultInfoViewMouseListener_2()
		throws Exception {
		JFrame defaultInfoFrame = new JFrame("", (GraphicsConfiguration) null);

		DefaultInfoViewMouseListener result = new DefaultInfoViewMouseListener(defaultInfoFrame);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DefaultInfoViewMouseListener(JFrame) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testDefaultInfoViewMouseListener_3()
		throws Exception {
		JFrame defaultInfoFrame = new JFrame("0123456789", (GraphicsConfiguration) null);

		DefaultInfoViewMouseListener result = new DefaultInfoViewMouseListener(defaultInfoFrame);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DefaultInfoViewMouseListener(JFrame) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testDefaultInfoViewMouseListener_4()
		throws Exception {
		JFrame defaultInfoFrame = new JFrame();

		DefaultInfoViewMouseListener result = new DefaultInfoViewMouseListener(defaultInfoFrame);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DefaultInfoViewMouseListener(JFrame) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testDefaultInfoViewMouseListener_5()
		throws Exception {
		JFrame defaultInfoFrame = new JFrame((GraphicsConfiguration) null);

		DefaultInfoViewMouseListener result = new DefaultInfoViewMouseListener(defaultInfoFrame);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_1()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, 0, 0, false, 0);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_2()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_3()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false, 0);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_4()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false, 7);

		fixture2.mouseClicked(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_5()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, true, 1);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_6()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 1, false, 0);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_7()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 1, false, 7);

		fixture2.mouseClicked(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_8()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 0, true);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_9()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 0, 1, true, 0);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_10()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 0, 1, true, 1);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_11()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, false, 0);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_12()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, false, 1);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_13()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, true, 0);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_14()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, true, 1);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_15()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, false, 0);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_16()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, false, 1);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_17()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, true, 0);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_18()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, true, 1);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_19()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, false);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_20()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, true);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_21()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, true, 1);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_22()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, false, 0);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_23()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, false, 7);

		fixture2.mouseClicked(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_24()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, true, 1);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_25()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createVerticalGlue(), 7, 1L, 7, 7, 7, 7, false);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_26()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createVerticalGlue(), 7, 1L, 7, 7, 7, 7, true);

		fixture2.mouseClicked(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_27()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent((Component) null, -1, Long.MAX_VALUE, -1, -1, -1, -1, false);

		fixture2.mouseClicked(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ComponentEvent.<init>(ComponentEvent.java:119)
		//       at java.awt.event.InputEvent.<init>(InputEvent.java:339)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:733)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:618)
	}

	/**
	 * Run the void mouseClicked(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseClicked_fixture_28()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent((Component) null, -1, Long.MAX_VALUE, -1, -1, -1, -1, true);

		fixture2.mouseClicked(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ComponentEvent.<init>(ComponentEvent.java:119)
		//       at java.awt.event.InputEvent.<init>(InputEvent.java:339)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:733)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:618)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_1()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, 0, 0, false, 0);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_2()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_3()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false, 0);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_4()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false, 7);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_5()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, true, 1);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_6()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 1, false, 0);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_7()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 1, false, 7);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_8()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 0, true);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_9()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 0, 1, true, 0);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_10()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 0, 1, true, 1);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_11()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, false, 0);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_12()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, false, 1);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_13()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, true, 0);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_14()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, true, 1);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_15()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, false, 0);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_16()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, false, 1);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_17()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, true, 0);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_18()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, true, 1);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_19()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, false);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_20()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, true);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_21()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, true, 1);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_22()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, false, 0);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_23()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, false, 7);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_24()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, true, 1);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_25()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createVerticalGlue(), 7, 1L, 7, 7, 7, 7, false);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_26()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createVerticalGlue(), 7, 1L, 7, 7, 7, 7, true);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at bierse.view.DefaultInfoViewMouseListener.mouseDragged(DefaultInfoViewMouseListener.java:27)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_27()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent((Component) null, -1, Long.MAX_VALUE, -1, -1, -1, -1, false);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ComponentEvent.<init>(ComponentEvent.java:119)
		//       at java.awt.event.InputEvent.<init>(InputEvent.java:339)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:733)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:618)
	}

	/**
	 * Run the void mouseDragged(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseDragged_fixture_28()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent((Component) null, -1, Long.MAX_VALUE, -1, -1, -1, -1, true);

		fixture2.mouseDragged(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ComponentEvent.<init>(ComponentEvent.java:119)
		//       at java.awt.event.InputEvent.<init>(InputEvent.java:339)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:733)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:618)
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_1()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, 0, 0, false, 0);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_2()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_3()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false, 0);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_4()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false, 7);

		fixture2.mouseEntered(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_5()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, true, 1);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_6()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 1, false, 0);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_7()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 1, false, 7);

		fixture2.mouseEntered(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_8()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 0, true);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_9()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 0, 1, true, 0);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_10()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 0, 1, true, 1);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_11()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, false, 0);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_12()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, false, 1);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_13()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, true, 0);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_14()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, true, 1);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_15()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, false, 0);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_16()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, false, 1);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_17()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, true, 0);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_18()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, true, 1);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_19()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, false);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_20()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, true);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_21()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, true, 1);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_22()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, false, 0);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_23()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, false, 7);

		fixture2.mouseEntered(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_24()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, true, 1);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_25()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createVerticalGlue(), 7, 1L, 7, 7, 7, 7, false);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_26()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createVerticalGlue(), 7, 1L, 7, 7, 7, 7, true);

		fixture2.mouseEntered(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_27()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent((Component) null, -1, Long.MAX_VALUE, -1, -1, -1, -1, false);

		fixture2.mouseEntered(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ComponentEvent.<init>(ComponentEvent.java:119)
		//       at java.awt.event.InputEvent.<init>(InputEvent.java:339)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:733)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:618)
	}

	/**
	 * Run the void mouseEntered(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseEntered_fixture_28()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent((Component) null, -1, Long.MAX_VALUE, -1, -1, -1, -1, true);

		fixture2.mouseEntered(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ComponentEvent.<init>(ComponentEvent.java:119)
		//       at java.awt.event.InputEvent.<init>(InputEvent.java:339)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:733)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:618)
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_1()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, 0, 0, false, 0);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_2()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_3()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false, 0);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_4()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false, 7);

		fixture2.mouseExited(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_5()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, true, 1);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_6()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 1, false, 0);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_7()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 1, false, 7);

		fixture2.mouseExited(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_8()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 0, true);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_9()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 0, 1, true, 0);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_10()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 0, 1, true, 1);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_11()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, false, 0);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_12()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, false, 1);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_13()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, true, 0);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_14()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, true, 1);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_15()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, false, 0);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_16()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, false, 1);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_17()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, true, 0);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_18()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, true, 1);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_19()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, false);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_20()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, true);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_21()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, true, 1);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_22()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, false, 0);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_23()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, false, 7);

		fixture2.mouseExited(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_24()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, true, 1);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_25()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createVerticalGlue(), 7, 1L, 7, 7, 7, 7, false);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_26()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createVerticalGlue(), 7, 1L, 7, 7, 7, 7, true);

		fixture2.mouseExited(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_27()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent((Component) null, -1, Long.MAX_VALUE, -1, -1, -1, -1, false);

		fixture2.mouseExited(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ComponentEvent.<init>(ComponentEvent.java:119)
		//       at java.awt.event.InputEvent.<init>(InputEvent.java:339)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:733)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:618)
	}

	/**
	 * Run the void mouseExited(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseExited_fixture_28()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent((Component) null, -1, Long.MAX_VALUE, -1, -1, -1, -1, true);

		fixture2.mouseExited(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ComponentEvent.<init>(ComponentEvent.java:119)
		//       at java.awt.event.InputEvent.<init>(InputEvent.java:339)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:733)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:618)
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_1()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, 0, 0, false, 0);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_2()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_3()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false, 0);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_4()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false, 7);

		fixture2.mouseMoved(arg0);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_5()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, true, 1);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_6()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 1, false, 0);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_7()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 1, false, 7);

		fixture2.mouseMoved(arg0);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_8()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 0, true);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_9()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 0, 1, true, 0);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_10()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 0, 1, true, 1);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_11()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, false, 0);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_12()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, false, 1);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_13()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, true, 0);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_14()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, true, 1);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_15()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, false, 0);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_16()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, false, 1);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_17()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, true, 0);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_18()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, true, 1);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_19()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, false);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_20()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, true);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_21()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, true, 1);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_22()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, false, 0);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_23()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, false, 7);

		fixture2.mouseMoved(arg0);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_24()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, true, 1);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_25()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createVerticalGlue(), 7, 1L, 7, 7, 7, 7, false);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_26()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent(Box.createVerticalGlue(), 7, 1L, 7, 7, 7, 7, true);

		fixture2.mouseMoved(arg0);

		// add additional test code here
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_27()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent((Component) null, -1, Long.MAX_VALUE, -1, -1, -1, -1, false);

		fixture2.mouseMoved(arg0);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ComponentEvent.<init>(ComponentEvent.java:119)
		//       at java.awt.event.InputEvent.<init>(InputEvent.java:339)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:733)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:618)
	}

	/**
	 * Run the void mouseMoved(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseMoved_fixture_28()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent arg0 = new MouseEvent((Component) null, -1, Long.MAX_VALUE, -1, -1, -1, -1, true);

		fixture2.mouseMoved(arg0);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ComponentEvent.<init>(ComponentEvent.java:119)
		//       at java.awt.event.InputEvent.<init>(InputEvent.java:339)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:733)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:618)
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_1()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, 0, 0, false, 0);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_2()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_3()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false, 0);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_4()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false, 7);

		fixture2.mousePressed(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_5()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, true, 1);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_6()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 1, false, 0);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_7()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 1, false, 7);

		fixture2.mousePressed(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_8()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 0, true);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_9()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 0, 1, true, 0);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_10()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 0, 1, true, 1);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_11()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, false, 0);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_12()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, false, 1);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_13()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, true, 0);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_14()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, true, 1);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_15()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, false, 0);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_16()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, false, 1);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_17()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, true, 0);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_18()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, true, 1);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_19()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, false);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_20()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, true);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_21()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, true, 1);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_22()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, false, 0);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_23()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, false, 7);

		fixture2.mousePressed(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_24()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, true, 1);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_25()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createVerticalGlue(), 7, 1L, 7, 7, 7, 7, false);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_26()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createVerticalGlue(), 7, 1L, 7, 7, 7, 7, true);

		fixture2.mousePressed(e);

		// add additional test code here
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_27()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent((Component) null, -1, Long.MAX_VALUE, -1, -1, -1, -1, false);

		fixture2.mousePressed(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ComponentEvent.<init>(ComponentEvent.java:119)
		//       at java.awt.event.InputEvent.<init>(InputEvent.java:339)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:733)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:618)
	}

	/**
	 * Run the void mousePressed(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMousePressed_fixture_28()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent((Component) null, -1, Long.MAX_VALUE, -1, -1, -1, -1, true);

		fixture2.mousePressed(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ComponentEvent.<init>(ComponentEvent.java:119)
		//       at java.awt.event.InputEvent.<init>(InputEvent.java:339)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:733)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:618)
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_1()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, 0, 0, false, 0);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_2()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_3()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false, 0);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_4()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, false, 7);

		fixture2.mouseReleased(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_5()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 0, true, 1);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_6()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 1, false, 0);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_7()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createGlue(), 0, -1L, 0, 0, 0, 1, false, 7);

		fixture2.mouseReleased(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_8()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 0, true);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_9()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 0, 1, true, 0);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_10()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 0, 1, true, 1);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_11()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, false, 0);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_12()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, false, 1);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_13()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, true, 0);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_14()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 0, true, 1);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_15()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, false, 0);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_16()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, false, 1);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_17()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, true, 0);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_18()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, 1, 1, true, 1);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_19()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, false);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_20()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, true);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_21()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 1, true, 1);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_22()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, false, 0);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_23()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, false, 7);

		fixture2.mouseReleased(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Nonexistent button 7
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:748)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_24()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createHorizontalGlue(), 1, 0L, 1, 1, 1, 7, true, 1);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_25()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createVerticalGlue(), 7, 1L, 7, 7, 7, 7, false);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_26()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent(Box.createVerticalGlue(), 7, 1L, 7, 7, 7, 7, true);

		fixture2.mouseReleased(e);

		// add additional test code here
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_27()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent((Component) null, -1, Long.MAX_VALUE, -1, -1, -1, -1, false);

		fixture2.mouseReleased(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ComponentEvent.<init>(ComponentEvent.java:119)
		//       at java.awt.event.InputEvent.<init>(InputEvent.java:339)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:733)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:618)
	}

	/**
	 * Run the void mouseReleased(MouseEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/31/15 5:22 PM
	 */
	@Test
	public void testMouseReleased_fixture_28()
		throws Exception {
		DefaultInfoViewMouseListener fixture2 = getFixture();
		MouseEvent e = new MouseEvent((Component) null, -1, Long.MAX_VALUE, -1, -1, -1, -1, true);

		fixture2.mouseReleased(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(EventObject.java:56)
		//       at java.awt.AWTEvent.<init>(AWTEvent.java:337)
		//       at java.awt.event.ComponentEvent.<init>(ComponentEvent.java:119)
		//       at java.awt.event.InputEvent.<init>(InputEvent.java:339)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:733)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:554)
		//       at java.awt.event.MouseEvent.<init>(MouseEvent.java:618)
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
		new org.junit.runner.JUnitCore().run(DefaultInfoViewMouseListenerTest.class);
	}
}