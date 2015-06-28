package common;

import java.awt.Image;
import java.io.InputStream;
import javax.swing.ImageIcon;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ResourceServiceTest</code> contains tests for the class <code>{@link ResourceService}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ResourceServiceTest {
	/**
	 * Run the Image getImage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetImage_1()
		throws Exception {
		String path = "";

		Image result = ResourceService.getImage(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(TempFileHelper.java:143)
		//       at java.nio.file.TempFileHelper.createTempFile(TempFileHelper.java:161)
		//       at java.nio.file.Files.createTempFile(Files.java:850)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(FileCacheImageInputStream.java:102)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(InputStreamImageInputStreamSpi.java:69)
		//       at javax.imageio.ImageIO.createImageInputStream(ImageIO.java:357)
		//       at javax.imageio.ImageIO.read(ImageIO.java:1351)
		//       at common.ResourceService.getImage(ResourceService.java:33)
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetImage_2()
		throws Exception {
		String path = "0123456789";

		Image result = ResourceService.getImage(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No such resource: 0123456789
		//       at common.ResourceService.getInputStream(ResourceService.java:60)
		//       at common.ResourceService.getImage(ResourceService.java:33)
		assertNotNull(result);
	}

	/**
	 * Run the ImageIcon getImageIcon(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetImageIcon_1()
		throws Exception {
		String path = "";

		ImageIcon result = ResourceService.getImageIcon(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(TempFileHelper.java:143)
		//       at java.nio.file.TempFileHelper.createTempFile(TempFileHelper.java:161)
		//       at java.nio.file.Files.createTempFile(Files.java:850)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(FileCacheImageInputStream.java:102)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(InputStreamImageInputStreamSpi.java:69)
		//       at javax.imageio.ImageIO.createImageInputStream(ImageIO.java:357)
		//       at javax.imageio.ImageIO.read(ImageIO.java:1351)
		//       at common.ResourceService.getImage(ResourceService.java:33)
		//       at common.ResourceService.getImageIcon(ResourceService.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the ImageIcon getImageIcon(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetImageIcon_2()
		throws Exception {
		String path = "0123456789";

		ImageIcon result = ResourceService.getImageIcon(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No such resource: 0123456789
		//       at common.ResourceService.getInputStream(ResourceService.java:60)
		//       at common.ResourceService.getImage(ResourceService.java:33)
		//       at common.ResourceService.getImageIcon(ResourceService.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the InputStream getInputStream(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetInputStream_1()
		throws Exception {
		String path = "";

		InputStream result = ResourceService.getInputStream(path);

		// add additional test code here
		assertNotNull(result);
		assertEquals(65, result.read());
		assertEquals(309, result.available());
		assertEquals(true, result.markSupported());
	}

	/**
	 * Run the InputStream getInputStream(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetInputStream_2()
		throws Exception {
		String path = "0123456789";

		InputStream result = ResourceService.getInputStream(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: No such resource: 0123456789
		//       at common.ResourceService.getInputStream(ResourceService.java:60)
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
		new org.junit.runner.JUnitCore().run(ResourceServiceTest.class);
	}
}