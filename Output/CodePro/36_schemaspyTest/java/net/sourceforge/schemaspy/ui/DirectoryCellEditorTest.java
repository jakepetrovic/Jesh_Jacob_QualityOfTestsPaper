package net.sourceforge.schemaspy.ui;

import java.awt.Component;
import java.io.File;
import java.net.URI;
import javax.swing.JTable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DirectoryCellEditorTest</code> contains tests for the class <code>{@link DirectoryCellEditor}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DirectoryCellEditorTest {
	/**
	 * Run the DirectoryCellEditor(DbConfigTableModel,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDirectoryCellEditor_1()
		throws Exception {
		DbConfigTableModel model = new DbConfigTableModel();
		File startingDir = File.createTempFile("", "");

		DirectoryCellEditor result = new DirectoryCellEditor(model, startingDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		//       at java.io.File.createTempFile(File.java:2047)
		assertNotNull(result);
	}

	/**
	 * Run the DirectoryCellEditor(DbConfigTableModel,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDirectoryCellEditor_2()
		throws Exception {
		DbConfigTableModel model = new DbConfigTableModel();
		File startingDir = File.createTempFile("", "", (File) null);

		DirectoryCellEditor result = new DirectoryCellEditor(model, startingDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Prefix string too short
		//       at java.io.File.createTempFile(File.java:1978)
		assertNotNull(result);
	}

	/**
	 * Run the DirectoryCellEditor(DbConfigTableModel,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDirectoryCellEditor_3()
		throws Exception {
		DbConfigTableModel model = new DbConfigTableModel();
		File startingDir = File.createTempFile("0123456789", "0123456789");

		DirectoryCellEditor result = new DirectoryCellEditor(model, startingDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.canWrite(File.java:785)
		//       at com.apple.laf.AquaFileChooserUI$2.propertyChange(AquaFileChooserUI.java:390)
		//       at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:263)
		//       at java.awt.Component.firePropertyChange(Component.java:8393)
		//       at javax.swing.JFileChooser.setCurrentDirectory(JFileChooser.java:581)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:344)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:326)
		//       at net.sourceforge.schemaspy.ui.DirectoryCellEditor.<init>(DirectoryCellEditor.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the DirectoryCellEditor(DbConfigTableModel,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDirectoryCellEditor_4()
		throws Exception {
		DbConfigTableModel model = new DbConfigTableModel();
		File startingDir = File.createTempFile("0123456789", "0123456789", (File) null);

		DirectoryCellEditor result = new DirectoryCellEditor(model, startingDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.canWrite(File.java:785)
		//       at com.apple.laf.AquaFileChooserUI$2.propertyChange(AquaFileChooserUI.java:390)
		//       at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:263)
		//       at java.awt.Component.firePropertyChange(Component.java:8393)
		//       at javax.swing.JFileChooser.setCurrentDirectory(JFileChooser.java:581)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:344)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:326)
		//       at net.sourceforge.schemaspy.ui.DirectoryCellEditor.<init>(DirectoryCellEditor.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the DirectoryCellEditor(DbConfigTableModel,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDirectoryCellEditor_5()
		throws Exception {
		DbConfigTableModel model = new DbConfigTableModel();
		File startingDir = File.createTempFile("An��t-1.0.txt", "An��t-1.0.txt", (File) null);

		DirectoryCellEditor result = new DirectoryCellEditor(model, startingDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.canWrite(File.java:785)
		//       at com.apple.laf.AquaFileChooserUI$2.propertyChange(AquaFileChooserUI.java:390)
		//       at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:263)
		//       at java.awt.Component.firePropertyChange(Component.java:8393)
		//       at javax.swing.JFileChooser.setCurrentDirectory(JFileChooser.java:581)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:344)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:326)
		//       at net.sourceforge.schemaspy.ui.DirectoryCellEditor.<init>(DirectoryCellEditor.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the DirectoryCellEditor(DbConfigTableModel,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDirectoryCellEditor_6()
		throws Exception {
		DbConfigTableModel model = new DbConfigTableModel();
		File startingDir = new File("");

		DirectoryCellEditor result = new DirectoryCellEditor(model, startingDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.canWrite(File.java:785)
		//       at sun.awt.shell.ShellFolder.canWrite(ShellFolder.java:364)
		//       at com.apple.laf.AquaFileChooserUI$2.propertyChange(AquaFileChooserUI.java:390)
		//       at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:263)
		//       at java.awt.Component.firePropertyChange(Component.java:8393)
		//       at javax.swing.JFileChooser.setCurrentDirectory(JFileChooser.java:581)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:344)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:326)
		//       at net.sourceforge.schemaspy.ui.DirectoryCellEditor.<init>(DirectoryCellEditor.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the DirectoryCellEditor(DbConfigTableModel,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDirectoryCellEditor_7()
		throws Exception {
		DbConfigTableModel model = new DbConfigTableModel();
		File startingDir = new File("", "");

		DirectoryCellEditor result = new DirectoryCellEditor(model, startingDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.canWrite(File.java:785)
		//       at com.apple.laf.AquaFileChooserUI$2.propertyChange(AquaFileChooserUI.java:390)
		//       at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:263)
		//       at java.awt.Component.firePropertyChange(Component.java:8393)
		//       at javax.swing.JFileChooser.setCurrentDirectory(JFileChooser.java:581)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:344)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:326)
		//       at net.sourceforge.schemaspy.ui.DirectoryCellEditor.<init>(DirectoryCellEditor.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the DirectoryCellEditor(DbConfigTableModel,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDirectoryCellEditor_8()
		throws Exception {
		DbConfigTableModel model = new DbConfigTableModel();
		File startingDir = new File("0123456789", "0123456789");

		DirectoryCellEditor result = new DirectoryCellEditor(model, startingDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.canWrite(File.java:785)
		//       at sun.awt.shell.ShellFolder.canWrite(ShellFolder.java:364)
		//       at com.apple.laf.AquaFileChooserUI$2.propertyChange(AquaFileChooserUI.java:390)
		//       at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:263)
		//       at java.awt.Component.firePropertyChange(Component.java:8393)
		//       at javax.swing.JFileChooser.setCurrentDirectory(JFileChooser.java:581)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:344)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:326)
		//       at net.sourceforge.schemaspy.ui.DirectoryCellEditor.<init>(DirectoryCellEditor.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the DirectoryCellEditor(DbConfigTableModel,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDirectoryCellEditor_9()
		throws Exception {
		DbConfigTableModel model = new DbConfigTableModel();
		File startingDir = new File(URI.create(""));

		DirectoryCellEditor result = new DirectoryCellEditor(model, startingDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: URI is not absolute
		//       at java.io.File.<init>(File.java:416)
		assertNotNull(result);
	}

	/**
	 * Run the DirectoryCellEditor(DbConfigTableModel,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDirectoryCellEditor_10()
		throws Exception {
		DbConfigTableModel model = new DbConfigTableModel();
		File startingDir = new File((File) null, "");

		DirectoryCellEditor result = new DirectoryCellEditor(model, startingDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.canWrite(File.java:785)
		//       at sun.awt.shell.ShellFolder.canWrite(ShellFolder.java:364)
		//       at com.apple.laf.AquaFileChooserUI$2.propertyChange(AquaFileChooserUI.java:390)
		//       at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:263)
		//       at java.awt.Component.firePropertyChange(Component.java:8393)
		//       at javax.swing.JFileChooser.setCurrentDirectory(JFileChooser.java:581)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:344)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:326)
		//       at net.sourceforge.schemaspy.ui.DirectoryCellEditor.<init>(DirectoryCellEditor.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the DirectoryCellEditor(DbConfigTableModel,File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testDirectoryCellEditor_11()
		throws Exception {
		DbConfigTableModel model = new DbConfigTableModel();
		File startingDir = new File((File) null, "0123456789");

		DirectoryCellEditor result = new DirectoryCellEditor(model, startingDir);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.canWrite(File.java:785)
		//       at sun.awt.shell.ShellFolder.canWrite(ShellFolder.java:364)
		//       at com.apple.laf.AquaFileChooserUI$2.propertyChange(AquaFileChooserUI.java:390)
		//       at java.beans.PropertyChangeSupport.fire(PropertyChangeSupport.java:335)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:327)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(PropertyChangeSupport.java:263)
		//       at java.awt.Component.firePropertyChange(Component.java:8393)
		//       at javax.swing.JFileChooser.setCurrentDirectory(JFileChooser.java:581)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:344)
		//       at javax.swing.JFileChooser.<init>(JFileChooser.java:326)
		//       at net.sourceforge.schemaspy.ui.DirectoryCellEditor.<init>(DirectoryCellEditor.java:66)
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
		new org.junit.runner.JUnitCore().run(DirectoryCellEditorTest.class);
	}
}