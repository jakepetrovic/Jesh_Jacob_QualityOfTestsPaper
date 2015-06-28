package client.view;

import java.awt.Image;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ExplosionGfxFactoryTest</code> contains tests for the class <code>{@link ExplosionGfxFactory}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ExplosionGfxFactoryTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ExplosionGfxFactory
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private ExplosionGfxFactory fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ExplosionGfxFactory
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public ExplosionGfxFactory getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new ExplosionGfxFactory();
		}
		return fixture;
	}

	/**
	 * Run the ExplosionGfxFactory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionGfxFactory_1()
		throws Exception {

		ExplosionGfxFactory result = new ExplosionGfxFactory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Image getExplosionImage(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetExplosionImage_fixture_1()
		throws Exception {
		ExplosionGfxFactory fixture2 = getFixture();
		int diameter = 0;
		int id = 0;

		Image result = fixture2.getExplosionImage(diameter, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Width (0) and height (0) cannot be <= 0
		//       at java.awt.image.DirectColorModel.createCompatibleWritableRaster(DirectColorModel.java:1016)
		//       at java.awt.image.BufferedImage.<init>(BufferedImage.java:340)
		//       at client.view.ExplosionGfxFactory.getExplosionImage(ExplosionGfxFactory.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the Image getExplosionImage(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetExplosionImage_fixture_2()
		throws Exception {
		ExplosionGfxFactory fixture2 = getFixture();
		int diameter = 3;
		int id = 1;

		Image result = fixture2.getExplosionImage(diameter, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No such resource: /gfx/player/1/end.png
		//       at common.ResourceService.getInputStream(ResourceService.java:60)
		//       at common.ResourceService.getImage(ResourceService.java:33)
		//       at client.view.ExplosionGfxFactory.loadImage(ExplosionGfxFactory.java:111)
		//       at client.view.ExplosionGfxFactory.loadExplosionImage(ExplosionGfxFactory.java:105)
		//       at client.view.ExplosionGfxFactory.getExplosionImage(ExplosionGfxFactory.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the Image getExplosionImage(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetExplosionImage_fixture_3()
		throws Exception {
		ExplosionGfxFactory fixture2 = getFixture();
		int diameter = 0;
		int id = 7;

		Image result = fixture2.getExplosionImage(diameter, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Width (0) and height (0) cannot be <= 0
		//       at java.awt.image.DirectColorModel.createCompatibleWritableRaster(DirectColorModel.java:1016)
		//       at java.awt.image.BufferedImage.<init>(BufferedImage.java:340)
		//       at client.view.ExplosionGfxFactory.getExplosionImage(ExplosionGfxFactory.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the Image getExplosionImage(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetExplosionImage_fixture_4()
		throws Exception {
		ExplosionGfxFactory fixture2 = getFixture();
		int diameter = 0;
		int id = 1;

		Image result = fixture2.getExplosionImage(diameter, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Width (0) and height (0) cannot be <= 0
		//       at java.awt.image.DirectColorModel.createCompatibleWritableRaster(DirectColorModel.java:1016)
		//       at java.awt.image.BufferedImage.<init>(BufferedImage.java:340)
		//       at client.view.ExplosionGfxFactory.getExplosionImage(ExplosionGfxFactory.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the Image getExplosionImage(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetExplosionImage_fixture_5()
		throws Exception {
		ExplosionGfxFactory fixture2 = getFixture();
		int diameter = 3;
		int id = 7;

		Image result = fixture2.getExplosionImage(diameter, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No such resource: /gfx/player/7/end.png
		//       at common.ResourceService.getInputStream(ResourceService.java:60)
		//       at common.ResourceService.getImage(ResourceService.java:33)
		//       at client.view.ExplosionGfxFactory.loadImage(ExplosionGfxFactory.java:111)
		//       at client.view.ExplosionGfxFactory.loadExplosionImage(ExplosionGfxFactory.java:105)
		//       at client.view.ExplosionGfxFactory.getExplosionImage(ExplosionGfxFactory.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the Image getExplosionImage(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetExplosionImage_fixture_6()
		throws Exception {
		ExplosionGfxFactory fixture2 = getFixture();
		int diameter = 3;
		int id = 0;

		Image result = fixture2.getExplosionImage(diameter, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No such resource: /gfx/player/0/end.png
		//       at common.ResourceService.getInputStream(ResourceService.java:60)
		//       at common.ResourceService.getImage(ResourceService.java:33)
		//       at client.view.ExplosionGfxFactory.loadImage(ExplosionGfxFactory.java:111)
		//       at client.view.ExplosionGfxFactory.loadExplosionImage(ExplosionGfxFactory.java:105)
		//       at client.view.ExplosionGfxFactory.getExplosionImage(ExplosionGfxFactory.java:41)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ExplosionGfxFactoryTest.class);
	}
}