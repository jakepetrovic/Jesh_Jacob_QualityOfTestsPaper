package br.com.jnfe.base.service;

import javax.xml.transform.TransformerFactoryConfigurationError;
import org.apache.axiom.soap.SOAPFactory;
import org.apache.axiom.soap.impl.llom.soap11.SOAP11Factory;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.soap.axiom.AxiomSoapMessage;

/**
 * The class <code>LoggingFaultMessageResolverTest</code> contains tests for the class <code>{@link LoggingFaultMessageResolver}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:00 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class LoggingFaultMessageResolverTest {
	/**
	 * Run the LoggingFaultMessageResolver() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testLoggingFaultMessageResolver_1()
		throws Exception {
		LoggingFaultMessageResolver result = new LoggingFaultMessageResolver();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void resolveFault(WebServiceMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testResolveFault_1()
		throws Exception {
		LoggingFaultMessageResolver fixture = new LoggingFaultMessageResolver();
		WebServiceMessage message = new AxiomSoapMessage(new SOAP11Factory());

		fixture.resolveFault(message);

		// add additional test code here
	}

	/**
	 * Run the void resolveFault(WebServiceMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testResolveFault_2()
		throws Exception {
		LoggingFaultMessageResolver fixture = new LoggingFaultMessageResolver();
		WebServiceMessage message = new AxiomSoapMessage(new SOAP11Factory());

		fixture.resolveFault(message);

		// add additional test code here
	}

	/**
	 * Run the void resolveFault(WebServiceMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testResolveFault_3()
		throws Exception {
		LoggingFaultMessageResolver fixture = new LoggingFaultMessageResolver();
		WebServiceMessage message = new AxiomSoapMessage(new SOAP11Factory());

		fixture.resolveFault(message);

		// add additional test code here
	}

	/**
	 * Run the void resolveFault(WebServiceMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test
	public void testResolveFault_4()
		throws Exception {
		LoggingFaultMessageResolver fixture = new LoggingFaultMessageResolver();
		WebServiceMessage message = new AxiomSoapMessage(new SOAP11Factory());

		fixture.resolveFault(message);

		// add additional test code here
	}

	/**
	 * Run the void resolveFault(WebServiceMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	@Test(expected = javax.xml.transform.TransformerFactoryConfigurationError.class)
	public void testResolveFault_5()
		throws Exception {
		LoggingFaultMessageResolver fixture = new LoggingFaultMessageResolver();
		WebServiceMessage message = new AxiomSoapMessage(new SOAP11Factory());

		fixture.resolveFault(message);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:00 PM
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
	 * @generatedBy CodePro at 4/19/14 3:00 PM
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
	 * @generatedBy CodePro at 4/19/14 3:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LoggingFaultMessageResolverTest.class);
	}
}