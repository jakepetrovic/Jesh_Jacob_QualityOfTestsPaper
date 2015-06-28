package net.sf.xisemele.impl;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.List;
import net.sf.xisemele.api.Reader;
import net.sf.xisemele.api.ValueList;
import javax.xml.parsers.DocumentBuilder;
import net.sf.xisemele.api.Attribute;
import net.sf.xisemele.api.Editor;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import net.sf.xisemele.api.Writer;
import org.junit.*;
import net.sf.xisemele.api.Value;
import static org.junit.Assert.*;
import org.w3c.dom.Document;
import net.sf.xisemele.api.Result;
import net.sf.xisemele.api.Formatter;
import net.sf.xisemele.api.Element;
import org.w3c.dom.Node;

/**
 * The class <code>FactoryTest</code> contains tests for the class <code>{@link Factory}</code>.
 *
 * @generatedBy CodePro at 4/19/14 2:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class FactoryTest {
	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 2:47 PM
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
	 * @generatedBy CodePro at 4/19/14 2:47 PM
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
	 * @generatedBy CodePro at 4/19/14 2:47 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FactoryTest.class);
	}
}