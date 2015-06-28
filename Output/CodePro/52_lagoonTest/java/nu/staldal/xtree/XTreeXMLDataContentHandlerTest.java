package nu.staldal.xtree;

import java.awt.datatransfer.DataFlavor;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.activation.URLDataSource;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>XTreeXMLDataContentHandlerTest</code> contains tests for the class <code>{@link XTreeXMLDataContentHandler}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XTreeXMLDataContentHandlerTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see XTreeXMLDataContentHandler
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private XTreeXMLDataContentHandler fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XTreeXMLDataContentHandler
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public XTreeXMLDataContentHandler getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new XTreeXMLDataContentHandler();
		}
		return fixture;
	}

	/**
	 * Run the Object getContent(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetContent_fixture_1()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getContent(ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the Object getContent(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetContent_fixture_2()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getContent(ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at sun.net.www.http.HttpClient.openServer(HttpClient.java:434)
		//       at sun.net.www.http.HttpClient.openServer(HttpClient.java:527)
		//       at sun.net.www.http.HttpClient.<init>(HttpClient.java:211)
		//       at sun.net.www.http.HttpClient.New(HttpClient.java:308)
		//       at sun.net.www.http.HttpClient.New(HttpClient.java:326)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(HttpURLConnection.java:997)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:933)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(HttpURLConnection.java:851)
		//       at sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1301)
		//       at java.net.URL.openStream(URL.java:1037)
		//       at javax.activation.URLDataSource.getInputStream(URLDataSource.java:107)
		//       at nu.staldal.xtree.XTreeXMLDataContentHandler.getTransferData(XTreeXMLDataContentHandler.java:86)
		//       at nu.staldal.xtree.XTreeXMLDataContentHandler.getContent(XTreeXMLDataContentHandler.java:99)
		assertNotNull(result);
	}

	/**
	 * Run the Object getContent(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetContent_fixture_3()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataSource ds = new FileDataSource("");

		Object result = fixture2.getContent(ds);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_1()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = DataFlavor.imageFlavor;
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_2()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = DataFlavor.javaFileListFlavor;
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at sun.net.www.http.HttpClient.openServer(HttpClient.java:434)
		//       at sun.net.www.http.HttpClient.openServer(HttpClient.java:527)
		//       at sun.net.www.http.HttpClient.<init>(HttpClient.java:211)
		//       at sun.net.www.http.HttpClient.New(HttpClient.java:308)
		//       at sun.net.www.http.HttpClient.New(HttpClient.java:326)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(HttpURLConnection.java:997)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:933)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(HttpURLConnection.java:851)
		//       at sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1301)
		//       at java.net.URL.openStream(URL.java:1037)
		//       at javax.activation.URLDataSource.getInputStream(URLDataSource.java:107)
		//       at nu.staldal.xtree.XTreeXMLDataContentHandler.getTransferData(XTreeXMLDataContentHandler.java:86)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_3()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = DataFlavor.plainTextFlavor;
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at sun.net.www.http.HttpClient.openServer(HttpClient.java:434)
		//       at sun.net.www.http.HttpClient.openServer(HttpClient.java:527)
		//       at sun.net.www.http.HttpClient.<init>(HttpClient.java:211)
		//       at sun.net.www.http.HttpClient.New(HttpClient.java:308)
		//       at sun.net.www.http.HttpClient.New(HttpClient.java:326)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(HttpURLConnection.java:997)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:933)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(HttpURLConnection.java:851)
		//       at sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1301)
		//       at java.net.URL.openStream(URL.java:1037)
		//       at javax.activation.URLDataSource.getInputStream(URLDataSource.java:107)
		//       at nu.staldal.xtree.XTreeXMLDataContentHandler.getTransferData(XTreeXMLDataContentHandler.java:86)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_4()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = DataFlavor.selectBestTextFlavor(new DataFlavor[] {null});
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.datatransfer.DataFlavor.selectBestTextFlavor(DataFlavor.java:685)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_5()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = DataFlavor.stringFlavor;
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at sun.net.www.http.HttpClient.openServer(HttpClient.java:434)
		//       at sun.net.www.http.HttpClient.openServer(HttpClient.java:527)
		//       at sun.net.www.http.HttpClient.<init>(HttpClient.java:211)
		//       at sun.net.www.http.HttpClient.New(HttpClient.java:308)
		//       at sun.net.www.http.HttpClient.New(HttpClient.java:326)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(HttpURLConnection.java:997)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:933)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(HttpURLConnection.java:851)
		//       at sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1301)
		//       at java.net.URL.openStream(URL.java:1037)
		//       at javax.activation.URLDataSource.getInputStream(URLDataSource.java:107)
		//       at nu.staldal.xtree.XTreeXMLDataContentHandler.getTransferData(XTreeXMLDataContentHandler.java:86)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_6()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor("");
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: failed to parse:
		//       at java.awt.datatransfer.DataFlavor.<init>(DataFlavor.java:436)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_7()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor("", "");
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: failed to parse:
		//       at java.awt.datatransfer.DataFlavor.<init>(DataFlavor.java:368)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_8()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor("", "", ClassLoader.getSystemClassLoader());
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: failed to parse:
		//       at java.awt.datatransfer.DataFlavor.<init>(DataFlavor.java:408)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_9()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor("0123456789", "0123456789");
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: failed to parse:0123456789
		//       at java.awt.datatransfer.DataFlavor.<init>(DataFlavor.java:368)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_10()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor("0123456789", "0123456789", (ClassLoader) null);
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: failed to parse:0123456789
		//       at java.awt.datatransfer.DataFlavor.<init>(DataFlavor.java:408)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_11()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor("An��t-1.0.txt", "An��t-1.0.txt", (ClassLoader) null);
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: failed to parse:An��t-1.0.txt
		//       at java.awt.datatransfer.DataFlavor.<init>(DataFlavor.java:408)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_12()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor();
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at sun.net.www.http.HttpClient.openServer(HttpClient.java:434)
		//       at sun.net.www.http.HttpClient.openServer(HttpClient.java:527)
		//       at sun.net.www.http.HttpClient.<init>(HttpClient.java:211)
		//       at sun.net.www.http.HttpClient.New(HttpClient.java:308)
		//       at sun.net.www.http.HttpClient.New(HttpClient.java:326)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(HttpURLConnection.java:997)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:933)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(HttpURLConnection.java:851)
		//       at sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1301)
		//       at java.net.URL.openStream(URL.java:1037)
		//       at javax.activation.URLDataSource.getInputStream(URLDataSource.java:107)
		//       at nu.staldal.xtree.XTreeXMLDataContentHandler.getTransferData(XTreeXMLDataContentHandler.java:86)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_13()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor(Class.forName(""), "");
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_14()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor(Class.forName("", false, ClassLoader.getSystemClassLoader()), "0123456789");
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_15()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = DataFlavor.javaFileListFlavor;
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_16()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = DataFlavor.plainTextFlavor;
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_17()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = DataFlavor.selectBestTextFlavor(new DataFlavor[] {null});
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.datatransfer.DataFlavor.selectBestTextFlavor(DataFlavor.java:685)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_18()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = DataFlavor.stringFlavor;
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_19()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor("");
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: failed to parse:
		//       at java.awt.datatransfer.DataFlavor.<init>(DataFlavor.java:436)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_20()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor("", "");
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: failed to parse:
		//       at java.awt.datatransfer.DataFlavor.<init>(DataFlavor.java:368)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_21()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor("", "", ClassLoader.getSystemClassLoader());
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: failed to parse:
		//       at java.awt.datatransfer.DataFlavor.<init>(DataFlavor.java:408)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_22()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor("0123456789", "0123456789");
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: failed to parse:0123456789
		//       at java.awt.datatransfer.DataFlavor.<init>(DataFlavor.java:368)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_23()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor("0123456789", "0123456789", (ClassLoader) null);
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: failed to parse:0123456789
		//       at java.awt.datatransfer.DataFlavor.<init>(DataFlavor.java:408)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_24()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor("An��t-1.0.txt", "An��t-1.0.txt", (ClassLoader) null);
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: failed to parse:An��t-1.0.txt
		//       at java.awt.datatransfer.DataFlavor.<init>(DataFlavor.java:408)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_25()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor();
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_26()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor(Class.forName(""), "");
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_27()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = new DataFlavor(Class.forName("", false, ClassLoader.getSystemClassLoader()), "0123456789");
		DataSource ds = new FileDataSource(File.createTempFile("", ""));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassNotFoundException: 
		//       at java.lang.Class.forName0(Native Method)
		//       at java.lang.Class.forName(Class.java:274)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferData_fixture_28()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = DataFlavor.getTextPlainUnicodeFlavor();
		DataSource ds = new URLDataSource(new URL("http://www.eclipse.org"));

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:253)
		//       at java.net.SocketOutputStream.<init>(SocketOutputStream.java:60)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(AbstractPlainSocketImpl.java:434)
		//       at java.net.Socket$3.run(Socket.java:927)
		//       at java.net.Socket$3.run(Socket.java:925)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Socket.java:924)
		//       at sun.net.www.http.HttpClient.openServer(HttpClient.java:434)
		//       at sun.net.www.http.HttpClient.openServer(HttpClient.java:527)
		//       at sun.net.www.http.HttpClient.<init>(HttpClient.java:211)
		//       at sun.net.www.http.HttpClient.New(HttpClient.java:308)
		//       at sun.net.www.http.HttpClient.New(HttpClient.java:326)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(HttpURLConnection.java:997)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:933)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(HttpURLConnection.java:851)
		//       at sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1301)
		//       at java.net.URL.openStream(URL.java:1037)
		//       at javax.activation.URLDataSource.getInputStream(URLDataSource.java:107)
		//       at nu.staldal.xtree.XTreeXMLDataContentHandler.getTransferData(XTreeXMLDataContentHandler.java:86)
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetTransferData_fixture_29()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = DataFlavor.getTextPlainUnicodeFlavor();
		DataSource ds = new FileDataSource("");

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getTransferData(DataFlavor,DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testGetTransferData_fixture_30()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		DataFlavor df = DataFlavor.imageFlavor;
		DataSource ds = new FileDataSource("");

		Object result = fixture2.getTransferData(df, ds);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DataFlavor[] getTransferDataFlavors() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetTransferDataFlavors_fixture_1()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();

		DataFlavor[] result = fixture2.getTransferDataFlavors();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertNotNull(result[0]);
		assertEquals("application/xml; class=java.io.InputStream", result[0].getMimeType());
		assertEquals("application/xml", result[0].getHumanPresentableName());
		assertEquals(false, result[0].isMimeTypeSerializedObject());
		assertEquals("java.io.InputStream", result[0].getDefaultRepresentationClassAsString());
		assertEquals(true, result[0].isRepresentationClassInputStream());
		assertEquals(false, result[0].isRepresentationClassReader());
		assertEquals(false, result[0].isRepresentationClassCharBuffer());
		assertEquals(false, result[0].isRepresentationClassByteBuffer());
		assertEquals(false, result[0].isRepresentationClassSerializable());
		assertEquals(false, result[0].isRepresentationClassRemote());
		assertEquals(false, result[0].isFlavorSerializedObjectType());
		assertEquals(false, result[0].isFlavorRemoteObjectType());
		assertEquals(false, result[0].isFlavorJavaFileListType());
		assertEquals(false, result[0].isFlavorTextType());
		assertEquals("java.awt.datatransfer.DataFlavor[mimetype=application/xml;representationclass=java.io.InputStream]", result[0].toString());
		assertEquals("application", result[0].getPrimaryType());
		assertEquals("xml", result[0].getSubType());
		assertNotNull(result[1]);
		assertEquals("text/xml; class=java.io.InputStream", result[1].getMimeType());
		assertEquals("text/xml", result[1].getHumanPresentableName());
		assertEquals(false, result[1].isMimeTypeSerializedObject());
		assertEquals("java.io.InputStream", result[1].getDefaultRepresentationClassAsString());
		assertEquals(true, result[1].isRepresentationClassInputStream());
		assertEquals(false, result[1].isRepresentationClassReader());
		assertEquals(false, result[1].isRepresentationClassCharBuffer());
		assertEquals(false, result[1].isRepresentationClassByteBuffer());
		assertEquals(false, result[1].isRepresentationClassSerializable());
		assertEquals(false, result[1].isRepresentationClassRemote());
		assertEquals(false, result[1].isFlavorSerializedObjectType());
		assertEquals(false, result[1].isFlavorRemoteObjectType());
		assertEquals(false, result[1].isFlavorJavaFileListType());
		assertEquals(true, result[1].isFlavorTextType());
		assertEquals("java.awt.datatransfer.DataFlavor[mimetype=text/xml;representationclass=java.io.InputStream;charset=UTF-8]", result[1].toString());
		assertEquals("text", result[1].getPrimaryType());
		assertEquals("xml", result[1].getSubType());
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteTo_fixture_1()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		Object obj = new Element("", "");
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture2.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteTo_fixture_2()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		Object obj = new Element("0123456789", "0123456789");
		String mimeTypeString = "0123456789";
		OutputStream os = new ByteArrayOutputStream();

		fixture2.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteTo_fixture_3()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		Object obj = new ProcessingInstruction("", "");
		String mimeTypeString = "0123456789";
		OutputStream os = new ByteArrayOutputStream();

		fixture2.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteTo_fixture_4()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		Object obj = new ProcessingInstruction("0123456789", "0123456789");
		String mimeTypeString = "0123456789";
		OutputStream os = new ByteArrayOutputStream();

		fixture2.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteTo_fixture_5()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		Object obj = new Text("");
		String mimeTypeString = "0123456789";
		OutputStream os = new ByteArrayOutputStream();

		fixture2.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteTo_fixture_6()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		Object obj = new Element("0123456789", "0123456789");
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture2.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteTo_fixture_7()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		Object obj = new ProcessingInstruction("", "");
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture2.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteTo_fixture_8()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		Object obj = new ProcessingInstruction("0123456789", "0123456789");
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture2.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteTo_fixture_9()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		Object obj = new Text("");
		String mimeTypeString = "";
		OutputStream os = new ByteArrayOutputStream();

		fixture2.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Run the void writeTo(Object,String,OutputStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteTo_fixture_10()
		throws Exception {
		XTreeXMLDataContentHandler fixture2 = getFixture();
		Object obj = new Element("", "");
		String mimeTypeString = "0123456789";
		OutputStream os = new ByteArrayOutputStream();

		fixture2.writeTo(obj, mimeTypeString, os);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(XTreeXMLDataContentHandlerTest.class);
	}
}