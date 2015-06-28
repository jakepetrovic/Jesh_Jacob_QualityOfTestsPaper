package org.databene.jdbacl.identity;

import java.sql.Connection;
import java.util.Properties;
import org.apache.derby.iapi.jdbc.BrokeredConnection30;
import org.apache.derby.iapi.jdbc.BrokeredConnection40;
import org.apache.derby.iapi.jdbc.BrokeredConnectionControl;
import org.apache.derby.impl.jdbc.EmbedConnection;
import org.apache.derby.impl.jdbc.EmbedConnection30;
import org.apache.derby.impl.jdbc.EmbedConnection40;
import org.apache.derby.jdbc.Driver169;
import org.apache.derby.jdbc.Driver30;
import org.apache.derby.jdbc.Driver40;
import org.apache.derby.jdbc.InternalDriver;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.identity.mem.MemKeyMapper;
import org.databene.jdbacl.model.DBRow;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.DefaultDatabase;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SimpleTranscoderTest</code> contains tests for the class <code>{@link SimpleTranscoder}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SimpleTranscoderTest {
	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_1()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = new Object();
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: No identity defined for table ''
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:44)
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:38)
		//       at org.databene.jdbacl.identity.SimpleTranscoder.transcode(SimpleTranscoder.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_2()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = new Object();
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: No identity defined for table ''
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:44)
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:38)
		//       at org.databene.jdbacl.identity.SimpleTranscoder.transcode(SimpleTranscoder.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_3()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = new Object();
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_4()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = new Object();
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_5()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = new Object();
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_6()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = new Object();
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_7()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = new Object();
		String sourceDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: No identity defined for table ''
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:44)
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:38)
		//       at org.databene.jdbacl.identity.SimpleTranscoder.transcode(SimpleTranscoder.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_8()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = new Object();
		String sourceDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: No identity defined for table ''
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:44)
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:38)
		//       at org.databene.jdbacl.identity.SimpleTranscoder.transcode(SimpleTranscoder.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_9()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = new Object();
		String sourceDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_10()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = new Object();
		String sourceDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_11()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = new Object();
		String sourceDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_12()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = new Object();
		String sourceDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_13()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = null;
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: No identity defined for table ''
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:44)
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:38)
		//       at org.databene.jdbacl.identity.SimpleTranscoder.transcode(SimpleTranscoder.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_14()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = null;
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: No identity defined for table ''
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:44)
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:38)
		//       at org.databene.jdbacl.identity.SimpleTranscoder.transcode(SimpleTranscoder.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_15()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = null;
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_16()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = null;
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_17()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = null;
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_18()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = null;
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_19()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = null;
		String sourceDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: No identity defined for table ''
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:44)
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:38)
		//       at org.databene.jdbacl.identity.SimpleTranscoder.transcode(SimpleTranscoder.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_20()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = null;
		String sourceDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: No identity defined for table ''
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:44)
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:38)
		//       at org.databene.jdbacl.identity.SimpleTranscoder.transcode(SimpleTranscoder.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_21()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = null;
		String sourceDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_22()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = null;
		String sourceDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_23()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = null;
		String sourceDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_24()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "";
		Object newPK = null;
		String sourceDbId = "0123456789";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_25()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "0123456789";
		Object newPK = new Object();
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf("")));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: No identity defined for table ''
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:44)
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:38)
		//       at org.databene.jdbacl.identity.SimpleTranscoder.transcode(SimpleTranscoder.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_26()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "0123456789";
		Object newPK = new Object();
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: No identity defined for table ''
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:44)
		//       at org.databene.jdbacl.identity.IdentityProvider.getIdentity(IdentityProvider.java:38)
		//       at org.databene.jdbacl.identity.SimpleTranscoder.transcode(SimpleTranscoder.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_27()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "0123456789";
		Object newPK = new Object();
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), "An��t-1.0.txt", new EmbedConnection30(new EmbedConnection40(new Driver169(), "", new Properties())), (String) null, new IdentityProvider(), new DefaultDatabase("An��t-1.0.txt", "An��t-1.0.txt", (VersionNumber) null));

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_28()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "0123456789";
		Object newPK = new Object();
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver169(), "", new Properties()), (String) null, new EmbedConnection30(new Driver30(), "0123456789", new Properties((Properties) null)), "", (IdentityProvider) null, (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_29()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "0123456789";
		Object newPK = new Object();
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "", new EmbedConnection30(new Driver40(), "An��t-1.0.txt", (Properties) null), "An��t-1.0.txt", new IdentityProvider(), (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver20.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver30.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver40.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the DBRow transcode(DBRow,String,Object,String,IdentityProvider,KeyMapper) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testTranscode_30()
		throws Exception {
		DBRow row = new DBRow(new DefaultDBTable(""));
		String nk = "0123456789";
		Object newPK = new Object();
		String sourceDbId = "";
		IdentityProvider identityProvider = new IdentityProvider();
		KeyMapper mapper = new MemKeyMapper(new EmbedConnection40(new Driver169(), "", new Properties()), "0123456789", new EmbedConnection40(new Driver169(), "", new Properties()), (String) null, new IdentityProvider(), (Database) null);

		DBRow result = SimpleTranscoder.transcode(row, nk, newPK, sourceDbId, identityProvider, mapper);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.apache.derby.iapi.error.ShutdownException: 
		//       at org.apache.derby.iapi.services.context.ContextService.getFactory(Unknown Source)
		//       at org.apache.derby.jdbc.InternalDriver.<init>(Unknown Source)
		//       at org.apache.derby.jdbc.Driver169.<init>(Unknown Source)
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
		new org.junit.runner.JUnitCore().run(SimpleTranscoderTest.class);
	}
}