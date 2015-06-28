package org.databene.jdbacl.identity.mem;

import java.sql.Connection;
import org.apache.derby.iapi.jdbc.BrokeredConnection30;
import org.apache.derby.iapi.jdbc.BrokeredConnection40;
import org.apache.derby.iapi.jdbc.BrokeredConnectionControl;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.identity.IdentityModel;
import org.databene.jdbacl.identity.IdentityProvider;
import org.databene.jdbacl.identity.KeyMapper;
import org.databene.jdbacl.identity.NaturalPkIdentity;
import org.databene.jdbacl.identity.NkPkQueryIdentity;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.DefaultDatabase;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractTableMapperTest</code> contains tests for the class <code>{@link AbstractTableMapper}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class AbstractTableMapperTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private AbstractTableMapper fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private AbstractTableMapper fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private AbstractTableMapper fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see AbstractTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private AbstractTableMapper fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public AbstractTableMapper getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new SourceTableMapper(new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf(""))), new BrokeredConnection30((BrokeredConnectionControl) null), "", new NaturalPkIdentity(""), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public AbstractTableMapper getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new SourceTableMapper(new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null)), new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new NkPkQueryIdentity("", ""), new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public AbstractTableMapper getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new TargetTableMapper(new MemKeyMapper(new BrokeredConnection30((BrokeredConnectionControl) null), "", new BrokeredConnection30((BrokeredConnectionControl) null), "", new IdentityProvider(), new DefaultDatabase("", "", VersionNumber.valueOf(""))), new BrokeredConnection30((BrokeredConnectionControl) null), "", new NaturalPkIdentity(""), new DefaultDatabase("", "", VersionNumber.valueOf("")));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see AbstractTableMapper
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public AbstractTableMapper getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new TargetTableMapper(new MemKeyMapper(new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", (IdentityProvider) null, new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null)), new BrokeredConnection40((BrokeredConnectionControl) null), "0123456789", new NkPkQueryIdentity("", ""), new DefaultDatabase("0123456789", "0123456789", (VersionNumber) null));
		}
		return fixture4;
	}

	/**
	 * Run the void assureInitialized() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAssureInitialized_fixture1_1()
		throws Exception {
		AbstractTableMapper fixture = getFixture1();

		fixture.assureInitialized();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
	}

	/**
	 * Run the void assureInitialized() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAssureInitialized_fixture2_1()
		throws Exception {
		AbstractTableMapper fixture = getFixture2();

		fixture.assureInitialized();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
	}

	/**
	 * Run the void assureInitialized() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAssureInitialized_fixture3_1()
		throws Exception {
		AbstractTableMapper fixture = getFixture3();

		fixture.assureInitialized();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
	}

	/**
	 * Run the void assureInitialized() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAssureInitialized_fixture4_1()
		throws Exception {
		AbstractTableMapper fixture = getFixture4();

		fixture.assureInitialized();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
	}

	/**
	 * Run the String getNaturalKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_1()
		throws Exception {
		AbstractTableMapper fixture = getFixture1();
		Object pk = new Object();

		String result = fixture.getNaturalKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_1()
		throws Exception {
		AbstractTableMapper fixture = getFixture2();
		Object pk = null;

		String result = fixture.getNaturalKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture3_1()
		throws Exception {
		AbstractTableMapper fixture = getFixture3();
		Object pk = null;

		String result = fixture.getNaturalKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture4_1()
		throws Exception {
		AbstractTableMapper fixture = getFixture4();
		Object pk = null;

		String result = fixture.getNaturalKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture2_2()
		throws Exception {
		AbstractTableMapper fixture = getFixture2();
		Object pk = new Object();

		String result = fixture.getNaturalKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture3_2()
		throws Exception {
		AbstractTableMapper fixture = getFixture3();
		Object pk = new Object();

		String result = fixture.getNaturalKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture4_2()
		throws Exception {
		AbstractTableMapper fixture = getFixture4();
		Object pk = new Object();

		String result = fixture.getNaturalKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.AssertionError: query
		//       at org.databene.commons.Assert.notEmpty(Assert.java:67)
		//       at org.databene.jdbacl.identity.IdentityModel.query(IdentityModel.java:103)
		//       at org.databene.jdbacl.identity.NkPkQueryIdentity.createNkPkIterator(NkPkQueryIdentity.java:55)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		assertNotNull(result);
	}

	/**
	 * Run the String getNaturalKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testGetNaturalKey_fixture1_2()
		throws Exception {
		AbstractTableMapper fixture = getFixture1();
		Object pk = null;

		String result = fixture.getNaturalKey(pk);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.databene.commons.ObjectNotFoundException: Table ''
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:200)
		//       at org.databene.jdbacl.model.DefaultDatabase.getTable(DefaultDatabase.java:191)
		//       at org.databene.jdbacl.identity.NaturalPkIdentity.createNkPkIterator(NaturalPkIdentity.java:46)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.populate(AbstractTableMapper.java:84)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.assureInitialized(AbstractTableMapper.java:96)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.getNaturalKey(AbstractTableMapper.java:75)
		assertNotNull(result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_1()
		throws Exception {
		AbstractTableMapper fixture = getFixture1();
		Object pk = new Object();
		String naturalKey = "";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_1()
		throws Exception {
		AbstractTableMapper fixture = getFixture2();
		Object pk = null;
		String naturalKey = "0123456789";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture4_1()
		throws Exception {
		AbstractTableMapper fixture = getFixture4();
		Object pk = new Object();
		String naturalKey = "0123456789";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_2()
		throws Exception {
		AbstractTableMapper fixture = getFixture1();
		Object pk = new Object();
		String naturalKey = "0123456789";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture3_1()
		throws Exception {
		AbstractTableMapper fixture = getFixture3();
		Object pk = new Object();
		String naturalKey = "";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture4_2()
		throws Exception {
		AbstractTableMapper fixture = getFixture4();
		Object pk = null;
		String naturalKey = "";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		assertNotNull(result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_3()
		throws Exception {
		AbstractTableMapper fixture = getFixture1();
		Object pk = null;
		String naturalKey = "";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture3_2()
		throws Exception {
		AbstractTableMapper fixture = getFixture3();
		Object pk = new Object();
		String naturalKey = "0123456789";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture4_3()
		throws Exception {
		AbstractTableMapper fixture = getFixture4();
		Object pk = null;
		String naturalKey = "0123456789";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		assertNotNull(result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture1_4()
		throws Exception {
		AbstractTableMapper fixture = getFixture1();
		Object pk = null;
		String naturalKey = "0123456789";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture3_3()
		throws Exception {
		AbstractTableMapper fixture = getFixture3();
		Object pk = null;
		String naturalKey = "";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		assertNotNull(result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_2()
		throws Exception {
		AbstractTableMapper fixture = getFixture2();
		Object pk = new Object();
		String naturalKey = "";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture3_4()
		throws Exception {
		AbstractTableMapper fixture = getFixture3();
		Object pk = null;
		String naturalKey = "0123456789";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
		//       at org.databene.jdbacl.identity.mem.TargetTableMapper.store(TargetTableMapper.java:49)
		assertNotNull(result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_3()
		throws Exception {
		AbstractTableMapper fixture = getFixture2();
		Object pk = new Object();
		String naturalKey = "0123456789";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture4_4()
		throws Exception {
		AbstractTableMapper fixture = getFixture4();
		Object pk = new Object();
		String naturalKey = "";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object store(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testStore_fixture2_4()
		throws Exception {
		AbstractTableMapper fixture = getFixture2();
		Object pk = null;
		String naturalKey = "";

		Object result = fixture.store(pk, naturalKey);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.databene.commons.bean.ObjectOrArray.hashCode(ObjectOrArray.java:45)
		//       at java.util.HashMap.hash(HashMap.java:362)
		//       at java.util.HashMap.put(HashMap.java:492)
		//       at org.databene.jdbacl.identity.mem.AbstractTableMapper.store(AbstractTableMapper.java:71)
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
		new org.junit.runner.JUnitCore().run(AbstractTableMapperTest.class);
	}
}