package randoop;

import junit.framework.*;

public class RandoopTest12 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test1");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    var2.addAttribute("", "hi!", "", "hi!");
    java.lang.String var12 = var2.getInheritedAttribute("hi!", "4444444444");
    java.lang.String var14 = var2.lookupNamespaceURI("");
    nu.staldal.xtree.ProcessingInstruction var17 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    var2.addChild((nu.staldal.xtree.Node)var17);
    int var19 = var17.getColumnNumber();
    int var20 = var17.getColumnNumber();
    java.net.URL var21 = var17.getBaseURI();
    java.lang.String var23 = var17.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    java.lang.String var25 = var17.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~ hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test2");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("nu.staldal.lagoon.core.LagoonException~~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test3");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    var0.init();
    var0.init();
    var0.beforeBuild();
    nu.staldal.lagoon.core.LagoonContext var4 = var0.getContext();
    nu.staldal.lagoon.core.ByteStreamProducer var5 = var0.getNext();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var7 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test4");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("4444444444", "hi_33_");
    nu.staldal.xtree.Text var4 = new nu.staldal.xtree.Text("");
    char[] var5 = var4.asCharArray();
    char[] var6 = var4.asCharArray();
    nu.staldal.lagoon.producer.BasicSplit var7 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var9 = new nu.staldal.xtree.Text("hi!");
    char[] var10 = var9.asCharArray();
    var7.characters(var10, 1, 10);
    var7.endElement("", "hi!", "hi!");
    var7.processingInstruction("", "hi!");
    var7.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var7.startDocument();
    var7.skippedEntity("4444444444");
    var7.skippedEntity("hi!");
    var4.toSAX((org.xml.sax.ContentHandler)var7);
    var2.toSAX((org.xml.sax.ContentHandler)var7);
    java.lang.String var31 = var2.getTarget();
    java.lang.String var32 = var2.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "4444444444"+ "'", var31.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "4444444444"+ "'", var32.equals("4444444444"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test5");


    nu.staldal.lagoon.producer.FOPFormatter var0 = new nu.staldal.lagoon.producer.FOPFormatter();
    java.lang.String var1 = var0.getEntryName();
    int var2 = var0.getPosition();
    java.lang.String var4 = var0.getParam("44");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.init();
      fail("Expected exception of type java.lang.NoClassDefFoundError");
    } catch (java.lang.NoClassDefFoundError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test6");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    var4.addNamespaceMapping("", "4444444444");
    java.lang.String var11 = var4.getTextContent();
    java.lang.String var12 = var4.getPublicId();
    java.lang.String var14 = var4.lookupNamespaceURI("nu.staldal.lagoon.util.TemplateException: aa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test7");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    java.lang.String var10 = var2.getNamespaceURI();
    nu.staldal.xtree.NodeWithChildren var11 = var2.getParent();
    java.lang.String var14 = var2.getInheritedAttribute("hi_33_", "hi!");
    boolean var15 = var2.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test8");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var8 = new nu.staldal.ftp.FTPException("hi!");
    var5.log("", (java.lang.Throwable)var8, 10);
    org.apache.tools.ant.Location var11 = var5.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var12 = var5.getRuntimeConfigurableWrapper();
    var5.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var18 = new nu.staldal.ftp.FTPException("hi!");
    var15.log("", (java.lang.Throwable)var18, 10);
    org.apache.tools.ant.Project var21 = var15.getProject();
    nu.staldal.lagoon.util.TemplateException var23 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var24 = var23.getException();
    var15.log("", (java.lang.Throwable)var23, (-1));
    var5.bindToOwner((org.apache.tools.ant.Task)var15);
    org.apache.tools.ant.Project var28 = var5.getProject();
    var5.setTaskName("nu.staldal.lagoon.core.LagoonException: ");
    var1.bindToOwner((org.apache.tools.ant.Task)var5);
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var33 = new nu.staldal.lagoon.LagoonAntTask();
    var32.bindToOwner((org.apache.tools.ant.Task)var33);
    var32.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var37 = new nu.staldal.lagoon.LagoonAntTask();
    var37.setPassword("");
    var32.bindToOwner((org.apache.tools.ant.Task)var37);
    org.apache.tools.ant.Target var41 = var37.getOwningTarget();
    var37.setTaskType("hi_33_");
    var37.log("hi_33_");
    var37.init();
    org.apache.tools.ant.Project var47 = var37.getProject();
    var1.bindToOwner((org.apache.tools.ant.Task)var37);
    var37.setPassword("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test9");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Project var8 = var0.getProject();
    var0.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.setTargetURL("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var16 = new nu.staldal.ftp.FTPException("hi!");
    var13.log("", (java.lang.Throwable)var16, 10);
    org.apache.tools.ant.Location var19 = var13.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var20 = var13.getRuntimeConfigurableWrapper();
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    var21.bindToOwner((org.apache.tools.ant.Task)var22);
    var21.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    var26.setPassword("");
    var21.bindToOwner((org.apache.tools.ant.Task)var26);
    org.apache.tools.ant.Project var30 = var21.getProject();
    org.apache.tools.ant.Project var31 = var21.getProject();
    org.apache.tools.ant.RuntimeConfigurable var32 = var21.getRuntimeConfigurableWrapper();
    var13.setRuntimeConfigurableWrapper(var32);
    var0.setRuntimeConfigurableWrapper(var32);
    var0.setPassword("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test10");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.setTaskType("4444444444");
    var0.maybeConfigure();
    var0.setTargetURL("");
    java.lang.Object var11 = var0.clone();
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var15 = new nu.staldal.ftp.FTPException("hi!");
    var12.log("", (java.lang.Throwable)var15, 10);
    java.lang.String var18 = var12.getDescription();
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var22 = new nu.staldal.ftp.FTPException("hi!");
    var19.log("", (java.lang.Throwable)var22, 10);
    org.apache.tools.ant.Location var25 = var19.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var26 = var19.getRuntimeConfigurableWrapper();
    var19.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var32 = new nu.staldal.ftp.FTPException("hi!");
    var29.log("", (java.lang.Throwable)var32, 10);
    org.apache.tools.ant.Project var35 = var29.getProject();
    nu.staldal.lagoon.util.TemplateException var37 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var38 = var37.getException();
    var29.log("", (java.lang.Throwable)var37, (-1));
    var19.bindToOwner((org.apache.tools.ant.Task)var29);
    org.apache.tools.ant.Location var42 = var29.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var43 = var29.getRuntimeConfigurableWrapper();
    var12.setRuntimeConfigurableWrapper(var43);
    org.apache.tools.ant.RuntimeConfigurable var45 = var12.getRuntimeConfigurableWrapper();
    var12.setPassword("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.bindToOwner((org.apache.tools.ant.Task)var12);
    var0.init();
    org.apache.tools.ant.Target var50 = var0.getOwningTarget();
    var0.setForce(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test11");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getValue();
    java.lang.String var5 = var2.getValue();
    var2.setLine(2);
    java.lang.String var8 = var2.getValue();
    java.lang.String var9 = var2.getSystemId();
    var2.setSystemId("nu.staldal.lagoon.core.LagoonException~~ hi____33____");
    nu.staldal.xtree.NodeWithChildren var12 = var2.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var5.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var8.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test12");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    java.util.Enumeration var1 = var0.getParamNames();
    boolean var3 = var0.hasBeenUpdated(0L);
    boolean var5 = var0.hasBeenUpdated(1433461931000L);
    boolean var7 = var0.hasBeenUpdated(0L);
    boolean var9 = var0.hasBeenUpdated(1433461977000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test13");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 100, 100);
    java.lang.String var5 = var4.getPublicId();
    nu.staldal.xtree.Element var8 = var4.getFirstChildElementOrNull("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Element var11 = var4.getFirstChildElementOrNull("##", "nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test14");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ");
    java.lang.String var3 = var2.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_"+ "'", var3.equals("nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_"));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test15");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var23 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, false);
    nu.staldal.xtree.Text var25 = new nu.staldal.xtree.Text("hi!");
    char[] var26 = var25.asCharArray();
    var0.characters(var26, 10, 100);
    var0.endElement("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__32_hi________________________________33________________________________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test16");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    var2.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var2.endPrefixMapping("");
    var2.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "4");
    var2.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    var2.endDocument();

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test17");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.util.TemplateException: _32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", 100, 0);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test18");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    var19.setSystemId("");
    java.net.URL var22 = var19.getBaseURI();
    java.lang.String var25 = var19.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    var28.addNamespaceMapping("", "");
    var19.addChild((nu.staldal.xtree.Node)var28);
    java.lang.String var34 = var28.getAttrValueOrNull("");
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    var37.setSystemId("");
    java.net.URL var40 = var37.getBaseURI();
    java.lang.String var43 = var37.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "hi!");
    var46.addNamespaceMapping("", "");
    var37.addChild((nu.staldal.xtree.Node)var46);
    var37.setSystemId("");
    nu.staldal.xtree.Element var55 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var56 = var55.getLineNumber();
    var55.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var62 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var63 = var62.getLineNumber();
    var62.addNamespaceMapping("", "");
    var55.addChild((nu.staldal.xtree.Node)var62);
    var37.insertChild((nu.staldal.xtree.Node)var55, 0);
    var28.addChild((nu.staldal.xtree.Node)var37);
    var37.setLine((-1));
    int var73 = var37.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var37);
    nu.staldal.xtree.Element var78 = new nu.staldal.xtree.Element("", "hi!", 10);
    var78.setSystemId("hi!");
    java.lang.String var82 = var78.lookupNamespaceURI("4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var78);
    java.util.Enumeration var84 = var0.getParamNames();
    nu.staldal.xtree.Text var86 = new nu.staldal.xtree.Text("");
    char[] var87 = var86.asCharArray();
    var0.characters(var87, (-1), 10);
    var0.beforeBuild();
    nu.staldal.xtree.ProcessingInstruction var94 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    int var95 = var94.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var94);
    nu.staldal.xmlutil.ContentHandlerAdapter var97 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == (-1));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test19");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.lagoon.producer.BasicSplit var2 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var4 = new nu.staldal.xtree.Text("hi!");
    char[] var5 = var4.asCharArray();
    var2.characters(var5, 1, 10);
    var2.endElement("", "hi!", "hi!");
    var2.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var16 = new nu.staldal.xtree.Text("");
    char[] var17 = var16.asCharArray();
    char[] var18 = var16.asCharArray();
    char[] var19 = var16.asCharArray();
    var2.characters(var19, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var23 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var2);
    nu.staldal.xmlutil.DocumentHandlerAdapter var24 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var23);
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi!", "hi!");
    var27.setSystemId("");
    java.net.URL var30 = var27.getBaseURI();
    java.lang.String var33 = var27.getAttrValueOrNull("", "");
    var24.setDocumentLocator((org.xml.sax.Locator)var27);
    var24.startDocument();
    var24.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.producer.IslandSplit var38 = new nu.staldal.lagoon.producer.IslandSplit();
    var38.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var41 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var38, true);
    char[] var44 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var48 = new nu.staldal.xtree.Text(var44, 1, 0, false);
    var41.setDocumentLocator((org.xml.sax.Locator)var48);
    java.lang.String var51 = var48.lookupNamespacePrefix("                                                                                                    ");
    var24.setDocumentLocator((org.xml.sax.Locator)var48);
    char[] var53 = var48.asCharArray();
    nu.staldal.xtree.TreeBuilder var54 = new nu.staldal.xtree.TreeBuilder();
    var54.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var59 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var54, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var61 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var54, false);
    var48.toSAX((org.xml.sax.ContentHandler)var54);
    var54.skippedEntity("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    var54.endPrefixMapping("4");
    var1.toSAX((org.xml.sax.ContentHandler)var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var54.processingInstruction("          ", "nu.staldal.lagoon.core.AuthenticationException");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test20");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.String var8 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var12 = new nu.staldal.ftp.FTPException("hi!");
    var9.log("", (java.lang.Throwable)var12, 10);
    org.apache.tools.ant.Project var15 = var9.getProject();
    var0.bindToOwner((org.apache.tools.ant.Task)var9);
    var9.setTaskType("nu.staldal.lagoon.core.LagoonException: ");
    var9.setTaskType("");
    org.apache.tools.ant.Target var21 = var9.getOwningTarget();
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var26 = new nu.staldal.ftp.FTPException("hi!");
    var23.log("", (java.lang.Throwable)var26, 10);
    var23.init();
    var23.init();
    java.lang.Object var31 = var23.clone();
    var23.init();
    java.lang.Object var33 = var23.clone();
    nu.staldal.lagoon.core.LagoonException var35 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var36 = var35.toString();
    var23.log((java.lang.Throwable)var35, 10);
    var9.log("nu.staldal.lagoon.util.TemplateException", (java.lang.Throwable)var35, 10);
    var9.log("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", 0);
    var9.setForce(false);
    nu.staldal.lagoon.LagoonAntTask var47 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var50 = new nu.staldal.ftp.FTPException("hi!");
    var47.log("", (java.lang.Throwable)var50, 10);
    org.apache.tools.ant.Project var53 = var47.getProject();
    nu.staldal.lagoon.util.TemplateException var55 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var56 = var55.getException();
    var47.log("", (java.lang.Throwable)var55, (-1));
    java.lang.Throwable[] var59 = var55.getSuppressed();
    java.lang.Throwable[] var60 = var55.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var62 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var63 = var62.toString();
    var55.addSuppressed((java.lang.Throwable)var62);
    nu.staldal.lagoon.util.TemplateException var65 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var55);
    java.lang.String var66 = var65.toString();
    var9.log("nu.staldal.lagoon.core.LagoonException: aa", (java.lang.Throwable)var65, (-1));
    java.lang.String var69 = var65.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var36.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var63.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var66.equals("nu.staldal.lagoon.util.TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var69.equals("nu.staldal.lagoon.util.TemplateException"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test21");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("", "4444444444", 100);
    int var13 = var12.numberOfChildren();
    java.lang.String var16 = var12.getInheritedAttribute("4444444444", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var18 = var12.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    int var19 = var12.getColumnNumber();
    var2.addChild((nu.staldal.xtree.Node)var12);
    java.lang.String var22 = var12.getAttrValueOrNull("nu.staldal.ftp.FTPException: hi!");
    var12.addAttribute("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~ ");
    nu.staldal.lagoon.producer.BasicSplit var28 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var30 = new nu.staldal.xtree.Text("hi!");
    char[] var31 = var30.asCharArray();
    var28.characters(var31, 1, 10);
    var28.endElement("", "hi!", "hi!");
    var28.processingInstruction("", "hi!");
    var28.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var28.startDocument();
    var28.skippedEntity("");
    java.lang.String var49 = var28.getParam("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    var12.outputStartElement((org.xml.sax.ContentHandler)var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var52 = var12.getNamespaceMapping(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test22");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    java.lang.String var4 = var3.getLocalName();
    java.lang.String var6 = var3.getAttrValueOrNull("4444444444");
    java.lang.String var7 = var3.getSystemId();
    var3.setPublicId("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test23");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    var22.startDocument();
    char[] var34 = new char[] { };
    var22.characters(var34, 100, (-1));
    var22.startDocument();
    var22.startDocument();
    var22.processingInstruction("          ", "nu.staldal.ftp.FTPException~ hi!");
    var22.startDocument();
    var22.skippedEntity("nu.staldal.lagoon.core.AuthenticationException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test24");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_", "nu.staldal.lagoon.core.LagoonException~ 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_"+ "'", var2.equals("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_"));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test25");


    char[] var2 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text(var2, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var7 = new nu.staldal.xtree.TreeBuilder();
    var7.endPrefixMapping("hi!");
    var7.endDocument();
    var7.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var6.toSAX((org.xml.sax.ContentHandler)var7);
    var7.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    char[] var20 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var24 = new nu.staldal.xtree.Text(var20, 1, 0, false);
    char[] var25 = var24.asCharArray();
    var7.ignorableWhitespace(var25, 10, 10);
    nu.staldal.lagoon.producer.BasicSplit var29 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text("hi!");
    char[] var32 = var31.asCharArray();
    var29.characters(var32, 1, 10);
    var29.endElement("", "hi!", "hi!");
    var29.processingInstruction("", "hi!");
    var29.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var29.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var47 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var29);
    var47.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Element var53 = new nu.staldal.xtree.Element("hi!", "hi!");
    var53.setLine(100);
    java.lang.String var57 = var53.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.net.URL var58 = var53.getBaseURI();
    var47.setDocumentLocator((org.xml.sax.Locator)var53);
    nu.staldal.lagoon.producer.BasicSplit var60 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var62 = new nu.staldal.xtree.Text("hi!");
    char[] var63 = var62.asCharArray();
    var60.characters(var63, 1, 10);
    var60.endElement("", "hi!", "hi!");
    var60.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var73 = new nu.staldal.lagoon.producer.IslandSplit();
    var73.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var76 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var73, true);
    char[] var79 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var83 = new nu.staldal.xtree.Text(var79, 1, 0, false);
    var76.setDocumentLocator((org.xml.sax.Locator)var83);
    char[] var85 = var83.asCharArray();
    var60.characters(var85, 10, 0);
    var47.characters(var85, (-1), 100);
    var7.ignorableWhitespace(var85, (-1), (-1));
    var7.startPrefixMapping("hi_33_", "nu.staldal.lagoon.core.LagoonException~ 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test26");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("");
    java.lang.String var2 = var1.toString();
    java.lang.Exception var3 = var1.getException();
    java.lang.Exception var4 = var1.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.util.TemplateException: "+ "'", var2.equals("nu.staldal.lagoon.util.TemplateException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test27");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    nu.staldal.lagoon.producer.BasicSplit var11 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var13 = new nu.staldal.xtree.Text("hi!");
    char[] var14 = var13.asCharArray();
    var11.characters(var14, 1, 10);
    var11.endElement("", "hi!", "hi!");
    var11.processingInstruction("", "hi!");
    var11.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var11.startDocument();
    var4.outputEndElement((org.xml.sax.ContentHandler)var11);
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi!", "hi!");
    var32.setSystemId("");
    java.net.URL var35 = var32.getBaseURI();
    java.lang.String var37 = var32.getAttrValueOrNull("hi_33_");
    java.lang.String var40 = var32.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var4.addChild((nu.staldal.xtree.Node)var32);
    nu.staldal.xtree.Element var44 = var4.getFirstChildElementOrNull("_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_ftp_46_FTPException_126__126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test28");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.util.TemplateException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException"+ "'", var1.equals("nu.staldal.lagoon.util.TemplateException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException"));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test29");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    nu.staldal.lagoon.producer.BasicSplit var16 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var18 = new nu.staldal.xtree.Text("hi!");
    char[] var19 = var18.asCharArray();
    var16.characters(var19, 1, 10);
    var16.endElement("", "hi!", "hi!");
    var16.processingInstruction("", "hi!");
    var16.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var16.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var34 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var16);
    var34.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Element var40 = new nu.staldal.xtree.Element("hi!", "hi!");
    var40.setLine(100);
    java.lang.String var44 = var40.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.net.URL var45 = var40.getBaseURI();
    var34.setDocumentLocator((org.xml.sax.Locator)var40);
    nu.staldal.xtree.Element var49 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var50 = var49.getLineNumber();
    var49.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var56 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var57 = var56.getLineNumber();
    var56.addNamespaceMapping("", "");
    var49.addChild((nu.staldal.xtree.Node)var56);
    nu.staldal.xtree.NodeWithChildren var62 = var49.getParent();
    java.lang.String var63 = var49.getNamespaceURI();
    var34.setDocumentLocator((org.xml.sax.Locator)var49);
    int var65 = var49.numberOfChildren();
    nu.staldal.xtree.NodeWithChildren var66 = var49.getParent();
    nu.staldal.xtree.Element var67 = var49.getFirstChildElement();
    var67.setSystemId("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var71 = var2.replaceChild((nu.staldal.xtree.Node)var67, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "hi!"+ "'", var63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test30");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.util.TemplateException", 0);
    java.net.URL var4 = var3.getBaseURI();
    boolean var5 = var3.getPreserveSpace();
    int var6 = var3.numberOfAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test31");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test32");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________");

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test33");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    var22.startDocument();
    var22.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~ hi__33__", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var22.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~ nu.staldal.ftp.FTPException~                                                                                                     ", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test34");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test35");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    var2.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var25 = var2.getInheritedAttribute("", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    var28.setSystemId("");
    java.net.URL var31 = var28.getBaseURI();
    java.lang.String var34 = var28.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    var37.addNamespaceMapping("", "");
    var28.addChild((nu.staldal.xtree.Node)var37);
    java.lang.String var44 = var37.getInheritedAttribute("", "hi!");
    nu.staldal.xtree.Element var47 = var37.getFirstChildElementOrNull("", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.NodeWithChildren var48 = var37.getParent();
    var2.insertChild((nu.staldal.xtree.Node)var48, 0);
    java.lang.String var53 = var2.getAttrValueOrNull("nu__46__staldal__46__ftp__46__FTPException__126____32__hi__33__", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    boolean var54 = var2.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test36");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var23 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, false);
    var0.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.AuthenticationMissingException");
    var0.processingInstruction("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.core.XMLStreamProducer var30 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test37");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    int var19 = var11.getColumnNumber();
    java.lang.String var20 = var11.getNamespaceURI();
    java.lang.String var23 = var11.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    java.lang.String var26 = var11.getInheritedAttribute("hi_33_", "nu.staldal.lagoon.util.TemplateException");
    boolean var27 = var11.getPreserveSpace();
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var35 = var32.lookupAttribute("4444444444", "hi!");
    var32.addNamespaceMapping("", "4444444444");
    var32.addAttribute("", "nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var32.setColumn(100);
    boolean var46 = var32.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var48 = var11.replaceChild((nu.staldal.xtree.Node)var32, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test38");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    var19.setSystemId("");
    java.net.URL var22 = var19.getBaseURI();
    java.lang.String var25 = var19.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    var28.addNamespaceMapping("", "");
    var19.addChild((nu.staldal.xtree.Node)var28);
    java.lang.String var34 = var28.getAttrValueOrNull("");
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    var37.setSystemId("");
    java.net.URL var40 = var37.getBaseURI();
    java.lang.String var43 = var37.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "hi!");
    var46.addNamespaceMapping("", "");
    var37.addChild((nu.staldal.xtree.Node)var46);
    var37.setSystemId("");
    nu.staldal.xtree.Element var55 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var56 = var55.getLineNumber();
    var55.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var62 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var63 = var62.getLineNumber();
    var62.addNamespaceMapping("", "");
    var55.addChild((nu.staldal.xtree.Node)var62);
    var37.insertChild((nu.staldal.xtree.Node)var55, 0);
    var28.addChild((nu.staldal.xtree.Node)var37);
    var37.setLine((-1));
    int var73 = var37.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var37);
    nu.staldal.xtree.Element var75 = var37.getFirstChildElementOrNull();
    java.lang.String var76 = var75.getLocalName();
    java.lang.String var78 = var75.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~ ");
    nu.staldal.xtree.Element var81 = new nu.staldal.xtree.Element("hi!", "hi!");
    var81.setLine(100);
    java.lang.String var85 = var81.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var86 = var81.getTextContent();
    java.lang.String var89 = var81.getInheritedAttribute("hi_33_", "hi!");
    nu.staldal.xtree.Node var91 = var75.replaceChild((nu.staldal.xtree.Node)var81, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "hi!"+ "'", var76.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + ""+ "'", var86.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test39");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    var0.skippedEntity("4444444444");
    var0.processingInstruction("", "                                                                                                    ");
    nu.staldal.xtree.ProcessingInstruction var25 = new nu.staldal.xtree.ProcessingInstruction("", "hi!");
    java.lang.String var26 = var25.getValue();
    java.lang.String var27 = var25.getValue();
    var0.setDocumentLocator((org.xml.sax.Locator)var25);
    nu.staldal.xtree.TreeBuilder var29 = new nu.staldal.xtree.TreeBuilder();
    var29.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var34 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var29, false, true);
    var29.startPrefixMapping("4444444444", "                                                                                                    ");
    var29.endPrefixMapping("hi!");
    nu.staldal.lagoon.producer.BasicSplit var40 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var42 = new nu.staldal.xtree.Text("hi!");
    char[] var43 = var42.asCharArray();
    var40.characters(var43, 1, 10);
    var40.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var40.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    char[] var55 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var59 = new nu.staldal.xtree.Text(var55, 1, 0, false);
    char[] var60 = var59.asCharArray();
    var40.ignorableWhitespace(var60, 0, 10);
    var29.ignorableWhitespace(var60, 2, 100);
    var0.ignorableWhitespace(var60, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test40");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var29 = var26.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var30 = new nu.staldal.xtree.TreeBuilder();
    var26.toSAX((org.xml.sax.ContentHandler)var30);
    var30.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var34 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var30);
    char[] var37 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var41 = new nu.staldal.xtree.Text(var37, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var42 = new nu.staldal.xtree.TreeBuilder();
    var42.endPrefixMapping("hi!");
    var42.endDocument();
    var42.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var41.toSAX((org.xml.sax.ContentHandler)var42);
    var42.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    char[] var55 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var59 = new nu.staldal.xtree.Text(var55, 1, 0, false);
    char[] var60 = var59.asCharArray();
    var42.ignorableWhitespace(var60, 10, 10);
    var34.ignorableWhitespace(var60, 1, 10);
    var21.ignorableWhitespace(var60, 2, 100);
    nu.staldal.xmlutil.DocumentHandlerAdapter var70 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    var70.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    var70.skippedEntity("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test41");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    nu.staldal.xmlutil.ContentHandlerAdapter var11 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    nu.staldal.xmlutil.DocumentHandlerAdapter var12 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var11);
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    boolean var16 = var14.isWhitespaceNode();
    boolean var17 = var14.isWhitespaceNode();
    boolean var18 = var14.isWhitespaceNode();
    var11.setDocumentLocator((org.xml.sax.Locator)var14);
    nu.staldal.xtree.TreeBuilder var20 = new nu.staldal.xtree.TreeBuilder();
    var20.endPrefixMapping("hi!");
    var14.toSAX((org.xml.sax.ContentHandler)var20);
    nu.staldal.xmlutil.ContentHandlerFixer var25 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var20, true);
    var20.startPrefixMapping("44", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test42");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    nu.staldal.lagoon.core.LagoonContext var1 = var0.getContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.hasBeenUpdated(1433461964000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test43");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var20 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    nu.staldal.xmlutil.DocumentHandlerAdapter var21 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.setSystemId("");
    java.net.URL var27 = var24.getBaseURI();
    java.lang.String var30 = var24.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var33 = new nu.staldal.xtree.Element("hi!", "hi!");
    var33.addNamespaceMapping("", "");
    var24.addChild((nu.staldal.xtree.Node)var33);
    var33.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var33.setLine(1);
    java.lang.String var46 = var33.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    var21.setDocumentLocator((org.xml.sax.Locator)var33);
    var21.startDocument();
    var21.skippedEntity("nu.staldal.lagoon.util.TemplateException: aa");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test44");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.setLine(100);
    java.lang.String var28 = var24.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.net.URL var29 = var24.getBaseURI();
    var18.setDocumentLocator((org.xml.sax.Locator)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var32 = var24.getAttrValue("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test45");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    char[] var3 = var1.asCharArray();
    char[] var4 = var1.asCharArray();
    boolean var5 = var1.isWhitespaceNode();
    var1.setColumn(0);
    char[] var8 = var1.asCharArray();
    java.net.URL var9 = var1.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test46");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    var0.init();
    java.lang.String var3 = var0.getParam("hi!");
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.hasBeenUpdated(1433461983000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test47");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("");
    java.lang.String var2 = var1.toString();
    java.lang.Throwable[] var3 = var1.getSuppressed();
    java.lang.Exception var4 = var1.getException();
    java.lang.String var5 = var1.toString();
    java.lang.Throwable[] var6 = var1.getSuppressed();
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    var7.setPassword("");
    var7.setForce(false);
    org.apache.tools.ant.Target var12 = var7.getOwningTarget();
    var7.maybeConfigure();
    var7.log("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.LagoonAntTask var16 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var19 = new nu.staldal.ftp.FTPException("hi!");
    var16.log("", (java.lang.Throwable)var19, 10);
    org.apache.tools.ant.Location var22 = var16.getLocation();
    nu.staldal.lagoon.core.LagoonException var25 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var16.log("4444444444", (java.lang.Throwable)var25, 100);
    java.lang.String var28 = var25.toString();
    java.lang.Exception var29 = var25.getException();
    var7.log((java.lang.Throwable)var25, 1);
    java.lang.Exception var32 = var25.getException();
    nu.staldal.lagoon.util.TemplateException var33 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var25);
    var1.addSuppressed((java.lang.Throwable)var33);
    java.lang.Exception var35 = var33.getException();
    nu.staldal.lagoon.core.LagoonException var37 = new nu.staldal.lagoon.core.LagoonException("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    java.lang.String var38 = var37.toString();
    java.lang.Exception var39 = var37.getException();
    var33.addSuppressed((java.lang.Throwable)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.util.TemplateException: "+ "'", var2.equals("nu.staldal.lagoon.util.TemplateException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "nu.staldal.lagoon.util.TemplateException: "+ "'", var5.equals("nu.staldal.lagoon.util.TemplateException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var28.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var38.equals("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test48");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    java.lang.String var12 = var0.getParam("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    nu.staldal.lagoon.producer.IslandSplit var13 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var14 = var13.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var15 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var13);
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var19 = var18.getLineNumber();
    var18.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var26 = var25.getLineNumber();
    var25.addNamespaceMapping("", "");
    var18.addChild((nu.staldal.xtree.Node)var25);
    nu.staldal.xtree.NodeWithChildren var31 = var18.getParent();
    boolean var32 = var18.getPreserveSpace();
    var15.setDocumentLocator((org.xml.sax.Locator)var18);
    java.lang.String var35 = var18.lookupNamespaceURI("");
    nu.staldal.xtree.Element var36 = var18.getFirstChildElementOrNull();
    java.lang.String var37 = var18.getPublicId();
    int var38 = var18.getColumnNumber();
    java.lang.String var39 = var18.getSystemId();
    int var40 = var18.numberOfChildren();
    var0.setDocumentLocator((org.xml.sax.Locator)var18);
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var49 = var46.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var50 = new nu.staldal.xtree.TreeBuilder();
    var46.toSAX((org.xml.sax.ContentHandler)var50);
    nu.staldal.xtree.Element var52 = var50.getTree();
    var50.endDocument();
    nu.staldal.xtree.Element var56 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var57 = var56.getLineNumber();
    var56.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var63 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var64 = var63.getLineNumber();
    var63.addNamespaceMapping("", "");
    var56.addChild((nu.staldal.xtree.Node)var63);
    nu.staldal.xtree.NodeWithChildren var69 = var56.getParent();
    boolean var70 = var56.getPreserveSpace();
    var56.setPublicId("4444444444");
    java.lang.String var73 = var56.getLocalName();
    var56.addNamespaceMapping("          ", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String[] var78 = var56.getNamespaceMapping(1);
    var50.setDocumentLocator((org.xml.sax.Locator)var56);
    var50.startPrefixMapping("nu.staldal.lagoon.core.AuthenticationMissingException", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var18.toSAX((org.xml.sax.ContentHandler)var50);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test49");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    var8.endDocument();
    var8.endDocument();
    var8.startDocument();
    var8.startPrefixMapping("nu.staldal.ftp.FTPException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test50");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    nu.staldal.xtree.NodeWithChildren var4 = var2.getParent();
    var2.setSystemId("nu.staldal.lagoon.util.TemplateException");
    var2.setSystemId("aa");
    boolean var9 = var2.isWhitespaceNode();
    boolean var10 = var2.isWhitespaceNode();
    java.lang.String var12 = var2.getAttributeLocalName((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var2.getAttributeLocalName(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test51");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var13 = new nu.staldal.lagoon.producer.IslandSplit();
    var13.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var16 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var13, true);
    char[] var19 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text(var19, 1, 0, false);
    var16.setDocumentLocator((org.xml.sax.Locator)var23);
    char[] var25 = var23.asCharArray();
    var0.characters(var25, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var31 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    java.lang.String var33 = var0.getParam("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var0.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test52");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var3 = var1.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var4 = var1.isWhitespaceNode();
    java.lang.String var5 = var1.getSystemId();
    boolean var6 = var1.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test53");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    nu.staldal.xmlutil.ContentHandlerAdapter var11 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    nu.staldal.xmlutil.DocumentHandlerAdapter var12 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var11);
    var11.startDocument();
    nu.staldal.lagoon.producer.BasicSplit var14 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var16 = new nu.staldal.xtree.Text("hi!");
    char[] var17 = var16.asCharArray();
    var14.characters(var17, 1, 10);
    var14.endElement("", "hi!", "hi!");
    var14.processingInstruction("", "hi!");
    var14.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var14.startDocument();
    var14.skippedEntity("4444444444");
    var14.skippedEntity("hi!");
    nu.staldal.lagoon.producer.BasicSplit var36 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var38 = new nu.staldal.xtree.Text("hi!");
    char[] var39 = var38.asCharArray();
    var36.characters(var39, 1, 10);
    var36.endElement("", "hi!", "hi!");
    var36.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var50 = new nu.staldal.xtree.Text("");
    char[] var51 = var50.asCharArray();
    char[] var52 = var50.asCharArray();
    char[] var53 = var50.asCharArray();
    var36.characters(var53, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var57 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var36);
    nu.staldal.lagoon.producer.BasicSplit var58 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var60 = new nu.staldal.xtree.Text("hi!");
    char[] var61 = var60.asCharArray();
    var58.characters(var61, 1, 10);
    var58.endElement("", "hi!", "hi!");
    var58.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var72 = new nu.staldal.xtree.Text("");
    char[] var73 = var72.asCharArray();
    char[] var74 = var72.asCharArray();
    char[] var75 = var72.asCharArray();
    var58.characters(var75, 10, 0);
    var57.ignorableWhitespace(var75, 10, 0);
    var14.ignorableWhitespace(var75, 0, 10);
    var11.ignorableWhitespace(var75, 100, 10);
    nu.staldal.xmlutil.DocumentHandlerAdapter var88 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.endElement("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test54");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    var22.startDocument();
    var22.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.producer.IslandSplit var36 = new nu.staldal.lagoon.producer.IslandSplit();
    var36.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var39 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var36, true);
    char[] var42 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var46 = new nu.staldal.xtree.Text(var42, 1, 0, false);
    var39.setDocumentLocator((org.xml.sax.Locator)var46);
    java.lang.String var49 = var46.lookupNamespacePrefix("                                                                                                    ");
    var22.setDocumentLocator((org.xml.sax.Locator)var46);
    var22.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var22.processingInstruction("aa", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    var22.endPrefixMapping("4444444444");
    nu.staldal.xtree.Text var60 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var62 = var60.lookupNamespaceURI("");
    char[] var63 = var60.asCharArray();
    var22.ignorableWhitespace(var63, 1, 1);
    nu.staldal.xmlutil.ContentHandlerFixer var68 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, true);
    nu.staldal.xmlutil.ContentHandlerAdapter var69 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var68);
    nu.staldal.xmlutil.ContentHandlerFixer var72 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var68, false, true);
    nu.staldal.xtree.Element var75 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.xtree.TreeBuilder var76 = new nu.staldal.xtree.TreeBuilder();
    var76.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var81 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var76, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var84 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var81, false, true);
    nu.staldal.xtree.Text var86 = new nu.staldal.xtree.Text("4444444444");
    int var87 = var86.getColumnNumber();
    var81.setDocumentLocator((org.xml.sax.Locator)var86);
    var81.startDocument();
    var75.outputStartElement((org.xml.sax.ContentHandler)var81);
    java.lang.String var93 = var75.getInheritedAttribute("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ", "hi__33__");
    var72.setDocumentLocator((org.xml.sax.Locator)var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var93);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test55");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    org.apache.tools.ant.Project var7 = var0.getProject();
    java.lang.String var8 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    var9.bindToOwner((org.apache.tools.ant.Task)var10);
    var10.log("hi!");
    java.lang.String var14 = var10.getTaskName();
    var10.setTaskType("hi!");
    var10.setDescription("hi!");
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    var19.setPassword("");
    var19.setForce(false);
    org.apache.tools.ant.Target var24 = var19.getOwningTarget();
    var19.maybeConfigure();
    org.apache.tools.ant.RuntimeConfigurable var26 = var19.getRuntimeConfigurableWrapper();
    var10.setRuntimeConfigurableWrapper(var26);
    var0.setRuntimeConfigurableWrapper(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test56");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    nu.staldal.xtree.ProcessingInstruction var35 = new nu.staldal.xtree.ProcessingInstruction("4444444444", "hi!");
    java.lang.String var36 = var35.getValue();
    var22.setDocumentLocator((org.xml.sax.Locator)var35);
    java.lang.String var38 = var35.getTarget();
    java.lang.String var39 = var35.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "4444444444"+ "'", var38.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test57");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    java.lang.String var6 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var10 = new nu.staldal.ftp.FTPException("hi!");
    var7.log("", (java.lang.Throwable)var10, 10);
    org.apache.tools.ant.Location var13 = var7.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var14 = var7.getRuntimeConfigurableWrapper();
    var7.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var20 = new nu.staldal.ftp.FTPException("hi!");
    var17.log("", (java.lang.Throwable)var20, 10);
    org.apache.tools.ant.Project var23 = var17.getProject();
    nu.staldal.lagoon.util.TemplateException var25 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var26 = var25.getException();
    var17.log("", (java.lang.Throwable)var25, (-1));
    var7.bindToOwner((org.apache.tools.ant.Task)var17);
    org.apache.tools.ant.Location var30 = var17.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var31 = var17.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var31);
    java.lang.String var33 = var0.getDescription();
    var0.init();
    nu.staldal.lagoon.util.TemplateException var35 = new nu.staldal.lagoon.util.TemplateException();
    nu.staldal.lagoon.util.TemplateException var36 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var35);
    nu.staldal.lagoon.core.LagoonException var38 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.util.TemplateException: ");
    var36.addSuppressed((java.lang.Throwable)var38);
    java.lang.Exception var40 = var38.getException();
    nu.staldal.ftp.FTPException var42 = new nu.staldal.ftp.FTPException("nu.staldal.lagoon.util.TemplateException: ");
    java.lang.Throwable[] var43 = var42.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var44 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var42);
    var38.addSuppressed((java.lang.Throwable)var44);
    var0.log((java.lang.Throwable)var38, 1);
    org.apache.tools.ant.Location var48 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test58");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    var0.skippedEntity("4444444444");
    java.util.Enumeration var20 = var0.getParamNames();
    int var21 = var0.getPosition();
    var0.endElement("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", "nu.staldal.lagoon.util.TemplateException: ", "hi!");
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    var28.setSystemId("");
    java.net.URL var31 = var28.getBaseURI();
    java.lang.String var34 = var28.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    var37.addNamespaceMapping("", "");
    var28.addChild((nu.staldal.xtree.Node)var37);
    var28.setSystemId("");
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var47 = var46.getLineNumber();
    var46.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var53 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var54 = var53.getLineNumber();
    var53.addNamespaceMapping("", "");
    var46.addChild((nu.staldal.xtree.Node)var53);
    var28.insertChild((nu.staldal.xtree.Node)var46, 0);
    java.lang.String var62 = var28.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var65 = var28.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var66 = var28.getNamespaceURI();
    int var67 = var28.getLineNumber();
    boolean var68 = var28.getPreserveSpace();
    int var71 = var28.lookupAttribute("hi!", "nu.staldal.lagoon.util.TemplateException: ");
    var0.setDocumentLocator((org.xml.sax.Locator)var28);
    var0.processingInstruction("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException", "hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi!"+ "'", var66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == (-1));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test59");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var2.setSystemId("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    nu.staldal.lagoon.producer.BasicSplit var5 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var7 = new nu.staldal.xtree.Text("hi!");
    char[] var8 = var7.asCharArray();
    var5.characters(var8, 1, 10);
    var5.endElement("", "hi!", "hi!");
    var5.processingInstruction("", "hi!");
    var5.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var5.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var23 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var5);
    var23.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var27 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var23);
    nu.staldal.xmlutil.DocumentHandlerAdapter var28 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var23);
    nu.staldal.xtree.Element var31 = new nu.staldal.xtree.Element("hi!", "hi!");
    var31.setSystemId("");
    java.net.URL var34 = var31.getBaseURI();
    java.lang.String var37 = var31.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var40 = new nu.staldal.xtree.Element("hi!", "hi!");
    var40.addNamespaceMapping("", "");
    var31.addChild((nu.staldal.xtree.Node)var40);
    java.lang.String var47 = var40.getInheritedAttribute("", "hi!");
    int var48 = var40.getColumnNumber();
    java.lang.String var49 = var40.getNamespaceURI();
    int var52 = var40.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var28.setDocumentLocator((org.xml.sax.Locator)var40);
    var28.endPrefixMapping("4");
    var2.toSAX((org.xml.sax.ContentHandler)var28);
    nu.staldal.xtree.Text var58 = new nu.staldal.xtree.Text("");
    char[] var59 = var58.asCharArray();
    boolean var60 = var58.isWhitespaceNode();
    nu.staldal.xtree.Element var65 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var68 = var65.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var69 = new nu.staldal.xtree.TreeBuilder();
    var65.toSAX((org.xml.sax.ContentHandler)var69);
    var69.endPrefixMapping("hi!");
    var69.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____", "nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException");
    var69.startPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    var58.toSAX((org.xml.sax.ContentHandler)var69);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.toSAX((org.xml.sax.ContentHandler)var69);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == (-1));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test60");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.util.TemplateException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.util.TemplateException~ hi!"+ "'", var1.equals("nu.staldal.lagoon.util.TemplateException~ hi!"));

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test61");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.util.TemplateException~~ ");
    java.lang.String var3 = var1.lookupNamespaceURI("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    char[] var4 = var1.asCharArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test62");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    org.apache.tools.ant.Location var10 = var0.getLocation();
    nu.staldal.lagoon.core.LagoonException var12 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var13 = var12.toString();
    var0.log((java.lang.Throwable)var12, 100);
    org.apache.tools.ant.Location var16 = var0.getLocation();
    org.apache.tools.ant.Target var17 = var0.getOwningTarget();
    java.lang.String var18 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var13.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test63");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("hi!", "hi!");
    var10.setLine(100);
    int var13 = var10.numberOfNamespaceMappings();
    var0.setDocumentLocator((org.xml.sax.Locator)var10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var0.endDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var18 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test64");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.core.LagoonException~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444"+ "'", var1.equals("nu.staldal.lagoon.core.LagoonException~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444"));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test65");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__", "nu.staldal.lagoon.core.LagoonException: ", (-1), 0);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test66");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.Object var8 = var0.clone();
    var0.init();
    var0.log("nu.staldal.lagoon.util.TemplateException: ");
    org.apache.tools.ant.Project var12 = var0.getProject();
    var0.setTaskType("__52__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test67");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("hi!", "hi!");
    var10.setLine(100);
    int var13 = var10.numberOfNamespaceMappings();
    var0.setDocumentLocator((org.xml.sax.Locator)var10);
    nu.staldal.xtree.Element var17 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var18 = var17.getLineNumber();
    nu.staldal.xtree.NodeWithChildren var19 = var17.getParent();
    var17.setSystemId("nu.staldal.lagoon.util.TemplateException");
    java.lang.String var23 = var17.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    var0.setDocumentLocator((org.xml.sax.Locator)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var25 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test68");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    nu.staldal.xtree.Element var18 = var2.getFirstChildElementOrNull("hi!", "4444444444");
    int var19 = var2.numberOfNamespaceMappings();
    nu.staldal.xtree.TreeBuilder var20 = new nu.staldal.xtree.TreeBuilder();
    var20.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var25 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var20, false, true);
    var2.toSAX((org.xml.sax.ContentHandler)var20);
    var20.startDocument();
    var20.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Element var30 = var20.getTree();
    nu.staldal.xtree.TreeBuilder var31 = new nu.staldal.xtree.TreeBuilder();
    var31.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var36 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var31, false, false);
    nu.staldal.xtree.Text var38 = new nu.staldal.xtree.Text("");
    char[] var39 = var38.asCharArray();
    boolean var40 = var38.isWhitespaceNode();
    char[] var41 = var38.asCharArray();
    var31.ignorableWhitespace(var41, 0, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var20.characters(var41, 1, 2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test69");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var2 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var13 = var12.getLineNumber();
    var12.addNamespaceMapping("", "");
    var5.addChild((nu.staldal.xtree.Node)var12);
    nu.staldal.xtree.NodeWithChildren var18 = var5.getParent();
    boolean var19 = var5.getPreserveSpace();
    var2.setDocumentLocator((org.xml.sax.Locator)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var22 = var5.getAttributeType(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test70");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    java.util.Enumeration var19 = var0.getParamNames();
    var0.destroy();
    var0.skippedEntity("          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test71");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var3 = var1.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    char[] var4 = var1.asCharArray();
    java.lang.String var5 = var1.getValue();
    nu.staldal.lagoon.producer.BasicSplit var6 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var8 = new nu.staldal.xtree.Text("hi!");
    char[] var9 = var8.asCharArray();
    var6.characters(var9, 1, 10);
    var6.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var6.skippedEntity("hi!");
    var6.processingInstruction("nu.staldal.ftp.FTPException: hi!", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    var1.toSAX((org.xml.sax.ContentHandler)var6);
    nu.staldal.xmlutil.ContentHandlerFixer var21 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var6);
    var21.startPrefixMapping("nu.staldal.lagoon.util.TemplateException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var5.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test72");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: hi_33_");
    char[] var2 = var1.asCharArray();
    int var3 = var1.getLineNumber();
    boolean var4 = var1.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test73");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var0.skippedEntity("a");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var9 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test74");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.util.TemplateException: nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    java.lang.String var3 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     "+ "'", var3.equals("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     "));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test75");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", 100, "__32____32____32____32____32____32____32____32____32____32__", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test76");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test77");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ ");
    var0.startPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!", "hi__33__");
    var0.startDocument();
    var0.startDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var14 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test78");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    java.lang.Object var12 = var0.clone();
    org.apache.tools.ant.Target var13 = var0.getOwningTarget();
    var0.setPassword("nu.staldal.ftp.FTPException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test79");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8);
    var14.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var14.endPrefixMapping("hi!");
    nu.staldal.xtree.ProcessingInstruction var21 = new nu.staldal.xtree.ProcessingInstruction("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu.staldal.lagoon.core.LagoonException: aa");
    var14.setDocumentLocator((org.xml.sax.Locator)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test80");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.destroy();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    java.util.Enumeration var6 = var0.getParamNames();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.hasBeenUpdated(1433461995000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test81");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    nu.staldal.xtree.TreeBuilder var4 = new nu.staldal.xtree.TreeBuilder();
    var4.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var9 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4, false, false);
    var4.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var14 = new nu.staldal.xtree.Element("hi!", "hi!");
    var14.setLine(100);
    int var17 = var14.numberOfNamespaceMappings();
    var4.setDocumentLocator((org.xml.sax.Locator)var14);
    var4.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var3.toSAX((org.xml.sax.ContentHandler)var4);
    var4.startDocument();
    nu.staldal.xtree.Element var23 = var4.getTree();
    nu.staldal.lagoon.producer.BasicSplit var24 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var26 = new nu.staldal.xtree.Text("hi!");
    char[] var27 = var26.asCharArray();
    var24.characters(var27, 1, 10);
    var24.endElement("", "hi!", "hi!");
    var24.processingInstruction("", "hi!");
    var24.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var24.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var42 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var24);
    java.util.Enumeration var43 = var24.getParamNames();
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "hi!");
    var46.setLine(100);
    java.lang.String var50 = var46.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var24.setDocumentLocator((org.xml.sax.Locator)var46);
    char[] var54 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var58 = new nu.staldal.xtree.Text(var54, 1, 0, false);
    var24.characters(var54, 1, 2);
    var23.outputEndElement((org.xml.sax.ContentHandler)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test82");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var3 = var2.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.LagoonException:                                                                                                     "+ "'", var3.equals("nu.staldal.lagoon.core.LagoonException:                                                                                                     "));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test83");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    boolean var16 = var2.getPreserveSpace();
    var2.setLine(1);
    int var19 = var2.getLineNumber();
    java.lang.String var21 = var2.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    var2.setPublicId("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test84");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    org.apache.tools.ant.Location var10 = var0.getLocation();
    var0.log("nu.staldal.lagoon.util.TemplateException", (-1));
    var0.setTaskType("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    org.apache.tools.ant.Project var16 = var0.getProject();
    java.lang.Object var17 = var0.clone();
    var0.maybeConfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test85");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    nu.staldal.xmlutil.ContentHandlerFixer var34 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, false);
    nu.staldal.xmlutil.ContentHandlerFixer var36 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var34, false);
    var36.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.util.TemplateException");
    var36.startPrefixMapping("hi__33__", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    var36.processingInstruction("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test86");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    java.lang.String var6 = var1.getValue();
    java.net.URL var7 = var1.getBaseURI();
    java.lang.String var9 = var1.lookupNamespacePrefix("nu.staldal.ftp.FTPException:                                                                                                     ");
    java.lang.String var10 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test87");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var21 = var20.getLineNumber();
    var20.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var28 = var27.getLineNumber();
    var27.addNamespaceMapping("", "");
    var20.addChild((nu.staldal.xtree.Node)var27);
    var2.insertChild((nu.staldal.xtree.Node)var20, 0);
    java.lang.String var36 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var39 = var2.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var40 = var2.getNamespaceURI();
    int var41 = var2.getLineNumber();
    nu.staldal.xtree.Element var42 = var2.getFirstChildElementOrNull();
    int var43 = var42.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test88");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var2 = var1.toString();
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var4 = new nu.staldal.lagoon.LagoonAntTask();
    var3.bindToOwner((org.apache.tools.ant.Task)var4);
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var10 = new nu.staldal.ftp.FTPException("hi!");
    var7.log("", (java.lang.Throwable)var10, 10);
    org.apache.tools.ant.Location var13 = var7.getLocation();
    nu.staldal.lagoon.core.LagoonException var16 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var7.log("4444444444", (java.lang.Throwable)var16, 100);
    java.lang.String var19 = var16.toString();
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var23 = new nu.staldal.ftp.FTPException("hi!");
    var20.log("", (java.lang.Throwable)var23, 10);
    org.apache.tools.ant.Project var26 = var20.getProject();
    nu.staldal.lagoon.util.TemplateException var28 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var29 = var28.getException();
    var20.log("", (java.lang.Throwable)var28, (-1));
    java.lang.Throwable[] var32 = var28.getSuppressed();
    java.lang.Throwable[] var33 = var28.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var35 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var36 = var35.toString();
    var28.addSuppressed((java.lang.Throwable)var35);
    var16.addSuppressed((java.lang.Throwable)var35);
    var3.log("4444444444", (java.lang.Throwable)var35, (-1));
    java.lang.String var41 = var35.toString();
    nu.staldal.lagoon.util.TemplateException var42 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var35);
    java.lang.Exception var43 = var35.getException();
    var1.addSuppressed((java.lang.Throwable)var35);
    java.lang.String var45 = var35.toString();
    nu.staldal.lagoon.util.TemplateException var46 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var19.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var36.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var41.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var45.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test89");


    nu.staldal.lagoon.util.TemplateException var0 = new nu.staldal.lagoon.util.TemplateException();
    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var0);
    java.lang.Exception var2 = var0.getException();
    nu.staldal.lagoon.core.LagoonException var4 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.addSuppressed((java.lang.Throwable)var4);
    java.lang.Throwable[] var6 = var0.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test90");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.log("nu.staldal.lagoon.util.TemplateException", 0);
    var0.reconfigure();
    var0.setTargetURL("4");
    java.lang.String var12 = var0.getDescription();
    org.apache.tools.ant.RuntimeConfigurable var13 = var0.getRuntimeConfigurableWrapper();
    var0.setTaskType("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test91");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    nu.staldal.xtree.Element var18 = var2.getFirstChildElementOrNull("hi!", "4444444444");
    int var19 = var2.numberOfNamespaceMappings();
    nu.staldal.xtree.TreeBuilder var20 = new nu.staldal.xtree.TreeBuilder();
    var20.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var25 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var20, false, true);
    var2.toSAX((org.xml.sax.ContentHandler)var20);
    nu.staldal.xtree.Element var27 = var20.getTree();
    var20.startDocument();
    nu.staldal.xtree.Text var30 = new nu.staldal.xtree.Text("");
    char[] var31 = var30.asCharArray();
    boolean var32 = var30.isWhitespaceNode();
    boolean var33 = var30.isWhitespaceNode();
    java.lang.String var34 = var30.getValue();
    var20.setDocumentLocator((org.xml.sax.Locator)var30);
    var20.startPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test92");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.producer.BasicSplit var3 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var5 = new nu.staldal.xtree.Text("hi!");
    char[] var6 = var5.asCharArray();
    var3.characters(var6, 1, 10);
    var3.endElement("", "hi!", "hi!");
    var3.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var17 = new nu.staldal.xtree.Text("");
    char[] var18 = var17.asCharArray();
    char[] var19 = var17.asCharArray();
    char[] var20 = var17.asCharArray();
    var3.characters(var20, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var24 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var3);
    nu.staldal.xmlutil.DocumentHandlerAdapter var25 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var24);
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    var28.setSystemId("");
    java.net.URL var31 = var28.getBaseURI();
    java.lang.String var34 = var28.getAttrValueOrNull("", "");
    var25.setDocumentLocator((org.xml.sax.Locator)var28);
    var25.startDocument();
    var25.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.producer.IslandSplit var39 = new nu.staldal.lagoon.producer.IslandSplit();
    var39.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var42 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var39, true);
    char[] var45 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var49 = new nu.staldal.xtree.Text(var45, 1, 0, false);
    var42.setDocumentLocator((org.xml.sax.Locator)var49);
    java.lang.String var52 = var49.lookupNamespacePrefix("                                                                                                    ");
    var25.setDocumentLocator((org.xml.sax.Locator)var49);
    var2.addChild((nu.staldal.xtree.Node)var49);
    char[] var55 = var49.asCharArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var59 = new nu.staldal.xtree.Text(var55, 2, 2, true);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test93");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.core.AuthenticationMissingException var7 = new nu.staldal.lagoon.core.AuthenticationMissingException();
    var0.log((java.lang.Throwable)var7, 10);
    var0.setDescription("4444444444");
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var13 = var12.getDescription();
    java.lang.String var14 = var12.getDescription();
    var12.reconfigure();
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var20 = new nu.staldal.ftp.FTPException("hi!");
    var17.log("", (java.lang.Throwable)var20, 10);
    org.apache.tools.ant.Location var23 = var17.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var24 = var17.getRuntimeConfigurableWrapper();
    var17.setTaskType("nu.staldal.lagoon.util.TemplateException");
    var17.log("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    var29.setPassword("");
    var29.setForce(false);
    org.apache.tools.ant.Target var34 = var29.getOwningTarget();
    nu.staldal.lagoon.LagoonAntTask var35 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var38 = new nu.staldal.ftp.FTPException("hi!");
    var35.log("", (java.lang.Throwable)var38, 10);
    org.apache.tools.ant.Location var41 = var35.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var42 = var35.getRuntimeConfigurableWrapper();
    var29.setRuntimeConfigurableWrapper(var42);
    var17.setRuntimeConfigurableWrapper(var42);
    nu.staldal.lagoon.util.TemplateException var45 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var46 = var45.getException();
    java.lang.String var47 = var45.toString();
    var17.log((java.lang.Throwable)var45, 0);
    var12.log("####################################################################################################", (java.lang.Throwable)var45, (-1));
    java.lang.Object var52 = var12.clone();
    java.lang.String var53 = var12.getTaskType();
    nu.staldal.lagoon.LagoonAntTask var54 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var57 = new nu.staldal.ftp.FTPException("hi!");
    var54.log("", (java.lang.Throwable)var57, 10);
    org.apache.tools.ant.Location var60 = var54.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var61 = var54.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Project var62 = var54.getProject();
    nu.staldal.lagoon.LagoonAntTask var63 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var64 = new nu.staldal.lagoon.LagoonAntTask();
    var63.bindToOwner((org.apache.tools.ant.Task)var64);
    var63.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var68 = new nu.staldal.lagoon.LagoonAntTask();
    var68.setPassword("");
    var63.bindToOwner((org.apache.tools.ant.Task)var68);
    org.apache.tools.ant.Project var72 = var63.getProject();
    org.apache.tools.ant.Project var73 = var63.getProject();
    org.apache.tools.ant.Location var74 = var63.getLocation();
    nu.staldal.lagoon.LagoonAntTask var75 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var76 = new nu.staldal.lagoon.LagoonAntTask();
    var75.bindToOwner((org.apache.tools.ant.Task)var76);
    var75.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var80 = new nu.staldal.lagoon.LagoonAntTask();
    var80.setPassword("");
    var75.bindToOwner((org.apache.tools.ant.Task)var80);
    org.apache.tools.ant.Project var84 = var75.getProject();
    org.apache.tools.ant.Project var85 = var75.getProject();
    org.apache.tools.ant.Location var86 = var75.getLocation();
    var63.setLocation(var86);
    var54.setLocation(var86);
    org.apache.tools.ant.Location var89 = var54.getLocation();
    var12.setLocation(var89);
    var0.setLocation(var89);
    var0.setTargetURL("nu.staldal.lagoon.core.AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var47.equals("nu.staldal.lagoon.util.TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test94");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test95");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    int var6 = var2.getLineNumber();
    java.lang.String var8 = var2.lookupNamespacePrefix("hi_33_");
    java.lang.String var11 = var2.getAttrValueOrNull("", "4444444444");
    java.lang.String var13 = var2.getAttributeNamespaceURI((-1));
    int var14 = var2.numberOfNamespaceMappings();
    nu.staldal.xtree.Element var17 = new nu.staldal.xtree.Element("hi!", "hi!");
    var17.setLine(100);
    java.lang.String var21 = var17.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var24 = var17.lookupAttribute("hi!", "");
    int var27 = var17.lookupAttribute("                                                                                                    ", "nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var31 = var30.getLineNumber();
    var30.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var38 = var37.getLineNumber();
    var37.addNamespaceMapping("", "");
    var30.addChild((nu.staldal.xtree.Node)var37);
    nu.staldal.xtree.NodeWithChildren var43 = var30.getParent();
    boolean var44 = var30.getPreserveSpace();
    var30.setPublicId("4444444444");
    nu.staldal.xtree.Element var47 = var30.getFirstChildElement();
    var17.addChild((nu.staldal.xtree.Node)var47);
    nu.staldal.xtree.Element var49 = var17.getFirstChildElement();
    var17.addNamespaceMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "####################################################################################################");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var54 = var2.replaceChild((nu.staldal.xtree.Node)var17, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test96");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    java.lang.String var16 = var2.getNamespaceURI();
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("hi!", "", 10, 0);
    java.lang.String var24 = var21.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    java.lang.String var27 = var21.getInheritedAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var2.addChild((nu.staldal.xtree.Node)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test97");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.log("nu.staldal.lagoon.util.TemplateException", 0);
    var0.reconfigure();
    var0.setTargetURL("4");
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var13 = var12.getDescription();
    nu.staldal.lagoon.LagoonAntTask var14 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var17 = new nu.staldal.ftp.FTPException("hi!");
    var14.log("", (java.lang.Throwable)var17, 10);
    org.apache.tools.ant.Location var20 = var14.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var21 = var14.getRuntimeConfigurableWrapper();
    var14.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var24 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var27 = new nu.staldal.ftp.FTPException("hi!");
    var24.log("", (java.lang.Throwable)var27, 10);
    org.apache.tools.ant.Project var30 = var24.getProject();
    nu.staldal.lagoon.util.TemplateException var32 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var33 = var32.getException();
    var24.log("", (java.lang.Throwable)var32, (-1));
    var14.bindToOwner((org.apache.tools.ant.Task)var24);
    org.apache.tools.ant.Location var37 = var24.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var38 = var24.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Location var39 = var24.getLocation();
    var12.setLocation(var39);
    var0.setLocation(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test98");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.setTaskType("4444444444");
    var0.maybeConfigure();
    var0.setTargetURL("");
    var0.maybeConfigure();
    org.apache.tools.ant.Project var12 = var0.getProject();
    var0.setPassword("4444444444");
    var0.reconfigure();
    java.lang.String var16 = var0.getDescription();
    nu.staldal.lagoon.util.TemplateException var19 = new nu.staldal.lagoon.util.TemplateException("aa");
    nu.staldal.lagoon.core.AuthenticationException var20 = new nu.staldal.lagoon.core.AuthenticationException();
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var24 = new nu.staldal.ftp.FTPException("hi!");
    var21.log("", (java.lang.Throwable)var24, 10);
    var21.init();
    var21.init();
    java.lang.Object var29 = var21.clone();
    var21.init();
    java.lang.Object var31 = var21.clone();
    nu.staldal.lagoon.core.LagoonException var33 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var34 = var33.toString();
    var21.log((java.lang.Throwable)var33, 10);
    java.lang.Throwable[] var37 = var33.getSuppressed();
    var20.addSuppressed((java.lang.Throwable)var33);
    var19.addSuppressed((java.lang.Throwable)var33);
    java.lang.Throwable[] var40 = var19.getSuppressed();
    nu.staldal.lagoon.LagoonAntTask var41 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var44 = new nu.staldal.ftp.FTPException("hi!");
    var41.log("", (java.lang.Throwable)var44, 10);
    org.apache.tools.ant.Location var47 = var41.getLocation();
    nu.staldal.lagoon.core.LagoonException var50 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var41.log("4444444444", (java.lang.Throwable)var50, 100);
    java.lang.String var53 = var50.toString();
    nu.staldal.lagoon.LagoonAntTask var54 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var57 = new nu.staldal.ftp.FTPException("hi!");
    var54.log("", (java.lang.Throwable)var57, 10);
    org.apache.tools.ant.Project var60 = var54.getProject();
    nu.staldal.lagoon.util.TemplateException var62 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var63 = var62.getException();
    var54.log("", (java.lang.Throwable)var62, (-1));
    java.lang.Throwable[] var66 = var62.getSuppressed();
    java.lang.Throwable[] var67 = var62.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var69 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var70 = var69.toString();
    var62.addSuppressed((java.lang.Throwable)var69);
    var50.addSuppressed((java.lang.Throwable)var69);
    java.lang.String var73 = var50.toString();
    var19.addSuppressed((java.lang.Throwable)var50);
    java.lang.String var75 = var50.toString();
    nu.staldal.lagoon.core.LagoonException var77 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException~ ");
    var50.addSuppressed((java.lang.Throwable)var77);
    var0.log("nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__", (java.lang.Throwable)var77, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var34.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var53.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var70.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var73.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var75.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test99");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("nu.staldal.lagoon.core.LagoonException~ nu.staldal.ftp.FTPException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test100");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("hi!", "hi!");
    var18.setSystemId("");
    java.net.URL var21 = var18.getBaseURI();
    java.lang.String var24 = var18.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi!", "hi!");
    var27.addNamespaceMapping("", "");
    var18.addChild((nu.staldal.xtree.Node)var27);
    int var32 = var27.getColumnNumber();
    java.lang.String var34 = var27.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var27.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var2.addChild((nu.staldal.xtree.Node)var27);
    int var43 = var27.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var27.setPublicId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var47 = var27.removeChild((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test101");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    nu.staldal.xtree.Element var18 = var2.getFirstChildElementOrNull("hi!", "4444444444");
    int var19 = var2.numberOfNamespaceMappings();
    int var20 = var2.numberOfNamespaceMappings();
    nu.staldal.xtree.Element var21 = var2.getFirstChildElementOrNull();
    java.lang.String var22 = var2.getTextContentOrNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test102");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.beforeBuild();
    var0.afterBuild();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.hasBeenUpdated(1433461946000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test103");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "");
    java.lang.String var3 = var2.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_"+ "'", var3.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_"));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test104");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    java.lang.String var10 = var2.getSystemId();
    var2.addNamespaceMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "hi!");
    java.lang.String var15 = var2.getAttributeLocalName((-1));
    int var16 = var2.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test105");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: hi_33_", "nu.staldal.lagoon.core.LagoonException~ ", 100, 10);
    var4.setLine((-1));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test106");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var2 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var3 = var0.getNext();
    var0.destroy();
    nu.staldal.lagoon.core.ByteStreamProducer var5 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var6 = var0.getNext();
    var0.afterBuild();
    nu.staldal.lagoon.core.ByteStreamProducer var8 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var9 = var0.getNext();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test107");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    java.lang.String var2 = var0.getParam("4444444444");
    var0.afterBuild();
    var0.beforeBuild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.init();
      fail("Expected exception of type nu.staldal.lagoon.core.LagoonException");
    } catch (nu.staldal.lagoon.core.LagoonException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test108");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.processingInstruction("_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test109");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    var0.skippedEntity("4444444444");
    var0.skippedEntity("hi!");
    var0.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException: ");
    char[] var27 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text(var27, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var32 = new nu.staldal.xtree.TreeBuilder();
    var32.endPrefixMapping("hi!");
    var32.endDocument();
    var32.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var31.toSAX((org.xml.sax.ContentHandler)var32);
    var32.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    char[] var45 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var49 = new nu.staldal.xtree.Text(var45, 1, 0, false);
    char[] var50 = var49.asCharArray();
    var32.ignorableWhitespace(var50, 10, 10);
    var0.ignorableWhitespace(var50, 100, 0);
    java.util.Enumeration var57 = var0.getParamNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test110");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    var8.endDocument();
    nu.staldal.xtree.Element var12 = var8.getTree();
    var8.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test111");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var17 = var11.getAttrValueOrNull("");
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("hi!", "hi!");
    var20.setSystemId("");
    java.net.URL var23 = var20.getBaseURI();
    java.lang.String var26 = var20.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var29 = new nu.staldal.xtree.Element("hi!", "hi!");
    var29.addNamespaceMapping("", "");
    var20.addChild((nu.staldal.xtree.Node)var29);
    var20.setSystemId("");
    nu.staldal.xtree.Element var38 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var39 = var38.getLineNumber();
    var38.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var46 = var45.getLineNumber();
    var45.addNamespaceMapping("", "");
    var38.addChild((nu.staldal.xtree.Node)var45);
    var20.insertChild((nu.staldal.xtree.Node)var38, 0);
    var11.addChild((nu.staldal.xtree.Node)var20);
    nu.staldal.xtree.Element var54 = var20.getFirstChildElementOrNull();
    boolean var55 = var20.isWhitespaceNode();
    java.lang.String var56 = var20.getSystemId();
    nu.staldal.xtree.Element var57 = var20.getFirstChildElementOrNull();
    boolean var58 = var57.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test112");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    var0.log("");
    var0.log("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var0.setTargetURL("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    var18.bindToOwner((org.apache.tools.ant.Task)var19);
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var25 = new nu.staldal.ftp.FTPException("hi!");
    var22.log("", (java.lang.Throwable)var25, 10);
    org.apache.tools.ant.Location var28 = var22.getLocation();
    nu.staldal.lagoon.core.LagoonException var31 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var22.log("4444444444", (java.lang.Throwable)var31, 100);
    java.lang.String var34 = var31.toString();
    nu.staldal.lagoon.LagoonAntTask var35 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var38 = new nu.staldal.ftp.FTPException("hi!");
    var35.log("", (java.lang.Throwable)var38, 10);
    org.apache.tools.ant.Project var41 = var35.getProject();
    nu.staldal.lagoon.util.TemplateException var43 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var44 = var43.getException();
    var35.log("", (java.lang.Throwable)var43, (-1));
    java.lang.Throwable[] var47 = var43.getSuppressed();
    java.lang.Throwable[] var48 = var43.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var50 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var51 = var50.toString();
    var43.addSuppressed((java.lang.Throwable)var50);
    var31.addSuppressed((java.lang.Throwable)var50);
    var18.log("4444444444", (java.lang.Throwable)var50, (-1));
    java.lang.String var56 = var50.toString();
    nu.staldal.lagoon.util.TemplateException var57 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var50);
    java.lang.Exception var58 = var50.getException();
    nu.staldal.lagoon.util.TemplateException var59 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var50);
    java.lang.Exception var60 = var59.getException();
    nu.staldal.lagoon.util.TemplateException var61 = new nu.staldal.lagoon.util.TemplateException(var60);
    var0.log((java.lang.Throwable)var60, 0);
    java.lang.Throwable[] var64 = var60.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var34.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var51.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var56.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test113");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.core.LagoonException var9 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var0.log("4444444444", (java.lang.Throwable)var9, 100);
    var0.setTaskName("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.LagoonAntTask var14 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var17 = new nu.staldal.ftp.FTPException("hi!");
    var14.log("", (java.lang.Throwable)var17, 10);
    org.apache.tools.ant.Location var20 = var14.getLocation();
    nu.staldal.lagoon.core.LagoonException var23 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var14.log("4444444444", (java.lang.Throwable)var23, 100);
    var14.setTaskName("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.bindToOwner((org.apache.tools.ant.Task)var14);
    var14.setTaskType("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    var14.setForce(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test114");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", 2);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test115");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.lagoon.producer.BasicSplit var22 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var24 = new nu.staldal.xtree.Text("hi!");
    char[] var25 = var24.asCharArray();
    var22.characters(var25, 1, 10);
    var22.endElement("", "hi!", "hi!");
    var22.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var36 = new nu.staldal.xtree.Text("");
    char[] var37 = var36.asCharArray();
    char[] var38 = var36.asCharArray();
    char[] var39 = var36.asCharArray();
    var22.characters(var39, 10, 0);
    var21.ignorableWhitespace(var39, 10, 0);
    var21.startDocument();
    var21.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.LagoonException~ ");
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var53 = var52.getLineNumber();
    var52.setPublicId("");
    java.lang.String var58 = var52.getInheritedAttribute("", "4444444444");
    int var59 = var52.numberOfChildren();
    var21.setDocumentLocator((org.xml.sax.Locator)var52);
    int var61 = var52.getLineNumber();
    nu.staldal.xtree.Element var62 = var52.getFirstChildElementOrNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test116");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    org.apache.tools.ant.Target var9 = var5.getOwningTarget();
    var5.setPassword("hi!");
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    var12.bindToOwner((org.apache.tools.ant.Task)var13);
    var12.log("");
    java.lang.Object var17 = var12.clone();
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var21 = new nu.staldal.ftp.FTPException("hi!");
    var18.log("", (java.lang.Throwable)var21, 10);
    org.apache.tools.ant.Location var24 = var18.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var25 = var18.getRuntimeConfigurableWrapper();
    var18.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var31 = new nu.staldal.ftp.FTPException("hi!");
    var28.log("", (java.lang.Throwable)var31, 10);
    org.apache.tools.ant.Project var34 = var28.getProject();
    nu.staldal.lagoon.util.TemplateException var36 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var37 = var36.getException();
    var28.log("", (java.lang.Throwable)var36, (-1));
    var18.bindToOwner((org.apache.tools.ant.Task)var28);
    org.apache.tools.ant.Location var41 = var28.getLocation();
    var12.setLocation(var41);
    java.lang.String var43 = var12.getTaskName();
    org.apache.tools.ant.RuntimeConfigurable var44 = var12.getRuntimeConfigurableWrapper();
    var5.setRuntimeConfigurableWrapper(var44);
    nu.staldal.ftp.FTPException var47 = new nu.staldal.ftp.FTPException("4");
    java.lang.Throwable[] var48 = var47.getSuppressed();
    java.lang.String var49 = var47.toString();
    var5.log((java.lang.Throwable)var47, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "nu.staldal.ftp.FTPException: 4"+ "'", var49.equals("nu.staldal.ftp.FTPException: 4"));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test117");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    java.lang.String var8 = var2.getInheritedAttribute("", "4444444444");
    int var9 = var2.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var10 = new nu.staldal.xtree.TreeBuilder();
    var10.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var15 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var10, false, false);
    var2.toSAX((org.xml.sax.ContentHandler)var15);
    nu.staldal.xmlutil.ContentHandlerFixer var18 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var15, true);
    nu.staldal.xtree.Element var23 = new nu.staldal.xtree.Element("hi!", "", 10, 0);
    var15.setDocumentLocator((org.xml.sax.Locator)var23);
    nu.staldal.lagoon.producer.BasicSplit var25 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var27 = new nu.staldal.xtree.Text("hi!");
    char[] var28 = var27.asCharArray();
    var25.characters(var28, 1, 10);
    var25.endElement("", "hi!", "hi!");
    nu.staldal.xtree.TreeBuilder var36 = new nu.staldal.xtree.TreeBuilder();
    var36.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var41 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var36, false, false);
    nu.staldal.xtree.Text var43 = new nu.staldal.xtree.Text("");
    char[] var44 = var43.asCharArray();
    boolean var45 = var43.isWhitespaceNode();
    char[] var46 = var43.asCharArray();
    var36.ignorableWhitespace(var46, 0, 10);
    var25.characters(var46, 1, 10);
    var15.ignorableWhitespace(var46, 2, 0);
    var15.endDocument();
    nu.staldal.lagoon.producer.IslandSplit var57 = new nu.staldal.lagoon.producer.IslandSplit();
    var57.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var60 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var57, true);
    char[] var63 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var67 = new nu.staldal.xtree.Text(var63, 1, 0, false);
    var60.setDocumentLocator((org.xml.sax.Locator)var67);
    char[] var69 = var67.asCharArray();
    var15.ignorableWhitespace(var69, (-1), 10);
    var15.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test118");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.util.TemplateException~ hi!", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test119");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    boolean var5 = var0.isReentrant();
    long var7 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: 4444444444");
    long var9 = var0.fileLastModified("aaaaaaaaaa");
    nu.staldal.lagoon.core.OutputHandler var11 = var0.createFile("nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461999000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1433461982000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test120");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    char[] var3 = var1.asCharArray();
    char[] var4 = var1.asCharArray();
    boolean var5 = var1.isWhitespaceNode();
    var1.setColumn(0);
    nu.staldal.xtree.NodeWithChildren var8 = var1.getParent();
    nu.staldal.xtree.TreeBuilder var9 = new nu.staldal.xtree.TreeBuilder();
    var9.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var9, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var17 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var14, false, true);
    var17.startDocument();
    var1.toSAX((org.xml.sax.ContentHandler)var17);
    var17.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test121");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.util.TemplateException: ", "hi_33_");
    boolean var3 = var2.getPreserveSpace();
    java.lang.String var4 = var2.getTarget();
    var2.setSystemId("nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var8 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.util.TemplateException: "+ "'", var4.equals("nu.staldal.lagoon.util.TemplateException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test122");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ nu.staldal.ftp.FTPException~                                                                                                     ", "nu.staldal.lagoon.core.LagoonException: hi_33_", 0);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test123");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    var19.setSystemId("");
    java.net.URL var22 = var19.getBaseURI();
    java.lang.String var25 = var19.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    var28.addNamespaceMapping("", "");
    var19.addChild((nu.staldal.xtree.Node)var28);
    java.lang.String var34 = var28.getAttrValueOrNull("");
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    var37.setSystemId("");
    java.net.URL var40 = var37.getBaseURI();
    java.lang.String var43 = var37.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "hi!");
    var46.addNamespaceMapping("", "");
    var37.addChild((nu.staldal.xtree.Node)var46);
    var37.setSystemId("");
    nu.staldal.xtree.Element var55 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var56 = var55.getLineNumber();
    var55.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var62 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var63 = var62.getLineNumber();
    var62.addNamespaceMapping("", "");
    var55.addChild((nu.staldal.xtree.Node)var62);
    var37.insertChild((nu.staldal.xtree.Node)var55, 0);
    var28.addChild((nu.staldal.xtree.Node)var37);
    var37.setLine((-1));
    int var73 = var37.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var37);
    nu.staldal.xtree.Element var75 = var37.getFirstChildElementOrNull();
    java.lang.String var76 = var75.getLocalName();
    java.lang.String var77 = var75.getSystemId();
    java.lang.String[] var79 = var75.getNamespaceMapping(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var82 = var75.getFirstChildElement("a", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "hi!"+ "'", var76.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test124");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.destroy();
    nu.staldal.xtree.TreeBuilder var12 = new nu.staldal.xtree.TreeBuilder();
    var12.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var17 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var12, false, true);
    var17.startPrefixMapping("nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Text var22 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var24 = var22.lookupNamespaceURI("");
    char[] var25 = var22.asCharArray();
    var17.ignorableWhitespace(var25, 0, 100);
    var0.characters(var25, 1, 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.init();
      fail("Expected exception of type nu.staldal.lagoon.core.LagoonException");
    } catch (nu.staldal.lagoon.core.LagoonException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test125");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var13 = new nu.staldal.ftp.FTPException("hi!");
    var10.log("", (java.lang.Throwable)var13, 10);
    org.apache.tools.ant.Project var16 = var10.getProject();
    nu.staldal.lagoon.util.TemplateException var18 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var19 = var18.getException();
    var10.log("", (java.lang.Throwable)var18, (-1));
    var0.bindToOwner((org.apache.tools.ant.Task)var10);
    org.apache.tools.ant.Location var23 = var10.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var24 = var10.getRuntimeConfigurableWrapper();
    var10.setForce(true);
    var10.maybeConfigure();
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var29 = var28.getDescription();
    java.lang.Object var30 = var28.clone();
    var10.bindToOwner((org.apache.tools.ant.Task)var28);
    java.lang.Object var32 = var10.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test126");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    nu.staldal.xtree.Text var34 = new nu.staldal.xtree.Text("");
    char[] var35 = var34.asCharArray();
    char[] var36 = var34.asCharArray();
    var22.characters(var36, 100, 100);
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var43 = var42.getLineNumber();
    var42.setPublicId("");
    int var46 = var42.getLineNumber();
    java.lang.String var48 = var42.lookupNamespacePrefix("hi_33_");
    var22.setDocumentLocator((org.xml.sax.Locator)var42);
    nu.staldal.lagoon.producer.BasicSplit var50 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var52 = new nu.staldal.xtree.Text("hi!");
    char[] var53 = var52.asCharArray();
    var50.characters(var53, 1, 10);
    var50.endElement("", "hi!", "hi!");
    var50.processingInstruction("", "hi!");
    var50.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    char[] var69 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var73 = new nu.staldal.xtree.Text(var69, 1, 0, false);
    var50.characters(var69, 1, (-1));
    var22.ignorableWhitespace(var69, 1, 0);
    var22.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    var22.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerAdapter var84 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var22);
    var22.startPrefixMapping("4444444444", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.xmlutil.ContentHandlerAdapter var88 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var22);
    nu.staldal.xmlutil.DocumentHandlerAdapter var89 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var88);
    var89.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test127");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test128");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    var0.skippedEntity("4444444444");
    var0.skippedEntity("hi!");
    nu.staldal.lagoon.producer.BasicSplit var22 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var24 = new nu.staldal.xtree.Text("hi!");
    char[] var25 = var24.asCharArray();
    var22.characters(var25, 1, 10);
    var22.endElement("", "hi!", "hi!");
    var22.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var36 = new nu.staldal.xtree.Text("");
    char[] var37 = var36.asCharArray();
    char[] var38 = var36.asCharArray();
    char[] var39 = var36.asCharArray();
    var22.characters(var39, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var43 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var22);
    nu.staldal.lagoon.producer.BasicSplit var44 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var46 = new nu.staldal.xtree.Text("hi!");
    char[] var47 = var46.asCharArray();
    var44.characters(var47, 1, 10);
    var44.endElement("", "hi!", "hi!");
    var44.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var58 = new nu.staldal.xtree.Text("");
    char[] var59 = var58.asCharArray();
    char[] var60 = var58.asCharArray();
    char[] var61 = var58.asCharArray();
    var44.characters(var61, 10, 0);
    var43.ignorableWhitespace(var61, 10, 0);
    var0.ignorableWhitespace(var61, 0, 10);
    java.lang.String var72 = var0.getParam("nu.staldal.lagoon.core.AuthenticationMissingException");
    var0.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.afterBuild();
    var0.destroy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var78 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test129");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________", "nu.staldal.lagoon.util.TemplateException~~ ");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test130");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var3 = var2.getPreserveSpace();
    var2.addAttribute("hi_33_", "nu.staldal.lagoon.core.LagoonException: ", "4444444444", "4444444444");
    int var9 = var2.getLineNumber();
    java.lang.String var10 = var2.getLocalName();
    int var13 = var2.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test131");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("hi_33_");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.Throwable[] var3 = var1.getSuppressed();
    nu.staldal.lagoon.LagoonAntTask var4 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var7 = new nu.staldal.ftp.FTPException("hi!");
    var4.log("", (java.lang.Throwable)var7, 10);
    org.apache.tools.ant.Location var10 = var4.getLocation();
    nu.staldal.lagoon.core.LagoonException var13 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var4.log("4444444444", (java.lang.Throwable)var13, 100);
    nu.staldal.lagoon.util.TemplateException var16 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var13);
    var1.addSuppressed((java.lang.Throwable)var16);
    java.lang.Throwable[] var18 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test132");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    int var13 = var4.lookupAttribute("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException");
    int var14 = var4.getColumnNumber();
    java.lang.String var16 = var4.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var18 = var4.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test133");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var11.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var11.setLine(1);
    boolean var23 = var11.getPreserveSpace();
    int var24 = var11.getLineNumber();
    var11.setSystemId("4444444444");
    java.lang.String var27 = var11.getSystemId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var29 = var11.getNamespaceMapping((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "4444444444"+ "'", var27.equals("4444444444"));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test134");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.net.URL var6 = var3.getBaseURI();
    int var7 = var3.numberOfChildren();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test135");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    var0.beforeBuild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var2 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test136");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", (-1));
    nu.staldal.xtree.TreeBuilder var4 = new nu.staldal.xtree.TreeBuilder();
    var4.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.setPublicId("");
    int var13 = var9.getLineNumber();
    var4.setDocumentLocator((org.xml.sax.Locator)var9);
    nu.staldal.xmlutil.ContentHandlerFixer var15 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4);
    var3.toSAX((org.xml.sax.ContentHandler)var4);
    nu.staldal.xtree.Element var17 = var4.getTree();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.endElement("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__", "nu.staldal.lagoon.util.TemplateException~~ ", "nu.staldal.lagoon.util.TemplateException");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test137");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    nu.staldal.lagoon.producer.IslandSplit var6 = new nu.staldal.lagoon.producer.IslandSplit();
    var6.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var6, false, false);
    nu.staldal.xtree.Element var14 = new nu.staldal.xtree.Element("", "hi!", 10);
    var14.setSystemId("hi!");
    java.lang.String var17 = var14.getSystemId();
    var10.setDocumentLocator((org.xml.sax.Locator)var14);
    var14.setLine(100);
    var5.setDocumentLocator((org.xml.sax.Locator)var14);
    int var22 = var14.numberOfAttributes();
    var14.addNamespaceMapping("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.core.LagoonException~ hi__33__");
    java.lang.String var27 = var14.lookupNamespacePrefix("4444444444");
    java.net.URL var28 = var14.getBaseURI();
    java.lang.String var31 = var14.getInheritedAttribute("nu.staldal.lagoon.util.TemplateException: nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test138");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", 0);
    java.net.URL var4 = var3.getBaseURI();
    var3.setColumn(2);
    java.net.URL var7 = var3.getBaseURI();
    java.lang.String var8 = var3.getTextContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test139");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("");
    nu.staldal.xtree.TreeBuilder var24 = new nu.staldal.xtree.TreeBuilder();
    var24.endPrefixMapping("hi!");
    var23.toSAX((org.xml.sax.ContentHandler)var24);
    var18.setDocumentLocator((org.xml.sax.Locator)var23);
    var18.processingInstruction("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "a");
    nu.staldal.xmlutil.DocumentHandlerAdapter var32 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    nu.staldal.xtree.ProcessingInstruction var35 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var36 = var35.getLineNumber();
    java.lang.String var37 = var35.getValue();
    java.lang.String var38 = var35.getValue();
    var35.setLine(2);
    java.lang.String var41 = var35.getValue();
    java.lang.String var42 = var35.getSystemId();
    java.lang.String var43 = var35.getValue();
    var32.setDocumentLocator((org.xml.sax.Locator)var35);
    nu.staldal.xmlutil.ContentHandlerFixer var47 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var32, false, false);
    nu.staldal.xtree.Element var50 = new nu.staldal.xtree.Element("hi!", "hi!");
    var50.setSystemId("");
    nu.staldal.xtree.NodeWithChildren var53 = var50.getParent();
    java.lang.String var54 = var50.getTextContentOrNull();
    nu.staldal.xtree.Element var55 = var50.getFirstChildElementOrNull();
    nu.staldal.xtree.NodeWithChildren var56 = var50.getParent();
    var32.setDocumentLocator((org.xml.sax.Locator)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var37.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var38.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var41.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var43.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test140");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    var4.setSystemId("hi!");
    int var8 = var4.getLineNumber();
    boolean var9 = var4.isWhitespaceNode();
    java.lang.String var10 = var4.getPublicId();
    boolean var11 = var4.getPreserveSpace();
    nu.staldal.xtree.NodeWithChildren var12 = var4.getParent();
    java.lang.String var15 = var4.getInheritedAttribute("hi!", "nu.staldal.lagoon.util.TemplateException");
    int var16 = var4.numberOfAttributes();
    java.lang.String var19 = var4.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "hi_33_");
    java.lang.String var21 = var4.getAttributeValue((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test141");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var2 = var1.getValue();
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.setPublicId("");
    java.lang.String var11 = var5.getInheritedAttribute("", "4444444444");
    int var12 = var5.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var13 = new nu.staldal.xtree.TreeBuilder();
    var13.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var18 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var13, false, false);
    var5.toSAX((org.xml.sax.ContentHandler)var18);
    nu.staldal.xmlutil.ContentHandlerFixer var21 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var18, true);
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("hi!", "", 10, 0);
    var18.setDocumentLocator((org.xml.sax.Locator)var26);
    var1.toSAX((org.xml.sax.ContentHandler)var18);
    nu.staldal.xtree.ProcessingInstruction var31 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var32 = var31.getValue();
    var31.setColumn(10);
    var18.setDocumentLocator((org.xml.sax.Locator)var31);
    java.lang.String var36 = var31.getTarget();
    java.lang.String var37 = var31.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var32.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var36.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var37.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test142");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    nu.staldal.lagoon.producer.BasicSplit var11 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var13 = new nu.staldal.xtree.Text("hi!");
    char[] var14 = var13.asCharArray();
    var11.characters(var14, 1, 10);
    var11.endElement("", "hi!", "hi!");
    var11.processingInstruction("", "hi!");
    var11.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var11.startDocument();
    var4.outputEndElement((org.xml.sax.ContentHandler)var11);
    nu.staldal.xtree.Element var30 = var4.getFirstChildElementOrNull();
    var4.addAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    java.lang.String var38 = var4.getInheritedAttribute("nu__46__staldal__46__lagoon__46__util__46__TemplateException", "nu.staldal.lagoon.core.LagoonException~ 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test143");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var1.setLine(1);
    java.lang.String var6 = var1.getInheritedAttribute("4444444444", "hi!");
    java.lang.String var7 = var1.getSystemId();
    var1.setColumn(10);
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("hi!", "hi!");
    var12.setSystemId("");
    java.net.URL var15 = var12.getBaseURI();
    java.lang.String var18 = var12.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("hi!", "hi!");
    var21.addNamespaceMapping("", "");
    var12.addChild((nu.staldal.xtree.Node)var21);
    java.lang.String var28 = var21.getInheritedAttribute("", "hi!");
    int var29 = var21.getColumnNumber();
    char[] var32 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var36 = new nu.staldal.xtree.Text(var32, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var37 = new nu.staldal.xtree.TreeBuilder();
    var37.endPrefixMapping("hi!");
    var37.endDocument();
    var37.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var36.toSAX((org.xml.sax.ContentHandler)var37);
    var37.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var37.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    var21.toSAX((org.xml.sax.ContentHandler)var37);
    var37.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    nu.staldal.xtree.ProcessingInstruction var55 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~~ ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    java.lang.String var56 = var55.getValue();
    var37.setDocumentLocator((org.xml.sax.Locator)var55);
    var1.toSAX((org.xml.sax.ContentHandler)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException"+ "'", var56.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException"));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test144");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var8.setDocumentLocator((org.xml.sax.Locator)var16);
    var8.startDocument();
    nu.staldal.xtree.Element var19 = var8.getTree();
    int var20 = var19.getColumnNumber();
    java.lang.String var21 = var19.getTextContent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var23 = var19.getAttributeType(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test145");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.AuthenticationException", "nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException");

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test146");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    org.apache.tools.ant.Project var9 = var0.getProject();
    org.apache.tools.ant.Project var10 = var0.getProject();
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    var11.bindToOwner((org.apache.tools.ant.Task)var12);
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var18 = new nu.staldal.ftp.FTPException("hi!");
    var15.log("", (java.lang.Throwable)var18, 10);
    org.apache.tools.ant.Location var21 = var15.getLocation();
    nu.staldal.lagoon.core.LagoonException var24 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var15.log("4444444444", (java.lang.Throwable)var24, 100);
    java.lang.String var27 = var24.toString();
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var31 = new nu.staldal.ftp.FTPException("hi!");
    var28.log("", (java.lang.Throwable)var31, 10);
    org.apache.tools.ant.Project var34 = var28.getProject();
    nu.staldal.lagoon.util.TemplateException var36 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var37 = var36.getException();
    var28.log("", (java.lang.Throwable)var36, (-1));
    java.lang.Throwable[] var40 = var36.getSuppressed();
    java.lang.Throwable[] var41 = var36.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var43 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var44 = var43.toString();
    var36.addSuppressed((java.lang.Throwable)var43);
    var24.addSuppressed((java.lang.Throwable)var43);
    var11.log("4444444444", (java.lang.Throwable)var43, (-1));
    nu.staldal.lagoon.util.TemplateException var50 = new nu.staldal.lagoon.util.TemplateException("hi_33_");
    var43.addSuppressed((java.lang.Throwable)var50);
    nu.staldal.lagoon.LagoonAntTask var52 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var55 = new nu.staldal.ftp.FTPException("hi!");
    var52.log("", (java.lang.Throwable)var55, 10);
    org.apache.tools.ant.Project var58 = var52.getProject();
    nu.staldal.lagoon.util.TemplateException var60 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var61 = var60.getException();
    var52.log("", (java.lang.Throwable)var60, (-1));
    var50.addSuppressed((java.lang.Throwable)var60);
    nu.staldal.lagoon.LagoonAntTask var65 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var68 = new nu.staldal.ftp.FTPException("hi!");
    var65.log("", (java.lang.Throwable)var68, 10);
    org.apache.tools.ant.Project var71 = var65.getProject();
    nu.staldal.lagoon.util.TemplateException var73 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var74 = var73.getException();
    var65.log("", (java.lang.Throwable)var73, (-1));
    java.lang.Throwable[] var77 = var73.getSuppressed();
    java.lang.Throwable[] var78 = var73.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var80 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var81 = var80.toString();
    var73.addSuppressed((java.lang.Throwable)var80);
    nu.staldal.lagoon.util.TemplateException var83 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var84 = var83.getException();
    nu.staldal.lagoon.util.TemplateException var85 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var83);
    var80.addSuppressed((java.lang.Throwable)var83);
    var50.addSuppressed((java.lang.Throwable)var83);
    java.lang.Exception var88 = var50.getException();
    var0.log((java.lang.Throwable)var50, (-1));
    var0.maybeConfigure();
    java.lang.String var92 = var0.getTaskType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var27.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var44.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var81.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var92);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test147");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.log("");
    java.lang.Object var5 = var0.clone();
    var0.maybeConfigure();
    java.lang.String var7 = var0.getTaskType();
    org.apache.tools.ant.Location var8 = var0.getLocation();
    nu.staldal.ftp.FTPException var11 = new nu.staldal.ftp.FTPException("nu.staldal.lagoon.core.AuthenticationMissingException");
    var0.log("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_", (java.lang.Throwable)var11, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test148");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.startDocument();
    nu.staldal.lagoon.producer.BasicSplit var20 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var22 = new nu.staldal.xtree.Text("hi!");
    char[] var23 = var22.asCharArray();
    var20.characters(var23, 1, 10);
    var20.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var30 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var20, true);
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var38 = var35.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var39 = new nu.staldal.xtree.TreeBuilder();
    var35.toSAX((org.xml.sax.ContentHandler)var39);
    var39.skippedEntity("hi!");
    var39.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var45 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var39);
    var45.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.TreeBuilder var48 = new nu.staldal.xtree.TreeBuilder();
    var48.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var53 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var48, false, false);
    nu.staldal.xtree.Text var55 = new nu.staldal.xtree.Text("");
    char[] var56 = var55.asCharArray();
    boolean var57 = var55.isWhitespaceNode();
    char[] var58 = var55.asCharArray();
    var48.ignorableWhitespace(var58, 0, 10);
    var45.ignorableWhitespace(var58, (-1), 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var65 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var45);
    nu.staldal.lagoon.producer.BasicSplit var66 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var68 = new nu.staldal.xtree.Text("hi!");
    char[] var69 = var68.asCharArray();
    var66.characters(var69, 1, 10);
    var45.ignorableWhitespace(var69, 2, 10);
    var30.ignorableWhitespace(var69, 0, 1);
    var18.ignorableWhitespace(var69, (-1), 10);
    nu.staldal.xtree.Element var85 = new nu.staldal.xtree.Element("4444444444", "", 0);
    java.lang.String var86 = var85.getTextContentOrNull();
    java.lang.String var88 = var85.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    var18.setDocumentLocator((org.xml.sax.Locator)var85);
    var18.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + ""+ "'", var86.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test149");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    boolean var16 = var2.getPreserveSpace();
    var2.setPublicId("4444444444");
    nu.staldal.xtree.Element var19 = var2.getFirstChildElement();
    nu.staldal.xtree.Element var20 = var2.getFirstChildElement();
    int var23 = var20.lookupAttribute("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test150");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    boolean var7 = var0.isReentrant();
    boolean var8 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    var0.close();
    nu.staldal.lagoon.core.OutputHandler var13 = var0.createFile("##########");
    var0.close();
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test151");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    char[] var6 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var10 = new nu.staldal.xtree.Text(var6, 1, 0, false);
    var3.setDocumentLocator((org.xml.sax.Locator)var10);
    char[] var12 = var10.asCharArray();
    var10.setPublicId("");
    java.lang.String var15 = var10.getSystemId();
    nu.staldal.lagoon.producer.BasicSplit var16 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var18 = new nu.staldal.xtree.Text("hi!");
    char[] var19 = var18.asCharArray();
    var16.characters(var19, 1, 10);
    var16.endElement("", "hi!", "hi!");
    var16.processingInstruction("", "hi!");
    var16.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var16.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var34 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var16);
    var34.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var38 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var34);
    var38.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.producer.BasicSplit var42 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var44 = new nu.staldal.xtree.Text("hi!");
    char[] var45 = var44.asCharArray();
    var42.characters(var45, 1, 10);
    var42.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var42.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    char[] var57 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var61 = new nu.staldal.xtree.Text(var57, 1, 0, false);
    char[] var62 = var61.asCharArray();
    var42.ignorableWhitespace(var62, 0, 10);
    var38.characters(var62, 0, 100);
    nu.staldal.xtree.ProcessingInstruction var71 = new nu.staldal.xtree.ProcessingInstruction("hi_33_", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var72 = var71.getTarget();
    var38.setDocumentLocator((org.xml.sax.Locator)var71);
    var10.toSAX((org.xml.sax.ContentHandler)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi_33_"+ "'", var72.equals("hi_33_"));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test152");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setTargetURL("4444444444");
    java.lang.String var10 = var0.getTaskName();
    java.lang.String var11 = var0.getDescription();
    nu.staldal.ftp.FTPException var14 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("4444444444", (java.lang.Throwable)var14, 100);
    java.lang.String var17 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    var18.bindToOwner((org.apache.tools.ant.Task)var19);
    var19.log("hi!");
    java.lang.String var23 = var19.getTaskName();
    org.apache.tools.ant.Target var24 = var19.getOwningTarget();
    var19.log("hi!", 1);
    var19.setForce(false);
    var0.bindToOwner((org.apache.tools.ant.Task)var19);
    org.apache.tools.ant.Location var31 = var0.getLocation();
    var0.maybeConfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test153");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.hasBeenUpdated(1433461947000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test154");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var10 = var4.lookupNamespaceURI("4444444444");
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("4444444444");
    nu.staldal.lagoon.producer.BasicSplit var13 = new nu.staldal.lagoon.producer.BasicSplit();
    var12.toSAX((org.xml.sax.ContentHandler)var13);
    var4.outputEndElement((org.xml.sax.ContentHandler)var13);
    var13.destroy();
    nu.staldal.lagoon.core.LagoonContext var17 = var13.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test155");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    java.lang.String var6 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var9 = var2.lookupAttribute("hi!", "");
    int var12 = var2.lookupAttribute("                                                                                                    ", "nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.xtree.Element var15 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var16 = var15.getLineNumber();
    var15.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var22 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var23 = var22.getLineNumber();
    var22.addNamespaceMapping("", "");
    var15.addChild((nu.staldal.xtree.Node)var22);
    nu.staldal.xtree.NodeWithChildren var28 = var15.getParent();
    boolean var29 = var15.getPreserveSpace();
    var15.setPublicId("4444444444");
    nu.staldal.xtree.Element var32 = var15.getFirstChildElement();
    var2.addChild((nu.staldal.xtree.Node)var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var35 = var32.getAttrValue("4444444444");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test156");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.lang.String var6 = var3.getSystemId();
    var3.setColumn(10);
    int var9 = var3.numberOfAttributes();
    java.lang.String var11 = var3.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    int var12 = var3.numberOfChildren();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test157");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.util.TemplateException: ", (-1));
    java.lang.String var5 = var3.getAttrValueOrNull("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    var3.addNamespaceMapping("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var10 = var3.getNamespaceMapping(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test158");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var2 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    var2.bindToOwner((org.apache.tools.ant.Task)var3);
    var2.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    var7.setPassword("");
    var2.bindToOwner((org.apache.tools.ant.Task)var7);
    org.apache.tools.ant.Project var11 = var2.getProject();
    org.apache.tools.ant.Project var12 = var2.getProject();
    org.apache.tools.ant.RuntimeConfigurable var13 = var2.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var13);
    var0.setForce(false);
    org.apache.tools.ant.Project var17 = var0.getProject();
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    var18.maybeConfigure();
    var18.log("4444444444", 1);
    var18.setTargetURL("hi_33_");
    nu.staldal.lagoon.LagoonAntTask var25 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var28 = new nu.staldal.ftp.FTPException("hi!");
    var25.log("", (java.lang.Throwable)var28, 10);
    org.apache.tools.ant.Project var31 = var25.getProject();
    nu.staldal.lagoon.util.TemplateException var33 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var34 = var33.getException();
    var25.log("", (java.lang.Throwable)var33, (-1));
    java.lang.Throwable[] var37 = var33.getSuppressed();
    var18.log((java.lang.Throwable)var33, 0);
    org.apache.tools.ant.RuntimeConfigurable var40 = var18.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test159");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", " ", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var3.getAttrValue("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test160");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var2 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    var2.bindToOwner((org.apache.tools.ant.Task)var3);
    var2.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    var7.setPassword("");
    var2.bindToOwner((org.apache.tools.ant.Task)var7);
    org.apache.tools.ant.Project var11 = var2.getProject();
    org.apache.tools.ant.Project var12 = var2.getProject();
    org.apache.tools.ant.RuntimeConfigurable var13 = var2.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var13);
    var0.maybeConfigure();
    var0.log("4444444444");
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var22 = new nu.staldal.ftp.FTPException("hi!");
    var19.log("", (java.lang.Throwable)var22, 10);
    org.apache.tools.ant.Project var25 = var19.getProject();
    nu.staldal.lagoon.util.TemplateException var27 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var28 = var27.getException();
    var19.log("", (java.lang.Throwable)var27, (-1));
    java.lang.Throwable[] var31 = var27.getSuppressed();
    java.lang.Throwable[] var32 = var27.getSuppressed();
    var0.log("                                                                                                    ", (java.lang.Throwable)var27, 10);
    org.apache.tools.ant.Project var35 = var0.getProject();
    java.lang.Object var36 = var0.clone();
    nu.staldal.lagoon.LagoonAntTask var37 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var38 = new nu.staldal.lagoon.LagoonAntTask();
    var37.bindToOwner((org.apache.tools.ant.Task)var38);
    var38.log("hi!");
    java.lang.String var42 = var38.getTaskName();
    var38.init();
    org.apache.tools.ant.Location var44 = var38.getLocation();
    var38.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var38.log("", (-1));
    nu.staldal.lagoon.util.TemplateException var52 = new nu.staldal.lagoon.util.TemplateException("hi_33_");
    var38.log("", (java.lang.Throwable)var52, (-1));
    java.lang.String var55 = var38.getTaskName();
    nu.staldal.lagoon.LagoonAntTask var56 = new nu.staldal.lagoon.LagoonAntTask();
    var56.maybeConfigure();
    nu.staldal.lagoon.LagoonAntTask var58 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var61 = new nu.staldal.ftp.FTPException("hi!");
    var58.log("", (java.lang.Throwable)var61, 10);
    org.apache.tools.ant.Location var64 = var58.getLocation();
    nu.staldal.lagoon.core.LagoonException var67 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var58.log("4444444444", (java.lang.Throwable)var67, 100);
    org.apache.tools.ant.RuntimeConfigurable var70 = var58.getRuntimeConfigurableWrapper();
    var56.setRuntimeConfigurableWrapper(var70);
    var38.setRuntimeConfigurableWrapper(var70);
    var0.setRuntimeConfigurableWrapper(var70);
    var0.log("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", 1);
    var0.setTargetURL("nu__46__staldal__46__lagoon__46__util__46__TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test161");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    java.lang.Object var12 = var0.clone();
    var0.log("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    var0.setPassword("nu.staldal.lagoon.core.LagoonException~ hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test162");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.lagoon.core.OutputHandler var10 = var0.createFile("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    long var12 = var0.fileLastModified("#");
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test163");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu__46__staldal__46__ftp__46__FTPException__126____32__hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu____46____staldal____46____ftp____46____FTPException____126________32____hi____33____"+ "'", var1.equals("nu____46____staldal____46____ftp____46____FTPException____126________32____hi____33____"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test164");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var2 = new nu.staldal.lagoon.LagoonAntTask();
    var1.bindToOwner((org.apache.tools.ant.Task)var2);
    nu.staldal.lagoon.LagoonAntTask var4 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var7 = new nu.staldal.ftp.FTPException("hi!");
    var4.log("", (java.lang.Throwable)var7, 10);
    org.apache.tools.ant.Location var10 = var4.getLocation();
    var1.setLocation(var10);
    var0.setLocation(var10);
    var0.init();
    org.apache.tools.ant.Location var14 = var0.getLocation();
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var18 = new nu.staldal.ftp.FTPException("hi!");
    var15.log("", (java.lang.Throwable)var18, 10);
    org.apache.tools.ant.Project var21 = var15.getProject();
    nu.staldal.lagoon.util.TemplateException var23 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var24 = var23.getException();
    var15.log("", (java.lang.Throwable)var23, (-1));
    var15.setPassword("nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var29 = var15.getTaskType();
    nu.staldal.lagoon.LagoonAntTask var30 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var33 = new nu.staldal.ftp.FTPException("hi!");
    var30.log("", (java.lang.Throwable)var33, 10);
    org.apache.tools.ant.Location var36 = var30.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var37 = var30.getRuntimeConfigurableWrapper();
    var30.setTargetURL("4444444444");
    java.lang.String var40 = var30.getTaskName();
    java.lang.String var41 = var30.getDescription();
    var30.reconfigure();
    var30.setDescription("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    nu.staldal.ftp.FTPException var47 = new nu.staldal.ftp.FTPException("nu.staldal.ftp.FTPException: hi!");
    var30.log("4444444444", (java.lang.Throwable)var47, 1);
    nu.staldal.lagoon.LagoonAntTask var50 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var53 = new nu.staldal.ftp.FTPException("hi!");
    var50.log("", (java.lang.Throwable)var53, 10);
    java.lang.String var56 = var50.getDescription();
    nu.staldal.lagoon.LagoonAntTask var57 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var60 = new nu.staldal.ftp.FTPException("hi!");
    var57.log("", (java.lang.Throwable)var60, 10);
    org.apache.tools.ant.Location var63 = var57.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var64 = var57.getRuntimeConfigurableWrapper();
    var57.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var67 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var70 = new nu.staldal.ftp.FTPException("hi!");
    var67.log("", (java.lang.Throwable)var70, 10);
    org.apache.tools.ant.Project var73 = var67.getProject();
    nu.staldal.lagoon.util.TemplateException var75 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var76 = var75.getException();
    var67.log("", (java.lang.Throwable)var75, (-1));
    var57.bindToOwner((org.apache.tools.ant.Task)var67);
    org.apache.tools.ant.Location var80 = var67.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var81 = var67.getRuntimeConfigurableWrapper();
    var50.setRuntimeConfigurableWrapper(var81);
    var30.setRuntimeConfigurableWrapper(var81);
    var15.setRuntimeConfigurableWrapper(var81);
    var0.setRuntimeConfigurableWrapper(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test165");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    boolean var16 = var2.getPreserveSpace();
    var2.setPublicId("4444444444");
    java.lang.String var19 = var2.getLocalName();
    java.net.URL var20 = var2.getBaseURI();
    java.lang.String var21 = var2.getNamespaceURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test166");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", (-1));
    int var6 = var3.lookupAttribute("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    java.lang.String var8 = var3.getAttributeLocalName((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test167");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu.staldal.lagoon.util.TemplateException~ hi!", 0);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test168");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    int var7 = var0.getPosition();
    nu.staldal.lagoon.producer.BasicSplit var8 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var10 = new nu.staldal.xtree.Text("hi!");
    char[] var11 = var10.asCharArray();
    var8.characters(var11, 1, 10);
    var8.endElement("", "hi!", "hi!");
    var8.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var21 = new nu.staldal.lagoon.producer.IslandSplit();
    var21.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var24 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var21, true);
    char[] var27 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text(var27, 1, 0, false);
    var24.setDocumentLocator((org.xml.sax.Locator)var31);
    char[] var33 = var31.asCharArray();
    var8.characters(var33, 10, 0);
    var8.processingInstruction("hi!", "hi!");
    var8.endElement("hi_33_", "", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "hi!");
    var46.setSystemId("");
    java.net.URL var49 = var46.getBaseURI();
    java.lang.String var52 = var46.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var55 = new nu.staldal.xtree.Element("hi!", "hi!");
    var55.addNamespaceMapping("", "");
    var46.addChild((nu.staldal.xtree.Node)var55);
    var55.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var55.setLine(1);
    var55.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "                                                                                                    ");
    java.lang.String var70 = var55.getLocalName();
    var8.setDocumentLocator((org.xml.sax.Locator)var55);
    var0.setDocumentLocator((org.xml.sax.Locator)var55);
    boolean var73 = var55.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi!"+ "'", var70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test169");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    var2.setColumn(100);
    boolean var12 = var2.getPreserveSpace();
    boolean var13 = var2.getPreserveSpace();
    java.lang.String var14 = var2.getLocalName();
    var2.setColumn((-1));
    boolean var17 = var2.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var19 = var2.getAttributeNamespaceURI(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test170");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    nu.staldal.xtree.TreeBuilder var4 = new nu.staldal.xtree.TreeBuilder();
    var4.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var9 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4, false, false);
    var4.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var14 = new nu.staldal.xtree.Element("hi!", "hi!");
    var14.setLine(100);
    int var17 = var14.numberOfNamespaceMappings();
    var4.setDocumentLocator((org.xml.sax.Locator)var14);
    var4.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var3.toSAX((org.xml.sax.ContentHandler)var4);
    var4.startPrefixMapping("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var4.endPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var4.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ ");
    var4.startDocument();
    var4.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ");
    nu.staldal.xtree.Element var34 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var35 = var34.getLineNumber();
    var34.setSystemId("hi!");
    nu.staldal.lagoon.producer.BasicSplit var38 = new nu.staldal.lagoon.producer.BasicSplit();
    var34.toSAX((org.xml.sax.ContentHandler)var38);
    nu.staldal.xtree.Element var44 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var47 = var44.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var48 = new nu.staldal.xtree.TreeBuilder();
    var44.toSAX((org.xml.sax.ContentHandler)var48);
    var48.skippedEntity("hi!");
    var48.skippedEntity("hi!");
    nu.staldal.xtree.Element var56 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var48.setDocumentLocator((org.xml.sax.Locator)var56);
    var48.startDocument();
    nu.staldal.xtree.Element var59 = var48.getTree();
    var48.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~ ");
    var48.skippedEntity("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    char[] var67 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var71 = new nu.staldal.xtree.Text(var67, 1, 0, false);
    char[] var72 = var71.asCharArray();
    char[] var73 = var71.asCharArray();
    var48.ignorableWhitespace(var73, 1, (-1));
    var38.ignorableWhitespace(var73, 100, 1);
    var4.ignorableWhitespace(var73, 1, 10);
    nu.staldal.xtree.Element var83 = var4.getTree();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test171");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.init();
    var0.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test172");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test173");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    java.lang.String var10 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var11 = var2.getBaseURI();
    int var12 = var2.numberOfChildren();
    java.lang.String var13 = var2.getTextContentOrNull();
    int var16 = var2.lookupAttribute("hi!", "nu.staldal.lagoon.core.AuthenticationMissingException");
    java.net.URL var17 = var2.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var18 = var2.getFirstChildElement();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test174");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    java.lang.String var6 = var0.getEntryName();
    nu.staldal.lagoon.core.LagoonContext var7 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test175");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu.staldal.ftp.FTPException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test176");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var8 = new nu.staldal.ftp.FTPException("hi!");
    var5.log("", (java.lang.Throwable)var8, 10);
    org.apache.tools.ant.Location var11 = var5.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var12 = var5.getRuntimeConfigurableWrapper();
    var5.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var18 = new nu.staldal.ftp.FTPException("hi!");
    var15.log("", (java.lang.Throwable)var18, 10);
    org.apache.tools.ant.Project var21 = var15.getProject();
    nu.staldal.lagoon.util.TemplateException var23 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var24 = var23.getException();
    var15.log("", (java.lang.Throwable)var23, (-1));
    var5.bindToOwner((org.apache.tools.ant.Task)var15);
    org.apache.tools.ant.Project var28 = var5.getProject();
    var5.setTaskName("nu.staldal.lagoon.core.LagoonException: ");
    var1.bindToOwner((org.apache.tools.ant.Task)var5);
    var1.maybeConfigure();
    var1.init();
    var1.setForce(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test177");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.init();
    var0.setForce(false);
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var12 = new nu.staldal.ftp.FTPException("hi!");
    var9.log("", (java.lang.Throwable)var12, 10);
    org.apache.tools.ant.Location var15 = var9.getLocation();
    nu.staldal.lagoon.core.AuthenticationMissingException var16 = new nu.staldal.lagoon.core.AuthenticationMissingException();
    var9.log((java.lang.Throwable)var16, 10);
    var9.setDescription("4444444444");
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    var21.bindToOwner((org.apache.tools.ant.Task)var22);
    nu.staldal.lagoon.LagoonAntTask var24 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var27 = new nu.staldal.ftp.FTPException("hi!");
    var24.log("", (java.lang.Throwable)var27, 10);
    org.apache.tools.ant.Location var30 = var24.getLocation();
    var21.setLocation(var30);
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var35 = new nu.staldal.ftp.FTPException("hi!");
    var32.log("", (java.lang.Throwable)var35, 10);
    org.apache.tools.ant.Location var38 = var32.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var39 = var32.getRuntimeConfigurableWrapper();
    var21.setRuntimeConfigurableWrapper(var39);
    var9.bindToOwner((org.apache.tools.ant.Task)var21);
    nu.staldal.lagoon.LagoonAntTask var42 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var43 = new nu.staldal.lagoon.LagoonAntTask();
    var42.bindToOwner((org.apache.tools.ant.Task)var43);
    var43.log("hi!");
    java.lang.String var47 = var43.getTaskName();
    var9.bindToOwner((org.apache.tools.ant.Task)var43);
    nu.staldal.lagoon.LagoonAntTask var49 = new nu.staldal.lagoon.LagoonAntTask();
    var49.setPassword("");
    var49.setForce(false);
    org.apache.tools.ant.Target var54 = var49.getOwningTarget();
    var49.maybeConfigure();
    var49.log("nu.staldal.lagoon.core.LagoonException: 4444444444");
    org.apache.tools.ant.Location var58 = var49.getLocation();
    var43.setLocation(var58);
    var0.setLocation(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test178");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.beforeBuild();
    var0.afterBuild();
    int var6 = var0.getPosition();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test179");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    boolean var16 = var2.getPreserveSpace();
    var2.setPublicId("4444444444");
    nu.staldal.xtree.Element var19 = var2.getFirstChildElement();
    java.lang.String var22 = var2.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException~ ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    boolean var23 = var2.getPreserveSpace();
    boolean var24 = var2.getPreserveSpace();
    java.lang.String var26 = var2.lookupNamespaceURI("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    var2.setPublicId("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test180");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.lagoon.util.TemplateException var2 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test181");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.util.TemplateException: hi_33_", 2, "nu__46__staldal__46__lagoon__46__util__46__TemplateException", "aa", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test182");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.Object var8 = var0.clone();
    var0.init();
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    var10.setPassword("");
    var10.setForce(false);
    org.apache.tools.ant.Target var15 = var10.getOwningTarget();
    var10.maybeConfigure();
    var10.log("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.bindToOwner((org.apache.tools.ant.Task)var10);
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var23 = new nu.staldal.ftp.FTPException("hi!");
    var20.log("", (java.lang.Throwable)var23, 10);
    org.apache.tools.ant.Location var26 = var20.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var27 = var20.getRuntimeConfigurableWrapper();
    var20.setForce(false);
    org.apache.tools.ant.Location var30 = var20.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var31 = var20.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Location var32 = var20.getLocation();
    var0.bindToOwner((org.apache.tools.ant.Task)var20);
    var20.setPassword("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    org.apache.tools.ant.Target var36 = var20.getOwningTarget();
    org.apache.tools.ant.Location var37 = var20.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test183");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var6 = new nu.staldal.ftp.FTPException("hi!");
    var3.log("", (java.lang.Throwable)var6, 10);
    org.apache.tools.ant.Location var9 = var3.getLocation();
    var0.setLocation(var9);
    var0.setTaskName("nu.staldal.lagoon.core.LagoonException: ");
    var0.setPassword("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    org.apache.tools.ant.Project var15 = var0.getProject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test184");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    org.apache.tools.ant.Project var7 = var0.getProject();
    nu.staldal.lagoon.LagoonAntTask var8 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    var8.bindToOwner((org.apache.tools.ant.Task)var9);
    var9.log("hi!");
    java.lang.String var13 = var9.getTaskName();
    var9.init();
    org.apache.tools.ant.Location var15 = var9.getLocation();
    var0.setLocation(var15);
    var0.log("hi_33_", 2);
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    var20.bindToOwner((org.apache.tools.ant.Task)var21);
    var21.log("hi!");
    java.lang.String var25 = var21.getTaskName();
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    var26.bindToOwner((org.apache.tools.ant.Task)var27);
    var27.log("hi!");
    java.lang.String var31 = var27.getTaskName();
    var27.init();
    org.apache.tools.ant.Location var33 = var27.getLocation();
    var27.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var27.log("", (-1));
    var21.bindToOwner((org.apache.tools.ant.Task)var27);
    nu.staldal.lagoon.LagoonAntTask var40 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var43 = new nu.staldal.ftp.FTPException("hi!");
    var40.log("", (java.lang.Throwable)var43, 10);
    var40.init();
    org.apache.tools.ant.Project var47 = var40.getProject();
    nu.staldal.lagoon.LagoonAntTask var48 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var49 = var48.getDescription();
    nu.staldal.lagoon.LagoonAntTask var50 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var51 = new nu.staldal.lagoon.LagoonAntTask();
    var50.bindToOwner((org.apache.tools.ant.Task)var51);
    var50.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var55 = new nu.staldal.lagoon.LagoonAntTask();
    var55.setPassword("");
    var50.bindToOwner((org.apache.tools.ant.Task)var55);
    org.apache.tools.ant.Project var59 = var50.getProject();
    org.apache.tools.ant.Project var60 = var50.getProject();
    org.apache.tools.ant.RuntimeConfigurable var61 = var50.getRuntimeConfigurableWrapper();
    var48.setRuntimeConfigurableWrapper(var61);
    var40.setRuntimeConfigurableWrapper(var61);
    var21.setRuntimeConfigurableWrapper(var61);
    var0.setRuntimeConfigurableWrapper(var61);
    var0.init();
    var0.log("nu.staldal.lagoon.core.LagoonException~~ hi____33____", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test185");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var6 = new nu.staldal.ftp.FTPException("hi!");
    var3.log("", (java.lang.Throwable)var6, 10);
    org.apache.tools.ant.Location var9 = var3.getLocation();
    var0.setLocation(var9);
    var0.setDescription("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    org.apache.tools.ant.Target var13 = var0.getOwningTarget();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test186");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    var22.startDocument();
    var22.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.producer.IslandSplit var36 = new nu.staldal.lagoon.producer.IslandSplit();
    var36.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var39 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var36, true);
    char[] var42 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var46 = new nu.staldal.xtree.Text(var42, 1, 0, false);
    var39.setDocumentLocator((org.xml.sax.Locator)var46);
    java.lang.String var49 = var46.lookupNamespacePrefix("                                                                                                    ");
    var22.setDocumentLocator((org.xml.sax.Locator)var46);
    var22.startDocument();
    var22.skippedEntity("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test187");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    java.lang.String var16 = var2.getNamespaceURI();
    var2.setSystemId("nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var21 = var2.getAttrValueOrNull("hi_33_", "nu.staldal.lagoon.util.TemplateException: ");
    int var24 = var2.lookupAttribute("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var26 = var2.getNamespaceMapping(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test188");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var23 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, false);
    var0.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.AuthenticationMissingException");
    var0.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test189");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    var22.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.producer.BasicSplit var26 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var28 = new nu.staldal.xtree.Text("hi!");
    char[] var29 = var28.asCharArray();
    var26.characters(var29, 1, 10);
    var26.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var26.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    char[] var41 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var45 = new nu.staldal.xtree.Text(var41, 1, 0, false);
    char[] var46 = var45.asCharArray();
    var26.ignorableWhitespace(var46, 0, 10);
    var22.characters(var46, 0, 100);
    var22.startDocument();
    nu.staldal.xtree.Element var56 = new nu.staldal.xtree.Element("hi!", "hi!");
    var56.setSystemId("");
    java.net.URL var59 = var56.getBaseURI();
    java.lang.String var62 = var56.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var65 = new nu.staldal.xtree.Element("hi!", "hi!");
    var65.addNamespaceMapping("", "");
    var56.addChild((nu.staldal.xtree.Node)var65);
    var22.setDocumentLocator((org.xml.sax.Locator)var56);
    java.lang.String var71 = var56.getNamespaceURI();
    java.lang.String var72 = var56.getSystemId();
    java.lang.String var73 = var56.getLocalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "hi!"+ "'", var71.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + ""+ "'", var72.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "hi!"+ "'", var73.equals("hi!"));

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test190");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    nu.staldal.xtree.Text var34 = new nu.staldal.xtree.Text("");
    char[] var35 = var34.asCharArray();
    char[] var36 = var34.asCharArray();
    var22.characters(var36, 100, 100);
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var43 = var42.getLineNumber();
    var42.setPublicId("");
    int var46 = var42.getLineNumber();
    java.lang.String var48 = var42.lookupNamespacePrefix("hi_33_");
    var22.setDocumentLocator((org.xml.sax.Locator)var42);
    nu.staldal.lagoon.producer.BasicSplit var50 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var52 = new nu.staldal.xtree.Text("hi!");
    char[] var53 = var52.asCharArray();
    var50.characters(var53, 1, 10);
    var50.endElement("", "hi!", "hi!");
    var50.processingInstruction("", "hi!");
    var50.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    char[] var69 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var73 = new nu.staldal.xtree.Text(var69, 1, 0, false);
    var50.characters(var69, 1, (-1));
    var22.ignorableWhitespace(var69, 1, 0);
    var22.endPrefixMapping("nu.staldal.ftp.FTPException~~~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test191");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("hi!", "hi!");
    var10.setLine(100);
    int var13 = var10.numberOfNamespaceMappings();
    var0.setDocumentLocator((org.xml.sax.Locator)var10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.startDocument();
    nu.staldal.xtree.Element var22 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var25 = var22.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var26 = new nu.staldal.xtree.TreeBuilder();
    var22.toSAX((org.xml.sax.ContentHandler)var26);
    var26.skippedEntity("hi!");
    var26.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var32 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var26);
    var32.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.TreeBuilder var35 = new nu.staldal.xtree.TreeBuilder();
    var35.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var40 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var35, false, false);
    nu.staldal.xtree.Text var42 = new nu.staldal.xtree.Text("");
    char[] var43 = var42.asCharArray();
    boolean var44 = var42.isWhitespaceNode();
    char[] var45 = var42.asCharArray();
    var35.ignorableWhitespace(var45, 0, 10);
    var32.ignorableWhitespace(var45, (-1), 0);
    var0.ignorableWhitespace(var45, 2, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test192");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", (-1), 1);
    nu.staldal.xtree.Element var7 = new nu.staldal.xtree.Element("hi!", "hi!");
    var7.setSystemId("");
    java.net.URL var10 = var7.getBaseURI();
    java.lang.String var13 = var7.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi!", "hi!");
    var16.addNamespaceMapping("", "");
    var7.addChild((nu.staldal.xtree.Node)var16);
    var7.setSystemId("");
    java.lang.String var23 = var7.getPublicId();
    int var24 = var7.getLineNumber();
    java.lang.String var25 = var7.getPublicId();
    int var26 = var7.getColumnNumber();
    nu.staldal.xtree.NodeWithChildren var27 = var7.getParent();
    int var28 = var7.numberOfAttributes();
    int var29 = var7.getColumnNumber();
    var4.addChild((nu.staldal.xtree.Node)var7);
    nu.staldal.lagoon.producer.BasicSplit var31 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var33 = new nu.staldal.xtree.Text("hi!");
    char[] var34 = var33.asCharArray();
    var31.characters(var34, 1, 10);
    var31.endElement("", "hi!", "hi!");
    var31.processingInstruction("", "hi!");
    var31.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var31.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var49 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var31);
    var49.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var53 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var49);
    var53.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.producer.BasicSplit var57 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var59 = new nu.staldal.xtree.Text("hi!");
    char[] var60 = var59.asCharArray();
    var57.characters(var60, 1, 10);
    var57.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var57.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    char[] var72 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var76 = new nu.staldal.xtree.Text(var72, 1, 0, false);
    char[] var77 = var76.asCharArray();
    var57.ignorableWhitespace(var77, 0, 10);
    var53.characters(var77, 0, 100);
    var53.startDocument();
    var53.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ");
    var53.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.outputEndElement((org.xml.sax.ContentHandler)var53);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test193");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.lagoon.core.OutputHandler var10 = var0.createFile("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.deleteFile("_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test194");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    var22.startDocument();
    char[] var34 = new char[] { };
    var22.characters(var34, 100, (-1));
    var22.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: ", "                                                                                                    ");
    nu.staldal.xtree.Element var43 = new nu.staldal.xtree.Element("hi!", "hi!");
    var43.setSystemId("");
    java.net.URL var46 = var43.getBaseURI();
    java.lang.String var49 = var43.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!");
    var52.addNamespaceMapping("", "");
    var43.addChild((nu.staldal.xtree.Node)var52);
    java.lang.String var58 = var52.getAttrValueOrNull("4444444444");
    int var59 = var52.numberOfChildren();
    var22.setDocumentLocator((org.xml.sax.Locator)var52);
    java.net.URL var61 = var52.getBaseURI();
    boolean var62 = var52.getPreserveSpace();
    int var63 = var52.numberOfAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test195");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var6 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var9 = var0.isReentrant();
    long var11 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    long var13 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    boolean var14 = var0.isReentrant();
    var0.deleteFile("__52__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1433461983000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1433461996000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test196");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test197");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var2 = new nu.staldal.lagoon.LagoonAntTask();
    var1.bindToOwner((org.apache.tools.ant.Task)var2);
    nu.staldal.lagoon.LagoonAntTask var4 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var7 = new nu.staldal.ftp.FTPException("hi!");
    var4.log("", (java.lang.Throwable)var7, 10);
    org.apache.tools.ant.Location var10 = var4.getLocation();
    var1.setLocation(var10);
    var0.setLocation(var10);
    var0.setTaskType("hi!");
    var0.log("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test198");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.AuthenticationException");
    java.lang.String var3 = var2.getValue();
    int var4 = var2.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.AuthenticationException"+ "'", var3.equals("nu.staldal.lagoon.core.AuthenticationException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test199");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.endPrefixMapping("hi_33_");
    var0.skippedEntity("hi_33_");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.setDocumentLocator((org.xml.sax.Locator)var12);
    var0.startPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("          ");
    nu.staldal.xmlutil.ContentHandlerFixer var19 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    nu.staldal.lagoon.producer.BasicSplit var20 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var22 = new nu.staldal.xtree.Text("hi!");
    char[] var23 = var22.asCharArray();
    var20.characters(var23, 1, 10);
    var20.endElement("", "hi!", "hi!");
    var20.processingInstruction("", "hi!");
    var20.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var20.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var38 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var20);
    var38.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.producer.BasicSplit var42 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var44 = new nu.staldal.xtree.Text("hi!");
    char[] var45 = var44.asCharArray();
    var42.characters(var45, 1, 10);
    var42.endElement("", "hi!", "hi!");
    var42.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var56 = new nu.staldal.xtree.Text("");
    char[] var57 = var56.asCharArray();
    char[] var58 = var56.asCharArray();
    char[] var59 = var56.asCharArray();
    var42.characters(var59, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var63 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var42);
    nu.staldal.xmlutil.DocumentHandlerAdapter var64 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var63);
    nu.staldal.xtree.Element var67 = new nu.staldal.xtree.Element("hi!", "hi!");
    var67.setSystemId("");
    java.net.URL var70 = var67.getBaseURI();
    java.lang.String var73 = var67.getAttrValueOrNull("", "");
    var64.setDocumentLocator((org.xml.sax.Locator)var67);
    var64.startDocument();
    char[] var76 = new char[] { };
    var64.characters(var76, 100, (-1));
    var38.ignorableWhitespace(var76, 100, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.characters(var76, (-1), 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test200");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("4444444444");
    nu.staldal.lagoon.producer.BasicSplit var2 = new nu.staldal.lagoon.producer.BasicSplit();
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    var2.processingInstruction("nu.staldal.ftp.FTPException~~ hi!", "####################################################################################################");
    nu.staldal.lagoon.producer.BasicSplit var7 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var9 = new nu.staldal.xtree.Text("hi!");
    char[] var10 = var9.asCharArray();
    var7.characters(var10, 1, 10);
    var7.endElement("", "hi!", "hi!");
    var7.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text("");
    char[] var22 = var21.asCharArray();
    char[] var23 = var21.asCharArray();
    char[] var24 = var21.asCharArray();
    var7.characters(var24, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var28 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var7);
    nu.staldal.xmlutil.DocumentHandlerAdapter var29 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var28);
    var29.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException: ");
    var29.processingInstruction("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var37 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var29, true);
    nu.staldal.xtree.Text var39 = new nu.staldal.xtree.Text("");
    nu.staldal.xtree.TreeBuilder var40 = new nu.staldal.xtree.TreeBuilder();
    var40.endPrefixMapping("hi!");
    var39.toSAX((org.xml.sax.ContentHandler)var40);
    var40.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var40.endPrefixMapping("");
    var40.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "4");
    var40.startDocument();
    nu.staldal.xtree.Text var53 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var53.setLine(1);
    char[] var56 = var53.asCharArray();
    var40.characters(var56, 2, 1);
    var29.characters(var56, (-1), 10);
    var2.ignorableWhitespace(var56, 2, 1);
    var2.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    java.util.Enumeration var68 = var2.getParamNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test201");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var8.setDocumentLocator((org.xml.sax.Locator)var16);
    var8.endDocument();
    nu.staldal.xtree.Element var19 = var8.getTree();
    nu.staldal.lagoon.producer.BasicSplit var20 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var22 = new nu.staldal.xtree.Text("hi!");
    char[] var23 = var22.asCharArray();
    var20.characters(var23, 1, 10);
    var20.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var20.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    nu.staldal.xmlutil.ContentHandlerAdapter var33 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var20);
    var20.skippedEntity("");
    nu.staldal.xmlutil.ContentHandlerFixer var38 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var20, true, true);
    var38.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    nu.staldal.lagoon.producer.BasicSplit var41 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var43 = new nu.staldal.xtree.Text("hi!");
    char[] var44 = var43.asCharArray();
    var41.characters(var44, 1, 10);
    var41.endElement("", "hi!", "hi!");
    var41.processingInstruction("", "hi!");
    var41.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var41.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var59 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var41);
    var59.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.Text var64 = new nu.staldal.xtree.Text("");
    char[] var65 = var64.asCharArray();
    boolean var66 = var64.isWhitespaceNode();
    char[] var67 = var64.asCharArray();
    var59.setDocumentLocator((org.xml.sax.Locator)var64);
    int var69 = var64.getColumnNumber();
    var64.setSystemId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    char[] var72 = var64.asCharArray();
    char[] var73 = var64.asCharArray();
    var38.ignorableWhitespace(var73, 100, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.characters(var73, 0, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test202");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.hasBeenUpdated(1433461943000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test203");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.util.TemplateException: hi_33_", "nu.staldal.lagoon.util.TemplateException");

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test204");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var2 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var0.afterBuild();
    var0.init();
    var0.endPrefixMapping("a");
    nu.staldal.lagoon.core.LagoonContext var7 = var0.getContext();
    var0.endPrefixMapping("__35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test205");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("__35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35__");

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test206");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    boolean var16 = var2.getPreserveSpace();
    var2.setPublicId("4444444444");
    nu.staldal.xtree.Element var19 = var2.getFirstChildElement();
    var19.addAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test207");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    org.apache.tools.ant.Target var6 = var1.getOwningTarget();
    var1.log("hi!", 1);
    var1.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var14 = new nu.staldal.lagoon.LagoonAntTask();
    var13.bindToOwner((org.apache.tools.ant.Task)var14);
    var13.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    var18.setPassword("");
    var13.bindToOwner((org.apache.tools.ant.Task)var18);
    org.apache.tools.ant.Project var22 = var13.getProject();
    org.apache.tools.ant.Project var23 = var13.getProject();
    org.apache.tools.ant.Location var24 = var13.getLocation();
    nu.staldal.lagoon.LagoonAntTask var25 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    var25.bindToOwner((org.apache.tools.ant.Task)var26);
    var26.log("hi!");
    java.lang.String var30 = var26.getTaskName();
    var26.init();
    org.apache.tools.ant.Location var32 = var26.getLocation();
    var13.setLocation(var32);
    var13.setTaskType("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var39 = new nu.staldal.ftp.FTPException("hi!");
    var36.log("", (java.lang.Throwable)var39, 10);
    org.apache.tools.ant.Location var42 = var36.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var43 = var36.getRuntimeConfigurableWrapper();
    var36.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var46 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var49 = new nu.staldal.ftp.FTPException("hi!");
    var46.log("", (java.lang.Throwable)var49, 10);
    org.apache.tools.ant.Project var52 = var46.getProject();
    nu.staldal.lagoon.util.TemplateException var54 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var55 = var54.getException();
    var46.log("", (java.lang.Throwable)var54, (-1));
    var36.bindToOwner((org.apache.tools.ant.Task)var46);
    org.apache.tools.ant.Location var59 = var46.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var60 = var46.getRuntimeConfigurableWrapper();
    var46.setForce(true);
    java.lang.String var63 = var46.getTaskName();
    var13.bindToOwner((org.apache.tools.ant.Task)var46);
    nu.staldal.lagoon.core.LagoonException var66 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var46.log((java.lang.Throwable)var66, 10);
    var1.log("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", (java.lang.Throwable)var66, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test208");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu__46__staldal__46__lagoon__46__util__46__TemplateException__126____32__"+ "'", var1.equals("nu__46__staldal__46__lagoon__46__util__46__TemplateException__126____32__"));

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test209");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var2.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test210");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    java.lang.String var2 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ "+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ "));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test211");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var21 = var20.getLineNumber();
    var20.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var28 = var27.getLineNumber();
    var27.addNamespaceMapping("", "");
    var20.addChild((nu.staldal.xtree.Node)var27);
    var2.insertChild((nu.staldal.xtree.Node)var20, 0);
    java.lang.String var36 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var39 = var2.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var40 = var2.getNamespaceURI();
    java.lang.String var42 = var2.getAttributeType((-1));
    java.lang.String var44 = var2.getAttrValueOrNull("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test212");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    var22.startDocument();
    var22.endPrefixMapping("nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.lagoon.producer.BasicSplit var36 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var38 = new nu.staldal.xtree.Text("hi!");
    char[] var39 = var38.asCharArray();
    var36.characters(var39, 1, 10);
    var36.endElement("", "hi!", "hi!");
    var36.processingInstruction("", "hi!");
    nu.staldal.xtree.Text var51 = new nu.staldal.xtree.Text("");
    char[] var52 = var51.asCharArray();
    char[] var53 = var51.asCharArray();
    var36.ignorableWhitespace(var53, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var59 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var36, true, true);
    nu.staldal.xtree.Element var62 = new nu.staldal.xtree.Element("hi!", "hi!");
    var62.setSystemId("");
    java.net.URL var65 = var62.getBaseURI();
    java.lang.String var68 = var62.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var71 = new nu.staldal.xtree.Element("hi!", "hi!");
    var71.addNamespaceMapping("", "");
    var62.addChild((nu.staldal.xtree.Node)var71);
    var62.setSystemId("");
    var62.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var85 = var62.getAttrValueOrNull("4444444444", "4444444444");
    java.lang.String var86 = var62.getSystemId();
    int var87 = var62.getLineNumber();
    var62.addNamespaceMapping("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var93 = var62.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: ", "4");
    var36.setDocumentLocator((org.xml.sax.Locator)var62);
    var22.setDocumentLocator((org.xml.sax.Locator)var62);
    var22.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + ""+ "'", var86.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var93);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test213");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    var2.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var2.endPrefixMapping("");
    var2.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "4");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    nu.staldal.lagoon.producer.BasicSplit var17 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var19 = new nu.staldal.xtree.Text("hi!");
    char[] var20 = var19.asCharArray();
    var17.characters(var20, 1, 10);
    var17.endElement("", "hi!", "hi!");
    var17.processingInstruction("", "hi!");
    var17.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var17.startDocument();
    var17.skippedEntity("4444444444");
    var17.skippedEntity("hi!");
    var14.toSAX((org.xml.sax.ContentHandler)var17);
    char[] var40 = var14.asCharArray();
    char[] var41 = var14.asCharArray();
    var2.ignorableWhitespace(var41, 10, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.processingInstruction("##########", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test214");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.setTaskType("hi!");
    var1.setDescription("hi!");
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    var10.setPassword("");
    var10.setForce(false);
    org.apache.tools.ant.Target var15 = var10.getOwningTarget();
    var10.maybeConfigure();
    org.apache.tools.ant.RuntimeConfigurable var17 = var10.getRuntimeConfigurableWrapper();
    var1.setRuntimeConfigurableWrapper(var17);
    var1.setTaskName("aa");
    nu.staldal.lagoon.util.TemplateException var22 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var23 = var22.getException();
    nu.staldal.lagoon.util.TemplateException var24 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var22);
    var1.log("nu.staldal.lagoon.core.LagoonException: ", (java.lang.Throwable)var22, 0);
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    var27.bindToOwner((org.apache.tools.ant.Task)var28);
    var27.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    var32.setPassword("");
    var27.bindToOwner((org.apache.tools.ant.Task)var32);
    var32.setDescription("hi_33_");
    org.apache.tools.ant.Location var38 = var32.getLocation();
    var1.setLocation(var38);
    var1.reconfigure();
    org.apache.tools.ant.Project var41 = var1.getProject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test215");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    nu.staldal.lagoon.util.TemplateException var11 = new nu.staldal.lagoon.util.TemplateException("4444444444");
    var0.log((java.lang.Throwable)var11, 1);
    nu.staldal.lagoon.util.TemplateException var15 = new nu.staldal.lagoon.util.TemplateException("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    var11.addSuppressed((java.lang.Throwable)var15);
    java.lang.Exception var17 = var15.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test216");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var8.setDocumentLocator((org.xml.sax.Locator)var16);
    nu.staldal.xtree.Element var18 = var8.getTree();
    java.lang.String var19 = var18.getTextContent();
    nu.staldal.xtree.TreeBuilder var20 = new nu.staldal.xtree.TreeBuilder();
    var20.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var26 = var25.getLineNumber();
    var25.setPublicId("");
    int var29 = var25.getLineNumber();
    var20.setDocumentLocator((org.xml.sax.Locator)var25);
    var20.startDocument();
    var20.skippedEntity("                                                                                                    ");
    var20.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.xtree.Element var39 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var40 = var39.getLineNumber();
    var39.setPublicId("");
    int var43 = var39.getLineNumber();
    java.lang.String var45 = var39.lookupNamespacePrefix("hi_33_");
    java.lang.String var48 = var39.getAttrValueOrNull("", "4444444444");
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    var39.addChild((nu.staldal.xtree.Node)var52);
    var20.setDocumentLocator((org.xml.sax.Locator)var39);
    var18.outputStartElement((org.xml.sax.ContentHandler)var20);
    var20.startDocument();
    var20.endDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test217");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.util.Enumeration var17 = var0.getParamNames();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.startDocument();
    var18.processingInstruction("nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    var18.processingInstruction("4444444444", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    var18.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test218");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    var2.addNamespaceMapping("4444444444", "4444444444");
    boolean var21 = var2.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var24 = var2.getAttrValue("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "##");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test219");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    java.util.Enumeration var1 = var0.getParamNames();
    boolean var3 = var0.hasBeenUpdated(0L);
    var0.beforeBuild();
    java.lang.String var6 = var0.getParam("####################################################################################################");
    boolean var8 = var0.hasBeenUpdated(1433461944000L);
    java.lang.String var10 = var0.getParam("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    var0.beforeBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test220");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var3 = var1.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var4 = var1.isWhitespaceNode();
    var1.setColumn(1);
    nu.staldal.lagoon.producer.BasicSplit var7 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var9 = new nu.staldal.xtree.Text("hi!");
    char[] var10 = var9.asCharArray();
    var7.characters(var10, 1, 10);
    var7.endElement("", "hi!", "hi!");
    var7.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text("");
    char[] var22 = var21.asCharArray();
    char[] var23 = var21.asCharArray();
    char[] var24 = var21.asCharArray();
    var7.characters(var24, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var28 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var7);
    nu.staldal.xmlutil.DocumentHandlerAdapter var29 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var28);
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi!", "hi!");
    var32.setSystemId("");
    java.net.URL var35 = var32.getBaseURI();
    java.lang.String var38 = var32.getAttrValueOrNull("", "");
    var29.setDocumentLocator((org.xml.sax.Locator)var32);
    nu.staldal.xtree.Text var41 = new nu.staldal.xtree.Text("");
    char[] var42 = var41.asCharArray();
    char[] var43 = var41.asCharArray();
    var29.characters(var43, 100, 100);
    nu.staldal.xtree.Element var49 = new nu.staldal.xtree.Element("hi!", "hi!");
    var49.setLine(100);
    nu.staldal.xtree.Element var56 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var59 = var56.lookupAttribute("4444444444", "hi!");
    var56.addNamespaceMapping("", "4444444444");
    java.lang.String var63 = var56.getTextContent();
    var49.insertChild((nu.staldal.xtree.Node)var56, 0);
    var29.setDocumentLocator((org.xml.sax.Locator)var56);
    var29.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ");
    var1.toSAX((org.xml.sax.ContentHandler)var29);
    var29.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var29.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ ");
    var29.startDocument();
    var29.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + ""+ "'", var63.equals(""));

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test221");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    int var5 = var2.numberOfNamespaceMappings();
    boolean var6 = var2.getPreserveSpace();
    java.net.URL var7 = var2.getBaseURI();
    var2.setColumn(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test222");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    var19.setSystemId("");
    java.net.URL var22 = var19.getBaseURI();
    java.lang.String var25 = var19.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    var28.addNamespaceMapping("", "");
    var19.addChild((nu.staldal.xtree.Node)var28);
    java.lang.String var34 = var28.getAttrValueOrNull("");
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    var37.setSystemId("");
    java.net.URL var40 = var37.getBaseURI();
    java.lang.String var43 = var37.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "hi!");
    var46.addNamespaceMapping("", "");
    var37.addChild((nu.staldal.xtree.Node)var46);
    var37.setSystemId("");
    nu.staldal.xtree.Element var55 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var56 = var55.getLineNumber();
    var55.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var62 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var63 = var62.getLineNumber();
    var62.addNamespaceMapping("", "");
    var55.addChild((nu.staldal.xtree.Node)var62);
    var37.insertChild((nu.staldal.xtree.Node)var55, 0);
    var28.addChild((nu.staldal.xtree.Node)var37);
    var37.setLine((-1));
    int var73 = var37.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var37);
    nu.staldal.xtree.Element var78 = new nu.staldal.xtree.Element("", "hi!", 10);
    var78.setSystemId("hi!");
    java.lang.String var82 = var78.lookupNamespaceURI("4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var78);
    java.util.Enumeration var84 = var0.getParamNames();
    java.util.Enumeration var85 = var0.getParamNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test223");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4444444444", "", 0);
    java.lang.String var4 = var3.getTextContentOrNull();
    boolean var5 = var3.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var7 = var3.getChild(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test224");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    java.lang.String var6 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.afterBuild();
    var0.afterBuild();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test225");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var23 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, false);
    nu.staldal.xmlutil.ContentHandlerFixer var26 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.beforeBuild();
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test226");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.processingInstruction("", "nu.staldal.lagoon.util.TemplateException: ");
    var18.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var23 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    var23.processingInstruction("nu.staldal.lagoon.core.AuthenticationMissingException", "nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test227");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test228");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var21 = var20.getLineNumber();
    var20.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var28 = var27.getLineNumber();
    var27.addNamespaceMapping("", "");
    var20.addChild((nu.staldal.xtree.Node)var27);
    var2.insertChild((nu.staldal.xtree.Node)var20, 0);
    java.lang.String var36 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var39 = var2.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var40 = var2.getPreserveSpace();
    java.lang.String var41 = var2.getPublicId();
    java.lang.String var43 = var2.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_");
    boolean var44 = var2.getPreserveSpace();
    java.lang.String var47 = var2.getAttrValueOrNull("nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.ftp.FTPException~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test229");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var2 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var2.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Element var7 = new nu.staldal.xtree.Element("hi!", "hi!");
    var7.setSystemId("");
    java.net.URL var10 = var7.getBaseURI();
    java.lang.String var13 = var7.getAttrValueOrNull("", "");
    java.lang.String var14 = var7.getTextContent();
    var7.setColumn((-1));
    java.net.URL var17 = var7.getBaseURI();
    int var18 = var7.numberOfNamespaceMappings();
    var2.setDocumentLocator((org.xml.sax.Locator)var7);
    int var20 = var7.getLineNumber();
    int var23 = var7.lookupAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi!");
    nu.staldal.xtree.NodeWithChildren var24 = var7.getParent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var26 = var7.getAttributeType(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test230");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    var2.setColumn(10);
    java.lang.String var10 = var2.getInheritedAttribute("hi!", "");
    var2.addNamespaceMapping("aa", "                                                                                                    ");
    java.lang.String var15 = var2.lookupNamespaceURI("aaaaaaaaaa");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var17 = var2.getAttributeNamespaceURI(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test231");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    var19.setSystemId("");
    java.net.URL var22 = var19.getBaseURI();
    java.lang.String var25 = var19.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    var28.addNamespaceMapping("", "");
    var19.addChild((nu.staldal.xtree.Node)var28);
    java.lang.String var34 = var28.getAttrValueOrNull("");
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    var37.setSystemId("");
    java.net.URL var40 = var37.getBaseURI();
    java.lang.String var43 = var37.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "hi!");
    var46.addNamespaceMapping("", "");
    var37.addChild((nu.staldal.xtree.Node)var46);
    var37.setSystemId("");
    nu.staldal.xtree.Element var55 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var56 = var55.getLineNumber();
    var55.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var62 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var63 = var62.getLineNumber();
    var62.addNamespaceMapping("", "");
    var55.addChild((nu.staldal.xtree.Node)var62);
    var37.insertChild((nu.staldal.xtree.Node)var55, 0);
    var28.addChild((nu.staldal.xtree.Node)var37);
    var37.setLine((-1));
    int var73 = var37.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var37);
    nu.staldal.xtree.Element var75 = var37.getFirstChildElementOrNull();
    java.lang.String var76 = var75.getLocalName();
    java.lang.String var78 = var75.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~ ");
    java.lang.String var80 = var75.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    int var81 = var75.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "hi!"+ "'", var76.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == (-1));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test232");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    org.apache.tools.ant.Target var6 = var1.getOwningTarget();
    java.lang.String var7 = var1.getTaskType();
    var1.maybeConfigure();
    var1.setTaskName("nu.staldal.lagoon.core.LagoonException: aa");
    java.lang.Object var11 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test233");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var20 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    nu.staldal.xmlutil.DocumentHandlerAdapter var21 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.setSystemId("");
    java.net.URL var27 = var24.getBaseURI();
    java.lang.String var30 = var24.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var33 = new nu.staldal.xtree.Element("hi!", "hi!");
    var33.addNamespaceMapping("", "");
    var24.addChild((nu.staldal.xtree.Node)var33);
    var33.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var33.setLine(1);
    java.lang.String var46 = var33.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    var21.setDocumentLocator((org.xml.sax.Locator)var33);
    var21.startDocument();
    nu.staldal.xtree.Element var51 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var52 = var51.getLineNumber();
    java.lang.String var53 = var51.getSystemId();
    int var54 = var51.numberOfAttributes();
    nu.staldal.xtree.Element var58 = new nu.staldal.xtree.Element("", "hi!", 10);
    var58.setSystemId("hi!");
    java.lang.String var61 = var58.getSystemId();
    var51.addChild((nu.staldal.xtree.Node)var58);
    var21.setDocumentLocator((org.xml.sax.Locator)var58);
    java.lang.String var64 = var58.getNamespaceURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var66 = var58.getAttributeNamespaceURI(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + ""+ "'", var64.equals(""));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test234");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    boolean var10 = var2.getPreserveSpace();
    int var11 = var2.getLineNumber();
    nu.staldal.lagoon.producer.BasicSplit var12 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("hi!");
    char[] var15 = var14.asCharArray();
    var12.characters(var15, 1, 10);
    var12.endElement("", "hi!", "hi!");
    var12.processingInstruction("", "hi!");
    var12.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    char[] var31 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var35 = new nu.staldal.xtree.Text(var31, 1, 0, false);
    var12.characters(var31, 1, (-1));
    nu.staldal.xtree.Text var42 = new nu.staldal.xtree.Text(var31, 0, 0, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertChild((nu.staldal.xtree.Node)var42, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test235");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    var0.skippedEntity("4444444444");
    var0.skippedEntity("hi!");
    var0.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException: ");
    var0.processingInstruction("", "hi_33_");
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~ ", "4444444444");
    java.lang.String var31 = var30.getTextContentOrNull();
    var0.setDocumentLocator((org.xml.sax.Locator)var30);
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("hi!", "hi!");
    var35.setSystemId("");
    java.net.URL var38 = var35.getBaseURI();
    java.lang.String var41 = var35.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var44 = new nu.staldal.xtree.Element("hi!", "hi!");
    var44.addNamespaceMapping("", "");
    var35.addChild((nu.staldal.xtree.Node)var44);
    var35.setSystemId("");
    var35.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var58 = var35.getAttrValueOrNull("4444444444", "4444444444");
    var35.addAttribute("hi!", "hi!", "", "hi!");
    java.net.URL var64 = var35.getBaseURI();
    nu.staldal.xtree.Node var66 = var35.getChild(0);
    java.lang.String var68 = var35.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.setDocumentLocator((org.xml.sax.Locator)var35);
    java.lang.String var71 = var35.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~ hi__33__");
    nu.staldal.xtree.Element var72 = var35.getFirstChildElementOrNull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var75 = var35.getAttrValue("aa", "nu.staldal.lagoon.util.TemplateException");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test236");


    char[] var2 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text(var2, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var7 = new nu.staldal.xtree.TreeBuilder();
    var7.endPrefixMapping("hi!");
    var7.endDocument();
    var7.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var6.toSAX((org.xml.sax.ContentHandler)var7);
    var7.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var7.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var20 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var7);
    var7.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var7.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var24 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.processingInstruction("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.util.TemplateException: nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test237");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    java.lang.String var18 = var2.getPublicId();
    java.lang.String var21 = var2.getInheritedAttribute("aa", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var24 = var2.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var25 = var2.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test238");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8, true, true);
    var8.endDocument();
    var8.endDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var17 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8);
    nu.staldal.lagoon.producer.BasicSplit var18 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var20 = new nu.staldal.xtree.Text("hi!");
    char[] var21 = var20.asCharArray();
    var18.characters(var21, 1, 10);
    var18.endElement("", "hi!", "hi!");
    var18.processingInstruction("", "hi!");
    var18.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var18.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var36 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var18);
    var36.processingInstruction("", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Element var44 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var47 = var44.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var48 = new nu.staldal.xtree.TreeBuilder();
    var44.toSAX((org.xml.sax.ContentHandler)var48);
    var48.skippedEntity("hi!");
    var48.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var54 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var48);
    var54.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.TreeBuilder var57 = new nu.staldal.xtree.TreeBuilder();
    var57.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var62 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var57, false, false);
    nu.staldal.xtree.Text var64 = new nu.staldal.xtree.Text("");
    char[] var65 = var64.asCharArray();
    boolean var66 = var64.isWhitespaceNode();
    char[] var67 = var64.asCharArray();
    var57.ignorableWhitespace(var67, 0, 10);
    var54.ignorableWhitespace(var67, (-1), 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var74 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var54);
    nu.staldal.lagoon.producer.BasicSplit var75 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var77 = new nu.staldal.xtree.Text("hi!");
    char[] var78 = var77.asCharArray();
    var75.characters(var78, 1, 10);
    var54.ignorableWhitespace(var78, 2, 10);
    var36.ignorableWhitespace(var78, 2, (-1));
    var17.characters(var78, 1, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test239");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    nu.staldal.xtree.ProcessingInstruction var35 = new nu.staldal.xtree.ProcessingInstruction("4444444444", "hi!");
    java.lang.String var36 = var35.getValue();
    var22.setDocumentLocator((org.xml.sax.Locator)var35);
    java.lang.String var38 = var35.getTarget();
    nu.staldal.lagoon.producer.BasicSplit var39 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var41 = new nu.staldal.xtree.Text("hi!");
    char[] var42 = var41.asCharArray();
    var39.characters(var42, 1, 10);
    var39.endElement("", "hi!", "hi!");
    nu.staldal.xtree.TreeBuilder var50 = new nu.staldal.xtree.TreeBuilder();
    var50.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var55 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var50, false, false);
    nu.staldal.xtree.Text var57 = new nu.staldal.xtree.Text("");
    char[] var58 = var57.asCharArray();
    boolean var59 = var57.isWhitespaceNode();
    char[] var60 = var57.asCharArray();
    var50.ignorableWhitespace(var60, 0, 10);
    var39.characters(var60, 1, 10);
    var39.startDocument();
    var39.endElement("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.core.XMLStreamProducer var72 = var39.getNext();
    var39.startDocument();
    nu.staldal.lagoon.core.LagoonContext var74 = var39.getContext();
    var35.toSAX((org.xml.sax.ContentHandler)var39);
    nu.staldal.xtree.Element var79 = new nu.staldal.xtree.Element("", "hi!", 10);
    var79.setSystemId("hi!");
    java.lang.String var82 = var79.getSystemId();
    int var83 = var79.getColumnNumber();
    java.lang.String var85 = var79.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    java.net.URL var86 = var79.getBaseURI();
    java.lang.String var88 = var79.lookupNamespaceURI("aaaaaaaaaa");
    var39.setDocumentLocator((org.xml.sax.Locator)var79);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var92 = var79.getAttrValue("__52__", "nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "4444444444"+ "'", var38.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "hi!"+ "'", var82.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test240");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~ ", "hi_33_");
    java.lang.String var3 = var2.getLocalName();
    java.lang.String var4 = var2.getSystemId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi_33_"+ "'", var3.equals("hi_33_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test241");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.util.Enumeration var17 = var0.getParamNames();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var20 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    var18.startDocument();
    var18.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test242");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.util.Enumeration var17 = var0.getParamNames();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.startDocument();
    var18.processingInstruction("nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var30 = var27.lookupAttribute("4444444444", "hi!");
    java.lang.String var33 = var27.getInheritedAttribute("", "4444444444");
    int var36 = var27.lookupAttribute("", "nu.staldal.lagoon.util.TemplateException");
    var18.setDocumentLocator((org.xml.sax.Locator)var27);
    nu.staldal.xtree.Text var39 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var41 = var39.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    char[] var42 = var39.asCharArray();
    var18.characters(var42, 1, 100);
    nu.staldal.xmlutil.DocumentHandlerAdapter var46 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test243");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    var2.setColumn(10);
    java.lang.String var10 = var2.getAttrValueOrNull("", "hi!");
    var2.addAttribute("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.ftp.FTPException~ hi!", "nu.staldal.ftp.FTPException~ hi!", "nu.staldal.lagoon.util.TemplateException: hi_33_");
    java.lang.String var17 = var2.lookupNamespacePrefix("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test244");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    boolean var3 = var1.isWhitespaceNode();
    int var4 = var1.getLineNumber();
    java.lang.String var6 = var1.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.lagoon.producer.BasicSplit var7 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var9 = new nu.staldal.xtree.Text("hi!");
    char[] var10 = var9.asCharArray();
    var7.characters(var10, 1, 10);
    var7.endElement("", "hi!", "hi!");
    var7.processingInstruction("", "hi!");
    var7.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.util.Enumeration var24 = var7.getParamNames();
    var7.endElement("nu.staldal.lagoon.util.TemplateException", "4444444444", "nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.lagoon.producer.BasicSplit var29 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text("hi!");
    char[] var32 = var31.asCharArray();
    var29.characters(var32, 1, 10);
    var29.endElement("", "hi!", "hi!");
    var29.processingInstruction("", "hi!");
    var29.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var29.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var47 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var29);
    var47.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.DocumentHandlerAdapter var51 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var47);
    nu.staldal.xtree.Text var53 = new nu.staldal.xtree.Text("4444444444");
    var51.setDocumentLocator((org.xml.sax.Locator)var53);
    nu.staldal.xtree.Text var56 = new nu.staldal.xtree.Text("");
    char[] var57 = var56.asCharArray();
    boolean var58 = var56.isWhitespaceNode();
    char[] var59 = var56.asCharArray();
    var51.ignorableWhitespace(var59, (-1), 0);
    var7.characters(var59, 1, (-1));
    var7.startDocument();
    var7.afterBuild();
    var7.endElement("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", " ");
    var1.toSAX((org.xml.sax.ContentHandler)var7);
    java.lang.String var73 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + ""+ "'", var73.equals(""));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test245");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException(" ");
    nu.staldal.lagoon.LagoonAntTask var2 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    var2.bindToOwner((org.apache.tools.ant.Task)var3);
    var3.log("hi!");
    java.lang.String var7 = var3.getTaskName();
    var3.setTaskType("hi!");
    var3.setDescription("hi!");
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    var12.setPassword("");
    var12.setForce(false);
    org.apache.tools.ant.Target var17 = var12.getOwningTarget();
    var12.maybeConfigure();
    org.apache.tools.ant.RuntimeConfigurable var19 = var12.getRuntimeConfigurableWrapper();
    var3.setRuntimeConfigurableWrapper(var19);
    var3.setTaskName("aa");
    nu.staldal.lagoon.util.TemplateException var24 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var25 = var24.getException();
    nu.staldal.lagoon.util.TemplateException var26 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var24);
    var3.log("nu.staldal.lagoon.core.LagoonException: ", (java.lang.Throwable)var24, 0);
    nu.staldal.lagoon.util.TemplateException var29 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var24);
    java.lang.Throwable[] var30 = var24.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test246");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("44", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test247");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var2 = var1.getValue();
    char[] var3 = var1.asCharArray();
    char[] var4 = var1.asCharArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var8 = new nu.staldal.xtree.Text(var4, (-1), 1, true);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.AuthenticationMissingException"+ "'", var2.equals("nu.staldal.lagoon.core.AuthenticationMissingException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test248");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    int var19 = var11.getColumnNumber();
    char[] var22 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var26 = new nu.staldal.xtree.Text(var22, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var27 = new nu.staldal.xtree.TreeBuilder();
    var27.endPrefixMapping("hi!");
    var27.endDocument();
    var27.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var26.toSAX((org.xml.sax.ContentHandler)var27);
    var27.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var27.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    var11.toSAX((org.xml.sax.ContentHandler)var27);
    var11.setLine(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test249");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var20 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    nu.staldal.xtree.Text var22 = new nu.staldal.xtree.Text("hi!");
    char[] var23 = var22.asCharArray();
    var20.ignorableWhitespace(var23, (-1), 100);
    nu.staldal.xtree.ProcessingInstruction var29 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    var20.setDocumentLocator((org.xml.sax.Locator)var29);
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var38 = var35.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var39 = new nu.staldal.xtree.TreeBuilder();
    var35.toSAX((org.xml.sax.ContentHandler)var39);
    var39.skippedEntity("hi!");
    var39.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var45 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var39);
    var45.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.TreeBuilder var48 = new nu.staldal.xtree.TreeBuilder();
    var48.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var53 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var48, false, false);
    nu.staldal.xtree.Text var55 = new nu.staldal.xtree.Text("");
    char[] var56 = var55.asCharArray();
    boolean var57 = var55.isWhitespaceNode();
    char[] var58 = var55.asCharArray();
    var48.ignorableWhitespace(var58, 0, 10);
    var45.ignorableWhitespace(var58, (-1), 0);
    var20.characters(var58, (-1), 2);
    var20.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var20.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var20.skippedEntity("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test250");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    var21.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var24 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test251");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var13 = new nu.staldal.lagoon.producer.IslandSplit();
    var13.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var16 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var13, true);
    char[] var19 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text(var19, 1, 0, false);
    var16.setDocumentLocator((org.xml.sax.Locator)var23);
    char[] var25 = var23.asCharArray();
    var0.characters(var25, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var31 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xmlutil.ContentHandlerFixer var34 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, false);
    nu.staldal.xmlutil.ContentHandlerAdapter var35 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var0.endElement("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~ hi__33__");
    nu.staldal.xmlutil.ContentHandlerFixer var41 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    var41.skippedEntity("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test252");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.LagoonContext var1 = var0.getContext();
    var0.afterBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test253");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var8.setDocumentLocator((org.xml.sax.Locator)var16);
    var8.startDocument();
    nu.staldal.xtree.Element var19 = var8.getTree();
    java.lang.String var21 = var19.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var22 = var19.getLocalName();
    java.lang.String var25 = var19.getInheritedAttribute("hi_33_", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    int var28 = var19.lookupAttribute("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:                                                                                                     ", "          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "4444444444"+ "'", var22.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test254");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.setPublicId("");
    int var9 = var5.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var5);
    nu.staldal.xmlutil.ContentHandlerFixer var11 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    nu.staldal.xtree.Text var13 = new nu.staldal.xtree.Text("");
    char[] var14 = var13.asCharArray();
    boolean var15 = var13.isWhitespaceNode();
    int var16 = var13.getLineNumber();
    java.lang.String var18 = var13.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    char[] var19 = var13.asCharArray();
    var11.ignorableWhitespace(var19, (-1), 10);
    var11.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test255");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test256");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    var3.maybeConfigure();
    var3.log("4444444444", 1);
    var3.setTargetURL("hi_33_");
    var3.setForce(false);
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var15 = new nu.staldal.ftp.FTPException("hi!");
    var12.log("", (java.lang.Throwable)var15, 10);
    nu.staldal.lagoon.util.TemplateException var18 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var15);
    var3.log((java.lang.Throwable)var15, 100);
    var1.addSuppressed((java.lang.Throwable)var15);
    java.lang.Exception var22 = var1.getException();
    java.lang.Exception var23 = var1.getException();
    java.lang.Throwable[] var24 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test257");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var11.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    java.lang.String var22 = var11.getAttributeNamespaceURI((-1));
    java.lang.String var24 = var11.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var27 = var11.lookupAttribute("##", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("hi!", "hi!");
    var30.setSystemId("");
    java.net.URL var33 = var30.getBaseURI();
    java.lang.String var36 = var30.getAttrValueOrNull("", "");
    java.lang.String var37 = var30.getTextContent();
    java.lang.String var38 = var30.getSystemId();
    var30.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444", "                                                                                                    ");
    boolean var44 = var30.getPreserveSpace();
    boolean var45 = var30.isWhitespaceNode();
    int var46 = var30.getColumnNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.insertChild((nu.staldal.xtree.Node)var30, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + ""+ "'", var38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test258");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var9 = var4.getFirstChildElementOrNull();
    nu.staldal.xtree.Element var12 = var4.getFirstChildElementOrNull("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.ftp.FTPException:                                                                                                     ");
    int var13 = var4.numberOfNamespaceMappings();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test259");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    java.lang.String var6 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var9 = var2.lookupAttribute("hi!", "");
    java.lang.String var11 = var2.lookupNamespaceURI("hi_33_");
    java.lang.String var13 = var2.getAttrValueOrNull("4");
    java.lang.String var15 = var2.getAttributeNamespaceURI((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var17 = var2.getAttributeLocalName(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test260");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var6 = new nu.staldal.ftp.FTPException("hi!");
    var3.log("", (java.lang.Throwable)var6, 10);
    org.apache.tools.ant.Location var9 = var3.getLocation();
    var0.setLocation(var9);
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    var11.bindToOwner((org.apache.tools.ant.Task)var12);
    var11.setForce(true);
    java.lang.String var16 = var11.getTaskName();
    var11.setTaskType("4444444444");
    var11.maybeConfigure();
    var0.bindToOwner((org.apache.tools.ant.Task)var11);
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    var21.setDescription("4444444444");
    java.lang.String var24 = var21.getTaskName();
    nu.staldal.lagoon.LagoonAntTask var25 = new nu.staldal.lagoon.LagoonAntTask();
    var25.maybeConfigure();
    var25.log("4444444444", 1);
    var25.setTargetURL("hi_33_");
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var35 = new nu.staldal.ftp.FTPException("hi!");
    var32.log("", (java.lang.Throwable)var35, 10);
    org.apache.tools.ant.Project var38 = var32.getProject();
    nu.staldal.lagoon.util.TemplateException var40 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var41 = var40.getException();
    var32.log("", (java.lang.Throwable)var40, (-1));
    java.lang.Throwable[] var44 = var40.getSuppressed();
    var25.log((java.lang.Throwable)var40, 0);
    var21.log((java.lang.Throwable)var40, 2);
    var11.log((java.lang.Throwable)var40, 1);
    org.apache.tools.ant.Location var51 = var11.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test261");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    boolean var1 = var0.needPassword();
    var0.close();
    boolean var3 = var0.isReentrant();
    boolean var4 = var0.isReentrant();
    long var6 = var0.fileLastModified("hi!");
    var0.deleteFile("4444444444");
    boolean var9 = var0.needPassword();
    var0.close();
    var0.deleteFile("          ");
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test262");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setDescription("4444444444");
    java.lang.String var3 = var0.getTaskName();
    nu.staldal.lagoon.LagoonAntTask var4 = new nu.staldal.lagoon.LagoonAntTask();
    var4.maybeConfigure();
    var4.log("4444444444", 1);
    var4.setTargetURL("hi_33_");
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var14 = new nu.staldal.ftp.FTPException("hi!");
    var11.log("", (java.lang.Throwable)var14, 10);
    org.apache.tools.ant.Project var17 = var11.getProject();
    nu.staldal.lagoon.util.TemplateException var19 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var20 = var19.getException();
    var11.log("", (java.lang.Throwable)var19, (-1));
    java.lang.Throwable[] var23 = var19.getSuppressed();
    var4.log((java.lang.Throwable)var19, 0);
    var0.log((java.lang.Throwable)var19, 2);
    var0.setTaskType("nu.staldal.lagoon.core.LagoonException~~ hi____33____");
    var0.setTaskType("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____");
    var0.maybeConfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test263");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    java.lang.String var7 = var0.getTaskType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test264");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    nu.staldal.xtree.Element var18 = var2.getFirstChildElementOrNull("hi!", "4444444444");
    int var19 = var2.numberOfNamespaceMappings();
    int var20 = var2.numberOfNamespaceMappings();
    nu.staldal.xtree.Element var21 = var2.getFirstChildElementOrNull();
    java.lang.String var23 = var2.lookupNamespacePrefix("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var2.setPublicId("hi__33__");
    boolean var26 = var2.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test265");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var10 = var4.lookupNamespaceURI("4444444444");
    java.lang.String var12 = var4.lookupNamespacePrefix("4444444444");
    nu.staldal.lagoon.producer.BasicSplit var13 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var15 = new nu.staldal.xtree.Text("hi!");
    char[] var16 = var15.asCharArray();
    var13.characters(var16, 1, 10);
    var13.endElement("", "hi!", "hi!");
    var13.processingInstruction("", "hi!");
    var13.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var13.startDocument();
    var13.skippedEntity("");
    var4.outputStartElement((org.xml.sax.ContentHandler)var13);
    var13.startDocument();
    var13.endElement("nu.staldal.lagoon.core.AuthenticationException", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test266");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    var22.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.producer.BasicSplit var26 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var28 = new nu.staldal.xtree.Text("hi!");
    char[] var29 = var28.asCharArray();
    var26.characters(var29, 1, 10);
    var26.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var26.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    char[] var41 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var45 = new nu.staldal.xtree.Text(var41, 1, 0, false);
    char[] var46 = var45.asCharArray();
    var26.ignorableWhitespace(var46, 0, 10);
    var22.characters(var46, 0, 100);
    var22.startDocument();
    nu.staldal.xtree.Element var56 = new nu.staldal.xtree.Element("hi!", "hi!");
    var56.setSystemId("");
    java.net.URL var59 = var56.getBaseURI();
    java.lang.String var62 = var56.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var65 = new nu.staldal.xtree.Element("hi!", "hi!");
    var65.addNamespaceMapping("", "");
    var56.addChild((nu.staldal.xtree.Node)var65);
    var22.setDocumentLocator((org.xml.sax.Locator)var56);
    var22.processingInstruction(" ", "nu.staldal.ftp.FTPException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test267");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var5 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var6 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var7 = var0.getNext();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test268");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var21 = var20.getLineNumber();
    var20.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var28 = var27.getLineNumber();
    var27.addNamespaceMapping("", "");
    var20.addChild((nu.staldal.xtree.Node)var27);
    var2.insertChild((nu.staldal.xtree.Node)var20, 0);
    java.lang.String var36 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var39 = var2.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var40 = var2.getNamespaceURI();
    nu.staldal.xtree.Node var42 = var2.getChild(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var43 = var2.getTextContent();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test269");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var6 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.core.OutputHandler var10 = var0.createFile("nu.staldal.ftp.FTPException: hi!");
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test270");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu_46_staldal_46_lagoon_46_core_46_AuthenticationException", "nu.staldal.ftp.FTPException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_AuthenticationException"+ "'", var2.equals("nu_46_staldal_46_lagoon_46_core_46_AuthenticationException"));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test271");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.setTargetURL("4444444444");
    org.apache.tools.ant.Target var8 = var0.getOwningTarget();
    org.apache.tools.ant.Location var9 = var0.getLocation();
    var0.log("##");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test272");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.TreeBuilder var5 = new nu.staldal.xtree.TreeBuilder();
    var5.endPrefixMapping("hi!");
    var5.endDocument();
    var5.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    nu.staldal.xtree.Text var13 = new nu.staldal.xtree.Text("");
    char[] var14 = var13.asCharArray();
    char[] var15 = var13.asCharArray();
    char[] var16 = var13.asCharArray();
    var5.ignorableWhitespace(var16, 1, 100);
    var4.outputStartElement((org.xml.sax.ContentHandler)var5);
    java.lang.String var22 = var4.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var23 = var4.numberOfChildren();
    java.lang.String var24 = var4.getTextContent();
    java.lang.String var25 = var4.getNamespaceURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test273");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    org.apache.tools.ant.Target var6 = var1.getOwningTarget();
    java.lang.String var7 = var1.getTaskType();
    java.lang.String var8 = var1.getDescription();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    var9.bindToOwner((org.apache.tools.ant.Task)var10);
    var9.log("");
    java.lang.Object var14 = var9.clone();
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var18 = new nu.staldal.ftp.FTPException("hi!");
    var15.log("", (java.lang.Throwable)var18, 10);
    org.apache.tools.ant.Location var21 = var15.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var22 = var15.getRuntimeConfigurableWrapper();
    var15.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var25 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var28 = new nu.staldal.ftp.FTPException("hi!");
    var25.log("", (java.lang.Throwable)var28, 10);
    org.apache.tools.ant.Project var31 = var25.getProject();
    nu.staldal.lagoon.util.TemplateException var33 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var34 = var33.getException();
    var25.log("", (java.lang.Throwable)var33, (-1));
    var15.bindToOwner((org.apache.tools.ant.Task)var25);
    org.apache.tools.ant.Location var38 = var25.getLocation();
    var9.setLocation(var38);
    nu.staldal.lagoon.LagoonAntTask var40 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var43 = new nu.staldal.ftp.FTPException("hi!");
    var40.log("", (java.lang.Throwable)var43, 10);
    org.apache.tools.ant.Location var46 = var40.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var47 = var40.getRuntimeConfigurableWrapper();
    var40.setForce(false);
    org.apache.tools.ant.Location var50 = var40.getLocation();
    nu.staldal.lagoon.core.LagoonException var52 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var53 = var52.toString();
    var40.log((java.lang.Throwable)var52, 100);
    org.apache.tools.ant.Location var56 = var40.getLocation();
    var9.setLocation(var56);
    var1.setLocation(var56);
    nu.staldal.lagoon.core.AuthenticationException var60 = new nu.staldal.lagoon.core.AuthenticationException();
    java.lang.String var61 = var60.toString();
    nu.staldal.lagoon.util.TemplateException var62 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var60);
    var1.log("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ", (java.lang.Throwable)var60, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var53.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "nu.staldal.lagoon.core.AuthenticationException"+ "'", var61.equals("nu.staldal.lagoon.core.AuthenticationException"));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test274");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.setTaskType("hi!");
    java.lang.String var8 = var1.getTaskType();
    var1.log("nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    var1.setDescription("nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.lagoon.LagoonAntTask var14 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var17 = new nu.staldal.ftp.FTPException("hi!");
    var14.log("", (java.lang.Throwable)var17, 10);
    var14.init();
    var14.init();
    java.lang.String var22 = var14.getDescription();
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var26 = new nu.staldal.ftp.FTPException("hi!");
    var23.log("", (java.lang.Throwable)var26, 10);
    org.apache.tools.ant.Project var29 = var23.getProject();
    var14.bindToOwner((org.apache.tools.ant.Task)var23);
    var23.maybeConfigure();
    var1.bindToOwner((org.apache.tools.ant.Task)var23);
    java.lang.String var33 = var1.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test275");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    int var13 = var4.lookupAttribute("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String var14 = var4.getPublicId();
    boolean var15 = var4.getPreserveSpace();
    java.lang.String var16 = var4.getLocalName();
    java.lang.String var18 = var4.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    boolean var19 = var4.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "4444444444"+ "'", var16.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test276");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("hi!", "hi!");
    var18.setSystemId("");
    java.net.URL var21 = var18.getBaseURI();
    java.lang.String var24 = var18.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi!", "hi!");
    var27.addNamespaceMapping("", "");
    var18.addChild((nu.staldal.xtree.Node)var27);
    int var32 = var27.getColumnNumber();
    java.lang.String var34 = var27.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var27.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var2.addChild((nu.staldal.xtree.Node)var27);
    int var43 = var27.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var27.setPublicId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var27.setPublicId("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    java.lang.String var49 = var27.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test277");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    var0.skippedEntity("4444444444");
    java.util.Enumeration var20 = var0.getParamNames();
    nu.staldal.xtree.Element var23 = new nu.staldal.xtree.Element("hi!", "hi!");
    var23.setSystemId("");
    java.net.URL var26 = var23.getBaseURI();
    java.lang.String var29 = var23.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi!", "hi!");
    var32.addNamespaceMapping("", "");
    var23.addChild((nu.staldal.xtree.Node)var32);
    int var37 = var32.getColumnNumber();
    java.lang.String var39 = var32.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var32.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var0.setDocumentLocator((org.xml.sax.Locator)var32);
    nu.staldal.xmlutil.ContentHandlerAdapter var46 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var46.processingInstruction("a", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    nu.staldal.xtree.Text var51 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var51.setLine(1);
    char[] var54 = var51.asCharArray();
    char[] var55 = var51.asCharArray();
    boolean var56 = var51.isWhitespaceNode();
    boolean var57 = var51.isWhitespaceNode();
    var46.setDocumentLocator((org.xml.sax.Locator)var51);
    java.lang.String var59 = var51.getValue();
    java.lang.String var60 = var51.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var59.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var60.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test278");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("", "hi!");
    java.lang.String var3 = var2.getValue();
    var2.setSystemId("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var6 = var2.getValue();
    java.lang.String var7 = var2.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test279");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    nu.staldal.lagoon.producer.IslandSplit var6 = new nu.staldal.lagoon.producer.IslandSplit();
    var6.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var6, false, false);
    nu.staldal.xtree.Element var14 = new nu.staldal.xtree.Element("", "hi!", 10);
    var14.setSystemId("hi!");
    java.lang.String var17 = var14.getSystemId();
    var10.setDocumentLocator((org.xml.sax.Locator)var14);
    var14.setLine(100);
    var5.setDocumentLocator((org.xml.sax.Locator)var14);
    var14.addAttribute("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var29 = var14.getInheritedAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test280");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var1.setLine(1);
    boolean var4 = var1.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test281");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.util.TemplateException: nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test282");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    java.lang.String var7 = var0.getEntryName();
    boolean var9 = var0.hasBeenUpdated(1433461968000L);
    var0.afterBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test283");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    boolean var3 = var2.isWhitespaceNode();
    int var6 = var2.lookupAttribute("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!", "nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    var2.addNamespaceMapping("nu.staldal.ftp.FTPException:                                                                                                     ", "hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test284");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("                                                                                                    ");
    java.lang.String var2 = var1.toString();
    java.lang.Throwable[] var3 = var1.getSuppressed();
    java.lang.Throwable[] var4 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException:                                                                                                     "+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException:                                                                                                     "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test285");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    boolean var1 = var0.needPassword();
    var0.close();
    boolean var3 = var0.isReentrant();
    boolean var4 = var0.isReentrant();
    long var6 = var0.fileLastModified("hi!");
    boolean var7 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test286");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    boolean var2 = var0.hasBeenUpdated(1L);
    var0.afterBuild();
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    java.lang.String var6 = var0.getParam("nu.staldal.lagoon.core.AuthenticationException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test287");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.processingInstruction("", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    nu.staldal.lagoon.producer.BasicSplit var23 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var25 = new nu.staldal.xtree.Text("hi!");
    char[] var26 = var25.asCharArray();
    var23.characters(var26, 1, 10);
    var23.endElement("", "hi!", "hi!");
    var23.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var37 = new nu.staldal.xtree.Text("");
    char[] var38 = var37.asCharArray();
    char[] var39 = var37.asCharArray();
    char[] var40 = var37.asCharArray();
    var23.characters(var40, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var44 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var23);
    nu.staldal.xmlutil.DocumentHandlerAdapter var45 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var44);
    nu.staldal.xtree.Element var48 = new nu.staldal.xtree.Element("hi!", "hi!");
    var48.setSystemId("");
    java.net.URL var51 = var48.getBaseURI();
    java.lang.String var54 = var48.getAttrValueOrNull("", "");
    var45.setDocumentLocator((org.xml.sax.Locator)var48);
    nu.staldal.xtree.Text var57 = new nu.staldal.xtree.Text("");
    char[] var58 = var57.asCharArray();
    char[] var59 = var57.asCharArray();
    var45.characters(var59, 100, 100);
    nu.staldal.xtree.Element var65 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var66 = var65.getLineNumber();
    var65.setPublicId("");
    int var69 = var65.getLineNumber();
    java.lang.String var71 = var65.lookupNamespacePrefix("hi_33_");
    var45.setDocumentLocator((org.xml.sax.Locator)var65);
    nu.staldal.xmlutil.ContentHandlerFixer var75 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var45, false, false);
    var75.skippedEntity("nu.staldal.lagoon.core.AuthenticationMissingException");
    char[] var80 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var84 = new nu.staldal.xtree.Text(var80, 1, 0, false);
    var75.characters(var80, 0, (-1));
    var18.ignorableWhitespace(var80, 1, 2);
    var18.processingInstruction("aaaaaaaaaa", ".");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test288");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var3 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);
    java.lang.Exception var4 = var1.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test289");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    nu.staldal.xmlutil.ContentHandlerAdapter var13 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi!", "hi!");
    var16.setSystemId("");
    java.net.URL var19 = var16.getBaseURI();
    java.lang.String var22 = var16.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.addNamespaceMapping("", "");
    var16.addChild((nu.staldal.xtree.Node)var25);
    var16.setSystemId("");
    var16.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var39 = var16.getAttrValueOrNull("4444444444", "4444444444");
    java.lang.String var40 = var16.getSystemId();
    int var41 = var16.numberOfAttributes();
    java.lang.String var44 = var16.getAttrValueOrNull("4444444444", "");
    var0.setDocumentLocator((org.xml.sax.Locator)var16);
    nu.staldal.xtree.Element var49 = new nu.staldal.xtree.Element("hi!", "", 10);
    var0.setDocumentLocator((org.xml.sax.Locator)var49);
    var0.processingInstruction("nu.staldal.ftp.FTPException~~ hi!", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var0.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var55 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test290");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.setPublicId("");
    int var9 = var5.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var5);
    var0.startDocument();
    nu.staldal.xtree.Text var13 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var15 = var13.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var13);
    var0.endDocument();
    var0.startDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var29 = var26.lookupAttribute("4444444444", "hi!");
    java.lang.String var32 = var26.getInheritedAttribute("", "4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var26);
    java.net.URL var34 = var26.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test291");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var2.setLine(0);
    var2.setColumn((-1));
    java.lang.String var8 = var2.lookupNamespaceURI("nu.staldal.lagoon.util.TemplateException~ ");
    int var9 = var2.numberOfNamespaceMappings();
    java.lang.String var10 = var2.getLocalName();
    nu.staldal.lagoon.producer.BasicSplit var11 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var13 = new nu.staldal.xtree.Text("hi!");
    char[] var14 = var13.asCharArray();
    var11.characters(var14, 1, 10);
    var11.endElement("", "hi!", "hi!");
    var11.processingInstruction("", "hi!");
    var11.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var11.startDocument();
    var11.skippedEntity("4444444444");
    var11.endElement("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    var2.outputStartElement((org.xml.sax.ContentHandler)var11);
    java.net.URL var36 = var2.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException"+ "'", var10.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test292");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    java.lang.String var6 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var10 = new nu.staldal.ftp.FTPException("hi!");
    var7.log("", (java.lang.Throwable)var10, 10);
    org.apache.tools.ant.Location var13 = var7.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var14 = var7.getRuntimeConfigurableWrapper();
    var7.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var20 = new nu.staldal.ftp.FTPException("hi!");
    var17.log("", (java.lang.Throwable)var20, 10);
    org.apache.tools.ant.Project var23 = var17.getProject();
    nu.staldal.lagoon.util.TemplateException var25 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var26 = var25.getException();
    var17.log("", (java.lang.Throwable)var25, (-1));
    var7.bindToOwner((org.apache.tools.ant.Task)var17);
    org.apache.tools.ant.Location var30 = var17.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var31 = var17.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var31);
    java.lang.String var33 = var0.getTaskType();
    var0.setTaskType("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    java.lang.String var36 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test293");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var2 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var3 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var4 = var0.getNext();
    int var5 = var0.getPosition();
    nu.staldal.lagoon.core.ByteStreamProducer var6 = var0.getNext();
    int var7 = var0.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test294");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    nu.staldal.xtree.Element var18 = var2.getFirstChildElementOrNull("hi!", "4444444444");
    int var19 = var2.numberOfNamespaceMappings();
    nu.staldal.xtree.TreeBuilder var20 = new nu.staldal.xtree.TreeBuilder();
    var20.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var25 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var20, false, true);
    var2.toSAX((org.xml.sax.ContentHandler)var20);
    var20.startDocument();
    var20.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Element var30 = var20.getTree();
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("aa", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", 100, (-1));
    int var38 = var35.lookupAttribute("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    char[] var41 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var45 = new nu.staldal.xtree.Text(var41, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var46 = new nu.staldal.xtree.TreeBuilder();
    var46.endPrefixMapping("hi!");
    var46.endDocument();
    var46.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var45.toSAX((org.xml.sax.ContentHandler)var46);
    var46.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var46.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var59 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var46);
    var59.endDocument();
    var35.outputStartElement((org.xml.sax.ContentHandler)var59);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var30.outputEndElement((org.xml.sax.ContentHandler)var59);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test295");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("hi!", "hi!");
    var10.setLine(100);
    int var13 = var10.numberOfNamespaceMappings();
    var0.setDocumentLocator((org.xml.sax.Locator)var10);
    var10.addNamespaceMapping("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test296");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException"+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException: nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException"));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test297");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.String var8 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var12 = new nu.staldal.ftp.FTPException("hi!");
    var9.log("", (java.lang.Throwable)var12, 10);
    org.apache.tools.ant.Project var15 = var9.getProject();
    var0.bindToOwner((org.apache.tools.ant.Task)var9);
    var9.setTaskType("nu.staldal.lagoon.core.LagoonException: ");
    var9.log("hi!");
    var9.init();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var25 = new nu.staldal.ftp.FTPException("hi!");
    var22.log("", (java.lang.Throwable)var25, 10);
    java.lang.String var28 = var22.getDescription();
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var32 = new nu.staldal.ftp.FTPException("hi!");
    var29.log("", (java.lang.Throwable)var32, 10);
    org.apache.tools.ant.Location var35 = var29.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var36 = var29.getRuntimeConfigurableWrapper();
    var29.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var39 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var42 = new nu.staldal.ftp.FTPException("hi!");
    var39.log("", (java.lang.Throwable)var42, 10);
    org.apache.tools.ant.Project var45 = var39.getProject();
    nu.staldal.lagoon.util.TemplateException var47 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var48 = var47.getException();
    var39.log("", (java.lang.Throwable)var47, (-1));
    var29.bindToOwner((org.apache.tools.ant.Task)var39);
    org.apache.tools.ant.Location var52 = var39.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var53 = var39.getRuntimeConfigurableWrapper();
    var22.setRuntimeConfigurableWrapper(var53);
    var9.setRuntimeConfigurableWrapper(var53);
    var9.init();
    var9.setDescription("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    var9.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var9.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test298");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.Object var8 = var0.clone();
    var0.init();
    java.lang.Object var10 = var0.clone();
    org.apache.tools.ant.Location var11 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test299");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var13 = new nu.staldal.ftp.FTPException("hi!");
    var10.log("", (java.lang.Throwable)var13, 10);
    org.apache.tools.ant.Project var16 = var10.getProject();
    nu.staldal.lagoon.util.TemplateException var18 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var19 = var18.getException();
    var10.log("", (java.lang.Throwable)var18, (-1));
    var0.bindToOwner((org.apache.tools.ant.Task)var10);
    var10.setTaskType("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test300");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    java.lang.String var18 = var2.getPublicId();
    int var19 = var2.getLineNumber();
    java.lang.String var20 = var2.getPublicId();
    java.lang.String var23 = var2.getInheritedAttribute("a", "nu.staldal.lagoon.core.LagoonException~ hi__33__");
    int var24 = var2.getColumnNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var26 = var2.getAttributeNamespaceURI(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test301");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    nu.staldal.lagoon.core.OutputHandler var8 = var0.createFile("4444444444");
    long var10 = var0.fileLastModified("nu.staldal.lagoon.core.AuthenticationException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462000000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1433461999000L);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test302");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("hi!", "hi!");
    var10.setLine(100);
    int var13 = var10.numberOfNamespaceMappings();
    var0.setDocumentLocator((org.xml.sax.Locator)var10);
    java.lang.String var15 = var10.getTextContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test303");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    var0.init();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    nu.staldal.lagoon.core.LagoonContext var6 = var0.getContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.hasBeenUpdated((-1L));
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test304");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    char[] var18 = new char[] { '4'};
    var0.ignorableWhitespace(var18, (-1), (-1));
    nu.staldal.xmlutil.ContentHandlerFixer var23 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    var23.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__32_hi________________________________33________________________________", "nu.staldal.lagoon.core.LagoonException~ hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test305");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var20 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    nu.staldal.xtree.Text var22 = new nu.staldal.xtree.Text("hi!");
    char[] var23 = var22.asCharArray();
    var20.ignorableWhitespace(var23, (-1), 100);
    nu.staldal.xtree.ProcessingInstruction var29 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    var20.setDocumentLocator((org.xml.sax.Locator)var29);
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var38 = var35.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var39 = new nu.staldal.xtree.TreeBuilder();
    var35.toSAX((org.xml.sax.ContentHandler)var39);
    var39.skippedEntity("hi!");
    var39.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var45 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var39);
    var45.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.TreeBuilder var48 = new nu.staldal.xtree.TreeBuilder();
    var48.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var53 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var48, false, false);
    nu.staldal.xtree.Text var55 = new nu.staldal.xtree.Text("");
    char[] var56 = var55.asCharArray();
    boolean var57 = var55.isWhitespaceNode();
    char[] var58 = var55.asCharArray();
    var48.ignorableWhitespace(var58, 0, 10);
    var45.ignorableWhitespace(var58, (-1), 0);
    var20.characters(var58, (-1), 2);
    var20.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test306");


    nu.staldal.lagoon.producer.XMLFormatter var0 = new nu.staldal.lagoon.producer.XMLFormatter();
    var0.destroy();
    int var2 = var0.getPosition();
    var0.init();
    var0.init();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test307");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    java.lang.String var3 = var2.getLocalName();
    java.lang.String var5 = var2.lookupNamespacePrefix("                                                                                                    ");
    java.lang.String var8 = var2.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.ftp.FTPException: hi!");
    java.lang.String var11 = var2.getInheritedAttribute("aaaaaaaaaa", "          ");
    java.lang.String var14 = var2.getAttrValueOrNull("nu.staldal.lagoon.util.TemplateException", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var16 = var2.getNamespaceMapping(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test308");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.lookupNamespaceURI("nu.staldal.lagoon.util.TemplateException");
    java.lang.String var10 = var2.getInheritedAttribute("hi____33____", "#");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test309");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.lagoon.producer.BasicSplit var22 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var24 = new nu.staldal.xtree.Text("hi!");
    char[] var25 = var24.asCharArray();
    var22.characters(var25, 1, 10);
    var22.endElement("", "hi!", "hi!");
    var22.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var36 = new nu.staldal.xtree.Text("");
    char[] var37 = var36.asCharArray();
    char[] var38 = var36.asCharArray();
    char[] var39 = var36.asCharArray();
    var22.characters(var39, 10, 0);
    var21.ignorableWhitespace(var39, 10, 0);
    var21.startDocument();
    var21.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.LagoonException~ ");
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var53 = var52.getLineNumber();
    var52.setPublicId("");
    java.lang.String var58 = var52.getInheritedAttribute("", "4444444444");
    int var59 = var52.numberOfChildren();
    var21.setDocumentLocator((org.xml.sax.Locator)var52);
    int var61 = var52.numberOfChildren();
    java.net.URL var62 = var52.getBaseURI();
    int var63 = var52.numberOfAttributes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var65 = var52.getAttrValue("nu.staldal.lagoon.core.LagoonException~ 4444444444");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test310");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    int var16 = var11.getColumnNumber();
    java.lang.String var18 = var11.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var11.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var25 = var11.getAttributeNamespaceURI((-1));
    java.lang.String var26 = var11.getNamespaceURI();
    boolean var27 = var11.getPreserveSpace();
    java.lang.String var28 = var11.getTextContentOrNull();
    java.lang.String var30 = var11.lookupNamespacePrefix("          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test311");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    nu.staldal.xtree.Element var21 = var11.getFirstChildElementOrNull("", "nu.staldal.lagoon.core.LagoonException: ");
    int var22 = var11.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test312");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    org.apache.tools.ant.Location var10 = var0.getLocation();
    var0.log("nu.staldal.lagoon.util.TemplateException", (-1));
    var0.setTaskType("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    org.apache.tools.ant.Project var16 = var0.getProject();
    var0.init();
    var0.log("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", 100);
    var0.log("nu.staldal.lagoon.core.AuthenticationException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test313");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var0.skippedEntity("a");
    nu.staldal.lagoon.producer.BasicSplit var9 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var11 = new nu.staldal.xtree.Text("hi!");
    char[] var12 = var11.asCharArray();
    var9.characters(var12, 1, 10);
    var9.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var19 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var9, true);
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var27 = var24.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var28 = new nu.staldal.xtree.TreeBuilder();
    var24.toSAX((org.xml.sax.ContentHandler)var28);
    var28.skippedEntity("hi!");
    var28.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var34 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var28);
    var34.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.TreeBuilder var37 = new nu.staldal.xtree.TreeBuilder();
    var37.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var42 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var37, false, false);
    nu.staldal.xtree.Text var44 = new nu.staldal.xtree.Text("");
    char[] var45 = var44.asCharArray();
    boolean var46 = var44.isWhitespaceNode();
    char[] var47 = var44.asCharArray();
    var37.ignorableWhitespace(var47, 0, 10);
    var34.ignorableWhitespace(var47, (-1), 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var54 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var34);
    nu.staldal.lagoon.producer.BasicSplit var55 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var57 = new nu.staldal.xtree.Text("hi!");
    char[] var58 = var57.asCharArray();
    var55.characters(var58, 1, 10);
    var34.ignorableWhitespace(var58, 2, 10);
    var19.ignorableWhitespace(var58, 0, 1);
    var0.ignorableWhitespace(var58, 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var74 = new nu.staldal.xtree.Text(var58, 10, 10, false);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test314");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("hi_33_");
    java.lang.Exception var2 = var1.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test315");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    java.lang.String var8 = var2.getInheritedAttribute("", "4444444444");
    int var9 = var2.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var10 = new nu.staldal.xtree.TreeBuilder();
    var10.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var15 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var10, false, false);
    var2.toSAX((org.xml.sax.ContentHandler)var15);
    nu.staldal.xmlutil.ContentHandlerFixer var18 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var15, true);
    var18.startDocument();
    var18.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    var18.startPrefixMapping("aaaaaaaaaa", "aa");
    nu.staldal.lagoon.producer.BasicSplit var25 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var27 = new nu.staldal.xtree.Text("hi!");
    char[] var28 = var27.asCharArray();
    var25.characters(var28, 1, 10);
    var25.endElement("", "hi!", "hi!");
    var25.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var39 = new nu.staldal.xtree.Text("");
    char[] var40 = var39.asCharArray();
    char[] var41 = var39.asCharArray();
    char[] var42 = var39.asCharArray();
    var25.characters(var42, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var46 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var25);
    nu.staldal.xmlutil.DocumentHandlerAdapter var47 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var46);
    nu.staldal.xtree.Element var50 = new nu.staldal.xtree.Element("hi!", "hi!");
    var50.setSystemId("");
    java.net.URL var53 = var50.getBaseURI();
    java.lang.String var56 = var50.getAttrValueOrNull("", "");
    var47.setDocumentLocator((org.xml.sax.Locator)var50);
    nu.staldal.xtree.Text var59 = new nu.staldal.xtree.Text("");
    char[] var60 = var59.asCharArray();
    char[] var61 = var59.asCharArray();
    var47.characters(var61, 100, 100);
    nu.staldal.xtree.Element var67 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var68 = var67.getLineNumber();
    var67.setPublicId("");
    int var71 = var67.getLineNumber();
    java.lang.String var73 = var67.lookupNamespacePrefix("hi_33_");
    var47.setDocumentLocator((org.xml.sax.Locator)var67);
    nu.staldal.xmlutil.ContentHandlerFixer var77 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var47, false, false);
    nu.staldal.xtree.Text var79 = new nu.staldal.xtree.Text("");
    char[] var80 = var79.asCharArray();
    var47.ignorableWhitespace(var80, 10, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var18.characters(var80, 10, 2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test316");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.endPrefixMapping("hi_33_");
    var0.skippedEntity("hi_33_");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.setDocumentLocator((org.xml.sax.Locator)var12);
    int var14 = var12.getLineNumber();
    java.lang.String var15 = var12.getTextContent();
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("hi!", "hi!");
    var18.setLine(100);
    java.lang.String var22 = var18.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var25 = var18.lookupAttribute("hi!", "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var27 = var12.replaceChild((nu.staldal.xtree.Node)var18, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test317");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    var1.setLine(10);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test318");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    var4.addNamespaceMapping("", "4444444444");
    var4.addAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.ftp.FTPException: 4", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("hi!", "hi!");
    var18.setSystemId("");
    java.net.URL var21 = var18.getBaseURI();
    java.lang.String var24 = var18.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi!", "hi!");
    var27.addNamespaceMapping("", "");
    var18.addChild((nu.staldal.xtree.Node)var27);
    var18.setSystemId("");
    java.lang.String var34 = var18.getPublicId();
    int var35 = var18.getLineNumber();
    java.lang.String var36 = var18.getPublicId();
    int var37 = var18.getColumnNumber();
    nu.staldal.xtree.NodeWithChildren var38 = var18.getParent();
    int var39 = var18.numberOfAttributes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var41 = var4.replaceChild((nu.staldal.xtree.Node)var18, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test319");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.setTaskType("hi!");
    var1.setDescription("hi!");
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    var10.setPassword("");
    var10.setForce(false);
    org.apache.tools.ant.Target var15 = var10.getOwningTarget();
    var10.maybeConfigure();
    org.apache.tools.ant.RuntimeConfigurable var17 = var10.getRuntimeConfigurableWrapper();
    var1.setRuntimeConfigurableWrapper(var17);
    var1.setTaskType("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test320");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var8 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var8.endDocument();
    var8.endDocument();
    nu.staldal.xtree.Element var13 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    java.lang.String var15 = var13.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    var8.setDocumentLocator((org.xml.sax.Locator)var13);
    nu.staldal.xmlutil.DocumentHandlerAdapter var17 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var8);
    var17.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test321");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test322");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    nu.staldal.xmlutil.ContentHandlerAdapter var11 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    var8.endDocument();
    var8.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    var8.startDocument();
    var8.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    var8.skippedEntity("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test323");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    char[] var6 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var10 = new nu.staldal.xtree.Text(var6, 1, 0, false);
    var3.setDocumentLocator((org.xml.sax.Locator)var10);
    boolean var12 = var10.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test324");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    var0.setTaskName("                                                                                                    ");
    var0.init();
    var0.reconfigure();
    var0.setForce(true);
    var0.log("4444444444", 100);
    nu.staldal.lagoon.LagoonAntTask var16 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    var16.bindToOwner((org.apache.tools.ant.Task)var17);
    var16.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    var21.setPassword("");
    var16.bindToOwner((org.apache.tools.ant.Task)var21);
    org.apache.tools.ant.Project var25 = var16.getProject();
    org.apache.tools.ant.Project var26 = var16.getProject();
    org.apache.tools.ant.Location var27 = var16.getLocation();
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    var28.bindToOwner((org.apache.tools.ant.Task)var29);
    var29.log("hi!");
    java.lang.String var33 = var29.getTaskName();
    var29.init();
    org.apache.tools.ant.Location var35 = var29.getLocation();
    var16.setLocation(var35);
    var0.setLocation(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test325");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    java.lang.String var5 = var3.lookupNamespaceURI("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    java.lang.String var7 = var3.lookupNamespaceURI("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test326");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.TreeBuilder var5 = new nu.staldal.xtree.TreeBuilder();
    var5.endPrefixMapping("hi!");
    var5.endDocument();
    var5.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    nu.staldal.xtree.Text var13 = new nu.staldal.xtree.Text("");
    char[] var14 = var13.asCharArray();
    char[] var15 = var13.asCharArray();
    char[] var16 = var13.asCharArray();
    var5.ignorableWhitespace(var16, 1, 100);
    var4.outputStartElement((org.xml.sax.ContentHandler)var5);
    java.lang.String var22 = var4.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var4.addNamespaceMapping("hi_33_", "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var27 = var4.getAttrValue("nu.staldal.lagoon.core.LagoonException~ nu.staldal.ftp.FTPException~                                                                                                     ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test327");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var17 = var11.getAttrValueOrNull("");
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("hi!", "hi!");
    var20.setSystemId("");
    java.net.URL var23 = var20.getBaseURI();
    java.lang.String var26 = var20.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var29 = new nu.staldal.xtree.Element("hi!", "hi!");
    var29.addNamespaceMapping("", "");
    var20.addChild((nu.staldal.xtree.Node)var29);
    var20.setSystemId("");
    nu.staldal.xtree.Element var38 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var39 = var38.getLineNumber();
    var38.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var46 = var45.getLineNumber();
    var45.addNamespaceMapping("", "");
    var38.addChild((nu.staldal.xtree.Node)var45);
    var20.insertChild((nu.staldal.xtree.Node)var38, 0);
    var11.addChild((nu.staldal.xtree.Node)var20);
    nu.staldal.xtree.Element var54 = var11.getFirstChildElement();
    var11.setColumn(0);
    boolean var57 = var11.getPreserveSpace();
    int var58 = var11.numberOfNamespaceMappings();
    boolean var59 = var11.getPreserveSpace();
    java.lang.String var62 = var11.getAttrValueOrNull("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test328");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setSystemId("hi!");
    java.lang.String var6 = var2.getNamespaceURI();
    java.net.URL var7 = var2.getBaseURI();
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var15 = var12.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var16 = new nu.staldal.xtree.TreeBuilder();
    var12.toSAX((org.xml.sax.ContentHandler)var16);
    var16.skippedEntity("hi!");
    var16.skippedEntity("hi!");
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var16.setDocumentLocator((org.xml.sax.Locator)var24);
    var16.endDocument();
    nu.staldal.xtree.Element var27 = var16.getTree();
    var2.addChild((nu.staldal.xtree.Node)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var29 = var2.getTextContent();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test329");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var2 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var5 = new nu.staldal.ftp.FTPException("hi!");
    var2.log("", (java.lang.Throwable)var5, 10);
    org.apache.tools.ant.Location var8 = var2.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var9 = var2.getRuntimeConfigurableWrapper();
    var2.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var15 = new nu.staldal.ftp.FTPException("hi!");
    var12.log("", (java.lang.Throwable)var15, 10);
    org.apache.tools.ant.Project var18 = var12.getProject();
    nu.staldal.lagoon.util.TemplateException var20 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var21 = var20.getException();
    var12.log("", (java.lang.Throwable)var20, (-1));
    var2.bindToOwner((org.apache.tools.ant.Task)var12);
    org.apache.tools.ant.Location var25 = var12.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var26 = var12.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Location var27 = var12.getLocation();
    var0.setLocation(var27);
    org.apache.tools.ant.RuntimeConfigurable var29 = var0.getRuntimeConfigurableWrapper();
    nu.staldal.lagoon.LagoonAntTask var30 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var33 = new nu.staldal.ftp.FTPException("hi!");
    var30.log("", (java.lang.Throwable)var33, 10);
    org.apache.tools.ant.Project var36 = var30.getProject();
    nu.staldal.lagoon.util.TemplateException var38 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var39 = var38.getException();
    var30.log("", (java.lang.Throwable)var38, (-1));
    var30.setPassword("nu.staldal.lagoon.util.TemplateException: ");
    java.lang.Object var44 = var30.clone();
    nu.staldal.lagoon.LagoonAntTask var45 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var46 = new nu.staldal.lagoon.LagoonAntTask();
    var45.bindToOwner((org.apache.tools.ant.Task)var46);
    var46.log("hi!");
    java.lang.String var50 = var46.getTaskName();
    var46.init();
    org.apache.tools.ant.Location var52 = var46.getLocation();
    var46.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var46.log("", (-1));
    var30.bindToOwner((org.apache.tools.ant.Task)var46);
    var46.setDescription("aa");
    org.apache.tools.ant.Target var61 = var46.getOwningTarget();
    var0.bindToOwner((org.apache.tools.ant.Task)var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test330");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("nu.staldal.lagoon.util.TemplateException~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test331");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    var22.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.producer.BasicSplit var26 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var28 = new nu.staldal.xtree.Text("hi!");
    char[] var29 = var28.asCharArray();
    var26.characters(var29, 1, 10);
    var26.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var26.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    char[] var41 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var45 = new nu.staldal.xtree.Text(var41, 1, 0, false);
    char[] var46 = var45.asCharArray();
    var26.ignorableWhitespace(var46, 0, 10);
    var22.characters(var46, 0, 100);
    var22.startDocument();
    var22.startPrefixMapping("hi!", "4");
    var22.endPrefixMapping("                                                                                                    ");
    var22.processingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                    ");
    var22.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test332");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    nu.staldal.xtree.Text var8 = new nu.staldal.xtree.Text("");
    char[] var9 = var8.asCharArray();
    char[] var10 = var8.asCharArray();
    char[] var11 = var8.asCharArray();
    var0.ignorableWhitespace(var11, 1, 100);
    nu.staldal.xmlutil.ContentHandlerAdapter var15 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var16 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var15);
    var15.startDocument();
    var15.endDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var19 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test333");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test334");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var6 = new nu.staldal.ftp.FTPException("hi!");
    var3.log("", (java.lang.Throwable)var6, 10);
    org.apache.tools.ant.Location var9 = var3.getLocation();
    var0.setLocation(var9);
    var0.setDescription("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.log("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0);
    nu.staldal.lagoon.LagoonAntTask var16 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var19 = new nu.staldal.ftp.FTPException("hi!");
    var16.log("", (java.lang.Throwable)var19, 10);
    var16.init();
    org.apache.tools.ant.Project var23 = var16.getProject();
    nu.staldal.lagoon.LagoonAntTask var24 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var25 = new nu.staldal.lagoon.LagoonAntTask();
    var24.bindToOwner((org.apache.tools.ant.Task)var25);
    var25.log("hi!");
    java.lang.String var29 = var25.getTaskName();
    var25.init();
    org.apache.tools.ant.Location var31 = var25.getLocation();
    var16.setLocation(var31);
    var16.log("hi_33_", 2);
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var37 = new nu.staldal.lagoon.LagoonAntTask();
    var36.bindToOwner((org.apache.tools.ant.Task)var37);
    var36.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var41 = new nu.staldal.lagoon.LagoonAntTask();
    var41.setPassword("");
    var36.bindToOwner((org.apache.tools.ant.Task)var41);
    org.apache.tools.ant.Target var45 = var41.getOwningTarget();
    var41.setPassword("hi!");
    var16.bindToOwner((org.apache.tools.ant.Task)var41);
    org.apache.tools.ant.RuntimeConfigurable var49 = var41.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test335");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.afterBuild();
    java.lang.String var2 = var0.getEntryName();
    var0.init();
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var5 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test336");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi__33__"+ "'", var1.equals("hi__33__"));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test337");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    nu.staldal.lagoon.core.ByteStreamProducer var1 = var0.getNext();
    var0.init();
    var0.init();
    var0.init();
    var0.beforeBuild();
    nu.staldal.lagoon.core.LagoonContext var6 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test338");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    java.util.Enumeration var1 = var0.getParamNames();
    java.lang.String var3 = var0.getParam("hi!");
    boolean var5 = var0.hasBeenUpdated(10L);
    boolean var7 = var0.hasBeenUpdated(10L);
    boolean var9 = var0.hasBeenUpdated(1433461932000L);
    boolean var11 = var0.hasBeenUpdated(1433461930000L);
    boolean var13 = var0.hasBeenUpdated(1433461955000L);
    boolean var15 = var0.hasBeenUpdated(1433461965000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test339");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    var0.afterBuild();
    java.util.Enumeration var5 = var0.getParamNames();
    var0.afterBuild();
    var0.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test340");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    var22.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException: ");
    var22.processingInstruction("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var30 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, true);
    var22.startDocument();
    nu.staldal.lagoon.producer.IslandSplit var32 = new nu.staldal.lagoon.producer.IslandSplit();
    var32.destroy();
    var32.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var35 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var32);
    nu.staldal.xmlutil.ContentHandlerFixer var37 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var32, true);
    var37.endPrefixMapping("4444444444");
    var37.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var44 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var45 = var44.getLineNumber();
    var44.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var51 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var52 = var51.getLineNumber();
    var51.addNamespaceMapping("", "");
    var44.addChild((nu.staldal.xtree.Node)var51);
    nu.staldal.xtree.NodeWithChildren var57 = var44.getParent();
    nu.staldal.xtree.Element var60 = var44.getFirstChildElementOrNull("hi!", "4444444444");
    int var61 = var44.numberOfNamespaceMappings();
    var37.setDocumentLocator((org.xml.sax.Locator)var44);
    nu.staldal.xtree.Element var63 = var44.getFirstChildElement();
    var22.setDocumentLocator((org.xml.sax.Locator)var63);
    var22.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", "##########");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test341");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var8.setDocumentLocator((org.xml.sax.Locator)var16);
    var8.endDocument();
    var8.endDocument();
    var8.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var23 = var8.getTree();
    var8.skippedEntity(" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test342");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.beforeBuild();
    var0.destroy();
    java.util.Enumeration var4 = var0.getParamNames();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test343");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu.staldal.lagoon.core.LagoonException:                                                                                                     ", 10);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test344");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var3 = var1.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var4 = var1.isWhitespaceNode();
    var1.setColumn(1);
    nu.staldal.lagoon.producer.BasicSplit var7 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var9 = new nu.staldal.xtree.Text("hi!");
    char[] var10 = var9.asCharArray();
    var7.characters(var10, 1, 10);
    var7.endElement("", "hi!", "hi!");
    var7.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text("");
    char[] var22 = var21.asCharArray();
    char[] var23 = var21.asCharArray();
    char[] var24 = var21.asCharArray();
    var7.characters(var24, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var28 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var7);
    nu.staldal.xmlutil.DocumentHandlerAdapter var29 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var28);
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi!", "hi!");
    var32.setSystemId("");
    java.net.URL var35 = var32.getBaseURI();
    java.lang.String var38 = var32.getAttrValueOrNull("", "");
    var29.setDocumentLocator((org.xml.sax.Locator)var32);
    nu.staldal.xtree.Text var41 = new nu.staldal.xtree.Text("");
    char[] var42 = var41.asCharArray();
    char[] var43 = var41.asCharArray();
    var29.characters(var43, 100, 100);
    nu.staldal.xtree.Element var49 = new nu.staldal.xtree.Element("hi!", "hi!");
    var49.setLine(100);
    nu.staldal.xtree.Element var56 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var59 = var56.lookupAttribute("4444444444", "hi!");
    var56.addNamespaceMapping("", "4444444444");
    java.lang.String var63 = var56.getTextContent();
    var49.insertChild((nu.staldal.xtree.Node)var56, 0);
    var29.setDocumentLocator((org.xml.sax.Locator)var56);
    var29.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ");
    var1.toSAX((org.xml.sax.ContentHandler)var29);
    var29.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var29.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.lagoon.producer.BasicSplit var74 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var76 = new nu.staldal.xtree.Text("hi!");
    char[] var77 = var76.asCharArray();
    var74.characters(var77, 1, 10);
    var74.endElement("", "hi!", "hi!");
    var74.processingInstruction("", "hi!");
    var74.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    char[] var92 = new char[] { '4'};
    var74.ignorableWhitespace(var92, (-1), (-1));
    var29.ignorableWhitespace(var92, (-1), 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + ""+ "'", var63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test345");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.maybeConfigure();
    var0.log("4444444444", 1);
    var0.reconfigure();
    nu.staldal.lagoon.LagoonAntTask var6 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var9 = new nu.staldal.ftp.FTPException("hi!");
    var6.log("", (java.lang.Throwable)var9, 10);
    org.apache.tools.ant.Project var12 = var6.getProject();
    var6.reconfigure();
    var6.setTaskName("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.bindToOwner((org.apache.tools.ant.Task)var6);
    var0.log("nu.staldal.lagoon.util.TemplateException: ", 10);
    var0.setTaskName("a");
    java.lang.Object var22 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test346");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var2 = new nu.staldal.lagoon.LagoonAntTask();
    var1.bindToOwner((org.apache.tools.ant.Task)var2);
    nu.staldal.lagoon.LagoonAntTask var4 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var7 = new nu.staldal.ftp.FTPException("hi!");
    var4.log("", (java.lang.Throwable)var7, 10);
    org.apache.tools.ant.Location var10 = var4.getLocation();
    var1.setLocation(var10);
    var0.setLocation(var10);
    var0.init();
    nu.staldal.lagoon.LagoonAntTask var14 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    var14.bindToOwner((org.apache.tools.ant.Task)var15);
    var15.log("hi!");
    java.lang.String var19 = var15.getTaskName();
    var15.init();
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    var21.bindToOwner((org.apache.tools.ant.Task)var22);
    var21.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    var26.setPassword("");
    var21.bindToOwner((org.apache.tools.ant.Task)var26);
    org.apache.tools.ant.Project var30 = var21.getProject();
    org.apache.tools.ant.Project var31 = var21.getProject();
    org.apache.tools.ant.Location var32 = var21.getLocation();
    nu.staldal.lagoon.LagoonAntTask var33 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var34 = new nu.staldal.lagoon.LagoonAntTask();
    var33.bindToOwner((org.apache.tools.ant.Task)var34);
    var34.log("hi!");
    java.lang.String var38 = var34.getTaskName();
    var34.init();
    org.apache.tools.ant.Location var40 = var34.getLocation();
    var21.setLocation(var40);
    org.apache.tools.ant.Location var42 = var21.getLocation();
    var15.setLocation(var42);
    var0.setLocation(var42);
    java.lang.String var45 = var0.getDescription();
    var0.log(".");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test347");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test348");


    nu.staldal.lagoon.producer.XMLFormatter var0 = new nu.staldal.lagoon.producer.XMLFormatter();
    var0.init();
    var0.afterBuild();
    var0.init();
    java.util.Enumeration var4 = var0.getParamNames();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    var0.destroy();
    var0.init();
    java.lang.String var13 = var0.getParam("nu.staldal.lagoon.util.TemplateException: hi_33_");
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var16 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test349");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.Object var8 = var0.clone();
    var0.init();
    var0.init();
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    var11.maybeConfigure();
    var11.log("4444444444", 1);
    var11.reconfigure();
    var0.bindToOwner((org.apache.tools.ant.Task)var11);
    var11.setTargetURL("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var23 = new nu.staldal.ftp.FTPException("hi!");
    var20.log("", (java.lang.Throwable)var23, 10);
    var20.init();
    var11.bindToOwner((org.apache.tools.ant.Task)var20);
    nu.staldal.lagoon.util.TemplateException var30 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.Throwable[] var31 = var30.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var33 = new nu.staldal.lagoon.core.LagoonException("");
    nu.staldal.lagoon.util.TemplateException var34 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var33);
    var30.addSuppressed((java.lang.Throwable)var33);
    nu.staldal.lagoon.util.TemplateException var36 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var30);
    var20.log("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", (java.lang.Throwable)var30, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test350");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    org.apache.tools.ant.Project var9 = var0.getProject();
    org.apache.tools.ant.Project var10 = var0.getProject();
    org.apache.tools.ant.Location var11 = var0.getLocation();
    org.apache.tools.ant.Project var12 = var0.getProject();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test351");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var29 = var26.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var30 = new nu.staldal.xtree.TreeBuilder();
    var26.toSAX((org.xml.sax.ContentHandler)var30);
    var30.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var34 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var30);
    char[] var37 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var41 = new nu.staldal.xtree.Text(var37, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var42 = new nu.staldal.xtree.TreeBuilder();
    var42.endPrefixMapping("hi!");
    var42.endDocument();
    var42.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var41.toSAX((org.xml.sax.ContentHandler)var42);
    var42.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    char[] var55 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var59 = new nu.staldal.xtree.Text(var55, 1, 0, false);
    char[] var60 = var59.asCharArray();
    var42.ignorableWhitespace(var60, 10, 10);
    var34.ignorableWhitespace(var60, 1, 10);
    var21.ignorableWhitespace(var60, 2, 100);
    nu.staldal.xmlutil.DocumentHandlerAdapter var70 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    var21.processingInstruction("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_", "                                                                                                    ");
    nu.staldal.xtree.Text var75 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var75.setLine(1);
    java.lang.String var80 = var75.getInheritedAttribute("4444444444", "hi!");
    boolean var81 = var75.isWhitespaceNode();
    var21.setDocumentLocator((org.xml.sax.Locator)var75);
    nu.staldal.xmlutil.DocumentHandlerAdapter var83 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xmlutil.DocumentHandlerAdapter var84 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test352");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var21 = var20.getLineNumber();
    var20.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var28 = var27.getLineNumber();
    var27.addNamespaceMapping("", "");
    var20.addChild((nu.staldal.xtree.Node)var27);
    var2.insertChild((nu.staldal.xtree.Node)var20, 0);
    java.lang.String var36 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var39 = var2.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var40 = var2.getNamespaceURI();
    nu.staldal.xtree.Node var42 = var2.getChild(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var44 = var2.getAttributeNamespaceURI(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test353");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu.staldal.lagoon.util.TemplateException: hi_33_", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.util.TemplateException: hi_33_"+ "'", var2.equals("nu.staldal.lagoon.util.TemplateException: hi_33_"));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test354");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.core.LagoonException var9 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var0.log("4444444444", (java.lang.Throwable)var9, 100);
    java.lang.String var12 = var9.toString();
    java.lang.String var13 = var9.toString();
    nu.staldal.lagoon.LagoonAntTask var14 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var17 = new nu.staldal.ftp.FTPException("hi!");
    var14.log("", (java.lang.Throwable)var17, 10);
    var14.init();
    var14.init();
    java.lang.Object var22 = var14.clone();
    var14.init();
    java.lang.Object var24 = var14.clone();
    nu.staldal.lagoon.core.LagoonException var26 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var27 = var26.toString();
    var14.log((java.lang.Throwable)var26, 10);
    java.lang.Throwable[] var30 = var26.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var31 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var32 = var31.getException();
    nu.staldal.lagoon.util.TemplateException var33 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var31);
    java.lang.Exception var34 = var31.getException();
    nu.staldal.lagoon.util.TemplateException var35 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var31);
    java.lang.Throwable[] var36 = var31.getSuppressed();
    var26.addSuppressed((java.lang.Throwable)var31);
    var9.addSuppressed((java.lang.Throwable)var26);
    java.lang.String var39 = var26.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var12.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var13.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var27.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var39.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test355");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    java.util.Enumeration var19 = var0.getParamNames();
    nu.staldal.xtree.Element var22 = new nu.staldal.xtree.Element("hi!", "hi!");
    var22.setLine(100);
    java.lang.String var26 = var22.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var22);
    char[] var30 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var34 = new nu.staldal.xtree.Text(var30, 1, 0, false);
    var0.characters(var30, 1, 2);
    var0.startDocument();
    java.lang.String var40 = var0.getParam("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    var0.endElement("##", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ ");
    java.lang.String var47 = var0.getEntryName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test356");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    org.apache.tools.ant.Location var3 = var0.getLocation();
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var8 = new nu.staldal.ftp.FTPException("hi!");
    var5.log("", (java.lang.Throwable)var8, 10);
    org.apache.tools.ant.Location var11 = var5.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var12 = var5.getRuntimeConfigurableWrapper();
    var5.setForce(false);
    org.apache.tools.ant.Location var15 = var5.getLocation();
    var5.log("nu.staldal.lagoon.util.TemplateException", (-1));
    java.lang.String var19 = var5.getDescription();
    org.apache.tools.ant.Location var20 = var5.getLocation();
    java.lang.String var21 = var5.getTaskType();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    var22.bindToOwner((org.apache.tools.ant.Task)var23);
    var23.log("hi!");
    java.lang.String var27 = var23.getTaskName();
    var23.setTaskType("hi!");
    var23.setDescription("hi!");
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    var32.setPassword("");
    var32.setForce(false);
    org.apache.tools.ant.Target var37 = var32.getOwningTarget();
    var32.maybeConfigure();
    org.apache.tools.ant.RuntimeConfigurable var39 = var32.getRuntimeConfigurableWrapper();
    var23.setRuntimeConfigurableWrapper(var39);
    var5.bindToOwner((org.apache.tools.ant.Task)var23);
    nu.staldal.lagoon.core.LagoonException var44 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    nu.staldal.lagoon.LagoonAntTask var45 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var46 = new nu.staldal.lagoon.LagoonAntTask();
    var45.bindToOwner((org.apache.tools.ant.Task)var46);
    nu.staldal.lagoon.LagoonAntTask var49 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var52 = new nu.staldal.ftp.FTPException("hi!");
    var49.log("", (java.lang.Throwable)var52, 10);
    org.apache.tools.ant.Location var55 = var49.getLocation();
    nu.staldal.lagoon.core.LagoonException var58 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var49.log("4444444444", (java.lang.Throwable)var58, 100);
    java.lang.String var61 = var58.toString();
    nu.staldal.lagoon.LagoonAntTask var62 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var65 = new nu.staldal.ftp.FTPException("hi!");
    var62.log("", (java.lang.Throwable)var65, 10);
    org.apache.tools.ant.Project var68 = var62.getProject();
    nu.staldal.lagoon.util.TemplateException var70 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var71 = var70.getException();
    var62.log("", (java.lang.Throwable)var70, (-1));
    java.lang.Throwable[] var74 = var70.getSuppressed();
    java.lang.Throwable[] var75 = var70.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var77 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var78 = var77.toString();
    var70.addSuppressed((java.lang.Throwable)var77);
    var58.addSuppressed((java.lang.Throwable)var77);
    var45.log("4444444444", (java.lang.Throwable)var77, (-1));
    java.lang.String var83 = var77.toString();
    var44.addSuppressed((java.lang.Throwable)var77);
    var5.log("4", (java.lang.Throwable)var44, 2);
    var0.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____", (java.lang.Throwable)var44, 0);
    java.lang.Throwable[] var89 = var44.getSuppressed();
    java.lang.Exception var90 = var44.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var61.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var78.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var83.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var90);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test357");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("", "hi_33_");
    java.lang.String var3 = var2.getTextContentOrNull();
    int var4 = var2.getColumnNumber();
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var6 = var2.getSystemId();
    boolean var7 = var2.isWhitespaceNode();
    java.lang.String var8 = var2.getNamespaceURI();
    int var9 = var2.numberOfChildren();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test358");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    nu.staldal.lagoon.core.LagoonContext var6 = var0.getContext();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.hasBeenUpdated(1433461995000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test359");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    nu.staldal.xtree.Text var8 = new nu.staldal.xtree.Text("");
    char[] var9 = var8.asCharArray();
    char[] var10 = var8.asCharArray();
    char[] var11 = var8.asCharArray();
    var0.ignorableWhitespace(var11, 1, 100);
    nu.staldal.xmlutil.ContentHandlerAdapter var15 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.AuthenticationMissingException");
    var0.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test360");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    int var19 = var11.getColumnNumber();
    char[] var22 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var26 = new nu.staldal.xtree.Text(var22, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var27 = new nu.staldal.xtree.TreeBuilder();
    var27.endPrefixMapping("hi!");
    var27.endDocument();
    var27.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var26.toSAX((org.xml.sax.ContentHandler)var27);
    var27.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var27.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    var11.toSAX((org.xml.sax.ContentHandler)var27);
    nu.staldal.xtree.Text var42 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var43 = var42.getValue();
    char[] var44 = var42.asCharArray();
    var27.ignorableWhitespace(var44, 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "nu.staldal.lagoon.core.AuthenticationMissingException"+ "'", var43.equals("nu.staldal.lagoon.core.AuthenticationMissingException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test361");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    nu.staldal.xtree.TreeBuilder var1 = new nu.staldal.xtree.TreeBuilder();
    var1.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var6 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var1, false, true);
    var1.endPrefixMapping("hi_33_");
    var1.skippedEntity("hi_33_");
    nu.staldal.xtree.Element var13 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var1.setDocumentLocator((org.xml.sax.Locator)var13);
    int var15 = var13.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var13);
    nu.staldal.xmlutil.ContentHandlerAdapter var17 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.endElement("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test362");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    var0.reconfigure();
    nu.staldal.lagoon.core.LagoonException var10 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var11 = var10.toString();
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    var12.bindToOwner((org.apache.tools.ant.Task)var13);
    nu.staldal.lagoon.LagoonAntTask var16 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var19 = new nu.staldal.ftp.FTPException("hi!");
    var16.log("", (java.lang.Throwable)var19, 10);
    org.apache.tools.ant.Location var22 = var16.getLocation();
    nu.staldal.lagoon.core.LagoonException var25 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var16.log("4444444444", (java.lang.Throwable)var25, 100);
    java.lang.String var28 = var25.toString();
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var32 = new nu.staldal.ftp.FTPException("hi!");
    var29.log("", (java.lang.Throwable)var32, 10);
    org.apache.tools.ant.Project var35 = var29.getProject();
    nu.staldal.lagoon.util.TemplateException var37 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var38 = var37.getException();
    var29.log("", (java.lang.Throwable)var37, (-1));
    java.lang.Throwable[] var41 = var37.getSuppressed();
    java.lang.Throwable[] var42 = var37.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var44 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var45 = var44.toString();
    var37.addSuppressed((java.lang.Throwable)var44);
    var25.addSuppressed((java.lang.Throwable)var44);
    var12.log("4444444444", (java.lang.Throwable)var44, (-1));
    java.lang.String var50 = var44.toString();
    nu.staldal.lagoon.util.TemplateException var51 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var44);
    java.lang.Exception var52 = var44.getException();
    var10.addSuppressed((java.lang.Throwable)var44);
    var0.log("4", (java.lang.Throwable)var44, 2);
    var0.log("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
    nu.staldal.ftp.FTPException var60 = new nu.staldal.ftp.FTPException("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!");
    var0.log("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", (java.lang.Throwable)var60, 0);
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var11.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var28.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var45.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var50.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test363");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    var0.afterBuild();
    java.util.Enumeration var5 = var0.getParamNames();
    var0.afterBuild();
    java.util.Enumeration var7 = var0.getParamNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test364");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    java.lang.String var3 = var2.getSystemId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test365");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Project var8 = var0.getProject();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var10 = var9.getDescription();
    var9.setTargetURL("nu.staldal.lagoon.util.TemplateException");
    var9.setTaskName("hi!");
    org.apache.tools.ant.Location var15 = var9.getLocation();
    var0.setLocation(var15);
    var0.setTaskName("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test366");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.hasBeenUpdated(1433461998000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test367");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.Object var8 = var0.clone();
    var0.init();
    var0.log("nu.staldal.lagoon.util.TemplateException: ");
    org.apache.tools.ant.Project var12 = var0.getProject();
    nu.staldal.lagoon.core.LagoonException var15 = new nu.staldal.lagoon.core.LagoonException("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    java.lang.Throwable[] var16 = var15.getSuppressed();
    java.lang.Throwable[] var17 = var15.getSuppressed();
    java.lang.String var18 = var15.toString();
    var0.log("_32_", (java.lang.Throwable)var15, 100);
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var18.equals("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test368");


    nu.staldal.lagoon.producer.XMLFormatter var0 = new nu.staldal.lagoon.producer.XMLFormatter();
    var0.init();
    var0.init();
    int var3 = var0.getPosition();
    var0.init();
    var0.init();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test369");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "aaaaaaaaaa", 1, 0);
    nu.staldal.xtree.Element var7 = var4.getFirstChildElementOrNull("####################################################################################################", "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    int var8 = var4.numberOfChildren();
    int var11 = var4.lookupAttribute("aaaaaaaaaa", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test370");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException", 100, 100);
    int var5 = var4.numberOfNamespaceMappings();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test371");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    int var11 = var0.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test372");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: aa", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    var2.setColumn(0);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test373");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.startPrefixMapping("4444444444", "                                                                                                    ");
    var0.endPrefixMapping("hi!");
    nu.staldal.lagoon.producer.BasicSplit var11 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var13 = new nu.staldal.xtree.Text("hi!");
    char[] var14 = var13.asCharArray();
    var11.characters(var14, 1, 10);
    var11.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var11.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    char[] var26 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var30 = new nu.staldal.xtree.Text(var26, 1, 0, false);
    char[] var31 = var30.asCharArray();
    var11.ignorableWhitespace(var31, 0, 10);
    var0.ignorableWhitespace(var31, 2, 100);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.endElement("nu.staldal.lagoon.util.TemplateException~ ", "nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "#");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test374");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.setPublicId("");
    int var9 = var5.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var5);
    var0.startDocument();
    var0.skippedEntity("                                                                                                    ");
    var0.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var20 = var19.getLineNumber();
    var19.setPublicId("");
    int var23 = var19.getLineNumber();
    java.lang.String var25 = var19.lookupNamespacePrefix("hi_33_");
    java.lang.String var28 = var19.getAttrValueOrNull("", "4444444444");
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    var19.addChild((nu.staldal.xtree.Node)var32);
    var0.setDocumentLocator((org.xml.sax.Locator)var19);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var37 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test375");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    char[] var18 = var14.asCharArray();
    var0.ignorableWhitespace(var18, 1, 100);
    var0.skippedEntity("hi_33_");
    nu.staldal.lagoon.producer.BasicSplit var24 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var26 = new nu.staldal.xtree.Text("hi!");
    char[] var27 = var26.asCharArray();
    var24.characters(var27, 1, 10);
    var24.endElement("", "hi!", "hi!");
    var24.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var38 = new nu.staldal.xtree.Text("");
    char[] var39 = var38.asCharArray();
    char[] var40 = var38.asCharArray();
    char[] var41 = var38.asCharArray();
    var24.characters(var41, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var45 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var24);
    nu.staldal.lagoon.producer.BasicSplit var46 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var48 = new nu.staldal.xtree.Text("hi!");
    char[] var49 = var48.asCharArray();
    var46.characters(var49, 1, 10);
    var46.endElement("", "hi!", "hi!");
    var46.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var60 = new nu.staldal.xtree.Text("");
    char[] var61 = var60.asCharArray();
    char[] var62 = var60.asCharArray();
    char[] var63 = var60.asCharArray();
    var46.characters(var63, 10, 0);
    var45.ignorableWhitespace(var63, 10, 0);
    var0.characters(var63, (-1), 1);
    nu.staldal.xtree.Element var75 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var76 = var75.getLineNumber();
    var75.setPublicId("");
    java.lang.String var81 = var75.getInheritedAttribute("", "4444444444");
    int var82 = var75.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var83 = new nu.staldal.xtree.TreeBuilder();
    var83.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var88 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var83, false, false);
    var75.toSAX((org.xml.sax.ContentHandler)var88);
    java.lang.String var91 = var75.lookupNamespaceURI("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    int var92 = var75.numberOfAttributes();
    var0.setDocumentLocator((org.xml.sax.Locator)var75);
    java.lang.String var95 = var75.getAttributeNamespaceURI((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var95);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test376");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.setPublicId("");
    int var9 = var5.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var5);
    var0.startDocument();
    var0.skippedEntity("                                                                                                    ");
    var0.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.endDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var20 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var21.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test377");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.hasBeenUpdated(1433461929000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test378");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    nu.staldal.xtree.TreeBuilder var5 = new nu.staldal.xtree.TreeBuilder();
    var5.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, false);
    var2.toSAX((org.xml.sax.ContentHandler)var5);
    var5.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var5.skippedEntity("nu.staldal.lagoon.util.TemplateException");
    var5.startPrefixMapping("aaaaaaaaaa", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var5.skippedEntity("nu.staldal.lagoon.util.TemplateException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test379");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.afterBuild();
    java.lang.String var2 = var0.getEntryName();
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ");
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test380");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.Object var8 = var0.clone();
    var0.init();
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    var10.setPassword("");
    var10.setForce(false);
    org.apache.tools.ant.Target var15 = var10.getOwningTarget();
    var10.maybeConfigure();
    var10.log("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.bindToOwner((org.apache.tools.ant.Task)var10);
    org.apache.tools.ant.Target var20 = var0.getOwningTarget();
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    var21.bindToOwner((org.apache.tools.ant.Task)var22);
    var21.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    var26.setPassword("");
    var21.bindToOwner((org.apache.tools.ant.Task)var26);
    org.apache.tools.ant.Target var30 = var26.getOwningTarget();
    var26.setTaskType("hi_33_");
    var26.log("hi_33_");
    var26.init();
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var39 = new nu.staldal.ftp.FTPException("hi!");
    var36.log("", (java.lang.Throwable)var39, 10);
    org.apache.tools.ant.Project var42 = var36.getProject();
    nu.staldal.lagoon.util.TemplateException var44 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var45 = var44.getException();
    var36.log("", (java.lang.Throwable)var44, (-1));
    var26.log((java.lang.Throwable)var44, 100);
    nu.staldal.lagoon.LagoonAntTask var50 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var51 = new nu.staldal.lagoon.LagoonAntTask();
    var50.bindToOwner((org.apache.tools.ant.Task)var51);
    var51.log("hi!");
    nu.staldal.lagoon.LagoonAntTask var55 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var58 = new nu.staldal.ftp.FTPException("hi!");
    var55.log("", (java.lang.Throwable)var58, 10);
    org.apache.tools.ant.Location var61 = var55.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var62 = var55.getRuntimeConfigurableWrapper();
    var55.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var65 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var68 = new nu.staldal.ftp.FTPException("hi!");
    var65.log("", (java.lang.Throwable)var68, 10);
    org.apache.tools.ant.Project var71 = var65.getProject();
    nu.staldal.lagoon.util.TemplateException var73 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var74 = var73.getException();
    var65.log("", (java.lang.Throwable)var73, (-1));
    var55.bindToOwner((org.apache.tools.ant.Task)var65);
    org.apache.tools.ant.Project var78 = var55.getProject();
    var55.setTaskName("nu.staldal.lagoon.core.LagoonException: ");
    var51.bindToOwner((org.apache.tools.ant.Task)var55);
    var55.setTaskType("##");
    nu.staldal.lagoon.LagoonAntTask var84 = new nu.staldal.lagoon.LagoonAntTask();
    var84.setPassword("");
    var84.setForce(false);
    org.apache.tools.ant.Target var89 = var84.getOwningTarget();
    var84.maybeConfigure();
    var84.log("nu.staldal.lagoon.core.LagoonException: 4444444444");
    org.apache.tools.ant.Location var93 = var84.getLocation();
    var55.setLocation(var93);
    var26.setLocation(var93);
    var0.setLocation(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test381");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    org.apache.tools.ant.Target var7 = var0.getOwningTarget();
    var0.setPassword("hi!");
    var0.setTaskType("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var15 = new nu.staldal.ftp.FTPException("hi!");
    var12.log("", (java.lang.Throwable)var15, 10);
    org.apache.tools.ant.Project var18 = var12.getProject();
    var12.setTaskName("                                                                                                    ");
    var12.init();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    var22.bindToOwner((org.apache.tools.ant.Task)var23);
    var22.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    var27.setPassword("");
    var22.bindToOwner((org.apache.tools.ant.Task)var27);
    org.apache.tools.ant.Project var31 = var22.getProject();
    org.apache.tools.ant.Project var32 = var22.getProject();
    var22.log("");
    var22.log("nu.staldal.lagoon.core.LagoonException: ");
    var12.bindToOwner((org.apache.tools.ant.Task)var22);
    var12.setTaskType("          ");
    nu.staldal.lagoon.LagoonAntTask var40 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var41 = new nu.staldal.lagoon.LagoonAntTask();
    var40.bindToOwner((org.apache.tools.ant.Task)var41);
    var40.setForce(true);
    java.lang.String var45 = var40.getTaskName();
    var40.setTaskType("4444444444");
    var40.maybeConfigure();
    var40.setTargetURL("");
    var40.maybeConfigure();
    org.apache.tools.ant.Project var52 = var40.getProject();
    var40.setPassword("4444444444");
    var40.reconfigure();
    var12.bindToOwner((org.apache.tools.ant.Task)var40);
    var40.setTargetURL("nu.staldal.lagoon.core.LagoonException: hi_33_");
    org.apache.tools.ant.Location var59 = var40.getLocation();
    var0.setLocation(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test382");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    org.apache.tools.ant.Project var7 = var0.getProject();
    nu.staldal.lagoon.LagoonAntTask var8 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var11 = new nu.staldal.ftp.FTPException("hi!");
    var8.log("", (java.lang.Throwable)var11, 10);
    org.apache.tools.ant.Location var14 = var8.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var15 = var8.getRuntimeConfigurableWrapper();
    var8.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var21 = new nu.staldal.ftp.FTPException("hi!");
    var18.log("", (java.lang.Throwable)var21, 10);
    org.apache.tools.ant.Project var24 = var18.getProject();
    nu.staldal.lagoon.util.TemplateException var26 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var27 = var26.getException();
    var18.log("", (java.lang.Throwable)var26, (-1));
    var8.bindToOwner((org.apache.tools.ant.Task)var18);
    var0.bindToOwner((org.apache.tools.ant.Task)var8);
    var8.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____");
    var8.setForce(false);
    var8.setPassword("nu.staldal.ftp.FTPException~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test383");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    boolean var1 = var0.needPassword();
    var0.close();
    var0.deleteFile("nu.staldal.lagoon.core.AuthenticationMissingException");
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test384");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "hi_33_");
    java.net.URL var3 = var2.getBaseURI();
    var2.setPublicId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    char[] var8 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text(var8, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var13 = new nu.staldal.xtree.TreeBuilder();
    var13.endPrefixMapping("hi!");
    var13.endDocument();
    var13.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var12.toSAX((org.xml.sax.ContentHandler)var13);
    var13.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    nu.staldal.xmlutil.ContentHandlerAdapter var24 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var13);
    nu.staldal.xmlutil.ContentHandlerFixer var26 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var13, false);
    var2.toSAX((org.xml.sax.ContentHandler)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test385");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    int var16 = var11.getColumnNumber();
    java.lang.String var18 = var11.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var20 = var11.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var22 = var11.lookupNamespaceURI("_32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test386");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    nu.staldal.xtree.Text var34 = new nu.staldal.xtree.Text("");
    char[] var35 = var34.asCharArray();
    char[] var36 = var34.asCharArray();
    var22.characters(var36, 100, 100);
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var43 = var42.getLineNumber();
    var42.setPublicId("");
    int var46 = var42.getLineNumber();
    java.lang.String var48 = var42.lookupNamespacePrefix("hi_33_");
    var22.setDocumentLocator((org.xml.sax.Locator)var42);
    nu.staldal.lagoon.producer.BasicSplit var50 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var52 = new nu.staldal.xtree.Text("hi!");
    char[] var53 = var52.asCharArray();
    var50.characters(var53, 1, 10);
    var50.endElement("", "hi!", "hi!");
    var50.processingInstruction("", "hi!");
    var50.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    char[] var69 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var73 = new nu.staldal.xtree.Text(var69, 1, 0, false);
    var50.characters(var69, 1, (-1));
    var22.ignorableWhitespace(var69, 1, 0);
    var22.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    var22.startPrefixMapping("4444444444", "nu.staldal.lagoon.util.TemplateException: ");
    var22.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var86 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22);
    var86.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test387");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var17 = var2.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var18 = var2.getLocalName();
    nu.staldal.xtree.Element var19 = var2.getFirstChildElement();
    int var20 = var2.getColumnNumber();
    int var21 = var2.getLineNumber();
    var2.setLine(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test388");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.setLine(100);
    java.lang.String var28 = var24.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.net.URL var29 = var24.getBaseURI();
    var18.setDocumentLocator((org.xml.sax.Locator)var24);
    nu.staldal.lagoon.producer.BasicSplit var31 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var33 = new nu.staldal.xtree.Text("hi!");
    char[] var34 = var33.asCharArray();
    var31.characters(var34, 1, 10);
    var31.endElement("", "hi!", "hi!");
    var31.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var44 = new nu.staldal.lagoon.producer.IslandSplit();
    var44.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var47 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var44, true);
    char[] var50 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var54 = new nu.staldal.xtree.Text(var50, 1, 0, false);
    var47.setDocumentLocator((org.xml.sax.Locator)var54);
    char[] var56 = var54.asCharArray();
    var31.characters(var56, 10, 0);
    var18.characters(var56, (-1), 100);
    nu.staldal.xtree.Element var67 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var68 = var67.getFirstChildElementOrNull();
    var67.setSystemId("hi!");
    var18.setDocumentLocator((org.xml.sax.Locator)var67);
    nu.staldal.xtree.Text var73 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var75 = var73.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    char[] var76 = var73.asCharArray();
    var18.characters(var76, 100, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var83 = new nu.staldal.xtree.Text(var76, 100, 1, false);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test389");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    int var19 = var11.getLineNumber();
    nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text("");
    char[] var22 = var21.asCharArray();
    boolean var23 = var21.isWhitespaceNode();
    var11.insertChild((nu.staldal.xtree.Node)var21, 0);
    int var26 = var21.getLineNumber();
    java.lang.String var27 = var21.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test390");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    java.lang.String var6 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var10 = new nu.staldal.ftp.FTPException("hi!");
    var7.log("", (java.lang.Throwable)var10, 10);
    org.apache.tools.ant.Location var13 = var7.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var14 = var7.getRuntimeConfigurableWrapper();
    var7.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var20 = new nu.staldal.ftp.FTPException("hi!");
    var17.log("", (java.lang.Throwable)var20, 10);
    org.apache.tools.ant.Project var23 = var17.getProject();
    nu.staldal.lagoon.util.TemplateException var25 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var26 = var25.getException();
    var17.log("", (java.lang.Throwable)var25, (-1));
    var7.bindToOwner((org.apache.tools.ant.Task)var17);
    org.apache.tools.ant.Location var30 = var17.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var31 = var17.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var31);
    java.lang.String var33 = var0.getDescription();
    var0.init();
    var0.setPassword("nu.staldal.lagoon.util.TemplateException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test391");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    nu.staldal.xtree.Text var34 = new nu.staldal.xtree.Text("");
    char[] var35 = var34.asCharArray();
    char[] var36 = var34.asCharArray();
    var22.characters(var36, 100, 100);
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var43 = var42.getLineNumber();
    var42.setPublicId("");
    int var46 = var42.getLineNumber();
    java.lang.String var48 = var42.lookupNamespacePrefix("hi_33_");
    var22.setDocumentLocator((org.xml.sax.Locator)var42);
    var22.skippedEntity("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.lagoon.producer.BasicSplit var52 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var54 = new nu.staldal.xtree.Text("hi!");
    char[] var55 = var54.asCharArray();
    var52.characters(var55, 1, 10);
    var52.endElement("", "hi!", "hi!");
    var52.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var66 = new nu.staldal.xtree.Text("");
    char[] var67 = var66.asCharArray();
    char[] var68 = var66.asCharArray();
    char[] var69 = var66.asCharArray();
    var52.characters(var69, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var73 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var52);
    nu.staldal.xmlutil.DocumentHandlerAdapter var74 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var73);
    nu.staldal.xtree.Element var77 = new nu.staldal.xtree.Element("hi!", "hi!");
    var77.setSystemId("");
    java.net.URL var80 = var77.getBaseURI();
    java.lang.String var83 = var77.getAttrValueOrNull("", "");
    var74.setDocumentLocator((org.xml.sax.Locator)var77);
    var74.startDocument();
    char[] var86 = new char[] { };
    var74.characters(var86, 100, (-1));
    var22.ignorableWhitespace(var86, 10, 10);
    var22.startDocument();
    var22.skippedEntity("nu.staldal.ftp.FTPException~~ hi!");
    var22.startPrefixMapping("nu.staldal.ftp.FTPException~~~~ hi!", "nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test392");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 1);
    java.lang.String var6 = var3.getAttrValueOrNull("hi!", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var8 = var3.lookupNamespaceURI("                                                                                                    ");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.producer.BasicSplit var12 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("hi!");
    char[] var15 = var14.asCharArray();
    var12.characters(var15, 1, 10);
    var12.endElement("", "hi!", "hi!");
    var12.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var26 = new nu.staldal.xtree.Text("");
    char[] var27 = var26.asCharArray();
    char[] var28 = var26.asCharArray();
    char[] var29 = var26.asCharArray();
    var12.characters(var29, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var33 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var12);
    nu.staldal.xmlutil.DocumentHandlerAdapter var34 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var33);
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    var37.setSystemId("");
    java.net.URL var40 = var37.getBaseURI();
    java.lang.String var43 = var37.getAttrValueOrNull("", "");
    var34.setDocumentLocator((org.xml.sax.Locator)var37);
    var34.startDocument();
    var34.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.producer.IslandSplit var48 = new nu.staldal.lagoon.producer.IslandSplit();
    var48.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var51 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var48, true);
    char[] var54 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var58 = new nu.staldal.xtree.Text(var54, 1, 0, false);
    var51.setDocumentLocator((org.xml.sax.Locator)var58);
    java.lang.String var61 = var58.lookupNamespacePrefix("                                                                                                    ");
    var34.setDocumentLocator((org.xml.sax.Locator)var58);
    var11.addChild((nu.staldal.xtree.Node)var58);
    nu.staldal.xtree.TreeBuilder var64 = new nu.staldal.xtree.TreeBuilder();
    var64.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var69 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var64, false, true);
    var64.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var72 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var64);
    var72.endDocument();
    var72.endDocument();
    nu.staldal.xtree.Element var77 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    java.lang.String var79 = var77.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    var72.setDocumentLocator((org.xml.sax.Locator)var77);
    var11.addChild((nu.staldal.xtree.Node)var77);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.insertChild((nu.staldal.xtree.Node)var11, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test393");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    java.lang.String var4 = var3.getLocalName();
    nu.staldal.xtree.NodeWithChildren var5 = var3.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test394");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var23 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, false);
    var0.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.xmlutil.ContentHandlerFixer var28 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    java.lang.String var29 = var0.getEntryName();
    nu.staldal.xmlutil.ContentHandlerFixer var32 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, false);
    var32.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.util.TemplateException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test395");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    var2.setColumn(10);
    java.lang.String var10 = var2.getAttrValueOrNull("", "hi!");
    nu.staldal.xtree.Element var13 = var2.getFirstChildElementOrNull("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test396");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    boolean var3 = var1.isWhitespaceNode();
    int var4 = var1.getLineNumber();
    java.lang.String var5 = var1.getValue();
    java.lang.String var6 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test397");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    var0.close();
    var0.deleteFile("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    var0.deleteFile("nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462000000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test398");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    int var4 = var0.getPosition();
    java.util.Enumeration var5 = var0.getParamNames();
    var0.afterBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test399");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("##", "44");
    boolean var3 = var2.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test400");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    var0.init();
    var0.init();
    var0.init();
    java.lang.String var6 = var0.getEntryName();
    var0.init();
    java.lang.String var9 = var0.getParam("nu.staldal.ftp.FTPException: hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.hasBeenUpdated(1433461985000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test401");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    java.util.Enumeration var1 = var0.getParamNames();
    boolean var3 = var0.hasBeenUpdated(0L);
    var0.beforeBuild();
    boolean var6 = var0.hasBeenUpdated(1433461932000L);
    boolean var8 = var0.hasBeenUpdated(1L);
    java.lang.String var9 = var0.getEntryName();
    boolean var11 = var0.hasBeenUpdated(1L);
    boolean var13 = var0.hasBeenUpdated(1433461978000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test402");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test403");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    var22.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException: ");
    var22.processingInstruction("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var30 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, true);
    var22.startDocument();
    nu.staldal.lagoon.producer.IslandSplit var32 = new nu.staldal.lagoon.producer.IslandSplit();
    var32.destroy();
    var32.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var35 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var32);
    nu.staldal.xmlutil.ContentHandlerFixer var37 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var32, true);
    var37.endPrefixMapping("4444444444");
    var37.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var44 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var45 = var44.getLineNumber();
    var44.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var51 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var52 = var51.getLineNumber();
    var51.addNamespaceMapping("", "");
    var44.addChild((nu.staldal.xtree.Node)var51);
    nu.staldal.xtree.NodeWithChildren var57 = var44.getParent();
    nu.staldal.xtree.Element var60 = var44.getFirstChildElementOrNull("hi!", "4444444444");
    int var61 = var44.numberOfNamespaceMappings();
    var37.setDocumentLocator((org.xml.sax.Locator)var44);
    nu.staldal.xtree.Element var63 = var44.getFirstChildElement();
    var22.setDocumentLocator((org.xml.sax.Locator)var63);
    nu.staldal.xmlutil.ContentHandlerFixer var66 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test404");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.startDocument();
    nu.staldal.lagoon.producer.BasicSplit var20 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var22 = new nu.staldal.xtree.Text("hi!");
    char[] var23 = var22.asCharArray();
    var20.characters(var23, 1, 10);
    var20.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var30 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var20, true);
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var38 = var35.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var39 = new nu.staldal.xtree.TreeBuilder();
    var35.toSAX((org.xml.sax.ContentHandler)var39);
    var39.skippedEntity("hi!");
    var39.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var45 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var39);
    var45.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.TreeBuilder var48 = new nu.staldal.xtree.TreeBuilder();
    var48.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var53 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var48, false, false);
    nu.staldal.xtree.Text var55 = new nu.staldal.xtree.Text("");
    char[] var56 = var55.asCharArray();
    boolean var57 = var55.isWhitespaceNode();
    char[] var58 = var55.asCharArray();
    var48.ignorableWhitespace(var58, 0, 10);
    var45.ignorableWhitespace(var58, (-1), 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var65 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var45);
    nu.staldal.lagoon.producer.BasicSplit var66 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var68 = new nu.staldal.xtree.Text("hi!");
    char[] var69 = var68.asCharArray();
    var66.characters(var69, 1, 10);
    var45.ignorableWhitespace(var69, 2, 10);
    var30.ignorableWhitespace(var69, 0, 1);
    var18.ignorableWhitespace(var69, (-1), 10);
    nu.staldal.xtree.Element var85 = new nu.staldal.xtree.Element("4444444444", "", 0);
    java.lang.String var86 = var85.getTextContentOrNull();
    java.lang.String var88 = var85.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    var18.setDocumentLocator((org.xml.sax.Locator)var85);
    java.lang.String var91 = var85.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + ""+ "'", var86.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test405");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", 0);
    java.net.URL var4 = var3.getBaseURI();
    var3.setColumn(2);
    java.net.URL var7 = var3.getBaseURI();
    java.lang.String var10 = var3.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var12 = var3.getAttrValue("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test406");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var2 = new nu.staldal.lagoon.LagoonAntTask();
    var1.bindToOwner((org.apache.tools.ant.Task)var2);
    nu.staldal.lagoon.LagoonAntTask var4 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var7 = new nu.staldal.ftp.FTPException("hi!");
    var4.log("", (java.lang.Throwable)var7, 10);
    org.apache.tools.ant.Location var10 = var4.getLocation();
    var1.setLocation(var10);
    var0.setLocation(var10);
    var0.init();
    nu.staldal.lagoon.LagoonAntTask var14 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    var14.bindToOwner((org.apache.tools.ant.Task)var15);
    var15.log("hi!");
    java.lang.String var19 = var15.getTaskName();
    var15.init();
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    var21.bindToOwner((org.apache.tools.ant.Task)var22);
    var21.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    var26.setPassword("");
    var21.bindToOwner((org.apache.tools.ant.Task)var26);
    org.apache.tools.ant.Project var30 = var21.getProject();
    org.apache.tools.ant.Project var31 = var21.getProject();
    org.apache.tools.ant.Location var32 = var21.getLocation();
    nu.staldal.lagoon.LagoonAntTask var33 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var34 = new nu.staldal.lagoon.LagoonAntTask();
    var33.bindToOwner((org.apache.tools.ant.Task)var34);
    var34.log("hi!");
    java.lang.String var38 = var34.getTaskName();
    var34.init();
    org.apache.tools.ant.Location var40 = var34.getLocation();
    var21.setLocation(var40);
    org.apache.tools.ant.Location var42 = var21.getLocation();
    var15.setLocation(var42);
    var0.setLocation(var42);
    nu.staldal.lagoon.util.TemplateException var45 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var46 = var45.getException();
    nu.staldal.lagoon.util.TemplateException var47 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var45);
    var0.log((java.lang.Throwable)var45, 10);
    java.lang.String var50 = var0.getTaskType();
    java.lang.String var51 = var0.getTaskName();
    org.apache.tools.ant.Project var52 = var0.getProject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test407");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    java.lang.String var7 = var2.getAttrValueOrNull("");
    nu.staldal.xtree.Element var8 = var2.getFirstChildElementOrNull();
    int var9 = var2.getColumnNumber();
    java.net.URL var10 = var2.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test408");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var2 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var13 = var12.getLineNumber();
    var12.addNamespaceMapping("", "");
    var5.addChild((nu.staldal.xtree.Node)var12);
    nu.staldal.xtree.NodeWithChildren var18 = var5.getParent();
    boolean var19 = var5.getPreserveSpace();
    var2.setDocumentLocator((org.xml.sax.Locator)var5);
    java.lang.String var22 = var5.lookupNamespaceURI("hi_33_");
    nu.staldal.xtree.Element var23 = var5.getFirstChildElementOrNull();
    java.lang.String var25 = var23.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var26 = var23.getNamespaceURI();
    int var27 = var23.getLineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.removeAttribute(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test409");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var6 = new nu.staldal.ftp.FTPException("hi!");
    var3.log("", (java.lang.Throwable)var6, 10);
    org.apache.tools.ant.Location var9 = var3.getLocation();
    var0.setLocation(var9);
    org.apache.tools.ant.Location var11 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var12 = var0.getRuntimeConfigurableWrapper();
    var0.maybeConfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test410");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.core.LagoonException~ 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var1.equals("nu.staldal.lagoon.core.LagoonException~ 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test411");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    org.apache.tools.ant.Location var3 = var0.getLocation();
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var8 = new nu.staldal.ftp.FTPException("hi!");
    var5.log("", (java.lang.Throwable)var8, 10);
    org.apache.tools.ant.Location var11 = var5.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var12 = var5.getRuntimeConfigurableWrapper();
    var5.setForce(false);
    org.apache.tools.ant.Location var15 = var5.getLocation();
    var5.log("nu.staldal.lagoon.util.TemplateException", (-1));
    java.lang.String var19 = var5.getDescription();
    org.apache.tools.ant.Location var20 = var5.getLocation();
    java.lang.String var21 = var5.getTaskType();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    var22.bindToOwner((org.apache.tools.ant.Task)var23);
    var23.log("hi!");
    java.lang.String var27 = var23.getTaskName();
    var23.setTaskType("hi!");
    var23.setDescription("hi!");
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    var32.setPassword("");
    var32.setForce(false);
    org.apache.tools.ant.Target var37 = var32.getOwningTarget();
    var32.maybeConfigure();
    org.apache.tools.ant.RuntimeConfigurable var39 = var32.getRuntimeConfigurableWrapper();
    var23.setRuntimeConfigurableWrapper(var39);
    var5.bindToOwner((org.apache.tools.ant.Task)var23);
    nu.staldal.lagoon.core.LagoonException var44 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    nu.staldal.lagoon.LagoonAntTask var45 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var46 = new nu.staldal.lagoon.LagoonAntTask();
    var45.bindToOwner((org.apache.tools.ant.Task)var46);
    nu.staldal.lagoon.LagoonAntTask var49 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var52 = new nu.staldal.ftp.FTPException("hi!");
    var49.log("", (java.lang.Throwable)var52, 10);
    org.apache.tools.ant.Location var55 = var49.getLocation();
    nu.staldal.lagoon.core.LagoonException var58 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var49.log("4444444444", (java.lang.Throwable)var58, 100);
    java.lang.String var61 = var58.toString();
    nu.staldal.lagoon.LagoonAntTask var62 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var65 = new nu.staldal.ftp.FTPException("hi!");
    var62.log("", (java.lang.Throwable)var65, 10);
    org.apache.tools.ant.Project var68 = var62.getProject();
    nu.staldal.lagoon.util.TemplateException var70 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var71 = var70.getException();
    var62.log("", (java.lang.Throwable)var70, (-1));
    java.lang.Throwable[] var74 = var70.getSuppressed();
    java.lang.Throwable[] var75 = var70.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var77 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var78 = var77.toString();
    var70.addSuppressed((java.lang.Throwable)var77);
    var58.addSuppressed((java.lang.Throwable)var77);
    var45.log("4444444444", (java.lang.Throwable)var77, (-1));
    java.lang.String var83 = var77.toString();
    var44.addSuppressed((java.lang.Throwable)var77);
    var5.log("4", (java.lang.Throwable)var44, 2);
    var0.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____", (java.lang.Throwable)var44, 0);
    java.lang.String var89 = var44.toString();
    java.lang.String var90 = var44.toString();
    java.lang.Exception var91 = var44.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var61.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var78.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var83.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var89 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var89.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var90.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test412");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("4");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var7 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var8 = var7.getLineNumber();
    var7.setPublicId("");
    int var11 = var7.getLineNumber();
    var2.setDocumentLocator((org.xml.sax.Locator)var7);
    var2.startDocument();
    var2.skippedEntity("                                                                                                    ");
    var2.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var22 = var21.getLineNumber();
    var21.setPublicId("");
    int var25 = var21.getLineNumber();
    java.lang.String var27 = var21.lookupNamespacePrefix("hi_33_");
    java.lang.String var30 = var21.getAttrValueOrNull("", "4444444444");
    nu.staldal.xtree.Element var34 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    var21.addChild((nu.staldal.xtree.Node)var34);
    var2.setDocumentLocator((org.xml.sax.Locator)var21);
    var2.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    java.lang.String var40 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "4"+ "'", var40.equals("4"));

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test413");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    boolean var7 = var0.needPassword();
    long var9 = var0.fileLastModified("hi_33_");
    nu.staldal.lagoon.core.OutputHandler var11 = var0.createFile("hi_33_");
    nu.staldal.lagoon.core.OutputHandler var13 = var0.createFile("4444444444");
    boolean var14 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462001000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1433461998000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test414");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu____46____staldal____46____ftp____46____FTPException____126________32____hi____33____");

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test415");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    java.lang.String var11 = var2.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var14 = new nu.staldal.xtree.Element("hi!", "hi!");
    var14.setSystemId("");
    java.net.URL var17 = var14.getBaseURI();
    java.lang.String var20 = var14.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var23 = new nu.staldal.xtree.Element("hi!", "hi!");
    var23.addNamespaceMapping("", "");
    var14.addChild((nu.staldal.xtree.Node)var23);
    java.lang.String var30 = var23.getInheritedAttribute("", "hi!");
    var2.addChild((nu.staldal.xtree.Node)var23);
    java.lang.String var32 = var2.getSystemId();
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("hi!", "hi!");
    var35.setSystemId("");
    java.net.URL var38 = var35.getBaseURI();
    java.lang.String var41 = var35.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("", "4444444444", 100);
    int var46 = var45.numberOfChildren();
    java.lang.String var49 = var45.getInheritedAttribute("4444444444", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var51 = var45.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    int var52 = var45.getColumnNumber();
    var35.addChild((nu.staldal.xtree.Node)var45);
    java.lang.String var55 = var45.getAttrValueOrNull("nu.staldal.ftp.FTPException: hi!");
    var45.addAttribute("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~ ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertChild((nu.staldal.xtree.Node)var45, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test416");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    nu.staldal.lagoon.core.LagoonContext var6 = var0.getContext();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.hasBeenUpdated(1433461965000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test417");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("4");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.String var3 = var1.toString();
    java.lang.Throwable[] var4 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.ftp.FTPException: 4"+ "'", var3.equals("nu.staldal.ftp.FTPException: 4"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test418");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.Object var8 = var0.clone();
    var0.init();
    var0.setDescription("hi!");
    var0.log("4444444444", 100);
    java.lang.String var15 = var0.getTaskName();
    var0.init();
    var0.setTaskType(" ");
    var0.maybeConfigure();
    var0.setTaskName("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ");
    java.lang.Object var22 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test419");


    char[] var2 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text(var2, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var7 = new nu.staldal.xtree.TreeBuilder();
    var7.endPrefixMapping("hi!");
    var7.endDocument();
    var7.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var6.toSAX((org.xml.sax.ContentHandler)var7);
    var7.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var7.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var20 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var7);
    nu.staldal.xtree.TreeBuilder var21 = new nu.staldal.xtree.TreeBuilder();
    var21.endPrefixMapping("hi!");
    var21.endDocument();
    var21.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    nu.staldal.xtree.Text var29 = new nu.staldal.xtree.Text("");
    char[] var30 = var29.asCharArray();
    char[] var31 = var29.asCharArray();
    char[] var32 = var29.asCharArray();
    var21.ignorableWhitespace(var32, 1, 100);
    var7.ignorableWhitespace(var32, 2, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test420");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    int var6 = var2.numberOfNamespaceMappings();
    java.lang.String var9 = var2.getInheritedAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    nu.staldal.lagoon.producer.BasicSplit var10 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("hi!");
    char[] var13 = var12.asCharArray();
    var10.characters(var13, 1, 10);
    var10.endElement("", "hi!", "hi!");
    var10.processingInstruction("", "hi!");
    var10.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var10.startDocument();
    var10.processingInstruction("4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var33 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var10, true, false);
    nu.staldal.xmlutil.ContentHandlerFixer var36 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var10, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var37 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.outputEndElement((org.xml.sax.ContentHandler)var37);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test421");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    var2.setColumn(10);
    boolean var8 = var2.getPreserveSpace();
    boolean var9 = var2.getPreserveSpace();
    var2.addNamespaceMapping("nu.staldal.lagoon.util.TemplateException~~ ", "                                                                                                    ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test422");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444", "nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", (-1), 1);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test423");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.init();
    var0.endPrefixMapping("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var7.endPrefixMapping("");
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var7);
    nu.staldal.xtree.Element var13 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    var10.setDocumentLocator((org.xml.sax.Locator)var13);
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 10);
    int var19 = var18.getLineNumber();
    var10.setDocumentLocator((org.xml.sax.Locator)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test424");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    boolean var8 = var0.hasBeenUpdated(1433461930000L);
    var0.afterBuild();
    nu.staldal.lagoon.core.LagoonContext var10 = var0.getContext();
    var0.afterBuild();
    boolean var13 = var0.hasBeenUpdated(1433461928000L);
    boolean var15 = var0.hasBeenUpdated(1433461940000L);
    nu.staldal.lagoon.core.LagoonContext var16 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test425");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_", "nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!");

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test426");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    nu.staldal.xtree.Text var34 = new nu.staldal.xtree.Text("");
    char[] var35 = var34.asCharArray();
    char[] var36 = var34.asCharArray();
    var22.characters(var36, 100, 100);
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("hi!", "hi!");
    var42.setLine(100);
    nu.staldal.xtree.Element var49 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var52 = var49.lookupAttribute("4444444444", "hi!");
    var49.addNamespaceMapping("", "4444444444");
    java.lang.String var56 = var49.getTextContent();
    var42.insertChild((nu.staldal.xtree.Node)var49, 0);
    var22.setDocumentLocator((org.xml.sax.Locator)var49);
    var22.startPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    var22.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException: ");
    var22.processingInstruction("nu.staldal.lagoon.core.LagoonException~ 4444444444", "nu.staldal.lagoon.core.LagoonException~ 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test427");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    org.apache.tools.ant.Project var9 = var0.getProject();
    org.apache.tools.ant.Project var10 = var0.getProject();
    var0.setForce(false);
    java.lang.Object var13 = var0.clone();
    var0.log("nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__");
    var0.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test428");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setDescription("4444444444");
    java.lang.String var3 = var0.getTaskName();
    var0.log("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", 2);
    java.lang.String var7 = var0.getTaskName();
    var0.log("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.core.LagoonException var12 = new nu.staldal.lagoon.core.LagoonException("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    java.lang.Throwable[] var13 = var12.getSuppressed();
    java.lang.Throwable[] var14 = var12.getSuppressed();
    java.lang.String var15 = var12.toString();
    var0.log("nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________", (java.lang.Throwable)var12, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var15.equals("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test429");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    nu.staldal.xmlutil.DocumentHandlerAdapter var23 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var27 = var26.getLineNumber();
    var26.setPublicId("");
    java.lang.String var32 = var26.getInheritedAttribute("", "4444444444");
    int var33 = var26.numberOfChildren();
    var23.setDocumentLocator((org.xml.sax.Locator)var26);
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    var37.setSystemId("");
    java.net.URL var40 = var37.getBaseURI();
    java.lang.String var43 = var37.getAttrValueOrNull("", "");
    java.lang.String var44 = var37.getTextContent();
    boolean var45 = var37.getPreserveSpace();
    int var46 = var37.getLineNumber();
    var26.addChild((nu.staldal.xtree.Node)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test430");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    nu.staldal.xtree.TreeBuilder var4 = new nu.staldal.xtree.TreeBuilder();
    var4.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var9 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4, false, false);
    var4.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var14 = new nu.staldal.xtree.Element("hi!", "hi!");
    var14.setLine(100);
    int var17 = var14.numberOfNamespaceMappings();
    var4.setDocumentLocator((org.xml.sax.Locator)var14);
    var4.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var3.toSAX((org.xml.sax.ContentHandler)var4);
    var4.startPrefixMapping("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var26 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4, true);
    nu.staldal.xtree.Element var31 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var34 = var31.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var35 = new nu.staldal.xtree.TreeBuilder();
    var31.toSAX((org.xml.sax.ContentHandler)var35);
    var26.setDocumentLocator((org.xml.sax.Locator)var31);
    nu.staldal.xmlutil.ContentHandlerAdapter var38 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var26.endElement("nu.staldal.ftp.FTPException: hi!", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", "nu.staldal.ftp.FTPException:  ");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test431");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.Object var8 = var0.clone();
    var0.init();
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    var10.setPassword("");
    var10.setForce(false);
    org.apache.tools.ant.Target var15 = var10.getOwningTarget();
    var10.maybeConfigure();
    var10.log("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.bindToOwner((org.apache.tools.ant.Task)var10);
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var23 = new nu.staldal.ftp.FTPException("hi!");
    var20.log("", (java.lang.Throwable)var23, 10);
    org.apache.tools.ant.Location var26 = var20.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var27 = var20.getRuntimeConfigurableWrapper();
    var20.setForce(false);
    org.apache.tools.ant.Location var30 = var20.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var31 = var20.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Location var32 = var20.getLocation();
    var0.bindToOwner((org.apache.tools.ant.Task)var20);
    var0.reconfigure();
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test432");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.setTaskType("4444444444");
    var0.maybeConfigure();
    var0.setTargetURL("");
    var0.setDescription("nu.staldal.lagoon.core.LagoonException: ");
    var0.log("4");
    var0.setTaskName("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    var17.bindToOwner((org.apache.tools.ant.Task)var18);
    var17.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    var22.setPassword("");
    var17.bindToOwner((org.apache.tools.ant.Task)var22);
    org.apache.tools.ant.Project var26 = var17.getProject();
    org.apache.tools.ant.Project var27 = var17.getProject();
    org.apache.tools.ant.Location var28 = var17.getLocation();
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var30 = new nu.staldal.lagoon.LagoonAntTask();
    var29.bindToOwner((org.apache.tools.ant.Task)var30);
    var30.log("hi!");
    java.lang.String var34 = var30.getTaskName();
    var30.init();
    org.apache.tools.ant.Location var36 = var30.getLocation();
    var17.setLocation(var36);
    org.apache.tools.ant.Location var38 = var17.getLocation();
    var17.log("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!", 2);
    var0.bindToOwner((org.apache.tools.ant.Task)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test433");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    java.lang.String var6 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var10 = new nu.staldal.ftp.FTPException("hi!");
    var7.log("", (java.lang.Throwable)var10, 10);
    org.apache.tools.ant.Location var13 = var7.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var14 = var7.getRuntimeConfigurableWrapper();
    var7.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var20 = new nu.staldal.ftp.FTPException("hi!");
    var17.log("", (java.lang.Throwable)var20, 10);
    org.apache.tools.ant.Project var23 = var17.getProject();
    nu.staldal.lagoon.util.TemplateException var25 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var26 = var25.getException();
    var17.log("", (java.lang.Throwable)var25, (-1));
    var7.bindToOwner((org.apache.tools.ant.Task)var17);
    org.apache.tools.ant.Location var30 = var17.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var31 = var17.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var31);
    java.lang.String var33 = var0.getDescription();
    var0.init();
    nu.staldal.lagoon.LagoonAntTask var35 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    var35.bindToOwner((org.apache.tools.ant.Task)var36);
    var0.bindToOwner((org.apache.tools.ant.Task)var36);
    org.apache.tools.ant.Location var39 = var36.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test434");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setTaskType("nu.staldal.lagoon.util.TemplateException");
    var0.setDescription("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test435");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.log("");
    java.lang.Object var5 = var0.clone();
    nu.staldal.lagoon.LagoonAntTask var6 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var9 = new nu.staldal.ftp.FTPException("hi!");
    var6.log("", (java.lang.Throwable)var9, 10);
    org.apache.tools.ant.Location var12 = var6.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var13 = var6.getRuntimeConfigurableWrapper();
    var6.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var16 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var19 = new nu.staldal.ftp.FTPException("hi!");
    var16.log("", (java.lang.Throwable)var19, 10);
    org.apache.tools.ant.Project var22 = var16.getProject();
    nu.staldal.lagoon.util.TemplateException var24 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var25 = var24.getException();
    var16.log("", (java.lang.Throwable)var24, (-1));
    var6.bindToOwner((org.apache.tools.ant.Task)var16);
    org.apache.tools.ant.Location var29 = var16.getLocation();
    var0.setLocation(var29);
    nu.staldal.lagoon.LagoonAntTask var31 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var34 = new nu.staldal.ftp.FTPException("hi!");
    var31.log("", (java.lang.Throwable)var34, 10);
    org.apache.tools.ant.Location var37 = var31.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var38 = var31.getRuntimeConfigurableWrapper();
    var31.setForce(false);
    org.apache.tools.ant.Location var41 = var31.getLocation();
    nu.staldal.lagoon.core.LagoonException var43 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var44 = var43.toString();
    var31.log((java.lang.Throwable)var43, 100);
    org.apache.tools.ant.Location var47 = var31.getLocation();
    var0.setLocation(var47);
    var0.maybeConfigure();
    java.lang.String var50 = var0.getTaskName();
    var0.setTargetURL("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var44.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test436");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var10 = var4.lookupNamespaceURI("4444444444");
    java.lang.String var12 = var4.lookupNamespacePrefix("4444444444");
    var4.setColumn(1);
    java.lang.String var15 = var4.getTextContent();
    java.lang.String var17 = var4.getAttrValueOrNull("44");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test437");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    int var4 = var0.getPosition();
    int var5 = var0.getPosition();
    var0.init();
    var0.endPrefixMapping("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    int var9 = var0.getPosition();
    var0.init();
    var0.endPrefixMapping("nu__46__staldal__46__lagoon__46__util__46__TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test438");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.setTaskType("hi!");
    java.lang.String var8 = var1.getTaskType();
    var1.log("nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    java.lang.String var12 = var1.getDescription();
    var1.init();
    var1.log("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test439");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var2.addAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_", "hi!");
    java.lang.String var8 = var2.getTextContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test440");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    int var13 = var4.lookupAttribute("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String var14 = var4.getPublicId();
    var4.setPublicId("nu.staldal.ftp.FTPException: hi!");
    boolean var17 = var4.isWhitespaceNode();
    java.lang.String var18 = var4.getTextContentOrNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test441");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    java.lang.String var6 = var0.getDescription();
    var0.setTargetURL("hi!");
    var0.setTaskType("4444444444");
    var0.setTaskName("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var16 = new nu.staldal.ftp.FTPException("hi!");
    var13.log("", (java.lang.Throwable)var16, 10);
    org.apache.tools.ant.Project var19 = var13.getProject();
    nu.staldal.lagoon.util.TemplateException var21 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var22 = var21.getException();
    var13.log("", (java.lang.Throwable)var21, (-1));
    var13.setPassword("nu.staldal.lagoon.util.TemplateException: ");
    var13.maybeConfigure();
    org.apache.tools.ant.Location var28 = var13.getLocation();
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    var29.setPassword("");
    var29.log("");
    var13.bindToOwner((org.apache.tools.ant.Task)var29);
    var0.bindToOwner((org.apache.tools.ant.Task)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test442");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.beforeBuild();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.hasBeenUpdated(1433461963000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test443");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    boolean var16 = var2.getPreserveSpace();
    boolean var17 = var2.getPreserveSpace();
    java.lang.String var20 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    boolean var21 = var2.isWhitespaceNode();
    int var22 = var2.getLineNumber();
    var2.setSystemId("####################################################################################################");
    int var25 = var2.numberOfAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test444");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.String var8 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var12 = new nu.staldal.ftp.FTPException("hi!");
    var9.log("", (java.lang.Throwable)var12, 10);
    org.apache.tools.ant.Project var15 = var9.getProject();
    var0.bindToOwner((org.apache.tools.ant.Task)var9);
    java.lang.Object var17 = var0.clone();
    var0.init();
    var0.setTargetURL("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ");
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test445");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("hi_33_");
    var0.destroy();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.hasBeenUpdated(1433461933000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test446");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("", "4444444444", 100);
    int var13 = var12.numberOfChildren();
    java.lang.String var16 = var12.getInheritedAttribute("4444444444", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var18 = var12.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    int var19 = var12.getColumnNumber();
    var2.addChild((nu.staldal.xtree.Node)var12);
    nu.staldal.xtree.Element var21 = var2.getFirstChildElement();
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.setSystemId("");
    java.net.URL var27 = var24.getBaseURI();
    java.lang.String var30 = var24.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var33 = new nu.staldal.xtree.Element("hi!", "hi!");
    var33.addNamespaceMapping("", "");
    var24.addChild((nu.staldal.xtree.Node)var33);
    var24.setSystemId("");
    java.lang.String var40 = var24.getPublicId();
    int var41 = var24.getLineNumber();
    java.lang.String var42 = var24.getPublicId();
    int var43 = var24.getColumnNumber();
    nu.staldal.lagoon.producer.BasicSplit var44 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var46 = new nu.staldal.xtree.Text("hi!");
    char[] var47 = var46.asCharArray();
    var44.characters(var47, 1, 10);
    var44.endElement("", "hi!", "hi!");
    var44.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var58 = new nu.staldal.xtree.Text("");
    char[] var59 = var58.asCharArray();
    char[] var60 = var58.asCharArray();
    char[] var61 = var58.asCharArray();
    var44.characters(var61, 10, 0);
    var24.outputStartElement((org.xml.sax.ContentHandler)var44);
    var21.outputStartElement((org.xml.sax.ContentHandler)var44);
    boolean var67 = var21.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test447");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    var22.startDocument();
    var22.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.producer.IslandSplit var36 = new nu.staldal.lagoon.producer.IslandSplit();
    var36.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var39 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var36, true);
    char[] var42 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var46 = new nu.staldal.xtree.Text(var42, 1, 0, false);
    var39.setDocumentLocator((org.xml.sax.Locator)var46);
    java.lang.String var49 = var46.lookupNamespacePrefix("                                                                                                    ");
    var22.setDocumentLocator((org.xml.sax.Locator)var46);
    nu.staldal.lagoon.producer.BasicSplit var51 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var53 = new nu.staldal.xtree.Text("hi!");
    char[] var54 = var53.asCharArray();
    var51.characters(var54, 1, 10);
    var51.endElement("", "hi!", "hi!");
    var51.processingInstruction("", "hi!");
    var51.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var51.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var69 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var51);
    var51.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var46.toSAX((org.xml.sax.ContentHandler)var51);
    nu.staldal.xtree.Element var75 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var76 = var75.getLineNumber();
    var75.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var82 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var83 = var82.getLineNumber();
    var82.addNamespaceMapping("", "");
    var75.addChild((nu.staldal.xtree.Node)var82);
    nu.staldal.xtree.NodeWithChildren var88 = var75.getParent();
    nu.staldal.xtree.Element var91 = var75.getFirstChildElementOrNull("hi!", "4444444444");
    int var92 = var75.numberOfNamespaceMappings();
    java.lang.String var94 = var75.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var51.setDocumentLocator((org.xml.sax.Locator)var75);
    java.lang.String var96 = var75.getTextContentOrNull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var99 = var75.getAttrValue("nu.staldal.ftp.FTPException~~~~ hi!", "nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var96);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test448");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var2 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var13 = var12.getLineNumber();
    var12.addNamespaceMapping("", "");
    var5.addChild((nu.staldal.xtree.Node)var12);
    nu.staldal.xtree.NodeWithChildren var18 = var5.getParent();
    boolean var19 = var5.getPreserveSpace();
    var2.setDocumentLocator((org.xml.sax.Locator)var5);
    java.lang.String var22 = var5.lookupNamespaceURI("");
    nu.staldal.xtree.Element var23 = var5.getFirstChildElementOrNull();
    java.lang.String var24 = var5.getPublicId();
    int var25 = var5.getColumnNumber();
    java.lang.String var26 = var5.getSystemId();
    java.net.URL var27 = var5.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test449");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    java.lang.String var4 = var3.getLocalName();
    java.lang.String var6 = var3.getAttrValueOrNull("4444444444");
    var3.addAttribute("          ", "                                                                                                    ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "hi!");
    java.lang.String var14 = var3.getInheritedAttribute("_52_", "nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test450");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.log("nu.staldal.lagoon.util.TemplateException", 0);
    var0.maybeConfigure();
    org.apache.tools.ant.Target var10 = var0.getOwningTarget();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test451");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var8.setDocumentLocator((org.xml.sax.Locator)var16);
    nu.staldal.xtree.Element var18 = var8.getTree();
    java.lang.String var19 = var18.getTextContent();
    nu.staldal.xtree.TreeBuilder var20 = new nu.staldal.xtree.TreeBuilder();
    var20.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var26 = var25.getLineNumber();
    var25.setPublicId("");
    int var29 = var25.getLineNumber();
    var20.setDocumentLocator((org.xml.sax.Locator)var25);
    var20.startDocument();
    var20.skippedEntity("                                                                                                    ");
    var20.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.xtree.Element var39 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var40 = var39.getLineNumber();
    var39.setPublicId("");
    int var43 = var39.getLineNumber();
    java.lang.String var45 = var39.lookupNamespacePrefix("hi_33_");
    java.lang.String var48 = var39.getAttrValueOrNull("", "4444444444");
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    var39.addChild((nu.staldal.xtree.Node)var52);
    var20.setDocumentLocator((org.xml.sax.Locator)var39);
    var18.outputStartElement((org.xml.sax.ContentHandler)var20);
    var20.startDocument();
    var20.startDocument();
    var20.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test452");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    java.lang.String var2 = var0.getDescription();
    var0.reconfigure();
    var0.setForce(false);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.Location var7 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test453");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var23 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, false);
    var0.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.lagoon.core.XMLStreamProducer var27 = var0.getNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.init();
      fail("Expected exception of type nu.staldal.lagoon.core.LagoonException");
    } catch (nu.staldal.lagoon.core.LagoonException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test454");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    var0.startPrefixMapping("4444444444", "                                                                                                    ");
    nu.staldal.xtree.Element var17 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException~~ ", 10, 100);
    var0.setDocumentLocator((org.xml.sax.Locator)var17);
    nu.staldal.lagoon.producer.BasicSplit var19 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text("hi!");
    char[] var22 = var21.asCharArray();
    var19.characters(var22, 1, 10);
    var19.endElement("", "hi!", "hi!");
    var19.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var32 = new nu.staldal.lagoon.producer.IslandSplit();
    var32.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var35 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var32, true);
    char[] var38 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var42 = new nu.staldal.xtree.Text(var38, 1, 0, false);
    var35.setDocumentLocator((org.xml.sax.Locator)var42);
    char[] var44 = var42.asCharArray();
    var19.characters(var44, 10, 0);
    var19.processingInstruction("hi!", "hi!");
    nu.staldal.lagoon.core.XMLStreamProducer var51 = var19.getNext();
    var17.outputEndElement((org.xml.sax.ContentHandler)var19);
    var19.processingInstruction("nu__46__staldal__46__lagoon__46__util__46__TemplateException__126____32__", "nu.staldal.lagoon.util.TemplateException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test455");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.setLine(100);
    java.lang.String var28 = var24.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.net.URL var29 = var24.getBaseURI();
    var18.setDocumentLocator((org.xml.sax.Locator)var24);
    nu.staldal.xtree.Element var33 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var34 = var33.getLineNumber();
    var33.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var40 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var41 = var40.getLineNumber();
    var40.addNamespaceMapping("", "");
    var33.addChild((nu.staldal.xtree.Node)var40);
    nu.staldal.xtree.NodeWithChildren var46 = var33.getParent();
    java.lang.String var47 = var33.getNamespaceURI();
    var18.setDocumentLocator((org.xml.sax.Locator)var33);
    int var49 = var33.numberOfChildren();
    boolean var50 = var33.getPreserveSpace();
    var33.setSystemId("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var53 = var33.getNamespaceURI();
    nu.staldal.lagoon.producer.IslandSplit var54 = new nu.staldal.lagoon.producer.IslandSplit();
    var54.destroy();
    var54.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var57 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var54);
    java.lang.String var59 = var54.getParam("");
    java.lang.String var60 = var54.getEntryName();
    var54.init();
    nu.staldal.xmlutil.ContentHandlerFixer var62 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var33.outputEndElement((org.xml.sax.ContentHandler)var62);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test456");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var8 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var0.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.endPrefixMapping("nu__46__staldal__46__ftp__46__FTPException__126____32__hi__33__");

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test457");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var6 = new nu.staldal.ftp.FTPException("hi!");
    var3.log("", (java.lang.Throwable)var6, 10);
    org.apache.tools.ant.Location var9 = var3.getLocation();
    var0.setLocation(var9);
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var14 = new nu.staldal.ftp.FTPException("hi!");
    var11.log("", (java.lang.Throwable)var14, 10);
    org.apache.tools.ant.Location var17 = var11.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var18 = var11.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var18);
    java.lang.Object var20 = var0.clone();
    org.apache.tools.ant.Project var21 = var0.getProject();
    var0.setDescription("nu.staldal.lagoon.core.LagoonException~~ hi____33____");
    org.apache.tools.ant.Location var24 = var0.getLocation();
    var0.setDescription("__35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test458");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setSystemId("hi!");
    java.lang.String var6 = var2.getNamespaceURI();
    java.net.URL var7 = var2.getBaseURI();
    java.lang.String var8 = var2.getNamespaceURI();
    boolean var9 = var2.isWhitespaceNode();
    int var10 = var2.numberOfChildren();
    java.lang.String var11 = var2.getPublicId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test459");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.core.LagoonException var9 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var0.log("4444444444", (java.lang.Throwable)var9, 100);
    nu.staldal.lagoon.util.TemplateException var12 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var9);
    java.lang.String var13 = var12.toString();
    java.lang.Exception var14 = var12.getException();
    nu.staldal.lagoon.util.TemplateException var15 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var13.equals("nu.staldal.lagoon.util.TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test460");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    java.lang.String var8 = var2.getInheritedAttribute("", "4444444444");
    int var9 = var2.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var10 = new nu.staldal.xtree.TreeBuilder();
    var10.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var15 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var10, false, false);
    var2.toSAX((org.xml.sax.ContentHandler)var15);
    boolean var17 = var2.getPreserveSpace();
    java.lang.String var18 = var2.getSystemId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test461");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    nu.staldal.lagoon.LagoonAntTask var6 = new nu.staldal.lagoon.LagoonAntTask();
    var6.setPassword("");
    java.lang.String var9 = var6.getDescription();
    java.lang.String var10 = var6.getTaskName();
    var6.init();
    org.apache.tools.ant.Location var12 = var6.getLocation();
    var1.setLocation(var12);
    java.lang.Object var14 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test462");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    char[] var18 = var14.asCharArray();
    var0.ignorableWhitespace(var18, 1, 100);
    nu.staldal.xmlutil.ContentHandlerFixer var22 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var0.endElement("nu.staldal.lagoon.util.TemplateException: hi_33_", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "          ");
    int var27 = var0.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test463");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    var8.endPrefixMapping("hi!");
    var8.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var16 = new nu.staldal.xtree.Text("");
    char[] var17 = var16.asCharArray();
    char[] var18 = var16.asCharArray();
    var8.setDocumentLocator((org.xml.sax.Locator)var16);
    var8.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.endElement("nu.staldal.lagoon.core.LagoonException~ 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test464");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    java.lang.String var16 = var2.getNamespaceURI();
    java.net.URL var17 = var2.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var19 = var2.getAttributeType(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test465");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var2 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var13 = var12.getLineNumber();
    var12.addNamespaceMapping("", "");
    var5.addChild((nu.staldal.xtree.Node)var12);
    nu.staldal.xtree.NodeWithChildren var18 = var5.getParent();
    boolean var19 = var5.getPreserveSpace();
    var2.setDocumentLocator((org.xml.sax.Locator)var5);
    java.lang.String var22 = var5.lookupNamespaceURI("");
    var5.setColumn(1);
    int var25 = var5.numberOfNamespaceMappings();
    boolean var26 = var5.getPreserveSpace();
    nu.staldal.xtree.Text var28 = new nu.staldal.xtree.Text("");
    char[] var29 = var28.asCharArray();
    char[] var30 = var28.asCharArray();
    char[] var31 = var28.asCharArray();
    boolean var32 = var28.isWhitespaceNode();
    nu.staldal.lagoon.producer.BasicSplit var33 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var35 = new nu.staldal.xtree.Text("hi!");
    char[] var36 = var35.asCharArray();
    var33.characters(var36, 1, 10);
    var33.endElement("", "hi!", "hi!");
    var33.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var47 = new nu.staldal.xtree.Text("");
    char[] var48 = var47.asCharArray();
    char[] var49 = var47.asCharArray();
    char[] var50 = var47.asCharArray();
    var33.characters(var50, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var54 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var33);
    nu.staldal.xmlutil.DocumentHandlerAdapter var55 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var54);
    nu.staldal.xtree.Element var58 = new nu.staldal.xtree.Element("hi!", "hi!");
    var58.setSystemId("");
    java.net.URL var61 = var58.getBaseURI();
    java.lang.String var64 = var58.getAttrValueOrNull("", "");
    var55.setDocumentLocator((org.xml.sax.Locator)var58);
    var55.startDocument();
    char[] var67 = new char[] { };
    var55.characters(var67, 100, (-1));
    var55.startDocument();
    nu.staldal.xtree.Element var74 = new nu.staldal.xtree.Element("hi!", "hi!");
    var74.setSystemId("");
    java.net.URL var77 = var74.getBaseURI();
    java.lang.String var80 = var74.getAttrValueOrNull("", "");
    java.lang.String var81 = var74.getTextContent();
    var74.setColumn(100);
    java.lang.String var84 = var74.getTextContent();
    var55.setDocumentLocator((org.xml.sax.Locator)var74);
    var55.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var28.toSAX((org.xml.sax.ContentHandler)var55);
    var55.startPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.outputEndElement((org.xml.sax.ContentHandler)var55);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + ""+ "'", var81.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + ""+ "'", var84.equals(""));

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test466");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var3 = var2.getPreserveSpace();
    var2.addAttribute("hi_33_", "nu.staldal.lagoon.core.LagoonException: ", "4444444444", "4444444444");
    java.lang.String var10 = var2.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var11 = var2.getColumnNumber();
    java.lang.String var13 = var2.lookupNamespacePrefix("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test467");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.maybeConfigure();
    var0.log("4444444444", 1);
    var0.setTargetURL("hi_33_");
    var0.setForce(false);
    org.apache.tools.ant.Target var9 = var0.getOwningTarget();
    var0.setPassword("                                                                                                    ");
    java.lang.String var12 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test468");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    java.lang.String var20 = var11.getAttrValueOrNull("4444444444");
    var11.setPublicId("aa");
    var11.addNamespaceMapping("_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    int var26 = var11.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test469");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: "+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test470");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setDescription("4444444444");
    var0.init();
    nu.staldal.lagoon.core.AuthenticationException var4 = new nu.staldal.lagoon.core.AuthenticationException();
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var8 = new nu.staldal.ftp.FTPException("hi!");
    var5.log("", (java.lang.Throwable)var8, 10);
    var5.init();
    var5.init();
    java.lang.Object var13 = var5.clone();
    var5.init();
    java.lang.Object var15 = var5.clone();
    nu.staldal.lagoon.core.LagoonException var17 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var18 = var17.toString();
    var5.log((java.lang.Throwable)var17, 10);
    java.lang.Throwable[] var21 = var17.getSuppressed();
    var4.addSuppressed((java.lang.Throwable)var17);
    var0.log((java.lang.Throwable)var17, (-1));
    java.lang.String var25 = var17.toString();
    java.lang.Exception var26 = var17.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var18.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var25.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test471");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var0.skippedEntity("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    nu.staldal.xtree.Element var15 = new nu.staldal.xtree.Element("hi!", "hi!");
    var15.setSystemId("");
    java.net.URL var18 = var15.getBaseURI();
    java.lang.String var21 = var15.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.addNamespaceMapping("", "");
    var15.addChild((nu.staldal.xtree.Node)var24);
    var24.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var24.setLine(1);
    java.lang.String var37 = var24.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~ ");
    var24.setLine(100);
    java.lang.String var41 = var24.lookupNamespaceURI("          ");
    var0.setDocumentLocator((org.xml.sax.Locator)var24);
    var0.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    var0.endDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test472");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    var0.startPrefixMapping("4444444444", "                                                                                                    ");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.endElement("##", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test473");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.Object var8 = var0.clone();
    var0.init();
    var0.setDescription("hi!");
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    var12.bindToOwner((org.apache.tools.ant.Task)var13);
    var12.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    var17.setPassword("");
    var12.bindToOwner((org.apache.tools.ant.Task)var17);
    org.apache.tools.ant.Project var21 = var12.getProject();
    org.apache.tools.ant.Project var22 = var12.getProject();
    org.apache.tools.ant.Location var23 = var12.getLocation();
    nu.staldal.lagoon.LagoonAntTask var24 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var25 = new nu.staldal.lagoon.LagoonAntTask();
    var24.bindToOwner((org.apache.tools.ant.Task)var25);
    var25.log("hi!");
    java.lang.String var29 = var25.getTaskName();
    var25.init();
    org.apache.tools.ant.Location var31 = var25.getLocation();
    var12.setLocation(var31);
    var12.setTaskType("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.lagoon.LagoonAntTask var35 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var38 = new nu.staldal.ftp.FTPException("hi!");
    var35.log("", (java.lang.Throwable)var38, 10);
    org.apache.tools.ant.Location var41 = var35.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var42 = var35.getRuntimeConfigurableWrapper();
    var35.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var45 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var48 = new nu.staldal.ftp.FTPException("hi!");
    var45.log("", (java.lang.Throwable)var48, 10);
    org.apache.tools.ant.Project var51 = var45.getProject();
    nu.staldal.lagoon.util.TemplateException var53 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var54 = var53.getException();
    var45.log("", (java.lang.Throwable)var53, (-1));
    var35.bindToOwner((org.apache.tools.ant.Task)var45);
    org.apache.tools.ant.Location var58 = var45.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var59 = var45.getRuntimeConfigurableWrapper();
    var45.setForce(true);
    java.lang.String var62 = var45.getTaskName();
    var12.bindToOwner((org.apache.tools.ant.Task)var45);
    var12.setDescription("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    var0.bindToOwner((org.apache.tools.ant.Task)var12);
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test474");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var2 = var1.isWhitespaceNode();
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    var5.setSystemId("");
    java.net.URL var8 = var5.getBaseURI();
    java.lang.String var11 = var5.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var14 = new nu.staldal.xtree.Element("hi!", "hi!");
    var14.addNamespaceMapping("", "");
    var5.addChild((nu.staldal.xtree.Node)var14);
    java.lang.String var21 = var14.getInheritedAttribute("", "hi!");
    int var22 = var14.getColumnNumber();
    char[] var25 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var29 = new nu.staldal.xtree.Text(var25, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var30 = new nu.staldal.xtree.TreeBuilder();
    var30.endPrefixMapping("hi!");
    var30.endDocument();
    var30.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var29.toSAX((org.xml.sax.ContentHandler)var30);
    var30.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var30.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    var14.toSAX((org.xml.sax.ContentHandler)var30);
    var30.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    nu.staldal.xtree.Element var49 = new nu.staldal.xtree.Element("", "4444444444", 100);
    int var50 = var49.numberOfChildren();
    int var51 = var49.numberOfAttributes();
    var30.setDocumentLocator((org.xml.sax.Locator)var49);
    var1.toSAX((org.xml.sax.ContentHandler)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test475");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 1);
    var3.setPublicId("nu.staldal.lagoon.core.LagoonException: ");
    int var6 = var3.numberOfChildren();
    nu.staldal.lagoon.producer.BasicSplit var7 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var9 = new nu.staldal.xtree.Text("hi!");
    char[] var10 = var9.asCharArray();
    var7.characters(var10, 1, 10);
    var7.endElement("", "hi!", "hi!");
    var7.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text("");
    char[] var22 = var21.asCharArray();
    char[] var23 = var21.asCharArray();
    char[] var24 = var21.asCharArray();
    var7.characters(var24, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var30 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var7, true, false);
    var30.processingInstruction("nu.staldal.lagoon.core.LagoonException~ ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.lagoon.producer.BasicSplit var34 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var36 = new nu.staldal.xtree.Text("hi!");
    char[] var37 = var36.asCharArray();
    var34.characters(var37, 1, 10);
    var34.endElement("", "hi!", "hi!");
    var34.processingInstruction("", "hi!");
    var34.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var34.startDocument();
    var34.skippedEntity("4444444444");
    var34.skippedEntity("hi!");
    var34.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException: ");
    char[] var61 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var65 = new nu.staldal.xtree.Text(var61, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var66 = new nu.staldal.xtree.TreeBuilder();
    var66.endPrefixMapping("hi!");
    var66.endDocument();
    var66.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var65.toSAX((org.xml.sax.ContentHandler)var66);
    var66.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    char[] var79 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var83 = new nu.staldal.xtree.Text(var79, 1, 0, false);
    char[] var84 = var83.asCharArray();
    var66.ignorableWhitespace(var84, 10, 10);
    var34.ignorableWhitespace(var84, 100, 0);
    var30.characters(var84, 1, 1);
    var3.toSAX((org.xml.sax.ContentHandler)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test476");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    var22.startDocument();
    var22.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.producer.IslandSplit var36 = new nu.staldal.lagoon.producer.IslandSplit();
    var36.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var39 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var36, true);
    char[] var42 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var46 = new nu.staldal.xtree.Text(var42, 1, 0, false);
    var39.setDocumentLocator((org.xml.sax.Locator)var46);
    java.lang.String var49 = var46.lookupNamespacePrefix("                                                                                                    ");
    var22.setDocumentLocator((org.xml.sax.Locator)var46);
    char[] var51 = var46.asCharArray();
    nu.staldal.xtree.TreeBuilder var52 = new nu.staldal.xtree.TreeBuilder();
    var52.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var57 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var52, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var59 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var52, false);
    var46.toSAX((org.xml.sax.ContentHandler)var52);
    nu.staldal.xmlutil.ContentHandlerAdapter var61 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var52);
    var61.startDocument();
    var61.endDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test477");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("##########");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "_35__35__35__35__35__35__35__35__35__35_"+ "'", var1.equals("_35__35__35__35__35__35__35__35__35__35_"));

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test478");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.setTaskType("4444444444");
    var0.maybeConfigure();
    var0.setTargetURL("");
    java.lang.Object var11 = var0.clone();
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var15 = new nu.staldal.ftp.FTPException("hi!");
    var12.log("", (java.lang.Throwable)var15, 10);
    java.lang.String var18 = var12.getDescription();
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var22 = new nu.staldal.ftp.FTPException("hi!");
    var19.log("", (java.lang.Throwable)var22, 10);
    org.apache.tools.ant.Location var25 = var19.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var26 = var19.getRuntimeConfigurableWrapper();
    var19.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var32 = new nu.staldal.ftp.FTPException("hi!");
    var29.log("", (java.lang.Throwable)var32, 10);
    org.apache.tools.ant.Project var35 = var29.getProject();
    nu.staldal.lagoon.util.TemplateException var37 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var38 = var37.getException();
    var29.log("", (java.lang.Throwable)var37, (-1));
    var19.bindToOwner((org.apache.tools.ant.Task)var29);
    org.apache.tools.ant.Location var42 = var29.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var43 = var29.getRuntimeConfigurableWrapper();
    var12.setRuntimeConfigurableWrapper(var43);
    org.apache.tools.ant.RuntimeConfigurable var45 = var12.getRuntimeConfigurableWrapper();
    var12.setPassword("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.bindToOwner((org.apache.tools.ant.Task)var12);
    var0.init();
    java.lang.String var50 = var0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test479");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.core.LagoonContext var9 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test480");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var8.setDocumentLocator((org.xml.sax.Locator)var16);
    var8.startDocument();
    nu.staldal.xtree.Element var19 = var8.getTree();
    var8.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~ ");
    var8.endDocument();
    var8.endDocument();
    nu.staldal.lagoon.producer.BasicSplit var25 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var27 = new nu.staldal.xtree.Text("hi!");
    char[] var28 = var27.asCharArray();
    var25.characters(var28, 1, 10);
    var25.endElement("", "hi!", "hi!");
    var25.processingInstruction("", "hi!");
    var25.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var25.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var43 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var25);
    var43.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.DocumentHandlerAdapter var47 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var43);
    nu.staldal.xtree.Text var49 = new nu.staldal.xtree.Text("4444444444");
    var47.setDocumentLocator((org.xml.sax.Locator)var49);
    var47.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.xtree.Text var54 = new nu.staldal.xtree.Text("");
    char[] var55 = var54.asCharArray();
    boolean var56 = var54.isWhitespaceNode();
    char[] var57 = var54.asCharArray();
    boolean var58 = var54.getPreserveSpace();
    char[] var59 = var54.asCharArray();
    var47.characters(var59, (-1), 1);
    var8.ignorableWhitespace(var59, 10, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test481");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    boolean var16 = var2.getPreserveSpace();
    boolean var17 = var2.getPreserveSpace();
    java.lang.String var20 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var22 = var2.lookupNamespaceURI("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var25 = var2.getAttrValue("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!", "nu.staldal.ftp.FTPException~~ hi!");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test482");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.Object var8 = var0.clone();
    var0.init();
    var0.setDescription("hi!");
    var0.log("4444444444", 100);
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var18 = new nu.staldal.ftp.FTPException("hi!");
    var15.log("", (java.lang.Throwable)var18, 10);
    org.apache.tools.ant.Location var21 = var15.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var22 = var15.getRuntimeConfigurableWrapper();
    var15.setForce(false);
    org.apache.tools.ant.Location var25 = var15.getLocation();
    var15.log("nu.staldal.lagoon.util.TemplateException", (-1));
    var15.reconfigure();
    var0.bindToOwner((org.apache.tools.ant.Task)var15);
    java.lang.Object var31 = var0.clone();
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test483");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.setTaskType("4444444444");
    var0.log("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", 0);
    var0.setTargetURL("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    var0.init();
    nu.staldal.lagoon.LagoonAntTask var14 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var17 = new nu.staldal.ftp.FTPException("hi!");
    var14.log("", (java.lang.Throwable)var17, 10);
    var14.init();
    var14.init();
    java.lang.String var22 = var14.getDescription();
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var26 = new nu.staldal.ftp.FTPException("hi!");
    var23.log("", (java.lang.Throwable)var26, 10);
    org.apache.tools.ant.Project var29 = var23.getProject();
    var14.bindToOwner((org.apache.tools.ant.Task)var23);
    var23.setTaskType("nu.staldal.lagoon.core.LagoonException: ");
    var23.setTargetURL("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var23.setPassword("nu.staldal.lagoon.core.AuthenticationMissingException");
    var0.bindToOwner((org.apache.tools.ant.Task)var23);
    var23.maybeConfigure();
    var23.setPassword("nu.staldal.lagoon.core.LagoonException~ ");
    nu.staldal.lagoon.LagoonAntTask var42 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var45 = new nu.staldal.ftp.FTPException("hi!");
    var42.log("", (java.lang.Throwable)var45, 10);
    org.apache.tools.ant.Location var48 = var42.getLocation();
    nu.staldal.lagoon.core.LagoonException var51 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var42.log("4444444444", (java.lang.Throwable)var51, 100);
    java.lang.String var54 = var51.toString();
    nu.staldal.lagoon.LagoonAntTask var55 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var58 = new nu.staldal.ftp.FTPException("hi!");
    var55.log("", (java.lang.Throwable)var58, 10);
    org.apache.tools.ant.Project var61 = var55.getProject();
    nu.staldal.lagoon.util.TemplateException var63 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var64 = var63.getException();
    var55.log("", (java.lang.Throwable)var63, (-1));
    java.lang.Throwable[] var67 = var63.getSuppressed();
    java.lang.Throwable[] var68 = var63.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var70 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var71 = var70.toString();
    var63.addSuppressed((java.lang.Throwable)var70);
    var51.addSuppressed((java.lang.Throwable)var70);
    java.lang.String var74 = var70.toString();
    var23.log("nu.staldal.ftp.FTPException:                                                                                                     ", (java.lang.Throwable)var70, 2);
    java.lang.String var77 = var70.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var54.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var71.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var74.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var77.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test484");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test485");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 1);
    var3.addAttribute("hi!", "", "hi!", "");
    java.lang.String var11 = var3.getInheritedAttribute("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_");
    nu.staldal.xtree.ProcessingInstruction var14 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    java.lang.String var15 = var14.getValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.insertChild((nu.staldal.xtree.Node)var14, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "4444444444"+ "'", var15.equals("4444444444"));

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test486");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    int var3 = var2.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test487");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var2 = var1.toString();
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var4 = new nu.staldal.lagoon.LagoonAntTask();
    var3.bindToOwner((org.apache.tools.ant.Task)var4);
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var10 = new nu.staldal.ftp.FTPException("hi!");
    var7.log("", (java.lang.Throwable)var10, 10);
    org.apache.tools.ant.Location var13 = var7.getLocation();
    nu.staldal.lagoon.core.LagoonException var16 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var7.log("4444444444", (java.lang.Throwable)var16, 100);
    java.lang.String var19 = var16.toString();
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var23 = new nu.staldal.ftp.FTPException("hi!");
    var20.log("", (java.lang.Throwable)var23, 10);
    org.apache.tools.ant.Project var26 = var20.getProject();
    nu.staldal.lagoon.util.TemplateException var28 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var29 = var28.getException();
    var20.log("", (java.lang.Throwable)var28, (-1));
    java.lang.Throwable[] var32 = var28.getSuppressed();
    java.lang.Throwable[] var33 = var28.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var35 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var36 = var35.toString();
    var28.addSuppressed((java.lang.Throwable)var35);
    var16.addSuppressed((java.lang.Throwable)var35);
    var3.log("4444444444", (java.lang.Throwable)var35, (-1));
    java.lang.String var41 = var35.toString();
    nu.staldal.lagoon.util.TemplateException var42 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var35);
    java.lang.Exception var43 = var35.getException();
    var1.addSuppressed((java.lang.Throwable)var35);
    java.lang.String var45 = var35.toString();
    java.lang.String var46 = var35.toString();
    nu.staldal.lagoon.util.TemplateException var48 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    var35.addSuppressed((java.lang.Throwable)var48);
    java.lang.Exception var50 = var35.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var19.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var36.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var41.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var45.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var46.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test488");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    long var8 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.core.OutputHandler var10 = var0.createFile("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.core.OutputHandler var12 = var0.createFile("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
    boolean var13 = var0.needPassword();
    boolean var14 = var0.isReentrant();
    long var16 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    long var18 = var0.fileLastModified("nu.staldal.ftp.FTPException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462001000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1433461965000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0L);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test489");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.String var8 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var12 = new nu.staldal.ftp.FTPException("hi!");
    var9.log("", (java.lang.Throwable)var12, 10);
    org.apache.tools.ant.Project var15 = var9.getProject();
    var0.bindToOwner((org.apache.tools.ant.Task)var9);
    var9.setTaskType("nu.staldal.lagoon.core.LagoonException: ");
    var9.log("hi!");
    var9.init();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var25 = new nu.staldal.ftp.FTPException("hi!");
    var22.log("", (java.lang.Throwable)var25, 10);
    java.lang.String var28 = var22.getDescription();
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var32 = new nu.staldal.ftp.FTPException("hi!");
    var29.log("", (java.lang.Throwable)var32, 10);
    org.apache.tools.ant.Location var35 = var29.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var36 = var29.getRuntimeConfigurableWrapper();
    var29.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var39 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var42 = new nu.staldal.ftp.FTPException("hi!");
    var39.log("", (java.lang.Throwable)var42, 10);
    org.apache.tools.ant.Project var45 = var39.getProject();
    nu.staldal.lagoon.util.TemplateException var47 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var48 = var47.getException();
    var39.log("", (java.lang.Throwable)var47, (-1));
    var29.bindToOwner((org.apache.tools.ant.Task)var39);
    org.apache.tools.ant.Location var52 = var39.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var53 = var39.getRuntimeConfigurableWrapper();
    var22.setRuntimeConfigurableWrapper(var53);
    var9.setRuntimeConfigurableWrapper(var53);
    org.apache.tools.ant.Project var56 = var9.getProject();
    java.lang.String var57 = var9.getTaskType();
    var9.setTargetURL("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var57.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test490");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("a", "####################################################################################################");
    var2.setPublicId("hi!");
    int var5 = var2.numberOfAttributes();
    var2.setLine(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test491");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.String var8 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var12 = new nu.staldal.ftp.FTPException("hi!");
    var9.log("", (java.lang.Throwable)var12, 10);
    org.apache.tools.ant.Project var15 = var9.getProject();
    var0.bindToOwner((org.apache.tools.ant.Task)var9);
    var9.setTaskType("nu.staldal.lagoon.core.LagoonException: ");
    var9.setTargetURL("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    var21.bindToOwner((org.apache.tools.ant.Task)var22);
    var21.setForce(true);
    var21.init();
    var21.setForce(true);
    org.apache.tools.ant.Target var29 = var21.getOwningTarget();
    org.apache.tools.ant.RuntimeConfigurable var30 = var21.getRuntimeConfigurableWrapper();
    var9.setRuntimeConfigurableWrapper(var30);
    var9.log("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test492");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var5.startPrefixMapping("          ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var11 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, true, false);
    nu.staldal.xmlutil.ContentHandlerFixer var13 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.processingInstruction("hi__33__", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test493");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.ftp.FTPException~                                                                                                     ", "nu.staldal.ftp.FTPException:                                                                                                     ", (-1), 0);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test494");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    var0.characters(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var22 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    nu.staldal.xtree.Text var34 = new nu.staldal.xtree.Text("");
    char[] var35 = var34.asCharArray();
    char[] var36 = var34.asCharArray();
    var22.characters(var36, 100, 100);
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var43 = var42.getLineNumber();
    var42.setPublicId("");
    int var46 = var42.getLineNumber();
    java.lang.String var48 = var42.lookupNamespacePrefix("hi_33_");
    var22.setDocumentLocator((org.xml.sax.Locator)var42);
    var22.processingInstruction("", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.xmlutil.ContentHandlerAdapter var53 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var22);
    var22.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test495");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.init();
    java.lang.String var5 = var0.getEntryName();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.hasBeenUpdated(1433461929000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test496");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var18.processingInstruction("", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.setSystemId("");
    java.net.URL var27 = var24.getBaseURI();
    java.lang.String var30 = var24.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var33 = new nu.staldal.xtree.Element("hi!", "hi!");
    var33.addNamespaceMapping("", "");
    var24.addChild((nu.staldal.xtree.Node)var33);
    var18.setDocumentLocator((org.xml.sax.Locator)var24);
    var24.setPublicId("  ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test497");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    boolean var7 = var0.needPassword();
    long var9 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.close();
    nu.staldal.lagoon.core.OutputHandler var12 = var0.createFile("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462001000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1433461999000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test498");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    var0.skippedEntity("4444444444");
    var0.skippedEntity("hi!");
    var0.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException: ");
    var0.processingInstruction("", "hi_33_");
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~ ", "4444444444");
    java.lang.String var31 = var30.getTextContentOrNull();
    var0.setDocumentLocator((org.xml.sax.Locator)var30);
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("hi!", "hi!");
    var35.setSystemId("");
    java.net.URL var38 = var35.getBaseURI();
    java.lang.String var41 = var35.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var44 = new nu.staldal.xtree.Element("hi!", "hi!");
    var44.addNamespaceMapping("", "");
    var35.addChild((nu.staldal.xtree.Node)var44);
    var35.setSystemId("");
    var35.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var58 = var35.getAttrValueOrNull("4444444444", "4444444444");
    var35.addAttribute("hi!", "hi!", "", "hi!");
    java.net.URL var64 = var35.getBaseURI();
    nu.staldal.xtree.Node var66 = var35.getChild(0);
    java.lang.String var68 = var35.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.setDocumentLocator((org.xml.sax.Locator)var35);
    nu.staldal.xtree.Element var72 = var35.getFirstChildElementOrNull("##########", "_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test499");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.setPublicId("");
    int var9 = var5.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var5);
    var0.startDocument();
    nu.staldal.xtree.Text var13 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var15 = var13.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var13);
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.util.TemplateException: hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test500");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "4444444444", 100);
    int var4 = var3.numberOfChildren();
    java.lang.String var7 = var3.getInheritedAttribute("4444444444", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var9 = var3.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    int var10 = var3.numberOfChildren();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

}
