package client.view;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OffGamePainterTest</code> contains tests for the class <code>{@link OffGamePainter}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class OffGamePainterTest {
	/**
	 * Run the OffGamePainter(GameView) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testOffGamePainter_1()
		throws Exception {
		GameView view = new GameView(new GameCanvas(0, 0));

		OffGamePainter result = new OffGamePainter(view);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Width (0) and height (0) cannot be <= 0
		//       at java.awt.image.DirectColorModel.createCompatibleWritableRaster(DirectColorModel.java:1016)
		//       at java.awt.image.BufferedImage.<init>(BufferedImage.java:340)
		//       at client.view.GameCanvas.prepare(GameCanvas.java:43)
		//       at client.view.GameCanvas.<init>(GameCanvas.java:36)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
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
	 * @generatedBy CodePro at 6/14/15 5:14 PM
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
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OffGamePainterTest.class);
	}
}