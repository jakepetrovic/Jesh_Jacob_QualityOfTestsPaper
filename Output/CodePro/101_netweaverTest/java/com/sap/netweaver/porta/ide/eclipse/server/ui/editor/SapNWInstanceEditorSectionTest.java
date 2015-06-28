package com.sap.netweaver.porta.ide.eclipse.server.ui.editor;

import org.eclipse.core.internal.filesystem.NullFileSystem;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.internal.ui.views.launch.SourceNotFoundEditor;
import org.eclipse.debug.internal.ui.views.launch.SourceNotFoundEditorInput;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.internal.EditorAreaHelper;
import org.eclipse.ui.internal.EditorManager;
import org.eclipse.ui.internal.EditorReference;
import org.eclipse.ui.internal.EditorSite;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.WorkbenchWindow;
import org.eclipse.ui.internal.part.NullEditorInput;
import org.eclipse.ui.internal.registry.EditorDescriptor;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SapNWInstanceEditorSectionTest</code> contains tests for the class <code>{@link SapNWInstanceEditorSection}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:30 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SapNWInstanceEditorSectionTest {
	/**
	 * Run the SapNWInstanceEditorSection() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:30 AM
	 */
	@Test
	public void testSapNWInstanceEditorSection_1()
		throws Exception {

		SapNWInstanceEditorSection result = new SapNWInstanceEditorSection();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/ide/eclipse/server/ui/editor/SapNWInstanceEditorSection : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the void createSection(Composite) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:30 AM
	 */
	@Test
	public void testCreateSection_1()
		throws Exception {
		SapNWInstanceEditorSection fixture = new SapNWInstanceEditorSection();
		Composite parent = new Composite(new Composite((Composite) null, 0), 1);

		fixture.createSection(parent);

		// add additional test code here
	}

	/**
	 * Run the void createSection(Composite) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:30 AM
	 */
	@Test
	public void testCreateSection_2()
		throws Exception {
		SapNWInstanceEditorSection fixture = new SapNWInstanceEditorSection();
		Composite parent = new Composite(new Composite((Composite) null, 0), 1);

		fixture.createSection(parent);

		// add additional test code here
	}

	/**
	 * Run the void createSection(Composite) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:30 AM
	 */
	@Test
	public void testCreateSection_3()
		throws Exception {
		SapNWInstanceEditorSection fixture = new SapNWInstanceEditorSection();
		Composite parent = new Composite(new Composite((Composite) null, 0), 1);

		fixture.createSection(parent);

		// add additional test code here
	}

	/**
	 * Run the void init(IEditorSite,IEditorInput) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:30 AM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		SapNWInstanceEditorSection fixture = new SapNWInstanceEditorSection();
		IEditorSite site = new EditorSite(new EditorReference(new EditorManager((WorkbenchWindow) null, new WorkbenchPage((WorkbenchWindow) null, "", NullFileSystem.getInstance()), new EditorAreaHelper(new WorkbenchPage((WorkbenchWindow) null, "", NullFileSystem.getInstance()))), new SourceNotFoundEditorInput((IStackFrame) null), EditorDescriptor.createForProgram("")), new SourceNotFoundEditor(), new WorkbenchPage((WorkbenchWindow) null, "", NullFileSystem.getInstance()), EditorDescriptor.createForProgram(""));
		IEditorInput input = new NullEditorInput();

		fixture.init(site, input);

		// add additional test code here
	}

	/**
	 * Run the void init(IEditorSite,IEditorInput) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:30 AM
	 */
	@Test
	public void testInit_2()
		throws Exception {
		SapNWInstanceEditorSection fixture = new SapNWInstanceEditorSection();
		IEditorSite site = new EditorSite(new EditorReference(new EditorManager((WorkbenchWindow) null, new WorkbenchPage((WorkbenchWindow) null, "", NullFileSystem.getInstance()), new EditorAreaHelper(new WorkbenchPage((WorkbenchWindow) null, "", NullFileSystem.getInstance()))), new SourceNotFoundEditorInput((IStackFrame) null), EditorDescriptor.createForProgram("")), new SourceNotFoundEditor(), new WorkbenchPage((WorkbenchWindow) null, "", NullFileSystem.getInstance()), EditorDescriptor.createForProgram(""));
		IEditorInput input = new NullEditorInput();

		fixture.init(site, input);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:30 AM
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
	 * @generatedBy CodePro at 4/8/14 11:30 AM
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
	 * @generatedBy CodePro at 4/8/14 11:30 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SapNWInstanceEditorSectionTest.class);
	}
}