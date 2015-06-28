package ch.bluepenguin.email.client.tapestry.helpers;

import org.apache.tapestry.contrib.tree.model.IMutableTreeNode;
import ch.bluepenguin.email.client.Folder;
import org.apache.tapestry.contrib.tree.simple.TreeNode;
import junit.framework.*;

/**
 * The class <code>FolderTreeNodeTest</code> contains tests for the class <code>{@link FolderTreeNode}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class FolderTreeNodeTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see FolderTreeNode
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private FolderTreeNode fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see FolderTreeNode
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private FolderTreeNode fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see FolderTreeNode
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private FolderTreeNode fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see FolderTreeNode
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public FolderTreeNode getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new FolderTreeNode(new Folder());
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see FolderTreeNode
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public FolderTreeNode getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new FolderTreeNode(new Folder(), (IMutableTreeNode) null);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see FolderTreeNode
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public FolderTreeNode getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new FolderTreeNode((Folder) null, (IMutableTreeNode) null);
		}
		return fixture3;
	}

	/**
	 * Run the FolderTreeNode(Folder) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testFolderTreeNode_1()
		throws Exception {
		Folder strValue = new Folder();

		FolderTreeNode result = new FolderTreeNode(strValue);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getParent());
		assertEquals(true, result.isLeaf());
		assertEquals(true, result.getAllowsChildren());
		assertEquals(0, result.getChildCount());
	}

	/**
	 * Run the FolderTreeNode(Folder,IMutableTreeNode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testFolderTreeNode_2()
		throws Exception {
		Folder strValue = null;
		IMutableTreeNode parent = new FolderTreeNode(new Folder());

		FolderTreeNode result = new FolderTreeNode(strValue, parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getFolder());
		assertEquals(true, result.isLeaf());
		assertEquals(true, result.getAllowsChildren());
		assertEquals(0, result.getChildCount());
	}

	/**
	 * Run the FolderTreeNode(Folder,IMutableTreeNode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testFolderTreeNode_3()
		throws Exception {
		Folder strValue = null;
		IMutableTreeNode parent = new FolderTreeNode(new Folder(), (IMutableTreeNode) null);

		FolderTreeNode result = new FolderTreeNode(strValue, parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getFolder());
		assertEquals(true, result.isLeaf());
		assertEquals(true, result.getAllowsChildren());
		assertEquals(0, result.getChildCount());
	}

	/**
	 * Run the FolderTreeNode(Folder,IMutableTreeNode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testFolderTreeNode_4()
		throws Exception {
		Folder strValue = null;
		IMutableTreeNode parent = new FolderTreeNode((Folder) null, (IMutableTreeNode) null);

		FolderTreeNode result = new FolderTreeNode(strValue, parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getFolder());
		assertEquals(true, result.isLeaf());
		assertEquals(true, result.getAllowsChildren());
		assertEquals(0, result.getChildCount());
	}

	/**
	 * Run the FolderTreeNode(Folder,IMutableTreeNode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testFolderTreeNode_5()
		throws Exception {
		Folder strValue = null;
		IMutableTreeNode parent = new TreeNode();

		FolderTreeNode result = new FolderTreeNode(strValue, parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getFolder());
		assertEquals(true, result.isLeaf());
		assertEquals(true, result.getAllowsChildren());
		assertEquals(0, result.getChildCount());
	}

	/**
	 * Run the FolderTreeNode(Folder,IMutableTreeNode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testFolderTreeNode_6()
		throws Exception {
		Folder strValue = null;
		IMutableTreeNode parent = new TreeNode((IMutableTreeNode) null);

		FolderTreeNode result = new FolderTreeNode(strValue, parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getFolder());
		assertEquals(true, result.isLeaf());
		assertEquals(true, result.getAllowsChildren());
		assertEquals(0, result.getChildCount());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture1_1()
		throws Exception {
		FolderTreeNode fixture = getFixture1();
		Object objTarget = new FolderTreeNode(new Folder());

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture2_1()
		throws Exception {
		FolderTreeNode fixture = getFixture2();
		Object objTarget = new FolderTreeNode(new Folder(), (IMutableTreeNode) null);

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture3_1()
		throws Exception {
		FolderTreeNode fixture = getFixture3();
		Object objTarget = new FolderTreeNode((Folder) null, (IMutableTreeNode) null);

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.tapestry.helpers.FolderTreeNode.equals(FolderTreeNode.java:72)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture1_2()
		throws Exception {
		FolderTreeNode fixture = getFixture1();
		Object objTarget = new FolderTreeNode(new Folder());

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture2_2()
		throws Exception {
		FolderTreeNode fixture = getFixture2();
		Object objTarget = new FolderTreeNode(new Folder(), (IMutableTreeNode) null);

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture3_2()
		throws Exception {
		FolderTreeNode fixture = getFixture3();
		Object objTarget = new FolderTreeNode((Folder) null, (IMutableTreeNode) null);

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.tapestry.helpers.FolderTreeNode.equals(FolderTreeNode.java:72)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture2_3()
		throws Exception {
		FolderTreeNode fixture = getFixture2();
		Object objTarget = new FolderTreeNode(new Folder());

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture3_3()
		throws Exception {
		FolderTreeNode fixture = getFixture3();
		Object objTarget = new FolderTreeNode(new Folder(), (IMutableTreeNode) null);

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.tapestry.helpers.FolderTreeNode.equals(FolderTreeNode.java:72)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture1_3()
		throws Exception {
		FolderTreeNode fixture = getFixture1();
		Object objTarget = new FolderTreeNode((Folder) null, (IMutableTreeNode) null);

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture2_4()
		throws Exception {
		FolderTreeNode fixture = getFixture2();
		Object objTarget = new FolderTreeNode(new Folder());

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture3_4()
		throws Exception {
		FolderTreeNode fixture = getFixture3();
		Object objTarget = new FolderTreeNode(new Folder(), (IMutableTreeNode) null);

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.tapestry.helpers.FolderTreeNode.equals(FolderTreeNode.java:72)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture1_4()
		throws Exception {
		FolderTreeNode fixture = getFixture1();
		Object objTarget = new FolderTreeNode((Folder) null, (IMutableTreeNode) null);

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture3_5()
		throws Exception {
		FolderTreeNode fixture = getFixture3();
		Object objTarget = new FolderTreeNode(new Folder());

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.tapestry.helpers.FolderTreeNode.equals(FolderTreeNode.java:72)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture1_5()
		throws Exception {
		FolderTreeNode fixture = getFixture1();
		Object objTarget = new FolderTreeNode(new Folder(), (IMutableTreeNode) null);

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture2_5()
		throws Exception {
		FolderTreeNode fixture = getFixture2();
		Object objTarget = new FolderTreeNode((Folder) null, (IMutableTreeNode) null);

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture3_6()
		throws Exception {
		FolderTreeNode fixture = getFixture3();
		Object objTarget = new FolderTreeNode(new Folder());

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.tapestry.helpers.FolderTreeNode.equals(FolderTreeNode.java:72)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture1_6()
		throws Exception {
		FolderTreeNode fixture = getFixture1();
		Object objTarget = new FolderTreeNode(new Folder(), (IMutableTreeNode) null);

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testEquals_fixture2_6()
		throws Exception {
		FolderTreeNode fixture = getFixture2();
		Object objTarget = new FolderTreeNode((Folder) null, (IMutableTreeNode) null);

		boolean result = fixture.equals(objTarget);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Folder getFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetFolder_fixture1_1()
		throws Exception {
		FolderTreeNode fixture = getFixture1();

		Folder result = fixture.getFolder();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFullName());
		assertEquals(null, result.getName());
		assertEquals(null, result.getParent());
		assertEquals(null, result.getAccount());
		assertEquals(null, result.getParentFolderId());
	}

	/**
	 * Run the Folder getFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetFolder_fixture2_1()
		throws Exception {
		FolderTreeNode fixture = getFixture2();

		Folder result = fixture.getFolder();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFullName());
		assertEquals(null, result.getName());
		assertEquals(null, result.getParent());
		assertEquals(null, result.getAccount());
		assertEquals(null, result.getParentFolderId());
	}

	/**
	 * Run the Folder getFolder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetFolder_fixture3_1()
		throws Exception {
		FolderTreeNode fixture = getFixture3();

		Folder result = fixture.getFolder();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHashCode_fixture1_1()
		throws Exception {
		FolderTreeNode fixture = getFixture1();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(69469833, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHashCode_fixture2_1()
		throws Exception {
		FolderTreeNode fixture = getFixture2();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(376872941, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHashCode_fixture3_1()
		throws Exception {
		FolderTreeNode fixture = getFixture3();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the void setFolder(Folder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetFolder_fixture1_1()
		throws Exception {
		FolderTreeNode fixture = getFixture1();
		Folder strValue = new Folder();

		fixture.setFolder(strValue);

		// add additional test code here
	}

	/**
	 * Run the void setFolder(Folder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetFolder_fixture2_1()
		throws Exception {
		FolderTreeNode fixture = getFixture2();
		Folder strValue = new Folder();

		fixture.setFolder(strValue);

		// add additional test code here
	}

	/**
	 * Run the void setFolder(Folder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testSetFolder_fixture3_1()
		throws Exception {
		FolderTreeNode fixture = getFixture3();
		Folder strValue = new Folder();

		fixture.setFolder(strValue);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture1_1()
		throws Exception {
		FolderTreeNode fixture = getFixture1();

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.tapestry.helpers.FolderTreeNode.toString(FolderTreeNode.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture2_1()
		throws Exception {
		FolderTreeNode fixture = getFixture2();

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.tapestry.helpers.FolderTreeNode.toString(FolderTreeNode.java:52)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testToString_fixture3_1()
		throws Exception {
		FolderTreeNode fixture = getFixture3();

		String result = fixture.toString();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
		// Add additional tear down code here
	}
}