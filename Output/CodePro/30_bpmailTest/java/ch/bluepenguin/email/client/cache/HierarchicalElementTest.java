package ch.bluepenguin.email.client.cache;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import junit.framework.*;

/**
 * The class <code>HierarchicalElementTest</code> contains tests for the class <code>{@link HierarchicalElement}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class HierarchicalElementTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see HierarchicalElement
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private HierarchicalElement fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see HierarchicalElement
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private HierarchicalElement fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see HierarchicalElement
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private HierarchicalElement fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see HierarchicalElement
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public HierarchicalElement getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new HierarchicalElement(Boolean.FALSE, Boolean.FALSE, new ArrayList());
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see HierarchicalElement
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public HierarchicalElement getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new HierarchicalElement(Boolean.TRUE, Boolean.TRUE, new LinkedList());
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see HierarchicalElement
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public HierarchicalElement getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new HierarchicalElement(Boolean.TYPE, Boolean.TYPE, new Vector());
		}
		return fixture3;
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_1()
		throws Exception {
		Serializable parentKey = Boolean.FALSE;
		Serializable parentObject = Boolean.FALSE;
		List childKeys = new ArrayList();

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = false, value=false, version=1, hitCount=0, CreationTime = 1433711503410, LastAccessTime = 0 ]", result.toString());
		assertEquals(Boolean.FALSE, result.getValue());
		assertEquals(Boolean.FALSE, result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(404L, result.getSerializedSize());
		assertEquals(1433711503410L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_2()
		throws Exception {
		Serializable parentKey = Boolean.TRUE;
		Serializable parentObject = Boolean.TRUE;
		List childKeys = new LinkedList();

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = true, value=true, version=1, hitCount=0, CreationTime = 1433711503411, LastAccessTime = 0 ]", result.toString());
		assertEquals(Boolean.TRUE, result.getValue());
		assertEquals(Boolean.TRUE, result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(394L, result.getSerializedSize());
		assertEquals(1433711503411L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_3()
		throws Exception {
		Serializable parentKey = Boolean.TYPE;
		Serializable parentObject = Boolean.TYPE;
		List childKeys = new Vector();

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = boolean, value=boolean, version=1, hitCount=0, CreationTime = 1433711503411, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(494L, result.getSerializedSize());
		assertEquals(1433711503411L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_4()
		throws Exception {
		Serializable parentKey = Byte.TYPE;
		Serializable parentObject = Byte.TYPE;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = byte, value=byte, version=1, hitCount=0, CreationTime = 1433711503412, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(329L, result.getSerializedSize());
		assertEquals(1433711503412L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_5()
		throws Exception {
		Serializable parentKey = Character.TYPE;
		Serializable parentObject = Character.TYPE;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = char, value=char, version=1, hitCount=0, CreationTime = 1433711503413, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(329L, result.getSerializedSize());
		assertEquals(1433711503413L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_6()
		throws Exception {
		Serializable parentKey = Double.TYPE;
		Serializable parentObject = Double.TYPE;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = double, value=double, version=1, hitCount=0, CreationTime = 1433711503414, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(331L, result.getSerializedSize());
		assertEquals(1433711503414L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_7()
		throws Exception {
		Serializable parentKey = Float.TYPE;
		Serializable parentObject = Float.TYPE;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = float, value=float, version=1, hitCount=0, CreationTime = 1433711503415, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(330L, result.getSerializedSize());
		assertEquals(1433711503415L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_8()
		throws Exception {
		Serializable parentKey = Integer.TYPE;
		Serializable parentObject = Integer.TYPE;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = int, value=int, version=1, hitCount=0, CreationTime = 1433711503416, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(328L, result.getSerializedSize());
		assertEquals(1433711503416L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_9()
		throws Exception {
		Serializable parentKey = Long.TYPE;
		Serializable parentObject = Long.TYPE;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = long, value=long, version=1, hitCount=0, CreationTime = 1433711503417, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(329L, result.getSerializedSize());
		assertEquals(1433711503417L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_10()
		throws Exception {
		Serializable parentKey = Short.TYPE;
		Serializable parentObject = Short.TYPE;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = short, value=short, version=1, hitCount=0, CreationTime = 1433711503418, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(330L, result.getSerializedSize());
		assertEquals(1433711503418L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_11()
		throws Exception {
		Serializable parentKey = BorderLayout.AFTER_LAST_LINE;
		Serializable parentObject = BorderLayout.AFTER_LAST_LINE;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = Last, value=Last, version=1, hitCount=0, CreationTime = 1433711503419, LastAccessTime = 0 ]", result.toString());
		assertEquals("Last", result.getValue());
		assertEquals("Last", result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(315L, result.getSerializedSize());
		assertEquals(1433711503419L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_12()
		throws Exception {
		Serializable parentKey = BorderLayout.AFTER_LINE_ENDS;
		Serializable parentObject = BorderLayout.AFTER_LINE_ENDS;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = After, value=After, version=1, hitCount=0, CreationTime = 1433711503420, LastAccessTime = 0 ]", result.toString());
		assertEquals("After", result.getValue());
		assertEquals("After", result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(316L, result.getSerializedSize());
		assertEquals(1433711503420L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_13()
		throws Exception {
		Serializable parentKey = BorderLayout.BEFORE_FIRST_LINE;
		Serializable parentObject = BorderLayout.BEFORE_FIRST_LINE;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = First, value=First, version=1, hitCount=0, CreationTime = 1433711503420, LastAccessTime = 0 ]", result.toString());
		assertEquals("First", result.getValue());
		assertEquals("First", result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(316L, result.getSerializedSize());
		assertEquals(1433711503420L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_14()
		throws Exception {
		Serializable parentKey = BorderLayout.BEFORE_LINE_BEGINS;
		Serializable parentObject = BorderLayout.BEFORE_LINE_BEGINS;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = Before, value=Before, version=1, hitCount=0, CreationTime = 1433711503422, LastAccessTime = 0 ]", result.toString());
		assertEquals("Before", result.getValue());
		assertEquals("Before", result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(317L, result.getSerializedSize());
		assertEquals(1433711503422L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_15()
		throws Exception {
		Serializable parentKey = BorderLayout.CENTER;
		Serializable parentObject = BorderLayout.CENTER;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = Center, value=Center, version=1, hitCount=0, CreationTime = 1433711503423, LastAccessTime = 0 ]", result.toString());
		assertEquals("Center", result.getValue());
		assertEquals("Center", result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(317L, result.getSerializedSize());
		assertEquals(1433711503423L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_16()
		throws Exception {
		Serializable parentKey = BorderLayout.EAST;
		Serializable parentObject = BorderLayout.EAST;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = East, value=East, version=1, hitCount=0, CreationTime = 1433711503424, LastAccessTime = 0 ]", result.toString());
		assertEquals("East", result.getValue());
		assertEquals("East", result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(315L, result.getSerializedSize());
		assertEquals(1433711503424L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_17()
		throws Exception {
		Serializable parentKey = BorderLayout.LINE_END;
		Serializable parentObject = BorderLayout.LINE_END;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = After, value=After, version=1, hitCount=0, CreationTime = 1433711503424, LastAccessTime = 0 ]", result.toString());
		assertEquals("After", result.getValue());
		assertEquals("After", result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(316L, result.getSerializedSize());
		assertEquals(1433711503424L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_18()
		throws Exception {
		Serializable parentKey = BorderLayout.LINE_START;
		Serializable parentObject = BorderLayout.LINE_START;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = Before, value=Before, version=1, hitCount=0, CreationTime = 1433711503425, LastAccessTime = 0 ]", result.toString());
		assertEquals("Before", result.getValue());
		assertEquals("Before", result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(317L, result.getSerializedSize());
		assertEquals(1433711503425L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_19()
		throws Exception {
		Serializable parentKey = BorderLayout.NORTH;
		Serializable parentObject = BorderLayout.NORTH;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = North, value=North, version=1, hitCount=0, CreationTime = 1433711503425, LastAccessTime = 0 ]", result.toString());
		assertEquals("North", result.getValue());
		assertEquals("North", result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(316L, result.getSerializedSize());
		assertEquals(1433711503425L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_20()
		throws Exception {
		Serializable parentKey = BorderLayout.PAGE_END;
		Serializable parentObject = BorderLayout.PAGE_END;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = Last, value=Last, version=1, hitCount=0, CreationTime = 1433711503426, LastAccessTime = 0 ]", result.toString());
		assertEquals("Last", result.getValue());
		assertEquals("Last", result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(315L, result.getSerializedSize());
		assertEquals(1433711503426L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_21()
		throws Exception {
		Serializable parentKey = BorderLayout.PAGE_START;
		Serializable parentObject = BorderLayout.PAGE_START;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = First, value=First, version=1, hitCount=0, CreationTime = 1433711503426, LastAccessTime = 0 ]", result.toString());
		assertEquals("First", result.getValue());
		assertEquals("First", result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(316L, result.getSerializedSize());
		assertEquals(1433711503426L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_22()
		throws Exception {
		Serializable parentKey = BorderLayout.SOUTH;
		Serializable parentObject = BorderLayout.SOUTH;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = South, value=South, version=1, hitCount=0, CreationTime = 1433711503426, LastAccessTime = 0 ]", result.toString());
		assertEquals("South", result.getValue());
		assertEquals("South", result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(316L, result.getSerializedSize());
		assertEquals(1433711503426L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_23()
		throws Exception {
		Serializable parentKey = BorderLayout.WEST;
		Serializable parentObject = BorderLayout.WEST;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = West, value=West, version=1, hitCount=0, CreationTime = 1433711503427, LastAccessTime = 0 ]", result.toString());
		assertEquals("West", result.getValue());
		assertEquals("West", result.getKey());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(315L, result.getSerializedSize());
		assertEquals(1433711503427L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_24()
		throws Exception {
		Serializable parentKey = Color.BLACK;
		Serializable parentObject = Color.BLACK;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = java.awt.Color[r=0,g=0,b=0], value=java.awt.Color[r=0,g=0,b=0], version=1, hitCount=0, CreationTime = 1433711503433, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(433L, result.getSerializedSize());
		assertEquals(1433711503433L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_25()
		throws Exception {
		Serializable parentKey = Color.BLUE;
		Serializable parentObject = Color.BLUE;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = java.awt.Color[r=0,g=0,b=255], value=java.awt.Color[r=0,g=0,b=255], version=1, hitCount=0, CreationTime = 1433711503436, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(433L, result.getSerializedSize());
		assertEquals(1433711503436L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_26()
		throws Exception {
		Serializable parentKey = Color.CYAN;
		Serializable parentObject = Color.CYAN;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = java.awt.Color[r=0,g=255,b=255], value=java.awt.Color[r=0,g=255,b=255], version=1, hitCount=0, CreationTime = 1433711503436, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(433L, result.getSerializedSize());
		assertEquals(1433711503436L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_27()
		throws Exception {
		Serializable parentKey = Color.DARK_GRAY;
		Serializable parentObject = Color.DARK_GRAY;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = java.awt.Color[r=64,g=64,b=64], value=java.awt.Color[r=64,g=64,b=64], version=1, hitCount=0, CreationTime = 1433711503437, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(433L, result.getSerializedSize());
		assertEquals(1433711503437L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_28()
		throws Exception {
		Serializable parentKey = Color.GRAY;
		Serializable parentObject = Color.GRAY;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = java.awt.Color[r=128,g=128,b=128], value=java.awt.Color[r=128,g=128,b=128], version=1, hitCount=0, CreationTime = 1433711503438, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(433L, result.getSerializedSize());
		assertEquals(1433711503438L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_29()
		throws Exception {
		Serializable parentKey = Color.GREEN;
		Serializable parentObject = Color.GREEN;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = java.awt.Color[r=0,g=255,b=0], value=java.awt.Color[r=0,g=255,b=0], version=1, hitCount=0, CreationTime = 1433711503438, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(433L, result.getSerializedSize());
		assertEquals(1433711503438L, result.getCreationTime());
	}

	/**
	 * Run the HierarchicalElement(Serializable,Serializable,List) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testHierarchicalElement_30()
		throws Exception {
		Serializable parentKey = Color.LIGHT_GRAY;
		Serializable parentObject = Color.LIGHT_GRAY;
		List childKeys = null;

		HierarchicalElement result = new HierarchicalElement(parentKey, parentObject, childKeys);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getChildKeys());
		assertEquals(1L, result.getVersion());
		assertEquals("[ key = java.awt.Color[r=192,g=192,b=192], value=java.awt.Color[r=192,g=192,b=192], version=1, hitCount=0, CreationTime = 1433711503439, LastAccessTime = 0 ]", result.toString());
		assertEquals(0L, result.getHitCount());
		assertEquals(0L, result.getLastAccessTime());
		assertEquals(433L, result.getSerializedSize());
		assertEquals(1433711503439L, result.getCreationTime());
	}

	/**
	 * Run the List getChildKeys() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetChildKeys_fixture1_1()
		throws Exception {
		HierarchicalElement fixture = getFixture1();

		List result = fixture.getChildKeys();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List getChildKeys() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetChildKeys_fixture2_1()
		throws Exception {
		HierarchicalElement fixture = getFixture2();

		List result = fixture.getChildKeys();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List getChildKeys() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetChildKeys_fixture3_1()
		throws Exception {
		HierarchicalElement fixture = getFixture3();

		List result = fixture.getChildKeys();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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