package randoop;

import junit.framework.*;

public class RandoopTest8 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test1");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(1231)", 2);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 0);
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var8 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", 2);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var9 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var9.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var12 = var9.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var13 = var9.enableDebugging();
    var9.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var16 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var16.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.mock.CoreModuleMock var19 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var22 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var23 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var22.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var23);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var22.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var27);
    var19.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var27);
    var16.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var27);
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var27);
    var8.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var27);
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var27);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var36 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(1509)");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test2");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(1937)", 10);
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

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test3");


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
    java.lang.String var21 = var20.getLabel();
    java.lang.String var22 = var20.getDescription();
    java.lang.String var23 = var20.getLabel();
    
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
    assertTrue("'" + var21 + "' != '" + "Publish to server"+ "'", var21.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var22.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Publish to server"+ "'", var23.equals("Publish to server"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test4");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    boolean var2 = var0.hasComposite();
    org.eclipse.wst.server.core.TaskModel var3 = var0.getTaskModel();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test5");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.join();
    var0.join();
    boolean var7 = var0.shouldSchedule();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getState();
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
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Refresh SAP NetWeaver server state(2485)"+ "'", var8.equals("Refresh SAP NetWeaver server state(2485)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test6");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(325)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test7");


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
    var0.setSystem(false);
    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var13 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var14 = var13.getTaskModel();
    var13.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var16 = var13.getTaskModel();
    boolean var17 = var13.hasComposite();
    boolean var18 = var0.belongsTo((java.lang.Object)var13);
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test8");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(779)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test9");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var3 = var2.getHost();
    java.lang.String var4 = var2.getHost();
    com.sap.netweaver.porta.core.ProxyException var7 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var11 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var9, "MCK");
    var7.addSuppressed((java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.NotAuthorizedException var14 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.ProxyException var19 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var21 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var19, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var23 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var19, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var24 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var25 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var23);
    com.sap.netweaver.porta.core.ProxyException var29 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var31 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var33 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var31, "MCK");
    var29.addSuppressed((java.lang.Throwable)var31);
    com.sap.netweaver.porta.core.NotAuthorizedException var35 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var29);
    java.lang.Throwable[] var36 = var29.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var38 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var29, "hi!");
    java.lang.String var39 = var38.getEndpoint();
    com.sap.netweaver.porta.core.NotAuthorizedException var40 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var38);
    var25.addSuppressed((java.lang.Throwable)var40);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var42 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var40);
    var15.addSuppressed((java.lang.Throwable)var40);
    com.sap.netweaver.porta.core.CoreException var44 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var40);
    var2.addSuppressed((java.lang.Throwable)var44);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var46 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1206)", (java.lang.Throwable)var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Stopped"+ "'", var3.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Stopped"+ "'", var4.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test10");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var3.getSuppressed();
    com.sap.netweaver.porta.core.ProxyException var14 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var15 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NoWSGateException var17 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var14, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var18 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var17);
    java.lang.Throwable[] var19 = var17.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var20 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var17);
    var3.addSuppressed((java.lang.Throwable)var20);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var22 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var20);
    com.sap.netweaver.porta.core.CoreException var23 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(51)", (java.lang.Throwable)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test11");


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
    var0.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var15 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var16 = var15.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var15.canControlModule(var19);
    var15.handleResourceChange();
    org.eclipse.wst.server.core.IServer var23 = var15.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var25 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var26 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var27 = var26.getServer();
    org.eclipse.wst.server.core.IModule[] var28 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var29 = var26.canControlModule(var28);
    var26.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var31 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var32 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var31);
    boolean var33 = var26.canControlModule(var31);
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
    org.eclipse.core.runtime.IStatus var44 = var25.canModifyModules(var31, var41);
    boolean var45 = var15.canControlModule(var41);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, (-1), var41, (java.lang.Integer)1);
    java.lang.String var48 = var47.getDescription();
    
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
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
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
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var48.equals("Publish module to the SAP NetWeaver server"));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test12");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(1988)", "Refresh SAP NetWeaver server state(800)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test13");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var7 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "Refresh SAP NetWeaver server state(1177)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test14");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.cancel();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    java.lang.String var5 = var0.toString();
    var0.schedule();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSystem(false);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(2489)"+ "'", var5.equals("Refresh SAP NetWeaver server state(2489)"));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test15");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(2461)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test16");


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
    com.sap.netweaver.porta.core.DebugSessionInfo var19 = var0.enableDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test17");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("", "Refresh SAP NetWeaver server state(376)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test18");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    var0.dispose();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var5 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    java.lang.String[] var7 = var0.getJ2EE14Classpath();
    java.lang.String[] var8 = var0.getJ2EE14Classpath();
    java.lang.String[] var9 = var0.getJ2EE14Classpath();
    java.lang.String[] var10 = var0.getJ2EE14Classpath();
    
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test19");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(555)", (java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtil.handleProxyException(var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test20");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    var0.disableDebugging("MCK");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test21");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(450)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test22");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(1608)", 30);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test23");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(51)", 30);
    var2.setCredentials("Refresh SAP NetWeaver server state(99)", "Stopped");
    var2.setCredentials("Refresh SAP NetWeaver server state(86)", "Publish to server");
    var2.setCredentials("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ", "Refresh SAP NetWeaver server state(51)");
    var2.setCredentials("Refresh SAP NetWeaver server state(106)", "Refresh SAP NetWeaver server state(168)");
    java.io.File[] var15 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var16 = var2.upload(var15);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test24");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", 1);
    int var3 = var2.getPort();
    int var4 = var2.getPort();
    java.lang.String var5 = var2.getKey();
    java.lang.String var6 = var2.getKey();
    int var7 = var2.getPort();
    java.lang.String var8 = var2.getKey();
    int var9 = var2.getPort();
    int var10 = var2.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK"+ "'", var5.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK"+ "'", var6.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK"+ "'", var8.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test25");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(14)");
    var0.initialize("Refresh SAP NetWeaver server state(325)");
    var0.initialize("Refresh SAP NetWeaver server state(242)");
    var0.initialize("Refresh SAP NetWeaver server state(457)");

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test26");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    boolean var2 = var0.isSystem();
    var0.schedule();
    boolean var4 = var0.sleep();
    java.lang.Thread var5 = var0.getThread();
    var0.schedule(10L);
    boolean var8 = var0.isBlocking();
    var0.wakeUp();
    
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

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test27");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(321)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(1634)", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test28");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(1038)", 30);
    var2.setCredentials("Refresh SAP NetWeaver server state(375)", "Refresh SAP NetWeaver server state(1227)");
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

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test29");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.join();
    var0.join();
    int var7 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test30");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.enter();
    var0.enter();
    boolean var4 = var0.hasComposite();
    var0.enter();
    boolean var6 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test31");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    java.lang.String var5 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(1442)");
    java.lang.String var8 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(2495)"+ "'", var5.equals("Refresh SAP NetWeaver server state(2495)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Refresh SAP NetWeaver server state(1442)"+ "'", var8.equals("Refresh SAP NetWeaver server state(1442)"));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test32");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(138)", 2);
    var2.setCredentials("Refresh SAP NetWeaver server state(325)", "Refresh SAP NetWeaver server state(1208)");

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test33");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    org.eclipse.wst.server.core.IServerWorkingCopy var1 = var0.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var3 = var2.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var5 = var4.getServer();
    org.eclipse.wst.server.core.IModule[] var6 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var7 = var4.canControlModule(var6);
    boolean var8 = var2.canControlModule(var6);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var9 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var10 = var9.getServer();
    org.eclipse.wst.server.core.IModule[] var11 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var12 = var9.canControlModule(var11);
    boolean var13 = var2.canControlModule(var11);
    var2.dispose();
    var2.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    boolean var23 = var17.canControlModule(var21);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = var24.canControlModule(var26);
    boolean var28 = var17.canControlModule(var26);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var2, 1, var26, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var31 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var32 = var31.shouldSchedule();
    java.lang.String var33 = var31.toString();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var34 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var34.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var36 = var34.getLog();
    var34.savePluginPreferences();
    boolean var38 = var31.belongsTo((java.lang.Object)var34);
    boolean var39 = var31.shouldSchedule();
    var31.setName("hi!");
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = var42.canControlModule(var44);
    var42.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = var47.canControlModule(var49);
    boolean var51 = var42.canControlModule(var49);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var53 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var54 = var53.getServer();
    org.eclipse.wst.server.core.IModule[] var55 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var56 = var53.canControlModule(var55);
    var53.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var58 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var59 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var58);
    boolean var60 = var53.canControlModule(var58);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var62 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var42, (-1), var58, (java.lang.Integer)10);
    boolean var63 = var31.belongsTo((java.lang.Object)var58);
    org.eclipse.core.runtime.IStatus var64 = var0.canModifyModules(var26, var58);
    boolean var65 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var58);
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Refresh SAP NetWeaver server state(2496)"+ "'", var33.equals("Refresh SAP NetWeaver server state(2496)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test34");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var7 = var3.getSuppressed();
    java.lang.String var8 = var3.getHost();
    java.lang.String var9 = var3.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test35");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.CoreException var9 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(779)", (java.lang.Throwable)var9);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test36");


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
    java.lang.String var60 = var0.toString();
    
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
    assertTrue("'" + var60 + "' != '" + "Refresh SAP NetWeaver server state(2497)"+ "'", var60.equals("Refresh SAP NetWeaver server state(2497)"));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test37");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(356)");
    com.sap.netweaver.porta.core.CoreException var3 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(2268)", (java.lang.Throwable)var2);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test38");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(1597)");

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test39");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isUser();
    boolean var8 = var0.isBlocking();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var9 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var10 = var9.getResult();
    boolean var11 = var9.isUser();
    org.eclipse.core.runtime.IStatus var12 = var9.getResult();
    var9.setPriority(30);
    var9.schedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var17 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    var18.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var23 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var24 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var23);
    boolean var25 = var18.canControlModule(var23);
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
    org.eclipse.core.runtime.IStatus var36 = var17.canModifyModules(var23, var33);
    boolean var37 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var36);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var39 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = var40.canControlModule(var42);
    var40.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var45 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var46 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var45);
    boolean var47 = var40.canControlModule(var45);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var49 = var48.getServer();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = var48.canControlModule(var50);
    var48.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var53 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var54 = var53.getServer();
    org.eclipse.wst.server.core.IModule[] var55 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var56 = var53.canControlModule(var55);
    boolean var57 = var48.canControlModule(var55);
    org.eclipse.core.runtime.IStatus var58 = var39.canModifyModules(var45, var55);
    org.eclipse.core.runtime.IStatus var59 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var36, var58);
    var9.done(var58);
    boolean var61 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var58);
    var0.done(var58);
    var0.setName("Refresh SAP NetWeaver server state(1016)");
    var0.join();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
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
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test40");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    boolean var6 = var0.cancel();
    var0.setUser(false);
    var0.setPriority(30);
    boolean var11 = var0.isBlocking();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test41");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var3.getSuppressed();
    com.sap.netweaver.porta.core.ProxyException var14 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var15 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NoWSGateException var17 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var14, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var18 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var17);
    java.lang.Throwable[] var19 = var17.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var20 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var17);
    var3.addSuppressed((java.lang.Throwable)var20);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var22 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(633)", (java.lang.Throwable)var20);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test42");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    org.eclipse.core.runtime.jobs.ISchedulingRule var11 = var0.getRule();
    java.lang.Thread var12 = var0.getThread();
    boolean var13 = var0.shouldRun();
    var0.wakeUp();
    java.lang.String var15 = var0.toString();
    java.lang.Thread var16 = var0.getThread();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var17 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var17.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var19 = var17.getLog();
    org.eclipse.core.runtime.ILog var20 = var17.getLog();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var21 = var0.compareTo((java.lang.Object)var17);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Refresh SAP NetWeaver server state(2501)"+ "'", var15.equals("Refresh SAP NetWeaver server state(2501)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test43");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(1715)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("com.sap.netweaver.porta.core.AuthenticationRefusedException", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test44");


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
    boolean var31 = var0.cancel();
    boolean var32 = var0.isBlocking();
    boolean var33 = var0.cancel();
    boolean var34 = var0.shouldSchedule();
    
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
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test45");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    var0.disableDebugging("Publish to server");
    com.sap.netweaver.porta.core.ServerState var8 = var0.getState();
    int var9 = var8.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test46");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(879)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test47");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(2071)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test48");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 2);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test49");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("", 0);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var4 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var6 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var7 = var2.getDeployManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var8 = var2.getHttpAccessPoint();
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

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test50");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    boolean var2 = var0.hasComposite();
    var0.enter();
    var0.exit();
    boolean var5 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test51");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(14)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var3 = var2.getHttpAccessPoint();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test52");


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
    java.lang.Class var14 = var5.getDeclaringClass();
    java.lang.String var15 = var5.toString();
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Stopped"+ "'", var15.equals("Stopped"));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test53");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.wakeUp(1L);
    var0.schedule();
    boolean var10 = var0.shouldRun();
    var0.wakeUp(100L);
    boolean var13 = var0.isBlocking();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2506)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2506)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test54");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(2166)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test55");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(2136)", 2);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test56");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(1284)", "com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ");
    java.lang.String var3 = var2.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "+ "'", var3.equals("com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test57");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var9 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var0.disableDebugging("Refresh SAP NetWeaver server state(221)");
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(130)");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test58");


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
    boolean var21 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var20);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var23 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = var24.canControlModule(var26);
    var24.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var29);
    boolean var31 = var24.canControlModule(var29);
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
    org.eclipse.core.runtime.IStatus var42 = var23.canModifyModules(var29, var39);
    org.eclipse.core.runtime.IStatus var43 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var20, var42);
    boolean var44 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var42);
    boolean var45 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var42);
    boolean var46 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var42);
    boolean var47 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var42);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test59");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(1038)", 10);
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

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test60");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPassword();
    java.lang.String var2 = var0.getProxyPort();
    java.lang.String var3 = var0.getProxyHost();
    java.lang.String var4 = var0.getNonProxyHosts();
    java.lang.String var5 = var0.getProxyPort();
    java.lang.String var6 = var0.getProxyPassword();
    java.lang.String var7 = var0.getProxyPort();
    java.lang.String var8 = var0.getProxyPassword();
    java.lang.String var9 = var0.getProxyHost();
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

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test61");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1557)");

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test62");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(true);
    org.eclipse.wst.server.core.IServer var2 = var1.getServer();
    var1.configurationChanged();
    var1.configurationChanged();
    org.eclipse.wst.server.core.IServerWorkingCopy var5 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var6 = var1.getServerWorkingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test63");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.schedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var6 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var7 = var6.getResult();
    boolean var8 = var6.isUser();
    org.eclipse.core.runtime.IStatus var9 = var6.getResult();
    var6.schedule(100L);
    var6.wakeUp(0L);
    boolean var14 = var6.sleep();
    org.eclipse.core.runtime.IStatus var15 = var6.getResult();
    var0.done(var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setPriority((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test64");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var3 = var0.getTaskModel();
    var0.updateChildFragments();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test65");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1470)");

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test66");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(317)", 10);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var6 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var6);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var8 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(366)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test67");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(998)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test68");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var7 = var0.isDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test69");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.cancel();
    var0.schedule();
    boolean var5 = var0.shouldRun();
    var0.schedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test70");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(2387)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test71");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.startup();
    var0.savePluginPreferences();
    var0.savePluginPreferences();

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test72");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(230)", 2);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test73");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var15 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "hi!");
    var9.addSuppressed((java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var17 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(366)", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.CoreException var18 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.NotAuthorizedException var19 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(669)", (java.lang.Throwable)var18);
    com.sap.netweaver.porta.core.ProxyException var21 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var23 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var25 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var23, "MCK");
    var21.addSuppressed((java.lang.Throwable)var23);
    java.lang.Throwable[] var27 = var23.getSuppressed();
    java.lang.String var28 = var23.getHost();
    java.lang.String var29 = var23.getHost();
    var18.addSuppressed((java.lang.Throwable)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test74");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(14)", "Refresh SAP NetWeaver server state(1282)");
    java.lang.String var3 = var2.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(14)"+ "'", var3.equals("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(14)"));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test75");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule();
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
    boolean var28 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var27);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var30 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var31 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var32 = var31.getServer();
    org.eclipse.wst.server.core.IModule[] var33 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var34 = var31.canControlModule(var33);
    var31.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var36);
    boolean var38 = var31.canControlModule(var36);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    org.eclipse.wst.server.core.IModule[] var41 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var42 = var39.canControlModule(var41);
    var39.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var44 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var45 = var44.getServer();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = var44.canControlModule(var46);
    boolean var48 = var39.canControlModule(var46);
    org.eclipse.core.runtime.IStatus var49 = var30.canModifyModules(var36, var46);
    org.eclipse.core.runtime.IStatus var50 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var27, var49);
    var0.done(var49);
    boolean var52 = var0.shouldRun();
    boolean var53 = var0.shouldRun();
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
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test76");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var3 = var2.getHost();
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "Refresh SAP NetWeaver server state(14)");
    java.lang.String var6 = var5.getEndpoint();
    java.lang.String var7 = var5.getEndpoint();
    java.lang.String var8 = var5.getEndpoint();
    java.lang.String var9 = var5.getEndpoint();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(1644)", (java.lang.Throwable)var5);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Stopped"+ "'", var3.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var6.equals("Refresh SAP NetWeaver server state(14)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var7.equals("Refresh SAP NetWeaver server state(14)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var8.equals("Refresh SAP NetWeaver server state(14)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var9.equals("Refresh SAP NetWeaver server state(14)"));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test77");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isUser();
    boolean var8 = var0.isBlocking();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var9 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var10 = var9.getResult();
    boolean var11 = var9.isUser();
    org.eclipse.core.runtime.IStatus var12 = var9.getResult();
    var9.setPriority(30);
    var9.schedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var17 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    var18.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var23 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var24 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var23);
    boolean var25 = var18.canControlModule(var23);
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
    org.eclipse.core.runtime.IStatus var36 = var17.canModifyModules(var23, var33);
    boolean var37 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var36);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var39 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = var40.canControlModule(var42);
    var40.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var45 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var46 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var45);
    boolean var47 = var40.canControlModule(var45);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var49 = var48.getServer();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = var48.canControlModule(var50);
    var48.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var53 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var54 = var53.getServer();
    org.eclipse.wst.server.core.IModule[] var55 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var56 = var53.canControlModule(var55);
    boolean var57 = var48.canControlModule(var55);
    org.eclipse.core.runtime.IStatus var58 = var39.canModifyModules(var45, var55);
    org.eclipse.core.runtime.IStatus var59 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var36, var58);
    var9.done(var58);
    boolean var61 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var58);
    var0.done(var58);
    org.eclipse.core.runtime.IStatus var63 = var0.getResult();
    boolean var64 = var0.isBlocking();
    boolean var65 = var0.sleep();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
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
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test78");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(1863)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test79");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var3 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var4 = var1.getServerWorkingCopy();
    var1.dispose();
    var1.dispose();
    var1.configurationChanged();
    var1.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test80");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.startup();
    org.eclipse.core.runtime.ILog var5 = var0.getLog();
    boolean var6 = var0.isDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test81");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(154)", 1);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test82");


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
    java.lang.Class var44 = var3.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var46 = java.lang.Enum.<java.lang.Enum>valueOf(var44, "Refresh SAP NetWeaver server state(1507)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var44);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test83");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.sleep();
    java.lang.Thread var5 = var0.getThread();
    boolean var6 = var0.isBlocking();
    boolean var7 = var0.sleep();
    boolean var8 = var0.isBlocking();
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
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test84");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(1512)");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test85");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var8 = var0.getState();
    java.lang.String var9 = var8.name();
    java.lang.String var10 = var8.toString();
    int var11 = var8.ordinal();
    java.lang.String var12 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "STOPPED"+ "'", var9.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Stopped"+ "'", var10.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Stopped"+ "'", var12.equals("Stopped"));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test86");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.enter();
    boolean var3 = var0.hasComposite();
    boolean var4 = var0.hasComposite();
    var0.enter();
    boolean var6 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test87");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(443)", 2);
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

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test88");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    java.lang.String var7 = var5.toString();
    int var8 = var5.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test89");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var2 = var0.getTaskModel();
    org.eclipse.wst.server.core.TaskModel var3 = var0.getTaskModel();
    java.util.List var4 = var0.getChildFragments();
    var0.enter();
    var0.updateChildFragments();
    boolean var7 = var0.hasComposite();
    var0.enter();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test90");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(1507)", 10);
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

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test91");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(1240)");

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test92");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(662)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test93");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var3 = var0.getTaskModel();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var5 = var0.getTaskModel();
    boolean var6 = var0.hasComposite();
    boolean var7 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test94");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(1307)", "com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test95");


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
    boolean var43 = var0.isUser();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var45 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = var46.canControlModule(var48);
    var46.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var51 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var52 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var51);
    boolean var53 = var46.canControlModule(var51);
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
    org.eclipse.core.runtime.IStatus var64 = var45.canModifyModules(var51, var61);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var65 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var66 = var65.getResult();
    boolean var67 = var65.shouldSchedule();
    var65.wakeUp(100L);
    var65.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var73 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var74 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var75 = var74.getServer();
    org.eclipse.wst.server.core.IModule[] var76 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var77 = var74.canControlModule(var76);
    var74.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var79 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var80 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var79);
    boolean var81 = var74.canControlModule(var79);
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
    org.eclipse.core.runtime.IStatus var92 = var73.canModifyModules(var79, var89);
    var65.done(var92);
    org.eclipse.core.runtime.IStatus var94 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var64, var92);
    var0.done(var94);
    boolean var96 = var0.shouldRun();
    
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
    assertTrue("'" + var12 + "' != '" + "Refresh SAP NetWeaver server state(2519)"+ "'", var12.equals("Refresh SAP NetWeaver server state(2519)"));
    
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
    assertTrue(var43 == false);
    
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
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
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
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == true);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test96");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(2096)", "Refresh SAP NetWeaver server state(419)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test97");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var2 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.setDebugging(true);
    boolean var6 = var0.isDebugging();
    boolean var7 = var0.isDebugging();
    var0.startup();
    var0.setDebugging(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test98");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    var0.setSystem(true);
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.shouldRun();
    var0.wakeUp();
    var0.wakeUp(100L);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var12 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var13 = var12.getServerWorkingCopy();
    var12.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var15 = var12.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var16 = var12.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServerWorkingCopy var17 = var12.getServerWorkingCopy();
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
    var18.dispose();
    var18.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var33 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var34 = var33.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var36 = var35.getServer();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = var35.canControlModule(var37);
    boolean var39 = var33.canControlModule(var37);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = var40.canControlModule(var42);
    boolean var44 = var33.canControlModule(var42);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var18, 1, var42, (java.lang.Integer)2);
    boolean var47 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var42);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var49 = var48.getServer();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = var48.canControlModule(var50);
    var48.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var53);
    boolean var55 = var48.canControlModule(var53);
    var48.handleResourceChange();
    org.eclipse.wst.server.core.IServer var57 = var48.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var59 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var60 = var59.getServer();
    org.eclipse.wst.server.core.IModule[] var61 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var62 = var59.canControlModule(var61);
    var59.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var64 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var65 = var64.getServer();
    org.eclipse.wst.server.core.IModule[] var66 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var67 = var64.canControlModule(var66);
    boolean var68 = var59.canControlModule(var66);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var70 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var48, 30, var66, (java.lang.Integer)100);
    boolean var71 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var66);
    org.eclipse.core.runtime.IStatus var72 = var12.canModifyModules(var42, var66);
    boolean var73 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var72);
    var0.done(var72);
    boolean var75 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
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
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test99");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(465)");
    com.sap.netweaver.porta.core.NotAuthorizedException var2 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var1);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var5 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var5.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var8 = var5.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var11 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var12 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var11.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    boolean var14 = var8.equals((java.lang.Object)var12);
    com.sap.netweaver.porta.core.ProxyException var17 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var19 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var17, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var21 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var17, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var22 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var21);
    com.sap.netweaver.porta.core.ProxyException var24 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var26 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var24, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var28 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var24, "hi!");
    var22.addSuppressed((java.lang.Throwable)var28);
    boolean var30 = var8.equals((java.lang.Object)var28);
    com.sap.netweaver.porta.core.CoreException var31 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var28);
    com.sap.netweaver.porta.core.CoreException var32 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(184)", (java.lang.Throwable)var28);
    com.sap.netweaver.porta.core.ProxyException var35 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var37 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var39 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var37, "MCK");
    var35.addSuppressed((java.lang.Throwable)var37);
    com.sap.netweaver.porta.core.NotAuthorizedException var41 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var35);
    com.sap.netweaver.porta.core.CoreException var42 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var41);
    com.sap.netweaver.porta.core.NotAuthorizedException var43 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var42);
    com.sap.netweaver.porta.core.NoWSGateException var45 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var42, "Refresh SAP NetWeaver server state(92)");
    var32.addSuppressed((java.lang.Throwable)var42);
    java.lang.String var47 = var42.toString();
    var1.addSuppressed((java.lang.Throwable)var42);
    java.lang.String var49 = var42.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK"+ "'", var47.equals("com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK"+ "'", var49.equals("com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK"));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test100");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(465)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test101");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(2132)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test102");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(150)(1838)", "Refresh SAP NetWeaver server state(119)(1770)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test103");


    com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("STOPPED");
    java.lang.String var2 = var1.toString();
    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var3 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var4 = var3.getChildFragments();
    var3.enter();
    org.eclipse.wst.server.core.TaskModel var6 = var3.getTaskModel();
    var3.enter();
    boolean var8 = var3.hasComposite();
    boolean var9 = var1.equals((java.lang.Object)var8);
    java.lang.String var10 = var1.toString();
    int var11 = var1.ordinal();
    java.lang.String var12 = var1.name();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var13 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var14 = var13.getResult();
    boolean var15 = var13.isUser();
    org.eclipse.core.runtime.IStatus var16 = var13.getResult();
    var13.setPriority(30);
    var13.schedule();
    java.lang.String var20 = var13.toString();
    var13.setName("Refresh SAP NetWeaver server state(232)");
    boolean var23 = var13.cancel();
    boolean var24 = var1.equals((java.lang.Object)var13);
    boolean var25 = var13.isSystem();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Stopped"+ "'", var2.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Stopped"+ "'", var10.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "STOPPED"+ "'", var12.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Refresh SAP NetWeaver server state(2522)"+ "'", var20.equals("Refresh SAP NetWeaver server state(2522)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test104");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(286)");
    com.sap.netweaver.porta.core.NoWSGateException var3 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var1, "Refresh SAP NetWeaver server state(151)");
    java.lang.String var4 = var1.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(286)"+ "'", var4.equals("Refresh SAP NetWeaver server state(286)"));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test105");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var2 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.savePluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    var0.startup();
    var0.startup();
    var0.startup();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var9 = var0.getStateLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test106");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var7 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var11 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var9, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var9, "hi!");
    var7.addSuppressed((java.lang.Throwable)var13);
    java.lang.String var15 = var13.toString();
    java.lang.String var16 = var13.getEndpoint();
    com.sap.netweaver.porta.core.CoreException var17 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.CoreException var18 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "+ "'", var15.equals("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test107");


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
    int var14 = var5.ordinal();
    com.sap.netweaver.porta.core.mock.ServerMock var15 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var15.ping();
    com.sap.netweaver.porta.core.LifecycleManager var17 = var15.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var18 = var15.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var19 = var15.getLifecycleManager();
    boolean var20 = var5.equals((java.lang.Object)var15);
    java.lang.String var21 = var5.name();
    
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
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "STOPPED"+ "'", var21.equals("STOPPED"));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test108");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(1874)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test109");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(1348)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test110");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyPort();
    java.lang.String var4 = var0.getProxyPassword();
    java.lang.String var5 = var0.getNonProxyHosts();
    java.lang.String var6 = var0.getProxyUser();
    java.lang.String var7 = var0.getProxyPort();
    java.lang.String var8 = var0.getNonProxyHosts();
    java.lang.String var9 = var0.getProxyPassword();
    java.lang.String var10 = var0.getProxyPort();
    
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

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test111");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(44)");
    var0.initialize("Refresh SAP NetWeaver server state(99)");
    var0.initialize("Refresh SAP NetWeaver server state(169)");
    var0.initialize("Refresh SAP NetWeaver server state(106)");
    var0.initialize("Refresh SAP NetWeaver server state(2006)");

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test112");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    org.eclipse.core.runtime.IStatus var11 = var0.getResult();
    boolean var12 = var0.isSystem();
    boolean var13 = var0.isSystem();
    
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
    assertTrue(var13 == true);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test113");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(2106)", 1);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test114");


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
    com.sap.netweaver.porta.core.NotAuthorizedException var31 = new com.sap.netweaver.porta.core.NotAuthorizedException("", (java.lang.Throwable)var26);
    java.lang.String var32 = var26.getEndpoint();
    java.lang.String var33 = var26.toString();
    com.sap.netweaver.porta.core.CoreException var34 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "+ "'", var33.equals("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. "));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test115");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.shouldRun();
    var0.wakeUp();
    int var7 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test116");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("hi!", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test117");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(1654)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test118");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    var1.dispose();
    var1.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var5 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var6 = var1.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var8 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var9 = var8.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var10 = var8.getServer();
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
    org.eclipse.core.runtime.IStatus var46 = var8.canModifyModules(var32, var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var47 = var1.getChildModules(var43);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
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

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test119");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var8 = var4.getSuppressed();
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(880)", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NoWSGateException var11 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var9, "Refresh SAP NetWeaver server state(2096)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test120");


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
    java.lang.String var98 = var93.getLabel();
    
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
    assertTrue("'" + var98 + "' != '" + "Publish to server"+ "'", var98.equals("Publish to server"));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test121");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(119)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test122");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("hi!", 10);
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var7 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var8 = var2.getLifecycleManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var9 = var2.getHttpAccessPoint();
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

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test123");


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
    var0.setSystem(false);
    boolean var42 = var0.shouldRun();
    
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
    assertTrue(var42 == true);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test124");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(950)", "Refresh SAP NetWeaver server state(1342)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test125");


    com.sap.netweaver.porta.core.CoreException var2 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(802)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(849)", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test126");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(682)", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(2306)", "com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(86)");

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test127");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    var0.startup();
    var0.savePluginPreferences();
    boolean var7 = var0.isDebugging();
    var0.startup();
    boolean var9 = var0.isDebugging();
    var0.internalInitializeDefaultPluginPreferences();
    var0.startup();
    org.eclipse.core.runtime.ILog var12 = var0.getLog();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test128");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(1038)", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(1435)", "Refresh SAP NetWeaver server state(1918)");

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test129");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(1367)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test130");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJ2EE14Classpath();
    var0.dispose();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var5 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test131");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.setName("Refresh SAP NetWeaver server state(14)");
    java.lang.Thread var9 = var0.getThread();
    int var10 = var0.getState();
    var0.join();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2532)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2532)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test132");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.sleep();
    var0.setName("Refresh SAP NetWeaver server state(280)");
    boolean var7 = var0.isSystem();
    var0.schedule();
    int var9 = var0.getPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 30);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test133");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("", "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    java.lang.String var3 = var2.getUser();
    java.lang.String var4 = var2.getPassword();
    java.lang.String var5 = var2.getPassword();
    java.lang.String var6 = var2.getUser();
    java.lang.String var7 = var2.getPassword();
    java.lang.String var8 = var2.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var4.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var5.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var7.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var8.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test134");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var7 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var7.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    com.sap.netweaver.porta.core.ServerState var12 = var7.getState();
    java.lang.Class var13 = var12.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var0.getAdapter(var13);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2535)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2535)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test135");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var2 = var0.getTaskModel();
    org.eclipse.wst.server.core.TaskModel var3 = var0.getTaskModel();
    var0.updateChildFragments();
    java.util.List var5 = var0.getChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test136");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(1512)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test137");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(366)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test138");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(465)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(714)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test139");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.wakeUp();
    java.lang.Thread var3 = var0.getThread();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    boolean var5 = var0.shouldSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test140");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    boolean var8 = var0.shouldSchedule();
    var0.wakeUp(0L);
    var0.schedule(10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test141");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException", 10);
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

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test142");


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
    boolean var29 = var0.sleep();
    var0.setUser(true);
    boolean var32 = var0.sleep();
    
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
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test143");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    var0.handleResourceChange();
    var0.dispose();
    var0.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = var0.canControlModule(var7);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    boolean var16 = var10.canControlModule(var14);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var10.canControlModule(var19);
    var10.dispose();
    var10.dispose();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var10, 1, var34, (java.lang.Integer)2);
    boolean var39 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var34);
    boolean var40 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var34);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 1, var34, (java.lang.Integer)(-1));
    java.lang.String var43 = var42.getDescription();
    int var44 = var42.getKind();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
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
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var43.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 2);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test144");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var7);
    java.lang.String var9 = var7.getEndpoint();
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var7);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(2106)", (java.lang.Throwable)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test145");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.cancel();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    java.lang.String var5 = var0.toString();
    var0.setUser(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(2546)"+ "'", var5.equals("Refresh SAP NetWeaver server state(2546)"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test146");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var1 = var0.getState();
    int var2 = var0.getPriority();
    boolean var3 = var0.shouldRun();
    var0.setName("Refresh SAP NetWeaver server state(1314)");
    var0.join();
    var0.wakeUp();
    org.eclipse.core.runtime.IStatus var8 = var0.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test147");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var2);
    java.lang.String var9 = var2.getHost();
    java.lang.String var10 = var2.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test148");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(773)");

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test149");


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
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var15 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var15.dispose();
    var15.dispose();
    var15.configurationChanged();
    org.eclipse.wst.server.core.IServer var19 = var15.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var21 = var20.getServer();
    org.eclipse.wst.server.core.IModule[] var22 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var23 = var20.canControlModule(var22);
    var20.handleResourceChange();
    var20.dispose();
    var20.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    boolean var34 = var28.canControlModule(var32);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var36 = var35.getServer();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = var35.canControlModule(var37);
    boolean var39 = var28.canControlModule(var37);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var20, 30, var37, (java.lang.Integer)100);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    var42.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var45 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var45.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = var47.canControlModule(var49);
    var47.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var52 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var53 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var52);
    boolean var54 = var47.canControlModule(var52);
    var47.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var59 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var60 = var59.getServer();
    org.eclipse.wst.server.core.IModule[] var61 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var62 = var59.canControlModule(var61);
    boolean var63 = var57.canControlModule(var61);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var64 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var65 = var64.getServer();
    org.eclipse.wst.server.core.IModule[] var66 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var67 = var64.canControlModule(var66);
    boolean var68 = var57.canControlModule(var66);
    var57.dispose();
    var57.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var72 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var73 = var72.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var74 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var75 = var74.getServer();
    org.eclipse.wst.server.core.IModule[] var76 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var77 = var74.canControlModule(var76);
    boolean var78 = var72.canControlModule(var76);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var79 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var80 = var79.getServer();
    org.eclipse.wst.server.core.IModule[] var81 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var82 = var79.canControlModule(var81);
    boolean var83 = var72.canControlModule(var81);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var85 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var57, 1, var81, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var87 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var47, 2, var81, (java.lang.Integer)1);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var88 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var89 = var88.getServer();
    org.eclipse.wst.server.core.IModule[] var90 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var91 = var88.canControlModule(var90);
    var88.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var93 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var94 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var93);
    boolean var95 = var88.canControlModule(var93);
    org.eclipse.core.runtime.IStatus var96 = var45.canModifyModules(var81, var93);
    boolean var97 = var42.canControlModule(var93);
    org.eclipse.core.runtime.IStatus var98 = var15.canModifyModules(var37, var93);
    boolean var99 = var0.canControlModule(var93);
    
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
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
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
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
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == false);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test150");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(453)", "Refresh SAP NetWeaver server state(119)(953)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test151");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    org.eclipse.wst.server.core.IServerWorkingCopy var1 = var0.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var2 = var0.getServer();
    org.eclipse.wst.server.core.IServerWorkingCopy var3 = var0.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var5 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var6 = var5.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var7 = var5.getServer();
    var5.dispose();
    var5.configurationChanged();
    org.eclipse.wst.server.core.IServer var10 = var5.getServer();
    org.eclipse.wst.server.core.IServer var11 = var5.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var12 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var13 = var12.shouldSchedule();
    java.lang.String var14 = var12.toString();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var15 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var15.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var17 = var15.getLog();
    var15.savePluginPreferences();
    boolean var19 = var12.belongsTo((java.lang.Object)var15);
    boolean var20 = var12.shouldSchedule();
    var12.setName("hi!");
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    var34.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var39 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var40 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var39);
    boolean var41 = var34.canControlModule(var39);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var43 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var23, (-1), var39, (java.lang.Integer)10);
    boolean var44 = var12.belongsTo((java.lang.Object)var39);
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
    org.eclipse.core.runtime.IStatus var55 = var5.canModifyModules(var39, var52);
    boolean var56 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var52);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var59 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var60 = var59.getServer();
    org.eclipse.wst.server.core.IModule[] var61 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var62 = var59.canControlModule(var61);
    boolean var63 = var57.canControlModule(var61);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var64 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var65 = var64.getServer();
    org.eclipse.wst.server.core.IModule[] var66 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var67 = var64.canControlModule(var66);
    boolean var68 = var57.canControlModule(var66);
    var57.dispose();
    var57.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var72 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var73 = var72.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var74 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var75 = var74.getServer();
    org.eclipse.wst.server.core.IModule[] var76 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var77 = var74.canControlModule(var76);
    boolean var78 = var72.canControlModule(var76);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var79 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var80 = var79.getServer();
    org.eclipse.wst.server.core.IModule[] var81 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var82 = var79.canControlModule(var81);
    boolean var83 = var72.canControlModule(var81);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var85 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var57, 1, var81, (java.lang.Integer)2);
    boolean var86 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var81);
    org.eclipse.core.runtime.IStatus var87 = var0.canModifyModules(var52, var81);
    boolean var88 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Refresh SAP NetWeaver server state(2548)"+ "'", var14.equals("Refresh SAP NetWeaver server state(2548)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
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
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
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
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
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
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test152");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Publish to server");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test153");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test154");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
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

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test155");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test156");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    org.eclipse.core.runtime.IStatus var11 = var0.getResult();
    var0.join();
    com.sap.netweaver.porta.core.snippets.SnippetGetProcessList var13 = new com.sap.netweaver.porta.core.snippets.SnippetGetProcessList();
    boolean var14 = var0.belongsTo((java.lang.Object)var13);
    
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
    assertTrue(var14 == false);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test157");


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
    int var88 = var0.getState();
    org.eclipse.core.runtime.IStatus var89 = var0.getResult();
    int var90 = var0.getState();
    var0.setName("Refresh SAP NetWeaver server state(1649)");
    
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
    assertTrue(var88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 0);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test158");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(1007)", 1);
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

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test159");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    boolean var11 = var0.isBlocking();
    boolean var12 = var0.isBlocking();
    boolean var13 = var0.isUser();
    boolean var14 = var0.isBlocking();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test160");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(432)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test161");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyUser();
    java.lang.String var5 = var0.getProxyPassword();
    java.lang.String var6 = var0.getProxyHost();
    java.lang.String var7 = var0.getProxyHost();
    java.lang.String var8 = var0.getProxyHost();
    
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

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test162");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var2 = var0.getRuntime();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
    java.lang.String[] var7 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var8 = var0.getRuntimeWorkingCopy();
    java.lang.String[] var9 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var10 = var0.getRuntime();
    java.lang.String[] var11 = var0.getJ2EE14Classpath();
    
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test163");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var1 = var0.getTabs();
    var0.dispose();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var3 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var4 = var0.getTabs();
    var0.dispose();
    var0.dispose();
    var0.dispose();
    var0.dispose();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var9 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var10 = var0.getTabs();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test164");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    org.eclipse.core.runtime.jobs.ISchedulingRule var11 = var0.getRule();
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
    boolean var37 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var36);
    var0.done(var36);
    java.lang.Thread var39 = var0.getThread();
    
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
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test165");


    com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("STOPPED");
    int var2 = var1.ordinal();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test166");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var2 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.NotAuthorizedException: MCK");
    com.sap.netweaver.porta.core.CoreException var3 = new com.sap.netweaver.porta.core.CoreException("Publish module to the SAP NetWeaver server", (java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.NotAuthorizedException var4 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var2);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test167");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(366)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test168");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(184)", 100);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var3.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var7 = var3.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var8 = var3.enableDebugging();
    com.sap.netweaver.porta.core.mock.CoreModuleMock var9 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    var3.disableDebugging("Refresh SAP NetWeaver server state(238)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var21 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var22 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var22.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var25 = var22.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var26 = var22.enableDebugging();
    var22.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var29 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var29.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var32 = var29.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var35 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var36 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var35.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    boolean var38 = var32.equals((java.lang.Object)var36);
    var22.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    var21.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    java.io.File[] var43 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var44 = var2.deploy(var43);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test169");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(296)", (-1));
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

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test170");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    var0.schedule();
    boolean var7 = var0.isSystem();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var8 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var8.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var11 = var8.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    org.eclipse.wst.server.core.IModule[] var18 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var19 = var16.canControlModule(var18);
    boolean var20 = var14.canControlModule(var18);
    boolean var21 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var18);
    boolean var22 = var12.canControlModule(var18);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = var24.canControlModule(var26);
    var24.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var29);
    boolean var31 = var24.canControlModule(var29);
    var24.handleResourceChange();
    org.eclipse.wst.server.core.IServer var33 = var24.getServer();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var24, 30, var42, (java.lang.Integer)100);
    boolean var47 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var42);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var12, 0, var42, (java.lang.Integer)2);
    boolean var50 = var11.equals((java.lang.Object)2);
    java.lang.Class var51 = var11.getDeclaringClass();
    java.lang.Class var52 = var11.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var53 = var0.getAdapter(var52);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
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
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test171");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("MCK", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test172");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    var0.disableDebugging("Refresh SAP NetWeaver server state(227)");
    var0.disableDebugging("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ");
    com.sap.netweaver.porta.core.DebugSessionInfo var12 = var0.enableDebugging();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test173");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    var0.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var5 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var6 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var5);
    boolean var7 = var0.canControlModule(var5);
    var0.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    boolean var16 = var10.canControlModule(var14);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var10.canControlModule(var19);
    var10.dispose();
    var10.dispose();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var10, 1, var34, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 2, var34, (java.lang.Integer)1);
    java.lang.String var41 = var40.getDescription();
    int var42 = var40.getOrder();
    int var43 = var40.getKind();
    java.lang.String var44 = var40.getDescription();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
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
    assertTrue("'" + var41 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var41.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var44.equals("Publish module to the SAP NetWeaver server"));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test174");


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
    java.lang.String[] var11 = var6.getJavaEE5Classpath();
    java.lang.String[] var12 = var6.getJ2EE14Classpath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var13 = var6.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test175");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var1 = var0.getTabs();
    var0.dispose();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var3 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var4 = var0.getTabs();
    var0.dispose();
    var0.dispose();
    var0.dispose();
    var0.dispose();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test176");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(703)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(1409)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test177");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
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
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var25 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var26 = var25.getResult();
    boolean var27 = var25.shouldSchedule();
    var25.wakeUp(100L);
    var25.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var33 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    var34.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var39 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var40 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var39);
    boolean var41 = var34.canControlModule(var39);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = var42.canControlModule(var44);
    var42.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = var47.canControlModule(var49);
    boolean var51 = var42.canControlModule(var49);
    org.eclipse.core.runtime.IStatus var52 = var33.canModifyModules(var39, var49);
    var25.done(var52);
    org.eclipse.core.runtime.IStatus var54 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var24, var52);
    boolean var55 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var52);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var57 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var57.dispose();
    var57.dispose();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var70 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var71 = var70.getServer();
    org.eclipse.wst.server.core.IModule[] var72 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var73 = var70.canControlModule(var72);
    var70.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var75 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var76 = var75.getServer();
    org.eclipse.wst.server.core.IModule[] var77 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var78 = var75.canControlModule(var77);
    boolean var79 = var70.canControlModule(var77);
    org.eclipse.core.runtime.IStatus var80 = var57.canModifyModules(var67, var77);
    boolean var81 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var80);
    org.eclipse.core.runtime.IStatus var82 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var52, var80);
    var0.done(var52);
    boolean var84 = var0.sleep();
    int var85 = var0.getPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
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
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
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
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == 30);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test178");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    com.sap.netweaver.porta.core.DeployManager var1 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    java.net.InetSocketAddress var3 = var0.getHttpAccessPoint();
    com.sap.netweaver.porta.core.DeployManager var4 = var0.getDeployManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test179");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var2 = var0.getTaskModel();
    var0.enter();
    boolean var4 = var0.hasComposite();
    var0.updateChildFragments();
    boolean var6 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test180");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    com.sap.netweaver.porta.core.CoreException var5 = new com.sap.netweaver.porta.core.CoreException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var6 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(286)", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var7 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK", (java.lang.Throwable)var4);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test181");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(356)", 0);
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

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test182");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    boolean var2 = var0.isBlocking();
    int var3 = var0.getState();
    boolean var4 = var0.shouldSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test183");


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
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var17 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var17.dispose();
    var17.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var20 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var21 = var20.getServer();
    org.eclipse.wst.server.core.IModule[] var22 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var23 = var20.canControlModule(var22);
    var20.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var25 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var26 = var25.getServer();
    org.eclipse.wst.server.core.IModule[] var27 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var28 = var25.canControlModule(var27);
    boolean var29 = var20.canControlModule(var27);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    var30.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var35 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var36 = var35.getServer();
    org.eclipse.wst.server.core.IModule[] var37 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var38 = var35.canControlModule(var37);
    boolean var39 = var30.canControlModule(var37);
    org.eclipse.core.runtime.IStatus var40 = var17.canModifyModules(var27, var37);
    org.eclipse.wst.server.core.IServer var41 = var17.getServer();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var63 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var64 = var63.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var65 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var66 = var65.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var67 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var68 = var67.getServer();
    org.eclipse.wst.server.core.IModule[] var69 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var70 = var67.canControlModule(var69);
    boolean var71 = var65.canControlModule(var69);
    boolean var72 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var69);
    boolean var73 = var63.canControlModule(var69);
    org.eclipse.core.runtime.IStatus var74 = var17.canModifyModules(var49, var69);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var76 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 1, var49, (java.lang.Integer)(-1));
    var0.handleResourceChange();
    org.eclipse.wst.server.core.IServer var78 = var0.getServer();
    var0.dispose();
    
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
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
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
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test184");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(366)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var4 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var5 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(602)", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var6 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(1634)", (java.lang.Throwable)var4);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test185");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    boolean var8 = var0.shouldSchedule();
    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var9 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    java.util.List var10 = var9.getChildFragments();
    var9.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var12 = var9.getTaskModel();
    var9.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var14 = var9.getTaskModel();
    java.util.List var15 = var9.getChildFragments();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var16 = var0.compareTo((java.lang.Object)var15);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test186");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.setSystem(false);
    int var9 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2566)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2566)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test187");


    com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("STOPPED");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Stopped"+ "'", var2.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Stopped"+ "'", var3.equals("Stopped"));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test188");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(602)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test189");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(150)(1907)");

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test190");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    var0.handleResourceChange();
    var0.dispose();
    var0.handleResourceChange();
    org.eclipse.wst.server.core.IServer var7 = var0.getServer();
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
    var9.handleResourceChange();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var9, 1, var42, (java.lang.Integer)0);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var50 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    org.eclipse.wst.server.core.IModule[] var53 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var54 = var51.canControlModule(var53);
    var51.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var56 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var57 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var56);
    boolean var58 = var51.canControlModule(var56);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var59 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var60 = var59.getServer();
    org.eclipse.wst.server.core.IModule[] var61 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var62 = var59.canControlModule(var61);
    var59.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var64 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var65 = var64.getServer();
    org.eclipse.wst.server.core.IModule[] var66 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var67 = var64.canControlModule(var66);
    boolean var68 = var59.canControlModule(var66);
    org.eclipse.core.runtime.IStatus var69 = var50.canModifyModules(var56, var66);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var71 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var9, 30, var56, (java.lang.Integer)(-1));
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var73 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 0, var56, (java.lang.Integer)0);
    int var74 = var73.getKind();
    java.lang.String var75 = var73.getLabel();
    int var76 = var73.getKind();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
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
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "Publish to server"+ "'", var75.equals("Publish to server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 2);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test191");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(802)", (-1));
    com.sap.netweaver.porta.core.DeployManager var3 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test192");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    boolean var6 = var0.cancel();
    var0.setUser(false);
    var0.setPriority(30);
    org.eclipse.core.runtime.IStatus var11 = var0.getResult();
    var0.setName("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ");
    var0.setName("Refresh SAP NetWeaver server state(275)");
    boolean var16 = var0.shouldRun();
    int var17 = var0.getPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 30);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test193");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var6 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var8);
    java.lang.String var10 = var8.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("", (java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException("com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", (java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var18 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var20 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var18, "MCK");
    var16.addSuppressed((java.lang.Throwable)var18);
    com.sap.netweaver.porta.core.NotAuthorizedException var22 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var16);
    java.lang.String var23 = var16.getHost();
    com.sap.netweaver.porta.core.CoreException var24 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.CoreException var25 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(167)", (java.lang.Throwable)var24);
    var12.addSuppressed((java.lang.Throwable)var24);
    com.sap.netweaver.porta.core.NotAuthorizedException var27 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "MCK"+ "'", var10.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test194");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var2 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var3 = var2.getResult();
    boolean var4 = var2.isUser();
    org.eclipse.core.runtime.IStatus var5 = var2.getResult();
    var2.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var10);
    boolean var12 = var2.belongsTo((java.lang.Object)var10);
    org.eclipse.core.runtime.IStatus var13 = var2.getResult();
    boolean var14 = var2.shouldSchedule();
    com.sap.netweaver.porta.core.ProxyException var18 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var20 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var22 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var20, "MCK");
    var18.addSuppressed((java.lang.Throwable)var20);
    com.sap.netweaver.porta.core.CoreException var24 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var18);
    com.sap.netweaver.porta.core.NotAuthorizedException var25 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(69)", (java.lang.Throwable)var18);
    boolean var26 = var2.belongsTo((java.lang.Object)var25);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var27 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var25);
    com.sap.netweaver.porta.core.CoreException var28 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var25);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var29 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var25);
    com.sap.netweaver.porta.core.CoreException var30 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(630)", (java.lang.Throwable)var29);
    com.sap.netweaver.porta.core.CoreException var31 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(154)", (java.lang.Throwable)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test195");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    boolean var8 = var0.isBlocking();
    var0.setName("Refresh SAP NetWeaver server state(51)");
    boolean var11 = var0.isBlocking();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test196");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    var0.disableDebugging("Refresh SAP NetWeaver server state(106)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test197");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(473)", "Refresh SAP NetWeaver server state(1830)");

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test198");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.ProxyException var9 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var11 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "MCK");
    var9.addSuppressed((java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var9);
    java.lang.Throwable[] var16 = var9.getSuppressed();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var17 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("", (java.lang.Throwable)var9);
    boolean var18 = var5.equals((java.lang.Object)"");
    java.lang.String var19 = var5.toString();
    java.lang.Class var20 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var22 = java.lang.Enum.<java.lang.Enum>valueOf(var20, "");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Stopped"+ "'", var19.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test199");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    int var6 = var5.ordinal();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var7 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var7.internalInitializeDefaultPluginPreferences();
    var7.setDebugging(true);
    boolean var11 = var5.equals((java.lang.Object)true);
    java.lang.String var12 = var5.toString();
    java.lang.Class var13 = var5.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Enum var15 = java.lang.Enum.<java.lang.Enum>valueOf(var13, "Refresh SAP NetWeaver server state(2082)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Stopped"+ "'", var12.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test200");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.join();
    int var6 = var0.getState();
    int var7 = var0.getState();
    org.eclipse.core.runtime.jobs.ISchedulingRule var8 = var0.getRule();
    boolean var9 = var0.shouldRun();
    int var10 = var0.getPriority();
    var0.setSystem(false);
    
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test201");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var5 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var5.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var8 = var5.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var11 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var12 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var11.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    boolean var14 = var8.equals((java.lang.Object)var12);
    com.sap.netweaver.porta.core.ProxyException var17 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var19 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var17, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var21 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var17, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var22 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var21);
    com.sap.netweaver.porta.core.ProxyException var24 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var26 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var24, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var28 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var24, "hi!");
    var22.addSuppressed((java.lang.Throwable)var28);
    boolean var30 = var8.equals((java.lang.Object)var28);
    com.sap.netweaver.porta.core.CoreException var31 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var28);
    com.sap.netweaver.porta.core.CoreException var32 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(184)", (java.lang.Throwable)var28);
    com.sap.netweaver.porta.core.NotAuthorizedException var33 = new com.sap.netweaver.porta.core.NotAuthorizedException("", (java.lang.Throwable)var28);
    com.sap.netweaver.porta.core.ProxyException var37 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var38 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var37);
    com.sap.netweaver.porta.core.NoWSGateException var40 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var37, "MCK");
    com.sap.netweaver.porta.core.NotAuthorizedException var41 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(46)", (java.lang.Throwable)var40);
    var28.addSuppressed((java.lang.Throwable)var41);
    java.lang.String var43 = var41.toString();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var44 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1317)", (java.lang.Throwable)var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(436)", (java.lang.Throwable)var44);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(46)"+ "'", var43.equals("com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(46)"));

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test202");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var4 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var4.dispose();
    var4.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var8 = var7.getServer();
    org.eclipse.wst.server.core.IModule[] var9 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var10 = var7.canControlModule(var9);
    var7.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    boolean var16 = var7.canControlModule(var14);
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
    org.eclipse.core.runtime.IStatus var27 = var4.canModifyModules(var14, var24);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var30 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var31 = var30.getServer();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = var30.canControlModule(var32);
    boolean var34 = var28.canControlModule(var32);
    org.eclipse.core.runtime.IStatus var35 = var1.canModifyModules(var24, var32);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var36 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer();
    var36.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var38 = var36.getServerWorkingCopy();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var39 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var40 = var39.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var42 = var41.getServer();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = var41.canControlModule(var43);
    boolean var45 = var39.canControlModule(var43);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var47 = var46.getServer();
    org.eclipse.wst.server.core.IModule[] var48 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var49 = var46.canControlModule(var48);
    boolean var50 = var39.canControlModule(var48);
    boolean var51 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var48);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var52 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var53 = var52.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var54 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var55 = var54.getServer();
    org.eclipse.wst.server.core.IModule[] var56 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var57 = var54.canControlModule(var56);
    boolean var58 = var52.canControlModule(var56);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var59 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var60 = var59.getServer();
    org.eclipse.wst.server.core.IModule[] var61 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var62 = var59.canControlModule(var61);
    boolean var63 = var52.canControlModule(var61);
    var52.dispose();
    var52.dispose();
    var52.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var68 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var69 = var68.getServer();
    org.eclipse.wst.server.core.IServer var70 = var68.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var71 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var72 = var71.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var73 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var74 = var73.getServer();
    org.eclipse.wst.server.core.IModule[] var75 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var76 = var73.canControlModule(var75);
    boolean var77 = var71.canControlModule(var75);
    boolean var78 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var75);
    boolean var79 = var68.canControlModule(var75);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var81 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var52, (-1), var75, (java.lang.Integer)100);
    org.eclipse.core.runtime.IStatus var82 = var36.canModifyModules(var48, var75);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.server.core.IModule[] var83 = var1.getChildModules(var75);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
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
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test203");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var8 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var9 = var8.getErrorMessage();
    boolean var10 = var7.belongsTo((java.lang.Object)var8);
    int var11 = var7.getPriority();
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
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var33 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var34 = var33.getResult();
    boolean var35 = var33.shouldSchedule();
    var33.wakeUp(100L);
    var33.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var41 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = var42.canControlModule(var44);
    var42.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var47 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var48 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var47);
    boolean var49 = var42.canControlModule(var47);
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
    org.eclipse.core.runtime.IStatus var60 = var41.canModifyModules(var47, var57);
    var33.done(var60);
    org.eclipse.core.runtime.IStatus var62 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var32, var60);
    var7.done(var32);
    var0.done(var32);
    boolean var65 = var0.cancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);
    
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
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
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
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test204");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.schedule();
    var0.schedule(10L);
    var0.wakeUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test205");


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

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test206");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(779)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.InetSocketAddress var3 = var2.getHttpAccessPoint();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test207");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(1191)");

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test208");


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
    int var12 = var0.getState();
    boolean var13 = var0.shouldRun();
    var0.wakeUp();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2582)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2582)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test209");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Publish module to the SAP NetWeaver server");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    com.sap.netweaver.porta.core.ServerState var12 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var13 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var14 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var15 = var0.getState();
    com.sap.netweaver.porta.core.ServerState var16 = var0.getState();
    java.lang.String var17 = var16.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Stopped"+ "'", var17.equals("Stopped"));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test210");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(152)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test211");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(842)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test212");


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
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var21 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var22 = var21.getResult();
    boolean var23 = var21.shouldSchedule();
    var21.wakeUp(100L);
    var21.setSystem(true);
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
    var21.done(var48);
    org.eclipse.core.runtime.IStatus var50 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var20, var48);
    boolean var51 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var48);
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
    boolean var77 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var76);
    org.eclipse.core.runtime.IStatus var78 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var48, var76);
    boolean var79 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var76);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
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
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test213");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var6);
    java.lang.String var11 = var6.getHost();
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(238)", (java.lang.Throwable)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(1659)", (java.lang.Throwable)var6);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test214");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.join();
    int var6 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var8 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var9 = var8.getErrorMessage();
    boolean var10 = var7.belongsTo((java.lang.Object)var8);
    var7.join();
    boolean var12 = var7.isBlocking();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var13 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var14 = var13.getResult();
    boolean var15 = var13.shouldSchedule();
    var13.wakeUp(100L);
    boolean var18 = var13.isSystem();
    java.lang.String var19 = var13.toString();
    var13.setName("Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var23 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var23.dispose();
    var23.dispose();
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
    org.eclipse.core.runtime.IStatus var46 = var23.canModifyModules(var33, var43);
    boolean var47 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var46);
    var13.done(var46);
    var7.done(var46);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var50 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var51 = var50.getResult();
    boolean var52 = var50.isUser();
    org.eclipse.core.runtime.IStatus var53 = var50.getResult();
    var50.setPriority(30);
    var50.schedule(0L);
    org.eclipse.core.runtime.IStatus var58 = var50.getResult();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var60 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var60.dispose();
    var60.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var63 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var64 = var63.getServer();
    org.eclipse.wst.server.core.IModule[] var65 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var66 = var63.canControlModule(var65);
    var63.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var68 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var69 = var68.getServer();
    org.eclipse.wst.server.core.IModule[] var70 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var71 = var68.canControlModule(var70);
    boolean var72 = var63.canControlModule(var70);
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
    org.eclipse.core.runtime.IStatus var83 = var60.canModifyModules(var70, var80);
    org.eclipse.core.runtime.IStatus var84 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var58, var83);
    org.eclipse.core.runtime.IStatus var85 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var46, var58);
    var0.done(var85);
    boolean var87 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var85);
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Refresh SAP NetWeaver server state(2586)"+ "'", var19.equals("Refresh SAP NetWeaver server state(2586)"));
    
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
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
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
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test215");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(945)", 100);
    java.lang.String var3 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(945)"+ "'", var3.equals("Refresh SAP NetWeaver server state(945)"));

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test216");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(637)", "Refresh SAP NetWeaver server state(703)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test217");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(1281)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test218");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(660)", (-1));
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

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test219");


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
    boolean var36 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var33);
    boolean var37 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2588)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2588)"));
    
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
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test220");


    com.sap.netweaver.porta.core.NotAuthorizedException var5 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(906)");
    com.sap.netweaver.porta.core.NotAuthorizedException var6 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(587)", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var7 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(469)", (java.lang.Throwable)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(2490)", "Refresh SAP NetWeaver server state(998)", (java.lang.Throwable)var6);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test221");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(296)", 100);
    var2.setCredentials("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: MCK", "Refresh SAP NetWeaver server state(2495)");

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test222");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.NotAuthorizedException: MCK");
    com.sap.netweaver.porta.core.CoreException var4 = new com.sap.netweaver.porta.core.CoreException("Publish module to the SAP NetWeaver server", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var5 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(184)", (java.lang.Throwable)var5);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test223");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Publish module to the SAP NetWeaver server", "Refresh SAP NetWeaver server state(183)");
    java.lang.String var3 = var2.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var3.equals("Publish module to the SAP NetWeaver server"));

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test224");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(764)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test225");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    boolean var11 = var0.isBlocking();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var12 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var12.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var15 = var12.getState();
    java.lang.String var16 = var15.toString();
    java.lang.String var17 = var15.toString();
    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var18 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var19 = var18.getJ2EE14Classpath();
    var18.dispose();
    var18.dispose();
    boolean var22 = var15.equals((java.lang.Object)var18);
    boolean var23 = var0.belongsTo((java.lang.Object)var18);
    var0.wakeUp();
    var0.join();
    java.lang.String var26 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Stopped"+ "'", var16.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Stopped"+ "'", var17.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var26.equals("Refresh SAP NetWeaver server state"));

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test226");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(783)", 30);
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

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test227");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(2309)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test228");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(718)", 100);
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

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test229");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: MCK", 30);
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

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test230");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var1 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var1.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var4 = var1.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var7 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var8 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var7.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    boolean var10 = var4.equals((java.lang.Object)var8);
    com.sap.netweaver.porta.core.ProxyException var13 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var15 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var17 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var18 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.ProxyException var20 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var22 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var20, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var24 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var20, "hi!");
    var18.addSuppressed((java.lang.Throwable)var24);
    boolean var26 = var4.equals((java.lang.Object)var24);
    com.sap.netweaver.porta.core.ProxyException var29 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var30 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var29);
    var24.addSuppressed((java.lang.Throwable)var30);
    com.sap.netweaver.porta.core.ProxyException var36 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var38 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var40 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var38, "MCK");
    var36.addSuppressed((java.lang.Throwable)var38);
    com.sap.netweaver.porta.core.NotAuthorizedException var42 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var36);
    java.lang.Throwable[] var43 = var36.getSuppressed();
    com.sap.netweaver.porta.core.NotAuthorizedException var44 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(127)", (java.lang.Throwable)var36);
    com.sap.netweaver.porta.core.NotAuthorizedException var45 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(504)", (java.lang.Throwable)var36);
    var24.addSuppressed((java.lang.Throwable)var45);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(975)", (java.lang.Throwable)var24);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test231");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(249)", "Refresh SAP NetWeaver server state(184)");
    java.lang.String var3 = var2.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(249)"+ "'", var3.equals("Refresh SAP NetWeaver server state(249)"));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test232");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJ2EE14Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
    java.lang.String[] var7 = var0.getJavaEE5Classpath();
    
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

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test233");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(176)");

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test234");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.wakeUp(1L);
    var0.setUser(false);
    int var11 = var0.getPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2595)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2595)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 30);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test235");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var1 = var0.getTaskModel();
    var0.enter();
    java.util.List var3 = var0.getChildFragments();
    org.eclipse.wst.server.core.TaskModel var4 = var0.getTaskModel();
    var0.exit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test236");


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
      var0.start();
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

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test237");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(982)", 100);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test238");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(2214)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test239");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(1267)", 1);
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

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test240");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    var0.updateChildFragments();
    var0.enter();
    org.eclipse.wst.server.core.TaskModel var3 = var0.getTaskModel();
    var0.exit();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test241");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: MCK", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(119)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test242");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(1227)");

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test243");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(505)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test244");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.schedule(10L);
    org.eclipse.core.runtime.jobs.ISchedulingRule var8 = var0.getRule();
    boolean var9 = var0.cancel();
    com.sap.netweaver.porta.core.ServerState var11 = com.sap.netweaver.porta.core.ServerState.valueOf("STOPPED");
    java.lang.String var12 = var11.toString();
    java.lang.Class var13 = var11.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var0.getAdapter(var13);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Stopped"+ "'", var12.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test245");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    java.lang.Thread var6 = var0.getThread();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getPriority();
    boolean var9 = var0.cancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Refresh SAP NetWeaver server state(2598)"+ "'", var7.equals("Refresh SAP NetWeaver server state(2598)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test246");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var3 = var2.getHost();
    com.sap.netweaver.porta.core.CoreException var4 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(773)", (java.lang.Throwable)var2);
    java.lang.String var5 = var2.getHost();
    java.lang.String var6 = var2.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Stopped"+ "'", var3.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Stopped"+ "'", var5.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Stopped"+ "'", var6.equals("Stopped"));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test247");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(376)", "Refresh SAP NetWeaver server state(280)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test248");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("", "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    java.lang.String var3 = var2.getUser();
    java.lang.String var4 = var2.getPassword();
    java.lang.String var5 = var2.getUser();
    java.lang.String var6 = var2.getPassword();
    java.lang.String var7 = var2.getUser();
    java.lang.String var8 = var2.getUser();
    java.lang.String var9 = var2.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var4.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var6.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var9.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test249");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.wakeUp((-1L));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
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
    assertTrue("'" + var30 + "' != '" + "Refresh SAP NetWeaver server state(2599)"+ "'", var30.equals("Refresh SAP NetWeaver server state(2599)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var33.equals("Refresh SAP NetWeaver server state"));

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test250");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    var0.disableDebugging("Publish to server");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test251");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.setSystem(false);
    boolean var8 = var0.shouldSchedule();
    var0.setName("Refresh SAP NetWeaver server state(119)");
    boolean var11 = var0.cancel();
    java.lang.Thread var12 = var0.getThread();
    java.lang.String var13 = var0.toString();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var14 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var15 = var14.getState();
    java.lang.Class var16 = var15.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var0.getAdapter(var16);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Refresh SAP NetWeaver server state(119)(2601)"+ "'", var13.equals("Refresh SAP NetWeaver server state(119)(2601)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test252");


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
    org.eclipse.core.runtime.jobs.ISchedulingRule var32 = var0.getRule();
    boolean var33 = var0.cancel();
    
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
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test253");


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
    int var14 = var5.ordinal();
    com.sap.netweaver.porta.core.mock.ServerMock var15 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var15.ping();
    com.sap.netweaver.porta.core.LifecycleManager var17 = var15.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var18 = var15.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var19 = var15.getLifecycleManager();
    boolean var20 = var5.equals((java.lang.Object)var15);
    java.lang.String var21 = var15.getSystemName();
    com.sap.netweaver.porta.core.LifecycleManager var22 = var15.getLifecycleManager();
    
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
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "MCK"+ "'", var21.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test254");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    java.lang.String var6 = var0.toString();
    var0.wakeUp(1L);
    var0.schedule();
    boolean var10 = var0.shouldRun();
    var0.wakeUp(100L);
    boolean var13 = var0.isSystem();
    var0.schedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2607)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2607)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test255");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(356)", 0);
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

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test256");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(2360)", "Refresh SAP NetWeaver server state(2225)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test257");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var1 = var0.getTaskModel();
    var0.updateChildFragments();
    boolean var3 = var0.hasComposite();
    var0.updateChildFragments();
    var0.exit();
    var0.enter();
    var0.exit();
    java.util.List var8 = var0.getChildFragments();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test258");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var3.disableDebugging("");
    var3.disableDebugging("MCK");
    com.sap.netweaver.porta.core.ServerState var10 = var3.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Publish module to the SAP NetWeaver server");
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var13);
    com.sap.netweaver.porta.core.mock.CoreModuleMock var15 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var15.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var18);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var22 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var15.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var22);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test259");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var1 = var0.getState();
    int var2 = var0.getPriority();
    boolean var3 = var0.shouldSchedule();
    var0.join();
    org.eclipse.core.runtime.jobs.ISchedulingRule var5 = var0.getRule();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test260");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var4);
    java.lang.Throwable[] var11 = var10.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(230)", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.NoWSGateException var14 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var12, "Refresh SAP NetWeaver server state(637)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(1683)", (java.lang.Throwable)var14);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test261");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isUser();
    boolean var8 = var0.isBlocking();
    int var9 = var0.getPriority();
    java.lang.String var10 = var0.toString();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var12 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    var13.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var18 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var19 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var18);
    boolean var20 = var13.canControlModule(var18);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var22 = var21.getServer();
    org.eclipse.wst.server.core.IModule[] var23 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var24 = var21.canControlModule(var23);
    var21.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var26 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var27 = var26.getServer();
    org.eclipse.wst.server.core.IModule[] var28 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var29 = var26.canControlModule(var28);
    boolean var30 = var21.canControlModule(var28);
    org.eclipse.core.runtime.IStatus var31 = var12.canModifyModules(var18, var28);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var32 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var33 = var32.getResult();
    boolean var34 = var32.shouldSchedule();
    var32.wakeUp(100L);
    var32.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var40 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var42 = var41.getServer();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = var41.canControlModule(var43);
    var41.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var46);
    boolean var48 = var41.canControlModule(var46);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var50 = var49.getServer();
    org.eclipse.wst.server.core.IModule[] var51 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var52 = var49.canControlModule(var51);
    var49.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var54 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var55 = var54.getServer();
    org.eclipse.wst.server.core.IModule[] var56 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var57 = var54.canControlModule(var56);
    boolean var58 = var49.canControlModule(var56);
    org.eclipse.core.runtime.IStatus var59 = var40.canModifyModules(var46, var56);
    var32.done(var59);
    org.eclipse.core.runtime.IStatus var61 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var31, var59);
    boolean var62 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var59);
    var0.done(var59);
    var0.wakeUp();
    
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
    assertTrue(var9 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state(2610)"+ "'", var10.equals("Refresh SAP NetWeaver server state(2610)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test262");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.setName("Refresh SAP NetWeaver server state(184)");
    var0.schedule(1L);
    int var6 = var0.getState();
    boolean var7 = var0.shouldRun();
    java.lang.String var8 = var0.getName();
    org.eclipse.core.runtime.jobs.ISchedulingRule var9 = var0.getRule();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Refresh SAP NetWeaver server state(184)"+ "'", var8.equals("Refresh SAP NetWeaver server state(184)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test263");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var3 = var0.getLifecycleManager();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var6 = var0.getDeployManager();
    java.net.InetSocketAddress var7 = var0.getHttpAccessPoint();
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
    assertNotNull(var7);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test264");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(152)", 100);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("MCK", 0);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(376)");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var13 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(187)", 0);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(739)");
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var19 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test265");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(461)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test266");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(187)", 0);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(46)", 1);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(238)");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.stop();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test267");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPassword();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyUser();
    java.lang.String var4 = var0.getProxyPort();
    java.lang.String var5 = var0.getProxyPort();
    java.lang.String var6 = var0.getNonProxyHosts();
    
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

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test268");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var3 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var4 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var5 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var0.getLifecycleManager();
    java.lang.String var7 = var0.getSystemName();
    java.net.InetSocketAddress var8 = var0.getHttpAccessPoint();
    java.net.InetSocketAddress var9 = var0.getHttpAccessPoint();
    
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
    assertTrue("'" + var7 + "' != '" + "MCK"+ "'", var7.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test269");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(14)");
    var0.initialize("Refresh SAP NetWeaver server state(51)");
    var0.initialize("Refresh SAP NetWeaver server state(168)");
    var0.initialize("Refresh SAP NetWeaver server state(1122)");

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test270");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("com.sap.netweaver.porta.core.ProxyException: The host Refresh SAP NetWeaver server state(633) cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test271");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var2 = var0.getRuntime();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    java.lang.String[] var7 = var0.getJavaEE5Classpath();
    
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
    assertNotNull(var7);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test272");


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
    com.sap.netweaver.porta.mon.CommandFactory var13 = new com.sap.netweaver.porta.mon.CommandFactory();
    boolean var14 = var0.belongsTo((java.lang.Object)var13);
    boolean var15 = var0.sleep();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test273");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(1774)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test274");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    boolean var7 = var0.isSystem();
    int var8 = var0.getPriority();
    java.lang.String var9 = var0.getName();
    java.lang.String var10 = var0.getName();
    var0.setSystem(true);
    
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
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var9.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var10.equals("Refresh SAP NetWeaver server state"));

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test275");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var8 = var4.getSuppressed();
    java.lang.String var9 = var4.getHost();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.ProxyException var12 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(889)");
    var4.addSuppressed((java.lang.Throwable)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(672)", (java.lang.Throwable)var12);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test276");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(704)", "Refresh SAP NetWeaver server state(238)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test277");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(863)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test278");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(131)", 30);
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

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test279");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(1038)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test280");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("MCK");
    com.sap.netweaver.porta.core.NotAuthorizedException var4 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.ProxyException var8 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var10 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var10, "MCK");
    var8.addSuppressed((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NotAuthorizedException var16 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NotAuthorizedException var17 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(176)", (java.lang.Throwable)var16);
    var3.addSuppressed((java.lang.Throwable)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(2380)", (java.lang.Throwable)var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test281");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.String var6 = var5.name();
    java.lang.String var7 = var5.toString();
    java.lang.String var8 = var5.toString();
    java.lang.String var9 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "STOPPED"+ "'", var6.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Stopped"+ "'", var8.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Stopped"+ "'", var9.equals("Stopped"));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test282");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(2403)", "MCK");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test283");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    var0.startup();
    var0.startup();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    org.osgi.framework.Bundle var9 = var0.getBundle();
    org.eclipse.core.runtime.ILog var10 = var0.getLog();
    org.eclipse.core.runtime.ILog var11 = var0.getLog();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test284");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    var2.addSuppressed((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var8 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var2);
    java.lang.String var9 = var2.toString();
    com.sap.netweaver.porta.core.CoreException var10 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var2);
    java.lang.String var12 = var2.getHost();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "+ "'", var9.equals("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test285");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isUser();
    boolean var8 = var0.isBlocking();
    boolean var9 = var0.isUser();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var10 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var11 = var10.getResult();
    boolean var12 = var10.isUser();
    org.eclipse.core.runtime.IStatus var13 = var10.getResult();
    var10.setPriority(30);
    var10.schedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var18 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    org.eclipse.wst.server.core.IModule[] var21 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var22 = var19.canControlModule(var21);
    var19.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var24 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var25 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var24);
    boolean var26 = var19.canControlModule(var24);
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
    org.eclipse.core.runtime.IStatus var37 = var18.canModifyModules(var24, var34);
    boolean var38 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var37);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var40 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var41 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var42 = var41.getServer();
    org.eclipse.wst.server.core.IModule[] var43 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var44 = var41.canControlModule(var43);
    var41.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var46 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var47 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var46);
    boolean var48 = var41.canControlModule(var46);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var50 = var49.getServer();
    org.eclipse.wst.server.core.IModule[] var51 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var52 = var49.canControlModule(var51);
    var49.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var54 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var55 = var54.getServer();
    org.eclipse.wst.server.core.IModule[] var56 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var57 = var54.canControlModule(var56);
    boolean var58 = var49.canControlModule(var56);
    org.eclipse.core.runtime.IStatus var59 = var40.canModifyModules(var46, var56);
    org.eclipse.core.runtime.IStatus var60 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var37, var59);
    var10.done(var59);
    boolean var62 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var59);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var63 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var64 = var63.getResult();
    boolean var65 = var63.isUser();
    org.eclipse.core.runtime.IStatus var66 = var63.getResult();
    var63.schedule(100L);
    var63.wakeUp(0L);
    boolean var71 = var63.sleep();
    org.eclipse.core.runtime.IStatus var72 = var63.getResult();
    org.eclipse.core.runtime.IStatus var73 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var59, var72);
    boolean var74 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var73);
    var0.done(var73);
    
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
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
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test286");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isUser();
    boolean var8 = var0.isBlocking();
    int var9 = var0.getState();
    java.lang.String var10 = var0.getName();
    org.eclipse.core.runtime.jobs.ISchedulingRule var11 = var0.getRule();
    
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
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var10.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test287");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var3 = var0.getRuntime();
    java.lang.String[] var4 = var0.getJ2EE14Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test288");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isUser();
    boolean var8 = var0.isBlocking();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var9 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var10 = var9.getResult();
    boolean var11 = var9.isUser();
    org.eclipse.core.runtime.IStatus var12 = var9.getResult();
    var9.setPriority(30);
    var9.schedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var17 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var19 = var18.getServer();
    org.eclipse.wst.server.core.IModule[] var20 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var21 = var18.canControlModule(var20);
    var18.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var23 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var24 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var23);
    boolean var25 = var18.canControlModule(var23);
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
    org.eclipse.core.runtime.IStatus var36 = var17.canModifyModules(var23, var33);
    boolean var37 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var36);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var39 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var41 = var40.getServer();
    org.eclipse.wst.server.core.IModule[] var42 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var43 = var40.canControlModule(var42);
    var40.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var45 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var46 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var45);
    boolean var47 = var40.canControlModule(var45);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var48 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var49 = var48.getServer();
    org.eclipse.wst.server.core.IModule[] var50 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var51 = var48.canControlModule(var50);
    var48.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var53 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var54 = var53.getServer();
    org.eclipse.wst.server.core.IModule[] var55 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var56 = var53.canControlModule(var55);
    boolean var57 = var48.canControlModule(var55);
    org.eclipse.core.runtime.IStatus var58 = var39.canModifyModules(var45, var55);
    org.eclipse.core.runtime.IStatus var59 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var36, var58);
    var9.done(var58);
    boolean var61 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var58);
    var0.done(var58);
    java.lang.String var63 = var0.getName();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
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
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var63.equals("Refresh SAP NetWeaver server state"));

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test289");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    org.eclipse.wst.server.core.TaskModel var1 = var0.getTaskModel();
    var0.updateChildFragments();
    boolean var3 = var0.hasComposite();
    org.eclipse.wst.server.core.TaskModel var4 = var0.getTaskModel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test290");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var14 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.NoWSGateException var16 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var14, "Refresh SAP NetWeaver server state(123)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(1830)", (java.lang.Throwable)var14);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test291");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.sleep();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var6 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var7 = var6.getResult();
    boolean var8 = var6.isUser();
    boolean var9 = var6.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var10 = var6.getRule();
    org.eclipse.core.runtime.IStatus var11 = var6.getResult();
    boolean var12 = var6.shouldRun();
    boolean var13 = var6.isUser();
    var6.schedule();
    boolean var15 = var0.belongsTo((java.lang.Object)var6);
    org.eclipse.core.runtime.IStatus var16 = var0.getResult();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test292");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.sleep();
    java.lang.Thread var5 = var0.getThread();
    boolean var6 = var0.isBlocking();
    java.lang.String var7 = var0.toString();
    var0.wakeUp(10L);
    boolean var10 = var0.shouldSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Refresh SAP NetWeaver server state(2630)"+ "'", var7.equals("Refresh SAP NetWeaver server state(2630)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test293");


    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var8 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var10 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var8, "MCK");
    var6.addSuppressed((java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var6);
    java.lang.Throwable[] var13 = var12.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(230)", (java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var15 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NotAuthorizedException var16 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", (java.lang.Throwable)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(664)", "Refresh SAP NetWeaver server state(46)", (java.lang.Throwable)var14);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test294");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    var0.setDebugging(false);
    org.eclipse.core.runtime.ILog var5 = var0.getLog();
    org.osgi.framework.Bundle var6 = var0.getBundle();
    var0.savePluginPreferences();
    var0.startup();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test295");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(176)");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(176)"+ "'", var2.equals("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(176)"));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test296");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("STOPPED", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(2132)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test297");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    var0.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var5 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var6 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var5);
    boolean var7 = var0.canControlModule(var5);
    var0.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    boolean var16 = var10.canControlModule(var14);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var10.canControlModule(var19);
    var10.dispose();
    var10.dispose();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var10, 1, var34, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 2, var34, (java.lang.Integer)1);
    int var41 = var40.getKind();
    int var42 = var40.getOrder();
    int var43 = var40.getKind();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
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
    assertTrue(var41 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 2);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test298");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var4 = var0.getErrorMessage();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(46)");
    var0.dispose();
    java.lang.String var8 = var0.getErrorMessage();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(889)");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Refresh SAP NetWeaver server state(46)"+ "'", var8.equals("Refresh SAP NetWeaver server state(46)"));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test299");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
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
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var25 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var26 = var25.getResult();
    boolean var27 = var25.shouldSchedule();
    var25.wakeUp(100L);
    var25.setSystem(true);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var33 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var35 = var34.getServer();
    org.eclipse.wst.server.core.IModule[] var36 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var37 = var34.canControlModule(var36);
    var34.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var39 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var40 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var39);
    boolean var41 = var34.canControlModule(var39);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var42 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var43 = var42.getServer();
    org.eclipse.wst.server.core.IModule[] var44 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var45 = var42.canControlModule(var44);
    var42.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var47 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var48 = var47.getServer();
    org.eclipse.wst.server.core.IModule[] var49 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var50 = var47.canControlModule(var49);
    boolean var51 = var42.canControlModule(var49);
    org.eclipse.core.runtime.IStatus var52 = var33.canModifyModules(var39, var49);
    var25.done(var52);
    org.eclipse.core.runtime.IStatus var54 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var24, var52);
    boolean var55 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var52);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var57 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var57.dispose();
    var57.dispose();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var70 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var71 = var70.getServer();
    org.eclipse.wst.server.core.IModule[] var72 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var73 = var70.canControlModule(var72);
    var70.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var75 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var76 = var75.getServer();
    org.eclipse.wst.server.core.IModule[] var77 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var78 = var75.canControlModule(var77);
    boolean var79 = var70.canControlModule(var77);
    org.eclipse.core.runtime.IStatus var80 = var57.canModifyModules(var67, var77);
    boolean var81 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var80);
    org.eclipse.core.runtime.IStatus var82 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var52, var80);
    var0.done(var52);
    boolean var84 = var0.sleep();
    java.lang.String var85 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
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
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
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
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var85.equals("Refresh SAP NetWeaver server state"));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test300");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(123)");
    java.lang.String var2 = var1.toString();
    com.sap.netweaver.porta.core.NoWSGateException var4 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var1, "Refresh SAP NetWeaver server state(662)");
    java.lang.String var5 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)"+ "'", var2.equals("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)"+ "'", var5.equals("com.sap.netweaver.porta.core.CoreException: Refresh SAP NetWeaver server state(123)"));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test301");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test302");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var2 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    boolean var4 = var0.isDebugging();
    var0.setDebugging(true);
    var0.startup();
    var0.savePluginPreferences();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test303");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(919)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test304");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Publish module to the SAP NetWeaver server");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    com.sap.netweaver.porta.core.ServerState var12 = var0.getState();
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
    assertNotNull(var12);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test305");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(1348)");

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test306");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var7 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var7.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var10 = var7.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var13 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var14 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    boolean var16 = var10.equals((java.lang.Object)var14);
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    var0.disableDebugging("Refresh SAP NetWeaver server state(154)");
    com.sap.netweaver.porta.core.DebugSessionInfo var20 = var0.enableDebugging();
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test307");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(275)");

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test308");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    boolean var8 = var0.isBlocking();
    java.lang.String var9 = var0.getName();
    int var10 = var0.getPriority();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var13 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var14 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var18 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var18);
    boolean var20 = var0.belongsTo((java.lang.Object)var13);
    com.sap.netweaver.porta.core.Application[] var21 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var22 = var13.undeploy(var21);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var9.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test309");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(1055)");
    com.sap.netweaver.porta.core.CoreException var3 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(504)", (java.lang.Throwable)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test310");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyPort();
    java.lang.String var4 = var0.getProxyPassword();
    java.lang.String var5 = var0.getProxyPassword();
    java.lang.String var6 = var0.getProxyPort();
    java.lang.String var7 = var0.getProxyHost();
    
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

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test311");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.setSystem(false);
    boolean var8 = var0.isBlocking();
    boolean var9 = var0.cancel();
    boolean var10 = var0.cancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test312");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(1645)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test313");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    var0.wakeUp(0L);
    var0.schedule();
    boolean var9 = var0.isBlocking();
    var0.setName("Refresh SAP NetWeaver server state(1117)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test314");


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
    int var30 = var28.getOrder();
    
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
    assertTrue(var30 == 0);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test315");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.DebugSessionInfo var1 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(1335)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.restart();
      fail("Expected exception of type com.sap.netweaver.porta.core.NotAuthorizedException");
    } catch (com.sap.netweaver.porta.core.NotAuthorizedException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test316");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("", 0);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var5 = var2.getDeployManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var2.getSystemName();
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

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test317");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("MCK", 0);
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ", 10);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "MCK");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    java.io.File[] var11 = new java.io.File[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var12 = var2.deploy(var11);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test318");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(294)");

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test319");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    var0.join();
    int var6 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var7 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var8 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var9 = var8.getErrorMessage();
    boolean var10 = var7.belongsTo((java.lang.Object)var8);
    var7.join();
    boolean var12 = var7.isBlocking();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var13 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var14 = var13.getResult();
    boolean var15 = var13.shouldSchedule();
    var13.wakeUp(100L);
    boolean var18 = var13.isSystem();
    java.lang.String var19 = var13.toString();
    var13.setName("Refresh SAP NetWeaver server state(14)");
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var23 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var23.dispose();
    var23.dispose();
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
    org.eclipse.core.runtime.IStatus var46 = var23.canModifyModules(var33, var43);
    boolean var47 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var46);
    var13.done(var46);
    var7.done(var46);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var50 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var51 = var50.getResult();
    boolean var52 = var50.isUser();
    org.eclipse.core.runtime.IStatus var53 = var50.getResult();
    var50.setPriority(30);
    var50.schedule(0L);
    org.eclipse.core.runtime.IStatus var58 = var50.getResult();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var60 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var60.dispose();
    var60.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var63 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var64 = var63.getServer();
    org.eclipse.wst.server.core.IModule[] var65 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var66 = var63.canControlModule(var65);
    var63.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var68 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var69 = var68.getServer();
    org.eclipse.wst.server.core.IModule[] var70 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var71 = var68.canControlModule(var70);
    boolean var72 = var63.canControlModule(var70);
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
    org.eclipse.core.runtime.IStatus var83 = var60.canModifyModules(var70, var80);
    org.eclipse.core.runtime.IStatus var84 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var58, var83);
    org.eclipse.core.runtime.IStatus var85 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var46, var58);
    var0.done(var85);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var87 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var88 = var87.getResult();
    boolean var89 = var87.isUser();
    org.eclipse.core.runtime.IStatus var90 = var87.getResult();
    var87.schedule(100L);
    var87.wakeUp(0L);
    boolean var95 = var87.sleep();
    org.eclipse.core.runtime.IStatus var96 = var87.getResult();
    java.lang.String var97 = var87.getName();
    org.eclipse.core.runtime.IStatus var98 = var87.getResult();
    org.eclipse.core.runtime.IStatus var99 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var85, var98);
    
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Refresh SAP NetWeaver server state(2643)"+ "'", var19.equals("Refresh SAP NetWeaver server state(2643)"));
    
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
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
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
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
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
    assertTrue("'" + var97 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var97.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var99);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test320");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    java.lang.String var2 = var0.toString();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var3 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var3.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var5 = var3.getLog();
    var3.savePluginPreferences();
    boolean var7 = var0.belongsTo((java.lang.Object)var3);
    boolean var8 = var0.shouldRun();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var9 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var10 = var9.getResult();
    boolean var11 = var9.isUser();
    org.eclipse.core.runtime.IStatus var12 = var9.getResult();
    var9.schedule(100L);
    var9.wakeUp(0L);
    boolean var17 = var9.sleep();
    org.eclipse.core.runtime.IStatus var18 = var9.getResult();
    boolean var19 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var18);
    var0.done(var18);
    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var21 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var22 = var21.getJ2EE14Classpath();
    var21.dispose();
    org.eclipse.wst.server.core.IRuntime var24 = var21.getRuntime();
    var21.dispose();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var26 = var21.getRuntimeWorkingCopy();
    java.lang.String[] var27 = var21.getJavaEE5Classpath();
    java.lang.String[] var28 = var21.getJavaEE5Classpath();
    boolean var29 = var0.belongsTo((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(2647)"+ "'", var2.equals("Refresh SAP NetWeaver server state(2647)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test321");


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
    assertNull(var11);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test322");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var3 = var0.getLifecycleManager();
    var0.ping();
    java.lang.String var5 = var0.getSystemName();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var7 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var8 = var0.getLifecycleManager();
    java.net.InetSocketAddress var9 = var0.getHttpAccessPoint();
    com.sap.netweaver.porta.core.DeployManager var10 = var0.getDeployManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "MCK"+ "'", var5.equals("MCK"));
    
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

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test323");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(2064)", (-1));

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test324");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(725)", "Refresh SAP NetWeaver server state(471)");
    java.lang.String var3 = var2.getUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(725)"+ "'", var3.equals("Refresh SAP NetWeaver server state(725)"));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test325");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.sleep();
    var0.schedule();
    java.lang.Thread var7 = var0.getThread();
    boolean var8 = var0.cancel();
    boolean var9 = var0.sleep();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(2649)"+ "'", var4.equals("Refresh SAP NetWeaver server state(2649)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test326");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(233)", 10);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var2.getDeployManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var2.getSystemName();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test327");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(130)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test328");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(1348)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test329");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(2506)");

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test330");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.swt.graphics.Image var1 = org.eclipse.jface.dialogs.Dialog.getImage("Refresh SAP NetWeaver server state(2268)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test331");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(2522)");

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test332");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    org.eclipse.core.runtime.ILog var5 = var0.getLog();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    boolean var8 = var0.isDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test333");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    boolean var2 = var0.shouldSchedule();
    int var3 = var0.getState();
    boolean var4 = var0.isSystem();
    var0.wakeUp(100L);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var7 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var7.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var10 = var7.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var11 = var7.getState();
    java.lang.String var12 = var11.toString();
    java.lang.Class var13 = var11.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var0.getAdapter(var13);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
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
    assertTrue("'" + var12 + "' != '" + "Stopped"+ "'", var12.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test334");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.osgi.framework.Bundle var2 = var0.getBundle();
    var0.setDebugging(false);
    org.eclipse.core.runtime.ILog var5 = var0.getLog();
    var0.setDebugging(false);
    org.eclipse.core.runtime.ILog var8 = var0.getLog();
    boolean var9 = var0.isDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test335");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    java.lang.Throwable[] var11 = var4.getSuppressed();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NoWSGateException var14 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "Refresh SAP NetWeaver server state(660)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var15 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var16 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(169)", (java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var17 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var19 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(487)");
    var15.addSuppressed((java.lang.Throwable)var19);
    com.sap.netweaver.porta.core.NotAuthorizedException var21 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test336");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    java.lang.Throwable[] var9 = var3.getSuppressed();
    java.lang.String var10 = var3.getHost();
    java.lang.String var11 = var3.getHost();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(1924)", "Refresh SAP NetWeaver server state(301)", (java.lang.Throwable)var3);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test337");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(74)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test338");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(1707)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test339");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    int var3 = var0.getPriority();
    boolean var4 = var0.isSystem();
    boolean var5 = var0.isBlocking();
    var0.wakeUp();
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    boolean var8 = var0.isUser();
    
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
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test340");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var3 = var0.getLifecycleManager();
    var0.ping();
    java.lang.String var5 = var0.getSystemName();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var7 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var8 = var0.getLifecycleManager();
    java.lang.String var9 = var0.getSystemName();
    com.sap.netweaver.porta.core.LifecycleManager var10 = var0.getLifecycleManager();
    java.net.InetSocketAddress var11 = var0.getHttpAccessPoint();
    java.lang.String var12 = var0.getSystemName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "MCK"+ "'", var5.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "MCK"+ "'", var9.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "MCK"+ "'", var12.equals("MCK"));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test341");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(325)", 0);
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

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test342");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(888)", 1);
    com.sap.netweaver.porta.core.LifecycleManager var3 = var2.getLifecycleManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test343");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.wakeUp();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var4 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var5 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var6 = var5.getServer();
    org.eclipse.wst.server.core.IModule[] var7 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var8 = var5.canControlModule(var7);
    var5.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var10);
    boolean var12 = var5.canControlModule(var10);
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
    org.eclipse.core.runtime.IStatus var23 = var4.canModifyModules(var10, var20);
    boolean var24 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var23);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var26 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var27 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var28 = var27.getServer();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = var27.canControlModule(var29);
    var27.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var32 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var33 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var32);
    boolean var34 = var27.canControlModule(var32);
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
    org.eclipse.core.runtime.IStatus var45 = var26.canModifyModules(var32, var42);
    org.eclipse.core.runtime.IStatus var46 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var23, var45);
    var0.done(var46);
    boolean var48 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
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
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test344");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var2 = var1.getResult();
    boolean var3 = var1.isUser();
    org.eclipse.core.runtime.IStatus var4 = var1.getResult();
    var1.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var9);
    boolean var11 = var1.belongsTo((java.lang.Object)var9);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(69)", (java.lang.Throwable)var9);
    java.lang.Throwable[] var13 = var12.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test345");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWRuntimeWizardFragment();
    var0.updateChildFragments();
    org.eclipse.wst.server.core.TaskModel var2 = var0.getTaskModel();
    var0.enter();
    var0.exit();
    boolean var5 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test346");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("");
    var0.initialize("Refresh SAP NetWeaver server state(889)");
    var0.initialize("Refresh SAP NetWeaver server state(2495)");

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test347");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("Refresh SAP NetWeaver server state(2300)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test348");


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
    com.sap.netweaver.porta.core.CoreException var25 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(436)", (java.lang.Throwable)var3);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test349");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(14)(2136)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test350");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    int var8 = var0.getPriority();
    java.lang.String var9 = var0.toString();
    java.lang.Thread var10 = var0.getThread();
    boolean var11 = var0.shouldRun();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state(2657)"+ "'", var9.equals("Refresh SAP NetWeaver server state(2657)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test351");


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
    java.lang.String var14 = var5.name();
    int var15 = var5.ordinal();
    int var16 = var5.ordinal();
    java.lang.String var17 = var5.toString();
    
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
    assertTrue("'" + var14 + "' != '" + "STOPPED"+ "'", var14.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Stopped"+ "'", var17.equals("Stopped"));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test352");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.setDebugging(false);
    var0.startup();
    var0.savePluginPreferences();
    var0.savePluginPreferences();

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test353");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Publish module to the SAP NetWeaver server", 1);
    int var3 = var2.getPort();
    java.lang.String var4 = var2.getKey();
    int var5 = var2.getPort();
    java.lang.String var6 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var4.equals("Publish module to the SAP NetWeaver server"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Publish module to the SAP NetWeaver server"+ "'", var6.equals("Publish module to the SAP NetWeaver server"));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test354");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(465)", 100);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var4 = var3.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var7 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "hi!");
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test355");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("Refresh SAP NetWeaver server state(465)");
    com.sap.netweaver.porta.core.NotAuthorizedException var3 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logError("Refresh SAP NetWeaver server state(2096)", (java.lang.Throwable)var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test356");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(457)", 10);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(766)", 0);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var8 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(152)", 2);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var11 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var8.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var11);
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var11);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(2475)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test357");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(718)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.disableDebugging("Refresh SAP NetWeaver server state(739)");
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test358");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    boolean var11 = var0.isBlocking();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var12 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var12.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var15 = var12.getState();
    java.lang.String var16 = var15.toString();
    java.lang.String var17 = var15.toString();
    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var18 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var19 = var18.getJ2EE14Classpath();
    var18.dispose();
    var18.dispose();
    boolean var22 = var15.equals((java.lang.Object)var18);
    boolean var23 = var0.belongsTo((java.lang.Object)var18);
    java.lang.String[] var24 = var18.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Stopped"+ "'", var16.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Stopped"+ "'", var17.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test359");


    com.sap.netweaver.porta.core.ProxyException var2 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "MCK");
    com.sap.netweaver.porta.core.ProxyException var8 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var10 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var10, "MCK");
    var8.addSuppressed((java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException("", (java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var16 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var15);
    var2.addSuppressed((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NoWSGateException var19 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var2, "Refresh SAP NetWeaver server state(151)");
    com.sap.netweaver.porta.core.ProxyException var23 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var25 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var27 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var25, "MCK");
    var23.addSuppressed((java.lang.Throwable)var25);
    com.sap.netweaver.porta.core.CoreException var29 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(14)", (java.lang.Throwable)var25);
    java.lang.String var30 = var25.getHost();
    com.sap.netweaver.porta.core.NotAuthorizedException var31 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(238)", (java.lang.Throwable)var25);
    var2.addSuppressed((java.lang.Throwable)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.util.ProxyUtilCaller.handleProxyException(var2);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test360");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(1701)", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test361");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(2082)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test362");


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
    var7.wakeUp();
    int var14 = var7.getState();
    
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
    assertTrue(var14 == 1);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test363");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getNonProxyHosts();
    java.lang.String var4 = var0.getProxyPort();
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

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test364");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var5 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "MCK");
    var1.addSuppressed((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var7 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var1);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test365");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.setName("Refresh SAP NetWeaver server state(184)");
    var0.setUser(false);
    boolean var6 = var0.isSystem();
    boolean var7 = var0.isSystem();
    var0.setUser(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test366");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyUser();
    java.lang.String var2 = var0.getProxyPassword();
    java.lang.String var3 = var0.getProxyHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + ""+ "'", var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test367");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("com.sap.netweaver.porta.core.NotAuthorizedException: MCK", 30);
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

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test368");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(1512)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.start();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test369");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.NoWSGateException var13 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var11, "Refresh SAP NetWeaver server state(14)");
    java.lang.String var14 = var13.getEndpoint();
    com.sap.netweaver.porta.core.NoWSGateException var16 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var13, "STOPPED");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var17 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", (java.lang.Throwable)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Refresh SAP NetWeaver server state(14)"+ "'", var14.equals("Refresh SAP NetWeaver server state(14)"));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test370");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(1018)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test371");


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
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var53 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var53.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var56 = var53.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var57 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var58 = var57.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var59 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var60 = var59.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var61 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var62 = var61.getServer();
    org.eclipse.wst.server.core.IModule[] var63 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var64 = var61.canControlModule(var63);
    boolean var65 = var59.canControlModule(var63);
    boolean var66 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var63);
    boolean var67 = var57.canControlModule(var63);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var69 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var70 = var69.getServer();
    org.eclipse.wst.server.core.IModule[] var71 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var72 = var69.canControlModule(var71);
    var69.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var74 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var75 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var74);
    boolean var76 = var69.canControlModule(var74);
    var69.handleResourceChange();
    org.eclipse.wst.server.core.IServer var78 = var69.getServer();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var91 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var69, 30, var87, (java.lang.Integer)100);
    boolean var92 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var87);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var94 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var57, 0, var87, (java.lang.Integer)2);
    boolean var95 = var56.equals((java.lang.Object)2);
    java.lang.Class var96 = var56.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var97 = var0.getAdapter(var96);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
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
    assertTrue(var92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test372");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    boolean var6 = var0.cancel();
    var0.setUser(false);
    var0.setPriority(30);
    boolean var11 = var0.shouldRun();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test373");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    var0.disableDebugging("Refresh SAP NetWeaver server state(538)");
    var0.disableDebugging("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(46)");
    var0.disableDebugging("Refresh SAP NetWeaver server state(1073)");
    var0.disableDebugging("Refresh SAP NetWeaver server state(2387)");
    com.sap.netweaver.porta.core.ServerState var15 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test374");


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
    var29.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var42 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var42.dispose();
    var42.dispose();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var55 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var56 = var55.getServer();
    org.eclipse.wst.server.core.IModule[] var57 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var58 = var55.canControlModule(var57);
    var55.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var60 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var61 = var60.getServer();
    org.eclipse.wst.server.core.IModule[] var62 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var63 = var60.canControlModule(var62);
    boolean var64 = var55.canControlModule(var62);
    org.eclipse.core.runtime.IStatus var65 = var42.canModifyModules(var52, var62);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var67 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var29, 1, var62, (java.lang.Integer)0);
    boolean var68 = var0.canControlModule(var62);
    boolean var69 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var62);
    
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
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test375");


    com.sap.netweaver.porta.core.NotAuthorizedException var3 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(513)");
    com.sap.netweaver.porta.core.CoreException var4 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(152)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var5 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(2351)", (java.lang.Throwable)var3);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test376");


    com.sap.netweaver.porta.core.NotAuthorizedException var2 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.NotAuthorizedException var4 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(970)", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NotAuthorizedException var5 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var3);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test377");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Stopped"+ "'", var4.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Stopped"+ "'", var5.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Stopped"+ "'", var6.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Stopped"+ "'", var7.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "STOPPED"+ "'", var8.equals("STOPPED"));

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test378");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    boolean var2 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    var0.savePluginPreferences();
    org.eclipse.core.runtime.ILog var5 = var0.getLog();
    boolean var6 = var0.isDebugging();
    org.osgi.framework.Bundle var7 = var0.getBundle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test379");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    boolean var6 = var0.shouldRun();
    boolean var7 = var0.isUser();
    boolean var8 = var0.isBlocking();
    boolean var9 = var0.isUser();
    boolean var10 = var0.shouldRun();
    
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
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test380");


    com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.wizard.SapNWServerWizardFragment();
    java.util.List var1 = var0.getChildFragments();
    var0.updateChildFragments();
    boolean var3 = var0.hasComposite();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test381");


    com.sap.netweaver.porta.core.CoreException var2 = new com.sap.netweaver.porta.core.CoreException("Publish to server");
    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    java.lang.Throwable[] var10 = var6.getSuppressed();
    java.lang.String var11 = var6.getHost();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var12);
    var2.addSuppressed((java.lang.Throwable)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(2136)", (java.lang.Throwable)var12);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test382");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    boolean var5 = var0.isSystem();
    var0.setUser(false);
    boolean var8 = var0.cancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test383");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNWRuntimeClasspathProvider();
    var0.initialize("Refresh SAP NetWeaver server state(44)");
    var0.initialize("com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ");
    var0.initialize("Refresh SAP NetWeaver server state(1353)");
    var0.initialize("Refresh SAP NetWeaver server state(1353)");

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test384");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(436)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test385");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getNonProxyHosts();
    java.lang.String var4 = var0.getNonProxyHosts();
    java.lang.String var5 = var0.getProxyUser();
    java.lang.String var6 = var0.getNonProxyHosts();
    
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

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test386");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    var0.savePluginPreferences();
    var0.savePluginPreferences();
    boolean var5 = var0.isDebugging();
    boolean var6 = var0.isDebugging();
    org.eclipse.core.runtime.ILog var7 = var0.getLog();
    var0.startup();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test387");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.schedule();
    var0.wakeUp();
    boolean var5 = var0.cancel();
    var0.setSystem(false);
    var0.setUser(false);
    boolean var10 = var0.isSystem();
    boolean var11 = var0.cancel();
    boolean var12 = var0.isBlocking();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var13 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var13.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var13.disableDebugging("");
    com.sap.netweaver.porta.core.ServerState var18 = var13.getState();
    java.lang.Class var19 = var18.getDeclaringClass();
    java.lang.String var20 = var18.toString();
    java.lang.Class var21 = var18.getDeclaringClass();
    com.sap.netweaver.porta.core.Credentials var24 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(233)", "Refresh SAP NetWeaver server state(323)");
    boolean var25 = var18.equals((java.lang.Object)"Refresh SAP NetWeaver server state(323)");
    java.lang.Class var26 = var18.getDeclaringClass();
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
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Stopped"+ "'", var20.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test388");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test389");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(152)", 0);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test390");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test391");


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
    org.eclipse.wst.server.core.TaskModel var32 = var28.getTaskModel();
    org.eclipse.wst.server.core.TaskModel var33 = var28.getTaskModel();
    int var34 = var28.getOrder();
    
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
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test392");


    com.sap.netweaver.porta.core.CoreException var1 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(362)");
    com.sap.netweaver.porta.core.NotAuthorizedException var2 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var1);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var1);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test393");


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
    boolean var21 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var20);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var23 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = var24.canControlModule(var26);
    var24.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var29);
    boolean var31 = var24.canControlModule(var29);
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
    org.eclipse.core.runtime.IStatus var42 = var23.canModifyModules(var29, var39);
    org.eclipse.core.runtime.IStatus var43 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var20, var42);
    boolean var44 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var42);
    boolean var45 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasErrorMessage(var42);
    boolean var46 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var42);
    boolean var47 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var42);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var48 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var49 = var48.getResult();
    boolean var50 = var48.isUser();
    org.eclipse.core.runtime.IStatus var51 = var48.getResult();
    var48.schedule(100L);
    var48.wakeUp(0L);
    boolean var56 = var48.sleep();
    org.eclipse.core.runtime.IStatus var57 = var48.getResult();
    boolean var58 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var57);
    org.eclipse.core.runtime.IStatus var59 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var42, var57);
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var60 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var61 = var60.getResult();
    boolean var62 = var60.isUser();
    org.eclipse.core.runtime.IStatus var63 = var60.getResult();
    var60.schedule(100L);
    var60.wakeUp(0L);
    boolean var68 = var60.sleep();
    org.eclipse.core.runtime.IStatus var69 = var60.getResult();
    boolean var70 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var69);
    org.eclipse.core.runtime.IStatus var71 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.merge(var59, var69);
    boolean var72 = com.sap.netweaver.porta.ide.eclipse.util.StatusUtil.hasEmptyMessage(var59);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test394");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWLaunchConfigurationTabGroup();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var1 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var2 = var0.getTabs();
    var0.dispose();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var4 = var0.getTabs();
    org.eclipse.debug.ui.ILaunchConfigurationTab[] var5 = var0.getTabs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test395");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(862)", 1);
    java.lang.String var3 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(862)"+ "'", var3.equals("Refresh SAP NetWeaver server state(862)"));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test396");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Refresh SAP NetWeaver server state(2677)"+ "'", var5.equals("Refresh SAP NetWeaver server state(2677)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test397");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var3 = var0.getLifecycleManager();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var5 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.LifecycleManager var6 = var0.getLifecycleManager();
    java.lang.String var7 = var0.getSystemName();
    var0.ping();
    com.sap.netweaver.porta.core.DeployManager var9 = var0.getDeployManager();
    com.sap.netweaver.porta.core.LifecycleManager var10 = var0.getLifecycleManager();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test398");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.getByName("Refresh SAP NetWeaver server state(2519)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test399");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var1 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var2 = var1.getErrorMessage();
    boolean var3 = var0.belongsTo((java.lang.Object)var1);
    var0.join();
    boolean var5 = var0.cancel();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test400");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    java.lang.String var11 = var4.getHost();
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(44)", (java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(926)", (java.lang.Throwable)var13);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test401");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(69)", 10);
    var2.setCredentials("Refresh SAP NetWeaver server state(187)", "com.sap.netweaver.porta.core.NotAuthorizedException: com.sap.netweaver.porta.core.CoreException: ");
    var2.setCredentials("com.sap.netweaver.porta.core.AuthenticationRefusedException: com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", "Refresh SAP NetWeaver server state(505)");
    var2.setCredentials("Refresh SAP NetWeaver server state(221)", "Refresh SAP NetWeaver server state(167)");
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

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test402");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    boolean var8 = var0.isBlocking();
    boolean var9 = var0.cancel();
    boolean var10 = var0.isUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test403");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    org.eclipse.core.runtime.IStatus var8 = var0.getResult();
    java.lang.String var9 = var0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var9.equals("Refresh SAP NetWeaver server state"));

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test404");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var3 = var1.getServer();
    var1.configurationChanged();
    var1.dispose();
    var1.configurationChanged();
    org.eclipse.wst.server.core.IServerWorkingCopy var7 = var1.getServerWorkingCopy();
    var1.dispose();
    org.eclipse.wst.server.core.IServerWorkingCopy var9 = var1.getServerWorkingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test405");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(46)", (java.lang.Throwable)var7);
    java.lang.Throwable[] var9 = var7.getSuppressed();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(471)", (java.lang.Throwable)var7);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test406");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    int var3 = var0.getPriority();
    var0.schedule(100L);
    boolean var6 = var0.isBlocking();
    int var7 = var0.getPriority();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 30);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test407");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    java.lang.String var1 = var0.getErrorMessage();
    var0.dispose();
    java.lang.String var3 = var0.getErrorMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test408");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    boolean var6 = var0.cancel();
    boolean var7 = var0.shouldSchedule();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var8 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    int var9 = var8.getState();
    int var10 = var8.getPriority();
    boolean var11 = var8.isSystem();
    boolean var12 = var0.belongsTo((java.lang.Object)var8);
    boolean var13 = var8.shouldSchedule();
    int var14 = var8.getPriority();
    var8.setSystem(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 30);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test409");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(634)", 1);
    java.lang.String var3 = var2.getKey();
    int var4 = var2.getPort();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(634)"+ "'", var3.equals("Refresh SAP NetWeaver server state(634)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test410");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1148)");

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test411");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntimeWorkingCopy var2 = var0.getRuntimeWorkingCopy();
    var0.dispose();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var4 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test412");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    var4.addSuppressed((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NotAuthorizedException var10 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var4);
    java.lang.String var11 = var4.getHost();
    com.sap.netweaver.porta.core.CoreException var12 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NoWSGateException var15 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "Refresh SAP NetWeaver server state(119)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var16 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.CoreException var17 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NoWSGateException: Deploy Web Service application not available. This application installs the Web Service that enables the publish operations. You need to install it on the target server in order to execute any publish operations. ", "com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(366)", (java.lang.Throwable)var4);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test413");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.String var10 = var3.getHost();
    com.sap.netweaver.porta.core.CoreException var11 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NoWSGateException var14 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "Refresh SAP NetWeaver server state(119)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var15 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.CoreException var16 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logWarning("Refresh SAP NetWeaver server state(862)", (java.lang.Throwable)var16);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test414");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(457)", 100);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test415");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var3 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var3);
    com.sap.netweaver.porta.core.ServerState var5 = var0.getState();
    java.lang.Class var6 = var5.getDeclaringClass();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var7 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var7.setDebugging(false);
    boolean var10 = var5.equals((java.lang.Object)false);
    int var11 = var5.ordinal();
    com.sap.netweaver.porta.core.ProxyException var15 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var17 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var19 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var17, "MCK");
    var15.addSuppressed((java.lang.Throwable)var17);
    com.sap.netweaver.porta.core.NotAuthorizedException var21 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var15);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var22 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("hi!", (java.lang.Throwable)var21);
    com.sap.netweaver.porta.core.ProxyException var25 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var27 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var29 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var27, "MCK");
    var25.addSuppressed((java.lang.Throwable)var27);
    com.sap.netweaver.porta.core.NotAuthorizedException var31 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var25);
    com.sap.netweaver.porta.core.CoreException var32 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var31);
    com.sap.netweaver.porta.core.NotAuthorizedException var33 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var32);
    var22.addSuppressed((java.lang.Throwable)var32);
    boolean var35 = var5.equals((java.lang.Object)var22);
    com.sap.netweaver.porta.core.NotAuthorizedException var36 = new com.sap.netweaver.porta.core.NotAuthorizedException((java.lang.Throwable)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test416");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW711Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    org.eclipse.wst.server.core.IRuntime var4 = var0.getRuntime();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
    java.lang.String[] var6 = var0.getJavaEE5Classpath();
    java.lang.String[] var7 = var0.getJ2EE14Classpath();
    java.lang.String[] var8 = var0.getJavaEE5Classpath();
    java.lang.String[] var9 = var0.getJ2EE14Classpath();
    
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test417");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    com.sap.netweaver.porta.core.NotAuthorizedException var8 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var8);
    boolean var10 = var0.belongsTo((java.lang.Object)var8);
    org.eclipse.core.runtime.IStatus var11 = var0.getResult();
    boolean var12 = var0.isSystem();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var13 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var13.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    com.sap.netweaver.porta.core.ServerState var18 = var13.getState();
    int var19 = var18.ordinal();
    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var20 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var20.internalInitializeDefaultPluginPreferences();
    var20.setDebugging(true);
    boolean var24 = var18.equals((java.lang.Object)true);
    java.lang.String var25 = var18.toString();
    java.lang.Class var26 = var18.getDeclaringClass();
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
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Stopped"+ "'", var25.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test418");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(879)", "Refresh SAP NetWeaver server state(2375)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test419");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(419)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test420");


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
    var0.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    org.eclipse.wst.server.core.IServer var18 = var16.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var19 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var20 = var19.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var22 = var21.getServer();
    org.eclipse.wst.server.core.IModule[] var23 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var24 = var21.canControlModule(var23);
    boolean var25 = var19.canControlModule(var23);
    boolean var26 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var23);
    boolean var27 = var16.canControlModule(var23);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var29 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, (-1), var23, (java.lang.Integer)100);
    org.eclipse.wst.server.core.IServer var30 = var0.getServer();
    var0.dispose();
    
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test421");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    org.eclipse.wst.server.core.IRuntime var2 = var0.getRuntime();
    java.lang.String[] var3 = var0.getJavaEE5Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test422");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    org.eclipse.core.runtime.IStatus var5 = var0.getResult();
    var0.setUser(true);
    java.lang.Thread var8 = var0.getThread();
    
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
    assertNull(var8);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test423");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(366)", 30);
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

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test424");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(2548)", (-1));

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test425");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.getByName("Refresh SAP NetWeaver server state(921)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test426");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(764)", 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var3 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test427");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(562)", 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test428");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(294)", 10);
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

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test429");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResultStatus var1 = com.sap.netweaver.porta.core.DeployResultStatus.valueOf("Refresh SAP NetWeaver server state(296)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test430");


    com.sap.netweaver.porta.core.NotAuthorizedException var1 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(795)");

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test431");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(638)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test432");


    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var2 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(1092)");

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test433");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(242)", 10);
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

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test434");


    com.sap.netweaver.porta.core.ProxyException var1 = new com.sap.netweaver.porta.core.ProxyException("Stopped");
    java.lang.String var2 = var1.getHost();
    java.lang.String var3 = var1.getHost();
    java.lang.Throwable[] var4 = var1.getSuppressed();
    com.sap.netweaver.porta.core.CoreException var5 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var1);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Stopped"+ "'", var3.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test435");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(152)", 100);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("MCK", 0);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "Refresh SAP NetWeaver server state(376)");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var11 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test436");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldSchedule();
    java.lang.String var2 = var0.toString();
    java.lang.String var3 = var0.toString();
    boolean var4 = var0.isSystem();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Refresh SAP NetWeaver server state(2692)"+ "'", var2.equals("Refresh SAP NetWeaver server state(2692)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(2692)"+ "'", var3.equals("Refresh SAP NetWeaver server state(2692)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test437");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(317)", 10);
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var5 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var6 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var6);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var8 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var8);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var5.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(366)");
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DebugSessionInfo var19 = var2.enableDebugging();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test438");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(2260)", "Refresh SAP NetWeaver server state(707)", (java.lang.Throwable)var3);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test439");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(564)", "Refresh SAP NetWeaver server state(443)");
    java.lang.String var3 = var2.getUser();
    java.lang.String var4 = var2.getPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(564)"+ "'", var3.equals("Refresh SAP NetWeaver server state(564)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(443)"+ "'", var4.equals("Refresh SAP NetWeaver server state(443)"));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test440");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(184)", 100);
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var3 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var3.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var3.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var7 = var3.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var8 = var3.enableDebugging();
    com.sap.netweaver.porta.core.mock.CoreModuleMock var9 = new com.sap.netweaver.porta.core.mock.CoreModuleMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var12);
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "MCK");
    var9.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var16);
    var3.disableDebugging("Refresh SAP NetWeaver server state(238)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var21 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var22 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var22.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var25 = var22.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var26 = var22.enableDebugging();
    var22.disableDebugging("Refresh SAP NetWeaver server state(184)");
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var29 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var29.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var32 = var29.getState();
    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var35 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("", 1);
    com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager var36 = new com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager();
    var35.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    boolean var38 = var32.equals((java.lang.Object)var36);
    var22.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    var21.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    var3.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    var2.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var36);
    com.sap.netweaver.porta.core.Application[] var43 = new com.sap.netweaver.porta.core.Application[] { };
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.DeployResult var44 = var2.undeploy(var43);
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test441");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(2094)", (-1));

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test442");


    com.sap.netweaver.porta.core.AuthenticationRefusedException var1 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(732)");

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test443");


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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var15 = var14.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var16 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var17 = var16.getServer();
    org.eclipse.wst.server.core.IModule[] var18 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var19 = var16.canControlModule(var18);
    boolean var20 = var14.canControlModule(var18);
    boolean var21 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var18);
    boolean var22 = var12.canControlModule(var18);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var24 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var25 = var24.getServer();
    org.eclipse.wst.server.core.IModule[] var26 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var27 = var24.canControlModule(var26);
    var24.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var29 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var30 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var29);
    boolean var31 = var24.canControlModule(var29);
    var24.handleResourceChange();
    org.eclipse.wst.server.core.IServer var33 = var24.getServer();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var46 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var24, 30, var42, (java.lang.Integer)100);
    boolean var47 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var42);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var49 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var12, 0, var42, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var51 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var52 = var51.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var53 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var54 = var53.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var55 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var56 = var55.getServer();
    org.eclipse.wst.server.core.IModule[] var57 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var58 = var55.canControlModule(var57);
    boolean var59 = var53.canControlModule(var57);
    boolean var60 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var57);
    boolean var61 = var51.canControlModule(var57);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var63 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var64 = var63.getServer();
    org.eclipse.wst.server.core.IModule[] var65 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var66 = var63.canControlModule(var65);
    var63.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var68 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var69 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var68);
    boolean var70 = var63.canControlModule(var68);
    var63.handleResourceChange();
    org.eclipse.wst.server.core.IServer var72 = var63.getServer();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var85 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var63, 30, var81, (java.lang.Integer)100);
    boolean var86 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var81);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var88 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var51, 0, var81, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var90 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var12, 1, var81, (java.lang.Integer)1);
    boolean var91 = var0.canControlModule(var81);
    boolean var92 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var81);
    boolean var93 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var81);
    boolean var94 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var81);
    boolean var95 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var81);
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
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
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
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
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == true);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test444");


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
    com.sap.netweaver.porta.core.CoreException var17 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(176)");
    var15.addSuppressed((java.lang.Throwable)var17);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test445");


    com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection var0 = new com.sap.netweaver.porta.ide.eclipse.server.ui.editor.SapNWInstanceEditorSection();
    var0.dispose();
    var0.setErrorMessage("Refresh SAP NetWeaver server state");
    java.lang.String var4 = var0.getErrorMessage();
    var0.setErrorMessage("Refresh SAP NetWeaver server state(46)");
    var0.setErrorMessage("Publish module to the SAP NetWeaver server");
    org.eclipse.core.runtime.IStatus[] var9 = var0.getSaveStatus();
    org.eclipse.core.runtime.IStatus[] var10 = var0.getSaveStatus();
    var0.dispose();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var4.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test446");


    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var0 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var1 = var0.getServer();
    org.eclipse.wst.server.core.IModule[] var2 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var3 = var0.canControlModule(var2);
    var0.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var5 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var6 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var5);
    boolean var7 = var0.canControlModule(var5);
    var0.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var11 = var10.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var12 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var13 = var12.getServer();
    org.eclipse.wst.server.core.IModule[] var14 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var15 = var12.canControlModule(var14);
    boolean var16 = var10.canControlModule(var14);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var17 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var18 = var17.getServer();
    org.eclipse.wst.server.core.IModule[] var19 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var20 = var17.canControlModule(var19);
    boolean var21 = var10.canControlModule(var19);
    var10.dispose();
    var10.dispose();
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
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var38 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var10, 1, var34, (java.lang.Integer)2);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var40 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var0, 2, var34, (java.lang.Integer)1);
    org.eclipse.wst.server.core.TaskModel var41 = var40.getTaskModel();
    int var42 = var40.getOrder();
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
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
    assertTrue(var42 == 0);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test447");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.setUser(false);
    boolean var5 = var0.isSystem();
    org.eclipse.core.runtime.jobs.ISchedulingRule var6 = var0.getRule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test448");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getNonProxyHosts();
    java.lang.String var4 = var0.getProxyUser();
    java.lang.String var5 = var0.getProxyPort();
    java.lang.String var6 = var0.getNonProxyHosts();
    java.lang.String var7 = var0.getProxyUser();
    java.lang.String var8 = var0.getProxyPort();
    
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

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test449");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ApplicationStatus var1 = com.sap.netweaver.porta.core.ApplicationStatus.valueOf("hi!(2638)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test450");


    com.sap.netweaver.porta.core.nw7.FileUploaderImpl var2 = new com.sap.netweaver.porta.core.nw7.FileUploaderImpl("Refresh SAP NetWeaver server state(2390)", (-1));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test451");


    com.sap.netweaver.porta.core.mock.ServerMock var0 = new com.sap.netweaver.porta.core.mock.ServerMock();
    var0.ping();
    com.sap.netweaver.porta.core.LifecycleManager var2 = var0.getLifecycleManager();
    com.sap.netweaver.porta.core.DeployManager var3 = var0.getDeployManager();
    com.sap.netweaver.porta.core.DeployManager var4 = var0.getDeployManager();
    java.net.InetSocketAddress var5 = var0.getHttpAccessPoint();
    java.net.InetSocketAddress var6 = var0.getHttpAccessPoint();
    com.sap.netweaver.porta.core.DeployManager var7 = var0.getDeployManager();
    
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

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test452");


    com.sap.netweaver.porta.core.Credentials var2 = new com.sap.netweaver.porta.core.Credentials("Refresh SAP NetWeaver server state(1157)", "Refresh SAP NetWeaver server state(656)");

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test453");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    boolean var3 = var0.shouldSchedule();
    var0.wakeUp(10L);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var10 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(1386)", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var11 = var0.compareTo((java.lang.Object)10);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Refresh SAP NetWeaver server state(2696)"+ "'", var6.equals("Refresh SAP NetWeaver server state(2696)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Refresh SAP NetWeaver server state(2696)"+ "'", var7.equals("Refresh SAP NetWeaver server state(2696)"));

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test454");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(1734)", 30);
    java.lang.String var3 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Refresh SAP NetWeaver server state(1734)"+ "'", var3.equals("Refresh SAP NetWeaver server state(1734)"));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test455");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "hi!");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    java.lang.String var8 = var7.toString();
    boolean var10 = var7.equals((java.lang.Object)"Refresh SAP NetWeaver server state(982)");
    java.lang.String var11 = var7.name();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Stopped"+ "'", var8.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "STOPPED"+ "'", var11.equals("STOPPED"));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test456");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW710Runtime();
    java.lang.String[] var1 = var0.getJavaEE5Classpath();
    java.lang.String[] var2 = var0.getJavaEE5Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJ2EE14Classpath();
    java.lang.String[] var5 = var0.getJ2EE14Classpath();
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

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test457");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    org.eclipse.core.runtime.ILog var2 = var0.getLog();
    org.eclipse.core.runtime.ILog var3 = var0.getLog();
    org.eclipse.core.runtime.ILog var4 = var0.getLog();
    boolean var5 = var0.isDebugging();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test458");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(2268)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test459");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var1 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    org.eclipse.wst.server.core.IServerWorkingCopy var2 = var1.getServerWorkingCopy();
    org.eclipse.wst.server.core.IServer var3 = var1.getServer();
    var1.dispose();
    org.eclipse.wst.server.core.IServer var5 = var1.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var6 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var7 = var6.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var8 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var9 = var8.getServer();
    org.eclipse.wst.server.core.IModule[] var10 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var11 = var8.canControlModule(var10);
    boolean var12 = var6.canControlModule(var10);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var13 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var14 = var13.getServer();
    org.eclipse.wst.server.core.IModule[] var15 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var16 = var13.canControlModule(var15);
    boolean var17 = var6.canControlModule(var15);
    var6.dispose();
    var6.dispose();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var22 = var21.getServer();
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var23 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var24 = var23.getServer();
    org.eclipse.wst.server.core.IModule[] var25 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var26 = var23.canControlModule(var25);
    boolean var27 = var21.canControlModule(var25);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var28 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var29 = var28.getServer();
    org.eclipse.wst.server.core.IModule[] var30 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var31 = var28.canControlModule(var30);
    boolean var32 = var21.canControlModule(var30);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var34 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var6, 1, var30, (java.lang.Integer)2);
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
    var35.handleResourceChange();
    com.sap.netweaver.porta.ide.eclipse.server.SapNWServer var48 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWServer(false);
    var48.dispose();
    var48.dispose();
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
    org.eclipse.core.runtime.IStatus var71 = var48.canModifyModules(var58, var68);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation var73 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWPublishOperation(var35, 1, var68, (java.lang.Integer)0);
    boolean var74 = var6.canControlModule(var68);
    com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior var75 = new com.sap.netweaver.porta.ide.eclipse.server.control.SapNWServerBehavior();
    org.eclipse.wst.server.core.IServer var76 = var75.getServer();
    org.eclipse.wst.server.core.IModule[] var77 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var78 = var75.canControlModule(var77);
    var75.handleResourceChange();
    var75.dispose();
    var75.handleResourceChange();
    org.eclipse.wst.server.core.IModule[] var82 = new org.eclipse.wst.server.core.IModule[] { };
    boolean var83 = var75.canControlModule(var82);
    org.eclipse.core.runtime.IStatus var84 = var1.canModifyModules(var68, var82);
    boolean var85 = com.sap.netweaver.porta.ide.eclipse.util.SapNWServerUtil.areAllDeployableModules(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
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
    assertTrue(var32 == false);
    
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
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test460");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var6 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!", (java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var8);
    java.lang.String var11 = var8.getEndpoint();
    com.sap.netweaver.porta.core.ProxyException var14 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var16 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var18 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var16, "MCK");
    var14.addSuppressed((java.lang.Throwable)var16);
    com.sap.netweaver.porta.core.NotAuthorizedException var20 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var14);
    com.sap.netweaver.porta.core.NoWSGateException var22 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var20, "STOPPED");
    var8.addSuppressed((java.lang.Throwable)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.logInfo("Refresh SAP NetWeaver server state(2221)", (java.lang.Throwable)var8);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test461");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(203)", (-1));
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

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test462");


    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var7 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var9);
    java.lang.String var11 = var9.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var14 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(249)", (java.lang.Throwable)var9);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var15 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(92)", (java.lang.Throwable)var9);
    java.lang.String var16 = var9.getEndpoint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "MCK"+ "'", var11.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "MCK"+ "'", var16.equals("MCK"));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test463");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    boolean var8 = var0.isBlocking();
    boolean var9 = var0.cancel();
    var0.schedule();
    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var11 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var14 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "");
    var11.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var14);
    com.sap.netweaver.porta.core.ServerState var16 = var11.getState();
    java.lang.Class var17 = var16.getDeclaringClass();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var0.getAdapter(var17);
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test464");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(2461)", "Refresh SAP NetWeaver server state(119)(1711)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test465");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    boolean var1 = var0.shouldRun();
    var0.wakeUp(1L);
    org.eclipse.core.runtime.jobs.ISchedulingRule var4 = var0.getRule();
    boolean var5 = var0.sleep();
    org.eclipse.core.runtime.IStatus var6 = var0.getResult();
    var0.join();
    boolean var8 = var0.isUser();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test466");


    com.sap.netweaver.porta.core.DebugSessionInfo var2 = new com.sap.netweaver.porta.core.DebugSessionInfo("Refresh SAP NetWeaver server state(564)", 100);
    int var3 = var2.getPort();
    java.lang.String var4 = var2.getKey();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Refresh SAP NetWeaver server state(564)"+ "'", var4.equals("Refresh SAP NetWeaver server state(564)"));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test467");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.join();
    boolean var7 = var0.isUser();
    int var8 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test468");


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
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var21 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Refresh SAP NetWeaver server state(51)");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var21);
    var0.disableDebugging("Refresh SAP NetWeaver server state(46)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.start();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test469");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.schedule(100L);
    boolean var6 = var0.cancel();
    boolean var7 = var0.shouldSchedule();
    boolean var8 = var0.isBlocking();
    java.lang.String var9 = var0.getName();
    boolean var10 = var0.shouldSchedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Refresh SAP NetWeaver server state"+ "'", var9.equals("Refresh SAP NetWeaver server state"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test470");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var1 = com.sap.netweaver.porta.core.ServerState.valueOf("Refresh SAP NetWeaver server state(1120)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test471");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    var0.setSystem(true);
    boolean var4 = var0.shouldRun();
    var0.join();
    boolean var6 = var0.sleep();
    boolean var7 = var0.isSystem();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test472");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.setDebugging(true);
    var0.savePluginPreferences();
    org.eclipse.core.runtime.ILog var5 = var0.getLog();
    boolean var6 = var0.isDebugging();
    var0.startup();
    var0.setDebugging(true);
    org.eclipse.core.runtime.ILog var10 = var0.getLog();
    var0.setDebugging(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test473");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("Refresh SAP NetWeaver server state(1271)", "com.sap.netweaver.porta.core.CoreException: com.sap.netweaver.porta.core.NotAuthorizedException: Refresh SAP NetWeaver server state(46)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test474");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    com.sap.netweaver.porta.core.ServerState var1 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var4 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(false, "hi!");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var4);
    com.sap.netweaver.porta.core.DebugSessionInfo var6 = var0.enableDebugging();
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.name();
    java.lang.String var10 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Stopped"+ "'", var8.equals("Stopped"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "STOPPED"+ "'", var9.equals("STOPPED"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Stopped"+ "'", var10.equals("Stopped"));

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test475");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(1400)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test476");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    var0.wakeUp(100L);
    var0.setSystem(true);
    org.eclipse.core.runtime.IStatus var7 = var0.getResult();
    var0.setUser(false);
    java.lang.Thread var10 = var0.getThread();
    var0.schedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test477");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.AuthenticationReason var1 = com.sap.netweaver.porta.core.AuthenticationReason.valueOf("Refresh SAP NetWeaver server state(1776)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test478");


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
    org.eclipse.wst.server.core.TaskModel var35 = var28.getTaskModel();
    
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
    assertNull(var35);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test479");


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
    var0.setDebugging(true);
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

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test480");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    com.sap.netweaver.porta.core.ServerState var3 = var0.getState();
    com.sap.netweaver.porta.core.DebugSessionInfo var4 = var0.enableDebugging();
    var0.disableDebugging("Refresh SAP NetWeaver server state(296)");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    var0.disableDebugging("Refresh SAP NetWeaver server state(233)");
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

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test481");


    com.sap.netweaver.porta.ide.eclipse.SapNWPlugin var0 = new com.sap.netweaver.porta.ide.eclipse.SapNWPlugin();
    var0.internalInitializeDefaultPluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    var0.savePluginPreferences();
    var0.internalInitializeDefaultPluginPreferences();
    var0.savePluginPreferences();

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test482");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPort();
    java.lang.String var2 = var0.getProxyUser();
    java.lang.String var3 = var0.getProxyPort();
    java.lang.String var4 = var0.getProxyPassword();
    java.lang.String var5 = var0.getNonProxyHosts();
    java.lang.String var6 = var0.getProxyUser();
    java.lang.String var7 = var0.getProxyPort();
    java.lang.String var8 = var0.getNonProxyHosts();
    java.lang.String var9 = var0.getProxyPassword();
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

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test483");


    com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.LifecycleManagerImpl("Refresh SAP NetWeaver server state(2221)", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.ServerState var3 = var2.getState();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test484");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(2239)", "Refresh SAP NetWeaver server state(1876)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test485");


    com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime var0 = new com.sap.netweaver.porta.ide.eclipse.server.runtime.SapNW720Runtime();
    var0.dispose();
    java.lang.String[] var2 = var0.getJ2EE14Classpath();
    java.lang.String[] var3 = var0.getJ2EE14Classpath();
    java.lang.String[] var4 = var0.getJavaEE5Classpath();
    var0.dispose();
    java.lang.String[] var6 = var0.getJ2EE14Classpath();
    java.lang.String[] var7 = var0.getJavaEE5Classpath();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.core.runtime.IPath var8 = var0.getCacheLocation();
      fail("Expected exception of type Exception");
    } catch (Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test486");


    com.sap.netweaver.porta.core.mock.LifecycleManagerMock var0 = new com.sap.netweaver.porta.core.mock.LifecycleManagerMock();
    var0.disableDebugging("com.sap.netweaver.porta.core.ProxyException: The host  cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ");
    var0.disableDebugging("");
    var0.disableDebugging("MCK");
    com.sap.netweaver.porta.core.ServerState var7 = var0.getState();
    com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback var10 = new com.sap.netweaver.porta.ide.eclipse.server.control.AuthCallback(true, "Publish module to the SAP NetWeaver server");
    var0.setAuthenticationCallback((com.sap.netweaver.porta.core.AuthenticationCallback)var10);
    com.sap.netweaver.porta.core.ServerState var12 = var0.getState();
    var0.disableDebugging("Refresh SAP NetWeaver server state(14)");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test487");


    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var7 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NoWSGateException var9 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var6, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var9);
    java.lang.String var11 = var9.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var9);
    java.lang.Throwable[] var13 = var12.getSuppressed();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var14 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1350)", (java.lang.Throwable)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.ide.eclipse.SapNWPlugin.errorDialog("com.sap.netweaver.porta.core.AuthenticationRefusedException: Refresh SAP NetWeaver server state(176)", "Refresh SAP NetWeaver server state(2403)", (java.lang.Throwable)var12);
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "MCK"+ "'", var11.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test488");


    com.sap.netweaver.porta.core.ProxyException var3 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    var3.addSuppressed((java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NotAuthorizedException var9 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var3);
    java.lang.Throwable[] var10 = var3.getSuppressed();
    com.sap.netweaver.porta.core.NoWSGateException var12 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "hi!");
    com.sap.netweaver.porta.core.NotAuthorizedException var13 = new com.sap.netweaver.porta.core.NotAuthorizedException("com.sap.netweaver.porta.core.ProxyException: The host Refresh SAP NetWeaver server state(356) cannot be resolved by the Axis runtime, but can be resolved in the local network. Perhaps, there is probably a proxy configured. The host should be configured to bypass the proxy settings. ", (java.lang.Throwable)var3);
    com.sap.netweaver.porta.core.NoWSGateException var15 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var3, "Refresh SAP NetWeaver server state(294)");
    java.lang.String var16 = var3.getHost();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test489");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.shouldSchedule();
    boolean var3 = var0.cancel();
    var0.schedule();
    boolean var5 = var0.shouldRun();
    var0.setName("Refresh SAP NetWeaver server state(183)");
    boolean var8 = var0.sleep();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test490");


    com.sap.netweaver.porta.core.nw7.ServerImpl var2 = new com.sap.netweaver.porta.core.nw7.ServerImpl("Refresh SAP NetWeaver server state(245)", 0);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test491");


    com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob var0 = new com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob();
    org.eclipse.core.runtime.IStatus var1 = var0.getResult();
    boolean var2 = var0.isUser();
    org.eclipse.core.runtime.IStatus var3 = var0.getResult();
    var0.setPriority(30);
    var0.schedule(0L);
    boolean var8 = var0.cancel();
    var0.schedule();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test492");


    com.sap.netweaver.porta.core.ProxyException var4 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var5 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var4);
    com.sap.netweaver.porta.core.NoWSGateException var7 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var4, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var8 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var7);
    java.lang.String var9 = var7.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var10 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var7);
    java.lang.Throwable[] var11 = var10.getSuppressed();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var12 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1350)", (java.lang.Throwable)var10);
    com.sap.netweaver.porta.core.CoreException var13 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var12);
    com.sap.netweaver.porta.core.AuthenticationRefusedException var14 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "MCK"+ "'", var9.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test493");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(238)", "Refresh SAP NetWeaver server state(1467)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test494");


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
    com.sap.netweaver.porta.core.CoreException var26 = new com.sap.netweaver.porta.core.CoreException("Refresh SAP NetWeaver server state(1038)");
    var23.addSuppressed((java.lang.Throwable)var26);
    java.lang.Throwable[] var28 = var23.getSuppressed();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test495");


    com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties var0 = new com.sap.netweaver.porta.ide.eclipse.axis.proxy.AxisTransportClientProperties();
    java.lang.String var1 = var0.getProxyPassword();
    java.lang.String var2 = var0.getProxyPort();
    java.lang.String var3 = var0.getProxyHost();
    java.lang.String var4 = var0.getNonProxyHosts();
    java.lang.String var5 = var0.getNonProxyHosts();
    java.lang.String var6 = var0.getProxyPort();
    java.lang.String var7 = var0.getProxyPort();
    java.lang.String var8 = var0.getProxyPort();
    java.lang.String var9 = var0.getProxyUser();
    
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

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test496");


    com.sap.netweaver.porta.core.NotAuthorizedException var2 = new com.sap.netweaver.porta.core.NotAuthorizedException("hi!(1683)");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var3 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(2375)", (java.lang.Throwable)var2);
    com.sap.netweaver.porta.core.ProxyException var6 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.ProxyException var8 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.NoWSGateException var10 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var8, "MCK");
    var6.addSuppressed((java.lang.Throwable)var8);
    com.sap.netweaver.porta.core.NotAuthorizedException var12 = new com.sap.netweaver.porta.core.NotAuthorizedException("MCK", (java.lang.Throwable)var6);
    java.lang.String var13 = var6.getHost();
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.CoreException var15 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var6);
    com.sap.netweaver.porta.core.NoWSGateException var17 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var15, "Refresh SAP NetWeaver server state(138)");
    java.lang.String var18 = var17.getEndpoint();
    var2.addSuppressed((java.lang.Throwable)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Refresh SAP NetWeaver server state(138)"+ "'", var18.equals("Refresh SAP NetWeaver server state(138)"));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test497");


    com.sap.netweaver.porta.core.nw7.DeployManagerImpl var2 = new com.sap.netweaver.porta.core.nw7.DeployManagerImpl("Refresh SAP NetWeaver server state(783)", 30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.Application[] var3 = var2.getApplications();
      fail("Expected exception of type com.sap.netweaver.porta.core.CoreException");
    } catch (com.sap.netweaver.porta.core.CoreException e) {
      // Expected exception.
    }

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test498");


    com.sap.netweaver.porta.core.ProxyException var5 = new com.sap.netweaver.porta.core.ProxyException("");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var6 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("MCK", (java.lang.Throwable)var5);
    com.sap.netweaver.porta.core.NoWSGateException var8 = new com.sap.netweaver.porta.core.NoWSGateException((java.lang.Throwable)var5, "MCK");
    com.sap.netweaver.porta.core.AuthenticationRefusedException var9 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state", (java.lang.Throwable)var8);
    java.lang.String var10 = var8.getEndpoint();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var11 = new com.sap.netweaver.porta.core.AuthenticationRefusedException((java.lang.Throwable)var8);
    java.lang.Throwable[] var12 = var11.getSuppressed();
    com.sap.netweaver.porta.core.AuthenticationRefusedException var13 = new com.sap.netweaver.porta.core.AuthenticationRefusedException("Refresh SAP NetWeaver server state(1350)", (java.lang.Throwable)var11);
    com.sap.netweaver.porta.core.CoreException var14 = new com.sap.netweaver.porta.core.CoreException((java.lang.Throwable)var13);
    com.sap.netweaver.porta.core.NotAuthorizedException var15 = new com.sap.netweaver.porta.core.NotAuthorizedException("Refresh SAP NetWeaver server state(14)(1918)", (java.lang.Throwable)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "MCK"+ "'", var10.equals("MCK"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test499");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.eclipse.wst.common.project.facet.core.IProjectFacetVersion var2 = com.sap.netweaver.porta.ide.eclipse.util.FacetUtil.getProjectFacet("Refresh SAP NetWeaver server state(154)", "Refresh SAP NetWeaver server state(2546)");
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest8.test500");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      com.sap.netweaver.porta.core.nw7.FaultReasons var1 = com.sap.netweaver.porta.core.nw7.FaultReasons.valueOf("Refresh SAP NetWeaver server state(708)");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
