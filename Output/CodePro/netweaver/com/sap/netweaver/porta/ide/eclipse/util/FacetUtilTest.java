package com.sap.netweaver.porta.ide.eclipse.util;

import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.eclipse.wst.common.project.facet.core.IProjectFacetVersion;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FacetUtilTest</code> contains tests for the class <code>{@link FacetUtil}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:40 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class FacetUtilTest {
	/**
	 * Run the FacetUtil() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testFacetUtil_1()
		throws Exception {
		FacetUtil result = new FacetUtil();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the IProjectFacetVersion getProjectFacet(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testGetProjectFacet_1()
		throws Exception {
		String facetName = "";
		String version = "";

		IProjectFacetVersion result = FacetUtil.getProjectFacet(facetName, version);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasProjectFacet(IFacetedProject,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testHasProjectFacet_1()
		throws Exception {
		IFacetedProject project = null;
		String facetName = "";
		String version = "";

		boolean result = FacetUtil.hasProjectFacet(project, facetName, version);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasProjectFacet(IFacetedProject,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testHasProjectFacet_2()
		throws Exception {
		IFacetedProject project = null;
		String facetName = "";
		String version = "";

		boolean result = FacetUtil.hasProjectFacet(project, facetName, version);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
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
	 * @generatedBy CodePro at 4/8/14 10:40 AM
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
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FacetUtilTest.class);
	}
}