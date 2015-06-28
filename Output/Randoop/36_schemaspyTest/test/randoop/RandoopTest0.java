package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    java.lang.String var1 = net.sourceforge.schemaspy.util.Inflection.singularize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    java.lang.String var1 = net.sourceforge.schemaspy.util.HtmlEncoder.encodeToken('a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "a"+ "'", var1.equals("a"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    net.sourceforge.schemaspy.view.HtmlMultipleSchemasIndexPage var0 = net.sourceforge.schemaspy.view.HtmlMultipleSchemasIndexPage.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    net.sourceforge.schemaspy.util.Inflection var1 = new net.sourceforge.schemaspy.util.Inflection("hi!");

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    net.sourceforge.schemaspy.view.HtmlRoutinesPage var0 = net.sourceforge.schemaspy.view.HtmlRoutinesPage.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    net.sourceforge.schemaspy.view.HtmlOrphansPage var0 = net.sourceforge.schemaspy.view.HtmlOrphansPage.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    net.sourceforge.schemaspy.util.ResourceWriter var0 = net.sourceforge.schemaspy.util.ResourceWriter.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.model.xml.SchemaMeta var3 = new net.sourceforge.schemaspy.model.xml.SchemaMeta("", "", "");
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("a", 0, "hi!");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = var0.getUser();
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    net.sourceforge.schemaspy.view.ImageWriter var0 = net.sourceforge.schemaspy.view.ImageWriter.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.view.StyleSheet var0 = net.sourceforge.schemaspy.view.StyleSheet.getInstance();
      fail("Expected exception of type net.sourceforge.schemaspy.view.StyleSheet.ParseException");
    } catch (net.sourceforge.schemaspy.view.StyleSheet.ParseException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    net.sourceforge.schemaspy.view.DotConnectorFinder var0 = net.sourceforge.schemaspy.view.DotConnectorFinder.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    net.sourceforge.schemaspy.view.HtmlMainIndexPage var0 = net.sourceforge.schemaspy.view.HtmlMainIndexPage.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    net.sourceforge.schemaspy.Main var0 = new net.sourceforge.schemaspy.Main();

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.LineWriter var2 = new net.sourceforge.schemaspy.util.LineWriter("a", "");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    java.lang.String var1 = net.sourceforge.schemaspy.util.Inflection.pluralize("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!s"+ "'", var1.equals("hi!s"));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var1 = var0.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.InputMap var6 = var0.getInputMap((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.util.List var3 = var0.getColumnDetails();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = net.sourceforge.schemaspy.DbAnalyzer.getForeignKeyConstraints((java.util.Collection)var3);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    var0.setRankDirBugEnabled(true);
    boolean var4 = var0.isPromptForPasswordEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    net.sourceforge.schemaspy.view.XmlTableFormatter var0 = net.sourceforge.schemaspy.view.XmlTableFormatter.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    java.lang.String var2 = var0.getCharset();
    java.util.logging.Level var3 = var0.getLogLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "ISO-8859-1"+ "'", var2.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    net.sourceforge.schemaspy.ui.DbConfigPanel var7 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var7.requestFocus();
    var7.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var11 = var7.insets();
    var7.requestFocus();
    var7.setOpaque(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var15 = var0.add("hi!s", (java.awt.Component)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    java.lang.String var1 = net.sourceforge.schemaspy.util.HtmlEncoder.encodeToken("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!s"+ "'", var1.equals("hi!s"));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    javax.swing.JPopupMenu var3 = var0.getComponentPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var3 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var4 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var3);
    net.sourceforge.schemaspy.model.InvalidConfigurationException var5 = new net.sourceforge.schemaspy.model.InvalidConfigurationException((java.lang.Throwable)var4);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    var0.paintImmediately(1, 0, 0, (-1));
    var0.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    net.sourceforge.schemaspy.view.DotNode.DotNodeConfig var0 = new net.sourceforge.schemaspy.view.DotNode.DotNodeConfig();

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Properties var4 = var0.getDbProperties();
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    net.sourceforge.schemaspy.DbAnalyzer var0 = new net.sourceforge.schemaspy.DbAnalyzer();

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    net.sourceforge.schemaspy.ui.UiUtils var0 = new net.sourceforge.schemaspy.ui.UiUtils();

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    net.sourceforge.schemaspy.view.DotNode.DotNodeConfig var2 = new net.sourceforge.schemaspy.view.DotNode.DotNodeConfig(false, false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var2 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("hi!s", "ISO-8859-1");

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.LineWriter var2 = new net.sourceforge.schemaspy.util.LineWriter("hi!", "hi!s");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    var1.setSqlFormatter("hi!");
    net.sourceforge.schemaspy.view.DefaultSqlFormatter var5 = new net.sourceforge.schemaspy.view.DefaultSqlFormatter();
    var1.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var5);
    var0.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    net.sourceforge.schemaspy.model.ConnectionFailure var1 = new net.sourceforge.schemaspy.model.ConnectionFailure("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    java.awt.Window[] var0 = java.awt.Window.getOwnerlessWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isDbHelpRequired();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Properties var6 = var0.determineDbProperties("hi!s");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var6 = var0.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    net.sourceforge.schemaspy.util.DOMUtil var0 = new net.sourceforge.schemaspy.util.DOMUtil();

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.File var5 = var0.getOutputDir();
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    net.sourceforge.schemaspy.util.LogFormatter var0 = new net.sourceforge.schemaspy.util.LogFormatter();

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    java.lang.String var7 = var0.getParam("a");
    var0.setRankDirBugEnabled(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setConnectionPropertiesFile("");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var2 = var1.entrySet();
    net.sourceforge.schemaspy.Config var3 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var4 = var3.getTableExclusions();
    var3.setSqlFormatter("hi!");
    net.sourceforge.schemaspy.view.DefaultSqlFormatter var7 = new net.sourceforge.schemaspy.view.DefaultSqlFormatter();
    var3.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.remove((java.lang.Object)var3);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    java.awt.Insets var3 = var0.insets();
    boolean var4 = var0.isFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    net.sourceforge.schemaspy.view.DotFormatter var0 = net.sourceforge.schemaspy.view.DotFormatter.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    java.lang.String var3 = var0.getRenderer();
    var0.setRenderer("dot version 2.2.1 or versions greater than 2.4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    java.util.Set var1 = net.sourceforge.schemaspy.Config.getBuiltInDatabaseTypes("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    net.sourceforge.schemaspy.view.HtmlRelationshipsPage var0 = net.sourceforge.schemaspy.view.HtmlRelationshipsPage.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    java.lang.String var1 = net.sourceforge.schemaspy.util.HtmlEncoder.encodeToken("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}"+ "'", var1.equals("{}"));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    java.lang.String var0 = net.sourceforge.schemaspy.Config.getLoadedFromJar();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var0 + "' != '" + "/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin"+ "'", var0.equals("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin"));

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    var0.setSchema("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.File var7 = var0.getOutputDir();
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    java.util.Set var5 = net.sourceforge.schemaspy.Config.getBuiltInDatabaseTypes("a");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys(100, var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    net.sourceforge.schemaspy.view.HtmlTableDiagrammer var0 = net.sourceforge.schemaspy.view.HtmlTableDiagrammer.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    net.sourceforge.schemaspy.util.PasswordReader var0 = net.sourceforge.schemaspy.util.PasswordReader.getInstance();
    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var4 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.view.StyleSheet.ParseException var6 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException((java.lang.Exception)var5);
    net.sourceforge.schemaspy.util.PasswordReader.IOError var7 = var0.new IOError((java.lang.Throwable)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    java.beans.PropertyChangeListener[] var11 = var9.getPropertyChangeListeners();
    var9.paintImmediately(0, (-1), (-1), 0);
    boolean var17 = var9.isForegroundSet();
    java.awt.event.ContainerListener[] var18 = var9.getContainerListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var19 = var0.readPassword("{}", (java.lang.Object[])var18);
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    var0.setSqlFormatter("hi!");
    net.sourceforge.schemaspy.view.DefaultSqlFormatter var4 = new net.sourceforge.schemaspy.view.DefaultSqlFormatter();
    var0.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var4);
    var0.setImpliedConstraintsEnabled(true);
    boolean var8 = var0.isRailsEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    java.awt.Cursor var5 = var0.getCursor();
    java.awt.Point var6 = var0.location();
    int var7 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    var0.setVisible(false);
    java.awt.image.VolatileImage var10 = var0.createVolatileImage((-3), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.firePropertyChange("hi!", 10, 2);
    var0.setVisible(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var13 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var13.requestFocus();
    var13.setFocusTraversalPolicyProvider(true);
    java.awt.Point var18 = var13.getMousePosition(true);
    java.awt.Component var19 = var13.getNextFocusableComponent();
    java.awt.Dimension var20 = var13.getMinimumSize();
    var0.setPreferredSize(var20);
    var0.setFocusCycleRoot(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    boolean var8 = var1.hasFocus();
    boolean var9 = var1.getFocusTraversalKeysEnabled();
    var1.setSize(1, (-1));
    boolean var14 = var1.requestFocus(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var15 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var15.requestFocus();
    java.beans.PropertyChangeListener[] var17 = var15.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var18 = var15.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var19 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var19.requestFocus();
    var19.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var23 = var19.insets();
    var19.setAlignmentX(1.0f);
    var19.doLayout();
    boolean var27 = var19.isCursorSet();
    var19.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var32 = var19.getLocation();
    boolean var33 = var15.contains(var32);
    java.awt.Point var34 = var1.getLocation(var32);
    java.awt.Component var35 = var0.add((java.awt.Component)var1);
    var35.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    java.lang.String var3 = var0.getRenderer();
    var0.setFormat("a");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    java.awt.Point var9 = var0.getMousePosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    var0.setSize(1, (-1));
    boolean var13 = var0.requestFocus(false);
    var0.enable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    var0.setSchemaSpec("hi!");
    var0.setHost("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    var0.setCatalog("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    int var2 = var0.findColumn("a");
    net.sourceforge.schemaspy.util.DbSpecificConfig var4 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setDbSpecificConfig(var4);
    javax.swing.event.TableModelListener[] var6 = var0.getTableModelListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var0.getValueAt(10, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var1.clear();
    java.util.List var3 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var1);
    net.sourceforge.schemaspy.util.Dot var4 = net.sourceforge.schemaspy.util.Dot.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.get((java.lang.Object)var4);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    net.sourceforge.schemaspy.util.ResultSetDumper var0 = new net.sourceforge.schemaspy.util.ResultSetDumper();

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.awt.Container var24 = var0.getContentPane();
    var24.resize(10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("hi!s", 2, "hi!s");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = net.sourceforge.schemaspy.DbAnalyzer.getTablesWithoutIndexes((java.util.Collection)var4);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    var0.fireTableDataChanged();
    var0.fireTableRowsInserted((-1), 0);
    var0.fireTableStructureChanged();

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    var0.firePropertyChange("hi!", 'a', 'a');
    javax.swing.TransferHandler var14 = var0.getTransferHandler();
    boolean var17 = var0.contains(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    net.sourceforge.schemaspy.Config.MissingRequiredParameterException var3 = new net.sourceforge.schemaspy.Config.MissingRequiredParameterException("ISO-8859-1", "ISO-8859-1", false);
    net.sourceforge.schemaspy.model.ProcessExecutionException var5 = new net.sourceforge.schemaspy.model.ProcessExecutionException("dot version 2.2.1 or versions greater than 2.4");
    var3.addSuppressed((java.lang.Throwable)var5);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.isHighQuality();
    int var6 = var0.getMaxDetailedTables();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.File var7 = var0.getOutputDir();
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 300);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setOpacity((-1.0f));
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    net.sourceforge.schemaspy.util.DbSpecificOption var2 = new net.sourceforge.schemaspy.util.DbSpecificOption("", "ISO-8859-1");
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var3.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.lang.String var11 = var9.getComment();
    java.lang.String var12 = var9.getDefinitionLanguage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "a"+ "'", var11.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "a"+ "'", var12.equals("a"));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    java.lang.String var10 = var9.getDataAccess();
    java.lang.String var11 = var9.getDataAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Image var7 = var0.getIconImage();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var3 = var0.getBaselineResizeBehavior();
    javax.swing.InputMap var4 = var0.getInputMap();
    var0.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    net.sourceforge.schemaspy.util.DbSpecificConfig var1 = new net.sourceforge.schemaspy.util.DbSpecificConfig("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    float var13 = var8.getAlignmentX();
    var8.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var19 = var8.getMouseListeners();
    boolean var20 = var0.isAncestorOf((java.awt.Component)var8);
    var8.firePropertyChange("PanelUI", '#', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    net.sourceforge.schemaspy.model.Table.ByColumnIdComparator var0 = new net.sourceforge.schemaspy.model.Table.ByColumnIdComparator();

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var6 = var0.getBackground();
    var0.requestFocus();
    float var8 = var0.getAlignmentX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.5f);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setOpacity(10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.firePropertyChange("hi!", 10, 2);
    var0.paintImmediately(100, 10, 2, 0);
    java.util.Set var17 = var0.getFocusTraversalKeys(2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var19 = var0.getComponent(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.setOpaque(false);
    var0.invalidate();
    java.awt.event.KeyListener[] var9 = var0.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var11 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var11.requestFocus();
    var11.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var15 = var11.getAncestorListeners();
    javax.swing.event.AncestorListener[] var16 = var11.getAncestorListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var17 = var0.add("hi!", (java.awt.Component)var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.firePropertyChange("hi!", 10, 2);
    var0.setVisible(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var13 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var13.requestFocus();
    var13.setFocusTraversalPolicyProvider(true);
    java.awt.Point var18 = var13.getMousePosition(true);
    java.awt.Component var19 = var13.getNextFocusableComponent();
    java.awt.Dimension var20 = var13.getMinimumSize();
    var0.setPreferredSize(var20);
    var0.firePropertyChange("Unknown", (short)10, (short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var7 = var0.getModalExclusionType();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    var8.setAlignmentX(1.0f);
    net.sourceforge.schemaspy.ui.DbConfigPanel var15 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var15.requestFocus();
    var15.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var19 = var15.insets();
    float var20 = var15.getAlignmentX();
    var15.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var26 = var15.getBounds();
    java.awt.Rectangle var27 = var8.getBounds(var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var27);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var4 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var10 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var11 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var10);
    net.sourceforge.schemaspy.model.ConnectionFailure var12 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var10);
    net.sourceforge.schemaspy.model.ConnectionFailure var13 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var10);
    var5.addSuppressed((java.lang.Throwable)var13);
    net.sourceforge.schemaspy.model.ProcessExecutionException var15 = new net.sourceforge.schemaspy.model.ProcessExecutionException("PanelUI", (java.lang.Throwable)var13);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    boolean var3 = var0.isEncodeCommentsEnabled();
    boolean var4 = var0.isLogoEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    int var2 = var0.findColumn("a");
    net.sourceforge.schemaspy.util.DbSpecificConfig var4 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setDbSpecificConfig(var4);
    javax.swing.event.TableModelListener[] var6 = var0.getTableModelListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var8 = var0.getClass(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    boolean var7 = var0.isOpaque();
    java.awt.MenuBar var8 = var0.getMenuBar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    net.sourceforge.schemaspy.MultipleSchemaAnalyzer var0 = net.sourceforge.schemaspy.MultipleSchemaAnalyzer.getInstance();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var3 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.List var4 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var3);
    net.sourceforge.schemaspy.model.Routine var14 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var15 = var14.getDataAccess();
    java.lang.String var16 = var14.getDefinitionLanguage();
    java.util.List var17 = var14.getParameters();
    net.sourceforge.schemaspy.Config var18 = new net.sourceforge.schemaspy.Config();
    var18.setDb("a");
    java.lang.String var21 = var18.getServer();
    boolean var22 = var18.isHtmlGenerationEnabled();
    java.lang.String var23 = var18.getSchemaSpec();
    var18.setViewsEnabled(false);
    var18.setTableInclusions("");
    var18.setHasOrphans(true);
    var18.setUser("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var18.setTableInclusions("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.analyze("hi!", var4, var17, var18);
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "a"+ "'", var16.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var2 = var1.entrySet();
    net.sourceforge.schemaspy.ui.DbConfigPanel var3 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var3.requestFocus();
    var3.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var7 = var3.insets();
    var3.requestFocus();
    boolean var9 = var3.isVisible();
    java.awt.Graphics var10 = var3.getGraphics();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var1.get((java.lang.Object)var3);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("hi!s", 2, "{}");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    javax.swing.InputVerifier var8 = var0.getInputVerifier();
    var0.repaint(100L, 10, 1, 0, 100);
    var0.setEnabled(false);
    javax.swing.InputMap var17 = var0.getInputMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var19 = var0.getComponent((-3));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setColumnDetails("hi!s");
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    net.sourceforge.schemaspy.util.DbSpecificConfig var1 = new net.sourceforge.schemaspy.util.DbSpecificConfig("PanelUI");

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isHtmlGenerationEnabled();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var4 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var4.clear();
    var0.setDbSpecificOptions((java.util.Map)var4);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var8 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var9 = var8.entrySet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var4.get((java.lang.Object)var9);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Properties var6 = var0.getDbProperties();
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Properties var6 = var0.determineDbProperties("schemaSpy.css");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    net.sourceforge.schemaspy.SchemaAnalyzer var0 = new net.sourceforge.schemaspy.SchemaAnalyzer();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    var1.setDb("a");
    java.lang.String var4 = var1.getServer();
    boolean var5 = var1.isHtmlGenerationEnabled();
    boolean var6 = var1.isMeterEnabled();
    net.sourceforge.schemaspy.model.Database var7 = var0.analyze(var1);
    var1.setHasOrphans(true);
    var1.setRenderer("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    int var9 = var0.getHeight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var11 = var0.getComponent(3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("ISO-8859-1");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.getElementAt((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.util.List var11 = var9.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var12 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var11);
    java.util.List var13 = net.sourceforge.schemaspy.DbAnalyzer.getMustBeUniqueNullableColumns((java.util.Collection)var11);
    java.lang.String var14 = net.sourceforge.schemaspy.model.ForeignKeyConstraint.toString(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[]"+ "'", var14.equals("[]"));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.awt.Container var24 = var0.getContentPane();
    net.sourceforge.schemaspy.ui.DbConfigPanel var25 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var26 = var25.isManagingFocus();
    java.awt.Rectangle var27 = var25.getVisibleRect();
    var0.setBounds(var27);
    var0.hide();
    java.util.List var30 = var0.getIconImages();
    java.awt.event.WindowStateListener[] var31 = var0.getWindowStateListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.LineWriter var2 = new net.sourceforge.schemaspy.util.LineWriter("{}", "dot version 2.2.1 or versions greater than 2.4");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    var0.setSchemaSpec("hi!");
    java.lang.String var7 = var0.getSchema();
    var0.setFont("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    java.lang.String var1 = net.sourceforge.schemaspy.util.Inflection.pluralize("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "{}s"+ "'", var1.equals("{}s"));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    boolean var11 = var9.isDeterministic();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    java.util.Locale var5 = var0.getLocale();
    javax.swing.JComponent.setDefaultLocale(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    var0.setIgnoreRepaint(true);
    net.sourceforge.schemaspy.ui.MainFrame var10 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var11 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var11.requestFocus();
    var11.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var15 = var11.insets();
    var11.setAlignmentX(1.0f);
    java.awt.Color var18 = var11.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var19 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var19.requestFocus();
    var19.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var23 = var19.insets();
    float var24 = var19.getAlignmentX();
    var19.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var30 = var19.getMouseListeners();
    java.awt.Rectangle var31 = var19.bounds();
    var11.setBounds(var31);
    var10.setMaximizedBounds(var31);
    net.sourceforge.schemaspy.ui.DbConfigPanel var34 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var34.requestFocus();
    var34.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var38 = var34.insets();
    var34.setAlignmentX(1.0f);
    boolean var41 = var34.hasFocus();
    boolean var42 = var34.getFocusTraversalKeysEnabled();
    boolean var43 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var34);
    var34.firePropertyChange("hi!", 'a', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var48 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var49 = var48.isManagingFocus();
    int var50 = var48.getWidth();
    java.awt.Insets var51 = var48.insets();
    javax.accessibility.AccessibleContext var52 = var48.getAccessibleContext();
    boolean var55 = var48.inside(100, (-3));
    java.awt.Rectangle var56 = var48.getVisibleRect();
    var34.setBounds(var56);
    var10.setMaximizedBounds(var56);
    java.awt.Window[] var59 = var10.getOwnedWindows();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var61 = var0.add((java.awt.Component)var10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    java.awt.image.VolatileImage var4 = var0.createVolatileImage(10, 1);
    var0.setFocusTraversalPolicyProvider(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    java.awt.Window[] var0 = java.awt.Window.getWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    net.sourceforge.schemaspy.model.EmptySchemaException var0 = new net.sourceforge.schemaspy.model.EmptySchemaException();

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    boolean var13 = var6.hasFocus();
    boolean var14 = var6.getFocusTraversalKeysEnabled();
    boolean var15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var17 = var16.isManagingFocus();
    java.awt.Rectangle var18 = var16.getVisibleRect();
    java.awt.Rectangle var19 = var6.getBounds(var18);
    java.awt.Dimension var20 = var6.getPreferredSize();
    var0.setMinimumSize(var20);
    javax.swing.TransferHandler var22 = var0.getTransferHandler();
    java.awt.event.WindowListener[] var23 = var0.getWindowListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var25 = var0.getFocusTraversalKeys(5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var7 = var0.getModalExclusionType();
    boolean var8 = var0.isAutoRequestFocus();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setVisible(true);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    var0.setRankDirBugEnabled(true);
    var0.setRankDirBugEnabled(false);
    var0.setDbType("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setIndirectColumnExclusions("{}s");
      fail("Expected exception of type java.util.regex.PatternSyntaxException");
    } catch (java.util.regex.PatternSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    net.sourceforge.schemaspy.view.StyleSheet.ParseException var1 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var2,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"+ "'", var2.equals("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var2,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var1.clear();
    net.sourceforge.schemaspy.ui.DbConfigPanel var3 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var3.requestFocus();
    var3.setFocusTraversalPolicyProvider(true);
    java.awt.Point var8 = var3.getMousePosition(true);
    java.awt.Component var9 = var3.getNextFocusableComponent();
    java.awt.Dimension var10 = var3.getMinimumSize();
    boolean var11 = var1.containsValue((java.lang.Object)var3);
    net.sourceforge.schemaspy.model.Routine var21 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var22 = var21.getDataAccess();
    java.util.List var23 = var21.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var24 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var23);
    int var25 = var24.getNumViewsWritten();
    int var26 = var24.getNumTablesWritten();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var27 = var1.containsKey((java.lang.Object)var26);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    var0.setSize(1, (-1));
    boolean var13 = var0.requestFocus(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var14 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var14.requestFocus();
    java.beans.PropertyChangeListener[] var16 = var14.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var17 = var14.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var18 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var18.requestFocus();
    var18.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var22 = var18.insets();
    var18.setAlignmentX(1.0f);
    var18.doLayout();
    boolean var26 = var18.isCursorSet();
    var18.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var31 = var18.getLocation();
    boolean var32 = var14.contains(var31);
    java.awt.Point var33 = var0.getLocation(var31);
    java.awt.Dimension var34 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    net.sourceforge.schemaspy.Config var5 = var2.getConfig();
    var5.setSchemaSpec("ISO-8859-1");
    java.util.List var8 = var5.getSchemas();
    var5.setCss("[]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    var0.setFocusableWindowState(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    boolean var17 = var9.contains(1, (-1));
    var9.transferFocus();
    var9.removeAll();
    java.awt.Component var21 = var0.add((java.awt.Component)var9, 0);
    java.awt.dnd.DropTarget var22 = var0.getDropTarget();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Image var23 = var0.getIconImage();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var5 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var5.requestFocus();
    java.beans.PropertyChangeListener[] var7 = var5.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var8 = var5.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    var9.setAlignmentX(1.0f);
    var9.doLayout();
    boolean var17 = var9.isCursorSet();
    var9.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var22 = var9.getLocation();
    boolean var23 = var5.contains(var22);
    boolean var24 = var0.isFocusCycleRoot((java.awt.Container)var5);
    var0.repaint((-1L), (-1), 0, 1, 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    net.sourceforge.schemaspy.SchemaAnalyzer var0 = new net.sourceforge.schemaspy.SchemaAnalyzer();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    var1.setDb("a");
    java.lang.String var4 = var1.getServer();
    boolean var5 = var1.isHtmlGenerationEnabled();
    boolean var6 = var1.isMeterEnabled();
    net.sourceforge.schemaspy.model.Database var7 = var0.analyze(var1);
    var1.setHasOrphans(true);
    java.lang.String var10 = var1.getSchema();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isOneOfMultipleSchemas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setMaxDbThreads(1);
    var0.setNumRowsEnabled(false);
    var0.setEncodeCommentsEnabled(false);
    var0.setHost("ISO-8859-1");

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var5 = var0.getFocusTraversalPolicy();
    boolean var6 = var0.isForegroundSet();
    net.sourceforge.schemaspy.ui.MainFrame var7 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    var8.setAlignmentX(1.0f);
    java.awt.Color var15 = var8.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var16.requestFocus();
    var16.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var20 = var16.insets();
    float var21 = var16.getAlignmentX();
    var16.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var27 = var16.getMouseListeners();
    java.awt.Rectangle var28 = var16.bounds();
    var8.setBounds(var28);
    var7.setMaximizedBounds(var28);
    java.awt.Container var31 = var7.getContentPane();
    boolean var32 = var7.isLocationByPlatform();
    java.awt.Dimension var33 = var7.getSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var34 = var0.add((java.awt.Component)var7);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    int var2 = var0.findColumn("a");
    net.sourceforge.schemaspy.util.DbSpecificConfig var4 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setDbSpecificConfig(var4);
    var0.fireTableStructureChanged();
    var0.fireTableCellUpdated(5, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("hi!s");
    boolean var5 = var0.exists();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    boolean var1 = net.sourceforge.schemaspy.util.Inflection.isUncountable("[]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    net.sourceforge.schemaspy.Config var5 = var2.getConfig();
    var5.setHost("hi!s");
    var5.setMaxDetailedTabled(300);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    javax.swing.InputVerifier var8 = var0.getInputVerifier();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var10 = var0.getComponent(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var3 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var4 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var3);
    net.sourceforge.schemaspy.model.ProcessExecutionException var5 = new net.sourceforge.schemaspy.model.ProcessExecutionException((java.lang.Throwable)var4);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    java.awt.Component var2 = var0.getMostRecentFocusOwner();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.applyResourceBundle("schemaSpy.css");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    net.sourceforge.schemaspy.util.Inflection var3 = new net.sourceforge.schemaspy.util.Inflection("a", "schemaSpy.css", false);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    boolean var13 = var6.hasFocus();
    boolean var14 = var6.getFocusTraversalKeysEnabled();
    boolean var15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var17 = var16.isManagingFocus();
    java.awt.Rectangle var18 = var16.getVisibleRect();
    java.awt.Rectangle var19 = var6.getBounds(var18);
    java.awt.Dimension var20 = var6.getPreferredSize();
    var0.setMinimumSize(var20);
    var0.toBack();
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    float var28 = var23.getAlignmentX();
    boolean var31 = var23.contains(1, (-1));
    var23.setOpaque(false);
    boolean var34 = var23.getInheritsPopupMenu();
    var0.setGlassPane((java.awt.Component)var23);
    net.sourceforge.schemaspy.ui.MainFrame var36 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var37 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var37.requestFocus();
    var37.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var41 = var37.insets();
    var37.setAlignmentX(1.0f);
    java.awt.Color var44 = var37.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var45 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var45.requestFocus();
    var45.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var49 = var45.insets();
    float var50 = var45.getAlignmentX();
    var45.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var56 = var45.getMouseListeners();
    java.awt.Rectangle var57 = var45.bounds();
    var37.setBounds(var57);
    var36.setMaximizedBounds(var57);
    net.sourceforge.schemaspy.ui.DbConfigPanel var60 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var60.requestFocus();
    var60.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var64 = var60.insets();
    var60.setAlignmentX(1.0f);
    boolean var67 = var60.hasFocus();
    boolean var68 = var60.getFocusTraversalKeysEnabled();
    boolean var69 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var60);
    var60.firePropertyChange("hi!", 'a', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var74 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var75 = var74.isManagingFocus();
    int var76 = var74.getWidth();
    java.awt.Insets var77 = var74.insets();
    javax.accessibility.AccessibleContext var78 = var74.getAccessibleContext();
    boolean var81 = var74.inside(100, (-3));
    java.awt.Rectangle var82 = var74.getVisibleRect();
    var60.setBounds(var82);
    var36.setMaximizedBounds(var82);
    var0.setBounds(var82);
    java.awt.event.WindowListener[] var86 = var0.getWindowListeners();
    var0.setFocusableWindowState(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.lang.String var13 = var11.getDefinitionLanguage();
    java.util.List var14 = var11.getParameters();
    var0.setColumnDetails(var14);
    var0.setConnectionProperties("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setFormat("PanelUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    java.lang.String var1 = net.sourceforge.schemaspy.util.Inflection.pluralize("ISO-8859-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "ISO-8859-1s"+ "'", var1.equals("ISO-8859-1s"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var4 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ConnectionFailure var6 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var5);
    net.sourceforge.schemaspy.model.InvalidConfigurationException var7 = new net.sourceforge.schemaspy.model.InvalidConfigurationException("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", (java.lang.Throwable)var5);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    java.awt.Dimension var7 = var0.getMinimumSize();
    var0.setEnabled(false);
    boolean var10 = var0.getIgnoreRepaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var4 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ConnectionFailure var6 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ConnectionFailure var7 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var4);
    java.lang.Throwable[] var8 = var7.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.layout();
    java.awt.image.VolatileImage var8 = var0.createVolatileImage((-3), 1);
    java.awt.Component var11 = var0.findComponentAt(0, (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("ISO-8859-1");
    javax.swing.event.ListDataListener[] var2 = var1.getListDataListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.getElementAt(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.Writer var7 = var3.append((java.lang.CharSequence)"net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 100, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    net.sourceforge.schemaspy.Config var5 = var2.getConfig();
    var5.setSchemaSpec("ISO-8859-1");
    java.util.List var8 = var5.getSchemas();
    var5.setIndirectColumnExclusions("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var3 = var0.getBaselineResizeBehavior();
    boolean var4 = var0.isPaintingTile();
    var0.setFocusable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var11 = var10.isManagingFocus();
    java.awt.Rectangle var12 = var10.getVisibleRect();
    java.awt.Rectangle var13 = var0.getBounds(var12);
    java.awt.Dimension var14 = var0.getPreferredSize();
    java.lang.String var15 = var0.getToolTipText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    java.lang.String var1 = net.sourceforge.schemaspy.util.HtmlEncoder.encodeToken('4');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4"+ "'", var1.equals("4"));

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setMaxDbThreads(1);
    var0.setNumRowsEnabled(false);
    var0.setEncodeCommentsEnabled(false);
    var0.setDescription("hi!s");
    java.lang.String var9 = var0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!s"+ "'", var9.equals("hi!s"));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.isDoubleBuffered();
    boolean var5 = var0.isValid();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var7 = var0.getComponent(3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    var0.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.LineWriter var2 = new net.sourceforge.schemaspy.util.LineWriter("ISO-8859-1s", "dot version 2.2.1 or versions greater than 2.4");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.flush();
    var3.write("a");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.write("ISO-8859-1s", (-3), 300);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.awt.Container var24 = var0.getContentPane();
    net.sourceforge.schemaspy.ui.DbConfigPanel var25 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var26 = var25.isManagingFocus();
    java.awt.Rectangle var27 = var25.getVisibleRect();
    var0.setBounds(var27);
    var0.hide();
    java.util.List var30 = var0.getIconImages();
    net.sourceforge.schemaspy.ui.DbConfigPanel var31 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var31.requestFocus();
    var31.setFocusTraversalPolicyProvider(true);
    var31.firePropertyChange("a", (byte)10, (byte)0);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var41 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var42 = var41.entrySet();
    var31.setFocusTraversalKeys(0, var42);
    var0.setLocationRelativeTo((java.awt.Component)var31);
    java.awt.Component var45 = var0.getMostRecentFocusOwner();
    net.sourceforge.schemaspy.ui.DbConfigPanel var46 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var47 = var46.isManagingFocus();
    int var48 = var46.getWidth();
    java.awt.Insets var49 = var46.insets();
    javax.accessibility.AccessibleContext var50 = var46.getAccessibleContext();
    boolean var53 = var46.inside(100, (-3));
    java.awt.Rectangle var54 = var46.getVisibleRect();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var54);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    java.awt.Component var8 = var6.getNextFocusableComponent();
    java.lang.String var9 = var6.toString();
    var0.setNextFocusableComponent((java.awt.Component)var6);
    var6.firePropertyChange("hi!", 10.0f, 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var9,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"+ "'", var9.equals("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var9,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    var2.dumpUsage();

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var2 = var1.entrySet();
    net.sourceforge.schemaspy.ui.DbConfigPanel var3 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var3.requestFocus();
    var3.setFocusTraversalPolicyProvider(true);
    var3.firePropertyChange("a", (byte)10, (byte)0);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var13 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var14 = var13.entrySet();
    var3.setFocusTraversalKeys(0, var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var16 = var1.containsKey((java.lang.Object)var14);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.isHighQuality();
    var0.setColumnExclusions("dot version 2.2.1 or versions greater than 2.4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    java.awt.Toolkit var6 = var0.getToolkit();
    net.sourceforge.schemaspy.ui.MainFrame var7 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    var8.setAlignmentX(1.0f);
    java.awt.Color var15 = var8.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var16.requestFocus();
    var16.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var20 = var16.insets();
    float var21 = var16.getAlignmentX();
    var16.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var27 = var16.getMouseListeners();
    java.awt.Rectangle var28 = var16.bounds();
    var8.setBounds(var28);
    var7.setMaximizedBounds(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var28);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isRankDirBugEnabled();
    var0.setMaxDetailedTabled(0);
    var0.setHost("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    boolean var7 = var0.isViewsEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    net.sourceforge.schemaspy.util.Inflection var3 = new net.sourceforge.schemaspy.util.Inflection("ISO-8859-1s", "hi!s", true);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.firePropertyChange("ISO-8859-1", 0L, (-1L));
    var0.firePropertyChange("a", 0.0d, 1.0d);
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    boolean var14 = var10.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var15 = var10.getFocusTraversalPolicy();
    var0.setFocusTraversalPolicy(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    var0.setSize(1, (-1));
    java.awt.image.VolatileImage var14 = var0.createVolatileImage(1, (-3));
    java.awt.Graphics var15 = var0.getGraphics();
    boolean var16 = var0.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.util.Locale var4 = javax.swing.JComponent.getDefaultLocale();
    var0.setLocale(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    float var11 = var6.getAlignmentX();
    var6.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var17 = var6.getBounds();
    var0.computeVisibleRect(var17);
    var0.setFocusable(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.Version var1 = new net.sourceforge.schemaspy.util.Version("hi!");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    net.sourceforge.schemaspy.model.ConnectionFailure var1 = new net.sourceforge.schemaspy.model.ConnectionFailure("Unknown");

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var3 = var0.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var4 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var4.requestFocus();
    var4.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var8 = var4.insets();
    var4.setAlignmentX(1.0f);
    var4.doLayout();
    boolean var12 = var4.isCursorSet();
    var4.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var17 = var4.getLocation();
    boolean var18 = var0.contains(var17);
    var0.hide();
    java.lang.String var20 = var0.getToolTipText();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    var0.setDbType("hi!s");
    var0.setOutputDir("a");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var8 = var0.getClass(300);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    java.lang.Object var5 = var0.getTreeLock();
    var0.setAutoscrolls(true);
    net.sourceforge.schemaspy.ui.MainFrame var9 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var10 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var11 = var10.getTableExclusions();
    boolean var12 = var10.isEvaluateAllEnabled();
    java.util.List var13 = var10.getColumnDetails();
    var9.setIconImages(var13);
    net.sourceforge.schemaspy.ui.DbConfigPanel var15 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var15.requestFocus();
    var15.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var19 = var15.insets();
    var15.setAlignmentX(1.0f);
    boolean var22 = var15.hasFocus();
    boolean var23 = var15.getFocusTraversalKeysEnabled();
    boolean var24 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var15);
    net.sourceforge.schemaspy.ui.DbConfigPanel var25 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var26 = var25.isManagingFocus();
    java.awt.Rectangle var27 = var25.getVisibleRect();
    java.awt.Rectangle var28 = var15.getBounds(var27);
    java.awt.Dimension var29 = var15.getPreferredSize();
    var9.setMinimumSize(var29);
    var9.toBack();
    net.sourceforge.schemaspy.ui.DbConfigPanel var32 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var32.requestFocus();
    var32.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var36 = var32.insets();
    float var37 = var32.getAlignmentX();
    boolean var40 = var32.contains(1, (-1));
    var32.setOpaque(false);
    boolean var43 = var32.getInheritsPopupMenu();
    var9.setGlassPane((java.awt.Component)var32);
    net.sourceforge.schemaspy.ui.MainFrame var45 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var46 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var46.requestFocus();
    var46.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var50 = var46.insets();
    var46.setAlignmentX(1.0f);
    java.awt.Color var53 = var46.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var54 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var54.requestFocus();
    var54.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var58 = var54.insets();
    float var59 = var54.getAlignmentX();
    var54.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var65 = var54.getMouseListeners();
    java.awt.Rectangle var66 = var54.bounds();
    var46.setBounds(var66);
    var45.setMaximizedBounds(var66);
    net.sourceforge.schemaspy.ui.DbConfigPanel var69 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var69.requestFocus();
    var69.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var73 = var69.insets();
    var69.setAlignmentX(1.0f);
    boolean var76 = var69.hasFocus();
    boolean var77 = var69.getFocusTraversalKeysEnabled();
    boolean var78 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var69);
    var69.firePropertyChange("hi!", 'a', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var83 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var84 = var83.isManagingFocus();
    int var85 = var83.getWidth();
    java.awt.Insets var86 = var83.insets();
    javax.accessibility.AccessibleContext var87 = var83.getAccessibleContext();
    boolean var90 = var83.inside(100, (-3));
    java.awt.Rectangle var91 = var83.getVisibleRect();
    var69.setBounds(var91);
    var45.setMaximizedBounds(var91);
    var9.setBounds(var91);
    java.awt.Window[] var95 = var9.getOwnedWindows();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var96 = var0.add("4", (java.awt.Component)var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var7 = var0.getTableModelListeners();
    var0.fireTableRowsUpdated(0, 3);
    var0.fireTableRowsInserted(1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    var0.firePropertyChange("hi!", 'a', 'a');
    javax.swing.TransferHandler var14 = var0.getTransferHandler();
    java.awt.Point var16 = var0.getMousePosition(false);
    var0.setAlignmentX(10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.lang.String var4 = var0.getParam("hi!s");
    boolean var5 = var0.isHelpRequired();
    var0.setIndirectColumnExclusions("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


    java.util.Set var1 = net.sourceforge.schemaspy.Config.getBuiltInDatabaseTypes("a");
    net.sourceforge.schemaspy.view.WriteStats var2 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.flush();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.write("", 100, 5);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.layout();
    java.awt.image.VolatileImage var8 = var0.createVolatileImage((-3), 1);
    var0.removeAll();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var4 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ConnectionFailure var6 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ConnectionFailure var7 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var4);
    java.lang.Throwable[] var8 = var4.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.LineWriter var2 = new net.sourceforge.schemaspy.util.LineWriter("a", "dot version 2.2.1 or versions greater than 2.4");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    java.awt.Point var3 = var0.getMousePosition();
    boolean var6 = var0.contains(1, (-1));
    boolean var7 = var0.isBackgroundSet();
    var0.requestFocus();
    java.lang.String var9 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var11 = var0.getFocusTraversalKeys(5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var9,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"+ "'", var9.equals("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var9,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    var0.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var11 = var0.getMouseListeners();
    java.awt.Rectangle var12 = var0.bounds();
    var0.setRequestFocusEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    float var13 = var8.getAlignmentX();
    var8.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var19 = var8.getMouseListeners();
    boolean var20 = var0.isAncestorOf((java.awt.Component)var8);
    java.awt.im.InputMethodRequests var21 = var8.getInputMethodRequests();
    net.sourceforge.schemaspy.ui.DbConfigPanel var22 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var22.requestFocus();
    var22.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var26 = var22.insets();
    var22.setAlignmentX(1.0f);
    var22.doLayout();
    boolean var30 = var22.isCursorSet();
    var22.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var35 = var22.getLocation();
    java.awt.Component var36 = var8.findComponentAt(var35);
    boolean var37 = javax.swing.JComponent.isLightweightComponent(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.util.List var24 = var0.getIconImages();
    java.util.List var25 = net.sourceforge.schemaspy.DbAnalyzer.getImpliedConstraints((java.util.Collection)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    float var13 = var8.getAlignmentX();
    var8.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var19 = var8.getMouseListeners();
    boolean var20 = var0.isAncestorOf((java.awt.Component)var8);
    net.sourceforge.schemaspy.ui.DbConfigPanel var21 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var21.requestFocus();
    java.beans.PropertyChangeListener[] var23 = var21.getPropertyChangeListeners();
    var21.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var29 = var21.getKeyListeners();
    var21.setLocation(100, (-1));
    net.sourceforge.schemaspy.ui.MainFrame var33 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var34 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var34.requestFocus();
    var34.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var38 = var34.insets();
    var34.setAlignmentX(1.0f);
    java.awt.Color var41 = var34.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var42 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var42.requestFocus();
    var42.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var46 = var42.insets();
    float var47 = var42.getAlignmentX();
    var42.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var53 = var42.getMouseListeners();
    java.awt.Rectangle var54 = var42.bounds();
    var34.setBounds(var54);
    var33.setMaximizedBounds(var54);
    net.sourceforge.schemaspy.ui.DbConfigPanel var57 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var57.requestFocus();
    var57.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var61 = var57.insets();
    var57.setAlignmentX(1.0f);
    boolean var64 = var57.hasFocus();
    boolean var65 = var57.getFocusTraversalKeysEnabled();
    boolean var66 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var57);
    var57.firePropertyChange("hi!", 'a', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var71 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var72 = var71.isManagingFocus();
    int var73 = var71.getWidth();
    java.awt.Insets var74 = var71.insets();
    javax.accessibility.AccessibleContext var75 = var71.getAccessibleContext();
    boolean var78 = var71.inside(100, (-3));
    java.awt.Rectangle var79 = var71.getVisibleRect();
    var57.setBounds(var79);
    var33.setMaximizedBounds(var79);
    java.awt.Rectangle var82 = var21.getBounds(var79);
    var8.scrollRectToVisible(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


    net.sourceforge.schemaspy.util.PasswordReader var0 = net.sourceforge.schemaspy.util.PasswordReader.getInstance();
    net.sourceforge.schemaspy.model.ProcessExecutionException var2 = new net.sourceforge.schemaspy.model.ProcessExecutionException("a");
    net.sourceforge.schemaspy.util.PasswordReader.IOError var3 = var0.new IOError((java.lang.Throwable)var2);
    net.sourceforge.schemaspy.ui.DbConfigPanel var5 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var5.requestFocus();
    java.beans.PropertyChangeListener[] var7 = var5.getPropertyChangeListeners();
    var5.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var13 = var5.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var14 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var14.requestFocus();
    var14.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var18 = var14.insets();
    var14.setAlignmentX(1.0f);
    java.awt.Color var21 = var14.getForeground();
    var5.setForeground(var21);
    boolean var23 = var5.hasFocus();
    java.awt.event.MouseListener[] var24 = var5.getMouseListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var25 = var0.readPassword("ISO-8859-1s", (java.lang.Object[])var24);
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    net.sourceforge.schemaspy.Config var5 = var2.getConfig();
    boolean var6 = var5.isImpliedConstraintsEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getDb();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "a"+ "'", var3.equals("a"));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = var0.isVisible();
    var0.hide();
    java.awt.Dimension var8 = var0.getPreferredSize();
    var0.firePropertyChange("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", 1.0d, 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test196");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    var0.repaint(10, 2, 300, (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test197");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    var0.setAlignmentY(100.0f);
    java.lang.Object var11 = var0.getTreeLock();
    javax.swing.JToolTip var12 = var0.createToolTip();
    java.awt.event.HierarchyListener[] var13 = var12.getHierarchyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test198");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.firePropertyChange("ISO-8859-1", 0L, (-1L));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setValueAt((java.lang.Object)"ISO-8859-1", (-3), 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test199");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    boolean var2 = var0.isPromptForPasswordEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test200");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("hi!s");
    var0.setHighQuality(true);
    java.lang.String var7 = var0.getSupportedVersions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "dot version 2.2.1 or versions greater than 2.4"+ "'", var7.equals("dot version 2.2.1 or versions greater than 2.4"));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test201");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    boolean var13 = var6.hasFocus();
    boolean var14 = var6.getFocusTraversalKeysEnabled();
    boolean var15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var17 = var16.isManagingFocus();
    java.awt.Rectangle var18 = var16.getVisibleRect();
    java.awt.Rectangle var19 = var6.getBounds(var18);
    java.awt.Dimension var20 = var6.getPreferredSize();
    var0.setMinimumSize(var20);
    javax.swing.TransferHandler var22 = var0.getTransferHandler();
    java.awt.event.WindowListener[] var23 = var0.getWindowListeners();
    boolean var24 = var0.isForegroundSet();
    var0.setAlwaysOnTop(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test202");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    java.awt.Toolkit var6 = var0.getToolkit();
    boolean var7 = var0.isFocused();
    java.awt.Point var8 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test203");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    var0.setAlignmentY(100.0f);
    boolean var11 = var0.isVisible();
    var0.addNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test204");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    int var2 = var0.findColumn("a");
    net.sourceforge.schemaspy.util.DbSpecificConfig var4 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setDbSpecificConfig(var4);
    javax.swing.event.TableModelListener[] var6 = var0.getTableModelListeners();
    var0.fireTableRowsInserted(100, 100);
    javax.swing.event.TableModelListener[] var10 = var0.getTableModelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test205");


    net.sourceforge.schemaspy.view.HtmlAnomaliesPage var0 = net.sourceforge.schemaspy.view.HtmlAnomaliesPage.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test206");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    boolean var13 = var6.hasFocus();
    boolean var14 = var6.getFocusTraversalKeysEnabled();
    boolean var15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var17 = var16.isManagingFocus();
    java.awt.Rectangle var18 = var16.getVisibleRect();
    java.awt.Rectangle var19 = var6.getBounds(var18);
    java.awt.Dimension var20 = var6.getPreferredSize();
    var0.setMinimumSize(var20);
    var0.toBack();
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    float var28 = var23.getAlignmentX();
    boolean var31 = var23.contains(1, (-1));
    var23.setOpaque(false);
    boolean var34 = var23.getInheritsPopupMenu();
    var0.setGlassPane((java.awt.Component)var23);
    net.sourceforge.schemaspy.ui.DbConfigPanel var37 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var37.requestFocus();
    java.beans.PropertyChangeListener[] var39 = var37.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var40 = var37.getBaselineResizeBehavior();
    javax.swing.InputMap var41 = var37.getInputMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.setInputMap(3, var41);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test207");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("ISO-8859-1");
    int var2 = var1.getSize();
    java.lang.Object var3 = var1.getSelectedItem();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.getElementAt(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test208");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    var0.setSize(1, (-1));
    java.awt.image.VolatileImage var14 = var0.createVolatileImage(1, (-3));
    java.awt.Graphics var15 = var0.getGraphics();
    var0.firePropertyChange("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'", false, true);
    var0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test209");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.flush();
    var3.flush();
    char[] var7 = new char[] { ' '};
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.write(var7, 3, 10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test210");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    float var13 = var8.getAlignmentX();
    var8.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var19 = var8.getMouseListeners();
    boolean var20 = var0.isAncestorOf((java.awt.Component)var8);
    javax.swing.TransferHandler var21 = var8.getTransferHandler();
    net.sourceforge.schemaspy.ui.DbConfigPanel var22 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var22.requestFocus();
    java.beans.PropertyChangeListener[] var24 = var22.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var25 = var22.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var26 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var26.requestFocus();
    var26.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var30 = var26.insets();
    var26.setAlignmentX(1.0f);
    var26.doLayout();
    boolean var34 = var26.isCursorSet();
    var26.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var39 = var26.getLocation();
    boolean var40 = var22.contains(var39);
    net.sourceforge.schemaspy.ui.DbConfigPanel var41 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var41.requestFocus();
    var41.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var45 = var41.insets();
    var41.setAlignmentX(1.0f);
    boolean var48 = var41.hasFocus();
    boolean var49 = var41.getFocusTraversalKeysEnabled();
    var41.setSize(1, (-1));
    boolean var54 = var41.requestFocus(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var55 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var55.requestFocus();
    java.beans.PropertyChangeListener[] var57 = var55.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var58 = var55.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var59 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var59.requestFocus();
    var59.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var63 = var59.insets();
    var59.setAlignmentX(1.0f);
    var59.doLayout();
    boolean var67 = var59.isCursorSet();
    var59.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var72 = var59.getLocation();
    boolean var73 = var55.contains(var72);
    java.awt.Point var74 = var41.getLocation(var72);
    java.awt.Component var75 = var22.getComponentAt(var72);
    java.awt.Component var76 = var8.getComponentAt(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test211");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    java.awt.event.HierarchyListener[] var9 = var0.getHierarchyListeners();
    var0.setFocusTraversalPolicyProvider(false);
    java.awt.Container var12 = var0.getFocusCycleRootAncestor();
    net.sourceforge.schemaspy.ui.DbConfigPanel var13 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var13.requestFocus();
    var13.setFocusTraversalPolicyProvider(true);
    boolean var17 = var13.requestFocusInWindow();
    net.sourceforge.schemaspy.ui.DbConfigPanel var18 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var18.requestFocus();
    java.beans.PropertyChangeListener[] var20 = var18.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var21 = var18.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var22 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var22.requestFocus();
    var22.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var26 = var22.insets();
    var22.setAlignmentX(1.0f);
    var22.doLayout();
    boolean var30 = var22.isCursorSet();
    var22.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var35 = var22.getLocation();
    boolean var36 = var18.contains(var35);
    java.awt.Component var37 = var13.findComponentAt(var35);
    var13.setOpaque(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var40 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var40.requestFocus();
    var40.setFocusTraversalPolicyProvider(true);
    java.awt.Point var45 = var40.getMousePosition(true);
    int var46 = var40.getComponentCount();
    int var47 = var40.getHeight();
    var40.setName("hi!s");
    net.sourceforge.schemaspy.ui.DbConfigPanel var50 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var50.requestFocus();
    var50.setFocusTraversalPolicyProvider(true);
    java.awt.Point var55 = var50.getMousePosition(true);
    java.awt.Component var56 = var50.getNextFocusableComponent();
    java.awt.Dimension var57 = var50.getMinimumSize();
    var40.setSize(var57);
    var13.resize(var57);
    java.awt.Dimension var60 = var0.getSize(var57);
    var0.setFocusable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test212");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("ISO-8859-1");
    int var2 = var1.getSize();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var3 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var3.fireTableRowsInserted(2, 1);
    java.lang.Class var8 = var3.getClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var9 = var1.<java.util.EventListener>getListeners(var8);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test213");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    var0.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var11 = var0.getMouseListeners();
    var0.setAutoscrolls(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test214");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("hi!s");
    boolean var5 = var0.requiresGdRenderer();
    boolean var6 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test215");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.Set var3 = var1.entrySet();
    net.sourceforge.schemaspy.Config var4 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var5 = var4.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var15 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var16 = var15.getDataAccess();
    java.lang.String var17 = var15.getDefinitionLanguage();
    java.util.List var18 = var15.getParameters();
    var4.setColumnDetails(var18);
    var4.setPort((java.lang.Integer)0);
    var4.setDb("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    java.util.regex.Pattern var24 = var4.getIndirectColumnExclusions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var25 = var1.remove((java.lang.Object)var24);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "a"+ "'", var17.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test216");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    java.awt.event.HierarchyBoundsListener[] var5 = var0.getHierarchyBoundsListeners();
    boolean var6 = var0.requestFocusInWindow();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var7 = var0.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test217");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.lang.String var4 = var0.getParam("hi!s");
    boolean var5 = var0.isSchemaDisabled();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTableExclusions("[]");
      fail("Expected exception of type java.util.regex.PatternSyntaxException");
    } catch (java.util.regex.PatternSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test218");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isHtmlGenerationEnabled();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var4 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var4.clear();
    var0.setDbSpecificOptions((java.util.Map)var4);
    var0.setEvaluateAllEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test219");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Class var5 = var0.getClass(3);
    int var7 = var0.findColumn("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test220");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("ISO-8859-1");
    int var2 = var1.getSize();
    java.lang.Object var3 = var1.getSelectedItem();
    int var4 = var1.getSize();
    int var5 = var1.getSize();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var6 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var6.fireTableRowsInserted(2, 1);
    java.lang.Class var11 = var6.getClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var12 = var1.<java.util.EventListener>getListeners(var11);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test221");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var3 = var0.getBaselineResizeBehavior();
    boolean var4 = var0.isDisplayable();
    java.awt.Container var5 = var0.getTopLevelAncestor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var7 = var0.getFocusTraversalKeys((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test222");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    net.sourceforge.schemaspy.ui.DbConfigPanel var2 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var2.requestFocus();
    java.beans.PropertyChangeListener[] var4 = var2.getPropertyChangeListeners();
    var2.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var10 = var2.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var11 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var11.requestFocus();
    var11.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var15 = var11.insets();
    var11.setAlignmentX(1.0f);
    java.awt.Color var18 = var11.getForeground();
    var2.setForeground(var18);
    java.awt.Container var20 = var2.getFocusCycleRootAncestor();
    boolean var21 = var2.getInheritsPopupMenu();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var22 = var0.add("4", (java.awt.Component)var2);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test223");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var7 = var0.getModalExclusionType();
    net.sourceforge.schemaspy.model.Routine var17 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    java.lang.String var18 = var17.getDefinition();
    net.sourceforge.schemaspy.model.Routine var28 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var29 = var28.getDataAccess();
    java.lang.String var30 = var28.getDefinitionLanguage();
    int var31 = var17.compareTo(var28);
    java.util.List var32 = var17.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var33 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var32);
    java.util.List var34 = net.sourceforge.schemaspy.DbAnalyzer.getOrphans((java.util.Collection)var32);
    var0.setIconImages(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "a"+ "'", var30.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test224");


    net.sourceforge.schemaspy.Config.MissingRequiredParameterException var3 = new net.sourceforge.schemaspy.Config.MissingRequiredParameterException("hi!s", "hi!s", false);
    java.lang.Throwable[] var4 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test225");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    java.lang.String var3 = var0.getRenderer();
    boolean var4 = var0.isHighQuality();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test226");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isHtmlGenerationEnabled();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var4 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var4.clear();
    var0.setDbSpecificOptions((java.util.Map)var4);
    boolean var7 = var0.isLogoEnabled();
    boolean var8 = var0.isOneOfMultipleSchemas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test227");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    net.sourceforge.schemaspy.ui.DbConfigPanel var24 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var24.requestFocus();
    var24.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var28 = var24.insets();
    var24.reshape(1, 1, 1, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var34 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var34.requestFocus();
    var34.setFocusTraversalPolicyProvider(true);
    java.awt.Point var39 = var34.getMousePosition(true);
    java.awt.Component var40 = var34.getNextFocusableComponent();
    java.awt.Dimension var41 = var34.getMinimumSize();
    java.awt.Dimension var42 = var24.getSize(var41);
    java.awt.Rectangle var43 = var24.bounds();
    var0.setLocationRelativeTo((java.awt.Component)var24);
    java.awt.Rectangle var45 = var24.bounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test228");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    java.lang.String var2 = var0.getCharset();
    boolean var3 = var0.isViewsEnabled();
    var0.setConnectionPropertiesFile("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "ISO-8859-1"+ "'", var2.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test229");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var2 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("4", "Unknown");

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test230");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    net.sourceforge.schemaspy.ui.MainFrame var9 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var10 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var11 = var10.getTableExclusions();
    boolean var12 = var10.isEvaluateAllEnabled();
    java.util.List var13 = var10.getColumnDetails();
    var9.setIconImages(var13);
    boolean var15 = var9.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var16 = var9.getModalExclusionType();
    net.sourceforge.schemaspy.ui.DbConfigPanel var17 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var17.requestFocus();
    var17.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var21 = var17.insets();
    var17.setAlignmentX(1.0f);
    boolean var24 = var17.hasFocus();
    boolean var25 = var17.getFocusTraversalKeysEnabled();
    boolean var26 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var17);
    net.sourceforge.schemaspy.ui.DbConfigPanel var27 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var28 = var27.isManagingFocus();
    java.awt.Rectangle var29 = var27.getVisibleRect();
    java.awt.Rectangle var30 = var17.getBounds(var29);
    java.awt.Dimension var31 = var17.getPreferredSize();
    var9.setSize(var31);
    var0.setMaximumSize(var31);
    var0.setSize(3, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test231");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.reshape(1, 1, 1, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Point var15 = var10.getMousePosition(true);
    java.awt.Component var16 = var10.getNextFocusableComponent();
    java.awt.Dimension var17 = var10.getMinimumSize();
    java.awt.Dimension var18 = var0.getSize(var17);
    boolean var19 = var0.getFocusTraversalKeysEnabled();
    var0.revalidate();
    var0.setFocusTraversalPolicyProvider(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test232");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    net.sourceforge.schemaspy.ui.DbConfigPanel var24 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var24.requestFocus();
    var24.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var28 = var24.insets();
    var24.setAlignmentX(1.0f);
    boolean var31 = var24.hasFocus();
    boolean var32 = var24.getFocusTraversalKeysEnabled();
    boolean var33 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var24);
    var24.firePropertyChange("hi!", 'a', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var38 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var39 = var38.isManagingFocus();
    int var40 = var38.getWidth();
    java.awt.Insets var41 = var38.insets();
    javax.accessibility.AccessibleContext var42 = var38.getAccessibleContext();
    boolean var45 = var38.inside(100, (-3));
    java.awt.Rectangle var46 = var38.getVisibleRect();
    var24.setBounds(var46);
    var0.setMaximizedBounds(var46);
    java.awt.Window[] var49 = var0.getOwnedWindows();
    boolean var50 = var0.isLocationByPlatform();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test233");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    var0.setAlignmentY(100.0f);
    java.lang.Object var11 = var0.getTreeLock();
    javax.swing.JToolTip var12 = var0.createToolTip();
    java.beans.PropertyChangeListener[] var13 = var0.getPropertyChangeListeners();
    var0.transferFocusDownCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test234");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    var0.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var13 = var0.getLocation();
    var0.removeAll();
    java.awt.Component var15 = var0.getNextFocusableComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test235");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    var0.setEncodeCommentsEnabled(true);
    var0.setRankDirBugEnabled(false);
    var0.setRenderer("hi!s");

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test236");


    net.sourceforge.schemaspy.MultipleSchemaAnalyzer var0 = net.sourceforge.schemaspy.MultipleSchemaAnalyzer.getInstance();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    java.lang.String var12 = var11.getDefinition();
    net.sourceforge.schemaspy.model.Routine var22 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var23 = var22.getDataAccess();
    java.lang.String var24 = var22.getDefinitionLanguage();
    int var25 = var11.compareTo(var22);
    java.util.List var26 = var11.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var27 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var26);
    java.util.List var28 = net.sourceforge.schemaspy.DbAnalyzer.getOrphans((java.util.Collection)var26);
    net.sourceforge.schemaspy.Config var29 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var30 = var29.getTableExclusions();
    java.lang.String var31 = var29.getCharset();
    var29.setIndirectColumnExclusions("a");
    net.sourceforge.schemaspy.model.Routine var43 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var44 = var43.getDataAccess();
    java.util.List var45 = var43.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var46 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var45);
    java.util.List var47 = net.sourceforge.schemaspy.DbAnalyzer.getMustBeUniqueNullableColumns((java.util.Collection)var45);
    var29.setColumnDetails(var47);
    net.sourceforge.schemaspy.Config var49 = new net.sourceforge.schemaspy.Config();
    var49.setDb("a");
    java.lang.String var52 = var49.getServer();
    boolean var53 = var49.isHtmlGenerationEnabled();
    boolean var54 = var49.isMeterEnabled();
    java.lang.String var56 = var49.getParam("a");
    boolean var57 = var49.isEncodeCommentsEnabled();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.analyze("4", var26, var47, var49);
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "a"+ "'", var24.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "ISO-8859-1"+ "'", var31.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test237");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    java.awt.Point var3 = var0.getMousePosition();
    boolean var6 = var0.contains(1, (-1));
    var0.setDebugGraphicsOptions(300);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test238");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.lang.String var11 = var9.getComment();
    java.lang.String var12 = var9.getReturnType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "a"+ "'", var11.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "a"+ "'", var12.equals("a"));

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test239");


    net.sourceforge.schemaspy.util.DbSpecificOption var3 = new net.sourceforge.schemaspy.util.DbSpecificOption("hi!s", "dot version 2.2.1 or versions greater than 2.4", "net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s");

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test240");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    java.awt.Rectangle var2 = var0.getVisibleRect();
    boolean var3 = var0.getInheritsPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test241");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    var0.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var13 = var0.getLocation();
    var0.setSize(2, 10);
    java.awt.Component var19 = var0.getComponentAt(300, 300);
    int var20 = var0.getDebugGraphicsOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test242");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    var0.setAlignmentY(100.0f);
    java.lang.Object var11 = var0.getTreeLock();
    javax.swing.JToolTip var12 = var0.createToolTip();
    int var13 = var0.getDebugGraphicsOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test243");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.awt.Component var2 = var0.getNextFocusableComponent();
    java.lang.String var3 = var0.toString();
    boolean var5 = var0.requestFocus(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var3,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"+ "'", var3.equals("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var3,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test244");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    var0.firePropertyChange("hi!", 'a', 'a');
    javax.swing.TransferHandler var14 = var0.getTransferHandler();
    java.awt.Dimension var15 = var0.getPreferredSize();
    javax.swing.event.AncestorListener[] var16 = var0.getAncestorListeners();
    java.awt.dnd.DropTarget var17 = var0.getDropTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test245");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.writeln();
    var3.writeln();
    char[] var6 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.write(var6, (-3), 0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test246");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    int var7 = var6.getY();
    var0.remove((java.awt.Component)var6);
    java.awt.Component var11 = var6.findComponentAt(10, 1);
    net.sourceforge.schemaspy.ui.DbConfigPanel var12 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var12.requestFocus();
    var12.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var16 = var12.insets();
    float var17 = var12.getAlignmentX();
    boolean var20 = var12.contains(1, (-1));
    var12.transferFocus();
    var12.removeAll();
    var12.repaint(1L, (-3), (-3), (-1), 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.setComponentZOrder((java.awt.Component)var12, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test247");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.awt.Container var24 = var0.getContentPane();
    var0.removeNotify();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.createBufferStrategy(2);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test248");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = var0.isVisible();
    java.awt.Graphics var7 = var0.getGraphics();
    java.awt.Dimension var8 = var0.minimumSize();
    var0.firePropertyChange("", 100, (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test249");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(10, (-3));
    var0.fireTableStructureChanged();

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test250");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var3 = var0.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var4 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var4.requestFocus();
    var4.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var8 = var4.insets();
    var4.setAlignmentX(1.0f);
    var4.doLayout();
    boolean var12 = var4.isCursorSet();
    var4.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var17 = var4.getLocation();
    boolean var18 = var0.contains(var17);
    net.sourceforge.schemaspy.ui.DbConfigPanel var19 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var19.requestFocus();
    var19.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var23 = var19.insets();
    var19.setAlignmentX(1.0f);
    boolean var26 = var19.hasFocus();
    boolean var27 = var19.getFocusTraversalKeysEnabled();
    var19.setSize(1, (-1));
    boolean var32 = var19.requestFocus(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var33 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var33.requestFocus();
    java.beans.PropertyChangeListener[] var35 = var33.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var36 = var33.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var37 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var37.requestFocus();
    var37.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var41 = var37.insets();
    var37.setAlignmentX(1.0f);
    var37.doLayout();
    boolean var45 = var37.isCursorSet();
    var37.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var50 = var37.getLocation();
    boolean var51 = var33.contains(var50);
    java.awt.Point var52 = var19.getLocation(var50);
    java.awt.Component var53 = var0.getComponentAt(var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test251");


    net.sourceforge.schemaspy.util.PasswordReader var0 = net.sourceforge.schemaspy.util.PasswordReader.getInstance();
    net.sourceforge.schemaspy.model.ProcessExecutionException var2 = new net.sourceforge.schemaspy.model.ProcessExecutionException("a");
    net.sourceforge.schemaspy.util.PasswordReader.IOError var3 = var0.new IOError((java.lang.Throwable)var2);
    net.sourceforge.schemaspy.view.StyleSheet.ParseException var5 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    net.sourceforge.schemaspy.util.PasswordReader.IOError var6 = var0.new IOError((java.lang.Throwable)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test252");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    boolean var13 = var6.hasFocus();
    boolean var14 = var6.getFocusTraversalKeysEnabled();
    boolean var15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var17 = var16.isManagingFocus();
    java.awt.Rectangle var18 = var16.getVisibleRect();
    java.awt.Rectangle var19 = var6.getBounds(var18);
    java.awt.Dimension var20 = var6.getPreferredSize();
    var0.setMinimumSize(var20);
    javax.swing.TransferHandler var22 = var0.getTransferHandler();
    java.awt.event.WindowListener[] var23 = var0.getWindowListeners();
    boolean var24 = var0.isResizable();
    java.awt.Dialog.ModalExclusionType var25 = var0.getModalExclusionType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test253");


    net.sourceforge.schemaspy.model.ProcessExecutionException var1 = new net.sourceforge.schemaspy.model.ProcessExecutionException("a");
    net.sourceforge.schemaspy.model.ConnectionFailure var2 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var1);
    net.sourceforge.schemaspy.model.ConnectionFailure var3 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var2);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test254");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    var0.setFocusableWindowState(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setOpacity(10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test255");


    java.lang.String var1 = net.sourceforge.schemaspy.util.HtmlEncoder.encodeToken(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + " "+ "'", var1.equals(" "));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test256");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    var0.fireTableRowsDeleted(2, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var11 = var0.getClass(5);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test257");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.write(10);
    char[] var6 = new char[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.write(var6, 300, 300);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test258");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = var0.isVisible();
    var0.hide();
    java.awt.Dimension var8 = var0.getPreferredSize();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    java.beans.PropertyChangeListener[] var11 = var9.getPropertyChangeListeners();
    var9.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var17 = var9.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var18 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var18.requestFocus();
    var18.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var22 = var18.insets();
    var18.setAlignmentX(1.0f);
    java.awt.Color var25 = var18.getForeground();
    var9.setForeground(var25);
    java.awt.Container var27 = var9.getFocusCycleRootAncestor();
    boolean var28 = var9.getInheritsPopupMenu();
    net.sourceforge.schemaspy.ui.DbConfigPanel var29 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var29.requestFocus();
    var29.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var33 = var29.insets();
    var29.setAlignmentX(1.0f);
    var29.firePropertyChange("hi!", 10, 2);
    var29.setVisible(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var42 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var42.requestFocus();
    var42.setFocusTraversalPolicyProvider(true);
    java.awt.Point var47 = var42.getMousePosition(true);
    java.awt.Component var48 = var42.getNextFocusableComponent();
    java.awt.Dimension var49 = var42.getMinimumSize();
    var29.setPreferredSize(var49);
    var9.setMinimumSize(var49);
    var0.setMinimumSize(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test259");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    javax.swing.InputVerifier var8 = var0.getInputVerifier();
    var0.repaint(100L, 10, 1, 0, 100);
    java.awt.Component.BaselineResizeBehavior var15 = var0.getBaselineResizeBehavior();
    var0.hide();
    var0.paintImmediately(3, (-1), 5, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test260");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    var0.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var11 = var0.getMouseListeners();
    var0.setAutoscrolls(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var15 = var0.getComponent(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test261");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var26 = var0.getBaseline(1, (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test262");


    net.sourceforge.schemaspy.view.HtmlColumnsPage var0 = net.sourceforge.schemaspy.view.HtmlColumnsPage.getInstance();
    java.util.Map var1 = var0.getColumnInfos();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test263");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.lang.String var13 = var11.getDefinitionLanguage();
    java.util.List var14 = var11.getParameters();
    var0.setColumnDetails(var14);
    boolean var16 = var0.isRankDirBugEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test264");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    int var6 = var0.getComponentCount();
    boolean var7 = var0.getVerifyInputWhenFocusTarget();
    boolean var8 = var0.requestFocusInWindow();
    java.lang.Object var9 = var0.getTreeLock();
    java.awt.image.ColorModel var10 = var0.getColorModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test265");


    net.sourceforge.schemaspy.view.HtmlConstraintsPage var0 = net.sourceforge.schemaspy.view.HtmlConstraintsPage.getInstance();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    var1.setDb("a");
    java.lang.String var4 = var1.getServer();
    boolean var5 = var1.isHtmlGenerationEnabled();
    java.util.regex.Pattern var6 = var1.getColumnExclusions();
    java.util.List var7 = var1.getColumnDetails();
    net.sourceforge.schemaspy.util.LineWriter var11 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var11.write(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.writeCheckConstraints((java.util.Collection)var7, var11);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test266");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    java.lang.String var3 = var0.getSupportedVersions();
    java.lang.String var4 = var0.getRenderer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "dot version 2.2.1 or versions greater than 2.4"+ "'", var3.equals("dot version 2.2.1 or versions greater than 2.4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test267");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    var0.setSize(1, (-1));
    java.awt.image.VolatileImage var14 = var0.createVolatileImage(1, (-3));
    java.awt.Graphics var15 = var0.getGraphics();
    var0.firePropertyChange("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'", false, true);
    var0.reshape((-3), 1, 5, (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test268");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    boolean var13 = var6.hasFocus();
    boolean var14 = var6.getFocusTraversalKeysEnabled();
    boolean var15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var17 = var16.isManagingFocus();
    java.awt.Rectangle var18 = var16.getVisibleRect();
    java.awt.Rectangle var19 = var6.getBounds(var18);
    java.awt.Dimension var20 = var6.getPreferredSize();
    var0.setMinimumSize(var20);
    var0.toBack();
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    float var28 = var23.getAlignmentX();
    boolean var31 = var23.contains(1, (-1));
    var23.setOpaque(false);
    boolean var34 = var23.getInheritsPopupMenu();
    var0.setGlassPane((java.awt.Component)var23);
    net.sourceforge.schemaspy.ui.MainFrame var36 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var37 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var38 = var37.getTableExclusions();
    boolean var39 = var37.isEvaluateAllEnabled();
    java.util.List var40 = var37.getColumnDetails();
    var36.setIconImages(var40);
    boolean var42 = var36.isAlwaysOnTop();
    var36.setFocusableWindowState(true);
    boolean var45 = var36.isFocusCycleRoot();
    java.awt.Graphics var46 = var36.getGraphics();
    boolean var47 = var36.isFocusCycleRoot();
    net.sourceforge.schemaspy.ui.MainFrame var48 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var49 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var49.requestFocus();
    var49.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var53 = var49.insets();
    var49.setAlignmentX(1.0f);
    java.awt.Color var56 = var49.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var57 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var57.requestFocus();
    var57.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var61 = var57.insets();
    float var62 = var57.getAlignmentX();
    var57.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var68 = var57.getMouseListeners();
    java.awt.Rectangle var69 = var57.bounds();
    var49.setBounds(var69);
    var48.setMaximizedBounds(var69);
    java.awt.Container var72 = var48.getContentPane();
    boolean var73 = var48.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.MainFrame var74 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var75 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var76 = var75.getTableExclusions();
    boolean var77 = var75.isEvaluateAllEnabled();
    java.util.List var78 = var75.getColumnDetails();
    var74.setIconImages(var78);
    boolean var80 = var74.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var81 = var74.getModalExclusionType();
    var48.setModalExclusionType(var81);
    var48.setEnabled(true);
    javax.swing.JLayeredPane var85 = var48.getLayeredPane();
    var36.setLayeredPane(var85);
    var0.setLayeredPane(var85);
    boolean var88 = var85.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test269");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableStructureChanged();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var2 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var2.fireTableRowsInserted(2, 1);
    java.lang.Class var7 = var2.getClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var8 = var0.<java.util.EventListener>getListeners(var7);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test270");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    var0.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var11 = var0.getBounds();
    var0.setFocusTraversalPolicyProvider(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test271");


    boolean var1 = net.sourceforge.schemaspy.util.Inflection.isUncountable("ISO-8859-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test272");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.lang.String var4 = var0.getParam("hi!s");
    boolean var5 = var0.isSchemaDisabled();
    var0.setGraphvizDir("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test273");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    net.sourceforge.schemaspy.ui.DbConfigPanel var5 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var5.requestFocus();
    java.beans.PropertyChangeListener[] var7 = var5.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var8 = var5.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    var9.setAlignmentX(1.0f);
    var9.doLayout();
    boolean var17 = var9.isCursorSet();
    var9.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var22 = var9.getLocation();
    boolean var23 = var5.contains(var22);
    java.awt.Component var24 = var0.findComponentAt(var22);
    boolean var25 = var0.isRequestFocusEnabled();
    boolean var26 = var0.isFocusCycleRoot();
    var0.setEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test274");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    var0.setEncodeCommentsEnabled(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setIndirectColumnExclusions("hi!s{hi!s}hi!s");
      fail("Expected exception of type java.util.regex.PatternSyntaxException");
    } catch (java.util.regex.PatternSyntaxException e) {
      // Expected exception.
    }

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test275");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    boolean var8 = var0.contains(1, (-1));
    var0.setOpaque(false);
    boolean var11 = var0.isRequestFocusEnabled();
    boolean var14 = var0.contains(300, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test276");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("hi!s");
    var0.setHighQuality(true);
    boolean var7 = var0.supportsCenteredEastWestEdges();
    var0.setFormat("hi!");
    java.lang.String var10 = var0.getSupportedVersions();
    java.lang.String var11 = var0.getRenderer();
    var0.setFormat("ISO-8859-1");
    boolean var14 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "dot version 2.2.1 or versions greater than 2.4"+ "'", var10.equals("dot version 2.2.1 or versions greater than 2.4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test277");


    net.sourceforge.schemaspy.Config.MissingRequiredParameterException var3 = new net.sourceforge.schemaspy.Config.MissingRequiredParameterException("ISO-8859-1", "ISO-8859-1", false);
    boolean var4 = var3.isDbTypeSpecific();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test278");


    boolean var1 = net.sourceforge.schemaspy.util.Inflection.isUncountable("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test279");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    boolean var5 = var0.isFontSet();
    var0.transferFocusUpCycle();
    boolean var7 = var0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test280");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    java.lang.Object var5 = var0.getTreeLock();
    var0.setAutoscrolls(true);
    var0.setRequestFocusEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test281");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    net.sourceforge.schemaspy.ui.DbConfigPanel var24 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var24.requestFocus();
    var24.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var28 = var24.insets();
    var24.reshape(1, 1, 1, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var34 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var34.requestFocus();
    var34.setFocusTraversalPolicyProvider(true);
    java.awt.Point var39 = var34.getMousePosition(true);
    java.awt.Component var40 = var34.getNextFocusableComponent();
    java.awt.Dimension var41 = var34.getMinimumSize();
    java.awt.Dimension var42 = var24.getSize(var41);
    java.awt.Rectangle var43 = var24.bounds();
    var0.setLocationRelativeTo((java.awt.Component)var24);
    net.sourceforge.schemaspy.ui.MainFrame var45 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var46 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var46.requestFocus();
    var46.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var50 = var46.insets();
    var46.setAlignmentX(1.0f);
    java.awt.Color var53 = var46.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var54 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var54.requestFocus();
    var54.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var58 = var54.insets();
    float var59 = var54.getAlignmentX();
    var54.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var65 = var54.getMouseListeners();
    java.awt.Rectangle var66 = var54.bounds();
    var46.setBounds(var66);
    var45.setMaximizedBounds(var66);
    java.awt.Container var69 = var45.getContentPane();
    boolean var70 = var45.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.MainFrame var71 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var72 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var73 = var72.getTableExclusions();
    boolean var74 = var72.isEvaluateAllEnabled();
    java.util.List var75 = var72.getColumnDetails();
    var71.setIconImages(var75);
    boolean var77 = var71.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var78 = var71.getModalExclusionType();
    var45.setModalExclusionType(var78);
    var0.setModalExclusionType(var78);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var82 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var83 = var82.entrySet();
    java.util.Set var84 = var82.entrySet();
    java.util.List var85 = net.sourceforge.schemaspy.DbAnalyzer.getMustBeUniqueNullableColumns((java.util.Collection)var84);
    var0.setIconImages(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test282");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    var0.setEncodeCommentsEnabled(true);
    var0.setRankDirBugEnabled(false);
    var0.setSqlFormatter("hi!");
    var0.setHost("");
    boolean var11 = var0.isNumRowsEnabled();
    boolean var12 = var0.isLowQuality();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test283");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    var0.setFocusableWindowState(true);
    java.awt.Window[] var9 = var0.getOwnedWindows();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var10 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var10.fireTableRowsInserted(2, 1);
    java.lang.Class var15 = var10.getClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var16 = var0.<java.util.EventListener>getListeners(var15);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test284");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    boolean var13 = var6.hasFocus();
    boolean var14 = var6.getFocusTraversalKeysEnabled();
    boolean var15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var17 = var16.isManagingFocus();
    java.awt.Rectangle var18 = var16.getVisibleRect();
    java.awt.Rectangle var19 = var6.getBounds(var18);
    java.awt.Dimension var20 = var6.getPreferredSize();
    var0.setMinimumSize(var20);
    var0.toBack();
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    float var28 = var23.getAlignmentX();
    boolean var31 = var23.contains(1, (-1));
    var23.setOpaque(false);
    boolean var34 = var23.getInheritsPopupMenu();
    var0.setGlassPane((java.awt.Component)var23);
    net.sourceforge.schemaspy.ui.MainFrame var36 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var37 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var37.requestFocus();
    var37.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var41 = var37.insets();
    var37.setAlignmentX(1.0f);
    java.awt.Color var44 = var37.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var45 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var45.requestFocus();
    var45.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var49 = var45.insets();
    float var50 = var45.getAlignmentX();
    var45.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var56 = var45.getMouseListeners();
    java.awt.Rectangle var57 = var45.bounds();
    var37.setBounds(var57);
    var36.setMaximizedBounds(var57);
    net.sourceforge.schemaspy.ui.DbConfigPanel var60 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var60.requestFocus();
    var60.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var64 = var60.insets();
    var60.setAlignmentX(1.0f);
    boolean var67 = var60.hasFocus();
    boolean var68 = var60.getFocusTraversalKeysEnabled();
    boolean var69 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var60);
    var60.firePropertyChange("hi!", 'a', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var74 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var75 = var74.isManagingFocus();
    int var76 = var74.getWidth();
    java.awt.Insets var77 = var74.insets();
    javax.accessibility.AccessibleContext var78 = var74.getAccessibleContext();
    boolean var81 = var74.inside(100, (-3));
    java.awt.Rectangle var82 = var74.getVisibleRect();
    var60.setBounds(var82);
    var36.setMaximizedBounds(var82);
    var0.setBounds(var82);
    java.awt.Window[] var86 = var0.getOwnedWindows();
    var0.removeNotify();
    var0.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test285");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.reshape(1, 1, 1, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Point var15 = var10.getMousePosition(true);
    java.awt.Component var16 = var10.getNextFocusableComponent();
    java.awt.Dimension var17 = var10.getMinimumSize();
    java.awt.Dimension var18 = var0.getSize(var17);
    boolean var19 = var0.getFocusTraversalKeysEnabled();
    boolean var20 = var0.getInheritsPopupMenu();
    boolean var21 = var0.isValidateRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test286");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.Version var1 = new net.sourceforge.schemaspy.util.Version("net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test287");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.Set var3 = var1.entrySet();
    boolean var4 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test288");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    var0.setFocusableWindowState(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    boolean var17 = var9.contains(1, (-1));
    var9.transferFocus();
    var9.removeAll();
    java.awt.Component var21 = var0.add((java.awt.Component)var9, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var23 = var0.areFocusTraversalKeysSet((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test289");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    java.util.regex.Pattern var5 = var0.getIndirectColumnExclusions();
    var0.setImpliedConstraintsEnabled(true);
    java.util.regex.Pattern var8 = var0.getTableExclusions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test290");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    java.lang.String var7 = var0.getParam("a");
    java.lang.String var8 = var0.getDescription();
    boolean var9 = var0.isPromptForPasswordEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test291");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    var0.fireTableRowsUpdated(2, 5);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test292");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    var0.setBounds(0, 1, 10, 100);
    var0.repaint(0L, (-1), 1, (-3), (-3));
    java.awt.im.InputMethodRequests var17 = var0.getInputMethodRequests();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test293");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isHtmlGenerationEnabled();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var4 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var4.clear();
    var0.setDbSpecificOptions((java.util.Map)var4);
    java.lang.Object var7 = var4.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test294");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    var0.firePropertyChange("hi!", 'a', 'a');
    boolean var14 = var0.isFocusTraversalPolicySet();
    var0.setVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test295");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    var0.setVisible(false);
    java.awt.Point var9 = var0.getMousePosition(false);
    boolean var10 = var0.isDoubleBuffered();
    javax.swing.TransferHandler var11 = var0.getTransferHandler();
    java.awt.Container var12 = var0.getFocusCycleRootAncestor();
    java.awt.Component var15 = var0.getComponentAt(0, 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test296");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    java.lang.Integer var2 = var0.getPort();
    var0.setConnectionProperties("a");
    boolean var5 = var0.hasRoutines();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test297");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isRankDirBugEnabled();
    var0.setMaxDetailedTabled(0);
    var0.setHasOrphans(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test298");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Component var1 = var0.getGlassPane();
    net.sourceforge.schemaspy.ui.DbConfigPanel var2 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var2.requestFocus();
    java.beans.PropertyChangeListener[] var4 = var2.getPropertyChangeListeners();
    var2.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var10 = var2.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var11 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var11.requestFocus();
    var11.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var15 = var11.insets();
    var11.setAlignmentX(1.0f);
    java.awt.Color var18 = var11.getForeground();
    var2.setForeground(var18);
    java.awt.Container var20 = var2.getFocusCycleRootAncestor();
    boolean var21 = var2.getInheritsPopupMenu();
    net.sourceforge.schemaspy.ui.DbConfigPanel var22 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var22.requestFocus();
    var22.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var26 = var22.insets();
    var22.setAlignmentX(1.0f);
    var22.firePropertyChange("hi!", 10, 2);
    var22.setVisible(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var35 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var35.requestFocus();
    var35.setFocusTraversalPolicyProvider(true);
    java.awt.Point var40 = var35.getMousePosition(true);
    java.awt.Component var41 = var35.getNextFocusableComponent();
    java.awt.Dimension var42 = var35.getMinimumSize();
    var22.setPreferredSize(var42);
    var2.setMinimumSize(var42);
    var0.resize(var42);
    java.awt.Dialog.ModalExclusionType var46 = var0.getModalExclusionType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test299");


    net.sourceforge.schemaspy.util.DbSpecificOption var2 = new net.sourceforge.schemaspy.util.DbSpecificOption("a", "Unknown");

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test300");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var1.clear();
    java.util.List var3 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var1);
    java.util.Set var4 = var1.entrySet();
    net.sourceforge.schemaspy.Config var5 = new net.sourceforge.schemaspy.Config();
    var5.setDb("a");
    java.lang.String var8 = var5.getServer();
    boolean var9 = var5.isHtmlGenerationEnabled();
    java.lang.String var10 = var5.getSchemaSpec();
    var5.setViewsEnabled(false);
    boolean var13 = var1.containsValue((java.lang.Object)false);
    java.util.Set var14 = var1.keySet();
    net.sourceforge.schemaspy.Config var15 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var16 = var15.getTableExclusions();
    java.lang.String var17 = var15.getCharset();
    var15.setIndirectColumnExclusions("a");
    net.sourceforge.schemaspy.model.Routine var29 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var30 = var29.getDataAccess();
    java.util.List var31 = var29.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var32 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var31);
    java.util.List var33 = net.sourceforge.schemaspy.DbAnalyzer.getMustBeUniqueNullableColumns((java.util.Collection)var31);
    var15.setColumnDetails(var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var35 = var1.remove((java.lang.Object)var33);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "ISO-8859-1"+ "'", var17.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test301");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var7 = var0.getModalExclusionType();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    var8.setAlignmentX(1.0f);
    boolean var15 = var8.hasFocus();
    boolean var16 = var8.getFocusTraversalKeysEnabled();
    boolean var17 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var8);
    net.sourceforge.schemaspy.ui.DbConfigPanel var18 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var19 = var18.isManagingFocus();
    java.awt.Rectangle var20 = var18.getVisibleRect();
    java.awt.Rectangle var21 = var8.getBounds(var20);
    java.awt.Dimension var22 = var8.getPreferredSize();
    var0.setSize(var22);
    java.awt.im.InputContext var24 = var0.getInputContext();
    java.lang.String var25 = var0.getWarningString();
    net.sourceforge.schemaspy.ui.MainFrame var26 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var27 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var28 = var27.getTableExclusions();
    boolean var29 = var27.isEvaluateAllEnabled();
    java.util.List var30 = var27.getColumnDetails();
    var26.setIconImages(var30);
    boolean var32 = var26.isAlwaysOnTop();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setContentPane((java.awt.Container)var26);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test302");


    net.sourceforge.schemaspy.util.DbSpecificOption var2 = new net.sourceforge.schemaspy.util.DbSpecificOption("ISO-8859-1", "ISO-8859-1");

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test303");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    var0.fireTableDataChanged();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var5 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var5.fireTableRowsInserted(2, 1);
    java.lang.Class var10 = var5.getClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var11 = var0.<java.util.EventListener>getListeners(var10);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test304");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    java.awt.Component var2 = var0.getMostRecentFocusOwner();
    var0.setState(1);
    net.sourceforge.schemaspy.ui.DbConfigPanel var5 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var5.requestFocus();
    var5.setFocusTraversalPolicyProvider(true);
    boolean var9 = var5.requestFocusInWindow();
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    java.beans.PropertyChangeListener[] var12 = var10.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var13 = var10.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var14 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var14.requestFocus();
    var14.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var18 = var14.insets();
    var14.setAlignmentX(1.0f);
    var14.doLayout();
    boolean var22 = var14.isCursorSet();
    var14.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var27 = var14.getLocation();
    boolean var28 = var10.contains(var27);
    java.awt.Component var29 = var5.findComponentAt(var27);
    boolean var30 = var5.isRequestFocusEnabled();
    net.sourceforge.schemaspy.ui.DbConfigPanel var31 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var31.requestFocus();
    var31.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var35 = var31.insets();
    var31.setAlignmentX(1.0f);
    boolean var38 = var31.hasFocus();
    boolean var39 = var31.getFocusTraversalKeysEnabled();
    var31.setSize(1, (-1));
    boolean var44 = var31.requestFocus(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var45 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var45.requestFocus();
    java.beans.PropertyChangeListener[] var47 = var45.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var48 = var45.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var49 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var49.requestFocus();
    var49.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var53 = var49.insets();
    var49.setAlignmentX(1.0f);
    var49.doLayout();
    boolean var57 = var49.isCursorSet();
    var49.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var62 = var49.getLocation();
    boolean var63 = var45.contains(var62);
    java.awt.Point var64 = var31.getLocation(var62);
    java.awt.Point var65 = var5.getLocation(var62);
    java.awt.Point var66 = var0.getLocation(var65);
    java.awt.Container var67 = var0.getContentPane();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.applyResourceBundle("hi!s{hi!s}hi!s");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test305");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    boolean var7 = var0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test306");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    boolean var7 = var0.isBackgroundSet();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var10 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var11 = var10.entrySet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys(5, var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test307");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Point var6 = var0.getLocation();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var7 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var7.fireTableRowsInserted(2, 1);
    java.lang.Class var12 = var7.getClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var13 = var0.<java.util.EventListener>getListeners(var12);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test308");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    var0.setTableInclusions("");
    var0.setConnectionProperties("Unknown");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test309");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("hi!s{hi!s}hi!s");
      fail("Expected exception of type java.util.regex.PatternSyntaxException");
    } catch (java.util.regex.PatternSyntaxException e) {
      // Expected exception.
    }

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test310");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.List var2 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var1);
    java.lang.String var3 = var1.toString();
    net.sourceforge.schemaspy.ui.DbConfigPanel var4 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var4.requestFocus();
    var4.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var8 = var4.insets();
    float var9 = var4.getAlignmentX();
    boolean var12 = var4.contains(1, (-1));
    var4.setOpaque(false);
    var4.repaint(10L);
    java.awt.Dimension var17 = var4.getSize();
    java.awt.Rectangle var18 = var4.getBounds();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var19 = var1.remove((java.lang.Object)var4);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test311");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("ISO-8859-1");
    int var2 = var1.getSize();
    int var3 = var1.getSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.getElementAt(2);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test312");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    javax.swing.InputVerifier var8 = var0.getInputVerifier();
    var0.repaint(100L, 10, 1, 0, 100);
    java.awt.Component.BaselineResizeBehavior var15 = var0.getBaselineResizeBehavior();
    var0.hide();
    boolean var17 = var0.isRequestFocusEnabled();
    javax.swing.border.Border var18 = var0.getBorder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test313");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    boolean var9 = var0.isCellEditable(5, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test314");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    var0.paintImmediately(0, (-1), (-1), 0);
    var0.firePropertyChange("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin", ' ', ' ');
    java.awt.Font var12 = var0.getFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test315");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    net.sourceforge.schemaspy.ui.MainFrame var2 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var3 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var3.requestFocus();
    var3.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var7 = var3.insets();
    var3.setAlignmentX(1.0f);
    java.awt.Color var10 = var3.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var11 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var11.requestFocus();
    var11.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var15 = var11.insets();
    float var16 = var11.getAlignmentX();
    var11.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var22 = var11.getMouseListeners();
    java.awt.Rectangle var23 = var11.bounds();
    var3.setBounds(var23);
    var2.setMaximizedBounds(var23);
    java.awt.Container var26 = var2.getContentPane();
    boolean var27 = var2.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.MainFrame var28 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var29 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var30 = var29.getTableExclusions();
    boolean var31 = var29.isEvaluateAllEnabled();
    java.util.List var32 = var29.getColumnDetails();
    var28.setIconImages(var32);
    boolean var34 = var28.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var35 = var28.getModalExclusionType();
    var2.setModalExclusionType(var35);
    var2.pack();
    java.awt.Window.Type var38 = var2.getType();
    var0.setType(var38);
    java.awt.event.WindowStateListener[] var40 = var0.getWindowStateListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test316");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    int var7 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test317");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var10 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var11 = var10.entrySet();
    var0.setFocusTraversalKeys(0, var11);
    java.util.List var13 = net.sourceforge.schemaspy.DbAnalyzer.getTablesWithOneColumn((java.util.Collection)var11);
    java.util.List var14 = net.sourceforge.schemaspy.DbAnalyzer.getOrphans((java.util.Collection)var13);
    java.util.List var15 = net.sourceforge.schemaspy.DbAnalyzer.getDefaultNullStringColumns((java.util.Collection)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test318");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    var0.setSqlFormatter("hi!");
    java.io.File var4 = var0.getGraphvizDir();
    var0.setHost("hi!s");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.view.SqlFormatter var7 = var0.getSqlFormatter();
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test319");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    var0.setFocusableWindowState(true);
    java.awt.Window[] var9 = var0.getOwnedWindows();
    java.awt.Component var10 = var0.getMostRecentFocusOwner();
    java.awt.event.WindowStateListener[] var11 = var0.getWindowStateListeners();
    java.awt.image.ColorModel var12 = var0.getColorModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test320");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.awt.Container var24 = var0.getContentPane();
    net.sourceforge.schemaspy.ui.DbConfigPanel var25 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var26 = var25.isManagingFocus();
    java.awt.Rectangle var27 = var25.getVisibleRect();
    var0.setBounds(var27);
    var0.removeAll();
    java.awt.Container var30 = var0.getContentPane();
    java.awt.dnd.DropTarget var31 = var30.getDropTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test321");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    var0.firePropertyChange("hi!", 10L, 10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var12 = var0.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test322");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    var0.paintImmediately(0, (-1), (-1), 0);
    boolean var8 = var0.isForegroundSet();
    var0.validate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test323");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    var0.setSqlFormatter("hi!");
    java.io.File var4 = var0.getGraphvizDir();
    boolean var5 = var0.isRankDirBugEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test324");


    net.sourceforge.schemaspy.view.StyleSheet.ParseException var1 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException("PanelUI");

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test325");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    var0.setFocusableWindowState(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var10 = var9.isManagingFocus();
    int var11 = var9.getWidth();
    javax.swing.InputVerifier var12 = var9.getInputVerifier();
    net.sourceforge.schemaspy.ui.DbConfigPanel var13 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var13.requestFocus();
    var13.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var17 = var13.insets();
    var13.requestFocus();
    boolean var19 = var13.isVisible();
    java.awt.Dimension var20 = var13.preferredSize();
    java.awt.Dimension var21 = var9.getSize(var20);
    var0.setSize(var20);
    java.lang.String var23 = var0.getWarningString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var25 = var0.getFocusTraversalKeys(312);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test326");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.setIgnoreRepaint(true);
    java.awt.Component var8 = var0.getNextFocusableComponent();
    net.sourceforge.schemaspy.ui.MainFrame var9 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var10 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var11 = var10.getTableExclusions();
    boolean var12 = var10.isEvaluateAllEnabled();
    java.util.List var13 = var10.getColumnDetails();
    var9.setIconImages(var13);
    boolean var15 = var9.isAlwaysOnTop();
    var9.setFocusableWindowState(true);
    boolean var18 = var9.isFocusCycleRoot();
    java.awt.Graphics var19 = var9.getGraphics();
    boolean var20 = var9.isFocusCycleRoot();
    java.awt.Dimension var21 = var9.size();
    var0.setMaximumSize(var21);
    float var23 = var0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.5f);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test327");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    var0.paintImmediately(10, 100, 2, 10);
    net.sourceforge.schemaspy.ui.DbConfigPanel var13 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var13.requestFocus();
    var13.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var17 = var13.insets();
    var13.setAlignmentX(1.0f);
    java.awt.Color var20 = var13.getForeground();
    javax.swing.InputVerifier var21 = var13.getInputVerifier();
    var13.repaint(100L, 10, 1, 0, 100);
    var13.setEnabled(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var30 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var30.requestFocus();
    java.beans.PropertyChangeListener[] var32 = var30.getPropertyChangeListeners();
    var30.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var38 = var30.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var39 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var39.requestFocus();
    var39.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var43 = var39.insets();
    var39.setAlignmentX(1.0f);
    java.awt.Color var46 = var39.getForeground();
    var30.setForeground(var46);
    var13.setBackground(var46);
    var0.remove((java.awt.Component)var13);
    java.awt.event.FocusListener[] var50 = var13.getFocusListeners();
    int var51 = var13.getHeight();
    net.sourceforge.schemaspy.ui.MainFrame var52 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var53 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var53.requestFocus();
    var53.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var57 = var53.insets();
    var53.setAlignmentX(1.0f);
    java.awt.Color var60 = var53.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var61 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var61.requestFocus();
    var61.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var65 = var61.insets();
    float var66 = var61.getAlignmentX();
    var61.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var72 = var61.getMouseListeners();
    java.awt.Rectangle var73 = var61.bounds();
    var53.setBounds(var73);
    var52.setMaximizedBounds(var73);
    java.awt.Container var76 = var52.getContentPane();
    boolean var77 = var52.isLocationByPlatform();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setComponentZOrder((java.awt.Component)var52, 300);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test328");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.lang.String var13 = var11.getDefinitionLanguage();
    java.util.List var14 = var11.getParameters();
    var0.setColumnDetails(var14);
    var0.setPort((java.lang.Integer)0);
    var0.setDb("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    var0.setPromptForPasswordEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test329");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.setOpaque(false);
    java.awt.Image var10 = var0.createImage(1, 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test330");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    var0.repaint(100, 1, 10, (-1));
    int var10 = var0.getX();
    net.sourceforge.schemaspy.ui.MainFrame var11 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var12 = var11.getType();
    var11.hide();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var14 = var0.add((java.awt.Component)var11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test331");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    float var13 = var8.getAlignmentX();
    var8.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var19 = var8.getMouseListeners();
    boolean var20 = var0.isAncestorOf((java.awt.Component)var8);
    var0.setFocusTraversalPolicyProvider(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    var23.setAlignmentX(1.0f);
    var23.doLayout();
    boolean var31 = var23.isCursorSet();
    java.awt.Insets var32 = var23.getInsets();
    java.awt.Insets var33 = var0.getInsets(var32);
    int var34 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test332");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var1.clear();
    java.util.List var3 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var1);
    var1.clear();
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test333");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    boolean var8 = var1.hasFocus();
    boolean var9 = var1.getFocusTraversalKeysEnabled();
    var1.setSize(1, (-1));
    boolean var14 = var1.requestFocus(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var15 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var15.requestFocus();
    java.beans.PropertyChangeListener[] var17 = var15.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var18 = var15.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var19 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var19.requestFocus();
    var19.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var23 = var19.insets();
    var19.setAlignmentX(1.0f);
    var19.doLayout();
    boolean var27 = var19.isCursorSet();
    var19.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var32 = var19.getLocation();
    boolean var33 = var15.contains(var32);
    java.awt.Point var34 = var1.getLocation(var32);
    java.awt.Component var35 = var0.add((java.awt.Component)var1);
    var35.firePropertyChange("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 0.0f, 1.0f);
    java.beans.PropertyChangeListener[] var41 = var35.getPropertyChangeListeners("{}s");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test334");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.lang.String var11 = var9.getComment();
    java.lang.String var12 = var9.getSecurityType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "a"+ "'", var11.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test335");


    net.sourceforge.schemaspy.util.DbSpecificConfig var1 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    net.sourceforge.schemaspy.Config var2 = var1.getConfig();
    net.sourceforge.schemaspy.Config var3 = var1.getConfig();
    var3.setIndirectColumnExclusions("ISO-8859-1s");
    var3.setHtmlGenerationEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test336");


    java.lang.String var4 = net.sourceforge.schemaspy.model.Table.getFullName("{}s", "net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", "hi!", " ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var4,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. "+ "'", var4.equals("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var4,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. "));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test337");


    net.sourceforge.schemaspy.TableOrderer var0 = new net.sourceforge.schemaspy.TableOrderer();
    net.sourceforge.schemaspy.ui.MainFrame var1 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var2 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var2.requestFocus();
    var2.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var6 = var2.insets();
    var2.setAlignmentX(1.0f);
    java.awt.Color var9 = var2.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var14 = var10.insets();
    float var15 = var10.getAlignmentX();
    var10.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var21 = var10.getMouseListeners();
    java.awt.Rectangle var22 = var10.bounds();
    var2.setBounds(var22);
    var1.setMaximizedBounds(var22);
    java.util.List var25 = var1.getIconImages();
    net.sourceforge.schemaspy.model.Routine var35 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    java.lang.String var36 = var35.getDefinition();
    net.sourceforge.schemaspy.model.Routine var46 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var47 = var46.getDataAccess();
    java.lang.String var48 = var46.getDefinitionLanguage();
    int var49 = var35.compareTo(var46);
    java.util.List var50 = var35.getParameters();
    java.util.List var51 = var0.getTablesOrderedByRI((java.util.Collection)var25, (java.util.Collection)var50);
    net.sourceforge.schemaspy.view.WriteStats var52 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "a"+ "'", var48.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test338");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.reshape(1, 1, 1, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Point var15 = var10.getMousePosition(true);
    java.awt.Component var16 = var10.getNextFocusableComponent();
    java.awt.Dimension var17 = var10.getMinimumSize();
    java.awt.Dimension var18 = var0.getSize(var17);
    var0.repaint(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test339");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.lang.String var4 = var0.getParam("hi!s");
    boolean var5 = var0.isSchemaDisabled();
    java.lang.String var6 = var0.getMeta();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test340");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var4 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ConnectionFailure var6 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    java.lang.String var7 = var4.getParamName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test341");


    net.sourceforge.schemaspy.util.Inflection var2 = new net.sourceforge.schemaspy.util.Inflection("DbSpecificOption name: 'net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s' value: 'null' description: 'a'", "ISO-8859-1s");
    java.lang.String var4 = var2.replace("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin"+ "'", var4.equals("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin"));

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test342");


    net.sourceforge.schemaspy.util.PasswordReader var0 = net.sourceforge.schemaspy.util.PasswordReader.getInstance();
    net.sourceforge.schemaspy.model.ProcessExecutionException var2 = new net.sourceforge.schemaspy.model.ProcessExecutionException("a");
    net.sourceforge.schemaspy.util.PasswordReader.IOError var3 = var0.new IOError((java.lang.Throwable)var2);
    net.sourceforge.schemaspy.model.ConnectionFailure var4 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var3);
    java.lang.Throwable[] var5 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test343");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.LineWriter var2 = new net.sourceforge.schemaspy.util.LineWriter("4", "ISO-8859-1s");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test344");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    var0.paintImmediately(1, 0, 0, (-1));
    var0.repaint(10L, (-1), 10, 11, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test345");


    net.sourceforge.schemaspy.Config.MissingRequiredParameterException var3 = new net.sourceforge.schemaspy.Config.MissingRequiredParameterException("4", "hi!s", true);
    boolean var4 = var3.isDbTypeSpecific();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test346");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.setOpaque(false);
    var0.invalidate();
    java.awt.event.KeyListener[] var9 = var0.getKeyListeners();
    net.sourceforge.schemaspy.ui.MainFrame var10 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var11 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var12 = var11.getTableExclusions();
    boolean var13 = var11.isEvaluateAllEnabled();
    java.util.List var14 = var11.getColumnDetails();
    var10.setIconImages(var14);
    net.sourceforge.schemaspy.ui.MainFrame var16 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var17 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var17.requestFocus();
    var17.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var21 = var17.insets();
    var17.setAlignmentX(1.0f);
    java.awt.Color var24 = var17.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var25 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var25.requestFocus();
    var25.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var29 = var25.insets();
    float var30 = var25.getAlignmentX();
    var25.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var36 = var25.getMouseListeners();
    java.awt.Rectangle var37 = var25.bounds();
    var17.setBounds(var37);
    var16.setMaximizedBounds(var37);
    java.awt.Container var40 = var16.getContentPane();
    boolean var41 = var16.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.MainFrame var42 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var43 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var44 = var43.getTableExclusions();
    boolean var45 = var43.isEvaluateAllEnabled();
    java.util.List var46 = var43.getColumnDetails();
    var42.setIconImages(var46);
    boolean var48 = var42.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var49 = var42.getModalExclusionType();
    var16.setModalExclusionType(var49);
    var16.setEnabled(true);
    java.awt.Color var53 = var16.getBackground();
    var10.setForeground(var53);
    var0.setForeground(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test347");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    int var6 = var0.getComponentCount();
    boolean var7 = var0.getVerifyInputWhenFocusTarget();
    boolean var8 = var0.requestFocusInWindow();
    boolean var9 = var0.isMinimumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test348");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    var0.setFocusableWindowState(true);
    java.awt.Window[] var9 = var0.getOwnedWindows();
    boolean var10 = var0.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test349");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.util.List var3 = var0.getColumnDetails();
    java.lang.String var4 = var0.getSchemaSpec();
    var0.setDbType("hi!s");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setConnectionPropertiesFile("hi!s{hi!s}hi!s");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test350");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    java.lang.String var7 = var0.getParam("a");
    boolean var8 = var0.isViewsEnabled();
    int var9 = var0.getFontSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 11);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test351");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.util.List var3 = var0.getColumnDetails();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = net.sourceforge.schemaspy.DbAnalyzer.getDefaultNullStringColumns((java.util.Collection)var3);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test352");


    net.sourceforge.schemaspy.util.PasswordReader var1 = net.sourceforge.schemaspy.util.PasswordReader.getInstance();
    net.sourceforge.schemaspy.model.ProcessExecutionException var3 = new net.sourceforge.schemaspy.model.ProcessExecutionException("a");
    net.sourceforge.schemaspy.util.PasswordReader.IOError var4 = var1.new IOError((java.lang.Throwable)var3);
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure("dot version 2.2.1 or versions greater than 2.4", (java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test353");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.hasOrphans();
    var0.setHtmlGenerationEnabled(true);
    java.lang.String var7 = var0.getSchema();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test354");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.doLayout();
    var0.firePropertyChange("hi!", 0.0d, 10.0d);
    java.awt.Component var11 = var0.getNextFocusableComponent();
    java.awt.Rectangle var12 = var0.bounds();
    var0.setToolTipText("{}");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test355");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var7 = var0.getTableModelListeners();
    var0.fireTableRowsUpdated(0, 3);
    int var12 = var0.findColumn("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.fireTableRowsDeleted(11, 2);
    net.sourceforge.schemaspy.ui.DbConfigTableModel var16 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var16.fireTableRowsInserted(2, 1);
    java.lang.Class var21 = var16.getClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var22 = var0.<java.util.EventListener>getListeners(var21);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test356");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    var0.setFocusCycleRoot(true);
    boolean var4 = var0.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test357");


    net.sourceforge.schemaspy.util.DbSpecificOption var2 = new net.sourceforge.schemaspy.util.DbSpecificOption("", "ISO-8859-1");
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.getDescription();
    java.lang.Object var5 = var2.getValue();
    net.sourceforge.schemaspy.ui.MainFrame var6 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var7 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var8 = var7.getTableExclusions();
    boolean var9 = var7.isEvaluateAllEnabled();
    java.util.List var10 = var7.getColumnDetails();
    var6.setIconImages(var10);
    boolean var12 = var6.isAlwaysOnTop();
    var6.setFocusableWindowState(true);
    java.awt.Window[] var15 = var6.getOwnedWindows();
    java.awt.Component var16 = var6.getMostRecentFocusOwner();
    var2.setValue((java.lang.Object)var6);
    java.util.List var18 = var6.getIconImages();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var19 = net.sourceforge.schemaspy.DbAnalyzer.getImpliedConstraints((java.util.Collection)var18);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var3.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "ISO-8859-1"+ "'", var4.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test358");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    int var1 = var0.getY();
    var0.resetKeyboardActions();
    net.sourceforge.schemaspy.ui.DbConfigPanel var3 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var3.requestFocus();
    var3.setFocusTraversalPolicyProvider(true);
    boolean var7 = var3.requestFocusInWindow();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    java.beans.PropertyChangeListener[] var10 = var8.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var11 = var8.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var12 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var12.requestFocus();
    var12.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var16 = var12.insets();
    var12.setAlignmentX(1.0f);
    var12.doLayout();
    boolean var20 = var12.isCursorSet();
    var12.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var25 = var12.getLocation();
    boolean var26 = var8.contains(var25);
    java.awt.Component var27 = var3.findComponentAt(var25);
    var0.setLocation(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test359");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var7 = var0.getModalExclusionType();
    boolean var8 = var0.isAutoRequestFocus();
    java.awt.Toolkit var9 = var0.getToolkit();
    boolean var10 = var0.isVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test360");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var2 = var1.entrySet();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var4 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.List var5 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var4);
    net.sourceforge.schemaspy.Config var6 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var7 = var6.getTableExclusions();
    boolean var8 = var6.isHtmlGenerationEnabled();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var10 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var10.clear();
    var6.setDbSpecificOptions((java.util.Map)var10);
    java.lang.String var13 = var10.toString();
    var4.putAll((java.util.Map)var10);
    var1.putAll((java.util.Map)var10);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var16.requestFocus();
    var16.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var20 = var16.insets();
    var16.setAlignmentX(1.0f);
    boolean var23 = var16.hasFocus();
    var16.paintImmediately(10, 100, 2, 10);
    java.awt.Point var29 = var16.getLocation();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var30 = var1.get((java.lang.Object)var29);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "{}"+ "'", var13.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test361");


    net.sourceforge.schemaspy.util.Inflection var2 = new net.sourceforge.schemaspy.util.Inflection("DbSpecificOption name: 'net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s' value: 'null' description: 'a'", "ISO-8859-1s");
    boolean var4 = var2.match("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test362");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    var0.fireTableRowsDeleted(2, 0);
    int var10 = var0.getRowCount();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var11 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var11.fireTableRowsInserted(2, 1);
    java.lang.Object var17 = var11.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var18 = var11.getTableModelListeners();
    var11.fireTableRowsUpdated(0, 3);
    int var23 = var11.findColumn("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var11.fireTableRowsDeleted(11, 2);
    java.lang.Class var28 = var11.getClass(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var29 = var0.<java.util.EventListener>getListeners(var28);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test363");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    var0.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var8 = var0.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    var9.setAlignmentX(1.0f);
    java.awt.Color var16 = var9.getForeground();
    var0.setForeground(var16);
    boolean var18 = var0.hasFocus();
    java.awt.event.MouseListener[] var19 = var0.getMouseListeners();
    boolean var22 = var0.contains(2, (-3));
    java.awt.Insets var23 = var0.getInsets();
    java.awt.Component.BaselineResizeBehavior var24 = var0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test364");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    java.lang.String var6 = var0.getDb();
    java.util.regex.Pattern var7 = var0.getTableExclusions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "a"+ "'", var6.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test365");


    net.sourceforge.schemaspy.util.Version var1 = new net.sourceforge.schemaspy.util.Version("");
    net.sourceforge.schemaspy.util.Version var3 = new net.sourceforge.schemaspy.util.Version("");
    int var4 = var1.compareTo(var3);
    net.sourceforge.schemaspy.util.Version var6 = new net.sourceforge.schemaspy.util.Version("");
    int var7 = var1.compareTo(var6);
    boolean var9 = var1.equals((java.lang.Object)(-1L));
    net.sourceforge.schemaspy.util.Version var11 = new net.sourceforge.schemaspy.util.Version("");
    net.sourceforge.schemaspy.util.Version var13 = new net.sourceforge.schemaspy.util.Version("");
    int var14 = var11.compareTo(var13);
    net.sourceforge.schemaspy.util.Version var16 = new net.sourceforge.schemaspy.util.Version("");
    int var17 = var11.compareTo(var16);
    int var18 = var1.compareTo(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test366");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = net.sourceforge.schemaspy.DbAnalyzer.getOrphans((java.util.Collection)var4);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test367");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    java.awt.Insets var3 = var0.insets();
    javax.accessibility.AccessibleContext var4 = var0.getAccessibleContext();
    boolean var7 = var0.inside(100, (-3));
    java.awt.Rectangle var8 = var0.getVisibleRect();
    java.awt.Point var9 = var0.getLocation();
    var0.requestFocus();
    boolean var11 = var0.isManagingFocus();
    var0.nextFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test368");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.awt.Container var24 = var0.getContentPane();
    net.sourceforge.schemaspy.ui.DbConfigPanel var25 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var26 = var25.isManagingFocus();
    java.awt.Rectangle var27 = var25.getVisibleRect();
    var0.setBounds(var27);
    var0.hide();
    java.util.List var30 = var0.getIconImages();
    javax.swing.TransferHandler var31 = var0.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test369");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    var0.firePropertyChange("hi!", 'a', 'a');
    java.lang.String var14 = var0.getUIClassID();
    java.awt.Point var16 = var0.getMousePosition(false);
    java.awt.Point var17 = var0.location();
    float var18 = var0.getAlignmentX();
    var0.setBounds(100, 0, (-3), 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PanelUI"+ "'", var14.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1.0f);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test370");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isRankDirBugEnabled();
    var0.setMaxDetailedTabled(0);
    java.lang.String var5 = var0.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test371");


    net.sourceforge.schemaspy.util.DbSpecificConfig var1 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    net.sourceforge.schemaspy.Config var2 = var1.getConfig();
    boolean var3 = var2.isDbHelpRequired();
    var2.setTableExclusions("Value");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test372");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    net.sourceforge.schemaspy.ui.DbConfigPanel var24 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var24.requestFocus();
    var24.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var28 = var24.insets();
    var24.reshape(1, 1, 1, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var34 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var34.requestFocus();
    var34.setFocusTraversalPolicyProvider(true);
    java.awt.Point var39 = var34.getMousePosition(true);
    java.awt.Component var40 = var34.getNextFocusableComponent();
    java.awt.Dimension var41 = var34.getMinimumSize();
    java.awt.Dimension var42 = var24.getSize(var41);
    java.awt.Rectangle var43 = var24.bounds();
    var0.setLocationRelativeTo((java.awt.Component)var24);
    javax.accessibility.AccessibleContext var45 = var24.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test373");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = var0.isVisible();
    java.awt.Graphics var7 = var0.getGraphics();
    javax.swing.TransferHandler var8 = var0.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test374");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("ISO-8859-1");
    int var2 = var1.getSize();
    javax.swing.event.ListDataListener[] var3 = var1.getListDataListeners();
    java.lang.Object var4 = var1.getSelectedItem();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test375");


    net.sourceforge.schemaspy.view.HtmlConstraintsPage var0 = net.sourceforge.schemaspy.view.HtmlConstraintsPage.getInstance();
    net.sourceforge.schemaspy.ui.MainFrame var1 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var2 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var2.requestFocus();
    var2.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var6 = var2.insets();
    var2.setAlignmentX(1.0f);
    java.awt.Color var9 = var2.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var14 = var10.insets();
    float var15 = var10.getAlignmentX();
    var10.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var21 = var10.getMouseListeners();
    java.awt.Rectangle var22 = var10.bounds();
    var2.setBounds(var22);
    var1.setMaximizedBounds(var22);
    java.awt.Container var25 = var1.getContentPane();
    net.sourceforge.schemaspy.ui.DbConfigPanel var26 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var27 = var26.isManagingFocus();
    java.awt.Rectangle var28 = var26.getVisibleRect();
    var1.setBounds(var28);
    var1.hide();
    java.util.List var31 = var1.getIconImages();
    net.sourceforge.schemaspy.util.LineWriter var35 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var35.writeln();
    var0.writeCheckConstraints((java.util.Collection)var31, var35);
    var35.flush();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test376");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.HierarchyListener[] var1 = var0.getHierarchyListeners();
    var0.setName("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test377");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    var0.firePropertyChange("hi!", 'a', 'a');
    java.lang.String var14 = var0.getUIClassID();
    var0.repaint();
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var16.requestFocus();
    var16.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var20 = var16.insets();
    var16.setAlignmentX(1.0f);
    java.awt.Color var23 = var16.getForeground();
    javax.swing.InputVerifier var24 = var16.getInputVerifier();
    var16.repaint(100L, 10, 1, 0, 100);
    var16.setEnabled(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var33 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var33.requestFocus();
    java.beans.PropertyChangeListener[] var35 = var33.getPropertyChangeListeners();
    var33.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var41 = var33.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var42 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var42.requestFocus();
    var42.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var46 = var42.insets();
    var42.setAlignmentX(1.0f);
    java.awt.Color var49 = var42.getForeground();
    var33.setForeground(var49);
    var16.setBackground(var49);
    var0.setBackground(var49);
    java.awt.Point var53 = var0.getMousePosition();
    var0.repaint(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PanelUI"+ "'", var14.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test378");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Component var1 = var0.getGlassPane();
    java.awt.Shape var2 = var0.getShape();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test379");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    boolean var13 = var6.hasFocus();
    boolean var14 = var6.getFocusTraversalKeysEnabled();
    boolean var15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var17 = var16.isManagingFocus();
    java.awt.Rectangle var18 = var16.getVisibleRect();
    java.awt.Rectangle var19 = var6.getBounds(var18);
    java.awt.Dimension var20 = var6.getPreferredSize();
    var0.setMinimumSize(var20);
    var0.toBack();
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    float var28 = var23.getAlignmentX();
    boolean var31 = var23.contains(1, (-1));
    var23.setOpaque(false);
    boolean var34 = var23.getInheritsPopupMenu();
    var0.setGlassPane((java.awt.Component)var23);
    var0.setState((-1));
    boolean var38 = var0.isPreferredSizeSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.applyResourceBundle("ISO-8859-1s");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test380");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    java.lang.String var7 = var0.getParam("a");
    var0.setPromptForPasswordEnabled(false);
    java.lang.String var10 = var0.getCatalog();
    java.lang.String var11 = var0.getDescription();
    java.util.regex.Pattern var12 = var0.getColumnExclusions();
    boolean var13 = var0.isImpliedConstraintsEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test381");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.firePropertyChange("hi!", 10, 2);
    var0.paintImmediately(100, 10, 2, 0);
    javax.swing.InputVerifier var16 = var0.getInputVerifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test382");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.awt.Container var24 = var0.getContentPane();
    net.sourceforge.schemaspy.ui.DbConfigPanel var25 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var26 = var25.isManagingFocus();
    java.awt.Rectangle var27 = var25.getVisibleRect();
    var0.setBounds(var27);
    var0.hide();
    java.util.List var30 = var0.getIconImages();
    net.sourceforge.schemaspy.ui.DbConfigPanel var31 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var31.requestFocus();
    var31.setFocusTraversalPolicyProvider(true);
    var31.firePropertyChange("a", (byte)10, (byte)0);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var41 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var42 = var41.entrySet();
    var31.setFocusTraversalKeys(0, var42);
    var0.setLocationRelativeTo((java.awt.Component)var31);
    java.awt.Component var45 = var0.getMostRecentFocusOwner();
    net.sourceforge.schemaspy.ui.DbConfigPanel var46 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var46.requestFocus();
    var46.setFocusTraversalPolicyProvider(true);
    boolean var50 = var46.requestFocusInWindow();
    java.awt.Cursor var51 = var46.getCursor();
    net.sourceforge.schemaspy.ui.DbConfigPanel var52 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var52.requestFocus();
    var52.setFocusTraversalPolicyProvider(true);
    java.awt.Point var57 = var52.getMousePosition(true);
    int var58 = var52.getComponentCount();
    int var59 = var52.getHeight();
    var52.setName("hi!s");
    net.sourceforge.schemaspy.ui.DbConfigPanel var62 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var62.requestFocus();
    var62.setFocusTraversalPolicyProvider(true);
    java.awt.Point var67 = var62.getMousePosition(true);
    java.awt.Component var68 = var62.getNextFocusableComponent();
    java.awt.Dimension var69 = var62.getMinimumSize();
    var52.setSize(var69);
    var46.setPreferredSize(var69);
    var45.setMaximumSize(var69);
    boolean var73 = var45.isForegroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test383");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.util.List var24 = var0.getIconImages();
    java.awt.Rectangle var25 = var0.getMaximizedBounds();
    var0.setVisible(true);
    var0.firePropertyChange("4", '#', '#');
    java.awt.Component var32 = var0.getMostRecentFocusOwner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test384");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.firePropertyChange("hi!", 10, 2);
    var0.paintImmediately(100, 10, 2, 0);
    net.sourceforge.schemaspy.ui.DbConfigTableModel var16 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var16.fireTableRowsInserted(2, 1);
    java.lang.Class var21 = var16.getClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var22 = var0.<java.util.EventListener>getListeners(var21);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test385");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.util.List var24 = var0.getIconImages();
    java.awt.Rectangle var25 = var0.getMaximizedBounds();
    net.sourceforge.schemaspy.ui.DbConfigPanel var26 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var26.requestFocus();
    var26.setFocusTraversalPolicyProvider(true);
    boolean var30 = var26.requestFocusInWindow();
    java.awt.Cursor var31 = var26.getCursor();
    java.awt.Point var32 = var26.location();
    var0.setLocation(var32);
    boolean var36 = var0.contains(3, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test386");


    net.sourceforge.schemaspy.util.DbSpecificOption var2 = new net.sourceforge.schemaspy.util.DbSpecificOption(" ", "/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");
    java.lang.String var3 = var2.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin"+ "'", var3.equals("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin"));

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test387");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.hasOrphans();
    java.util.regex.Pattern var5 = var0.getColumnExclusions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test388");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    java.io.File var2 = var0.getGraphvizDir();
    boolean var3 = var0.isEvaluateAllEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test389");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    float var13 = var8.getAlignmentX();
    var8.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var19 = var8.getMouseListeners();
    boolean var20 = var0.isAncestorOf((java.awt.Component)var8);
    var8.setOpaque(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test390");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    var0.removeNotify();
    java.awt.MenuBar var25 = var0.getMenuBar();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test391");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    java.lang.String var7 = var0.getParam("a");
    boolean var8 = var0.isEncodeCommentsEnabled();
    var0.setNumRowsEnabled(false);
    java.lang.String var11 = var0.getCss();
    var0.setSingleSignOn(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "schemaSpy.css"+ "'", var11.equals("schemaSpy.css"));

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test392");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    var0.setTableInclusions("");
    var0.setHasOrphans(true);
    var0.setUser("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setUser("Value");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test393");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.setOpaque(false);
    var0.enableInputMethods(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var14 = var10.insets();
    var10.setAlignmentX(1.0f);
    boolean var17 = var10.hasFocus();
    boolean var18 = var10.getFocusTraversalKeysEnabled();
    boolean var19 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var10);
    var10.firePropertyChange("hi!", 'a', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var24 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var25 = var24.isManagingFocus();
    int var26 = var24.getWidth();
    java.awt.Insets var27 = var24.insets();
    javax.accessibility.AccessibleContext var28 = var24.getAccessibleContext();
    boolean var31 = var24.inside(100, (-3));
    java.awt.Rectangle var32 = var24.getVisibleRect();
    var10.setBounds(var32);
    var0.paintImmediately(var32);
    net.sourceforge.schemaspy.ui.DbConfigPanel var36 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var36.requestFocus();
    var36.setFocusTraversalPolicyProvider(true);
    var36.firePropertyChange("a", (byte)10, (byte)0);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var46 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var47 = var46.entrySet();
    var36.setFocusTraversalKeys(0, var47);
    java.util.List var49 = net.sourceforge.schemaspy.DbAnalyzer.getTablesWithOneColumn((java.util.Collection)var47);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys(10, var47);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test394");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    boolean var13 = var6.hasFocus();
    boolean var14 = var6.getFocusTraversalKeysEnabled();
    boolean var15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var17 = var16.isManagingFocus();
    java.awt.Rectangle var18 = var16.getVisibleRect();
    java.awt.Rectangle var19 = var6.getBounds(var18);
    java.awt.Dimension var20 = var6.getPreferredSize();
    var0.setMinimumSize(var20);
    var0.toBack();
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    float var28 = var23.getAlignmentX();
    boolean var31 = var23.contains(1, (-1));
    var23.setOpaque(false);
    boolean var34 = var23.getInheritsPopupMenu();
    var0.setGlassPane((java.awt.Component)var23);
    var0.setState((-1));
    var0.toBack();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test395");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.Version var1 = new net.sourceforge.schemaspy.util.Version("Value");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test396");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    javax.swing.InputVerifier var8 = var0.getInputVerifier();
    var0.repaint(100L, 10, 1, 0, 100);
    var0.revalidate();
    var0.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test397");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    java.lang.String var2 = var0.getCharset();
    var0.setIndirectColumnExclusions("a");
    boolean var5 = var0.isEncodeCommentsEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "ISO-8859-1"+ "'", var2.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test398");


    net.sourceforge.schemaspy.util.DbSpecificOption var2 = new net.sourceforge.schemaspy.util.DbSpecificOption("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'", "net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    java.lang.Object var3 = var2.getValue();
    java.lang.String var4 = var2.getName();
    java.lang.String var5 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var4.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "DbSpecificOption name: 'DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'' value: 'null' description: 'net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var5,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]'"+ "'", var5.equals("DbSpecificOption name: 'DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'' value: 'null' description: 'net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var5,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]'"));

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test399");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.List var2 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var1);
    boolean var3 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test400");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    int var1 = var0.getY();
    var0.resetKeyboardActions();
    var0.setVerifyInputWhenFocusTarget(false);
    var0.setName("net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test401");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.lang.String var11 = var9.getDefinitionLanguage();
    net.sourceforge.schemaspy.model.Routine var21 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var22 = var21.getDataAccess();
    java.lang.String var23 = var21.getComment();
    int var24 = var9.compareTo(var21);
    net.sourceforge.schemaspy.model.Routine var34 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    int var35 = var9.compareTo(var34);
    net.sourceforge.schemaspy.model.Routine var45 = new net.sourceforge.schemaspy.model.Routine("a", "java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", "net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", "PanelUI", "/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin", false, "Value", "java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", "schemaSpy.css");
    int var46 = var9.compareTo(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "a"+ "'", var11.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "a"+ "'", var23.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test402");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    var0.setFocusCycleRoot(true);
    var0.toBack();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test403");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var7 = var0.getModalExclusionType();
    boolean var8 = var0.isAutoRequestFocus();
    java.awt.Toolkit var9 = var0.getToolkit();
    var0.hide();
    boolean var11 = var0.isAutoRequestFocus();
    boolean var12 = var0.isFocusCycleRoot();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setCursor(300);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test404");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var7 = var0.getModalExclusionType();
    boolean var8 = var0.isAutoRequestFocus();
    java.awt.Toolkit var9 = var0.getToolkit();
    var0.hide();
    boolean var11 = var0.isAutoRequestFocus();
    boolean var12 = var0.isLightweight();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setOpacity(0.0f);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test405");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    net.sourceforge.schemaspy.Config var5 = var2.getConfig();
    java.lang.Integer var6 = var5.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test406");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    var0.setMaxDetailedTabled(100);
    net.sourceforge.schemaspy.Config var4 = new net.sourceforge.schemaspy.Config();
    var4.setDb("a");
    java.lang.String var7 = var4.getServer();
    boolean var8 = var4.isHtmlGenerationEnabled();
    var4.setOutputDir("hi!");
    net.sourceforge.schemaspy.Config var11 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var12 = var11.getTableExclusions();
    var11.setSqlFormatter("hi!");
    net.sourceforge.schemaspy.view.DefaultSqlFormatter var15 = new net.sourceforge.schemaspy.view.DefaultSqlFormatter();
    var11.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var15);
    var4.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var15);
    var0.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test407");


    net.sourceforge.schemaspy.view.StyleSheet.ParseException var1 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    net.sourceforge.schemaspy.view.StyleSheet.ParseException var2 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException((java.lang.Exception)var1);
    net.sourceforge.schemaspy.view.StyleSheet.ParseException var4 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException("hi!");
    var2.addSuppressed((java.lang.Throwable)var4);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test408");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    java.util.Locale var5 = var0.getLocale();
    java.beans.VetoableChangeListener[] var6 = var0.getVetoableChangeListeners();
    boolean var7 = var0.isDisplayable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test409");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    boolean var13 = var6.hasFocus();
    boolean var14 = var6.getFocusTraversalKeysEnabled();
    boolean var15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var17 = var16.isManagingFocus();
    java.awt.Rectangle var18 = var16.getVisibleRect();
    java.awt.Rectangle var19 = var6.getBounds(var18);
    java.awt.Dimension var20 = var6.getPreferredSize();
    var0.setMinimumSize(var20);
    var0.toBack();
    boolean var23 = var0.getFocusTraversalKeysEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test410");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    java.beans.PropertyChangeListener[] var8 = var6.getPropertyChangeListeners();
    var6.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var14 = var6.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var15 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var15.requestFocus();
    var15.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var19 = var15.insets();
    var15.setAlignmentX(1.0f);
    java.awt.Color var22 = var15.getForeground();
    var6.setForeground(var22);
    var0.setBackground(var22);
    java.awt.Window.Type var25 = var0.getType();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.applyResourceBundle("ISO-8859-1");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test411");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("hi!s");
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var8 = var0.new DotFailure("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test412");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.awt.Container var24 = var0.getContentPane();
    net.sourceforge.schemaspy.ui.DbConfigPanel var25 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var26 = var25.isManagingFocus();
    java.awt.Rectangle var27 = var25.getVisibleRect();
    var0.setBounds(var27);
    var0.hide();
    java.util.List var30 = var0.getIconImages();
    net.sourceforge.schemaspy.ui.DbConfigPanel var31 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var31.requestFocus();
    var31.setFocusTraversalPolicyProvider(true);
    var31.firePropertyChange("a", (byte)10, (byte)0);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var41 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var42 = var41.entrySet();
    var31.setFocusTraversalKeys(0, var42);
    var0.setLocationRelativeTo((java.awt.Component)var31);
    var0.setAutoRequestFocus(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setOpacity(10.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test413");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    boolean var3 = var0.isEncodeCommentsEnabled();
    boolean var4 = var0.isRankDirBugEnabled();
    var0.setOutputDir("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");
    java.util.Map var7 = var0.getDbSpecificOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test414");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    var0.setFocusableWindowState(true);
    boolean var9 = var0.isFocusCycleRoot();
    java.awt.Graphics var10 = var0.getGraphics();
    boolean var11 = var0.isFocusCycleRoot();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.createBufferStrategy(3);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test415");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Point var15 = var10.getMousePosition(true);
    int var16 = var10.getComponentCount();
    int var17 = var10.getHeight();
    net.sourceforge.schemaspy.ui.DbConfigPanel var18 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var18.requestFocus();
    java.beans.PropertyChangeListener[] var20 = var18.getPropertyChangeListeners();
    var18.paintImmediately(0, (-1), (-1), 0);
    java.awt.Font var26 = var18.getFont();
    java.awt.FontMetrics var27 = var10.getFontMetrics(var26);
    java.awt.FontMetrics var28 = var0.getFontMetrics(var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var31 = var0.getBaseline((-1), 11);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test416");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.newLine();
    var3.writeln("[]");
    var3.write("hi!s{hi!s}hi!s");

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test417");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    java.awt.Insets var3 = var0.insets();
    net.sourceforge.schemaspy.ui.MainFrame var4 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var5 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var5.requestFocus();
    var5.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var9 = var5.insets();
    var5.setAlignmentX(1.0f);
    java.awt.Color var12 = var5.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var13 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var13.requestFocus();
    var13.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var17 = var13.insets();
    float var18 = var13.getAlignmentX();
    var13.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var24 = var13.getMouseListeners();
    java.awt.Rectangle var25 = var13.bounds();
    var5.setBounds(var25);
    var4.setMaximizedBounds(var25);
    net.sourceforge.schemaspy.ui.DbConfigPanel var28 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var28.requestFocus();
    var28.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var32 = var28.insets();
    var28.setAlignmentX(1.0f);
    boolean var35 = var28.hasFocus();
    boolean var36 = var28.getFocusTraversalKeysEnabled();
    boolean var37 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var28);
    var28.firePropertyChange("hi!", 'a', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var42 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var43 = var42.isManagingFocus();
    int var44 = var42.getWidth();
    java.awt.Insets var45 = var42.insets();
    javax.accessibility.AccessibleContext var46 = var42.getAccessibleContext();
    boolean var49 = var42.inside(100, (-3));
    java.awt.Rectangle var50 = var42.getVisibleRect();
    var28.setBounds(var50);
    var4.setMaximizedBounds(var50);
    java.awt.Window[] var53 = var4.getOwnedWindows();
    net.sourceforge.schemaspy.ui.DbConfigPanel var54 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var55 = var54.isManagingFocus();
    int var56 = var54.getWidth();
    javax.swing.InputVerifier var57 = var54.getInputVerifier();
    net.sourceforge.schemaspy.ui.DbConfigPanel var58 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var58.requestFocus();
    var58.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var62 = var58.insets();
    var58.requestFocus();
    boolean var64 = var58.isVisible();
    java.awt.Dimension var65 = var58.preferredSize();
    java.awt.Dimension var66 = var54.getSize(var65);
    var4.setSize(var65);
    java.beans.PropertyChangeListener[] var69 = var4.getPropertyChangeListeners("hi!s");
    boolean var70 = var4.isShowing();
    java.awt.Container var71 = var4.getParent();
    net.sourceforge.schemaspy.ui.DbConfigPanel var72 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var72.requestFocus();
    var72.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var76 = var72.insets();
    var72.setAlignmentX(1.0f);
    var72.firePropertyChange("hi!", 10, 2);
    net.sourceforge.schemaspy.ui.DbConfigPanel var83 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var83.requestFocus();
    var83.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var87 = var83.insets();
    float var88 = var83.getAlignmentX();
    var83.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var94 = var83.getBounds();
    var72.computeVisibleRect(var94);
    var4.setBounds(var94);
    var0.paintImmediately(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test418");


    net.sourceforge.schemaspy.util.Inflection var1 = new net.sourceforge.schemaspy.util.Inflection("ISO-8859-1");
    java.lang.String var3 = var1.replace("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var3,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"+ "'", var3.equals("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var3,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test419");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    var0.setSize(1, (-1));
    boolean var13 = var0.requestFocus(false);
    boolean var14 = var0.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test420");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = var0.isVisible();
    java.awt.Dimension var7 = var0.preferredSize();
    net.sourceforge.schemaspy.ui.MainFrame var8 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var9 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var10 = var9.getTableExclusions();
    boolean var11 = var9.isEvaluateAllEnabled();
    java.util.List var12 = var9.getColumnDetails();
    var8.setIconImages(var12);
    net.sourceforge.schemaspy.ui.DbConfigPanel var14 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var14.requestFocus();
    var14.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var18 = var14.insets();
    var14.setAlignmentX(1.0f);
    boolean var21 = var14.hasFocus();
    boolean var22 = var14.getFocusTraversalKeysEnabled();
    boolean var23 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var14);
    net.sourceforge.schemaspy.ui.DbConfigPanel var24 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var25 = var24.isManagingFocus();
    java.awt.Rectangle var26 = var24.getVisibleRect();
    java.awt.Rectangle var27 = var14.getBounds(var26);
    java.awt.Dimension var28 = var14.getPreferredSize();
    var8.setMinimumSize(var28);
    var8.toBack();
    net.sourceforge.schemaspy.ui.DbConfigPanel var31 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var31.requestFocus();
    var31.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var35 = var31.insets();
    float var36 = var31.getAlignmentX();
    boolean var39 = var31.contains(1, (-1));
    var31.setOpaque(false);
    boolean var42 = var31.getInheritsPopupMenu();
    var8.setGlassPane((java.awt.Component)var31);
    net.sourceforge.schemaspy.ui.MainFrame var44 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var45 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var45.requestFocus();
    var45.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var49 = var45.insets();
    var45.setAlignmentX(1.0f);
    java.awt.Color var52 = var45.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var53 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var53.requestFocus();
    var53.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var57 = var53.insets();
    float var58 = var53.getAlignmentX();
    var53.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var64 = var53.getMouseListeners();
    java.awt.Rectangle var65 = var53.bounds();
    var45.setBounds(var65);
    var44.setMaximizedBounds(var65);
    net.sourceforge.schemaspy.ui.DbConfigPanel var68 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var68.requestFocus();
    var68.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var72 = var68.insets();
    var68.setAlignmentX(1.0f);
    boolean var75 = var68.hasFocus();
    boolean var76 = var68.getFocusTraversalKeysEnabled();
    boolean var77 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var68);
    var68.firePropertyChange("hi!", 'a', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var82 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var83 = var82.isManagingFocus();
    int var84 = var82.getWidth();
    java.awt.Insets var85 = var82.insets();
    javax.accessibility.AccessibleContext var86 = var82.getAccessibleContext();
    boolean var89 = var82.inside(100, (-3));
    java.awt.Rectangle var90 = var82.getVisibleRect();
    var68.setBounds(var90);
    var44.setMaximizedBounds(var90);
    var8.setBounds(var90);
    java.awt.event.WindowListener[] var94 = var8.getWindowListeners();
    var8.revalidate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var97 = var0.add((java.awt.Component)var8, 5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test421");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    net.sourceforge.schemaspy.Config var5 = var2.getConfig();
    var5.setSchemaSpec("ISO-8859-1");
    java.util.List var8 = var5.getSchemas();
    java.util.regex.Pattern var9 = var5.getTableExclusions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = var5.getUser();
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test422");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    var0.setFocusableWindowState(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    boolean var17 = var9.contains(1, (-1));
    var9.transferFocus();
    var9.removeAll();
    java.awt.Component var21 = var0.add((java.awt.Component)var9, 0);
    net.sourceforge.schemaspy.ui.DbConfigPanel var22 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var22.requestFocus();
    var22.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var26 = var22.insets();
    boolean var27 = var22.isFontSet();
    var22.transferFocusUpCycle();
    var9.setNextFocusableComponent((java.awt.Component)var22);
    var9.firePropertyChange("Helvetica", '4', '#');
    net.sourceforge.schemaspy.ui.DbConfigPanel var34 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var34.requestFocus();
    var34.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var38 = var34.insets();
    var34.setAlignmentX(1.0f);
    java.awt.Color var41 = var34.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var42 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var42.requestFocus();
    var42.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var46 = var42.insets();
    float var47 = var42.getAlignmentX();
    var42.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var53 = var42.getMouseListeners();
    java.awt.Rectangle var54 = var42.bounds();
    var34.setBounds(var54);
    net.sourceforge.schemaspy.ui.MainFrame var56 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var57 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var58 = var57.getTableExclusions();
    boolean var59 = var57.isEvaluateAllEnabled();
    java.util.List var60 = var57.getColumnDetails();
    var56.setIconImages(var60);
    boolean var62 = var56.isAlwaysOnTop();
    var56.setFocusableWindowState(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var65 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var66 = var65.isManagingFocus();
    int var67 = var65.getWidth();
    javax.swing.InputVerifier var68 = var65.getInputVerifier();
    net.sourceforge.schemaspy.ui.DbConfigPanel var69 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var69.requestFocus();
    var69.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var73 = var69.insets();
    var69.requestFocus();
    boolean var75 = var69.isVisible();
    java.awt.Dimension var76 = var69.preferredSize();
    java.awt.Dimension var77 = var65.getSize(var76);
    var56.setSize(var76);
    var34.setMaximumSize(var76);
    var9.setMaximumSize(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test423");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.hasOrphans();
    var0.setHtmlGenerationEnabled(true);
    var0.setEvaluateAllEnabled(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Properties var10 = var0.determineDbProperties("{}s");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test424");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    var0.paintImmediately(0, (-1), (-1), 0);
    var0.firePropertyChange("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin", ' ', ' ');
    var0.transferFocusBackward();
    var0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test425");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    boolean var13 = var6.hasFocus();
    boolean var14 = var6.getFocusTraversalKeysEnabled();
    boolean var15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var17 = var16.isManagingFocus();
    java.awt.Rectangle var18 = var16.getVisibleRect();
    java.awt.Rectangle var19 = var6.getBounds(var18);
    java.awt.Dimension var20 = var6.getPreferredSize();
    var0.setMinimumSize(var20);
    var0.toBack();
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    float var28 = var23.getAlignmentX();
    boolean var31 = var23.contains(1, (-1));
    var23.setOpaque(false);
    boolean var34 = var23.getInheritsPopupMenu();
    var0.setGlassPane((java.awt.Component)var23);
    net.sourceforge.schemaspy.ui.MainFrame var36 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var37 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var38 = var37.getTableExclusions();
    boolean var39 = var37.isEvaluateAllEnabled();
    java.util.List var40 = var37.getColumnDetails();
    var36.setIconImages(var40);
    boolean var42 = var36.isAlwaysOnTop();
    var36.setFocusableWindowState(true);
    boolean var45 = var36.isFocusCycleRoot();
    java.awt.Graphics var46 = var36.getGraphics();
    boolean var47 = var36.isFocusCycleRoot();
    net.sourceforge.schemaspy.ui.MainFrame var48 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var49 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var49.requestFocus();
    var49.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var53 = var49.insets();
    var49.setAlignmentX(1.0f);
    java.awt.Color var56 = var49.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var57 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var57.requestFocus();
    var57.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var61 = var57.insets();
    float var62 = var57.getAlignmentX();
    var57.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var68 = var57.getMouseListeners();
    java.awt.Rectangle var69 = var57.bounds();
    var49.setBounds(var69);
    var48.setMaximizedBounds(var69);
    java.awt.Container var72 = var48.getContentPane();
    boolean var73 = var48.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.MainFrame var74 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var75 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var76 = var75.getTableExclusions();
    boolean var77 = var75.isEvaluateAllEnabled();
    java.util.List var78 = var75.getColumnDetails();
    var74.setIconImages(var78);
    boolean var80 = var74.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var81 = var74.getModalExclusionType();
    var48.setModalExclusionType(var81);
    var48.setEnabled(true);
    javax.swing.JLayeredPane var85 = var48.getLayeredPane();
    var36.setLayeredPane(var85);
    var0.setLayeredPane(var85);
    java.lang.String var88 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "net.sourceforge.schemaspy.ui.MainFrame[frame0,0,23,500x431,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0var88,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", var88.equals("net.sourceforge.schemaspy.ui.MainFrame[frame0,0,23,500x431,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0var88,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test426");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    int var6 = var0.getComponentCount();
    boolean var7 = var0.getVerifyInputWhenFocusTarget();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.util.Locale var12 = javax.swing.JComponent.getDefaultLocale();
    var8.setLocale(var12);
    var0.setLocale(var12);
    float var15 = var0.getAlignmentX();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var18 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var18.clear();
    java.util.List var20 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var18);
    java.util.Set var21 = var18.entrySet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys(300, var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test427");


    net.sourceforge.schemaspy.MultipleSchemaAnalyzer var0 = net.sourceforge.schemaspy.MultipleSchemaAnalyzer.getInstance();
    net.sourceforge.schemaspy.TableOrderer var2 = new net.sourceforge.schemaspy.TableOrderer();
    net.sourceforge.schemaspy.model.Routine var12 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var13 = var12.getDataAccess();
    java.lang.String var14 = var12.getDefinitionLanguage();
    java.util.List var15 = var12.getParameters();
    java.util.List var16 = net.sourceforge.schemaspy.DbAnalyzer.sortColumnsByTable(var15);
    net.sourceforge.schemaspy.model.Routine var26 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var27 = var26.getDataAccess();
    java.lang.String var28 = var26.getDefinitionLanguage();
    java.util.List var29 = var26.getParameters();
    java.util.List var30 = net.sourceforge.schemaspy.DbAnalyzer.sortColumnsByTable(var29);
    java.util.List var31 = var2.getTablesOrderedByRI((java.util.Collection)var15, (java.util.Collection)var29);
    net.sourceforge.schemaspy.model.Routine var41 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var42 = var41.getDataAccess();
    java.util.List var43 = var41.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var44 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var43);
    java.util.List var45 = net.sourceforge.schemaspy.DbAnalyzer.getMustBeUniqueNullableColumns((java.util.Collection)var43);
    java.lang.String var46 = net.sourceforge.schemaspy.model.ForeignKeyConstraint.toString(var45);
    java.util.List var47 = net.sourceforge.schemaspy.DbAnalyzer.getImpliedConstraints((java.util.Collection)var45);
    net.sourceforge.schemaspy.Config var48 = new net.sourceforge.schemaspy.Config();
    var48.setDb("a");
    java.lang.String var51 = var48.getServer();
    boolean var52 = var48.isHtmlGenerationEnabled();
    var48.setSchema("");
    java.lang.String var55 = var48.getCss();
    var48.setDb("dot version 2.2.1 or versions greater than 2.4");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.analyze("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'", var15, var45, var48);
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "a"+ "'", var14.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "a"+ "'", var28.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "[]"+ "'", var46.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "schemaSpy.css"+ "'", var55.equals("schemaSpy.css"));

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test428");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    net.sourceforge.schemaspy.ui.DbConfigPanel var5 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var5.requestFocus();
    java.beans.PropertyChangeListener[] var7 = var5.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var8 = var5.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    var9.setAlignmentX(1.0f);
    var9.doLayout();
    boolean var17 = var9.isCursorSet();
    var9.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var22 = var9.getLocation();
    boolean var23 = var5.contains(var22);
    java.awt.Component var24 = var0.findComponentAt(var22);
    boolean var25 = var0.isRequestFocusEnabled();
    boolean var26 = var0.isFocusCycleRoot();
    java.awt.Dimension var27 = var0.getMaximumSize();
    var0.setIgnoreRepaint(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test429");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.awt.Container var24 = var0.getContentPane();
    net.sourceforge.schemaspy.ui.DbConfigPanel var25 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var26 = var25.isManagingFocus();
    java.awt.Rectangle var27 = var25.getVisibleRect();
    var0.setBounds(var27);
    var0.hide();
    java.util.List var30 = var0.getIconImages();
    net.sourceforge.schemaspy.ui.DbConfigPanel var31 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var31.requestFocus();
    var31.setFocusTraversalPolicyProvider(true);
    boolean var35 = var31.requestFocusInWindow();
    java.awt.Dimension var36 = var31.getMaximumSize();
    var0.setSize(var36);
    javax.swing.JMenuBar var38 = var0.getJMenuBar();
    net.sourceforge.schemaspy.ui.DbConfigPanel var39 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var39.requestFocus();
    var39.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var43 = var39.insets();
    var39.requestFocus();
    var39.setOpaque(false);
    var39.invalidate();
    java.awt.event.KeyListener[] var48 = var39.getKeyListeners();
    java.awt.event.ContainerListener[] var49 = var39.getContainerListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var50 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var50.requestFocus();
    var50.setFocusTraversalPolicyProvider(true);
    java.awt.Point var55 = var50.getMousePosition(true);
    java.awt.Component var56 = var50.getNextFocusableComponent();
    boolean var57 = var50.isBackgroundSet();
    var50.requestFocus();
    java.awt.Rectangle var59 = var50.getVisibleRect();
    java.awt.Rectangle var60 = var39.getBounds(var59);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var60);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test430");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.util.List var11 = var9.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var12 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var11);
    int var13 = var12.getNumViewsWritten();
    int var14 = var12.getNumTablesWritten();
    net.sourceforge.schemaspy.view.WriteStats var15 = new net.sourceforge.schemaspy.view.WriteStats(var12);
    net.sourceforge.schemaspy.view.WriteStats var16 = new net.sourceforge.schemaspy.view.WriteStats(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test431");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    var0.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var13 = var0.getLocation();
    var0.setSize(2, 10);
    java.awt.Component var19 = var0.getComponentAt(300, 300);
    var0.removeNotify();
    net.sourceforge.schemaspy.ui.MainFrame var21 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var22 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var23 = var22.getTableExclusions();
    boolean var24 = var22.isEvaluateAllEnabled();
    java.util.List var25 = var22.getColumnDetails();
    var21.setIconImages(var25);
    boolean var27 = var21.isAlwaysOnTop();
    var21.setFocusableWindowState(true);
    boolean var30 = var21.isFocusCycleRoot();
    java.awt.Graphics var31 = var21.getGraphics();
    boolean var32 = var21.isFocusCycleRoot();
    net.sourceforge.schemaspy.ui.MainFrame var33 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var34 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var34.requestFocus();
    var34.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var38 = var34.insets();
    var34.setAlignmentX(1.0f);
    java.awt.Color var41 = var34.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var42 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var42.requestFocus();
    var42.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var46 = var42.insets();
    float var47 = var42.getAlignmentX();
    var42.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var53 = var42.getMouseListeners();
    java.awt.Rectangle var54 = var42.bounds();
    var34.setBounds(var54);
    var33.setMaximizedBounds(var54);
    java.awt.Container var57 = var33.getContentPane();
    boolean var58 = var33.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.MainFrame var59 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var60 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var61 = var60.getTableExclusions();
    boolean var62 = var60.isEvaluateAllEnabled();
    java.util.List var63 = var60.getColumnDetails();
    var59.setIconImages(var63);
    boolean var65 = var59.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var66 = var59.getModalExclusionType();
    var33.setModalExclusionType(var66);
    var33.setEnabled(true);
    javax.swing.JLayeredPane var70 = var33.getLayeredPane();
    var21.setLayeredPane(var70);
    net.sourceforge.schemaspy.model.Routine var81 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    java.lang.String var82 = var81.getDefinition();
    net.sourceforge.schemaspy.model.Routine var92 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var93 = var92.getDataAccess();
    java.lang.String var94 = var92.getDefinitionLanguage();
    int var95 = var81.compareTo(var92);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.awt.Component)var21, (java.lang.Object)var81);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + ""+ "'", var82.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + "hi!"+ "'", var93.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var94 + "' != '" + "a"+ "'", var94.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 3);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test432");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    var0.setFocusableWindowState(true);
    java.awt.Window[] var9 = var0.getOwnedWindows();
    var0.setFocusableWindowState(false);
    boolean var12 = var0.isAlwaysOnTop();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test433");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.setFocusable(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var3 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var3.requestFocus();
    var3.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var7 = var3.insets();
    var3.setAlignmentX(1.0f);
    boolean var10 = var3.hasFocus();
    boolean var11 = var3.getFocusTraversalKeysEnabled();
    var3.setSize(1, (-1));
    java.lang.Object var15 = var0.getClientProperty((java.lang.Object)var3);
    int var16 = var3.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test434");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    var0.paintImmediately(0, (-1), (-1), 0);
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    var8.setAlignmentX(1.0f);
    boolean var15 = var8.hasFocus();
    boolean var16 = var8.getFocusTraversalKeysEnabled();
    boolean var17 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var8);
    net.sourceforge.schemaspy.ui.DbConfigPanel var18 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var18.requestFocus();
    var18.setFocusTraversalPolicyProvider(true);
    java.awt.Point var23 = var18.getMousePosition(true);
    int var24 = var18.getComponentCount();
    int var25 = var18.getHeight();
    net.sourceforge.schemaspy.ui.DbConfigPanel var26 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var26.requestFocus();
    java.beans.PropertyChangeListener[] var28 = var26.getPropertyChangeListeners();
    var26.paintImmediately(0, (-1), (-1), 0);
    java.awt.Font var34 = var26.getFont();
    java.awt.FontMetrics var35 = var18.getFontMetrics(var34);
    java.awt.FontMetrics var36 = var8.getFontMetrics(var34);
    java.awt.FontMetrics var37 = var0.getFontMetrics(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test435");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.writeln();
    var3.writeln();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.Writer var9 = var3.append((java.lang.CharSequence)"{}s", 312, 100);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test436");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    java.awt.event.HierarchyListener[] var9 = var0.getHierarchyListeners();
    var0.setFocusTraversalPolicyProvider(false);
    boolean var12 = var0.isBackgroundSet();
    net.sourceforge.schemaspy.ui.DbConfigPanel var13 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var13.enable();
    boolean var15 = var13.isBackgroundSet();
    var0.setComponentZOrder((java.awt.Component)var13, 0);
    java.lang.String var18 = var0.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "PanelUI"+ "'", var18.equals("PanelUI"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test437");


    boolean var0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == true);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test438");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    var0.setHasRoutines(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test439");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    net.sourceforge.schemaspy.Config var5 = var2.getConfig();
    var5.setSchemaSpec("ISO-8859-1");
    java.util.List var8 = var5.getSchemas();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var9 = var5.asList();
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test440");


    net.sourceforge.schemaspy.util.PasswordReader var0 = net.sourceforge.schemaspy.util.PasswordReader.getInstance();
    net.sourceforge.schemaspy.model.ProcessExecutionException var2 = new net.sourceforge.schemaspy.model.ProcessExecutionException("a");
    net.sourceforge.schemaspy.util.PasswordReader.IOError var3 = var0.new IOError((java.lang.Throwable)var2);
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure("DbSpecificOption name: 'net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s' value: 'null' description: 'a'");
    net.sourceforge.schemaspy.util.PasswordReader.IOError var6 = var0.new IOError((java.lang.Throwable)var5);
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    float var13 = var8.getAlignmentX();
    boolean var16 = var8.contains(1, (-1));
    var8.setOpaque(false);
    var8.repaint(10L);
    boolean var21 = var8.isDoubleBuffered();
    java.awt.event.KeyListener[] var22 = var8.getKeyListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var23 = var0.readPassword("", (java.lang.Object[])var22);
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test441");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    var0.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var8 = var0.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    var9.setAlignmentX(1.0f);
    java.awt.Color var16 = var9.getForeground();
    var0.setForeground(var16);
    boolean var18 = var0.hasFocus();
    java.awt.event.MouseListener[] var19 = var0.getMouseListeners();
    boolean var22 = var0.contains(2, (-3));
    java.awt.Insets var23 = var0.getInsets();
    boolean var24 = var0.hasFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test442");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    var0.firePropertyChange("hi!", 'a', 'a');
    java.lang.String var14 = var0.getUIClassID();
    var0.repaint();
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var16.requestFocus();
    var16.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var20 = var16.insets();
    var16.setAlignmentX(1.0f);
    java.awt.Color var23 = var16.getForeground();
    javax.swing.InputVerifier var24 = var16.getInputVerifier();
    var16.repaint(100L, 10, 1, 0, 100);
    var16.setEnabled(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var33 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var33.requestFocus();
    java.beans.PropertyChangeListener[] var35 = var33.getPropertyChangeListeners();
    var33.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var41 = var33.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var42 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var42.requestFocus();
    var42.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var46 = var42.insets();
    var42.setAlignmentX(1.0f);
    java.awt.Color var49 = var42.getForeground();
    var33.setForeground(var49);
    var16.setBackground(var49);
    var0.setBackground(var49);
    java.beans.VetoableChangeListener[] var53 = var0.getVetoableChangeListeners();
    var0.reshape(11, (-1), 5, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PanelUI"+ "'", var14.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test443");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.model.xml.SchemaMeta var3 = new net.sourceforge.schemaspy.model.xml.SchemaMeta("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", "Value", " ");
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test444");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var5 = var0.getFocusTraversalPolicy();
    var0.requestFocus();
    java.beans.VetoableChangeListener[] var7 = var0.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test445");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    var0.setAlignmentY(100.0f);
    var0.nextFocus();
    var0.setVerifyInputWhenFocusTarget(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test446");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.isDoubleBuffered();
    boolean var5 = var0.isValid();
    var0.repaint(1L);
    var0.firePropertyChange("{}s", 0.5f, 100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test447");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.reshape(1, 1, 1, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Point var15 = var10.getMousePosition(true);
    java.awt.Component var16 = var10.getNextFocusableComponent();
    java.awt.Dimension var17 = var10.getMinimumSize();
    java.awt.Dimension var18 = var0.getSize(var17);
    boolean var19 = var0.getFocusTraversalKeysEnabled();
    var0.grabFocus();
    boolean var21 = var0.isShowing();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test448");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.lang.String var3 = var0.getDescription();
    var0.setEncodeCommentsEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test449");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.util.List var24 = var0.getIconImages();
    java.awt.Rectangle var25 = var0.getMaximizedBounds();
    net.sourceforge.schemaspy.ui.DbConfigPanel var26 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var26.requestFocus();
    var26.setFocusTraversalPolicyProvider(true);
    boolean var30 = var26.requestFocusInWindow();
    java.awt.Cursor var31 = var26.getCursor();
    java.awt.Point var32 = var26.location();
    var0.setLocation(var32);
    net.sourceforge.schemaspy.ui.MainFrame var34 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var35 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var36 = var35.getTableExclusions();
    boolean var37 = var35.isEvaluateAllEnabled();
    java.util.List var38 = var35.getColumnDetails();
    var34.setIconImages(var38);
    boolean var40 = var34.isAlwaysOnTop();
    var34.setFocusableWindowState(true);
    boolean var43 = var34.isFocusCycleRoot();
    java.awt.Graphics var44 = var34.getGraphics();
    boolean var45 = var34.isFocusCycleRoot();
    net.sourceforge.schemaspy.ui.MainFrame var46 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var47 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var47.requestFocus();
    var47.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var51 = var47.insets();
    var47.setAlignmentX(1.0f);
    java.awt.Color var54 = var47.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var55 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var55.requestFocus();
    var55.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var59 = var55.insets();
    float var60 = var55.getAlignmentX();
    var55.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var66 = var55.getMouseListeners();
    java.awt.Rectangle var67 = var55.bounds();
    var47.setBounds(var67);
    var46.setMaximizedBounds(var67);
    java.awt.Container var70 = var46.getContentPane();
    boolean var71 = var46.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.MainFrame var72 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var73 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var74 = var73.getTableExclusions();
    boolean var75 = var73.isEvaluateAllEnabled();
    java.util.List var76 = var73.getColumnDetails();
    var72.setIconImages(var76);
    boolean var78 = var72.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var79 = var72.getModalExclusionType();
    var46.setModalExclusionType(var79);
    var46.setEnabled(true);
    javax.swing.JLayeredPane var83 = var46.getLayeredPane();
    var34.setLayeredPane(var83);
    var0.setLayeredPane(var83);
    net.sourceforge.schemaspy.ui.DbConfigPanel var86 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var86.requestFocus();
    var86.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var90 = var86.insets();
    var86.setAlignmentX(1.0f);
    java.awt.Color var93 = var86.getForeground();
    int var94 = var86.getWidth();
    java.awt.Rectangle var95 = var86.getBounds();
    var83.setBounds(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test450");


    net.sourceforge.schemaspy.util.DbSpecificOption var2 = new net.sourceforge.schemaspy.util.DbSpecificOption("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'", "net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    java.lang.Object var3 = var2.getValue();
    java.lang.String var4 = var2.getName();
    net.sourceforge.schemaspy.ui.DbConfigPanel var5 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var5.requestFocus();
    var5.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var9 = var5.insets();
    java.lang.Object var10 = var5.getTreeLock();
    boolean var11 = var5.isFocusTraversalPolicyProvider();
    java.awt.Component[] var12 = var5.getComponents();
    var2.setValue((java.lang.Object)var5);
    var5.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var4.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test451");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    int var2 = var0.findColumn("a");
    net.sourceforge.schemaspy.util.DbSpecificConfig var4 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setDbSpecificConfig(var4);
    var0.fireTableStructureChanged();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var7 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var9 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var9.dumpUsage();
    var7.setDbSpecificConfig(var9);
    net.sourceforge.schemaspy.Config var12 = var9.getConfig();
    var0.setDbSpecificConfig(var9);
    net.sourceforge.schemaspy.util.Inflection var16 = new net.sourceforge.schemaspy.util.Inflection("", "hi!s");
    java.lang.String var18 = var16.replace("{}");
    boolean var20 = var16.match("{}");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setValueAt((java.lang.Object)var16, 2, 2);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!s{hi!s}hi!s"+ "'", var18.equals("hi!s{hi!s}hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test452");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    java.awt.Component var2 = var0.getMostRecentFocusOwner();
    var0.setState(1);
    net.sourceforge.schemaspy.ui.DbConfigPanel var5 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var5.requestFocus();
    var5.setFocusTraversalPolicyProvider(true);
    boolean var9 = var5.requestFocusInWindow();
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    java.beans.PropertyChangeListener[] var12 = var10.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var13 = var10.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var14 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var14.requestFocus();
    var14.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var18 = var14.insets();
    var14.setAlignmentX(1.0f);
    var14.doLayout();
    boolean var22 = var14.isCursorSet();
    var14.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var27 = var14.getLocation();
    boolean var28 = var10.contains(var27);
    java.awt.Component var29 = var5.findComponentAt(var27);
    boolean var30 = var5.isRequestFocusEnabled();
    net.sourceforge.schemaspy.ui.DbConfigPanel var31 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var31.requestFocus();
    var31.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var35 = var31.insets();
    var31.setAlignmentX(1.0f);
    boolean var38 = var31.hasFocus();
    boolean var39 = var31.getFocusTraversalKeysEnabled();
    var31.setSize(1, (-1));
    boolean var44 = var31.requestFocus(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var45 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var45.requestFocus();
    java.beans.PropertyChangeListener[] var47 = var45.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var48 = var45.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var49 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var49.requestFocus();
    var49.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var53 = var49.insets();
    var49.setAlignmentX(1.0f);
    var49.doLayout();
    boolean var57 = var49.isCursorSet();
    var49.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var62 = var49.getLocation();
    boolean var63 = var45.contains(var62);
    java.awt.Point var64 = var31.getLocation(var62);
    java.awt.Point var65 = var5.getLocation(var62);
    java.awt.Point var66 = var0.getLocation(var65);
    java.awt.Container var67 = var0.getContentPane();
    boolean var68 = var0.getFocusableWindowState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test453");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    var0.paintImmediately(10, 100, 2, 10);
    net.sourceforge.schemaspy.ui.DbConfigPanel var13 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var13.requestFocus();
    var13.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var17 = var13.insets();
    var13.setAlignmentX(1.0f);
    java.awt.Color var20 = var13.getForeground();
    javax.swing.InputVerifier var21 = var13.getInputVerifier();
    var13.repaint(100L, 10, 1, 0, 100);
    var13.setEnabled(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var30 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var30.requestFocus();
    java.beans.PropertyChangeListener[] var32 = var30.getPropertyChangeListeners();
    var30.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var38 = var30.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var39 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var39.requestFocus();
    var39.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var43 = var39.insets();
    var39.setAlignmentX(1.0f);
    java.awt.Color var46 = var39.getForeground();
    var30.setForeground(var46);
    var13.setBackground(var46);
    var0.remove((java.awt.Component)var13);
    var13.reshape(3, (-1), 10, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test454");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    var0.setImpliedConstraintsEnabled(true);
    var0.setSchema("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    net.sourceforge.schemaspy.Config var8 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var9 = var8.getTableExclusions();
    var8.setSqlFormatter("hi!");
    net.sourceforge.schemaspy.view.DefaultSqlFormatter var12 = new net.sourceforge.schemaspy.view.DefaultSqlFormatter();
    var8.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var12);
    var0.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var12);
    var0.setRailsEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test455");


    net.sourceforge.schemaspy.Config.MissingRequiredParameterException var3 = new net.sourceforge.schemaspy.Config.MissingRequiredParameterException("hi!s{hi!s}hi!s", "ISO-8859-1", true);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test456");


    net.sourceforge.schemaspy.view.StyleSheet.ParseException var3 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    net.sourceforge.schemaspy.view.StyleSheet.ParseException var4 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException((java.lang.Exception)var3);
    net.sourceforge.schemaspy.model.ProcessExecutionException var5 = new net.sourceforge.schemaspy.model.ProcessExecutionException("{}", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ProcessExecutionException var6 = new net.sourceforge.schemaspy.model.ProcessExecutionException("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'", (java.lang.Throwable)var5);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test457");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.util.List var24 = var0.getIconImages();
    java.awt.Rectangle var25 = var0.getMaximizedBounds();
    net.sourceforge.schemaspy.ui.DbConfigPanel var26 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var26.requestFocus();
    var26.setFocusTraversalPolicyProvider(true);
    boolean var30 = var26.requestFocusInWindow();
    java.awt.Cursor var31 = var26.getCursor();
    java.awt.Point var32 = var26.location();
    var0.setLocation(var32);
    net.sourceforge.schemaspy.ui.MainFrame var34 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var35 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var36 = var35.getTableExclusions();
    boolean var37 = var35.isEvaluateAllEnabled();
    java.util.List var38 = var35.getColumnDetails();
    var34.setIconImages(var38);
    boolean var40 = var34.isAlwaysOnTop();
    var34.setFocusableWindowState(true);
    boolean var43 = var34.isFocusCycleRoot();
    java.awt.Graphics var44 = var34.getGraphics();
    boolean var45 = var34.isFocusCycleRoot();
    net.sourceforge.schemaspy.ui.MainFrame var46 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var47 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var47.requestFocus();
    var47.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var51 = var47.insets();
    var47.setAlignmentX(1.0f);
    java.awt.Color var54 = var47.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var55 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var55.requestFocus();
    var55.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var59 = var55.insets();
    float var60 = var55.getAlignmentX();
    var55.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var66 = var55.getMouseListeners();
    java.awt.Rectangle var67 = var55.bounds();
    var47.setBounds(var67);
    var46.setMaximizedBounds(var67);
    java.awt.Container var70 = var46.getContentPane();
    boolean var71 = var46.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.MainFrame var72 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var73 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var74 = var73.getTableExclusions();
    boolean var75 = var73.isEvaluateAllEnabled();
    java.util.List var76 = var73.getColumnDetails();
    var72.setIconImages(var76);
    boolean var78 = var72.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var79 = var72.getModalExclusionType();
    var46.setModalExclusionType(var79);
    var46.setEnabled(true);
    javax.swing.JLayeredPane var83 = var46.getLayeredPane();
    var34.setLayeredPane(var83);
    var0.setLayeredPane(var83);
    var0.setResizable(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test458");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.lang.String var13 = var11.getDefinitionLanguage();
    java.util.List var14 = var11.getParameters();
    var0.setColumnDetails(var14);
    var0.setPort((java.lang.Integer)0);
    var0.setDb("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    var0.setPort((java.lang.Integer)(-1));
    java.util.regex.Pattern var22 = var0.getTableInclusions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test459");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    boolean var2 = var0.isSchemaDisabled();
    var0.setHtmlGenerationEnabled(false);
    var0.setFontSize(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test460");


    net.sourceforge.schemaspy.util.DbSpecificOption var2 = new net.sourceforge.schemaspy.util.DbSpecificOption("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'", "net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    java.lang.Object var3 = var2.getValue();
    java.lang.String var4 = var2.getName();
    net.sourceforge.schemaspy.ui.DbConfigPanel var5 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var5.requestFocus();
    var5.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var9 = var5.insets();
    java.lang.Object var10 = var5.getTreeLock();
    boolean var11 = var5.isFocusTraversalPolicyProvider();
    java.awt.Component[] var12 = var5.getComponents();
    var2.setValue((java.lang.Object)var5);
    boolean var14 = var5.isPaintingTile();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var4.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test461");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    var0.firePropertyChange("hi!", 'a', 'a');
    java.lang.String var14 = var0.getUIClassID();
    java.awt.Point var16 = var0.getMousePosition(false);
    java.awt.Point var17 = var0.location();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var20 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var21 = var20.entrySet();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var23 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.List var24 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var23);
    net.sourceforge.schemaspy.Config var25 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var26 = var25.getTableExclusions();
    boolean var27 = var25.isHtmlGenerationEnabled();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var29 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var29.clear();
    var25.setDbSpecificOptions((java.util.Map)var29);
    java.lang.String var32 = var29.toString();
    var23.putAll((java.util.Map)var29);
    var20.putAll((java.util.Map)var29);
    java.util.Set var35 = var20.entrySet();
    var0.setFocusTraversalKeys(2, var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "PanelUI"+ "'", var14.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "{}"+ "'", var32.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test462");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var7 = var0.getTableModelListeners();
    var0.fireTableRowsUpdated(0, 3);
    javax.swing.event.TableModelListener[] var11 = var0.getTableModelListeners();
    var0.fireTableCellUpdated(0, 0);
    int var16 = var0.findColumn("Unknown");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test463");


    net.sourceforge.schemaspy.TableOrderer var0 = new net.sourceforge.schemaspy.TableOrderer();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var2 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var3 = var2.entrySet();
    java.util.List var4 = net.sourceforge.schemaspy.DbAnalyzer.getOrphans((java.util.Collection)var3);
    net.sourceforge.schemaspy.Config var5 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var6 = var5.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var16 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var17 = var16.getDataAccess();
    java.lang.String var18 = var16.getDefinitionLanguage();
    java.util.List var19 = var16.getParameters();
    var5.setColumnDetails(var19);
    java.util.List var21 = var0.getTablesOrderedByRI((java.util.Collection)var4, (java.util.Collection)var19);
    java.util.List var22 = net.sourceforge.schemaspy.DbAnalyzer.sortTablesByName(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "a"+ "'", var18.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test464");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    boolean var13 = var6.hasFocus();
    boolean var14 = var6.getFocusTraversalKeysEnabled();
    boolean var15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var17 = var16.isManagingFocus();
    java.awt.Rectangle var18 = var16.getVisibleRect();
    java.awt.Rectangle var19 = var6.getBounds(var18);
    java.awt.Dimension var20 = var6.getPreferredSize();
    var0.setMinimumSize(var20);
    var0.toBack();
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    float var28 = var23.getAlignmentX();
    boolean var31 = var23.contains(1, (-1));
    var23.setOpaque(false);
    boolean var34 = var23.getInheritsPopupMenu();
    var0.setGlassPane((java.awt.Component)var23);
    net.sourceforge.schemaspy.ui.MainFrame var36 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var37 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var37.requestFocus();
    var37.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var41 = var37.insets();
    var37.setAlignmentX(1.0f);
    java.awt.Color var44 = var37.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var45 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var45.requestFocus();
    var45.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var49 = var45.insets();
    float var50 = var45.getAlignmentX();
    var45.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var56 = var45.getMouseListeners();
    java.awt.Rectangle var57 = var45.bounds();
    var37.setBounds(var57);
    var36.setMaximizedBounds(var57);
    net.sourceforge.schemaspy.ui.DbConfigPanel var60 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var60.requestFocus();
    var60.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var64 = var60.insets();
    var60.setAlignmentX(1.0f);
    boolean var67 = var60.hasFocus();
    boolean var68 = var60.getFocusTraversalKeysEnabled();
    boolean var69 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var60);
    var60.firePropertyChange("hi!", 'a', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var74 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var75 = var74.isManagingFocus();
    int var76 = var74.getWidth();
    java.awt.Insets var77 = var74.insets();
    javax.accessibility.AccessibleContext var78 = var74.getAccessibleContext();
    boolean var81 = var74.inside(100, (-3));
    java.awt.Rectangle var82 = var74.getVisibleRect();
    var60.setBounds(var82);
    var36.setMaximizedBounds(var82);
    var0.setBounds(var82);
    java.awt.event.WindowListener[] var86 = var0.getWindowListeners();
    var0.addNotify();
    java.awt.image.BufferStrategy var88 = var0.getBufferStrategy();
    var0.createBufferStrategy(5);
    java.awt.Container var91 = var0.getContentPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test465");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    java.awt.Insets var3 = var0.insets();
    javax.accessibility.AccessibleContext var4 = var0.getAccessibleContext();
    boolean var7 = var0.inside(100, (-3));
    java.awt.Rectangle var8 = var0.getVisibleRect();
    java.awt.Component.BaselineResizeBehavior var9 = var0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test466");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    boolean var10 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test467");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.flush();
    var3.write("a");
    char[] var7 = new char[] { };
    var3.write(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.write("4", 300, 300);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test468");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var7 = var0.getModalExclusionType();
    net.sourceforge.schemaspy.ui.MainFrame var8 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    var9.setAlignmentX(1.0f);
    java.awt.Color var16 = var9.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var17 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var17.requestFocus();
    var17.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var21 = var17.insets();
    float var22 = var17.getAlignmentX();
    var17.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var28 = var17.getMouseListeners();
    java.awt.Rectangle var29 = var17.bounds();
    var9.setBounds(var29);
    var8.setMaximizedBounds(var29);
    java.awt.Container var32 = var8.getContentPane();
    boolean var33 = var8.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.MainFrame var34 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var35 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var36 = var35.getTableExclusions();
    boolean var37 = var35.isEvaluateAllEnabled();
    java.util.List var38 = var35.getColumnDetails();
    var34.setIconImages(var38);
    boolean var40 = var34.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var41 = var34.getModalExclusionType();
    var8.setModalExclusionType(var41);
    var8.setEnabled(true);
    javax.swing.JLayeredPane var45 = var8.getLayeredPane();
    var0.setLayeredPane(var45);
    var0.firePropertyChange("Helvetica", '4', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test469");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.firePropertyChange("ISO-8859-1", 0L, (-1L));
    var0.setAlignmentX(0.0f);
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    float var13 = var8.getAlignmentX();
    net.sourceforge.schemaspy.ui.DbConfigPanel var14 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var14.requestFocus();
    var14.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var18 = var14.insets();
    var14.requestFocus();
    var14.setOpaque(false);
    javax.swing.plaf.PanelUI var22 = var14.getUI();
    var8.setUI(var22);
    var0.setUI(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test470");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var1 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var1.requestFocus();
    var1.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var5 = var1.insets();
    var1.setAlignmentX(1.0f);
    java.awt.Color var8 = var1.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var20 = var9.getMouseListeners();
    java.awt.Rectangle var21 = var9.bounds();
    var1.setBounds(var21);
    var0.setMaximizedBounds(var21);
    java.awt.Container var24 = var0.getContentPane();
    boolean var25 = var0.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.MainFrame var26 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var27 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var28 = var27.getTableExclusions();
    boolean var29 = var27.isEvaluateAllEnabled();
    java.util.List var30 = var27.getColumnDetails();
    var26.setIconImages(var30);
    boolean var32 = var26.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var33 = var26.getModalExclusionType();
    var0.setModalExclusionType(var33);
    var0.pack();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.createBufferStrategy((-3));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test471");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var7 = var0.getModalExclusionType();
    boolean var8 = var0.isAlwaysOnTop();
    var0.setFocusTraversalPolicyProvider(true);
    var0.setOpacity(1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test472");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    java.awt.Insets var3 = var0.insets();
    var0.firePropertyChange("ISO-8859-1s", true, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var0.getBaseline((-1), 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test473");


    net.sourceforge.schemaspy.util.PasswordReader var0 = net.sourceforge.schemaspy.util.PasswordReader.getInstance();
    net.sourceforge.schemaspy.model.ProcessExecutionException var2 = new net.sourceforge.schemaspy.model.ProcessExecutionException("a");
    net.sourceforge.schemaspy.util.PasswordReader.IOError var3 = var0.new IOError((java.lang.Throwable)var2);
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure("DbSpecificOption name: 'net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s' value: 'null' description: 'a'");
    net.sourceforge.schemaspy.util.PasswordReader.IOError var6 = var0.new IOError((java.lang.Throwable)var5);
    java.awt.Frame[] var8 = java.awt.Frame.getFrames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var9 = var0.readPassword("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", (java.lang.Object[])var8);
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test474");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    java.lang.Object var5 = var0.getTreeLock();
    var0.validate();
    var0.resetKeyboardActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test475");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    java.lang.Integer var2 = var0.getPort();
    var0.setConnectionProperties("a");
    java.lang.String var5 = var0.getSchema();
    boolean var6 = var0.isRailsEnabled();
    java.lang.String var7 = var0.getCss();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "schemaSpy.css"+ "'", var7.equals("schemaSpy.css"));

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test476");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    java.lang.String var7 = var0.getParam("a");
    var0.setPromptForPasswordEnabled(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var10 = var0.getMaxDbThreads();
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test477");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.enable();
    java.awt.Component var4 = var0.getComponentAt(100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test478");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    int var6 = var0.getComponentCount();
    boolean var7 = var0.getVerifyInputWhenFocusTarget();
    boolean var8 = var0.isPaintingForPrint();
    var0.reshape(0, 10, 2, 0);
    int var14 = var0.getWidth();
    var0.setInheritsPopupMenu(true);
    int var17 = var0.getY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test479");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    var0.setNumRowsEnabled(true);
    java.lang.String var4 = var0.getSchema();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test480");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    javax.swing.InputVerifier var8 = var0.getInputVerifier();
    var0.repaint(100L, 10, 1, 0, 100);
    var0.setEnabled(false);
    var0.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test481");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    boolean var13 = var6.hasFocus();
    boolean var14 = var6.getFocusTraversalKeysEnabled();
    boolean var15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var17 = var16.isManagingFocus();
    java.awt.Rectangle var18 = var16.getVisibleRect();
    java.awt.Rectangle var19 = var6.getBounds(var18);
    java.awt.Dimension var20 = var6.getPreferredSize();
    var0.setMinimumSize(var20);
    javax.swing.TransferHandler var22 = var0.getTransferHandler();
    java.awt.event.WindowListener[] var23 = var0.getWindowListeners();
    var0.enable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.show();
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test482");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    javax.swing.JRootPane var2 = var0.getRootPane();
    var0.setVisible(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test483");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    javax.swing.InputVerifier var3 = var0.getInputVerifier();
    net.sourceforge.schemaspy.ui.DbConfigPanel var4 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var4.requestFocus();
    var4.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var8 = var4.insets();
    var4.requestFocus();
    boolean var10 = var4.isVisible();
    java.awt.Dimension var11 = var4.preferredSize();
    java.awt.Dimension var12 = var0.getSize(var11);
    net.sourceforge.schemaspy.model.Routine var23 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var24 = var23.getDataAccess();
    java.util.List var25 = var23.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var26 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var25);
    int var27 = var26.getNumViewsWritten();
    net.sourceforge.schemaspy.view.WriteStats var28 = new net.sourceforge.schemaspy.view.WriteStats(var26);
    java.util.Set var29 = var28.getExcludedColumns();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys(5, var29);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test484");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    float var13 = var8.getAlignmentX();
    var8.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var19 = var8.getMouseListeners();
    boolean var20 = var0.isAncestorOf((java.awt.Component)var8);
    java.awt.im.InputMethodRequests var21 = var8.getInputMethodRequests();
    net.sourceforge.schemaspy.ui.DbConfigPanel var22 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var22.requestFocus();
    var22.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var26 = var22.insets();
    var22.setAlignmentX(1.0f);
    var22.doLayout();
    boolean var30 = var22.isCursorSet();
    var22.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var35 = var22.getLocation();
    java.awt.Component var36 = var8.findComponentAt(var35);
    boolean var37 = var8.getIgnoreRepaint();
    var8.setAutoscrolls(false);
    var8.show(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test485");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setMaxDbThreads(1);
    java.lang.String var3 = var0.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var0.getUser();
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test486");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.Version var1 = new net.sourceforge.schemaspy.util.Version("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test487");


    net.sourceforge.schemaspy.model.ConnectionFailure var1 = new net.sourceforge.schemaspy.model.ConnectionFailure("hi!");

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test488");


    java.lang.String var1 = net.sourceforge.schemaspy.util.Inflection.singularize("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test489");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    var0.setRankDirBugEnabled(true);
    java.lang.String var4 = var0.getServer();
    var0.setFont("net.sourceforge.schemaspy.ui.MainFrame[frame0,0,23,500x431,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test490");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    var0.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test491");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(10, (-3));
    var0.fireTableCellUpdated(10, 3);
    var0.fireTableRowsUpdated(312, 5);
    net.sourceforge.schemaspy.ui.DbConfigTableModel var10 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var10.fireTableRowsInserted(2, 1);
    java.lang.Object var16 = var10.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var17 = var10.getTableModelListeners();
    var10.fireTableRowsUpdated(0, 3);
    int var22 = var10.findColumn("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var10.fireTableRowsDeleted(11, 2);
    java.lang.Class var27 = var10.getClass(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var28 = var0.<java.util.EventListener>getListeners(var27);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test492");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    var0.setAlignmentY(100.0f);
    java.lang.Object var11 = var0.getTreeLock();
    javax.swing.JToolTip var12 = var0.createToolTip();
    java.beans.PropertyChangeListener[] var13 = var0.getPropertyChangeListeners();
    java.awt.Toolkit var14 = var0.getToolkit();
    net.sourceforge.schemaspy.ui.MainFrame var15 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var16.requestFocus();
    var16.setFocusTraversalPolicyProvider(true);
    java.awt.Point var21 = var16.getMousePosition(true);
    int var22 = var16.getComponentCount();
    int var23 = var16.getHeight();
    var16.setName("hi!s");
    java.awt.Color var26 = var16.getBackground();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.awt.Component)var15, (java.lang.Object)var26, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test493");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    var0.setSqlFormatter("hi!");
    net.sourceforge.schemaspy.view.DefaultSqlFormatter var4 = new net.sourceforge.schemaspy.view.DefaultSqlFormatter();
    var0.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var4);
    var0.setImpliedConstraintsEnabled(true);
    var0.setSqlFormatter("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test494");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    net.sourceforge.schemaspy.ui.DbConfigPanel var5 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var5.requestFocus();
    java.beans.PropertyChangeListener[] var7 = var5.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var8 = var5.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    var9.setAlignmentX(1.0f);
    var9.doLayout();
    boolean var17 = var9.isCursorSet();
    var9.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var22 = var9.getLocation();
    boolean var23 = var5.contains(var22);
    java.awt.Component var24 = var0.findComponentAt(var22);
    var0.firePropertyChange("a", '4', '#');
    net.sourceforge.schemaspy.ui.DbConfigPanel var29 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var29.requestFocus();
    var29.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var33 = var29.insets();
    var29.requestFocus();
    var29.doLayout();
    var29.firePropertyChange("hi!", 0.0d, 10.0d);
    java.awt.Component var40 = var29.getNextFocusableComponent();
    java.awt.Rectangle var41 = var29.bounds();
    java.awt.Rectangle var42 = var0.getBounds(var41);
    net.sourceforge.schemaspy.ui.DbConfigPanel var43 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var44 = var43.isManagingFocus();
    int var45 = var43.getWidth();
    java.awt.Insets var46 = var43.insets();
    javax.accessibility.AccessibleContext var47 = var43.getAccessibleContext();
    boolean var50 = var43.inside(100, (-3));
    java.awt.Rectangle var51 = var43.getVisibleRect();
    java.awt.Point var52 = var43.getLocation();
    var43.removeNotify();
    net.sourceforge.schemaspy.ui.DbConfigPanel var54 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var54.requestFocus();
    var54.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var58 = var54.insets();
    var54.setAlignmentX(1.0f);
    java.awt.Color var61 = var54.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var62 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var62.requestFocus();
    var62.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var66 = var62.insets();
    float var67 = var62.getAlignmentX();
    var62.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var73 = var62.getMouseListeners();
    java.awt.Rectangle var74 = var62.bounds();
    var54.setBounds(var74);
    var43.repaint(var74);
    var0.repaint(var74);
    java.awt.Component var80 = var0.getComponentAt(312, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test495");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = var0.isVisible();
    var0.hide();
    var0.paintImmediately(300, 312, 2, 0);
    javax.swing.JPopupMenu var13 = var0.getComponentPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test496");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.reshape(1, 1, 1, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Point var15 = var10.getMousePosition(true);
    java.awt.Component var16 = var10.getNextFocusableComponent();
    java.awt.Dimension var17 = var10.getMinimumSize();
    java.awt.Dimension var18 = var0.getSize(var17);
    java.awt.Rectangle var19 = var0.bounds();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var20 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var20.fireTableStructureChanged();
    java.lang.Class var23 = var20.getClass(2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var24 = var0.<java.util.EventListener>getListeners(var23);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test497");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    boolean var13 = var6.hasFocus();
    boolean var14 = var6.getFocusTraversalKeysEnabled();
    boolean var15 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var6);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var17 = var16.isManagingFocus();
    java.awt.Rectangle var18 = var16.getVisibleRect();
    java.awt.Rectangle var19 = var6.getBounds(var18);
    java.awt.Dimension var20 = var6.getPreferredSize();
    var0.setMinimumSize(var20);
    var0.toBack();
    net.sourceforge.schemaspy.ui.MainFrame var23 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var24 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var25 = var24.getTableExclusions();
    boolean var26 = var24.isEvaluateAllEnabled();
    java.util.List var27 = var24.getColumnDetails();
    var23.setIconImages(var27);
    boolean var29 = var23.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var30 = var23.getModalExclusionType();
    net.sourceforge.schemaspy.ui.DbConfigPanel var31 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var31.requestFocus();
    var31.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var35 = var31.insets();
    var31.setAlignmentX(1.0f);
    boolean var38 = var31.hasFocus();
    boolean var39 = var31.getFocusTraversalKeysEnabled();
    boolean var40 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var31);
    net.sourceforge.schemaspy.ui.DbConfigPanel var41 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var42 = var41.isManagingFocus();
    java.awt.Rectangle var43 = var41.getVisibleRect();
    java.awt.Rectangle var44 = var31.getBounds(var43);
    java.awt.Dimension var45 = var31.getPreferredSize();
    var23.setSize(var45);
    java.awt.im.InputContext var47 = var23.getInputContext();
    java.lang.String var48 = var23.getWarningString();
    net.sourceforge.schemaspy.ui.DbConfigPanel var49 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var49.requestFocus();
    var49.setFocusTraversalPolicyProvider(true);
    var49.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var57 = var49.insets();
    var49.setAlignmentY(100.0f);
    java.awt.Image var62 = var49.createImage(1, 1);
    java.awt.Dimension var63 = var49.getSize();
    var23.setSize(var63);
    var0.setMinimumSize(var63);
    boolean var66 = var0.isAutoRequestFocus();
    java.awt.Rectangle var67 = var0.getMaximizedBounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test498");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var7 = var0.getModalExclusionType();
    boolean var8 = var0.isAutoRequestFocus();
    boolean var9 = var0.isResizable();
    net.sourceforge.schemaspy.ui.MainFrame var10 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var11 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var12 = var11.getTableExclusions();
    boolean var13 = var11.isEvaluateAllEnabled();
    java.util.List var14 = var11.getColumnDetails();
    var10.setIconImages(var14);
    boolean var16 = var10.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var17 = var10.getModalExclusionType();
    boolean var18 = var10.isAutoRequestFocus();
    java.awt.Toolkit var19 = var10.getToolkit();
    net.sourceforge.schemaspy.ui.MainFrame var20 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var21 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var22 = var21.getTableExclusions();
    boolean var23 = var21.isEvaluateAllEnabled();
    java.util.List var24 = var21.getColumnDetails();
    var20.setIconImages(var24);
    boolean var26 = var20.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var27 = var20.getModalExclusionType();
    net.sourceforge.schemaspy.ui.DbConfigPanel var28 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var28.requestFocus();
    var28.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var32 = var28.insets();
    var28.setAlignmentX(1.0f);
    boolean var35 = var28.hasFocus();
    boolean var36 = var28.getFocusTraversalKeysEnabled();
    boolean var37 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var28);
    net.sourceforge.schemaspy.ui.DbConfigPanel var38 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var39 = var38.isManagingFocus();
    java.awt.Rectangle var40 = var38.getVisibleRect();
    java.awt.Rectangle var41 = var28.getBounds(var40);
    java.awt.Dimension var42 = var28.getPreferredSize();
    var20.setSize(var42);
    java.awt.im.InputContext var44 = var20.getInputContext();
    java.lang.String var45 = var20.getWarningString();
    net.sourceforge.schemaspy.ui.DbConfigPanel var46 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var46.requestFocus();
    var46.setFocusTraversalPolicyProvider(true);
    var46.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var54 = var46.insets();
    var46.setAlignmentY(100.0f);
    java.awt.Image var59 = var46.createImage(1, 1);
    java.awt.Dimension var60 = var46.getSize();
    var20.setSize(var60);
    java.awt.LayoutManager var62 = var20.getLayout();
    var10.setLayout(var62);
    var0.setLayout(var62);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.show(true);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test499");


    net.sourceforge.schemaspy.view.StyleSheet.ParseException var1 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException("Helvetica");

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test500");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    int var6 = var0.getComponentCount();
    boolean var7 = var0.getVerifyInputWhenFocusTarget();
    boolean var8 = var0.isPaintingForPrint();
    var0.reshape(0, 10, 2, 0);
    int var14 = var0.getWidth();
    var0.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);

  }

}
