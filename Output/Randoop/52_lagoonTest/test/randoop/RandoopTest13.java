package randoop;

import junit.framework.*;

public class RandoopTest13 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test1");


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
    var0.log("nu.staldal.lagoon.core.LagoonException~ ", (-1));
    java.lang.Object var35 = var0.clone();
    var0.setTaskType("nu__46__staldal__46__lagoon__46__util__46__TemplateException__126____32__");
    org.apache.tools.ant.RuntimeConfigurable var38 = var0.getRuntimeConfigurableWrapper();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test2");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    nu.staldal.xtree.TreeBuilder var5 = new nu.staldal.xtree.TreeBuilder();
    var5.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, false);
    var2.toSAX((org.xml.sax.ContentHandler)var5);
    var5.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var5.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var20 = var19.getLineNumber();
    var19.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var27 = var26.getLineNumber();
    var26.addNamespaceMapping("", "");
    var19.addChild((nu.staldal.xtree.Node)var26);
    nu.staldal.xtree.NodeWithChildren var32 = var19.getParent();
    nu.staldal.xtree.Element var35 = var19.getFirstChildElementOrNull("hi!", "4444444444");
    int var36 = var19.numberOfNamespaceMappings();
    int var37 = var19.numberOfNamespaceMappings();
    nu.staldal.xtree.Element var38 = var19.getFirstChildElementOrNull();
    var5.setDocumentLocator((org.xml.sax.Locator)var38);
    nu.staldal.xtree.Element var40 = var5.getTree();
    java.net.URL var41 = var40.getBaseURI();
    int var44 = var40.lookupAttribute("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.ftp.FTPException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test3");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    var4.setColumn(0);
    java.lang.String var7 = var4.getTextContentOrNull();
    java.net.URL var8 = var4.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var10 = var4.getNamespaceMapping(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test4");


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
    var9.setPassword("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
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

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test5");


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
    org.apache.tools.ant.Project var22 = var9.getProject();
    var9.setTaskType("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.util.TemplateException var25 = new nu.staldal.lagoon.util.TemplateException();
    nu.staldal.lagoon.util.TemplateException var26 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var25);
    java.lang.Exception var27 = var25.getException();
    nu.staldal.lagoon.core.LagoonException var29 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var25.addSuppressed((java.lang.Throwable)var29);
    java.lang.Exception var31 = var25.getException();
    var9.log((java.lang.Throwable)var25, 1);
    org.apache.tools.ant.Target var34 = var9.getOwningTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test6");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    java.lang.String var2 = var0.getParam("4444444444");
    var0.afterBuild();
    var0.afterBuild();
    boolean var6 = var0.hasBeenUpdated(1433461995000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test7");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    int var13 = var4.lookupAttribute("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String var14 = var4.getPublicId();
    boolean var15 = var4.getPreserveSpace();
    nu.staldal.xtree.TreeBuilder var16 = new nu.staldal.xtree.TreeBuilder();
    var16.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var21 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var16, false, true);
    var16.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var24 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var16);
    var16.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    var16.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    var4.outputStartElement((org.xml.sax.ContentHandler)var16);
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var33 = var32.getLineNumber();
    var32.setSystemId("hi!");
    nu.staldal.lagoon.producer.BasicSplit var36 = new nu.staldal.lagoon.producer.BasicSplit();
    var32.toSAX((org.xml.sax.ContentHandler)var36);
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var45 = var42.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var46 = new nu.staldal.xtree.TreeBuilder();
    var42.toSAX((org.xml.sax.ContentHandler)var46);
    var46.skippedEntity("hi!");
    var46.skippedEntity("hi!");
    nu.staldal.xtree.Element var54 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var46.setDocumentLocator((org.xml.sax.Locator)var54);
    var46.startDocument();
    nu.staldal.xtree.Element var57 = var46.getTree();
    var46.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~ ");
    var46.skippedEntity("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    char[] var65 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var69 = new nu.staldal.xtree.Text(var65, 1, 0, false);
    char[] var70 = var69.asCharArray();
    char[] var71 = var69.asCharArray();
    var46.ignorableWhitespace(var71, 1, (-1));
    var36.ignorableWhitespace(var71, 100, 1);
    var16.ignorableWhitespace(var71, 1, 2);
    
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
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test8");


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
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    var32.setPassword("");
    var32.setForce(false);
    org.apache.tools.ant.Target var37 = var32.getOwningTarget();
    var32.maybeConfigure();
    var32.log("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.LagoonAntTask var41 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var44 = new nu.staldal.ftp.FTPException("hi!");
    var41.log("", (java.lang.Throwable)var44, 10);
    org.apache.tools.ant.Location var47 = var41.getLocation();
    nu.staldal.lagoon.core.LagoonException var50 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var41.log("4444444444", (java.lang.Throwable)var50, 100);
    java.lang.String var53 = var50.toString();
    java.lang.Exception var54 = var50.getException();
    var32.log((java.lang.Throwable)var50, 1);
    var32.log("nu.staldal.lagoon.util.TemplateException", 2);
    org.apache.tools.ant.RuntimeConfigurable var60 = var32.getRuntimeConfigurableWrapper();
    var10.setRuntimeConfigurableWrapper(var60);
    var10.init();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var53.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test9");


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
    nu.staldal.xtree.NodeWithChildren var28 = var11.getParent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var30 = var11.getChild(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var28);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test10");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", 10, 0);
    boolean var5 = var4.getPreserveSpace();
    java.lang.String var6 = var4.getNamespaceURI();
    boolean var7 = var4.getPreserveSpace();
    java.lang.String var9 = var4.getAttributeType((-1));
    java.lang.String var10 = var4.getPublicId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException"+ "'", var6.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test11");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.afterBuild();
    nu.staldal.lagoon.core.XMLStreamProducer var18 = var0.getNext();
    var0.skippedEntity("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
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
    assertNull(var18);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test12");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    var0.reconfigure();
    var0.setTaskType("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.setPassword("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var0.setTaskType("nu.staldal.ftp.FTPException: 4");
    java.lang.String var14 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test13");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.maybeConfigure();
    org.apache.tools.ant.Project var7 = var0.getProject();
    var0.setDescription("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test14");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", (-1), (-1));
    boolean var5 = var4.getPreserveSpace();
    var4.setSystemId("nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var8 = var4.getTextContentOrNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test15");


    nu.staldal.lagoon.filestorage.FTPFileStorage var0 = new nu.staldal.lagoon.filestorage.FTPFileStorage();
    boolean var1 = var0.isReentrant();
    boolean var2 = var0.needPassword();
    boolean var3 = var0.needPassword();
    boolean var4 = var0.needPassword();
    boolean var5 = var0.needPassword();
    boolean var6 = var0.needPassword();
    boolean var7 = var0.isReentrant();
    boolean var8 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test16");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var8 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var8.endDocument();
    var8.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var11 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var8);
    var8.startDocument();
    var8.startDocument();
    nu.staldal.lagoon.producer.BasicSplit var14 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var16 = new nu.staldal.xtree.Text("hi!");
    char[] var17 = var16.asCharArray();
    var14.characters(var17, 1, 10);
    var14.endElement("", "hi!", "hi!");
    var14.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var28 = new nu.staldal.xtree.Text("");
    char[] var29 = var28.asCharArray();
    char[] var30 = var28.asCharArray();
    char[] var31 = var28.asCharArray();
    var14.characters(var31, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var35 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var14);
    nu.staldal.lagoon.producer.IslandSplit var36 = new nu.staldal.lagoon.producer.IslandSplit();
    var36.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var39 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var36, true);
    char[] var42 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var46 = new nu.staldal.xtree.Text(var42, 1, 0, false);
    var39.setDocumentLocator((org.xml.sax.Locator)var46);
    var35.setDocumentLocator((org.xml.sax.Locator)var46);
    boolean var49 = var46.isWhitespaceNode();
    char[] var50 = var46.asCharArray();
    var8.characters(var50, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test17");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    boolean var2 = var0.hasBeenUpdated(1L);
    var0.afterBuild();
    boolean var5 = var0.hasBeenUpdated(0L);
    java.lang.String var7 = var0.getParam("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var9 = var0.getParam("4");
    var0.afterBuild();
    var0.afterBuild();
    boolean var13 = var0.hasBeenUpdated(1433461931000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test18");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    var4.setColumn(0);
    java.lang.String var7 = var4.getTextContentOrNull();
    int var8 = var4.getLineNumber();
    java.lang.String var9 = var4.getPublicId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test19");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "          ", (-1), (-1));
    int var5 = var4.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test20");


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
    var10.log("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!");
    var10.setForce(false);
    org.apache.tools.ant.Target var31 = var10.getOwningTarget();
    
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
    assertNull(var31);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test21");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    int var16 = var11.getColumnNumber();
    java.lang.String var18 = var11.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    int var21 = var11.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var23 = var11.getAttrValue("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test22");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.core.LagoonException~ 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test23");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var60 = new nu.staldal.xtree.Text(var50, 2, 10, false);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test24");


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
    var22.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.ftp.FTPException:                                                                                                     ");
    var22.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", "_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test25");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var2 = var1.getValue();
    char[] var3 = var1.asCharArray();
    char[] var4 = var1.asCharArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var8 = new nu.staldal.xtree.Text(var4, 100, 100, false);
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

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test26");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
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
    var25.processingInstruction("aa", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    var25.startDocument();
    var2.toSAX((org.xml.sax.ContentHandler)var25);
    java.lang.String var60 = var2.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    
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
    assertNull(var60);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test27");


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
    java.lang.String var28 = var10.getTaskType();
    org.apache.tools.ant.RuntimeConfigurable var29 = var10.getRuntimeConfigurableWrapper();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test28");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var3 = var2.getValue();
    java.lang.String var5 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var6 = var2.getTarget();
    java.lang.String var7 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var3.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var6.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var7.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test29");


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
    int var51 = var46.getColumnNumber();
    boolean var52 = var46.isWhitespaceNode();
    
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
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test30");


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
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    var17.setPassword("");
    var17.setForce(false);
    org.apache.tools.ant.Target var22 = var17.getOwningTarget();
    var17.maybeConfigure();
    var17.setTargetURL("4444444444");
    var0.bindToOwner((org.apache.tools.ant.Task)var17);
    org.apache.tools.ant.Target var27 = var0.getOwningTarget();
    var0.setPassword("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test31");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ ", "");
    int var3 = var2.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test32");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("a", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", 10, 0);
    java.net.URL var5 = var4.getBaseURI();
    var4.setSystemId("##");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeAttribute(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test33");


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
    java.lang.String var26 = var5.getNamespaceURI();
    var5.setPublicId("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    boolean var29 = var5.isWhitespaceNode();
    nu.staldal.xtree.Node var31 = var5.removeChild(0);
    
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
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test34");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    java.lang.String var3 = var0.getDescription();
    java.lang.String var4 = var0.getTaskName();
    var0.init();
    nu.staldal.lagoon.LagoonAntTask var6 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    var6.bindToOwner((org.apache.tools.ant.Task)var7);
    var6.setForce(true);
    var6.setTaskName("");
    var6.log("nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    nu.staldal.lagoon.core.AuthenticationException var16 = new nu.staldal.lagoon.core.AuthenticationException();
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var20 = new nu.staldal.ftp.FTPException("hi!");
    var17.log("", (java.lang.Throwable)var20, 10);
    var17.init();
    var17.init();
    java.lang.Object var25 = var17.clone();
    var17.init();
    java.lang.Object var27 = var17.clone();
    nu.staldal.lagoon.core.LagoonException var29 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var30 = var29.toString();
    var17.log((java.lang.Throwable)var29, 10);
    java.lang.Throwable[] var33 = var29.getSuppressed();
    var16.addSuppressed((java.lang.Throwable)var29);
    var6.log((java.lang.Throwable)var29, 10);
    var6.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var39 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var42 = new nu.staldal.ftp.FTPException("hi!");
    var39.log("", (java.lang.Throwable)var42, 10);
    var39.init();
    var39.init();
    java.lang.String var47 = var39.getDescription();
    nu.staldal.lagoon.LagoonAntTask var48 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var51 = new nu.staldal.ftp.FTPException("hi!");
    var48.log("", (java.lang.Throwable)var51, 10);
    org.apache.tools.ant.Project var54 = var48.getProject();
    var39.bindToOwner((org.apache.tools.ant.Task)var48);
    var48.setTaskType("nu.staldal.lagoon.core.LagoonException: ");
    var48.setTaskType("");
    org.apache.tools.ant.Target var60 = var48.getOwningTarget();
    nu.staldal.lagoon.LagoonAntTask var62 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var65 = new nu.staldal.ftp.FTPException("hi!");
    var62.log("", (java.lang.Throwable)var65, 10);
    var62.init();
    var62.init();
    java.lang.Object var70 = var62.clone();
    var62.init();
    java.lang.Object var72 = var62.clone();
    nu.staldal.lagoon.core.LagoonException var74 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var75 = var74.toString();
    var62.log((java.lang.Throwable)var74, 10);
    var48.log("nu.staldal.lagoon.util.TemplateException", (java.lang.Throwable)var74, 10);
    var6.log((java.lang.Throwable)var74, 10);
    java.lang.String var82 = var6.getTaskName();
    var0.bindToOwner((org.apache.tools.ant.Task)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var30.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var75.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + ""+ "'", var82.equals(""));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test35");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
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
    char[] var20 = var16.asCharArray();
    var2.ignorableWhitespace(var20, 1, 100);
    nu.staldal.xmlutil.ContentHandlerFixer var24 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var2);
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    nu.staldal.lagoon.producer.BasicSplit var26 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var28 = new nu.staldal.xtree.Text("hi!");
    char[] var29 = var28.asCharArray();
    var26.characters(var29, 1, 10);
    var26.endElement("", "hi!", "hi!");
    var26.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var39 = new nu.staldal.lagoon.producer.IslandSplit();
    var39.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var42 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var39, true);
    char[] var45 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var49 = new nu.staldal.xtree.Text(var45, 1, 0, false);
    var42.setDocumentLocator((org.xml.sax.Locator)var49);
    char[] var51 = var49.asCharArray();
    var26.characters(var51, 10, 0);
    var1.toSAX((org.xml.sax.ContentHandler)var26);
    nu.staldal.xmlutil.ContentHandlerFixer var58 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var26, false, false);
    nu.staldal.xmlutil.ContentHandlerAdapter var59 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var26);
    var59.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test36");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.setTaskType("4444444444");
    nu.staldal.lagoon.LagoonAntTask var8 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    var8.bindToOwner((org.apache.tools.ant.Task)var9);
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var14 = new nu.staldal.ftp.FTPException("hi!");
    var11.log("", (java.lang.Throwable)var14, 10);
    org.apache.tools.ant.Location var17 = var11.getLocation();
    var8.setLocation(var17);
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    var19.bindToOwner((org.apache.tools.ant.Task)var20);
    var19.setForce(true);
    java.lang.String var24 = var19.getTaskName();
    var19.setTaskType("4444444444");
    var19.maybeConfigure();
    var8.bindToOwner((org.apache.tools.ant.Task)var19);
    var0.bindToOwner((org.apache.tools.ant.Task)var19);
    org.apache.tools.ant.Location var30 = var0.getLocation();
    java.lang.String var31 = var0.getTaskType();
    java.lang.String var32 = var0.getDescription();
    org.apache.tools.ant.Location var33 = var0.getLocation();
    java.lang.Object var34 = var0.clone();
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var39 = new nu.staldal.ftp.FTPException("hi!");
    var36.log("", (java.lang.Throwable)var39, 10);
    org.apache.tools.ant.Location var42 = var36.getLocation();
    nu.staldal.lagoon.core.LagoonException var45 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var36.log("4444444444", (java.lang.Throwable)var45, 100);
    nu.staldal.lagoon.util.TemplateException var48 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var45);
    java.lang.String var49 = var48.toString();
    java.lang.Exception var50 = var48.getException();
    nu.staldal.lagoon.core.LagoonException var52 = new nu.staldal.lagoon.core.LagoonException("a");
    nu.staldal.lagoon.LagoonAntTask var53 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var56 = new nu.staldal.ftp.FTPException("hi!");
    var53.log("", (java.lang.Throwable)var56, 10);
    org.apache.tools.ant.Project var59 = var53.getProject();
    nu.staldal.lagoon.util.TemplateException var61 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var62 = var61.getException();
    var53.log("", (java.lang.Throwable)var61, (-1));
    java.lang.Throwable[] var65 = var61.getSuppressed();
    java.lang.Throwable[] var66 = var61.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var68 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var69 = var68.toString();
    var61.addSuppressed((java.lang.Throwable)var68);
    nu.staldal.lagoon.LagoonAntTask var71 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var74 = new nu.staldal.ftp.FTPException("hi!");
    var71.log("", (java.lang.Throwable)var74, 10);
    org.apache.tools.ant.Location var77 = var71.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var78 = var71.getRuntimeConfigurableWrapper();
    var71.setForce(false);
    org.apache.tools.ant.Location var81 = var71.getLocation();
    nu.staldal.lagoon.core.LagoonException var83 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var84 = var83.toString();
    var71.log((java.lang.Throwable)var83, 100);
    var68.addSuppressed((java.lang.Throwable)var83);
    var52.addSuppressed((java.lang.Throwable)var83);
    var50.addSuppressed((java.lang.Throwable)var83);
    java.lang.String var90 = var50.toString();
    var0.log("nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_", (java.lang.Throwable)var50, (-1));
    nu.staldal.lagoon.core.LagoonException var94 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var95 = var94.toString();
    var50.addSuppressed((java.lang.Throwable)var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "4444444444"+ "'", var31.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var49.equals("nu.staldal.lagoon.util.TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var69.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var84.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var90.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var95 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var95.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test37");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    var2.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var25 = var2.getAttrValueOrNull("4444444444", "4444444444");
    java.lang.String var26 = var2.getSystemId();
    int var27 = var2.getLineNumber();
    var2.addNamespaceMapping("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var32 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var35 = var2.getInheritedAttribute("####################################################################################################", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444");
    nu.staldal.xtree.NodeWithChildren var36 = var2.getParent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var39 = var2.getFirstChildElement("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test38");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    nu.staldal.lagoon.core.OutputHandler var8 = var0.createFile("4444444444");
    long var10 = var0.fileLastModified("hi!");
    var0.close();
    boolean var12 = var0.isReentrant();
    var0.deleteFile("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    boolean var15 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462001000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1433462001000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test39");


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
    java.lang.String var38 = var0.getTaskType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var38.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test40");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    nu.staldal.xtree.NodeWithChildren var4 = var2.getParent();
    var2.setSystemId("nu.staldal.lagoon.util.TemplateException");
    java.lang.String var8 = var2.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var10 = var2.getChild(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test41");


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
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "aa", 10);
    var8.setDocumentLocator((org.xml.sax.Locator)var25);
    var8.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test42");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var10 = var4.lookupNamespaceURI("4444444444");
    java.lang.String var12 = var4.lookupNamespacePrefix("4444444444");
    java.lang.String var15 = var4.getAttrValueOrNull("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var16 = var4.getTextContentOrNull();
    java.lang.String var18 = var4.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test43");


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
    var44.skippedEntity("nu.staldal.lagoon.util.TemplateException~ hi!");
    
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

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test44");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.endElement("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test45");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.processingInstruction("_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "          ");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test46");


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
    java.lang.String var23 = var5.getNamespaceURI();
    int var24 = var5.numberOfAttributes();
    var5.setPublicId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____");
    int var29 = var5.lookupAttribute("__35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35__", "nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!");
    
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
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test47");


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
    var1.setColumn(2);
    java.lang.String var31 = var1.getPublicId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test48");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("__32____32____32____32____32____32____32____32____32____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "____32________32________32________32________32________32________32________32________32________32____"+ "'", var1.equals("____32________32________32________32________32________32________32________32________32________32____"));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test49");


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
    java.lang.String var43 = var11.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.util.TemplateException~ ");
    java.lang.String var44 = var11.getPublicId();
    var11.addNamespaceMapping("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_", "_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_");
    
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
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test50");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var14 = var11.lookupAttribute("4444444444", "hi!");
    java.lang.String var17 = var11.getInheritedAttribute("", "4444444444");
    int var20 = var11.lookupAttribute("", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String var22 = var11.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var11);
    java.lang.String var25 = var11.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var27 = var11.getChild(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test51");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    java.lang.String var8 = var2.getInheritedAttribute("", "4444444444");
    int var9 = var2.numberOfChildren();
    var2.setLine((-1));
    java.net.URL var12 = var2.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test52");


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
    var0.log("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!");
    
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

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test53");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.setTaskType("4444444444");
    java.lang.Object var8 = var0.clone();
    var0.setDescription("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test54");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    char[] var3 = var1.asCharArray();
    var1.setSystemId("a");
    char[] var6 = var1.asCharArray();
    java.lang.String var7 = var1.getSystemId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "a"+ "'", var7.equals("a"));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test55");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.init();
    nu.staldal.lagoon.LagoonAntTask var8 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var11 = new nu.staldal.ftp.FTPException("hi!");
    var8.log("", (java.lang.Throwable)var11, 10);
    var1.log("hi!", (java.lang.Throwable)var11, 0);
    org.apache.tools.ant.Project var16 = var1.getProject();
    var1.log("aa");
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    var19.bindToOwner((org.apache.tools.ant.Task)var20);
    var19.setForce(true);
    java.lang.String var24 = var19.getTaskName();
    var19.maybeConfigure();
    var1.bindToOwner((org.apache.tools.ant.Task)var19);
    java.lang.String var27 = var19.getTaskName();
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    var28.setPassword("");
    java.lang.String var31 = var28.getDescription();
    java.lang.String var32 = var28.getTaskName();
    nu.staldal.lagoon.util.TemplateException var34 = new nu.staldal.lagoon.util.TemplateException();
    nu.staldal.lagoon.util.TemplateException var35 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var34);
    java.lang.Exception var36 = var34.getException();
    var28.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", (java.lang.Throwable)var34, (-1));
    org.apache.tools.ant.Location var39 = var28.getLocation();
    var28.setTaskName("nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    var19.bindToOwner((org.apache.tools.ant.Task)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test56");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    java.lang.String var6 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test57");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
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
    assertNotNull(var3);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test58");


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
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException~~ ");
    var0.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    
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

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test59");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", 0);
    java.net.URL var4 = var3.getBaseURI();
    int var5 = var3.numberOfChildren();
    java.lang.String var8 = var3.getAttrValueOrNull("hi_33_", "nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test60");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", (-1), (-1));

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test61");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    var0.log("nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    nu.staldal.lagoon.core.AuthenticationException var10 = new nu.staldal.lagoon.core.AuthenticationException();
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var14 = new nu.staldal.ftp.FTPException("hi!");
    var11.log("", (java.lang.Throwable)var14, 10);
    var11.init();
    var11.init();
    java.lang.Object var19 = var11.clone();
    var11.init();
    java.lang.Object var21 = var11.clone();
    nu.staldal.lagoon.core.LagoonException var23 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var24 = var23.toString();
    var11.log((java.lang.Throwable)var23, 10);
    java.lang.Throwable[] var27 = var23.getSuppressed();
    var10.addSuppressed((java.lang.Throwable)var23);
    var0.log((java.lang.Throwable)var23, 10);
    java.lang.Throwable[] var31 = var23.getSuppressed();
    java.lang.Exception var32 = var23.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var24.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test62");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    java.lang.String var4 = var2.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    int var5 = var2.numberOfNamespaceMappings();
    var2.setColumn(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test63");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    var0.init();
    var0.beforeBuild();
    nu.staldal.lagoon.core.XMLStreamProducer var5 = var0.getNext();
    var0.init();
    var0.init();
    nu.staldal.lagoon.core.LagoonContext var8 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test64");


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
    nu.staldal.xtree.Text var55 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var56 = var55.getValue();
    var11.addChild((nu.staldal.xtree.Node)var55);
    java.lang.String var58 = var11.getTextContentOrNull();
    java.lang.String var60 = var11.lookupNamespacePrefix("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    
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
    assertTrue("'" + var56 + "' != '" + "hi!"+ "'", var56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test65");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    java.lang.String var5 = var0.getParam("");
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.endPrefixMapping("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test66");


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
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException");
    var0.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test67");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.ftp.FTPException~~~~ hi!");

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test68");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.core.LagoonException var9 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var0.log("4444444444", (java.lang.Throwable)var9, 100);
    var0.setTaskName("");
    var0.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test69");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var6 = var0.needPassword();
    var0.close();
    boolean var8 = var0.isReentrant();
    var0.deleteFile("          ");
    nu.staldal.lagoon.core.OutputHandler var12 = var0.createFile("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test70");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("____32________32________32________32________32________32________32________32________32________32____");

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test71");


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
    org.apache.tools.ant.RuntimeConfigurable var21 = var9.getRuntimeConfigurableWrapper();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var25 = new nu.staldal.ftp.FTPException("hi!");
    var22.log("", (java.lang.Throwable)var25, 10);
    var22.init();
    var22.init();
    java.lang.Object var30 = var22.clone();
    var22.init();
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    var32.maybeConfigure();
    var32.log("4444444444", 1);
    var32.setTargetURL("hi_33_");
    var32.setPassword("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    org.apache.tools.ant.RuntimeConfigurable var41 = var32.getRuntimeConfigurableWrapper();
    var22.setRuntimeConfigurableWrapper(var41);
    var9.setRuntimeConfigurableWrapper(var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test72");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.isReentrant();
    var0.deleteFile("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.OutputHandler var7 = var0.createFile(".");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test73");


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
    char[] var24 = var23.asCharArray();
    boolean var25 = var23.isWhitespaceNode();
    char[] var26 = var23.asCharArray();
    var18.setDocumentLocator((org.xml.sax.Locator)var23);
    nu.staldal.xmlutil.DocumentHandlerAdapter var28 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test74");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    java.lang.String var6 = var0.getTaskType();
    var0.setDescription("");
    var0.setTaskName("hi!");
    var0.setDescription("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    var0.reconfigure();
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test75");


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
    var22.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var75 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, false, false);
    var22.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~~ ");
    var22.startDocument();
    
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

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test76");


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
    int var51 = var46.getColumnNumber();
    nu.staldal.lagoon.producer.BasicSplit var52 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var54 = new nu.staldal.xtree.Text("hi!");
    char[] var55 = var54.asCharArray();
    var52.characters(var55, 1, 10);
    nu.staldal.lagoon.core.LagoonContext var59 = var52.getContext();
    var52.startDocument();
    var52.startDocument();
    nu.staldal.lagoon.producer.BasicSplit var62 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var64 = new nu.staldal.xtree.Text("hi!");
    char[] var65 = var64.asCharArray();
    var62.characters(var65, 1, 10);
    var62.endElement("", "hi!", "hi!");
    var62.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var76 = new nu.staldal.xtree.Text("");
    char[] var77 = var76.asCharArray();
    char[] var78 = var76.asCharArray();
    char[] var79 = var76.asCharArray();
    var62.characters(var79, 10, 0);
    char[] var85 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var89 = new nu.staldal.xtree.Text(var85, 1, 0, false);
    char[] var90 = var89.asCharArray();
    var62.characters(var90, (-1), 1);
    var52.ignorableWhitespace(var90, 1, 10);
    var46.toSAX((org.xml.sax.ContentHandler)var52);
    
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
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test77");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Project var8 = var0.getProject();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    var9.bindToOwner((org.apache.tools.ant.Task)var10);
    var9.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var14 = new nu.staldal.lagoon.LagoonAntTask();
    var14.setPassword("");
    var9.bindToOwner((org.apache.tools.ant.Task)var14);
    org.apache.tools.ant.Project var18 = var9.getProject();
    org.apache.tools.ant.Project var19 = var9.getProject();
    org.apache.tools.ant.Location var20 = var9.getLocation();
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
    var9.setLocation(var32);
    var0.setLocation(var32);
    var0.setForce(false);
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test78");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("####################################################################################################", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 0, 100);
    int var5 = var4.numberOfChildren();
    var4.setSystemId("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var10 = var4.getFirstChildElement("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu.staldal.lagoon.util.TemplateException: hi_33_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test79");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    java.lang.String var7 = var0.getEntryName();
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

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test80");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var5 = var2.lookupAttribute("hi!", "hi!");
    int var6 = var2.numberOfAttributes();
    java.lang.String var8 = var2.lookupNamespacePrefix("hi_33_");
    var2.setSystemId("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var11 = var2.numberOfAttributes();
    int var12 = var2.numberOfNamespaceMappings();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = var2.getAttrValue("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu__46__staldal__46__lagoon__46__util__46__TemplateException__126____32__");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test81");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("");
    nu.staldal.lagoon.util.TemplateException var2 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);
    nu.staldal.lagoon.util.TemplateException var3 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var2);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test82");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    nu.staldal.xtree.Text var15 = new nu.staldal.xtree.Text("");
    char[] var16 = var15.asCharArray();
    char[] var17 = var15.asCharArray();
    var0.ignorableWhitespace(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var23 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, true);
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("hi!", "hi!");
    var26.setSystemId("");
    java.net.URL var29 = var26.getBaseURI();
    java.lang.String var32 = var26.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("hi!", "hi!");
    var35.addNamespaceMapping("", "");
    var26.addChild((nu.staldal.xtree.Node)var35);
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("hi!", "hi!");
    var42.setSystemId("");
    java.net.URL var45 = var42.getBaseURI();
    java.lang.String var48 = var42.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var51 = new nu.staldal.xtree.Element("hi!", "hi!");
    var51.addNamespaceMapping("", "");
    var42.addChild((nu.staldal.xtree.Node)var51);
    int var56 = var51.getColumnNumber();
    java.lang.String var58 = var51.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var51.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var26.addChild((nu.staldal.xtree.Node)var51);
    int var67 = var51.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var70 = new nu.staldal.xtree.Element("hi!", "hi!");
    var70.setSystemId("");
    java.net.URL var73 = var70.getBaseURI();
    java.lang.String var75 = var70.getAttrValueOrNull("hi_33_");
    java.lang.String var78 = var70.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var79 = var70.getBaseURI();
    int var80 = var70.numberOfChildren();
    var51.insertChild((nu.staldal.xtree.Node)var70, 0);
    boolean var83 = var70.getPreserveSpace();
    var23.setDocumentLocator((org.xml.sax.Locator)var70);
    java.net.URL var85 = var70.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test83");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    org.apache.tools.ant.Target var9 = var5.getOwningTarget();
    var5.setTaskType("hi_33_");
    var5.log("hi_33_");
    var5.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test84");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    nu.staldal.xtree.TreeBuilder var5 = new nu.staldal.xtree.TreeBuilder();
    var5.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, false);
    var2.toSAX((org.xml.sax.ContentHandler)var5);
    var5.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var5.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var20 = var19.getLineNumber();
    var19.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var27 = var26.getLineNumber();
    var26.addNamespaceMapping("", "");
    var19.addChild((nu.staldal.xtree.Node)var26);
    nu.staldal.xtree.NodeWithChildren var32 = var19.getParent();
    nu.staldal.xtree.Element var35 = var19.getFirstChildElementOrNull("hi!", "4444444444");
    int var36 = var19.numberOfNamespaceMappings();
    int var37 = var19.numberOfNamespaceMappings();
    nu.staldal.xtree.Element var38 = var19.getFirstChildElementOrNull();
    var5.setDocumentLocator((org.xml.sax.Locator)var38);
    var5.endPrefixMapping("nu.staldal.lagoon.util.TemplateException");
    var5.startDocument();
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "hi!");
    var45.setSystemId("");
    java.net.URL var48 = var45.getBaseURI();
    java.lang.String var51 = var45.getAttrValueOrNull("", "");
    java.lang.String var52 = var45.getTextContent();
    java.lang.String var53 = var45.getNamespaceURI();
    nu.staldal.xtree.NodeWithChildren var54 = var45.getParent();
    java.lang.String var56 = var45.lookupNamespaceURI("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ");
    var5.setDocumentLocator((org.xml.sax.Locator)var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "hi!"+ "'", var53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test85");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ hi__33__", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", 100, 10);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test86");


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
    int var27 = var5.numberOfChildren();
    java.lang.String var29 = var5.lookupNamespaceURI("nu.staldal.ftp.FTPException~ hi!");
    int var30 = var5.numberOfChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.removeAttribute((-1));
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
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test87");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    var0.init();
    var0.beforeBuild();
    nu.staldal.lagoon.core.XMLStreamProducer var5 = var0.getNext();
    java.util.Enumeration var6 = var0.getParamNames();
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    nu.staldal.xtree.Element var13 = new nu.staldal.xtree.Element("          ", "nu.staldal.lagoon.util.TemplateException~~ ", 10, 10);
    var8.setDocumentLocator((org.xml.sax.Locator)var13);
    nu.staldal.xmlutil.ContentHandlerFixer var16 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8, true);
    var16.endPrefixMapping("nu.staldal.lagoon.util.TemplateException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test88");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    var0.reconfigure();
    var0.setTaskType("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    org.apache.tools.ant.Location var10 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var11 = var0.getRuntimeConfigurableWrapper();
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var15 = new nu.staldal.ftp.FTPException("hi!");
    var12.log("", (java.lang.Throwable)var15, 10);
    org.apache.tools.ant.Location var18 = var12.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var19 = var12.getRuntimeConfigurableWrapper();
    var12.setForce(false);
    org.apache.tools.ant.Location var22 = var12.getLocation();
    var12.log("nu.staldal.lagoon.util.TemplateException", (-1));
    java.lang.String var26 = var12.getDescription();
    org.apache.tools.ant.Location var27 = var12.getLocation();
    java.lang.String var28 = var12.getTaskType();
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var30 = new nu.staldal.lagoon.LagoonAntTask();
    var29.bindToOwner((org.apache.tools.ant.Task)var30);
    var29.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var34 = new nu.staldal.lagoon.LagoonAntTask();
    var34.setPassword("");
    var29.bindToOwner((org.apache.tools.ant.Task)var34);
    org.apache.tools.ant.Target var38 = var34.getOwningTarget();
    java.lang.Object var39 = var34.clone();
    var12.bindToOwner((org.apache.tools.ant.Task)var34);
    var12.setDescription("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    org.apache.tools.ant.RuntimeConfigurable var43 = var12.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test89");


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
    java.lang.String var50 = var33.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var52 = var33.getNamespaceMapping(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNull(var50);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test90");


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
    var20.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    
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

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test91");


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
    var22.processingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var22.startPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Text var40 = new nu.staldal.xtree.Text("");
    char[] var41 = var40.asCharArray();
    char[] var42 = var40.asCharArray();
    nu.staldal.lagoon.producer.BasicSplit var43 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var45 = new nu.staldal.xtree.Text("hi!");
    char[] var46 = var45.asCharArray();
    var43.characters(var46, 1, 10);
    var43.endElement("", "hi!", "hi!");
    var43.processingInstruction("", "hi!");
    var43.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var43.startDocument();
    var43.skippedEntity("4444444444");
    var43.skippedEntity("hi!");
    var40.toSAX((org.xml.sax.ContentHandler)var43);
    char[] var66 = var40.asCharArray();
    char[] var67 = var40.asCharArray();
    var22.characters(var67, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test92");


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
    java.lang.String var20 = var19.getSystemId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var23 = var19.getFirstChildElement("nu.staldal.ftp.FTPException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "hi_33_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test93");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("hi_33_");
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.hasBeenUpdated(1433461996000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test94");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setSystemId("hi!");
    java.lang.String var6 = var2.getLocalName();
    java.net.URL var7 = var2.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test95");


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
    nu.staldal.xmlutil.ContentHandlerFixer var40 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, true, true);
    nu.staldal.xtree.ProcessingInstruction var43 = new nu.staldal.xtree.ProcessingInstruction("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var44 = var43.getTarget();
    java.lang.String var45 = var43.getTarget();
    java.lang.String var46 = var43.getTarget();
    var22.setDocumentLocator((org.xml.sax.Locator)var43);
    nu.staldal.xmlutil.ContentHandlerAdapter var48 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var22);
    nu.staldal.xtree.TreeBuilder var49 = new nu.staldal.xtree.TreeBuilder();
    var49.endPrefixMapping("hi!");
    var49.endDocument();
    var49.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var49.skippedEntity("nu.staldal.ftp.FTPException:                                                                                                     ");
    nu.staldal.xmlutil.ContentHandlerAdapter var58 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var49);
    nu.staldal.lagoon.producer.BasicSplit var59 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var61 = new nu.staldal.xtree.Text("hi!");
    char[] var62 = var61.asCharArray();
    var59.characters(var62, 1, 10);
    var58.ignorableWhitespace(var62, 1, 2);
    var22.characters(var62, 0, 10);
    
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
    assertTrue("'" + var44 + "' != '" + "hi_33_"+ "'", var44.equals("hi_33_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi_33_"+ "'", var45.equals("hi_33_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "hi_33_"+ "'", var46.equals("hi_33_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test96");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var9 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.processingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test97");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.close();
    boolean var6 = var0.isReentrant();
    boolean var7 = var0.needPassword();
    nu.staldal.lagoon.core.OutputHandler var9 = var0.createFile("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var0.close();
    boolean var11 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test98");


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
    char[] var83 = new char[] { '4'};
    var22.characters(var83, (-1), 100);
    var22.startDocument();
    var22.processingInstruction("          ", "nu.staldal.lagoon.util.TemplateException: hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test99");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.startPrefixMapping("4444444444", "                                                                                                    ");
    var0.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var13 = new nu.staldal.xtree.Element("hi!", "hi!");
    var13.setSystemId("");
    java.net.URL var16 = var13.getBaseURI();
    java.lang.String var19 = var13.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var22 = new nu.staldal.xtree.Element("hi!", "hi!");
    var22.addNamespaceMapping("", "");
    var13.addChild((nu.staldal.xtree.Node)var22);
    var13.setSystemId("");
    var13.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var36 = var13.getAttrValueOrNull("4444444444", "4444444444");
    var13.addAttribute("hi!", "hi!", "", "hi!");
    java.net.URL var42 = var13.getBaseURI();
    nu.staldal.xtree.Element var43 = var13.getFirstChildElementOrNull();
    var0.setDocumentLocator((org.xml.sax.Locator)var13);
    int var45 = var13.numberOfNamespaceMappings();
    var13.setLine(1);
    boolean var48 = var13.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test100");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    var0.destroy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.hasBeenUpdated(1433461986000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test101");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var7 = var4.getFirstChildElementOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    var4.addAttribute("nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu.staldal.ftp.FTPException: hi!", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    int var13 = var4.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test102");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "hi_33_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var2.lookupNamespacePrefix("");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test103");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.log("nu.staldal.lagoon.util.TemplateException", 0);
    var0.reconfigure();
    java.lang.String var10 = var0.getTaskName();
    var0.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test104");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("hi_33_");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    java.lang.Exception var4 = var1.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException: hi_33_"+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException: hi_33_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.LagoonException: hi_33_"+ "'", var3.equals("nu.staldal.lagoon.core.LagoonException: hi_33_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test105");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    boolean var2 = var0.hasBeenUpdated(0L);
    var0.beforeBuild();
    java.lang.String var4 = var0.getEntryName();
    boolean var6 = var0.hasBeenUpdated(1433461965000L);
    boolean var8 = var0.hasBeenUpdated(1433461971000L);
    boolean var10 = var0.hasBeenUpdated(1433461967000L);
    boolean var12 = var0.hasBeenUpdated(1433461994000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test106");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var2 = var1.getValue();
    var1.setPublicId("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    int var5 = var1.getLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test107");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setTargetURL("4444444444");
    java.lang.String var10 = var0.getTaskName();
    java.lang.String var11 = var0.getDescription();
    var0.reconfigure();
    var0.setTaskName("nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var18 = new nu.staldal.ftp.FTPException("hi!");
    var15.log("", (java.lang.Throwable)var18, 10);
    org.apache.tools.ant.Location var21 = var15.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var22 = var15.getRuntimeConfigurableWrapper();
    var15.setForce(false);
    nu.staldal.lagoon.util.TemplateException var26 = new nu.staldal.lagoon.util.TemplateException("4444444444");
    var15.log((java.lang.Throwable)var26, 1);
    org.apache.tools.ant.RuntimeConfigurable var29 = var15.getRuntimeConfigurableWrapper();
    java.lang.String var30 = var15.getDescription();
    nu.staldal.lagoon.LagoonAntTask var31 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    var31.bindToOwner((org.apache.tools.ant.Task)var32);
    var31.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var39 = new nu.staldal.ftp.FTPException("hi!");
    var36.log("", (java.lang.Throwable)var39, 10);
    org.apache.tools.ant.Location var42 = var36.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var43 = var36.getRuntimeConfigurableWrapper();
    var36.setForce(false);
    org.apache.tools.ant.Location var46 = var36.getLocation();
    var36.log("nu.staldal.lagoon.util.TemplateException", (-1));
    java.lang.String var50 = var36.getDescription();
    org.apache.tools.ant.Location var51 = var36.getLocation();
    var31.setLocation(var51);
    var31.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var55 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var56 = new nu.staldal.lagoon.LagoonAntTask();
    var55.bindToOwner((org.apache.tools.ant.Task)var56);
    var55.log("");
    java.lang.Object var60 = var55.clone();
    nu.staldal.lagoon.LagoonAntTask var61 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var64 = new nu.staldal.ftp.FTPException("hi!");
    var61.log("", (java.lang.Throwable)var64, 10);
    java.lang.String var67 = var61.getDescription();
    nu.staldal.lagoon.LagoonAntTask var68 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var71 = new nu.staldal.ftp.FTPException("hi!");
    var68.log("", (java.lang.Throwable)var71, 10);
    org.apache.tools.ant.Location var74 = var68.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var75 = var68.getRuntimeConfigurableWrapper();
    var68.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var78 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var81 = new nu.staldal.ftp.FTPException("hi!");
    var78.log("", (java.lang.Throwable)var81, 10);
    org.apache.tools.ant.Project var84 = var78.getProject();
    nu.staldal.lagoon.util.TemplateException var86 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var87 = var86.getException();
    var78.log("", (java.lang.Throwable)var86, (-1));
    var68.bindToOwner((org.apache.tools.ant.Task)var78);
    org.apache.tools.ant.Location var91 = var78.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var92 = var78.getRuntimeConfigurableWrapper();
    var61.setRuntimeConfigurableWrapper(var92);
    org.apache.tools.ant.RuntimeConfigurable var94 = var61.getRuntimeConfigurableWrapper();
    var55.setRuntimeConfigurableWrapper(var94);
    var31.setRuntimeConfigurableWrapper(var94);
    var15.setRuntimeConfigurableWrapper(var94);
    var0.setRuntimeConfigurableWrapper(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test108");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.startDocument();
    nu.staldal.xtree.ProcessingInstruction var10 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var11 = var10.getPublicId();
    java.lang.String var14 = var10.getInheritedAttribute("", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var10);
    nu.staldal.lagoon.producer.BasicSplit var16 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var18 = new nu.staldal.xtree.Text("hi!");
    char[] var19 = var18.asCharArray();
    var16.characters(var19, 1, 10);
    var16.endElement("", "hi!", "hi!");
    var16.processingInstruction("", "hi!");
    var16.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var16.startDocument();
    var16.skippedEntity("4444444444");
    java.util.Enumeration var36 = var16.getParamNames();
    int var37 = var16.getPosition();
    var16.startDocument();
    var16.endElement("nu.staldal.lagoon.util.TemplateException", "                                                                                                    ", "                                                                                                    ");
    var10.toSAX((org.xml.sax.ContentHandler)var16);
    var16.destroy();
    var16.endElement("####################################################################################################", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__", "nu.staldal.lagoon.util.TemplateException");
    var16.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test109");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", 2, 0);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test110");


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
    java.lang.String var21 = var2.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var22 = var2.getTextContent();
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test111");


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
    var16.setPublicId("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");
    
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

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test112");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test113");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    org.apache.tools.ant.Location var10 = var0.getLocation();
    var0.log("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", (-1));
    var0.log("nu.staldal.lagoon.util.TemplateException");
    var0.setForce(false);
    java.lang.Object var18 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test114");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    java.lang.String var18 = var2.getPublicId();
    int var19 = var2.getColumnNumber();
    nu.staldal.xtree.Element var20 = var2.getFirstChildElementOrNull();
    boolean var21 = var20.getPreserveSpace();
    java.net.URL var22 = var20.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test115");


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
    nu.staldal.lagoon.LagoonAntTask var31 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    var31.bindToOwner((org.apache.tools.ant.Task)var32);
    var31.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    var36.setPassword("");
    var31.bindToOwner((org.apache.tools.ant.Task)var36);
    org.apache.tools.ant.Target var40 = var36.getOwningTarget();
    var36.setPassword("hi!");
    nu.staldal.lagoon.LagoonAntTask var43 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var44 = new nu.staldal.lagoon.LagoonAntTask();
    var43.bindToOwner((org.apache.tools.ant.Task)var44);
    var43.log("");
    java.lang.Object var48 = var43.clone();
    nu.staldal.lagoon.LagoonAntTask var49 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var52 = new nu.staldal.ftp.FTPException("hi!");
    var49.log("", (java.lang.Throwable)var52, 10);
    org.apache.tools.ant.Location var55 = var49.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var56 = var49.getRuntimeConfigurableWrapper();
    var49.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var59 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var62 = new nu.staldal.ftp.FTPException("hi!");
    var59.log("", (java.lang.Throwable)var62, 10);
    org.apache.tools.ant.Project var65 = var59.getProject();
    nu.staldal.lagoon.util.TemplateException var67 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var68 = var67.getException();
    var59.log("", (java.lang.Throwable)var67, (-1));
    var49.bindToOwner((org.apache.tools.ant.Task)var59);
    org.apache.tools.ant.Location var72 = var59.getLocation();
    var43.setLocation(var72);
    java.lang.String var74 = var43.getTaskName();
    org.apache.tools.ant.RuntimeConfigurable var75 = var43.getRuntimeConfigurableWrapper();
    var36.setRuntimeConfigurableWrapper(var75);
    var15.bindToOwner((org.apache.tools.ant.Task)var36);
    java.lang.String var78 = var15.getTaskType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test116");


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
    java.lang.String var27 = var2.getSystemId();
    java.lang.String var28 = var2.getNamespaceURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeAttribute(10);
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
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test117");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.hasBeenUpdated(1433461997000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test118");


    nu.staldal.lagoon.util.TemplateException var0 = new nu.staldal.lagoon.util.TemplateException();
    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var0);
    java.lang.Exception var2 = var1.getException();
    nu.staldal.lagoon.util.TemplateException var3 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var4.equals("nu.staldal.lagoon.util.TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var5.equals("nu.staldal.lagoon.util.TemplateException"));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test119");


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
    char[] var25 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var29 = new nu.staldal.xtree.Text(var25, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var30 = new nu.staldal.xtree.TreeBuilder();
    var30.endPrefixMapping("hi!");
    var30.endDocument();
    var30.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var29.toSAX((org.xml.sax.ContentHandler)var30);
    var30.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    char[] var43 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var47 = new nu.staldal.xtree.Text(var43, 1, 0, false);
    char[] var48 = var47.asCharArray();
    var30.ignorableWhitespace(var48, 10, 10);
    var18.ignorableWhitespace(var48, 0, 0);
    char[] var57 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var61 = new nu.staldal.xtree.Text(var57, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var62 = new nu.staldal.xtree.TreeBuilder();
    var62.endPrefixMapping("hi!");
    var62.endDocument();
    var62.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var61.toSAX((org.xml.sax.ContentHandler)var62);
    var62.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    nu.staldal.xtree.TreeBuilder var73 = new nu.staldal.xtree.TreeBuilder();
    var73.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var78 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var73, false, false);
    nu.staldal.xtree.Text var80 = new nu.staldal.xtree.Text("");
    char[] var81 = var80.asCharArray();
    boolean var82 = var80.isWhitespaceNode();
    char[] var83 = var80.asCharArray();
    var73.ignorableWhitespace(var83, 0, 10);
    var62.ignorableWhitespace(var83, 10, 0);
    var18.ignorableWhitespace(var83, 100, 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var96 = new nu.staldal.xtree.Text(var83, (-1), (-1), false);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test120");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    boolean var8 = var2.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var10 = var2.getNamespaceMapping((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test121");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    var0.afterBuild();
    boolean var3 = var0.hasBeenUpdated(10L);
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
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test122");


    char[] var2 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text(var2, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var7 = new nu.staldal.xtree.TreeBuilder();
    var7.endPrefixMapping("hi!");
    var7.endDocument();
    var7.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var6.toSAX((org.xml.sax.ContentHandler)var7);
    var7.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var7.skippedEntity("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var7.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test123");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var2 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var0.afterBuild();
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test124");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    nu.staldal.xtree.Element var16 = var2.getFirstChildElement();
    int var17 = var2.numberOfChildren();
    int var18 = var2.numberOfChildren();
    java.lang.String var19 = var2.getTextContentOrNull();
    java.lang.String var21 = var2.getAttrValueOrNull("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test125");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    java.util.Enumeration var1 = var0.getParamNames();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test126");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException~ ", 2);
    boolean var4 = var3.getPreserveSpace();
    java.lang.String var6 = var3.getAttributeLocalName((-1));
    nu.staldal.xtree.NodeWithChildren var7 = var3.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test127");


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
    java.lang.String var34 = var32.getNamespaceURI();
    int var35 = var32.numberOfAttributes();
    nu.staldal.xtree.Element var39 = new nu.staldal.xtree.Element("4444444444", "", 0);
    java.lang.String var40 = var39.getTextContentOrNull();
    nu.staldal.xtree.Element var43 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var44 = var43.getPreserveSpace();
    var43.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "4444444444", "nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var52 = var43.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException");
    var39.addChild((nu.staldal.xtree.Node)var43);
    var32.addChild((nu.staldal.xtree.Node)var39);
    java.lang.String var56 = var32.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: ");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test128");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.setTaskType("hi!");
    java.lang.String var8 = var1.getTaskType();
    var1.log("nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    org.apache.tools.ant.Target var12 = var1.getOwningTarget();
    org.apache.tools.ant.Project var13 = var1.getProject();
    var1.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test129");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    var0.reconfigure();
    var0.init();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test130");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    boolean var16 = var2.getPreserveSpace();
    nu.staldal.xtree.Node var18 = var2.getChild(0);
    int var19 = var2.getLineNumber();
    int var20 = var2.getLineNumber();
    nu.staldal.lagoon.producer.BasicSplit var21 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("hi!");
    char[] var24 = var23.asCharArray();
    var21.characters(var24, 1, 10);
    var21.endElement("", "hi!", "hi!");
    var21.processingInstruction("", "hi!");
    var21.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var21.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var39 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var21);
    var2.outputStartElement((org.xml.sax.ContentHandler)var21);
    nu.staldal.xmlutil.ContentHandlerAdapter var41 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var21);
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var49 = var46.lookupAttribute("4444444444", "hi!");
    var46.addNamespaceMapping("", "4444444444");
    int var53 = var46.getColumnNumber();
    var21.setDocumentLocator((org.xml.sax.Locator)var46);
    var21.endElement("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "hi__33__", "                                                                                                    ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var21.init();
      fail("Expected exception of type nu.staldal.lagoon.core.LagoonException");
    } catch (nu.staldal.lagoon.core.LagoonException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test131");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test132");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var3 = var2.getPublicId();
    java.lang.String var6 = var2.getInheritedAttribute("", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var7 = var2.getValue();
    java.lang.String var10 = var2.getInheritedAttribute("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    java.lang.String var11 = var2.getTarget();
    java.lang.String var12 = var2.getValue();
    java.lang.String var13 = var2.getValue();
    java.lang.String var14 = var2.getTarget();
    java.lang.String var15 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var7.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var11.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var12.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var13.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var14.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var15.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test133");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setTargetURL("4444444444");
    java.lang.String var10 = var0.getTaskName();
    java.lang.String var11 = var0.getDescription();
    var0.reconfigure();
    var0.setTaskName("nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var15 = var0.getTaskName();
    var0.setTaskType("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "nu.staldal.lagoon.core.AuthenticationMissingException"+ "'", var15.equals("nu.staldal.lagoon.core.AuthenticationMissingException"));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test134");


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
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    var12.bindToOwner((org.apache.tools.ant.Task)var13);
    var13.log("hi!");
    java.lang.String var17 = var13.getTaskName();
    var13.init();
    org.apache.tools.ant.Location var19 = var13.getLocation();
    var0.setLocation(var19);
    var0.setTaskType("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var26 = new nu.staldal.ftp.FTPException("hi!");
    var23.log("", (java.lang.Throwable)var26, 10);
    org.apache.tools.ant.Location var29 = var23.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var30 = var23.getRuntimeConfigurableWrapper();
    var23.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var33 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var36 = new nu.staldal.ftp.FTPException("hi!");
    var33.log("", (java.lang.Throwable)var36, 10);
    org.apache.tools.ant.Project var39 = var33.getProject();
    nu.staldal.lagoon.util.TemplateException var41 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var42 = var41.getException();
    var33.log("", (java.lang.Throwable)var41, (-1));
    var23.bindToOwner((org.apache.tools.ant.Task)var33);
    org.apache.tools.ant.Location var46 = var33.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var47 = var33.getRuntimeConfigurableWrapper();
    var33.setForce(true);
    java.lang.String var50 = var33.getTaskName();
    var0.bindToOwner((org.apache.tools.ant.Task)var33);
    nu.staldal.lagoon.core.LagoonException var53 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var33.log((java.lang.Throwable)var53, 10);
    nu.staldal.lagoon.LagoonAntTask var56 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.Object var57 = var56.clone();
    nu.staldal.lagoon.LagoonAntTask var58 = new nu.staldal.lagoon.LagoonAntTask();
    var58.setPassword("");
    org.apache.tools.ant.RuntimeConfigurable var61 = var58.getRuntimeConfigurableWrapper();
    var56.setRuntimeConfigurableWrapper(var61);
    nu.staldal.lagoon.LagoonAntTask var63 = new nu.staldal.lagoon.LagoonAntTask();
    var63.setPassword("");
    var63.setForce(false);
    org.apache.tools.ant.Target var68 = var63.getOwningTarget();
    var63.maybeConfigure();
    var63.log("nu.staldal.lagoon.core.LagoonException: 4444444444");
    org.apache.tools.ant.Location var72 = var63.getLocation();
    var56.setLocation(var72);
    var33.setLocation(var72);
    org.apache.tools.ant.RuntimeConfigurable var75 = var33.getRuntimeConfigurableWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test135");


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
    java.lang.String var48 = var33.getTextContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test136");


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
    var17.init();
    var17.setForce(true);
    org.apache.tools.ant.Target var25 = var17.getOwningTarget();
    var0.bindToOwner((org.apache.tools.ant.Task)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test137");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    java.lang.String var20 = var11.getAttrValueOrNull("4444444444");
    var11.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    boolean var24 = var11.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test138");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException", "hi!");
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
    var2.toSAX((org.xml.sax.ContentHandler)var25);
    java.lang.String var40 = var2.getValue();
    
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
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test139");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    java.lang.String var3 = var1.getValue();
    boolean var4 = var1.isWhitespaceNode();
    boolean var5 = var1.isWhitespaceNode();
    java.lang.String var6 = var1.getValue();
    int var7 = var1.getColumnNumber();
    char[] var8 = var1.asCharArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text(var8, 0, 1, false);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test140");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    var8.endDocument();
    var8.skippedEntity("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi!", "hi!");
    var16.setSystemId("");
    java.net.URL var19 = var16.getBaseURI();
    java.lang.String var21 = var16.getAttrValueOrNull("hi_33_");
    java.lang.String var24 = var16.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var25 = var16.getBaseURI();
    var8.setDocumentLocator((org.xml.sax.Locator)var16);
    java.lang.String var27 = var16.getPublicId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test141");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.ftp.FTPException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test142");


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
    java.lang.String var27 = var23.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________", "nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test143");


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
    var8.endPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    var8.endDocument();
    var8.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test144");


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
    var20.setLine((-1));
    int var56 = var20.getLineNumber();
    var20.setSystemId("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var60 = var20.getAttributeType(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var56 == (-1));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test145");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~ ", "4444444444");
    java.lang.String var5 = var2.getAttrValueOrNull("nu.staldal.ftp.FTPException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test146");


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
    nu.staldal.xmlutil.ContentHandlerAdapter var39 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var22);
    var22.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var22.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var45 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, false);
    
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

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test147");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~ 4444444444", (-1), 2);
    java.lang.String var5 = var4.getPublicId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test148");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    nu.staldal.lagoon.core.ByteStreamProducer var1 = var0.getNext();
    var0.init();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var4 = var0.getNext();
    var0.init();
    var0.init();
    java.lang.String var7 = var0.getEntryName();
    nu.staldal.lagoon.core.ByteStreamProducer var8 = var0.getNext();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test149");


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
    var0.log((java.lang.Throwable)var43, 2);
    java.lang.String var49 = var43.toString();
    java.lang.Exception var50 = var43.getException();
    java.lang.Throwable[] var51 = var43.getSuppressed();
    java.lang.Exception var52 = var43.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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
    assertTrue("'" + var49 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var49.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test150");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    boolean var5 = var2.getPreserveSpace();
    int var6 = var2.numberOfChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var2.getAttrValue("4444444444");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test151");


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
    var15.log("nu_46_staldal_46_lagoon_46_util_46_TemplateException", 0);
    var15.setPassword("__52__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test152");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.destroy();
    java.lang.String var5 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.hasBeenUpdated(1433461993000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test153");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.util.Enumeration var17 = var0.getParamNames();
    var0.endElement("nu.staldal.lagoon.util.TemplateException", "4444444444", "nu.staldal.lagoon.core.LagoonException~~ ");
    java.lang.String var23 = var0.getParam("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    var0.startDocument();
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test154");


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
    var4.setColumn(1);
    java.lang.String var33 = var4.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~ hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test155");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    boolean var7 = var2.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var9 = var2.getChild(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test156");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.util.TemplateException", 0);
    nu.staldal.xtree.NodeWithChildren var4 = var3.getParent();
    int var5 = var3.numberOfChildren();
    var3.addNamespaceMapping("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", "nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = var3.getAttributeType(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test157");


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
    var22.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    var22.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test158");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ 4444444444", "##########");

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test159");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    java.lang.String var6 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var9 = var2.lookupAttribute("hi!", "");
    int var12 = var2.lookupAttribute("                                                                                                    ", "nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var14 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: hi_33_");
    var2.addAttribute("nu.staldal.lagoon.core.LagoonException: hi_33_", "nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~ hi__33__", "hi!");
    java.lang.String var21 = var2.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var23 = var2.getNamespaceMapping(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test160");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.endPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.endDocument();
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    nu.staldal.xtree.TreeBuilder var13 = new nu.staldal.xtree.TreeBuilder();
    var13.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var18 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var13, false, false);
    var13.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var23 = new nu.staldal.xtree.Element("hi!", "hi!");
    var23.setLine(100);
    int var26 = var23.numberOfNamespaceMappings();
    var13.setDocumentLocator((org.xml.sax.Locator)var23);
    var13.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var12.toSAX((org.xml.sax.ContentHandler)var13);
    var13.startPrefixMapping("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var13.endPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var13.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ ");
    var13.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    nu.staldal.xtree.Element var41 = var13.getTree();
    var41.addNamespaceMapping("          ", "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    var0.setDocumentLocator((org.xml.sax.Locator)var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var46 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test161");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"+ "'", var2.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test162");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("##", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    int var3 = var2.numberOfAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test163");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.core.OutputHandler var4 = var0.createFile("nu.staldal.lagoon.util.TemplateException: ");
    long var6 = var0.fileLastModified("nu.staldal.lagoon.util.TemplateException: ");
    long var8 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    long var10 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: ");
    boolean var11 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1433462002000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1433461996000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test164");


    boolean var1 = nu.staldal.util.Utils.absoluteURL(".");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test165");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.lang.String var6 = var3.getSystemId();
    int var7 = var3.getColumnNumber();
    java.lang.String var8 = var3.getTextContent();
    int var9 = var3.numberOfNamespaceMappings();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test166");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.destroy();
    java.lang.String var5 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.hasBeenUpdated(1433461990000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test167");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.ftp.FTPException~~ hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test168");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    var4.addAttribute("hi!", "", "hi!", "");
    java.lang.String var10 = var4.getTextContentOrNull();
    java.lang.String var13 = var4.getAttrValueOrNull("hi__33__", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test169");


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
    java.lang.String var83 = var75.getInheritedAttribute("", "nu.staldal.ftp.FTPException~ hi!");
    java.net.URL var84 = var75.getBaseURI();
    var75.setColumn(100);
    
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
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test170");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.net.URL var2 = var1.getBaseURI();
    boolean var3 = var1.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test171");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.init();
    var0.endPrefixMapping("nu.staldal.lagoon.util.TemplateException");
    var0.init();
    java.lang.String var6 = var0.getEntryName();
    var0.beforeBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test172");


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
    nu.staldal.xmlutil.ContentHandlerFixer var27 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4);
    nu.staldal.xmlutil.ContentHandlerFixer var29 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4, true);
    var4.skippedEntity("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var4.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    var4.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.processingInstruction("nu.staldal.lagoon.core.LagoonException~ hi__33__", ".");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test173");


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
    java.lang.String var21 = var1.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "aa"+ "'", var21.equals("aa"));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test174");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    java.lang.String var7 = var0.getParam("4444444444");
    java.lang.String var8 = var0.getEntryName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.hasBeenUpdated(1433461946000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test175");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var3 = var2.getPreserveSpace();
    int var4 = var2.getColumnNumber();
    var2.setPublicId("nu.staldal.ftp.FTPException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test176");


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
    var36.endPrefixMapping("nu.staldal.lagoon.util.TemplateException~ ");
    var36.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test177");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.init();
    org.apache.tools.ant.Location var7 = var1.getLocation();
    var1.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var1.log("", (-1));
    nu.staldal.lagoon.util.TemplateException var15 = new nu.staldal.lagoon.util.TemplateException("hi_33_");
    var1.log("", (java.lang.Throwable)var15, (-1));
    var1.setTargetURL("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    var1.reconfigure();
    var1.setTaskType("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test178");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    nu.staldal.xmlutil.ContentHandlerAdapter var11 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    var8.endDocument();
    var8.endPrefixMapping(" ");
    var8.endPrefixMapping("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
    var8.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.AuthenticationException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test179");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    nu.staldal.lagoon.core.XMLStreamProducer var5 = var0.getNext();
    var0.endPrefixMapping("nu.staldal.lagoon.util.TemplateException~~ ");
    nu.staldal.lagoon.core.LagoonContext var8 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test180");


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
    nu.staldal.lagoon.producer.BasicSplit var21 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("hi!");
    char[] var24 = var23.asCharArray();
    var21.characters(var24, 1, 10);
    var21.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var21.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    nu.staldal.xmlutil.ContentHandlerAdapter var34 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var21);
    var21.skippedEntity("");
    var2.outputStartElement((org.xml.sax.ContentHandler)var21);
    java.lang.String var38 = var21.getEntryName();
    nu.staldal.xmlutil.ContentHandlerAdapter var39 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var21);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test181");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    nu.staldal.xtree.TreeBuilder var11 = new nu.staldal.xtree.TreeBuilder();
    var11.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var16 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var11, false, false);
    nu.staldal.xtree.Text var18 = new nu.staldal.xtree.Text("");
    char[] var19 = var18.asCharArray();
    boolean var20 = var18.isWhitespaceNode();
    char[] var21 = var18.asCharArray();
    var11.ignorableWhitespace(var21, 0, 10);
    var0.characters(var21, 1, 10);
    var0.destroy();
    int var29 = var0.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test182");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setTargetURL("4444444444");
    java.lang.String var10 = var0.getTaskName();
    java.lang.String var11 = var0.getDescription();
    var0.setPassword("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    var0.reconfigure();
    var0.reconfigure();
    org.apache.tools.ant.Location var16 = var0.getLocation();
    java.lang.Object var17 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test183");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("hi!", "hi!");
    var10.setLine(100);
    int var13 = var10.numberOfNamespaceMappings();
    var0.setDocumentLocator((org.xml.sax.Locator)var10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var0.endPrefixMapping("                                                                                                    ");
    nu.staldal.xtree.Text var20 = new nu.staldal.xtree.Text("");
    char[] var21 = var20.asCharArray();
    char[] var22 = var20.asCharArray();
    nu.staldal.lagoon.producer.BasicSplit var23 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var25 = new nu.staldal.xtree.Text("hi!");
    char[] var26 = var25.asCharArray();
    var23.characters(var26, 1, 10);
    var23.endElement("", "hi!", "hi!");
    var23.processingInstruction("", "hi!");
    var23.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var23.startDocument();
    var23.skippedEntity("4444444444");
    var23.skippedEntity("hi!");
    var20.toSAX((org.xml.sax.ContentHandler)var23);
    java.lang.String var47 = var20.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException: ");
    char[] var48 = var20.asCharArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.characters(var48, 10, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test184");


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
    var4.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    nu.staldal.xtree.Element var32 = var4.getTree();
    int var35 = var32.lookupAttribute("nu.staldal.ftp.FTPException~~ hi!", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test185");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    var2.addAttribute("", "hi!", "", "hi!");
    java.lang.String var12 = var2.getInheritedAttribute("hi!", "4444444444");
    java.lang.String var14 = var2.getAttributeLocalName(0);
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("", "hi!", 10);
    var18.setSystemId("hi!");
    java.lang.String var22 = var18.lookupNamespaceURI("4444444444");
    var2.addChild((nu.staldal.xtree.Node)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var25 = var18.getAttributeValue(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test186");


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
    int var19 = var2.getLineNumber();
    boolean var20 = var2.getPreserveSpace();
    boolean var21 = var2.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test187");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    org.apache.tools.ant.Target var9 = var5.getOwningTarget();
    var5.setTaskType("hi_33_");
    var5.setTaskType("nu.staldal.lagoon.util.TemplateException");
    var5.log("hi!", 0);
    java.lang.String var17 = var5.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test188");


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
    java.lang.String var28 = var11.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var29 = var11.getTextContent();
    java.lang.String var32 = var11.getInheritedAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.util.TemplateException~~ ");
    
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
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test189");


    nu.staldal.lagoon.filestorage.SSHFileStorage var0 = new nu.staldal.lagoon.filestorage.SSHFileStorage();
    boolean var1 = var0.needPassword();
    boolean var2 = var0.needPassword();
    boolean var3 = var0.isReentrant();
    boolean var4 = var0.needPassword();
    boolean var5 = var0.needPassword();
    boolean var6 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test190");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.util.TemplateException: _32__32__32__32__32__32__32__32__32__32_", "_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test191");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    var4.addNamespaceMapping("", "4444444444");
    java.lang.String var11 = var4.getTextContentOrNull();
    var4.setColumn(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test192");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    var0.destroy();
    var0.init();
    var0.init();
    var0.init();
    var0.afterBuild();

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test193");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    long var8 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: ");
    var0.close();
    nu.staldal.lagoon.core.OutputHandler var11 = var0.createFile("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    nu.staldal.lagoon.core.OutputHandler var13 = var0.createFile("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462002000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test194");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    var0.setTargetURL("nu.staldal.lagoon.util.TemplateException");
    var0.init();
    var0.setPassword("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    org.apache.tools.ant.Target var7 = var0.getOwningTarget();
    org.apache.tools.ant.RuntimeConfigurable var8 = var0.getRuntimeConfigurableWrapper();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var12 = new nu.staldal.ftp.FTPException("hi!");
    var9.log("", (java.lang.Throwable)var12, 10);
    org.apache.tools.ant.Location var15 = var9.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var16 = var9.getRuntimeConfigurableWrapper();
    var9.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var22 = new nu.staldal.ftp.FTPException("hi!");
    var19.log("", (java.lang.Throwable)var22, 10);
    org.apache.tools.ant.Project var25 = var19.getProject();
    nu.staldal.lagoon.util.TemplateException var27 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var28 = var27.getException();
    var19.log("", (java.lang.Throwable)var27, (-1));
    var9.bindToOwner((org.apache.tools.ant.Task)var19);
    org.apache.tools.ant.Project var32 = var9.getProject();
    org.apache.tools.ant.Target var33 = var9.getOwningTarget();
    var9.setTargetURL("4444444444");
    java.lang.String var36 = var9.getDescription();
    var0.bindToOwner((org.apache.tools.ant.Task)var9);
    org.apache.tools.ant.RuntimeConfigurable var38 = var9.getRuntimeConfigurableWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test195");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setTaskType("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    var10.bindToOwner((org.apache.tools.ant.Task)var11);
    var10.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    var15.setPassword("");
    var10.bindToOwner((org.apache.tools.ant.Task)var15);
    org.apache.tools.ant.Project var19 = var10.getProject();
    org.apache.tools.ant.Project var20 = var10.getProject();
    org.apache.tools.ant.Location var21 = var10.getLocation();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    var22.bindToOwner((org.apache.tools.ant.Task)var23);
    var23.log("hi!");
    java.lang.String var27 = var23.getTaskName();
    var23.init();
    org.apache.tools.ant.Location var29 = var23.getLocation();
    var10.setLocation(var29);
    var0.bindToOwner((org.apache.tools.ant.Task)var10);
    java.lang.String var32 = var0.getDescription();
    var0.init();
    org.apache.tools.ant.RuntimeConfigurable var34 = var0.getRuntimeConfigurableWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test196");


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
    boolean var43 = var2.getPreserveSpace();
    java.lang.String var44 = var2.getSystemId();
    
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
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + ""+ "'", var44.equals(""));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test197");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    nu.staldal.xtree.Text var15 = new nu.staldal.xtree.Text("");
    char[] var16 = var15.asCharArray();
    char[] var17 = var15.asCharArray();
    var0.ignorableWhitespace(var17, 10, 0);
    java.lang.String var22 = var0.getParam("");
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    java.lang.String var32 = var25.getTextContent();
    java.lang.String var34 = var25.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    var37.setSystemId("");
    java.net.URL var40 = var37.getBaseURI();
    java.lang.String var43 = var37.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "hi!");
    var46.addNamespaceMapping("", "");
    var37.addChild((nu.staldal.xtree.Node)var46);
    java.lang.String var53 = var46.getInheritedAttribute("", "hi!");
    var25.addChild((nu.staldal.xtree.Node)var46);
    var46.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "                                                                                                    ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var46);
    java.lang.String var61 = var0.getEntryName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test198");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.endPrefixMapping("hi_33_");
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    var0.startPrefixMapping("nu.staldal.lagoon.util.TemplateException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException", "__32____32____32____32____32____32____32____32____32____32__");

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test199");


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
    java.lang.String var55 = var49.getValue();
    
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
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test200");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "4444444444", 100);
    int var4 = var3.numberOfChildren();
    java.lang.String var6 = var3.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    var9.setSystemId("");
    java.net.URL var12 = var9.getBaseURI();
    java.lang.String var15 = var9.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("hi!", "hi!");
    var18.addNamespaceMapping("", "");
    var9.addChild((nu.staldal.xtree.Node)var18);
    int var23 = var18.getColumnNumber();
    java.lang.String var25 = var18.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var27 = var18.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var29 = var3.replaceChild((nu.staldal.xtree.Node)var18, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test201");


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
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    var12.bindToOwner((org.apache.tools.ant.Task)var13);
    var13.log("hi!");
    java.lang.String var17 = var13.getTaskName();
    var13.init();
    org.apache.tools.ant.Location var19 = var13.getLocation();
    var0.setLocation(var19);
    var0.setTaskType("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.lagoon.util.TemplateException var24 = new nu.staldal.lagoon.util.TemplateException("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var0.log((java.lang.Throwable)var24, (-1));
    var0.setDescription("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test202");


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
    int var19 = var2.getColumnNumber();
    java.lang.String var20 = var2.getLocalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test203");


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
    var18.processingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var25 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    nu.staldal.xmlutil.ContentHandlerAdapter var26 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test204");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.util.TemplateException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_ftp_46_FTPException_126__126__32_hi_33_");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test205");


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
    var22.processingInstruction("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu.staldal.lagoon.util.TemplateException: ");
    var22.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    
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

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test206");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    java.lang.String var6 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var7 = var2.getTextContent();
    int var8 = var2.numberOfNamespaceMappings();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = var2.getAttributeValue(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test207");


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
    java.lang.String var41 = var35.toString();
    java.lang.String var42 = var35.toString();
    
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
    assertTrue("'" + var41 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var41.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var42.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test208");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var2, false, true);
    var2.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var10 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var2);
    var2.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    var2.endDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var17 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var2, false, false);
    nu.staldal.lagoon.producer.BasicSplit var18 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var20 = new nu.staldal.xtree.Text("hi!");
    char[] var21 = var20.asCharArray();
    var18.characters(var21, 1, 10);
    var18.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var28 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var18, true);
    nu.staldal.xmlutil.ContentHandlerAdapter var29 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var18);
    var29.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    char[] var35 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var39 = new nu.staldal.xtree.Text(var35, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var40 = new nu.staldal.xtree.TreeBuilder();
    var40.endPrefixMapping("hi!");
    var40.endDocument();
    var40.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var39.toSAX((org.xml.sax.ContentHandler)var40);
    var40.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    char[] var53 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var57 = new nu.staldal.xtree.Text(var53, 1, 0, false);
    char[] var58 = var57.asCharArray();
    var40.ignorableWhitespace(var58, 10, 10);
    var29.ignorableWhitespace(var58, 100, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.characters(var58, 100, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test209");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.AuthenticationMissingException", "");
    boolean var3 = var2.isWhitespaceNode();
    java.lang.String var4 = var2.getValue();
    java.lang.String var5 = var2.getValue();
    java.lang.String var6 = var2.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "nu.staldal.lagoon.core.AuthenticationMissingException"+ "'", var6.equals("nu.staldal.lagoon.core.AuthenticationMissingException"));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test210");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    nu.staldal.lagoon.LagoonAntTask var4 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var7 = new nu.staldal.ftp.FTPException("hi!");
    var4.log("", (java.lang.Throwable)var7, 10);
    org.apache.tools.ant.Location var10 = var4.getLocation();
    nu.staldal.lagoon.core.LagoonException var13 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var4.log("4444444444", (java.lang.Throwable)var13, 100);
    java.lang.String var16 = var13.toString();
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var20 = new nu.staldal.ftp.FTPException("hi!");
    var17.log("", (java.lang.Throwable)var20, 10);
    org.apache.tools.ant.Project var23 = var17.getProject();
    nu.staldal.lagoon.util.TemplateException var25 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var26 = var25.getException();
    var17.log("", (java.lang.Throwable)var25, (-1));
    java.lang.Throwable[] var29 = var25.getSuppressed();
    java.lang.Throwable[] var30 = var25.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var32 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var33 = var32.toString();
    var25.addSuppressed((java.lang.Throwable)var32);
    var13.addSuppressed((java.lang.Throwable)var32);
    var0.log("4444444444", (java.lang.Throwable)var32, (-1));
    nu.staldal.lagoon.util.TemplateException var39 = new nu.staldal.lagoon.util.TemplateException("hi_33_");
    var32.addSuppressed((java.lang.Throwable)var39);
    nu.staldal.lagoon.LagoonAntTask var41 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var44 = new nu.staldal.ftp.FTPException("hi!");
    var41.log("", (java.lang.Throwable)var44, 10);
    org.apache.tools.ant.Project var47 = var41.getProject();
    nu.staldal.lagoon.util.TemplateException var49 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var50 = var49.getException();
    var41.log("", (java.lang.Throwable)var49, (-1));
    var39.addSuppressed((java.lang.Throwable)var49);
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
    nu.staldal.lagoon.util.TemplateException var72 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var73 = var72.getException();
    nu.staldal.lagoon.util.TemplateException var74 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var72);
    var69.addSuppressed((java.lang.Throwable)var72);
    var39.addSuppressed((java.lang.Throwable)var72);
    java.lang.Exception var77 = var72.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var16.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var33.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
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
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test211");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.close();
    long var7 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    long var9 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1433461967000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test212");


    char[] var2 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text(var2, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var7 = new nu.staldal.xtree.TreeBuilder();
    var7.endPrefixMapping("hi!");
    var7.endDocument();
    var7.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var6.toSAX((org.xml.sax.ContentHandler)var7);
    var7.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    nu.staldal.xtree.TreeBuilder var18 = new nu.staldal.xtree.TreeBuilder();
    var18.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var23 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var18, false, false);
    nu.staldal.xtree.Text var25 = new nu.staldal.xtree.Text("");
    char[] var26 = var25.asCharArray();
    boolean var27 = var25.isWhitespaceNode();
    char[] var28 = var25.asCharArray();
    var18.ignorableWhitespace(var28, 0, 10);
    var7.ignorableWhitespace(var28, 10, 0);
    var7.endDocument();
    var7.startDocument();
    var7.startPrefixMapping("hi__33__", "nu.staldal.lagoon.core.LagoonException~~ ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var40 = var7.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test213");


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
    int var19 = var2.getLineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeAttribute(2);
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
    assertTrue(var19 == (-1));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test214");


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
    var0.log("nu.staldal.lagoon.core.LagoonException~ ", (-1));
    var0.log("nu_46_staldal_46_lagoon_46_util_46_TemplateException", 100);
    nu.staldal.lagoon.core.LagoonException var39 = new nu.staldal.lagoon.core.LagoonException("hi_33_");
    java.lang.Throwable[] var40 = var39.getSuppressed();
    var0.log((java.lang.Throwable)var39, 0);
    nu.staldal.lagoon.util.TemplateException var43 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var39);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test215");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("aa", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", 100, (-1));
    int var7 = var4.lookupAttribute("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    char[] var10 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text(var10, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var15 = new nu.staldal.xtree.TreeBuilder();
    var15.endPrefixMapping("hi!");
    var15.endDocument();
    var15.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var14.toSAX((org.xml.sax.ContentHandler)var15);
    var15.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var15.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var28 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var15);
    var28.endDocument();
    var4.outputStartElement((org.xml.sax.ContentHandler)var28);
    var28.endElement("nu.staldal.lagoon.core.LagoonException: aa", "nu.staldal.ftp.FTPException~                                                                                                     ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test216");


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
    var0.init();
    var0.setPassword("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var33 = new nu.staldal.lagoon.LagoonAntTask();
    var32.bindToOwner((org.apache.tools.ant.Task)var33);
    var32.setForce(true);
    var32.setTaskName("");
    org.apache.tools.ant.Target var39 = var32.getOwningTarget();
    var32.log("hi!");
    java.lang.String var42 = var32.getDescription();
    var0.bindToOwner((org.apache.tools.ant.Task)var32);
    java.lang.String var44 = var0.getDescription();
    
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
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test217");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    char[] var3 = var1.asCharArray();
    char[] var4 = var1.asCharArray();
    boolean var5 = var1.isWhitespaceNode();
    nu.staldal.lagoon.producer.BasicSplit var6 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var8 = new nu.staldal.xtree.Text("hi!");
    char[] var9 = var8.asCharArray();
    var6.characters(var9, 1, 10);
    var6.endElement("", "hi!", "hi!");
    var6.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var20 = new nu.staldal.xtree.Text("");
    char[] var21 = var20.asCharArray();
    char[] var22 = var20.asCharArray();
    char[] var23 = var20.asCharArray();
    var6.characters(var23, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var27 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var6);
    nu.staldal.xmlutil.DocumentHandlerAdapter var28 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var27);
    nu.staldal.xtree.Element var31 = new nu.staldal.xtree.Element("hi!", "hi!");
    var31.setSystemId("");
    java.net.URL var34 = var31.getBaseURI();
    java.lang.String var37 = var31.getAttrValueOrNull("", "");
    var28.setDocumentLocator((org.xml.sax.Locator)var31);
    nu.staldal.xtree.Text var40 = new nu.staldal.xtree.Text("");
    char[] var41 = var40.asCharArray();
    char[] var42 = var40.asCharArray();
    var28.characters(var42, 100, 100);
    nu.staldal.xtree.Element var48 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var49 = var48.getLineNumber();
    var48.setPublicId("");
    int var52 = var48.getLineNumber();
    java.lang.String var54 = var48.lookupNamespacePrefix("hi_33_");
    var28.setDocumentLocator((org.xml.sax.Locator)var48);
    nu.staldal.xmlutil.ContentHandlerFixer var58 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var28, false, false);
    var1.toSAX((org.xml.sax.ContentHandler)var58);
    var58.skippedEntity("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test218");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    var0.init();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    nu.staldal.lagoon.core.LagoonContext var6 = var0.getContext();
    java.util.Enumeration var7 = var0.getParamNames();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.hasBeenUpdated(1433461927000L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test219");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    nu.staldal.lagoon.LagoonAntTask var4 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var7 = new nu.staldal.ftp.FTPException("hi!");
    var4.log("", (java.lang.Throwable)var7, 10);
    org.apache.tools.ant.Location var10 = var4.getLocation();
    nu.staldal.lagoon.core.LagoonException var13 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var4.log("4444444444", (java.lang.Throwable)var13, 100);
    java.lang.String var16 = var13.toString();
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var20 = new nu.staldal.ftp.FTPException("hi!");
    var17.log("", (java.lang.Throwable)var20, 10);
    org.apache.tools.ant.Project var23 = var17.getProject();
    nu.staldal.lagoon.util.TemplateException var25 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var26 = var25.getException();
    var17.log("", (java.lang.Throwable)var25, (-1));
    java.lang.Throwable[] var29 = var25.getSuppressed();
    java.lang.Throwable[] var30 = var25.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var32 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var33 = var32.toString();
    var25.addSuppressed((java.lang.Throwable)var32);
    var13.addSuppressed((java.lang.Throwable)var32);
    var0.log("4444444444", (java.lang.Throwable)var32, (-1));
    var0.init();
    var0.maybeConfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var16.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var33.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test220");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    java.lang.String var3 = var2.getLocalName();
    java.lang.String var5 = var2.lookupNamespacePrefix("                                                                                                    ");
    java.lang.String var8 = var2.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.ftp.FTPException: hi!");
    java.lang.String var11 = var2.getInheritedAttribute("aaaaaaaaaa", "          ");
    java.lang.String var13 = var2.lookupNamespacePrefix("  ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test221");


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
    java.lang.String var28 = var22.getPublicId();
    java.lang.String var31 = var22.getAttrValueOrNull(" ", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test222");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("", "hi!");
    java.lang.String var3 = var2.getValue();
    java.lang.String var4 = var2.getValue();
    java.lang.String var6 = var2.lookupNamespacePrefix("");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var14 = var11.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var15 = new nu.staldal.xtree.TreeBuilder();
    var11.toSAX((org.xml.sax.ContentHandler)var15);
    var15.skippedEntity("hi!");
    var15.skippedEntity("hi!");
    nu.staldal.xtree.Element var23 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var15.setDocumentLocator((org.xml.sax.Locator)var23);
    var15.startDocument();
    nu.staldal.xtree.Element var26 = var15.getTree();
    var15.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~ ");
    var15.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.toSAX((org.xml.sax.ContentHandler)var15);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test223");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("nu.staldal.lagoon.util.TemplateException: aa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_aa"+ "'", var1.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_aa"));

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test224");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var0.init();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test225");


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
    nu.staldal.xtree.TreeBuilder var54 = new nu.staldal.xtree.TreeBuilder();
    var54.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var59 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var54, false, false);
    var54.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var64 = new nu.staldal.xtree.Element("hi!", "hi!");
    var64.setLine(100);
    int var67 = var64.numberOfNamespaceMappings();
    var54.setDocumentLocator((org.xml.sax.Locator)var64);
    nu.staldal.xtree.Element var71 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var72 = var71.getLineNumber();
    nu.staldal.xtree.NodeWithChildren var73 = var71.getParent();
    var71.setSystemId("nu.staldal.lagoon.util.TemplateException");
    java.lang.String var77 = var71.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    var54.setDocumentLocator((org.xml.sax.Locator)var71);
    var54.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var81 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var54, false);
    var33.toSAX((org.xml.sax.ContentHandler)var81);
    
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
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test226");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    boolean var5 = var0.isReentrant();
    long var7 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: 4444444444");
    long var9 = var0.fileLastModified("aaaaaaaaaa");
    boolean var10 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462002000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1433462001000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test227");


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
    org.apache.tools.ant.Project var23 = var0.getProject();
    var0.setTaskName("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var29 = new nu.staldal.ftp.FTPException("hi!");
    var26.log("", (java.lang.Throwable)var29, 10);
    java.lang.String var32 = var26.getDescription();
    nu.staldal.lagoon.LagoonAntTask var33 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var36 = new nu.staldal.ftp.FTPException("hi!");
    var33.log("", (java.lang.Throwable)var36, 10);
    org.apache.tools.ant.Location var39 = var33.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var40 = var33.getRuntimeConfigurableWrapper();
    var33.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var43 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var46 = new nu.staldal.ftp.FTPException("hi!");
    var43.log("", (java.lang.Throwable)var46, 10);
    org.apache.tools.ant.Project var49 = var43.getProject();
    nu.staldal.lagoon.util.TemplateException var51 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var52 = var51.getException();
    var43.log("", (java.lang.Throwable)var51, (-1));
    var33.bindToOwner((org.apache.tools.ant.Task)var43);
    org.apache.tools.ant.Location var56 = var43.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var57 = var43.getRuntimeConfigurableWrapper();
    var26.setRuntimeConfigurableWrapper(var57);
    java.lang.String var59 = var26.getTaskType();
    var26.setTaskType("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    var0.bindToOwner((org.apache.tools.ant.Task)var26);
    org.apache.tools.ant.RuntimeConfigurable var63 = var26.getRuntimeConfigurableWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test228");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    java.lang.String var18 = var2.getPublicId();
    int var19 = var2.getColumnNumber();
    nu.staldal.xtree.Element var20 = var2.getFirstChildElementOrNull();
    boolean var21 = var20.getPreserveSpace();
    java.lang.String var24 = var20.getInheritedAttribute("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "");
    var20.setPublicId("nu.staldal.lagoon.util.TemplateException");
    boolean var27 = var20.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test229");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    var0.init();
    var0.afterBuild();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.hasBeenUpdated(1433461950000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test230");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var2 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var3 = var0.getNext();
    var0.destroy();
    nu.staldal.lagoon.core.ByteStreamProducer var5 = var0.getNext();
    java.lang.String var7 = var0.getParam("          ");
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var9 = var0.getNext();
    
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

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test231");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    boolean var3 = var1.isWhitespaceNode();
    int var4 = var1.getLineNumber();
    java.lang.String var6 = var1.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var7 = var1.getValue();
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var15 = var12.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var16 = new nu.staldal.xtree.TreeBuilder();
    var12.toSAX((org.xml.sax.ContentHandler)var16);
    var16.endDocument();
    var16.startDocument();
    var16.startPrefixMapping("4444444444", "4444444444");
    nu.staldal.lagoon.producer.BasicSplit var23 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var25 = new nu.staldal.xtree.Text("hi!");
    char[] var26 = var25.asCharArray();
    var23.characters(var26, 1, 10);
    var23.endElement("", "hi!", "hi!");
    var23.processingInstruction("", "hi!");
    var23.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var23.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var41 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var23);
    java.util.Enumeration var42 = var23.getParamNames();
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "hi!");
    var45.setLine(100);
    java.lang.String var49 = var45.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var23.setDocumentLocator((org.xml.sax.Locator)var45);
    char[] var53 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var57 = new nu.staldal.xtree.Text(var53, 1, 0, false);
    var23.characters(var53, 1, 2);
    var16.ignorableWhitespace(var53, 2, 10);
    var16.endPrefixMapping("nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    var1.toSAX((org.xml.sax.ContentHandler)var16);
    var16.endDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.processingInstruction("nu.staldal.ftp.FTPException~~~~ hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test232");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    nu.staldal.lagoon.util.TemplateException var11 = new nu.staldal.lagoon.util.TemplateException("4444444444");
    var0.log((java.lang.Throwable)var11, 1);
    org.apache.tools.ant.RuntimeConfigurable var14 = var0.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Target var15 = var0.getOwningTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test233");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var11.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var11.setLine(1);
    java.lang.String var24 = var11.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    var11.setPublicId("nu.staldal.ftp.FTPException~~ hi!");
    java.lang.String var28 = var11.lookupNamespacePrefix("nu.staldal.lagoon.core.AuthenticationException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var30 = var11.getAttributeType(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test234");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    java.lang.String var8 = var2.getInheritedAttribute("", "4444444444");
    int var9 = var2.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var10 = new nu.staldal.xtree.TreeBuilder();
    var10.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var15 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var10, false, false);
    var2.toSAX((org.xml.sax.ContentHandler)var15);
    java.lang.String var18 = var2.lookupNamespaceURI("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    int var19 = var2.numberOfAttributes();
    var2.setColumn(100);
    var2.setSystemId("nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var24 = var2.getLocalName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var26 = var2.getAttributeLocalName(0);
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test235");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("_52_", "nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", 100);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test236");


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
    java.lang.String var54 = var20.getLocalName();
    nu.staldal.xtree.Element var55 = var20.getFirstChildElement();
    nu.staldal.xtree.Element var58 = var55.getFirstChildElementOrNull("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    nu.staldal.xtree.Element var59 = var55.getFirstChildElement();
    
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
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test237");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    var9.addNamespaceMapping("", "4444444444");
    java.lang.String var16 = var9.getTextContent();
    var2.insertChild((nu.staldal.xtree.Node)var9, 0);
    int var19 = var9.numberOfNamespaceMappings();
    var9.setSystemId("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    java.net.URL var22 = var9.getBaseURI();
    java.lang.String var23 = var9.getPublicId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var25 = var9.getAttributeNamespaceURI(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test238");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test239");


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
    var0.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    nu.staldal.lagoon.producer.BasicSplit var18 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var20 = new nu.staldal.xtree.Text("hi!");
    char[] var21 = var20.asCharArray();
    var18.characters(var21, 1, 10);
    var18.endElement("", "hi!", "hi!");
    var18.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var32 = new nu.staldal.xtree.Text("");
    char[] var33 = var32.asCharArray();
    char[] var34 = var32.asCharArray();
    char[] var35 = var32.asCharArray();
    var18.characters(var35, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var39 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var18);
    nu.staldal.xmlutil.DocumentHandlerAdapter var40 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var39);
    nu.staldal.xtree.Element var43 = new nu.staldal.xtree.Element("hi!", "hi!");
    var43.setSystemId("");
    java.net.URL var46 = var43.getBaseURI();
    java.lang.String var49 = var43.getAttrValueOrNull("", "");
    var40.setDocumentLocator((org.xml.sax.Locator)var43);
    var40.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var54 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var40, false, true);
    var54.processingInstruction("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Text var59 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var61 = var59.lookupNamespaceURI("");
    char[] var62 = var59.asCharArray();
    var54.ignorableWhitespace(var62, 10, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.characters(var62, (-1), 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test240");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.LagoonAntTask var8 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    var8.bindToOwner((org.apache.tools.ant.Task)var9);
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var15 = new nu.staldal.ftp.FTPException("hi!");
    var12.log("", (java.lang.Throwable)var15, 10);
    org.apache.tools.ant.Location var18 = var12.getLocation();
    nu.staldal.lagoon.core.LagoonException var21 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var12.log("4444444444", (java.lang.Throwable)var21, 100);
    java.lang.String var24 = var21.toString();
    nu.staldal.lagoon.LagoonAntTask var25 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var28 = new nu.staldal.ftp.FTPException("hi!");
    var25.log("", (java.lang.Throwable)var28, 10);
    org.apache.tools.ant.Project var31 = var25.getProject();
    nu.staldal.lagoon.util.TemplateException var33 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var34 = var33.getException();
    var25.log("", (java.lang.Throwable)var33, (-1));
    java.lang.Throwable[] var37 = var33.getSuppressed();
    java.lang.Throwable[] var38 = var33.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var40 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var41 = var40.toString();
    var33.addSuppressed((java.lang.Throwable)var40);
    var21.addSuppressed((java.lang.Throwable)var40);
    var8.log("4444444444", (java.lang.Throwable)var40, (-1));
    nu.staldal.lagoon.util.TemplateException var47 = new nu.staldal.lagoon.util.TemplateException("hi_33_");
    var40.addSuppressed((java.lang.Throwable)var47);
    nu.staldal.lagoon.LagoonAntTask var49 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var52 = new nu.staldal.ftp.FTPException("hi!");
    var49.log("", (java.lang.Throwable)var52, 10);
    org.apache.tools.ant.Project var55 = var49.getProject();
    nu.staldal.lagoon.util.TemplateException var57 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var58 = var57.getException();
    var49.log("", (java.lang.Throwable)var57, (-1));
    var47.addSuppressed((java.lang.Throwable)var57);
    var0.log("nu.staldal.lagoon.core.LagoonException: ", (java.lang.Throwable)var47, 0);
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var24.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var41.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test241");


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
    nu.staldal.xtree.Element var41 = new nu.staldal.xtree.Element("hi!", "hi!");
    var41.setSystemId("");
    java.net.URL var44 = var41.getBaseURI();
    java.lang.String var47 = var41.getAttrValueOrNull("", "");
    java.lang.String var48 = var41.getTextContent();
    var41.setColumn(100);
    java.lang.String var51 = var41.getTextContent();
    var22.setDocumentLocator((org.xml.sax.Locator)var41);
    var22.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test242");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8);
    var14.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.TreeBuilder var17 = new nu.staldal.xtree.TreeBuilder();
    var17.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var22 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var17, false, false);
    nu.staldal.xtree.Text var24 = new nu.staldal.xtree.Text("");
    char[] var25 = var24.asCharArray();
    boolean var26 = var24.isWhitespaceNode();
    char[] var27 = var24.asCharArray();
    var17.ignorableWhitespace(var27, 0, 10);
    var14.ignorableWhitespace(var27, (-1), 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var34 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var14);
    nu.staldal.lagoon.producer.BasicSplit var35 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var37 = new nu.staldal.xtree.Text("hi!");
    char[] var38 = var37.asCharArray();
    var35.characters(var38, 1, 10);
    var14.ignorableWhitespace(var38, 2, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.processingInstruction("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test243");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("", "hi!");
    java.lang.String var3 = var2.getValue();
    java.lang.String var4 = var2.getValue();
    java.lang.String var5 = var2.getValue();
    nu.staldal.lagoon.producer.BasicSplit var6 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var8 = new nu.staldal.xtree.Text("hi!");
    char[] var9 = var8.asCharArray();
    var6.characters(var9, 1, 10);
    var6.endElement("", "hi!", "hi!");
    var6.processingInstruction("", "hi!");
    var6.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var6.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var24 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var6);
    var24.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var26 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var24);
    nu.staldal.xmlutil.DocumentHandlerAdapter var27 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var24);
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("hi!", "hi!");
    var30.setSystemId("");
    java.net.URL var33 = var30.getBaseURI();
    java.lang.String var36 = var30.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var39 = new nu.staldal.xtree.Element("hi!", "hi!");
    var39.addNamespaceMapping("", "");
    var30.addChild((nu.staldal.xtree.Node)var39);
    var39.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var39.setLine(1);
    java.lang.String var52 = var39.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    var27.setDocumentLocator((org.xml.sax.Locator)var39);
    var27.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var55 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var27);
    var2.toSAX((org.xml.sax.ContentHandler)var55);
    var55.processingInstruction("nu.staldal.ftp.FTPException~ hi!", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    nu.staldal.xtree.Text var61 = new nu.staldal.xtree.Text("");
    char[] var62 = var61.asCharArray();
    char[] var63 = var61.asCharArray();
    var55.characters(var63, (-1), 10);
    var55.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test244");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    java.util.Enumeration var1 = var0.getParamNames();
    var0.destroy();
    boolean var4 = var0.hasBeenUpdated(1433461950000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test245");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.util.TemplateException", 0, 1);
    boolean var5 = var4.getPreserveSpace();
    nu.staldal.xtree.Element var6 = var4.getFirstChildElementOrNull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = var4.getAttrValue("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test246");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test247");


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
      boolean var8 = var0.hasBeenUpdated(1433462001000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test248");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var8 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var8.endDocument();
    var8.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var11 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var8);
    var8.startDocument();
    var8.startDocument();
    var8.startDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.processingInstruction("nu__46__staldal__46__lagoon__46__util__46__TemplateException__126____32__", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test249");


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
    nu.staldal.xtree.Element var56 = new nu.staldal.xtree.Element("hi!", "hi!");
    var56.setSystemId("");
    java.net.URL var59 = var56.getBaseURI();
    java.lang.String var62 = var56.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var65 = new nu.staldal.xtree.Element("hi!", "hi!");
    var65.addNamespaceMapping("", "");
    var56.addChild((nu.staldal.xtree.Node)var65);
    var56.setSystemId("");
    var56.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var79 = var56.getAttrValueOrNull("4444444444", "4444444444");
    var56.addAttribute("hi!", "hi!", "", "hi!");
    java.net.URL var85 = var56.getBaseURI();
    nu.staldal.xtree.Element var86 = var56.getFirstChildElementOrNull();
    java.lang.String var87 = var86.getTextContentOrNull();
    java.lang.String var89 = var86.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.insertChild((nu.staldal.xtree.Node)var86, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + ""+ "'", var87.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test250");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("", "____32________32________32________32________32________32________32________32________32________32____");

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test251");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    int var19 = var11.getColumnNumber();
    nu.staldal.xtree.Element var22 = var11.getFirstChildElementOrNull("hi!", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("", "hi!", 10);
    var26.setSystemId("hi!");
    java.lang.String var29 = var26.getSystemId();
    var11.addChild((nu.staldal.xtree.Node)var26);
    java.lang.String var31 = var26.getNamespaceURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test252");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    nu.staldal.xtree.Text var15 = new nu.staldal.xtree.Text("");
    char[] var16 = var15.asCharArray();
    char[] var17 = var15.asCharArray();
    var0.ignorableWhitespace(var17, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var23 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, true);
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("hi!", "hi!");
    var26.setSystemId("");
    java.net.URL var29 = var26.getBaseURI();
    java.lang.String var32 = var26.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("hi!", "hi!");
    var35.addNamespaceMapping("", "");
    var26.addChild((nu.staldal.xtree.Node)var35);
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("hi!", "hi!");
    var42.setSystemId("");
    java.net.URL var45 = var42.getBaseURI();
    java.lang.String var48 = var42.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var51 = new nu.staldal.xtree.Element("hi!", "hi!");
    var51.addNamespaceMapping("", "");
    var42.addChild((nu.staldal.xtree.Node)var51);
    int var56 = var51.getColumnNumber();
    java.lang.String var58 = var51.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var51.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var26.addChild((nu.staldal.xtree.Node)var51);
    int var67 = var51.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var70 = new nu.staldal.xtree.Element("hi!", "hi!");
    var70.setSystemId("");
    java.net.URL var73 = var70.getBaseURI();
    java.lang.String var75 = var70.getAttrValueOrNull("hi_33_");
    java.lang.String var78 = var70.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var79 = var70.getBaseURI();
    int var80 = var70.numberOfChildren();
    var51.insertChild((nu.staldal.xtree.Node)var70, 0);
    boolean var83 = var70.getPreserveSpace();
    var23.setDocumentLocator((org.xml.sax.Locator)var70);
    java.lang.String var85 = var70.getTextContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + ""+ "'", var85.equals(""));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test253");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", (-1), "nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test254");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    java.lang.Exception var2 = var1.getException();
    nu.staldal.lagoon.util.TemplateException var3 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test255");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    int var13 = var4.lookupAttribute("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException");
    boolean var14 = var4.getPreserveSpace();
    var4.setColumn((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test256");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.ftp.FTPException~                                                                                                     ", 100, "nu.staldal.ftp.FTPException~~~~ hi!", ".", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test257");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("##########", "nu.staldal.lagoon.core.LagoonException: 4444444444", 1);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test258");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    var0.init();
    var0.beforeBuild();
    var0.endPrefixMapping("nu.staldal.lagoon.util.TemplateException");
    var0.endPrefixMapping("aa");
    var0.endPrefixMapping("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test259");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var3 = var2.getPreserveSpace();
    var2.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "4444444444", "nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var11 = var2.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException");
    boolean var12 = var2.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test260");


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
    nu.staldal.xtree.Element var43 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var44 = var43.getPreserveSpace();
    var43.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "4444444444", "nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var27.addChild((nu.staldal.xtree.Node)var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var52 = var27.getAttrValue("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
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
    assertTrue(var44 == false);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test261");


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
    nu.staldal.lagoon.LagoonAntTask var31 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    var31.bindToOwner((org.apache.tools.ant.Task)var32);
    var31.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    var36.setPassword("");
    var31.bindToOwner((org.apache.tools.ant.Task)var36);
    org.apache.tools.ant.Target var40 = var36.getOwningTarget();
    var36.setPassword("hi!");
    nu.staldal.lagoon.LagoonAntTask var43 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var44 = new nu.staldal.lagoon.LagoonAntTask();
    var43.bindToOwner((org.apache.tools.ant.Task)var44);
    var43.log("");
    java.lang.Object var48 = var43.clone();
    nu.staldal.lagoon.LagoonAntTask var49 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var52 = new nu.staldal.ftp.FTPException("hi!");
    var49.log("", (java.lang.Throwable)var52, 10);
    org.apache.tools.ant.Location var55 = var49.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var56 = var49.getRuntimeConfigurableWrapper();
    var49.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var59 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var62 = new nu.staldal.ftp.FTPException("hi!");
    var59.log("", (java.lang.Throwable)var62, 10);
    org.apache.tools.ant.Project var65 = var59.getProject();
    nu.staldal.lagoon.util.TemplateException var67 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var68 = var67.getException();
    var59.log("", (java.lang.Throwable)var67, (-1));
    var49.bindToOwner((org.apache.tools.ant.Task)var59);
    org.apache.tools.ant.Location var72 = var59.getLocation();
    var43.setLocation(var72);
    java.lang.String var74 = var43.getTaskName();
    org.apache.tools.ant.RuntimeConfigurable var75 = var43.getRuntimeConfigurableWrapper();
    var36.setRuntimeConfigurableWrapper(var75);
    var15.bindToOwner((org.apache.tools.ant.Task)var36);
    org.apache.tools.ant.Location var78 = var15.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test262");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 1);
    var3.addAttribute("hi!", "", "hi!", "");
    java.lang.String var11 = var3.getInheritedAttribute("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_");
    java.lang.String var12 = var3.getLocalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test263");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "hi_33_");
    int var3 = var2.numberOfAttributes();
    java.lang.String var5 = var2.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    nu.staldal.xtree.Element var8 = var2.getFirstChildElementOrNull("nu_46_staldal_46_lagoon_46_core_46_AuthenticationException", "nu.staldal.lagoon.util.TemplateException: hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test264");


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
    nu.staldal.xmlutil.ContentHandlerAdapter var80 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var22);
    var80.startDocument();
    
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

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test265");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4444444444", "", 0);
    java.lang.String var4 = var3.getTextContentOrNull();
    java.lang.String var6 = var3.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    boolean var7 = var3.isWhitespaceNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = var3.getAttributeLocalName(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test266");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    var2.setColumn((-1));
    java.lang.String var12 = var2.getTextContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test267");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("hi!", "hi!");
    var10.setLine(100);
    int var13 = var10.numberOfNamespaceMappings();
    var0.setDocumentLocator((org.xml.sax.Locator)var10);
    var0.skippedEntity("                                                                                                    ");
    var0.endDocument();
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test268");


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
    char[] var24 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var28 = new nu.staldal.xtree.Text(var24, 1, 0, false);
    char[] var29 = var28.asCharArray();
    var18.characters(var29, 100, (-1));
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var40 = var37.lookupAttribute("4444444444", "hi!");
    var37.addNamespaceMapping("", "4444444444");
    var37.addAttribute("", "nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var37.setColumn(100);
    var18.setDocumentLocator((org.xml.sax.Locator)var37);
    nu.staldal.xmlutil.DocumentHandlerAdapter var52 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    var18.processingInstruction("nu.staldal.lagoon.util.TemplateException: nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test269");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.hasBeenUpdated(1433461998000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test270");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    java.lang.String var16 = var2.getLocalName();
    var2.setPublicId("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.NodeWithChildren var19 = var2.getParent();
    java.lang.String var20 = var2.getPublicId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var20.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test271");


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
    java.lang.String var13 = var0.getTaskType();
    java.lang.String var14 = var0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test272");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var4.addAttribute("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException~~ ");
    java.net.URL var14 = var4.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test273");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    nu.staldal.xtree.TreeBuilder var11 = new nu.staldal.xtree.TreeBuilder();
    var11.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var16 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var11, false, false);
    nu.staldal.xtree.Text var18 = new nu.staldal.xtree.Text("");
    char[] var19 = var18.asCharArray();
    boolean var20 = var18.isWhitespaceNode();
    char[] var21 = var18.asCharArray();
    var11.ignorableWhitespace(var21, 0, 10);
    var0.characters(var21, 1, 10);
    var0.endElement("nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var0.skippedEntity("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var0.beforeBuild();
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test274");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.beforeBuild();
    var0.afterBuild();
    var0.init();
    java.lang.String var7 = var0.getEntryName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test275");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var8 = var4.getSystemId();
    var4.addAttribute("nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "a");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = var4.getAttributeValue(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test276");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    int var5 = var2.numberOfNamespaceMappings();
    java.lang.String var6 = var2.getNamespaceURI();
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.util.TemplateException", 0);
    java.net.URL var11 = var10.getBaseURI();
    var2.addChild((nu.staldal.xtree.Node)var10);
    nu.staldal.xtree.TreeBuilder var13 = new nu.staldal.xtree.TreeBuilder();
    var13.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var18 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var13, false, false);
    var13.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var23 = new nu.staldal.xtree.Element("hi!", "hi!");
    var23.setLine(100);
    int var26 = var23.numberOfNamespaceMappings();
    var13.setDocumentLocator((org.xml.sax.Locator)var23);
    var13.skippedEntity("                                                                                                    ");
    var13.endDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var31 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var13);
    var10.toSAX((org.xml.sax.ContentHandler)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test277");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    var0.init();
    var0.init();
    int var3 = var0.getPosition();
    var0.init();
    var0.afterBuild();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.hasBeenUpdated(1433461968000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test278");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.util.TemplateException~ ", 2, "nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", "                                                                                                    ", "nu.staldal.lagoon.core.LagoonException~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test279");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.core.OutputHandler var4 = var0.createFile("nu.staldal.lagoon.util.TemplateException: ");
    long var6 = var0.fileLastModified("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.core.OutputHandler var8 = var0.createFile("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    nu.staldal.lagoon.core.OutputHandler var10 = var0.createFile("nu.staldal.ftp.FTPException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1433462003000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test280");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    org.apache.tools.ant.Target var6 = var1.getOwningTarget();
    var1.setDescription("hi!");
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    var9.bindToOwner((org.apache.tools.ant.Task)var10);
    var9.setForce(true);
    java.lang.String var14 = var9.getTaskName();
    var9.setTaskType("4444444444");
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    var17.bindToOwner((org.apache.tools.ant.Task)var18);
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var23 = new nu.staldal.ftp.FTPException("hi!");
    var20.log("", (java.lang.Throwable)var23, 10);
    org.apache.tools.ant.Location var26 = var20.getLocation();
    var17.setLocation(var26);
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    var28.bindToOwner((org.apache.tools.ant.Task)var29);
    var28.setForce(true);
    java.lang.String var33 = var28.getTaskName();
    var28.setTaskType("4444444444");
    var28.maybeConfigure();
    var17.bindToOwner((org.apache.tools.ant.Task)var28);
    var9.bindToOwner((org.apache.tools.ant.Task)var28);
    org.apache.tools.ant.Location var39 = var9.getLocation();
    java.lang.String var40 = var9.getTaskType();
    java.lang.String var41 = var9.getDescription();
    var1.bindToOwner((org.apache.tools.ant.Task)var9);
    var1.setDescription("nu.staldal.ftp.FTPException~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "4444444444"+ "'", var40.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test281");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var13 = new nu.staldal.ftp.FTPException("hi!");
    var10.log("", (java.lang.Throwable)var13, 10);
    var10.init();
    var10.init();
    java.lang.Object var18 = var10.clone();
    var10.init();
    var0.bindToOwner((org.apache.tools.ant.Task)var10);
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var24 = new nu.staldal.ftp.FTPException("hi!");
    var21.log("", (java.lang.Throwable)var24, 10);
    org.apache.tools.ant.Location var27 = var21.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var28 = var21.getRuntimeConfigurableWrapper();
    var21.setForce(false);
    org.apache.tools.ant.Location var31 = var21.getLocation();
    nu.staldal.lagoon.core.LagoonException var33 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var34 = var33.toString();
    var21.log((java.lang.Throwable)var33, 100);
    org.apache.tools.ant.Location var37 = var21.getLocation();
    var0.setLocation(var37);
    var0.setForce(true);
    java.lang.String var41 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var34.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test282");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xtree.Element var8 = new nu.staldal.xtree.Element("", "hi!", 10);
    var8.setSystemId("hi!");
    java.lang.String var11 = var8.getSystemId();
    var4.setDocumentLocator((org.xml.sax.Locator)var8);
    nu.staldal.xmlutil.ContentHandlerFixer var15 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4, false, true);
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
    nu.staldal.xmlutil.DocumentHandlerAdapter var38 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var34);
    nu.staldal.xtree.Text var40 = new nu.staldal.xtree.Text("4444444444");
    var38.setDocumentLocator((org.xml.sax.Locator)var40);
    var15.setDocumentLocator((org.xml.sax.Locator)var40);
    int var43 = var40.getColumnNumber();
    java.lang.String var44 = var40.getValue();
    boolean var45 = var40.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "4444444444"+ "'", var44.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test283");


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
    var0.log("nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test284");


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
    char[] var24 = var23.asCharArray();
    boolean var25 = var23.isWhitespaceNode();
    char[] var26 = var23.asCharArray();
    var18.setDocumentLocator((org.xml.sax.Locator)var23);
    java.lang.String var28 = var23.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test285");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.destroy();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.hasBeenUpdated(0L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test286");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    org.apache.tools.ant.Target var8 = var0.getOwningTarget();
    org.apache.tools.ant.RuntimeConfigurable var9 = var0.getRuntimeConfigurableWrapper();
    var0.setDescription("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var0.setDescription("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test287");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    var0.init();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    nu.staldal.lagoon.core.LagoonContext var6 = var0.getContext();
    java.util.Enumeration var7 = var0.getParamNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.hasBeenUpdated(1433461928000L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test288");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    var0.close();
    boolean var8 = var0.isReentrant();
    nu.staldal.lagoon.core.OutputHandler var10 = var0.createFile("hi!");
    long var12 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException~~ hi____33____");
    nu.staldal.lagoon.core.OutputHandler var14 = var0.createFile("nu.staldal.lagoon.core.LagoonException~ hi__33__");
    boolean var15 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462003000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1433461971000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test289");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    var0.destroy();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated(1433461975000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test290");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.maybeConfigure();
    var0.log("4444444444", 1);
    var0.setTargetURL("hi_33_");
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var10 = new nu.staldal.ftp.FTPException("hi!");
    var7.log("", (java.lang.Throwable)var10, 10);
    org.apache.tools.ant.Project var13 = var7.getProject();
    nu.staldal.lagoon.util.TemplateException var15 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var16 = var15.getException();
    var7.log("", (java.lang.Throwable)var15, (-1));
    java.lang.Throwable[] var19 = var15.getSuppressed();
    var0.log((java.lang.Throwable)var15, 0);
    org.apache.tools.ant.RuntimeConfigurable var22 = var0.getRuntimeConfigurableWrapper();
    nu.staldal.lagoon.LagoonAntTask var24 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var27 = new nu.staldal.ftp.FTPException("hi!");
    var24.log("", (java.lang.Throwable)var27, 10);
    var24.init();
    org.apache.tools.ant.Project var31 = var24.getProject();
    nu.staldal.lagoon.LagoonAntTask var33 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var36 = new nu.staldal.ftp.FTPException("hi!");
    var33.log("", (java.lang.Throwable)var36, 10);
    nu.staldal.lagoon.util.TemplateException var39 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var36);
    var24.log("", (java.lang.Throwable)var39, 100);
    java.lang.Throwable[] var42 = var39.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var43 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var39);
    java.lang.Exception var44 = var39.getException();
    var0.log("a", (java.lang.Throwable)var44, 1);
    var0.setPassword("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test291");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    var0.startPrefixMapping("aa", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var13 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test292");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", 10, (-1));
    java.lang.String var6 = var4.getAttributeValue((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test293");


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
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("");
    char[] var24 = var23.asCharArray();
    char[] var25 = var23.asCharArray();
    char[] var26 = var23.asCharArray();
    var18.characters(var26, (-1), (-1));
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi!", "hi!");
    var32.setLine(100);
    int var35 = var32.numberOfNamespaceMappings();
    java.lang.String var36 = var32.getNamespaceURI();
    nu.staldal.xtree.Element var37 = var32.getFirstChildElementOrNull();
    var18.setDocumentLocator((org.xml.sax.Locator)var32);
    var18.processingInstruction("_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    nu.staldal.lagoon.producer.IslandSplit var42 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var43 = var42.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var44 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var42);
    nu.staldal.xtree.Element var47 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var48 = var47.getLineNumber();
    var47.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var54 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var55 = var54.getLineNumber();
    var54.addNamespaceMapping("", "");
    var47.addChild((nu.staldal.xtree.Node)var54);
    nu.staldal.xtree.NodeWithChildren var60 = var47.getParent();
    boolean var61 = var47.getPreserveSpace();
    var44.setDocumentLocator((org.xml.sax.Locator)var47);
    java.lang.String var64 = var47.lookupNamespaceURI("");
    nu.staldal.xtree.Element var65 = var47.getFirstChildElementOrNull();
    var18.setDocumentLocator((org.xml.sax.Locator)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + ""+ "'", var64.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test294");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    java.lang.String var18 = var2.getAttrValueOrNull("", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    int var19 = var2.getLineNumber();
    nu.staldal.xtree.Element var22 = new nu.staldal.xtree.Element("hi!", "hi!");
    var22.setSystemId("");
    java.net.URL var25 = var22.getBaseURI();
    java.lang.String var28 = var22.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var31 = new nu.staldal.xtree.Element("hi!", "hi!");
    var31.addNamespaceMapping("", "");
    var22.addChild((nu.staldal.xtree.Node)var31);
    var22.setSystemId("");
    var22.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var45 = var22.getAttrValueOrNull("4444444444", "4444444444");
    var22.addAttribute("hi!", "hi!", "", "hi!");
    java.net.URL var51 = var22.getBaseURI();
    java.lang.String var52 = var22.getLocalName();
    java.lang.String var53 = var22.getTextContentOrNull();
    var22.setLine(1);
    var22.setSystemId("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertChild((nu.staldal.xtree.Node)var22, 2);
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
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test295");


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
    var11.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var16 = new nu.staldal.lagoon.LagoonAntTask();
    var16.setPassword("");
    var11.bindToOwner((org.apache.tools.ant.Task)var16);
    org.apache.tools.ant.Target var20 = var16.getOwningTarget();
    var16.setTaskType("hi_33_");
    var16.setTaskType("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.LagoonAntTask var25 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    var25.bindToOwner((org.apache.tools.ant.Task)var26);
    var25.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var30 = new nu.staldal.lagoon.LagoonAntTask();
    var30.setPassword("");
    var25.bindToOwner((org.apache.tools.ant.Task)var30);
    org.apache.tools.ant.Project var34 = var25.getProject();
    org.apache.tools.ant.Project var35 = var25.getProject();
    org.apache.tools.ant.Location var36 = var25.getLocation();
    nu.staldal.lagoon.LagoonAntTask var37 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var38 = new nu.staldal.lagoon.LagoonAntTask();
    var37.bindToOwner((org.apache.tools.ant.Task)var38);
    var37.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var42 = new nu.staldal.lagoon.LagoonAntTask();
    var42.setPassword("");
    var37.bindToOwner((org.apache.tools.ant.Task)var42);
    org.apache.tools.ant.Project var46 = var37.getProject();
    org.apache.tools.ant.Project var47 = var37.getProject();
    org.apache.tools.ant.Location var48 = var37.getLocation();
    var25.setLocation(var48);
    var16.setLocation(var48);
    var0.setLocation(var48);
    var0.setTargetURL("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    java.lang.Object var54 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test296");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ", "", 10);
    int var6 = var3.lookupAttribute("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "44");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test297");


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
    org.apache.tools.ant.Project var22 = var9.getProject();
    var9.setTaskType("nu.staldal.lagoon.util.TemplateException");
    java.lang.String var25 = var9.getTaskName();
    var9.reconfigure();
    java.lang.String var27 = var9.getTaskType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var27.equals("nu.staldal.lagoon.util.TemplateException"));

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test298");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    boolean var3 = var1.isWhitespaceNode();
    boolean var4 = var1.isWhitespaceNode();
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var13 = new nu.staldal.xtree.TreeBuilder();
    var9.toSAX((org.xml.sax.ContentHandler)var13);
    nu.staldal.xtree.Element var15 = var13.getTree();
    var13.endPrefixMapping("hi!");
    var13.startDocument();
    var1.toSAX((org.xml.sax.ContentHandler)var13);
    var13.startPrefixMapping("nu__46__staldal__46__lagoon__46__util__46__TemplateException", "nu____46____staldal____46____ftp____46____FTPException____126________32____hi____33____");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test299");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test300");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.setPublicId("");
    int var9 = var5.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var5);
    nu.staldal.xmlutil.ContentHandlerFixer var11 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var11.endDocument();
    var11.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test301");


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
    var0.endDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var39 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.endElement("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
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

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test302");


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
    java.net.URL var20 = var16.getBaseURI();
    java.net.URL var21 = var16.getBaseURI();
    java.lang.String var22 = var16.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test303");


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
    java.lang.String var23 = var4.getLocalName();
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "aa", 1);
    var4.addChild((nu.staldal.xtree.Node)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var30 = var27.getAttrValue("a");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test304");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.util.TemplateException~ ");
    java.lang.String var3 = var1.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test305");


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
    nu.staldal.xtree.Element var22 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var18.setDocumentLocator((org.xml.sax.Locator)var22);
    var22.addNamespaceMapping("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test306");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    java.lang.String var7 = var2.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: ");
    int var8 = var2.numberOfAttributes();
    java.lang.String var10 = var2.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException");
    java.lang.String var12 = var2.lookupNamespacePrefix("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var2.getAttributeLocalName(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test307");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element(" ", "4");
    boolean var3 = var2.getPreserveSpace();
    int var6 = var2.lookupAttribute("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException", "4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test308");


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
    java.lang.String var23 = var4.getLocalName();
    java.lang.String var25 = var4.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    java.lang.String var26 = var4.getTextContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test309");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    int var19 = var11.getColumnNumber();
    var11.addAttribute("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException: ", "4444444444");
    int var25 = var11.numberOfNamespaceMappings();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var27 = var11.getAttributeLocalName(10);
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
    assertTrue(var25 == 1);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test310");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    boolean var2 = var0.hasBeenUpdated(1L);
    var0.afterBuild();
    var0.afterBuild();
    var0.afterBuild();
    var0.destroy();
    var0.afterBuild();
    boolean var9 = var0.hasBeenUpdated(1433461974000L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var10 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test311");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("____32________32________32________32________32________32________32________32________32________32____");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "____32________32________32________32________32________32________32________32________32________32____"+ "'", var1.equals("____32________32________32________32________32________32________32________32________32________32____"));

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test312");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    nu.staldal.xtree.TreeBuilder var11 = new nu.staldal.xtree.TreeBuilder();
    var11.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var16 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var11, false, false);
    nu.staldal.xtree.Text var18 = new nu.staldal.xtree.Text("");
    char[] var19 = var18.asCharArray();
    boolean var20 = var18.isWhitespaceNode();
    char[] var21 = var18.asCharArray();
    var11.ignorableWhitespace(var21, 0, 10);
    var0.characters(var21, 1, 10);
    var0.startDocument();
    var0.endElement("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.core.LagoonContext var33 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test313");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    nu.staldal.xtree.Text var15 = new nu.staldal.xtree.Text("");
    char[] var16 = var15.asCharArray();
    char[] var17 = var15.asCharArray();
    var0.ignorableWhitespace(var17, 10, 0);
    var0.endElement("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: ", "4444444444");
    var0.endElement("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "                                                                                                    ", "hi!");
    nu.staldal.xtree.Element var31 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var32 = var31.getLineNumber();
    var31.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var38 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var39 = var38.getLineNumber();
    var38.addNamespaceMapping("", "");
    var31.addChild((nu.staldal.xtree.Node)var38);
    int var44 = var38.numberOfChildren();
    var0.setDocumentLocator((org.xml.sax.Locator)var38);
    var38.setPublicId("_32_");
    int var48 = var38.numberOfChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var50 = var38.getAttrValue("_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test314");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    var0.beforeBuild();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated(1433462000000L);
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

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test315");


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
    java.lang.String var83 = var75.getInheritedAttribute("", "nu.staldal.ftp.FTPException~ hi!");
    java.net.URL var84 = var75.getBaseURI();
    var75.addAttribute("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.ftp.FTPException~                                                                                                     ", "nu.staldal.lagoon.util.TemplateException: _32__32__32__32__32__32__32__32__32__32_", "aa");
    
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
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test316");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    var0.startPrefixMapping("4444444444", "                                                                                                    ");
    var0.endDocument();
    nu.staldal.lagoon.producer.IslandSplit var14 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var15 = var14.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var16 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var14);
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var20 = var19.getLineNumber();
    var19.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var27 = var26.getLineNumber();
    var26.addNamespaceMapping("", "");
    var19.addChild((nu.staldal.xtree.Node)var26);
    nu.staldal.xtree.NodeWithChildren var32 = var19.getParent();
    boolean var33 = var19.getPreserveSpace();
    var16.setDocumentLocator((org.xml.sax.Locator)var19);
    java.lang.String var36 = var19.lookupNamespaceURI("");
    java.lang.String var37 = var19.getSystemId();
    nu.staldal.xtree.NodeWithChildren var38 = var19.getParent();
    var19.setPublicId("4");
    var0.setDocumentLocator((org.xml.sax.Locator)var19);
    var0.startPrefixMapping(" ", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    var0.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    nu.staldal.xmlutil.ContentHandlerFixer var47 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + ""+ "'", var36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test317");


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
    var2.addNamespaceMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", "nu.staldal.lagoon.core.AuthenticationMissingException");
    boolean var28 = var2.getPreserveSpace();
    
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
    assertTrue(var28 == false);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test318");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    nu.staldal.xmlutil.ContentHandlerAdapter var11 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    var8.endDocument();
    var8.endPrefixMapping(" ");
    var8.endPrefixMapping("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
    nu.staldal.lagoon.producer.BasicSplit var17 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var19 = new nu.staldal.xtree.Text("hi!");
    char[] var20 = var19.asCharArray();
    var17.characters(var20, 1, 10);
    var17.endElement("", "hi!", "hi!");
    var17.processingInstruction("", "hi!");
    var17.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var17.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var35 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var17);
    var35.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    var35.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException~ ");
    var35.startDocument();
    nu.staldal.lagoon.producer.BasicSplit var43 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var45 = new nu.staldal.xtree.Text("hi!");
    char[] var46 = var45.asCharArray();
    var43.characters(var46, 1, 10);
    var43.endElement("", "hi!", "hi!");
    var43.processingInstruction("", "hi!");
    var43.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var43.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var61 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var43);
    var61.processingInstruction("", "nu.staldal.lagoon.util.TemplateException: ");
    var61.processingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.Text var69 = new nu.staldal.xtree.Text("");
    char[] var70 = var69.asCharArray();
    java.lang.String var71 = var69.getValue();
    char[] var72 = var69.asCharArray();
    var61.ignorableWhitespace(var72, (-1), (-1));
    var35.ignorableWhitespace(var72, 2, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.characters(var72, 10, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test319");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_"+ "'", var2.equals("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_"));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test320");


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
    nu.staldal.xmlutil.ContentHandlerFixer var52 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, false, false);
    var52.skippedEntity("nu.staldal.lagoon.core.AuthenticationMissingException");
    var52.endPrefixMapping("nu.staldal.ftp.FTPException: hi!");
    nu.staldal.xtree.Text var58 = new nu.staldal.xtree.Text("");
    char[] var59 = var58.asCharArray();
    boolean var60 = var58.isWhitespaceNode();
    char[] var61 = var58.asCharArray();
    char[] var62 = var58.asCharArray();
    var52.characters(var62, 100, 2);
    
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
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test321");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.init();
    org.apache.tools.ant.Location var7 = var1.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var8 = var1.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Project var9 = var1.getProject();
    var1.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test322");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getValue();
    java.lang.String var5 = var2.getValue();
    var2.setLine(2);
    java.lang.String var8 = var2.getValue();
    java.lang.String var9 = var2.getSystemId();
    var2.setSystemId("nu.staldal.lagoon.core.LagoonException~~ hi____33____");
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
    char[] var46 = new char[] { };
    var34.characters(var46, 100, (-1));
    var34.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var51 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var34);
    var34.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var34.processingInstruction("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!", "nu.staldal.ftp.FTPException~~ hi!");
    var34.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var2.toSAX((org.xml.sax.ContentHandler)var34);
    java.lang.String var61 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test323");


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
    var22.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ");
    var22.startDocument();
    nu.staldal.xtree.Element var65 = new nu.staldal.xtree.Element("hi!", "hi!");
    var65.setSystemId("");
    java.net.URL var68 = var65.getBaseURI();
    java.lang.String var71 = var65.getAttrValueOrNull("", "");
    java.lang.String var72 = var65.getTextContent();
    var65.setColumn(100);
    java.lang.String var75 = var65.getTextContent();
    java.lang.String var78 = var65.getInheritedAttribute("                                                                                                    ", "a");
    java.net.URL var79 = var65.getBaseURI();
    int var80 = var65.getColumnNumber();
    var22.setDocumentLocator((org.xml.sax.Locator)var65);
    var22.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.LagoonException: ");
    var22.startPrefixMapping("#", "_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_");
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + ""+ "'", var56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + ""+ "'", var72.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + ""+ "'", var75.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 100);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test324");


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
    java.net.URL var20 = var16.getBaseURI();
    nu.staldal.lagoon.producer.BasicSplit var21 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("hi!");
    char[] var24 = var23.asCharArray();
    var21.characters(var24, 1, 10);
    var21.endElement("", "hi!", "hi!");
    var21.processingInstruction("", "hi!");
    var21.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.util.Enumeration var38 = var21.getParamNames();
    var16.toSAX((org.xml.sax.ContentHandler)var21);
    nu.staldal.lagoon.producer.IslandSplit var40 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var41 = var40.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var42 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var40);
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var46 = var45.getLineNumber();
    var45.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var53 = var52.getLineNumber();
    var52.addNamespaceMapping("", "");
    var45.addChild((nu.staldal.xtree.Node)var52);
    nu.staldal.xtree.NodeWithChildren var58 = var45.getParent();
    boolean var59 = var45.getPreserveSpace();
    var42.setDocumentLocator((org.xml.sax.Locator)var45);
    java.lang.String var62 = var45.lookupNamespaceURI("");
    nu.staldal.xtree.Element var63 = var45.getFirstChildElementOrNull();
    java.lang.String var64 = var45.getPublicId();
    int var65 = var45.getColumnNumber();
    java.lang.String var66 = var45.getSystemId();
    int var67 = var45.numberOfChildren();
    var21.setDocumentLocator((org.xml.sax.Locator)var45);
    java.lang.String var70 = var45.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    boolean var71 = var45.isWhitespaceNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var73 = var45.getAttributeNamespaceURI(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test325");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    int var18 = var2.numberOfAttributes();
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var22 = var21.getLineNumber();
    var21.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var29 = var28.getLineNumber();
    var28.addNamespaceMapping("", "");
    var21.addChild((nu.staldal.xtree.Node)var28);
    nu.staldal.xtree.NodeWithChildren var34 = var21.getParent();
    boolean var35 = var21.getPreserveSpace();
    boolean var36 = var21.getPreserveSpace();
    int var37 = var21.numberOfChildren();
    var2.addChild((nu.staldal.xtree.Node)var21);
    java.lang.String var39 = var2.getSystemId();
    java.lang.String var41 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var43 = var2.getAttrValue("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test326");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.BasicSplit var17 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var19 = new nu.staldal.xtree.Text("hi!");
    char[] var20 = var19.asCharArray();
    var17.characters(var20, 1, 10);
    var17.endElement("", "hi!", "hi!");
    var17.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text("");
    char[] var32 = var31.asCharArray();
    char[] var33 = var31.asCharArray();
    char[] var34 = var31.asCharArray();
    var17.characters(var34, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var38 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var17);
    nu.staldal.xmlutil.DocumentHandlerAdapter var39 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var38);
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("hi!", "hi!");
    var42.setSystemId("");
    java.net.URL var45 = var42.getBaseURI();
    java.lang.String var48 = var42.getAttrValueOrNull("", "");
    var39.setDocumentLocator((org.xml.sax.Locator)var42);
    nu.staldal.xtree.Text var51 = new nu.staldal.xtree.Text("");
    char[] var52 = var51.asCharArray();
    char[] var53 = var51.asCharArray();
    var39.characters(var53, 100, 100);
    nu.staldal.xtree.Element var59 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var60 = var59.getLineNumber();
    var59.setPublicId("");
    int var63 = var59.getLineNumber();
    java.lang.String var65 = var59.lookupNamespacePrefix("hi_33_");
    var39.setDocumentLocator((org.xml.sax.Locator)var59);
    boolean var67 = var59.isWhitespaceNode();
    var59.setColumn((-1));
    var0.setDocumentLocator((org.xml.sax.Locator)var59);
    java.lang.String var72 = var59.lookupNamespaceURI("nu.staldal.ftp.FTPException~~ hi!");
    java.lang.String var74 = var59.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test327");


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
    var22.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.ProcessingInstruction var27 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.producer.BasicSplit var28 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var30 = new nu.staldal.xtree.Text("hi!");
    char[] var31 = var30.asCharArray();
    var28.characters(var31, 1, 10);
    var28.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var28.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var28.endElement("hi!", "                                                                                                    ", "nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.xmlutil.ContentHandlerFixer var44 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var28, true);
    var27.toSAX((org.xml.sax.ContentHandler)var44);
    nu.staldal.xmlutil.ContentHandlerAdapter var46 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var44);
    nu.staldal.lagoon.producer.BasicSplit var47 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var49 = new nu.staldal.xtree.Text("hi!");
    char[] var50 = var49.asCharArray();
    var47.characters(var50, 1, 10);
    var47.endElement("", "hi!", "hi!");
    nu.staldal.xtree.TreeBuilder var58 = new nu.staldal.xtree.TreeBuilder();
    var58.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var63 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var58, false, false);
    nu.staldal.xtree.Text var65 = new nu.staldal.xtree.Text("");
    char[] var66 = var65.asCharArray();
    boolean var67 = var65.isWhitespaceNode();
    char[] var68 = var65.asCharArray();
    var58.ignorableWhitespace(var68, 0, 10);
    var47.characters(var68, 1, 10);
    var46.ignorableWhitespace(var68, (-1), 0);
    var22.characters(var68, 10, 10);
    var22.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_AuthenticationException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test328");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    char[] var19 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text(var19, 1, 0, false);
    var0.characters(var19, 1, (-1));
    nu.staldal.xtree.Element var29 = new nu.staldal.xtree.Element("hi!", "hi!");
    var29.setLine(100);
    java.lang.String var34 = var29.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: ");
    int var35 = var29.getLineNumber();
    java.net.URL var36 = var29.getBaseURI();
    var0.setDocumentLocator((org.xml.sax.Locator)var29);
    java.util.Enumeration var38 = var0.getParamNames();
    nu.staldal.xtree.Text var40 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var40.setLine(1);
    char[] var43 = var40.asCharArray();
    char[] var44 = var40.asCharArray();
    nu.staldal.xtree.Text var48 = new nu.staldal.xtree.Text(var44, 10, 0, true);
    var0.characters(var44, 10, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test329");


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
    nu.staldal.xtree.Text var24 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var25 = var24.getValue();
    var22.setDocumentLocator((org.xml.sax.Locator)var24);
    nu.staldal.lagoon.producer.BasicSplit var27 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var29 = new nu.staldal.xtree.Text("hi!");
    char[] var30 = var29.asCharArray();
    var27.characters(var30, 1, 10);
    var27.endElement("", "hi!", "hi!");
    var27.processingInstruction("", "hi!");
    nu.staldal.xtree.Text var42 = new nu.staldal.xtree.Text("");
    char[] var43 = var42.asCharArray();
    char[] var44 = var42.asCharArray();
    var27.ignorableWhitespace(var44, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var50 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var27, true, true);
    var27.skippedEntity("4444444444");
    var24.toSAX((org.xml.sax.ContentHandler)var27);
    var27.beforeBuild();
    var27.skippedEntity("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");
    
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
    assertTrue("'" + var25 + "' != '" + "nu.staldal.lagoon.core.AuthenticationMissingException"+ "'", var25.equals("nu.staldal.lagoon.core.AuthenticationMissingException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test330");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var11.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var11.setLine(1);
    java.lang.String var24 = var11.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~ ");
    var11.setLine(100);
    int var27 = var11.getLineNumber();
    java.lang.String var30 = var11.getAttrValueOrNull("nu.staldal.lagoon.util.TemplateException: nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "##");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test331");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    nu.staldal.xmlutil.ContentHandlerAdapter var13 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.lagoon.producer.BasicSplit var14 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var16 = new nu.staldal.xtree.Text("hi!");
    char[] var17 = var16.asCharArray();
    var14.characters(var17, 1, 10);
    var14.endElement("", "hi!", "hi!");
    var14.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var28 = new nu.staldal.xtree.Text("");
    char[] var29 = var28.asCharArray();
    char[] var30 = var28.asCharArray();
    char[] var31 = var28.asCharArray();
    var14.characters(var31, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var35 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var14);
    nu.staldal.xmlutil.DocumentHandlerAdapter var36 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var35);
    nu.staldal.xtree.Element var39 = new nu.staldal.xtree.Element("hi!", "hi!");
    var39.setSystemId("");
    java.net.URL var42 = var39.getBaseURI();
    java.lang.String var45 = var39.getAttrValueOrNull("", "");
    var36.setDocumentLocator((org.xml.sax.Locator)var39);
    nu.staldal.xtree.Text var48 = new nu.staldal.xtree.Text("");
    char[] var49 = var48.asCharArray();
    char[] var50 = var48.asCharArray();
    var36.characters(var50, 100, 100);
    var13.characters(var50, 100, 0);
    var13.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test332");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("nu.staldal.lagoon.util.TemplateException~~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test333");


    char[] var2 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text(var2, 1, 0, false);
    java.lang.String var7 = var6.getPublicId();
    java.lang.String var8 = var6.getValue();
    char[] var9 = var6.asCharArray();
    java.lang.String var10 = var6.getValue();
    nu.staldal.lagoon.producer.BasicSplit var11 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var13 = new nu.staldal.xtree.Text("hi!");
    char[] var14 = var13.asCharArray();
    var11.characters(var14, 1, 10);
    var11.endElement("", "hi!", "hi!");
    var11.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var25 = new nu.staldal.xtree.Text("");
    char[] var26 = var25.asCharArray();
    char[] var27 = var25.asCharArray();
    char[] var28 = var25.asCharArray();
    var11.characters(var28, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var32 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var11);
    nu.staldal.xmlutil.DocumentHandlerAdapter var33 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var32);
    nu.staldal.xtree.Element var36 = new nu.staldal.xtree.Element("hi!", "hi!");
    var36.setSystemId("");
    java.net.URL var39 = var36.getBaseURI();
    java.lang.String var42 = var36.getAttrValueOrNull("", "");
    var33.setDocumentLocator((org.xml.sax.Locator)var36);
    nu.staldal.xtree.Text var45 = new nu.staldal.xtree.Text("");
    char[] var46 = var45.asCharArray();
    char[] var47 = var45.asCharArray();
    var33.characters(var47, 100, 100);
    nu.staldal.xtree.Element var53 = new nu.staldal.xtree.Element("hi!", "hi!");
    var53.setLine(100);
    nu.staldal.xtree.Element var60 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var63 = var60.lookupAttribute("4444444444", "hi!");
    var60.addNamespaceMapping("", "4444444444");
    java.lang.String var67 = var60.getTextContent();
    var53.insertChild((nu.staldal.xtree.Node)var60, 0);
    var33.setDocumentLocator((org.xml.sax.Locator)var60);
    var33.startDocument();
    var33.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    var33.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    var6.toSAX((org.xml.sax.ContentHandler)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + ""+ "'", var67.equals(""));

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test334");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    java.lang.String var12 = var4.getAttributeLocalName((-1));
    java.net.URL var13 = var4.getBaseURI();
    java.lang.String var14 = var4.getNamespaceURI();
    java.lang.String var16 = var4.lookupNamespaceURI("nu.staldal.ftp.FTPException~~~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "4444444444"+ "'", var14.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test335");


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
    java.net.URL var36 = var31.getBaseURI();
    java.lang.String var37 = var31.getPublicId();
    
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
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test336");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    nu.staldal.xmlutil.ContentHandlerAdapter var13 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.lagoon.producer.BasicSplit var14 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var16 = new nu.staldal.xtree.Text("hi!");
    char[] var17 = var16.asCharArray();
    var14.characters(var17, 1, 10);
    var14.endElement("", "hi!", "hi!");
    var14.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var28 = new nu.staldal.xtree.Text("");
    char[] var29 = var28.asCharArray();
    char[] var30 = var28.asCharArray();
    char[] var31 = var28.asCharArray();
    var14.characters(var31, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var35 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var14);
    nu.staldal.xmlutil.DocumentHandlerAdapter var36 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var35);
    nu.staldal.xtree.Element var39 = new nu.staldal.xtree.Element("hi!", "hi!");
    var39.setSystemId("");
    java.net.URL var42 = var39.getBaseURI();
    java.lang.String var45 = var39.getAttrValueOrNull("", "");
    var36.setDocumentLocator((org.xml.sax.Locator)var39);
    nu.staldal.xtree.Text var48 = new nu.staldal.xtree.Text("");
    char[] var49 = var48.asCharArray();
    char[] var50 = var48.asCharArray();
    var36.characters(var50, 100, 100);
    var13.characters(var50, 100, 0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var57 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var13);
    var13.processingInstruction("nu.staldal.lagoon.core.AuthenticationException", "nu.staldal.lagoon.util.TemplateException: _32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test337");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var14 = var11.lookupAttribute("4444444444", "hi!");
    java.lang.String var17 = var11.getInheritedAttribute("", "4444444444");
    int var20 = var11.lookupAttribute("", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String var22 = var11.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var11);
    nu.staldal.xtree.Text var25 = new nu.staldal.xtree.Text("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var25);
    int var27 = var0.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test338");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    java.lang.String var4 = var3.getLocalName();
    java.lang.String var7 = var3.getInheritedAttribute("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.ftp.FTPException:  ");
    java.lang.String var9 = var3.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException~ ");
    nu.staldal.xtree.Element var12 = var3.getFirstChildElementOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_ftp_46_FTPException_126__126__32_hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test339");


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
    int var23 = var11.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var11.addAttribute("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var29 = var11.getLocalName();
    int var30 = var11.numberOfAttributes();
    
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
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test340");


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
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    var12.bindToOwner((org.apache.tools.ant.Task)var13);
    var13.log("hi!");
    java.lang.String var17 = var13.getTaskName();
    var13.init();
    org.apache.tools.ant.Location var19 = var13.getLocation();
    var0.setLocation(var19);
    var0.setTaskType("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.log("nu.staldal.lagoon.core.LagoonException: ");
    var0.log("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test341");


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
    var20.endDocument();
    var20.endDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var20.processingInstruction("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test342");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    var8.endDocument();
    nu.staldal.xtree.Element var14 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var15 = var14.getLineNumber();
    var14.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var22 = var21.getLineNumber();
    var21.addNamespaceMapping("", "");
    var14.addChild((nu.staldal.xtree.Node)var21);
    nu.staldal.xtree.NodeWithChildren var27 = var14.getParent();
    boolean var28 = var14.getPreserveSpace();
    var14.setPublicId("4444444444");
    java.lang.String var31 = var14.getLocalName();
    var14.addNamespaceMapping("          ", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String[] var36 = var14.getNamespaceMapping(1);
    var8.setDocumentLocator((org.xml.sax.Locator)var14);
    var8.endPrefixMapping("          ");
    var8.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test343");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    char[] var3 = var1.asCharArray();
    char[] var4 = var1.asCharArray();
    boolean var5 = var1.isWhitespaceNode();
    nu.staldal.lagoon.producer.BasicSplit var6 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var8 = new nu.staldal.xtree.Text("hi!");
    char[] var9 = var8.asCharArray();
    var6.characters(var9, 1, 10);
    var6.endElement("", "hi!", "hi!");
    var6.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var20 = new nu.staldal.xtree.Text("");
    char[] var21 = var20.asCharArray();
    char[] var22 = var20.asCharArray();
    char[] var23 = var20.asCharArray();
    var6.characters(var23, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var27 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var6);
    nu.staldal.xmlutil.DocumentHandlerAdapter var28 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var27);
    nu.staldal.xtree.Element var31 = new nu.staldal.xtree.Element("hi!", "hi!");
    var31.setSystemId("");
    java.net.URL var34 = var31.getBaseURI();
    java.lang.String var37 = var31.getAttrValueOrNull("", "");
    var28.setDocumentLocator((org.xml.sax.Locator)var31);
    var28.startDocument();
    char[] var40 = new char[] { };
    var28.characters(var40, 100, (-1));
    var28.startDocument();
    nu.staldal.xtree.Element var47 = new nu.staldal.xtree.Element("hi!", "hi!");
    var47.setSystemId("");
    java.net.URL var50 = var47.getBaseURI();
    java.lang.String var53 = var47.getAttrValueOrNull("", "");
    java.lang.String var54 = var47.getTextContent();
    var47.setColumn(100);
    java.lang.String var57 = var47.getTextContent();
    var28.setDocumentLocator((org.xml.sax.Locator)var47);
    var28.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var1.toSAX((org.xml.sax.ContentHandler)var28);
    java.lang.String var63 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + ""+ "'", var54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + ""+ "'", var63.equals(""));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test344");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    var2.addAttribute("", "hi!", "", "hi!");
    java.lang.String var12 = var2.getInheritedAttribute("hi!", "4444444444");
    java.lang.String var14 = var2.lookupNamespaceURI("");
    java.net.URL var15 = var2.getBaseURI();
    java.net.URL var16 = var2.getBaseURI();
    int var17 = var2.getColumnNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var20 = var2.getAttrValue("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "nu.staldal.ftp.FTPException:  ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test345");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    org.apache.tools.ant.Project var9 = var0.getProject();
    org.apache.tools.ant.Project var10 = var0.getProject();
    var0.log("");
    var0.log("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var15 = var0.getDescription();
    var0.log("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    var0.setForce(false);
    var0.log("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test346");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    var0.log("");
    var0.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.setTaskName("nu.staldal.lagoon.core.AuthenticationMissingException");
    var0.maybeConfigure();
    nu.staldal.lagoon.LagoonAntTask var14 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var17 = new nu.staldal.ftp.FTPException("hi!");
    var14.log("", (java.lang.Throwable)var17, 10);
    org.apache.tools.ant.Location var20 = var14.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var21 = var14.getRuntimeConfigurableWrapper();
    var14.setTargetURL("4444444444");
    java.lang.String var24 = var14.getTaskName();
    java.lang.String var25 = var14.getDescription();
    var14.setPassword("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var31 = new nu.staldal.ftp.FTPException("hi!");
    var28.log("", (java.lang.Throwable)var31, 10);
    org.apache.tools.ant.Location var34 = var28.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var35 = var28.getRuntimeConfigurableWrapper();
    var28.setForce(false);
    org.apache.tools.ant.Location var38 = var28.getLocation();
    var28.log("nu.staldal.lagoon.util.TemplateException", (-1));
    org.apache.tools.ant.RuntimeConfigurable var42 = var28.getRuntimeConfigurableWrapper();
    var14.setRuntimeConfigurableWrapper(var42);
    var0.setRuntimeConfigurableWrapper(var42);
    var0.setTargetURL("nu.staldal.ftp.FTPException:  ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test347");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    var0.afterBuild();
    java.util.Enumeration var5 = var0.getParamNames();
    var0.afterBuild();
    nu.staldal.lagoon.core.XMLStreamProducer var7 = var0.getNext();
    boolean var9 = var0.hasBeenUpdated(1433461965000L);
    boolean var11 = var0.hasBeenUpdated(1433461931000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test348");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    var1.log("hi!", 100);
    var1.maybeConfigure();
    var1.setTaskType(" ");
    java.lang.Object var11 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test349");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException: hi!", "nu__46__staldal__46__ftp__46__FTPException__126____32__hi__33__", 0, 0);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test350");


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
    java.lang.String var27 = var2.getSystemId();
    int var30 = var2.lookupAttribute("nu.staldal.lagoon.util.TemplateException: hi_33_", "####################################################################################################");
    java.lang.String var32 = var2.getAttrValueOrNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var34 = var2.removeChild(1);
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
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test351");


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
    var0.setForce(false);
    
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

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test352");


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
    var22.processingInstruction("nu.staldal.ftp.FTPException:  ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_");
    
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

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test353");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    boolean var3 = var1.isWhitespaceNode();
    int var4 = var1.getLineNumber();
    nu.staldal.xtree.Element var7 = new nu.staldal.xtree.Element("hi!", "hi!");
    var7.setSystemId("");
    java.net.URL var10 = var7.getBaseURI();
    java.lang.String var13 = var7.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi!", "hi!");
    var16.addNamespaceMapping("", "");
    var7.addChild((nu.staldal.xtree.Node)var16);
    java.lang.String var23 = var16.getInheritedAttribute("", "hi!");
    int var24 = var16.getColumnNumber();
    char[] var27 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text(var27, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var32 = new nu.staldal.xtree.TreeBuilder();
    var32.endPrefixMapping("hi!");
    var32.endDocument();
    var32.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var31.toSAX((org.xml.sax.ContentHandler)var32);
    var32.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var32.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    var16.toSAX((org.xml.sax.ContentHandler)var32);
    var1.toSAX((org.xml.sax.ContentHandler)var32);
    nu.staldal.xmlutil.ContentHandlerFixer var49 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var32, true, false);
    nu.staldal.xtree.Element var50 = var32.getTree();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var50.removeAttribute(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test354");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var3 = var2.getPreserveSpace();
    var2.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "4444444444", "nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    int var11 = var2.lookupAttribute("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.net.URL var12 = var2.getBaseURI();
    var2.addAttribute("nu.staldal.lagoon.util.TemplateException: aa", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var20 = var2.getFirstChildElement("nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException", "_35__35__35__35__35__35__35__35__35__35_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test355");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var11.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var11.setLine(1);
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var30 = var27.lookupAttribute("4444444444", "hi!");
    java.lang.String var33 = var27.getInheritedAttribute("", "4444444444");
    int var36 = var27.lookupAttribute("", "nu.staldal.lagoon.util.TemplateException");
    var11.addChild((nu.staldal.xtree.Node)var27);
    int var38 = var11.numberOfAttributes();
    java.lang.String var40 = var11.lookupNamespaceURI("nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test356");


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
    var22.processingInstruction("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    var22.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "##########");
    nu.staldal.xtree.Element var61 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", (-1));
    nu.staldal.xtree.TreeBuilder var62 = new nu.staldal.xtree.TreeBuilder();
    var62.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var67 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var68 = var67.getLineNumber();
    var67.setPublicId("");
    int var71 = var67.getLineNumber();
    var62.setDocumentLocator((org.xml.sax.Locator)var67);
    nu.staldal.xmlutil.ContentHandlerFixer var73 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var62);
    var61.toSAX((org.xml.sax.ContentHandler)var62);
    var22.setDocumentLocator((org.xml.sax.Locator)var61);
    
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
    assertTrue(var68 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == (-1));

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test357");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.util.Enumeration var17 = var0.getParamNames();
    var0.endElement("nu.staldal.lagoon.util.TemplateException", "4444444444", "nu.staldal.lagoon.core.LagoonException~~ ");
    java.lang.String var23 = var0.getParam("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var24 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test358");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.setPublicId("");
    int var9 = var5.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var5);
    var0.startDocument();
    var0.skippedEntity("                                                                                                    ");
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var17 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.ContentHandlerFixer var20 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var17, false, false);
    var17.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test359");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    var0.log("nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var13 = new nu.staldal.ftp.FTPException("hi!");
    var10.log("", (java.lang.Throwable)var13, 10);
    org.apache.tools.ant.Location var16 = var10.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var17 = var10.getRuntimeConfigurableWrapper();
    var10.setForce(false);
    org.apache.tools.ant.Location var20 = var10.getLocation();
    nu.staldal.lagoon.core.LagoonException var22 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var23 = var22.toString();
    var10.log((java.lang.Throwable)var22, 100);
    var0.log((java.lang.Throwable)var22, 0);
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    var28.bindToOwner((org.apache.tools.ant.Task)var29);
    var28.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var33 = new nu.staldal.lagoon.LagoonAntTask();
    var33.setPassword("");
    var28.bindToOwner((org.apache.tools.ant.Task)var33);
    org.apache.tools.ant.Project var37 = var28.getProject();
    org.apache.tools.ant.Project var38 = var28.getProject();
    var28.log("");
    var28.log("nu.staldal.lagoon.core.LagoonException: ");
    var0.bindToOwner((org.apache.tools.ant.Task)var28);
    java.lang.Object var44 = var28.clone();
    var28.setTaskName("nu.staldal.lagoon.core.LagoonException: aa");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var23.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test360");


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
    var5.setTaskType("##");
    java.lang.Object var34 = var5.clone();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var34);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test361");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_", 0);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test362");


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
    java.lang.String var19 = var4.getInheritedAttribute("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "");
    nu.staldal.xtree.Element var22 = var4.getFirstChildElementOrNull("nu.staldal.ftp.FTPException:  ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    java.lang.String var24 = var4.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var25 = var4.getPublicId();
    
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
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test363");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", 2, "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test364");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    char[] var6 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var10 = new nu.staldal.xtree.Text(var6, 1, 0, false);
    var3.setDocumentLocator((org.xml.sax.Locator)var10);
    char[] var12 = var10.asCharArray();
    var10.setPublicId("");
    java.lang.String var15 = var10.getSystemId();
    java.lang.String var16 = var10.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test365");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.Object var8 = var0.clone();
    var0.init();
    var0.setDescription("hi!");
    java.lang.String var12 = var0.getDescription();
    var0.init();
    java.lang.Object var14 = var0.clone();
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var16 = new nu.staldal.lagoon.LagoonAntTask();
    var15.bindToOwner((org.apache.tools.ant.Task)var16);
    var15.log("");
    java.lang.Object var20 = var15.clone();
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var24 = new nu.staldal.ftp.FTPException("hi!");
    var21.log("", (java.lang.Throwable)var24, 10);
    java.lang.String var27 = var21.getDescription();
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var31 = new nu.staldal.ftp.FTPException("hi!");
    var28.log("", (java.lang.Throwable)var31, 10);
    org.apache.tools.ant.Location var34 = var28.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var35 = var28.getRuntimeConfigurableWrapper();
    var28.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var38 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var41 = new nu.staldal.ftp.FTPException("hi!");
    var38.log("", (java.lang.Throwable)var41, 10);
    org.apache.tools.ant.Project var44 = var38.getProject();
    nu.staldal.lagoon.util.TemplateException var46 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var47 = var46.getException();
    var38.log("", (java.lang.Throwable)var46, (-1));
    var28.bindToOwner((org.apache.tools.ant.Task)var38);
    org.apache.tools.ant.Location var51 = var38.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var52 = var38.getRuntimeConfigurableWrapper();
    var21.setRuntimeConfigurableWrapper(var52);
    org.apache.tools.ant.RuntimeConfigurable var54 = var21.getRuntimeConfigurableWrapper();
    var15.setRuntimeConfigurableWrapper(var54);
    var0.setRuntimeConfigurableWrapper(var54);
    var0.setForce(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test366");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var3.startPrefixMapping("4444444444", "");
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var3, false);
    var8.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    nu.staldal.xmlutil.ContentHandlerFixer var12 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8, false);
    var8.startPrefixMapping("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test367");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    boolean var2 = var0.hasBeenUpdated(1L);
    var0.afterBuild();
    var0.beforeBuild();
    java.util.Enumeration var5 = var0.getParamNames();
    var0.afterBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test368");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("####################################################################################################", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 0, 100);
    java.lang.String var5 = var4.getSystemId();
    java.lang.String var8 = var4.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~ 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu.staldal.ftp.FTPException:  ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test369");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    nu.staldal.lagoon.core.LagoonContext var1 = var0.getContext();
    var0.beforeBuild();
    boolean var4 = var0.hasBeenUpdated(10L);
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    nu.staldal.lagoon.core.LagoonContext var6 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test370");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", "nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_"+ "'", var2.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_"));

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test371");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    nu.staldal.xtree.NodeWithChildren var5 = var2.getParent();
    java.lang.String var6 = var2.getPublicId();
    java.lang.String var8 = var2.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    var2.setPublicId("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!");
    java.lang.String var13 = var2.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException", "__32____32____32____32____32____32____32____32____32____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test372");


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
    nu.staldal.xtree.Element var27 = var11.getFirstChildElementOrNull();
    nu.staldal.xtree.Text var29 = new nu.staldal.xtree.Text("");
    char[] var30 = var29.asCharArray();
    char[] var31 = var29.asCharArray();
    char[] var32 = var29.asCharArray();
    char[] var33 = var29.asCharArray();
    java.lang.String var34 = var29.getValue();
    boolean var35 = var29.isWhitespaceNode();
    var11.insertChild((nu.staldal.xtree.Node)var29, 0);
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var43 = var42.getFirstChildElementOrNull();
    int var46 = var42.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var48 = var42.lookupNamespaceURI("4444444444");
    java.lang.String var50 = var42.lookupNamespacePrefix("4444444444");
    nu.staldal.lagoon.producer.BasicSplit var51 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var53 = new nu.staldal.xtree.Text("hi!");
    char[] var54 = var53.asCharArray();
    var51.characters(var54, 1, 10);
    var51.endElement("", "hi!", "hi!");
    var51.processingInstruction("", "hi!");
    var51.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var51.startDocument();
    var51.skippedEntity("");
    var42.outputStartElement((org.xml.sax.ContentHandler)var51);
    var51.startDocument();
    nu.staldal.lagoon.core.XMLStreamProducer var73 = var51.getNext();
    var51.startDocument();
    var29.toSAX((org.xml.sax.ContentHandler)var51);
    boolean var76 = var29.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test373");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var8.setDocumentLocator((org.xml.sax.Locator)var16);
    nu.staldal.xtree.Element var18 = var8.getTree();
    var8.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: ", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    var8.endPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.processingInstruction("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test374");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~ ", "hi_33_");
    java.lang.String var4 = var2.lookupNamespaceURI("__32____32____32____32____32____32____32____32____32____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test375");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", 100, 10);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test376");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.endPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.endDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var11 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.processingInstruction("nu.staldal.ftp.FTPException: hi!", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_aa");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test377");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.ftp.FTPException~~ hi!", 100, "nu.staldal.ftp.FTPException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.ftp.FTPException:  ");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test378");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    java.lang.String var20 = var11.getAttrValueOrNull("4444444444");
    int var21 = var11.numberOfAttributes();
    int var22 = var11.numberOfNamespaceMappings();
    java.lang.String var23 = var11.getNamespaceURI();
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", 1);
    java.lang.String var29 = var27.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    boolean var30 = var27.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var32 = var11.replaceChild((nu.staldal.xtree.Node)var27, 10);
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
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test379");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var3 = var2.getPreserveSpace();
    var2.addAttribute("hi_33_", "nu.staldal.lagoon.core.LagoonException: ", "4444444444", "4444444444");
    var2.addNamespaceMapping("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    java.lang.String var12 = var2.getLocalName();
    java.lang.String var13 = var2.getTextContentOrNull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var15 = var2.removeChild((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test380");


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
    int var27 = var11.getLineNumber();
    var11.addNamespaceMapping("_35__35__35__35__35__35__35__35__35__35_", "nu.staldal.lagoon.util.TemplateException: aa");
    
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
    assertTrue(var27 == (-1));

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test381");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    var0.setTaskName("                                                                                                    ");
    var0.init();
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    var10.bindToOwner((org.apache.tools.ant.Task)var11);
    var10.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    var15.setPassword("");
    var10.bindToOwner((org.apache.tools.ant.Task)var15);
    org.apache.tools.ant.Project var19 = var10.getProject();
    org.apache.tools.ant.Project var20 = var10.getProject();
    var10.log("");
    var10.log("nu.staldal.lagoon.core.LagoonException: ");
    var0.bindToOwner((org.apache.tools.ant.Task)var10);
    var0.setTaskType("          ");
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    var28.bindToOwner((org.apache.tools.ant.Task)var29);
    var28.setForce(true);
    java.lang.String var33 = var28.getTaskName();
    var28.setTaskType("4444444444");
    var28.maybeConfigure();
    var28.setTargetURL("");
    var28.maybeConfigure();
    org.apache.tools.ant.Project var40 = var28.getProject();
    var28.setPassword("4444444444");
    var28.reconfigure();
    var0.bindToOwner((org.apache.tools.ant.Task)var28);
    var28.setTargetURL("nu.staldal.lagoon.core.LagoonException: hi_33_");
    org.apache.tools.ant.Location var47 = var28.getLocation();
    var28.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test382");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    int var19 = var11.getLineNumber();
    java.lang.String var22 = var11.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    int var23 = var11.numberOfChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var25 = var11.getNamespaceMapping(1);
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
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test383");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.ftp.FTPException:                                                                                                     ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test384");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.hasBeenUpdated(1433461983000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test385");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    java.util.Enumeration var1 = var0.getParamNames();
    java.lang.String var3 = var0.getParam("hi!");
    boolean var5 = var0.hasBeenUpdated(10L);
    boolean var7 = var0.hasBeenUpdated(10L);
    boolean var9 = var0.hasBeenUpdated(1433461928000L);
    boolean var11 = var0.hasBeenUpdated(1433461994000L);
    
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

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test386");


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
    var24.setSystemId("");
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var43 = var42.getLineNumber();
    var42.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var49 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var50 = var49.getLineNumber();
    var49.addNamespaceMapping("", "");
    var42.addChild((nu.staldal.xtree.Node)var49);
    var24.insertChild((nu.staldal.xtree.Node)var42, 0);
    var18.setDocumentLocator((org.xml.sax.Locator)var42);
    nu.staldal.lagoon.producer.BasicSplit var58 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var60 = new nu.staldal.xtree.Text("hi!");
    char[] var61 = var60.asCharArray();
    var58.characters(var61, 1, 10);
    var58.endElement("", "hi!", "hi!");
    var58.processingInstruction("", "hi!");
    var58.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var58.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var76 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var58);
    var76.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    char[] var82 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var86 = new nu.staldal.xtree.Text(var82, 1, 0, false);
    char[] var87 = var86.asCharArray();
    var76.characters(var87, 100, (-1));
    var18.characters(var87, 0, 0);
    nu.staldal.xmlutil.DocumentHandlerAdapter var94 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    var94.startPrefixMapping("aa", "nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException");
    var94.skippedEntity("nu.staldal.lagoon.util.TemplateException~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test387");


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
    java.net.URL var20 = var16.getBaseURI();
    nu.staldal.lagoon.producer.BasicSplit var21 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("hi!");
    char[] var24 = var23.asCharArray();
    var21.characters(var24, 1, 10);
    var21.endElement("", "hi!", "hi!");
    var21.processingInstruction("", "hi!");
    var21.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.util.Enumeration var38 = var21.getParamNames();
    var16.toSAX((org.xml.sax.ContentHandler)var21);
    nu.staldal.lagoon.producer.IslandSplit var40 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var41 = var40.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var42 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var40);
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var46 = var45.getLineNumber();
    var45.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var53 = var52.getLineNumber();
    var52.addNamespaceMapping("", "");
    var45.addChild((nu.staldal.xtree.Node)var52);
    nu.staldal.xtree.NodeWithChildren var58 = var45.getParent();
    boolean var59 = var45.getPreserveSpace();
    var42.setDocumentLocator((org.xml.sax.Locator)var45);
    java.lang.String var62 = var45.lookupNamespaceURI("");
    nu.staldal.xtree.Element var63 = var45.getFirstChildElementOrNull();
    java.lang.String var64 = var45.getPublicId();
    int var65 = var45.getColumnNumber();
    java.lang.String var66 = var45.getSystemId();
    int var67 = var45.numberOfChildren();
    var21.setDocumentLocator((org.xml.sax.Locator)var45);
    var21.endElement("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    var21.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + ""+ "'", var62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 1);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test388");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var24 = var7.getFirstChildElement();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
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

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test389");


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
    nu.staldal.xtree.TreeBuilder var47 = new nu.staldal.xtree.TreeBuilder();
    var47.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var53 = var52.getLineNumber();
    var52.setPublicId("");
    int var56 = var52.getLineNumber();
    var47.setDocumentLocator((org.xml.sax.Locator)var52);
    var47.startDocument();
    nu.staldal.xtree.Text var60 = new nu.staldal.xtree.Text("");
    char[] var61 = var60.asCharArray();
    char[] var62 = var60.asCharArray();
    char[] var63 = var60.asCharArray();
    char[] var64 = var60.asCharArray();
    var47.ignorableWhitespace(var64, (-1), 10);
    var46.ignorableWhitespace(var64, 0, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var74 = new nu.staldal.xtree.Text(var64, 2, 0, false);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test390");


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
    nu.staldal.xtree.NodeWithChildren var18 = var2.getParent();
    nu.staldal.xtree.Element var23 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var26 = var23.lookupAttribute("4444444444", "hi!");
    java.lang.String var29 = var23.getInheritedAttribute("", "4444444444");
    int var32 = var23.lookupAttribute("", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String var34 = var23.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var35 = var23.getLocalName();
    var2.addChild((nu.staldal.xtree.Node)var23);
    nu.staldal.xtree.Element var40 = new nu.staldal.xtree.Element("", "hi!", 1);
    var40.addAttribute("hi!", "", "hi!", "");
    int var46 = var40.numberOfAttributes();
    java.net.URL var47 = var40.getBaseURI();
    var2.insertChild((nu.staldal.xtree.Node)var40, 2);
    
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "4444444444"+ "'", var35.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test391");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    var2.addAttribute("", "hi!", "", "hi!");
    var2.setColumn(1);
    var2.addAttribute("hi!", "nu.staldal.ftp.FTPException: hi!", "nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException~ hi__33__");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var19 = var2.getFirstChildElement("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test392");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.BasicSplit var3 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var5 = new nu.staldal.xtree.Text("hi!");
    char[] var6 = var5.asCharArray();
    var3.characters(var6, 1, 10);
    var3.endElement("", "hi!", "hi!");
    var3.processingInstruction("", "hi!");
    var3.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var3.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var3);
    var3.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var2.toSAX((org.xml.sax.ContentHandler)var3);
    nu.staldal.lagoon.producer.BasicSplit var25 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var27 = new nu.staldal.xtree.Text("hi!");
    char[] var28 = var27.asCharArray();
    var25.characters(var28, 1, 10);
    var25.endElement("", "hi!", "hi!");
    var25.processingInstruction("", "hi!");
    var25.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var25.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var43 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var25);
    java.util.Enumeration var44 = var25.getParamNames();
    nu.staldal.xtree.Element var47 = new nu.staldal.xtree.Element("hi!", "hi!");
    var47.setLine(100);
    java.lang.String var51 = var47.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var25.setDocumentLocator((org.xml.sax.Locator)var47);
    char[] var55 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var59 = new nu.staldal.xtree.Text(var55, 1, 0, false);
    var25.characters(var55, 1, 2);
    var3.ignorableWhitespace(var55, (-1), 1);
    nu.staldal.lagoon.core.XMLStreamProducer var66 = var3.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test393");


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
    java.lang.String var23 = var2.getNamespaceURI();
    java.lang.String var25 = var2.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    
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
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test394");


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
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    var17.setPassword("");
    var17.setForce(false);
    org.apache.tools.ant.Target var22 = var17.getOwningTarget();
    var17.maybeConfigure();
    var17.setTargetURL("4444444444");
    var0.bindToOwner((org.apache.tools.ant.Task)var17);
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    var27.bindToOwner((org.apache.tools.ant.Task)var28);
    var27.log("");
    java.lang.Object var32 = var27.clone();
    nu.staldal.lagoon.LagoonAntTask var33 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var36 = new nu.staldal.ftp.FTPException("hi!");
    var33.log("", (java.lang.Throwable)var36, 10);
    org.apache.tools.ant.Location var39 = var33.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var40 = var33.getRuntimeConfigurableWrapper();
    var33.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var43 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var46 = new nu.staldal.ftp.FTPException("hi!");
    var43.log("", (java.lang.Throwable)var46, 10);
    org.apache.tools.ant.Project var49 = var43.getProject();
    nu.staldal.lagoon.util.TemplateException var51 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var52 = var51.getException();
    var43.log("", (java.lang.Throwable)var51, (-1));
    var33.bindToOwner((org.apache.tools.ant.Task)var43);
    org.apache.tools.ant.Location var56 = var43.getLocation();
    var27.setLocation(var56);
    nu.staldal.lagoon.LagoonAntTask var58 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var61 = new nu.staldal.ftp.FTPException("hi!");
    var58.log("", (java.lang.Throwable)var61, 10);
    org.apache.tools.ant.Location var64 = var58.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var65 = var58.getRuntimeConfigurableWrapper();
    var58.setForce(false);
    org.apache.tools.ant.Location var68 = var58.getLocation();
    nu.staldal.lagoon.core.LagoonException var70 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var71 = var70.toString();
    var58.log((java.lang.Throwable)var70, 100);
    org.apache.tools.ant.Location var74 = var58.getLocation();
    var27.setLocation(var74);
    var17.setLocation(var74);
    java.lang.String var77 = var17.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var71.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test395");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    char[] var3 = var1.asCharArray();
    nu.staldal.lagoon.producer.BasicSplit var4 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text("hi!");
    char[] var7 = var6.asCharArray();
    var4.characters(var7, 1, 10);
    var4.endElement("", "hi!", "hi!");
    var4.processingInstruction("", "hi!");
    var4.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var4.startDocument();
    var4.skippedEntity("4444444444");
    var4.skippedEntity("hi!");
    var1.toSAX((org.xml.sax.ContentHandler)var4);
    var4.startDocument();
    int var28 = var4.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test396");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    java.lang.String var6 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var7 = var2.getTextContent();
    nu.staldal.xtree.Element var10 = var2.getFirstChildElementOrNull("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test397");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "                                                                                                    ", 100, 1);
    var4.addAttribute("hi_33_", "##########", "nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException", "hi_33_");
    var4.addNamespaceMapping("4", "nu.staldal.lagoon.util.TemplateException: hi!");

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test398");


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
    char[] var24 = var23.asCharArray();
    boolean var25 = var23.isWhitespaceNode();
    char[] var26 = var23.asCharArray();
    var18.setDocumentLocator((org.xml.sax.Locator)var23);
    char[] var28 = var23.asCharArray();
    java.lang.String var29 = var23.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test399");


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
    var9.log("          ", 1);
    var9.setTaskName("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    org.apache.tools.ant.RuntimeConfigurable var27 = var9.getRuntimeConfigurableWrapper();
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var31 = new nu.staldal.ftp.FTPException("hi!");
    var28.log("", (java.lang.Throwable)var31, 10);
    org.apache.tools.ant.Project var34 = var28.getProject();
    nu.staldal.lagoon.util.TemplateException var36 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var37 = var36.getException();
    var28.log("", (java.lang.Throwable)var36, (-1));
    java.lang.Throwable[] var40 = var36.getSuppressed();
    java.lang.Throwable[] var41 = var36.getSuppressed();
    var9.log((java.lang.Throwable)var36, 100);
    var9.setDescription("nu.staldal.lagoon.util.TemplateException: _32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test400");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.lagoon.util.TemplateException~~ ");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test401");


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
    var22.processingInstruction("nu.staldal.lagoon.core.AuthenticationMissingException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_ftp_46_FTPException_126__126__32_hi_33_");
    
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

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test402");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    org.apache.tools.ant.Project var7 = var0.getProject();
    nu.staldal.lagoon.LagoonAntTask var8 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var9 = var8.getDescription();
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    var10.bindToOwner((org.apache.tools.ant.Task)var11);
    var10.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    var15.setPassword("");
    var10.bindToOwner((org.apache.tools.ant.Task)var15);
    org.apache.tools.ant.Project var19 = var10.getProject();
    org.apache.tools.ant.Project var20 = var10.getProject();
    org.apache.tools.ant.RuntimeConfigurable var21 = var10.getRuntimeConfigurableWrapper();
    var8.setRuntimeConfigurableWrapper(var21);
    var0.setRuntimeConfigurableWrapper(var21);
    org.apache.tools.ant.RuntimeConfigurable var24 = var0.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Location var25 = var0.getLocation();
    var0.setDescription("4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test403");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var17 = var11.getAttrValueOrNull("4444444444");
    java.lang.String var19 = var11.lookupNamespaceURI("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    int var20 = var11.numberOfNamespaceMappings();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test404");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__"+ "'", var1.equals("nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__"));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test405");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    boolean var16 = var2.getPreserveSpace();
    nu.staldal.xtree.Node var18 = var2.getChild(0);
    int var19 = var2.getLineNumber();
    int var20 = var2.getLineNumber();
    nu.staldal.lagoon.producer.BasicSplit var21 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("hi!");
    char[] var24 = var23.asCharArray();
    var21.characters(var24, 1, 10);
    var21.endElement("", "hi!", "hi!");
    var21.processingInstruction("", "hi!");
    var21.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var21.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var39 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var21);
    var2.outputStartElement((org.xml.sax.ContentHandler)var21);
    nu.staldal.xmlutil.ContentHandlerAdapter var41 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var21);
    nu.staldal.xtree.Element var44 = new nu.staldal.xtree.Element("hi!", "hi!");
    var44.setLine(100);
    java.lang.String var49 = var44.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: ");
    var21.setDocumentLocator((org.xml.sax.Locator)var44);
    var44.setPublicId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_");
    java.lang.String var53 = var44.getTextContentOrNull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var55 = var44.getAttrValue("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + ""+ "'", var53.equals(""));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test406");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var2, false, true);
    var2.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var10 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var2);
    var2.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    java.lang.String var14 = var1.getValue();
    boolean var15 = var1.isWhitespaceNode();
    java.lang.String var16 = var1.getValue();
    boolean var17 = var1.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test407");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.init();
    org.apache.tools.ant.Location var7 = var1.getLocation();
    var1.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var1.log("", (-1));
    nu.staldal.lagoon.util.TemplateException var15 = new nu.staldal.lagoon.util.TemplateException("hi_33_");
    var1.log("", (java.lang.Throwable)var15, (-1));
    java.lang.String var18 = var1.getTaskName();
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    var19.bindToOwner((org.apache.tools.ant.Task)var20);
    var19.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var24 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var27 = new nu.staldal.ftp.FTPException("hi!");
    var24.log("", (java.lang.Throwable)var27, 10);
    org.apache.tools.ant.Location var30 = var24.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var31 = var24.getRuntimeConfigurableWrapper();
    var24.setForce(false);
    org.apache.tools.ant.Location var34 = var24.getLocation();
    var24.log("nu.staldal.lagoon.util.TemplateException", (-1));
    java.lang.String var38 = var24.getDescription();
    org.apache.tools.ant.Location var39 = var24.getLocation();
    var19.setLocation(var39);
    nu.staldal.lagoon.LagoonAntTask var41 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var44 = new nu.staldal.ftp.FTPException("hi!");
    var41.log("", (java.lang.Throwable)var44, 10);
    org.apache.tools.ant.Location var47 = var41.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var48 = var41.getRuntimeConfigurableWrapper();
    var41.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var51 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var54 = new nu.staldal.ftp.FTPException("hi!");
    var51.log("", (java.lang.Throwable)var54, 10);
    org.apache.tools.ant.Project var57 = var51.getProject();
    nu.staldal.lagoon.util.TemplateException var59 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var60 = var59.getException();
    var51.log("", (java.lang.Throwable)var59, (-1));
    var41.bindToOwner((org.apache.tools.ant.Task)var51);
    org.apache.tools.ant.Location var64 = var51.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var65 = var51.getRuntimeConfigurableWrapper();
    var19.setRuntimeConfigurableWrapper(var65);
    var1.setRuntimeConfigurableWrapper(var65);
    nu.staldal.ftp.FTPException var70 = new nu.staldal.ftp.FTPException("");
    java.lang.Throwable[] var71 = var70.getSuppressed();
    var1.log("nu.staldal.lagoon.core.LagoonException:                                                                                                     ", (java.lang.Throwable)var70, 10);
    var1.maybeConfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test408");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    var2.setColumn(100);
    java.lang.String var12 = var2.getTextContent();
    java.lang.String var15 = var2.getInheritedAttribute("                                                                                                    ", "a");
    java.net.URL var16 = var2.getBaseURI();
    int var17 = var2.numberOfNamespaceMappings();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var19 = var2.getNamespaceMapping(2);
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
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test409");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    java.lang.String var3 = var1.getValue();
    java.lang.String var4 = var1.getValue();
    nu.staldal.lagoon.producer.BasicSplit var5 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var7 = new nu.staldal.xtree.Text("hi!");
    char[] var8 = var7.asCharArray();
    var5.characters(var8, 1, 10);
    var5.endElement("", "hi!", "hi!");
    var5.processingInstruction("", "hi!");
    var5.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var5.startDocument();
    var5.skippedEntity("4444444444");
    java.util.Enumeration var25 = var5.getParamNames();
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    var28.setSystemId("");
    java.net.URL var31 = var28.getBaseURI();
    java.lang.String var34 = var28.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    var37.addNamespaceMapping("", "");
    var28.addChild((nu.staldal.xtree.Node)var37);
    int var42 = var37.getColumnNumber();
    java.lang.String var44 = var37.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var37.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var5.setDocumentLocator((org.xml.sax.Locator)var37);
    nu.staldal.xmlutil.ContentHandlerFixer var53 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, true);
    var1.toSAX((org.xml.sax.ContentHandler)var5);
    boolean var55 = var1.isWhitespaceNode();
    boolean var56 = var1.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test410");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    var0.log("");
    var0.log("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
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
    var16.setTaskType("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.lagoon.LagoonAntTask var39 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var42 = new nu.staldal.ftp.FTPException("hi!");
    var39.log("", (java.lang.Throwable)var42, 10);
    org.apache.tools.ant.Location var45 = var39.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var46 = var39.getRuntimeConfigurableWrapper();
    var39.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var49 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var52 = new nu.staldal.ftp.FTPException("hi!");
    var49.log("", (java.lang.Throwable)var52, 10);
    org.apache.tools.ant.Project var55 = var49.getProject();
    nu.staldal.lagoon.util.TemplateException var57 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var58 = var57.getException();
    var49.log("", (java.lang.Throwable)var57, (-1));
    var39.bindToOwner((org.apache.tools.ant.Task)var49);
    org.apache.tools.ant.Location var62 = var49.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var63 = var49.getRuntimeConfigurableWrapper();
    var49.setForce(true);
    java.lang.String var66 = var49.getTaskName();
    var16.bindToOwner((org.apache.tools.ant.Task)var49);
    nu.staldal.lagoon.core.LagoonException var69 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var49.log((java.lang.Throwable)var69, 10);
    var0.log((java.lang.Throwable)var69, (-1));
    java.lang.String var74 = var69.toString();
    java.lang.String var75 = var69.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: "+ "'", var74.equals("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: "+ "'", var75.equals("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: "));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test411");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    java.lang.String var3 = var2.getValue();
    var2.setPublicId("          ");
    java.lang.String var8 = var2.getInheritedAttribute("####################################################################################################", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444");
    java.lang.String var10 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_"+ "'", var3.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test412");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var2 = var1.getValue();
    char[] var3 = var1.asCharArray();
    char[] var4 = var1.asCharArray();
    boolean var5 = var1.isWhitespaceNode();
    char[] var6 = var1.asCharArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.AuthenticationMissingException"+ "'", var2.equals("nu.staldal.lagoon.core.AuthenticationMissingException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test413");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    java.lang.String var6 = var0.getDescription();
    var0.setPassword("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var9 = var0.getTaskType();
    java.lang.String var10 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test414");


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
    var33.addAttribute("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "");
    var33.setLine(2);
    
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

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test415");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    var2.setColumn(100);
    java.lang.String var12 = var2.getTextContent();
    java.lang.String var15 = var2.getInheritedAttribute("                                                                                                    ", "a");
    java.net.URL var16 = var2.getBaseURI();
    int var17 = var2.getColumnNumber();
    nu.staldal.xtree.Element var20 = var2.getFirstChildElementOrNull("nu.staldal.ftp.FTPException: hi!", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var23 = var2.getFirstChildElement("nu.staldal.lagoon.core.LagoonException: nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test416");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("_32__32__32__32__32__32__32__32__32__32_", "nu.staldal.ftp.FTPException: 4", 100);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test417");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    var4.setLine((-1));
    java.lang.String var8 = var4.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    int var9 = var4.numberOfAttributes();
    nu.staldal.lagoon.producer.BasicSplit var10 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("hi!");
    char[] var13 = var12.asCharArray();
    var10.characters(var13, 1, 10);
    var10.endElement("", "hi!", "hi!");
    var10.processingInstruction("", "hi!");
    var10.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var10.startDocument();
    var10.skippedEntity("4444444444");
    java.util.Enumeration var30 = var10.getParamNames();
    nu.staldal.xtree.Element var33 = new nu.staldal.xtree.Element("hi!", "hi!");
    var33.setSystemId("");
    java.net.URL var36 = var33.getBaseURI();
    java.lang.String var39 = var33.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("hi!", "hi!");
    var42.addNamespaceMapping("", "");
    var33.addChild((nu.staldal.xtree.Node)var42);
    int var47 = var42.getColumnNumber();
    java.lang.String var49 = var42.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var42.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var10.setDocumentLocator((org.xml.sax.Locator)var42);
    nu.staldal.xmlutil.ContentHandlerAdapter var56 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var10);
    java.util.Enumeration var57 = var10.getParamNames();
    java.lang.String var59 = var10.getParam("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    var4.outputStartElement((org.xml.sax.ContentHandler)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test418");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.lang.String var6 = var3.getSystemId();
    boolean var7 = var3.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test419");


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
    nu.staldal.xmlutil.ContentHandlerFixer var40 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, true, true);
    var40.startDocument();
    nu.staldal.xtree.ProcessingInstruction var44 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~~ ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    java.lang.String var45 = var44.getTarget();
    var40.setDocumentLocator((org.xml.sax.Locator)var44);
    java.lang.String var47 = var44.getValue();
    nu.staldal.lagoon.producer.BasicSplit var48 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var50 = new nu.staldal.xtree.Text("hi!");
    char[] var51 = var50.asCharArray();
    var48.characters(var51, 1, 10);
    nu.staldal.xtree.Element var57 = new nu.staldal.xtree.Element("hi!", "hi!");
    var57.setSystemId("");
    var57.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: ", "hi!");
    var48.setDocumentLocator((org.xml.sax.Locator)var57);
    var48.afterBuild();
    var44.toSAX((org.xml.sax.ContentHandler)var48);
    
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
    assertTrue("'" + var45 + "' != '" + "nu.staldal.lagoon.core.LagoonException~~ "+ "'", var45.equals("nu.staldal.lagoon.core.LagoonException~~ "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException"+ "'", var47.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test420");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var30 = var11.getAttributeLocalName(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test421");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var14 = var11.lookupAttribute("4444444444", "hi!");
    java.lang.String var17 = var11.getInheritedAttribute("", "4444444444");
    int var20 = var11.lookupAttribute("", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String var22 = var11.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var11);
    var0.startDocument();
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
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test422");


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
    var9.log("          ", 1);
    java.lang.String var25 = var9.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test423");


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
    nu.staldal.lagoon.util.TemplateException var25 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var18.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test424");


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
    var21.startPrefixMapping("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    nu.staldal.xmlutil.ContentHandlerFixer var52 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var21, true);
    var52.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test425");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    java.lang.String var3 = var1.getValue();
    java.lang.String var4 = var1.getValue();
    nu.staldal.lagoon.producer.BasicSplit var5 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var7 = new nu.staldal.xtree.Text("hi!");
    char[] var8 = var7.asCharArray();
    var5.characters(var8, 1, 10);
    var5.endElement("", "hi!", "hi!");
    var5.processingInstruction("", "hi!");
    var5.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var5.startDocument();
    var5.skippedEntity("4444444444");
    java.util.Enumeration var25 = var5.getParamNames();
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    var28.setSystemId("");
    java.net.URL var31 = var28.getBaseURI();
    java.lang.String var34 = var28.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    var37.addNamespaceMapping("", "");
    var28.addChild((nu.staldal.xtree.Node)var37);
    int var42 = var37.getColumnNumber();
    java.lang.String var44 = var37.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var37.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var5.setDocumentLocator((org.xml.sax.Locator)var37);
    nu.staldal.xmlutil.ContentHandlerFixer var53 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, true);
    var1.toSAX((org.xml.sax.ContentHandler)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.init();
      fail("Expected exception of type nu.staldal.lagoon.core.LagoonException");
    } catch (nu.staldal.lagoon.core.LagoonException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test426");


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
    var0.destroy();
    var0.endElement("nu.staldal.lagoon.util.TemplateException: nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException", " ", "44");
    
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

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test427");


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
    var0.endElement("                                                                                                    ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.util.TemplateException: ");
    var0.skippedEntity("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var27 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.ContentHandlerAdapter var28 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var27);
    var27.processingInstruction("nu.staldal.lagoon.util.TemplateException: aa", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test428");


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
    nu.staldal.xtree.TreeBuilder var47 = new nu.staldal.xtree.TreeBuilder();
    var47.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var53 = var52.getLineNumber();
    var52.setPublicId("");
    int var56 = var52.getLineNumber();
    var47.setDocumentLocator((org.xml.sax.Locator)var52);
    var47.startDocument();
    nu.staldal.xtree.Text var60 = new nu.staldal.xtree.Text("");
    char[] var61 = var60.asCharArray();
    char[] var62 = var60.asCharArray();
    char[] var63 = var60.asCharArray();
    char[] var64 = var60.asCharArray();
    var47.ignorableWhitespace(var64, (-1), 10);
    var46.ignorableWhitespace(var64, 0, (-1));
    var46.startDocument();
    var46.startDocument();
    
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
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test429");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("4444444444", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test430");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    java.util.Enumeration var1 = var0.getParamNames();
    java.lang.String var2 = var0.getEntryName();
    java.util.Enumeration var3 = var0.getParamNames();
    nu.staldal.lagoon.core.LagoonContext var4 = var0.getContext();
    boolean var6 = var0.hasBeenUpdated(1433461944000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test431");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    boolean var3 = var1.isWhitespaceNode();
    int var4 = var1.getLineNumber();
    nu.staldal.xtree.Element var7 = new nu.staldal.xtree.Element("hi!", "hi!");
    var7.setSystemId("");
    java.net.URL var10 = var7.getBaseURI();
    java.lang.String var13 = var7.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi!", "hi!");
    var16.addNamespaceMapping("", "");
    var7.addChild((nu.staldal.xtree.Node)var16);
    java.lang.String var23 = var16.getInheritedAttribute("", "hi!");
    int var24 = var16.getColumnNumber();
    char[] var27 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text(var27, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var32 = new nu.staldal.xtree.TreeBuilder();
    var32.endPrefixMapping("hi!");
    var32.endDocument();
    var32.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var31.toSAX((org.xml.sax.ContentHandler)var32);
    var32.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var32.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    var16.toSAX((org.xml.sax.ContentHandler)var32);
    var1.toSAX((org.xml.sax.ContentHandler)var32);
    java.lang.String var47 = var1.getValue();
    nu.staldal.lagoon.producer.BasicSplit var48 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var50 = new nu.staldal.xtree.Text("hi!");
    char[] var51 = var50.asCharArray();
    var48.characters(var51, 1, 10);
    var48.endElement("", "hi!", "hi!");
    var48.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var62 = new nu.staldal.xtree.Text("");
    char[] var63 = var62.asCharArray();
    char[] var64 = var62.asCharArray();
    char[] var65 = var62.asCharArray();
    char[] var66 = var62.asCharArray();
    var48.ignorableWhitespace(var66, 1, 100);
    nu.staldal.xmlutil.ContentHandlerFixer var70 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var48);
    var48.destroy();
    var1.toSAX((org.xml.sax.ContentHandler)var48);
    java.lang.String var73 = var1.getValue();
    boolean var74 = var1.isWhitespaceNode();
    java.lang.String var75 = var1.getValue();
    char[] var76 = var1.asCharArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + ""+ "'", var47.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + ""+ "'", var73.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + ""+ "'", var75.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test432");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var25 = var4.getFirstChildElement();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test433");


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
    nu.staldal.xmlutil.ContentHandlerFixer var40 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, true, true);
    var40.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var43 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var40, true);
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "hi!");
    var46.setSystemId("");
    java.net.URL var49 = var46.getBaseURI();
    java.lang.String var52 = var46.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var55 = new nu.staldal.xtree.Element("hi!", "hi!");
    var55.addNamespaceMapping("", "");
    var46.addChild((nu.staldal.xtree.Node)var55);
    java.lang.String var62 = var55.getInheritedAttribute("", "hi!");
    int var63 = var55.getLineNumber();
    java.lang.String var66 = var55.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var43.setDocumentLocator((org.xml.sax.Locator)var55);
    boolean var68 = var55.getPreserveSpace();
    
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
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test434");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException~~ ", "aa", 1);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test435");


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
    int var43 = var2.getColumnNumber();
    java.lang.String var46 = var2.getAttrValueOrNull("4444444444", " ");
    nu.staldal.xtree.Element var47 = var2.getFirstChildElement();
    nu.staldal.xtree.NodeWithChildren var48 = var47.getParent();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test436");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    int var13 = var4.lookupAttribute("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException");
    boolean var14 = var4.getPreserveSpace();
    nu.staldal.lagoon.producer.BasicSplit var15 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var17 = new nu.staldal.xtree.Text("hi!");
    char[] var18 = var17.asCharArray();
    var15.characters(var18, 1, 10);
    var15.endElement("", "hi!", "hi!");
    var15.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var28 = new nu.staldal.lagoon.producer.IslandSplit();
    var28.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var31 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var28, true);
    char[] var34 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var38 = new nu.staldal.xtree.Text(var34, 1, 0, false);
    var31.setDocumentLocator((org.xml.sax.Locator)var38);
    char[] var40 = var38.asCharArray();
    var15.characters(var40, 10, 0);
    var15.processingInstruction("hi!", "hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var47 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var15);
    nu.staldal.xmlutil.ContentHandlerFixer var48 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var47);
    nu.staldal.xtree.Element var51 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var52 = var51.getLineNumber();
    var51.setPublicId("");
    java.lang.String var57 = var51.getInheritedAttribute("", "4444444444");
    int var58 = var51.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var59 = new nu.staldal.xtree.TreeBuilder();
    var59.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var64 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var59, false, false);
    var51.toSAX((org.xml.sax.ContentHandler)var64);
    nu.staldal.xmlutil.ContentHandlerFixer var67 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var64, true);
    nu.staldal.xtree.Text var69 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var71 = var69.lookupNamespaceURI("");
    char[] var72 = var69.asCharArray();
    var64.ignorableWhitespace(var72, 0, 100);
    var48.ignorableWhitespace(var72, 100, (-1));
    var48.skippedEntity("nu.staldal.lagoon.util.TemplateException~ ");
    var48.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.outputEndElement((org.xml.sax.ContentHandler)var48);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test437");


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
    nu.staldal.xmlutil.ContentHandlerAdapter var80 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var22);
    var22.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    var22.skippedEntity("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
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

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test438");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    java.lang.String var10 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var11 = var2.getBaseURI();
    int var12 = var2.numberOfChildren();
    var2.setPublicId("4444444444");
    java.net.URL var15 = var2.getBaseURI();
    java.lang.String var16 = var2.getLocalName();
    
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test439");


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
    java.lang.String var23 = var5.getNamespaceURI();
    int var24 = var5.numberOfAttributes();
    var5.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", "4444444444", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    int var30 = var5.numberOfChildren();
    nu.staldal.xtree.Element var33 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var34 = var33.getLineNumber();
    java.lang.String var35 = var33.getSystemId();
    nu.staldal.xtree.TreeBuilder var36 = new nu.staldal.xtree.TreeBuilder();
    var36.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var41 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var36, false, false);
    var33.toSAX((org.xml.sax.ContentHandler)var36);
    var36.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.ContentHandlerFixer var47 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var36, false, false);
    var47.endDocument();
    var47.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.outputStartElement((org.xml.sax.ContentHandler)var47);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
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
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test440");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    var4.setColumn(0);
    nu.staldal.xtree.Element var7 = var4.getFirstChildElementOrNull();
    int var10 = var4.lookupAttribute("nu.staldal.ftp.FTPException~ hi!", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    boolean var11 = var4.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test441");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.log("");
    java.lang.String var5 = var0.getTaskName();
    var0.setForce(false);
    var0.setTaskName("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test442");


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
    nu.staldal.xmlutil.DocumentHandlerAdapter var54 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var53);
    nu.staldal.xtree.Element var57 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var58 = var57.getLineNumber();
    var57.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var64 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var65 = var64.getLineNumber();
    var64.addNamespaceMapping("", "");
    var57.addChild((nu.staldal.xtree.Node)var64);
    nu.staldal.xtree.NodeWithChildren var70 = var57.getParent();
    boolean var71 = var57.getPreserveSpace();
    java.lang.String var74 = var57.getInheritedAttribute("", "");
    var57.addNamespaceMapping("hi_33_", "hi_33_");
    var53.setDocumentLocator((org.xml.sax.Locator)var57);
    var57.setColumn(1);
    
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
    assertTrue(var58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test443");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    boolean var3 = var1.isWhitespaceNode();
    char[] var4 = var1.asCharArray();
    boolean var5 = var1.getPreserveSpace();
    java.lang.String var6 = var1.getValue();
    int var7 = var1.getColumnNumber();
    char[] var8 = var1.asCharArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test444");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    int var16 = var11.getColumnNumber();
    java.lang.String var18 = var11.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    int var21 = var11.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "hi_33_");
    int var22 = var11.numberOfChildren();
    int var23 = var11.getColumnNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.removeAttribute(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test445");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    org.apache.tools.ant.Target var9 = var5.getOwningTarget();
    var5.setTaskType("hi_33_");
    var5.setTaskType("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.LagoonAntTask var14 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    var14.bindToOwner((org.apache.tools.ant.Task)var15);
    var14.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    var19.setPassword("");
    var14.bindToOwner((org.apache.tools.ant.Task)var19);
    org.apache.tools.ant.Project var23 = var14.getProject();
    org.apache.tools.ant.Project var24 = var14.getProject();
    org.apache.tools.ant.Location var25 = var14.getLocation();
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    var26.bindToOwner((org.apache.tools.ant.Task)var27);
    var26.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var31 = new nu.staldal.lagoon.LagoonAntTask();
    var31.setPassword("");
    var26.bindToOwner((org.apache.tools.ant.Task)var31);
    org.apache.tools.ant.Project var35 = var26.getProject();
    org.apache.tools.ant.Project var36 = var26.getProject();
    org.apache.tools.ant.Location var37 = var26.getLocation();
    var14.setLocation(var37);
    var5.setLocation(var37);
    var5.setTargetURL("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    var5.log("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", 2);
    var5.setDescription("nu.staldal.lagoon.core.LagoonException~~ ");
    var5.log("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test446");


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
    var18.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var73 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    var73.skippedEntity("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var73.startDocument();
    
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

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test447");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "nu__46__staldal__46__lagoon__46__util__46__TemplateException__126____32__", 0);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test448");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    org.apache.tools.ant.Target var6 = var1.getOwningTarget();
    java.lang.String var7 = var1.getTaskType();
    org.apache.tools.ant.Target var8 = var1.getOwningTarget();
    org.apache.tools.ant.Project var9 = var1.getProject();
    org.apache.tools.ant.Project var10 = var1.getProject();
    var1.log("nu.staldal.lagoon.util.TemplateException~ hi!", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test449");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.util.TemplateException: _32__32__32__32__32__32__32__32__32__32_");

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test450");


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
    java.lang.String var46 = var32.getTextContent();
    nu.staldal.xtree.TreeBuilder var47 = new nu.staldal.xtree.TreeBuilder();
    var47.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var52 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var47, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var55 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var52, false, true);
    nu.staldal.xtree.Text var57 = new nu.staldal.xtree.Text("4444444444");
    int var58 = var57.getColumnNumber();
    var52.setDocumentLocator((org.xml.sax.Locator)var57);
    nu.staldal.xtree.Element var62 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var63 = var62.getLineNumber();
    var62.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var69 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var70 = var69.getLineNumber();
    var69.addNamespaceMapping("", "");
    var62.addChild((nu.staldal.xtree.Node)var69);
    nu.staldal.xtree.NodeWithChildren var75 = var62.getParent();
    nu.staldal.xtree.Element var78 = var62.getFirstChildElementOrNull("hi!", "4444444444");
    int var79 = var62.numberOfNamespaceMappings();
    java.lang.String var81 = var62.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    boolean var82 = var62.getPreserveSpace();
    var52.setDocumentLocator((org.xml.sax.Locator)var62);
    var52.endDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var32.outputEndElement((org.xml.sax.ContentHandler)var52);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
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
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test451");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var16 = var2.getNamespaceURI();
    java.lang.String var19 = var2.getInheritedAttribute("aa", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    nu.staldal.lagoon.producer.BasicSplit var20 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var22 = new nu.staldal.xtree.Text("hi!");
    char[] var23 = var22.asCharArray();
    var20.characters(var23, 1, 10);
    var20.endElement("", "hi!", "hi!");
    var20.processingInstruction("", "hi!");
    var20.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var20.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var38 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var20);
    var38.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var40 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var38);
    nu.staldal.xmlutil.DocumentHandlerAdapter var41 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var38);
    nu.staldal.xtree.Element var44 = new nu.staldal.xtree.Element("hi!", "hi!");
    var44.setSystemId("");
    java.net.URL var47 = var44.getBaseURI();
    java.lang.String var50 = var44.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var53 = new nu.staldal.xtree.Element("hi!", "hi!");
    var53.addNamespaceMapping("", "");
    var44.addChild((nu.staldal.xtree.Node)var53);
    var44.setSystemId("");
    nu.staldal.xtree.Element var62 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var63 = var62.getLineNumber();
    var62.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var69 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var70 = var69.getLineNumber();
    var69.addNamespaceMapping("", "");
    var62.addChild((nu.staldal.xtree.Node)var69);
    var44.insertChild((nu.staldal.xtree.Node)var62, 0);
    var38.setDocumentLocator((org.xml.sax.Locator)var62);
    var38.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.util.TemplateException: ");
    var38.startDocument();
    nu.staldal.xtree.Element var85 = new nu.staldal.xtree.Element("aa", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", 10);
    var38.setDocumentLocator((org.xml.sax.Locator)var85);
    nu.staldal.xmlutil.DocumentHandlerAdapter var87 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var38);
    nu.staldal.xtree.Text var89 = new nu.staldal.xtree.Text("");
    char[] var90 = var89.asCharArray();
    boolean var91 = var89.isWhitespaceNode();
    char[] var92 = var89.asCharArray();
    char[] var93 = var89.asCharArray();
    var87.ignorableWhitespace(var93, (-1), (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.toSAX((org.xml.sax.ContentHandler)var87);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test452");


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
    nu.staldal.xmlutil.DocumentHandlerAdapter var63 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    var63.skippedEntity("nu.staldal.ftp.FTPException:                                                                                                     ");
    var63.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu____46____staldal____46____ftp____46____FTPException____126________32____hi____33____");
    
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

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test453");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8, true, true);
    nu.staldal.lagoon.producer.BasicSplit var15 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var17 = new nu.staldal.xtree.Text("hi!");
    char[] var18 = var17.asCharArray();
    var15.characters(var18, 1, 10);
    var15.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.BasicSplit var24 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var26 = new nu.staldal.xtree.Text("hi!");
    char[] var27 = var26.asCharArray();
    var24.characters(var27, 1, 10);
    var24.endElement("", "hi!", "hi!");
    var24.processingInstruction("", "hi!");
    var24.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var24.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var42 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var24);
    var42.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var46 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var42);
    var46.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.producer.BasicSplit var50 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var52 = new nu.staldal.xtree.Text("hi!");
    char[] var53 = var52.asCharArray();
    var50.characters(var53, 1, 10);
    var50.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var50.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    char[] var65 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var69 = new nu.staldal.xtree.Text(var65, 1, 0, false);
    char[] var70 = var69.asCharArray();
    var50.ignorableWhitespace(var70, 0, 10);
    var46.characters(var70, 0, 100);
    var15.ignorableWhitespace(var70, (-1), 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.characters(var70, (-1), 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test454");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var5 = var2.getFirstChildElementOrNull("nu.staldal.ftp.FTPException~~ hi!", "nu.staldal.lagoon.core.LagoonException~~ ");
    int var6 = var2.numberOfChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var7 = var2.getFirstChildElement();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test455");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4", "nu.staldal.lagoon.core.LagoonException~~ ", 10);
    boolean var4 = var3.isWhitespaceNode();
    java.lang.String var7 = var3.getInheritedAttribute("nu.staldal.lagoon.core.AuthenticationException", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    int var8 = var3.getLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test456");


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
    java.lang.String var23 = var5.getSystemId();
    nu.staldal.xtree.NodeWithChildren var24 = var5.getParent();
    var5.setPublicId("4");
    java.lang.String var28 = var5.lookupNamespacePrefix("__32____32____32____32____32____32____32____32____32____32__");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var31 = var5.getAttrValue("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!", "_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
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
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test457");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(10L);
    var0.beforeBuild();
    boolean var6 = var0.hasBeenUpdated(1L);
    boolean var8 = var0.hasBeenUpdated(1433461933000L);
    var0.afterBuild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.init();
      fail("Expected exception of type nu.staldal.lagoon.core.LagoonException");
    } catch (nu.staldal.lagoon.core.LagoonException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test458");


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
    var1.setForce(false);
    
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

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test459");


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
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "hi!");
    var46.setSystemId("");
    java.net.URL var49 = var46.getBaseURI();
    java.lang.String var51 = var46.getAttrValueOrNull("hi_33_");
    java.lang.String var54 = var46.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var55 = var46.getBaseURI();
    int var56 = var46.numberOfChildren();
    var27.insertChild((nu.staldal.xtree.Node)var46, 0);
    nu.staldal.xtree.Element var59 = var27.getFirstChildElement();
    nu.staldal.xtree.TreeBuilder var60 = new nu.staldal.xtree.TreeBuilder();
    var60.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var65 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var60, false, false);
    var60.startPrefixMapping("                                                                                                    ", "nu.staldal.lagoon.util.TemplateException: ");
    var60.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var60.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ hi__33__");
    var27.outputStartElement((org.xml.sax.ContentHandler)var60);
    var60.startPrefixMapping("nu.staldal.lagoon.util.TemplateException: hi_33_", "nu.staldal.lagoon.util.TemplateException: aa");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test460");


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
    var21.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____", "nu__46__staldal__46__lagoon__46__util__46__TemplateException");
    var21.processingInstruction("_35__35__35__35__35__35__35__35__35__35_", "nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test461");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.core.LagoonException var9 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var0.log("4444444444", (java.lang.Throwable)var9, 100);
    org.apache.tools.ant.RuntimeConfigurable var12 = var0.getRuntimeConfigurableWrapper();
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var16 = new nu.staldal.ftp.FTPException("hi!");
    var13.log("", (java.lang.Throwable)var16, 10);
    org.apache.tools.ant.Project var19 = var13.getProject();
    nu.staldal.lagoon.util.TemplateException var21 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var22 = var21.getException();
    var13.log("", (java.lang.Throwable)var21, (-1));
    java.lang.Throwable[] var25 = var21.getSuppressed();
    java.lang.Throwable[] var26 = var21.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var28 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var29 = var28.toString();
    var21.addSuppressed((java.lang.Throwable)var28);
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
    var28.addSuppressed((java.lang.Throwable)var43);
    var0.log((java.lang.Throwable)var28, 10);
    nu.staldal.lagoon.util.TemplateException var50 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var28);
    java.lang.Exception var51 = var28.getException();
    java.lang.String var52 = var28.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var29.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var44.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var52.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test462");


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
    var4.skippedEntity("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    nu.staldal.lagoon.producer.IslandSplit var27 = new nu.staldal.lagoon.producer.IslandSplit();
    var27.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var30 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var27, true);
    char[] var33 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var37 = new nu.staldal.xtree.Text(var33, 1, 0, false);
    var30.setDocumentLocator((org.xml.sax.Locator)var37);
    char[] var39 = var37.asCharArray();
    var4.ignorableWhitespace(var39, 0, 10);
    var4.endDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test463");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    var0.setTaskName("                                                                                                    ");
    var0.init();
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    var10.bindToOwner((org.apache.tools.ant.Task)var11);
    var10.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    var15.setPassword("");
    var10.bindToOwner((org.apache.tools.ant.Task)var15);
    org.apache.tools.ant.Project var19 = var10.getProject();
    org.apache.tools.ant.Project var20 = var10.getProject();
    var10.log("");
    var10.log("nu.staldal.lagoon.core.LagoonException: ");
    var0.bindToOwner((org.apache.tools.ant.Task)var10);
    var0.setTaskType("          ");
    var0.log("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ", 0);
    nu.staldal.lagoon.LagoonAntTask var31 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    var31.bindToOwner((org.apache.tools.ant.Task)var32);
    nu.staldal.lagoon.LagoonAntTask var34 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var37 = new nu.staldal.ftp.FTPException("hi!");
    var34.log("", (java.lang.Throwable)var37, 10);
    org.apache.tools.ant.Location var40 = var34.getLocation();
    var31.setLocation(var40);
    org.apache.tools.ant.Location var42 = var31.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var43 = var31.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test464");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    nu.staldal.xtree.Text var15 = new nu.staldal.xtree.Text("");
    char[] var16 = var15.asCharArray();
    char[] var17 = var15.asCharArray();
    var0.ignorableWhitespace(var17, 10, 0);
    var0.endElement("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: ", "4444444444");
    nu.staldal.lagoon.producer.BasicSplit var25 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var27 = new nu.staldal.xtree.Text("hi!");
    char[] var28 = var27.asCharArray();
    var25.characters(var28, 1, 10);
    var25.endElement("", "hi!", "hi!");
    var25.processingInstruction("", "hi!");
    var25.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var25.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var43 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var25);
    var43.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var45 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var43);
    nu.staldal.xtree.Text var47 = new nu.staldal.xtree.Text("hi!");
    char[] var48 = var47.asCharArray();
    var45.ignorableWhitespace(var48, (-1), 100);
    var0.ignorableWhitespace(var48, 100, 10);
    nu.staldal.xtree.Text var56 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var58 = var56.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    char[] var59 = var56.asCharArray();
    var0.ignorableWhitespace(var59, 0, 10);
    nu.staldal.lagoon.producer.BasicSplit var63 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var65 = new nu.staldal.xtree.Text("hi!");
    char[] var66 = var65.asCharArray();
    var63.characters(var66, 1, 10);
    var63.endElement("", "hi!", "hi!");
    var63.processingInstruction("", "hi!");
    var63.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var63.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var81 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var63);
    var81.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    char[] var87 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var91 = new nu.staldal.xtree.Text(var87, 1, 0, false);
    char[] var92 = var91.asCharArray();
    var81.characters(var92, 100, (-1));
    var0.characters(var92, 10, 0);
    java.lang.String var99 = var0.getEntryName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var99);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test465");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var2.setLine(0);
    var2.setColumn((-1));
    java.lang.String var8 = var2.lookupNamespaceURI("nu.staldal.lagoon.util.TemplateException~ ");
    int var9 = var2.numberOfNamespaceMappings();
    java.lang.String var10 = var2.getLocalName();
    java.lang.String var11 = var2.getTextContentOrNull();
    boolean var12 = var2.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException"+ "'", var10.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test466");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("#");

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test467");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    java.lang.String var20 = var11.getAttrValueOrNull("4444444444");
    int var21 = var11.numberOfAttributes();
    int var22 = var11.numberOfChildren();
    int var23 = var11.numberOfNamespaceMappings();
    var11.addAttribute("nu.staldal.ftp.FTPException:                                                                                                     ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", "nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test468");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var6 = var0.needPassword();
    long var8 = var0.fileLastModified("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    long var10 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________");
    nu.staldal.lagoon.core.OutputHandler var12 = var0.createFile("nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException");
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1433462003000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test469");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.maybeConfigure();
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var10 = new nu.staldal.ftp.FTPException("hi!");
    var7.log("", (java.lang.Throwable)var10, 10);
    org.apache.tools.ant.Project var13 = var7.getProject();
    nu.staldal.lagoon.util.TemplateException var15 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var16 = var15.getException();
    var7.log("", (java.lang.Throwable)var15, (-1));
    java.lang.Throwable[] var19 = var15.getSuppressed();
    java.lang.Throwable[] var20 = var15.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var22 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var23 = var22.toString();
    var15.addSuppressed((java.lang.Throwable)var22);
    nu.staldal.lagoon.util.TemplateException var25 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var15);
    java.lang.String var26 = var15.toString();
    java.lang.Throwable[] var27 = var15.getSuppressed();
    var0.log("nu.staldal.lagoon.core.LagoonException~~ ", (java.lang.Throwable)var15, 1);
    java.lang.String var30 = var15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var23.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var26.equals("nu.staldal.lagoon.util.TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var30.equals("nu.staldal.lagoon.util.TemplateException"));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test470");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.net.URL var2 = var1.getBaseURI();
    char[] var3 = var1.asCharArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test471");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    nu.staldal.xtree.Text var15 = new nu.staldal.xtree.Text("");
    char[] var16 = var15.asCharArray();
    char[] var17 = var15.asCharArray();
    var0.ignorableWhitespace(var17, 10, 0);
    java.lang.String var22 = var0.getParam("");
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    java.lang.String var32 = var25.getTextContent();
    java.lang.String var34 = var25.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    var37.setSystemId("");
    java.net.URL var40 = var37.getBaseURI();
    java.lang.String var43 = var37.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "hi!");
    var46.addNamespaceMapping("", "");
    var37.addChild((nu.staldal.xtree.Node)var46);
    java.lang.String var53 = var46.getInheritedAttribute("", "hi!");
    var25.addChild((nu.staldal.xtree.Node)var46);
    var46.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "                                                                                                    ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var46);
    var0.skippedEntity("nu.staldal.ftp.FTPException: hi!");
    java.util.Enumeration var63 = var0.getParamNames();
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException~ hi!", "4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test472");


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
    var0.log("nu.staldal.lagoon.core.LagoonException~ ", (-1));
    java.lang.Object var35 = var0.clone();
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var39 = new nu.staldal.ftp.FTPException("hi!");
    var36.log("", (java.lang.Throwable)var39, 10);
    org.apache.tools.ant.Project var42 = var36.getProject();
    nu.staldal.lagoon.util.TemplateException var44 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var45 = var44.getException();
    var36.log("", (java.lang.Throwable)var44, (-1));
    var36.log("");
    org.apache.tools.ant.Location var50 = var36.getLocation();
    var36.log("aa", 10);
    nu.staldal.lagoon.LagoonAntTask var54 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var55 = new nu.staldal.lagoon.LagoonAntTask();
    var54.bindToOwner((org.apache.tools.ant.Task)var55);
    nu.staldal.lagoon.LagoonAntTask var57 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var60 = new nu.staldal.ftp.FTPException("hi!");
    var57.log("", (java.lang.Throwable)var60, 10);
    org.apache.tools.ant.Location var63 = var57.getLocation();
    var54.setLocation(var63);
    org.apache.tools.ant.Location var65 = var54.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var66 = var54.getRuntimeConfigurableWrapper();
    var36.setRuntimeConfigurableWrapper(var66);
    var0.setRuntimeConfigurableWrapper(var66);
    var0.setTaskName(" ");
    nu.staldal.ftp.FTPException var73 = new nu.staldal.ftp.FTPException("nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
    var0.log("nu.staldal.lagoon.util.TemplateException: ", (java.lang.Throwable)var73, 2);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test473");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    org.apache.tools.ant.Project var7 = var0.getProject();
    java.lang.String var8 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var12 = new nu.staldal.ftp.FTPException("hi!");
    var9.log("", (java.lang.Throwable)var12, 10);
    var9.init();
    var9.init();
    java.lang.String var17 = var9.getDescription();
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var21 = new nu.staldal.ftp.FTPException("hi!");
    var18.log("", (java.lang.Throwable)var21, 10);
    org.apache.tools.ant.Project var24 = var18.getProject();
    var9.bindToOwner((org.apache.tools.ant.Task)var18);
    var18.setTaskType("nu.staldal.lagoon.core.LagoonException: ");
    var18.setTaskName("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.bindToOwner((org.apache.tools.ant.Task)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test474");


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
    var22.processingInstruction("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var22.processingInstruction("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    var22.startPrefixMapping("##", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    var22.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var22.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");
    
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

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test475");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("__52__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "__52__"+ "'", var1.equals("__52__"));

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test476");


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
    char[] var83 = new char[] { '4'};
    var22.characters(var83, (-1), 100);
    var22.skippedEntity("nu.staldal.ftp.FTPException: hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test477");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", (-1));

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test478");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    var0.log("");
    org.apache.tools.ant.Location var14 = var0.getLocation();
    var0.log("aa", 10);
    var0.setPassword("nu.staldal.ftp.FTPException~~ hi!");
    var0.setPassword("##");
    var0.log("nu.staldal.lagoon.core.LagoonException~ ", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test479");


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
    nu.staldal.xmlutil.ContentHandlerFixer var27 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4);
    nu.staldal.xmlutil.ContentHandlerAdapter var28 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var27);
    var27.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test480");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    java.lang.String var10 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var11 = var2.getBaseURI();
    int var12 = var2.numberOfChildren();
    java.lang.String var13 = var2.getLocalName();
    nu.staldal.xtree.TreeBuilder var14 = new nu.staldal.xtree.TreeBuilder();
    var14.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var19 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var14, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var22 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var19, false, true);
    nu.staldal.xtree.Text var24 = new nu.staldal.xtree.Text("4444444444");
    int var25 = var24.getColumnNumber();
    var19.setDocumentLocator((org.xml.sax.Locator)var24);
    var2.addChild((nu.staldal.xtree.Node)var24);
    nu.staldal.xtree.Element var30 = var2.getFirstChildElementOrNull("nu.staldal.ftp.FTPException: 4", "hi!");
    int var31 = var2.numberOfAttributes();
    
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
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test481");


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
    org.apache.tools.ant.Project var32 = var10.getProject();
    var10.reconfigure();
    
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
    assertNull(var32);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test482");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.startDocument();
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var12 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, true);
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
    java.lang.String var42 = var14.getValue();
    boolean var43 = var14.isWhitespaceNode();
    var0.setDocumentLocator((org.xml.sax.Locator)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var45 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test483");


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
    var0.setTargetURL("##########");
    var0.log("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: hi_33_", 10);
    
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

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test484");


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
    boolean var24 = var2.isWhitespaceNode();
    
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

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test485");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    java.lang.String var2 = var0.getDescription();
    java.lang.String var3 = var0.getDescription();
    nu.staldal.lagoon.util.TemplateException var6 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    var0.log(" ", (java.lang.Throwable)var6, (-1));
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    var9.setPassword("");
    var9.log("");
    java.lang.String var14 = var9.getTaskName();
    var0.bindToOwner((org.apache.tools.ant.Task)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test486");


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
    var1.setLine(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var5.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test487");


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
    var22.endPrefixMapping("hi!");
    
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

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test488");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var2 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var3 = var0.getNext();
    var0.init();
    var0.init();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var7 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var8 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var9 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test489");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    java.lang.String var2 = var0.getParam("4444444444");
    var0.afterBuild();
    var0.beforeBuild();
    boolean var6 = var0.hasBeenUpdated(1433461955000L);
    var0.afterBuild();
    nu.staldal.lagoon.core.LagoonContext var8 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test490");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var13 = new nu.staldal.ftp.FTPException("hi!");
    var10.log("", (java.lang.Throwable)var13, 10);
    var10.init();
    var10.init();
    java.lang.Object var18 = var10.clone();
    var10.init();
    var0.bindToOwner((org.apache.tools.ant.Task)var10);
    var10.reconfigure();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    var22.bindToOwner((org.apache.tools.ant.Task)var23);
    var22.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var30 = new nu.staldal.ftp.FTPException("hi!");
    var27.log("", (java.lang.Throwable)var30, 10);
    org.apache.tools.ant.Location var33 = var27.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var34 = var27.getRuntimeConfigurableWrapper();
    var27.setForce(false);
    org.apache.tools.ant.Location var37 = var27.getLocation();
    var27.log("nu.staldal.lagoon.util.TemplateException", (-1));
    java.lang.String var41 = var27.getDescription();
    org.apache.tools.ant.Location var42 = var27.getLocation();
    var22.setLocation(var42);
    var22.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var46 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var47 = new nu.staldal.lagoon.LagoonAntTask();
    var46.bindToOwner((org.apache.tools.ant.Task)var47);
    var46.log("");
    java.lang.Object var51 = var46.clone();
    nu.staldal.lagoon.LagoonAntTask var52 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var55 = new nu.staldal.ftp.FTPException("hi!");
    var52.log("", (java.lang.Throwable)var55, 10);
    java.lang.String var58 = var52.getDescription();
    nu.staldal.lagoon.LagoonAntTask var59 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var62 = new nu.staldal.ftp.FTPException("hi!");
    var59.log("", (java.lang.Throwable)var62, 10);
    org.apache.tools.ant.Location var65 = var59.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var66 = var59.getRuntimeConfigurableWrapper();
    var59.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var69 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var72 = new nu.staldal.ftp.FTPException("hi!");
    var69.log("", (java.lang.Throwable)var72, 10);
    org.apache.tools.ant.Project var75 = var69.getProject();
    nu.staldal.lagoon.util.TemplateException var77 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var78 = var77.getException();
    var69.log("", (java.lang.Throwable)var77, (-1));
    var59.bindToOwner((org.apache.tools.ant.Task)var69);
    org.apache.tools.ant.Location var82 = var69.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var83 = var69.getRuntimeConfigurableWrapper();
    var52.setRuntimeConfigurableWrapper(var83);
    org.apache.tools.ant.RuntimeConfigurable var85 = var52.getRuntimeConfigurableWrapper();
    var46.setRuntimeConfigurableWrapper(var85);
    var22.setRuntimeConfigurableWrapper(var85);
    var10.setRuntimeConfigurableWrapper(var85);
    java.lang.String var89 = var10.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test491");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    java.lang.String var8 = var2.getInheritedAttribute("", "4444444444");
    java.lang.String var9 = var2.getTextContentOrNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test492");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    nu.staldal.lagoon.util.TemplateException var2 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);
    java.lang.Exception var3 = var1.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test493");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var8.setDocumentLocator((org.xml.sax.Locator)var16);
    nu.staldal.xtree.NodeWithChildren var18 = var16.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test494");


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
    int var22 = var2.getLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test495");


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
    java.lang.String var23 = var5.getSystemId();
    java.net.URL var24 = var5.getBaseURI();
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi!", "hi!");
    var27.setSystemId("");
    java.net.URL var30 = var27.getBaseURI();
    java.lang.String var33 = var27.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var36 = new nu.staldal.xtree.Element("hi!", "hi!");
    var36.addNamespaceMapping("", "");
    var27.addChild((nu.staldal.xtree.Node)var36);
    java.lang.String var43 = var36.getInheritedAttribute("", "hi!");
    java.lang.String var45 = var36.getAttrValueOrNull("4444444444");
    int var46 = var36.numberOfAttributes();
    int var47 = var36.numberOfNamespaceMappings();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.insertChild((nu.staldal.xtree.Node)var36, 10);
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
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test496");


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
    java.lang.String var73 = var56.getAttrValueOrNull("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.ftp.FTPException: hi!");
    nu.staldal.xtree.Element var74 = var56.getFirstChildElement();
    int var75 = var74.numberOfNamespaceMappings();
    
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
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 1);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test497");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.core.LagoonException var9 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var0.log("4444444444", (java.lang.Throwable)var9, 100);
    org.apache.tools.ant.RuntimeConfigurable var12 = var0.getRuntimeConfigurableWrapper();
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var16 = new nu.staldal.ftp.FTPException("hi!");
    var13.log("", (java.lang.Throwable)var16, 10);
    org.apache.tools.ant.Project var19 = var13.getProject();
    nu.staldal.lagoon.util.TemplateException var21 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var22 = var21.getException();
    var13.log("", (java.lang.Throwable)var21, (-1));
    java.lang.Throwable[] var25 = var21.getSuppressed();
    java.lang.Throwable[] var26 = var21.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var28 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var29 = var28.toString();
    var21.addSuppressed((java.lang.Throwable)var28);
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
    var28.addSuppressed((java.lang.Throwable)var43);
    var0.log((java.lang.Throwable)var28, 10);
    nu.staldal.lagoon.util.TemplateException var50 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var28);
    java.lang.String var51 = var28.toString();
    nu.staldal.lagoon.LagoonAntTask var52 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var55 = new nu.staldal.ftp.FTPException("hi!");
    var52.log("", (java.lang.Throwable)var55, 10);
    org.apache.tools.ant.Location var58 = var52.getLocation();
    nu.staldal.lagoon.core.LagoonException var61 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var52.log("4444444444", (java.lang.Throwable)var61, 100);
    java.lang.String var64 = var61.toString();
    nu.staldal.lagoon.util.TemplateException var65 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var61);
    var28.addSuppressed((java.lang.Throwable)var65);
    nu.staldal.lagoon.util.TemplateException var68 = new nu.staldal.lagoon.util.TemplateException("aa");
    var28.addSuppressed((java.lang.Throwable)var68);
    java.lang.String var70 = var28.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var29.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var44.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var51.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var64.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var70.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test498");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    boolean var1 = var0.needPassword();
    var0.close();
    boolean var3 = var0.isReentrant();
    boolean var4 = var0.isReentrant();
    boolean var5 = var0.needPassword();
    var0.close();
    var0.close();
    var0.deleteFile("                                                                                                    ");
    nu.staldal.lagoon.core.OutputHandler var11 = var0.createFile("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test499");


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
    org.apache.tools.ant.Project var24 = var10.getProject();
    var10.reconfigure();
    var10.init();
    java.lang.String var27 = var10.getTaskType();
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    var28.bindToOwner((org.apache.tools.ant.Task)var29);
    var28.setForce(true);
    var28.setTaskName("");
    org.apache.tools.ant.Target var35 = var28.getOwningTarget();
    var28.log("hi!");
    nu.staldal.lagoon.LagoonAntTask var38 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var41 = new nu.staldal.ftp.FTPException("hi!");
    var38.log("", (java.lang.Throwable)var41, 10);
    org.apache.tools.ant.Location var44 = var38.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var45 = var38.getRuntimeConfigurableWrapper();
    var38.setTaskType("nu.staldal.lagoon.util.TemplateException");
    var38.log("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.LagoonAntTask var50 = new nu.staldal.lagoon.LagoonAntTask();
    var50.setPassword("");
    var50.setForce(false);
    org.apache.tools.ant.Target var55 = var50.getOwningTarget();
    nu.staldal.lagoon.LagoonAntTask var56 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var59 = new nu.staldal.ftp.FTPException("hi!");
    var56.log("", (java.lang.Throwable)var59, 10);
    org.apache.tools.ant.Location var62 = var56.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var63 = var56.getRuntimeConfigurableWrapper();
    var50.setRuntimeConfigurableWrapper(var63);
    var38.setRuntimeConfigurableWrapper(var63);
    var28.setRuntimeConfigurableWrapper(var63);
    var10.bindToOwner((org.apache.tools.ant.Task)var28);
    
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
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test500");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    boolean var1 = var0.needPassword();
    var0.close();
    long var4 = var0.fileLastModified("nu.staldal.lagoon.core.AuthenticationMissingException");
    var0.close();
    nu.staldal.lagoon.core.OutputHandler var7 = var0.createFile("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

}
