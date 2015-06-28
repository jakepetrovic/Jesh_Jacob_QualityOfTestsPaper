package net.sourceforge.schemaspy.model.xml;

import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Node;

/**
 * The class <code>TableMetaTest</code> contains tests for the class <code>{@link TableMeta}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TableMetaTest {
	/**
	 * Run the TableMeta(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testTableMeta_1()
		throws Exception {
		Node tableNode = new IIOMetadataNode("");

		TableMeta result = new TableMeta(tableNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.model.xml.TableMeta.<init>(TableMeta.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the TableMeta(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testTableMeta_2()
		throws Exception {
		Node tableNode = new IIOMetadataNode();

		TableMeta result = new TableMeta(tableNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.model.xml.TableMeta.<init>(TableMeta.java:46)
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
		new org.junit.runner.JUnitCore().run(TableMetaTest.class);
	}
}