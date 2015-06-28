package client.view;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GameViewTest</code> contains tests for the class <code>{@link GameView}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:17 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class GameViewTest {
	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public GameViewTest(String name) {
	}

	/**
	 * Run the GameView(GameCanvas) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testGameView_1()
		throws Exception {
		GameCanvas gameCanvas = new GameCanvas(0, 0);

		GameView result = new GameView(gameCanvas);

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
	 * Run the boolean displayNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	@Test
	public void testDisplayNames_1()
		throws Exception {

		boolean result = GameView.displayNames();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at client.view.GameView.<clinit>(GameView.java:26)
		assertTrue(result);
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:17 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GameViewTest.class);
	}
}