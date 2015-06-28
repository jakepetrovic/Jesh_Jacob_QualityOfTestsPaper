package client.view;

import java.awt.Graphics;
import javax.swing.DebugGraphics;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OverlayViewTest</code> contains tests for the class <code>{@link OverlayView}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class OverlayViewTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see OverlayView
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	private OverlayView fixture;

	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public OverlayViewTest(String name) {
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see OverlayView
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public OverlayView getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new OverlayView();
		}
		return fixture;
	}

	/**
	 * Run the void paint(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testPaint_fixture_1()
		throws Exception {
		OverlayView fixture2 = getFixture();
		Graphics gfx = new DebugGraphics();

		fixture2.paint(gfx);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testSetText_fixture_1()
		throws Exception {
		OverlayView fixture2 = getFixture();
		String text = null;

		fixture2.setText(text);

		// add additional test code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OverlayViewTest.class);
	}
}