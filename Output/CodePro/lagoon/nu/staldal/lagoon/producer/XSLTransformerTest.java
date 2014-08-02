package nu.staldal.lagoon.producer;

import java.io.FileNotFoundException;
import java.io.IOException;
import nu.staldal.lagoon.core.LagoonException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import nu.staldal.lagoon.core.Target;
import org.junit.*;
import static org.junit.Assert.*;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * The class <code>XSLTransformerTest</code> contains tests for the class <code>{@link XSLTransformer}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:55 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class XSLTransformerTest {
	/**
	 * Run the XSLTransformer() constructor test.
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testXSLTransformer_1()
		throws Exception {
		XSLTransformer result = new XSLTransformer();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testAfterBuild_1()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testAfterBuild_2()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the void afterBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testAfterBuild_3()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();

		fixture.afterBuild();

		// add additional test code here
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testHasBeenUpdated_1()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testHasBeenUpdated_2()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testHasBeenUpdated_3()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testHasBeenUpdated_4()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testHasBeenUpdated_5()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testHasBeenUpdated_6()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testHasBeenUpdated_7()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testHasBeenUpdated_8()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testHasBeenUpdated_9()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testHasBeenUpdated_10()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testHasBeenUpdated_11()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testHasBeenUpdated_12()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testInit_2()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testInit_3()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testInit_4()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testInit_5()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testInit_6()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testInit_7()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testInit_8()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testInit_9()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_10()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = javax.xml.transform.TransformerFactoryConfigurationError.class)
	public void testInit_11()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_2()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_3()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_4()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_5()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_6()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_7()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_8()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_9()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_10()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_11()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_12()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_13()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_14()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test
	public void testStart_15()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Run the void start(ContentHandler,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testStart_16()
		throws Exception {
		XSLTransformer fixture = new XSLTransformer();
		ContentHandler sax = new DefaultHandler();
		Target target = null;

		fixture.start(sax, target);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/14 7:55 PM
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
	 * @generatedBy CodePro at 4/23/14 7:55 PM
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
	 * @generatedBy CodePro at 4/23/14 7:55 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XSLTransformerTest.class);
	}
}