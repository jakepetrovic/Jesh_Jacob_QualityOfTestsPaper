package randoop;

import junit.framework.*;

public class RandoopTest12 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test1");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(3142)");

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test2");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var6 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var7 = var6.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var8 = var6.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var10 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var10.dispose();
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    var13.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    boolean var22 = var13.canControlModule(var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    var23.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    boolean var32 = var23.canControlModule(var30);
    org.eclipse.core.runtime.IStatus var33 = var10.canModifyModules(var20, var30);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    var34.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = var39.canControlModule(var41);
    boolean var43 = var34.canControlModule(var41);
    org.eclipse.core.runtime.IStatus var44 = var6.canModifyModules(var30, var41);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 100, var41, (java.lang.Integer)100);
    java.lang.String var47 = var46.getLabel();
    int var48 = var46.getOrder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "Publish to server"+ "'", var47.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test3");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var2 = var1.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Stopped"+ "'", var2.equals("Stopped"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test4");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(301)", "Refresh SAP NetWeaver server state(1217)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test5");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.enter();
    boolean var3 = var0.hasComposite();
    java.util.List var4 = var0.getChildFragments();
    var0.exit();
    var0.enter();
    var0.exit();
    var0.exit();
    java.util.List var9 = var0.getChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test6");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    var0.disableDebugging("Refresh SAP NetWeaver server state(1030)");
    com.sap.netweaver.porta.core.DebugSessionInfo var9 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var10 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var11 = var0.enableDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test7");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    java.lang.String var2 = var0.toString();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var3 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var3.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = var5.canControlModule(var7);
    var5.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var10);
    boolean var12 = var5.canControlModule(var10);
    var5.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var15.canControlModule(var19);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    boolean var26 = var15.canControlModule(var24);
    var15.dispose();
    var15.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    boolean var36 = var30.canControlModule(var34);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var38 = var37.getServer();
    org.eclipse.wst.server.core.IModule[] var39 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var40 = var37.canControlModule(var39);
    boolean var41 = var30.canControlModule(var39);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var15, 1, var39, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var45 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var5, 2, var39, (java.lang.Integer)1);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = var46.canControlModule(var48);
    var46.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var51 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var52 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var51);
    boolean var53 = var46.canControlModule(var51);
    org.eclipse.core.runtime.IStatus var54 = var3.canModifyModules(var39, var51);
    boolean var55 = var0.belongsTo((java.lang.Object)var54);
    boolean var56 = var0.sleep();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var57 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var58 = var57.getResult();
    boolean var59 = var57.shouldSchedule();
    var57.schedule();
    var57.wakeUp();
    boolean var62 = var57.cancel();
    boolean var63 = var57.shouldRun();
    org.eclipse.core.runtime.IStatus var64 = var57.getResult();
    var0.done(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(3323)"+ "'", var2.equals("Refresh SAP NetWeaver server state(3323)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test8");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(2733)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test9");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(2734)");

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test10");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    var0.updateChildFragments();
    var0.enter();
    boolean var4 = var0.hasComposite();
    boolean var5 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test11");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(2874)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test12");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var3 = var1.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var5 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var5.dispose();
    var5.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = var8.canControlModule(var10);
    var8.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    boolean var17 = var8.canControlModule(var15);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    var18.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    boolean var27 = var18.canControlModule(var25);
    org.eclipse.core.runtime.IStatus var28 = var5.canModifyModules(var15, var25);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var30 = var29.getServer();
    org.eclipse.wst.server.core.IModule[] var31 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var32 = var29.canControlModule(var31);
    var29.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    boolean var38 = var29.canControlModule(var36);
    org.eclipse.core.runtime.IStatus var39 = var1.canModifyModules(var25, var36);
    boolean var40 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var39);
    boolean var41 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var39);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var43 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var45 = var44.getServer();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = var44.canControlModule(var46);
    var44.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var49);
    boolean var51 = var44.canControlModule(var49);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var53 = var52.getServer();
    org.eclipse.wst.server.core.IModule[] var54 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var55 = var52.canControlModule(var54);
    var52.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    org.eclipse.wst.server.core.IModule[] var59 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var60 = var57.canControlModule(var59);
    boolean var61 = var52.canControlModule(var59);
    org.eclipse.core.runtime.IStatus var62 = var43.canModifyModules(var49, var59);
    boolean var63 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var62);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var65 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var66 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var67 = var66.getServer();
    org.eclipse.wst.server.core.IModule[] var68 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var69 = var66.canControlModule(var68);
    var66.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var71 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var72 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var71);
    boolean var73 = var66.canControlModule(var71);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var74 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var75 = var74.getServer();
    org.eclipse.wst.server.core.IModule[] var76 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var77 = var74.canControlModule(var76);
    var74.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var79 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var80 = var79.getServer();
    org.eclipse.wst.server.core.IModule[] var81 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var82 = var79.canControlModule(var81);
    boolean var83 = var74.canControlModule(var81);
    org.eclipse.core.runtime.IStatus var84 = var65.canModifyModules(var71, var81);
    org.eclipse.core.runtime.IStatus var85 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var62, var84);
    boolean var86 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var84);
    org.eclipse.core.runtime.IStatus var87 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var39, var84);
    boolean var88 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var39);
    boolean var89 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var39);
    boolean var90 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test13");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    var0.schedule();
    com.sap.netweaver.porta.core.mock.ServerMock var7 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var7.ping();
    com.sap.netweaver.porta.core.LifecycleManager var9 = var7.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var10 = var7.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var11 = var7.getDeployManager();
    java.net.InetSocketAddress var12 = var7.getHttpAccessPoint();
    com.sap.netweaver.porta.core.DeployManager var13 = var7.getDeployManager();
    var7.ping();
    boolean var15 = var0.belongsTo((java.lang.Object)var7);
    var7.ping();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test14");


    com.sap.netweaver.porta.core.NotAuthorizedException var3 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(150)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var4 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(2225)", (java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(863)", (java.lang.Throwable)var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test15");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    org.eclipse.core.runtime.ILog var4 = var0.getLog();
    org.osgi.framework.Bundle var5 = var0.getBundle();
    var0.savePluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var8 = var0.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test16");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(369)");
    com.sap.netweaver.porta.core.NotAuthorizedException var3 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.CoreException var4 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(407)", (java.lang.Throwable)var2);
    java.lang.Throwable[] var5 = var2.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test17");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(69)", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(187)", "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ");
    var2.setCredentials("Refresh SAP NetWeaver server state(86)", "Refresh SAP NetWeaver server state(152)");
    var2.setCredentials("Refresh SAP NetWeaver server state(538)", "Publish module to the SAP NetWeaver server");
    var2.setCredentials("Refresh SAP NetWeaver server state(613)", "Refresh SAP NetWeaver server state(2375)");

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test18");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(1887)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test19");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    boolean var6 = var0.canControlModule(var4);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var0.canControlModule(var9);
    var0.dispose();
    org.eclipse.wst.server.core.IServer var13 = var0.getServer();
    var0.dispose();
    org.eclipse.wst.server.core.IServer var15 = var0.getServer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test20");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    var0.startup();
    boolean var6 = var0.isDebugging();
    var0.savePluginPreferences();
    var0.startup();
    var0.savePluginPreferences();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test21");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var6 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var7 = var6.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var8 = var6.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var10 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var10.dispose();
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    var13.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    boolean var22 = var13.canControlModule(var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    var23.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    boolean var32 = var23.canControlModule(var30);
    org.eclipse.core.runtime.IStatus var33 = var10.canModifyModules(var20, var30);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    var34.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = var39.canControlModule(var41);
    boolean var43 = var34.canControlModule(var41);
    org.eclipse.core.runtime.IStatus var44 = var6.canModifyModules(var30, var41);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 100, var41, (java.lang.Integer)100);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var49 = var48.getServer();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = var48.canControlModule(var50);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var54 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var55 = var54.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var56 = var54.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var58 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var58.dispose();
    var58.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var61 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var62 = var61.getServer();
    org.eclipse.wst.server.core.IModule[] var63 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var64 = var61.canControlModule(var63);
    var61.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var66 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var67 = var66.getServer();
    org.eclipse.wst.server.core.IModule[] var68 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var69 = var66.canControlModule(var68);
    boolean var70 = var61.canControlModule(var68);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var71 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var72 = var71.getServer();
    org.eclipse.wst.server.core.IModule[] var73 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var74 = var71.canControlModule(var73);
    var71.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var76 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var77 = var76.getServer();
    org.eclipse.wst.server.core.IModule[] var78 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var79 = var76.canControlModule(var78);
    boolean var80 = var71.canControlModule(var78);
    org.eclipse.core.runtime.IStatus var81 = var58.canModifyModules(var68, var78);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var82 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var83 = var82.getServer();
    org.eclipse.wst.server.core.IModule[] var84 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var85 = var82.canControlModule(var84);
    var82.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var87 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var88 = var87.getServer();
    org.eclipse.wst.server.core.IModule[] var89 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var90 = var87.canControlModule(var89);
    boolean var91 = var82.canControlModule(var89);
    org.eclipse.core.runtime.IStatus var92 = var54.canModifyModules(var78, var89);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var94 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var48, 100, var89, (java.lang.Integer)100);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var96 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 0, var89, (java.lang.Integer)10);
    int var97 = var96.getKind();
    java.lang.String var98 = var96.getLabel();
    java.lang.String var99 = var96.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var98 + "' != '" + "Publish to server"+ "'", var98.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var99 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var99.equals("Publish module to the SAP NetWeaver server"));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test22");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(69)", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(187)", "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ");
    var2.setCredentials("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", "Refresh SAP NetWeaver server state(505)");
    var2.setCredentials("Refresh SAP NetWeaver server state(221)", "Refresh SAP NetWeaver server state(167)");
    var2.setCredentials("Refresh SAP NetWeaver server state(2286)", "Refresh SAP NetWeaver server state(1296)");
    var2.setCredentials("Refresh SAP NetWeaver server state(2309)", "Refresh SAP NetWeaver server state(852)");

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test23");


    com.sap.netweaver.porta.core.CoreException var2 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(716)");
    com.sap.netweaver.porta.core.CoreException var3 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(1707)", (java.lang.Throwable)var2);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test24");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(14)(934)");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test25");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(325)");
    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    java.lang.String var8 = var3.getHost();
    var1.addSuppressed((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(286)");
    var3.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var13 = var11.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Refresh SAP NetWeaver server state(286)"+ "'", var13.equals("Refresh SAP NetWeaver server state(286)"));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test26");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var4 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var7 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var6);
    java.lang.Throwable[] var8 = var6.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var6);
    java.lang.String var10 = var6.getEndpoint();
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "Refresh SAP NetWeaver server state(2677)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "MCK"+ "'", var10.equals("MCK"));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test27");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("MCK");
    com.sap.netweaver.porta.core.NotAuthorizedException var4 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var5 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(1122)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var6 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var7 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var5);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test28");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(2214)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test29");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(69)", (java.lang.Throwable)var4);
    java.lang.String var12 = var4.getHost();
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException("Publish module to the SAP NetWeaver server", (java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test30");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var5);
    java.lang.String var11 = var5.getHost();
    java.lang.String var12 = var5.getHost();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var14 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(99)", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var16 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(1271)");
    var14.addSuppressed((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var18 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(2073)", (java.lang.Throwable)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(2906)", (java.lang.Throwable)var18);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test31");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(74)");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test32");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(504)", "Refresh SAP NetWeaver server state(1696)");

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test33");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    var0.startup();
    var0.startup();
    var0.savePluginPreferences();
    boolean var8 = var0.isDebugging();
    var0.savePluginPreferences();
    org.eclipse.core.runtime.ILog var10 = var0.getLog();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var11 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test34");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.cancel();
    var0.schedule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test35");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var3 = var0.getLifecycleManager();
    var0.ping();
    java.lang.String var5 = var0.getSystemName();
    com.sap.netweaver.porta.core.DeployManager var6 = var0.getDeployManager();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var8 = var0.getLifecycleManager();
    java.net.InetSocketAddress var9 = var0.getHttpAccessPoint();
    java.lang.String var10 = var0.getSystemName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "MCK"+ "'", var5.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "MCK"+ "'", var10.equals("MCK"));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test36");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(1979)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test37");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(842)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test38");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: Publish module to the SAP NetWeaver server");

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test39");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.join();
    int var6 = var0.getState();
    int var7 = var0.getState();
    var0.setUser(true);
    var0.setUser(true);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var12 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var12.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var15 = var12.getState();
    java.lang.String var16 = var15.toString();
    com.sap.netweaver.porta.core.ProxyException var19 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var21 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var19, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var23 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var19, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var24 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var19);
    boolean var25 = var15.equals((java.lang.Object)var24);
    java.lang.Class var26 = var15.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var27 = var0.getAdapter(var26);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Stopped"+ "'", var16.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test40");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(366)", 0);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test41");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    var0.wakeUp(0L);
    var0.schedule();
    boolean var9 = var0.isBlocking();
    var0.join();
    boolean var11 = var0.isSystem();
    boolean var12 = var0.sleep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test42");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(14)");
    java.lang.Thread var9 = var0.getThread();
    int var10 = var0.getPriority();
    com.sap.netweaver.porta.core.Credentials var13 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state", "MCK");
    java.lang.String var14 = var13.getPassword();
    java.lang.String var15 = var13.getUser();
    java.lang.String var16 = var13.getPassword();
    boolean var17 = var0.belongsTo((java.lang.Object)var13);
    java.lang.String var18 = var13.getUser();
    java.lang.String var19 = var13.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(3333)"+ "'", var6.equals("Refresh SAP NetWeaver server state(3333)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "MCK"+ "'", var14.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var15.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "MCK"+ "'", var16.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var18.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var19.equals("Refresh SAP NetWeaver server state"));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test43");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var1 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var1.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var4 = var1.getState();
    java.lang.String var5 = var4.toString();
    com.sap.netweaver.porta.core.ProxyException var8 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var10 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var8, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var8, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var8);
    boolean var14 = var4.equals((java.lang.Object)var13);
    com.sap.netweaver.porta.core.ProxyException var17 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var18 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var17, "MCK");
    com.sap.netweaver.porta.core.ProxyException var23 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var25 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var27 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var25, "MCK");
    var23.addSuppressed((java.lang.Throwable)var25);
    com.sap.netweaver.porta.core.CoreException var29 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.NotAuthorizedException var30 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var29);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var31 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var30);
    var17.addSuppressed((java.lang.Throwable)var31);
    var13.addSuppressed((java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var34 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!(1683)", (java.lang.Throwable)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Stopped"+ "'", var5.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test44");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(1038)", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(1347)", "Refresh SAP NetWeaver server state(849)");
    java.io.File[] var6 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var7 = var2.upload(var6);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test45");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.ProxyException var12 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var14 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var12, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var16 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var12, "hi!");
    var10.addSuppressed((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var18 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(366)", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var19 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(2734)", "Refresh SAP NetWeaver server state(130)", (java.lang.Throwable)var18);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test46");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.String var6 = var5.toString();
    int var7 = var5.ordinal();
    int var8 = var5.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Stopped"+ "'", var6.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test47");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    org.eclipse.core.runtime.jobs.ISchedulingRule var6 = var0.getRule();
    java.lang.String var7 = var0.getName();
    var0.join();
    var0.join();
    org.eclipse.core.runtime.jobs.ISchedulingRule var10 = var0.getRule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var7.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test48");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var4 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var5 = var0.getSaveStatus();
    var0.dispose();
    org.eclipse.core.runtime.IStatus[] var7 = var0.getSaveStatus();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(74)");
    java.lang.String var10 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var11 = var0.getSaveStatus();
    java.lang.String var12 = var0.getErrorMessage();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(1468)");
    var0.setErrorMessage("Refresh SAP NetWeaver server state(1122)");
    var0.setErrorMessage("Refresh SAP NetWeaver server state(1400)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state(74)"+ "'", var10.equals("Refresh SAP NetWeaver server state(74)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Refresh SAP NetWeaver server state(74)"+ "'", var12.equals("Refresh SAP NetWeaver server state(74)"));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test49");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var2 = var0.getRuntime();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var7 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var8 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test50");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(86)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test51");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(703)", 1);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var4 = var2.undeploy(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test52");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    var0.disableDebugging("Refresh SAP NetWeaver server state(538)");
    com.sap.netweaver.porta.core.DebugSessionInfo var9 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(552)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test53");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var8 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    var9.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var14);
    boolean var16 = var9.canControlModule(var14);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    var17.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    boolean var26 = var17.canControlModule(var24);
    org.eclipse.core.runtime.IStatus var27 = var8.canModifyModules(var14, var24);
    var0.done(var27);
    var0.setUser(false);
    boolean var31 = var0.shouldSchedule();
    int var32 = var0.getState();
    java.lang.Thread var33 = var0.getThread();
    org.eclipse.core.runtime.IStatus var34 = var0.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test54");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    boolean var7 = var0.cancel();
    java.lang.String var8 = var0.getName();
    boolean var9 = var0.isBlocking();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    org.eclipse.wst.server.core.IModule[] var12 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var13 = var10.canControlModule(var12);
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    org.eclipse.wst.server.core.IModule[] var17 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var18 = var15.canControlModule(var17);
    boolean var19 = var10.canControlModule(var17);
    var10.handleResourceChange();
    var10.dispose();
    org.eclipse.wst.server.core.IServer var22 = var10.getServer();
    var10.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = var27.canControlModule(var29);
    boolean var31 = var25.canControlModule(var29);
    var25.handleResourceChange();
    org.eclipse.wst.server.core.IServer var33 = var25.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var35 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var36 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var37 = var36.getServer();
    org.eclipse.wst.server.core.IModule[] var38 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var39 = var36.canControlModule(var38);
    var36.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var41);
    boolean var43 = var36.canControlModule(var41);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var45 = var44.getServer();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = var44.canControlModule(var46);
    var44.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var50 = var49.getServer();
    org.eclipse.wst.server.core.IModule[] var51 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var52 = var49.canControlModule(var51);
    boolean var53 = var44.canControlModule(var51);
    org.eclipse.core.runtime.IStatus var54 = var35.canModifyModules(var41, var51);
    boolean var55 = var25.canControlModule(var51);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var10, (-1), var51, (java.lang.Integer)1);
    int var58 = var57.getOrder();
    boolean var59 = var0.belongsTo((java.lang.Object)var58);
    boolean var60 = var0.isBlocking();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var8.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test55");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 10);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var7 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var8 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var9 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var10 = var2.getLifecycleManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test56");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(766)", 0);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var3.enableDebugging();
    com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback var7 = new com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback();
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    com.sap.netweaver.porta.core.DebugSessionInfo var9 = var3.enableDebugging();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var12 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(176)", 100);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var13 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var13.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var13.disableDebugging("");
    var13.disableDebugging("MCK");
    var13.disableDebugging("Refresh SAP NetWeaver server state(538)");
    com.sap.netweaver.porta.core.DebugSessionInfo var22 = var13.enableDebugging();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(131)");
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var25);
    var12.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var25);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var25);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var25);
    com.sap.netweaver.porta.core.Application[] var30 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var31 = var2.start(var30);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test57");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(119)(953)");

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test58");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "MCK");
    java.lang.String var5 = var2.getHost();
    com.sap.netweaver.porta.core.NotAuthorizedException var6 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var7 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(2523)", (java.lang.Throwable)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test59");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.setSystem(false);
    boolean var8 = var0.shouldSchedule();
    var0.setName("Refresh SAP NetWeaver server state(119)");
    boolean var11 = var0.shouldRun();
    var0.setSystem(false);
    var0.setUser(false);
    var0.schedule(0L);
    boolean var18 = var0.cancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test60");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var1.dispose();
    var1.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    org.eclipse.wst.server.core.IModule[] var6 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var7 = var4.canControlModule(var6);
    var4.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    boolean var13 = var4.canControlModule(var11);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    var14.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    boolean var23 = var14.canControlModule(var21);
    org.eclipse.core.runtime.IStatus var24 = var1.canModifyModules(var11, var21);
    org.eclipse.wst.server.core.IServer var25 = var1.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var27 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    var28.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var33 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var34 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var33);
    boolean var35 = var28.canControlModule(var33);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var36 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var37 = var36.getServer();
    org.eclipse.wst.server.core.IModule[] var38 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var39 = var36.canControlModule(var38);
    var36.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var42 = var41.getServer();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = var41.canControlModule(var43);
    boolean var45 = var36.canControlModule(var43);
    org.eclipse.core.runtime.IStatus var46 = var27.canModifyModules(var33, var43);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var50 = var49.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    boolean var55 = var49.canControlModule(var53);
    boolean var56 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var53);
    boolean var57 = var47.canControlModule(var53);
    org.eclipse.core.runtime.IStatus var58 = var1.canModifyModules(var33, var53);
    var1.dispose();
    var1.dispose();
    org.eclipse.wst.server.core.IServer var61 = var1.getServer();
    var1.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test61");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var7 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var7.setDebugging(false);
    boolean var10 = var5.equals((java.lang.Object)false);
    int var11 = var5.ordinal();
    java.lang.String var12 = var5.name();
    java.lang.String var13 = var5.toString();
    java.lang.String var14 = var5.toString();
    java.lang.String var15 = var5.toString();
    java.lang.String var16 = var5.name();
    java.lang.Class var17 = var5.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "STOPPED"+ "'", var12.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Stopped"+ "'", var13.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Stopped"+ "'", var14.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Stopped"+ "'", var15.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "STOPPED"+ "'", var16.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test62");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(534)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var3 = var2.getHttpAccessPoint();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test63");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback var4 = new com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback();
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test64");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var7 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var7.setDebugging(false);
    boolean var10 = var5.equals((java.lang.Object)false);
    int var11 = var5.ordinal();
    java.lang.String var12 = var5.name();
    java.lang.String var13 = var5.toString();
    java.lang.String var14 = var5.toString();
    java.lang.String var15 = var5.name();
    com.sap.netweaver.porta.core.ProxyException var18 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var18, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var22 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var18, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var23 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var22);
    com.sap.netweaver.porta.core.ProxyException var25 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var27 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var25, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var29 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var25, "hi!");
    var23.addSuppressed((java.lang.Throwable)var29);
    com.sap.netweaver.porta.core.NotAuthorizedException var32 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(14)");
    var29.addSuppressed((java.lang.Throwable)var32);
    boolean var34 = var5.equals((java.lang.Object)var29);
    java.lang.Class var35 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var37 = java.lang.Enum.<java.lang.Enum>valueOf(var35, "Refresh SAP NetWeaver server state(221)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "STOPPED"+ "'", var12.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Stopped"+ "'", var13.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Stopped"+ "'", var14.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "STOPPED"+ "'", var15.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test65");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.setSystem(false);
    var0.setUser(false);
    boolean var10 = var0.isSystem();
    org.eclipse.core.runtime.jobs.ISchedulingRule var11 = var0.getRule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test66");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    com.sap.netweaver.porta.core.DeployManager var1 = var0.getDeployManager();
    java.lang.String var2 = var0.getSystemName();
    java.net.InetSocketAddress var3 = var0.getHttpAccessPoint();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "MCK"+ "'", var2.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test67");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback var4 = new com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback();
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var8 = var0.enableDebugging();
    var0.disableDebugging("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(46)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test68");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.String var7 = var5.toString();
    java.lang.Class var8 = var5.getDeclaringClass();
    com.sap.netweaver.porta.core.Credentials var11 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(233)", "Refresh SAP NetWeaver server state(323)");
    boolean var12 = var5.equals((java.lang.Object)"Refresh SAP NetWeaver server state(323)");
    java.lang.String var13 = var5.toString();
    java.lang.String var14 = var5.toString();
    java.lang.Class var15 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var17 = java.lang.Enum.<java.lang.Enum>valueOf(var15, "Refresh SAP NetWeaver server state(2355)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Stopped"+ "'", var13.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Stopped"+ "'", var14.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test69");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var6 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var8 = var7.getResult();
    boolean var9 = var7.isUser();
    boolean var10 = var7.shouldSchedule();
    var7.schedule();
    boolean var12 = var6.equals((java.lang.Object)var7);
    java.lang.Class var13 = var6.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test70");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var4);
    java.lang.Throwable[] var10 = var9.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var9, "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var14 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(1222)", (java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NotAuthorizedException var16 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(1701)", (java.lang.Throwable)var16);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test71");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    java.lang.Thread var5 = var0.getThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test72");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(656)", 1);
    int var3 = var2.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test73");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1466)");

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test74");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    java.lang.Thread var11 = var0.getThread();
    int var12 = var0.getPriority();
    org.eclipse.core.runtime.jobs.ISchedulingRule var13 = var0.getRule();
    var0.join();
    org.eclipse.core.runtime.IStatus var15 = var0.getResult();
    com.sap.netweaver.porta.core.DebugSessionInfo var18 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(242)", 1);
    java.lang.String var19 = var18.getKey();
    int var20 = var18.getPort();
    java.lang.String var21 = var18.getKey();
    boolean var22 = var0.belongsTo((java.lang.Object)var18);
    int var23 = var18.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Refresh SAP NetWeaver server state(242)"+ "'", var19.equals("Refresh SAP NetWeaver server state(242)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Refresh SAP NetWeaver server state(242)"+ "'", var21.equals("Refresh SAP NetWeaver server state(242)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test75");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    org.eclipse.core.runtime.IStatus var11 = var0.getResult();
    boolean var12 = var0.shouldSchedule();
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var18 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var18, "MCK");
    var16.addSuppressed((java.lang.Throwable)var18);
    com.sap.netweaver.porta.core.CoreException var22 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NotAuthorizedException var23 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(69)", (java.lang.Throwable)var16);
    boolean var24 = var0.belongsTo((java.lang.Object)var23);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var25 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.CoreException var26 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var27 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var28 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var27);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var29 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test76");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(3227)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test77");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.setUser(true);
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(3348)"+ "'", var6.equals("Refresh SAP NetWeaver server state(3348)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state(3348)"+ "'", var9.equals("Refresh SAP NetWeaver server state(3348)"));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test78");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(1568)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test79");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    int var3 = var0.getPriority();
    boolean var4 = var0.isSystem();
    var0.setUser(false);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var7 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var7.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var10 = var7.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var13 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var14 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    boolean var16 = var10.equals((java.lang.Object)var14);
    com.sap.netweaver.porta.core.ProxyException var19 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var21 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var19, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var23 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var19, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var24 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.ProxyException var26 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var28 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var26, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var30 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var26, "hi!");
    var24.addSuppressed((java.lang.Throwable)var30);
    boolean var32 = var10.equals((java.lang.Object)var30);
    com.sap.netweaver.porta.core.ProxyException var36 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var37 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var36);
    com.sap.netweaver.porta.core.NoWSGateException var39 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var36, "MCK");
    com.sap.netweaver.porta.core.NotAuthorizedException var40 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(46)", (java.lang.Throwable)var39);
    boolean var41 = var10.equals((java.lang.Object)"Refresh SAP NetWeaver server state(46)");
    java.lang.String var42 = var10.toString();
    java.lang.String var43 = var10.toString();
    java.lang.Class var44 = var10.getDeclaringClass();
    int var45 = var10.ordinal();
    java.lang.String var46 = var10.toString();
    java.lang.Class var47 = var10.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var48 = var0.getAdapter(var47);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "Stopped"+ "'", var42.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Stopped"+ "'", var43.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Stopped"+ "'", var46.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test80");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(534)", 100);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test81");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(238)", "Refresh SAP NetWeaver server state(127)");
    var2.setCredentials("Refresh SAP NetWeaver server state(375)", "Refresh SAP NetWeaver server state(2823)");

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test82");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.cancel();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    java.lang.String var5 = var0.toString();
    var0.schedule(100L);
    var0.wakeUp();
    boolean var9 = var0.cancel();
    var0.schedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(3352)"+ "'", var5.equals("Refresh SAP NetWeaver server state(3352)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test83");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var5 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    java.lang.String[] var7 = var0.getJ2EE14Classpath();
    java.lang.String[] var8 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var9 = var0.getRuntime();
    java.lang.String[] var10 = var0.getJavaEE5Classpath();
    java.lang.String[] var11 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test84");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var3 = var0.getRule();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var4 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var4.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var4.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var9 = var4.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var10 = var4.enableDebugging();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var13 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    var4.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    var4.disableDebugging("Refresh SAP NetWeaver server state(221)");
    boolean var21 = var0.belongsTo((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test85");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    boolean var6 = var0.canControlModule(var4);
    var0.dispose();
    var0.handleResourceChange();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test86");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    var0.startup();
    var0.startup();
    var0.savePluginPreferences();
    boolean var8 = var0.isDebugging();
    var0.setDebugging(true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var11 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test87");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var2 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var2.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var5 = var2.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var8 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var9 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var8.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var9);
    boolean var11 = var5.equals((java.lang.Object)var9);
    com.sap.netweaver.porta.core.ProxyException var14 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var16 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var14, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var14, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var19 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var18);
    com.sap.netweaver.porta.core.ProxyException var21 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var23 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var21, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var25 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var21, "hi!");
    var19.addSuppressed((java.lang.Throwable)var25);
    boolean var27 = var5.equals((java.lang.Object)var25);
    com.sap.netweaver.porta.core.CoreException var28 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var25);
    com.sap.netweaver.porta.core.CoreException var29 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(184)", (java.lang.Throwable)var25);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var30 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test88");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(69)", 30);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var6 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var6);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var8 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var10 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var10.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var13 = var10.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var14 = var10.enableDebugging();
    var10.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var19 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var20 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var20);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var22 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var26 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var26);
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var26);
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var26);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test89");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(1512)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test90");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var10 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var12 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    com.sap.netweaver.porta.core.mock.CoreModuleMock var19 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var26 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var26);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var30);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var32 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var32.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var35);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var37 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var37.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var40);
    var32.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var40);
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var40);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var40);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var45 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var45.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var45.disableDebugging("");
    com.sap.netweaver.porta.core.DebugSessionInfo var50 = var45.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var51 = var45.enableDebugging();
    var45.disableDebugging("Refresh SAP NetWeaver server state(131)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var54 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var54.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var57 = var54.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var58 = var54.enableDebugging();
    var54.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var61 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var61.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var64 = var61.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var67 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var68 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var67.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var68);
    boolean var70 = var64.equals((java.lang.Object)var68);
    var54.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var68);
    var45.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var68);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var68);
    com.sap.netweaver.porta.core.ServerState var74 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test91");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("com.sap.netweaver.porta.core.CoreException: MCK");

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test92");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.startup();
    org.eclipse.core.runtime.ILog var5 = var0.getLog();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var6 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test93");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(123)", "Refresh SAP NetWeaver server state(1360)");
    java.lang.String var3 = var2.getPassword();
    java.lang.String var4 = var2.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(1360)"+ "'", var3.equals("Refresh SAP NetWeaver server state(1360)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(1360)"+ "'", var4.equals("Refresh SAP NetWeaver server state(1360)"));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test94");


    com.sap.netweaver.porta.core.NotAuthorizedException var3 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.NotAuthorizedException var4 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(356)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(613)", (java.lang.Throwable)var5);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test95");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    var0.wakeUp();
    boolean var5 = var0.shouldRun();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = var8.canControlModule(var10);
    var8.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var13 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var14 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var13);
    boolean var15 = var8.canControlModule(var13);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    org.eclipse.wst.server.core.IModule[] var18 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var19 = var16.canControlModule(var18);
    var16.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var22 = var21.getServer();
    org.eclipse.wst.server.core.IModule[] var23 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var24 = var21.canControlModule(var23);
    boolean var25 = var16.canControlModule(var23);
    org.eclipse.core.runtime.IStatus var26 = var7.canModifyModules(var13, var23);
    boolean var27 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var26);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var29 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    var30.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var35 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var36 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var35);
    boolean var37 = var30.canControlModule(var35);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var39 = var38.getServer();
    org.eclipse.wst.server.core.IModule[] var40 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var41 = var38.canControlModule(var40);
    var38.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var44 = var43.getServer();
    org.eclipse.wst.server.core.IModule[] var45 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var46 = var43.canControlModule(var45);
    boolean var47 = var38.canControlModule(var45);
    org.eclipse.core.runtime.IStatus var48 = var29.canModifyModules(var35, var45);
    org.eclipse.core.runtime.IStatus var49 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var26, var48);
    boolean var50 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var48);
    boolean var51 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var48);
    boolean var52 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var48);
    boolean var53 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var48);
    var0.done(var48);
    var0.join();
    var0.schedule();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setUser(true);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test96");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    int var3 = var0.getPriority();
    var0.setSystem(true);
    var0.wakeUp();
    boolean var7 = var0.isUser();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var8 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var9 = var8.getResult();
    var8.setSystem(true);
    boolean var12 = var8.sleep();
    org.eclipse.core.runtime.jobs.ISchedulingRule var13 = var8.getRule();
    boolean var14 = var8.shouldRun();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var15 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var16 = var15.getState();
    boolean var17 = var15.isBlocking();
    org.eclipse.core.runtime.jobs.ISchedulingRule var18 = var15.getRule();
    var15.schedule();
    boolean var20 = var15.cancel();
    org.eclipse.core.runtime.IStatus var21 = var15.getResult();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var22 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var23 = var22.getResult();
    boolean var24 = var22.isUser();
    org.eclipse.core.runtime.IStatus var25 = var22.getResult();
    var22.schedule(100L);
    boolean var28 = var22.cancel();
    boolean var29 = var22.shouldSchedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var30 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var31 = var30.getState();
    int var32 = var30.getPriority();
    boolean var33 = var30.isSystem();
    boolean var34 = var22.belongsTo((java.lang.Object)var30);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var36 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var38 = var37.getServer();
    org.eclipse.wst.server.core.IModule[] var39 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var40 = var37.canControlModule(var39);
    var37.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var42);
    boolean var44 = var37.canControlModule(var42);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var45 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var46 = var45.getServer();
    org.eclipse.wst.server.core.IModule[] var47 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var48 = var45.canControlModule(var47);
    var45.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var50 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var51 = var50.getServer();
    org.eclipse.wst.server.core.IModule[] var52 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var53 = var50.canControlModule(var52);
    boolean var54 = var45.canControlModule(var52);
    org.eclipse.core.runtime.IStatus var55 = var36.canModifyModules(var42, var52);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var56 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var57 = var56.getResult();
    boolean var58 = var56.shouldSchedule();
    var56.wakeUp(100L);
    var56.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var64 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var65 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var66 = var65.getServer();
    org.eclipse.wst.server.core.IModule[] var67 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var68 = var65.canControlModule(var67);
    var65.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var70 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var71 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var70);
    boolean var72 = var65.canControlModule(var70);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var73 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var74 = var73.getServer();
    org.eclipse.wst.server.core.IModule[] var75 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var76 = var73.canControlModule(var75);
    var73.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var78 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var79 = var78.getServer();
    org.eclipse.wst.server.core.IModule[] var80 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var81 = var78.canControlModule(var80);
    boolean var82 = var73.canControlModule(var80);
    org.eclipse.core.runtime.IStatus var83 = var64.canModifyModules(var70, var80);
    var56.done(var83);
    org.eclipse.core.runtime.IStatus var85 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var55, var83);
    boolean var86 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var85);
    var30.done(var85);
    boolean var88 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var85);
    org.eclipse.core.runtime.IStatus var89 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var21, var85);
    var8.done(var21);
    var0.done(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test97");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyUser();
    java.lang.String var5 = var0.getProxyPort();
    java.lang.String var6 = var0.getProxyPassword();
    java.lang.String var7 = var0.getNonProxyHosts();
    java.lang.String var8 = var0.getProxyHost();
    java.lang.String var9 = var0.getProxyPort();
    java.lang.String var10 = var0.getProxyHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test98");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(926)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test99");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(2519)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test100");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(664)", (-1));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test101");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    var0.exit();
    var0.updateChildFragments();
    boolean var4 = var0.hasComposite();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test102");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(2718)", 2);
    var2.setCredentials("Refresh SAP NetWeaver server state(833)", "com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(176)");

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test103");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var2 = var0.getTaskModel();
    var0.enter();
    boolean var4 = var0.hasComposite();
    var0.enter();
    var0.updateChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test104");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyPort();
    java.lang.String var4 = var0.getProxyPassword();
    java.lang.String var5 = var0.getNonProxyHosts();
    java.lang.String var6 = var0.getProxyPassword();
    java.lang.String var7 = var0.getProxyHost();
    java.lang.String var8 = var0.getProxyPassword();
    java.lang.String var9 = var0.getNonProxyHosts();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test105");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.setErrorMessage("hi!");
    var0.setErrorMessage("Refresh SAP NetWeaver server state(44)");
    var0.setErrorMessage("Refresh SAP NetWeaver server state(275)");
    java.lang.String var7 = var0.getErrorMessage();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(2157)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Refresh SAP NetWeaver server state(275)"+ "'", var7.equals("Refresh SAP NetWeaver server state(275)"));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test106");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    var0.disableDebugging("Refresh SAP NetWeaver server state(106)");
    com.sap.netweaver.porta.core.mock.CoreModuleMock var9 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    com.sap.netweaver.porta.core.ServerState var19 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var20 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(131)");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test107");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var3 = var0.getLifecycleManager();
    var0.ping();
    java.net.InetSocketAddress var5 = var0.getHttpAccessPoint();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var7 = var0.getLifecycleManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test108");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(249)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test109");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.cancel();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    java.lang.String var5 = var0.toString();
    boolean var6 = var0.sleep();
    boolean var7 = var0.isSystem();
    int var8 = var0.getPriority();
    var0.join();
    var0.setUser(false);
    var0.schedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var13 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var13.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    org.eclipse.wst.server.core.IModule[] var17 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var18 = var15.canControlModule(var17);
    var15.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var20);
    boolean var22 = var15.canControlModule(var20);
    var15.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = var27.canControlModule(var29);
    boolean var31 = var25.canControlModule(var29);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    boolean var36 = var25.canControlModule(var34);
    var25.dispose();
    var25.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = var42.canControlModule(var44);
    boolean var46 = var40.canControlModule(var44);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = var47.canControlModule(var49);
    boolean var51 = var40.canControlModule(var49);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var53 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var25, 1, var49, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var55 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var15, 2, var49, (java.lang.Integer)1);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var56 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var57 = var56.getServer();
    org.eclipse.wst.server.core.IModule[] var58 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var59 = var56.canControlModule(var58);
    var56.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var61 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var62 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var61);
    boolean var63 = var56.canControlModule(var61);
    org.eclipse.core.runtime.IStatus var64 = var13.canModifyModules(var49, var61);
    var13.dispose();
    var13.dispose();
    var13.dispose();
    var13.configurationChanged();
    org.eclipse.wst.server.core.IServerWorkingCopy var69 = var13.getServerWorkingCopy();
    boolean var70 = var0.belongsTo((java.lang.Object)var13);
    org.eclipse.wst.server.core.IServerWorkingCopy var71 = var13.getServerWorkingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(3362)"+ "'", var5.equals("Refresh SAP NetWeaver server state(3362)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test110");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.setSystem(false);
    var0.wakeUp(10L);
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state(3363)"+ "'", var10.equals("Refresh SAP NetWeaver server state(3363)"));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test111");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    boolean var2 = var0.shouldSchedule();
    int var3 = var0.getState();
    boolean var4 = var0.isSystem();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var6 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var6.dispose();
    var6.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    var9.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    boolean var18 = var9.canControlModule(var16);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    var19.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = var24.canControlModule(var26);
    boolean var28 = var19.canControlModule(var26);
    org.eclipse.core.runtime.IStatus var29 = var6.canModifyModules(var16, var26);
    org.eclipse.wst.server.core.IServer var30 = var6.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var32 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var34 = var33.getServer();
    org.eclipse.wst.server.core.IModule[] var35 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var36 = var33.canControlModule(var35);
    var33.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var38 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var39 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var38);
    boolean var40 = var33.canControlModule(var38);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var42 = var41.getServer();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = var41.canControlModule(var43);
    var41.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = var46.canControlModule(var48);
    boolean var50 = var41.canControlModule(var48);
    org.eclipse.core.runtime.IStatus var51 = var32.canModifyModules(var38, var48);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var53 = var52.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var54 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var55 = var54.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var56 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var57 = var56.getServer();
    org.eclipse.wst.server.core.IModule[] var58 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var59 = var56.canControlModule(var58);
    boolean var60 = var54.canControlModule(var58);
    boolean var61 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var58);
    boolean var62 = var52.canControlModule(var58);
    org.eclipse.core.runtime.IStatus var63 = var6.canModifyModules(var38, var58);
    var0.done(var63);
    boolean var65 = var0.sleep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test112");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    java.net.InetSocketAddress var3 = var0.getHttpAccessPoint();
    com.sap.netweaver.porta.core.DeployManager var4 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var0.getLifecycleManager();
    java.lang.String var6 = var0.getSystemName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "MCK"+ "'", var6.equals("MCK"));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test113");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var3 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    java.lang.String[] var5 = var0.getJavaEE5Classpath();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var7 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var8 = var0.getJavaEE5Classpath();
    java.lang.String[] var9 = var0.getJ2EE14Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test114");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(154)", 1);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var5 = var2.getDeployManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test115");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(2368)", 2);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var4 = var2.getHttpAccessPoint();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test116");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(1367)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test117");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var4 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var5 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(106)", (java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(2691)", "Refresh SAP NetWeaver server state(232)", (java.lang.Throwable)var5);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test118");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var3.getSuppressed();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "Refresh SAP NetWeaver server state(660)");
    java.lang.String var14 = var3.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test119");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(1231)", 2);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var6 = var3.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var3.enableDebugging();
    var3.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.ServerState var10 = var3.getState();
    var3.disableDebugging("Refresh SAP NetWeaver server state(227)");
    var3.disableDebugging("Refresh SAP NetWeaver server state(621)");
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Publish module to the SAP NetWeaver server");
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var17);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var17);
    com.sap.netweaver.porta.core.Application[] var20 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var21 = var2.start(var20);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test120");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(0L);
    int var5 = var0.getPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 30);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test121");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    org.eclipse.core.runtime.ILog var5 = var0.getLog();
    boolean var6 = var0.isDebugging();
    var0.startup();
    var0.setDebugging(true);
    var0.setDebugging(true);
    org.eclipse.core.runtime.ILog var12 = var0.getLog();
    var0.startup();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test122");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var1 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var1.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var4 = var1.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var1.enableDebugging();
    var1.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var8 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var8.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var11 = var8.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var14 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var15 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var14.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var15);
    boolean var17 = var11.equals((java.lang.Object)var15);
    var1.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var15);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var15);
    com.sap.netweaver.porta.core.ServerState var20 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var21 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var22 = var21.getJ2EE14Classpath();
    java.lang.String[] var23 = var21.getJ2EE14Classpath();
    boolean var24 = var20.equals((java.lang.Object)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test123");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule();
    boolean var7 = var0.isSystem();
    boolean var8 = var0.isSystem();
    var0.join();
    boolean var10 = var0.shouldSchedule();
    boolean var11 = var0.cancel();
    org.eclipse.core.runtime.jobs.ISchedulingRule var12 = var0.getRule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test124");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    boolean var7 = var0.isSystem();
    int var8 = var0.getPriority();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state(3367)"+ "'", var9.equals("Refresh SAP NetWeaver server state(3367)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test125");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    org.eclipse.wst.server.core.IRuntime var1 = var0.getRuntime();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    java.lang.String[] var4 = var0.getJ2EE14Classpath();
    java.lang.String[] var5 = var0.getJavaEE5Classpath();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test126");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(1791)", "Refresh SAP NetWeaver server state(906)");

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test127");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var9);
    java.lang.String var12 = var9.getEndpoint();
    com.sap.netweaver.porta.core.ProxyException var15 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var17 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var19 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var17, "MCK");
    var15.addSuppressed((java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.NotAuthorizedException var21 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.NoWSGateException var23 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var21, "STOPPED");
    var9.addSuppressed((java.lang.Throwable)var21);
    com.sap.netweaver.porta.core.NotAuthorizedException var25 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(151)", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.NotAuthorizedException var26 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var25);
    com.sap.netweaver.porta.core.NotAuthorizedException var27 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(2874)", (java.lang.Throwable)var26);
    java.lang.String var28 = var26.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(151)"+ "'", var28.equals("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(151)"));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test128");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var2 = var0.getRuntime();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    var0.dispose();
    java.lang.String[] var5 = var0.getJavaEE5Classpath();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var7 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var8 = var0.getJavaEE5Classpath();
    java.lang.String[] var9 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var10 = var0.getRuntime();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var11 = var0.getRuntimeWorkingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test129");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    var0.disableDebugging("Refresh SAP NetWeaver server state(227)");
    var0.disableDebugging("Refresh SAP NetWeaver server state(621)");
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Publish module to the SAP NetWeaver server");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    com.sap.netweaver.porta.core.DebugSessionInfo var16 = var0.enableDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test130");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var3 = var1.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var5 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var5.dispose();
    var5.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = var8.canControlModule(var10);
    var8.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    boolean var17 = var8.canControlModule(var15);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    var18.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    boolean var27 = var18.canControlModule(var25);
    org.eclipse.core.runtime.IStatus var28 = var5.canModifyModules(var15, var25);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var30 = var29.getServer();
    org.eclipse.wst.server.core.IModule[] var31 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var32 = var29.canControlModule(var31);
    var29.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    boolean var38 = var29.canControlModule(var36);
    org.eclipse.core.runtime.IStatus var39 = var1.canModifyModules(var25, var36);
    boolean var40 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var39);
    boolean var41 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var39);
    boolean var42 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var39);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var43 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var44 = var43.getResult();
    boolean var45 = var43.shouldSchedule();
    var43.wakeUp(100L);
    var43.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var51 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var53 = var52.getServer();
    org.eclipse.wst.server.core.IModule[] var54 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var55 = var52.canControlModule(var54);
    var52.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var57 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var58 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var57);
    boolean var59 = var52.canControlModule(var57);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var60 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var61 = var60.getServer();
    org.eclipse.wst.server.core.IModule[] var62 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var63 = var60.canControlModule(var62);
    var60.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var65 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var66 = var65.getServer();
    org.eclipse.wst.server.core.IModule[] var67 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var68 = var65.canControlModule(var67);
    boolean var69 = var60.canControlModule(var67);
    org.eclipse.core.runtime.IStatus var70 = var51.canModifyModules(var57, var67);
    var43.done(var70);
    var43.join();
    boolean var73 = var43.sleep();
    org.eclipse.core.runtime.jobs.ISchedulingRule var74 = var43.getRule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var75 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var76 = var75.getResult();
    boolean var77 = var75.isUser();
    org.eclipse.core.runtime.IStatus var78 = var75.getResult();
    var75.schedule(100L);
    var75.wakeUp(0L);
    boolean var83 = var75.sleep();
    org.eclipse.core.runtime.IStatus var84 = var75.getResult();
    var75.schedule();
    java.lang.Thread var86 = var75.getThread();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var87 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var88 = var87.getResult();
    boolean var89 = var87.isUser();
    org.eclipse.core.runtime.IStatus var90 = var87.getResult();
    var87.schedule(100L);
    var87.wakeUp(0L);
    boolean var95 = var87.sleep();
    org.eclipse.core.runtime.IStatus var96 = var87.getResult();
    var75.done(var96);
    var43.done(var96);
    org.eclipse.core.runtime.IStatus var99 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var39, var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test131");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var6 = var0.getState();
    java.lang.Class var7 = var6.getDeclaringClass();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var10 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(46)", 1);
    boolean var11 = var6.equals((java.lang.Object)"Refresh SAP NetWeaver server state(46)");
    int var12 = var6.ordinal();
    java.lang.String var13 = var6.toString();
    java.lang.String var14 = var6.name();
    java.lang.String var15 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Stopped"+ "'", var13.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "STOPPED"+ "'", var14.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Stopped"+ "'", var15.equals("Stopped"));

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test132");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    var0.wakeUp(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(3371)"+ "'", var2.equals("Refresh SAP NetWeaver server state(3371)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(3371)"+ "'", var3.equals("Refresh SAP NetWeaver server state(3371)"));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test133");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var1 = var0.getTaskModel();
    var0.updateChildFragments();
    boolean var3 = var0.hasComposite();
    var0.updateChildFragments();
    boolean var5 = var0.hasComposite();
    boolean var6 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test134");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    var0.exit();
    org.eclipse.wst.server.core.TaskModel var3 = var0.getTaskModel();
    var0.enter();
    boolean var5 = var0.hasComposite();
    org.eclipse.wst.server.core.TaskModel var6 = var0.getTaskModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test135");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(14)");
    java.lang.Thread var9 = var0.getThread();
    int var10 = var0.getPriority();
    boolean var11 = var0.sleep();
    int var12 = var0.getPriority();
    boolean var13 = var0.cancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(3372)"+ "'", var6.equals("Refresh SAP NetWeaver server state(3372)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test136");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(1564)", 1);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test137");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var2 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.CoreException var3 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(1918)", (java.lang.Throwable)var2);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test138");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(44)");
    var0.initialize("Refresh SAP NetWeaver server state(99)");
    var0.initialize("Refresh SAP NetWeaver server state(169)");
    var0.initialize("Refresh SAP NetWeaver server state(297)");
    var0.initialize("Refresh SAP NetWeaver server state(1137)");
    var0.initialize("Refresh SAP NetWeaver server state(622)");

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test139");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.setErrorMessage("hi!");
    var0.setErrorMessage("Refresh SAP NetWeaver server state(44)");
    var0.setErrorMessage("Refresh SAP NetWeaver server state(275)");
    var0.setErrorMessage("Refresh SAP NetWeaver server state(2073)");
    java.lang.String var9 = var0.getErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state(2073)"+ "'", var9.equals("Refresh SAP NetWeaver server state(2073)"));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test140");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(2814)");

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test141");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(1217)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test142");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", 2);
    java.io.File[] var3 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var4 = var2.upload(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test143");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    var0.enter();
    var0.enter();
    var0.enter();
    boolean var4 = var0.hasComposite();
    var0.updateChildFragments();
    var0.enter();
    boolean var7 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test144");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(2268)");

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test145");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(119)", (java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var16 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var15);
    java.lang.String var17 = var16.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)"+ "'", var17.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test146");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(739)");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host Refresh SAP NetWeaver server state(739) cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var2.equals("com.sap.netweaver.porta.core.ProxyException: The host Refresh SAP NetWeaver server state(739) cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test147");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var6 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var7 = var6.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var8 = var6.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var10 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var10.dispose();
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    var13.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    boolean var22 = var13.canControlModule(var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    var23.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    boolean var32 = var23.canControlModule(var30);
    org.eclipse.core.runtime.IStatus var33 = var10.canModifyModules(var20, var30);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    var34.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = var39.canControlModule(var41);
    boolean var43 = var34.canControlModule(var41);
    org.eclipse.core.runtime.IStatus var44 = var6.canModifyModules(var30, var41);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 100, var41, (java.lang.Integer)100);
    int var47 = var46.getKind();
    int var48 = var46.getOrder();
    int var49 = var46.getOrder();
    java.lang.String var50 = var46.getDescription();
    java.lang.String var51 = var46.getDescription();
    int var52 = var46.getKind();
    int var53 = var46.getOrder();
    org.eclipse.wst.server.core.TaskModel var54 = var46.getTaskModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var50.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var51.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test148");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    org.eclipse.core.runtime.ILog var1 = var0.getLog();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test149");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    var0.startup();
    var0.savePluginPreferences();
    boolean var7 = var0.isDebugging();
    var0.startup();
    boolean var9 = var0.isDebugging();
    var0.savePluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    var0.startup();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var13 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test150");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var3 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test151");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    int var8 = var0.getPriority();
    var0.wakeUp();
    int var10 = var0.getPriority();
    var0.join();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test152");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(1742)", "Refresh SAP NetWeaver server state(2104)");

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test153");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(1191)", "Refresh SAP NetWeaver server state(2036)");

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test154");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(461)", (java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(3314)", (java.lang.Throwable)var10);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test155");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(2465)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test156");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(74)", 10);
    java.io.File[] var3 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var4 = var2.deploy(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test157");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(325)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test158");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setName("Refresh SAP NetWeaver server state(3182)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test159");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    boolean var6 = var0.sleep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test160");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(457)", 10);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var6 = var3.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var3.enableDebugging();
    var3.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.ServerState var10 = var3.getState();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var13 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(317)", 10);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var14 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var14.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var17);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var19 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    var14.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var28 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test161");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var1 = var0.getTaskModel();
    var0.updateChildFragments();
    var0.exit();
    java.util.List var4 = var0.getChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test162");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    var0.disableDebugging("Refresh SAP NetWeaver server state(227)");
    var0.disableDebugging("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ");
    com.sap.netweaver.porta.core.DebugSessionInfo var12 = var0.enableDebugging();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var13 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var13.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var16 = var13.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var17 = var13.enableDebugging();
    var13.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var20 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var20.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.mock.CoreModuleMock var23 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var26 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var27 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var26.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var27);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var31 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var26.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var31);
    var23.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var31);
    var20.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var31);
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var31);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var31);
    com.sap.netweaver.porta.core.ServerState var37 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var38 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test163");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(538)", 1);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ping();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test164");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = var5.canControlModule(var7);
    boolean var9 = var0.canControlModule(var7);
    var0.handleResourceChange();
    var0.dispose();
    org.eclipse.wst.server.core.IServer var12 = var0.getServer();
    org.eclipse.wst.server.core.IServer var13 = var0.getServer();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    boolean var22 = var16.canControlModule(var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    boolean var27 = var16.canControlModule(var25);
    var16.dispose();
    var16.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var31 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var32 = var31.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var34 = var33.getServer();
    org.eclipse.wst.server.core.IModule[] var35 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var36 = var33.canControlModule(var35);
    boolean var37 = var31.canControlModule(var35);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var39 = var38.getServer();
    org.eclipse.wst.server.core.IModule[] var40 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var41 = var38.canControlModule(var40);
    boolean var42 = var31.canControlModule(var40);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var16, 1, var40, (java.lang.Integer)2);
    var16.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var49 = var48.getServer();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = var48.canControlModule(var50);
    boolean var52 = var46.canControlModule(var50);
    boolean var53 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var50);
    boolean var54 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var50);
    boolean var55 = var16.canControlModule(var50);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 2, var50, (java.lang.Integer)10);
    int var58 = var57.getOrder();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test165");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.CoreException var16 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(119)", (java.lang.Throwable)var15);
    java.lang.Throwable[] var17 = var16.getSuppressed();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var18 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("STOPPED", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var19 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test166");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(638)");

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test167");


    com.sap.netweaver.porta.core.NotAuthorizedException var3 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(1713)");
    com.sap.netweaver.porta.core.CoreException var4 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(1217)", (java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(469)", (java.lang.Throwable)var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test168");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    var0.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var4 = var3.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var5.canControlModule(var9);
    boolean var12 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var9);
    boolean var13 = var3.canControlModule(var9);
    boolean var14 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var9);
    boolean var15 = var0.canControlModule(var9);
    org.eclipse.wst.server.core.IServer var16 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var19 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var19.dispose();
    var19.dispose();
    var19.configurationChanged();
    org.eclipse.wst.server.core.IServerWorkingCopy var23 = var19.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var24 = var19.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    var25.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var28 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var28.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    var30.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var35 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var36 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var35);
    boolean var37 = var30.canControlModule(var35);
    var30.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = var42.canControlModule(var44);
    boolean var46 = var40.canControlModule(var44);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = var47.canControlModule(var49);
    boolean var51 = var40.canControlModule(var49);
    var40.dispose();
    var40.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var55 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var56 = var55.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    org.eclipse.wst.server.core.IModule[] var59 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var60 = var57.canControlModule(var59);
    boolean var61 = var55.canControlModule(var59);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var62 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var63 = var62.getServer();
    org.eclipse.wst.server.core.IModule[] var64 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var65 = var62.canControlModule(var64);
    boolean var66 = var55.canControlModule(var64);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var68 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var40, 1, var64, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var70 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var30, 2, var64, (java.lang.Integer)1);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var71 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var72 = var71.getServer();
    org.eclipse.wst.server.core.IModule[] var73 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var74 = var71.canControlModule(var73);
    var71.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var76 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var77 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var76);
    boolean var78 = var71.canControlModule(var76);
    org.eclipse.core.runtime.IStatus var79 = var28.canModifyModules(var64, var76);
    boolean var80 = var25.canControlModule(var76);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var81 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var82 = var81.getServer();
    org.eclipse.wst.server.core.IModule[] var83 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var84 = var81.canControlModule(var83);
    var81.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var86 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var87 = var86.getServer();
    org.eclipse.wst.server.core.IModule[] var88 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var89 = var86.canControlModule(var88);
    boolean var90 = var81.canControlModule(var88);
    org.eclipse.core.runtime.IStatus var91 = var19.canModifyModules(var76, var88);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var93 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 0, var88, (java.lang.Integer)100);
    java.lang.String var94 = var93.getLabel();
    org.eclipse.wst.server.core.TaskModel var95 = var93.getTaskModel();
    java.lang.String var96 = var93.getLabel();
    int var97 = var93.getKind();
    org.eclipse.wst.server.core.TaskModel var98 = var93.getTaskModel();
    int var99 = var93.getKind();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var94 + "' != '" + "Publish to server"+ "'", var94.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var96 + "' != '" + "Publish to server"+ "'", var96.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == 2);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test169");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(450)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test170");


    com.sap.netweaver.porta.core.mock.DeployManagerMock var0 = new com.sap.netweaver.porta.core.mock.DeployManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(1734)");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.Application[] var5 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var6 = var0.start(var5);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test171");


    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var10 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var10);
    java.lang.String var13 = var10.getEndpoint();
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var18 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var18, "MCK");
    var16.addSuppressed((java.lang.Throwable)var18);
    com.sap.netweaver.porta.core.NotAuthorizedException var22 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NoWSGateException var24 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var22, "STOPPED");
    var10.addSuppressed((java.lang.Throwable)var22);
    com.sap.netweaver.porta.core.NotAuthorizedException var26 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(151)", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.NotAuthorizedException var27 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(2199)", "Refresh SAP NetWeaver server state(862)", (java.lang.Throwable)var26);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test172");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyPassword();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyHost();
    java.lang.String var5 = var0.getProxyUser();
    java.lang.String var6 = var0.getProxyUser();
    java.lang.String var7 = var0.getNonProxyHosts();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test173");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var8 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test174");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("MCK", 0);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(376)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    com.sap.netweaver.porta.core.Application[] var7 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var8 = var2.undeploy(var7);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test175");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    var0.wakeUp(0L);
    var0.setName("Refresh SAP NetWeaver server state(366)");
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state(366)(3385)"+ "'", var10.equals("Refresh SAP NetWeaver server state(366)(3385)"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test176");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var6 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var8 = var7.getResult();
    boolean var9 = var7.isUser();
    boolean var10 = var7.shouldSchedule();
    var7.schedule();
    boolean var12 = var6.equals((java.lang.Object)var7);
    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var13 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var14 = var13.getChildFragments();
    var13.enter();
    var13.enter();
    boolean var17 = var6.equals((java.lang.Object)var13);
    java.lang.Class var18 = var6.getDeclaringClass();
    java.lang.String var19 = var6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Stopped"+ "'", var19.equals("Stopped"));

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test177");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(279)", 30);
    int var3 = var2.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test178");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", 2);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var6 = var3.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var3.enableDebugging();
    var3.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var10 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var10.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.mock.CoreModuleMock var13 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var16 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var17 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var16.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var17);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var16.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var27 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test179");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.String var10 = var3.getHost();
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(44)", (java.lang.Throwable)var3);
    java.lang.String var13 = var3.getHost();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var14 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var3);
    java.lang.Throwable[] var15 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test180");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    java.lang.String var4 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(1979)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(3387)"+ "'", var4.equals("Refresh SAP NetWeaver server state(3387)"));

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test181");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(183)", 1);
    var2.setCredentials("Refresh SAP NetWeaver server state(203)", "Refresh SAP NetWeaver server state(99)");
    java.io.File[] var6 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var7 = var2.upload(var6);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test182");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var1 = var0.getTaskModel();
    var0.updateChildFragments();
    boolean var3 = var0.hasComposite();
    var0.updateChildFragments();
    var0.exit();
    var0.enter();
    var0.exit();
    var0.updateChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test183");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.isUser();
    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var4 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var5 = var4.getChildFragments();
    var4.enter();
    boolean var7 = var4.hasComposite();
    java.util.List var8 = var4.getChildFragments();
    var4.exit();
    boolean var10 = var0.belongsTo((java.lang.Object)var4);
    var4.enter();
    var4.exit();
    org.eclipse.wst.server.core.TaskModel var13 = var4.getTaskModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test184");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    java.lang.String var10 = var7.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Stopped"+ "'", var8.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Stopped"+ "'", var9.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "STOPPED"+ "'", var10.equals("STOPPED"));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test185");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(2449)", 1);
    java.io.File[] var3 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var4 = var2.upload(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test186");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    var0.disableDebugging("Refresh SAP NetWeaver server state(538)");
    var0.disableDebugging("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(46)");
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    var0.disableDebugging("Refresh SAP NetWeaver server state(1558)");

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test187");


    com.sap.netweaver.porta.core.NotAuthorizedException var2 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(2035)");
    com.sap.netweaver.porta.core.NotAuthorizedException var3 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(2719)", (java.lang.Throwable)var2);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test188");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var4 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var5 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var8 = var0.getState();
    java.lang.String var9 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Stopped"+ "'", var9.equals("Stopped"));

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test189");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    var0.dispose();
    var0.dispose();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var5 = var0.getRuntimeWorkingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test190");


    com.sap.netweaver.porta.core.CoreException var2 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(1821)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(1157)", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test191");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var4 = var0.getRuntime();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
    java.lang.String[] var7 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var8 = var0.getRuntime();
    java.lang.String[] var9 = var0.getJ2EE14Classpath();
    java.lang.String[] var10 = var0.getJavaEE5Classpath();
    java.lang.String[] var11 = var0.getJavaEE5Classpath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var12 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test192");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(1450)", 30);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test193");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback var4 = new com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback();
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var8 = var0.enableDebugging();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var9 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var9.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var9.disableDebugging("");
    com.sap.netweaver.porta.core.DebugSessionInfo var14 = var9.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var15 = var9.enableDebugging();
    var9.disableDebugging("Refresh SAP NetWeaver server state(131)");
    com.sap.netweaver.porta.core.DebugSessionInfo var18 = var9.enableDebugging();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(168)");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test194");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 0);
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", 2);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var6 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var6.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var9 = var6.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var10 = var6.enableDebugging();
    var6.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var13 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var13.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.mock.CoreModuleMock var16 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var19 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var20 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var16.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var33 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(317)", 10);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var36 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var37 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var36.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var37);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var39 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var36.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var39);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var36.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var43);
    var33.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var43);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(366)");
    var33.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var48);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test195");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    var0.dispose();
    var0.dispose();
    java.lang.String[] var7 = var0.getJavaEE5Classpath();
    java.lang.String[] var8 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var9 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var10 = var0.getJ2EE14Classpath();
    java.lang.String[] var11 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test196");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("Refresh SAP NetWeaver server state(3348)");

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test197");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    int var3 = var0.getPriority();
    boolean var4 = var0.isSystem();
    var0.setUser(false);
    java.lang.Thread var7 = var0.getThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test198");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var2 = var0.getState();
    var0.disableDebugging("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(366)");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    int var6 = var5.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test199");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    var0.startup();
    var0.savePluginPreferences();
    boolean var7 = var0.isDebugging();
    var0.startup();
    boolean var9 = var0.isDebugging();
    var0.savePluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var12 = var0.isDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test200");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var5 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test201");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPassword();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyPort();
    java.lang.String var5 = var0.getProxyPort();
    java.lang.String var6 = var0.getProxyHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test202");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var1 = var0.getTaskModel();
    java.util.List var2 = var0.getChildFragments();
    var0.exit();
    boolean var4 = var0.hasComposite();
    boolean var5 = var0.hasComposite();
    org.eclipse.wst.server.core.TaskModel var6 = var0.getTaskModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test203");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(275)", 2);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var4 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var6 = var2.getDeployManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test204");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test205");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    var0.setDebugging(false);
    var0.savePluginPreferences();
    boolean var6 = var0.isDebugging();
    var0.internalInitializeDefaultPluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test206");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.getName();
    boolean var4 = var0.shouldSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(3393)"+ "'", var2.equals("Refresh SAP NetWeaver server state(3393)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var3.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test207");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var2 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.savePluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    var0.startup();
    var0.savePluginPreferences();
    org.osgi.framework.Bundle var8 = var0.getBundle();
    org.osgi.framework.Bundle var9 = var0.getBundle();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var10 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test208");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var3 = var1.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var5 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var5.dispose();
    var5.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = var8.canControlModule(var10);
    var8.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    boolean var17 = var8.canControlModule(var15);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    var18.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    boolean var27 = var18.canControlModule(var25);
    org.eclipse.core.runtime.IStatus var28 = var5.canModifyModules(var15, var25);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var30 = var29.getServer();
    org.eclipse.wst.server.core.IModule[] var31 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var32 = var29.canControlModule(var31);
    var29.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    boolean var38 = var29.canControlModule(var36);
    org.eclipse.core.runtime.IStatus var39 = var1.canModifyModules(var25, var36);
    boolean var40 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var39);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var42 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var44 = var43.getServer();
    org.eclipse.wst.server.core.IModule[] var45 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var46 = var43.canControlModule(var45);
    var43.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var48);
    boolean var50 = var43.canControlModule(var48);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    var51.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var56 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var57 = var56.getServer();
    org.eclipse.wst.server.core.IModule[] var58 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var59 = var56.canControlModule(var58);
    boolean var60 = var51.canControlModule(var58);
    org.eclipse.core.runtime.IStatus var61 = var42.canModifyModules(var48, var58);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var62 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var63 = var62.getResult();
    boolean var64 = var62.shouldSchedule();
    var62.wakeUp(100L);
    var62.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var70 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var71 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var72 = var71.getServer();
    org.eclipse.wst.server.core.IModule[] var73 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var74 = var71.canControlModule(var73);
    var71.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var76 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var77 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var76);
    boolean var78 = var71.canControlModule(var76);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var79 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var80 = var79.getServer();
    org.eclipse.wst.server.core.IModule[] var81 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var82 = var79.canControlModule(var81);
    var79.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var84 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var85 = var84.getServer();
    org.eclipse.wst.server.core.IModule[] var86 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var87 = var84.canControlModule(var86);
    boolean var88 = var79.canControlModule(var86);
    org.eclipse.core.runtime.IStatus var89 = var70.canModifyModules(var76, var86);
    var62.done(var89);
    org.eclipse.core.runtime.IStatus var91 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var61, var89);
    org.eclipse.core.runtime.IStatus var92 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var39, var89);
    boolean var93 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var92);
    boolean var94 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var92);
    boolean var95 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var92);
    boolean var96 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var92);
    boolean var97 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test209");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(650)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test210");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(2388)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test211");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(233)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var4 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1038)", (java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(627)", (java.lang.Throwable)var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test212");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    boolean var6 = var0.canControlModule(var4);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var0.canControlModule(var9);
    var0.dispose();
    var0.handleResourceChange();
    var0.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    boolean var22 = var16.canControlModule(var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    boolean var27 = var16.canControlModule(var25);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    var28.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var34 = var33.getServer();
    org.eclipse.wst.server.core.IModule[] var35 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var36 = var33.canControlModule(var35);
    boolean var37 = var28.canControlModule(var35);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = var39.canControlModule(var41);
    var39.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var44);
    boolean var46 = var39.canControlModule(var44);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var28, (-1), var44, (java.lang.Integer)10);
    boolean var49 = var16.canControlModule(var44);
    var16.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var53 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var53.dispose();
    var53.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var56 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var57 = var56.getServer();
    org.eclipse.wst.server.core.IModule[] var58 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var59 = var56.canControlModule(var58);
    var56.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var61 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var62 = var61.getServer();
    org.eclipse.wst.server.core.IModule[] var63 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var64 = var61.canControlModule(var63);
    boolean var65 = var56.canControlModule(var63);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var66 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var67 = var66.getServer();
    org.eclipse.wst.server.core.IModule[] var68 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var69 = var66.canControlModule(var68);
    var66.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var71 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var72 = var71.getServer();
    org.eclipse.wst.server.core.IModule[] var73 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var74 = var71.canControlModule(var73);
    boolean var75 = var66.canControlModule(var73);
    org.eclipse.core.runtime.IStatus var76 = var53.canModifyModules(var63, var73);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var78 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var16, 2, var63, (java.lang.Integer)(-1));
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var80 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, (-1), var63, (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test213");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var1 = var0.getTaskModel();
    java.util.List var2 = var0.getChildFragments();
    var0.exit();
    var0.exit();
    java.util.List var5 = var0.getChildFragments();
    var0.exit();
    java.util.List var7 = var0.getChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test214");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(965)", (-1));
    java.lang.String var3 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(965)"+ "'", var3.equals("Refresh SAP NetWeaver server state(965)"));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test215");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(538)", 1);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test216");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test217");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.wakeUp();
    java.lang.Thread var3 = var0.getThread();
    java.lang.String var4 = var0.toString();
    var0.wakeUp();
    java.lang.String var6 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(3396)"+ "'", var4.equals("Refresh SAP NetWeaver server state(3396)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(3396)"+ "'", var6.equals("Refresh SAP NetWeaver server state(3396)"));

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test218");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.String var7 = var5.toString();
    java.lang.Class var8 = var5.getDeclaringClass();
    com.sap.netweaver.porta.core.Credentials var11 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(233)", "Refresh SAP NetWeaver server state(323)");
    boolean var12 = var5.equals((java.lang.Object)"Refresh SAP NetWeaver server state(323)");
    java.lang.String var13 = var5.name();
    java.lang.String var14 = var5.toString();
    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var15 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var15.updateChildFragments();
    boolean var17 = var15.hasComposite();
    java.util.List var18 = var15.getChildFragments();
    var15.exit();
    boolean var20 = var5.equals((java.lang.Object)var15);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var22 = var21.getServer();
    org.eclipse.wst.server.core.IModule[] var23 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var24 = var21.canControlModule(var23);
    var21.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var26);
    boolean var28 = var21.canControlModule(var26);
    var21.handleResourceChange();
    org.eclipse.wst.server.core.IServer var30 = var21.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    var32.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var38 = var37.getServer();
    org.eclipse.wst.server.core.IModule[] var39 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var40 = var37.canControlModule(var39);
    boolean var41 = var32.canControlModule(var39);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var21, 30, var39, (java.lang.Integer)100);
    boolean var44 = var5.equals((java.lang.Object)100);
    java.lang.String var45 = var5.name();
    java.lang.Class var46 = var5.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "STOPPED"+ "'", var13.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Stopped"+ "'", var14.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "STOPPED"+ "'", var45.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test219");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    boolean var6 = var0.canControlModule(var4);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var0.canControlModule(var9);
    var0.dispose();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var15.canControlModule(var19);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    boolean var26 = var15.canControlModule(var24);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 1, var24, (java.lang.Integer)2);
    var0.handleResourceChange();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var33 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var34 = var33.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var35 = var33.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var37 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var37.dispose();
    var37.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = var40.canControlModule(var42);
    var40.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var45 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var46 = var45.getServer();
    org.eclipse.wst.server.core.IModule[] var47 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var48 = var45.canControlModule(var47);
    boolean var49 = var40.canControlModule(var47);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var50 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var51 = var50.getServer();
    org.eclipse.wst.server.core.IModule[] var52 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var53 = var50.canControlModule(var52);
    var50.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var55 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var56 = var55.getServer();
    org.eclipse.wst.server.core.IModule[] var57 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var58 = var55.canControlModule(var57);
    boolean var59 = var50.canControlModule(var57);
    org.eclipse.core.runtime.IStatus var60 = var37.canModifyModules(var47, var57);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var61 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var62 = var61.getServer();
    org.eclipse.wst.server.core.IModule[] var63 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var64 = var61.canControlModule(var63);
    var61.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var66 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var67 = var66.getServer();
    org.eclipse.wst.server.core.IModule[] var68 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var69 = var66.canControlModule(var68);
    boolean var70 = var61.canControlModule(var68);
    org.eclipse.core.runtime.IStatus var71 = var33.canModifyModules(var57, var68);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var73 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 0, var68, (java.lang.Integer)100);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var76 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var77 = var76.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var78 = var76.getServer();
    var76.configurationChanged();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var80 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var81 = var80.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var82 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var83 = var82.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var84 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var85 = var84.getServer();
    org.eclipse.wst.server.core.IModule[] var86 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var87 = var84.canControlModule(var86);
    boolean var88 = var82.canControlModule(var86);
    boolean var89 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var86);
    boolean var90 = var80.canControlModule(var86);
    org.eclipse.wst.server.core.IModule[] var91 = new org.eclipse.wst.server.core.IModule[] { };
    org.eclipse.core.runtime.IStatus var92 = var76.canModifyModules(var86, var91);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var94 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 100, var91, (java.lang.Integer)10);
    boolean var95 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == true);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test220");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.setSystem(false);
    boolean var8 = var0.shouldSchedule();
    var0.schedule();
    var0.setName("Refresh SAP NetWeaver server state(1908)");
    var0.schedule(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test221");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    int var3 = var0.getPriority();
    var0.setSystem(true);
    boolean var6 = var0.sleep();
    var0.setName("Refresh SAP NetWeaver server state(1791)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test222");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.getName();
    var0.schedule(100L);
    boolean var6 = var0.shouldSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(3399)"+ "'", var2.equals("Refresh SAP NetWeaver server state(3399)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var3.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test223");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var0.disableDebugging("Refresh SAP NetWeaver server state(119)");
    var0.disableDebugging("Refresh SAP NetWeaver server state(538)");
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var21 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var22 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var21.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var24 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var21.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test224");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var3 = var1.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var5 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var5.dispose();
    var5.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = var8.canControlModule(var10);
    var8.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    boolean var17 = var8.canControlModule(var15);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    var18.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    boolean var27 = var18.canControlModule(var25);
    org.eclipse.core.runtime.IStatus var28 = var5.canModifyModules(var15, var25);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var30 = var29.getServer();
    org.eclipse.wst.server.core.IModule[] var31 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var32 = var29.canControlModule(var31);
    var29.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    boolean var38 = var29.canControlModule(var36);
    org.eclipse.core.runtime.IStatus var39 = var1.canModifyModules(var25, var36);
    org.eclipse.wst.server.core.IServerWorkingCopy var40 = var1.getServerWorkingCopy();
    var1.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test225");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var10 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var10.dispose();
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    var13.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    boolean var22 = var13.canControlModule(var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    var23.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    boolean var32 = var23.canControlModule(var30);
    org.eclipse.core.runtime.IStatus var33 = var10.canModifyModules(var20, var30);
    boolean var34 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var33);
    var0.done(var33);
    var0.wakeUp();
    java.lang.Thread var37 = var0.getThread();
    var0.setUser(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(3400)"+ "'", var6.equals("Refresh SAP NetWeaver server state(3400)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test226");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var2 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.NotAuthorizedException: MCK");
    com.sap.netweaver.porta.core.CoreException var3 = new com.sap.netweaver.porta.core.CoreException("Publish module to the SAP NetWeaver server", (java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.NotAuthorizedException var4 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.ProxyException var8 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var10 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var10, "MCK");
    var8.addSuppressed((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var8);
    java.lang.String var15 = var8.getHost();
    com.sap.netweaver.porta.core.CoreException var16 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.NotAuthorizedException var17 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(44)", (java.lang.Throwable)var8);
    var3.addSuppressed((java.lang.Throwable)var8);
    java.lang.String var19 = var8.getHost();
    com.sap.netweaver.porta.core.NoWSGateException var21 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var8, "Refresh SAP NetWeaver server state(1360)");
    java.lang.String var22 = var21.getEndpoint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Refresh SAP NetWeaver server state(1360)"+ "'", var22.equals("Refresh SAP NetWeaver server state(1360)"));

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test227");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var5 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    java.lang.String[] var7 = var0.getJ2EE14Classpath();
    java.lang.String[] var8 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var9 = var0.getRuntime();
    java.lang.String[] var10 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var11 = var0.getRuntimeWorkingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test228");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Publish to server");

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test229");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(1435)", 10);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test230");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    var0.dispose();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJ2EE14Classpath();
    var0.dispose();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test231");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(2433)", "Refresh SAP NetWeaver server state(1322)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test232");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var2 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var3 = var2.getResult();
    boolean var4 = var2.shouldSchedule();
    var2.schedule();
    java.lang.String var6 = var2.toString();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var8 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    java.lang.String var9 = var8.toString();
    boolean var10 = var2.belongsTo((java.lang.Object)var8);
    java.lang.Throwable[] var11 = var8.getSuppressed();
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(318)", (java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var21 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var20);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var22 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var20);
    var8.addSuppressed((java.lang.Throwable)var22);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var24 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.CoreException: ", (java.lang.Throwable)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(3403)"+ "'", var6.equals("Refresh SAP NetWeaver server state(3403)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var9.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test233");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(325)");
    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    java.lang.String var8 = var3.getHost();
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var1.getSuppressed();
    java.lang.String var11 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(325)"+ "'", var11.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(325)"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test234");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPassword();
    java.lang.String var2 = var0.getProxyPort();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyUser();
    java.lang.String var5 = var0.getProxyHost();
    java.lang.String var6 = var0.getProxyHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test235");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    boolean var7 = var0.sleep();
    boolean var8 = var0.isBlocking();
    java.lang.String var9 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var9.equals("Refresh SAP NetWeaver server state"));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test236");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(2054)", 10);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test237");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    var0.dispose();
    java.lang.String[] var4 = var0.getJ2EE14Classpath();
    java.lang.String[] var5 = var0.getJavaEE5Classpath();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var7 = var0.getRuntimeWorkingCopy();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var8 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var9 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test238");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    boolean var5 = var0.isUser();
    var0.schedule();
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    java.lang.Thread var8 = var0.getThread();
    boolean var9 = var0.shouldSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test239");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.cancel();
    var0.schedule();
    java.lang.String var5 = var0.getName();
    int var6 = var0.getPriority();
    boolean var7 = var0.shouldRun();
    var0.join();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var5.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test240");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var3 = var0.getTaskModel();
    var0.updateChildFragments();
    java.util.List var5 = var0.getChildFragments();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test241");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    var0.schedule(0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test242");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    var0.disableDebugging("Refresh SAP NetWeaver server state(227)");
    var0.disableDebugging("Refresh SAP NetWeaver server state(621)");
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Publish module to the SAP NetWeaver server");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    var0.disableDebugging("Refresh SAP NetWeaver server state(369)");
    com.sap.netweaver.porta.core.ServerState var18 = var0.getState();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test243");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var3.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    java.lang.Throwable[] var13 = var12.getSuppressed();
    java.lang.String var14 = var12.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var15 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.NotAuthorizedException var16 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(14)(1918)", (java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.CoreException var17 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test244");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(249)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test245");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var4 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var5 = var0.getSaveStatus();
    var0.dispose();
    org.eclipse.core.runtime.IStatus[] var7 = var0.getSaveStatus();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(74)");
    java.lang.String var10 = var0.getErrorMessage();
    java.lang.String var11 = var0.getErrorMessage();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(965)");
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state(74)"+ "'", var10.equals("Refresh SAP NetWeaver server state(74)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Refresh SAP NetWeaver server state(74)"+ "'", var11.equals("Refresh SAP NetWeaver server state(74)"));

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test246");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var4 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var5 = var0.getSaveStatus();
    var0.dispose();
    org.eclipse.core.runtime.IStatus[] var7 = var0.getSaveStatus();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(74)");
    java.lang.String var10 = var0.getErrorMessage();
    org.eclipse.core.runtime.IStatus[] var11 = var0.getSaveStatus();
    java.lang.String var12 = var0.getErrorMessage();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(1468)");
    java.lang.String var15 = var0.getErrorMessage();
    var0.dispose();
    java.lang.String var17 = var0.getErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state(74)"+ "'", var10.equals("Refresh SAP NetWeaver server state(74)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Refresh SAP NetWeaver server state(74)"+ "'", var12.equals("Refresh SAP NetWeaver server state(74)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Refresh SAP NetWeaver server state(1468)"+ "'", var15.equals("Refresh SAP NetWeaver server state(1468)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Refresh SAP NetWeaver server state(1468)"+ "'", var17.equals("Refresh SAP NetWeaver server state(1468)"));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test247");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    boolean var2 = var0.isSystem();
    var0.schedule();
    boolean var4 = var0.sleep();
    java.lang.Thread var5 = var0.getThread();
    var0.schedule(10L);
    boolean var8 = var0.isBlocking();
    boolean var9 = var0.cancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test248");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyPort();
    java.lang.String var4 = var0.getProxyPassword();
    java.lang.String var5 = var0.getProxyPassword();
    java.lang.String var6 = var0.getProxyPort();
    java.lang.String var7 = var0.getProxyPort();
    java.lang.String var8 = var0.getProxyPort();
    java.lang.String var9 = var0.getProxyUser();
    java.lang.String var10 = var0.getProxyPort();
    java.lang.String var11 = var0.getProxyHost();
    java.lang.String var12 = var0.getProxyPort();
    java.lang.String var13 = var0.getProxyPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test249");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(221)", (-1));
    var2.setCredentials("Refresh SAP NetWeaver server state(3383)", "Refresh SAP NetWeaver server state(2638)");

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test250");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    var0.dispose();
    java.lang.String[] var5 = var0.getJavaEE5Classpath();
    var0.dispose();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var7 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test251");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var0.configurationChanged();
    org.eclipse.wst.server.core.IServer var2 = var0.getServer();
    org.eclipse.wst.server.core.IServer var3 = var0.getServer();
    org.eclipse.wst.server.core.IServer var4 = var0.getServer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test252");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var7 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var7.setDebugging(false);
    boolean var10 = var5.equals((java.lang.Object)false);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var11 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var12 = var11.shouldRun();
    var11.wakeUp(1L);
    boolean var15 = var5.equals((java.lang.Object)1L);
    int var16 = var5.ordinal();
    java.lang.String var17 = var5.toString();
    java.lang.String var18 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Stopped"+ "'", var17.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Stopped"+ "'", var18.equals("Stopped"));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test253");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var2 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var2.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var2.disableDebugging("");
    var2.disableDebugging("MCK");
    var2.disableDebugging("Refresh SAP NetWeaver server state(538)");
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(132)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    var0.disableDebugging("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(86)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test254");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var4 = var0.getRuntimeWorkingCopy();
    var0.dispose();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    var0.dispose();
    java.lang.String[] var8 = var0.getJ2EE14Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test255");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyPort();
    java.lang.String var4 = var0.getProxyPassword();
    java.lang.String var5 = var0.getProxyPassword();
    java.lang.String var6 = var0.getProxyPort();
    java.lang.String var7 = var0.getProxyPort();
    java.lang.String var8 = var0.getProxyPort();
    java.lang.String var9 = var0.getProxyPassword();
    java.lang.String var10 = var0.getProxyUser();
    java.lang.String var11 = var0.getProxyHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test256");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(1347)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test257");


    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var8 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var10 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var8, "MCK");
    var6.addSuppressed((java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NoWSGateException var17 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var14, "Refresh SAP NetWeaver server state(138)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var18 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(436)", (java.lang.Throwable)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(238)(1620)", "Refresh SAP NetWeaver server state(3147)", (java.lang.Throwable)var14);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test258");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var4);
    java.lang.String var10 = var4.getHost();
    java.lang.String var11 = var4.getHost();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(99)", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(1271)");
    var13.addSuppressed((java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var17 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(2073)", (java.lang.Throwable)var13);
    java.lang.Throwable[] var18 = var17.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test259");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var3 = var0.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var6 = var0.getDeployManager();
    java.net.InetSocketAddress var7 = var0.getHttpAccessPoint();
    
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

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test260");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(2036)", 10);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test261");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(934)", "com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.CoreException: ");

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test262");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var3 = var0.getDeployManager();
    java.net.InetSocketAddress var4 = var0.getHttpAccessPoint();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var6 = var0.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var7 = var0.getDeployManager();
    java.net.InetSocketAddress var8 = var0.getHttpAccessPoint();
    var0.ping();
    com.sap.netweaver.porta.core.DeployManager var10 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var11 = var0.getLifecycleManager();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test263");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var8 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(325)", (java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.ProxyException var13 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var15 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var17 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var18 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var19 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var17);
    java.lang.String var20 = var17.getEndpoint();
    var2.addSuppressed((java.lang.Throwable)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test264");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Publish module to the SAP NetWeaver server", 1);
    int var3 = var2.getPort();
    java.lang.String var4 = var2.getKey();
    java.lang.String var5 = var2.getKey();
    int var6 = var2.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var4.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var5.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test265");


    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var8 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.NoWSGateException var10 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var10);
    java.lang.String var12 = var10.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var15 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(249)", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var16 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(92)", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var17 = new com.sap.netweaver.porta.core.CoreException("com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(627)", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.NoWSGateException var19 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var17, "Refresh SAP NetWeaver server state(1262)");
    java.lang.String var20 = var19.getEndpoint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "MCK"+ "'", var12.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Refresh SAP NetWeaver server state(1262)"+ "'", var20.equals("Refresh SAP NetWeaver server state(1262)"));

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test266");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(1798)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test267");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(633)");
    java.lang.String var2 = var1.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host Refresh SAP NetWeaver server state(633) cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var2.equals("com.sap.netweaver.porta.core.ProxyException: The host Refresh SAP NetWeaver server state(633) cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test268");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(669)");

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test269");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(2247)", 1);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test270");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    var0.startup();
    boolean var6 = var0.isDebugging();
    var0.savePluginPreferences();
    var0.startup();
    var0.startup();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test271");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var0.disableDebugging("Refresh SAP NetWeaver server state(119)");
    var0.disableDebugging("Refresh SAP NetWeaver server state(538)");
    var0.disableDebugging("Refresh SAP NetWeaver server state(627)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test272");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(849)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(2505)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test273");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var11 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(366)", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(1501)", (java.lang.Throwable)var13);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test274");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    var0.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var5 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var6 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var5);
    boolean var7 = var0.canControlModule(var5);
    var0.handleResourceChange();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var12 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var12.dispose();
    var12.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    org.eclipse.wst.server.core.IModule[] var17 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var18 = var15.canControlModule(var17);
    var15.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var21 = var20.getServer();
    org.eclipse.wst.server.core.IModule[] var22 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var23 = var20.canControlModule(var22);
    boolean var24 = var15.canControlModule(var22);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    org.eclipse.wst.server.core.IModule[] var27 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var28 = var25.canControlModule(var27);
    var25.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    boolean var34 = var25.canControlModule(var32);
    org.eclipse.core.runtime.IStatus var35 = var12.canModifyModules(var22, var32);
    org.eclipse.wst.server.core.IServer var36 = var12.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var38 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = var39.canControlModule(var41);
    var39.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var44);
    boolean var46 = var39.canControlModule(var44);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = var47.canControlModule(var49);
    var47.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var53 = var52.getServer();
    org.eclipse.wst.server.core.IModule[] var54 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var55 = var52.canControlModule(var54);
    boolean var56 = var47.canControlModule(var54);
    org.eclipse.core.runtime.IStatus var57 = var38.canModifyModules(var44, var54);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var58 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var59 = var58.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var60 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var61 = var60.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var62 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var63 = var62.getServer();
    org.eclipse.wst.server.core.IModule[] var64 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var65 = var62.canControlModule(var64);
    boolean var66 = var60.canControlModule(var64);
    boolean var67 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var64);
    boolean var68 = var58.canControlModule(var64);
    org.eclipse.core.runtime.IStatus var69 = var12.canModifyModules(var44, var64);
    boolean var70 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var44);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var72 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 0, var44, (java.lang.Integer)30);
    org.eclipse.wst.server.core.IServer var73 = var0.getServer();
    org.eclipse.wst.server.core.IServer var74 = var0.getServer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test275");


    com.sap.netweaver.porta.core.mock.DeployManagerMock var0 = new com.sap.netweaver.porta.core.mock.DeployManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(1734)");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var5 = var0.getApplications();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test276");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var8 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    var9.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var14);
    boolean var16 = var9.canControlModule(var14);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    var17.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    boolean var26 = var17.canControlModule(var24);
    org.eclipse.core.runtime.IStatus var27 = var8.canModifyModules(var14, var24);
    var0.done(var27);
    java.lang.Thread var29 = var0.getThread();
    java.lang.String var30 = var0.toString();
    org.eclipse.core.runtime.IStatus var31 = var0.getResult();
    int var32 = var0.getPriority();
    java.lang.String var33 = var0.getName();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    var34.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = var39.canControlModule(var41);
    boolean var43 = var34.canControlModule(var41);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var45 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var46 = var45.getServer();
    org.eclipse.wst.server.core.IModule[] var47 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var48 = var45.canControlModule(var47);
    var45.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var50);
    boolean var52 = var45.canControlModule(var50);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var54 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var34, (-1), var50, (java.lang.Integer)10);
    org.eclipse.wst.server.core.TaskModel var55 = var54.getTaskModel();
    java.lang.String var56 = var54.getLabel();
    int var57 = var54.getOrder();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var58 = var0.compareTo((java.lang.Object)var57);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Refresh SAP NetWeaver server state(3414)"+ "'", var30.equals("Refresh SAP NetWeaver server state(3414)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var33.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "Publish to server"+ "'", var56.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test277");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(613)");

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test278");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.setName("Refresh SAP NetWeaver server state(184)");
    java.lang.Thread var4 = var0.getThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test279");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.enter();
    boolean var2 = var0.hasComposite();
    var0.updateChildFragments();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test280");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(44)");
    var0.initialize("Refresh SAP NetWeaver server state(131)");
    var0.initialize("Refresh SAP NetWeaver server state(131)");
    var0.initialize("Refresh SAP NetWeaver server state(296)");
    var0.initialize("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.initialize("Refresh SAP NetWeaver server state(1895)");
    var0.initialize("Refresh SAP NetWeaver server state(842)");

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test281");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(3092)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test282");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var1 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var2 = var0.getTabs();
    var0.dispose();
    var0.dispose();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var5 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var6 = var0.getTabs();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test283");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    boolean var5 = var0.shouldSchedule();
    var0.setSystem(false);
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "MCK");
    var9.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var15 = var11.getSuppressed();
    boolean var16 = var0.belongsTo((java.lang.Object)var15);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var18 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var19 = var18.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var20 = var18.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var22 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var22.dispose();
    var22.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    org.eclipse.wst.server.core.IModule[] var27 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var28 = var25.canControlModule(var27);
    var25.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    boolean var34 = var25.canControlModule(var32);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var36 = var35.getServer();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = var35.canControlModule(var37);
    var35.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = var40.canControlModule(var42);
    boolean var44 = var35.canControlModule(var42);
    org.eclipse.core.runtime.IStatus var45 = var22.canModifyModules(var32, var42);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = var46.canControlModule(var48);
    var46.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    boolean var55 = var46.canControlModule(var53);
    org.eclipse.core.runtime.IStatus var56 = var18.canModifyModules(var42, var53);
    boolean var57 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var56);
    var0.done(var56);
    boolean var59 = var0.isSystem();
    java.lang.String var60 = var0.getName();
    var0.wakeUp();
    var0.setUser(true);
    boolean var64 = var0.isSystem();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var60.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test284");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isUser();
    boolean var8 = var0.isBlocking();
    var0.wakeUp(1L);
    java.lang.String var11 = var0.toString();
    var0.wakeUp(1L);
    java.lang.Thread var14 = var0.getThread();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Refresh SAP NetWeaver server state(3419)"+ "'", var11.equals("Refresh SAP NetWeaver server state(3419)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test285");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(46)", "Refresh SAP NetWeaver server state(1661)");

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test286");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(1777)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test287");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(465)", 100);
    com.sap.netweaver.porta.core.mock.DeployManagerMock var3 = new com.sap.netweaver.porta.core.mock.DeployManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var6);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var6);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var9 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var9.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var9.disableDebugging("");
    var9.disableDebugging("MCK");
    var9.disableDebugging("Refresh SAP NetWeaver server state(538)");
    com.sap.netweaver.porta.core.DebugSessionInfo var18 = var9.enableDebugging();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(131)");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var24 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test288");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    var0.schedule();
    var0.join();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test289");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ");

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test290");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyPassword();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyPort();
    java.lang.String var5 = var0.getProxyPassword();
    java.lang.String var6 = var0.getProxyHost();
    java.lang.String var7 = var0.getProxyPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test291");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.setSystem(false);
    boolean var8 = var0.shouldSchedule();
    var0.setName("Refresh SAP NetWeaver server state(119)");
    boolean var11 = var0.shouldRun();
    boolean var12 = var0.sleep();
    var0.setPriority(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test292");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(238)", 2);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(46)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(154)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var11 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test293");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    var0.dispose();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var4 = var0.getRuntimeWorkingCopy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var5 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test294");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var2 = var1.getHost();
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var1, "Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var1);
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var9, "MCK");
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(46)", (java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var12);
    var1.addSuppressed((java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.CoreException var16 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Stopped"+ "'", var2.equals("Stopped"));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test295");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.enter();
    var0.enter();
    java.util.List var4 = var0.getChildFragments();
    var0.enter();
    var0.enter();
    boolean var7 = var0.hasComposite();
    boolean var8 = var0.hasComposite();
    var0.exit();
    java.util.List var10 = var0.getChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test296");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(3321)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test297");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var3 = var0.getTaskModel();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var5 = var0.getTaskModel();
    var0.updateChildFragments();
    boolean var7 = var0.hasComposite();
    boolean var8 = var0.hasComposite();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test298");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(152)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(2375)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test299");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.enter();
    var0.enter();
    java.util.List var4 = var0.getChildFragments();
    var0.enter();
    var0.exit();
    org.eclipse.wst.server.core.TaskModel var7 = var0.getTaskModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test300");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(14)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test301");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("MCK");
    com.sap.netweaver.porta.core.NotAuthorizedException var4 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var5 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(1122)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var6 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "Refresh SAP NetWeaver server state(296)");

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test302");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(1158)", 0);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.mock.CoreModuleMock var6 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var9);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host Refresh SAP NetWeaver server state(633) cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var18 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var18.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var18.disableDebugging("");
    var18.disableDebugging("MCK");
    var18.disableDebugging("Refresh SAP NetWeaver server state(538)");
    com.sap.netweaver.porta.core.DebugSessionInfo var27 = var18.enableDebugging();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(131)");
    var18.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var30);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var30);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(14)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test303");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(2795)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test304");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var6 = var3.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var10 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    boolean var12 = var6.equals((java.lang.Object)var10);
    com.sap.netweaver.porta.core.ProxyException var15 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var17 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var15, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var19 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var15, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var20 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var19);
    com.sap.netweaver.porta.core.ProxyException var22 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var24 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var22, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var26 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var22, "hi!");
    var20.addSuppressed((java.lang.Throwable)var26);
    boolean var28 = var6.equals((java.lang.Object)var26);
    com.sap.netweaver.porta.core.CoreException var29 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var26);
    com.sap.netweaver.porta.core.CoreException var30 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(184)", (java.lang.Throwable)var26);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var31 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(106)", (java.lang.Throwable)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test305");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    boolean var6 = var0.canControlModule(var4);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var0.canControlModule(var9);
    var0.dispose();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var15.canControlModule(var19);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    boolean var26 = var15.canControlModule(var24);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 1, var24, (java.lang.Integer)2);
    java.lang.String var29 = var28.getDescription();
    java.lang.String var30 = var28.getLabel();
    java.lang.String var31 = var28.getLabel();
    java.lang.String var32 = var28.getLabel();
    org.eclipse.wst.server.core.TaskModel var33 = var28.getTaskModel();
    org.eclipse.wst.server.core.TaskModel var34 = var28.getTaskModel();
    java.lang.String var35 = var28.getLabel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var29.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Publish to server"+ "'", var30.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Publish to server"+ "'", var31.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Publish to server"+ "'", var32.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Publish to server"+ "'", var35.equals("Publish to server"));

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test306");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK");

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test307");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(2790)", 1);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test308");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = var5.canControlModule(var7);
    boolean var9 = var0.canControlModule(var7);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var11 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var12 = var11.getServer();
    org.eclipse.wst.server.core.IModule[] var13 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var14 = var11.canControlModule(var13);
    var11.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var16);
    boolean var18 = var11.canControlModule(var16);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, (-1), var16, (java.lang.Integer)10);
    org.eclipse.wst.server.core.TaskModel var21 = var20.getTaskModel();
    java.lang.String var22 = var20.getLabel();
    int var23 = var20.getOrder();
    int var24 = var20.getKind();
    org.eclipse.wst.server.core.TaskModel var25 = var20.getTaskModel();
    org.eclipse.wst.server.core.TaskModel var26 = var20.getTaskModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Publish to server"+ "'", var22.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test309");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(732)", 10);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test310");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    boolean var6 = var0.canControlModule(var4);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var0.canControlModule(var9);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    var12.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var12.canControlModule(var19);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    var23.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var28 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var29 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var28);
    boolean var30 = var23.canControlModule(var28);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var12, (-1), var28, (java.lang.Integer)10);
    boolean var33 = var0.canControlModule(var28);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var36 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var37 = var36.getServer();
    org.eclipse.wst.server.core.IModule[] var38 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var39 = var36.canControlModule(var38);
    boolean var40 = var34.canControlModule(var38);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var42 = var41.getServer();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = var41.canControlModule(var43);
    boolean var45 = var34.canControlModule(var43);
    var34.dispose();
    var34.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var50 = var49.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    boolean var55 = var49.canControlModule(var53);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var56 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var57 = var56.getServer();
    org.eclipse.wst.server.core.IModule[] var58 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var59 = var56.canControlModule(var58);
    boolean var60 = var49.canControlModule(var58);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var62 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var34, 1, var58, (java.lang.Integer)2);
    boolean var63 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var58);
    boolean var64 = var0.canControlModule(var58);
    var0.dispose();
    org.eclipse.wst.server.core.IModule[] var67 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var68 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var67);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var70 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 10, var67, (java.lang.Integer)30);
    var0.handleResourceChange();
    org.eclipse.wst.server.core.IServer var72 = var0.getServer();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test311");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var3 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(132)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var9 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test312");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var10 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(317)", 10);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var11 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var11.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var16 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var16.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var19);
    var11.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var19);
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var19);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var19);
    com.sap.netweaver.porta.core.DebugSessionInfo var24 = var0.enableDebugging();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var25 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var25.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var25.disableDebugging("");
    var25.disableDebugging("MCK");
    var25.disableDebugging("Refresh SAP NetWeaver server state(106)");
    com.sap.netweaver.porta.core.mock.CoreModuleMock var34 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var34.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var37);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var34.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var41);
    var25.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var41);
    com.sap.netweaver.porta.core.mock.CoreModuleMock var44 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var47 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var48 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var47.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var48);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var47.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var52);
    var44.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var52);
    var25.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var52);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var52);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var57 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var57.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var57.disableDebugging("");
    var57.disableDebugging("MCK");
    var57.disableDebugging("Refresh SAP NetWeaver server state(106)");
    com.sap.netweaver.porta.core.mock.CoreModuleMock var66 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var69 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var66.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var69);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var73 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var66.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var73);
    var57.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var73);
    com.sap.netweaver.porta.core.ServerState var76 = var57.getState();
    com.sap.netweaver.porta.core.ServerState var77 = var57.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var80 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(131)");
    var57.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var80);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test313");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.String var7 = var5.toString();
    java.lang.Class var8 = var5.getDeclaringClass();
    com.sap.netweaver.porta.core.mock.ServerMock var9 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var9.ping();
    com.sap.netweaver.porta.core.LifecycleManager var11 = var9.getLifecycleManager();
    java.net.InetSocketAddress var12 = var9.getHttpAccessPoint();
    var9.ping();
    boolean var14 = var5.equals((java.lang.Object)var9);
    com.sap.netweaver.porta.core.DeployManager var15 = var9.getDeployManager();
    java.lang.String var16 = var9.getSystemName();
    java.lang.String var17 = var9.getSystemName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "MCK"+ "'", var16.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "MCK"+ "'", var17.equals("MCK"));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test314");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(534)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test315");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var5.canControlModule(var9);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    boolean var16 = var5.canControlModule(var14);
    var5.dispose();
    var5.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var21 = var20.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    boolean var26 = var20.canControlModule(var24);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = var27.canControlModule(var29);
    boolean var31 = var20.canControlModule(var29);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var5, 1, var29, (java.lang.Integer)2);
    var5.handleResourceChange();
    boolean var35 = var0.belongsTo((java.lang.Object)var5);
    int var36 = var0.getPriority();
    java.lang.String var37 = var0.getName();
    org.eclipse.core.runtime.IStatus var38 = var0.getResult();
    boolean var39 = var0.isSystem();
    org.eclipse.core.runtime.jobs.ISchedulingRule var40 = var0.getRule();
    int var41 = var0.getPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var37.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 30);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test316");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var5 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var7 = var6.getServer();
    org.eclipse.wst.server.core.IModule[] var8 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var9 = var6.canControlModule(var8);
    var6.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var11);
    boolean var13 = var6.canControlModule(var11);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    var14.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    boolean var23 = var14.canControlModule(var21);
    org.eclipse.core.runtime.IStatus var24 = var5.canModifyModules(var11, var21);
    boolean var25 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var11);
    boolean var26 = var0.canControlModule(var11);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    var28.handleResourceChange();
    var28.dispose();
    var28.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var35 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var36 = var28.canControlModule(var35);
    boolean var37 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var35);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 30, var35, (java.lang.Integer)30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test317");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(3139)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test318");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(2300)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test319");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(3281)", (-1));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test320");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("hi!");
    org.eclipse.core.runtime.IStatus[] var4 = var0.getSaveStatus();
    org.eclipse.core.runtime.IStatus[] var5 = var0.getSaveStatus();
    var0.setErrorMessage("com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(627)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test321");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(296)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var3 = var2.getHttpAccessPoint();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test322");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Stopped");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test323");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var1.dispose();
    var1.dispose();
    org.eclipse.wst.server.core.IServer var4 = var1.getServer();
    var1.dispose();
    var1.configurationChanged();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test324");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    var0.join();
    boolean var5 = var0.isBlocking();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var6 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var7 = var6.getResult();
    boolean var8 = var6.shouldSchedule();
    var6.wakeUp(100L);
    boolean var11 = var6.isSystem();
    java.lang.String var12 = var6.toString();
    var6.setName("Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var16 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var16.dispose();
    var16.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    var19.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = var24.canControlModule(var26);
    boolean var28 = var19.canControlModule(var26);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var30 = var29.getServer();
    org.eclipse.wst.server.core.IModule[] var31 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var32 = var29.canControlModule(var31);
    var29.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    boolean var38 = var29.canControlModule(var36);
    org.eclipse.core.runtime.IStatus var39 = var16.canModifyModules(var26, var36);
    boolean var40 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var39);
    var6.done(var39);
    var0.done(var39);
    boolean var43 = var0.cancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Refresh SAP NetWeaver server state(3426)"+ "'", var12.equals("Refresh SAP NetWeaver server state(3426)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test325");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(221)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ping();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test326");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    boolean var6 = var0.canControlModule(var4);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var0.canControlModule(var9);
    var0.dispose();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    var14.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    boolean var23 = var14.canControlModule(var21);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    org.eclipse.wst.server.core.IModule[] var27 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var28 = var25.canControlModule(var27);
    var25.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var30);
    boolean var32 = var25.canControlModule(var30);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var14, (-1), var30, (java.lang.Integer)10);
    boolean var35 = var0.canControlModule(var30);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var38 = var37.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = var39.canControlModule(var41);
    boolean var43 = var37.canControlModule(var41);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var45 = var44.getServer();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = var44.canControlModule(var46);
    boolean var48 = var37.canControlModule(var46);
    var37.dispose();
    var37.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    var51.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var56 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var57 = var56.getServer();
    org.eclipse.wst.server.core.IModule[] var58 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var59 = var56.canControlModule(var58);
    boolean var60 = var51.canControlModule(var58);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var62 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var63 = var62.getServer();
    org.eclipse.wst.server.core.IModule[] var64 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var65 = var62.canControlModule(var64);
    var62.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var67 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var68 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var67);
    boolean var69 = var62.canControlModule(var67);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var71 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var51, (-1), var67, (java.lang.Integer)10);
    boolean var72 = var37.canControlModule(var67);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var74 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 2, var67, (java.lang.Integer)1);
    int var75 = var74.getOrder();
    java.lang.String var76 = var74.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var76.equals("Publish module to the SAP NetWeaver server"));

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test327");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(1327)", "Refresh SAP NetWeaver server state(1170)");
    java.lang.String var3 = var2.getUser();
    java.lang.String var4 = var2.getPassword();
    java.lang.String var5 = var2.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(1327)"+ "'", var3.equals("Refresh SAP NetWeaver server state(1327)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(1170)"+ "'", var4.equals("Refresh SAP NetWeaver server state(1170)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(1327)"+ "'", var5.equals("Refresh SAP NetWeaver server state(1327)"));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test328");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    var0.disableDebugging("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test329");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var4 = var0.getRuntimeWorkingCopy();
    var0.dispose();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    java.lang.String[] var7 = var0.getJavaEE5Classpath();
    var0.dispose();
    java.lang.String[] var9 = var0.getJavaEE5Classpath();
    var0.dispose();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var11 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test330");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(275)");

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test331");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.String var7 = var5.toString();
    java.lang.Class var8 = var5.getDeclaringClass();
    com.sap.netweaver.porta.core.mock.ServerMock var9 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var9.ping();
    com.sap.netweaver.porta.core.LifecycleManager var11 = var9.getLifecycleManager();
    java.net.InetSocketAddress var12 = var9.getHttpAccessPoint();
    var9.ping();
    boolean var14 = var5.equals((java.lang.Object)var9);
    java.lang.String var15 = var9.getSystemName();
    com.sap.netweaver.porta.core.DeployManager var16 = var9.getDeployManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "MCK"+ "'", var15.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test332");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.ProxyException var14 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "MCK");
    var14.addSuppressed((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NotAuthorizedException var20 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var14);
    java.lang.String var21 = var14.getHost();
    com.sap.netweaver.porta.core.CoreException var22 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.CoreException var23 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NoWSGateException var25 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var23, "Refresh SAP NetWeaver server state(138)");
    var11.addSuppressed((java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var27 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1007)", (java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var30 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(183)");
    com.sap.netweaver.porta.core.NoWSGateException var32 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var30, "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)");
    com.sap.netweaver.porta.core.CoreException var33 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(356)", (java.lang.Throwable)var32);
    com.sap.netweaver.porta.core.NoWSGateException var35 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var33, "Refresh SAP NetWeaver server state(238)");
    var23.addSuppressed((java.lang.Throwable)var33);
    com.sap.netweaver.porta.core.CoreException var37 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(419)", (java.lang.Throwable)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(725)", (java.lang.Throwable)var37);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test333");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var4 = var0.getRuntimeWorkingCopy();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var6 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var7 = var0.getJ2EE14Classpath();
    java.lang.String[] var8 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var9 = var0.getRuntime();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var10 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test334");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    var0.join();
    boolean var5 = var0.isBlocking();
    boolean var6 = var0.sleep();
    var0.schedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test335");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(450)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test336");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    var0.ping();
    com.sap.netweaver.porta.core.DeployManager var4 = var0.getDeployManager();
    java.net.InetSocketAddress var5 = var0.getHttpAccessPoint();
    java.lang.String var6 = var0.getSystemName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "MCK"+ "'", var6.equals("MCK"));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test337");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.wakeUp();
    java.lang.Thread var3 = var0.getThread();
    java.lang.String var4 = var0.toString();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var5 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var6 = var5.getResult();
    boolean var7 = var5.isUser();
    org.eclipse.core.runtime.IStatus var8 = var5.getResult();
    var5.setPriority(30);
    var5.schedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var13 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    var14.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var19);
    boolean var21 = var14.canControlModule(var19);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    var22.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = var27.canControlModule(var29);
    boolean var31 = var22.canControlModule(var29);
    org.eclipse.core.runtime.IStatus var32 = var13.canModifyModules(var19, var29);
    boolean var33 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var32);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var35 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var36 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var37 = var36.getServer();
    org.eclipse.wst.server.core.IModule[] var38 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var39 = var36.canControlModule(var38);
    var36.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var41);
    boolean var43 = var36.canControlModule(var41);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var45 = var44.getServer();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = var44.canControlModule(var46);
    var44.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var50 = var49.getServer();
    org.eclipse.wst.server.core.IModule[] var51 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var52 = var49.canControlModule(var51);
    boolean var53 = var44.canControlModule(var51);
    org.eclipse.core.runtime.IStatus var54 = var35.canModifyModules(var41, var51);
    org.eclipse.core.runtime.IStatus var55 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var32, var54);
    var5.done(var54);
    boolean var57 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var54);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var58 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var59 = var58.getResult();
    boolean var60 = var58.isUser();
    org.eclipse.core.runtime.IStatus var61 = var58.getResult();
    var58.schedule(100L);
    var58.wakeUp(0L);
    boolean var66 = var58.sleep();
    org.eclipse.core.runtime.IStatus var67 = var58.getResult();
    org.eclipse.core.runtime.IStatus var68 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var54, var67);
    boolean var69 = var0.belongsTo((java.lang.Object)var68);
    boolean var70 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(3428)"+ "'", var4.equals("Refresh SAP NetWeaver server state(3428)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test338");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    var0.setDebugging(false);
    var0.startup();
    var0.setDebugging(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test339");


    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var8 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var10 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var8, "MCK");
    var6.addSuppressed((java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var6);
    java.lang.Throwable[] var13 = var12.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(230)", (java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(2727)", (java.lang.Throwable)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(3110)", "Refresh SAP NetWeaver server state(3393)", (java.lang.Throwable)var14);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test340");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(862)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test341");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(852)");

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test342");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(3288)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test343");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    var0.handleResourceChange();
    org.eclipse.wst.server.core.IServer var3 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    org.eclipse.wst.server.core.IServer var6 = var4.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    boolean var13 = var7.canControlModule(var11);
    boolean var14 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var11);
    boolean var15 = var4.canControlModule(var11);
    boolean var16 = var0.canControlModule(var11);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IServer var19 = var17.getServer();
    org.eclipse.wst.server.core.IServer var20 = var17.getServer();
    var17.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    var22.handleResourceChange();
    var22.dispose();
    var22.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var30 = var29.getServer();
    var29.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var34 = var33.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var36 = var35.getServer();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = var35.canControlModule(var37);
    boolean var39 = var33.canControlModule(var37);
    boolean var40 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var37);
    boolean var41 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var37);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var29, 30, var37, (java.lang.Integer)1);
    boolean var44 = var22.canControlModule(var37);
    boolean var45 = var17.canControlModule(var37);
    boolean var46 = var0.canControlModule(var37);
    boolean var47 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test344");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Publish module to the SAP NetWeaver server");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    com.sap.netweaver.porta.core.DebugSessionInfo var12 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test345");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var4 = var0.getRuntime();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    java.lang.String[] var7 = var0.getJ2EE14Classpath();
    var0.dispose();
    java.lang.String[] var9 = var0.getJavaEE5Classpath();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test346");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var7);
    java.lang.Throwable[] var13 = var7.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(448)", (java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(2199)", (java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var16 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(658)", (java.lang.Throwable)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test347");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    java.lang.Thread var11 = var0.getThread();
    int var12 = var0.getPriority();
    org.eclipse.core.runtime.jobs.ISchedulingRule var13 = var0.getRule();
    var0.wakeUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test348");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var6 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var7 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    boolean var9 = var3.equals((java.lang.Object)var7);
    com.sap.netweaver.porta.core.ProxyException var12 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var14 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var12, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var16 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var12, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var17 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.ProxyException var19 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var21 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var19, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var23 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var19, "hi!");
    var17.addSuppressed((java.lang.Throwable)var23);
    boolean var25 = var3.equals((java.lang.Object)var23);
    com.sap.netweaver.porta.core.ProxyException var29 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var30 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var29);
    com.sap.netweaver.porta.core.NoWSGateException var32 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var29, "MCK");
    com.sap.netweaver.porta.core.NotAuthorizedException var33 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(46)", (java.lang.Throwable)var32);
    boolean var34 = var3.equals((java.lang.Object)"Refresh SAP NetWeaver server state(46)");
    java.lang.String var35 = var3.toString();
    java.lang.String var36 = var3.toString();
    int var37 = var3.ordinal();
    java.lang.Class var38 = var3.getDeclaringClass();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Stopped"+ "'", var35.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "Stopped"+ "'", var36.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test349");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(106)", (-1));
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var4 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var6 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var7 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var8 = var2.getLifecycleManager();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test350");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.wakeUp(100L);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var8 = var7.getResult();
    boolean var9 = var7.isUser();
    org.eclipse.core.runtime.IStatus var10 = var7.getResult();
    var7.setPriority(30);
    var7.join();
    var7.schedule(10L);
    var7.setName("Refresh SAP NetWeaver server state(722)");
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var18 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var19 = var18.getResult();
    boolean var20 = var18.isUser();
    org.eclipse.core.runtime.IStatus var21 = var18.getResult();
    var18.setPriority(30);
    var18.schedule();
    java.lang.String var25 = var18.toString();
    var18.setName("Refresh SAP NetWeaver server state(232)");
    var18.wakeUp();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var29 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var30 = var29.getResult();
    boolean var31 = var29.isUser();
    org.eclipse.core.runtime.IStatus var32 = var29.getResult();
    var29.schedule(100L);
    boolean var35 = var29.cancel();
    boolean var36 = var29.shouldSchedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var37 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var38 = var37.getState();
    int var39 = var37.getPriority();
    boolean var40 = var37.isSystem();
    boolean var41 = var29.belongsTo((java.lang.Object)var37);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var43 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var45 = var44.getServer();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = var44.canControlModule(var46);
    var44.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var49);
    boolean var51 = var44.canControlModule(var49);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var53 = var52.getServer();
    org.eclipse.wst.server.core.IModule[] var54 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var55 = var52.canControlModule(var54);
    var52.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    org.eclipse.wst.server.core.IModule[] var59 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var60 = var57.canControlModule(var59);
    boolean var61 = var52.canControlModule(var59);
    org.eclipse.core.runtime.IStatus var62 = var43.canModifyModules(var49, var59);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var63 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var64 = var63.getResult();
    boolean var65 = var63.shouldSchedule();
    var63.wakeUp(100L);
    var63.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var71 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var72 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var73 = var72.getServer();
    org.eclipse.wst.server.core.IModule[] var74 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var75 = var72.canControlModule(var74);
    var72.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var77 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var78 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var77);
    boolean var79 = var72.canControlModule(var77);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var80 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var81 = var80.getServer();
    org.eclipse.wst.server.core.IModule[] var82 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var83 = var80.canControlModule(var82);
    var80.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var85 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var86 = var85.getServer();
    org.eclipse.wst.server.core.IModule[] var87 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var88 = var85.canControlModule(var87);
    boolean var89 = var80.canControlModule(var87);
    org.eclipse.core.runtime.IStatus var90 = var71.canModifyModules(var77, var87);
    var63.done(var90);
    org.eclipse.core.runtime.IStatus var92 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var62, var90);
    boolean var93 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var92);
    var37.done(var92);
    boolean var95 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var92);
    var18.done(var92);
    var7.done(var92);
    var0.done(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Refresh SAP NetWeaver server state(3435)"+ "'", var25.equals("Refresh SAP NetWeaver server state(3435)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test351");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var9.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(230)", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var11);
    java.lang.Throwable[] var13 = var12.getSuppressed();
    com.sap.netweaver.porta.core.ProxyException var15 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(2055)");
    var12.addSuppressed((java.lang.Throwable)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test352");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule();
    boolean var7 = var0.isSystem();
    boolean var8 = var0.isSystem();
    var0.join();
    var0.wakeUp();
    boolean var11 = var0.cancel();
    var0.schedule();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPriority(1);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test353");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    var0.dispose();
    var0.dispose();
    java.lang.String[] var7 = var0.getJavaEE5Classpath();
    java.lang.String[] var8 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var9 = var0.getRuntimeWorkingCopy();
    var0.dispose();
    java.lang.String[] var11 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var12 = var0.getRuntime();
    java.lang.String[] var13 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test354");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyPassword();
    java.lang.String var3 = var0.getProxyHost();
    java.lang.String var4 = var0.getProxyUser();
    java.lang.String var5 = var0.getProxyUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test355");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    boolean var7 = var0.isSystem();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var9 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var10 = var9.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var11 = var9.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var13 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var13.dispose();
    var13.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    org.eclipse.wst.server.core.IModule[] var18 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var19 = var16.canControlModule(var18);
    var16.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var22 = var21.getServer();
    org.eclipse.wst.server.core.IModule[] var23 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var24 = var21.canControlModule(var23);
    boolean var25 = var16.canControlModule(var23);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var26 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var27 = var26.getServer();
    org.eclipse.wst.server.core.IModule[] var28 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var29 = var26.canControlModule(var28);
    var26.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var31 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var32 = var31.getServer();
    org.eclipse.wst.server.core.IModule[] var33 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var34 = var31.canControlModule(var33);
    boolean var35 = var26.canControlModule(var33);
    org.eclipse.core.runtime.IStatus var36 = var13.canModifyModules(var23, var33);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var38 = var37.getServer();
    org.eclipse.wst.server.core.IModule[] var39 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var40 = var37.canControlModule(var39);
    var37.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = var42.canControlModule(var44);
    boolean var46 = var37.canControlModule(var44);
    org.eclipse.core.runtime.IStatus var47 = var9.canModifyModules(var33, var44);
    boolean var48 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var47);
    var0.done(var47);
    org.eclipse.core.runtime.IStatus var50 = var0.getResult();
    var0.setUser(true);
    var0.schedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test356");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(2239)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test357");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    org.eclipse.core.runtime.ILog var5 = var0.getLog();
    boolean var6 = var0.isDebugging();
    var0.startup();
    var0.setDebugging(true);
    org.eclipse.core.runtime.ILog var10 = var0.getLog();
    boolean var11 = var0.isDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test358");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    java.lang.String var2 = var0.toString();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.wakeUp(10L);
    var0.setName("Refresh SAP NetWeaver server state(3404)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(3441)"+ "'", var2.equals("Refresh SAP NetWeaver server state(3441)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test359");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(656)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test360");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("MCK", 0);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(376)");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    com.sap.netweaver.porta.core.mock.CoreModuleMock var14 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var14.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var17);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var14.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var24 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var24.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var24.disableDebugging("");
    var24.disableDebugging("MCK");
    var24.disableDebugging("Refresh SAP NetWeaver server state(538)");
    var24.disableDebugging("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(46)");
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "");
    var24.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var37);
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var37);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var37);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test361");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(3147)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test362");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var5 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    java.lang.String[] var7 = var0.getJavaEE5Classpath();
    java.lang.String[] var8 = var0.getJ2EE14Classpath();
    var0.dispose();
    java.lang.String[] var10 = var0.getJavaEE5Classpath();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test363");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("Refresh SAP NetWeaver server state(2035)");
    var0.disableDebugging("Refresh SAP NetWeaver server state(2703)");

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test364");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    boolean var6 = var0.canControlModule(var4);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    boolean var11 = var0.canControlModule(var9);
    var0.dispose();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var15.canControlModule(var19);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var23 = var22.getServer();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = var22.canControlModule(var24);
    boolean var26 = var15.canControlModule(var24);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 1, var24, (java.lang.Integer)2);
    java.lang.String var29 = var28.getDescription();
    java.lang.String var30 = var28.getLabel();
    java.lang.String var31 = var28.getDescription();
    java.lang.String var32 = var28.getDescription();
    int var33 = var28.getOrder();
    java.lang.String var34 = var28.getLabel();
    java.lang.String var35 = var28.getLabel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var29.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "Publish to server"+ "'", var30.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var31.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var32.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "Publish to server"+ "'", var34.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "Publish to server"+ "'", var35.equals("Publish to server"));

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test365");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    var0.schedule(0L);
    java.lang.String var7 = var0.getName();
    var0.wakeUp(10L);
    var0.setPriority(10);
    var0.wakeUp(10L);
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var7.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Refresh SAP NetWeaver server state(3443)"+ "'", var14.equals("Refresh SAP NetWeaver server state(3443)"));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test366");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(1329)", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(2738)", "com.sap.netweaver.porta.core.ProxyException: The host Refresh SAP NetWeaver server state(656) cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test367");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(3027)", "Refresh SAP NetWeaver server state(732)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test368");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(14)");
    java.lang.Thread var9 = var0.getThread();
    int var10 = var0.getState();
    var0.setSystem(false);
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(3445)"+ "'", var6.equals("Refresh SAP NetWeaver server state(3445)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Refresh SAP NetWeaver server state(14)(3445)"+ "'", var13.equals("Refresh SAP NetWeaver server state(14)(3445)"));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test369");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var2 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var1);
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var1, "Refresh SAP NetWeaver server state(487)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var4);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test370");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(650)");

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test371");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(805)", "Refresh SAP NetWeaver server state(2693)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test372");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(356)");
    com.sap.netweaver.porta.core.NotAuthorizedException var2 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var1);
    com.sap.netweaver.porta.core.CoreException var3 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var1);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test373");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    org.eclipse.wst.server.core.IModule[] var6 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var7 = var4.canControlModule(var6);
    boolean var8 = var2.canControlModule(var6);
    boolean var9 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var6);
    boolean var10 = var0.canControlModule(var6);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    var12.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var17 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var18 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var17);
    boolean var19 = var12.canControlModule(var17);
    var12.handleResourceChange();
    org.eclipse.wst.server.core.IServer var21 = var12.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    var23.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    boolean var32 = var23.canControlModule(var30);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var12, 30, var30, (java.lang.Integer)100);
    boolean var35 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var30);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var37 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 0, var30, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var42 = var41.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var44 = var43.getServer();
    org.eclipse.wst.server.core.IModule[] var45 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var46 = var43.canControlModule(var45);
    boolean var47 = var41.canControlModule(var45);
    boolean var48 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var45);
    boolean var49 = var39.canControlModule(var45);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    var51.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var56 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var57 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var56);
    boolean var58 = var51.canControlModule(var56);
    var51.handleResourceChange();
    org.eclipse.wst.server.core.IServer var60 = var51.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var62 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var63 = var62.getServer();
    org.eclipse.wst.server.core.IModule[] var64 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var65 = var62.canControlModule(var64);
    var62.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var67 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var68 = var67.getServer();
    org.eclipse.wst.server.core.IModule[] var69 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var70 = var67.canControlModule(var69);
    boolean var71 = var62.canControlModule(var69);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var73 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var51, 30, var69, (java.lang.Integer)100);
    boolean var74 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var69);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var76 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var39, 0, var69, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var78 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 1, var69, (java.lang.Integer)1);
    org.eclipse.wst.server.core.TaskModel var79 = var78.getTaskModel();
    int var80 = var78.getKind();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 2);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test374");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var2 = var0.getRuntime();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var6 = var0.getRuntime();
    java.lang.String[] var7 = var0.getJavaEE5Classpath();
    java.lang.String[] var8 = var0.getJavaEE5Classpath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var9 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test375");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.ProxyException var14 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "MCK");
    var14.addSuppressed((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NotAuthorizedException var20 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var14);
    java.lang.String var21 = var14.getHost();
    com.sap.netweaver.porta.core.CoreException var22 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.CoreException var23 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NoWSGateException var25 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var23, "Refresh SAP NetWeaver server state(138)");
    var11.addSuppressed((java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var27 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1007)", (java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var30 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(183)");
    com.sap.netweaver.porta.core.NoWSGateException var32 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var30, "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)");
    com.sap.netweaver.porta.core.CoreException var33 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(356)", (java.lang.Throwable)var32);
    com.sap.netweaver.porta.core.NoWSGateException var35 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var33, "Refresh SAP NetWeaver server state(238)");
    var23.addSuppressed((java.lang.Throwable)var33);
    com.sap.netweaver.porta.core.NotAuthorizedException var37 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(1365)", (java.lang.Throwable)var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(2734)", (java.lang.Throwable)var33);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test376");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(862)", 0);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var3.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var8 = var3.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var9 = var3.enableDebugging();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var12 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var12.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var15);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var15);
    var3.disableDebugging("Refresh SAP NetWeaver server state(119)");
    var3.disableDebugging("Refresh SAP NetWeaver server state(538)");
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "hi!");
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    com.sap.netweaver.porta.core.Application[] var27 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var28 = var2.stop(var27);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test377");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    var0.setUser(false);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var9 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    org.eclipse.wst.server.core.IModule[] var12 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var13 = var10.canControlModule(var12);
    var10.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var15);
    boolean var17 = var10.canControlModule(var15);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    var18.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    boolean var27 = var18.canControlModule(var25);
    org.eclipse.core.runtime.IStatus var28 = var9.canModifyModules(var15, var25);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var29 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var30 = var29.getResult();
    boolean var31 = var29.shouldSchedule();
    var29.wakeUp(100L);
    var29.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var37 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var39 = var38.getServer();
    org.eclipse.wst.server.core.IModule[] var40 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var41 = var38.canControlModule(var40);
    var38.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var43);
    boolean var45 = var38.canControlModule(var43);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = var46.canControlModule(var48);
    var46.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    boolean var55 = var46.canControlModule(var53);
    org.eclipse.core.runtime.IStatus var56 = var37.canModifyModules(var43, var53);
    var29.done(var56);
    org.eclipse.core.runtime.IStatus var58 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var28, var56);
    boolean var59 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var56);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var61 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var61.dispose();
    var61.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var64 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var65 = var64.getServer();
    org.eclipse.wst.server.core.IModule[] var66 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var67 = var64.canControlModule(var66);
    var64.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var69 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var70 = var69.getServer();
    org.eclipse.wst.server.core.IModule[] var71 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var72 = var69.canControlModule(var71);
    boolean var73 = var64.canControlModule(var71);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var74 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var75 = var74.getServer();
    org.eclipse.wst.server.core.IModule[] var76 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var77 = var74.canControlModule(var76);
    var74.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var79 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var80 = var79.getServer();
    org.eclipse.wst.server.core.IModule[] var81 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var82 = var79.canControlModule(var81);
    boolean var83 = var74.canControlModule(var81);
    org.eclipse.core.runtime.IStatus var84 = var61.canModifyModules(var71, var81);
    boolean var85 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var84);
    org.eclipse.core.runtime.IStatus var86 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var56, var84);
    var0.done(var56);
    boolean var88 = var0.isBlocking();
    boolean var89 = var0.isSystem();
    java.lang.Thread var90 = var0.getThread();
    int var91 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == 0);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test378");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(660)", (-1));
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.stop(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test379");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    var0.setDebugging(false);
    var0.setDebugging(true);
    var0.setDebugging(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test380");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(695)");
    com.sap.netweaver.porta.core.NoWSGateException var3 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var1, "com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(176)");

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test381");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var2 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var5 = var0.isDebugging();
    var0.setDebugging(false);
    boolean var8 = var0.isDebugging();
    boolean var9 = var0.isDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test382");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.sleep();
    var0.setName("Refresh SAP NetWeaver server state(280)");
    boolean var7 = var0.isSystem();
    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var10 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(2127)", (-1));
    boolean var11 = var0.belongsTo((java.lang.Object)"Refresh SAP NetWeaver server state(2127)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test383");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(2286)", 30);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test384");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var6 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(132)", (java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(138)", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(366)", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var9);
    java.lang.String var13 = var12.toString();
    java.lang.String var14 = var12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(132)"+ "'", var13.equals("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(132)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(132)"+ "'", var14.equals("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(132)"));

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test385");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(true);
    org.eclipse.wst.server.core.IServer var2 = var1.getServer();
    var1.configurationChanged();
    var1.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test386");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    var0.enter();
    org.eclipse.wst.server.core.TaskModel var2 = var0.getTaskModel();
    boolean var3 = var0.hasComposite();
    org.eclipse.wst.server.core.TaskModel var4 = var0.getTaskModel();
    var0.updateChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test387");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(3240)");

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test388");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.ProxyException var14 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "MCK");
    var14.addSuppressed((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NotAuthorizedException var20 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var14);
    java.lang.Throwable[] var21 = var14.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var23 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var14, "hi!");
    java.lang.String var24 = var23.getEndpoint();
    com.sap.netweaver.porta.core.NotAuthorizedException var25 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var23);
    var10.addSuppressed((java.lang.Throwable)var25);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var27 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var25);
    com.sap.netweaver.porta.core.NotAuthorizedException var28 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(321)", (java.lang.Throwable)var25);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var29 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test389");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(1509)", 100);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test390");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    boolean var8 = var0.isBlocking();
    boolean var9 = var0.isBlocking();
    org.eclipse.core.runtime.jobs.ISchedulingRule var10 = var0.getRule();
    com.sap.netweaver.porta.core.mock.ServerMock var11 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var11.ping();
    com.sap.netweaver.porta.core.LifecycleManager var13 = var11.getLifecycleManager();
    java.net.InetSocketAddress var14 = var11.getHttpAccessPoint();
    com.sap.netweaver.porta.core.DeployManager var15 = var11.getDeployManager();
    var11.ping();
    boolean var17 = var0.belongsTo((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test391");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(2795)", 0);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.stop(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test392");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(1007)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test393");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    int var8 = var0.getPriority();
    var0.wakeUp();
    boolean var10 = var0.isSystem();
    org.eclipse.core.runtime.jobs.ISchedulingRule var11 = var0.getRule();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPriority(100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test394");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    var0.savePluginPreferences();
    boolean var4 = var0.isDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test395");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(802)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.ping();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test396");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    var0.join();
    boolean var5 = var0.isBlocking();
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(152)");
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(1016)", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test397");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback var4 = new com.sap.netweaver.porta.mon.LifecycleManagerAuthenticationCallback();
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(176)", 100);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var10 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var10.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var10.disableDebugging("");
    var10.disableDebugging("MCK");
    var10.disableDebugging("Refresh SAP NetWeaver server state(538)");
    com.sap.netweaver.porta.core.DebugSessionInfo var19 = var10.enableDebugging();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(131)");
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    com.sap.netweaver.porta.core.DebugSessionInfo var26 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test398");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var0.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var0.getServerWorkingCopy();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var7 = var6.getServer();
    org.eclipse.wst.server.core.IModule[] var8 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var9 = var6.canControlModule(var8);
    boolean var10 = var4.canControlModule(var8);
    boolean var11 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var8);
    boolean var12 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var13 = var0.getChildModules(var8);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test399");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var4 = var0.getErrorMessage();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(46)");
    org.eclipse.core.runtime.IStatus[] var7 = var0.getSaveStatus();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(119)");
    java.lang.String var10 = var0.getErrorMessage();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(2795)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state(119)"+ "'", var10.equals("Refresh SAP NetWeaver server state(119)"));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test400");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(14)");
    var0.initialize("Refresh SAP NetWeaver server state(325)");
    var0.initialize("Refresh SAP NetWeaver server state(242)");
    var0.initialize("STOPPED");

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test401");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    boolean var5 = var0.shouldSchedule();
    var0.setSystem(false);
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "MCK");
    var9.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var15 = var11.getSuppressed();
    boolean var16 = var0.belongsTo((java.lang.Object)var15);
    var0.setName("Refresh SAP NetWeaver server state(99)");
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var20 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var22 = var21.getServer();
    org.eclipse.wst.server.core.IModule[] var23 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var24 = var21.canControlModule(var23);
    var21.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var26);
    boolean var28 = var21.canControlModule(var26);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var30 = var29.getServer();
    org.eclipse.wst.server.core.IModule[] var31 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var32 = var29.canControlModule(var31);
    var29.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    boolean var38 = var29.canControlModule(var36);
    org.eclipse.core.runtime.IStatus var39 = var20.canModifyModules(var26, var36);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var40 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var41 = var40.getResult();
    boolean var42 = var40.shouldSchedule();
    var40.wakeUp(100L);
    var40.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var48 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var50 = var49.getServer();
    org.eclipse.wst.server.core.IModule[] var51 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var52 = var49.canControlModule(var51);
    var49.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var54 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var55 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var54);
    boolean var56 = var49.canControlModule(var54);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    org.eclipse.wst.server.core.IModule[] var59 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var60 = var57.canControlModule(var59);
    var57.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var62 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var63 = var62.getServer();
    org.eclipse.wst.server.core.IModule[] var64 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var65 = var62.canControlModule(var64);
    boolean var66 = var57.canControlModule(var64);
    org.eclipse.core.runtime.IStatus var67 = var48.canModifyModules(var54, var64);
    var40.done(var67);
    org.eclipse.core.runtime.IStatus var69 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var39, var67);
    var0.done(var39);
    boolean var71 = var0.sleep();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var72 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var72.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var75 = var72.getState();
    java.lang.String var76 = var75.name();
    java.lang.String var77 = var75.toString();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var78 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var79 = var78.getResult();
    boolean var80 = var78.shouldSchedule();
    boolean var81 = var78.cancel();
    org.eclipse.core.runtime.jobs.ISchedulingRule var82 = var78.getRule();
    java.lang.String var83 = var78.toString();
    boolean var84 = var78.sleep();
    boolean var85 = var78.isSystem();
    boolean var86 = var75.equals((java.lang.Object)var85);
    boolean var87 = var0.belongsTo((java.lang.Object)var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "STOPPED"+ "'", var76.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "Stopped"+ "'", var77.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "Refresh SAP NetWeaver server state(3458)"+ "'", var83.equals("Refresh SAP NetWeaver server state(3458)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test402");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.updateChildFragments();
    boolean var3 = var0.hasComposite();
    org.eclipse.wst.server.core.TaskModel var4 = var0.getTaskModel();
    var0.exit();
    var0.updateChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test403");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 2);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var5 = var2.getDeployManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test404");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(69)", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(187)", "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ");
    var2.setCredentials("Refresh SAP NetWeaver server state(86)", "Refresh SAP NetWeaver server state(152)");
    var2.setCredentials("Refresh SAP NetWeaver server state(1115)", "Refresh SAP NetWeaver server state(318)");
    java.io.File[] var12 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var13 = var2.upload(var12);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test405");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(366)", "Refresh SAP NetWeaver server state(14)(2136)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test406");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(587)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test407");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK");

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test408");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(2486)", "Refresh SAP NetWeaver server state(587)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test409");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", 2);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var6 = var3.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var7 = var3.enableDebugging();
    var3.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var10 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var10.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.mock.CoreModuleMock var13 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var16 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var17 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var16.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var17);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var16.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    var10.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test410");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var15 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var16 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var15);
    var2.addSuppressed((java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.CoreException var18 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var18, "Refresh SAP NetWeaver server state(2858)");

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test411");


    com.sap.netweaver.porta.core.ProxyException var8 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.NoWSGateException var11 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var8, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var11);
    java.lang.String var13 = var11.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var14 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("", (java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var16 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(249)", (java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var17 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(92)", (java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.CoreException var18 = new com.sap.netweaver.porta.core.CoreException("com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(627)", (java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var19 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(2054)", (java.lang.Throwable)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "MCK"+ "'", var13.equals("MCK"));

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test412");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var6 = var0.getRuntime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test413");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    org.eclipse.core.runtime.ILog var5 = var0.getLog();
    org.eclipse.core.runtime.ILog var6 = var0.getLog();
    var0.internalInitializeDefaultPluginPreferences();
    var0.startup();
    org.eclipse.core.runtime.ILog var9 = var0.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test414");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    var0.enter();
    var0.enter();
    var0.enter();
    boolean var4 = var0.hasComposite();
    var0.updateChildFragments();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var7 = var0.getTaskModel();
    java.util.List var8 = var0.getChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test415");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    org.eclipse.core.runtime.jobs.ISchedulingRule var7 = var0.getRule();
    var0.setName("Refresh SAP NetWeaver server state(469)");
    var0.wakeUp(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test416");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state", 30);
    com.sap.netweaver.porta.core.Application[] var3 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var4 = var2.start(var3);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test417");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    boolean var7 = var0.isSystem();
    int var8 = var0.getPriority();
    org.eclipse.core.runtime.jobs.ISchedulingRule var9 = var0.getRule();
    int var10 = var0.getPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test418");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(2881)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test419");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var3 = var0.getLifecycleManager();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var6 = var0.getDeployManager();
    java.lang.String var7 = var0.getSystemName();
    var0.ping();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "MCK"+ "'", var7.equals("MCK"));

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test420");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(3383)", "Refresh SAP NetWeaver server state(321)");

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test421");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(2733)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test422");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(false);
    var0.setDebugging(true);
    org.eclipse.core.runtime.ILog var9 = var0.getLog();
    boolean var10 = var0.isDebugging();
    org.osgi.framework.Bundle var11 = var0.getBundle();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test423");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.wakeUp();
    java.lang.Thread var3 = var0.getThread();
    java.lang.String var4 = var0.toString();
    var0.wakeUp();
    boolean var6 = var0.cancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(3464)"+ "'", var4.equals("Refresh SAP NetWeaver server state(3464)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test424");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    var0.dispose();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var7 = var0.getRuntime();
    java.lang.String[] var8 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var9 = var0.getRuntimeWorkingCopy();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var10 = var0.getRuntimeWorkingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test425");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(448)", "com.sap.netweaver.porta.core.AuthenticationRefusedException: ");

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test426");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var3.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var18 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var18, "MCK");
    var16.addSuppressed((java.lang.Throwable)var18);
    com.sap.netweaver.porta.core.NotAuthorizedException var22 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var23 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!", (java.lang.Throwable)var22);
    var3.addSuppressed((java.lang.Throwable)var23);
    java.lang.Throwable[] var25 = var23.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(123)", (java.lang.Throwable)var23);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test427");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var3 = var0.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var6 = var0.getDeployManager();
    var0.ping();
    java.net.InetSocketAddress var8 = var0.getHttpAccessPoint();
    
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
    assertNotNull(var8);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test428");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    java.lang.String var2 = var0.toString();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var3 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var3.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var5 = var3.getLog();
    var3.savePluginPreferences();
    boolean var7 = var0.belongsTo((java.lang.Object)var3);
    var3.startup();
    var3.savePluginPreferences();
    org.osgi.framework.Bundle var10 = var3.getBundle();
    boolean var11 = var3.isDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var12 = var3.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(3465)"+ "'", var2.equals("Refresh SAP NetWeaver server state(3465)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test429");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(86)", 0);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test430");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    boolean var1 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test431");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(3349)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test432");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(1821)");
    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(998)");
    var1.addSuppressed((java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test433");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var3 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var11 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(1227)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var11);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test434");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.schedule(10L);
    org.eclipse.core.runtime.jobs.ISchedulingRule var8 = var0.getRule();
    boolean var9 = var0.cancel();
    int var10 = var0.getState();
    var0.join();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test435");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    int var4 = var3.ordinal();
    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var5 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var6 = var5.getProxyPort();
    java.lang.String var7 = var5.getProxyUser();
    java.lang.String var8 = var5.getProxyUser();
    java.lang.String var9 = var5.getProxyUser();
    java.lang.String var10 = var5.getProxyPassword();
    java.lang.String var11 = var5.getProxyPassword();
    java.lang.String var12 = var5.getProxyHost();
    boolean var13 = var3.equals((java.lang.Object)var12);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var15 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var16 = var15.getResult();
    boolean var17 = var15.isUser();
    org.eclipse.core.runtime.IStatus var18 = var15.getResult();
    var15.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var23 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var24 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var23);
    boolean var25 = var15.belongsTo((java.lang.Object)var23);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var26 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(69)", (java.lang.Throwable)var23);
    boolean var27 = var3.equals((java.lang.Object)"Refresh SAP NetWeaver server state(69)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test436");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(2166)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test437");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var1 = var0.getState();
    int var2 = var0.getPriority();
    boolean var3 = var0.shouldRun();
    var0.setName("Refresh SAP NetWeaver server state(1314)");
    var0.join();
    var0.wakeUp();
    boolean var8 = var0.sleep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test438");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    var0.setUser(false);
    int var8 = var0.getPriority();
    boolean var9 = var0.isSystem();
    int var10 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test439");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    int var3 = var0.getPriority();
    boolean var4 = var0.isSystem();
    boolean var5 = var0.isBlocking();
    org.eclipse.core.runtime.IStatus var6 = var0.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test440");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    var0.startup();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test441");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    boolean var5 = var0.shouldSchedule();
    var0.setSystem(false);
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "MCK");
    var9.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var15 = var11.getSuppressed();
    boolean var16 = var0.belongsTo((java.lang.Object)var15);
    var0.schedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var18 = var0.getRule();
    java.lang.String var19 = var0.getName();
    var0.setName("Refresh SAP NetWeaver server state(2874)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var19.equals("Refresh SAP NetWeaver server state"));

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test442");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(1069)", (-1));
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test443");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    var0.savePluginPreferences();
    var0.setDebugging(true);
    org.osgi.framework.Bundle var6 = var0.getBundle();
    var0.savePluginPreferences();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test444");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var1 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test445");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    var2.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var7);
    boolean var9 = var2.canControlModule(var7);
    var2.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    org.eclipse.wst.server.core.IModule[] var16 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var17 = var14.canControlModule(var16);
    boolean var18 = var12.canControlModule(var16);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    boolean var23 = var12.canControlModule(var21);
    var12.dispose();
    var12.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var30 = var29.getServer();
    org.eclipse.wst.server.core.IModule[] var31 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var32 = var29.canControlModule(var31);
    boolean var33 = var27.canControlModule(var31);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    boolean var38 = var27.canControlModule(var36);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var12, 1, var36, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var2, 2, var36, (java.lang.Integer)1);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var44 = var43.getServer();
    org.eclipse.wst.server.core.IModule[] var45 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var46 = var43.canControlModule(var45);
    var43.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var48);
    boolean var50 = var43.canControlModule(var48);
    org.eclipse.core.runtime.IStatus var51 = var0.canModifyModules(var36, var48);
    var0.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var53 = var0.getServerWorkingCopy();
    var0.dispose();
    org.eclipse.wst.server.core.IServer var55 = var0.getServer();
    org.eclipse.wst.server.core.IServerWorkingCopy var56 = var0.getServerWorkingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test446");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    var0.dispose();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var4 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test447");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(14)(2463)");

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test448");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    var0.setDebugging(false);
    var0.startup();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var6 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test449");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(552)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(800)", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test450");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(44)");
    var0.initialize("Refresh SAP NetWeaver server state(131)");
    var0.initialize("Refresh SAP NetWeaver server state(131)");
    var0.initialize("MCK");

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test451");


    com.sap.netweaver.porta.core.NotAuthorizedException var2 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(708)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(3259)", (java.lang.Throwable)var2);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test452");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(176)", 1);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "hi!");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    com.sap.netweaver.porta.core.Application[] var7 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var8 = var2.start(var7);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test453");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    boolean var5 = var0.shouldSchedule();
    var0.setSystem(false);
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "MCK");
    var9.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var15 = var11.getSuppressed();
    boolean var16 = var0.belongsTo((java.lang.Object)var15);
    var0.schedule();
    java.lang.String var18 = var0.toString();
    boolean var19 = var0.isBlocking();
    var0.schedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Refresh SAP NetWeaver server state(3476)"+ "'", var18.equals("Refresh SAP NetWeaver server state(3476)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test454");


    com.sap.netweaver.porta.core.NotAuthorizedException var3 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.NotAuthorizedException var4 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(356)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var4);
    java.lang.Throwable[] var6 = var4.getSuppressed();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var7 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1235)", (java.lang.Throwable)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test455");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.String var10 = var3.getHost();
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(597)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var14 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var13);
    java.lang.String var15 = var13.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(597)"+ "'", var15.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(597)"));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test456");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    var0.setUser(false);
    var0.setName("Refresh SAP NetWeaver server state(150)");
    org.eclipse.core.runtime.IStatus var10 = var0.getResult();
    boolean var11 = var0.isSystem();
    boolean var12 = var0.sleep();
    var0.setName("Refresh SAP NetWeaver server state(1611)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test457");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var1.dispose();
    org.eclipse.wst.server.core.IServer var3 = var1.getServer();
    org.eclipse.wst.server.core.IServer var4 = var1.getServer();
    var1.configurationChanged();
    var1.configurationChanged();
    org.eclipse.wst.server.core.IServerWorkingCopy var7 = var1.getServerWorkingCopy();
    var1.configurationChanged();
    org.eclipse.wst.server.core.IServerWorkingCopy var9 = var1.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    org.eclipse.wst.server.core.IModule[] var12 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var13 = var10.canControlModule(var12);
    var10.handleResourceChange();
    var10.dispose();
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var21 = var20.getServer();
    org.eclipse.wst.server.core.IModule[] var22 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var23 = var20.canControlModule(var22);
    boolean var24 = var18.canControlModule(var22);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    org.eclipse.wst.server.core.IModule[] var27 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var28 = var25.canControlModule(var27);
    boolean var29 = var18.canControlModule(var27);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var31 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var10, 30, var27, (java.lang.Integer)100);
    boolean var32 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var33 = var1.getChildModules(var27);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test458");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getNonProxyHosts();
    java.lang.String var4 = var0.getNonProxyHosts();
    java.lang.String var5 = var0.getProxyPassword();
    java.lang.String var6 = var0.getProxyHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test459");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    var0.join();
    boolean var5 = var0.isBlocking();
    var0.wakeUp();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var8 = var7.getResult();
    boolean var9 = var7.isUser();
    org.eclipse.core.runtime.IStatus var10 = var7.getResult();
    var7.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var16 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var15);
    boolean var17 = var7.belongsTo((java.lang.Object)var15);
    org.eclipse.core.runtime.jobs.ISchedulingRule var18 = var7.getRule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var20 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var20.dispose();
    var20.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    var23.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    boolean var32 = var23.canControlModule(var30);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var34 = var33.getServer();
    org.eclipse.wst.server.core.IModule[] var35 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var36 = var33.canControlModule(var35);
    var33.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var39 = var38.getServer();
    org.eclipse.wst.server.core.IModule[] var40 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var41 = var38.canControlModule(var40);
    boolean var42 = var33.canControlModule(var40);
    org.eclipse.core.runtime.IStatus var43 = var20.canModifyModules(var30, var40);
    boolean var44 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var43);
    var7.done(var43);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var47 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var48 = var47.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var49 = var47.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var51 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var51.dispose();
    var51.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var54 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var55 = var54.getServer();
    org.eclipse.wst.server.core.IModule[] var56 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var57 = var54.canControlModule(var56);
    var54.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var59 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var60 = var59.getServer();
    org.eclipse.wst.server.core.IModule[] var61 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var62 = var59.canControlModule(var61);
    boolean var63 = var54.canControlModule(var61);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var64 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var65 = var64.getServer();
    org.eclipse.wst.server.core.IModule[] var66 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var67 = var64.canControlModule(var66);
    var64.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var69 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var70 = var69.getServer();
    org.eclipse.wst.server.core.IModule[] var71 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var72 = var69.canControlModule(var71);
    boolean var73 = var64.canControlModule(var71);
    org.eclipse.core.runtime.IStatus var74 = var51.canModifyModules(var61, var71);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var75 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var76 = var75.getServer();
    org.eclipse.wst.server.core.IModule[] var77 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var78 = var75.canControlModule(var77);
    var75.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var80 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var81 = var80.getServer();
    org.eclipse.wst.server.core.IModule[] var82 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var83 = var80.canControlModule(var82);
    boolean var84 = var75.canControlModule(var82);
    org.eclipse.core.runtime.IStatus var85 = var47.canModifyModules(var71, var82);
    org.eclipse.core.runtime.IStatus var86 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var43, var85);
    boolean var87 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var86);
    var0.done(var86);
    boolean var89 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var86);
    boolean var90 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test460");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(92)", 2);
    java.lang.String var3 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(92)"+ "'", var3.equals("Refresh SAP NetWeaver server state(92)"));

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test461");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.join();
    int var6 = var0.getState();
    int var7 = var0.getState();
    var0.wakeUp(100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test462");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyPassword();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyHost();
    java.lang.String var5 = var0.getProxyPort();
    java.lang.String var6 = var0.getProxyHost();
    java.lang.String var7 = var0.getProxyUser();
    java.lang.String var8 = var0.getProxyPort();
    java.lang.String var9 = var0.getProxyUser();
    java.lang.String var10 = var0.getProxyUser();
    java.lang.String var11 = var0.getNonProxyHosts();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test463");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.isUser();
    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var4 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var5 = var4.getChildFragments();
    var4.enter();
    boolean var7 = var4.hasComposite();
    java.util.List var8 = var4.getChildFragments();
    var4.exit();
    boolean var10 = var0.belongsTo((java.lang.Object)var4);
    int var11 = var0.getPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test464");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(773)", "Refresh SAP NetWeaver server state(3171)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test465");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var3.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host Refresh SAP NetWeaver server state(356) cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var14 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test466");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(169)");
    com.sap.netweaver.porta.core.CoreException var4 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(1509)", (java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(1776)", (java.lang.Throwable)var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test467");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var4 = var0.getErrorMessage();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(46)");
    org.eclipse.core.runtime.IStatus[] var7 = var0.getSaveStatus();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(119)");
    java.lang.String var10 = var0.getErrorMessage();
    var0.dispose();
    var0.dispose();
    org.eclipse.core.runtime.IStatus[] var13 = var0.getSaveStatus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state(119)"+ "'", var10.equals("Refresh SAP NetWeaver server state(119)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test468");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(92)", (-1));
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    com.sap.netweaver.porta.core.Application[] var7 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var8 = var2.undeploy(var7);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test469");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyPort();
    java.lang.String var4 = var0.getProxyPassword();
    java.lang.String var5 = var0.getProxyPassword();
    java.lang.String var6 = var0.getProxyPort();
    java.lang.String var7 = var0.getProxyPort();
    java.lang.String var8 = var0.getProxyPort();
    java.lang.String var9 = var0.getProxyHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test470");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var7, "MCK");
    var5.addSuppressed((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.ProxyException var14 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "MCK");
    var14.addSuppressed((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NotAuthorizedException var20 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var14);
    java.lang.String var21 = var14.getHost();
    com.sap.netweaver.porta.core.CoreException var22 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.CoreException var23 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NoWSGateException var25 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var23, "Refresh SAP NetWeaver server state(138)");
    var11.addSuppressed((java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var27 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1007)", (java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var30 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(183)");
    com.sap.netweaver.porta.core.NoWSGateException var32 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var30, "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)");
    com.sap.netweaver.porta.core.CoreException var33 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(356)", (java.lang.Throwable)var32);
    com.sap.netweaver.porta.core.NoWSGateException var35 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var33, "Refresh SAP NetWeaver server state(238)");
    var23.addSuppressed((java.lang.Throwable)var33);
    com.sap.netweaver.porta.core.CoreException var37 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(419)", (java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var38 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1272)", (java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.NotAuthorizedException var39 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var23);
    java.lang.Throwable[] var40 = var39.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test471");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var8 = var4.getSuppressed();
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!(2638)", (java.lang.Throwable)var9);
    java.lang.String var11 = var10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: hi!(2638)"+ "'", var11.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: hi!(2638)"));

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test472");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.setSystem(false);
    boolean var8 = var0.shouldSchedule();
    var0.setName("Refresh SAP NetWeaver server state(119)");
    var0.setName("Publish to server");
    int var13 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test473");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var6 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var7 = var6.getJ2EE14Classpath();
    var6.dispose();
    var6.dispose();
    boolean var10 = var3.equals((java.lang.Object)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(127)");
    boolean var13 = var3.equals((java.lang.Object)"Refresh SAP NetWeaver server state(127)");
    int var14 = var3.ordinal();
    java.lang.String var15 = var3.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Stopped"+ "'", var4.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Stopped"+ "'", var5.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "STOPPED"+ "'", var15.equals("STOPPED"));

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test474");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(183)");
    com.sap.netweaver.porta.core.CoreException var4 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(1327)", (java.lang.Throwable)var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test475");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(151)", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var10);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test476");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    var0.setPriority(30);
    var0.wakeUp(10L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setUser(false);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test477");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var4 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NotAuthorizedException var7 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(46)", (java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var7);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test478");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    var0.startup();
    var0.startup();
    var0.savePluginPreferences();
    boolean var8 = var0.isDebugging();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test479");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    org.eclipse.core.runtime.ILog var4 = var0.getLog();
    var0.savePluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test480");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var2 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var3 = var2.getResult();
    boolean var4 = var2.shouldSchedule();
    boolean var5 = var2.cancel();
    boolean var6 = var2.isUser();
    var2.setName("Refresh SAP NetWeaver server state(238)");
    com.sap.netweaver.porta.core.ProxyException var10 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state");
    java.lang.String var11 = var10.getHost();
    boolean var12 = var2.belongsTo((java.lang.Object)var10);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(2051)", "Refresh SAP NetWeaver server state(2190)", (java.lang.Throwable)var13);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var11.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test481");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    var0.updateChildFragments();
    var0.enter();
    var0.updateChildFragments();
    boolean var5 = var0.hasComposite();
    boolean var6 = var0.hasComposite();
    boolean var7 = var0.hasComposite();
    java.util.List var8 = var0.getChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test482");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    java.lang.String var1 = var0.getSystemName();
    com.sap.netweaver.porta.core.DeployManager var2 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var3 = var0.getLifecycleManager();
    var0.ping();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "MCK"+ "'", var1.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test483");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(630)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var3 = var2.getHttpAccessPoint();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test484");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    boolean var2 = var0.hasComposite();
    java.util.List var3 = var0.getChildFragments();
    var0.exit();
    java.util.List var5 = var0.getChildFragments();
    java.util.List var6 = var0.getChildFragments();
    var0.updateChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test485");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.wakeUp();
    org.eclipse.core.runtime.jobs.ISchedulingRule var3 = var0.getRule();
    var0.schedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var5 = var0.getRule();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSystem(true);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test486");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(658)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test487");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test488");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var7 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var2);
    java.lang.String var8 = var2.getHost();
    java.lang.String var9 = var2.getHost();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "Refresh SAP NetWeaver server state(795)");
    com.sap.netweaver.porta.core.NoWSGateException var14 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var12, "Refresh SAP NetWeaver server state(1217)");
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var14);
    java.lang.String var16 = var14.toString();
    java.lang.String var17 = var14.getEndpoint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "+ "'", var16.equals("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Refresh SAP NetWeaver server state(1217)"+ "'", var17.equals("Refresh SAP NetWeaver server state(1217)"));

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test489");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(2479)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test490");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(1227)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test491");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    org.eclipse.wst.server.core.IModule[] var4 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var5 = var2.canControlModule(var4);
    var2.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var7);
    boolean var9 = var2.canControlModule(var7);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    org.eclipse.wst.server.core.IModule[] var12 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var13 = var10.canControlModule(var12);
    var10.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    org.eclipse.wst.server.core.IModule[] var17 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var18 = var15.canControlModule(var17);
    boolean var19 = var10.canControlModule(var17);
    org.eclipse.core.runtime.IStatus var20 = var1.canModifyModules(var7, var17);
    var1.configurationChanged();
    var1.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test492");


    com.sap.netweaver.porta.core.mock.DeployManagerMock var0 = new com.sap.netweaver.porta.core.mock.DeployManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(1734)");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.Application[] var5 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var6 = var0.undeploy(var5);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test493");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(630)", (-1));
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test494");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.sleep();
    org.eclipse.core.runtime.jobs.ISchedulingRule var5 = var0.getRule();
    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var6 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var7 = var6.getJ2EE14Classpath();
    java.lang.String[] var8 = var6.getJavaEE5Classpath();
    boolean var9 = var0.belongsTo((java.lang.Object)var6);
    boolean var10 = var0.shouldRun();
    java.lang.String var11 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var11.equals("Refresh SAP NetWeaver server state"));

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test495");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyPassword();
    java.lang.String var4 = var0.getProxyPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test496");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 0);
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", 2);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var6 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var6.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var9 = var6.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var10 = var6.enableDebugging();
    var6.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var13 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var13.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.mock.CoreModuleMock var16 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var19 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var20 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var20);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var16.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var6.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var24);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(1509)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var33);
    com.sap.netweaver.porta.core.Application[] var35 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var36 = var2.start(var35);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test497");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var7 = var6.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = var8.canControlModule(var10);
    boolean var12 = var6.canControlModule(var10);
    boolean var13 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var10);
    boolean var14 = var4.canControlModule(var10);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    org.eclipse.wst.server.core.IModule[] var18 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var19 = var16.canControlModule(var18);
    var16.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var21);
    boolean var23 = var16.canControlModule(var21);
    var16.handleResourceChange();
    org.eclipse.wst.server.core.IServer var25 = var16.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = var27.canControlModule(var29);
    var27.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var32 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var33 = var32.getServer();
    org.eclipse.wst.server.core.IModule[] var34 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var35 = var32.canControlModule(var34);
    boolean var36 = var27.canControlModule(var34);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var16, 30, var34, (java.lang.Integer)100);
    boolean var39 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var34);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var4, 0, var34, (java.lang.Integer)2);
    boolean var42 = var3.equals((java.lang.Object)2);
    int var43 = var3.ordinal();
    java.lang.String var44 = var3.toString();
    java.lang.String var45 = var3.name();
    java.lang.String var46 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Stopped"+ "'", var44.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "STOPPED"+ "'", var45.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "Stopped"+ "'", var46.equals("Stopped"));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test498");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJ2EE14Classpath();
    java.lang.String[] var5 = var0.getJavaEE5Classpath();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
    java.lang.String[] var7 = var0.getJ2EE14Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
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

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test499");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(2733)", "Refresh SAP NetWeaver server state(1117)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test500");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var3 = var0.enableDebugging();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(318)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

}
