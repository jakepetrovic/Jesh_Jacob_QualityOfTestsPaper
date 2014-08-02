package nu.staldal.xtree;

import java.awt.datatransfer.DataFlavor;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>XTreeXMLDataContentHandlerTest</code> contains tests for the class <code>{@link XTreeXMLDataContentHandler}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class XTreeXMLDataContentHandlerTest {
	/**
	 * Run the XTreeXMLDataContentHandler() constructor test.
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testXTreeXMLDataContentHandler_1()
		throws Exception {
		XTreeXMLDataContentHandler result = new XTreeXMLDataContentHandler();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Object getContent(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetContent_1()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		DataSource ds = new FileDataSource(new File(""));

		Object result = fixture.getContent(ds);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContent(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetContent_2()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		DataSource ds = new FileDataSource(new File(""));

		Object result = fixture.getContent(ds);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getContent(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testGetContent_3()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		DataSource ds = new FileDataSource(new File(""));

		Object result = fixture.getContent(ds);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetTransferData_1()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		DataFlavor df = new DataFlavor();
		DataSource ds = new FileDataSource(new File(""));

		Object result = fixture.getTransferData(df, ds);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetTransferData_2()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		DataFlavor df = new DataFlavor();
		DataSource ds = new FileDataSource(new File(""));

		Object result = fixture.getTransferData(df, ds);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetTransferData_3()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		DataFlavor df = new DataFlavor();
		DataSource ds = new FileDataSource(new File(""));

		Object result = fixture.getTransferData(df, ds);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetTransferData_4()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		DataFlavor df = new DataFlavor();
		DataSource ds = new FileDataSource(new File(""));

		Object result = fixture.getTransferData(df, ds);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGetTransferData_5()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		DataFlavor df = new DataFlavor();
		DataSource ds = new FileDataSource(new File(""));

		Object result = fixture.getTransferData(df, ds);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DataFlavor[] getTransferDataFlavors() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetTransferDataFlavors_1()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();

		DataFlavor[] result = fixture.getTransferDataFlavors();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DataFlavor[] getTransferDataFlavors() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testGetTransferDataFlavors_2()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();

		DataFlavor[] result = fixture.getTransferDataFlavors();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DataFlavor[] getTransferDataFlavors() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testGetTransferDataFlavors_3()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();

		DataFlavor[] result = fixture.getTransferDataFlavors();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testWriteTo_1()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Text("");
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testWriteTo_2()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Text("");
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testWriteTo_3()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Text("");
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteTo_4()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Object();
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteTo_5()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Object();
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteTo_6()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Text("");
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteTo_7()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Text("");
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testWriteTo_8()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Object();
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testWriteTo_9()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Object();
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.Error.class)
	public void testWriteTo_10()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Object();
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testWriteTo_11()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Object();
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testWriteTo_12()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Object();
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testWriteTo_13()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Object();
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testWriteTo_14()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Object();
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testWriteTo_15()
		throws Exception {
		XTreeXMLDataContentHandler fixture = new XTreeXMLDataContentHandler();
		Object obj = new Object();
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XTreeXMLDataContentHandlerTest.class);
	}
}