package net.sourceforge.schemaspy.model.xml;

import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Node;

/**
 * The class <code>TableColumnMetaTest</code> contains tests for the class <code>{@link TableColumnMeta}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:20 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TableColumnMetaTest {
	/**
	 * Run the TableColumnMeta(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testTableColumnMeta_1()
		throws Exception {
		Node colNode = new IIOMetadataNode("");

		TableColumnMeta result = new TableColumnMeta(colNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.model.xml.TableColumnMeta.<init>(TableColumnMeta.java:57)
		assertNotNull(result);
	}

	/**
	 * Run the TableColumnMeta(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	@Test
	public void testTableColumnMeta_2()
		throws Exception {
		Node colNode = new IIOMetadataNode();

		TableColumnMeta result = new TableColumnMeta(colNode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sourceforge.schemaspy.model.xml.TableColumnMeta.<init>(TableColumnMeta.java:57)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:20 PM
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
	 * @generatedBy CodePro at 6/7/15 4:20 PM
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
	 * @generatedBy CodePro at 6/7/15 4:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TableColumnMetaTest.class);
	}
}