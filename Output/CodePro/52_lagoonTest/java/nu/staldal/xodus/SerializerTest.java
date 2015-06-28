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

/**
 * The class <code>SerializerTest</code> contains tests for the class <code>{@link Serializer}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:35 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SerializerTest {
	/**
	 * Run the Serializer createSerializer(StreamResult,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateSerializer_1()
		throws Exception {
		StreamResult result = new StreamResult("");
		Properties outputProperties = new Properties();

		Serializer result2 = Serializer.createSerializer(result, outputProperties);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the Serializer createSerializer(StreamResult,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateSerializer_2()
		throws Exception {
		StreamResult result = new StreamResult();
		Properties outputProperties = new Properties((Properties) null);

		Serializer result2 = Serializer.createSerializer(result, outputProperties);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the Serializer createSerializer(StreamResult,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateSerializer_3()
		throws Exception {
		StreamResult result = new StreamResult(File.createTempFile("", ""));
		Properties outputProperties = new Properties((Properties) null);

		Serializer result2 = Serializer.createSerializer(result, outputProperties);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the Serializer createSerializer(StreamResult,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateSerializer_4()
		throws Exception {
		StreamResult result = new StreamResult(new ByteArrayOutputStream());
		Properties outputProperties = new Properties((Properties) null);

		Serializer result2 = Serializer.createSerializer(result, outputProperties);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the Serializer createSerializer(StreamResult,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateSerializer_5()
		throws Exception {
		StreamResult result = new StreamResult(new StringWriter());
		Properties outputProperties = new Properties((Properties) null);

		Serializer result2 = Serializer.createSerializer(result, outputProperties);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the Serializer createSerializer(StreamResult,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateSerializer_6()
		throws Exception {
		StreamResult result = new StreamResult();
		Properties outputProperties = new Properties();

		Serializer result2 = Serializer.createSerializer(result, outputProperties);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the Serializer createSerializer(StreamResult,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateSerializer_7()
		throws Exception {
		StreamResult result = new StreamResult(File.createTempFile("", ""));
		Properties outputProperties = new Properties();

		Serializer result2 = Serializer.createSerializer(result, outputProperties);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the Serializer createSerializer(StreamResult,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateSerializer_8()
		throws Exception {
		StreamResult result = new StreamResult(new ByteArrayOutputStream());
		Properties outputProperties = new Properties();

		Serializer result2 = Serializer.createSerializer(result, outputProperties);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the Serializer createSerializer(StreamResult,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateSerializer_9()
		throws Exception {
		StreamResult result = new StreamResult(new StringWriter());
		Properties outputProperties = new Properties();

		Serializer result2 = Serializer.createSerializer(result, outputProperties);

		// add additional test code here
		assertNotNull(result2);
	}

	/**
	 * Run the Serializer createSerializer(StreamResult,Properties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateSerializer_10()
		throws Exception {
		StreamResult result = new StreamResult("");
		Properties outputProperties = new Properties((Properties) null);

		Serializer result2 = Serializer.createSerializer(result, outputProperties);

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
		new org.junit.runner.JUnitCore().run(SerializerTest.class);
	}
}