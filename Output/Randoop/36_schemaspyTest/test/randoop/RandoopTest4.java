package randoop;

import junit.framework.*;

public class RandoopTest4 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test1");


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
    java.awt.Dimension var26 = var0.minimumSize();
    boolean var27 = var0.isResizable();
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test2");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    java.awt.event.HierarchyBoundsListener[] var5 = var0.getHierarchyBoundsListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    var6.firePropertyChange("hi!", 10, 2);
    var6.paintImmediately(100, 10, 2, 0);
    java.lang.Object var22 = var0.getClientProperty((java.lang.Object)100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    var23.setAlignmentX(1.0f);
    var23.doLayout();
    boolean var31 = var23.isCursorSet();
    var23.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var36 = var23.getLocation();
    var0.setLocation(var36);
    net.sourceforge.schemaspy.ui.DbConfigPanel var38 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var38.requestFocus();
    var38.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var42 = var38.insets();
    float var43 = var38.getAlignmentX();
    var38.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var49 = var38.getBounds();
    java.awt.Rectangle var50 = var0.getBounds(var49);
    var0.addNotify();
    boolean var52 = var0.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test3");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setMaxDbThreads(1);
    java.lang.String var3 = var0.getHost();
    net.sourceforge.schemaspy.Config var4 = new net.sourceforge.schemaspy.Config();
    var4.setDb("a");
    java.lang.String var7 = var4.getServer();
    boolean var8 = var4.isHtmlGenerationEnabled();
    java.lang.String var9 = var4.getSchemaSpec();
    var4.setViewsEnabled(false);
    net.sourceforge.schemaspy.view.SqlFormatter var12 = var4.getSqlFormatter();
    var0.setSqlFormatter(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test4");


    net.sourceforge.schemaspy.util.Dot var1 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var1.setHighQuality(true);
    java.lang.String var4 = var1.getSupportedVersions();
    net.sourceforge.schemaspy.util.Dot.DotFailure var6 = var1.new DotFailure("dot version 2.2.1 or versions greater than 2.4");
    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var10 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var11 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var10);
    var6.addSuppressed((java.lang.Throwable)var10);
    net.sourceforge.schemaspy.model.InvalidConfigurationException var14 = new net.sourceforge.schemaspy.model.InvalidConfigurationException("dot version 2.2.1 or versions greater than 2.4");
    var10.addSuppressed((java.lang.Throwable)var14);
    net.sourceforge.schemaspy.model.ConnectionFailure var16 = new net.sourceforge.schemaspy.model.ConnectionFailure("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin", (java.lang.Throwable)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "dot version 2.2.1 or versions greater than 2.4"+ "'", var4.equals("dot version 2.2.1 or versions greater than 2.4"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test5");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.newLine();
    var3.writeln("[]");
    java.io.Writer var8 = var3.append((java.lang.CharSequence)"hi!");
    var3.writeln("javax.swing.JPanel[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test6");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.isHighQuality();
    java.util.Map var6 = var0.getDbSpecificOptions();
    var0.setSingleSignOn(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test7");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    int var2 = var0.findColumn("a");
    net.sourceforge.schemaspy.util.DbSpecificConfig var4 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setDbSpecificConfig(var4);
    javax.swing.event.TableModelListener[] var6 = var0.getTableModelListeners();
    int var7 = var0.getRowCount();
    var0.fireTableRowsUpdated(5, 431);
    net.sourceforge.schemaspy.util.DbSpecificConfig var12 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    java.lang.String var13 = var12.toString();
    var0.setDbSpecificConfig(var12);
    net.sourceforge.schemaspy.ui.DbConfigTableModel var15 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var15.fireTableRowsInserted(2, 1);
    java.lang.Object var21 = var15.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var22 = var15.getTableModelListeners();
    var15.fireTableRowsUpdated(0, 3);
    javax.swing.event.TableModelListener[] var26 = var15.getTableModelListeners();
    var15.fireTableCellUpdated(0, 0);
    net.sourceforge.schemaspy.util.DbSpecificConfig var31 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var31.dumpUsage();
    var15.setDbSpecificConfig(var31);
    java.util.List var34 = var31.getOptions();
    java.lang.String var35 = var31.toString();
    var0.setDbSpecificConfig(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var13,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"+ "'", var13.equals("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var13,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "java.io.FileNotFoundException:  (No such file or directory)"+ "'", var35.equals("java.io.FileNotFoundException:  (No such file or directory)"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test8");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    var0.paintImmediately(1, 0, 0, (-1));
    java.awt.ComponentOrientation var10 = var0.getComponentOrientation();
    java.lang.String var11 = var0.getName();
    boolean var12 = var0.isRequestFocusEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test9");


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
    boolean var22 = var0.isValidateRoot();
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    var23.reshape(1, 1, 1, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var33 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var33.requestFocus();
    var33.setFocusTraversalPolicyProvider(true);
    java.awt.Point var38 = var33.getMousePosition(true);
    java.awt.Component var39 = var33.getNextFocusableComponent();
    java.awt.Dimension var40 = var33.getMinimumSize();
    java.awt.Dimension var41 = var23.getSize(var40);
    java.awt.Rectangle var42 = var23.bounds();
    java.awt.Component var44 = var0.add((java.awt.Component)var23, 2);
    boolean var45 = var0.isActive();
    var0.firePropertyChange("{}", 1L, 0L);
    
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
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test10");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    java.util.Locale var2 = var0.getLocale();
    java.awt.Dimension var3 = var0.getSize();
    java.awt.Toolkit var4 = var0.getToolkit();
    boolean var7 = var0.contains(23, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test11");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    java.util.Locale var5 = var0.getLocale();
    java.awt.Component var8 = var0.locate(3, 100);
    float var9 = var0.getAlignmentX();
    var0.setEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.5f);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test12");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    var0.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var11 = var0.getMouseListeners();
    java.awt.Rectangle var12 = var0.bounds();
    java.awt.event.MouseWheelListener[] var13 = var0.getMouseWheelListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test13");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    java.lang.Object var5 = var0.getTreeLock();
    var0.validate();
    boolean var7 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    net.sourceforge.schemaspy.ui.MainFrame var8 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var9 = var8.getType();
    java.awt.Window var10 = var8.getOwner();
    var8.repaint((-3), 2, (-1), 100);
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
    net.sourceforge.schemaspy.ui.DbConfigPanel var41 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var42 = var41.isManagingFocus();
    java.awt.Rectangle var43 = var41.getVisibleRect();
    var16.setBounds(var43);
    var16.hide();
    java.util.List var46 = var16.getIconImages();
    net.sourceforge.schemaspy.ui.DbConfigPanel var47 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var47.requestFocus();
    var47.setFocusTraversalPolicyProvider(true);
    var47.firePropertyChange("a", (byte)10, (byte)0);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var57 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var58 = var57.entrySet();
    var47.setFocusTraversalKeys(0, var58);
    var16.setLocationRelativeTo((java.awt.Component)var47);
    java.awt.Component var61 = var16.getMostRecentFocusOwner();
    net.sourceforge.schemaspy.ui.DbConfigPanel var62 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var62.requestFocus();
    var62.setFocusTraversalPolicyProvider(true);
    boolean var66 = var62.requestFocusInWindow();
    java.awt.Cursor var67 = var62.getCursor();
    net.sourceforge.schemaspy.ui.DbConfigPanel var68 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var68.requestFocus();
    var68.setFocusTraversalPolicyProvider(true);
    java.awt.Point var73 = var68.getMousePosition(true);
    int var74 = var68.getComponentCount();
    int var75 = var68.getHeight();
    var68.setName("hi!s");
    net.sourceforge.schemaspy.ui.DbConfigPanel var78 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var78.requestFocus();
    var78.setFocusTraversalPolicyProvider(true);
    java.awt.Point var83 = var78.getMousePosition(true);
    java.awt.Component var84 = var78.getNextFocusableComponent();
    java.awt.Dimension var85 = var78.getMinimumSize();
    var68.setSize(var85);
    var62.setPreferredSize(var85);
    var61.setMaximumSize(var85);
    var8.setPreferredSize(var85);
    java.awt.Dimension var90 = var0.getSize(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
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
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test14");


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
    boolean var31 = var0.isFocused();
    net.sourceforge.schemaspy.ui.DbConfigPanel var32 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var32.requestFocus();
    var32.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var36 = var32.insets();
    var32.setAlignmentX(1.0f);
    var32.firePropertyChange("hi!", 10, 2);
    var32.paintImmediately(100, 10, 2, 0);
    java.util.Set var49 = var32.getFocusTraversalKeys(2);
    java.awt.Cursor var50 = var32.getCursor();
    var0.setCursor(var50);
    java.awt.Insets var52 = var0.insets();
    
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
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test15");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(0);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test16");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var6 = var0.getBackground();
    var0.requestFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    var8.setAlignmentX(1.0f);
    var8.firePropertyChange("hi!", 10, 2);
    var8.setVisible(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var21 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var21.requestFocus();
    var21.setFocusTraversalPolicyProvider(true);
    java.awt.Point var26 = var21.getMousePosition(true);
    java.awt.Component var27 = var21.getNextFocusableComponent();
    java.awt.Dimension var28 = var21.getMinimumSize();
    var8.setPreferredSize(var28);
    java.awt.Dimension var30 = var0.getSize(var28);
    java.awt.Dimension var31 = var0.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test17");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    java.lang.String var7 = var0.getParam("a");
    boolean var8 = var0.isViewsEnabled();
    var0.setDriverPath("{}");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = var0.getUser();
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test18");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var7 = var0.getTableModelListeners();
    var0.fireTableRowsUpdated(0, 3);
    java.lang.String var12 = var0.getDescription(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Schema to evaluate"+ "'", var12.equals("Schema to evaluate"));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test19");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    java.lang.String var1 = var0.getRenderer();
    var0.setFormat("hi!s");
    java.lang.String var4 = var0.getFormat();
    var0.setFormat("ora");
    net.sourceforge.schemaspy.util.Version var7 = var0.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!s"+ "'", var4.equals("hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test20");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    net.sourceforge.schemaspy.ui.DbConfigPanel var3 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var3.requestFocus();
    var3.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var7 = var3.insets();
    var3.setAlignmentX(1.0f);
    var3.doLayout();
    boolean var11 = var3.isCursorSet();
    java.awt.Insets var12 = var3.getInsets();
    int var13 = var3.getX();
    boolean var14 = var0.isAncestorOf((java.awt.Component)var3);
    boolean var15 = var3.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test21");


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
    boolean var13 = var0.getVerifyInputWhenFocusTarget();
    
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
    assertTrue(var13 == true);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test22");


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
    java.awt.Component var26 = var0.getFocusOwner();
    net.sourceforge.schemaspy.ui.DbConfigPanel var27 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var28 = var27.isManagingFocus();
    int var29 = var27.getWidth();
    java.awt.Point var30 = var27.getMousePosition();
    var27.repaint();
    var0.remove((java.awt.Component)var27);
    boolean var33 = var27.isMaximumSizeSet();
    
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
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test23");


    net.sourceforge.schemaspy.util.DbSpecificConfig var1 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    net.sourceforge.schemaspy.Config var2 = var1.getConfig();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var3,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"+ "'", var3.equals("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var3,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test24");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.util.List var3 = var0.getColumnDetails();
    java.lang.String var4 = var0.getSchemaSpec();
    var0.setDbType("hi!s");
    var0.setFont("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test25");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    boolean var7 = var0.isBackgroundSet();
    java.awt.event.MouseWheelListener[] var8 = var0.getMouseWheelListeners();
    java.awt.Point var10 = var0.getMousePosition(true);
    boolean var11 = var0.isRequestFocusEnabled();
    boolean var13 = var0.requestFocus(false);
    boolean var14 = var0.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test26");


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
    java.awt.Container var18 = var0.getFocusCycleRootAncestor();
    boolean var19 = var0.getInheritsPopupMenu();
    net.sourceforge.schemaspy.ui.DbConfigPanel var20 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var20.requestFocus();
    var20.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var24 = var20.insets();
    var20.setAlignmentX(1.0f);
    var20.firePropertyChange("hi!", 10, 2);
    var20.setVisible(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var33 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var33.requestFocus();
    var33.setFocusTraversalPolicyProvider(true);
    java.awt.Point var38 = var33.getMousePosition(true);
    java.awt.Component var39 = var33.getNextFocusableComponent();
    java.awt.Dimension var40 = var33.getMinimumSize();
    var20.setPreferredSize(var40);
    var0.setMinimumSize(var40);
    var0.paintImmediately((-1), 11, 23, 300);
    boolean var49 = var0.requestFocus(true);
    boolean var50 = var0.hasFocus();
    boolean var51 = var0.isPaintingForPrint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test27");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    var0.nextFocus();
    int var10 = var0.getY();
    var0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test28");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.isHighQuality();
    var0.setPassword("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    var0.setCharset("a");
    boolean var10 = var0.isHelpRequired();
    java.lang.String var11 = var0.getSchemaSpec();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test29");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    var0.firePropertyChange("net.sourceforge.schemaspy.ui.MainFrame[frame0,0,23,500x431,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", 1.0f, 100.0f);
    var0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test30");


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
    boolean var23 = var0.isForegroundSet();
    java.awt.Dimension var24 = var0.getPreferredSize();
    java.awt.Rectangle var25 = var0.bounds();
    
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
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test31");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.util.List var11 = var9.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var12 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var11);
    int var13 = var12.getNumViewsWritten();
    java.util.Set var14 = var12.getExcludedColumns();
    int var15 = var12.getNumTablesWritten();
    int var16 = var12.getNumTablesWritten();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test32");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.writeln();
    var3.writeln();
    java.io.Writer var7 = var3.append((java.lang.CharSequence)"net.sourceforge.schemaspy.view.StyleSheet$MissingCssPropertyException: Required property 'hi!' was not found for the definition of '' in schemaSpy.css");
    net.sourceforge.schemaspy.view.HtmlConstraintsPage var8 = net.sourceforge.schemaspy.view.HtmlConstraintsPage.getInstance();
    net.sourceforge.schemaspy.ui.MainFrame var9 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var14 = var10.insets();
    var10.setAlignmentX(1.0f);
    java.awt.Color var17 = var10.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var18 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var18.requestFocus();
    var18.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var22 = var18.insets();
    float var23 = var18.getAlignmentX();
    var18.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var29 = var18.getMouseListeners();
    java.awt.Rectangle var30 = var18.bounds();
    var10.setBounds(var30);
    var9.setMaximizedBounds(var30);
    java.awt.Container var33 = var9.getContentPane();
    net.sourceforge.schemaspy.ui.DbConfigPanel var34 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var35 = var34.isManagingFocus();
    java.awt.Rectangle var36 = var34.getVisibleRect();
    var9.setBounds(var36);
    var9.hide();
    java.util.List var39 = var9.getIconImages();
    net.sourceforge.schemaspy.util.LineWriter var43 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var43.writeln();
    var8.writeCheckConstraints((java.util.Collection)var39, var43);
    var43.writeln();
    char[] var47 = new char[] { };
    var43.write(var47);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.write(var47, 11, 11);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test33");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    net.sourceforge.schemaspy.ui.DbConfigPanel var7 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var7.requestFocus();
    var7.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var11 = var7.insets();
    float var12 = var7.getAlignmentX();
    var7.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var18 = var7.getBounds();
    java.awt.Rectangle var19 = var0.getBounds(var18);
    var0.validate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test34");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(11);
    java.lang.Object var2 = var1.clone();
    net.sourceforge.schemaspy.Config var4 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var5 = var4.getTableExclusions();
    java.lang.Integer var6 = var4.getPort();
    boolean var7 = var4.isOneOfMultipleSchemas();
    var4.setHighQuality(false);
    int var10 = var4.getMaxDetailedTables();
    boolean var11 = var4.isEvaluateAllEnabled();
    java.lang.Object var12 = var1.put("", (java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test35");


    net.sourceforge.schemaspy.SchemaAnalyzer var0 = new net.sourceforge.schemaspy.SchemaAnalyzer();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    net.sourceforge.schemaspy.model.Database var4 = var0.analyze(var1);
    var1.setHighQuality(false);
    var1.setServer("SchemaSpy");
    var1.setGraphvizDir("Unknown");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test36");


    net.sourceforge.schemaspy.SchemaAnalyzer var0 = new net.sourceforge.schemaspy.SchemaAnalyzer();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    boolean var2 = var1.isImpliedConstraintsEnabled();
    boolean var3 = var1.isSchemaDisabled();
    var1.setConnectionProperties("");
    var1.setDbType("hi!");
    java.lang.Integer var8 = var1.getPort();
    net.sourceforge.schemaspy.model.Database var9 = var0.analyze(var1);
    java.util.List var10 = var1.getSchemas();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test37");


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
    java.lang.String var35 = var0.getTitle();
    net.sourceforge.schemaspy.ui.DbConfigPanel var36 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var37 = var36.isManagingFocus();
    int var38 = var36.getWidth();
    java.awt.Point var39 = var36.getMousePosition();
    boolean var42 = var36.contains(1, (-1));
    boolean var43 = var36.isValid();
    net.sourceforge.schemaspy.ui.MainFrame var44 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var45 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var46 = var45.getTableExclusions();
    boolean var47 = var45.isEvaluateAllEnabled();
    java.util.List var48 = var45.getColumnDetails();
    var44.setIconImages(var48);
    boolean var50 = var44.isAlwaysOnTop();
    var44.setFocusableWindowState(true);
    boolean var53 = var44.isFocusCycleRoot();
    java.awt.Graphics var54 = var44.getGraphics();
    boolean var55 = var44.isFocusCycleRoot();
    net.sourceforge.schemaspy.ui.MainFrame var56 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var57 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var57.requestFocus();
    var57.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var61 = var57.insets();
    var57.setAlignmentX(1.0f);
    java.awt.Color var64 = var57.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var65 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var65.requestFocus();
    var65.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var69 = var65.insets();
    float var70 = var65.getAlignmentX();
    var65.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var76 = var65.getMouseListeners();
    java.awt.Rectangle var77 = var65.bounds();
    var57.setBounds(var77);
    var56.setMaximizedBounds(var77);
    java.awt.Container var80 = var56.getContentPane();
    boolean var81 = var56.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.MainFrame var82 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var83 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var84 = var83.getTableExclusions();
    boolean var85 = var83.isEvaluateAllEnabled();
    java.util.List var86 = var83.getColumnDetails();
    var82.setIconImages(var86);
    boolean var88 = var82.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var89 = var82.getModalExclusionType();
    var56.setModalExclusionType(var89);
    var56.setEnabled(true);
    javax.swing.JLayeredPane var93 = var56.getLayeredPane();
    var44.setLayeredPane(var93);
    boolean var95 = var36.isAncestorOf((java.awt.Component)var93);
    java.awt.GraphicsConfiguration var96 = var93.getGraphicsConfiguration();
    java.awt.event.HierarchyListener[] var97 = var93.getHierarchyListeners();
    var0.setLayeredPane(var93);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "SchemaSpy"+ "'", var35.equals("SchemaSpy"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test38");


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
    float var25 = var0.getOpacity();
    java.lang.String var26 = var0.getTitle();
    var0.reshape(0, 11, (-3), 0);
    var0.setFocusCycleRoot(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var34 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var34.requestFocus();
    var34.setFocusTraversalPolicyProvider(true);
    var34.firePropertyChange("a", (byte)10, (byte)0);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var44 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var45 = var44.entrySet();
    var34.setFocusTraversalKeys(0, var45);
    java.awt.dnd.DropTarget var47 = var34.getDropTarget();
    net.sourceforge.schemaspy.ui.MainFrame var48 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var49 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var50 = var49.getTableExclusions();
    boolean var51 = var49.isEvaluateAllEnabled();
    java.util.List var52 = var49.getColumnDetails();
    var48.setIconImages(var52);
    boolean var54 = var48.isAlwaysOnTop();
    var48.setFocusableWindowState(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var57 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var57.requestFocus();
    var57.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var61 = var57.insets();
    float var62 = var57.getAlignmentX();
    boolean var65 = var57.contains(1, (-1));
    var57.transferFocus();
    var57.removeAll();
    java.awt.Component var69 = var48.add((java.awt.Component)var57, 0);
    var57.addNotify();
    java.awt.Rectangle var71 = var57.getBounds();
    java.awt.Rectangle var72 = var34.getBounds(var71);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var72);
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
    assertTrue(var25 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "SchemaSpy"+ "'", var26.equals("SchemaSpy"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test39");


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

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test40");


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
    boolean var25 = var0.isAlwaysOnTop();
    java.awt.dnd.DropTarget var26 = var0.getDropTarget();
    java.awt.GraphicsConfiguration var27 = var0.getGraphicsConfiguration();
    
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
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test41");


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
    javax.accessibility.AccessibleContext var31 = var0.getAccessibleContext();
    boolean var32 = var0.isForegroundSet();
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
    boolean var51 = var33.hasFocus();
    var0.setGlassPane((java.awt.Component)var33);
    java.awt.Component var53 = var0.getFocusOwner();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test42");


    net.sourceforge.schemaspy.model.InvalidConfigurationException var1 = new net.sourceforge.schemaspy.model.InvalidConfigurationException("DbSpecificOption name: 'DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'' value: 'null' description: 'net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]'");

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test43");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    java.lang.String var2 = var0.getCharset();
    var0.setIndirectColumnExclusions("a");
    var0.setHighQuality(false);
    java.lang.String var7 = var0.getHost();
    java.lang.String var8 = var0.getCharset();
    var0.setMaxDetailedTabled(1);
    boolean var11 = var0.isLowQuality();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "ISO-8859-1"+ "'", var2.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "ISO-8859-1"+ "'", var8.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test44");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    int var6 = var0.getExtendedState();
    var0.setFocusableWindowState(true);
    var0.setExtendedState(1);
    java.awt.MenuBar var11 = var0.getMenuBar();
    boolean var12 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    var0.doLayout();
    var0.setUndecorated(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test45");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.isHighQuality();
    int var6 = var0.getMaxDetailedTables();
    var0.setHasOrphans(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 300);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test46");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = var0.isVisible();
    java.awt.Dimension var7 = var0.preferredSize();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var10 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var10.clear();
    java.util.List var12 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var10);
    var10.clear();
    java.lang.Object var14 = var10.clone();
    java.lang.String var15 = var10.toString();
    java.util.Set var16 = var10.keySet();
    java.util.List var17 = net.sourceforge.schemaspy.DbAnalyzer.getForeignKeyConstraints((java.util.Collection)var16);
    var0.setFocusTraversalKeys(3, var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "{}"+ "'", var15.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test47");


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
    javax.swing.JRootPane var31 = var0.getRootPane();
    java.awt.Insets var32 = var31.insets();
    int var33 = var31.getHeight();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var34 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    int var36 = var34.findColumn("a");
    java.lang.Class var38 = var34.getColumnClass(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var39 = var31.<java.util.EventListener>getListeners(var38);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test48");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(10, (-3));
    var0.fireTableRowsDeleted((-1), 0);
    net.sourceforge.schemaspy.ui.DbConfigPanel var7 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var7.setFocusable(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var14 = var10.insets();
    var10.setAlignmentX(1.0f);
    boolean var17 = var10.hasFocus();
    boolean var18 = var10.getFocusTraversalKeysEnabled();
    var10.setSize(1, (-1));
    java.lang.Object var22 = var7.getClientProperty((java.lang.Object)var10);
    var10.firePropertyChange("net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s", ' ', ' ');
    var10.repaint(1L);
    boolean var29 = var10.isFocusOwner();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setValueAt((java.lang.Object)var10, 2, 10);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test49");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    var0.setTableInclusions("");
    var0.setHasOrphans(true);
    var0.setUser("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    boolean var14 = var0.isEvaluateAllEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test50");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Class var5 = var0.getClass(3);
    var0.fireTableCellUpdated(5, 312);
    java.lang.Class var10 = var0.getColumnClass(312);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test51");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var1.clear();
    net.sourceforge.schemaspy.ui.DbConfigPanel var3 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var3.requestFocus();
    var3.setFocusTraversalPolicyProvider(true);
    java.awt.Point var8 = var3.getMousePosition(true);
    java.awt.Component var9 = var3.getNextFocusableComponent();
    java.awt.Dimension var10 = var3.getMinimumSize();
    boolean var11 = var1.containsValue((java.lang.Object)var3);
    net.sourceforge.schemaspy.ui.DbConfigPanel var12 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var12.requestFocus();
    var12.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var16 = var12.insets();
    var12.setAlignmentX(1.0f);
    boolean var19 = var12.hasFocus();
    boolean var20 = var12.getFocusTraversalKeysEnabled();
    boolean var21 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var12);
    var12.firePropertyChange("hi!", 'a', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var26 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var27 = var26.isManagingFocus();
    int var28 = var26.getWidth();
    java.awt.Insets var29 = var26.insets();
    javax.accessibility.AccessibleContext var30 = var26.getAccessibleContext();
    boolean var33 = var26.inside(100, (-3));
    java.awt.Rectangle var34 = var26.getVisibleRect();
    var12.setBounds(var34);
    net.sourceforge.schemaspy.ui.DbConfigPanel var36 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var36.requestFocus();
    var36.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var40 = var36.insets();
    float var41 = var36.getAlignmentX();
    net.sourceforge.schemaspy.ui.DbConfigPanel var42 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var42.requestFocus();
    var42.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var46 = var42.insets();
    var42.requestFocus();
    var42.setOpaque(false);
    javax.swing.plaf.PanelUI var50 = var42.getUI();
    var36.setUI(var50);
    var12.setUI(var50);
    net.sourceforge.schemaspy.ui.DbConfigPanel var53 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    int var54 = var53.getY();
    net.sourceforge.schemaspy.ui.DbConfigPanel var55 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var55.requestFocus();
    var55.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var59 = var55.insets();
    var55.setAlignmentX(1.0f);
    boolean var62 = var55.hasFocus();
    boolean var63 = var55.getFocusTraversalKeysEnabled();
    boolean var64 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var55);
    var55.firePropertyChange("hi!", 'a', 'a');
    java.lang.String var69 = var55.getUIClassID();
    java.awt.Point var71 = var55.getMousePosition(false);
    java.awt.Point var72 = var55.location();
    java.awt.Component var73 = var53.getComponentAt(var72);
    var3.putClientProperty((java.lang.Object)var12, (java.lang.Object)var53);
    var53.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "PanelUI"+ "'", var69.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test52");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    boolean var3 = var0.exists();
    var0.setFormat("ora");
    var0.setRenderer("PanelUI");
    var0.setHighQuality(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test53");


    net.sourceforge.schemaspy.util.LineWriter var2 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", "ISO-8859-1");

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test54");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    java.awt.Insets var9 = var0.getInsets();
    var0.paintImmediately(3, 100, 300, 5);
    int var17 = var0.getBaseline(300, 0);
    var0.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test55");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("hi!s");
    var0.setHighQuality(true);
    boolean var7 = var0.supportsCenteredEastWestEdges();
    var0.setFormat("hi!");
    java.lang.String var10 = var0.getSupportedVersions();
    java.lang.String var11 = var0.getRenderer();
    var0.setFormat("ISO-8859-1");
    boolean var14 = var0.exists();
    var0.setRenderer("Unknown");
    
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

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test56");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    var0.setEncodeCommentsEnabled(true);
    var0.setRankDirBugEnabled(false);
    var0.setSqlFormatter("hi!");
    var0.setRailsEnabled(true);
    java.lang.String var11 = var0.getCharset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "ISO-8859-1"+ "'", var11.equals("ISO-8859-1"));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test57");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    boolean var7 = var0.isOpaque();
    var0.pack();
    var0.setLocationByPlatform(false);
    java.awt.Dimension var11 = var0.getMaximumSize();
    
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
    assertNotNull(var11);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test58");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var10 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var11 = var10.entrySet();
    var0.setFocusTraversalKeys(0, var11);
    java.util.List var13 = net.sourceforge.schemaspy.DbAnalyzer.getTablesWithOneColumn((java.util.Collection)var11);
    java.util.List var14 = net.sourceforge.schemaspy.DbAnalyzer.sortTablesByName(var13);
    java.util.List var15 = net.sourceforge.schemaspy.DbAnalyzer.getTablesWithOneColumn((java.util.Collection)var14);
    java.util.List var16 = net.sourceforge.schemaspy.DbAnalyzer.getTablesWithoutIndexes((java.util.Collection)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test59");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    var0.setTableExclusions("ISO-8859-1");
    boolean var6 = var0.isDbHelpRequired();
    boolean var7 = var0.hasOrphans();
    java.util.regex.Pattern var8 = var0.getTableExclusions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test60");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    var0.paintImmediately(0, (-1), (-1), 0);
    var0.setRequestFocusEnabled(false);
    java.awt.im.InputMethodRequests var10 = var0.getInputMethodRequests();
    java.awt.GraphicsConfiguration var11 = var0.getGraphicsConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test61");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var4 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ConnectionFailure var6 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ConnectionFailure var7 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.InvalidConfigurationException var9 = var4.setParamName("hi!");
    net.sourceforge.schemaspy.model.InvalidConfigurationException var11 = var4.setParamName("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. ");
    net.sourceforge.schemaspy.view.StyleSheet.ParseException var12 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException((java.lang.Exception)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test62");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    java.awt.Component var2 = var0.getMostRecentFocusOwner();
    var0.setExtendedState(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test63");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    var0.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var13 = var0.getLocation();
    var0.setFocusCycleRoot(true);
    var0.firePropertyChange("ora", 431, 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test64");


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
    var0.setConnectionProperties("Value");
    java.lang.String var15 = var0.getPassword();
    
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
    assertNull(var15);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test65");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isOpaque();
    var0.setUndecorated(false);
    java.awt.Point var10 = var0.getMousePosition(false);
    boolean var11 = var0.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test66");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    java.awt.event.HierarchyBoundsListener[] var5 = var0.getHierarchyBoundsListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    var6.firePropertyChange("hi!", 10, 2);
    var6.paintImmediately(100, 10, 2, 0);
    java.lang.Object var22 = var0.getClientProperty((java.lang.Object)100);
    java.awt.FocusTraversalPolicy var23 = var0.getFocusTraversalPolicy();
    var0.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test67");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    java.awt.Point var8 = var0.getMousePosition();
    var0.paintImmediately(100, 2, 10, 5);
    net.sourceforge.schemaspy.ui.MainFrame var14 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var15 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var16 = var15.getTableExclusions();
    boolean var17 = var15.isEvaluateAllEnabled();
    java.util.List var18 = var15.getColumnDetails();
    var14.setIconImages(var18);
    boolean var20 = var14.isAlwaysOnTop();
    var14.setFocusableWindowState(true);
    boolean var23 = var14.isFocusCycleRoot();
    java.awt.Graphics var24 = var14.getGraphics();
    boolean var25 = var14.isFocusCycleRoot();
    java.awt.Dimension var26 = var14.size();
    var0.setPreferredSize(var26);
    java.awt.GraphicsConfiguration var28 = var0.getGraphicsConfiguration();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test68");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("hi!s");
    var0.setHighQuality(true);
    boolean var7 = var0.exists();
    java.lang.String var8 = var0.getSupportedVersions();
    boolean var10 = var0.supportsRenderer("java.io.FileNotFoundException:  (No such file or directory)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "dot version 2.2.1 or versions greater than 2.4"+ "'", var8.equals("dot version 2.2.1 or versions greater than 2.4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test69");


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
    var0.resetKeyboardActions();
    boolean var29 = var0.inside((-3), 2);
    
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
    assertTrue(var29 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test70");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var1.clear();
    java.util.List var3 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var1);
    var1.clear();
    java.lang.Object var5 = var1.clone();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var7 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var8 = var7.entrySet();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var10 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.List var11 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var10);
    net.sourceforge.schemaspy.Config var12 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var13 = var12.getTableExclusions();
    boolean var14 = var12.isHtmlGenerationEnabled();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var16 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var16.clear();
    var12.setDbSpecificOptions((java.util.Map)var16);
    java.lang.String var19 = var16.toString();
    var10.putAll((java.util.Map)var16);
    var7.putAll((java.util.Map)var16);
    var1.putAll((java.util.Map)var7);
    boolean var23 = var7.isEmpty();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var25 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var25.clear();
    java.util.List var27 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var25);
    java.util.Set var28 = var25.entrySet();
    net.sourceforge.schemaspy.Config var29 = new net.sourceforge.schemaspy.Config();
    var29.setDb("a");
    java.lang.String var32 = var29.getServer();
    boolean var33 = var29.isHtmlGenerationEnabled();
    java.lang.String var34 = var29.getSchemaSpec();
    var29.setViewsEnabled(false);
    boolean var37 = var25.containsValue((java.lang.Object)false);
    var7.putAll((java.util.Map)var25);
    net.sourceforge.schemaspy.Config.MissingRequiredParameterException var42 = new net.sourceforge.schemaspy.Config.MissingRequiredParameterException("hi!", "ISO-8859-1", false);
    net.sourceforge.schemaspy.model.ProcessExecutionException var44 = new net.sourceforge.schemaspy.model.ProcessExecutionException("a");
    net.sourceforge.schemaspy.model.ConnectionFailure var45 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var44);
    var42.addSuppressed((java.lang.Throwable)var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var47 = var7.remove((java.lang.Object)var44);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "{}"+ "'", var19.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test71");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    java.awt.LayoutManager var6 = var0.getLayout();
    var0.setSize((-3), 431);
    boolean var10 = var0.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test72");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var7 = var0.getModalExclusionType();
    boolean var8 = var0.isAutoRequestFocus();
    java.awt.im.InputContext var9 = var0.getInputContext();
    var0.dispose();
    
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

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test73");


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
    java.lang.String var25 = var0.getUIClassID();
    
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
    assertTrue("'" + var25 + "' != '" + "PanelUI"+ "'", var25.equals("PanelUI"));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test74");


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
    java.lang.String var13 = var0.getRenderer();
    java.util.List var14 = var0.getColumnDetails();
    boolean var15 = var0.isRankDirBugEnabled();
    java.lang.String var16 = var0.getMeta();
    
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
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test75");


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
    javax.swing.JMenuBar var86 = var0.getJMenuBar();
    
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
    assertNull(var86);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test76");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Component var1 = var0.getGlassPane();
    javax.swing.TransferHandler var2 = var0.getTransferHandler();
    java.awt.dnd.DropTarget var3 = var0.getDropTarget();
    int var4 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test77");


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
    var0.setAutoscrolls(true);
    
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

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test78");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setMaxDbThreads(1);
    var0.setNumRowsEnabled(false);
    var0.setEncodeCommentsEnabled(false);
    java.lang.String var7 = var0.getCharset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "ISO-8859-1"+ "'", var7.equals("ISO-8859-1"));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test79");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    boolean var8 = var0.contains(1, (-1));
    var0.setOpaque(false);
    var0.repaint(10L);
    java.awt.Dimension var13 = var0.getSize();
    java.awt.Rectangle var14 = var0.getBounds();
    boolean var15 = var0.requestFocusInWindow();
    var0.removeAll();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test80");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.writeln();
    net.sourceforge.schemaspy.util.LineWriter var8 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var8.flush();
    var8.write("a");
    char[] var12 = new char[] { };
    var8.write(var12);
    var3.write(var12);
    var3.writeln();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test81");


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
    var23.setDoubleBuffered(false);
    
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

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test82");


    net.sourceforge.schemaspy.SchemaAnalyzer var0 = new net.sourceforge.schemaspy.SchemaAnalyzer();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    var1.setDb("a");
    java.lang.String var4 = var1.getServer();
    boolean var5 = var1.isHtmlGenerationEnabled();
    boolean var6 = var1.isMeterEnabled();
    net.sourceforge.schemaspy.model.Database var7 = var0.analyze(var1);
    net.sourceforge.schemaspy.Config var8 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var9 = var8.getTableExclusions();
    boolean var10 = var8.isRankDirBugEnabled();
    var8.setMaxDetailedTabled(0);
    net.sourceforge.schemaspy.model.Database var13 = var0.analyze(var8);
    var8.setRenderer("net.sourceforge.schemaspy.ui.MainFrame[frame0,0,23,500x431,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test83");


    net.sourceforge.schemaspy.util.DbSpecificOption var3 = new net.sourceforge.schemaspy.util.DbSpecificOption("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", "schemaSpy.css", "{}");
    java.lang.String var4 = var3.getName();
    var3.setValue((java.lang.Object)0L);
    java.lang.String var7 = var3.getName();
    net.sourceforge.schemaspy.Config.MissingRequiredParameterException var12 = new net.sourceforge.schemaspy.Config.MissingRequiredParameterException("hi!", "ISO-8859-1", false);
    net.sourceforge.schemaspy.model.ProcessExecutionException var14 = new net.sourceforge.schemaspy.model.ProcessExecutionException("a");
    net.sourceforge.schemaspy.model.ConnectionFailure var15 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var14);
    var12.addSuppressed((java.lang.Throwable)var14);
    boolean var17 = var12.isDbTypeSpecific();
    net.sourceforge.schemaspy.model.ProcessExecutionException var18 = new net.sourceforge.schemaspy.model.ProcessExecutionException("{}", (java.lang.Throwable)var12);
    var3.setValue((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var4,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"+ "'", var4.equals("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var4,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var7,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"+ "'", var7.equals("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var7,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test84");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var18 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var18.requestFocus();
    var18.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var24 = var18.getBackground();
    var18.requestFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var26 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var26.requestFocus();
    var26.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var30 = var26.insets();
    var26.setAlignmentX(1.0f);
    var26.firePropertyChange("hi!", 10, 2);
    var26.setVisible(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var39 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var39.requestFocus();
    var39.setFocusTraversalPolicyProvider(true);
    java.awt.Point var44 = var39.getMousePosition(true);
    java.awt.Component var45 = var39.getNextFocusableComponent();
    java.awt.Dimension var46 = var39.getMinimumSize();
    var26.setPreferredSize(var46);
    java.awt.Dimension var48 = var18.getSize(var46);
    var6.setSize(var48);
    var6.pack();
    java.awt.im.InputContext var51 = var6.getInputContext();
    var6.setTitle("ora");
    boolean var54 = var6.isFocused();
    java.awt.Component var57 = var6.findComponentAt(23, 5);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test85");


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
    net.sourceforge.schemaspy.ui.MainFrame var38 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var39 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var39.requestFocus();
    var39.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var43 = var39.insets();
    var39.setAlignmentX(1.0f);
    java.awt.Color var46 = var39.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var47 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var47.requestFocus();
    var47.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var51 = var47.insets();
    float var52 = var47.getAlignmentX();
    var47.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var58 = var47.getMouseListeners();
    java.awt.Rectangle var59 = var47.bounds();
    var39.setBounds(var59);
    var38.setMaximizedBounds(var59);
    java.awt.Container var62 = var38.getContentPane();
    net.sourceforge.schemaspy.ui.DbConfigPanel var63 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var64 = var63.isManagingFocus();
    java.awt.Rectangle var65 = var63.getVisibleRect();
    var38.setBounds(var65);
    var38.hide();
    java.util.List var68 = var38.getIconImages();
    java.util.List var69 = net.sourceforge.schemaspy.DbAnalyzer.sortColumnsByTable(var68);
    java.util.List var70 = net.sourceforge.schemaspy.DbAnalyzer.getTablesWithOneColumn((java.util.Collection)var69);
    java.util.List var71 = net.sourceforge.schemaspy.DbAnalyzer.getTablesWithoutIndexes((java.util.Collection)var70);
    net.sourceforge.schemaspy.util.LineWriter var75 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var75.newLine();
    var75.writeln("[]");
    var75.write(5);
    var0.writeCheckConstraints((java.util.Collection)var70, var75);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test86");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var67 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var67.requestFocus();
    var67.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var71 = var67.insets();
    java.awt.event.HierarchyBoundsListener[] var72 = var67.getHierarchyBoundsListeners();
    javax.swing.border.Border var73 = var67.getBorder();
    var0.setGlassPane((java.awt.Component)var67);
    java.awt.event.WindowFocusListener[] var75 = var0.getWindowFocusListeners();
    int var76 = var0.getState();
    net.sourceforge.schemaspy.ui.DbConfigPanel var77 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var77.requestFocus();
    var77.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var81 = var77.insets();
    var77.setAlignmentX(1.0f);
    var77.firePropertyChange("hi!", 10, 2);
    var77.paintImmediately(100, 10, 2, 0);
    java.util.Set var94 = var77.getFocusTraversalKeys(2);
    java.awt.Cursor var95 = var77.getCursor();
    var0.setCursor(var95);
    
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
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test87");


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
    java.awt.Dialog.ModalExclusionType var50 = var0.getModalExclusionType();
    net.sourceforge.schemaspy.ui.DbConfigPanel var51 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var51.requestFocus();
    var51.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var57 = var51.getBackground();
    var51.firePropertyChange("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", '#', ' ');
    java.awt.Component var63 = var0.add((java.awt.Component)var51, 0);
    java.awt.Toolkit var64 = var63.getToolkit();
    
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
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test88");


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
    boolean var86 = var0.isFontSet();
    java.awt.MenuBar var87 = var0.getMenuBar();
    
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
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test89");


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
    javax.swing.InputVerifier var17 = var0.getInputVerifier();
    java.awt.Component.BaselineResizeBehavior var18 = var0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test90");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var14 = var10.insets();
    var10.setAlignmentX(1.0f);
    java.awt.Color var17 = var10.getForeground();
    var0.setForeground(var17);
    var0.setBounds((-3), 5, 0, 100);
    var0.setAutoRequestFocus(true);
    var0.setVisible(false);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test91");


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
    net.sourceforge.schemaspy.ui.MainFrame var23 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var24 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var24.requestFocus();
    var24.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var28 = var24.insets();
    var24.setAlignmentX(1.0f);
    java.awt.Color var31 = var24.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var32 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var32.requestFocus();
    var32.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var36 = var32.insets();
    float var37 = var32.getAlignmentX();
    var32.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var43 = var32.getMouseListeners();
    java.awt.Rectangle var44 = var32.bounds();
    var24.setBounds(var44);
    var23.setMaximizedBounds(var44);
    java.util.List var47 = var23.getIconImages();
    java.awt.Rectangle var48 = var23.getMaximizedBounds();
    java.awt.Dimension var49 = var23.minimumSize();
    var0.setMaximumSize(var49);
    net.sourceforge.schemaspy.ui.DbConfigPanel var51 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var51.requestFocus();
    java.beans.PropertyChangeListener[] var53 = var51.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var54 = var51.getBaselineResizeBehavior();
    boolean var55 = var51.isDisplayable();
    net.sourceforge.schemaspy.ui.DbConfigPanel var56 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var56.requestFocus();
    var56.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var60 = var56.insets();
    var56.setAlignmentX(1.0f);
    net.sourceforge.schemaspy.ui.DbConfigPanel var63 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var63.requestFocus();
    var63.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var67 = var63.insets();
    float var68 = var63.getAlignmentX();
    var63.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var74 = var63.getBounds();
    java.awt.Rectangle var75 = var56.getBounds(var74);
    var51.scrollRectToVisible(var75);
    java.awt.Dimension var77 = var51.getMaximumSize();
    java.awt.Dimension var78 = var0.getSize(var77);
    int var79 = var0.getX();
    
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
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test92");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.hasOrphans();
    var0.setCatalog("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    var0.setServer("ora");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test93");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.lang.String var13 = var11.getDefinitionLanguage();
    java.util.List var14 = var11.getParameters();
    var0.setColumnDetails(var14);
    java.lang.String var16 = var0.getCharset();
    java.util.regex.Pattern var17 = var0.getColumnExclusions();
    var0.setPort((java.lang.Integer)100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Properties var20 = var0.getDbProperties();
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "ISO-8859-1"+ "'", var16.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test94");


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
    java.awt.event.WindowListener[] var11 = var0.getWindowListeners();
    java.lang.String var12 = var0.getTitle();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "SchemaSpy"+ "'", var12.equals("SchemaSpy"));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test95");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("hi!s");
    var0.setHighQuality(true);
    boolean var7 = var0.exists();
    java.lang.String var8 = var0.getSupportedVersions();
    boolean var9 = var0.exists();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "dot version 2.2.1 or versions greater than 2.4"+ "'", var8.equals("dot version 2.2.1 or versions greater than 2.4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test96");


    net.sourceforge.schemaspy.util.PasswordReader var1 = net.sourceforge.schemaspy.util.PasswordReader.getInstance();
    net.sourceforge.schemaspy.model.ProcessExecutionException var3 = new net.sourceforge.schemaspy.model.ProcessExecutionException("a");
    net.sourceforge.schemaspy.util.PasswordReader.IOError var4 = var1.new IOError((java.lang.Throwable)var3);
    net.sourceforge.schemaspy.model.ConnectionFailure var6 = new net.sourceforge.schemaspy.model.ConnectionFailure("DbSpecificOption name: 'net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s' value: 'null' description: 'a'");
    net.sourceforge.schemaspy.util.PasswordReader.IOError var7 = var1.new IOError((java.lang.Throwable)var6);
    net.sourceforge.schemaspy.model.ProcessExecutionException var8 = new net.sourceforge.schemaspy.model.ProcessExecutionException("hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s", (java.lang.Throwable)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test97");


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
    java.awt.event.ComponentListener[] var49 = var0.getComponentListeners();
    int var50 = var0.getCursorType();
    int var51 = var0.getHeight();
    java.awt.Container var52 = var0.getContentPane();
    boolean var53 = var0.isOpaque();
    java.awt.Component.BaselineResizeBehavior var54 = var0.getBaselineResizeBehavior();
    
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
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 312);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test98");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    net.sourceforge.schemaspy.view.SqlFormatter var8 = var0.getSqlFormatter();
    var0.setHasRoutines(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test99");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isDbHelpRequired();
    var0.setCharset("dot version 2.2.1 or versions greater than 2.4");
    java.util.regex.Pattern var7 = var0.getIndirectColumnExclusions();
    var0.setIndirectColumnExclusions("ISO-8859-1");
    var0.setHtmlGenerationEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test100");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.lang.String var11 = var9.getSecurityType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test101");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var6 = var0.getBackground();
    var0.requestFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    var8.setAlignmentX(1.0f);
    var8.firePropertyChange("hi!", 10, 2);
    var8.setVisible(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var21 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var21.requestFocus();
    var21.setFocusTraversalPolicyProvider(true);
    java.awt.Point var26 = var21.getMousePosition(true);
    java.awt.Component var27 = var21.getNextFocusableComponent();
    java.awt.Dimension var28 = var21.getMinimumSize();
    var8.setPreferredSize(var28);
    java.awt.Dimension var30 = var0.getSize(var28);
    java.awt.Component[] var31 = var0.getComponents();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var34 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var34.clear();
    java.util.List var36 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var34);
    java.util.Set var37 = var34.entrySet();
    net.sourceforge.schemaspy.Config var38 = new net.sourceforge.schemaspy.Config();
    var38.setDb("a");
    java.lang.String var41 = var38.getServer();
    boolean var42 = var38.isHtmlGenerationEnabled();
    java.lang.String var43 = var38.getSchemaSpec();
    var38.setViewsEnabled(false);
    boolean var46 = var34.containsValue((java.lang.Object)false);
    java.util.Set var47 = var34.keySet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys(11, var47);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test102");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    var0.setAlignmentY(100.0f);
    java.awt.Insets var11 = var0.getInsets();
    boolean var12 = var0.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test103");


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
    java.awt.Insets var36 = var0.insets();
    boolean var37 = var0.getAutoscrolls();
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test104");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    boolean var3 = var0.hasFocus();
    var0.repaint(0L, 5, 5, 100, 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test105");


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
    var0.removeNotify();
    boolean var35 = var0.isForegroundSet();
    
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
    assertTrue(var35 == true);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test106");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var1.clear();
    java.util.List var3 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var1);
    var1.clear();
    java.lang.Object var5 = var1.clone();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var7 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var8 = var7.entrySet();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var10 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.List var11 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var10);
    net.sourceforge.schemaspy.Config var12 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var13 = var12.getTableExclusions();
    boolean var14 = var12.isHtmlGenerationEnabled();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var16 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var16.clear();
    var12.setDbSpecificOptions((java.util.Map)var16);
    java.lang.String var19 = var16.toString();
    var10.putAll((java.util.Map)var16);
    var7.putAll((java.util.Map)var16);
    var1.putAll((java.util.Map)var7);
    boolean var23 = var7.isEmpty();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var25 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var25.clear();
    java.util.List var27 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var25);
    java.util.Set var28 = var25.entrySet();
    net.sourceforge.schemaspy.Config var29 = new net.sourceforge.schemaspy.Config();
    var29.setDb("a");
    java.lang.String var32 = var29.getServer();
    boolean var33 = var29.isHtmlGenerationEnabled();
    java.lang.String var34 = var29.getSchemaSpec();
    var29.setViewsEnabled(false);
    boolean var37 = var25.containsValue((java.lang.Object)false);
    var7.putAll((java.util.Map)var25);
    net.sourceforge.schemaspy.Config var39 = new net.sourceforge.schemaspy.Config();
    var39.setDb("a");
    java.lang.String var42 = var39.getServer();
    boolean var43 = var39.isHtmlGenerationEnabled();
    java.util.regex.Pattern var44 = var39.getColumnExclusions();
    java.util.Map var45 = var39.getDbSpecificOptions();
    var39.setHasOrphans(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var48 = var7.get((java.lang.Object)true);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "{}"+ "'", var19.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test107");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.Set var3 = var1.entrySet();
    java.util.List var4 = net.sourceforge.schemaspy.DbAnalyzer.getImpliedConstraints((java.util.Collection)var3);
    java.util.List var5 = net.sourceforge.schemaspy.DbAnalyzer.getImpliedConstraints((java.util.Collection)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test108");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    var0.paintImmediately(0, (-1), (-1), 0);
    boolean var8 = var0.isForegroundSet();
    java.awt.event.ContainerListener[] var9 = var0.getContainerListeners();
    javax.accessibility.AccessibleContext var10 = var0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test109");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.hasOrphans();
    boolean var5 = var0.hasOrphans();
    java.lang.Integer var6 = var0.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test110");


    net.sourceforge.schemaspy.model.ConnectionFailure var1 = new net.sourceforge.schemaspy.model.ConnectionFailure("{}s");

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test111");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setRenderer("{}s");
    net.sourceforge.schemaspy.view.SqlFormatter var4 = var0.getSqlFormatter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test112");


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
    boolean var45 = var0.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.DbConfigPanel var46 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var46.requestFocus();
    var46.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var50 = var46.insets();
    var46.reshape(1, 1, 1, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var56 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var56.requestFocus();
    var56.setFocusTraversalPolicyProvider(true);
    java.awt.Point var61 = var56.getMousePosition(true);
    java.awt.Component var62 = var56.getNextFocusableComponent();
    java.awt.Dimension var63 = var56.getMinimumSize();
    java.awt.Dimension var64 = var46.getSize(var63);
    var0.setSize(var63);
    java.awt.Point var66 = var0.getLocation();
    var0.setLocation(2, (-1));
    
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
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test113");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("a");
    net.sourceforge.schemaspy.util.Dot.DotFailure var6 = var0.new DotFailure("java.io.FileNotFoundException:  (No such file or directory)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test114");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    float var8 = var0.getAlignmentX();
    boolean var9 = var0.isFocusTraversalPolicyProvider();
    var0.requestFocus();
    var0.transferFocusDownCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test115");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    javax.swing.InputVerifier var8 = var0.getInputVerifier();
    var0.repaint(100L, 10, 1, 0, 100);
    java.awt.Component.BaselineResizeBehavior var15 = var0.getBaselineResizeBehavior();
    java.util.Locale var16 = var0.getLocale();
    int var17 = var0.getHeight();
    java.awt.im.InputMethodRequests var18 = var0.getInputMethodRequests();
    net.sourceforge.schemaspy.ui.DbConfigPanel var19 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var19.requestFocus();
    var19.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var23 = var19.insets();
    var19.setAlignmentX(1.0f);
    var19.firePropertyChange("hi!", 10, 2);
    var19.setVisible(false);
    var19.firePropertyChange("net.sourceforge.schemaspy.ui.MainFrame[frame1,0,23,500x312,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (byte)100, (byte)100);
    java.awt.Graphics var36 = var19.getGraphics();
    javax.swing.plaf.PanelUI var37 = var19.getUI();
    var0.setUI(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test116");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    java.awt.event.HierarchyBoundsListener[] var10 = var0.getHierarchyBoundsListeners();
    var0.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test117");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    var0.nextFocus();
    var0.list();
    var0.setRequestFocusEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test118");


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
    java.awt.Component var14 = var0.getComponent(1);
    net.sourceforge.schemaspy.ui.MainFrame var15 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var16 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var17 = var16.getTableExclusions();
    boolean var18 = var16.isEvaluateAllEnabled();
    java.util.List var19 = var16.getColumnDetails();
    var15.setIconImages(var19);
    boolean var21 = var15.isAlwaysOnTop();
    boolean var22 = var15.isOpaque();
    var15.pack();
    var15.addNotify();
    var0.remove((java.awt.Component)var15);
    boolean var26 = var0.getVerifyInputWhenFocusTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test119");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    var0.setFocusableWindowState(true);
    boolean var9 = var0.isFocusableWindow();
    var0.addNotify();
    
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

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test120");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isDbHelpRequired();
    var0.setCharset("dot version 2.2.1 or versions greater than 2.4");
    java.util.regex.Pattern var7 = var0.getIndirectColumnExclusions();
    var0.setIndirectColumnExclusions("ISO-8859-1");
    java.util.regex.Pattern var10 = var0.getTableInclusions();
    var0.setEncodeCommentsEnabled(true);
    var0.setServer("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");
    boolean var15 = var0.isPromptForPasswordEnabled();
    var0.setDbType("{}s");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test121");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var4 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ConnectionFailure var6 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.InvalidConfigurationException var8 = var4.setParamName("schemaSpy.css");
    java.lang.String var9 = var4.getParamName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "schemaSpy.css"+ "'", var9.equals("schemaSpy.css"));

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test122");


    net.sourceforge.schemaspy.util.DbSpecificOption var2 = new net.sourceforge.schemaspy.util.DbSpecificOption("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'", "net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    java.lang.Object var3 = var2.getValue();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "DbSpecificOption name: 'DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'' value: 'null' description: 'net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var4,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]'"+ "'", var4.equals("DbSpecificOption name: 'DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'' value: 'null' description: 'net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var4,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var5.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test123");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    java.lang.Object var5 = var0.getTreeLock();
    boolean var6 = var0.isFocusTraversalPolicyProvider();
    boolean var7 = var0.hasFocus();
    var0.firePropertyChange("a", 1.0f, 0.5f);
    java.awt.Component var12 = var0.getNextFocusableComponent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test124");


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
    java.awt.Rectangle var54 = var0.getBounds();
    boolean var55 = var0.requestFocusInWindow();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test125");


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
    java.awt.Component.BaselineResizeBehavior var22 = var0.getBaselineResizeBehavior();
    boolean var23 = var0.getAutoscrolls();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test126");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    var0.setFocusCycleRoot(true);
    var0.list();
    boolean var5 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test127");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(11);
    java.lang.Object var2 = var1.clone();
    java.util.Set var3 = var1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test128");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    var0.setSqlFormatter(".hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s.hi!s{hi!s}hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test129");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    java.awt.Insets var9 = var0.getInsets();
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var11 = var10.isManagingFocus();
    int var12 = var10.getWidth();
    java.awt.Insets var13 = var10.insets();
    java.awt.Insets var14 = var0.getInsets(var13);
    var0.setInheritsPopupMenu(true);
    var0.setEnabled(true);
    int var19 = var0.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test130");


    java.lang.String var1 = net.sourceforge.schemaspy.util.HtmlEncoder.encodeString("frame2");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "frame2"+ "'", var1.equals("frame2"));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test131");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    int var2 = var0.findColumn("a");
    net.sourceforge.schemaspy.util.DbSpecificConfig var4 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setDbSpecificConfig(var4);
    javax.swing.event.TableModelListener[] var6 = var0.getTableModelListeners();
    int var7 = var0.getRowCount();
    int var9 = var0.findColumn("a");
    var0.fireTableStructureChanged();
    boolean var13 = var0.isCellEditable(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test132");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    java.io.Writer var5 = var3.append((java.lang.CharSequence)"net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    java.io.Writer var7 = var3.append(' ');
    var3.write(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test133");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("Unknown");

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test134");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.doLayout();
    var0.firePropertyChange("hi!", 0.0d, 10.0d);
    net.sourceforge.schemaspy.ui.MainFrame var11 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var12 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var13 = var12.getTableExclusions();
    boolean var14 = var12.isEvaluateAllEnabled();
    java.util.List var15 = var12.getColumnDetails();
    var11.setIconImages(var15);
    boolean var17 = var11.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var18 = var11.getModalExclusionType();
    boolean var19 = var11.isAutoRequestFocus();
    boolean var20 = var11.isResizable();
    java.awt.Rectangle var21 = var11.getBounds();
    var0.computeVisibleRect(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test135");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setMaxDbThreads(1);
    var0.setNumRowsEnabled(false);
    var0.setNumRowsEnabled(false);
    var0.setFont("SchemaSpy");

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test136");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var1.clear();
    java.util.List var3 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var1);
    var1.clear();
    java.lang.Object var5 = var1.clone();
    java.lang.Object var6 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test137");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.firePropertyChange("hi!", 10, 2);
    net.sourceforge.schemaspy.ui.DbConfigPanel var11 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var11.requestFocus();
    var11.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var15 = var11.insets();
    float var16 = var11.getAlignmentX();
    var11.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var22 = var11.getBounds();
    var0.computeVisibleRect(var22);
    int var24 = var0.getY();
    var0.firePropertyChange("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", (short)(-1), (short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test138");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    java.awt.Insets var9 = var0.getInsets();
    boolean var10 = var0.isDoubleBuffered();
    java.awt.Component.BaselineResizeBehavior var11 = var0.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var14 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var14.clear();
    java.util.List var16 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var14);
    java.util.Set var17 = var14.entrySet();
    java.util.Set var18 = var14.entrySet();
    var0.setFocusTraversalKeys(1, var18);
    java.awt.im.InputContext var20 = var0.getInputContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test139");


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
    var3.firePropertyChange("net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s", ' ', ' ');
    var3.repaint(1L);
    boolean var22 = var3.isFocusOwner();
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    var23.setAlignmentX(1.0f);
    net.sourceforge.schemaspy.ui.DbConfigPanel var30 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var30.requestFocus();
    var30.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var34 = var30.insets();
    float var35 = var30.getAlignmentX();
    var30.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var41 = var30.getBounds();
    java.awt.Rectangle var42 = var23.getBounds(var41);
    java.awt.Rectangle var43 = var3.getBounds(var41);
    java.awt.event.HierarchyBoundsListener[] var44 = var3.getHierarchyBoundsListeners();
    var3.list();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test140");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    boolean var10 = var9.isDeterministic();
    java.lang.String var11 = var9.getSecurityType();
    java.lang.String var12 = var9.getComment();
    java.lang.String var13 = var9.getDefinition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test141");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    int var6 = var0.getExtendedState();
    var0.setFocusableWindowState(true);
    var0.setExtendedState(1);
    var0.setLocation(0, 5);
    var0.pack();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test142");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.lang.String var11 = var9.getDefinitionLanguage();
    net.sourceforge.schemaspy.model.Routine var21 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var22 = var21.getDataAccess();
    java.lang.String var23 = var21.getComment();
    int var24 = var9.compareTo(var21);
    java.lang.String var25 = var9.getDefinitionLanguage();
    
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
    assertTrue("'" + var25 + "' != '" + "a"+ "'", var25.equals("a"));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test143");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    boolean var7 = var0.isBackgroundSet();
    var0.transferFocus();
    net.sourceforge.schemaspy.util.DbSpecificOption var11 = new net.sourceforge.schemaspy.util.DbSpecificOption("", "ISO-8859-1");
    java.lang.String var12 = var11.toString();
    java.lang.String var13 = var11.getDescription();
    java.lang.Object var14 = var11.getValue();
    net.sourceforge.schemaspy.ui.MainFrame var15 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var16 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var17 = var16.getTableExclusions();
    boolean var18 = var16.isEvaluateAllEnabled();
    java.util.List var19 = var16.getColumnDetails();
    var15.setIconImages(var19);
    boolean var21 = var15.isAlwaysOnTop();
    var15.setFocusableWindowState(true);
    java.awt.Window[] var24 = var15.getOwnedWindows();
    java.awt.Component var25 = var15.getMostRecentFocusOwner();
    var11.setValue((java.lang.Object)var15);
    net.sourceforge.schemaspy.ui.DbConfigPanel var27 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var27.requestFocus();
    var27.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var33 = var27.getBackground();
    var27.requestFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var35 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var35.requestFocus();
    var35.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var39 = var35.insets();
    var35.setAlignmentX(1.0f);
    var35.firePropertyChange("hi!", 10, 2);
    var35.setVisible(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var48 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var48.requestFocus();
    var48.setFocusTraversalPolicyProvider(true);
    java.awt.Point var53 = var48.getMousePosition(true);
    java.awt.Component var54 = var48.getNextFocusableComponent();
    java.awt.Dimension var55 = var48.getMinimumSize();
    var35.setPreferredSize(var55);
    java.awt.Dimension var57 = var27.getSize(var55);
    var15.setSize(var57);
    var0.setMaximumSize(var57);
    var0.revalidate();
    var0.firePropertyChange("hi!s", (short)10, (short)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var12.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "ISO-8859-1"+ "'", var13.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test144");


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
    javax.swing.TransferHandler var19 = var0.getTransferHandler();
    java.awt.event.FocusListener[] var20 = var0.getFocusListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var21 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var21.requestFocus();
    var21.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var25 = var21.insets();
    var21.setAlignmentX(1.0f);
    var21.doLayout();
    boolean var29 = var21.isCursorSet();
    var21.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var34 = var21.getLocation();
    var21.setSize(2, 10);
    var21.grabFocus();
    java.awt.Color var39 = var21.getForeground();
    var21.hide();
    java.awt.Component var41 = var0.add((java.awt.Component)var21);
    
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test145");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.requestFocus();
    var6.setOpaque(false);
    var6.invalidate();
    java.awt.event.KeyListener[] var15 = var6.getKeyListeners();
    java.awt.event.ContainerListener[] var16 = var6.getContainerListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var17 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var17.requestFocus();
    var17.setFocusTraversalPolicyProvider(true);
    java.awt.Point var22 = var17.getMousePosition(true);
    java.awt.Component var23 = var17.getNextFocusableComponent();
    boolean var24 = var17.isBackgroundSet();
    var17.requestFocus();
    java.awt.Rectangle var26 = var17.getVisibleRect();
    java.awt.Rectangle var27 = var6.getBounds(var26);
    var0.setBounds(var27);
    java.awt.Component.BaselineResizeBehavior var29 = var0.getBaselineResizeBehavior();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test146");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isHtmlGenerationEnabled();
    var0.setColumnExclusions("Unknown");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var5 = var0.getRemainingParameters();
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test147");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    java.util.Locale var2 = var0.getLocale();
    java.awt.Dimension var3 = var0.getSize();
    java.awt.Toolkit var4 = var0.getToolkit();
    java.awt.Component var5 = var0.getFocusOwner();
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    boolean var10 = var6.requestFocusInWindow();
    java.awt.Dimension var11 = var6.getMaximumSize();
    var0.setMinimumSize(var11);
    boolean var13 = var0.isValidateRoot();
    var0.setTitle("hi!s{hi!s}hi!s.ISO-8859-1.net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test148");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    javax.swing.InputVerifier var8 = var0.getInputVerifier();
    var0.repaint(100L, 10, 1, 0, 100);
    var0.setName("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    javax.swing.event.AncestorListener[] var17 = var0.getAncestorListeners();
    var0.setInheritsPopupMenu(true);
    java.util.Locale var20 = var0.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test149");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var11 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var11.requestFocus();
    var11.setFocusTraversalPolicyProvider(true);
    boolean var15 = var11.requestFocusInWindow();
    java.awt.Dimension var16 = var11.getMaximumSize();
    var0.setPreferredSize(var16);
    javax.swing.JLayeredPane var18 = var0.getLayeredPane();
    java.lang.String var19 = var0.getWarningString();
    java.awt.Insets var20 = var0.insets();
    
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
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test150");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    var0.setAlignmentY(100.0f);
    boolean var11 = var0.isVisible();
    boolean var12 = var0.isEnabled();
    boolean var13 = var0.isManagingFocus();
    var0.firePropertyChange("net.sourceforge.schemaspy.ui.MainFrame[frame6,0,23,500x312,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test151");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = var0.isVisible();
    javax.swing.KeyStroke[] var7 = var0.getRegisteredKeyStrokes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test152");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.hasOrphans();
    java.lang.String var5 = var0.getHost();
    var0.setDb(" ");
    int var8 = var0.getFontSize();
    boolean var9 = var0.isMeterEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test153");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    java.lang.Object var5 = var0.getTreeLock();
    var0.doLayout();
    net.sourceforge.schemaspy.ui.DbConfigPanel var7 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var7.requestFocus();
    var7.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var11 = var7.insets();
    var7.setAlignmentX(1.0f);
    java.awt.Color var14 = var7.getForeground();
    javax.swing.InputVerifier var15 = var7.getInputVerifier();
    var7.repaint(100L, 10, 1, 0, 100);
    var7.setEnabled(false);
    javax.swing.InputMap var24 = var7.getInputMap();
    var7.firePropertyChange("{}s", '#', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var29 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var29.requestFocus();
    var29.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var33 = var29.insets();
    var29.setAlignmentX(1.0f);
    boolean var36 = var29.hasFocus();
    boolean var37 = var29.getFocusTraversalKeysEnabled();
    boolean var38 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var29);
    var29.firePropertyChange("hi!", 'a', 'a');
    java.lang.String var43 = var29.getUIClassID();
    var29.repaint();
    javax.swing.ActionMap var45 = var29.getActionMap();
    var7.setActionMap(var45);
    var0.setActionMap(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "PanelUI"+ "'", var43.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test154");


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
    var9.addNotify();
    boolean var23 = var9.isPaintingForPrint();
    var9.setAlignmentX(0.5f);
    boolean var26 = var9.isDoubleBuffered();
    
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
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test155");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    var0.setFocusCycleRoot(true);
    var0.list();
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
    var0.setMaximizedBounds(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test156");


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
    java.awt.Dialog.ModalExclusionType var23 = var0.getModalExclusionType();
    var0.setLocationByPlatform(true);
    
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
    assertNotNull(var23);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test157");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    java.lang.String var3 = var0.getRenderer();
    var0.setHighQuality(false);
    boolean var6 = var0.supportsCenteredEastWestEdges();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test158");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var7 = var0.getTableModelListeners();
    var0.fireTableRowsUpdated(0, 3);
    var0.fireTableRowsDeleted(300, 11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var15 = var0.getClass(431);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test159");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    int var9 = var0.getHeight();
    java.awt.Rectangle var10 = var0.getVisibleRect();
    net.sourceforge.schemaspy.ui.DbConfigPanel var11 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var11.requestFocus();
    var11.setFocusTraversalPolicyProvider(true);
    var11.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var19 = var11.insets();
    var11.setAlignmentY(100.0f);
    java.awt.Image var24 = var11.createImage(1, 1);
    java.awt.Dimension var25 = var11.getSize();
    java.awt.Dimension var26 = var0.getSize(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test160");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    java.util.Locale var2 = var0.getLocale();
    java.awt.Dimension var3 = var0.getSize();
    java.awt.Toolkit var4 = var0.getToolkit();
    java.awt.Component var5 = var0.getFocusOwner();
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    boolean var10 = var6.requestFocusInWindow();
    java.awt.Dimension var11 = var6.getMaximumSize();
    var0.setMinimumSize(var11);
    boolean var13 = var0.isValidateRoot();
    var0.repaint(312, 11, 3, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test161");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    var0.fireTableRowsDeleted(2, 0);
    javax.swing.event.TableModelListener[] var10 = var0.getTableModelListeners();
    var0.fireTableCellUpdated((-3), 3);
    var0.fireTableCellUpdated(23, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test162");


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
    java.awt.Component var26 = var0.getFocusOwner();
    var0.setFocusCycleRoot(false);
    var0.enableInputMethods(true);
    var0.setState(312);
    
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
    assertNull(var26);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test163");


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
    java.awt.Dimension var18 = var0.preferredSize();
    java.beans.PropertyChangeListener[] var20 = var0.getPropertyChangeListeners("net.sourceforge.schemaspy.ui.MainFrame[frame6,0,23,500x312,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    boolean var21 = var0.getFocusTraversalKeysEnabled();
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test164");


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
    boolean var17 = var0.hasFocus();
    var0.grabFocus();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test165");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    int var6 = var0.getExtendedState();
    var0.setFocusableWindowState(true);
    var0.toBack();
    boolean var10 = var0.isFocusableWindow();
    var0.setCursor(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test166");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var26 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var26.requestFocus();
    var26.setFocusTraversalPolicyProvider(true);
    var26.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var34 = var26.insets();
    var26.setAlignmentY(100.0f);
    java.awt.Image var39 = var26.createImage(1, 1);
    java.awt.Dimension var40 = var26.getSize();
    var0.setSize(var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var42 = var0.getLocationOnScreen();
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test167");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.util.regex.Pattern var5 = var0.getColumnExclusions();
    var0.setEvaluateAllEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test168");


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
    java.awt.image.ColorModel var25 = var0.getColorModel();
    var0.setInheritsPopupMenu(false);
    boolean var29 = var0.requestFocus(false);
    
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test169");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var0 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap();
    var0.clear();

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test170");


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
    var35.writeln();
    var35.write("PanelUI");
    
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

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test171");


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
    java.awt.FocusTraversalPolicy var11 = var0.getFocusTraversalPolicy();
    var0.disable();
    
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
    assertNotNull(var11);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test172");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    boolean var10 = var9.isDeterministic();
    java.lang.String var11 = var9.getSecurityType();
    java.lang.String var12 = var9.getDefinitionLanguage();
    java.lang.String var13 = var9.getDefinitionLanguage();
    java.lang.String var14 = var9.getComment();
    java.lang.String var15 = var9.getDefinition();
    java.lang.String var16 = var9.getType();
    java.lang.String var17 = var9.getType();
    java.lang.String var18 = var9.getDataAccess();
    java.lang.String var19 = var9.getDefinition();
    net.sourceforge.schemaspy.model.RoutineParameter var23 = new net.sourceforge.schemaspy.model.RoutineParameter("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin", "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'", "DbSpecificOption name: 'net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s' value: 'null' description: 'a'");
    java.lang.String var24 = var23.getName();
    var9.addParameter(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin"+ "'", var24.equals("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin"));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test173");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("ISO-8859-1");
    int var2 = var1.getSize();
    java.lang.Object var3 = var1.getSelectedItem();
    net.sourceforge.schemaspy.ui.DbConfigPanel var4 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var4.requestFocus();
    var4.setFocusTraversalPolicyProvider(true);
    var4.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var12 = var4.insets();
    var4.setAlignmentY(100.0f);
    var1.setSelectedItem((java.lang.Object)100.0f);
    net.sourceforge.schemaspy.util.LineWriter var19 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var19.flush();
    var19.flush();
    var1.setSelectedItem((java.lang.Object)var19);
    var19.write(2);
    java.lang.String var25 = var19.toString();
    var19.writeln("net.sourceforge.schemaspy.ui.MainFrame[frame4,0,23,500x312,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    net.sourceforge.schemaspy.util.LineWriter var31 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var31.flush();
    var31.flush();
    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var35 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("ISO-8859-1");
    int var36 = var35.getSize();
    java.lang.Object var37 = var35.getSelectedItem();
    net.sourceforge.schemaspy.ui.DbConfigPanel var38 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var38.requestFocus();
    var38.setFocusTraversalPolicyProvider(true);
    var38.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var46 = var38.insets();
    var38.setAlignmentY(100.0f);
    var35.setSelectedItem((java.lang.Object)100.0f);
    net.sourceforge.schemaspy.util.LineWriter var53 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var53.flush();
    var53.flush();
    var35.setSelectedItem((java.lang.Object)var53);
    var53.newLine();
    char[] var59 = new char[] { ' '};
    var53.write(var59);
    var31.write(var59);
    var19.write(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test174");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    net.sourceforge.schemaspy.Config var5 = var2.getConfig();
    var5.setHost("hi!s");
    net.sourceforge.schemaspy.view.SqlFormatter var8 = var5.getSqlFormatter();
    var5.setCss("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. ");
    java.lang.String var11 = var5.getCss();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var11,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. "+ "'", var11.equals("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var11,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. "));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test175");


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
    var0.transferFocusDownCycle();
    
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

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test176");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    boolean var7 = var0.isBackgroundSet();
    var0.requestFocus();
    java.awt.Rectangle var9 = var0.getVisibleRect();
    var0.setVerifyInputWhenFocusTarget(true);
    var0.reshape(23, 2, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test177");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    javax.swing.InputVerifier var8 = var0.getInputVerifier();
    var0.repaint(100L, 10, 1, 0, 100);
    java.awt.Component.BaselineResizeBehavior var15 = var0.getBaselineResizeBehavior();
    float var16 = var0.getAlignmentX();
    boolean var17 = var0.getInheritsPopupMenu();
    var0.setAlignmentX(0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test178");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.LineWriter var2 = new net.sourceforge.schemaspy.util.LineWriter(".hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s.hi!s{hi!s}hi!s", ".hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s.hi!s{hi!s}hi!s");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test179");


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
    boolean var86 = var0.isFontSet();
    var0.removeNotify();
    
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
    assertTrue(var86 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test180");


    net.sourceforge.schemaspy.util.Inflection var1 = new net.sourceforge.schemaspy.util.Inflection("frame2");

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test181");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.isHighQuality();
    var0.setGraphvizDir("{}");
    boolean var8 = var0.isSchemaDisabled();
    java.lang.String var9 = var0.getRenderer();
    java.lang.String var10 = var0.getDriverPath();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test182");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var18 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var18.requestFocus();
    var18.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var24 = var18.getBackground();
    var18.requestFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var26 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var26.requestFocus();
    var26.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var30 = var26.insets();
    var26.setAlignmentX(1.0f);
    var26.firePropertyChange("hi!", 10, 2);
    var26.setVisible(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var39 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var39.requestFocus();
    var39.setFocusTraversalPolicyProvider(true);
    java.awt.Point var44 = var39.getMousePosition(true);
    java.awt.Component var45 = var39.getNextFocusableComponent();
    java.awt.Dimension var46 = var39.getMinimumSize();
    var26.setPreferredSize(var46);
    java.awt.Dimension var48 = var18.getSize(var46);
    var6.setSize(var48);
    net.sourceforge.schemaspy.ui.DbConfigPanel var50 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var50.requestFocus();
    var50.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var54 = var50.insets();
    var50.setAlignmentX(1.0f);
    boolean var57 = var50.hasFocus();
    boolean var58 = var50.getFocusTraversalKeysEnabled();
    boolean var59 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var50);
    var50.firePropertyChange("hi!", 'a', 'a');
    javax.swing.TransferHandler var64 = var50.getTransferHandler();
    java.awt.Dimension var65 = var50.getPreferredSize();
    net.sourceforge.schemaspy.ui.DbConfigPanel var66 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var66.requestFocus();
    var66.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var70 = var66.insets();
    var66.setAlignmentX(1.0f);
    var66.doLayout();
    boolean var74 = var66.isCursorSet();
    var66.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var79 = var66.getLocation();
    java.awt.Point var80 = var50.getLocation(var79);
    java.awt.Component var81 = var6.findComponentAt(var79);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test183");


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
    var0.firePropertyChange("{}s", '#', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var22 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var22.requestFocus();
    var22.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var26 = var22.insets();
    var22.setAlignmentX(1.0f);
    boolean var29 = var22.hasFocus();
    boolean var30 = var22.getFocusTraversalKeysEnabled();
    boolean var31 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var22);
    var22.firePropertyChange("hi!", 'a', 'a');
    java.lang.String var36 = var22.getUIClassID();
    var22.repaint();
    javax.swing.ActionMap var38 = var22.getActionMap();
    var0.setActionMap(var38);
    java.awt.Component var42 = var0.getComponentAt(0, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "PanelUI"+ "'", var36.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test184");


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
    boolean var25 = var0.isFocusCycleRoot();
    var0.revalidate();
    net.sourceforge.schemaspy.ui.DbConfigPanel var27 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var27.requestFocus();
    java.beans.PropertyChangeListener[] var29 = var27.getPropertyChangeListeners();
    var27.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var35 = var27.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var36 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var36.requestFocus();
    var36.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var40 = var36.insets();
    var36.setAlignmentX(1.0f);
    java.awt.Color var43 = var36.getForeground();
    var27.setForeground(var43);
    boolean var45 = var27.hasFocus();
    var27.enableInputMethods(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var48 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    int var49 = var48.getY();
    net.sourceforge.schemaspy.ui.DbConfigPanel var50 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var50.requestFocus();
    var50.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var54 = var50.insets();
    var50.setAlignmentX(1.0f);
    boolean var57 = var50.hasFocus();
    boolean var58 = var50.getFocusTraversalKeysEnabled();
    boolean var59 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var50);
    var50.firePropertyChange("hi!", 'a', 'a');
    java.lang.String var64 = var50.getUIClassID();
    java.awt.Point var66 = var50.getMousePosition(false);
    java.awt.Point var67 = var50.location();
    java.awt.Component var68 = var48.getComponentAt(var67);
    net.sourceforge.schemaspy.ui.DbConfigPanel var69 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var69.requestFocus();
    var69.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var73 = var69.insets();
    float var74 = var69.getAlignmentX();
    var69.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var80 = var69.getBounds();
    var48.repaint(var80);
    var27.paintImmediately(var80);
    var0.setGlassPane((java.awt.Component)var27);
    
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
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "PanelUI"+ "'", var64.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test185");


    net.sourceforge.schemaspy.view.StyleSheet.ParseException var2 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException("hi!s");
    net.sourceforge.schemaspy.model.ProcessExecutionException var3 = new net.sourceforge.schemaspy.model.ProcessExecutionException("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", (java.lang.Throwable)var2);
    java.lang.String var4 = var3.toString();
    net.sourceforge.schemaspy.model.ProcessExecutionException var5 = new net.sourceforge.schemaspy.model.ProcessExecutionException((java.lang.Throwable)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var4,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s"+ "'", var4.equals("net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var4,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s"));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test186");


    net.sourceforge.schemaspy.model.ConnectionFailure var3 = new net.sourceforge.schemaspy.model.ConnectionFailure("DbSpecificOption name: 'net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s' value: 'null' description: 'a'");
    net.sourceforge.schemaspy.model.ConnectionFailure var4 = new net.sourceforge.schemaspy.model.ConnectionFailure("Helvetica", (java.lang.Throwable)var3);
    net.sourceforge.schemaspy.model.InvalidConfigurationException var5 = new net.sourceforge.schemaspy.model.InvalidConfigurationException("SchemaSpy", (java.lang.Throwable)var3);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test187");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    java.awt.Insets var9 = var0.getInsets();
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var11 = var10.isManagingFocus();
    int var12 = var10.getWidth();
    java.awt.Insets var13 = var10.insets();
    java.awt.Insets var14 = var0.getInsets(var13);
    var0.setInheritsPopupMenu(true);
    var0.setEnabled(true);
    boolean var21 = var0.contains(1, 2);
    int var22 = var0.getX();
    boolean var23 = var0.getVerifyInputWhenFocusTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test188");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    boolean var7 = var0.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test189");


    net.sourceforge.schemaspy.util.Version var1 = new net.sourceforge.schemaspy.util.Version("");
    net.sourceforge.schemaspy.util.DbSpecificOption var4 = new net.sourceforge.schemaspy.util.DbSpecificOption("", "ISO-8859-1");
    java.lang.String var5 = var4.toString();
    net.sourceforge.schemaspy.Config var6 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var7 = var6.getTableExclusions();
    boolean var8 = var6.isEvaluateAllEnabled();
    java.lang.String var10 = var6.getParam("hi!s");
    var4.setValue((java.lang.Object)"hi!s");
    boolean var12 = var1.equals((java.lang.Object)"hi!s");
    net.sourceforge.schemaspy.util.Version var14 = new net.sourceforge.schemaspy.util.Version("");
    net.sourceforge.schemaspy.util.Version var16 = new net.sourceforge.schemaspy.util.Version("");
    int var17 = var14.compareTo(var16);
    net.sourceforge.schemaspy.util.Version var19 = new net.sourceforge.schemaspy.util.Version("");
    int var20 = var14.compareTo(var19);
    int var21 = var1.compareTo(var14);
    net.sourceforge.schemaspy.Config var22 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var23 = var22.getTableExclusions();
    java.lang.Integer var24 = var22.getPort();
    boolean var25 = var22.isOneOfMultipleSchemas();
    var22.setHighQuality(false);
    int var28 = var22.getMaxDetailedTables();
    boolean var29 = var22.isEvaluateAllEnabled();
    boolean var30 = var22.isSchemaDisabled();
    boolean var31 = var1.equals((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var5.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test190");


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
    var0.firePropertyChange("net.sourceforge.schemaspy.ui.MainFrame[frame4,0,23,500x312,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", 10L, 0L);
    
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

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test191");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    java.util.regex.Pattern var5 = var0.getIndirectColumnExclusions();
    java.lang.String var6 = var0.getCss();
    java.lang.String var7 = var0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "schemaSpy.css"+ "'", var6.equals("schemaSpy.css"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test192");


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
    float var25 = var0.getOpacity();
    var0.revalidate();
    java.awt.Window var27 = var0.getOwner();
    boolean var28 = var0.getFocusableWindowState();
    
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
    assertTrue(var25 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test193");


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
    var9.addNotify();
    boolean var23 = var9.isEnabled();
    
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
    assertTrue(var23 == true);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test194");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.HierarchyListener[] var1 = var0.getHierarchyListeners();
    var0.removeNotify();
    float var3 = var0.getAlignmentX();
    var0.setBounds((-3), 1, 11, 1);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var11 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var12 = var11.entrySet();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var14 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.List var15 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var14);
    net.sourceforge.schemaspy.Config var16 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var17 = var16.getTableExclusions();
    boolean var18 = var16.isHtmlGenerationEnabled();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var20 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var20.clear();
    var16.setDbSpecificOptions((java.util.Map)var20);
    java.lang.String var23 = var20.toString();
    var14.putAll((java.util.Map)var20);
    var11.putAll((java.util.Map)var20);
    java.util.Set var26 = var11.entrySet();
    java.util.Set var27 = var11.keySet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys(100, var27);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "{}"+ "'", var23.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test195");


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
    java.awt.Dialog.ModalExclusionType var50 = var0.getModalExclusionType();
    net.sourceforge.schemaspy.ui.DbConfigPanel var51 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var51.requestFocus();
    var51.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var57 = var51.getBackground();
    var51.firePropertyChange("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", '#', ' ');
    java.awt.Component var63 = var0.add((java.awt.Component)var51, 0);
    java.lang.String var64 = var0.getWarningString();
    var0.removeNotify();
    net.sourceforge.schemaspy.ui.MainFrame var66 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var67 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var68 = var67.getTableExclusions();
    boolean var69 = var67.isEvaluateAllEnabled();
    java.util.List var70 = var67.getColumnDetails();
    var66.setIconImages(var70);
    java.awt.LayoutManager var72 = var66.getLayout();
    net.sourceforge.schemaspy.ui.MainFrame var73 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var74 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var75 = var74.getTableExclusions();
    boolean var76 = var74.isEvaluateAllEnabled();
    java.util.List var77 = var74.getColumnDetails();
    var73.setIconImages(var77);
    net.sourceforge.schemaspy.ui.DbConfigPanel var79 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var79.requestFocus();
    var79.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var83 = var79.insets();
    var79.setAlignmentX(1.0f);
    boolean var86 = var79.hasFocus();
    boolean var87 = var79.getFocusTraversalKeysEnabled();
    boolean var88 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var79);
    net.sourceforge.schemaspy.ui.DbConfigPanel var89 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var90 = var89.isManagingFocus();
    java.awt.Rectangle var91 = var89.getVisibleRect();
    java.awt.Rectangle var92 = var79.getBounds(var91);
    java.awt.Dimension var93 = var79.getPreferredSize();
    var73.setMinimumSize(var93);
    java.awt.Dialog.ModalExclusionType var95 = var73.getModalExclusionType();
    java.awt.Dialog.ModalExclusionType var96 = var73.getModalExclusionType();
    var66.setModalExclusionType(var96);
    var0.setModalExclusionType(var96);
    java.util.List var99 = var0.getIconImages();
    
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
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test196");


    net.sourceforge.schemaspy.util.DbSpecificConfig var1 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    net.sourceforge.schemaspy.Config var2 = var1.getConfig();
    net.sourceforge.schemaspy.Config var3 = var1.getConfig();
    var3.setIndirectColumnExclusions("ISO-8859-1s");
    net.sourceforge.schemaspy.Config.setInstance(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.setLogLevel("hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s");
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test197");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    var0.setFocusCycleRoot(true);
    java.awt.Window[] var4 = var0.getOwnedWindows();
    boolean var7 = var0.contains(431, 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test198");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("hi!s");
    var0.setHighQuality(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test199");


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
    javax.swing.TransferHandler var40 = var0.getTransferHandler();
    java.awt.image.VolatileImage var43 = var0.createVolatileImage(300, 5);
    
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
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test200");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    javax.swing.JRootPane var2 = var0.getRootPane();
    var0.repaint(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test201");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var14 = var10.insets();
    var10.setAlignmentX(1.0f);
    java.awt.Color var17 = var10.getForeground();
    var0.setForeground(var17);
    var0.setBounds((-3), 5, 0, 100);
    javax.accessibility.AccessibleContext var24 = var0.getAccessibleContext();
    boolean var25 = var0.isAlwaysOnTop();
    boolean var26 = var0.isAlwaysOnTopSupported();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test202");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    java.awt.event.HierarchyListener[] var9 = var0.getHierarchyListeners();
    var0.setFocusTraversalKeysEnabled(true);
    boolean var12 = var0.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test203");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    int var6 = var0.getComponentCount();
    int var7 = var0.getHeight();
    var0.setDoubleBuffered(true);
    var0.setDoubleBuffered(false);
    int var12 = var0.getY();
    boolean var13 = var0.isOptimizedDrawingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test204");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.Map var1 = var0.getDbSpecificOptions();
    java.lang.String var2 = var0.getDb();
    boolean var3 = var0.isRankDirBugEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test205");


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
    var0.revalidate();
    java.awt.event.MouseListener[] var88 = var0.getMouseListeners();
    java.awt.Rectangle var89 = var0.getBounds();
    
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
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test206");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    java.lang.String var3 = var0.getSupportedVersions();
    net.sourceforge.schemaspy.util.Dot.DotFailure var5 = var0.new DotFailure("dot version 2.2.1 or versions greater than 2.4");
    var0.setHighQuality(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "dot version 2.2.1 or versions greater than 2.4"+ "'", var3.equals("dot version 2.2.1 or versions greater than 2.4"));

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test207");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    java.awt.Insets var3 = var0.insets();
    javax.accessibility.AccessibleContext var4 = var0.getAccessibleContext();
    boolean var7 = var0.inside(100, (-3));
    var0.setDebugGraphicsOptions(2);
    var0.setAutoscrolls(true);
    
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

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test208");


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
    java.awt.Dimension var26 = var0.getSize();
    var0.setUndecorated(true);
    var0.setFocusTraversalKeysEnabled(false);
    var0.dispose();
    
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
    assertNotNull(var26);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test209");


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
    java.awt.Rectangle var38 = var0.bounds();
    
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
    assertNotNull(var38);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test210");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    java.awt.Component var2 = var0.getMostRecentFocusOwner();
    boolean var3 = var0.isResizable();
    java.awt.MenuBar var4 = var0.getMenuBar();
    boolean var5 = var0.isFontSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test211");


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
    java.awt.event.InputMethodListener[] var26 = var0.getInputMethodListeners();
    java.util.Locale var27 = var0.getLocale();
    java.awt.image.BufferStrategy var28 = var0.getBufferStrategy();
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test212");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    var0.firePropertyChange("hi!", 'a', 'a');
    float var14 = var0.getAlignmentX();
    boolean var15 = var0.getInheritsPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test213");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var25 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var25.requestFocus();
    var25.setFocusTraversalPolicyProvider(true);
    var25.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var33 = var25.insets();
    var25.setAlignmentY(100.0f);
    java.lang.Object var36 = var25.getTreeLock();
    net.sourceforge.schemaspy.ui.MainFrame var37 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var38 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var38.requestFocus();
    var38.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var42 = var38.insets();
    var38.setAlignmentX(1.0f);
    java.awt.Color var45 = var38.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var46 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var46.requestFocus();
    var46.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var50 = var46.insets();
    float var51 = var46.getAlignmentX();
    var46.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var57 = var46.getMouseListeners();
    java.awt.Rectangle var58 = var46.bounds();
    var38.setBounds(var58);
    var37.setMaximizedBounds(var58);
    java.util.List var61 = var37.getIconImages();
    java.awt.Rectangle var62 = var37.getMaximizedBounds();
    java.awt.Rectangle var63 = var25.getBounds(var62);
    var0.setBounds(var63);
    boolean var65 = var0.isEnabled();
    boolean var66 = var0.isActive();
    java.awt.Component var69 = var0.locate((-1), 431);
    java.awt.Rectangle var70 = var0.getMaximizedBounds();
    int var71 = var0.getExtendedState();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test214");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    javax.swing.InputVerifier var9 = var0.getInputVerifier();
    java.awt.Dimension var10 = var0.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test215");


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
    boolean var15 = var0.getVerifyInputWhenFocusTarget();
    net.sourceforge.schemaspy.ui.MainFrame var16 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var17 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var18 = var17.getTableExclusions();
    boolean var19 = var17.isEvaluateAllEnabled();
    java.util.List var20 = var17.getColumnDetails();
    var16.setIconImages(var20);
    net.sourceforge.schemaspy.ui.DbConfigPanel var22 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var22.requestFocus();
    var22.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var26 = var22.insets();
    var22.setAlignmentX(1.0f);
    boolean var29 = var22.hasFocus();
    boolean var30 = var22.getFocusTraversalKeysEnabled();
    boolean var31 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var22);
    net.sourceforge.schemaspy.ui.DbConfigPanel var32 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var33 = var32.isManagingFocus();
    java.awt.Rectangle var34 = var32.getVisibleRect();
    java.awt.Rectangle var35 = var22.getBounds(var34);
    java.awt.Dimension var36 = var22.getPreferredSize();
    var16.setMinimumSize(var36);
    var16.toBack();
    net.sourceforge.schemaspy.ui.DbConfigPanel var39 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var39.requestFocus();
    var39.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var43 = var39.insets();
    float var44 = var39.getAlignmentX();
    boolean var47 = var39.contains(1, (-1));
    var39.setOpaque(false);
    boolean var50 = var39.getInheritsPopupMenu();
    var16.setGlassPane((java.awt.Component)var39);
    var16.setState((-1));
    boolean var54 = var16.isPreferredSizeSet();
    net.sourceforge.schemaspy.ui.MainFrame var55 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.MouseMotionListener[] var56 = var55.getMouseMotionListeners();
    javax.swing.JRootPane var57 = var55.getRootPane();
    boolean var58 = var57.isForegroundSet();
    java.awt.Cursor var59 = var57.getCursor();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.awt.Component)var16, (java.lang.Object)var57, 23);
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
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test216");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.HierarchyListener[] var1 = var0.getHierarchyListeners();
    var0.removeNotify();
    float var3 = var0.getAlignmentX();
    var0.setBounds((-3), 1, 11, 1);
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
    java.awt.im.InputContext var33 = var9.getInputContext();
    float var34 = var9.getOpacity();
    java.lang.String var35 = var9.getTitle();
    var9.reshape(0, 11, (-3), 0);
    net.sourceforge.schemaspy.ui.DbConfigPanel var41 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var41.requestFocus();
    var41.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var45 = var41.insets();
    boolean var46 = var41.isFontSet();
    var41.transferFocusUpCycle();
    java.awt.LayoutManager var48 = var41.getLayout();
    var9.setLayout(var48);
    var0.setLayout(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.5f);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "SchemaSpy"+ "'", var35.equals("SchemaSpy"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test217");


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
    java.awt.event.ComponentListener[] var23 = var0.getComponentListeners();
    javax.swing.InputVerifier var24 = var0.getInputVerifier();
    net.sourceforge.schemaspy.ui.DbConfigPanel var25 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var25.requestFocus();
    var25.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var29 = var25.insets();
    var25.reshape(1, 1, 1, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var35 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var35.requestFocus();
    var35.setFocusTraversalPolicyProvider(true);
    java.awt.Point var40 = var35.getMousePosition(true);
    java.awt.Component var41 = var35.getNextFocusableComponent();
    java.awt.Dimension var42 = var35.getMinimumSize();
    java.awt.Dimension var43 = var25.getSize(var42);
    boolean var44 = var25.getFocusTraversalKeysEnabled();
    var25.nextFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var46 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var46.requestFocus();
    var46.setFocusTraversalPolicyProvider(true);
    var46.firePropertyChange("a", (byte)10, (byte)0);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var56 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var57 = var56.entrySet();
    var46.setFocusTraversalKeys(0, var57);
    java.util.List var59 = net.sourceforge.schemaspy.DbAnalyzer.getTablesWithOneColumn((java.util.Collection)var57);
    java.util.List var60 = net.sourceforge.schemaspy.DbAnalyzer.getOrphans((java.util.Collection)var59);
    var0.putClientProperty((java.lang.Object)var25, (java.lang.Object)var60);
    java.util.List var62 = net.sourceforge.schemaspy.DbAnalyzer.getImpliedConstraints((java.util.Collection)var60);
    java.util.List var63 = net.sourceforge.schemaspy.DbAnalyzer.getForeignKeyConstraints((java.util.Collection)var62);
    java.util.List var64 = net.sourceforge.schemaspy.DbAnalyzer.sortTablesByName(var63);
    
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
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test218");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.awt.Component var2 = var0.getNextFocusableComponent();
    boolean var3 = var0.requestDefaultFocus();
    java.awt.Dimension var4 = var0.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test219");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isDbHelpRequired();
    var0.setCharset("dot version 2.2.1 or versions greater than 2.4");
    var0.setPort((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test220");


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
    java.awt.Component.BaselineResizeBehavior var22 = var0.getBaselineResizeBehavior();
    java.awt.Font var23 = var0.getFont();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test221");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    java.lang.String var7 = var0.getParam("a");
    java.lang.String var8 = var0.getDescription();
    var0.setFontSize(100);
    var0.setHtmlGenerationEnabled(false);
    net.sourceforge.schemaspy.Config var13 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var14 = var13.getTableExclusions();
    var13.setSqlFormatter("hi!");
    net.sourceforge.schemaspy.view.DefaultSqlFormatter var17 = new net.sourceforge.schemaspy.view.DefaultSqlFormatter();
    var13.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var17);
    var0.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var17);
    boolean var20 = var0.isLowQuality();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test222");


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
    net.sourceforge.schemaspy.util.Dot var15 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var15.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var19 = var15.new DotFailure("hi!s");
    var15.setHighQuality(true);
    boolean var22 = var15.supportsCenteredEastWestEdges();
    var15.setFormat("hi!");
    java.lang.String var25 = var15.getSupportedVersions();
    java.lang.String var26 = var15.getRenderer();
    var15.setFormat("ISO-8859-1");
    var15.setFormat("Password associated with user id");
    boolean var31 = var1.containsKey((java.lang.Object)"Password associated with user id");
    net.sourceforge.schemaspy.ui.DbConfigTableModel var32 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var32.fireTableRowsInserted(2, 1);
    var32.fireTableDataChanged();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var37 = var1.containsKey((java.lang.Object)var32);
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "dot version 2.2.1 or versions greater than 2.4"+ "'", var25.equals("dot version 2.2.1 or versions greater than 2.4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test223");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    var0.repaint(100, 1, 10, (-1));
    int var10 = var0.getX();
    var0.updateUI();
    net.sourceforge.schemaspy.ui.MainFrame var12 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var13 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var13.requestFocus();
    var13.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var17 = var13.insets();
    var13.setAlignmentX(1.0f);
    java.awt.Color var20 = var13.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var21 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var21.requestFocus();
    var21.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var25 = var21.insets();
    float var26 = var21.getAlignmentX();
    var21.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var32 = var21.getMouseListeners();
    java.awt.Rectangle var33 = var21.bounds();
    var13.setBounds(var33);
    var12.setMaximizedBounds(var33);
    java.awt.Container var36 = var12.getContentPane();
    net.sourceforge.schemaspy.ui.DbConfigPanel var37 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var38 = var37.isManagingFocus();
    java.awt.Rectangle var39 = var37.getVisibleRect();
    var12.setBounds(var39);
    var12.hide();
    java.util.List var42 = var12.getIconImages();
    var12.resize(2, 0);
    net.sourceforge.schemaspy.ui.DbConfigPanel var46 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var46.requestFocus();
    var46.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var50 = var46.getAncestorListeners();
    var46.paintImmediately(1, 0, 0, (-1));
    java.awt.ComponentOrientation var56 = var46.getComponentOrientation();
    var12.applyComponentOrientation(var56);
    var0.applyComponentOrientation(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test224");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    java.lang.String var2 = var0.getConnectionPropertiesFile();
    java.lang.String var3 = var0.getHost();
    java.lang.String var4 = var0.getCss();
    java.util.regex.Pattern var5 = var0.getTableExclusions();
    var0.setPort((java.lang.Integer)(-1));
    boolean var8 = var0.isImpliedConstraintsEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "schemaSpy.css"+ "'", var4.equals("schemaSpy.css"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test225");


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
    boolean var22 = var0.isValidateRoot();
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    var23.reshape(1, 1, 1, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var33 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var33.requestFocus();
    var33.setFocusTraversalPolicyProvider(true);
    java.awt.Point var38 = var33.getMousePosition(true);
    java.awt.Component var39 = var33.getNextFocusableComponent();
    java.awt.Dimension var40 = var33.getMinimumSize();
    java.awt.Dimension var41 = var23.getSize(var40);
    java.awt.Rectangle var42 = var23.bounds();
    java.awt.Component var44 = var0.add((java.awt.Component)var23, 2);
    var0.hide();
    javax.swing.TransferHandler var46 = var0.getTransferHandler();
    
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
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test226");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var10 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var11 = var10.entrySet();
    var0.setFocusTraversalKeys(0, var11);
    java.util.List var13 = net.sourceforge.schemaspy.DbAnalyzer.getTablesWithOneColumn((java.util.Collection)var11);
    net.sourceforge.schemaspy.view.WriteStats var14 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var13);
    java.util.List var15 = net.sourceforge.schemaspy.DbAnalyzer.getMustBeUniqueNullableColumns((java.util.Collection)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test227");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    boolean var8 = var0.contains(1, (-1));
    var0.setOpaque(false);
    var0.repaint(10L);
    java.awt.Dimension var13 = var0.getSize();
    java.beans.PropertyChangeListener[] var14 = var0.getPropertyChangeListeners();
    net.sourceforge.schemaspy.ui.MainFrame var15 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var16 = var15.getType();
    var15.hide();
    var15.firePropertyChange("schemaSpy.css", '4', '#');
    net.sourceforge.schemaspy.ui.MainFrame var22 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var23 = var22.getType();
    java.awt.Component var24 = var22.getMostRecentFocusOwner();
    net.sourceforge.schemaspy.ui.DbConfigPanel var25 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var25.requestFocus();
    var25.setFocusTraversalPolicyProvider(true);
    boolean var29 = var25.requestFocusInWindow();
    java.awt.Cursor var30 = var25.getCursor();
    java.awt.Point var31 = var25.location();
    java.awt.Point var32 = var24.getLocation(var31);
    var15.setLocation(var31);
    java.awt.Point var34 = var0.getLocation(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test228");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    var0.setEncodeCommentsEnabled(true);
    var0.setRankDirBugEnabled(false);
    var0.setSqlFormatter("hi!");
    var0.setPromptForPasswordEnabled(true);
    java.util.List var11 = var0.getColumnDetails();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test229");


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
    java.awt.Color var16 = var0.getBackground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var17 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var17.requestFocus();
    var17.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var21 = var17.insets();
    var17.setAlignmentX(1.0f);
    java.awt.Color var24 = var17.getForeground();
    javax.swing.InputVerifier var25 = var17.getInputVerifier();
    var17.repaint(100L, 10, 1, 0, 100);
    var17.setEnabled(false);
    javax.swing.InputMap var34 = var17.getInputMap();
    var17.firePropertyChange("{}s", '#', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var39 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var39.requestFocus();
    var39.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var43 = var39.insets();
    var39.setAlignmentX(1.0f);
    boolean var46 = var39.hasFocus();
    boolean var47 = var39.getFocusTraversalKeysEnabled();
    boolean var48 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var39);
    var39.firePropertyChange("hi!", 'a', 'a');
    java.lang.String var53 = var39.getUIClassID();
    var39.repaint();
    javax.swing.ActionMap var55 = var39.getActionMap();
    var17.setActionMap(var55);
    var0.setActionMap(var55);
    boolean var58 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "PanelUI"+ "'", var53.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test230");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isHtmlGenerationEnabled();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var4 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var4.clear();
    var0.setDbSpecificOptions((java.util.Map)var4);
    boolean var7 = var0.isLogoEnabled();
    boolean var8 = var0.isHtmlGenerationEnabled();
    var0.setSchema("ISO-8859-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test231");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("hi!s");
    int var2 = var1.getSize();
    int var3 = var1.getSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.getElementAt(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test232");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var3 = var0.getBaselineResizeBehavior();
    var0.paintImmediately(1, (-1), 5, (-3));
    javax.swing.KeyStroke[] var9 = var0.getRegisteredKeyStrokes();
    var0.removeAll();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test233");


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
    var0.resize(100, 431);
    java.util.Set var30 = net.sourceforge.schemaspy.Config.getBuiltInDatabaseTypes("PanelUI");
    java.util.List var31 = net.sourceforge.schemaspy.DbAnalyzer.getDefaultNullStringColumns((java.util.Collection)var30);
    var0.setIconImages(var31);
    java.awt.Toolkit var33 = var0.getToolkit();
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test234");


    net.sourceforge.schemaspy.model.RoutineParameter var3 = new net.sourceforge.schemaspy.model.RoutineParameter("schemaSpy.css", "ISO-8859-1s", "hi!s{hi!s}hi!s");
    java.lang.String var4 = var3.getType();
    java.lang.String var5 = var3.getType();
    java.lang.String var6 = var3.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "ISO-8859-1s"+ "'", var4.equals("ISO-8859-1s"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "ISO-8859-1s"+ "'", var5.equals("ISO-8859-1s"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "schemaSpy.css"+ "'", var6.equals("schemaSpy.css"));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test235");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Set var90 = var0.getFocusTraversalKeys((-3));
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

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test236");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = var0.isVisible();
    java.awt.Dimension var7 = var0.preferredSize();
    var0.show();
    var0.disable();
    var0.setSize(100, (-1));
    java.awt.Dimension var13 = var0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test237");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var2 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s", "4");

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test238");


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
    var0.setEnabled(true);
    java.awt.im.InputContext var37 = var0.getInputContext();
    var0.setUndecorated(true);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test239");


    java.lang.String var1 = net.sourceforge.schemaspy.util.HtmlEncoder.encodeString("ISO-8859-1");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "ISO-8859-1"+ "'", var1.equals("ISO-8859-1"));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test240");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.lang.String var13 = var11.getDefinitionLanguage();
    java.util.List var14 = var11.getParameters();
    var0.setColumnDetails(var14);
    var0.setPort((java.lang.Integer)0);
    var0.setRailsEnabled(false);
    var0.setFontSize(300);
    boolean var22 = var0.isOneOfMultipleSchemas();
    var0.setPromptForPasswordEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test241");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    java.awt.Insets var9 = var0.getInsets();
    var0.paintImmediately(3, 100, 300, 5);
    int var17 = var0.getBaseline(300, 0);
    java.awt.Dimension var18 = var0.minimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test242");


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
    boolean var45 = var0.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.DbConfigPanel var46 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var46.requestFocus();
    var46.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var50 = var46.insets();
    var46.reshape(1, 1, 1, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var56 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var56.requestFocus();
    var56.setFocusTraversalPolicyProvider(true);
    java.awt.Point var61 = var56.getMousePosition(true);
    java.awt.Component var62 = var56.getNextFocusableComponent();
    java.awt.Dimension var63 = var56.getMinimumSize();
    java.awt.Dimension var64 = var46.getSize(var63);
    var0.setSize(var63);
    int var66 = var0.getDefaultCloseOperation();
    
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
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 1);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test243");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    java.awt.Window var2 = var0.getOwner();
    var0.repaint((-3), 2, (-1), 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    var8.setAlignmentX(1.0f);
    java.awt.Color var15 = var8.getForeground();
    int var16 = var8.getWidth();
    net.sourceforge.schemaspy.ui.DbConfigPanel var17 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var17.requestFocus();
    var17.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var21 = var17.insets();
    var17.setAlignmentX(1.0f);
    boolean var24 = var17.hasFocus();
    var17.paintImmediately(10, 100, 2, 10);
    net.sourceforge.schemaspy.ui.DbConfigPanel var30 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var30.requestFocus();
    var30.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var34 = var30.insets();
    var30.setAlignmentX(1.0f);
    java.awt.Color var37 = var30.getForeground();
    javax.swing.InputVerifier var38 = var30.getInputVerifier();
    var30.repaint(100L, 10, 1, 0, 100);
    var30.setEnabled(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var47 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var47.requestFocus();
    java.beans.PropertyChangeListener[] var49 = var47.getPropertyChangeListeners();
    var47.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var55 = var47.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var56 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var56.requestFocus();
    var56.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var60 = var56.insets();
    var56.setAlignmentX(1.0f);
    java.awt.Color var63 = var56.getForeground();
    var47.setForeground(var63);
    var30.setBackground(var63);
    var17.remove((java.awt.Component)var30);
    java.awt.Dimension var67 = var17.getMinimumSize();
    var8.setSize(var67);
    var0.setMinimumSize(var67);
    java.awt.Color var70 = var0.getBackground();
    boolean var71 = var0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test244");


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
    java.awt.Component var14 = var0.getComponent(1);
    net.sourceforge.schemaspy.ui.MainFrame var15 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var16 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var17 = var16.getTableExclusions();
    boolean var18 = var16.isEvaluateAllEnabled();
    java.util.List var19 = var16.getColumnDetails();
    var15.setIconImages(var19);
    boolean var21 = var15.isAlwaysOnTop();
    boolean var22 = var15.isOpaque();
    var15.pack();
    var15.addNotify();
    var0.remove((java.awt.Component)var15);
    java.awt.Toolkit var26 = var15.getToolkit();
    java.lang.Object var27 = var15.getTreeLock();
    java.util.Set var29 = var15.getFocusTraversalKeys(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test245");


    net.sourceforge.schemaspy.util.DbSpecificOption var3 = new net.sourceforge.schemaspy.util.DbSpecificOption("ora", "net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "Value");

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test246");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.firePropertyChange("", 10.0f, 1.0f);
    var0.firePropertyChange("", 1.0d, (-1.0d));
    net.sourceforge.schemaspy.ui.DbConfigTableModel var14 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var16 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var16.dumpUsage();
    var14.setDbSpecificConfig(var16);
    net.sourceforge.schemaspy.Config var19 = var16.getConfig();
    var19.setSchemaSpec("ISO-8859-1");
    java.util.List var22 = var19.getSchemas();
    java.util.regex.Pattern var23 = var19.getTableExclusions();
    java.lang.Object var24 = var0.getClientProperty((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test247");


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
    var0.setEnabled(false);
    javax.swing.border.Border var19 = var0.getBorder();
    var0.enable(true);
    java.awt.ComponentOrientation var22 = var0.getComponentOrientation();
    
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test248");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var7 = var0.getModalExclusionType();
    boolean var8 = var0.isAutoRequestFocus();
    net.sourceforge.schemaspy.ui.MainFrame var9 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var14 = var10.insets();
    var10.setAlignmentX(1.0f);
    java.awt.Color var17 = var10.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var18 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var18.requestFocus();
    var18.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var22 = var18.insets();
    float var23 = var18.getAlignmentX();
    var18.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var29 = var18.getMouseListeners();
    java.awt.Rectangle var30 = var18.bounds();
    var10.setBounds(var30);
    var9.setMaximizedBounds(var30);
    net.sourceforge.schemaspy.ui.DbConfigPanel var33 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var33.requestFocus();
    var33.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var37 = var33.insets();
    var33.setAlignmentX(1.0f);
    boolean var40 = var33.hasFocus();
    boolean var41 = var33.getFocusTraversalKeysEnabled();
    boolean var42 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var33);
    var33.firePropertyChange("hi!", 'a', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var47 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var48 = var47.isManagingFocus();
    int var49 = var47.getWidth();
    java.awt.Insets var50 = var47.insets();
    javax.accessibility.AccessibleContext var51 = var47.getAccessibleContext();
    boolean var54 = var47.inside(100, (-3));
    java.awt.Rectangle var55 = var47.getVisibleRect();
    var33.setBounds(var55);
    var9.setMaximizedBounds(var55);
    java.awt.Window[] var58 = var9.getOwnedWindows();
    java.awt.Dialog.ModalExclusionType var59 = var9.getModalExclusionType();
    net.sourceforge.schemaspy.ui.MainFrame var60 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var61 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var61.requestFocus();
    var61.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var65 = var61.insets();
    var61.setAlignmentX(1.0f);
    java.awt.Color var68 = var61.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var69 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var69.requestFocus();
    var69.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var73 = var69.insets();
    float var74 = var69.getAlignmentX();
    var69.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var80 = var69.getMouseListeners();
    java.awt.Rectangle var81 = var69.bounds();
    var61.setBounds(var81);
    var60.setMaximizedBounds(var81);
    java.awt.Container var84 = var60.getContentPane();
    boolean var85 = var60.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.MainFrame var86 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var87 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var88 = var87.getTableExclusions();
    boolean var89 = var87.isEvaluateAllEnabled();
    java.util.List var90 = var87.getColumnDetails();
    var86.setIconImages(var90);
    boolean var92 = var86.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var93 = var86.getModalExclusionType();
    var60.setModalExclusionType(var93);
    var60.pack();
    java.awt.Window.Type var96 = var60.getType();
    var9.setType(var96);
    var0.setType(var96);
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test249");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    boolean var7 = var0.isBackgroundSet();
    java.awt.event.MouseWheelListener[] var8 = var0.getMouseWheelListeners();
    java.awt.Point var10 = var0.getMousePosition(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var11 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var11.requestFocus();
    var11.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var17 = var11.getBackground();
    var0.setForeground(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test250");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    var0.setOutputDir("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Properties var7 = var0.getDbProperties();
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test251");


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
    var0.transferFocusBackward();
    java.awt.Dimension var25 = var0.getSize();
    
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
    assertNotNull(var25);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test252");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    java.util.Locale var2 = var0.getLocale();
    java.awt.Dimension var3 = var0.getSize();
    java.awt.Toolkit var4 = var0.getToolkit();
    java.awt.Component var5 = var0.getFocusOwner();
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    boolean var10 = var6.requestFocusInWindow();
    java.awt.Dimension var11 = var6.getMaximumSize();
    var0.setMinimumSize(var11);
    boolean var13 = var0.isValidateRoot();
    java.awt.Color var14 = var0.getBackground();
    boolean var15 = var0.isAlwaysOnTopSupported();
    java.awt.LayoutManager var16 = var0.getLayout();
    boolean var17 = var0.isOpaque();
    boolean var18 = var0.isAlwaysOnTopSupported();
    net.sourceforge.schemaspy.ui.MainFrame var19 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var20 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var21 = var20.getTableExclusions();
    boolean var22 = var20.isEvaluateAllEnabled();
    java.util.List var23 = var20.getColumnDetails();
    var19.setIconImages(var23);
    boolean var25 = var19.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var26 = var19.getModalExclusionType();
    net.sourceforge.schemaspy.ui.DbConfigPanel var27 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var27.requestFocus();
    var27.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var31 = var27.insets();
    var27.setAlignmentX(1.0f);
    boolean var34 = var27.hasFocus();
    boolean var35 = var27.getFocusTraversalKeysEnabled();
    boolean var36 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var27);
    net.sourceforge.schemaspy.ui.DbConfigPanel var37 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var38 = var37.isManagingFocus();
    java.awt.Rectangle var39 = var37.getVisibleRect();
    java.awt.Rectangle var40 = var27.getBounds(var39);
    java.awt.Dimension var41 = var27.getPreferredSize();
    var19.setSize(var41);
    java.awt.im.InputContext var43 = var19.getInputContext();
    java.lang.String var44 = var19.getWarningString();
    net.sourceforge.schemaspy.ui.DbConfigPanel var45 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var45.requestFocus();
    var45.setFocusTraversalPolicyProvider(true);
    var45.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var53 = var45.insets();
    var45.setAlignmentY(100.0f);
    java.awt.Image var58 = var45.createImage(1, 1);
    java.awt.Dimension var59 = var45.getSize();
    var19.setSize(var59);
    java.awt.LayoutManager var61 = var19.getLayout();
    var0.setLayout(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test253");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.lang.String var13 = var11.getDefinitionLanguage();
    java.util.List var14 = var11.getParameters();
    var0.setColumnDetails(var14);
    var0.setPort((java.lang.Integer)0);
    var0.setDb("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    java.util.regex.Pattern var20 = var0.getIndirectColumnExclusions();
    java.util.logging.Level var21 = var0.getLogLevel();
    boolean var22 = var0.isSchemaDisabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test254");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var2 = var1.entrySet();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var4 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var4.clear();
    java.util.List var6 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var4);
    var4.clear();
    java.lang.Object var8 = var4.clone();
    java.lang.String var9 = var4.toString();
    var1.putAll((java.util.Map)var4);
    net.sourceforge.schemaspy.model.Routine var20 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var21 = var20.getDataAccess();
    java.util.List var22 = var20.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var23 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var22);
    java.util.List var24 = net.sourceforge.schemaspy.DbAnalyzer.getMustBeUniqueNullableColumns((java.util.Collection)var22);
    java.util.List var25 = net.sourceforge.schemaspy.DbAnalyzer.getImpliedConstraints((java.util.Collection)var24);
    net.sourceforge.schemaspy.view.WriteStats var26 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var25);
    boolean var27 = var1.containsValue((java.lang.Object)var26);
    net.sourceforge.schemaspy.ui.DbConfigPanel var29 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var29.requestFocus();
    var29.setFocusTraversalPolicyProvider(true);
    boolean var33 = var29.requestFocusInWindow();
    net.sourceforge.schemaspy.ui.DbConfigPanel var34 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var34.requestFocus();
    java.beans.PropertyChangeListener[] var36 = var34.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var37 = var34.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var38 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var38.requestFocus();
    var38.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var42 = var38.insets();
    var38.setAlignmentX(1.0f);
    var38.doLayout();
    boolean var46 = var38.isCursorSet();
    var38.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var51 = var38.getLocation();
    boolean var52 = var34.contains(var51);
    java.awt.Component var53 = var29.findComponentAt(var51);
    var29.setOpaque(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var56 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var56.requestFocus();
    var56.setFocusTraversalPolicyProvider(true);
    java.awt.Point var61 = var56.getMousePosition(true);
    int var62 = var56.getComponentCount();
    int var63 = var56.getHeight();
    var56.setName("hi!s");
    net.sourceforge.schemaspy.ui.DbConfigPanel var66 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var66.requestFocus();
    var66.setFocusTraversalPolicyProvider(true);
    java.awt.Point var71 = var66.getMousePosition(true);
    java.awt.Component var72 = var66.getNextFocusableComponent();
    java.awt.Dimension var73 = var66.getMinimumSize();
    var56.setSize(var73);
    var29.resize(var73);
    java.lang.Object var76 = var1.put("Schema to evaluate", (java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "{}"+ "'", var9.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test255");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.lang.String var13 = var11.getDefinitionLanguage();
    java.util.List var14 = var11.getParameters();
    var0.setColumnDetails(var14);
    var0.setPort((java.lang.Integer)0);
    var0.setDb("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    java.util.regex.Pattern var20 = var0.getIndirectColumnExclusions();
    java.util.logging.Level var21 = var0.getLogLevel();
    boolean var22 = var0.isDbHelpRequired();
    var0.setFontSize(312);
    java.lang.Integer var25 = var0.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + 0+ "'", var25.equals(0));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test256");


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
    java.awt.Dimension var26 = var0.minimumSize();
    var0.setCursor(5);
    var0.setAutoRequestFocus(false);
    java.awt.Point var31 = var0.location();
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test257");


    net.sourceforge.schemaspy.SchemaAnalyzer var0 = new net.sourceforge.schemaspy.SchemaAnalyzer();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    var1.setDb("a");
    java.lang.String var4 = var1.getServer();
    boolean var5 = var1.isHtmlGenerationEnabled();
    boolean var6 = var1.isMeterEnabled();
    net.sourceforge.schemaspy.model.Database var7 = var0.analyze(var1);
    net.sourceforge.schemaspy.Config var8 = new net.sourceforge.schemaspy.Config();
    var8.setDb("a");
    java.lang.String var11 = var8.getServer();
    boolean var12 = var8.isHtmlGenerationEnabled();
    boolean var13 = var8.isMeterEnabled();
    net.sourceforge.schemaspy.model.Database var14 = var0.analyze(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test258");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    java.beans.PropertyChangeListener[] var10 = var8.getPropertyChangeListeners();
    var8.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var16 = var8.getKeyListeners();
    var8.setLocation(100, (-1));
    net.sourceforge.schemaspy.ui.DbConfigPanel var20 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var20.requestFocus();
    var20.setFocusTraversalPolicyProvider(true);
    java.awt.Point var25 = var20.getMousePosition(true);
    int var26 = var20.getComponentCount();
    int var27 = var20.getHeight();
    var20.setDoubleBuffered(true);
    var20.setDoubleBuffered(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var32 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var32.requestFocus();
    var32.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var36 = var32.insets();
    var32.setAlignmentX(1.0f);
    var32.doLayout();
    boolean var40 = var32.isCursorSet();
    var32.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var45 = var32.getLocation();
    java.awt.Point var46 = var20.getLocation(var45);
    java.awt.Component var47 = var8.findComponentAt(var46);
    java.awt.Point var48 = var0.getLocation(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test259");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    java.util.regex.Pattern var5 = var0.getIndirectColumnExclusions();
    var0.setHost("hi!");
    java.lang.String var8 = var0.getRenderer();
    java.lang.String var9 = var0.getSchemaSpec();
    java.lang.String var10 = var0.getSchemaSpec();
    var0.setColumnExclusions("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test260");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var6 = var0.getBackground();
    var0.firePropertyChange("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", '#', ' ');
    boolean var13 = var0.contains((-3), 300);
    net.sourceforge.schemaspy.ui.DbConfigPanel var14 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var14.requestFocus();
    var14.setFocusTraversalPolicyProvider(true);
    boolean var18 = var14.isMinimumSizeSet();
    java.awt.Component var19 = var0.add((java.awt.Component)var14);
    net.sourceforge.schemaspy.ui.DbConfigPanel var20 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var20.requestFocus();
    var20.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var24 = var20.insets();
    float var25 = var20.getAlignmentX();
    boolean var28 = var20.contains(1, (-1));
    var20.transferFocus();
    var20.removeAll();
    var20.repaint(1L, (-3), (-3), (-1), 1);
    var20.updateUI();
    var20.firePropertyChange("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", (-1.0d), 0.0d);
    int var42 = var20.getX();
    var14.setNextFocusableComponent((java.awt.Component)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test261");


    net.sourceforge.schemaspy.util.DbSpecificOption var2 = new net.sourceforge.schemaspy.util.DbSpecificOption("", "ISO-8859-1");
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.getDescription();
    java.lang.String var5 = var2.getName();
    java.lang.String var6 = var2.getDescription();
    java.lang.Object var7 = var2.getValue();
    java.lang.String var8 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var3.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "ISO-8859-1"+ "'", var4.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ISO-8859-1"+ "'", var6.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test262");


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
    java.util.List var10 = var0.getIconImages();
    
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
    assertNotNull(var10);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test263");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    java.lang.String var10 = var9.getDefinition();
    net.sourceforge.schemaspy.model.Routine var20 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var21 = var20.getDataAccess();
    java.lang.String var22 = var20.getDefinitionLanguage();
    int var23 = var9.compareTo(var20);
    boolean var24 = var20.isDeterministic();
    java.lang.String var25 = var20.getType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "a"+ "'", var22.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test264");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    boolean var2 = var0.isSchemaDisabled();
    net.sourceforge.schemaspy.Config.setInstance(var0);
    var0.setMaxDetailedTabled((-1));
    java.lang.String var6 = var0.getCharset();
    var0.setMaxDetailedTabled(2);
    java.util.regex.Pattern var9 = var0.getTableInclusions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "ISO-8859-1"+ "'", var6.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test265");


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
    java.awt.Dimension var26 = var0.getSize();
    boolean var27 = var0.isLightweight();
    boolean var28 = var0.isAlwaysOnTopSupported();
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test266");


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
    java.awt.Container var13 = var0.getContentPane();
    net.sourceforge.schemaspy.TableOrderer var14 = new net.sourceforge.schemaspy.TableOrderer();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var16 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var16.clear();
    java.util.List var18 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var16);
    java.util.Set var19 = var16.entrySet();
    net.sourceforge.schemaspy.model.Routine var29 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var30 = var29.getDataAccess();
    java.lang.String var31 = var29.getDefinitionLanguage();
    java.util.List var32 = var29.getParameters();
    java.util.List var33 = var14.getTablesOrderedByRI((java.util.Collection)var19, (java.util.Collection)var32);
    java.util.List var34 = net.sourceforge.schemaspy.DbAnalyzer.sortColumnsByTable(var33);
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
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "a"+ "'", var31.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test267");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    java.lang.String var10 = var9.getDefinition();
    net.sourceforge.schemaspy.model.Routine var20 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var21 = var20.getDataAccess();
    java.lang.String var22 = var20.getDefinitionLanguage();
    int var23 = var9.compareTo(var20);
    java.util.List var24 = var9.getParameters();
    java.lang.String var25 = var9.getSecurityType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "a"+ "'", var22.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test268");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.setOpaque(false);
    var0.invalidate();
    java.awt.Component var11 = var0.findComponentAt(5, 0);
    java.awt.Toolkit var12 = var0.getToolkit();
    var0.setDebugGraphicsOptions(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test269");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.write(3);
    var3.write("javax.swing.JPanel[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 11, (-1));
    java.io.Writer var11 = var3.append((java.lang.CharSequence)"net.sourceforge.schemaspy.ui.MainFrame[frame0,0,23,500x431,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    var3.write("hi!s{hi!s}hi!s", 0, (-1));
    var3.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest4.test270");


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
    java.awt.event.KeyListener[] var88 = var0.getKeyListeners();
    boolean var89 = var0.isShowing();
    
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
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);

  }

}
