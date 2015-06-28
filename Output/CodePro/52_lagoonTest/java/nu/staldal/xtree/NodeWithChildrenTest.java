package nu.staldal.xtree;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>NodeWithChildrenTest</code> contains tests for the class <code>{@link NodeWithChildren}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class NodeWithChildrenTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private NodeWithChildren fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private NodeWithChildren fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private NodeWithChildren fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private NodeWithChildren fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private NodeWithChildren fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private NodeWithChildren fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private NodeWithChildren fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private NodeWithChildren fixture8;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public NodeWithChildren getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new Element("", "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public NodeWithChildren getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new Element("", "");
			fixture2.addChild(new Element("", ""));
			fixture2.addChild(new Element("", ""));
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public NodeWithChildren getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new Element("", "");
			fixture3.addChild(new Element("", ""));
			fixture3.addChild(new Element("0123456789", "0123456789"));
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public NodeWithChildren getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new Element("", "");
			fixture4.addChild(new Element("", ""));
			fixture4.addChild(new ProcessingInstruction("", ""));
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public NodeWithChildren getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new Element("0123456789", "0123456789");
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public NodeWithChildren getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new Element("0123456789", "0123456789");
			fixture6.addChild(new Element("", ""));
			fixture6.addChild(new Element("", ""));
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public NodeWithChildren getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new Element("0123456789", "0123456789");
			fixture7.addChild(new Element("", ""));
			fixture7.addChild(new Element("0123456789", "0123456789"));
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NodeWithChildren
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public NodeWithChildren getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new Element("0123456789", "0123456789");
			fixture8.addChild(new Element("", ""));
			fixture8.addChild(new ProcessingInstruction("", ""));
		}
		return fixture8;
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture1_1()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		Node newChild = new Element("", "");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture2_1()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		Node newChild = new Element("0123456789", "0123456789");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture3_1()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		Node newChild = new ProcessingInstruction("", "");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture4_1()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture5_1()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		Node newChild = new Text("");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture6_1()
		throws Exception {
		NodeWithChildren fixture = getFixture6();
		Node newChild = new Text("");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture7_1()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		Node newChild = new Text("");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture8_1()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		Node newChild = new Text("");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture2_2()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		Node newChild = new Element("", "");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture3_2()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		Node newChild = new Element("0123456789", "0123456789");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture4_2()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		Node newChild = new ProcessingInstruction("", "");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture5_2()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture6_2()
		throws Exception {
		NodeWithChildren fixture = getFixture6();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture7_2()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture8_2()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture1_2()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		Node newChild = new Text("");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture3_3()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		Node newChild = new Element("", "");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture4_3()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		Node newChild = new Element("0123456789", "0123456789");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture5_3()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		Node newChild = new ProcessingInstruction("", "");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture6_3()
		throws Exception {
		NodeWithChildren fixture = getFixture6();
		Node newChild = new ProcessingInstruction("", "");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture7_3()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		Node newChild = new ProcessingInstruction("", "");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture8_3()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		Node newChild = new ProcessingInstruction("", "");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture1_3()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture2_3()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		Node newChild = new Text("");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture4_4()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		Node newChild = new Element("", "");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture5_4()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		Node newChild = new Element("0123456789", "0123456789");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture6_4()
		throws Exception {
		NodeWithChildren fixture = getFixture6();
		Node newChild = new Element("0123456789", "0123456789");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture7_4()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		Node newChild = new Element("0123456789", "0123456789");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture8_4()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		Node newChild = new Element("0123456789", "0123456789");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the void addChild(Node) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testAddChild_fixture1_4()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		Node newChild = new ProcessingInstruction("", "");

		fixture.addChild(newChild);

		// add additional test code here
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetChild_fixture2_1()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		int index = 1;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetChild_fixture2_2()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		int index = 0;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetChild_fixture3_1()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		int index = 1;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetChild_fixture4_1()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		int index = 1;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetChild_fixture6_1()
		throws Exception {
		NodeWithChildren fixture = getFixture6();
		int index = 1;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetChild_fixture7_1()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		int index = 1;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetChild_fixture8_1()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		int index = 1;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetChild_fixture3_2()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		int index = 0;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetChild_fixture4_2()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		int index = 0;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetChild_fixture6_2()
		throws Exception {
		NodeWithChildren fixture = getFixture6();
		int index = 0;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetChild_fixture7_2()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		int index = 0;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testGetChild_fixture8_2()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		int index = 0;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetChild_fixture1_1()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		int index = 0;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetChild_fixture3_3()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		int index = 7;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetChild_fixture4_3()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		int index = 7;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetChild_fixture5_1()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		int index = 7;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetChild_fixture6_3()
		throws Exception {
		NodeWithChildren fixture = getFixture6();
		int index = 7;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetChild_fixture7_3()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		int index = 7;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetChild_fixture8_3()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		int index = 7;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetChild_fixture5_2()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		int index = 1;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetChild_fixture1_2()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		int index = 7;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetChild_fixture5_3()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		int index = 0;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetChild_fixture1_3()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		int index = 1;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node getChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testGetChild_fixture2_3()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		int index = 7;

		Node result = fixture.getChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture1_1()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		Node newChild = new Element("", "");
		int index = 0;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture2_1()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		Node newChild = new Element("0123456789", "0123456789");
		int index = 1;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture2_2()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");
		int index = 0;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture3_1()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		Node newChild = new Text("");
		int index = 1;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture6_1()
		throws Exception {
		NodeWithChildren fixture = getFixture6();
		Node newChild = new Element("0123456789", "0123456789");
		int index = 1;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture7_1()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		Node newChild = new ProcessingInstruction("", "");
		int index = 1;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture8_1()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");
		int index = 1;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture4_1()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		Node newChild = new Element("0123456789", "0123456789");
		int index = 0;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture5_1()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		Node newChild = new ProcessingInstruction("", "");
		int index = 0;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture6_2()
		throws Exception {
		NodeWithChildren fixture = getFixture6();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");
		int index = 0;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture7_2()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		Node newChild = new Text("");
		int index = 0;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture2_3()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		Node newChild = new Element("", "");
		int index = 1;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture4_2()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");
		int index = 0;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture5_2()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		Node newChild = new Text("");
		int index = 0;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture7_3()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		Node newChild = new Element("", "");
		int index = 0;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture8_2()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		Node newChild = new Element("0123456789", "0123456789");
		int index = 0;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture1_2()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		Node newChild = new ProcessingInstruction("", "");
		int index = 0;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture2_4()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		Node newChild = new ProcessingInstruction("", "");
		int index = 0;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInsertChild_fixture3_2()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");
		int index = 1;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testInsertChild_fixture3_3()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		Node newChild = new ProcessingInstruction("", "");
		int index = 7;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testInsertChild_fixture4_3()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");
		int index = 7;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testInsertChild_fixture5_3()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		Node newChild = new Text("");
		int index = 7;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testInsertChild_fixture7_4()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		Node newChild = new Element("", "");
		int index = 7;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testInsertChild_fixture8_3()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		Node newChild = new Element("0123456789", "0123456789");
		int index = 7;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testInsertChild_fixture1_3()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		Node newChild = new Element("0123456789", "0123456789");
		int index = 7;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testInsertChild_fixture5_4()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		Node newChild = new Element("", "");
		int index = 1;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testInsertChild_fixture1_4()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");
		int index = 1;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testInsertChild_fixture2_5()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		Node newChild = new Text("");
		int index = 7;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testInsertChild_fixture1_5()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		Node newChild = new Element("", "");
		int index = 1;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the void insertChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testInsertChild_fixture3_4()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		Node newChild = new Element("0123456789", "0123456789");
		int index = 7;

		fixture.insertChild(newChild, index);

		// add additional test code here
	}

	/**
	 * Run the int numberOfChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfChildren_fixture1_1()
		throws Exception {
		NodeWithChildren fixture = getFixture1();

		int result = fixture.numberOfChildren();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfChildren_fixture2_1()
		throws Exception {
		NodeWithChildren fixture = getFixture2();

		int result = fixture.numberOfChildren();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int numberOfChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfChildren_fixture3_1()
		throws Exception {
		NodeWithChildren fixture = getFixture3();

		int result = fixture.numberOfChildren();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int numberOfChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfChildren_fixture4_1()
		throws Exception {
		NodeWithChildren fixture = getFixture4();

		int result = fixture.numberOfChildren();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int numberOfChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfChildren_fixture5_1()
		throws Exception {
		NodeWithChildren fixture = getFixture5();

		int result = fixture.numberOfChildren();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int numberOfChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfChildren_fixture6_1()
		throws Exception {
		NodeWithChildren fixture = getFixture6();

		int result = fixture.numberOfChildren();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int numberOfChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfChildren_fixture7_1()
		throws Exception {
		NodeWithChildren fixture = getFixture7();

		int result = fixture.numberOfChildren();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int numberOfChildren() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testNumberOfChildren_fixture8_1()
		throws Exception {
		NodeWithChildren fixture = getFixture8();

		int result = fixture.numberOfChildren();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testRemoveChild_fixture2_1()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		int index = 1;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testRemoveChild_fixture2_2()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		int index = 0;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testRemoveChild_fixture3_1()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		int index = 1;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testRemoveChild_fixture4_1()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		int index = 1;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testRemoveChild_fixture6_1()
		throws Exception {
		NodeWithChildren fixture = getFixture6();
		int index = 1;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testRemoveChild_fixture7_1()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		int index = 1;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testRemoveChild_fixture8_1()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		int index = 1;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testRemoveChild_fixture3_2()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		int index = 0;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testRemoveChild_fixture4_2()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		int index = 0;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testRemoveChild_fixture6_2()
		throws Exception {
		NodeWithChildren fixture = getFixture6();
		int index = 0;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testRemoveChild_fixture7_2()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		int index = 0;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testRemoveChild_fixture8_2()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		int index = 0;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveChild_fixture1_1()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		int index = 0;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveChild_fixture3_3()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		int index = 7;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveChild_fixture4_3()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		int index = 7;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveChild_fixture5_1()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		int index = 7;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveChild_fixture6_3()
		throws Exception {
		NodeWithChildren fixture = getFixture6();
		int index = 7;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveChild_fixture7_3()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		int index = 7;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveChild_fixture8_3()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		int index = 7;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveChild_fixture5_2()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		int index = 1;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveChild_fixture1_2()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		int index = 7;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveChild_fixture5_3()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		int index = 0;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveChild_fixture1_3()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		int index = 1;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node removeChild(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testRemoveChild_fixture2_3()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		int index = 7;

		Node result = fixture.removeChild(index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture2_1()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		Node newChild = new Element("0123456789", "0123456789");
		int index = 1;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture2_2()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");
		int index = 0;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture3_1()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		Node newChild = new Text("");
		int index = 1;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture6_1()
		throws Exception {
		NodeWithChildren fixture = getFixture6();
		Node newChild = new Element("0123456789", "0123456789");
		int index = 1;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture7_1()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		Node newChild = new ProcessingInstruction("", "");
		int index = 1;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture8_1()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");
		int index = 1;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture4_1()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		Node newChild = new Element("0123456789", "0123456789");
		int index = 0;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture6_2()
		throws Exception {
		NodeWithChildren fixture = getFixture6();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");
		int index = 0;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture7_2()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		Node newChild = new Text("");
		int index = 0;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture2_3()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		Node newChild = new Element("", "");
		int index = 1;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture4_2()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");
		int index = 0;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture7_3()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		Node newChild = new Element("", "");
		int index = 0;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture8_2()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		Node newChild = new Element("0123456789", "0123456789");
		int index = 0;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture2_4()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		Node newChild = new ProcessingInstruction("", "");
		int index = 0;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testReplaceChild_fixture3_2()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");
		int index = 1;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBaseURI());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals(null, result.getParent());
		assertEquals(-1, result.getLineNumber());
		assertEquals(-1, result.getColumnNumber());
		assertEquals(false, result.isWhitespaceNode());
		assertEquals(false, result.getPreserveSpace());
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture1_1()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		Node newChild = new Element("", "");
		int index = 0;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture3_3()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		Node newChild = new ProcessingInstruction("", "");
		int index = 7;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture4_3()
		throws Exception {
		NodeWithChildren fixture = getFixture4();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");
		int index = 7;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture5_1()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		Node newChild = new Text("");
		int index = 7;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture7_4()
		throws Exception {
		NodeWithChildren fixture = getFixture7();
		Node newChild = new Element("", "");
		int index = 7;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture8_3()
		throws Exception {
		NodeWithChildren fixture = getFixture8();
		Node newChild = new Element("0123456789", "0123456789");
		int index = 7;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture1_2()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		Node newChild = new Element("0123456789", "0123456789");
		int index = 7;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture5_2()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		Node newChild = new Element("", "");
		int index = 1;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture1_3()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		Node newChild = new ProcessingInstruction("0123456789", "0123456789");
		int index = 1;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture2_5()
		throws Exception {
		NodeWithChildren fixture = getFixture2();
		Node newChild = new Text("");
		int index = 7;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture5_3()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		Node newChild = new ProcessingInstruction("", "");
		int index = 0;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture1_4()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		Node newChild = new Element("", "");
		int index = 1;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture3_4()
		throws Exception {
		NodeWithChildren fixture = getFixture3();
		Node newChild = new Element("0123456789", "0123456789");
		int index = 7;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture5_4()
		throws Exception {
		NodeWithChildren fixture = getFixture5();
		Node newChild = new Text("");
		int index = 0;

		Node result = fixture.replaceChild(newChild, index);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Node replaceChild(Node,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testReplaceChild_fixture1_5()
		throws Exception {
		NodeWithChildren fixture = getFixture1();
		Node newChild = new ProcessingInstruction("", "");
		int index = 0;

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
		new org.junit.runner.JUnitCore().run(NodeWithChildrenTest.class);
	}
}