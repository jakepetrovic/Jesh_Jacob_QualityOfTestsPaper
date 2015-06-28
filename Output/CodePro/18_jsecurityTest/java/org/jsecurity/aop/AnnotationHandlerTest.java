package org.jsecurity.aop;

import java.lang.annotation.Annotation;
import org.jsecurity.authz.aop.AuthenticatedAnnotationHandler;
import org.jsecurity.subject.Subject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AnnotationHandlerTest</code> contains tests for the class <code>{@link AnnotationHandler}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:10 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AnnotationHandlerTest {
	/**
	 * Run the Class<? extends Annotation> getAnnotationClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetAnnotationClass_1()
		throws Exception {
		AuthenticatedAnnotationHandler fixture = new AuthenticatedAnnotationHandler();
		fixture.annotationClass = Annotation.class;

		Class<? extends Annotation> result = fixture.getAnnotationClass();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Subject getSubject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetSubject_1()
		throws Exception {
		AuthenticatedAnnotationHandler fixture = new AuthenticatedAnnotationHandler();
		fixture.annotationClass = Annotation.class;

		Subject result = fixture.getSubject();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setAnnotationClass(Class<? extends Annotation>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetAnnotationClass_1()
		throws Exception {
		AuthenticatedAnnotationHandler fixture = new AuthenticatedAnnotationHandler();
		fixture.annotationClass = Annotation.class;
		Class<? extends Annotation> annotationClass = Annotation.class;

		fixture.setAnnotationClass(annotationClass);

		// add additional test code here
	}

	/**
	 * Run the void setAnnotationClass(Class<? extends Annotation>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetAnnotationClass_2()
		throws Exception {
		AuthenticatedAnnotationHandler fixture = new AuthenticatedAnnotationHandler();
		fixture.annotationClass = Annotation.class;
		Class<? extends Annotation> annotationClass = Annotation.class;

		fixture.setAnnotationClass(annotationClass);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AnnotationHandlerTest.class);
	}
}