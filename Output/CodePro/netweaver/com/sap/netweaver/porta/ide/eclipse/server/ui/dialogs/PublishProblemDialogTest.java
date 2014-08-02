package com.sap.netweaver.porta.ide.eclipse.server.ui.dialogs;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.internal.MessageLine;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.DeployResult;
import com.sap.netweaver.porta.core.DeployResultStatus;
import com.sap.netweaver.porta.core.nw7.DeployResultImpl;
import com.sap.netweaver.porta.ide.eclipse.server.control.PublishException;

/**
 * The class <code>PublishProblemDialogTest</code> contains tests for the class <code>{@link PublishProblemDialog}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:38 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class PublishProblemDialogTest {
	/**
	 * Run the PublishProblemDialog(Shell,PublishException) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:38 AM
	 */
	@Test
	public void testPublishProblemDialog_1()
		throws Exception {
		Shell parentShell = new Shell();
		PublishException exception = new PublishException(new DeployResultImpl(DeployResultStatus.ERROR, ""));

		PublishProblemDialog result = new PublishProblemDialog(parentShell, exception);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/ide/eclipse/server/ui/dialogs/PublishProblemDialog : Unsupported major.minor version 51.0
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
	 * Run the void buttonPressed(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:38 AM
	 */
	@Test
	public void testButtonPressed_1()
		throws Exception {
		PublishProblemDialog fixture = new PublishProblemDialog(new Shell(), new PublishException(new DeployResultImpl(DeployResultStatus.ERROR, "")));
		fixture.buttonBar = new MessageLine((Composite) null);
		int buttonId = 1;

		fixture.buttonPressed(buttonId);

		// add additional test code here
	}

	/**
	 * Run the void buttonPressed(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:38 AM
	 */
	@Test
	public void testButtonPressed_2()
		throws Exception {
		PublishProblemDialog fixture = new PublishProblemDialog(new Shell(), new PublishException(new DeployResultImpl(DeployResultStatus.ERROR, "")));
		fixture.buttonBar = new MessageLine((Composite) null);
		int buttonId = 0;

		fixture.buttonPressed(buttonId);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:38 AM
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
	 * @generatedBy CodePro at 4/8/14 10:38 AM
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
	 * @generatedBy CodePro at 4/8/14 10:38 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PublishProblemDialogTest.class);
	}
}