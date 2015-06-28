package nu.staldal.xodus;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Properties;
import javax.xml.transform.stream.StreamResult;
import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

/**
 * The class <code>HTMLSerializerTest</code> contains tests for the class <code>{@link HTMLSerializer}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:35 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class HTMLSerializerTest {
	/**
	 * Run the HTMLSerializer(StreamResult,OutputConfig) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHTMLSerializer_1()
		throws Exception {
		StreamResult result = new StreamResult("");
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());

		HTMLSerializer result2 = new HTMLSerializer(result, outputConfig);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the HTMLSerializer(StreamResult,OutputConfig) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHTMLSerializer_2()
		throws Exception {
		StreamResult result = new StreamResult();
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());

		HTMLSerializer result2 = new HTMLSerializer(result, outputConfig);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the HTMLSerializer(StreamResult,OutputConfig) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHTMLSerializer_3()
		throws Exception {
		StreamResult result = new StreamResult(File.createTempFile("", ""));
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());

		HTMLSerializer result2 = new HTMLSerializer(result, outputConfig);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the HTMLSerializer(StreamResult,OutputConfig) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHTMLSerializer_4()
		throws Exception {
		StreamResult result = new StreamResult(new ByteArrayOutputStream());
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());

		HTMLSerializer result2 = new HTMLSerializer(result, outputConfig);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the HTMLSerializer(StreamResult,OutputConfig) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHTMLSerializer_5()
		throws Exception {
		StreamResult result = new StreamResult(new StringWriter());
		OutputConfig outputConfig = OutputConfig.createOutputConfig(new Properties());

		HTMLSerializer result2 = new HTMLSerializer(result, outputConfig);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HTMLSerializerTest.class);
	}
}