package nu.staldal.xtree;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>NodeWithChildrenTest</code> contains tests for the class <code>{@link NodeWithChildren}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class NodeWithChildrenTest {
	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testAddChild_1()
		throws Exception {
		Element fixture = new Element("", "");
		fixture.addChild(new Text(""));
		fixture.parent = new Element("", "");
		Node newChild = new Text("");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testGetChild_1()
		throws Exception {
		Element fixture = new Element("", "");
		fixture.addChild(new Text(""));
		fixture.parent = new Element("", "");
		int index = 1;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInsertChild_1()
		throws Exception {
		Element fixture = new Element("", "");
		fixture.addChild(new Text(""));
		fixture.parent = new Element("", "");
		Node newChild = new Text("");
		int index = 1;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the int numberOfChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testNumberOfChildren_1()
		throws Exception {
		Element fixture = new Element("", "");
		fixture.addChild(new Text(""));
		fixture.parent = new Element("", "");

		int result = fixture.numberOfChildren();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testRemoveChild_1()
		throws Exception {
		Element fixture = new Element("", "");
		fixture.addChild(new Text(""));
		fixture.parent = new Element("", "");
		int index = 1;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testReplaceChild_1()
		throws Exception {
		Element fixture = new Element("", "");
		fixture.addChild(new Text(""));
		fixture.parent = new Element("", "");
		Node newChild = new Text("");
		int index = 1;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(NodeWithChildrenTest.class);
	}
}