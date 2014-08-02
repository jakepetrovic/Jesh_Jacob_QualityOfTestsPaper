package com.sap.netweaver.porta.core.nw7;

import java.io.File;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.NotAuthorizedException;

/**
 * The class <code>FileUploaderImplTest</code> contains tests for the class <code>{@link FileUploaderImpl}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:10 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class FileUploaderImplTest {
	/**
	 * Run the FileUploaderImpl(String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testFileUploaderImpl_1()
		throws Exception {
		String host = "";
		int port = 1;

		FileUploaderImpl result = new FileUploaderImpl(host, port);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/core/nw7/FileUploaderImpl : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the void setCredentials(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testSetCredentials_1()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		String user = "";
		String password = "";

		fixture.setCredentials(user, password);

		// add additional test code here
	}

	/**
	 * Run the String[] upload(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testUpload_1()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		File[] archives = new File[] {new File("")};

		String[] result = fixture.upload(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] upload(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testUpload_2()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		File[] archives = new File[] {};

		String[] result = fixture.upload(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] upload(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testUpload_3()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		File[] archives = new File[] {};

		String[] result = fixture.upload(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] upload(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testUpload_4()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		File[] archives = new File[] {};

		String[] result = fixture.upload(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] upload(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testUpload_5()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		File[] archives = new File[] {};

		String[] result = fixture.upload(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] upload(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testUpload_6()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		File[] archives = new File[] {};

		String[] result = fixture.upload(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] upload(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testUpload_7()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		File[] archives = new File[] {};

		String[] result = fixture.upload(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] upload(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testUpload_8()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		File[] archives = new File[] {};

		String[] result = fixture.upload(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] upload(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testUpload_9()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		File[] archives = new File[] {new File("")};

		String[] result = fixture.upload(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] upload(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testUpload_10()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		File[] archives = new File[] {};

		String[] result = fixture.upload(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] upload(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testUpload_11()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		File[] archives = new File[] {};

		String[] result = fixture.upload(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] upload(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testUpload_12()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		File[] archives = new File[] {};

		String[] result = fixture.upload(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] upload(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test
	public void testUpload_13()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		File[] archives = new File[] {};

		String[] result = fixture.upload(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] upload(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testUpload_14()
		throws Exception {
		FileUploaderImpl fixture = new FileUploaderImpl("", 1);
		File[] archives = new File[] {};

		String[] result = fixture.upload(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:10 AM
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
	 * @generatedBy CodePro at 4/8/14 11:10 AM
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
	 * @generatedBy CodePro at 4/8/14 11:10 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FileUploaderImplTest.class);
	}
}