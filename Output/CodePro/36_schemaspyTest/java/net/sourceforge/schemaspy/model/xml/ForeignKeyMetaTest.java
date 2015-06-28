package net.sourceforge.schemaspy.model.xml;

import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Node;

/**
 * The class <code>ForeignKeyMetaTest</code> contains tests for the class <code>{@link ForeignKeyMeta}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ForeignKeyMetaTest {
	/**
	 * Run the ForeignKeyMeta(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testForeignKeyMeta_1()
		throws Exception {
		Node foreignKeyNode = new IIOMetadataNode("");

		ForeignKeyMeta result = new ForeignKeyMeta(foreignKeyNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: XML foreignKey definition requires 'table' attribute
		//       at net.sourceforge.schemaspy.model.xml.ForeignKeyMeta.<init>(ForeignKeyMeta.java:42)
		assertNotNull(result);
	}

	/**
	 * Run the ForeignKeyMeta(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testForeignKeyMeta_2()
		throws Exception {
		Node foreignKeyNode = new IIOMetadataNode();

		ForeignKeyMeta result = new ForeignKeyMeta(foreignKeyNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: XML foreignKey definition requires 'table' attribute
		//       at net.sourceforge.schemaspy.model.xml.ForeignKeyMeta.<init>(ForeignKeyMeta.java:42)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
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
	 * @generatedBy CodePro at 6/7/15 4:19 PM
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
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ForeignKeyMetaTest.class);
	}
}