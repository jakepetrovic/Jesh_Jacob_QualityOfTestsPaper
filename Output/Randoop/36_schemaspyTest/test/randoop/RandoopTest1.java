package randoop;

import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test1");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    boolean var8 = var0.contains(1, (-1));
    var0.setOpaque(false);
    var0.repaint(10L);
    boolean var13 = var0.isDoubleBuffered();
    java.awt.event.KeyListener[] var14 = var0.getKeyListeners();
    java.awt.Rectangle var15 = var0.getVisibleRect();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test2");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    java.awt.Toolkit var6 = var0.getToolkit();
    java.awt.Container var7 = var0.getContentPane();
    var7.setBounds(300, 5, 312, 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test3");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.util.List var11 = var9.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var12 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var11);
    int var13 = var12.getNumViewsWritten();
    int var14 = var12.getNumTablesWritten();
    int var15 = var12.getNumTablesWritten();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test4");


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
    java.lang.String var52 = var0.getTitle();
    
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
    assertTrue("'" + var52 + "' != '" + "SchemaSpy"+ "'", var52.equals("SchemaSpy"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test5");


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
    boolean var91 = var0.isOpaque();
    
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
    assertTrue(var91 == true);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test6");


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
    var0.setTitle("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    net.sourceforge.schemaspy.ui.DbConfigPanel var26 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var26.requestFocus();
    var26.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var30 = var26.insets();
    var26.setAlignmentX(1.0f);
    var26.doLayout();
    boolean var34 = var26.isCursorSet();
    java.awt.event.HierarchyListener[] var35 = var26.getHierarchyListeners();
    var26.setFocusTraversalPolicyProvider(false);
    java.awt.Container var38 = var26.getFocusCycleRootAncestor();
    net.sourceforge.schemaspy.ui.DbConfigPanel var39 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var39.requestFocus();
    var39.setFocusTraversalPolicyProvider(true);
    boolean var43 = var39.requestFocusInWindow();
    net.sourceforge.schemaspy.ui.DbConfigPanel var44 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var44.requestFocus();
    java.beans.PropertyChangeListener[] var46 = var44.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var47 = var44.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var48 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var48.requestFocus();
    var48.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var52 = var48.insets();
    var48.setAlignmentX(1.0f);
    var48.doLayout();
    boolean var56 = var48.isCursorSet();
    var48.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var61 = var48.getLocation();
    boolean var62 = var44.contains(var61);
    java.awt.Component var63 = var39.findComponentAt(var61);
    var39.setOpaque(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var66 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var66.requestFocus();
    var66.setFocusTraversalPolicyProvider(true);
    java.awt.Point var71 = var66.getMousePosition(true);
    int var72 = var66.getComponentCount();
    int var73 = var66.getHeight();
    var66.setName("hi!s");
    net.sourceforge.schemaspy.ui.DbConfigPanel var76 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var76.requestFocus();
    var76.setFocusTraversalPolicyProvider(true);
    java.awt.Point var81 = var76.getMousePosition(true);
    java.awt.Component var82 = var76.getNextFocusableComponent();
    java.awt.Dimension var83 = var76.getMinimumSize();
    var66.setSize(var83);
    var39.resize(var83);
    java.awt.Dimension var86 = var26.getSize(var83);
    var0.setMinimumSize(var83);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test7");


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
    float var16 = var0.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.5f);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test8");


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
    var0.removeNotify();
    
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

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test9");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setRenderer("{}s");
    var0.setColumnExclusions("Unknown");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test10");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    boolean var8 = var0.isEncodeCommentsEnabled();
    java.lang.String var9 = var0.getRenderer();
    var0.setConnectionProperties("ISO-8859-1");
    var0.setConnectionPropertiesFile("a");
    var0.setDescription("schemaSpy.css");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test11");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    var0.setTableInclusions("");
    var0.setHasOrphans(true);
    var0.setColumnDetails("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var0.getUser();
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test12");


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
    assertNotNull(var9);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test13");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var7 = var0.getTableModelListeners();
    var0.fireTableRowsUpdated(0, 3);
    javax.swing.event.TableModelListener[] var11 = var0.getTableModelListeners();
    var0.fireTableCellUpdated(0, 0);
    net.sourceforge.schemaspy.util.DbSpecificConfig var16 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var16.dumpUsage();
    var0.setDbSpecificConfig(var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var21 = var0.getValueAt((-1), 312);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test14");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.isHighQuality();
    var0.setPassword("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    boolean var8 = var0.isEncodeCommentsEnabled();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTableExclusions("hi!s{hi!s}hi!s");
      fail("Expected exception of type java.util.regex.PatternSyntaxException");
    } catch (java.util.regex.PatternSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test15");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    var0.setAlignmentY(100.0f);
    java.awt.Image var13 = var0.createImage(1, 1);
    java.awt.Dimension var14 = var0.getSize();
    net.sourceforge.schemaspy.ui.DbConfigPanel var15 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var15.requestFocus();
    var15.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var19 = var15.insets();
    var15.setAlignmentX(1.0f);
    java.awt.Color var22 = var15.getForeground();
    javax.swing.InputVerifier var23 = var15.getInputVerifier();
    var15.repaint(100L, 10, 1, 0, 100);
    java.awt.Component.BaselineResizeBehavior var30 = var15.getBaselineResizeBehavior();
    java.util.Locale var31 = var15.getLocale();
    java.awt.Component var32 = var0.add((java.awt.Component)var15);
    float var33 = var0.getAlignmentX();
    var0.paintImmediately(10, (-3), 312, 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.5f);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test16");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    var0.firePropertyChange("hi!", 10L, 10L);
    net.sourceforge.schemaspy.model.RoutineParameter var15 = new net.sourceforge.schemaspy.model.RoutineParameter("ISO-8859-1s", "hi!", "");
    java.lang.Object var16 = var0.getClientProperty((java.lang.Object)"ISO-8859-1s");
    var0.paintImmediately(1, 3, 100, 300);
    boolean var22 = var0.getIgnoreRepaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test17");


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
    boolean var42 = var0.isDisplayable();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test18");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    boolean var8 = var0.contains(1, (-1));
    var0.setRequestFocusEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test19");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(10, (-3));
    var0.fireTableCellUpdated(10, 3);
    var0.fireTableRowsDeleted((-1), 0);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test20");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("hi!s");
    var0.setHighQuality(true);
    boolean var7 = var0.supportsCenteredEastWestEdges();
    var0.setFormat("hi!");
    java.lang.String var10 = var0.getSupportedVersions();
    java.lang.String var11 = var0.getRenderer();
    var0.setFormat("ISO-8859-1");
    boolean var14 = var0.requiresGdRenderer();
    var0.setHighQuality(true);
    
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

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test21");


    net.sourceforge.schemaspy.MultipleSchemaAnalyzer var0 = net.sourceforge.schemaspy.MultipleSchemaAnalyzer.getInstance();
    net.sourceforge.schemaspy.TableOrderer var2 = new net.sourceforge.schemaspy.TableOrderer();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var4 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var4.clear();
    java.util.List var6 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var4);
    java.util.Set var7 = var4.entrySet();
    net.sourceforge.schemaspy.model.Routine var17 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var18 = var17.getDataAccess();
    java.lang.String var19 = var17.getDefinitionLanguage();
    java.util.List var20 = var17.getParameters();
    java.util.List var21 = var2.getTablesOrderedByRI((java.util.Collection)var7, (java.util.Collection)var20);
    java.util.List var22 = net.sourceforge.schemaspy.DbAnalyzer.sortColumnsByTable(var21);
    net.sourceforge.schemaspy.TableOrderer var23 = new net.sourceforge.schemaspy.TableOrderer();
    net.sourceforge.schemaspy.model.Routine var33 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var34 = var33.getDataAccess();
    java.lang.String var35 = var33.getDefinitionLanguage();
    java.util.List var36 = var33.getParameters();
    java.util.List var37 = net.sourceforge.schemaspy.DbAnalyzer.sortColumnsByTable(var36);
    net.sourceforge.schemaspy.model.Routine var47 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var48 = var47.getDataAccess();
    java.lang.String var49 = var47.getDefinitionLanguage();
    java.util.List var50 = var47.getParameters();
    java.util.List var51 = net.sourceforge.schemaspy.DbAnalyzer.sortColumnsByTable(var50);
    java.util.List var52 = var23.getTablesOrderedByRI((java.util.Collection)var36, (java.util.Collection)var50);
    net.sourceforge.schemaspy.Config var53 = new net.sourceforge.schemaspy.Config();
    boolean var54 = var53.isImpliedConstraintsEnabled();
    var53.setHasOrphans(false);
    java.lang.String var57 = var53.getSchemaSpec();
    boolean var58 = var53.isHighQuality();
    var53.setHasOrphans(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.analyze("4", var22, var36, var53);
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "a"+ "'", var19.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "a"+ "'", var35.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "a"+ "'", var49.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test22");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    java.awt.Point var3 = var0.getMousePosition();
    java.lang.Object var4 = var0.getTreeLock();
    var0.doLayout();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.InputMap var7 = var0.getInputMap(5);
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
    assertNotNull(var4);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test23");


    net.sourceforge.schemaspy.util.PasswordReader var0 = net.sourceforge.schemaspy.util.PasswordReader.getInstance();
    net.sourceforge.schemaspy.model.ProcessExecutionException var2 = new net.sourceforge.schemaspy.model.ProcessExecutionException("a");
    net.sourceforge.schemaspy.util.PasswordReader.IOError var3 = var0.new IOError((java.lang.Throwable)var2);
    net.sourceforge.schemaspy.ui.DbConfigPanel var5 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var5.requestFocus();
    java.beans.PropertyChangeListener[] var7 = var5.getPropertyChangeListeners();
    var5.paintImmediately(0, (-1), (-1), 0);
    boolean var13 = var5.isForegroundSet();
    java.awt.event.ContainerListener[] var14 = var5.getContainerListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      char[] var15 = var0.readPassword("Helvetica", (java.lang.Object[])var14);
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test24");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var50 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var51 = var50.isManagingFocus();
    int var52 = var50.getWidth();
    javax.swing.InputVerifier var53 = var50.getInputVerifier();
    net.sourceforge.schemaspy.ui.DbConfigPanel var54 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var54.requestFocus();
    var54.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var58 = var54.insets();
    var54.requestFocus();
    boolean var60 = var54.isVisible();
    java.awt.Dimension var61 = var54.preferredSize();
    java.awt.Dimension var62 = var50.getSize(var61);
    var0.setSize(var61);
    java.beans.PropertyChangeListener[] var65 = var0.getPropertyChangeListeners("hi!s");
    boolean var66 = var0.isShowing();
    java.awt.Container var67 = var0.getParent();
    var0.setLocationByPlatform(false);
    
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
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test25");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var3 = var0.getBaselineResizeBehavior();
    boolean var4 = var0.isDisplayable();
    java.awt.Container var5 = var0.getTopLevelAncestor();
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.requestFocus();
    boolean var12 = var6.isVisible();
    net.sourceforge.schemaspy.ui.DbConfigPanel var13 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var13.requestFocus();
    var13.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var17 = var13.insets();
    float var18 = var13.getAlignmentX();
    net.sourceforge.schemaspy.ui.DbConfigPanel var19 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var19.requestFocus();
    var19.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var23 = var19.insets();
    var19.requestFocus();
    var19.setOpaque(false);
    javax.swing.plaf.PanelUI var27 = var19.getUI();
    var13.setUI(var27);
    var6.setUI(var27);
    var0.setUI(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test26");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isHtmlGenerationEnabled();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var4 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var4.clear();
    var0.setDbSpecificOptions((java.util.Map)var4);
    boolean var7 = var0.isLogoEnabled();
    boolean var8 = var0.isHtmlGenerationEnabled();
    var0.setDbType(" ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setConnectionPropertiesFile("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test27");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var6 = var0.getBackground();
    var0.requestFocus();
    float var8 = var0.getAlignmentY();
    var0.disable();
    var0.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.5f);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test28");


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
    javax.swing.JMenuBar var99 = var0.getJMenuBar();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var99);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test29");


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
    boolean var36 = var23.isPreferredSizeSet();
    net.sourceforge.schemaspy.util.DbSpecificOption var40 = new net.sourceforge.schemaspy.util.DbSpecificOption("", "ISO-8859-1");
    java.lang.String var41 = var40.toString();
    java.lang.String var42 = var40.getDescription();
    java.lang.Object var43 = var40.getValue();
    net.sourceforge.schemaspy.ui.MainFrame var44 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var45 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var46 = var45.getTableExclusions();
    boolean var47 = var45.isEvaluateAllEnabled();
    java.util.List var48 = var45.getColumnDetails();
    var44.setIconImages(var48);
    boolean var50 = var44.isAlwaysOnTop();
    var44.setFocusableWindowState(true);
    java.awt.Window[] var53 = var44.getOwnedWindows();
    java.awt.Component var54 = var44.getMostRecentFocusOwner();
    var40.setValue((java.lang.Object)var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var56 = var23.add("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", (java.awt.Component)var44);
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
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var41.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "ISO-8859-1"+ "'", var42.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test30");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    java.lang.Object var5 = var0.getTreeLock();
    var0.setAutoscrolls(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    var8.requestFocus();
    var8.doLayout();
    var8.firePropertyChange("hi!", 0.0d, 10.0d);
    java.awt.Component var19 = var8.getNextFocusableComponent();
    java.awt.Rectangle var20 = var8.bounds();
    int var21 = var8.getDebugGraphicsOptions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setComponentZOrder((java.awt.Component)var8, (-3));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test31");


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
    var0.enable(false);
    
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

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test32");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    var0.fireTableRowsDeleted(2, 0);
    boolean var12 = var0.isCellEditable(10, 312);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test33");


    net.sourceforge.schemaspy.Config.MissingRequiredParameterException var3 = new net.sourceforge.schemaspy.Config.MissingRequiredParameterException("hi!s", "hi!s", false);
    boolean var4 = var3.isDbTypeSpecific();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test34");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.write(3);
    var3.newLine();

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test35");


    java.lang.String var4 = net.sourceforge.schemaspy.model.Table.getFullName("hi!s", "hi!s{hi!s}hi!s", "ISO-8859-1", "net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!s{hi!s}hi!s.ISO-8859-1.net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var4,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s"+ "'", var4.equals("hi!s{hi!s}hi!s.ISO-8859-1.net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var4,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s"));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test36");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.model.xml.SchemaMeta var3 = new net.sourceforge.schemaspy.model.xml.SchemaMeta("DbSpecificOption name: 'DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'' value: 'null' description: 'net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]'", "hi!", "hi!");
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test37");


    net.sourceforge.schemaspy.view.HtmlTablePage var0 = net.sourceforge.schemaspy.view.HtmlTablePage.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test38");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    int var9 = var0.getHeight();
    var0.setSize(100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test39");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var4 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ConnectionFailure var6 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.InvalidConfigurationException var8 = var4.setParamName("schemaSpy.css");
    java.lang.String var9 = var4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "net.sourceforge.schemaspy.view.StyleSheet$MissingCssPropertyException: Required property 'hi!' was not found for the definition of '' in schemaSpy.css"+ "'", var9.equals("net.sourceforge.schemaspy.view.StyleSheet$MissingCssPropertyException: Required property 'hi!' was not found for the definition of '' in schemaSpy.css"));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test40");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var7 = var0.getTableModelListeners();
    var0.fireTableRowsUpdated(0, 3);
    javax.swing.event.TableModelListener[] var11 = var0.getTableModelListeners();
    var0.fireTableCellUpdated(0, 0);
    var0.fireTableStructureChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test41");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var35 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var35.requestFocus();
    java.beans.PropertyChangeListener[] var37 = var35.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var38 = var35.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var39 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var39.requestFocus();
    var39.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var43 = var39.insets();
    var39.setAlignmentX(1.0f);
    var39.doLayout();
    boolean var47 = var39.isCursorSet();
    var39.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var52 = var39.getLocation();
    boolean var53 = var35.contains(var52);
    var0.setLocationRelativeTo((java.awt.Component)var35);
    boolean var55 = var0.isOpaque();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test42");


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
    net.sourceforge.schemaspy.ui.MainFrame var34 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var35 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var36 = var35.getTableExclusions();
    boolean var37 = var35.isEvaluateAllEnabled();
    java.util.List var38 = var35.getColumnDetails();
    var34.setIconImages(var38);
    boolean var40 = var34.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var41 = var34.getModalExclusionType();
    net.sourceforge.schemaspy.ui.DbConfigPanel var42 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var42.requestFocus();
    var42.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var46 = var42.insets();
    var42.setAlignmentX(1.0f);
    boolean var49 = var42.hasFocus();
    boolean var50 = var42.getFocusTraversalKeysEnabled();
    boolean var51 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var42);
    net.sourceforge.schemaspy.ui.DbConfigPanel var52 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var53 = var52.isManagingFocus();
    java.awt.Rectangle var54 = var52.getVisibleRect();
    java.awt.Rectangle var55 = var42.getBounds(var54);
    java.awt.Dimension var56 = var42.getPreferredSize();
    var34.setSize(var56);
    java.awt.im.InputContext var58 = var34.getInputContext();
    java.lang.String var59 = var34.getWarningString();
    net.sourceforge.schemaspy.ui.DbConfigPanel var60 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var60.requestFocus();
    var60.setFocusTraversalPolicyProvider(true);
    var60.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var68 = var60.insets();
    var60.setAlignmentY(100.0f);
    java.awt.Image var73 = var60.createImage(1, 1);
    java.awt.Dimension var74 = var60.getSize();
    var34.setSize(var74);
    var9.setSize(var74);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test43");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var25 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var25.requestFocus();
    var25.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var29 = var25.insets();
    var25.setAlignmentX(1.0f);
    boolean var32 = var25.hasFocus();
    boolean var33 = var25.getFocusTraversalKeysEnabled();
    boolean var34 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var25);
    var25.firePropertyChange("hi!", 'a', 'a');
    java.lang.String var39 = var25.getUIClassID();
    var25.repaint();
    java.awt.Dimension var41 = var25.preferredSize();
    var0.setMinimumSize(var41);
    int var43 = var0.getHeight();
    
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "PanelUI"+ "'", var39.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 431);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test44");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.lang.String var13 = var11.getDefinitionLanguage();
    java.util.List var14 = var11.getParameters();
    var0.setColumnDetails(var14);
    var0.setPort((java.lang.Integer)0);
    java.lang.String var18 = var0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test45");


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
    java.lang.String var38 = var35.toString();
    var35.writeln("Value");
    
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

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test46");


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
    java.awt.Dimension var16 = var3.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test47");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setMaxDbThreads(1);
    java.lang.String var3 = var0.getFont();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = var0.asList();
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Helvetica"+ "'", var3.equals("Helvetica"));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test48");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var1.getElementAt(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test49");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    var0.paintImmediately(1, 0, 0, (-1));
    int var10 = var0.getY();
    var0.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test50");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    boolean var7 = var0.isBackgroundSet();
    var0.requestFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var20 = var9.getBounds();
    var0.scrollRectToVisible(var20);
    net.sourceforge.schemaspy.ui.DbConfigPanel var22 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var22.requestFocus();
    java.beans.PropertyChangeListener[] var24 = var22.getPropertyChangeListeners();
    boolean var25 = var22.isPreferredSizeSet();
    int var26 = var22.getY();
    java.lang.Object var27 = var0.getClientProperty((java.lang.Object)var22);
    net.sourceforge.schemaspy.ui.MainFrame var28 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var29 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var29.requestFocus();
    var29.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var33 = var29.insets();
    var29.setAlignmentX(1.0f);
    java.awt.Color var36 = var29.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var37 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var37.requestFocus();
    var37.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var41 = var37.insets();
    float var42 = var37.getAlignmentX();
    var37.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var48 = var37.getMouseListeners();
    java.awt.Rectangle var49 = var37.bounds();
    var29.setBounds(var49);
    var28.setMaximizedBounds(var49);
    java.awt.Container var52 = var28.getContentPane();
    net.sourceforge.schemaspy.ui.DbConfigPanel var53 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var54 = var53.isManagingFocus();
    java.awt.Rectangle var55 = var53.getVisibleRect();
    var28.setBounds(var55);
    var28.addNotify();
    int var58 = var0.getComponentZOrder((java.awt.Component)var28);
    boolean var59 = var28.getIgnoreRepaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test51");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.awt.Component var2 = var0.getNextFocusableComponent();
    java.lang.String var3 = var0.toString();
    javax.swing.TransferHandler var4 = var0.getTransferHandler();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var7 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var7.clear();
    java.util.List var9 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var7);
    java.util.Set var10 = var7.entrySet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys(100, var10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var3,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"+ "'", var3.equals("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var3,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test52");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.LineWriter var2 = new net.sourceforge.schemaspy.util.LineWriter("ISO-8859-1s", "a");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test53");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.createBufferStrategy(300);
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

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test54");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var2 = var1.entrySet();
    java.util.Set var3 = var1.entrySet();
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test55");


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
    java.util.List var26 = var0.getIconImages();
    var0.setResizable(true);
    java.awt.Component var29 = var0.getFocusOwner();
    
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
    assertNull(var29);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test56");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    boolean var7 = var0.isBackgroundSet();
    var0.transferFocus();
    var0.doLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test57");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.setOpaque(false);
    var0.invalidate();
    java.awt.event.KeyListener[] var9 = var0.getKeyListeners();
    var0.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test58");


    net.sourceforge.schemaspy.util.Inflection var2 = new net.sourceforge.schemaspy.util.Inflection("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", "/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");
    boolean var4 = var2.match("{}s");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test59");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    java.lang.Object var5 = var0.getTreeLock();
    boolean var6 = var0.isFocusTraversalPolicyProvider();
    java.awt.Dimension var7 = var0.getMaximumSize();
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
    java.util.List var32 = var8.getIconImages();
    boolean var33 = var8.isDisplayable();
    java.awt.Dimension var34 = var8.preferredSize();
    java.awt.Dimension var35 = var0.getSize(var34);
    java.awt.Insets var36 = var0.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test60");


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
    int var23 = var1.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test61");


    java.lang.String var1 = net.sourceforge.schemaspy.util.HtmlEncoder.encodeString("hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!s"+ "'", var1.equals("hi!s"));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test62");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    var0.setTableInclusions("");
    java.io.File var10 = var0.getGraphvizDir();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test63");


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
    boolean var34 = var0.getIgnoreRepaint();
    int var35 = var0.getX();
    var0.firePropertyChange("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", 'a', '#');
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test64");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    java.lang.String var10 = var9.getDefinition();
    net.sourceforge.schemaspy.model.Routine var20 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var21 = var20.getDataAccess();
    java.lang.String var22 = var20.getDefinitionLanguage();
    int var23 = var9.compareTo(var20);
    net.sourceforge.schemaspy.model.RoutineParameter var27 = new net.sourceforge.schemaspy.model.RoutineParameter("ISO-8859-1s", "hi!", "");
    var20.addParameter(var27);
    java.lang.String var29 = var20.getReturnType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "a"+ "'", var22.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "a"+ "'", var29.equals("a"));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test65");


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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test66");


    net.sourceforge.schemaspy.model.RoutineParameter var3 = new net.sourceforge.schemaspy.model.RoutineParameter("schemaSpy.css", "ISO-8859-1s", "hi!s{hi!s}hi!s");
    java.lang.String var4 = var3.getMode();
    java.lang.String var5 = var3.getMode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!s{hi!s}hi!s"+ "'", var4.equals("hi!s{hi!s}hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!s{hi!s}hi!s"+ "'", var5.equals("hi!s{hi!s}hi!s"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test67");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    boolean var2 = var0.getVerifyInputWhenFocusTarget();
    var0.setAlignmentX((-1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test68");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    boolean var7 = var0.isOpaque();
    var0.pack();
    java.awt.Container var9 = var0.getContentPane();
    
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
    assertNotNull(var9);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test69");


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
    java.lang.String var38 = var35.toString();
    net.sourceforge.schemaspy.util.LineWriter var42 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var42.writeln();
    net.sourceforge.schemaspy.util.LineWriter var47 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var47.flush();
    var47.write("a");
    char[] var51 = new char[] { };
    var47.write(var51);
    var42.write(var51);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var35.write(var51, 312, (-3));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var51);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test70");


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
    var0.reshape(5, 5, 300, 3);
    java.awt.event.WindowFocusListener[] var54 = var0.getWindowFocusListeners();
    
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
    assertNotNull(var54);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test71");


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
    var0.requestFocus();
    
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

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test72");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    var0.addNotify();
    var0.setVerifyInputWhenFocusTarget(true);
    javax.accessibility.AccessibleContext var6 = var0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test73");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("DbSpecificOption name: 'DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'' value: 'null' description: 'net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]'");

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test74");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    boolean var10 = var9.isDeterministic();
    java.lang.String var11 = var9.getSecurityType();
    java.lang.String var12 = var9.getDefinitionLanguage();
    java.lang.String var13 = var9.getDefinitionLanguage();
    java.lang.String var14 = var9.getComment();
    java.lang.String var15 = var9.getType();
    
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
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test75");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isDbHelpRequired();
    var0.setCharset("dot version 2.2.1 or versions greater than 2.4");
    java.util.regex.Pattern var7 = var0.getIndirectColumnExclusions();
    boolean var8 = var0.isNumRowsEnabled();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var9 = var0.asList();
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test76");


    net.sourceforge.schemaspy.util.DbSpecificConfig var1 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    net.sourceforge.schemaspy.Config var2 = var1.getConfig();
    var1.dumpUsage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test77");


    net.sourceforge.schemaspy.util.DbSpecificOption var2 = new net.sourceforge.schemaspy.util.DbSpecificOption("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'", "net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    java.lang.String var3 = var2.getName();
    java.lang.Object var4 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var3.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test78");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    var0.setTableInclusions("");
    var0.setHasOrphans(true);
    var0.setColumnDetails("");
    var0.setRenderer("dot version 2.2.1 or versions greater than 2.4");
    java.lang.String var16 = var0.getSchema();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test79");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    boolean var3 = var0.isEncodeCommentsEnabled();
    int var4 = var0.getMaxDetailedTables();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setColumnDetails("a");
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 300);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test80");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    boolean var10 = var9.isDeterministic();
    java.lang.String var11 = var9.getName();
    java.lang.String var12 = var9.getDefinitionLanguage();
    java.lang.String var13 = var9.getName();
    java.lang.String var14 = var9.getSecurityType();
    java.util.List var15 = var9.getParameters();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test81");


    java.lang.String var1 = net.sourceforge.schemaspy.util.HtmlEncoder.encodeToken("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var1,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. "+ "'", var1.equals("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var1,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. "));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test82");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    java.awt.Component var2 = var0.getMostRecentFocusOwner();
    var0.setState(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDefaultCloseOperation(10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test83");


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
    java.awt.Component var46 = var0.getFocusOwner();
    boolean var47 = var0.isAlwaysOnTopSupported();
    
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
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test84");


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
    java.lang.String var17 = var0.getName();
    net.sourceforge.schemaspy.ui.DbConfigPanel var19 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var19.requestFocus();
    var19.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var23 = var19.insets();
    var19.setAlignmentX(1.0f);
    boolean var26 = var19.hasFocus();
    boolean var27 = var19.getFocusTraversalKeysEnabled();
    var19.setSize(1, (-1));
    java.awt.image.VolatileImage var33 = var19.createVolatileImage(1, (-3));
    boolean var34 = var19.isDisplayable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var35 = var0.add("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (java.awt.Component)var19);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test85");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.lang.String var13 = var11.getDefinitionLanguage();
    java.util.List var14 = var11.getParameters();
    var0.setColumnDetails(var14);
    var0.setEncodeCommentsEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test86");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var6 = var0.getBackground();
    int var7 = var0.getWidth();
    java.awt.Dimension var8 = var0.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test87");


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
    boolean var14 = var0.inside(2, 0);
    var0.layout();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test88");


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
    boolean var99 = var0.isUndecorated();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test89");


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
    boolean var27 = var0.getFocusableWindowState();
    net.sourceforge.schemaspy.ui.DbConfigPanel var28 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var28.requestFocus();
    java.beans.PropertyChangeListener[] var30 = var28.getPropertyChangeListeners();
    var28.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var36 = var28.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var37 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var37.requestFocus();
    var37.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var41 = var37.insets();
    var37.setAlignmentX(1.0f);
    java.awt.Color var44 = var37.getForeground();
    var28.setForeground(var44);
    boolean var46 = var28.hasFocus();
    java.awt.event.MouseListener[] var47 = var28.getMouseListeners();
    boolean var50 = var28.contains(2, (-3));
    net.sourceforge.schemaspy.ui.MainFrame var51 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var52 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var52.requestFocus();
    var52.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var56 = var52.insets();
    var52.setAlignmentX(1.0f);
    java.awt.Color var59 = var52.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var60 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var60.requestFocus();
    var60.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var64 = var60.insets();
    float var65 = var60.getAlignmentX();
    var60.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var71 = var60.getMouseListeners();
    java.awt.Rectangle var72 = var60.bounds();
    var52.setBounds(var72);
    var51.setMaximizedBounds(var72);
    java.util.List var75 = var51.getIconImages();
    java.awt.Rectangle var76 = var51.getMaximizedBounds();
    java.awt.Dimension var77 = var51.minimumSize();
    var28.setMaximumSize(var77);
    var0.setMinimumSize(var77);
    
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
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test90");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.util.List var3 = var0.getColumnDetails();
    java.lang.String var4 = var0.getConnectionPropertiesFile();
    var0.setTableInclusions("net.sourceforge.schemaspy.ui.MainFrame[frame0,0,23,500x431,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test91");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    var0.paintImmediately(1, 0, 0, (-1));
    java.awt.ComponentOrientation var10 = var0.getComponentOrientation();
    javax.swing.ActionMap var11 = var0.getActionMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test92");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    java.util.regex.Pattern var5 = var0.getIndirectColumnExclusions();
    java.lang.String var6 = var0.getCatalog();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test93");


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
    boolean var22 = var0.isLocationByPlatform();
    java.lang.String var23 = var0.getTitle();
    
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
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "SchemaSpy"+ "'", var23.equals("SchemaSpy"));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test94");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    int var6 = var0.getComponentCount();
    int var7 = var0.getHeight();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    java.beans.PropertyChangeListener[] var10 = var8.getPropertyChangeListeners();
    var8.paintImmediately(0, (-1), (-1), 0);
    java.awt.Font var16 = var8.getFont();
    java.awt.FontMetrics var17 = var0.getFontMetrics(var16);
    net.sourceforge.schemaspy.TableOrderer var19 = new net.sourceforge.schemaspy.TableOrderer();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var21 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var21.clear();
    java.util.List var23 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var21);
    java.util.Set var24 = var21.entrySet();
    net.sourceforge.schemaspy.model.Routine var34 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var35 = var34.getDataAccess();
    java.lang.String var36 = var34.getDefinitionLanguage();
    java.util.List var37 = var34.getParameters();
    java.util.List var38 = var19.getTablesOrderedByRI((java.util.Collection)var24, (java.util.Collection)var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys(10, var24);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "a"+ "'", var36.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test95");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.newLine();
    var3.writeln("[]");
    var3.write(5);
    java.io.Writer var10 = var3.append(' ');
    var3.flush();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test96");


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
    java.awt.GraphicsConfiguration var21 = var0.getGraphicsConfiguration();
    var0.transferFocus();
    
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
    assertNull(var21);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test97");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    var0.setSqlFormatter("hi!");
    net.sourceforge.schemaspy.view.DefaultSqlFormatter var4 = new net.sourceforge.schemaspy.view.DefaultSqlFormatter();
    var0.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var4);
    var0.setImpliedConstraintsEnabled(true);
    java.util.regex.Pattern var8 = var0.getTableExclusions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test98");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    java.awt.Insets var9 = var0.getInsets();
    boolean var10 = var0.isDoubleBuffered();
    var0.repaint(10L, 5, 0, 5, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test99");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var1.clear();
    java.util.List var3 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var1);
    var1.clear();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test100");


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
    net.sourceforge.schemaspy.ui.DbConfigTableModel var24 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var24.fireTableRowsInserted(2, 1);
    java.lang.Class var29 = var24.getClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var30 = var0.<java.util.EventListener>getListeners(var29);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test101");


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
    java.awt.Container var45 = var0.getContentPane();
    
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
    assertNotNull(var45);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test102");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    boolean var7 = var0.isBackgroundSet();
    javax.swing.plaf.PanelUI var8 = var0.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test103");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    var0.setTableInclusions("");
    var0.setHasOrphans(true);
    var0.setColumnDetails("");
    var0.setNumRowsEnabled(true);
    boolean var16 = var0.isSchemaDisabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test104");


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
    int var22 = var0.getY();
    
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
    assertTrue(var22 == 23);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test105");


    net.sourceforge.schemaspy.util.DbSpecificConfig var1 = new net.sourceforge.schemaspy.util.DbSpecificConfig("SchemaSpy");

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test106");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var6 = var0.getBackground();
    var0.firePropertyChange("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", '#', ' ');
    boolean var11 = var0.isDisplayable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test107");


    net.sourceforge.schemaspy.model.ConnectionFailure var1 = new net.sourceforge.schemaspy.model.ConnectionFailure("ISO-8859-1");

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test108");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    boolean var7 = var0.isOpaque();
    net.sourceforge.schemaspy.ui.MainFrame var8 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var9 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var10 = var9.getTableExclusions();
    boolean var11 = var9.isEvaluateAllEnabled();
    java.util.List var12 = var9.getColumnDetails();
    var8.setIconImages(var12);
    net.sourceforge.schemaspy.ui.DbConfigPanel var14 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var14.requestFocus();
    java.beans.PropertyChangeListener[] var16 = var14.getPropertyChangeListeners();
    var14.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var22 = var14.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    var23.setAlignmentX(1.0f);
    java.awt.Color var30 = var23.getForeground();
    var14.setForeground(var30);
    var8.setBackground(var30);
    java.awt.Window.Type var33 = var8.getType();
    var0.setType(var33);
    java.awt.event.WindowFocusListener[] var35 = var0.getWindowFocusListeners();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test109");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.isHighQuality();
    var0.setPassword("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    boolean var8 = var0.isEncodeCommentsEnabled();
    java.lang.String var9 = var0.getMeta();
    java.util.List var10 = var0.getSchemas();
    var0.setMeta("ISO-8859-1s");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test110");


    net.sourceforge.schemaspy.model.ProcessExecutionException var2 = new net.sourceforge.schemaspy.model.ProcessExecutionException("a");
    net.sourceforge.schemaspy.model.ConnectionFailure var3 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var2);
    net.sourceforge.schemaspy.model.InvalidConfigurationException var4 = new net.sourceforge.schemaspy.model.InvalidConfigurationException("PanelUI", (java.lang.Throwable)var3);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test111");


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
    var0.layout();
    
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

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test112");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    java.lang.String var3 = var0.getSupportedVersions();
    net.sourceforge.schemaspy.util.Dot.DotFailure var5 = var0.new DotFailure("dot version 2.2.1 or versions greater than 2.4");
    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var9 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var10 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var9);
    var5.addSuppressed((java.lang.Throwable)var9);
    net.sourceforge.schemaspy.model.InvalidConfigurationException var12 = new net.sourceforge.schemaspy.model.InvalidConfigurationException((java.lang.Throwable)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "dot version 2.2.1 or versions greater than 2.4"+ "'", var3.equals("dot version 2.2.1 or versions greater than 2.4"));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test113");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var37 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var37.requestFocus();
    var37.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var41 = var37.insets();
    var37.setAlignmentX(1.0f);
    var37.firePropertyChange("hi!", 10, 2);
    var37.paintImmediately(100, 10, 2, 0);
    java.util.Set var54 = var37.getFocusTraversalKeys(2);
    java.awt.Cursor var55 = var37.getCursor();
    var36.setCursor(var55);
    
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
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test114");


    net.sourceforge.schemaspy.util.Inflection var2 = new net.sourceforge.schemaspy.util.Inflection("", "hi!s");
    java.lang.String var4 = var2.replace("{}");
    java.lang.String var6 = var2.replace("dot version 2.2.1 or versions greater than 2.4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!s{hi!s}hi!s"+ "'", var4.equals("hi!s{hi!s}hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s"+ "'", var6.equals("hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s"));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test115");


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
    int var64 = var63.getX();
    
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
    assertTrue(var64 == 0);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test116");


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
    java.awt.Insets var14 = var10.insets();
    float var15 = var10.getAlignmentX();
    var10.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var21 = var10.getBounds();
    var0.scrollRectToVisible(var21);
    boolean var23 = var0.getInheritsPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test117");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    var0.fireTableRowsDeleted(431, 300);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test118");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setMaxDbThreads(1);
    var0.setNumRowsEnabled(false);
    var0.setEncodeCommentsEnabled(false);
    java.lang.String var7 = var0.getSchema();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test119");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var2 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "4");
    java.lang.String var3 = var2.getParamName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test120");


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
    java.awt.Insets var38 = var8.getInsets();
    net.sourceforge.schemaspy.ui.DbConfigPanel var39 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var39.requestFocus();
    var39.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var43 = var39.getAncestorListeners();
    var39.paintImmediately(1, 0, 0, (-1));
    java.awt.Dimension var49 = var39.size();
    var8.setSize(var49);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test121");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    net.sourceforge.schemaspy.util.LineWriter var7 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var7.flush();
    var7.write("a");
    char[] var11 = new char[] { };
    var7.write(var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.write(var11, 1, 1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test122");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.lang.String var4 = var0.getParam("hi!s");
    boolean var5 = var0.isEvaluateAllEnabled();
    java.lang.String var6 = var0.getHost();
    
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

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test123");


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
    java.awt.Container var77 = var0.getContentPane();
    
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
    assertNotNull(var77);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test124");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    var0.setTableExclusions("ISO-8859-1");
    java.lang.String var6 = var0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test125");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    java.lang.String var7 = var0.getParam("a");
    var0.setPromptForPasswordEnabled(false);
    var0.setDescription("DbSpecificOption name: 'DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'' value: 'null' description: 'net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]'");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.File var12 = var0.getOutputDir();
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

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test126");


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
    java.lang.String var13 = var0.getConnectionPropertiesFile();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var14 = var0.getRemainingParameters();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test127");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    var0.setFocusableWindowState(true);
    boolean var9 = var0.isFocusCycleRoot();
    net.sourceforge.schemaspy.ui.MainFrame var10 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var11 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var12 = var11.getTableExclusions();
    boolean var13 = var11.isEvaluateAllEnabled();
    java.util.List var14 = var11.getColumnDetails();
    var10.setIconImages(var14);
    int var16 = var10.getExtendedState();
    var10.setFocusableWindowState(true);
    var10.setExtendedState(1);
    int var21 = var0.getComponentZOrder((java.awt.Component)var10);
    
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test128");


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
    int var16 = var1.getSize();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var1.getElementAt(312);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test129");


    net.sourceforge.schemaspy.model.ProcessExecutionException var2 = new net.sourceforge.schemaspy.model.ProcessExecutionException("a");
    net.sourceforge.schemaspy.model.ProcessExecutionException var3 = new net.sourceforge.schemaspy.model.ProcessExecutionException("{}", (java.lang.Throwable)var2);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test130");


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
    java.awt.Component var25 = var0.locate(3, 5);
    
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
    assertNull(var25);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test131");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.lang.String var13 = var11.getDefinitionLanguage();
    java.util.List var14 = var11.getParameters();
    var0.setColumnDetails(var14);
    var0.setPort((java.lang.Integer)0);
    var0.setRailsEnabled(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.File var20 = var0.getOutputDir();
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
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

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test132");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.write(3);
    var3.close();
    net.sourceforge.schemaspy.util.LineWriter var10 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var10.writeln();
    net.sourceforge.schemaspy.util.LineWriter var15 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var15.flush();
    var15.write("a");
    char[] var19 = new char[] { };
    var15.write(var19);
    var10.write(var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.write(var19, 0, 1);
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test133");


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
    java.awt.im.InputMethodRequests var11 = var0.getInputMethodRequests();
    java.lang.String var12 = var0.getName();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "frame2"+ "'", var12.equals("frame2"));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test134");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    net.sourceforge.schemaspy.Config var5 = var2.getConfig();
    java.util.List var6 = var2.getOptions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test135");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    var0.setIgnoreRepaint(true);
    javax.swing.JPopupMenu var10 = var0.getComponentPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test136");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    java.util.regex.Pattern var5 = var0.getIndirectColumnExclusions();
    java.lang.String var6 = var0.getRenderer();
    var0.setDbType("hi!s{hi!s}hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test137");


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
    boolean var50 = var0.isManagingFocus();
    
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
    assertTrue(var50 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test138");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    java.awt.Rectangle var6 = var0.getVisibleRect();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test139");


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
    java.awt.Graphics var24 = var0.getGraphics();
    
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
    assertNull(var24);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test140");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.layout();
    java.awt.image.VolatileImage var8 = var0.createVolatileImage((-3), 1);
    var0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test141");


    net.sourceforge.schemaspy.util.Dot var1 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var1.setFormat("ISO-8859-1");
    boolean var4 = var1.isValid();
    net.sourceforge.schemaspy.util.Dot.DotFailure var6 = var1.new DotFailure("ISO-8859-1s");
    net.sourceforge.schemaspy.model.InvalidConfigurationException var7 = new net.sourceforge.schemaspy.model.InvalidConfigurationException("ora", (java.lang.Throwable)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test142");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isDbHelpRequired();
    var0.setCharset("dot version 2.2.1 or versions greater than 2.4");
    java.util.regex.Pattern var7 = var0.getIndirectColumnExclusions();
    var0.setIndirectColumnExclusions("ISO-8859-1");
    java.util.regex.Pattern var10 = var0.getTableInclusions();
    var0.setEncodeCommentsEnabled(true);
    java.lang.String var13 = var0.getSchema();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test143");


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
    var19.newLine();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.Writer var27 = var19.append((java.lang.CharSequence)"4", 431, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test144");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.hasOrphans();
    var0.setHtmlGenerationEnabled(true);
    java.lang.String var7 = var0.getDb();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "a"+ "'", var7.equals("a"));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test145");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.firePropertyChange("ISO-8859-1", 0L, (-1L));
    var0.firePropertyChange("a", 0.0d, 1.0d);
    java.awt.Graphics var10 = var0.getGraphics();
    var0.firePropertyChange("Helvetica", '4', '#');
    net.sourceforge.schemaspy.ui.DbConfigPanel var15 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var15.requestFocus();
    var15.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var19 = var15.insets();
    java.awt.event.HierarchyBoundsListener[] var20 = var15.getHierarchyBoundsListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var21 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var21.requestFocus();
    var21.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var25 = var21.insets();
    var21.setAlignmentX(1.0f);
    var21.firePropertyChange("hi!", 10, 2);
    var21.paintImmediately(100, 10, 2, 0);
    java.lang.Object var37 = var15.getClientProperty((java.lang.Object)100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var38 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var38.requestFocus();
    var38.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var42 = var38.insets();
    var38.setAlignmentX(1.0f);
    var38.doLayout();
    boolean var46 = var38.isCursorSet();
    var38.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var51 = var38.getLocation();
    var15.setLocation(var51);
    boolean var53 = var0.isAncestorOf((java.awt.Component)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test146");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    java.awt.Insets var3 = var0.insets();
    javax.accessibility.AccessibleContext var4 = var0.getAccessibleContext();
    boolean var7 = var0.inside(100, (-3));
    java.awt.Rectangle var8 = var0.getVisibleRect();
    java.awt.Point var9 = var0.getLocation();
    var0.removeNotify();
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
    var0.repaint(var31);
    java.awt.Rectangle var34 = var0.getVisibleRect();
    
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
    assertNotNull(var34);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test147");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    java.io.File var2 = var0.getGraphvizDir();
    var0.setMaxDetailedTabled(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test148");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setMaxDbThreads(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var3 = var0.getRemainingParameters();
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test149");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    int var8 = var0.getWidth();
    var0.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test150");


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
    int var89 = var0.getDefaultCloseOperation();
    
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
    assertTrue(var89 == 1);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test151");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    var0.setTableExclusions("ISO-8859-1");
    boolean var6 = var0.isDbHelpRequired();
    boolean var7 = var0.hasOrphans();
    boolean var8 = var0.isLowQuality();
    var0.setRenderer("{}s");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test152");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    java.awt.Window var2 = var0.getOwner();
    var0.repaint((-3), 2, (-1), 100);
    boolean var8 = var0.isValidateRoot();
    net.sourceforge.schemaspy.ui.MainFrame var9 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Component var10 = var9.getGlassPane();
    java.awt.Point var11 = var10.getLocation();
    net.sourceforge.schemaspy.ui.DbConfigPanel var12 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var12.requestFocus();
    var12.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var16 = var12.insets();
    var12.setAlignmentX(1.0f);
    java.awt.Color var19 = var12.getForeground();
    javax.swing.InputVerifier var20 = var12.getInputVerifier();
    var12.repaint(100L, 10, 1, 0, 100);
    var12.setEnabled(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var29 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var29.requestFocus();
    java.beans.PropertyChangeListener[] var31 = var29.getPropertyChangeListeners();
    var29.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var37 = var29.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var38 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var38.requestFocus();
    var38.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var42 = var38.insets();
    var38.setAlignmentX(1.0f);
    java.awt.Color var45 = var38.getForeground();
    var29.setForeground(var45);
    var12.setBackground(var45);
    var10.setForeground(var45);
    var0.setBackground(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test153");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    java.awt.event.HierarchyListener[] var9 = var0.getHierarchyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var14 = var10.insets();
    var10.setAlignmentX(1.0f);
    java.awt.Color var17 = var10.getForeground();
    javax.swing.InputVerifier var18 = var10.getInputVerifier();
    var10.repaint(100L, 10, 1, 0, 100);
    var10.setEnabled(false);
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
    var10.setBackground(var43);
    var0.setForeground(var43);
    var0.setRequestFocusEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test154");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.write(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.write("PanelUI", 11, 10);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test155");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.lang.String var11 = var9.getDefinitionLanguage();
    java.util.List var12 = var9.getParameters();
    java.lang.String var13 = var9.getReturnType();
    java.lang.String var14 = var9.getDataAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "a"+ "'", var11.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test156");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.write(3);
    var3.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.writeln();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test157");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.lang.String var4 = var0.getParam("hi!s");
    boolean var5 = var0.isEvaluateAllEnabled();
    var0.setConnectionProperties("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test158");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    java.awt.Cursor var5 = var0.getCursor();
    var0.updateUI();
    boolean var7 = var0.isPaintingTile();
    boolean var8 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test159");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Component var1 = var0.getGlassPane();
    javax.swing.TransferHandler var2 = var0.getTransferHandler();
    var0.repaint(0L, 431, 0, 0, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test160");


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
    java.awt.Dimension var16 = var0.preferredSize();
    java.awt.Dimension var17 = var0.minimumSize();
    var0.setFocusCycleRoot(false);
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test161");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    java.lang.String var6 = var0.getDescription(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Password associated with user id"+ "'", var6.equals("Password associated with user id"));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test162");


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
    var0.setLocation(100, 100);
    
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

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test163");


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
    var0.setSize(0, (-3));
    
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

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test164");


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
    java.awt.Dimension var55 = var0.getSize();
    
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
    assertNotNull(var55);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test165");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    var0.setIndirectColumnExclusions("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setCss("net.sourceforge.schemaspy.ui.MainFrame[frame1,0,23,500x312,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test166");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setMaxDbThreads(1);
    var0.setNumRowsEnabled(false);
    boolean var5 = var0.isViewsEnabled();
    var0.setHtmlGenerationEnabled(true);
    var0.setServer("hi!s");
    var0.setHost("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test167");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    boolean var3 = var0.isPreferredSizeSet();
    int var4 = var0.getY();
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
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test168");


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
      var0.setDefaultCloseOperation(11);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test169");


    net.sourceforge.schemaspy.util.Inflection var3 = new net.sourceforge.schemaspy.util.Inflection("a", "net.sourceforge.schemaspy.ui.MainFrame[frame1,0,23,500x312,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", true);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test170");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    boolean var7 = var0.isBackgroundSet();
    var0.requestFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    float var14 = var9.getAlignmentX();
    var9.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var20 = var9.getBounds();
    var0.scrollRectToVisible(var20);
    net.sourceforge.schemaspy.ui.DbConfigPanel var22 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var22.requestFocus();
    java.beans.PropertyChangeListener[] var24 = var22.getPropertyChangeListeners();
    boolean var25 = var22.isPreferredSizeSet();
    int var26 = var22.getY();
    java.lang.Object var27 = var0.getClientProperty((java.lang.Object)var22);
    net.sourceforge.schemaspy.ui.MainFrame var28 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var29 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var29.requestFocus();
    var29.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var33 = var29.insets();
    var29.setAlignmentX(1.0f);
    java.awt.Color var36 = var29.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var37 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var37.requestFocus();
    var37.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var41 = var37.insets();
    float var42 = var37.getAlignmentX();
    var37.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var48 = var37.getMouseListeners();
    java.awt.Rectangle var49 = var37.bounds();
    var29.setBounds(var49);
    var28.setMaximizedBounds(var49);
    java.awt.Container var52 = var28.getContentPane();
    net.sourceforge.schemaspy.ui.DbConfigPanel var53 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var54 = var53.isManagingFocus();
    java.awt.Rectangle var55 = var53.getVisibleRect();
    var28.setBounds(var55);
    var28.addNotify();
    int var58 = var0.getComponentZOrder((java.awt.Component)var28);
    net.sourceforge.schemaspy.ui.MainFrame var59 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var60 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var60.requestFocus();
    var60.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var64 = var60.insets();
    var60.setAlignmentX(1.0f);
    java.awt.Color var67 = var60.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var68 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var68.requestFocus();
    var68.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var72 = var68.insets();
    float var73 = var68.getAlignmentX();
    var68.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var79 = var68.getMouseListeners();
    java.awt.Rectangle var80 = var68.bounds();
    var60.setBounds(var80);
    var59.setMaximizedBounds(var80);
    java.util.List var83 = var59.getIconImages();
    boolean var84 = var59.isDisplayable();
    var28.setLocationRelativeTo((java.awt.Component)var59);
    java.awt.Color var86 = var59.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test171");


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
    var0.setFocusCycleRoot(true);
    boolean var88 = var0.isUndecorated();
    
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
    assertTrue(var88 == false);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test172");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    boolean var7 = var0.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test173");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.firePropertyChange("hi!", 10, 2);
    var0.setVisible(false);
    java.awt.Dimension var13 = var0.getMaximumSize();
    var0.reshape(5, 0, 5, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test174");


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
    var0.dispose();
    
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

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test175");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.newLine();
    var3.writeln("[]");
    java.io.Writer var8 = var3.append((java.lang.CharSequence)"hi!");
    var3.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.Writer var11 = var3.append((java.lang.CharSequence)"hi!");
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test176");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    int var2 = var0.findColumn("a");
    var0.fireTableRowsUpdated(100, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var7 = var0.getClass(300);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test177");


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
    boolean var13 = var0.requestFocus(false);
    var0.paintImmediately((-3), 3, 100, 0);
    
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
    assertTrue(var13 == false);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test178");


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
    java.util.List var26 = var0.getIconImages();
    java.awt.Component var29 = var0.locate((-3), 5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setOpacity(0.5f);
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test179");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.Version var1 = new net.sourceforge.schemaspy.util.Version("hi!s{hi!s}hi!s.ISO-8859-1.net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s");
      fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test180");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    java.lang.String var7 = var0.getParam("a");
    java.lang.String var8 = var0.getDescription();
    var0.setFontSize(100);
    java.util.regex.Pattern var11 = var0.getTableExclusions();
    boolean var12 = var0.isMeterEnabled();
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test181");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var50 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var51 = var50.isManagingFocus();
    int var52 = var50.getWidth();
    javax.swing.InputVerifier var53 = var50.getInputVerifier();
    net.sourceforge.schemaspy.ui.DbConfigPanel var54 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var54.requestFocus();
    var54.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var58 = var54.insets();
    var54.requestFocus();
    boolean var60 = var54.isVisible();
    java.awt.Dimension var61 = var54.preferredSize();
    java.awt.Dimension var62 = var50.getSize(var61);
    var0.setSize(var61);
    net.sourceforge.schemaspy.ui.DbConfigPanel var64 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var64.requestFocus();
    var64.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var68 = var64.insets();
    float var69 = var64.getAlignmentX();
    var64.setBounds(0, 1, 10, 100);
    var64.repaint(0L, (-1), 1, (-3), (-3));
    java.awt.FocusTraversalPolicy var81 = var64.getFocusTraversalPolicy();
    net.sourceforge.schemaspy.model.Routine var91 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    boolean var92 = var91.isDeterministic();
    java.lang.String var93 = var91.getName();
    java.util.List var94 = var91.getParameters();
    java.util.List var95 = var91.getParameters();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.add((java.awt.Component)var64, (java.lang.Object)var91, 23);
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
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + ""+ "'", var93.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test182");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var1.clear();
    net.sourceforge.schemaspy.ui.DbConfigPanel var3 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var3.requestFocus();
    var3.setFocusTraversalPolicyProvider(true);
    java.awt.Point var8 = var3.getMousePosition(true);
    java.awt.Component var9 = var3.getNextFocusableComponent();
    java.awt.Dimension var10 = var3.getMinimumSize();
    boolean var11 = var1.containsValue((java.lang.Object)var3);
    boolean var12 = var3.isFocusTraversable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test183");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("4", "net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "[]", "{}", "4", true, "ISO-8859-1s", "{}s", "Unknown");
    java.lang.String var10 = var9.getReturnType();
    java.lang.String var11 = var9.getSecurityType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "{}s"+ "'", var11.equals("{}s"));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test184");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    java.lang.String var2 = var0.getConnectionPropertiesFile();
    java.lang.String var3 = var0.getHost();
    java.lang.String var4 = var0.getCss();
    java.util.regex.Pattern var5 = var0.getTableExclusions();
    java.lang.String var6 = var0.getCharset();
    java.util.regex.Pattern var7 = var0.getTableInclusions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var8 = var0.getMaxDbThreads();
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }
    
    
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
    assertTrue("'" + var6 + "' != '" + "ISO-8859-1"+ "'", var6.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test185");


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
      var0.setOpacity(0.5f);
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
    assertTrue(var12 == true);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test186");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("ISO-8859-1");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.getElementAt(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test187");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    java.lang.String var2 = var0.getConnectionPropertiesFile();
    boolean var3 = var0.isSchemaDisabled();
    net.sourceforge.schemaspy.view.SqlFormatter var4 = var0.getSqlFormatter();
    var0.setPromptForPasswordEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test188");


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
    int var16 = var0.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test189");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setFormat("ISO-8859-1");
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test190");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var12 = var8.insets();
    float var13 = var8.getAlignmentX();
    var8.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var19 = var8.getMouseListeners();
    java.awt.Rectangle var20 = var8.bounds();
    var0.setBounds(var20);
    net.sourceforge.schemaspy.ui.MainFrame var22 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var23 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var24 = var23.getTableExclusions();
    boolean var25 = var23.isEvaluateAllEnabled();
    java.util.List var26 = var23.getColumnDetails();
    var22.setIconImages(var26);
    boolean var28 = var22.isAlwaysOnTop();
    var22.setFocusableWindowState(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var31 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var32 = var31.isManagingFocus();
    int var33 = var31.getWidth();
    javax.swing.InputVerifier var34 = var31.getInputVerifier();
    net.sourceforge.schemaspy.ui.DbConfigPanel var35 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var35.requestFocus();
    var35.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var39 = var35.insets();
    var35.requestFocus();
    boolean var41 = var35.isVisible();
    java.awt.Dimension var42 = var35.preferredSize();
    java.awt.Dimension var43 = var31.getSize(var42);
    var22.setSize(var42);
    var0.setMaximumSize(var42);
    var0.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test191");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Properties var4 = var0.determineDbProperties("net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test192");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    var0.nextFocus();
    var0.list();
    var0.revalidate();
    boolean var14 = var0.inside(1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test193");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    net.sourceforge.schemaspy.Config var5 = var2.getConfig();
    java.util.List var6 = var5.getSchemas();
    var5.setEvaluateAllEnabled(false);
    java.lang.String var9 = var5.getCharset();
    var5.setMeta("a");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setColumnDetails("Unknown");
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "ISO-8859-1"+ "'", var9.equals("ISO-8859-1"));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test194");


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
    var0.resize(2, 0);
    net.sourceforge.schemaspy.ui.DbConfigPanel var34 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var34.requestFocus();
    var34.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var38 = var34.getAncestorListeners();
    var34.paintImmediately(1, 0, 0, (-1));
    java.awt.ComponentOrientation var44 = var34.getComponentOrientation();
    var0.applyComponentOrientation(var44);
    var0.repaint(10L, 0, 0, 5, 431);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test195");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.isHighQuality();
    java.util.Map var6 = var0.getDbSpecificOptions();
    var0.setGraphvizDir("net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s");
    boolean var9 = var0.isSingleSignOn();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test196");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDefaultCloseOperation((-1));
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

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test197");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    java.awt.Color var7 = var0.getForeground();
    javax.swing.InputVerifier var8 = var0.getInputVerifier();
    var0.repaint(100L, 10, 1, 0, 100);
    var0.setEnabled(false);
    net.sourceforge.schemaspy.ui.MainFrame var17 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var18 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var19 = var18.getTableExclusions();
    boolean var20 = var18.isEvaluateAllEnabled();
    java.util.List var21 = var18.getColumnDetails();
    var17.setIconImages(var21);
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    var23.setAlignmentX(1.0f);
    boolean var30 = var23.hasFocus();
    boolean var31 = var23.getFocusTraversalKeysEnabled();
    boolean var32 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var23);
    net.sourceforge.schemaspy.ui.DbConfigPanel var33 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var34 = var33.isManagingFocus();
    java.awt.Rectangle var35 = var33.getVisibleRect();
    java.awt.Rectangle var36 = var23.getBounds(var35);
    java.awt.Dimension var37 = var23.getPreferredSize();
    var17.setMinimumSize(var37);
    var17.toBack();
    net.sourceforge.schemaspy.ui.MainFrame var40 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var41 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var42 = var41.getTableExclusions();
    boolean var43 = var41.isEvaluateAllEnabled();
    java.util.List var44 = var41.getColumnDetails();
    var40.setIconImages(var44);
    boolean var46 = var40.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var47 = var40.getModalExclusionType();
    net.sourceforge.schemaspy.ui.DbConfigPanel var48 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var48.requestFocus();
    var48.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var52 = var48.insets();
    var48.setAlignmentX(1.0f);
    boolean var55 = var48.hasFocus();
    boolean var56 = var48.getFocusTraversalKeysEnabled();
    boolean var57 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var48);
    net.sourceforge.schemaspy.ui.DbConfigPanel var58 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var59 = var58.isManagingFocus();
    java.awt.Rectangle var60 = var58.getVisibleRect();
    java.awt.Rectangle var61 = var48.getBounds(var60);
    java.awt.Dimension var62 = var48.getPreferredSize();
    var40.setSize(var62);
    java.awt.im.InputContext var64 = var40.getInputContext();
    java.lang.String var65 = var40.getWarningString();
    net.sourceforge.schemaspy.ui.DbConfigPanel var66 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var66.requestFocus();
    var66.setFocusTraversalPolicyProvider(true);
    var66.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var74 = var66.insets();
    var66.setAlignmentY(100.0f);
    java.awt.Image var79 = var66.createImage(1, 1);
    java.awt.Dimension var80 = var66.getSize();
    var40.setSize(var80);
    var17.setMinimumSize(var80);
    var0.setPreferredSize(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test198");


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
    boolean var14 = var0.inside(2, 0);
    net.sourceforge.schemaspy.ui.DbConfigPanel var15 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var15.requestFocus();
    var15.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var19 = var15.insets();
    var15.setAlignmentX(1.0f);
    var15.doLayout();
    boolean var23 = var15.isCursorSet();
    java.awt.event.HierarchyListener[] var24 = var15.getHierarchyListeners();
    var15.setFocusTraversalPolicyProvider(false);
    boolean var27 = var15.isBackgroundSet();
    java.awt.image.VolatileImage var30 = var15.createVolatileImage(3, 100);
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
    java.awt.ComponentOrientation var65 = var31.getComponentOrientation();
    var15.applyComponentOrientation(var65);
    var0.setComponentOrientation(var65);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
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

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test199");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setFormat("ISO-8859-1");
    boolean var3 = var0.isValid();
    java.lang.String var4 = var0.getFormat();
    var0.setRenderer("PanelUI");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "ISO-8859-1"+ "'", var4.equals("ISO-8859-1"));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test200");


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
    int var65 = var0.getDefaultCloseOperation();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test201");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    java.lang.String var7 = var0.getParam("a");
    var0.setIndirectColumnExclusions("hi!");
    java.io.File var10 = var0.getGraphvizDir();
    var0.setCatalog("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.File var13 = var0.getOutputDir();
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
    assertNull(var10);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test202");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    java.lang.String var7 = var0.getParam("a");
    boolean var8 = var0.isEncodeCommentsEnabled();
    var0.setNumRowsEnabled(false);
    boolean var11 = var0.isRailsEnabled();
    
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
    assertTrue(var11 == false);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test203");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    net.sourceforge.schemaspy.view.SqlFormatter var3 = var0.getSqlFormatter();
    java.util.List var4 = var0.getSchemas();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test204");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.write(3);
    var3.close();
    var3.close();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.newLine();
      fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test205");


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
    var0.repaint(100L);
    
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

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test206");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    var0.paintImmediately(1, 0, 0, (-1));
    java.awt.Dimension var10 = var0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test207");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Image var14 = var0.getIconImage();
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test208");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var5 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var6 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var5);
    net.sourceforge.schemaspy.model.ConnectionFailure var7 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var5);
    net.sourceforge.schemaspy.model.ConnectionFailure var8 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var5);
    net.sourceforge.schemaspy.view.StyleSheet.ParseException var9 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException((java.lang.Exception)var5);
    net.sourceforge.schemaspy.util.Dot var10 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var10.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var14 = var10.new DotFailure("hi!s");
    var5.addSuppressed((java.lang.Throwable)var14);
    net.sourceforge.schemaspy.model.ProcessExecutionException var16 = new net.sourceforge.schemaspy.model.ProcessExecutionException("{}", (java.lang.Throwable)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test209");


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
    var19.newLine();
    var19.newLine();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test210");


    net.sourceforge.schemaspy.util.PasswordReader var0 = net.sourceforge.schemaspy.util.PasswordReader.getInstance();
    net.sourceforge.schemaspy.model.ProcessExecutionException var2 = new net.sourceforge.schemaspy.model.ProcessExecutionException("a");
    net.sourceforge.schemaspy.util.PasswordReader.IOError var3 = var0.new IOError((java.lang.Throwable)var2);
    net.sourceforge.schemaspy.model.InvalidConfigurationException var4 = new net.sourceforge.schemaspy.model.InvalidConfigurationException((java.lang.Throwable)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test211");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isDbHelpRequired();
    var0.setCharset("dot version 2.2.1 or versions greater than 2.4");
    java.util.regex.Pattern var7 = var0.getIndirectColumnExclusions();
    var0.setIndirectColumnExclusions("ISO-8859-1");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Properties var11 = var0.determineDbProperties("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test212");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var7 = var0.getTableModelListeners();
    var0.fireTableRowsUpdated(0, 3);
    int var12 = var0.findColumn("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.fireTableRowsDeleted(11, 2);
    java.lang.Class var17 = var0.getClass(0);
    var0.fireTableStructureChanged();
    var0.fireTableStructureChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test213");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    java.lang.String var7 = var0.getParam("a");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Properties var8 = var0.getDbProperties();
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

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test214");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("frame2", "net.sourceforge.schemaspy.ui.MainFrame[frame0,0,23,500x431,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", " ", "hi!s{hi!s}hi!s", "Helvetica", true, "4", "Value", "hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s");

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test215");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.hasOrphans();
    java.lang.String var5 = var0.getHost();
    var0.setDb(" ");
    var0.setHost(" ");
    var0.setNumRowsEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test216");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    int var6 = var0.getComponentCount();
    javax.swing.KeyStroke[] var7 = var0.getRegisteredKeyStrokes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test217");


    net.sourceforge.schemaspy.view.StyleSheet.ParseException var3 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException("hi!s");
    net.sourceforge.schemaspy.model.ProcessExecutionException var4 = new net.sourceforge.schemaspy.model.ProcessExecutionException("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", (java.lang.Throwable)var3);
    java.lang.String var5 = var4.toString();
    net.sourceforge.schemaspy.model.InvalidConfigurationException var6 = new net.sourceforge.schemaspy.model.InvalidConfigurationException("hi!s{hi!s}hi!s", (java.lang.Throwable)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var5,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s"+ "'", var5.equals("net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var5,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s"));

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test218");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    boolean var5 = var0.inside(312, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test219");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.lang.String var11 = var9.getDefinitionLanguage();
    java.util.List var12 = var9.getParameters();
    java.util.List var13 = net.sourceforge.schemaspy.DbAnalyzer.sortColumnsByTable(var12);
    net.sourceforge.schemaspy.view.WriteStats var14 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "a"+ "'", var11.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test220");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.isHighQuality();
    var0.setPassword("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    var0.setCharset("ISO-8859-1s");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Properties var11 = var0.determineDbProperties("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. ");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test221");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = var0.isVisible();
    var0.hide();
    java.awt.Dimension var8 = var0.getPreferredSize();
    java.beans.VetoableChangeListener[] var9 = var0.getVetoableChangeListeners();
    var0.transferFocusBackward();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test222");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var5 = var0.getFocusTraversalPolicy();
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Point var11 = var6.getMousePosition(true);
    var6.disable();
    java.awt.Dimension var13 = var6.getMaximumSize();
    var0.setMaximumSize(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test223");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var1.clear();
    java.lang.String var3 = var1.toString();
    net.sourceforge.schemaspy.ui.DbConfigPanel var4 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var4.requestFocus();
    var4.setFocusTraversalPolicyProvider(true);
    var4.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var12 = var4.insets();
    var4.setAlignmentY(100.0f);
    java.lang.Object var15 = var4.getTreeLock();
    javax.swing.JToolTip var16 = var4.createToolTip();
    java.beans.PropertyChangeListener[] var17 = var4.getPropertyChangeListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var18 = var1.containsKey((java.lang.Object)var17);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{}"+ "'", var3.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test224");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var3 = var0.getBaselineResizeBehavior();
    boolean var4 = var0.isDisplayable();
    net.sourceforge.schemaspy.ui.DbConfigPanel var5 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var5.requestFocus();
    var5.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var9 = var5.insets();
    var5.setAlignmentX(1.0f);
    net.sourceforge.schemaspy.ui.DbConfigPanel var12 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var12.requestFocus();
    var12.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var16 = var12.insets();
    float var17 = var12.getAlignmentX();
    var12.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var23 = var12.getBounds();
    java.awt.Rectangle var24 = var5.getBounds(var23);
    var0.scrollRectToVisible(var24);
    java.awt.Dimension var26 = var0.getMaximumSize();
    var0.setAlignmentX(10.0f);
    net.sourceforge.schemaspy.util.DbSpecificOption var32 = new net.sourceforge.schemaspy.util.DbSpecificOption("", "ISO-8859-1");
    java.lang.String var33 = var32.toString();
    java.lang.String var34 = var32.getDescription();
    java.lang.Object var35 = var32.getValue();
    net.sourceforge.schemaspy.ui.MainFrame var36 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var37 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var38 = var37.getTableExclusions();
    boolean var39 = var37.isEvaluateAllEnabled();
    java.util.List var40 = var37.getColumnDetails();
    var36.setIconImages(var40);
    boolean var42 = var36.isAlwaysOnTop();
    var36.setFocusableWindowState(true);
    java.awt.Window[] var45 = var36.getOwnedWindows();
    java.awt.Component var46 = var36.getMostRecentFocusOwner();
    var32.setValue((java.lang.Object)var36);
    net.sourceforge.schemaspy.ui.DbConfigPanel var48 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var48.requestFocus();
    var48.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var54 = var48.getBackground();
    var48.requestFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var56 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var56.requestFocus();
    var56.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var60 = var56.insets();
    var56.setAlignmentX(1.0f);
    var56.firePropertyChange("hi!", 10, 2);
    var56.setVisible(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var69 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var69.requestFocus();
    var69.setFocusTraversalPolicyProvider(true);
    java.awt.Point var74 = var69.getMousePosition(true);
    java.awt.Component var75 = var69.getNextFocusableComponent();
    java.awt.Dimension var76 = var69.getMinimumSize();
    var56.setPreferredSize(var76);
    java.awt.Dimension var78 = var48.getSize(var76);
    var36.setSize(var78);
    var36.pack();
    int var81 = var36.getY();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var82 = var0.add("{}s", (java.awt.Component)var36);
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var33.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "ISO-8859-1"+ "'", var34.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 2);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test225");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    boolean var8 = var0.contains(1, (-1));
    var0.transferFocus();
    var0.removeAll();
    var0.repaint(1L, (-3), (-3), (-1), 1);
    boolean var17 = var0.isValid();
    net.sourceforge.schemaspy.ui.DbConfigPanel var18 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var18.requestFocus();
    var18.setFocusTraversalPolicyProvider(true);
    java.awt.Point var23 = var18.getMousePosition(true);
    int var24 = var18.getComponentCount();
    int var25 = var18.getHeight();
    var18.setName("hi!s");
    java.awt.Color var28 = var18.getBackground();
    java.awt.Dimension var29 = var18.preferredSize();
    var0.setMinimumSize(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
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
    assertNotNull(var29);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test226");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    java.awt.Toolkit var6 = var0.getToolkit();
    boolean var7 = var0.isFocused();
    boolean var8 = var0.isFocusCycleRoot();
    net.sourceforge.schemaspy.ui.MainFrame var9 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var10 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var11 = var10.getTableExclusions();
    boolean var12 = var10.isEvaluateAllEnabled();
    java.util.List var13 = var10.getColumnDetails();
    var9.setIconImages(var13);
    boolean var15 = var9.isAlwaysOnTop();
    var9.setFocusableWindowState(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var18 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var18.requestFocus();
    var18.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var22 = var18.insets();
    float var23 = var18.getAlignmentX();
    boolean var26 = var18.contains(1, (-1));
    var18.transferFocus();
    var18.removeAll();
    java.awt.Component var30 = var9.add((java.awt.Component)var18, 0);
    boolean var31 = var9.isValidateRoot();
    net.sourceforge.schemaspy.ui.DbConfigPanel var32 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var32.requestFocus();
    var32.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var36 = var32.insets();
    var32.reshape(1, 1, 1, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var42 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var42.requestFocus();
    var42.setFocusTraversalPolicyProvider(true);
    java.awt.Point var47 = var42.getMousePosition(true);
    java.awt.Component var48 = var42.getNextFocusableComponent();
    java.awt.Dimension var49 = var42.getMinimumSize();
    java.awt.Dimension var50 = var32.getSize(var49);
    java.awt.Rectangle var51 = var32.bounds();
    java.awt.Component var53 = var9.add((java.awt.Component)var32, 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setGlassPane((java.awt.Component)var9);
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
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test227");


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
    var0.invalidate();
    
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

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test228");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    net.sourceforge.schemaspy.Config var5 = var2.getConfig();
    var5.setCatalog("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    boolean var8 = var5.isOneOfMultipleSchemas();
    var5.setEncodeCommentsEnabled(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var5.getMaxDbThreads();
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test229");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var17 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var17.requestFocus();
    var17.setFocusTraversalPolicyProvider(true);
    java.awt.Point var22 = var17.getMousePosition(true);
    int var23 = var17.getComponentCount();
    boolean var24 = var17.getVerifyInputWhenFocusTarget();
    boolean var25 = var17.requestFocusInWindow();
    java.lang.Object var26 = var17.getTreeLock();
    java.lang.Object var27 = var1.put("hi!s{hi!s}hi!s.ISO-8859-1.net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s", var26);
    
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
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test230");


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
    boolean var89 = var0.isPreferredSizeSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setUndecorated(true);
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
    assertTrue(var89 == false);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test231");


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
    java.awt.Insets var14 = var10.insets();
    float var15 = var10.getAlignmentX();
    var10.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var21 = var10.getBounds();
    var0.scrollRectToVisible(var21);
    var0.transferFocusBackward();
    boolean var24 = var0.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test232");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.applyResourceBundle("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test233");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.util.List var3 = var0.getColumnDetails();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var4 = net.sourceforge.schemaspy.DbAnalyzer.sortColumnsByTable(var3);
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

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test234");


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
    java.awt.Dimension var37 = var36.getSize();
    
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
    assertNotNull(var37);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test235");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var2 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.InvalidConfigurationException var3 = new net.sourceforge.schemaspy.model.InvalidConfigurationException((java.lang.Throwable)var2);
    net.sourceforge.schemaspy.model.ProcessExecutionException var4 = new net.sourceforge.schemaspy.model.ProcessExecutionException((java.lang.Throwable)var3);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test236");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    net.sourceforge.schemaspy.Config var5 = var2.getConfig();
    java.util.List var6 = var5.getSchemas();
    java.util.List var7 = var5.getSchemas();
    java.lang.String var8 = var5.getSchemaSpec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test237");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    var0.setIgnoreRepaint(true);
    java.awt.Point var10 = var0.getMousePosition();
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
    var0.paintImmediately(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
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

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test238");


    net.sourceforge.schemaspy.SchemaAnalyzer var0 = new net.sourceforge.schemaspy.SchemaAnalyzer();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    var1.setDb("a");
    java.lang.String var4 = var1.getServer();
    boolean var5 = var1.isHtmlGenerationEnabled();
    boolean var6 = var1.isMeterEnabled();
    net.sourceforge.schemaspy.model.Database var7 = var0.analyze(var1);
    var1.setHasOrphans(true);
    net.sourceforge.schemaspy.view.SqlFormatter var10 = var1.getSqlFormatter();
    java.util.logging.Level var11 = var1.getLogLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test239");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    java.util.Locale var2 = var0.getLocale();
    java.awt.Dimension var3 = var0.getSize();
    java.awt.Toolkit var4 = var0.getToolkit();
    boolean var5 = var0.isFocusCycleRoot();
    var0.disable();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setOpacity(0.0f);
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test240");


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
    var0.setState(3);
    var0.revalidate();
    
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

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test241");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.setOpaque(false);
    var0.enable();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    var9.setAlignmentX(1.0f);
    boolean var16 = var9.hasFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var17 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var17.requestFocus();
    var17.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var21 = var17.insets();
    float var22 = var17.getAlignmentX();
    var17.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var28 = var17.getMouseListeners();
    boolean var29 = var9.isAncestorOf((java.awt.Component)var17);
    javax.swing.TransferHandler var30 = var17.getTransferHandler();
    var0.setComponentZOrder((java.awt.Component)var17, 1);
    var0.setDebugGraphicsOptions(312);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var37 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.List var38 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var37);
    java.util.Set var39 = var37.keySet();
    var0.setFocusTraversalKeys(2, var39);
    var0.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test242");


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
    java.awt.event.HierarchyBoundsListener[] var36 = var23.getHierarchyBoundsListeners();
    
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
    assertNotNull(var36);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test243");


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
    var0.repaint(1L, 10, 2, 0, 0);
    boolean var37 = var0.inside((-3), 1);
    net.sourceforge.schemaspy.ui.DbConfigPanel var38 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var38.requestFocus();
    var38.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var42 = var38.insets();
    var38.setAlignmentX(1.0f);
    var38.firePropertyChange("hi!", 10, 2);
    var38.paintImmediately(100, 10, 2, 0);
    java.util.Set var55 = var38.getFocusTraversalKeys(2);
    java.awt.Cursor var56 = var38.getCursor();
    var0.setCursor(var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDefaultCloseOperation(10);
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
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test244");


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
    java.awt.Component var26 = var0.locate(10, 1);
    
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
    assertNull(var26);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test245");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    java.awt.Dimension var5 = var0.getMaximumSize();
    var0.disable();
    java.awt.event.FocusListener[] var7 = var0.getFocusListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test246");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    var0.setSchemaSpec("hi!");
    var0.setHost("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    java.lang.String var9 = var0.getSchema();
    var0.setOutputDir("ISO-8859-1s");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test247");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    net.sourceforge.schemaspy.Config var5 = var2.getConfig();
    var5.setHost("hi!s");
    net.sourceforge.schemaspy.view.SqlFormatter var8 = var5.getSqlFormatter();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.setIndirectColumnExclusions("[]");
      fail("Expected exception of type java.util.regex.PatternSyntaxException");
    } catch (java.util.regex.PatternSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test248");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    java.awt.Color var6 = var0.getBackground();
    javax.swing.event.AncestorListener[] var7 = var0.getAncestorListeners();
    int var8 = var0.countComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test249");


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
    var6.setExtendedState(312);
    var6.setLocation(0, 5);
    java.awt.event.WindowStateListener[] var24 = var6.getWindowStateListeners();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test250");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.lang.String var4 = var0.getParam("hi!s");
    boolean var5 = var0.isEvaluateAllEnabled();
    java.io.File var6 = var0.getGraphvizDir();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setColumnDetails("Password associated with user id");
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test251");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    var0.fireTableRowsDeleted(2, 0);
    int var10 = var0.getRowCount();
    var0.fireTableRowsDeleted(300, 300);
    int var14 = var0.getRowCount();
    int var15 = var0.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test252");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isRankDirBugEnabled();
    var0.setMaxDetailedTabled(0);
    var0.setHost("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    var0.setCharset("DbSpecificOption name: 'net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s' value: 'null' description: 'a'");
    var0.setCss("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test253");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    int var6 = var0.getComponentCount();
    int var7 = var0.getHeight();
    boolean var8 = var0.getInheritsPopupMenu();
    var0.show();
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var14 = var10.insets();
    var10.setAlignmentX(1.0f);
    java.awt.Color var17 = var10.getForeground();
    int var18 = var10.getWidth();
    java.awt.Rectangle var19 = var10.getBounds();
    var0.computeVisibleRect(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test254");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.lang.String var11 = var9.getComment();
    java.lang.String var12 = var9.getType();
    java.lang.String var13 = var9.getSecurityType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "a"+ "'", var11.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test255");


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
    java.awt.event.WindowListener[] var89 = var0.getWindowListeners();
    
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
    assertNotNull(var89);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test256");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    javax.swing.InputVerifier var3 = var0.getInputVerifier();
    boolean var4 = var0.getAutoscrolls();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var5 = var0.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test257");


    java.lang.String var1 = net.sourceforge.schemaspy.util.HtmlEncoder.encodeString("Value");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "Value"+ "'", var1.equals("Value"));

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test258");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    var0.setAlignmentY(100.0f);
    java.lang.Object var11 = var0.getTreeLock();
    java.awt.Rectangle var12 = var0.getBounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test259");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    java.awt.Insets var3 = var0.insets();
    boolean var4 = var0.isOpaque();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test260");


    net.sourceforge.schemaspy.util.Version var1 = new net.sourceforge.schemaspy.util.Version("");
    net.sourceforge.schemaspy.util.Version var3 = new net.sourceforge.schemaspy.util.Version("");
    int var4 = var1.compareTo(var3);
    net.sourceforge.schemaspy.util.Version var6 = new net.sourceforge.schemaspy.util.Version("");
    int var7 = var1.compareTo(var6);
    boolean var9 = var1.equals((java.lang.Object)(-1L));
    java.lang.String var10 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test261");


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
    var35.nextFocus();
    boolean var37 = var35.isForegroundSet();
    java.awt.Image var40 = var35.createImage(2, 0);
    var35.firePropertyChange("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin", 0L, 0L);
    
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
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test262");


    net.sourceforge.schemaspy.MultipleSchemaAnalyzer var0 = net.sourceforge.schemaspy.MultipleSchemaAnalyzer.getInstance();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.util.List var13 = var11.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var14 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var13);
    java.util.List var15 = net.sourceforge.schemaspy.DbAnalyzer.getMustBeUniqueNullableColumns((java.util.Collection)var13);
    java.lang.String var16 = net.sourceforge.schemaspy.model.ForeignKeyConstraint.toString(var15);
    net.sourceforge.schemaspy.view.WriteStats var17 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var15);
    java.util.List var18 = net.sourceforge.schemaspy.DbAnalyzer.sortTablesByName(var15);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var20 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var21 = var20.entrySet();
    java.util.Set var22 = var20.entrySet();
    java.util.List var23 = net.sourceforge.schemaspy.DbAnalyzer.getMustBeUniqueNullableColumns((java.util.Collection)var22);
    net.sourceforge.schemaspy.Config var24 = new net.sourceforge.schemaspy.Config();
    var24.setDb("a");
    java.lang.String var27 = var24.getServer();
    boolean var28 = var24.isHtmlGenerationEnabled();
    boolean var29 = var24.isMeterEnabled();
    java.lang.String var31 = var24.getParam("a");
    java.lang.String var32 = var24.getDescription();
    var24.setFontSize(100);
    var24.setHtmlGenerationEnabled(false);
    net.sourceforge.schemaspy.Config var37 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var38 = var37.getTableExclusions();
    var37.setSqlFormatter("hi!");
    net.sourceforge.schemaspy.view.DefaultSqlFormatter var41 = new net.sourceforge.schemaspy.view.DefaultSqlFormatter();
    var37.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var41);
    var24.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.analyze("hi!s", var18, var23, var24);
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "[]"+ "'", var16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test263");


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
    java.awt.Dimension var27 = var0.getMaximumSize();
    
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
    assertNotNull(var27);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test264");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    var0.setTableInclusions("");
    var0.setSchema("{}s");
    net.sourceforge.schemaspy.Config var12 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var13 = var12.getTableExclusions();
    var12.setSqlFormatter("hi!");
    net.sourceforge.schemaspy.view.DefaultSqlFormatter var16 = new net.sourceforge.schemaspy.view.DefaultSqlFormatter();
    var12.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var16);
    var0.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var16);
    java.lang.Integer var19 = var0.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test265");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(3);
    int var2 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test266");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    boolean var7 = var0.isBackgroundSet();
    java.awt.event.MouseWheelListener[] var8 = var0.getMouseWheelListeners();
    java.awt.Point var10 = var0.getMousePosition(true);
    var0.paintImmediately(0, 11, (-3), 300);
    
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

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test267");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    java.awt.Insets var6 = var0.insets();
    var0.setOpaque(true);
    java.lang.Object var9 = var0.getTreeLock();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test268");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.isHighQuality();
    var0.setPassword("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    var0.setCharset("a");
    java.util.logging.Level var10 = var0.getLogLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test269");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = var0.isVisible();
    var0.hide();
    java.awt.Dimension var8 = var0.getPreferredSize();
    net.sourceforge.schemaspy.ui.MainFrame var9 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.MouseMotionListener[] var10 = var9.getMouseMotionListeners();
    java.util.Locale var11 = var9.getLocale();
    java.awt.Dimension var12 = var9.getSize();
    java.awt.Toolkit var13 = var9.getToolkit();
    java.awt.Component var14 = var9.getFocusOwner();
    net.sourceforge.schemaspy.ui.DbConfigPanel var15 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var15.requestFocus();
    var15.setFocusTraversalPolicyProvider(true);
    boolean var19 = var15.requestFocusInWindow();
    java.awt.Dimension var20 = var15.getMaximumSize();
    var9.setMinimumSize(var20);
    boolean var22 = var9.isValidateRoot();
    java.awt.Color var23 = var9.getBackground();
    var0.setForeground(var23);
    var0.repaint(431, 11, 300, 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test270");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    java.lang.Object var5 = var0.getTreeLock();
    boolean var6 = var0.isFocusTraversalPolicyProvider();
    net.sourceforge.schemaspy.ui.DbConfigPanel var8 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var8.requestFocus();
    var8.setFocusTraversalPolicyProvider(true);
    var8.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var16 = var8.insets();
    var8.setAlignmentY(100.0f);
    java.lang.Object var19 = var8.getTreeLock();
    net.sourceforge.schemaspy.ui.MainFrame var20 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var21 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var21.requestFocus();
    var21.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var25 = var21.insets();
    var21.setAlignmentX(1.0f);
    java.awt.Color var28 = var21.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var29 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var29.requestFocus();
    var29.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var33 = var29.insets();
    float var34 = var29.getAlignmentX();
    var29.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var40 = var29.getMouseListeners();
    java.awt.Rectangle var41 = var29.bounds();
    var21.setBounds(var41);
    var20.setMaximizedBounds(var41);
    java.util.List var44 = var20.getIconImages();
    java.awt.Rectangle var45 = var20.getMaximizedBounds();
    java.awt.Rectangle var46 = var8.getBounds(var45);
    javax.swing.InputMap var47 = var8.getInputMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setInputMap(2, var47);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test271");


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
    java.awt.Component var46 = var0.getFocusOwner();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.applyResourceBundle("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }
    
    
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
    assertNull(var46);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test272");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    java.lang.String var3 = var0.getRenderer();
    var0.setHighQuality(false);
    boolean var6 = var0.isValid();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test273");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    var0.hide();
    var0.firePropertyChange("schemaSpy.css", '4', '#');
    net.sourceforge.schemaspy.ui.MainFrame var7 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var8 = var7.getType();
    java.awt.Component var9 = var7.getMostRecentFocusOwner();
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    boolean var14 = var10.requestFocusInWindow();
    java.awt.Cursor var15 = var10.getCursor();
    java.awt.Point var16 = var10.location();
    java.awt.Point var17 = var9.getLocation(var16);
    var0.setLocation(var16);
    net.sourceforge.schemaspy.util.DbSpecificOption var21 = new net.sourceforge.schemaspy.util.DbSpecificOption("", "ISO-8859-1");
    java.lang.String var22 = var21.toString();
    java.lang.String var23 = var21.getDescription();
    java.lang.Object var24 = var21.getValue();
    net.sourceforge.schemaspy.ui.MainFrame var25 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var26 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var27 = var26.getTableExclusions();
    boolean var28 = var26.isEvaluateAllEnabled();
    java.util.List var29 = var26.getColumnDetails();
    var25.setIconImages(var29);
    boolean var31 = var25.isAlwaysOnTop();
    var25.setFocusableWindowState(true);
    java.awt.Window[] var34 = var25.getOwnedWindows();
    java.awt.Component var35 = var25.getMostRecentFocusOwner();
    var21.setValue((java.lang.Object)var25);
    net.sourceforge.schemaspy.ui.DbConfigPanel var37 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var37.requestFocus();
    var37.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var43 = var37.getBackground();
    var37.requestFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var45 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var45.requestFocus();
    var45.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var49 = var45.insets();
    var45.setAlignmentX(1.0f);
    var45.firePropertyChange("hi!", 10, 2);
    var45.setVisible(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var58 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var58.requestFocus();
    var58.setFocusTraversalPolicyProvider(true);
    java.awt.Point var63 = var58.getMousePosition(true);
    java.awt.Component var64 = var58.getNextFocusableComponent();
    java.awt.Dimension var65 = var58.getMinimumSize();
    var45.setPreferredSize(var65);
    java.awt.Dimension var67 = var37.getSize(var65);
    var25.setSize(var67);
    var0.setSize(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var22.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "ISO-8859-1"+ "'", var23.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test274");


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
    java.awt.Dialog.ModalExclusionType var12 = var0.getModalExclusionType();
    
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
    assertNotNull(var12);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test275");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.setOpaque(false);
    var0.enable();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    var9.setAlignmentX(1.0f);
    boolean var16 = var9.hasFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var17 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var17.requestFocus();
    var17.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var21 = var17.insets();
    float var22 = var17.getAlignmentX();
    var17.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var28 = var17.getMouseListeners();
    boolean var29 = var9.isAncestorOf((java.awt.Component)var17);
    javax.swing.TransferHandler var30 = var17.getTransferHandler();
    var0.setComponentZOrder((java.awt.Component)var17, 1);
    var0.setDebugGraphicsOptions(312);
    net.sourceforge.schemaspy.ui.DbConfigPanel var35 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var35.requestFocus();
    java.beans.PropertyChangeListener[] var37 = var35.getPropertyChangeListeners();
    var35.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var43 = var35.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var44 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var44.requestFocus();
    var44.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var48 = var44.insets();
    var44.setAlignmentX(1.0f);
    java.awt.Color var51 = var44.getForeground();
    var35.setForeground(var51);
    boolean var53 = var35.hasFocus();
    var35.enableInputMethods(false);
    java.awt.Component var56 = var0.add((java.awt.Component)var35);
    var56.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test276");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var4 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ConnectionFailure var6 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ConnectionFailure var7 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var4);
    net.sourceforge.schemaspy.view.StyleSheet.ParseException var8 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException((java.lang.Exception)var4);
    net.sourceforge.schemaspy.model.InvalidConfigurationException var10 = var4.setParamName("a");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test277");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.hasOrphans();
    java.lang.String var5 = var0.getHost();
    var0.setDb(" ");
    var0.setHost(" ");
    var0.setEvaluateAllEnabled(true);
    java.lang.String var12 = var0.getCatalog();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test278");


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
    java.lang.String var22 = var0.getSchemaSpec();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test279");


    net.sourceforge.schemaspy.view.StyleSheet.ParseException var2 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException("hi!s");
    net.sourceforge.schemaspy.model.ProcessExecutionException var3 = new net.sourceforge.schemaspy.model.ProcessExecutionException("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", (java.lang.Throwable)var2);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var4,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s"+ "'", var4.equals("net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var4,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var5,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s"+ "'", var5.equals("net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var5,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s"));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test280");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isDbHelpRequired();
    java.lang.String var5 = var0.getFont();
    java.util.Map var6 = var0.getDbSpecificOptions();
    var0.setPromptForPasswordEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Helvetica"+ "'", var5.equals("Helvetica"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test281");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = var0.isVisible();
    var0.hide();
    java.awt.Dimension var8 = var0.getPreferredSize();
    java.awt.Component var9 = var0.getNextFocusableComponent();
    net.sourceforge.schemaspy.ui.DbConfigPanel var11 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var11.requestFocus();
    var11.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var15 = var11.insets();
    var11.setAlignmentX(1.0f);
    java.awt.Color var18 = var11.getForeground();
    javax.swing.InputVerifier var19 = var11.getInputVerifier();
    var11.repaint(100L, 10, 1, 0, 100);
    var11.setEnabled(false);
    javax.swing.InputMap var28 = var11.getInputMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setInputMap((-1), var28);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test282");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    int var2 = var0.findColumn("a");
    net.sourceforge.schemaspy.util.DbSpecificConfig var4 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setDbSpecificConfig(var4);
    javax.swing.event.TableModelListener[] var6 = var0.getTableModelListeners();
    var0.fireTableRowsInserted(100, 100);
    var0.fireTableDataChanged();
    var0.fireTableStructureChanged();
    int var12 = var0.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test283");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.util.List var11 = var9.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var12 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var11);
    java.util.List var13 = net.sourceforge.schemaspy.DbAnalyzer.getMustBeUniqueNullableColumns((java.util.Collection)var11);
    java.lang.String var14 = net.sourceforge.schemaspy.model.ForeignKeyConstraint.toString(var13);
    net.sourceforge.schemaspy.view.WriteStats var15 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var13);
    java.util.List var16 = net.sourceforge.schemaspy.DbAnalyzer.sortTablesByName(var13);
    java.util.List var17 = net.sourceforge.schemaspy.DbAnalyzer.sortTablesByName(var13);
    java.util.List var18 = net.sourceforge.schemaspy.DbAnalyzer.getDefaultNullStringColumns((java.util.Collection)var17);
    java.util.List var19 = net.sourceforge.schemaspy.DbAnalyzer.getDefaultNullStringColumns((java.util.Collection)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[]"+ "'", var14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test284");


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
    java.util.List var76 = var52.getIconImages();
    net.sourceforge.schemaspy.ui.DbConfigPanel var77 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var77.requestFocus();
    var77.setFocusTraversalPolicyProvider(true);
    boolean var81 = var77.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var82 = var77.getFocusTraversalPolicy();
    var52.setFocusTraversalPolicy(var82);
    var6.setFocusTraversalPolicy(var82);
    
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
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test285");


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
    var0.setEnabled(true);
    
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

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test286");


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
    var35.newLine();
    
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

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test287");


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
    java.awt.LayoutManager var15 = var0.getLayout();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setDefaultCloseOperation((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var15);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test288");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    float var8 = var0.getAlignmentX();
    boolean var9 = var0.isOpaque();
    javax.swing.KeyStroke[] var10 = var0.getRegisteredKeyStrokes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test289");


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
    java.awt.GraphicsConfiguration var16 = var0.getGraphicsConfiguration();
    
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
    assertNull(var16);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test290");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    var0.setIgnoreRepaint(true);
    java.awt.Point var10 = var0.getMousePosition();
    var0.repaint(1, (-3), 2, 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var16 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var16.requestFocus();
    var16.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var20 = var16.insets();
    float var21 = var16.getAlignmentX();
    var16.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var27 = var16.getBounds();
    var0.computeVisibleRect(var27);
    net.sourceforge.schemaspy.ui.DbConfigTableModel var29 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var29.fireTableRowsInserted(2, 1);
    java.lang.Class var34 = var29.getClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var35 = var0.<java.util.EventListener>getListeners(var34);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test291");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var19 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var19.requestFocus();
    var19.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var23 = var19.insets();
    var19.requestFocus();
    var19.setIgnoreRepaint(true);
    java.awt.Component var27 = var19.getNextFocusableComponent();
    net.sourceforge.schemaspy.ui.MainFrame var28 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var29 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var30 = var29.getTableExclusions();
    boolean var31 = var29.isEvaluateAllEnabled();
    java.util.List var32 = var29.getColumnDetails();
    var28.setIconImages(var32);
    boolean var34 = var28.isAlwaysOnTop();
    var28.setFocusableWindowState(true);
    boolean var37 = var28.isFocusCycleRoot();
    java.awt.Graphics var38 = var28.getGraphics();
    boolean var39 = var28.isFocusCycleRoot();
    java.awt.Dimension var40 = var28.size();
    var19.setMaximumSize(var40);
    java.awt.Component var42 = var0.add((java.awt.Component)var19);
    var19.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test292");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    var0.fireTableDataChanged();
    net.sourceforge.schemaspy.ui.MainFrame var5 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var6 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var6.requestFocus();
    var6.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var10 = var6.insets();
    var6.setAlignmentX(1.0f);
    java.awt.Color var13 = var6.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var14 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var14.requestFocus();
    var14.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var18 = var14.insets();
    float var19 = var14.getAlignmentX();
    var14.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var25 = var14.getMouseListeners();
    java.awt.Rectangle var26 = var14.bounds();
    var6.setBounds(var26);
    var5.setMaximizedBounds(var26);
    java.util.List var29 = var5.getIconImages();
    boolean var30 = var5.isFocusCycleRoot();
    var5.revalidate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setValueAt((java.lang.Object)var5, 2, 100);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test293");


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
    boolean var32 = var0.isForegroundSet();
    java.awt.Color var33 = var0.getBackground();
    java.awt.image.BufferStrategy var34 = var0.getBufferStrategy();
    java.awt.Dimension var35 = var0.getPreferredSize();
    
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
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test294");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    var0.paintImmediately((-3), (-1), 3, 3);
    java.awt.Dimension var11 = var0.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test295");


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
    var0.firePropertyChange("ora", (byte)(-1), (byte)0);
    net.sourceforge.schemaspy.ui.DbConfigPanel var28 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var28.requestFocus();
    var28.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var32 = var28.insets();
    var28.setAlignmentX(1.0f);
    java.awt.Color var35 = var28.getForeground();
    javax.swing.InputVerifier var36 = var28.getInputVerifier();
    var28.repaint(100L, 10, 1, 0, 100);
    var28.setEnabled(false);
    javax.swing.InputMap var45 = var28.getInputMap();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setInputMap(3, var45);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test296");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.lang.String var13 = var11.getDefinitionLanguage();
    java.util.List var14 = var11.getParameters();
    var0.setColumnDetails(var14);
    var0.setPort((java.lang.Integer)0);
    var0.setDb("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    net.sourceforge.schemaspy.Config var20 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var21 = var20.getTableExclusions();
    boolean var22 = var20.isEvaluateAllEnabled();
    java.util.List var23 = var20.getColumnDetails();
    var0.setColumnDetails(var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var25 = net.sourceforge.schemaspy.DbAnalyzer.getTablesWithOneColumn((java.util.Collection)var23);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test297");


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
    boolean var24 = var0.isMinimumSizeSet();
    
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
    assertTrue(var24 == false);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test298");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    var0.nextFocus();
    int var10 = var0.getY();
    java.awt.Dimension var11 = var0.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test299");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    var0.paintImmediately(1, 0, 0, (-1));
    int var10 = var0.getY();
    var0.setSize(5, 5);
    javax.swing.TransferHandler var14 = var0.getTransferHandler();
    var0.updateUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test300");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    boolean var8 = var0.contains(1, (-1));
    var0.transferFocus();
    var0.removeAll();
    var0.repaint(1L, (-3), (-3), (-1), 1);
    var0.updateUI();
    var0.repaint(100L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.InputMap var21 = var0.getInputMap(3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test301");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    java.lang.Object var5 = var0.getTreeLock();
    var0.validate();
    boolean var7 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    var0.requestFocus();
    var0.hide();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test302");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    int var2 = var0.findColumn("a");
    net.sourceforge.schemaspy.util.DbSpecificConfig var4 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setDbSpecificConfig(var4);
    javax.swing.event.TableModelListener[] var6 = var0.getTableModelListeners();
    var0.fireTableRowsInserted(100, 100);
    var0.fireTableDataChanged();
    var0.fireTableDataChanged();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var12 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var12.fireTableRowsInserted(2, 1);
    java.lang.Class var17 = var12.getClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var18 = var0.<java.util.EventListener>getListeners(var17);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test303");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var25 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    net.sourceforge.schemaspy.ui.DbConfigPanel var26 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var26.requestFocus();
    var26.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var30 = var26.insets();
    var26.setAlignmentX(1.0f);
    boolean var33 = var26.hasFocus();
    boolean var34 = var26.getFocusTraversalKeysEnabled();
    var26.setSize(1, (-1));
    boolean var39 = var26.requestFocus(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var40 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var40.requestFocus();
    java.beans.PropertyChangeListener[] var42 = var40.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var43 = var40.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var44 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var44.requestFocus();
    var44.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var48 = var44.insets();
    var44.setAlignmentX(1.0f);
    var44.doLayout();
    boolean var52 = var44.isCursorSet();
    var44.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var57 = var44.getLocation();
    boolean var58 = var40.contains(var57);
    java.awt.Point var59 = var26.getLocation(var57);
    java.awt.Component var60 = var25.add((java.awt.Component)var26);
    java.awt.Insets var61 = var25.insets();
    java.awt.Insets var62 = var0.getInsets(var61);
    net.sourceforge.schemaspy.ui.MainFrame var63 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var64 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var65 = var64.getTableExclusions();
    boolean var66 = var64.isEvaluateAllEnabled();
    java.util.List var67 = var64.getColumnDetails();
    var63.setIconImages(var67);
    boolean var69 = var63.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var70 = var63.getModalExclusionType();
    net.sourceforge.schemaspy.ui.DbConfigPanel var71 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var71.requestFocus();
    var71.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var75 = var71.insets();
    var71.setAlignmentX(1.0f);
    boolean var78 = var71.hasFocus();
    boolean var79 = var71.getFocusTraversalKeysEnabled();
    boolean var80 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var71);
    net.sourceforge.schemaspy.ui.DbConfigPanel var81 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var82 = var81.isManagingFocus();
    java.awt.Rectangle var83 = var81.getVisibleRect();
    java.awt.Rectangle var84 = var71.getBounds(var83);
    java.awt.Dimension var85 = var71.getPreferredSize();
    var63.setSize(var85);
    var63.setTitle("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    boolean var89 = var63.isOpaque();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setComponentZOrder((java.awt.Component)var63, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == true);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test304");


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
    boolean var26 = var0.isOpaque();
    
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
    assertTrue(var26 == true);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test305");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    java.awt.event.MouseListener[] var2 = var0.getMouseListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test306");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    boolean var7 = var0.isBackgroundSet();
    java.awt.event.MouseWheelListener[] var8 = var0.getMouseWheelListeners();
    int var9 = var0.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test307");


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
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test308");


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
    var0.firePropertyChange("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin", 100.0d, 10.0d);
    java.beans.PropertyChangeListener[] var50 = var0.getPropertyChangeListeners("DbSpecificOption name: 'DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'' value: 'null' description: 'net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]'");
    var0.setFocusableWindowState(false);
    
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
    assertNotNull(var50);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test309");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.lang.String var13 = var11.getDefinitionLanguage();
    java.util.List var14 = var11.getParameters();
    var0.setColumnDetails(var14);
    var0.setPort((java.lang.Integer)0);
    var0.setDb("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    java.lang.String var20 = var0.getCharset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "ISO-8859-1"+ "'", var20.equals("ISO-8859-1"));

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test310");


    java.lang.String var1 = net.sourceforge.schemaspy.util.Inflection.pluralize("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var1,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)s"+ "'", var1.equals("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var1,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)s"));

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test311");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    java.awt.Point var3 = var0.getMousePosition();
    boolean var6 = var0.contains(1, (-1));
    var0.revalidate();
    javax.swing.event.AncestorListener[] var8 = var0.getAncestorListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test312");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.isHighQuality();
    var0.setDriverPath(" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test313");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    java.lang.String var10 = var9.getDefinition();
    net.sourceforge.schemaspy.model.Routine var20 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var21 = var20.getDataAccess();
    java.lang.String var22 = var20.getDefinitionLanguage();
    int var23 = var9.compareTo(var20);
    net.sourceforge.schemaspy.model.RoutineParameter var27 = new net.sourceforge.schemaspy.model.RoutineParameter("ISO-8859-1s", "hi!", "");
    var20.addParameter(var27);
    java.lang.String var29 = var20.getDefinition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "a"+ "'", var22.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "a"+ "'", var29.equals("a"));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test314");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    java.lang.String var7 = var0.getParam("a");
    var0.setPromptForPasswordEnabled(false);
    java.lang.String var10 = var0.getServer();
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
    assertNull(var10);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test315");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    net.sourceforge.schemaspy.util.DbSpecificConfig var2 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var2.dumpUsage();
    var0.setDbSpecificConfig(var2);
    net.sourceforge.schemaspy.Config var5 = var2.getConfig();
    var2.dumpUsage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test316");


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
    net.sourceforge.schemaspy.ui.MainFrame var50 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var51 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var52 = var51.getTableExclusions();
    boolean var53 = var51.isEvaluateAllEnabled();
    java.util.List var54 = var51.getColumnDetails();
    var50.setIconImages(var54);
    boolean var56 = var50.isAlwaysOnTop();
    var50.setFocusableWindowState(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var59 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var60 = var59.isManagingFocus();
    int var61 = var59.getWidth();
    javax.swing.InputVerifier var62 = var59.getInputVerifier();
    net.sourceforge.schemaspy.ui.DbConfigPanel var63 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var63.requestFocus();
    var63.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var67 = var63.insets();
    var63.requestFocus();
    boolean var69 = var63.isVisible();
    java.awt.Dimension var70 = var63.preferredSize();
    java.awt.Dimension var71 = var59.getSize(var70);
    var50.setSize(var70);
    java.lang.String var73 = var50.getWarningString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var75 = var0.add((java.awt.Component)var50, 3);
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
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test317");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    var0.setTableExclusions("ISO-8859-1");
    var0.setPromptForPasswordEnabled(true);
    var0.setConnectionProperties("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    var0.setViewsEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test318");


    java.lang.String var4 = net.sourceforge.schemaspy.model.Table.getFullName("Value", "", "hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s", "hi!s{hi!s}hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ".hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s.hi!s{hi!s}hi!s"+ "'", var4.equals(".hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s.hi!s{hi!s}hi!s"));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test319");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.util.List var10 = var9.getParameters();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test320");


    net.sourceforge.schemaspy.view.StyleSheet.ParseException var1 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    net.sourceforge.schemaspy.view.StyleSheet.ParseException var2 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException((java.lang.Exception)var1);
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var3,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"+ "'", var3.equals("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var3,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"));

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test321");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    java.lang.String var2 = var0.getCharset();
    boolean var3 = var0.isViewsEnabled();
    var0.setDbType("ISO-8859-1s");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "ISO-8859-1"+ "'", var2.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test322");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var7 = var0.getModalExclusionType();
    boolean var8 = var0.isAlwaysOnTop();
    java.lang.String var9 = var0.toString();
    net.sourceforge.schemaspy.TableOrderer var10 = new net.sourceforge.schemaspy.TableOrderer();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var12 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var13 = var12.entrySet();
    java.util.List var14 = net.sourceforge.schemaspy.DbAnalyzer.getOrphans((java.util.Collection)var13);
    net.sourceforge.schemaspy.Config var15 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var16 = var15.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var26 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var27 = var26.getDataAccess();
    java.lang.String var28 = var26.getDefinitionLanguage();
    java.util.List var29 = var26.getParameters();
    var15.setColumnDetails(var29);
    java.util.List var31 = var10.getTablesOrderedByRI((java.util.Collection)var14, (java.util.Collection)var29);
    var0.setIconImages(var29);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "net.sourceforge.schemaspy.ui.MainFrame[frame4,0,23,500x312,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0var9,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"+ "'", var9.equals("net.sourceforge.schemaspy.ui.MainFrame[frame4,0,23,500x312,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0var9,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "a"+ "'", var28.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test323");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    var0.repaint(100, 1, 10, (-1));
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    var10.firePropertyChange("a", (byte)10, (byte)0);
    var10.setIgnoreRepaint(true);
    java.awt.Point var20 = var10.getMousePosition();
    var10.setDoubleBuffered(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    var23.setAlignmentX(1.0f);
    boolean var30 = var23.hasFocus();
    boolean var31 = var23.getFocusTraversalKeysEnabled();
    boolean var32 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var23);
    net.sourceforge.schemaspy.ui.DbConfigPanel var33 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var34 = var33.isManagingFocus();
    java.awt.Rectangle var35 = var33.getVisibleRect();
    java.awt.Rectangle var36 = var23.getBounds(var35);
    java.awt.Dimension var37 = var23.getPreferredSize();
    java.awt.Dimension var38 = var10.getSize(var37);
    var0.setSize(var38);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var40 = var0.getLocationOnScreen();
      fail("Expected exception of type java.awt.IllegalComponentStateException");
    } catch (java.awt.IllegalComponentStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test324");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(10, (-3));
    var0.fireTableCellUpdated(10, 3);
    var0.fireTableDataChanged();
    var0.fireTableStructureChanged();

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test325");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var2 = var1.entrySet();
    java.lang.Object var3 = var1.clone();
    int var4 = var1.size();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test326");


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
    java.awt.Graphics var67 = var0.getGraphics();
    java.awt.Graphics var68 = var0.getGraphics();
    
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
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test327");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var7 = var0.getTableModelListeners();
    var0.fireTableRowsUpdated(0, 3);
    javax.swing.event.TableModelListener[] var11 = var0.getTableModelListeners();
    var0.fireTableCellUpdated(0, 0);
    net.sourceforge.schemaspy.util.DbSpecificConfig var16 = new net.sourceforge.schemaspy.util.DbSpecificConfig("");
    var16.dumpUsage();
    var0.setDbSpecificConfig(var16);
    net.sourceforge.schemaspy.util.DbSpecificConfig var20 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setDbSpecificConfig(var20);
    int var22 = var0.getColumnCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test328");


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
    var8.show();
    boolean var38 = var8.isShowing();
    java.awt.image.VolatileImage var41 = var8.createVolatileImage(1, 300);
    
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
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test329");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    boolean var6 = var0.isAlwaysOnTop();
    var0.setFocusableWindowState(true);
    boolean var9 = var0.isFocusCycleRoot();
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var14 = var10.insets();
    var10.setAlignmentX(1.0f);
    var10.firePropertyChange("hi!", 10, 2);
    var10.paintImmediately(100, 10, 2, 0);
    java.util.Set var27 = var10.getFocusTraversalKeys(2);
    net.sourceforge.schemaspy.ui.DbConfigPanel var28 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var28.requestFocus();
    var28.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var32 = var28.insets();
    float var33 = var28.getAlignmentX();
    var28.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var39 = var28.getBounds();
    var10.computeVisibleRect(var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setShape((java.awt.Shape)var39);
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
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test330");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    int var2 = var0.findColumn("a");
    net.sourceforge.schemaspy.util.DbSpecificConfig var4 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setDbSpecificConfig(var4);
    javax.swing.event.TableModelListener[] var6 = var0.getTableModelListeners();
    int var7 = var0.getRowCount();
    int var9 = var0.findColumn("");
    boolean var12 = var0.isCellEditable((-1), (-3));
    var0.fireTableRowsInserted(431, 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test331");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.doLayout();
    boolean var8 = var0.isCursorSet();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    java.beans.PropertyChangeListener[] var11 = var9.getPropertyChangeListeners();
    var9.paintImmediately(0, (-1), (-1), 0);
    java.awt.Font var17 = var9.getFont();
    var0.setFont(var17);
    var0.setFocusTraversalPolicyProvider(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test332");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.newLine();
    var3.writeln("[]");
    java.io.Writer var8 = var3.append((java.lang.CharSequence)"hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.io.Writer var12 = var3.append((java.lang.CharSequence)"net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. ", (-3), 300);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test333");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    var0.fireTableRowsDeleted(2, 0);
    int var10 = var0.getRowCount();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var11 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var11.fireTableRowsInserted(2, 1);
    java.lang.Class var16 = var11.getClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var17 = var0.<java.util.EventListener>getListeners(var16);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test334");


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
    var25.clear();
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var41 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    int var42 = var41.size();
    var25.putAll((java.util.Map)var41);
    
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
    assertTrue(var42 == 0);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test335");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.util.List var11 = var9.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var12 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var11);
    int var13 = var12.getNumViewsWritten();
    int var14 = var12.getNumTablesWritten();
    net.sourceforge.schemaspy.view.WriteStats var15 = new net.sourceforge.schemaspy.view.WriteStats(var12);
    int var16 = var15.getNumTablesWritten();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test336");


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
    java.awt.Color var37 = var0.getBackground();
    boolean var38 = var0.isPreferredSizeSet();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test337");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    net.sourceforge.schemaspy.util.CaseInsensitiveMap var10 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var11 = var10.entrySet();
    var0.setFocusTraversalKeys(0, var11);
    java.awt.dnd.DropTarget var13 = var0.getDropTarget();
    boolean var16 = var0.contains(312, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test338");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    boolean var8 = var0.getFocusTraversalKeysEnabled();
    boolean var9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var0);
    var0.firePropertyChange("hi!", 'a', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var14 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var15 = var14.isManagingFocus();
    int var16 = var14.getWidth();
    java.awt.Insets var17 = var14.insets();
    javax.accessibility.AccessibleContext var18 = var14.getAccessibleContext();
    boolean var21 = var14.inside(100, (-3));
    java.awt.Rectangle var22 = var14.getVisibleRect();
    var0.setBounds(var22);
    var0.invalidate();
    var0.setFocusTraversalKeysEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test339");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var4 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ConnectionFailure var6 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var4);
    net.sourceforge.schemaspy.model.ConnectionFailure var7 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var4);
    net.sourceforge.schemaspy.view.StyleSheet.ParseException var8 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException((java.lang.Exception)var4);
    net.sourceforge.schemaspy.util.Dot var9 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var9.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var13 = var9.new DotFailure("hi!s");
    var4.addSuppressed((java.lang.Throwable)var13);
    net.sourceforge.schemaspy.view.StyleSheet.ParseException var15 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException((java.lang.Exception)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test340");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.util.List var3 = var0.getColumnDetails();
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.hasOrphans();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test341");


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

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test342");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("ISO-8859-1");
    int var2 = var1.getSize();
    javax.swing.event.ListDataListener[] var3 = var1.getListDataListeners();
    javax.swing.event.ListDataListener[] var4 = var1.getListDataListeners();
    int var5 = var1.getSize();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var6 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var6.fireTableStructureChanged();
    java.lang.Class var9 = var6.getClass(2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var10 = var1.<java.util.EventListener>getListeners(var9);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test343");


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
    java.awt.Container var16 = var3.getTopLevelAncestor();
    var3.setOpaque(false);
    java.awt.Rectangle var19 = var3.getVisibleRect();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test344");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    java.io.Writer var5 = var3.append((java.lang.CharSequence)"net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    java.io.Writer var7 = var5.append((java.lang.CharSequence)"DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test345");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.isMinimumSizeSet();
    var0.enable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test346");


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
    int var17 = var0.getBaseline(1, 300);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test347");


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
    boolean var87 = var0.isFocusCycleRoot();
    net.sourceforge.schemaspy.ui.DbConfigPanel var88 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var88.requestFocus();
    var88.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var94 = var88.getBackground();
    var0.setBackground(var94);
    java.awt.Component var96 = var0.getMostRecentFocusOwner();
    
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
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test348");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = var0.isVisible();
    net.sourceforge.schemaspy.ui.DbConfigPanel var7 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var7.requestFocus();
    var7.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var11 = var7.insets();
    float var12 = var7.getAlignmentX();
    net.sourceforge.schemaspy.ui.DbConfigPanel var13 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var13.requestFocus();
    var13.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var17 = var13.insets();
    var13.requestFocus();
    var13.setOpaque(false);
    javax.swing.plaf.PanelUI var21 = var13.getUI();
    var7.setUI(var21);
    var0.setUI(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.remove(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test349");


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
    java.lang.Object var22 = var9.getTreeLock();
    
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
    assertNotNull(var22);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test350");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    var0.setEncodeCommentsEnabled(true);
    var0.setRankDirBugEnabled(false);
    var0.setSqlFormatter("hi!");
    var0.setHost("");
    java.lang.String var11 = var0.getDescription();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Properties var13 = var0.determineDbProperties("DbSpecificOption name: 'net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s' value: 'null' description: 'a'");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test351");


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
    boolean var25 = var0.isDisplayable();
    var0.setFocusCycleRoot(false);
    
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

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test352");


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
    javax.swing.JRootPane var13 = var0.getRootPane();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test353");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    java.lang.String var4 = var0.getPassword();
    var0.setHighQuality(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test354");


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
    var0.enableInputMethods(false);
    var0.setDebugGraphicsOptions(23);
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var27 = var23.insets();
    var23.setAlignmentX(1.0f);
    boolean var30 = var23.hasFocus();
    boolean var31 = var23.getFocusTraversalKeysEnabled();
    boolean var32 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var23);
    var23.firePropertyChange("hi!", 'a', 'a');
    java.lang.String var37 = var23.getUIClassID();
    var23.repaint();
    java.awt.Dimension var39 = var23.preferredSize();
    var0.setMaximumSize(var39);
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "PanelUI"+ "'", var37.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test355");


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
    var0.setTitle("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
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

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test356");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    java.lang.String var10 = var9.getDefinition();
    net.sourceforge.schemaspy.model.Routine var20 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var21 = var20.getDataAccess();
    java.lang.String var22 = var20.getDefinitionLanguage();
    int var23 = var9.compareTo(var20);
    java.util.List var24 = var9.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var25 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var24);
    net.sourceforge.schemaspy.view.WriteStats var26 = new net.sourceforge.schemaspy.view.WriteStats(var25);
    int var27 = var26.getNumViewsWritten();
    
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
    assertTrue(var27 == 0);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test357");


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
    var0.setUndecorated(true);
    
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

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test358");


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
    var0.firePropertyChange("schemaSpy.css", 0, 0);
    
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

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test359");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    boolean var2 = var0.isSchemaDisabled();
    var0.setConnectionProperties("");
    java.lang.String var5 = var0.getCatalog();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test360");


    net.sourceforge.schemaspy.SchemaAnalyzer var0 = new net.sourceforge.schemaspy.SchemaAnalyzer();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    var1.setDb("a");
    java.lang.String var4 = var1.getServer();
    boolean var5 = var1.isHtmlGenerationEnabled();
    boolean var6 = var1.isMeterEnabled();
    net.sourceforge.schemaspy.model.Database var7 = var0.analyze(var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setTableExclusions("{}");
      fail("Expected exception of type java.util.regex.PatternSyntaxException");
    } catch (java.util.regex.PatternSyntaxException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test361");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    boolean var8 = var0.isEncodeCommentsEnabled();
    var0.setTableInclusions("Unknown");
    var0.setConnectionProperties("hi!s");
    var0.setHasOrphans(false);
    java.util.logging.Level var15 = var0.getLogLevel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test362");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("hi!s");
    var0.setHighQuality(true);
    boolean var7 = var0.requiresGdRenderer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test363");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.List var2 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var1);
    java.util.Set var3 = var1.keySet();
    java.lang.Object var4 = var1.clone();
    java.util.Collection var5 = var1.values();
    java.util.List var6 = net.sourceforge.schemaspy.DbAnalyzer.getTablesWithIncrementingColumnNames(var5);
    java.util.List var7 = net.sourceforge.schemaspy.DbAnalyzer.sortColumnsByTable(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test364");


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

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test365");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    java.util.Locale var2 = var0.getLocale();
    net.sourceforge.schemaspy.ui.DbConfigPanel var3 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var3.requestFocus();
    var3.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var7 = var3.insets();
    var3.requestFocus();
    var3.doLayout();
    var3.firePropertyChange("hi!", 0.0d, 10.0d);
    java.awt.Component var14 = var3.getNextFocusableComponent();
    net.sourceforge.schemaspy.ui.DbConfigPanel var15 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var15.requestFocus();
    var15.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var19 = var15.insets();
    var15.setAlignmentX(1.0f);
    boolean var22 = var15.hasFocus();
    boolean var23 = var15.getFocusTraversalKeysEnabled();
    var15.setSize(1, (-1));
    boolean var28 = var15.requestFocus(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var29 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var29.requestFocus();
    java.beans.PropertyChangeListener[] var31 = var29.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var32 = var29.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var33 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var33.requestFocus();
    var33.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var37 = var33.insets();
    var33.setAlignmentX(1.0f);
    var33.doLayout();
    boolean var41 = var33.isCursorSet();
    var33.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var46 = var33.getLocation();
    boolean var47 = var29.contains(var46);
    java.awt.Point var48 = var15.getLocation(var46);
    java.awt.ComponentOrientation var49 = var15.getComponentOrientation();
    var3.setComponentOrientation(var49);
    net.sourceforge.schemaspy.ui.DbConfigPanel var51 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var51.requestFocus();
    var51.setFocusTraversalPolicyProvider(true);
    var51.firePropertyChange("a", (byte)10, (byte)0);
    var51.setIgnoreRepaint(true);
    java.awt.Point var61 = var51.getMousePosition();
    var51.setDoubleBuffered(true);
    net.sourceforge.schemaspy.ui.DbConfigPanel var64 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var64.requestFocus();
    var64.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var68 = var64.insets();
    var64.setAlignmentX(1.0f);
    boolean var71 = var64.hasFocus();
    boolean var72 = var64.getFocusTraversalKeysEnabled();
    boolean var73 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var64);
    net.sourceforge.schemaspy.ui.DbConfigPanel var74 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var75 = var74.isManagingFocus();
    java.awt.Rectangle var76 = var74.getVisibleRect();
    java.awt.Rectangle var77 = var64.getBounds(var76);
    java.awt.Dimension var78 = var64.getPreferredSize();
    java.awt.Dimension var79 = var51.getSize(var78);
    var3.setMaximumSize(var78);
    var0.setSize(var78);
    var0.setBounds(11, 0, 0, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test366");


    net.sourceforge.schemaspy.util.DbSpecificConfig var1 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    net.sourceforge.schemaspy.Config var2 = var1.getConfig();
    net.sourceforge.schemaspy.Config var3 = var1.getConfig();
    var3.setIndirectColumnExclusions("ISO-8859-1s");
    var3.setSchema("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test367");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.setOpaque(false);
    var0.enable();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    var9.setAlignmentX(1.0f);
    boolean var16 = var9.hasFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var17 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var17.requestFocus();
    var17.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var21 = var17.insets();
    float var22 = var17.getAlignmentX();
    var17.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var28 = var17.getMouseListeners();
    boolean var29 = var9.isAncestorOf((java.awt.Component)var17);
    javax.swing.TransferHandler var30 = var17.getTransferHandler();
    var0.setComponentZOrder((java.awt.Component)var17, 1);
    java.beans.PropertyChangeListener[] var34 = var17.getPropertyChangeListeners("hi!s{hi!s}hi!s.ISO-8859-1.net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test368");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.isHighQuality();
    var0.setGraphvizDir("{}");
    boolean var8 = var0.isEncodeCommentsEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test369");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    boolean var6 = var0.isVisible();
    java.awt.Dimension var7 = var0.preferredSize();
    java.awt.Cursor var8 = var0.getCursor();
    var0.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test370");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    boolean var5 = var0.isHighQuality();
    var0.setHasOrphans(false);
    var0.setGraphvizDir(" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test371");


    net.sourceforge.schemaspy.model.ConnectionFailure var1 = new net.sourceforge.schemaspy.model.ConnectionFailure("ora");

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test372");


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
    java.lang.String var18 = var0.getWarningString();
    var0.setFocusCycleRoot(false);
    
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
    assertNull(var18);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test373");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    var0.setOutputDir("hi!");
    net.sourceforge.schemaspy.Config var7 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var8 = var7.getTableExclusions();
    var7.setSqlFormatter("hi!");
    net.sourceforge.schemaspy.view.DefaultSqlFormatter var11 = new net.sourceforge.schemaspy.view.DefaultSqlFormatter();
    var7.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var11);
    var0.setSqlFormatter((net.sourceforge.schemaspy.view.SqlFormatter)var11);
    var0.setDbType("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");
    var0.setNumRowsEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test374");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    java.awt.Point var3 = var0.getMousePosition();
    java.awt.Graphics var4 = var0.getGraphics();
    net.sourceforge.schemaspy.ui.DbConfigPanel var5 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var5.requestFocus();
    var5.setFocusTraversalPolicyProvider(true);
    var5.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var13 = var5.insets();
    var5.setAlignmentY(100.0f);
    java.lang.Object var16 = var5.getTreeLock();
    net.sourceforge.schemaspy.ui.MainFrame var17 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var18 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var18.requestFocus();
    var18.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var22 = var18.insets();
    var18.setAlignmentX(1.0f);
    java.awt.Color var25 = var18.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var26 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var26.requestFocus();
    var26.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var30 = var26.insets();
    float var31 = var26.getAlignmentX();
    var26.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var37 = var26.getMouseListeners();
    java.awt.Rectangle var38 = var26.bounds();
    var18.setBounds(var38);
    var17.setMaximizedBounds(var38);
    java.util.List var41 = var17.getIconImages();
    java.awt.Rectangle var42 = var17.getMaximizedBounds();
    java.awt.Rectangle var43 = var5.getBounds(var42);
    var0.scrollRectToVisible(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test375");


    net.sourceforge.schemaspy.SchemaAnalyzer var0 = new net.sourceforge.schemaspy.SchemaAnalyzer();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    var1.setDb("a");
    java.lang.String var4 = var1.getServer();
    boolean var5 = var1.isDbHelpRequired();
    var1.setCharset("dot version 2.2.1 or versions greater than 2.4");
    var1.setGraphvizDir("DbSpecificOption name: 'net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s' value: 'null' description: 'a'");
    net.sourceforge.schemaspy.model.Database var10 = var0.analyze(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test376");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    java.io.Writer var5 = var3.append((java.lang.CharSequence)"net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    var3.write("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test377");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var1 = var0.getType();
    var0.hide();
    var0.firePropertyChange("schemaSpy.css", '4', '#');
    var0.repaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test378");


    net.sourceforge.schemaspy.view.StyleSheet.ParseException var1 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test379");


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
    java.util.List var25 = net.sourceforge.schemaspy.DbAnalyzer.getOrphans((java.util.Collection)var24);
    
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

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test380");


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
    java.awt.Container var16 = var3.getTopLevelAncestor();
    var3.setOpaque(false);
    java.beans.VetoableChangeListener[] var19 = var3.getVetoableChangeListeners();
    javax.swing.event.AncestorListener[] var20 = var3.getAncestorListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test381");


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
    var0.setFocusCycleRoot(false);
    var0.setFocusableWindowState(false);
    
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

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test382");


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
    var0.removeAll();
    
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

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test383");


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
    int var36 = var0.getState();
    var0.setResizable(true);
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
    assertTrue(var36 == 0);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test384");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    var0.setTableInclusions("");
    var0.setRailsEnabled(false);
    boolean var12 = var0.isSingleSignOn();
    var0.setViewsEnabled(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test385");


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
    int var13 = var0.getY();
    boolean var14 = var0.isPaintingForPrint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test386");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    boolean var8 = var0.isEncodeCommentsEnabled();
    boolean var9 = var0.isRankDirBugEnabled();
    var0.setHasOrphans(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test387");


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
    java.util.List var14 = var9.getOptions();
    java.lang.String var15 = var9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "java.io.FileNotFoundException:  (No such file or directory)"+ "'", var15.equals("java.io.FileNotFoundException:  (No such file or directory)"));

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test388");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    int var2 = var0.findColumn("a");
    net.sourceforge.schemaspy.util.DbSpecificConfig var4 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setDbSpecificConfig(var4);
    javax.swing.event.TableModelListener[] var6 = var0.getTableModelListeners();
    int var7 = var0.getColumnCount();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var8 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var8.fireTableStructureChanged();
    java.lang.Class var11 = var8.getClass(2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var12 = var0.<java.util.EventListener>getListeners(var11);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test389");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("a");
    boolean var5 = var0.exists();
    net.sourceforge.schemaspy.util.Version var6 = var0.getVersion();
    var0.setHighQuality(false);
    var0.setRenderer("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test390");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    java.util.regex.Pattern var5 = var0.getIndirectColumnExclusions();
    var0.setHost("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var0.getUser();
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test391");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    var0.setRankDirBugEnabled(true);
    var0.setHtmlGenerationEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test392");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setMaxDbThreads(1);
    var0.setNumRowsEnabled(false);
    var0.setEncodeCommentsEnabled(false);
    var0.setDescription("hi!s");
    int var9 = var0.getMaxDetailedTables();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 300);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test393");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine(" ", "net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", "", "net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. ", " ", false, "java.io.FileNotFoundException:  (No such file or directory)", "Password associated with user id", "ISO-8859-1s");

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test394");


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
    boolean var38 = var0.inside(1, (-1));
    
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
    assertTrue(var38 == false);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test395");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    var0.setEncodeCommentsEnabled(true);
    var0.setRankDirBugEnabled(false);
    var0.setSqlFormatter("hi!");
    var0.setRailsEnabled(true);
    boolean var11 = var0.isRailsEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test396");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    var0.setAlignmentY(100.0f);
    java.awt.Image var13 = var0.createImage(1, 1);
    java.awt.Dimension var14 = var0.getSize();
    var0.firePropertyChange("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'", 1.0f, 1.0f);
    var0.setRequestFocusEnabled(true);
    boolean var21 = var0.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test397");


    net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException var3 = new net.sourceforge.schemaspy.view.StyleSheet.MissingCssPropertyException("", "hi!");
    net.sourceforge.schemaspy.model.ConnectionFailure var4 = new net.sourceforge.schemaspy.model.ConnectionFailure("", (java.lang.Throwable)var3);
    net.sourceforge.schemaspy.model.ConnectionFailure var5 = new net.sourceforge.schemaspy.model.ConnectionFailure((java.lang.Throwable)var4);
    java.lang.Throwable[] var6 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test398");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    java.awt.LayoutManager var6 = var0.getLayout();
    var0.setExtendedState(431);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test399");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    int var2 = var0.findColumn("a");
    net.sourceforge.schemaspy.util.DbSpecificConfig var4 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var0.setDbSpecificConfig(var4);
    javax.swing.event.TableModelListener[] var6 = var0.getTableModelListeners();
    var0.fireTableRowsInserted(100, 100);
    var0.fireTableDataChanged();
    var0.fireTableStructureChanged();
    net.sourceforge.schemaspy.ui.DbConfigTableModel var12 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var12.fireTableRowsInserted(2, 1);
    java.lang.Class var17 = var12.getClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var18 = var0.<java.util.EventListener>getListeners(var17);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test400");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    java.lang.Integer var2 = var0.getPort();
    boolean var3 = var0.isOneOfMultipleSchemas();
    var0.setHighQuality(false);
    int var6 = var0.getMaxDetailedTables();
    java.util.Properties var7 = var0.getConnectionProperties();
    boolean var8 = var0.isSingleSignOn();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test401");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    boolean var5 = var0.isMeterEnabled();
    var0.setFontSize(10);
    java.lang.String var8 = var0.getSchema();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test402");


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
    java.awt.Component var14 = var0.getNextFocusableComponent();
    net.sourceforge.schemaspy.ui.DbConfigPanel var15 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var15.requestFocus();
    var15.setFocusTraversalPolicyProvider(true);
    java.awt.Point var20 = var15.getMousePosition(true);
    int var21 = var15.getComponentCount();
    int var22 = var15.getHeight();
    var15.setName("hi!s");
    java.awt.Color var25 = var15.getBackground();
    java.awt.Dimension var26 = var15.preferredSize();
    var0.setMinimumSize(var26);
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test403");


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
    var8.firePropertyChange("net.sourceforge.schemaspy.ui.MainFrame[frame1,0,23,500x312,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", 2, 0);
    
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

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test404");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    java.awt.Cursor var5 = var0.getCursor();
    var0.updateUI();
    javax.swing.JToolTip var7 = var0.createToolTip();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test405");


    net.sourceforge.schemaspy.view.StyleSheet.ParseException var1 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException("hi!s");
    net.sourceforge.schemaspy.view.StyleSheet.ParseException var2 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException((java.lang.Exception)var1);
    net.sourceforge.schemaspy.model.InvalidConfigurationException var4 = var2.setParamName("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");
    java.lang.String var5 = var4.getParamName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin"+ "'", var5.equals("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin"));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test406");


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
    boolean var81 = var0.isMaximumSizeSet();
    boolean var82 = var0.isFocusableWindow();
    java.awt.Image var83 = var0.getIconImage();
    
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
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test407");


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
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var24 = var23.isManagingFocus();
    int var25 = var23.getWidth();
    java.awt.Point var26 = var23.getMousePosition();
    boolean var29 = var23.contains(1, (-1));
    boolean var30 = var23.isValid();
    net.sourceforge.schemaspy.ui.MainFrame var31 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var32 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var33 = var32.getTableExclusions();
    boolean var34 = var32.isEvaluateAllEnabled();
    java.util.List var35 = var32.getColumnDetails();
    var31.setIconImages(var35);
    boolean var37 = var31.isAlwaysOnTop();
    var31.setFocusableWindowState(true);
    boolean var40 = var31.isFocusCycleRoot();
    java.awt.Graphics var41 = var31.getGraphics();
    boolean var42 = var31.isFocusCycleRoot();
    net.sourceforge.schemaspy.ui.MainFrame var43 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.ui.DbConfigPanel var44 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var44.requestFocus();
    var44.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var48 = var44.insets();
    var44.setAlignmentX(1.0f);
    java.awt.Color var51 = var44.getForeground();
    net.sourceforge.schemaspy.ui.DbConfigPanel var52 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var52.requestFocus();
    var52.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var56 = var52.insets();
    float var57 = var52.getAlignmentX();
    var52.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var63 = var52.getMouseListeners();
    java.awt.Rectangle var64 = var52.bounds();
    var44.setBounds(var64);
    var43.setMaximizedBounds(var64);
    java.awt.Container var67 = var43.getContentPane();
    boolean var68 = var43.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.MainFrame var69 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var70 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var71 = var70.getTableExclusions();
    boolean var72 = var70.isEvaluateAllEnabled();
    java.util.List var73 = var70.getColumnDetails();
    var69.setIconImages(var73);
    boolean var75 = var69.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var76 = var69.getModalExclusionType();
    var43.setModalExclusionType(var76);
    var43.setEnabled(true);
    javax.swing.JLayeredPane var80 = var43.getLayeredPane();
    var31.setLayeredPane(var80);
    boolean var82 = var23.isAncestorOf((java.awt.Component)var80);
    java.awt.GraphicsConfiguration var83 = var80.getGraphicsConfiguration();
    java.awt.event.HierarchyListener[] var84 = var80.getHierarchyListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var85 = var7.containsKey((java.lang.Object)var80);
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
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test408");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    boolean var4 = var0.requestFocusInWindow();
    java.awt.FocusTraversalPolicy var5 = var0.getFocusTraversalPolicy();
    java.awt.Insets var6 = var0.insets();
    java.awt.Color var7 = var0.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test409");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    java.lang.Integer var2 = var0.getPort();
    boolean var3 = var0.isOneOfMultipleSchemas();
    var0.setHighQuality(false);
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
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 300);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test410");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    var0.paintImmediately(1, 0, 0, (-1));
    java.awt.Dimension var10 = var0.size();
    float var11 = var0.getAlignmentY();
    boolean var12 = var0.isManagingFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test411");


    net.sourceforge.schemaspy.util.DbSpecificOption var3 = new net.sourceforge.schemaspy.util.DbSpecificOption("net.sourceforge.schemaspy.ui.MainFrame[frame1,0,23,500x312,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'", "/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");
    java.lang.String var4 = var3.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin"+ "'", var4.equals("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin"));

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test412");


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
    int var23 = var0.getExtendedState();
    net.sourceforge.schemaspy.util.DbSpecificOption var26 = new net.sourceforge.schemaspy.util.DbSpecificOption("", "ISO-8859-1");
    java.lang.String var27 = var26.toString();
    java.lang.String var28 = var26.getDescription();
    java.lang.Object var29 = var26.getValue();
    net.sourceforge.schemaspy.ui.MainFrame var30 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var31 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var32 = var31.getTableExclusions();
    boolean var33 = var31.isEvaluateAllEnabled();
    java.util.List var34 = var31.getColumnDetails();
    var30.setIconImages(var34);
    boolean var36 = var30.isAlwaysOnTop();
    var30.setFocusableWindowState(true);
    java.awt.Window[] var39 = var30.getOwnedWindows();
    java.awt.Component var40 = var30.getMostRecentFocusOwner();
    var26.setValue((java.lang.Object)var30);
    java.util.List var42 = var30.getIconImages();
    var0.setIconImages(var42);
    
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
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var27.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "ISO-8859-1"+ "'", var28.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test413");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    boolean var8 = var0.isEncodeCommentsEnabled();
    boolean var9 = var0.isRankDirBugEnabled();
    var0.setRankDirBugEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test414");


    net.sourceforge.schemaspy.util.DbSpecificOption var2 = new net.sourceforge.schemaspy.util.DbSpecificOption("", "ISO-8859-1");
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.getDescription();
    java.lang.String var5 = var2.getName();
    net.sourceforge.schemaspy.Config var6 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var7 = var6.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var17 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var18 = var17.getDataAccess();
    java.lang.String var19 = var17.getDefinitionLanguage();
    java.util.List var20 = var17.getParameters();
    var6.setColumnDetails(var20);
    var6.setPort((java.lang.Integer)0);
    var6.setDb("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    java.util.regex.Pattern var26 = var6.getIndirectColumnExclusions();
    java.util.logging.Level var27 = var6.getLogLevel();
    boolean var28 = var6.isDbHelpRequired();
    var6.setUser("ora");
    var2.setValue((java.lang.Object)var6);
    var6.setImpliedConstraintsEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var3.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "ISO-8859-1"+ "'", var4.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "a"+ "'", var19.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test415");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    var0.setTableInclusions("");
    var0.setEvaluateAllEnabled(false);
    java.lang.String var12 = var0.getDb();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setColumnDetails("hi!s");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "a"+ "'", var12.equals("a"));

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test416");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    java.awt.Component var6 = var0.getNextFocusableComponent();
    boolean var7 = var0.isBackgroundSet();
    java.awt.event.MouseWheelListener[] var8 = var0.getMouseWheelListeners();
    java.awt.Point var10 = var0.getMousePosition(true);
    var0.setBounds(1, 10, 312, (-1));
    boolean var16 = var0.getFocusTraversalKeysEnabled();
    
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
    assertTrue(var16 == true);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test417");


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
    net.sourceforge.schemaspy.ui.MainFrame var13 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var14 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var15 = var14.getTableExclusions();
    boolean var16 = var14.isEvaluateAllEnabled();
    java.util.List var17 = var14.getColumnDetails();
    var13.setIconImages(var17);
    boolean var19 = var13.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var20 = var13.getModalExclusionType();
    boolean var21 = var13.isAutoRequestFocus();
    boolean var22 = var13.isResizable();
    net.sourceforge.schemaspy.ui.MainFrame var23 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var24 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var25 = var24.getTableExclusions();
    boolean var26 = var24.isEvaluateAllEnabled();
    java.util.List var27 = var24.getColumnDetails();
    var23.setIconImages(var27);
    boolean var29 = var23.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var30 = var23.getModalExclusionType();
    boolean var31 = var23.isAutoRequestFocus();
    java.awt.Toolkit var32 = var23.getToolkit();
    net.sourceforge.schemaspy.ui.MainFrame var33 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var34 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var35 = var34.getTableExclusions();
    boolean var36 = var34.isEvaluateAllEnabled();
    java.util.List var37 = var34.getColumnDetails();
    var33.setIconImages(var37);
    boolean var39 = var33.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var40 = var33.getModalExclusionType();
    net.sourceforge.schemaspy.ui.DbConfigPanel var41 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var41.requestFocus();
    var41.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var45 = var41.insets();
    var41.setAlignmentX(1.0f);
    boolean var48 = var41.hasFocus();
    boolean var49 = var41.getFocusTraversalKeysEnabled();
    boolean var50 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var41);
    net.sourceforge.schemaspy.ui.DbConfigPanel var51 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var52 = var51.isManagingFocus();
    java.awt.Rectangle var53 = var51.getVisibleRect();
    java.awt.Rectangle var54 = var41.getBounds(var53);
    java.awt.Dimension var55 = var41.getPreferredSize();
    var33.setSize(var55);
    java.awt.im.InputContext var57 = var33.getInputContext();
    java.lang.String var58 = var33.getWarningString();
    net.sourceforge.schemaspy.ui.DbConfigPanel var59 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var59.requestFocus();
    var59.setFocusTraversalPolicyProvider(true);
    var59.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var67 = var59.insets();
    var59.setAlignmentY(100.0f);
    java.awt.Image var72 = var59.createImage(1, 1);
    java.awt.Dimension var73 = var59.getSize();
    var33.setSize(var73);
    java.awt.LayoutManager var75 = var33.getLayout();
    var23.setLayout(var75);
    var13.setLayout(var75);
    var0.setLayout(var75);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
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
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test418");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.setOpaque(false);
    var0.enable();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    var9.setAlignmentX(1.0f);
    boolean var16 = var9.hasFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var17 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var17.requestFocus();
    var17.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var21 = var17.insets();
    float var22 = var17.getAlignmentX();
    var17.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var28 = var17.getMouseListeners();
    boolean var29 = var9.isAncestorOf((java.awt.Component)var17);
    javax.swing.TransferHandler var30 = var17.getTransferHandler();
    var0.setComponentZOrder((java.awt.Component)var17, 1);
    net.sourceforge.schemaspy.ui.DbConfigPanel var33 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var33.requestFocus();
    var33.setFocusTraversalPolicyProvider(true);
    java.awt.Point var38 = var33.getMousePosition(true);
    int var39 = var33.getComponentCount();
    int var40 = var33.getHeight();
    var33.setName("hi!s");
    java.awt.Color var43 = var33.getBackground();
    var17.setBackground(var43);
    net.sourceforge.schemaspy.ui.DbConfigPanel var45 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var45.requestFocus();
    java.beans.PropertyChangeListener[] var47 = var45.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var48 = var45.getBaselineResizeBehavior();
    boolean var49 = var45.isDisplayable();
    net.sourceforge.schemaspy.ui.DbConfigPanel var50 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var50.requestFocus();
    var50.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var54 = var50.insets();
    var50.setAlignmentX(1.0f);
    net.sourceforge.schemaspy.ui.DbConfigPanel var57 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var57.requestFocus();
    var57.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var61 = var57.insets();
    float var62 = var57.getAlignmentX();
    var57.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var68 = var57.getBounds();
    java.awt.Rectangle var69 = var50.getBounds(var68);
    var45.scrollRectToVisible(var69);
    var17.computeVisibleRect(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test419");


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
    int var36 = var0.getState();
    net.sourceforge.schemaspy.ui.DbConfigPanel var37 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var37.requestFocus();
    var37.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var41 = var37.insets();
    var37.requestFocus();
    var37.setOpaque(false);
    var37.enableInputMethods(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var47 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var47.requestFocus();
    var47.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var51 = var47.insets();
    var47.setAlignmentX(1.0f);
    boolean var54 = var47.hasFocus();
    boolean var55 = var47.getFocusTraversalKeysEnabled();
    boolean var56 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var47);
    var47.firePropertyChange("hi!", 'a', 'a');
    net.sourceforge.schemaspy.ui.DbConfigPanel var61 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var62 = var61.isManagingFocus();
    int var63 = var61.getWidth();
    java.awt.Insets var64 = var61.insets();
    javax.accessibility.AccessibleContext var65 = var61.getAccessibleContext();
    boolean var68 = var61.inside(100, (-3));
    java.awt.Rectangle var69 = var61.getVisibleRect();
    var47.setBounds(var69);
    var37.paintImmediately(var69);
    var0.setMaximizedBounds(var69);
    
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
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test420");


    net.sourceforge.schemaspy.util.Inflection var2 = new net.sourceforge.schemaspy.util.Inflection("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. ", "java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test421");


    net.sourceforge.schemaspy.Config.MissingRequiredParameterException var2 = new net.sourceforge.schemaspy.Config.MissingRequiredParameterException("Unknown", false);
    net.sourceforge.schemaspy.model.ProcessExecutionException var3 = new net.sourceforge.schemaspy.model.ProcessExecutionException((java.lang.Throwable)var2);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test422");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Point var5 = var0.getMousePosition(true);
    int var6 = var0.getComponentCount();
    int var7 = var0.getHeight();
    var0.setName("hi!s");
    var0.setFocusTraversalPolicyProvider(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test423");


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
    var0.repaint((-1), 100, 23, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test424");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    boolean var7 = var0.hasFocus();
    java.awt.Point var8 = var0.getMousePosition();
    java.beans.PropertyChangeListener[] var9 = var0.getPropertyChangeListeners();
    var0.transferFocusDownCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test425");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    java.util.Locale var2 = var0.getLocale();
    java.awt.Dimension var3 = var0.getSize();
    java.awt.Toolkit var4 = var0.getToolkit();
    java.awt.Component var5 = var0.getFocusOwner();
    var0.setAlwaysOnTop(false);
    
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

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test426");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("a");
    boolean var5 = var0.exists();
    net.sourceforge.schemaspy.util.Version var6 = var0.getVersion();
    java.lang.String var7 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test427");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    javax.swing.event.AncestorListener[] var4 = var0.getAncestorListeners();
    javax.swing.event.AncestorListener[] var5 = var0.getAncestorListeners();
    boolean var6 = var0.isOptimizedDrawingEnabled();
    var0.setRequestFocusEnabled(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test428");


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
    var0.resize(2, 0);
    var0.removeAll();
    var0.reshape(11, 3, 5, 300);
    
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

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test429");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.util.Set var3 = net.sourceforge.schemaspy.Config.getBuiltInDatabaseTypes("schemaSpy.css");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setFocusTraversalKeys((-1), var3);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test430");


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
    var0.firePropertyChange("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin", 100.0d, 10.0d);
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

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test431");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    boolean var10 = var9.isDeterministic();
    java.lang.String var11 = var9.getName();
    java.util.List var12 = var9.getParameters();
    java.lang.String var13 = var9.getDataAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test432");


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
    javax.swing.JComponent.setDefaultLocale(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test433");


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
    int var67 = var0.getY();
    
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
    assertTrue(var67 == 23);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test434");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(10, (-3));
    var0.fireTableCellUpdated(10, 3);
    var0.fireTableRowsUpdated(312, 5);
    var0.fireTableDataChanged();

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test435");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var5 = var0.getMaxDbThreads();
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test436");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    float var8 = var0.getAlignmentX();
    boolean var9 = var0.isOpaque();
    var0.grabFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test437");


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
    boolean var39 = var0.isFocusableWindow();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test438");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    var0.paintImmediately(0, (-1), (-1), 0);
    boolean var8 = var0.isForegroundSet();
    java.awt.event.ContainerListener[] var9 = var0.getContainerListeners();
    java.awt.Color var10 = var0.getForeground();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test439");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    var0.addNotify();
    int var4 = var0.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test440");


    net.sourceforge.schemaspy.util.DbSpecificConfig var1 = new net.sourceforge.schemaspy.util.DbSpecificConfig("Helvetica");

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test441");


    net.sourceforge.schemaspy.Config.MissingRequiredParameterException var2 = new net.sourceforge.schemaspy.Config.MissingRequiredParameterException("SchemaSpy", true);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test442");


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
    java.awt.event.ComponentListener[] var30 = var22.getComponentListeners();
    boolean var31 = var22.isOptimizedDrawingEnabled();
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test443");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    boolean var10 = var9.isDeterministic();
    java.lang.String var11 = var9.getSecurityType();
    java.lang.String var12 = var9.getDefinitionLanguage();
    java.lang.String var13 = var9.getDefinitionLanguage();
    java.lang.String var14 = var9.getComment();
    java.lang.String var15 = var9.getDefinition();
    java.lang.String var16 = var9.getType();
    java.lang.String var17 = var9.getType();
    java.lang.String var18 = var9.getName();
    java.lang.String var19 = var9.getDefinition();
    
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

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test444");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    boolean var8 = var0.contains(1, (-1));
    var0.transferFocus();
    var0.removeAll();
    var0.repaint(1L, (-3), (-3), (-1), 1);
    var0.updateUI();
    var0.setAutoscrolls(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var20 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var20.requestFocus();
    var20.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var24 = var20.insets();
    var20.setAlignmentX(1.0f);
    var20.doLayout();
    boolean var28 = var20.isCursorSet();
    java.awt.event.HierarchyListener[] var29 = var20.getHierarchyListeners();
    var20.setFocusTraversalPolicyProvider(false);
    boolean var32 = var20.isBackgroundSet();
    int var33 = var20.getY();
    net.sourceforge.schemaspy.ui.DbConfigPanel var34 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var34.requestFocus();
    var34.setFocusTraversalPolicyProvider(true);
    boolean var38 = var34.requestFocusInWindow();
    java.awt.Dimension var39 = var34.getMaximumSize();
    net.sourceforge.schemaspy.ui.DbConfigPanel var40 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var40.requestFocus();
    var40.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var44 = var40.insets();
    var40.setAlignmentX(1.0f);
    boolean var47 = var40.hasFocus();
    boolean var48 = var40.getFocusTraversalKeysEnabled();
    boolean var49 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var40);
    net.sourceforge.schemaspy.ui.DbConfigPanel var50 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var50.requestFocus();
    var50.setFocusTraversalPolicyProvider(true);
    java.awt.Point var55 = var50.getMousePosition(true);
    int var56 = var50.getComponentCount();
    int var57 = var50.getHeight();
    net.sourceforge.schemaspy.ui.DbConfigPanel var58 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var58.requestFocus();
    java.beans.PropertyChangeListener[] var60 = var58.getPropertyChangeListeners();
    var58.paintImmediately(0, (-1), (-1), 0);
    java.awt.Font var66 = var58.getFont();
    java.awt.FontMetrics var67 = var50.getFontMetrics(var66);
    java.awt.FontMetrics var68 = var40.getFontMetrics(var66);
    java.awt.FontMetrics var69 = var34.getFontMetrics(var66);
    var20.setFont(var66);
    var0.setFont(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test445");


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
    java.awt.Insets var14 = var10.insets();
    float var15 = var10.getAlignmentX();
    var10.setBounds(0, 1, 10, 100);
    java.awt.Rectangle var21 = var10.getBounds();
    var0.scrollRectToVisible(var21);
    javax.swing.JRootPane var23 = var0.getRootPane();
    boolean var25 = var0.areFocusTraversalKeysSet(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test446");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var7 = var0.getTableModelListeners();
    var0.fireTableRowsUpdated(0, 3);
    var0.fireTableStructureChanged();
    var0.fireTableDataChanged();
    var0.fireTableRowsInserted(11, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test447");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var1.clear();
    java.util.List var3 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var1);
    java.util.Set var4 = var1.entrySet();
    java.util.Set var5 = var1.entrySet();
    java.util.List var6 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test448");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.beans.PropertyChangeListener[] var2 = var0.getPropertyChangeListeners();
    var0.paintImmediately(0, (-1), (-1), 0);
    boolean var8 = var0.isForegroundSet();
    boolean var9 = var0.isVisible();
    java.awt.Dimension var10 = var0.getMaximumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test449");


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
    var0.setFocusableWindowState(true);
    float var67 = var0.getOpacity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.createBufferStrategy(23);
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
    assertTrue(var67 == 1.0f);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test450");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsUpdated(312, 312);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test451");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    float var5 = var0.getAlignmentX();
    boolean var8 = var0.contains(1, (-1));
    var0.transferFocus();
    var0.removeAll();
    var0.repaint(1L, (-3), (-3), (-1), 1);
    var0.updateUI();
    var0.firePropertyChange("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)", (-1.0d), 0.0d);
    java.awt.Component var24 = var0.findComponentAt((-3), (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test452");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    java.util.Set var2 = var1.entrySet();
    java.lang.Object var3 = var1.clone();
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{}"+ "'", var4.equals("{}"));

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test453");


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
    var0.nextFocus();
    var0.transferFocusUpCycle();
    
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

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test454");


    java.lang.String var1 = net.sourceforge.schemaspy.util.HtmlEncoder.encodeString("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi!"+ "'", var1.equals("hi!"));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test455");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var10 = var9.getDataAccess();
    java.lang.String var11 = var9.getDefinitionLanguage();
    java.util.List var12 = var9.getParameters();
    java.lang.String var13 = var9.getReturnType();
    java.lang.String var14 = var9.getReturnType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "a"+ "'", var11.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "a"+ "'", var14.equals("a"));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test456");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.firePropertyChange("ISO-8859-1", 0L, (-1L));
    java.awt.Color var6 = var0.getBackground();
    var0.requestFocus();
    boolean var9 = var0.areFocusTraversalKeysSet(1);
    boolean var10 = var0.isFocusCycleRoot();
    var0.firePropertyChange("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin", (byte)100, (byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test457");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var11 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var12 = var11.getDataAccess();
    java.lang.String var13 = var11.getDefinitionLanguage();
    java.util.List var14 = var11.getParameters();
    var0.setColumnDetails(var14);
    java.util.List var16 = net.sourceforge.schemaspy.DbAnalyzer.sortColumnsByTable(var14);
    java.lang.String var17 = net.sourceforge.schemaspy.model.ForeignKeyConstraint.toString(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "a"+ "'", var13.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[]"+ "'", var17.equals("[]"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test458");


    net.sourceforge.schemaspy.util.DbSpecificConfig var1 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s");

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test459");


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
    boolean var37 = var12.isLocationByPlatform();
    net.sourceforge.schemaspy.ui.MainFrame var38 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var39 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var40 = var39.getTableExclusions();
    boolean var41 = var39.isEvaluateAllEnabled();
    java.util.List var42 = var39.getColumnDetails();
    var38.setIconImages(var42);
    boolean var44 = var38.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var45 = var38.getModalExclusionType();
    var12.setModalExclusionType(var45);
    var12.setEnabled(true);
    javax.swing.JLayeredPane var49 = var12.getLayeredPane();
    var0.setLayeredPane(var49);
    boolean var51 = var0.isResizable();
    var0.setTitle("{}s");
    net.sourceforge.schemaspy.ui.DbConfigPanel var54 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var54.requestFocus();
    var54.setFocusTraversalPolicyProvider(true);
    boolean var58 = var54.isDoubleBuffered();
    boolean var59 = var54.isValid();
    var54.repaint(1L);
    var54.transferFocusUpCycle();
    var0.remove((java.awt.Component)var54);
    
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
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test460");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.setOpaque(false);
    var0.invalidate();
    java.awt.event.KeyListener[] var9 = var0.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var10 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var10.requestFocus();
    var10.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var14 = var10.insets();
    var10.requestFocus();
    var10.doLayout();
    var10.firePropertyChange("hi!", 0.0d, 10.0d);
    java.awt.Component var21 = var10.getNextFocusableComponent();
    java.awt.Rectangle var22 = var10.bounds();
    net.sourceforge.schemaspy.ui.DbConfigPanel var23 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var23.requestFocus();
    var23.setFocusTraversalPolicyProvider(true);
    boolean var27 = var23.requestFocusInWindow();
    net.sourceforge.schemaspy.ui.DbConfigPanel var28 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var28.requestFocus();
    java.beans.PropertyChangeListener[] var30 = var28.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var31 = var28.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var32 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var32.requestFocus();
    var32.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var36 = var32.insets();
    var32.setAlignmentX(1.0f);
    var32.doLayout();
    boolean var40 = var32.isCursorSet();
    var32.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var45 = var32.getLocation();
    boolean var46 = var28.contains(var45);
    java.awt.Component var47 = var23.findComponentAt(var45);
    java.awt.Component var48 = var10.findComponentAt(var45);
    java.awt.Point var49 = var0.getLocation(var45);
    boolean var50 = var0.isForegroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test461");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("hi!s");
    var0.setFormat(".hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s.hi!s{hi!s}hi!s");
    java.lang.String var7 = var0.getFormat();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ".hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s.hi!s{hi!s}hi!s"+ "'", var7.equals(".hi!sdhi!sohi!sthi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!s hi!s2hi!s.hi!s2hi!s.hi!s1hi!s hi!sohi!srhi!s hi!svhi!sehi!srhi!sshi!sihi!sohi!snhi!sshi!s hi!sghi!srhi!sehi!sahi!sthi!sehi!srhi!s hi!sthi!shhi!sahi!snhi!s hi!s2hi!s.hi!s4hi!s.hi!s{hi!s}hi!s"));

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test462");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var1.clear();
    java.util.List var3 = net.sourceforge.schemaspy.DbAnalyzer.getRailsConstraints((java.util.Map)var1);
    var1.clear();
    java.lang.Object var5 = var1.clone();
    java.lang.String var6 = var1.toString();
    int var7 = var1.size();
    var1.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "{}"+ "'", var6.equals("{}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test463");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var1 = var0.getTableExclusions();
    boolean var2 = var0.isEvaluateAllEnabled();
    java.lang.String var4 = var0.getParam("hi!s");
    var0.setServer("ISO-8859-1");
    boolean var7 = var0.isHelpRequired();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var0.getUser();
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test464");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.setAlignmentX(1.0f);
    var0.firePropertyChange("hi!", 10, 2);
    var0.paintImmediately(100, 10, 2, 0);
    boolean var16 = var0.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test465");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    boolean var10 = var9.isDeterministic();
    java.lang.String var11 = var9.getName();
    java.lang.String var12 = var9.getDefinitionLanguage();
    java.lang.String var13 = var9.getName();
    java.lang.String var14 = var9.getSecurityType();
    java.lang.String var15 = var9.getDataAccess();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test466");


    net.sourceforge.schemaspy.view.StyleSheet.ParseException var1 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    net.sourceforge.schemaspy.view.StyleSheet.ParseException var2 = new net.sourceforge.schemaspy.view.StyleSheet.ParseException((java.lang.Exception)var1);
    net.sourceforge.schemaspy.model.InvalidConfigurationException var4 = var2.setParamName("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    java.lang.String var5 = var4.getParamName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var5,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"+ "'", var5.equals("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var5,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)"));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test467");


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
    boolean var24 = var0.hasFocus();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test468");


    net.sourceforge.schemaspy.model.Routine var9 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    boolean var10 = var9.isDeterministic();
    java.lang.String var11 = var9.getSecurityType();
    java.lang.String var12 = var9.getDefinitionLanguage();
    java.lang.String var13 = var9.getDefinitionLanguage();
    java.lang.String var14 = var9.getReturnType();
    net.sourceforge.schemaspy.model.Routine var24 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var25 = var24.getDataAccess();
    java.lang.String var26 = var24.getDefinitionLanguage();
    net.sourceforge.schemaspy.model.Routine var36 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var37 = var36.getDataAccess();
    java.lang.String var38 = var36.getComment();
    int var39 = var24.compareTo(var36);
    net.sourceforge.schemaspy.model.Routine var49 = new net.sourceforge.schemaspy.model.Routine("", "hi!", "a", "", "", false, "", "hi!", "");
    int var50 = var24.compareTo(var49);
    int var51 = var9.compareTo(var49);
    java.lang.String var52 = var49.getReturnType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "a"+ "'", var14.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "a"+ "'", var26.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "a"+ "'", var38.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "a"+ "'", var52.equals("a"));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test469");


    java.lang.String[] var1 = new java.lang.String[] { "net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"};
    net.sourceforge.schemaspy.Config var2 = new net.sourceforge.schemaspy.Config(var1);
    net.sourceforge.schemaspy.Config var3 = new net.sourceforge.schemaspy.Config(var1);
    java.util.regex.Pattern var4 = var3.getTableInclusions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test470");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    java.awt.Component var2 = var0.getNextFocusableComponent();
    java.lang.String var3 = var0.toString();
    javax.swing.TransferHandler var4 = var0.getTransferHandler();
    var0.paintImmediately((-3), 5, 0, 5);
    java.beans.PropertyChangeListener[] var11 = var0.getPropertyChangeListeners("java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var3,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"+ "'", var3.equals("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0var3,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test471");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setMaxDbThreads(1);
    var0.setNumRowsEnabled(false);
    boolean var5 = var0.isViewsEnabled();
    java.util.regex.Pattern var6 = var0.getColumnExclusions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test472");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    java.lang.String var4 = var0.getSchemaSpec();
    java.util.regex.Pattern var5 = var0.getIndirectColumnExclusions();
    net.sourceforge.schemaspy.Config var6 = new net.sourceforge.schemaspy.Config();
    boolean var7 = var6.isImpliedConstraintsEnabled();
    var6.setHasOrphans(false);
    java.lang.String var10 = var6.getSchemaSpec();
    boolean var11 = var6.isHighQuality();
    int var12 = var6.getMaxDetailedTables();
    java.lang.String var13 = var6.getRenderer();
    java.util.Properties var14 = var6.getConnectionProperties();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.ConnectionURLBuilder var15 = new net.sourceforge.schemaspy.util.ConnectionURLBuilder(var0, var14);
      fail("Expected exception of type net.sourceforge.schemaspy.model.InvalidConfigurationException");
    } catch (net.sourceforge.schemaspy.model.InvalidConfigurationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 300);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test473");


    net.sourceforge.schemaspy.util.DbSpecificConfig var1 = new net.sourceforge.schemaspy.util.DbSpecificConfig("net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory).hi!. ");
    net.sourceforge.schemaspy.Config var2 = var1.getConfig();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test474");


    net.sourceforge.schemaspy.MultipleSchemaAnalyzer var0 = net.sourceforge.schemaspy.MultipleSchemaAnalyzer.getInstance();
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
    java.util.List var26 = var2.getIconImages();
    net.sourceforge.schemaspy.TableOrderer var27 = new net.sourceforge.schemaspy.TableOrderer();
    net.sourceforge.schemaspy.model.Routine var37 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var38 = var37.getDataAccess();
    java.util.List var39 = var37.getParameters();
    net.sourceforge.schemaspy.view.WriteStats var40 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var39);
    java.util.List var41 = net.sourceforge.schemaspy.DbAnalyzer.getMustBeUniqueNullableColumns((java.util.Collection)var39);
    java.lang.String var42 = net.sourceforge.schemaspy.model.ForeignKeyConstraint.toString(var41);
    net.sourceforge.schemaspy.view.WriteStats var43 = new net.sourceforge.schemaspy.view.WriteStats((java.util.Collection)var41);
    java.util.List var44 = net.sourceforge.schemaspy.DbAnalyzer.sortTablesByName(var41);
    net.sourceforge.schemaspy.model.Routine var54 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var55 = var54.getDataAccess();
    java.util.List var56 = var54.getParameters();
    java.util.List var57 = var27.getTablesOrderedByRI((java.util.Collection)var44, (java.util.Collection)var56);
    net.sourceforge.schemaspy.Config var58 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var59 = var58.getTableExclusions();
    java.lang.String var60 = var58.getCharset();
    var58.setRailsEnabled(false);
    java.lang.Integer var63 = var58.getPort();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.analyze("hi!s", var26, var44, var58);
      fail("Expected exception of type net.sourceforge.schemaspy.Config.MissingRequiredParameterException");
    } catch (net.sourceforge.schemaspy.Config.MissingRequiredParameterException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
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
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "[]"+ "'", var42.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "ISO-8859-1"+ "'", var60.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test475");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("ISO-8859-1");
    int var2 = var1.getSize();
    java.lang.Object var3 = var1.getSelectedItem();
    int var4 = var1.getSize();
    int var5 = var1.getSize();
    javax.swing.event.ListDataListener[] var6 = var1.getListDataListeners();
    javax.swing.event.ListDataListener[] var7 = var1.getListDataListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test476");


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
    var1.move(10, (-1));
    
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

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test477");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.List var6 = net.sourceforge.schemaspy.DbAnalyzer.getDefaultNullStringColumns((java.util.Collection)var4);
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

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test478");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Object var6 = var0.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var7 = var0.getTableModelListeners();
    var0.fireTableRowsUpdated(0, 3);
    javax.swing.event.TableModelListener[] var11 = var0.getTableModelListeners();
    var0.fireTableCellUpdated(0, 0);
    int var15 = var0.getRowCount();
    int var17 = var0.findColumn("/Users/Jesh/Documents/School/Summer 2015/Independent Study/Eclipse/workspace/36_schemaspy/bin");
    net.sourceforge.schemaspy.ui.DbConfigTableModel var18 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var18.fireTableRowsInserted(2, 1);
    java.lang.Object var24 = var18.getValueAt(0, 100);
    javax.swing.event.TableModelListener[] var25 = var18.getTableModelListeners();
    var18.fireTableRowsUpdated(0, 3);
    int var30 = var18.findColumn("net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    var18.fireTableRowsDeleted(11, 2);
    java.lang.Class var35 = var18.getClass(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.EventListener[] var36 = var0.<java.util.EventListener>getListeners(var35);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test479");


    net.sourceforge.schemaspy.ui.MainFrame var0 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var1 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var2 = var1.getTableExclusions();
    boolean var3 = var1.isEvaluateAllEnabled();
    java.util.List var4 = var1.getColumnDetails();
    var0.setIconImages(var4);
    java.awt.LayoutManager var6 = var0.getLayout();
    var0.setSize((-3), 431);
    net.sourceforge.schemaspy.ui.MainFrame var10 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var11 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var12 = var11.getTableExclusions();
    boolean var13 = var11.isEvaluateAllEnabled();
    java.util.List var14 = var11.getColumnDetails();
    var10.setIconImages(var14);
    java.awt.Toolkit var16 = var10.getToolkit();
    boolean var17 = var10.isFocused();
    boolean var18 = var10.isFocusCycleRoot();
    net.sourceforge.schemaspy.ui.MainFrame var19 = new net.sourceforge.schemaspy.ui.MainFrame();
    java.awt.Window.Type var20 = var19.getType();
    java.awt.Window var21 = var19.getOwner();
    var19.repaint((-3), 2, (-1), 100);
    net.sourceforge.schemaspy.ui.DbConfigPanel var27 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var27.requestFocus();
    var27.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var31 = var27.insets();
    var27.setAlignmentX(1.0f);
    java.awt.Color var34 = var27.getForeground();
    int var35 = var27.getWidth();
    net.sourceforge.schemaspy.ui.DbConfigPanel var36 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var36.requestFocus();
    var36.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var40 = var36.insets();
    var36.setAlignmentX(1.0f);
    boolean var43 = var36.hasFocus();
    var36.paintImmediately(10, 100, 2, 10);
    net.sourceforge.schemaspy.ui.DbConfigPanel var49 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var49.requestFocus();
    var49.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var53 = var49.insets();
    var49.setAlignmentX(1.0f);
    java.awt.Color var56 = var49.getForeground();
    javax.swing.InputVerifier var57 = var49.getInputVerifier();
    var49.repaint(100L, 10, 1, 0, 100);
    var49.setEnabled(false);
    net.sourceforge.schemaspy.ui.DbConfigPanel var66 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var66.requestFocus();
    java.beans.PropertyChangeListener[] var68 = var66.getPropertyChangeListeners();
    var66.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var74 = var66.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var75 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var75.requestFocus();
    var75.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var79 = var75.insets();
    var75.setAlignmentX(1.0f);
    java.awt.Color var82 = var75.getForeground();
    var66.setForeground(var82);
    var49.setBackground(var82);
    var36.remove((java.awt.Component)var49);
    java.awt.Dimension var86 = var36.getMinimumSize();
    var27.setSize(var86);
    var19.setMinimumSize(var86);
    var10.setSize(var86);
    var0.resize(var86);
    
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test480");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    boolean var1 = var0.isManagingFocus();
    int var2 = var0.getWidth();
    java.awt.Insets var3 = var0.insets();
    javax.accessibility.AccessibleContext var4 = var0.getAccessibleContext();
    boolean var7 = var0.inside(100, (-3));
    java.awt.Rectangle var8 = var0.getVisibleRect();
    java.awt.Point var9 = var0.getLocation();
    var0.removeNotify();
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
    var0.repaint(var31);
    net.sourceforge.schemaspy.ui.MainFrame var34 = new net.sourceforge.schemaspy.ui.MainFrame();
    net.sourceforge.schemaspy.Config var35 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var36 = var35.getTableExclusions();
    boolean var37 = var35.isEvaluateAllEnabled();
    java.util.List var38 = var35.getColumnDetails();
    var34.setIconImages(var38);
    boolean var40 = var34.isAlwaysOnTop();
    java.awt.Dialog.ModalExclusionType var41 = var34.getModalExclusionType();
    boolean var42 = var34.isAutoRequestFocus();
    boolean var43 = var34.isResizable();
    net.sourceforge.schemaspy.ui.DbConfigPanel var44 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var44.requestFocus();
    var44.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var48 = var44.insets();
    var44.setAlignmentX(1.0f);
    java.awt.Color var51 = var44.getForeground();
    var34.setForeground(var51);
    var0.setForeground(var51);
    net.sourceforge.schemaspy.ui.DbConfigPanel var54 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var54.requestFocus();
    var54.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var58 = var54.insets();
    var54.setAlignmentX(1.0f);
    boolean var61 = var54.hasFocus();
    boolean var62 = var54.getFocusTraversalKeysEnabled();
    boolean var63 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var54);
    var54.firePropertyChange("hi!", 'a', 'a');
    java.lang.String var68 = var54.getUIClassID();
    var54.repaint();
    java.awt.Dimension var70 = var54.preferredSize();
    java.awt.Dimension var71 = var54.minimumSize();
    var0.setMaximumSize(var71);
    
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
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "PanelUI"+ "'", var68.equals("PanelUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test481");


    net.sourceforge.schemaspy.ui.DbTypeSelectorModel var1 = new net.sourceforge.schemaspy.ui.DbTypeSelectorModel("ISO-8859-1");
    int var2 = var1.getSize();
    java.lang.Object var3 = var1.getSelectedItem();
    int var4 = var1.getSize();
    java.lang.String[] var6 = new java.lang.String[] { "net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"};
    net.sourceforge.schemaspy.Config var7 = new net.sourceforge.schemaspy.Config(var6);
    net.sourceforge.schemaspy.Config var8 = new net.sourceforge.schemaspy.Config(var6);
    net.sourceforge.schemaspy.Config var9 = new net.sourceforge.schemaspy.Config(var6);
    net.sourceforge.schemaspy.Config var10 = new net.sourceforge.schemaspy.Config(var6);
    var1.setSelectedItem((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test482");


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
    var0.resize((-1), 3);
    
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

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test483");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    var0.setSchemaSpec("hi!");
    var0.setHost("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    java.util.regex.Pattern var9 = var0.getTableInclusions();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test484");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("{}s", 431, "frame2");
      fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test485");


    net.sourceforge.schemaspy.ui.DbConfigTableModel var0 = new net.sourceforge.schemaspy.ui.DbConfigTableModel();
    var0.fireTableRowsInserted(2, 1);
    java.lang.Class var5 = var0.getClass(3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.getValueAt(5, (-1));
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test486");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isDbHelpRequired();
    var0.setCharset("dot version 2.2.1 or versions greater than 2.4");
    var0.setGraphvizDir("DbSpecificOption name: 'net.sourceforge.schemaspy.model.ProcessExecutionException: net.sourceforge.schemaspy.view.StyleSheet$ParseException: java.io.FileNotFoundException: net.sourceforge.schemaspy.ui.DbConfigPanel[,0,0,0x0,invalid,layout=java.awt.BorderLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=] (No such file or directory) hi!s' value: 'null' description: 'a'");
    var0.setTableExclusions("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test487");


    net.sourceforge.schemaspy.util.CaseInsensitiveMap var1 = new net.sourceforge.schemaspy.util.CaseInsensitiveMap(1);
    var1.clear();
    net.sourceforge.schemaspy.ui.DbConfigPanel var3 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var3.requestFocus();
    var3.setFocusTraversalPolicyProvider(true);
    java.awt.Point var8 = var3.getMousePosition(true);
    java.awt.Component var9 = var3.getNextFocusableComponent();
    java.awt.Dimension var10 = var3.getMinimumSize();
    boolean var11 = var1.containsValue((java.lang.Object)var3);
    java.util.Set var12 = var1.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test488");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    var0.setSchemaSpec("hi!");
    java.lang.String var7 = var0.getSchema();
    var0.setGraphvizDir("net.sourceforge.schemaspy.ui.MainFrame[frame0,0,23,500x431,invalid,hidden,layout=java.awt.BorderLayout,title=SchemaSpy,resizable,normal,defaultCloseOperation=HIDE_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test489");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var4 = var0.insets();
    var0.requestFocus();
    var0.setOpaque(false);
    var0.enable();
    net.sourceforge.schemaspy.ui.DbConfigPanel var9 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var9.requestFocus();
    var9.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var13 = var9.insets();
    var9.setAlignmentX(1.0f);
    boolean var16 = var9.hasFocus();
    net.sourceforge.schemaspy.ui.DbConfigPanel var17 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var17.requestFocus();
    var17.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var21 = var17.insets();
    float var22 = var17.getAlignmentX();
    var17.setBounds(0, 1, 10, 100);
    java.awt.event.MouseListener[] var28 = var17.getMouseListeners();
    boolean var29 = var9.isAncestorOf((java.awt.Component)var17);
    javax.swing.TransferHandler var30 = var17.getTransferHandler();
    var0.setComponentZOrder((java.awt.Component)var17, 1);
    var0.setDebugGraphicsOptions(312);
    net.sourceforge.schemaspy.ui.DbConfigPanel var35 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var35.requestFocus();
    java.beans.PropertyChangeListener[] var37 = var35.getPropertyChangeListeners();
    var35.paintImmediately(0, (-1), (-1), 0);
    java.awt.event.KeyListener[] var43 = var35.getKeyListeners();
    net.sourceforge.schemaspy.ui.DbConfigPanel var44 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var44.requestFocus();
    var44.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var48 = var44.insets();
    var44.setAlignmentX(1.0f);
    java.awt.Color var51 = var44.getForeground();
    var35.setForeground(var51);
    boolean var53 = var35.hasFocus();
    var35.enableInputMethods(false);
    java.awt.Component var56 = var0.add((java.awt.Component)var35);
    boolean var57 = var35.isFocusTraversable();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test490");


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
    java.awt.im.InputContext var27 = var0.getInputContext();
    boolean var28 = var0.isFocused();
    
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
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test491");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    var0.setDb("a");
    java.lang.String var3 = var0.getServer();
    boolean var4 = var0.isHtmlGenerationEnabled();
    java.lang.String var5 = var0.getSchemaSpec();
    var0.setViewsEnabled(false);
    var0.setHtmlGenerationEnabled(true);
    var0.setHasRoutines(false);
    java.lang.String var12 = var0.getRenderer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setColumnDetails("ISO-8859-1s");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test492");


    net.sourceforge.schemaspy.util.Dot var0 = net.sourceforge.schemaspy.util.Dot.getInstance();
    var0.setHighQuality(true);
    net.sourceforge.schemaspy.util.Dot.DotFailure var4 = var0.new DotFailure("hi!s");
    var0.setHighQuality(true);
    var0.setRenderer("java.io.FileNotFoundException:  (No such file or directory)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test493");


    net.sourceforge.schemaspy.ui.DbConfigPanel var0 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var0.requestFocus();
    var0.setFocusTraversalPolicyProvider(true);
    var0.firePropertyChange("a", (byte)10, (byte)0);
    java.awt.Insets var8 = var0.insets();
    var0.setAlignmentY(100.0f);
    java.awt.Image var13 = var0.createImage(1, 1);
    java.awt.Dimension var14 = var0.getSize();
    net.sourceforge.schemaspy.ui.DbConfigPanel var15 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var15.requestFocus();
    var15.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var19 = var15.insets();
    var15.setAlignmentX(1.0f);
    java.awt.Color var22 = var15.getForeground();
    javax.swing.InputVerifier var23 = var15.getInputVerifier();
    var15.repaint(100L, 10, 1, 0, 100);
    java.awt.Component.BaselineResizeBehavior var30 = var15.getBaselineResizeBehavior();
    java.util.Locale var31 = var15.getLocale();
    java.awt.Component var32 = var0.add((java.awt.Component)var15);
    float var33 = var0.getAlignmentX();
    net.sourceforge.schemaspy.ui.DbConfigPanel var34 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var34.requestFocus();
    var34.setFocusTraversalPolicyProvider(true);
    boolean var38 = var34.requestFocusInWindow();
    net.sourceforge.schemaspy.ui.DbConfigPanel var39 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var39.requestFocus();
    java.beans.PropertyChangeListener[] var41 = var39.getPropertyChangeListeners();
    java.awt.Component.BaselineResizeBehavior var42 = var39.getBaselineResizeBehavior();
    net.sourceforge.schemaspy.ui.DbConfigPanel var43 = new net.sourceforge.schemaspy.ui.DbConfigPanel();
    var43.requestFocus();
    var43.setFocusTraversalPolicyProvider(true);
    java.awt.Insets var47 = var43.insets();
    var43.setAlignmentX(1.0f);
    var43.doLayout();
    boolean var51 = var43.isCursorSet();
    var43.firePropertyChange("ISO-8859-1", '4', 'a');
    java.awt.Point var56 = var43.getLocation();
    boolean var57 = var39.contains(var56);
    java.awt.Component var58 = var34.findComponentAt(var56);
    java.awt.Component var59 = var0.findComponentAt(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test494");


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
    var0.hide();
    java.awt.Component var41 = var0.getComponentAt(100, 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test495");


    net.sourceforge.schemaspy.util.DbSpecificOption var2 = new net.sourceforge.schemaspy.util.DbSpecificOption("", "ISO-8859-1");
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.getDescription();
    java.lang.String var5 = var2.getName();
    net.sourceforge.schemaspy.Config var6 = new net.sourceforge.schemaspy.Config();
    java.util.regex.Pattern var7 = var6.getTableExclusions();
    net.sourceforge.schemaspy.model.Routine var17 = new net.sourceforge.schemaspy.model.Routine("", "", "a", "a", "a", true, "hi!", "hi!", "a");
    java.lang.String var18 = var17.getDataAccess();
    java.lang.String var19 = var17.getDefinitionLanguage();
    java.util.List var20 = var17.getParameters();
    var6.setColumnDetails(var20);
    var6.setPort((java.lang.Integer)0);
    var6.setDb("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    java.util.regex.Pattern var26 = var6.getIndirectColumnExclusions();
    java.util.logging.Level var27 = var6.getLogLevel();
    boolean var28 = var6.isDbHelpRequired();
    var6.setUser("ora");
    var2.setValue((java.lang.Object)var6);
    java.lang.String var32 = var6.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"+ "'", var3.equals("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "ISO-8859-1"+ "'", var4.equals("ISO-8859-1"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "a"+ "'", var19.equals("a"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test496");


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
    var0.nextFocus();
    java.awt.Container var39 = var0.getFocusCycleRootAncestor();
    
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
    assertNull(var39);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test497");


    net.sourceforge.schemaspy.Config var0 = new net.sourceforge.schemaspy.Config();
    boolean var1 = var0.isImpliedConstraintsEnabled();
    var0.setHasOrphans(false);
    var0.setImpliedConstraintsEnabled(true);
    var0.setSchema("DbSpecificOption name: '' value: 'null' description: 'ISO-8859-1'");
    var0.setHasRoutines(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test498");


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
    java.awt.Color var36 = var0.getBackground();
    boolean var37 = var0.isOpaque();
    java.awt.MenuBar var38 = var0.getMenuBar();
    
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
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test499");


    net.sourceforge.schemaspy.util.LineWriter var3 = new net.sourceforge.schemaspy.util.LineWriter("Unknown", 100, "ISO-8859-1");
    var3.writeln();
    var3.writeln();
    java.io.Writer var7 = var3.append((java.lang.CharSequence)"net.sourceforge.schemaspy.view.StyleSheet$MissingCssPropertyException: Required property 'hi!' was not found for the definition of '' in schemaSpy.css");
    java.io.Writer var9 = var7.append(' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test500");


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
    var0.setUndecorated(false);
    
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

}
