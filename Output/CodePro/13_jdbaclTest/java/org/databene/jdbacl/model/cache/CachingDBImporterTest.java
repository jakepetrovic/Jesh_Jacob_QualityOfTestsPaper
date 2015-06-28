package org.databene.jdbacl.model.cache;

import java.io.File;
import java.net.URI;
import java.sql.Connection;
import java.util.Properties;
import org.apache.derby.iapi.jdbc.BrokeredConnection30;
import org.apache.derby.iapi.jdbc.BrokeredConnection40;
import org.apache.derby.iapi.jdbc.BrokeredConnectionControl;
import org.apache.derby.impl.jdbc.EmbedConnection;
import org.apache.derby.impl.jdbc.EmbedConnection30;
import org.apache.derby.impl.jdbc.EmbedConnection40;
import org.apache.derby.jdbc.Driver169;
import org.apache.derby.jdbc.InternalDriver;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.DBMetaDataImporter;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.databene.jdbacl.model.xml.XMLModelImporter;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CachingDBImporterTest</code> contains tests for the class <code>{@link CachingDBImporter}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class CachingDBImporterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see CachingDBImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private CachingDBImporter fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see CachingDBImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private CachingDBImporter fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see CachingDBImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public CachingDBImporter getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new CachingDBImporter((DBMetaDataImporter) null, "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see CachingDBImporter
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public CachingDBImporter getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new CachingDBImporter((DBMetaDataImporter) null, "0123456789");
		}
		return fixture2;
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_1()
		throws Exception {
		DBMetaDataImporter realImporter = new CachingDBImporter((DBMetaDataImporter) null, "");
		String environment = "";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_2()
		throws Exception {
		DBMetaDataImporter realImporter = new CachingDBImporter((DBMetaDataImporter) null, "0123456789");
		String environment = "0123456789";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_3()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter("");
		String environment = "0123456789";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_4()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter("", "", "", "", "", "");
		String environment = "0123456789";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_5()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "");
		String environment = "0123456789";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_6()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789");
		String environment = "0123456789";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_7()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "0123456789");
		String environment = "0123456789";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_8()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		String environment = "0123456789";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_9()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter(new BrokeredConnection30((BrokeredConnectionControl) null), "", "");
		String environment = "0123456789";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_10()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", "0123456789");
		String environment = "0123456789";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_11()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", "An��t-1.0.txt");
		String environment = "0123456789";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_12()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter(new JDBCConnectData("", "", "", ""));
		String environment = "0123456789";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_13()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
		String environment = "0123456789";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_14()
		throws Exception {
		DBMetaDataImporter realImporter = new XMLModelImporter(File.createTempFile("", ""));
		String environment = "0123456789";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_15()
		throws Exception {
		DBMetaDataImporter realImporter = new CachingDBImporter((DBMetaDataImporter) null, "0123456789");
		String environment = "";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_16()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter("");
		String environment = "";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ConfigurationError: No environment definition '.env.properties' found
		//       at org.databene.jdbacl.DBUtil.getConnectData(DBUtil.java:122)
		//       at org.databene.jdbacl.model.jdbc.JDBCDBImporter.<init>(JDBCDBImporter.java:110)
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_17()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter("", "", "", "", "", "");
		String environment = "";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_18()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "");
		String environment = "";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_19()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter("0123456789", "0123456789", "0123456789", "0123456789", "0123456789", "0123456789");
		String environment = "";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_20()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "0123456789");
		String environment = "";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_21()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter("An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt", "An��t-1.0.txt");
		String environment = "";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_22()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter(new BrokeredConnection30((BrokeredConnectionControl) null), "", "");
		String environment = "";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_23()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", "0123456789");
		String environment = "";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_24()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", "An��t-1.0.txt");
		String environment = "";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_25()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter(new JDBCConnectData("", "", "", ""));
		String environment = "";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_26()
		throws Exception {
		DBMetaDataImporter realImporter = new JDBCDBImporter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
		String environment = "";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_27()
		throws Exception {
		DBMetaDataImporter realImporter = new XMLModelImporter(File.createTempFile("", ""));
		String environment = "";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the CachingDBImporter(DBMetaDataImporter,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testCachingDBImporter_28()
		throws Exception {
		DBMetaDataImporter realImporter = new CachingDBImporter((DBMetaDataImporter) null, "");
		String environment = "0123456789";

		CachingDBImporter result = new CachingDBImporter(realImporter, environment);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testClose_fixture1_1()
		throws Exception {
		CachingDBImporter fixture = getFixture1();

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testClose_fixture2_1()
		throws Exception {
		CachingDBImporter fixture = getFixture2();

		fixture.close();

		// add additional test code here
	}

	/**
	 * Run the File getCacheFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCacheFile_fixture1_1()
		throws Exception {
		CachingDBImporter fixture = getFixture1();

		File result = fixture.getCacheFile();

		// add additional test code here
		assertNotNull(result);
		assertEquals("/Users/Jesh/databene/cache/.meta.xml", result.toString());
		assertEquals(".meta.xml", result.getName());
		assertEquals(0L, result.length());
		assertEquals("/Users/Jesh/databene/cache", result.getParent());
		assertEquals(true, result.isAbsolute());
		assertEquals("/Users/Jesh/databene/cache/.meta.xml", result.getCanonicalPath());
		assertEquals(null, result.list());
		assertEquals(false, result.exists());
		assertEquals("/Users/Jesh/databene/cache/.meta.xml", result.getPath());
		assertEquals("/Users/Jesh/databene/cache/.meta.xml", result.getAbsolutePath());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(true, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
		assertEquals(false, result.canExecute());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getFreeSpace());
		assertEquals(0L, result.getUsableSpace());
	}

	/**
	 * Run the File getCacheFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCacheFile_fixture2_1()
		throws Exception {
		CachingDBImporter fixture = getFixture2();

		File result = fixture.getCacheFile();

		// add additional test code here
		assertNotNull(result);
		assertEquals("/Users/Jesh/databene/cache/0123456789.meta.xml", result.toString());
		assertEquals("0123456789.meta.xml", result.getName());
		assertEquals(0L, result.length());
		assertEquals("/Users/Jesh/databene/cache", result.getParent());
		assertEquals(true, result.isAbsolute());
		assertEquals("/Users/Jesh/databene/cache/0123456789.meta.xml", result.getCanonicalPath());
		assertEquals(null, result.list());
		assertEquals(false, result.exists());
		assertEquals("/Users/Jesh/databene/cache/0123456789.meta.xml", result.getPath());
		assertEquals("/Users/Jesh/databene/cache/0123456789.meta.xml", result.getAbsolutePath());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(false, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
		assertEquals(false, result.canExecute());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getFreeSpace());
		assertEquals(0L, result.getUsableSpace());
	}

	/**
	 * Run the File getCacheFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCacheFile_1()
		throws Exception {
		String environment = "";

		File result = CachingDBImporter.getCacheFile(environment);

		// add additional test code here
		assertNotNull(result);
		assertEquals("/Users/Jesh/databene/cache/.meta.xml", result.toString());
		assertEquals(".meta.xml", result.getName());
		assertEquals(0L, result.length());
		assertEquals("/Users/Jesh/databene/cache", result.getParent());
		assertEquals(true, result.isAbsolute());
		assertEquals("/Users/Jesh/databene/cache/.meta.xml", result.getCanonicalPath());
		assertEquals(null, result.list());
		assertEquals(false, result.exists());
		assertEquals("/Users/Jesh/databene/cache/.meta.xml", result.getPath());
		assertEquals("/Users/Jesh/databene/cache/.meta.xml", result.getAbsolutePath());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(true, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
		assertEquals(false, result.canExecute());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getFreeSpace());
		assertEquals(0L, result.getUsableSpace());
	}

	/**
	 * Run the File getCacheFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetCacheFile_2()
		throws Exception {
		String environment = "0123456789";

		File result = CachingDBImporter.getCacheFile(environment);

		// add additional test code here
		assertNotNull(result);
		assertEquals("/Users/Jesh/databene/cache/0123456789.meta.xml", result.toString());
		assertEquals("0123456789.meta.xml", result.getName());
		assertEquals(0L, result.length());
		assertEquals("/Users/Jesh/databene/cache", result.getParent());
		assertEquals(true, result.isAbsolute());
		assertEquals("/Users/Jesh/databene/cache/0123456789.meta.xml", result.getCanonicalPath());
		assertEquals(null, result.list());
		assertEquals(false, result.exists());
		assertEquals("/Users/Jesh/databene/cache/0123456789.meta.xml", result.getPath());
		assertEquals("/Users/Jesh/databene/cache/0123456789.meta.xml", result.getAbsolutePath());
		assertEquals(false, result.canRead());
		assertEquals(false, result.canWrite());
		assertEquals(false, result.isDirectory());
		assertEquals(false, result.isFile());
		assertEquals(false, result.isHidden());
		assertEquals(0L, result.lastModified());
		assertEquals(null, result.listFiles());
		assertEquals(false, result.canExecute());
		assertEquals(0L, result.getTotalSpace());
		assertEquals(0L, result.getFreeSpace());
		assertEquals(0L, result.getUsableSpace());
	}

	/**
	 * Run the Database importDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportDatabase_fixture1_1()
		throws Exception {
		CachingDBImporter fixture = getFixture1();

		Database result = fixture.importDatabase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importDatabase(CachingDBImporter.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Database importDatabase() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportDatabase_fixture2_1()
		throws Exception {
		CachingDBImporter fixture = getFixture2();

		Database result = fixture.importDatabase();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importDatabase(CachingDBImporter.java:69)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture1_1()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File file = File.createTempFile("", "");

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture2_1()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File file = File.createTempFile("", "", (File) null);

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture1_2()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File file = File.createTempFile("0123456789", "0123456789");

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture2_2()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File file = File.createTempFile("0123456789", "0123456789", (File) null);

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture1_3()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File file = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture2_3()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File file = new File("");

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture1_4()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File file = new File("", "");

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture2_4()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File file = new File("0123456789", "0123456789");

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture1_5()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File file = new File(URI.create(""));

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture2_5()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File file = new File((File) null, "");

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture1_6()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File file = new File((File) null, "0123456789");

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture1_7()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File file = File.createTempFile("", "", (File) null);

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture2_6()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File file = File.createTempFile("0123456789", "0123456789");

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture1_8()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File file = File.createTempFile("0123456789", "0123456789", (File) null);

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture2_7()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File file = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture1_9()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File file = new File("");

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture2_8()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File file = new File("", "");

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture1_10()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File file = new File("0123456789", "0123456789");

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture2_9()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File file = new File(URI.create(""));

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture1_11()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File file = new File((File) null, "");

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture2_10()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File file = new File((File) null, "0123456789");

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the Database importFreshData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testImportFreshData_fixture2_11()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File file = File.createTempFile("", "");

		Database result = fixture.importFreshData(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture1_1()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File cacheFile = File.createTempFile("", "");

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture2_1()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File cacheFile = File.createTempFile("", "", (File) null);

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture1_2()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File cacheFile = File.createTempFile("0123456789", "0123456789");

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture2_2()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File cacheFile = File.createTempFile("0123456789", "0123456789", (File) null);

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture1_3()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File cacheFile = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture2_3()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File cacheFile = new File("");

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture1_4()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File cacheFile = new File("", "");

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture2_4()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File cacheFile = new File("0123456789", "0123456789");

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture1_5()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File cacheFile = new File(URI.create(""));

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture2_5()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File cacheFile = new File((File) null, "");

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture1_6()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File cacheFile = new File((File) null, "0123456789");

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture1_7()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File cacheFile = File.createTempFile("", "", (File) null);

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture2_6()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File cacheFile = File.createTempFile("0123456789", "0123456789");

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture1_8()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File cacheFile = File.createTempFile("0123456789", "0123456789", (File) null);

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture2_7()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File cacheFile = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture1_9()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File cacheFile = new File("");

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture2_8()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File cacheFile = new File("", "");

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture1_10()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File cacheFile = new File("0123456789", "0123456789");

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture2_9()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File cacheFile = new File(URI.create(""));

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture1_11()
		throws Exception {
		CachingDBImporter fixture = getFixture1();
		File cacheFile = new File((File) null, "");

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture2_10()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File cacheFile = new File((File) null, "0123456789");

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.importFreshData(CachingDBImporter.java:100)
		//       at org.databene.jdbacl.model.cache.CachingDBImporter.readCachedData(CachingDBImporter.java:95)
		assertNotNull(result);
	}

	/**
	 * Run the Database readCachedData(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testReadCachedData_fixture2_11()
		throws Exception {
		CachingDBImporter fixture = getFixture2();
		File cacheFile = File.createTempFile("", "");

		Database result = fixture.readCachedData(cacheFile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CachingDBImporterTest.class);
	}
}