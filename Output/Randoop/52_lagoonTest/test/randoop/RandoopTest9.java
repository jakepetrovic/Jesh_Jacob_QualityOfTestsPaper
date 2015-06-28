package randoop;

import junit.framework.*;

public class RandoopTest9 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test1");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException~ ");

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test2");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    int var7 = var0.getPosition();
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var0.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    var0.processingInstruction("__32____32____32____32____32____32____32____32____32____32__", "nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test3");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.hasBeenUpdated(1433461984000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test4");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.endElement("hi!", "                                                                                                    ", "nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.xmlutil.ContentHandlerFixer var16 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    java.lang.String var18 = var0.getParam("nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    nu.staldal.lagoon.core.LagoonContext var19 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test5");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "hi_33_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var5 = var2.getFirstChildElement("4", "nu.staldal.lagoon.core.LagoonException~ ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test6");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    boolean var8 = var0.hasBeenUpdated(1433461930000L);
    var0.afterBuild();
    nu.staldal.lagoon.core.LagoonContext var10 = var0.getContext();
    var0.afterBuild();
    var0.beforeBuild();
    
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

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test7");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var0.skippedEntity("a");
    var0.startDocument();

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test8");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.core.LagoonException: ", 100, 100);
    java.lang.String var5 = var4.getPublicId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var7 = var4.getNamespaceMapping(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test9");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444", "nu.staldal.lagoon.core.LagoonException: aa");

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test10");


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
    org.apache.tools.ant.Target var24 = var0.getOwningTarget();
    nu.staldal.lagoon.LagoonAntTask var25 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    var25.bindToOwner((org.apache.tools.ant.Task)var26);
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var31 = new nu.staldal.ftp.FTPException("hi!");
    var28.log("", (java.lang.Throwable)var31, 10);
    org.apache.tools.ant.Location var34 = var28.getLocation();
    var25.setLocation(var34);
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var39 = new nu.staldal.ftp.FTPException("hi!");
    var36.log("", (java.lang.Throwable)var39, 10);
    org.apache.tools.ant.Location var42 = var36.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var43 = var36.getRuntimeConfigurableWrapper();
    var25.setRuntimeConfigurableWrapper(var43);
    java.lang.Object var45 = var25.clone();
    var0.bindToOwner((org.apache.tools.ant.Task)var25);
    org.apache.tools.ant.RuntimeConfigurable var47 = var25.getRuntimeConfigurableWrapper();
    var25.reconfigure();
    
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
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test11");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    var0.log("");
    java.lang.String var5 = var0.getTaskName();
    var0.setDescription("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test12");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    var9.addNamespaceMapping("", "4444444444");
    java.lang.String var16 = var9.getTextContent();
    var2.insertChild((nu.staldal.xtree.Node)var9, 0);
    int var19 = var9.getColumnNumber();
    java.lang.String var21 = var9.lookupNamespacePrefix("##########");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var23 = var9.getAttributeType(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test13");


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
    java.lang.String var18 = var2.getAttributeType((-1));
    
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
    assertNull(var18);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test14");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("hi!", "hi!");
    var10.setLine(100);
    int var13 = var10.numberOfNamespaceMappings();
    var0.setDocumentLocator((org.xml.sax.Locator)var10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.endPrefixMapping("##########");
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var22 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var22.processingInstruction("nu.staldal.lagoon.util.TemplateException: hi_33_", "                                                                                                    ");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test15");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test16");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTargetURL("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    java.lang.String var7 = var0.getTaskType();
    var0.setTaskType("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test17");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4444444444", "hi_33_", 1);
    java.lang.String var4 = var3.getLocalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi_33_"+ "'", var4.equals("hi_33_"));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test18");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test19");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444", 100, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var6 = var4.removeChild(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test20");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.ftp.FTPException: hi!", "nu.staldal.ftp.FTPException~ hi!", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var6 = var3.getFirstChildElement("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test21");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("4444444444");
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var1.addSuppressed((java.lang.Throwable)var3);
    nu.staldal.lagoon.util.TemplateException var5 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var3);
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "nu.staldal.ftp.FTPException: hi!"+ "'", var6.equals("nu.staldal.ftp.FTPException: hi!"));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test22");


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
    var34.startPrefixMapping("aa", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    nu.staldal.xtree.Element var40 = new nu.staldal.xtree.Element("hi!", "hi!");
    var40.setSystemId("");
    java.net.URL var43 = var40.getBaseURI();
    java.lang.String var46 = var40.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var49 = new nu.staldal.xtree.Element("hi!", "hi!");
    var49.addNamespaceMapping("", "");
    var40.addChild((nu.staldal.xtree.Node)var49);
    java.lang.String var56 = var49.getInheritedAttribute("", "hi!");
    java.lang.String var58 = var49.getAttrValueOrNull("4444444444");
    int var59 = var49.numberOfAttributes();
    int var60 = var49.numberOfChildren();
    var34.setDocumentLocator((org.xml.sax.Locator)var49);
    var34.skippedEntity("hi____33____");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test23");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu.staldal.lagoon.util.TemplateException: aa");

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test24");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    org.apache.tools.ant.Target var7 = var0.getOwningTarget();
    var0.log("hi!");
    java.lang.String var10 = var0.getTaskType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test25");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    int var5 = var2.numberOfNamespaceMappings();
    boolean var6 = var2.getPreserveSpace();
    java.net.URL var7 = var2.getBaseURI();
    int var8 = var2.numberOfAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test26");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.xtree.TreeBuilder var3 = new nu.staldal.xtree.TreeBuilder();
    var3.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var3, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var11 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8, false, true);
    nu.staldal.xtree.Text var13 = new nu.staldal.xtree.Text("4444444444");
    int var14 = var13.getColumnNumber();
    var8.setDocumentLocator((org.xml.sax.Locator)var13);
    var8.startDocument();
    var2.outputStartElement((org.xml.sax.ContentHandler)var8);
    boolean var18 = var2.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var20 = var2.getAttributeLocalName(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test27");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var62 = var46.getNamespaceMapping(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test28");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    var0.beforeBuild();
    java.lang.String var2 = var0.getEntryName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.hasBeenUpdated(1433461942000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test29");


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
    java.lang.String var61 = var52.getLocalName();
    var52.setLine(0);
    java.lang.String var65 = var52.lookupNamespacePrefix("hi_33_");
    
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
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test30");


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
    var28.startDocument();
    nu.staldal.xtree.TreeBuilder var30 = new nu.staldal.xtree.TreeBuilder();
    var30.endPrefixMapping("hi!");
    var30.endDocument();
    var30.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    var30.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.producer.BasicSplit var39 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var41 = new nu.staldal.xtree.Text("hi!");
    char[] var42 = var41.asCharArray();
    var39.characters(var42, 1, 10);
    var39.endElement("", "hi!", "hi!");
    var39.processingInstruction("", "hi!");
    var39.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    char[] var58 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var62 = new nu.staldal.xtree.Text(var58, 1, 0, false);
    var39.characters(var58, 1, (-1));
    nu.staldal.xtree.Text var69 = new nu.staldal.xtree.Text(var58, 0, 0, false);
    var30.ignorableWhitespace(var58, 0, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var28.characters(var58, 10, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test31");


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
    nu.staldal.xtree.Element var64 = new nu.staldal.xtree.Element("hi!", "hi!");
    var64.setLine(100);
    java.lang.String var68 = var64.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var69 = var64.getTextContent();
    java.lang.String var72 = var64.getInheritedAttribute("hi_33_", "hi!");
    var64.addNamespaceMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException~~ ");
    java.lang.String var78 = var64.getInheritedAttribute("          ", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    var22.setDocumentLocator((org.xml.sax.Locator)var64);
    int var82 = var64.lookupAttribute("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    java.lang.String var84 = var64.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:                                                                                                     ");
    
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
    assertTrue("'" + var69 + "' != '" + ""+ "'", var69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test32");


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
    var20.endPrefixMapping(".");
    
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

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test33");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    int var5 = var2.numberOfAttributes();
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("", "hi!", 10);
    var9.setSystemId("hi!");
    java.lang.String var12 = var9.getSystemId();
    var2.addChild((nu.staldal.xtree.Node)var9);
    java.lang.String var15 = var2.lookupNamespaceURI("nu.staldal.lagoon.util.TemplateException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var16 = var2.getTextContent();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test34");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.util.TemplateException~ ");

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test35");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("#");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test36");


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
      boolean var9 = var0.hasBeenUpdated(1433461987000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test37");


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
    var8.endDocument();
    var8.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.Text var24 = new nu.staldal.xtree.Text("");
    char[] var25 = var24.asCharArray();
    boolean var26 = var24.isWhitespaceNode();
    char[] var27 = var24.asCharArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.characters(var27, 10, 2);
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test38");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    var0.endDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var11 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test39");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:                                                                                                     ", "hi_33_", 2, 1);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test40");


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
    var0.setForce(false);
    nu.staldal.ftp.FTPException var30 = new nu.staldal.ftp.FTPException("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    var0.log((java.lang.Throwable)var30, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test41");


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
    var0.maybeConfigure();
    org.apache.tools.ant.Location var32 = var0.getLocation();
    var0.maybeConfigure();
    java.lang.String var34 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test42");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("hi_33_");
    var0.destroy();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.hasBeenUpdated(1433461988000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test43");


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
    var2.addNamespaceMapping("          ", "nu.staldal.lagoon.util.TemplateException");
    int var23 = var2.numberOfNamespaceMappings();
    
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
    assertTrue(var23 == 2);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test44");


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
    var22.startDocument();
    var22.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    nu.staldal.xtree.Text var64 = new nu.staldal.xtree.Text("");
    char[] var65 = var64.asCharArray();
    char[] var66 = var64.asCharArray();
    char[] var67 = var64.asCharArray();
    char[] var68 = var64.asCharArray();
    java.lang.String var69 = var64.getSystemId();
    char[] var70 = var64.asCharArray();
    var22.characters(var70, 0, 0);
    
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
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test45");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("          ", 1, "nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi_33_", "nu.staldal.ftp.FTPException~~~~ hi!");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test46");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var3 = var2.getPublicId();
    java.lang.String var6 = var2.getInheritedAttribute("", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var7 = var2.getValue();
    java.lang.String var8 = var2.getValue();
    boolean var9 = var2.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var7.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var8.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test47");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_", 100, "nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "nu.staldal.ftp.FTPException~~ hi!", "44");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test48");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var2, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var7, false, true);
    var1.toSAX((org.xml.sax.ContentHandler)var10);
    var1.setColumn(2);
    java.lang.String var14 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test49");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    long var8 = var0.fileLastModified("nu.staldal.lagoon.util.TemplateException");
    var0.close();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461988000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test50");


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
    nu.staldal.xtree.TreeBuilder var75 = new nu.staldal.xtree.TreeBuilder();
    var75.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var80 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var81 = var80.getLineNumber();
    var80.setPublicId("");
    int var84 = var80.getLineNumber();
    var75.setDocumentLocator((org.xml.sax.Locator)var80);
    var75.startDocument();
    var75.skippedEntity("                                                                                                    ");
    var37.outputStartElement((org.xml.sax.ContentHandler)var75);
    java.lang.String var92 = var37.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException~~ hi____33____", "nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
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
    assertTrue(var81 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var92);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test51");


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
    var22.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.xmlutil.ContentHandlerFixer var40 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, false, true);
    var22.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
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

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test52");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    boolean var1 = var0.needPassword();
    var0.close();
    boolean var3 = var0.isReentrant();
    boolean var4 = var0.isReentrant();
    boolean var5 = var0.needPassword();
    var0.deleteFile("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.lagoon.core.OutputHandler var9 = var0.createFile("nu.staldal.lagoon.core.LagoonException: ");
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    var0.close();
    boolean var13 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test53");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.close();
    var0.close();
    boolean var7 = var0.isReentrant();
    long var9 = var0.fileLastModified("hi_33_");
    var0.deleteFile("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test54");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var43 = var4.getAttributeNamespaceURI(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test55");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    var0.init();
    var0.init();
    var0.init();
    int var6 = var0.getPosition();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.hasBeenUpdated(1433461984000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test56");


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
    java.lang.String var33 = var2.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: ", "4");
    java.lang.String var35 = var2.lookupNamespaceURI("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    
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
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test57");


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
    java.lang.String var34 = var25.getAttributeValue((-1));
    java.lang.String var37 = var25.getInheritedAttribute("####################################################################################################", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var39 = var25.getAttributeType(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test58");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.endDocument();
    var8.startDocument();
    nu.staldal.xtree.Element var12 = var8.getTree();
    nu.staldal.xtree.Element var15 = new nu.staldal.xtree.Element("hi!", "hi!");
    var15.setSystemId("");
    java.net.URL var18 = var15.getBaseURI();
    java.lang.String var21 = var15.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.addNamespaceMapping("", "");
    var15.addChild((nu.staldal.xtree.Node)var24);
    var24.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var24.setLine(1);
    int var36 = var24.numberOfAttributes();
    var24.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.core.LagoonException~~ ");
    int var40 = var24.getColumnNumber();
    var8.setDocumentLocator((org.xml.sax.Locator)var24);
    var8.endPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test59");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    var2.setSystemId("                                                                                                    ");
    java.lang.String var19 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    java.lang.String var21 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.AuthenticationException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var23 = var2.getAttributeValue(1);
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test60");


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
    var18.startDocument();
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var26 = var25.getLineNumber();
    var25.setPublicId("");
    java.lang.String var31 = var25.getInheritedAttribute("", "4444444444");
    int var32 = var25.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var33 = new nu.staldal.xtree.TreeBuilder();
    var33.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var38 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var33, false, false);
    var25.toSAX((org.xml.sax.ContentHandler)var38);
    nu.staldal.xmlutil.ContentHandlerFixer var41 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var38, true);
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "", 10, 0);
    var38.setDocumentLocator((org.xml.sax.Locator)var46);
    nu.staldal.xmlutil.ContentHandlerAdapter var48 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var38);
    nu.staldal.xtree.Text var50 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var50.setLine(1);
    char[] var53 = var50.asCharArray();
    var48.ignorableWhitespace(var53, 10, 0);
    var18.ignorableWhitespace(var53, (-1), (-1));
    nu.staldal.xmlutil.DocumentHandlerAdapter var60 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    var60.startDocument();
    var60.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test61");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.util.TemplateException", 0);
    nu.staldal.xtree.NodeWithChildren var4 = var3.getParent();
    boolean var5 = var3.getPreserveSpace();
    java.lang.String var6 = var3.getTextContent();
    nu.staldal.xtree.NodeWithChildren var7 = var3.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test62");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:                                                                                                     ", 1, "aa", "nu.staldal.lagoon.core.LagoonException~ hi__33__", "nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test63");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    nu.staldal.lagoon.core.ByteStreamProducer var1 = var0.getNext();
    var0.init();
    var0.init();
    var0.init();
    var0.beforeBuild();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test64");


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

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test65");


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
    boolean var26 = var4.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var28 = var4.getChild(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertTrue(var26 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test66");


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
    var18.processingInstruction("", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var32 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    var18.processingInstruction("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________", "nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test67");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("                                                                                                    ");
    nu.staldal.lagoon.util.TemplateException var2 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);
    nu.staldal.lagoon.util.TemplateException var3 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test68");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    boolean var7 = var0.needPassword();
    long var9 = var0.fileLastModified("hi_33_");
    nu.staldal.lagoon.core.OutputHandler var11 = var0.createFile("hi_33_");
    nu.staldal.lagoon.core.OutputHandler var13 = var0.createFile("4444444444");
    boolean var14 = var0.needPassword();
    boolean var15 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461988000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test69");


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
    var60.startPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "#");
    
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

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test70");


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
    java.lang.String var31 = var11.getLocalName();
    nu.staldal.xtree.Text var33 = new nu.staldal.xtree.Text("");
    char[] var34 = var33.asCharArray();
    char[] var35 = var33.asCharArray();
    nu.staldal.lagoon.producer.BasicSplit var36 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var38 = new nu.staldal.xtree.Text("hi!");
    char[] var39 = var38.asCharArray();
    var36.characters(var39, 1, 10);
    var36.endElement("", "hi!", "hi!");
    var36.processingInstruction("", "hi!");
    var36.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var36.startDocument();
    var36.skippedEntity("4444444444");
    var36.skippedEntity("hi!");
    var33.toSAX((org.xml.sax.ContentHandler)var36);
    boolean var59 = var33.isWhitespaceNode();
    int var60 = var33.getLineNumber();
    boolean var61 = var33.isWhitespaceNode();
    java.lang.String var62 = var33.getPublicId();
    nu.staldal.xtree.Element var65 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var66 = var65.getLineNumber();
    var65.setPublicId("");
    java.lang.String var71 = var65.getInheritedAttribute("", "4444444444");
    int var72 = var65.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var73 = new nu.staldal.xtree.TreeBuilder();
    var73.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var78 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var73, false, false);
    var65.toSAX((org.xml.sax.ContentHandler)var78);
    var78.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var78.startDocument();
    var33.toSAX((org.xml.sax.ContentHandler)var78);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.toSAX((org.xml.sax.ContentHandler)var78);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
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
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test71");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    java.lang.String var7 = var0.getParam("4444444444");
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var15 = var0.hasBeenUpdated(0L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test72");


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
    var4.startDocument();
    nu.staldal.xtree.Text var34 = new nu.staldal.xtree.Text("##");
    var4.setDocumentLocator((org.xml.sax.Locator)var34);
    nu.staldal.xtree.Element var38 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var39 = var38.getLineNumber();
    var38.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var46 = var45.getLineNumber();
    var45.addNamespaceMapping("", "");
    var38.addChild((nu.staldal.xtree.Node)var45);
    nu.staldal.xtree.NodeWithChildren var51 = var38.getParent();
    nu.staldal.xtree.Element var54 = var38.getFirstChildElementOrNull("hi!", "4444444444");
    int var55 = var38.numberOfNamespaceMappings();
    int var56 = var38.numberOfNamespaceMappings();
    nu.staldal.xtree.Element var57 = var38.getFirstChildElementOrNull();
    int var58 = var57.numberOfNamespaceMappings();
    var4.setDocumentLocator((org.xml.sax.Locator)var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test73");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("####################################################################################################");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_"+ "'", var1.equals("_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_"));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test74");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var2 = var1.toString();
    nu.staldal.lagoon.util.TemplateException var3 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: "+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: "));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test75");


    nu.staldal.lagoon.filestorage.SSHFileStorage var0 = new nu.staldal.lagoon.filestorage.SSHFileStorage();
    boolean var1 = var0.isReentrant();
    boolean var2 = var0.isReentrant();
    boolean var3 = var0.isReentrant();
    boolean var4 = var0.needPassword();
    boolean var5 = var0.isReentrant();
    boolean var6 = var0.needPassword();
    boolean var7 = var0.needPassword();
    boolean var8 = var0.isReentrant();
    boolean var9 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test76");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test77");


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
    java.lang.String var22 = var19.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var23 = var19.getPublicId();
    
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
    assertNull(var23);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test78");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("_52_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "__52__"+ "'", var1.equals("__52__"));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test79");


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
    nu.staldal.xmlutil.DocumentHandlerAdapter var79 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var53);
    
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

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test80");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ "+ "'", var1.equals("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ "));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test81");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    java.lang.String var7 = var0.getEntryName();
    boolean var9 = var0.hasBeenUpdated(10L);
    boolean var11 = var0.hasBeenUpdated(1433461928000L);
    java.util.Enumeration var12 = var0.getParamNames();
    boolean var14 = var0.hasBeenUpdated((-1L));
    var0.afterBuild();
    var0.afterBuild();
    java.lang.String var17 = var0.getEntryName();
    java.util.Enumeration var18 = var0.getParamNames();
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
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test82");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    var0.startPrefixMapping("4444444444", "                                                                                                    ");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    nu.staldal.lagoon.producer.BasicSplit var15 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var17 = new nu.staldal.xtree.Text("hi!");
    char[] var18 = var17.asCharArray();
    var15.characters(var18, 1, 10);
    var15.endElement("", "hi!", "hi!");
    var15.processingInstruction("", "hi!");
    var15.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var15.startDocument();
    var15.skippedEntity("4444444444");
    java.util.Enumeration var35 = var15.getParamNames();
    int var36 = var15.getPosition();
    var15.startDocument();
    var15.endElement("nu.staldal.lagoon.util.TemplateException", "                                                                                                    ", "                                                                                                    ");
    char[] var44 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var48 = new nu.staldal.xtree.Text(var44, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var49 = new nu.staldal.xtree.TreeBuilder();
    var49.endPrefixMapping("hi!");
    var49.endDocument();
    var49.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var48.toSAX((org.xml.sax.ContentHandler)var49);
    var49.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    char[] var62 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var66 = new nu.staldal.xtree.Text(var62, 1, 0, false);
    char[] var67 = var66.asCharArray();
    var49.ignorableWhitespace(var67, 10, 10);
    var15.ignorableWhitespace(var67, 0, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.characters(var67, 1, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test83");


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
    int var21 = var2.getColumnNumber();
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
    var2.outputStartElement((org.xml.sax.ContentHandler)var22);
    var22.beforeBuild();
    
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
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test84");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4", "nu.staldal.lagoon.core.LagoonException~~ ", 10);
    java.lang.String var4 = var3.getPublicId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test85");


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
    java.lang.String var77 = var37.lookupNamespacePrefix("hi_33_");
    java.lang.String var79 = var37.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var81 = var37.getAttributeValue(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test86");


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
    java.net.URL var32 = var23.getBaseURI();
    java.lang.String var34 = var23.getAttributeType((-1));
    
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
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test87");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var2, false, true);
    var2.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var10 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var2);
    var2.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    nu.staldal.xtree.Element var17 = new nu.staldal.xtree.Element("", "4444444444", 100);
    int var18 = var17.numberOfChildren();
    int var19 = var17.numberOfAttributes();
    var2.setDocumentLocator((org.xml.sax.Locator)var17);
    var2.endPrefixMapping("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test88");


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
    java.lang.String var20 = var4.getNamespaceURI();
    
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
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test89");


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
    var0.processingInstruction("hi!", "hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var32 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.ContentHandlerFixer var33 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var32);
    var32.startPrefixMapping("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "nu.staldal.ftp.FTPException~ hi!");
    nu.staldal.xtree.ProcessingInstruction var39 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    var39.setPublicId("");
    boolean var42 = var39.getPreserveSpace();
    var32.setDocumentLocator((org.xml.sax.Locator)var39);
    var32.skippedEntity("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test90");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    var0.beforeBuild();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated(1433461972000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test91");


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
    var0.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.setLine(100);
    int var27 = var24.numberOfNamespaceMappings();
    java.net.URL var28 = var24.getBaseURI();
    var0.setDocumentLocator((org.xml.sax.Locator)var24);
    var0.startDocument();
    nu.staldal.xtree.Element var33 = new nu.staldal.xtree.Element("", "hi_33_");
    java.lang.String var34 = var33.getTextContentOrNull();
    int var35 = var33.getColumnNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var38 = var33.getAttributeNamespaceURI(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + ""+ "'", var34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test92");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    boolean var2 = var0.hasBeenUpdated(1L);
    var0.afterBuild();
    var0.afterBuild();
    var0.afterBuild();
    var0.afterBuild();
    var0.afterBuild();
    var0.afterBuild();
    java.lang.String var10 = var0.getParam("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test93");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var2.equals("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test94");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    var2.setPublicId("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var5 = var2.getFirstChildElement();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test95");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
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
    var33.startDocument();
    var33.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.producer.IslandSplit var47 = new nu.staldal.lagoon.producer.IslandSplit();
    var47.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var50 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var47, true);
    char[] var53 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var57 = new nu.staldal.xtree.Text(var53, 1, 0, false);
    var50.setDocumentLocator((org.xml.sax.Locator)var57);
    java.lang.String var60 = var57.lookupNamespacePrefix("                                                                                                    ");
    var33.setDocumentLocator((org.xml.sax.Locator)var57);
    var33.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.producer.BasicSplit var65 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var67 = new nu.staldal.xtree.Text("hi!");
    char[] var68 = var67.asCharArray();
    var65.characters(var68, 1, 10);
    var65.endElement("", "hi!", "hi!");
    var65.processingInstruction("", "hi!");
    var65.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var65.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var83 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var65);
    var83.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var85 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var83);
    nu.staldal.xtree.Text var87 = new nu.staldal.xtree.Text("hi!");
    char[] var88 = var87.asCharArray();
    var85.ignorableWhitespace(var88, (-1), 100);
    var33.characters(var88, 2, 2);
    var0.characters(var88, 10, 100);
    var0.beforeBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test96");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("");
    java.lang.String var2 = var1.toString();
    java.lang.Throwable[] var3 = var1.getSuppressed();
    java.lang.Exception var4 = var1.getException();
    java.lang.String var5 = var1.toString();
    nu.staldal.lagoon.util.TemplateException var6 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.util.TemplateException: "+ "'", var2.equals("nu.staldal.lagoon.util.TemplateException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "nu.staldal.lagoon.util.TemplateException: "+ "'", var5.equals("nu.staldal.lagoon.util.TemplateException: "));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test97");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", 2);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test98");


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
    boolean var50 = var42.isWhitespaceNode();
    var42.setColumn((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var54 = var42.getAttributeType(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertTrue(var50 == false);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test99");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.lagoon.producer.IslandSplit var15 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var16 = var15.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var17 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var15);
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var21 = var20.getLineNumber();
    var20.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var28 = var27.getLineNumber();
    var27.addNamespaceMapping("", "");
    var20.addChild((nu.staldal.xtree.Node)var27);
    nu.staldal.xtree.NodeWithChildren var33 = var20.getParent();
    boolean var34 = var20.getPreserveSpace();
    var17.setDocumentLocator((org.xml.sax.Locator)var20);
    java.lang.String var37 = var20.lookupNamespaceURI("");
    java.lang.String var38 = var20.getSystemId();
    java.net.URL var39 = var20.getBaseURI();
    var9.addChild((nu.staldal.xtree.Node)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var42 = var9.getAttributeValue(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test100");


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
    java.net.URL var20 = var2.getBaseURI();
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    var25.setColumn(0);
    java.lang.String var28 = var25.getTextContentOrNull();
    java.net.URL var29 = var25.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var31 = var2.replaceChild((nu.staldal.xtree.Node)var25, (-1));
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
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test101");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: hi_33_", "nu.staldal.lagoon.core.LagoonException~ ", 100, 10);
    var4.addAttribute("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_", "nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444", "nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test102");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var3 = var2.getPreserveSpace();
    java.lang.String var6 = var2.getInheritedAttribute("nu.staldal.ftp.FTPException: hi!", "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var2.getAttributeValue(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test103");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_"+ "'", var2.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_"));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test104");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    var0.beforeBuild();
    java.lang.String var2 = var0.getEntryName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.hasBeenUpdated(1433461967000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test105");


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
    nu.staldal.xtree.Element var55 = new nu.staldal.xtree.Element("hi!", "hi!");
    var55.setSystemId("");
    java.net.URL var58 = var55.getBaseURI();
    java.lang.String var61 = var55.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var64 = new nu.staldal.xtree.Element("hi!", "hi!");
    var64.addNamespaceMapping("", "");
    var55.addChild((nu.staldal.xtree.Node)var64);
    int var69 = var64.getColumnNumber();
    java.lang.String var71 = var64.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    int var74 = var64.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "hi_33_");
    var52.setDocumentLocator((org.xml.sax.Locator)var64);
    boolean var76 = var64.getPreserveSpace();
    var64.setColumn((-1));
    
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
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test106");


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
    var8.endDocument();
    var8.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var8.startDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.processingInstruction("44", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
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

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test107");


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
    var0.setTaskType("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    var0.setPassword("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    
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

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test108");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var8 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var8.endDocument();
    nu.staldal.lagoon.producer.BasicSplit var10 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("hi!");
    char[] var13 = var12.asCharArray();
    var10.characters(var13, 1, 10);
    var8.ignorableWhitespace(var13, 0, 1);
    var8.startDocument();
    nu.staldal.xtree.Element var23 = new nu.staldal.xtree.Element("hi!", "hi!");
    var23.setSystemId("");
    java.net.URL var26 = var23.getBaseURI();
    java.lang.String var29 = var23.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi!", "hi!");
    var32.addNamespaceMapping("", "");
    var23.addChild((nu.staldal.xtree.Node)var32);
    int var37 = var32.getColumnNumber();
    java.lang.String var39 = var32.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var8.setDocumentLocator((org.xml.sax.Locator)var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var42 = var32.getAttributeType(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test109");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    java.lang.String var10 = var2.getSystemId();
    var2.addNamespaceMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "hi!");
    java.lang.String var15 = var2.getAttributeLocalName((-1));
    char[] var18 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var22 = new nu.staldal.xtree.Text(var18, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var23 = new nu.staldal.xtree.TreeBuilder();
    var23.endPrefixMapping("hi!");
    var23.endDocument();
    var23.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var22.toSAX((org.xml.sax.ContentHandler)var23);
    var23.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var23.skippedEntity("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var2.outputStartElement((org.xml.sax.ContentHandler)var23);
    nu.staldal.xtree.TreeBuilder var37 = new nu.staldal.xtree.TreeBuilder();
    var37.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var42 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var37, false, false);
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var42.setDocumentLocator((org.xml.sax.Locator)var45);
    var42.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var52 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var42, true, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.outputEndElement((org.xml.sax.ContentHandler)var52);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var18);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test110");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    java.lang.String var8 = var2.getInheritedAttribute("", "4444444444");
    int var9 = var2.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var10 = new nu.staldal.xtree.TreeBuilder();
    var10.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var15 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var10, false, false);
    var2.toSAX((org.xml.sax.ContentHandler)var15);
    nu.staldal.lagoon.producer.BasicSplit var17 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var19 = new nu.staldal.xtree.Text("hi!");
    char[] var20 = var19.asCharArray();
    var17.characters(var20, 1, 10);
    var17.endElement("", "hi!", "hi!");
    var17.processingInstruction("", "hi!");
    var17.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var17.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var35 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var17);
    var35.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.Text var40 = new nu.staldal.xtree.Text("");
    char[] var41 = var40.asCharArray();
    boolean var42 = var40.isWhitespaceNode();
    char[] var43 = var40.asCharArray();
    var35.setDocumentLocator((org.xml.sax.Locator)var40);
    int var45 = var40.getColumnNumber();
    char[] var46 = var40.asCharArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.characters(var46, 1, 0);
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test111");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    var0.setTaskName("                                                                                                    ");
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var12 = new nu.staldal.ftp.FTPException("hi!");
    var9.log("", (java.lang.Throwable)var12, 10);
    org.apache.tools.ant.Location var15 = var9.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var16 = var9.getRuntimeConfigurableWrapper();
    var9.setTargetURL("4444444444");
    java.lang.String var19 = var9.getTaskName();
    var0.bindToOwner((org.apache.tools.ant.Task)var9);
    var0.setTaskName("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var26 = new nu.staldal.ftp.FTPException("hi!");
    var23.log("", (java.lang.Throwable)var26, 10);
    var23.init();
    var23.init();
    java.lang.String var31 = var23.getDescription();
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var35 = new nu.staldal.ftp.FTPException("hi!");
    var32.log("", (java.lang.Throwable)var35, 10);
    org.apache.tools.ant.Project var38 = var32.getProject();
    var23.bindToOwner((org.apache.tools.ant.Task)var32);
    var32.setTaskType("nu.staldal.lagoon.core.LagoonException: ");
    var32.log("hi!");
    var32.init();
    org.apache.tools.ant.Project var45 = var32.getProject();
    var32.setTaskType("nu.staldal.lagoon.util.TemplateException");
    org.apache.tools.ant.Location var48 = var32.getLocation();
    var0.setLocation(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test112");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    var2.addAttribute("", "hi!", "", "hi!");
    java.lang.String var12 = var2.getInheritedAttribute("hi!", "4444444444");
    java.lang.String var14 = var2.lookupNamespaceURI("");
    var2.setColumn(0);
    nu.staldal.lagoon.producer.BasicSplit var17 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var19 = new nu.staldal.xtree.Text("hi!");
    char[] var20 = var19.asCharArray();
    var17.characters(var20, 1, 10);
    var17.endElement("", "hi!", "hi!");
    var17.processingInstruction("", "hi!");
    var17.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var17.startDocument();
    var17.skippedEntity("4444444444");
    java.util.Enumeration var37 = var17.getParamNames();
    nu.staldal.xtree.Element var40 = new nu.staldal.xtree.Element("hi!", "hi!");
    var40.setSystemId("");
    java.net.URL var43 = var40.getBaseURI();
    java.lang.String var46 = var40.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var49 = new nu.staldal.xtree.Element("hi!", "hi!");
    var49.addNamespaceMapping("", "");
    var40.addChild((nu.staldal.xtree.Node)var49);
    int var54 = var49.getColumnNumber();
    java.lang.String var56 = var49.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var49.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var17.setDocumentLocator((org.xml.sax.Locator)var49);
    java.lang.String var63 = var49.getSystemId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertChild((nu.staldal.xtree.Node)var49, 10);
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
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test113");


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
    var27.startPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", "nu.staldal.lagoon.core.AuthenticationMissingException");
    var27.startDocument();
    
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

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test114");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    var2.setColumn((-1));
    java.net.URL var12 = var2.getBaseURI();
    int var13 = var2.numberOfNamespaceMappings();
    var2.setSystemId("4444444444");
    nu.staldal.lagoon.producer.BasicSplit var16 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var18 = new nu.staldal.xtree.Text("hi!");
    char[] var19 = var18.asCharArray();
    var16.characters(var19, 1, 10);
    var16.endElement("", "hi!", "hi!");
    var16.processingInstruction("", "hi!");
    var16.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var16.startDocument();
    var16.skippedEntity("4444444444");
    var2.outputStartElement((org.xml.sax.ContentHandler)var16);
    java.lang.String var39 = var2.getInheritedAttribute("          ", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test115");


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
    var0.processingInstruction("hi!", "hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var32 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.ContentHandlerFixer var33 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var32);
    var33.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.xtree.Text var37 = new nu.staldal.xtree.Text("");
    nu.staldal.lagoon.producer.BasicSplit var38 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var40 = new nu.staldal.xtree.Text("hi!");
    char[] var41 = var40.asCharArray();
    var38.characters(var41, 1, 10);
    var38.endElement("", "hi!", "hi!");
    var38.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var52 = new nu.staldal.xtree.Text("");
    char[] var53 = var52.asCharArray();
    char[] var54 = var52.asCharArray();
    char[] var55 = var52.asCharArray();
    var38.characters(var55, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var59 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var38);
    nu.staldal.xmlutil.DocumentHandlerAdapter var60 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var59);
    nu.staldal.xtree.Element var63 = new nu.staldal.xtree.Element("hi!", "hi!");
    var63.setSystemId("");
    java.net.URL var66 = var63.getBaseURI();
    java.lang.String var69 = var63.getAttrValueOrNull("", "");
    var60.setDocumentLocator((org.xml.sax.Locator)var63);
    var60.startDocument();
    char[] var72 = new char[] { };
    var60.characters(var72, 100, (-1));
    var60.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var77 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var60);
    var60.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var37.toSAX((org.xml.sax.ContentHandler)var60);
    char[] var81 = var37.asCharArray();
    var33.characters(var81, 10, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var88 = new nu.staldal.xtree.Text(var81, 2, 10, false);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test116");


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
    boolean var39 = var32.getPreserveSpace();
    
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
    assertTrue(var39 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test117");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test118");


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
    java.lang.String var60 = var1.getValue();
    var1.setSystemId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    java.lang.String var65 = var1.getInheritedAttribute("_52_", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test119");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    java.lang.String var3 = var2.getPublicId();
    boolean var4 = var2.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test120");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8);
    var14.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var14.endPrefixMapping("hi!");
    var14.skippedEntity("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    nu.staldal.xtree.ProcessingInstruction var23 = new nu.staldal.xtree.ProcessingInstruction("", "hi!");
    java.lang.String var24 = var23.getValue();
    java.lang.String var25 = var23.getValue();
    java.lang.String var27 = var23.lookupNamespacePrefix("");
    var14.setDocumentLocator((org.xml.sax.Locator)var23);
    java.lang.String var29 = var23.getTarget();
    java.lang.String var30 = var23.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test121");


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
    var20.endElement("", "hi!", "hi!");
    var20.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var34 = new nu.staldal.xtree.Text("");
    char[] var35 = var34.asCharArray();
    char[] var36 = var34.asCharArray();
    char[] var37 = var34.asCharArray();
    var20.characters(var37, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var41 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var20);
    nu.staldal.xmlutil.DocumentHandlerAdapter var42 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var41);
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "hi!");
    var45.setSystemId("");
    java.net.URL var48 = var45.getBaseURI();
    java.lang.String var51 = var45.getAttrValueOrNull("", "");
    var42.setDocumentLocator((org.xml.sax.Locator)var45);
    nu.staldal.xtree.Text var54 = new nu.staldal.xtree.Text("");
    char[] var55 = var54.asCharArray();
    char[] var56 = var54.asCharArray();
    var42.characters(var56, 100, 100);
    nu.staldal.xtree.Element var62 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var63 = var62.getLineNumber();
    var62.setPublicId("");
    int var66 = var62.getLineNumber();
    java.lang.String var68 = var62.lookupNamespacePrefix("hi_33_");
    var42.setDocumentLocator((org.xml.sax.Locator)var62);
    nu.staldal.xmlutil.ContentHandlerFixer var72 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var42, false, false);
    nu.staldal.xtree.Text var74 = new nu.staldal.xtree.Text("");
    char[] var75 = var74.asCharArray();
    var42.ignorableWhitespace(var75, 10, 1);
    var8.ignorableWhitespace(var75, 100, 1);
    nu.staldal.xtree.Element var84 = new nu.staldal.xtree.Element("hi!", "hi!");
    var84.setLine(100);
    java.lang.String var89 = var84.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: ");
    int var90 = var84.getLineNumber();
    var8.setDocumentLocator((org.xml.sax.Locator)var84);
    nu.staldal.xtree.Element var92 = var8.getTree();
    var92.setLine(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test122");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var10 = var4.lookupNamespaceURI("4444444444");
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("4444444444");
    nu.staldal.lagoon.producer.BasicSplit var13 = new nu.staldal.lagoon.producer.BasicSplit();
    var12.toSAX((org.xml.sax.ContentHandler)var13);
    var4.outputEndElement((org.xml.sax.ContentHandler)var13);
    var13.startDocument();
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var20 = var19.getLineNumber();
    var19.setSystemId("hi!");
    nu.staldal.lagoon.producer.BasicSplit var23 = new nu.staldal.lagoon.producer.BasicSplit();
    var19.toSAX((org.xml.sax.ContentHandler)var23);
    nu.staldal.xtree.Element var29 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var32 = var29.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var33 = new nu.staldal.xtree.TreeBuilder();
    var29.toSAX((org.xml.sax.ContentHandler)var33);
    var33.skippedEntity("hi!");
    var33.skippedEntity("hi!");
    nu.staldal.xtree.Element var41 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var33.setDocumentLocator((org.xml.sax.Locator)var41);
    var33.startDocument();
    nu.staldal.xtree.Element var44 = var33.getTree();
    var33.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~ ");
    var33.skippedEntity("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    char[] var52 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var56 = new nu.staldal.xtree.Text(var52, 1, 0, false);
    char[] var57 = var56.asCharArray();
    char[] var58 = var56.asCharArray();
    var33.ignorableWhitespace(var58, 1, (-1));
    var23.ignorableWhitespace(var58, 100, 1);
    var13.ignorableWhitespace(var58, 100, (-1));
    var13.beforeBuild();
    var13.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test123");


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
    java.lang.String var58 = var20.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!");
    java.lang.String var59 = var20.getTextContentOrNull();
    java.lang.String var60 = var20.getNamespaceURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var63 = var20.getAttrValue("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.core.LagoonException: aa");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
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
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test124");


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
    var23.startPrefixMapping("hi!", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    var23.endPrefixMapping("nu.staldal.lagoon.util.TemplateException~ ");
    var23.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test125");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    boolean var1 = var0.needPassword();
    var0.close();
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test126");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    boolean var7 = var2.getPreserveSpace();
    java.lang.String var10 = var2.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var12 = var2.lookupNamespaceURI("4");
    java.lang.String var13 = var2.getTextContentOrNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test127");


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
    var0.beforeBuild();
    nu.staldal.xtree.ProcessingInstruction var88 = new nu.staldal.xtree.ProcessingInstruction("4", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var88);
    var0.afterBuild();
    var0.startDocument();
    
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

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test128");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("", "nu.staldal.lagoon.util.TemplateException", 0, 100);
    java.lang.String var6 = var4.getAttrValueOrNull("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test129");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    boolean var1 = var0.needPassword();
    var0.close();
    long var4 = var0.fileLastModified("nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461972000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test130");


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
    nu.staldal.xtree.Text var37 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var39 = var37.lookupNamespaceURI("");
    char[] var40 = var37.asCharArray();
    var7.ignorableWhitespace(var40, 1, 2);
    var7.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test131");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    var5.endPrefixMapping("4444444444");
    var5.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var13 = var12.getLineNumber();
    var12.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var20 = var19.getLineNumber();
    var19.addNamespaceMapping("", "");
    var12.addChild((nu.staldal.xtree.Node)var19);
    nu.staldal.xtree.NodeWithChildren var25 = var12.getParent();
    nu.staldal.xtree.Element var28 = var12.getFirstChildElementOrNull("hi!", "4444444444");
    int var29 = var12.numberOfNamespaceMappings();
    var5.setDocumentLocator((org.xml.sax.Locator)var12);
    nu.staldal.xtree.Element var31 = var12.getFirstChildElement();
    java.lang.String var34 = var12.getInheritedAttribute("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var37 = var12.getFirstChildElement("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test132");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    boolean var16 = var2.getPreserveSpace();
    java.lang.String var17 = var2.getNamespaceURI();
    var2.addNamespaceMapping("aa", "nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var21 = var2.getTextContent();
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
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test133");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    java.lang.String var2 = var0.getDescription();
    var0.reconfigure();
    var0.setForce(false);
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
    org.apache.tools.ant.RuntimeConfigurable var30 = var16.getRuntimeConfigurableWrapper();
    var16.setForce(true);
    var16.maybeConfigure();
    java.lang.String var34 = var16.getTaskType();
    org.apache.tools.ant.RuntimeConfigurable var35 = var16.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var35);
    var0.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
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
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test134");


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
    int var55 = var20.numberOfChildren();
    int var56 = var20.numberOfChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var57 = var20.getTextContent();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
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
    assertTrue("'" + var54 + "' != '" + "hi!"+ "'", var54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test135");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.afterBuild();
    var0.init();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    var0.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.init();
    var0.init();

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test136");


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
    var9.init();
    org.apache.tools.ant.Target var23 = var9.getOwningTarget();
    var9.log("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test137");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "                                                                                                    ");
    nu.staldal.xtree.NodeWithChildren var3 = var2.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test138");


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
    java.lang.String var73 = var56.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
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
    assertNull(var73);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test139");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    int var1 = var0.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test140");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.core.AuthenticationException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.core.AuthenticationException"+ "'", var1.equals("nu.staldal.lagoon.core.AuthenticationException"));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test141");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("hi_33_", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var3 = var2.getTarget();
    java.lang.String var4 = var2.getTarget();
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var6 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi_33_"+ "'", var3.equals("hi_33_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi_33_"+ "'", var4.equals("hi_33_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var6.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test142");


    char[] var2 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text(var2, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var7 = new nu.staldal.xtree.TreeBuilder();
    var7.endPrefixMapping("hi!");
    var7.endDocument();
    var7.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var6.toSAX((org.xml.sax.ContentHandler)var7);
    boolean var15 = var6.isWhitespaceNode();
    java.lang.String var17 = var6.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: hi_33_");
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
    nu.staldal.xtree.Text var52 = new nu.staldal.xtree.Text("");
    char[] var53 = var52.asCharArray();
    char[] var54 = var52.asCharArray();
    var40.characters(var54, 100, 100);
    nu.staldal.xtree.Element var60 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var61 = var60.getLineNumber();
    var60.setPublicId("");
    int var64 = var60.getLineNumber();
    java.lang.String var66 = var60.lookupNamespacePrefix("hi_33_");
    var40.setDocumentLocator((org.xml.sax.Locator)var60);
    nu.staldal.xmlutil.ContentHandlerFixer var70 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var40, false, false);
    nu.staldal.xtree.Element var73 = new nu.staldal.xtree.Element("hi!", "hi!");
    var73.setSystemId("");
    java.net.URL var76 = var73.getBaseURI();
    java.lang.String var79 = var73.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var82 = new nu.staldal.xtree.Element("hi!", "hi!");
    var82.addNamespaceMapping("", "");
    var73.addChild((nu.staldal.xtree.Node)var82);
    int var87 = var82.getColumnNumber();
    java.lang.String var89 = var82.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    int var92 = var82.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "hi_33_");
    var70.setDocumentLocator((org.xml.sax.Locator)var82);
    var70.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    var6.toSAX((org.xml.sax.ContentHandler)var70);
    java.lang.String var98 = var6.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    java.lang.String var99 = var6.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
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
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var99 + "' != '" + ""+ "'", var99.equals(""));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test143");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    java.lang.String var2 = var0.getDescription();
    java.lang.String var3 = var0.getDescription();
    org.apache.tools.ant.RuntimeConfigurable var4 = var0.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Project var5 = var0.getProject();
    nu.staldal.lagoon.LagoonAntTask var6 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    var6.bindToOwner((org.apache.tools.ant.Task)var7);
    var6.setForce(true);
    java.lang.String var11 = var6.getTaskName();
    var6.setTaskType("4444444444");
    var6.maybeConfigure();
    var6.setTargetURL("");
    var6.maybeConfigure();
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var21 = new nu.staldal.ftp.FTPException("hi!");
    var18.log("", (java.lang.Throwable)var21, 10);
    org.apache.tools.ant.Location var24 = var18.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var25 = var18.getRuntimeConfigurableWrapper();
    var18.setForce(false);
    org.apache.tools.ant.Location var28 = var18.getLocation();
    var6.setLocation(var28);
    var0.setLocation(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test144");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.setTargetURL("4444444444");
    var0.maybeConfigure();
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var13 = new nu.staldal.ftp.FTPException("hi!");
    var10.log("", (java.lang.Throwable)var13, 10);
    org.apache.tools.ant.Project var16 = var10.getProject();
    nu.staldal.lagoon.util.TemplateException var18 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var19 = var18.getException();
    var10.log("", (java.lang.Throwable)var18, (-1));
    var10.log("");
    var10.log("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var10.setTargetURL("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    var28.bindToOwner((org.apache.tools.ant.Task)var29);
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var35 = new nu.staldal.ftp.FTPException("hi!");
    var32.log("", (java.lang.Throwable)var35, 10);
    org.apache.tools.ant.Location var38 = var32.getLocation();
    nu.staldal.lagoon.core.LagoonException var41 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var32.log("4444444444", (java.lang.Throwable)var41, 100);
    java.lang.String var44 = var41.toString();
    nu.staldal.lagoon.LagoonAntTask var45 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var48 = new nu.staldal.ftp.FTPException("hi!");
    var45.log("", (java.lang.Throwable)var48, 10);
    org.apache.tools.ant.Project var51 = var45.getProject();
    nu.staldal.lagoon.util.TemplateException var53 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var54 = var53.getException();
    var45.log("", (java.lang.Throwable)var53, (-1));
    java.lang.Throwable[] var57 = var53.getSuppressed();
    java.lang.Throwable[] var58 = var53.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var60 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var61 = var60.toString();
    var53.addSuppressed((java.lang.Throwable)var60);
    var41.addSuppressed((java.lang.Throwable)var60);
    var28.log("4444444444", (java.lang.Throwable)var60, (-1));
    java.lang.String var66 = var60.toString();
    nu.staldal.lagoon.util.TemplateException var67 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var60);
    java.lang.Exception var68 = var60.getException();
    nu.staldal.lagoon.util.TemplateException var69 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var60);
    java.lang.Exception var70 = var69.getException();
    nu.staldal.lagoon.util.TemplateException var71 = new nu.staldal.lagoon.util.TemplateException(var70);
    var10.log((java.lang.Throwable)var70, 0);
    var0.log("nu.staldal.lagoon.util.TemplateException: ", (java.lang.Throwable)var70, 100);
    nu.staldal.lagoon.util.TemplateException var76 = new nu.staldal.lagoon.util.TemplateException(var70);
    nu.staldal.lagoon.util.TemplateException var78 = new nu.staldal.lagoon.util.TemplateException("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");
    var76.addSuppressed((java.lang.Throwable)var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var44.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var61.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var66.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test145");


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
    nu.staldal.lagoon.producer.IslandSplit var22 = new nu.staldal.lagoon.producer.IslandSplit();
    var22.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var25 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, true);
    char[] var28 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var32 = new nu.staldal.xtree.Text(var28, 1, 0, false);
    var25.setDocumentLocator((org.xml.sax.Locator)var32);
    var21.setDocumentLocator((org.xml.sax.Locator)var32);
    java.net.URL var35 = var32.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test146");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444", "_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 100, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var4.getAttributeNamespaceURI(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test147");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.net.URL var6 = var3.getBaseURI();
    java.lang.String var8 = var3.getAttributeNamespaceURI((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test148");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.afterBuild();
    var0.afterBuild();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated(1433461932000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test149");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    java.lang.String var7 = var0.getEntryName();
    var0.afterBuild();
    boolean var10 = var0.hasBeenUpdated(10L);
    java.lang.String var12 = var0.getParam("##");
    var0.afterBuild();
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
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test150");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var10 = var4.lookupNamespaceURI("4444444444");
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("4444444444");
    nu.staldal.lagoon.producer.BasicSplit var13 = new nu.staldal.lagoon.producer.BasicSplit();
    var12.toSAX((org.xml.sax.ContentHandler)var13);
    var4.outputEndElement((org.xml.sax.ContentHandler)var13);
    var13.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var17 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.init();
      fail("Expected exception of type nu.staldal.lagoon.core.LagoonException");
    } catch (nu.staldal.lagoon.core.LagoonException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test151");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    java.lang.String var4 = var3.getTextContentOrNull();
    nu.staldal.xtree.NodeWithChildren var5 = var3.getParent();
    java.lang.String var8 = var3.getInheritedAttribute("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test152");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    var0.setPassword("nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var14 = var0.getTaskType();
    var0.setTaskType("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test153");


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
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var33 = new nu.staldal.lagoon.LagoonAntTask();
    var32.bindToOwner((org.apache.tools.ant.Task)var33);
    var32.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var37 = new nu.staldal.lagoon.LagoonAntTask();
    var37.setPassword("");
    var32.bindToOwner((org.apache.tools.ant.Task)var37);
    org.apache.tools.ant.Target var41 = var37.getOwningTarget();
    var37.setPassword("hi!");
    nu.staldal.lagoon.core.AuthenticationMissingException var45 = new nu.staldal.lagoon.core.AuthenticationMissingException();
    java.lang.Throwable[] var46 = var45.getSuppressed();
    var37.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", (java.lang.Throwable)var45, 10);
    nu.staldal.lagoon.LagoonAntTask var49 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var50 = new nu.staldal.lagoon.LagoonAntTask();
    var49.bindToOwner((org.apache.tools.ant.Task)var50);
    nu.staldal.lagoon.LagoonAntTask var53 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var56 = new nu.staldal.ftp.FTPException("hi!");
    var53.log("", (java.lang.Throwable)var56, 10);
    org.apache.tools.ant.Location var59 = var53.getLocation();
    nu.staldal.lagoon.core.LagoonException var62 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var53.log("4444444444", (java.lang.Throwable)var62, 100);
    java.lang.String var65 = var62.toString();
    nu.staldal.lagoon.LagoonAntTask var66 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var69 = new nu.staldal.ftp.FTPException("hi!");
    var66.log("", (java.lang.Throwable)var69, 10);
    org.apache.tools.ant.Project var72 = var66.getProject();
    nu.staldal.lagoon.util.TemplateException var74 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var75 = var74.getException();
    var66.log("", (java.lang.Throwable)var74, (-1));
    java.lang.Throwable[] var78 = var74.getSuppressed();
    java.lang.Throwable[] var79 = var74.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var81 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var82 = var81.toString();
    var74.addSuppressed((java.lang.Throwable)var81);
    var62.addSuppressed((java.lang.Throwable)var81);
    var49.log("4444444444", (java.lang.Throwable)var81, (-1));
    java.lang.String var87 = var81.toString();
    nu.staldal.lagoon.util.TemplateException var88 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var81);
    java.lang.Exception var89 = var81.getException();
    nu.staldal.lagoon.util.TemplateException var90 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var81);
    var45.addSuppressed((java.lang.Throwable)var90);
    var23.addSuppressed((java.lang.Throwable)var45);
    
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
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var65.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var82.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var87.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test154");


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
    var2.addAttribute("hi!", "hi!", "", "hi!");
    java.net.URL var31 = var2.getBaseURI();
    nu.staldal.xtree.Node var33 = var2.getChild(0);
    nu.staldal.xtree.NodeWithChildren var34 = var2.getParent();
    var2.addAttribute("nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.core.LagoonException~~ hi____33____", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var42 = var2.getFirstChildElement("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", "aaaaaaaaaa");
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
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test155");


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
    var8.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
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
    nu.staldal.xmlutil.DocumentHandlerAdapter var44 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var43);
    nu.staldal.xtree.Element var47 = new nu.staldal.xtree.Element("hi!", "hi!");
    var47.setSystemId("");
    java.net.URL var50 = var47.getBaseURI();
    java.lang.String var53 = var47.getAttrValueOrNull("", "");
    var44.setDocumentLocator((org.xml.sax.Locator)var47);
    nu.staldal.xtree.Text var56 = new nu.staldal.xtree.Text("");
    char[] var57 = var56.asCharArray();
    char[] var58 = var56.asCharArray();
    var44.characters(var58, 100, 100);
    nu.staldal.xtree.Element var64 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var65 = var64.getLineNumber();
    var64.setPublicId("");
    int var68 = var64.getLineNumber();
    java.lang.String var70 = var64.lookupNamespacePrefix("hi_33_");
    var44.setDocumentLocator((org.xml.sax.Locator)var64);
    nu.staldal.xmlutil.ContentHandlerFixer var74 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var44, false, false);
    var44.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    char[] var80 = new char[] { '#', ' '};
    var44.ignorableWhitespace(var80, 2, 100);
    var8.ignorableWhitespace(var80, 0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test156");


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
    java.lang.String var56 = var46.getAttributeValue((-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test157");


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
    nu.staldal.xtree.Element var20 = var2.getFirstChildElementOrNull();
    java.net.URL var21 = var2.getBaseURI();
    nu.staldal.xtree.Element var24 = var2.getFirstChildElementOrNull("nu.staldal.ftp.FTPException: 4", "nu.staldal.ftp.FTPException: hi!");
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test158");


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
    java.lang.Object var22 = var10.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test159");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("4444444444", "nu.staldal.lagoon.core.LagoonException~~ ");

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test160");


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
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ hi____33____");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.endElement("hi!", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
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

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test161");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    var2.setPublicId("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var8 = var2.getAttrValueOrNull("nu.staldal.lagoon.util.TemplateException~ ");
    var2.setLine(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test162");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.destroy();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    java.util.Enumeration var6 = var0.getParamNames();
    var0.init();
    java.util.Enumeration var8 = var0.getParamNames();
    java.util.Enumeration var9 = var0.getParamNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.hasBeenUpdated(1433461984000L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test163");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.destroy();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    java.util.Enumeration var6 = var0.getParamNames();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.hasBeenUpdated(1433461977000L);
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

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test164");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("a", "####################################################################################################");
    var2.setPublicId("hi!");
    int var5 = var2.numberOfAttributes();
    java.lang.String var7 = var2.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test165");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    var4.setLine((-1));
    java.lang.String var8 = var4.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    int var9 = var4.numberOfAttributes();
    boolean var10 = var4.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test166");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test167");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    boolean var1 = var0.needPassword();
    var0.close();
    var0.deleteFile("nu.staldal.lagoon.core.AuthenticationMissingException");
    long var6 = var0.fileLastModified("hi_33_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.OutputHandler var8 = var0.createFile("nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1433461989000L);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test168");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.hasBeenUpdated(1433461964000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test169");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~ hi____33____");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test170");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", "nu.staldal.lagoon.core.AuthenticationException");
    nu.staldal.xtree.ProcessingInstruction var5 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var6 = var5.getPublicId();
    java.lang.String var9 = var5.getInheritedAttribute("", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var10 = var5.getValue();
    java.lang.String var11 = var5.getTarget();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var13 = var2.replaceChild((nu.staldal.xtree.Node)var5, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var10.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var11.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test171");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    java.lang.String var6 = var0.getTaskType();
    var0.setDescription("");
    var0.setTaskName("hi!");
    var0.setDescription("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    var0.reconfigure();
    var0.setDescription("nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException");
    var0.log("##########");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test172");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test173");


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
    int var53 = var41.numberOfAttributes();
    java.lang.String var55 = var41.lookupNamespaceURI("nu.staldal.ftp.FTPException~~ hi!");
    nu.staldal.xtree.Element var58 = var41.getFirstChildElementOrNull("nu.staldal.lagoon.core.LagoonException: aa", "nu.staldal.ftp.FTPException: 4");
    boolean var59 = var41.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var62 = var41.getFirstChildElement("nu.staldal.lagoon.core.AuthenticationException", "nu.staldal.lagoon.core.LagoonException: ");
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + ""+ "'", var48.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + ""+ "'", var51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test174");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var3.startPrefixMapping("4444444444", "");
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var3, false);
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var12 = var11.getLineNumber();
    var11.setPublicId("");
    int var15 = var11.getLineNumber();
    var8.setDocumentLocator((org.xml.sax.Locator)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test175");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.ftp.FTPException~~ hi!", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", (-1));
    nu.staldal.xtree.Element var8 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var11 = var8.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var12 = new nu.staldal.xtree.TreeBuilder();
    var8.toSAX((org.xml.sax.ContentHandler)var12);
    nu.staldal.xtree.Element var14 = var12.getTree();
    nu.staldal.xmlutil.ContentHandlerAdapter var15 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var12);
    nu.staldal.xmlutil.DocumentHandlerAdapter var16 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var15);
    var15.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var18 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var15);
    var18.startDocument();
    var18.endDocument();
    var18.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.outputStartElement((org.xml.sax.ContentHandler)var18);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test176");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test177");


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
    var21.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var25 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    var25.skippedEntity("nu.staldal.ftp.FTPException~~~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test178");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    var4.setSystemId("hi!");
    int var8 = var4.getLineNumber();
    boolean var9 = var4.isWhitespaceNode();
    boolean var10 = var4.getPreserveSpace();
    java.lang.String var13 = var4.getInheritedAttribute("", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test179");


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
    var14.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test180");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("hi__33__", (-1), "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_", "aaaaaaaaaa", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test181");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var10 = var4.lookupNamespaceURI("4444444444");
    java.lang.String var12 = var4.lookupNamespacePrefix("4444444444");
    java.lang.String var15 = var4.getAttrValueOrNull("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var16 = var4.getTextContentOrNull();
    java.lang.String var18 = var4.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~ ");
    
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

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test182");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    var2.setPublicId("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var8 = var2.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    java.lang.String var10 = var2.getAttributeValue((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test183");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    nu.staldal.xmlutil.ContentHandlerAdapter var11 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    var8.endDocument();
    var8.endPrefixMapping("hi_33_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.endElement("nu.staldal.lagoon.core.LagoonException~ 4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "44");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test184");


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
    nu.staldal.xmlutil.ContentHandlerAdapter var36 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var22);
    var22.processingInstruction("nu.staldal.lagoon.core.LagoonException~ 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    
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

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test185");


    char[] var2 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text(var2, 1, 0, false);
    java.lang.String var7 = var6.getPublicId();
    java.lang.String var8 = var6.getValue();
    char[] var11 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var15 = new nu.staldal.xtree.Text(var11, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var16 = new nu.staldal.xtree.TreeBuilder();
    var16.endPrefixMapping("hi!");
    var16.endDocument();
    var16.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var15.toSAX((org.xml.sax.ContentHandler)var16);
    var16.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var6.toSAX((org.xml.sax.ContentHandler)var16);
    java.lang.String var28 = var6.getValue();
    nu.staldal.lagoon.producer.BasicSplit var29 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text("hi!");
    char[] var32 = var31.asCharArray();
    var29.characters(var32, 1, 10);
    var29.endElement("", "hi!", "hi!");
    var29.processingInstruction("", "hi!");
    var29.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var29.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var47 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var29);
    var47.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var51 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var47);
    var51.endPrefixMapping("          ");
    var6.toSAX((org.xml.sax.ContentHandler)var51);
    java.lang.String var55 = var6.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + ""+ "'", var55.equals(""));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test186");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    boolean var8 = var0.hasBeenUpdated(1433461930000L);
    var0.afterBuild();
    boolean var11 = var0.hasBeenUpdated(1433461940000L);
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
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test187");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test188");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    var2.setPublicId("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var8 = var2.getAttrValueOrNull("nu.staldal.lagoon.util.TemplateException~ ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var10 = var2.removeChild(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test189");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", (-1), "__32____32____32____32____32____32____32____32____32____32__", "nu.staldal.lagoon.core.LagoonException~ 4444444444", "nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test190");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("", "hi_33_");
    java.lang.String var3 = var2.getTextContentOrNull();
    int var4 = var2.getColumnNumber();
    int var5 = var2.numberOfAttributes();
    java.lang.String var8 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!", "nu.staldal.ftp.FTPException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test191");


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
    var10.log("");
    nu.staldal.lagoon.util.TemplateException var36 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException~~ ");
    var10.log("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__", (java.lang.Throwable)var36, 100);
    
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

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test192");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!", 10, "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test193");


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
    var4.startPrefixMapping("                                                                                                    ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    var4.endDocument();
    nu.staldal.xtree.Text var35 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var35.setLine(1);
    java.lang.String var38 = var35.getSystemId();
    java.lang.String var39 = var35.getValue();
    var4.setDocumentLocator((org.xml.sax.Locator)var35);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.endElement("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444", "nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var39.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test194");


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
    int var50 = var49.getLineNumber();
    var49.setPublicId("");
    int var53 = var49.getLineNumber();
    java.lang.String var55 = var49.lookupNamespacePrefix("hi_33_");
    var29.setDocumentLocator((org.xml.sax.Locator)var49);
    nu.staldal.lagoon.producer.BasicSplit var57 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var59 = new nu.staldal.xtree.Text("hi!");
    char[] var60 = var59.asCharArray();
    var57.characters(var60, 1, 10);
    var57.endElement("", "hi!", "hi!");
    var57.processingInstruction("", "hi!");
    var57.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    char[] var76 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var80 = new nu.staldal.xtree.Text(var76, 1, 0, false);
    var57.characters(var76, 1, (-1));
    var29.ignorableWhitespace(var76, 1, 0);
    var29.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    var29.startPrefixMapping("4444444444", "nu.staldal.lagoon.util.TemplateException: ");
    var29.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    var1.toSAX((org.xml.sax.ContentHandler)var29);
    
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
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test195");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    var9.addNamespaceMapping("", "4444444444");
    java.lang.String var16 = var9.getTextContent();
    var2.insertChild((nu.staldal.xtree.Node)var9, 0);
    java.lang.String var21 = var9.getInheritedAttribute("4444444444", "                                                                                                    ");
    nu.staldal.xtree.ProcessingInstruction var24 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var25 = var24.getLineNumber();
    java.lang.String var26 = var24.getTarget();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var28 = var9.replaceChild((nu.staldal.xtree.Node)var24, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var26.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test196");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    boolean var2 = var0.hasBeenUpdated(1L);
    var0.afterBuild();
    var0.afterBuild();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    java.lang.String var7 = var0.getParam("##");
    boolean var9 = var0.hasBeenUpdated(1433461968000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test197");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    int var6 = var2.numberOfNamespaceMappings();
    java.lang.String var9 = var2.getInheritedAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    int var10 = var2.numberOfAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test198");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", "nu.staldal.lagoon.core.AuthenticationException");
    java.lang.String var3 = var2.getLocalName();
    boolean var4 = var2.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.AuthenticationException"+ "'", var3.equals("nu.staldal.lagoon.core.AuthenticationException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test199");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient(" ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test200");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    boolean var2 = var1.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test201");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("_32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test202");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    boolean var3 = var2.isWhitespaceNode();
    var2.setColumn(10);
    java.lang.String var6 = var2.getSystemId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test203");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    var0.setPassword("nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var14 = var0.getTaskType();
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var18 = new nu.staldal.ftp.FTPException("hi!");
    var15.log("", (java.lang.Throwable)var18, 10);
    org.apache.tools.ant.Location var21 = var15.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var22 = var15.getRuntimeConfigurableWrapper();
    var15.setTargetURL("4444444444");
    java.lang.String var25 = var15.getTaskName();
    java.lang.String var26 = var15.getDescription();
    var15.reconfigure();
    var15.setDescription("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    nu.staldal.ftp.FTPException var32 = new nu.staldal.ftp.FTPException("nu.staldal.ftp.FTPException: hi!");
    var15.log("4444444444", (java.lang.Throwable)var32, 1);
    nu.staldal.lagoon.LagoonAntTask var35 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var38 = new nu.staldal.ftp.FTPException("hi!");
    var35.log("", (java.lang.Throwable)var38, 10);
    java.lang.String var41 = var35.getDescription();
    nu.staldal.lagoon.LagoonAntTask var42 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var45 = new nu.staldal.ftp.FTPException("hi!");
    var42.log("", (java.lang.Throwable)var45, 10);
    org.apache.tools.ant.Location var48 = var42.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var49 = var42.getRuntimeConfigurableWrapper();
    var42.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var52 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var55 = new nu.staldal.ftp.FTPException("hi!");
    var52.log("", (java.lang.Throwable)var55, 10);
    org.apache.tools.ant.Project var58 = var52.getProject();
    nu.staldal.lagoon.util.TemplateException var60 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var61 = var60.getException();
    var52.log("", (java.lang.Throwable)var60, (-1));
    var42.bindToOwner((org.apache.tools.ant.Task)var52);
    org.apache.tools.ant.Location var65 = var52.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var66 = var52.getRuntimeConfigurableWrapper();
    var35.setRuntimeConfigurableWrapper(var66);
    var15.setRuntimeConfigurableWrapper(var66);
    var0.setRuntimeConfigurableWrapper(var66);
    var0.maybeConfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test204");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var11 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8, true, false);
    var8.startDocument();
    var8.endDocument();
    var8.skippedEntity("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.endElement("nu.staldal.lagoon.util.TemplateException~ ", "aa", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test205");


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
    java.lang.String var28 = var5.getAttrValueOrNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    int var29 = var5.getColumnNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var31 = var5.getChild(100);
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
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test206");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    java.util.Enumeration var1 = var0.getParamNames();
    boolean var3 = var0.hasBeenUpdated(0L);
    var0.beforeBuild();
    boolean var6 = var0.hasBeenUpdated(1433461932000L);
    java.util.Enumeration var7 = var0.getParamNames();
    nu.staldal.lagoon.core.XMLStreamProducer var8 = var0.getNext();
    boolean var10 = var0.hasBeenUpdated(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test207");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test208");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", 10, 0);
    boolean var5 = var4.getPreserveSpace();
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
    nu.staldal.xmlutil.ContentHandlerFixer var61 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var58, false, true);
    var61.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var4.toSAX((org.xml.sax.ContentHandler)var61);
    var61.endPrefixMapping("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
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

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test209");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.close();
    boolean var6 = var0.isReentrant();
    boolean var7 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test210");


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
    java.lang.String var59 = var42.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~ ");
    boolean var60 = var42.getPreserveSpace();
    nu.staldal.xtree.Element var63 = new nu.staldal.xtree.Element("hi!", "hi!");
    var63.setSystemId("");
    java.net.URL var66 = var63.getBaseURI();
    java.lang.String var69 = var63.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var72 = new nu.staldal.xtree.Element("hi!", "hi!");
    var72.addNamespaceMapping("", "");
    var63.addChild((nu.staldal.xtree.Node)var72);
    var63.setSystemId("");
    java.lang.String var79 = var63.getPublicId();
    int var80 = var63.getColumnNumber();
    nu.staldal.xtree.Element var81 = var63.getFirstChildElementOrNull();
    var42.addChild((nu.staldal.xtree.Node)var63);
    boolean var83 = var42.isWhitespaceNode();
    nu.staldal.xtree.Element var84 = var42.getFirstChildElement();
    java.lang.String var86 = var84.getAttributeLocalName((-1));
    
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
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test211");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var5.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5);
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5);
    var8.startDocument();
    var8.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test212");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test213");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("hi!", "hi!");
    var10.setLine(100);
    int var13 = var10.numberOfNamespaceMappings();
    var0.setDocumentLocator((org.xml.sax.Locator)var10);
    boolean var15 = var10.isWhitespaceNode();
    var10.setColumn(2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var18 = var10.getFirstChildElement();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test214");


    nu.staldal.lagoon.util.TemplateException var0 = new nu.staldal.lagoon.util.TemplateException();
    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var0);
    java.lang.Exception var2 = var1.getException();
    nu.staldal.lagoon.util.TemplateException var3 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);
    nu.staldal.lagoon.LagoonAntTask var4 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var4.bindToOwner((org.apache.tools.ant.Task)var5);
    nu.staldal.lagoon.LagoonAntTask var8 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var11 = new nu.staldal.ftp.FTPException("hi!");
    var8.log("", (java.lang.Throwable)var11, 10);
    org.apache.tools.ant.Location var14 = var8.getLocation();
    nu.staldal.lagoon.core.LagoonException var17 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var8.log("4444444444", (java.lang.Throwable)var17, 100);
    java.lang.String var20 = var17.toString();
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var24 = new nu.staldal.ftp.FTPException("hi!");
    var21.log("", (java.lang.Throwable)var24, 10);
    org.apache.tools.ant.Project var27 = var21.getProject();
    nu.staldal.lagoon.util.TemplateException var29 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var30 = var29.getException();
    var21.log("", (java.lang.Throwable)var29, (-1));
    java.lang.Throwable[] var33 = var29.getSuppressed();
    java.lang.Throwable[] var34 = var29.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var36 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var37 = var36.toString();
    var29.addSuppressed((java.lang.Throwable)var36);
    var17.addSuppressed((java.lang.Throwable)var36);
    var4.log("4444444444", (java.lang.Throwable)var36, (-1));
    java.lang.String var42 = var36.toString();
    nu.staldal.lagoon.util.TemplateException var43 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var36);
    java.lang.Exception var44 = var36.getException();
    nu.staldal.lagoon.util.TemplateException var45 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var36);
    var3.addSuppressed((java.lang.Throwable)var36);
    nu.staldal.lagoon.util.TemplateException var48 = new nu.staldal.lagoon.util.TemplateException("");
    java.lang.String var49 = var48.toString();
    java.lang.Throwable[] var50 = var48.getSuppressed();
    java.lang.Exception var51 = var48.getException();
    java.lang.String var52 = var48.toString();
    java.lang.Throwable[] var53 = var48.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var54 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var48);
    var36.addSuppressed((java.lang.Throwable)var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var20.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var37.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var42.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "nu.staldal.lagoon.util.TemplateException: "+ "'", var49.equals("nu.staldal.lagoon.util.TemplateException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "nu.staldal.lagoon.util.TemplateException: "+ "'", var52.equals("nu.staldal.lagoon.util.TemplateException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test215");


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
    var22.skippedEntity("nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.xtree.Element var41 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.util.TemplateException", 0);
    nu.staldal.xtree.NodeWithChildren var42 = var41.getParent();
    int var43 = var41.numberOfChildren();
    var22.setDocumentLocator((org.xml.sax.Locator)var41);
    var22.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var22.endPrefixMapping("####################################################################################################");
    
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
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test216");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    var0.deleteFile("hi!");
    boolean var9 = var0.isReentrant();
    boolean var10 = var0.isReentrant();
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test217");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xtree.Text var7 = new nu.staldal.xtree.Text("");
    char[] var8 = var7.asCharArray();
    boolean var9 = var7.isWhitespaceNode();
    char[] var10 = var7.asCharArray();
    var0.ignorableWhitespace(var10, 0, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##", 100);
    var0.setDocumentLocator((org.xml.sax.Locator)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var22 = var19.getAttributeNamespaceURI(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test218");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationException");

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test219");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.endElement("hi!", "                                                                                                    ", "nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.xmlutil.ContentHandlerFixer var16 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
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
    nu.staldal.lagoon.producer.IslandSplit var39 = new nu.staldal.lagoon.producer.IslandSplit();
    var39.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var42 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var39, true);
    char[] var45 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var49 = new nu.staldal.xtree.Text(var45, 1, 0, false);
    var42.setDocumentLocator((org.xml.sax.Locator)var49);
    var38.setDocumentLocator((org.xml.sax.Locator)var49);
    java.lang.String var52 = var49.getValue();
    var16.setDocumentLocator((org.xml.sax.Locator)var49);
    var16.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: hi_33_");
    nu.staldal.lagoon.producer.BasicSplit var56 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var58 = new nu.staldal.xtree.Text("hi!");
    char[] var59 = var58.asCharArray();
    var56.characters(var59, 1, 10);
    var56.endElement("", "hi!", "hi!");
    var56.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var70 = new nu.staldal.xtree.Text("");
    char[] var71 = var70.asCharArray();
    char[] var72 = var70.asCharArray();
    char[] var73 = var70.asCharArray();
    var56.characters(var73, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var77 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var56);
    nu.staldal.lagoon.producer.IslandSplit var78 = new nu.staldal.lagoon.producer.IslandSplit();
    var78.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var81 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var78, true);
    char[] var84 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var88 = new nu.staldal.xtree.Text(var84, 1, 0, false);
    var81.setDocumentLocator((org.xml.sax.Locator)var88);
    var77.setDocumentLocator((org.xml.sax.Locator)var88);
    java.lang.String var91 = var88.getValue();
    boolean var92 = var88.isWhitespaceNode();
    java.lang.String var93 = var88.getValue();
    var16.setDocumentLocator((org.xml.sax.Locator)var88);
    var16.startDocument();
    
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
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + ""+ "'", var91.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + ""+ "'", var93.equals(""));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test220");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test221");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", 0, 0);
    nu.staldal.lagoon.producer.BasicSplit var5 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var7 = new nu.staldal.xtree.Text("hi!");
    char[] var8 = var7.asCharArray();
    var5.characters(var8, 1, 10);
    var5.endElement("", "hi!", "hi!");
    var5.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var19 = new nu.staldal.xtree.Text("");
    char[] var20 = var19.asCharArray();
    char[] var21 = var19.asCharArray();
    char[] var22 = var19.asCharArray();
    var5.characters(var22, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var28 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, true, false);
    var5.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.xmlutil.ContentHandlerFixer var33 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, true);
    var4.outputStartElement((org.xml.sax.ContentHandler)var5);
    var5.destroy();
    nu.staldal.xmlutil.ContentHandlerAdapter var36 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var5);
    nu.staldal.lagoon.producer.BasicSplit var37 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var39 = new nu.staldal.xtree.Text("hi!");
    char[] var40 = var39.asCharArray();
    var37.characters(var40, 1, 10);
    var37.endElement("", "hi!", "hi!");
    var37.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var51 = new nu.staldal.xtree.Text("");
    char[] var52 = var51.asCharArray();
    char[] var53 = var51.asCharArray();
    char[] var54 = var51.asCharArray();
    var37.characters(var54, 10, 0);
    char[] var60 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var64 = new nu.staldal.xtree.Text(var60, 1, 0, false);
    char[] var65 = var64.asCharArray();
    var37.characters(var65, (-1), 1);
    var36.ignorableWhitespace(var65, 2, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test222");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("hi_33_", "nu.staldal.lagoon.core.LagoonException: ");
    boolean var3 = var2.isWhitespaceNode();
    var2.setPublicId("nu.staldal.lagoon.core.LagoonException: 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test223");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.lang.String var6 = var3.getSystemId();
    int var7 = var3.getColumnNumber();
    java.lang.String var10 = var3.getAttrValueOrNull("nu.staldal.ftp.FTPException: hi!", "__52__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test224");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    nu.staldal.xtree.Element var14 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var17 = var14.lookupAttribute("4444444444", "hi!");
    java.lang.String var20 = var14.getInheritedAttribute("", "4444444444");
    nu.staldal.lagoon.producer.BasicSplit var21 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("hi!");
    char[] var24 = var23.asCharArray();
    var21.characters(var24, 1, 10);
    var21.endElement("", "hi!", "hi!");
    var21.processingInstruction("", "hi!");
    var21.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var21.startDocument();
    var14.outputEndElement((org.xml.sax.ContentHandler)var21);
    var0.setDocumentLocator((org.xml.sax.Locator)var14);
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var46 = var45.getFirstChildElementOrNull();
    int var49 = var45.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var51 = var45.lookupNamespaceURI("4444444444");
    nu.staldal.xtree.Text var53 = new nu.staldal.xtree.Text("4444444444");
    nu.staldal.lagoon.producer.BasicSplit var54 = new nu.staldal.lagoon.producer.BasicSplit();
    var53.toSAX((org.xml.sax.ContentHandler)var54);
    var45.outputEndElement((org.xml.sax.ContentHandler)var54);
    var54.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var58 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var54);
    nu.staldal.xmlutil.ContentHandlerFixer var59 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var58);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.outputEndElement((org.xml.sax.ContentHandler)var59);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test225");


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
    var8.processingInstruction("", "hi!");
    var8.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var8.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var26 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    var26.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi!", "hi!");
    var32.setLine(100);
    java.lang.String var36 = var32.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.net.URL var37 = var32.getBaseURI();
    var26.setDocumentLocator((org.xml.sax.Locator)var32);
    nu.staldal.lagoon.producer.BasicSplit var39 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var41 = new nu.staldal.xtree.Text("hi!");
    char[] var42 = var41.asCharArray();
    var39.characters(var42, 1, 10);
    var39.endElement("", "hi!", "hi!");
    var39.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var52 = new nu.staldal.lagoon.producer.IslandSplit();
    var52.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var55 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var52, true);
    char[] var58 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var62 = new nu.staldal.xtree.Text(var58, 1, 0, false);
    var55.setDocumentLocator((org.xml.sax.Locator)var62);
    char[] var64 = var62.asCharArray();
    var39.characters(var64, 10, 0);
    var26.characters(var64, (-1), 100);
    nu.staldal.xtree.Element var75 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var76 = var75.getFirstChildElementOrNull();
    var75.setSystemId("hi!");
    var26.setDocumentLocator((org.xml.sax.Locator)var75);
    nu.staldal.xtree.Text var81 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var83 = var81.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    char[] var84 = var81.asCharArray();
    var26.characters(var84, 100, 1);
    var0.characters(var84, 1, 2);
    var0.afterBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test226");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    boolean var7 = var0.isReentrant();
    boolean var8 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    var0.deleteFile("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    boolean var13 = var0.needPassword();
    long var15 = var0.fileLastModified("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    
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
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0L);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test227");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu.staldal.lagoon.util.TemplateException: hi_33_");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test228");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    java.lang.String var10 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var11 = var2.getBaseURI();
    int var12 = var2.numberOfChildren();
    java.lang.String var13 = var2.getTextContentOrNull();
    int var16 = var2.lookupAttribute("hi!", "nu.staldal.lagoon.core.AuthenticationMissingException");
    var2.setPublicId("##");
    java.lang.String var21 = var2.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException~ hi__33__", "nu.staldal.ftp.FTPException~~ hi!");
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.setSystemId("");
    java.net.URL var27 = var24.getBaseURI();
    java.lang.String var30 = var24.getAttrValueOrNull("", "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertChild((nu.staldal.xtree.Node)var24, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test229");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("nu.staldal.ftp.FTPException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_"+ "'", var1.equals("nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_"));

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test230");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~~ ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    java.lang.String var3 = var2.getValue();
    java.lang.String var4 = var2.getSystemId();
    java.lang.String var5 = var2.getTarget();
    nu.staldal.xtree.TreeBuilder var6 = new nu.staldal.xtree.TreeBuilder();
    var6.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var11 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var6, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var11, false, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.toSAX((org.xml.sax.ContentHandler)var11);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException"+ "'", var3.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "nu.staldal.lagoon.core.LagoonException~~ "+ "'", var5.equals("nu.staldal.lagoon.core.LagoonException~~ "));

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test231");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var10 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test232");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu__46__staldal__46__ftp__46__FTPException__126____32__hi__33__"+ "'", var1.equals("nu__46__staldal__46__ftp__46__FTPException__126____32__hi__33__"));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test233");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    java.util.Enumeration var1 = var0.getParamNames();
    java.lang.String var3 = var0.getParam("hi!");
    boolean var5 = var0.hasBeenUpdated(10L);
    boolean var7 = var0.hasBeenUpdated(10L);
    boolean var9 = var0.hasBeenUpdated(1433461932000L);
    boolean var11 = var0.hasBeenUpdated(1433461930000L);
    nu.staldal.lagoon.core.XMLStreamProducer var12 = var0.getNext();
    boolean var14 = var0.hasBeenUpdated(1433461940000L);
    boolean var16 = var0.hasBeenUpdated(1433461978000L);
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test234");


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
    var18.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException~ ");
    var18.processingInstruction("", "aa");
    var18.startDocument();
    nu.staldal.xtree.Text var30 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: hi_33_");
    char[] var31 = var30.asCharArray();
    var18.ignorableWhitespace(var31, 2, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test235");


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
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.TreeBuilder var27 = new nu.staldal.xtree.TreeBuilder();
    var27.endPrefixMapping("hi!");
    var27.endDocument();
    var27.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    nu.staldal.xtree.Text var35 = new nu.staldal.xtree.Text("");
    char[] var36 = var35.asCharArray();
    char[] var37 = var35.asCharArray();
    char[] var38 = var35.asCharArray();
    var27.ignorableWhitespace(var38, 1, 100);
    var26.outputStartElement((org.xml.sax.ContentHandler)var27);
    java.lang.String var44 = var26.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var45 = var26.numberOfAttributes();
    var8.setDocumentLocator((org.xml.sax.Locator)var26);
    var8.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: aa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test236");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: 4444444444");
    long var7 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var9 = var0.createFile("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1433461990000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test237");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.util.Enumeration var17 = var0.getParamNames();
    var0.endElement("nu.staldal.lagoon.util.TemplateException", "4444444444", "nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.lagoon.producer.BasicSplit var22 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var24 = new nu.staldal.xtree.Text("hi!");
    char[] var25 = var24.asCharArray();
    var22.characters(var25, 1, 10);
    var22.endElement("", "hi!", "hi!");
    var22.processingInstruction("", "hi!");
    var22.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var22.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var40 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var22);
    var40.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.DocumentHandlerAdapter var44 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var40);
    nu.staldal.xtree.Text var46 = new nu.staldal.xtree.Text("4444444444");
    var44.setDocumentLocator((org.xml.sax.Locator)var46);
    nu.staldal.xtree.Text var49 = new nu.staldal.xtree.Text("");
    char[] var50 = var49.asCharArray();
    boolean var51 = var49.isWhitespaceNode();
    char[] var52 = var49.asCharArray();
    var44.ignorableWhitespace(var52, (-1), 0);
    var0.characters(var52, 1, (-1));
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.util.TemplateException~~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test238");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    java.lang.String var12 = var4.getAttributeLocalName((-1));
    java.net.URL var13 = var4.getBaseURI();
    nu.staldal.xtree.Element var16 = var4.getFirstChildElementOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "aa");
    java.lang.String var18 = var4.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    var4.addAttribute("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "hi_33_", "nu.staldal.ftp.FTPException~~ hi!", "");
    var4.addAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.ftp.FTPException: hi!", "nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test239");


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
    nu.staldal.lagoon.core.XMLStreamProducer var22 = var0.getNext();
    int var23 = var0.getPosition();
    nu.staldal.lagoon.core.LagoonContext var24 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test240");


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
    var0.reconfigure();
    var0.setTaskName("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test241");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    boolean var8 = var0.hasBeenUpdated((-1L));
    int var9 = var0.getPosition();
    boolean var11 = var0.hasBeenUpdated(1433461946000L);
    boolean var13 = var0.hasBeenUpdated(1433461943000L);
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
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test242");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    int var6 = var2.getLineNumber();
    java.lang.String var8 = var2.lookupNamespacePrefix("hi_33_");
    java.lang.String var11 = var2.getAttrValueOrNull("", "4444444444");
    int var12 = var2.numberOfAttributes();
    var2.setSystemId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test243");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    var4.setSystemId("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = var4.getAttrValue("nu__46__staldal__46__ftp__46__FTPException__126____32__hi__33__", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test244");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Project var8 = var0.getProject();
    var0.setForce(false);
    org.apache.tools.ant.Location var11 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test245");


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
    nu.staldal.xmlutil.ContentHandlerFixer var32 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var30, false);
    var30.processingInstruction("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!", "nu.staldal.ftp.FTPException~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test246");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var18 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test247");


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
    var0.init();
    
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

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test248");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__");

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test249");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
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

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test250");


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
    var20.setColumn(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var61 = var20.getFirstChildElement("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
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

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test251");


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
    var0.setTaskName("nu.staldal.ftp.FTPException~ hi!");
    var0.maybeConfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var24.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test252");


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
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test253");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "", (-1), 10);
    java.net.URL var5 = var4.getBaseURI();
    nu.staldal.xtree.Element var6 = var4.getFirstChildElementOrNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test254");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    boolean var2 = var0.hasBeenUpdated(0L);
    var0.beforeBuild();
    boolean var5 = var0.hasBeenUpdated(1433461940000L);
    boolean var7 = var0.hasBeenUpdated(100L);
    boolean var9 = var0.hasBeenUpdated(1433461972000L);
    var0.beforeBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test255");


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
    var55.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    var55.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    nu.staldal.xtree.Element var65 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var68 = var65.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var69 = new nu.staldal.xtree.TreeBuilder();
    var65.toSAX((org.xml.sax.ContentHandler)var69);
    nu.staldal.xtree.Element var71 = var69.getTree();
    nu.staldal.xmlutil.ContentHandlerAdapter var72 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var69);
    nu.staldal.xmlutil.DocumentHandlerAdapter var73 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var72);
    var72.startDocument();
    char[] var77 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var81 = new nu.staldal.xtree.Text(var77, 1, 0, false);
    char[] var82 = var81.asCharArray();
    char[] var83 = var81.asCharArray();
    var72.ignorableWhitespace(var83, 2, 2);
    var55.characters(var83, 1, 0);
    
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
    assertTrue(var68 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test256");


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
    nu.staldal.lagoon.core.LagoonException var30 = new nu.staldal.lagoon.core.LagoonException("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    java.lang.String var31 = var30.toString();
    var10.log((java.lang.Throwable)var30, 100);
    
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
    assertTrue("'" + var31 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_"+ "'", var31.equals("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_"));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test257");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    var0.log("");
    var0.setTaskType("                                                                                                    ");
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    var11.bindToOwner((org.apache.tools.ant.Task)var12);
    var11.setForce(true);
    java.lang.String var16 = var11.getTaskName();
    var11.setTaskType("4444444444");
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    var19.bindToOwner((org.apache.tools.ant.Task)var20);
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var25 = new nu.staldal.ftp.FTPException("hi!");
    var22.log("", (java.lang.Throwable)var25, 10);
    org.apache.tools.ant.Location var28 = var22.getLocation();
    var19.setLocation(var28);
    nu.staldal.lagoon.LagoonAntTask var30 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var31 = new nu.staldal.lagoon.LagoonAntTask();
    var30.bindToOwner((org.apache.tools.ant.Task)var31);
    var30.setForce(true);
    java.lang.String var35 = var30.getTaskName();
    var30.setTaskType("4444444444");
    var30.maybeConfigure();
    var19.bindToOwner((org.apache.tools.ant.Task)var30);
    var11.bindToOwner((org.apache.tools.ant.Task)var30);
    org.apache.tools.ant.Location var41 = var11.getLocation();
    java.lang.String var42 = var11.getTaskType();
    java.lang.String var43 = var11.getDescription();
    org.apache.tools.ant.Location var44 = var11.getLocation();
    var0.bindToOwner((org.apache.tools.ant.Task)var11);
    java.lang.Object var46 = var11.clone();
    var11.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "4444444444"+ "'", var42.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test258");


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
    int var18 = var2.numberOfChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var20 = var2.getAttrValue("nu.staldal.ftp.FTPException:  ");
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
    assertTrue(var18 == 1);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test259");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    int var6 = var2.getLineNumber();
    java.lang.String var8 = var2.lookupNamespacePrefix("hi_33_");
    java.lang.String var11 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    java.lang.String var14 = var2.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "_52_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test260");


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
    var0.setTaskName("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    
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

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test261");


    nu.staldal.lagoon.filestorage.FTPFileStorage var0 = new nu.staldal.lagoon.filestorage.FTPFileStorage();
    boolean var1 = var0.isReentrant();
    boolean var2 = var0.needPassword();
    boolean var3 = var0.isReentrant();
    boolean var4 = var0.isReentrant();
    boolean var5 = var0.needPassword();
    boolean var6 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test262");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", (-1), (-1));
    boolean var5 = var4.getPreserveSpace();
    java.lang.String var7 = var4.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test263");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var2 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var3 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var4 = var0.getNext();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var6 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var7 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test264");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444", "nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test265");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.util.TemplateException", 0, 1);
    nu.staldal.xtree.Element var7 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "                                                                                                    ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var9 = var4.replaceChild((nu.staldal.xtree.Node)var7, 2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test266");


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
    var22.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var22.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var40 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, false, false);
    var22.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____", "nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
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

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test267");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated(1433461944000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test268");


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
    var24.endPrefixMapping("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test269");


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
    var22.startPrefixMapping("4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.ContentHandlerFixer var42 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22);
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "hi!");
    var45.setSystemId("");
    java.net.URL var48 = var45.getBaseURI();
    java.lang.String var51 = var45.getAttrValueOrNull("", "");
    java.lang.String var52 = var45.getTextContent();
    var45.setColumn((-1));
    java.net.URL var55 = var45.getBaseURI();
    int var56 = var45.numberOfNamespaceMappings();
    var45.setSystemId("4444444444");
    var22.setDocumentLocator((org.xml.sax.Locator)var45);
    var22.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "a");
    
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
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test270");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.ftp.FTPException~ hi!", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test271");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.hasBeenUpdated(1433461990000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test272");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    org.apache.tools.ant.Target var6 = var1.getOwningTarget();
    java.lang.String var7 = var1.getTaskType();
    var1.maybeConfigure();
    var1.setTaskName("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test273");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    boolean var1 = var0.needPassword();
    var0.close();
    boolean var3 = var0.isReentrant();
    boolean var4 = var0.isReentrant();
    boolean var5 = var0.needPassword();
    var0.deleteFile("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.close();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.core.OutputHandler var12 = var0.createFile("          ");
    var0.close();
    boolean var14 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test274");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test275");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.xtree.NodeWithChildren var3 = var2.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test276");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var3 = var2.getPublicId();
    java.lang.String var6 = var2.getInheritedAttribute("", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var7 = var2.getValue();
    java.lang.String var10 = var2.getInheritedAttribute("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    java.lang.String var11 = var2.getTarget();
    java.lang.String var12 = var2.getTarget();
    
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
    assertTrue("'" + var12 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var12.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test277");


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
    var22.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    nu.staldal.xtree.Element var38 = new nu.staldal.xtree.Element("hi!", "hi!");
    var38.setSystemId("");
    java.net.URL var41 = var38.getBaseURI();
    java.lang.String var44 = var38.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var47 = new nu.staldal.xtree.Element("hi!", "hi!");
    var47.addNamespaceMapping("", "");
    var38.addChild((nu.staldal.xtree.Node)var47);
    boolean var52 = var38.getPreserveSpace();
    nu.staldal.xtree.Node var54 = var38.getChild(0);
    int var55 = var38.getLineNumber();
    int var56 = var38.getLineNumber();
    nu.staldal.lagoon.producer.BasicSplit var57 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var59 = new nu.staldal.xtree.Text("hi!");
    char[] var60 = var59.asCharArray();
    var57.characters(var60, 1, 10);
    var57.endElement("", "hi!", "hi!");
    var57.processingInstruction("", "hi!");
    var57.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var57.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var75 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var57);
    var38.outputStartElement((org.xml.sax.ContentHandler)var57);
    nu.staldal.xmlutil.ContentHandlerAdapter var77 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var57);
    nu.staldal.xtree.Element var82 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var85 = var82.lookupAttribute("4444444444", "hi!");
    var82.addNamespaceMapping("", "4444444444");
    int var89 = var82.getColumnNumber();
    var57.setDocumentLocator((org.xml.sax.Locator)var82);
    var22.setDocumentLocator((org.xml.sax.Locator)var82);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var93 = var82.getAttributeNamespaceURI(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == (-1));

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test278");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.hasBeenUpdated(1433461931000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test279");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("a");
    nu.staldal.lagoon.LagoonAntTask var2 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var5 = new nu.staldal.ftp.FTPException("hi!");
    var2.log("", (java.lang.Throwable)var5, 10);
    org.apache.tools.ant.Project var8 = var2.getProject();
    nu.staldal.lagoon.util.TemplateException var10 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var11 = var10.getException();
    var2.log("", (java.lang.Throwable)var10, (-1));
    java.lang.Throwable[] var14 = var10.getSuppressed();
    java.lang.Throwable[] var15 = var10.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var17 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var18 = var17.toString();
    var10.addSuppressed((java.lang.Throwable)var17);
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var23 = new nu.staldal.ftp.FTPException("hi!");
    var20.log("", (java.lang.Throwable)var23, 10);
    org.apache.tools.ant.Location var26 = var20.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var27 = var20.getRuntimeConfigurableWrapper();
    var20.setForce(false);
    org.apache.tools.ant.Location var30 = var20.getLocation();
    nu.staldal.lagoon.core.LagoonException var32 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var33 = var32.toString();
    var20.log((java.lang.Throwable)var32, 100);
    var17.addSuppressed((java.lang.Throwable)var32);
    var1.addSuppressed((java.lang.Throwable)var32);
    java.lang.Exception var38 = var1.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var18.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var33.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test280");


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
    nu.staldal.xtree.NodeWithChildren var25 = var11.getParent();
    java.net.URL var26 = var25.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test281");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    var0.endDocument();
    nu.staldal.xtree.Text var10 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var11 = var10.getValue();
    char[] var12 = var10.asCharArray();
    var0.ignorableWhitespace(var12, 10, 2);
    var0.startPrefixMapping("a", "nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.endElement("nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test282");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.processingInstruction("nu.staldal.ftp.FTPException:                                                                                                     ", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test283");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    java.lang.String var2 = var0.getDescription();
    var0.reconfigure();
    var0.maybeConfigure();
    var0.maybeConfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test284");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    boolean var6 = var2.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test285");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.log("");
    java.lang.Object var5 = var0.clone();
    var0.maybeConfigure();
    var0.setDescription("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.setDescription("nu.staldal.ftp.FTPException:                                                                                                     ");
    java.lang.String var11 = var0.getTaskType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test286");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    org.apache.tools.ant.Target var9 = var5.getOwningTarget();
    var5.setPassword("hi!");
    nu.staldal.lagoon.core.AuthenticationMissingException var13 = new nu.staldal.lagoon.core.AuthenticationMissingException();
    java.lang.Throwable[] var14 = var13.getSuppressed();
    var5.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", (java.lang.Throwable)var13, 10);
    org.apache.tools.ant.Project var17 = var5.getProject();
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    var18.bindToOwner((org.apache.tools.ant.Task)var19);
    var18.setForce(true);
    java.lang.String var23 = var18.getTaskName();
    var18.setTaskType("4444444444");
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    var26.bindToOwner((org.apache.tools.ant.Task)var27);
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var32 = new nu.staldal.ftp.FTPException("hi!");
    var29.log("", (java.lang.Throwable)var32, 10);
    org.apache.tools.ant.Location var35 = var29.getLocation();
    var26.setLocation(var35);
    nu.staldal.lagoon.LagoonAntTask var37 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var38 = new nu.staldal.lagoon.LagoonAntTask();
    var37.bindToOwner((org.apache.tools.ant.Task)var38);
    var37.setForce(true);
    java.lang.String var42 = var37.getTaskName();
    var37.setTaskType("4444444444");
    var37.maybeConfigure();
    var26.bindToOwner((org.apache.tools.ant.Task)var37);
    var18.bindToOwner((org.apache.tools.ant.Task)var37);
    org.apache.tools.ant.Location var48 = var18.getLocation();
    java.lang.String var49 = var18.getTaskType();
    var18.reconfigure();
    var18.init();
    org.apache.tools.ant.Location var52 = var18.getLocation();
    nu.staldal.lagoon.LagoonAntTask var53 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var54 = new nu.staldal.lagoon.LagoonAntTask();
    var53.bindToOwner((org.apache.tools.ant.Task)var54);
    var53.setForce(true);
    java.lang.String var58 = var53.getTaskName();
    var53.setTaskType("4444444444");
    nu.staldal.lagoon.LagoonAntTask var61 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var62 = new nu.staldal.lagoon.LagoonAntTask();
    var61.bindToOwner((org.apache.tools.ant.Task)var62);
    nu.staldal.lagoon.LagoonAntTask var64 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var67 = new nu.staldal.ftp.FTPException("hi!");
    var64.log("", (java.lang.Throwable)var67, 10);
    org.apache.tools.ant.Location var70 = var64.getLocation();
    var61.setLocation(var70);
    nu.staldal.lagoon.LagoonAntTask var72 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var73 = new nu.staldal.lagoon.LagoonAntTask();
    var72.bindToOwner((org.apache.tools.ant.Task)var73);
    var72.setForce(true);
    java.lang.String var77 = var72.getTaskName();
    var72.setTaskType("4444444444");
    var72.maybeConfigure();
    var61.bindToOwner((org.apache.tools.ant.Task)var72);
    var53.bindToOwner((org.apache.tools.ant.Task)var72);
    org.apache.tools.ant.Location var83 = var53.getLocation();
    java.lang.String var84 = var53.getTaskType();
    java.lang.String var85 = var53.getDescription();
    org.apache.tools.ant.Location var86 = var53.getLocation();
    var18.setLocation(var86);
    var5.setLocation(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "4444444444"+ "'", var49.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "4444444444"+ "'", var84.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test287");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_");

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test288");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    var0.beforeBuild();
    java.lang.String var2 = var0.getEntryName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.hasBeenUpdated(1433461927000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test289");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var5.startPrefixMapping("nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var9 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5);
    var5.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.producer.BasicSplit var12 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("hi!");
    char[] var15 = var14.asCharArray();
    var12.characters(var15, 1, 10);
    var12.endElement("", "hi!", "hi!");
    var12.processingInstruction("", "hi!");
    var12.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var12.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var30 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var12);
    var30.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var34 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var30);
    var34.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Element var39 = new nu.staldal.xtree.Element("hi!", "hi!");
    var39.setSystemId("");
    java.net.URL var42 = var39.getBaseURI();
    java.lang.String var45 = var39.getAttrValueOrNull("", "");
    java.lang.String var46 = var39.getTextContent();
    var39.setColumn(100);
    java.lang.String var49 = var39.getTextContent();
    java.lang.String var52 = var39.getInheritedAttribute("                                                                                                    ", "a");
    java.net.URL var53 = var39.getBaseURI();
    int var54 = var39.getColumnNumber();
    var34.setDocumentLocator((org.xml.sax.Locator)var39);
    var34.startDocument();
    nu.staldal.lagoon.producer.IslandSplit var57 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var58 = var57.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var59 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var57);
    nu.staldal.xmlutil.ContentHandlerFixer var62 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var57, true, false);
    nu.staldal.xtree.Text var64 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var64.setLine(1);
    var62.setDocumentLocator((org.xml.sax.Locator)var64);
    char[] var68 = var64.asCharArray();
    var34.ignorableWhitespace(var68, 0, 1);
    var5.ignorableWhitespace(var68, 0, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.processingInstruction("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + ""+ "'", var49.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test290");


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
    var22.startPrefixMapping("##", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var22.startDocument();
    var22.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.util.TemplateException~~ ");
    nu.staldal.xtree.Text var60 = new nu.staldal.xtree.Text("");
    char[] var61 = var60.asCharArray();
    boolean var62 = var60.isWhitespaceNode();
    int var63 = var60.getLineNumber();
    java.lang.String var64 = var60.getValue();
    var22.setDocumentLocator((org.xml.sax.Locator)var60);
    
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
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + ""+ "'", var64.equals(""));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test291");


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
    var10.init();
    
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

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test292");


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
    int var19 = var2.numberOfAttributes();
    java.lang.String var22 = var2.getInheritedAttribute("nu.staldal.lagoon.core.AuthenticationMissingException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_");
    java.lang.String var23 = var2.getNamespaceURI();
    
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
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test293");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var8 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var8.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var10 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var8);
    nu.staldal.xtree.Element var15 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var18 = var15.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var19 = new nu.staldal.xtree.TreeBuilder();
    var15.toSAX((org.xml.sax.ContentHandler)var19);
    var19.skippedEntity("hi!");
    var19.skippedEntity("hi!");
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var19.setDocumentLocator((org.xml.sax.Locator)var27);
    var19.endDocument();
    nu.staldal.xtree.Element var30 = var19.getTree();
    var30.setSystemId("          ");
    var8.setDocumentLocator((org.xml.sax.Locator)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test294");


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
    var22.skippedEntity("                                                                                                    ");
    var22.skippedEntity("hi_33_");
    char[] var39 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var43 = new nu.staldal.xtree.Text(var39, 1, 0, false);
    java.lang.String var44 = var43.getPublicId();
    java.lang.String var45 = var43.getValue();
    char[] var46 = var43.asCharArray();
    var22.setDocumentLocator((org.xml.sax.Locator)var43);
    java.lang.String var49 = var43.lookupNamespacePrefix("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test295");


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
    java.net.URL var46 = var16.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var48 = var16.getAttrValue("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test296");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("4", "nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test297");


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
    org.apache.tools.ant.Location var31 = var0.getLocation();
    var0.setTargetURL("nu.staldal.lagoon.core.LagoonException: hi_33_");
    nu.staldal.lagoon.LagoonAntTask var34 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var37 = new nu.staldal.ftp.FTPException("hi!");
    var34.log("", (java.lang.Throwable)var37, 10);
    org.apache.tools.ant.Location var40 = var34.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var41 = var34.getRuntimeConfigurableWrapper();
    var34.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var44 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var47 = new nu.staldal.ftp.FTPException("hi!");
    var44.log("", (java.lang.Throwable)var47, 10);
    org.apache.tools.ant.Project var50 = var44.getProject();
    nu.staldal.lagoon.util.TemplateException var52 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var53 = var52.getException();
    var44.log("", (java.lang.Throwable)var52, (-1));
    var34.bindToOwner((org.apache.tools.ant.Task)var44);
    org.apache.tools.ant.Project var57 = var34.getProject();
    org.apache.tools.ant.Target var58 = var34.getOwningTarget();
    nu.staldal.lagoon.LagoonAntTask var59 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var62 = new nu.staldal.ftp.FTPException("hi!");
    var59.log("", (java.lang.Throwable)var62, 10);
    var59.init();
    var59.init();
    java.lang.String var67 = var59.getDescription();
    nu.staldal.lagoon.LagoonAntTask var68 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var71 = new nu.staldal.ftp.FTPException("hi!");
    var68.log("", (java.lang.Throwable)var71, 10);
    org.apache.tools.ant.Project var74 = var68.getProject();
    var59.bindToOwner((org.apache.tools.ant.Task)var68);
    var68.setTaskType("nu.staldal.lagoon.core.LagoonException: ");
    var68.log("hi!");
    org.apache.tools.ant.RuntimeConfigurable var80 = var68.getRuntimeConfigurableWrapper();
    var34.setRuntimeConfigurableWrapper(var80);
    var0.setRuntimeConfigurableWrapper(var80);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test298");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.lang.String var6 = var3.getSystemId();
    nu.staldal.xtree.ProcessingInstruction var9 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~~ ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    java.lang.String var10 = var9.getValue();
    java.lang.String var11 = var9.getSystemId();
    java.lang.String var12 = var9.getTarget();
    var3.addChild((nu.staldal.xtree.Node)var9);
    java.lang.String var14 = var3.getNamespaceURI();
    int var17 = var3.lookupAttribute("nu.staldal.lagoon.core.LagoonException~ ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException"+ "'", var10.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "nu.staldal.lagoon.core.LagoonException~~ "+ "'", var12.equals("nu.staldal.lagoon.core.LagoonException~~ "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test299");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException:                                                                                                     ", 0, "nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException", "nu.staldal.lagoon.util.TemplateException: aa", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test300");


    nu.staldal.lagoon.util.TemplateException var0 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var1 = var0.getException();
    nu.staldal.lagoon.util.TemplateException var2 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var0);
    java.lang.String var3 = var0.toString();
    java.lang.Exception var4 = var0.getException();
    java.lang.Exception var5 = var0.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var3.equals("nu.staldal.lagoon.util.TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test301");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var2 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var3 = var0.getNext();
    var0.init();
    var0.destroy();
    java.lang.String var7 = var0.getParam("nu__46__staldal__46__ftp__46__FTPException__126____32__hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test302");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.isReentrant();
    long var5 = var0.fileLastModified("nu.staldal.lagoon.util.TemplateException: ");
    boolean var6 = var0.needPassword();
    long var8 = var0.fileLastModified("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    boolean var9 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test303");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test304");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~ 4444444444", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test305");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    var0.init();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    nu.staldal.lagoon.core.LagoonContext var6 = var0.getContext();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.hasBeenUpdated(10L);
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

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test306");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var3 = var2.getPreserveSpace();
    var2.addAttribute("hi_33_", "nu.staldal.lagoon.core.LagoonException: ", "4444444444", "4444444444");
    java.lang.String var9 = var2.getNamespaceURI();
    nu.staldal.xtree.Text var11 = new nu.staldal.xtree.Text("");
    char[] var12 = var11.asCharArray();
    java.lang.String var13 = var11.getValue();
    boolean var14 = var11.isWhitespaceNode();
    var2.addChild((nu.staldal.xtree.Node)var11);
    int var16 = var2.getLineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var18 = var2.getAttrValue("hi!");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test307");


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
    var0.endDocument();
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var19 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var20 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test308");


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
    nu.staldal.xmlutil.ContentHandlerFixer var36 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, false, true);
    var36.startPrefixMapping("####################################################################################################", "");
    nu.staldal.xtree.Element var43 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 0);
    var43.setLine(100);
    var36.setDocumentLocator((org.xml.sax.Locator)var43);
    var36.startDocument();
    
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

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test309");


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
    var20.endElement("", "hi!", "hi!");
    var20.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var34 = new nu.staldal.xtree.Text("");
    char[] var35 = var34.asCharArray();
    char[] var36 = var34.asCharArray();
    char[] var37 = var34.asCharArray();
    var20.characters(var37, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var41 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var20);
    nu.staldal.xmlutil.DocumentHandlerAdapter var42 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var41);
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "hi!");
    var45.setSystemId("");
    java.net.URL var48 = var45.getBaseURI();
    java.lang.String var51 = var45.getAttrValueOrNull("", "");
    var42.setDocumentLocator((org.xml.sax.Locator)var45);
    nu.staldal.xtree.Text var54 = new nu.staldal.xtree.Text("");
    char[] var55 = var54.asCharArray();
    char[] var56 = var54.asCharArray();
    var42.characters(var56, 100, 100);
    nu.staldal.xtree.Element var62 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var63 = var62.getLineNumber();
    var62.setPublicId("");
    int var66 = var62.getLineNumber();
    java.lang.String var68 = var62.lookupNamespacePrefix("hi_33_");
    var42.setDocumentLocator((org.xml.sax.Locator)var62);
    nu.staldal.xmlutil.ContentHandlerFixer var72 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var42, false, false);
    nu.staldal.xtree.Text var74 = new nu.staldal.xtree.Text("");
    char[] var75 = var74.asCharArray();
    var42.ignorableWhitespace(var75, 10, 1);
    var8.ignorableWhitespace(var75, 100, 1);
    nu.staldal.xtree.Element var84 = new nu.staldal.xtree.Element("hi!", "hi!");
    var84.setLine(100);
    java.lang.String var89 = var84.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: ");
    int var90 = var84.getLineNumber();
    var8.setDocumentLocator((org.xml.sax.Locator)var84);
    var8.endDocument();
    var8.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444", "nu.staldal.ftp.FTPException:  ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 100);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test310");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.core.LagoonException var9 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var0.log("4444444444", (java.lang.Throwable)var9, 100);
    java.lang.String var12 = var9.toString();
    java.lang.String var13 = var9.toString();
    java.lang.String var14 = var9.toString();
    java.lang.Throwable[] var15 = var9.getSuppressed();
    java.lang.String var16 = var9.toString();
    java.lang.String var17 = var9.toString();
    java.lang.String var18 = var9.toString();
    java.lang.String var19 = var9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var12.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var13.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var14.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var16.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var17.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var18.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var19.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test311");


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
    nu.staldal.xmlutil.ContentHandlerAdapter var25 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var15);
    nu.staldal.xtree.Text var27 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var27.setLine(1);
    char[] var30 = var27.asCharArray();
    var25.ignorableWhitespace(var30, 10, 0);
    var25.startDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.endElement("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test312");


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
    var26.setSystemId("");
    var26.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var49 = var26.getAttrValueOrNull("4444444444", "4444444444");
    java.lang.String var50 = var26.getSystemId();
    int var51 = var26.getLineNumber();
    var26.addNamespaceMapping("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var57 = var26.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: ", "4");
    var0.setDocumentLocator((org.xml.sax.Locator)var26);
    int var61 = var26.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "##########");
    
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
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + ""+ "'", var50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == (-1));

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test313");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    var0.setPassword("nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var14 = var0.getTaskType();
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var18 = new nu.staldal.ftp.FTPException("hi!");
    var15.log("", (java.lang.Throwable)var18, 10);
    org.apache.tools.ant.Location var21 = var15.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var22 = var15.getRuntimeConfigurableWrapper();
    var15.setTargetURL("4444444444");
    java.lang.String var25 = var15.getTaskName();
    java.lang.String var26 = var15.getDescription();
    var15.reconfigure();
    var15.setDescription("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    nu.staldal.ftp.FTPException var32 = new nu.staldal.ftp.FTPException("nu.staldal.ftp.FTPException: hi!");
    var15.log("4444444444", (java.lang.Throwable)var32, 1);
    nu.staldal.lagoon.LagoonAntTask var35 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var38 = new nu.staldal.ftp.FTPException("hi!");
    var35.log("", (java.lang.Throwable)var38, 10);
    java.lang.String var41 = var35.getDescription();
    nu.staldal.lagoon.LagoonAntTask var42 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var45 = new nu.staldal.ftp.FTPException("hi!");
    var42.log("", (java.lang.Throwable)var45, 10);
    org.apache.tools.ant.Location var48 = var42.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var49 = var42.getRuntimeConfigurableWrapper();
    var42.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var52 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var55 = new nu.staldal.ftp.FTPException("hi!");
    var52.log("", (java.lang.Throwable)var55, 10);
    org.apache.tools.ant.Project var58 = var52.getProject();
    nu.staldal.lagoon.util.TemplateException var60 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var61 = var60.getException();
    var52.log("", (java.lang.Throwable)var60, (-1));
    var42.bindToOwner((org.apache.tools.ant.Task)var52);
    org.apache.tools.ant.Location var65 = var52.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var66 = var52.getRuntimeConfigurableWrapper();
    var35.setRuntimeConfigurableWrapper(var66);
    var15.setRuntimeConfigurableWrapper(var66);
    var0.setRuntimeConfigurableWrapper(var66);
    java.lang.Object var70 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test314");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "__52__", 2, 100);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test315");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", " ", (-1));
    boolean var4 = var3.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var3.getAttrValue("nu.staldal.lagoon.core.LagoonException~ hi__33__", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test316");


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
    var21.processingInstruction("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var54 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var21, false, true);
    var21.skippedEntity("__32____32____32____32____32____32____32____32____32____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test317");


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
    java.lang.String var25 = var0.getEntryName();
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var28 = var0.getPosition();
    nu.staldal.lagoon.producer.BasicSplit var29 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text("hi!");
    char[] var32 = var31.asCharArray();
    var29.characters(var32, 1, 10);
    var29.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var39 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var29, true);
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
    var39.ignorableWhitespace(var78, 0, 1);
    var0.characters(var78, 0, 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var94 = new nu.staldal.xtree.Text(var78, 100, 1, false);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
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

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test318");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"+ "'", var2.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test319");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var8 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var8.endDocument();
    nu.staldal.lagoon.producer.BasicSplit var10 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("hi!");
    char[] var13 = var12.asCharArray();
    var10.characters(var13, 1, 10);
    var8.ignorableWhitespace(var13, 0, 1);
    var8.startDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.endElement("##########");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test320");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    java.lang.String var5 = var3.lookupNamespaceURI("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.removeAttribute(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test321");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ ", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ "+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ "));

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test322");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("", "nu.staldal.lagoon.core.LagoonException: 4444444444");

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test323");


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
      boolean var10 = var0.hasBeenUpdated(1433461979000L);
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

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test324");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", 0, 0);
    nu.staldal.lagoon.producer.BasicSplit var5 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var7 = new nu.staldal.xtree.Text("hi!");
    char[] var8 = var7.asCharArray();
    var5.characters(var8, 1, 10);
    var5.endElement("", "hi!", "hi!");
    var5.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var19 = new nu.staldal.xtree.Text("");
    char[] var20 = var19.asCharArray();
    char[] var21 = var19.asCharArray();
    char[] var22 = var19.asCharArray();
    var5.characters(var22, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var28 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, true, false);
    var5.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.xmlutil.ContentHandlerFixer var33 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, true);
    var4.outputStartElement((org.xml.sax.ContentHandler)var5);
    int var35 = var4.numberOfAttributes();
    nu.staldal.xtree.Element var38 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var39 = var38.getLineNumber();
    var38.setPublicId("");
    java.lang.String var44 = var38.getInheritedAttribute("", "4444444444");
    int var45 = var38.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var46 = new nu.staldal.xtree.TreeBuilder();
    var46.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var51 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var46, false, false);
    var38.toSAX((org.xml.sax.ContentHandler)var51);
    nu.staldal.xmlutil.ContentHandlerFixer var54 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var51, true);
    nu.staldal.xtree.Element var59 = new nu.staldal.xtree.Element("hi!", "", 10, 0);
    var51.setDocumentLocator((org.xml.sax.Locator)var59);
    java.lang.String var62 = var59.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________");
    var4.insertChild((nu.staldal.xtree.Node)var59, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test325");


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
    var0.endPrefixMapping("nu.staldal.ftp.FTPException:  ");

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test326");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test327");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.ftp.FTPException: 4", (-1), "nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "nu.staldal.ftp.FTPException:  ");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test328");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
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
    nu.staldal.xtree.Text var37 = new nu.staldal.xtree.Text("");
    char[] var38 = var37.asCharArray();
    char[] var39 = var37.asCharArray();
    var25.characters(var39, 100, 100);
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var46 = var45.getLineNumber();
    var45.setPublicId("");
    int var49 = var45.getLineNumber();
    java.lang.String var51 = var45.lookupNamespacePrefix("hi_33_");
    var25.setDocumentLocator((org.xml.sax.Locator)var45);
    var25.processingInstruction("", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var25.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    var25.skippedEntity("hi_33_");
    var25.endPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var63 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var25, false);
    var63.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var67 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var63, false, true);
    var2.toSAX((org.xml.sax.ContentHandler)var67);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test329");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException", 100, 100);
    var4.setPublicId("nu.staldal.lagoon.util.TemplateException: hi_33_");

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test330");


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
    var1.setLine(100);
    char[] var58 = var1.asCharArray();
    boolean var59 = var1.isWhitespaceNode();
    
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
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test331");


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
    java.lang.Throwable[] var51 = var28.getSuppressed();
    java.lang.String var52 = var28.toString();
    java.lang.String var53 = var28.toString();
    
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
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var52.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var53.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test332");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    nu.staldal.xtree.Element var14 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var17 = var14.lookupAttribute("4444444444", "hi!");
    java.lang.String var20 = var14.getInheritedAttribute("", "4444444444");
    nu.staldal.lagoon.producer.BasicSplit var21 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("hi!");
    char[] var24 = var23.asCharArray();
    var21.characters(var24, 1, 10);
    var21.endElement("", "hi!", "hi!");
    var21.processingInstruction("", "hi!");
    var21.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var21.startDocument();
    var14.outputEndElement((org.xml.sax.ContentHandler)var21);
    var0.setDocumentLocator((org.xml.sax.Locator)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var41 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test333");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    boolean var7 = var2.getPreserveSpace();
    var2.setColumn((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = var2.getAttrValue("nu.staldal.lagoon.core.LagoonException~~ ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test334");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    java.util.Enumeration var6 = var0.getParamNames();
    nu.staldal.lagoon.core.LagoonContext var7 = var0.getContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.hasBeenUpdated(1433461990000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test335");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("__32____32____32____32____32____32____32____32____32____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "__32____32____32____32____32____32____32____32____32____32__"+ "'", var1.equals("__32____32____32____32____32____32____32____32____32____32__"));

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test336");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var11.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var11.setLine(1);
    int var23 = var11.numberOfAttributes();
    var11.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.core.LagoonException~~ ");
    java.lang.String var27 = var11.getLocalName();
    java.lang.String var29 = var11.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test337");


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
    boolean var28 = var11.isWhitespaceNode();
    java.lang.String var30 = var11.lookupNamespaceURI("4444444444");
    
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
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test338");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("__52__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test339");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", "nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test340");


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
    java.lang.String var18 = var2.getTextContentOrNull();
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("hi!", "hi!");
    var21.setSystemId("");
    java.net.URL var24 = var21.getBaseURI();
    java.lang.String var27 = var21.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("hi!", "hi!");
    var30.addNamespaceMapping("", "");
    var21.addChild((nu.staldal.xtree.Node)var30);
    var21.setSystemId("");
    var21.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var44 = var21.getAttrValueOrNull("4444444444", "4444444444");
    var21.addAttribute("hi!", "hi!", "", "hi!");
    java.net.URL var50 = var21.getBaseURI();
    nu.staldal.xtree.Node var52 = var21.getChild(0);
    int var53 = var21.getLineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertChild((nu.staldal.xtree.Node)var21, 2);
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
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test341");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    nu.staldal.lagoon.core.ByteStreamProducer var1 = var0.getNext();
    var0.init();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var4 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var5 = var0.getNext();
    var0.destroy();
    nu.staldal.lagoon.core.ByteStreamProducer var7 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test342");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    org.apache.tools.ant.Project var7 = var0.getProject();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var12 = new nu.staldal.ftp.FTPException("hi!");
    var9.log("", (java.lang.Throwable)var12, 10);
    nu.staldal.lagoon.util.TemplateException var15 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var12);
    var0.log("", (java.lang.Throwable)var15, 100);
    java.lang.Throwable[] var18 = var15.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var19 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var15);
    java.lang.Exception var20 = var19.getException();
    nu.staldal.lagoon.util.TemplateException var22 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var24 = new nu.staldal.lagoon.LagoonAntTask();
    var23.bindToOwner((org.apache.tools.ant.Task)var24);
    var24.log("hi!");
    java.lang.String var28 = var24.getTaskName();
    var24.init();
    org.apache.tools.ant.Location var30 = var24.getLocation();
    var24.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var24.init();
    var24.maybeConfigure();
    org.apache.tools.ant.Project var35 = var24.getProject();
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    var36.setPassword("");
    var36.setForce(false);
    org.apache.tools.ant.Target var41 = var36.getOwningTarget();
    var36.maybeConfigure();
    var36.log("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.LagoonAntTask var45 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var48 = new nu.staldal.ftp.FTPException("hi!");
    var45.log("", (java.lang.Throwable)var48, 10);
    org.apache.tools.ant.Location var51 = var45.getLocation();
    nu.staldal.lagoon.core.LagoonException var54 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var45.log("4444444444", (java.lang.Throwable)var54, 100);
    java.lang.String var57 = var54.toString();
    java.lang.Exception var58 = var54.getException();
    var36.log((java.lang.Throwable)var54, 1);
    java.lang.Exception var61 = var54.getException();
    nu.staldal.lagoon.util.TemplateException var62 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var54);
    var24.log((java.lang.Throwable)var62, (-1));
    java.lang.Exception var65 = var62.getException();
    var22.addSuppressed((java.lang.Throwable)var62);
    java.lang.Exception var67 = var22.getException();
    var20.addSuppressed((java.lang.Throwable)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var57.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test343");


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
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test344");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.setTaskType("hi!");
    java.lang.String var8 = var1.getTaskType();
    var1.setTaskName("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var1.setForce(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test345");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    java.lang.String var2 = var0.getDescription();
    var0.reconfigure();
    var0.maybeConfigure();
    var0.setPassword("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test346");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var5 = var2.lookupAttribute("hi_33_", "hi_33_");
    boolean var6 = var2.getPreserveSpace();
    java.lang.String var7 = var2.getTextContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test347");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    java.lang.String var10 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var11 = var2.getBaseURI();
    int var12 = var2.numberOfChildren();
    var2.setPublicId("4444444444");
    java.lang.String var15 = var2.getTextContentOrNull();
    int var18 = var2.lookupAttribute("nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException", "nu.staldal.ftp.FTPException:                                                                                                     ");
    
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
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test348");


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
    var0.maybeConfigure();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test349");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var2 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var3 = var0.getNext();
    var0.init();
    var0.init();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var7 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var8 = var0.getNext();
    var0.afterBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test350");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "_32__32__32__32__32__32__32__32__32__32_");

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test351");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    int var16 = var2.numberOfAttributes();
    int var17 = var2.numberOfNamespaceMappings();
    int var18 = var2.numberOfNamespaceMappings();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test352");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    nu.staldal.lagoon.core.OutputHandler var8 = var0.createFile("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    var0.close();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    boolean var12 = var0.isReentrant();
    boolean var13 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461990000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test353");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##", 100);
    java.net.URL var4 = var3.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test354");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.setTaskType("4444444444");
    var0.maybeConfigure();
    var0.setTargetURL("");
    var0.setDescription("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var13 = var0.getTaskName();
    var0.setPassword("nu.staldal.ftp.FTPException: 4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test355");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    java.lang.String var10 = var2.getSystemId();
    var2.addNamespaceMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "hi!");
    java.lang.String var15 = var2.getAttributeLocalName((-1));
    char[] var18 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var22 = new nu.staldal.xtree.Text(var18, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var23 = new nu.staldal.xtree.TreeBuilder();
    var23.endPrefixMapping("hi!");
    var23.endDocument();
    var23.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var22.toSAX((org.xml.sax.ContentHandler)var23);
    var23.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var23.skippedEntity("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var2.outputStartElement((org.xml.sax.ContentHandler)var23);
    java.lang.String var38 = var2.getAttributeType((-1));
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test356");


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
    var25.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var25.startPrefixMapping("                                                                                                    ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var25.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test357");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    long var6 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException~~ ");
    boolean var7 = var0.needPassword();
    boolean var8 = var0.needPassword();
    boolean var9 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~ 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1433461987000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test358");


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
    java.lang.String var44 = var27.getLocalName();
    java.lang.String var45 = var27.getTextContent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var27.removeAttribute(2);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + ""+ "'", var45.equals(""));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test359");


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
    int var59 = var46.numberOfNamespaceMappings();
    var46.addAttribute("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi__33__", "nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var65 = var46.isWhitespaceNode();
    
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
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test360");


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
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    var18.bindToOwner((org.apache.tools.ant.Task)var19);
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var24 = new nu.staldal.ftp.FTPException("hi!");
    var21.log("", (java.lang.Throwable)var24, 10);
    org.apache.tools.ant.Location var27 = var21.getLocation();
    var18.setLocation(var27);
    org.apache.tools.ant.Location var29 = var18.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var30 = var18.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var30);
    java.lang.String var32 = var0.getTaskType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test361");


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
    boolean var23 = var4.getPreserveSpace();
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var31 = var28.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var32 = new nu.staldal.xtree.TreeBuilder();
    var28.toSAX((org.xml.sax.ContentHandler)var32);
    var32.skippedEntity("hi!");
    var32.skippedEntity("hi!");
    nu.staldal.xtree.Element var40 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var32.setDocumentLocator((org.xml.sax.Locator)var40);
    var32.endDocument();
    nu.staldal.xtree.Element var43 = var32.getTree();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.outputEndElement((org.xml.sax.ContentHandler)var32);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
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
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test362");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_ftp_46_FTPException_126__126__32_hi_33_"+ "'", var1.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_ftp_46_FTPException_126__126__32_hi_33_"));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test363");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var2.addAttribute("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "                                                                                                    ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test364");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var6 = var0.needPassword();
    var0.close();
    long var9 = var0.fileLastModified("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.core.OutputHandler var11 = var0.createFile("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1433461990000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test365");


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
    java.lang.String var40 = var5.getDescription();
    nu.staldal.lagoon.LagoonAntTask var41 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var44 = new nu.staldal.ftp.FTPException("hi!");
    var41.log("", (java.lang.Throwable)var44, 10);
    org.apache.tools.ant.Location var47 = var41.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var48 = var41.getRuntimeConfigurableWrapper();
    var41.setTaskType("nu.staldal.lagoon.util.TemplateException");
    java.lang.String var51 = var41.getTaskName();
    org.apache.tools.ant.Project var52 = var41.getProject();
    var5.bindToOwner((org.apache.tools.ant.Task)var41);
    var41.reconfigure();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test366");


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
    var0.endPrefixMapping("nu.staldal.ftp.FTPException~~~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test367");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    java.lang.String var10 = var2.getSystemId();
    var2.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444", "                                                                                                    ");
    java.lang.String var18 = var2.getInheritedAttribute("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.net.URL var19 = var2.getBaseURI();
    int var20 = var2.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test368");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    int var13 = var4.lookupAttribute("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException");
    boolean var14 = var4.getPreserveSpace();
    java.lang.String var15 = var4.getSystemId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test369");


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
    var22.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var57 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, false, false);
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

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test370");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    java.lang.String var6 = var0.getTaskType();
    var0.setPassword("_32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test371");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    var0.reconfigure();
    var0.setTaskType("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.setPassword("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var0.setTaskType("nu.staldal.ftp.FTPException: 4");
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test372");


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
    var0.log("");
    java.lang.String var30 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test373");


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
    var18.endPrefixMapping("##");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test374");


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
    nu.staldal.xtree.Element var55 = new nu.staldal.xtree.Element("hi!", "hi!");
    var55.setSystemId("");
    java.net.URL var58 = var55.getBaseURI();
    java.lang.String var61 = var55.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var64 = new nu.staldal.xtree.Element("hi!", "hi!");
    var64.addNamespaceMapping("", "");
    var55.addChild((nu.staldal.xtree.Node)var64);
    int var69 = var64.getColumnNumber();
    java.lang.String var71 = var64.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    int var74 = var64.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "hi_33_");
    var52.setDocumentLocator((org.xml.sax.Locator)var64);
    int var76 = var64.getLineNumber();
    java.lang.String var78 = var64.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~~ hi____33____");
    nu.staldal.xtree.ProcessingInstruction var81 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var82 = var81.getPublicId();
    java.net.URL var83 = var81.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var85 = var64.replaceChild((nu.staldal.xtree.Node)var81, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test375");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var3 = var2.getValue();
    java.lang.String var4 = var2.getTarget();
    nu.staldal.xtree.NodeWithChildren var5 = var2.getParent();
    nu.staldal.xtree.TreeBuilder var6 = new nu.staldal.xtree.TreeBuilder();
    var6.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var11 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var6, false, false);
    var6.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var6.skippedEntity("");
    var6.startPrefixMapping("4444444444", "                                                                                                    ");
    var6.endDocument();
    nu.staldal.lagoon.producer.IslandSplit var20 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var21 = var20.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var22 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var20);
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var26 = var25.getLineNumber();
    var25.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var33 = var32.getLineNumber();
    var32.addNamespaceMapping("", "");
    var25.addChild((nu.staldal.xtree.Node)var32);
    nu.staldal.xtree.NodeWithChildren var38 = var25.getParent();
    boolean var39 = var25.getPreserveSpace();
    var22.setDocumentLocator((org.xml.sax.Locator)var25);
    java.lang.String var42 = var25.lookupNamespaceURI("");
    java.lang.String var43 = var25.getSystemId();
    nu.staldal.xtree.NodeWithChildren var44 = var25.getParent();
    var25.setPublicId("4");
    var6.setDocumentLocator((org.xml.sax.Locator)var25);
    var6.startPrefixMapping(" ", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    var6.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    var6.startPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.toSAX((org.xml.sax.ContentHandler)var6);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var3.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test376");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.ContentHandlerFixer var20 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    var20.processingInstruction("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "####################################################################################################");
    nu.staldal.xtree.ProcessingInstruction var26 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var27 = var26.getValue();
    java.lang.String var29 = var26.lookupNamespacePrefix("nu.staldal.lagoon.core.AuthenticationMissingException");
    var20.setDocumentLocator((org.xml.sax.Locator)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var27.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test377");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    java.lang.String var3 = var1.getValue();
    char[] var4 = var1.asCharArray();
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var13 = new nu.staldal.xtree.TreeBuilder();
    var9.toSAX((org.xml.sax.ContentHandler)var13);
    nu.staldal.xtree.Element var15 = var13.getTree();
    var13.endPrefixMapping("hi!");
    var13.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text("");
    char[] var22 = var21.asCharArray();
    char[] var23 = var21.asCharArray();
    var13.setDocumentLocator((org.xml.sax.Locator)var21);
    var13.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    nu.staldal.xtree.Element var29 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var30 = var29.getLineNumber();
    var29.setPublicId("");
    java.lang.String var35 = var29.getInheritedAttribute("", "4444444444");
    int var36 = var29.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var37 = new nu.staldal.xtree.TreeBuilder();
    var37.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var42 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var37, false, false);
    var29.toSAX((org.xml.sax.ContentHandler)var42);
    nu.staldal.xmlutil.ContentHandlerFixer var45 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var42, true);
    nu.staldal.xtree.Element var50 = new nu.staldal.xtree.Element("hi!", "", 10, 0);
    var42.setDocumentLocator((org.xml.sax.Locator)var50);
    nu.staldal.xmlutil.ContentHandlerAdapter var52 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var42);
    nu.staldal.xtree.Text var54 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var54.setLine(1);
    char[] var57 = var54.asCharArray();
    var52.ignorableWhitespace(var57, 10, 0);
    var13.characters(var57, 2, 0);
    var1.toSAX((org.xml.sax.ContentHandler)var13);
    nu.staldal.xtree.Element var65 = var13.getTree();
    var13.endPrefixMapping("nu.staldal.ftp.FTPException~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test378");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    char[] var3 = var1.asCharArray();
    char[] var4 = var1.asCharArray();
    boolean var5 = var1.isWhitespaceNode();
    var1.setColumn(0);
    nu.staldal.lagoon.producer.BasicSplit var8 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var10 = new nu.staldal.xtree.Text("hi!");
    char[] var11 = var10.asCharArray();
    var8.characters(var11, 1, 10);
    var8.endElement("", "hi!", "hi!");
    var8.processingInstruction("", "hi!");
    var8.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var8.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var26 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    nu.staldal.xmlutil.ContentHandlerFixer var28 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8, false);
    nu.staldal.lagoon.producer.BasicSplit var29 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text("hi!");
    char[] var32 = var31.asCharArray();
    var29.characters(var32, 1, 10);
    var29.endElement("", "hi!", "hi!");
    var29.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var43 = new nu.staldal.xtree.Text("");
    char[] var44 = var43.asCharArray();
    char[] var45 = var43.asCharArray();
    char[] var46 = var43.asCharArray();
    var29.characters(var46, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var50 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var29);
    nu.staldal.xmlutil.DocumentHandlerAdapter var51 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var50);
    nu.staldal.xtree.Element var54 = new nu.staldal.xtree.Element("hi!", "hi!");
    var54.setSystemId("");
    java.net.URL var57 = var54.getBaseURI();
    java.lang.String var60 = var54.getAttrValueOrNull("", "");
    var51.setDocumentLocator((org.xml.sax.Locator)var54);
    nu.staldal.xtree.Text var63 = new nu.staldal.xtree.Text("");
    char[] var64 = var63.asCharArray();
    char[] var65 = var63.asCharArray();
    var51.characters(var65, 100, 100);
    nu.staldal.xtree.Element var71 = new nu.staldal.xtree.Element("hi!", "hi!");
    var71.setLine(100);
    nu.staldal.xtree.Element var78 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var81 = var78.lookupAttribute("4444444444", "hi!");
    var78.addNamespaceMapping("", "4444444444");
    java.lang.String var85 = var78.getTextContent();
    var71.insertChild((nu.staldal.xtree.Node)var78, 0);
    var51.setDocumentLocator((org.xml.sax.Locator)var78);
    var8.setDocumentLocator((org.xml.sax.Locator)var78);
    var1.toSAX((org.xml.sax.ContentHandler)var8);
    var8.endElement("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var97 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8, true, false);
    var8.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + ""+ "'", var85.equals(""));

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test379");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.init();
    java.lang.String var5 = var0.getEntryName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated(1433461982000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test380");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var1.setLine(1);
    java.lang.String var6 = var1.getInheritedAttribute("4444444444", "hi!");
    java.lang.String var7 = var1.getValue();
    java.lang.String var8 = var1.getValue();
    int var9 = var1.getLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var7.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var8.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test381");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    char[] var6 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var10 = new nu.staldal.xtree.Text(var6, 1, 0, false);
    var3.setDocumentLocator((org.xml.sax.Locator)var10);
    char[] var12 = var10.asCharArray();
    var10.setPublicId("");
    java.lang.String var15 = var10.getSystemId();
    boolean var16 = var10.getPreserveSpace();
    char[] var17 = var10.asCharArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text(var17, 1, (-1), true);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test382");


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
    java.lang.String var53 = var37.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test383");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException: ");
    var2.addAttribute("nu.staldal.lagoon.core.LagoonException~ 4444444444", "nu.staldal.lagoon.core.LagoonException~~ hi____33____", "nu.staldal.lagoon.core.LagoonException~~ hi____33____", "          ");
    java.net.URL var8 = var2.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test384");


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
    java.lang.String var83 = var65.lookupNamespaceURI("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test385");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var6 = var0.needPassword();
    var0.close();
    long var9 = var0.fileLastModified("nu.staldal.lagoon.util.TemplateException");
    var0.close();
    boolean var11 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1433461990000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test386");


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
    var4.endElement("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444");
    var4.skippedEntity("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test387");


    char[] var2 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text(var2, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var7 = new nu.staldal.xtree.TreeBuilder();
    var7.endPrefixMapping("hi!");
    var7.endDocument();
    var7.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var6.toSAX((org.xml.sax.ContentHandler)var7);
    boolean var15 = var6.isWhitespaceNode();
    java.lang.String var17 = var6.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: hi_33_");
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
    nu.staldal.xtree.Text var52 = new nu.staldal.xtree.Text("");
    char[] var53 = var52.asCharArray();
    char[] var54 = var52.asCharArray();
    var40.characters(var54, 100, 100);
    nu.staldal.xtree.Element var60 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var61 = var60.getLineNumber();
    var60.setPublicId("");
    int var64 = var60.getLineNumber();
    java.lang.String var66 = var60.lookupNamespacePrefix("hi_33_");
    var40.setDocumentLocator((org.xml.sax.Locator)var60);
    nu.staldal.xmlutil.ContentHandlerFixer var70 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var40, false, false);
    nu.staldal.xtree.Element var73 = new nu.staldal.xtree.Element("hi!", "hi!");
    var73.setSystemId("");
    java.net.URL var76 = var73.getBaseURI();
    java.lang.String var79 = var73.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var82 = new nu.staldal.xtree.Element("hi!", "hi!");
    var82.addNamespaceMapping("", "");
    var73.addChild((nu.staldal.xtree.Node)var82);
    int var87 = var82.getColumnNumber();
    java.lang.String var89 = var82.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    int var92 = var82.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "hi_33_");
    var70.setDocumentLocator((org.xml.sax.Locator)var82);
    var70.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    var6.toSAX((org.xml.sax.ContentHandler)var70);
    java.lang.String var98 = var6.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    boolean var99 = var6.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
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
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var99 == true);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test388");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    var0.beforeBuild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.hasBeenUpdated(1433461988000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test389");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    var2.addAttribute("", "hi!", "", "hi!");
    java.lang.String var12 = var2.getInheritedAttribute("hi!", "4444444444");
    java.lang.String var14 = var2.lookupNamespaceURI("");
    nu.staldal.xtree.ProcessingInstruction var17 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    var2.addChild((nu.staldal.xtree.Node)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var20 = var2.getAttributeNamespaceURI(10);
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
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test390");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    var0.init();
    var0.init();
    java.lang.String var5 = var0.getEntryName();
    var0.init();
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
    assertNull(var5);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test391");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    var0.init();
    var0.init();
    int var3 = var0.getPosition();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.hasBeenUpdated(1433461932000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test392");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.deleteFile("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    boolean var8 = var0.needPassword();
    var0.deleteFile("nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    nu.staldal.lagoon.core.OutputHandler var12 = var0.createFile("__32____32____32____32____32____32____32____32____32____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test393");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var3 = var1.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var4 = var1.getValue();
    boolean var5 = var1.isWhitespaceNode();
    java.net.URL var6 = var1.getBaseURI();
    java.lang.String var7 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test394");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    org.apache.tools.ant.Project var9 = var0.getProject();
    org.apache.tools.ant.Project var10 = var0.getProject();
    java.lang.Object var11 = var0.clone();
    var0.setDescription("hi!");
    var0.setPassword("nu.staldal.lagoon.util.TemplateException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test395");


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
    nu.staldal.xtree.Element var34 = var2.getFirstChildElement();
    var34.addNamespaceMapping("nu.staldal.ftp.FTPException~ hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var34.addNamespaceMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.core.AuthenticationException");
    
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
    assertNotNull(var34);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test396");


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
    int var25 = var23.numberOfChildren();
    int var28 = var23.lookupAttribute("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    var23.setColumn((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.removeAttribute(10);
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
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test397");


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
    java.lang.String var21 = var2.lookupNamespaceURI("hi__33__");
    int var22 = var2.numberOfChildren();
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
    var23.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException: ");
    var2.outputEndElement((org.xml.sax.ContentHandler)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test398");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var10 = var4.lookupNamespaceURI("4444444444");
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("4444444444");
    nu.staldal.lagoon.producer.BasicSplit var13 = new nu.staldal.lagoon.producer.BasicSplit();
    var12.toSAX((org.xml.sax.ContentHandler)var13);
    var4.outputEndElement((org.xml.sax.ContentHandler)var13);
    var13.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var17 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var13);
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("hi!", "hi!");
    var20.setSystemId("");
    java.net.URL var23 = var20.getBaseURI();
    java.lang.String var26 = var20.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var29 = new nu.staldal.xtree.Element("hi!", "hi!");
    var29.addNamespaceMapping("", "");
    var20.addChild((nu.staldal.xtree.Node)var29);
    var17.setDocumentLocator((org.xml.sax.Locator)var29);
    var17.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test399");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test400");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException", "nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException", 100, 0);
    int var5 = var4.getLineNumber();
    int var6 = var4.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test401");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.core.AuthenticationMissingException var7 = new nu.staldal.lagoon.core.AuthenticationMissingException();
    var0.log((java.lang.Throwable)var7, 10);
    var0.setDescription("4444444444");
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    var12.bindToOwner((org.apache.tools.ant.Task)var13);
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var18 = new nu.staldal.ftp.FTPException("hi!");
    var15.log("", (java.lang.Throwable)var18, 10);
    org.apache.tools.ant.Location var21 = var15.getLocation();
    var12.setLocation(var21);
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var26 = new nu.staldal.ftp.FTPException("hi!");
    var23.log("", (java.lang.Throwable)var26, 10);
    org.apache.tools.ant.Location var29 = var23.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var30 = var23.getRuntimeConfigurableWrapper();
    var12.setRuntimeConfigurableWrapper(var30);
    var0.bindToOwner((org.apache.tools.ant.Task)var12);
    java.lang.Object var33 = var0.clone();
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test402");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    java.lang.Throwable[] var12 = var8.getSuppressed();
    java.lang.Throwable[] var13 = var8.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var15 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var16 = var15.toString();
    var8.addSuppressed((java.lang.Throwable)var15);
    java.lang.String var18 = var15.toString();
    java.lang.Exception var19 = var15.getException();
    java.lang.Throwable[] var20 = var15.getSuppressed();
    java.lang.Throwable[] var21 = var15.getSuppressed();
    java.lang.String var22 = var15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var16.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var18.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var22.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test403");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_ftp_46_FTPException_126__126__32_hi_33_");

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test404");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    var0.init();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    nu.staldal.lagoon.core.LagoonContext var6 = var0.getContext();
    java.util.Enumeration var7 = var0.getParamNames();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.hasBeenUpdated(1433461931000L);
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

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test405");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    var2.setColumn((-1));
    java.net.URL var12 = var2.getBaseURI();
    java.lang.String var14 = var2.getAttrValueOrNull("_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test406");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    var3.addNamespaceMapping("nu.staldal.lagoon.core.AuthenticationException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test407");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.beforeBuild();
    var0.beforeBuild();
    java.lang.String var4 = var0.getEntryName();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated((-1L));
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test408");


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
    var2.setLine(100);
    java.lang.String var23 = var2.getAttributeValue((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var25 = var2.getAttributeNamespaceURI(0);
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
    assertNull(var23);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test409");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    nu.staldal.lagoon.LagoonAntTask var2 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    var2.bindToOwner((org.apache.tools.ant.Task)var3);
    nu.staldal.lagoon.LagoonAntTask var6 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var9 = new nu.staldal.ftp.FTPException("hi!");
    var6.log("", (java.lang.Throwable)var9, 10);
    org.apache.tools.ant.Location var12 = var6.getLocation();
    nu.staldal.lagoon.core.LagoonException var15 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var6.log("4444444444", (java.lang.Throwable)var15, 100);
    java.lang.String var18 = var15.toString();
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var22 = new nu.staldal.ftp.FTPException("hi!");
    var19.log("", (java.lang.Throwable)var22, 10);
    org.apache.tools.ant.Project var25 = var19.getProject();
    nu.staldal.lagoon.util.TemplateException var27 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var28 = var27.getException();
    var19.log("", (java.lang.Throwable)var27, (-1));
    java.lang.Throwable[] var31 = var27.getSuppressed();
    java.lang.Throwable[] var32 = var27.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var34 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var35 = var34.toString();
    var27.addSuppressed((java.lang.Throwable)var34);
    var15.addSuppressed((java.lang.Throwable)var34);
    var2.log("4444444444", (java.lang.Throwable)var34, (-1));
    java.lang.String var40 = var34.toString();
    var1.addSuppressed((java.lang.Throwable)var34);
    java.lang.Throwable[] var42 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var18.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var35.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var40.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test410");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    var4.setSystemId("hi!");
    int var8 = var4.getLineNumber();
    boolean var9 = var4.isWhitespaceNode();
    java.lang.String var10 = var4.getPublicId();
    int var13 = var4.lookupAttribute("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    var4.setLine(100);
    var4.setSystemId("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    int var18 = var4.numberOfChildren();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test411");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    nu.staldal.xtree.Element var7 = new nu.staldal.xtree.Element("hi!", "hi!");
    var7.setSystemId("");
    java.net.URL var10 = var7.getBaseURI();
    java.lang.String var13 = var7.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi!", "hi!");
    var16.addNamespaceMapping("", "");
    var7.addChild((nu.staldal.xtree.Node)var16);
    var16.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var16.setLine(1);
    java.lang.String var29 = var16.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~ ");
    var16.setLine(100);
    java.lang.String var33 = var16.lookupNamespaceURI("          ");
    var4.setDocumentLocator((org.xml.sax.Locator)var16);
    nu.staldal.xtree.Text var36 = new nu.staldal.xtree.Text("");
    char[] var37 = var36.asCharArray();
    char[] var38 = var36.asCharArray();
    var16.addChild((nu.staldal.xtree.Node)var36);
    java.lang.String var40 = var36.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + ""+ "'", var40.equals(""));

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test412");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    int var6 = var2.getLineNumber();
    java.lang.String var8 = var2.lookupNamespacePrefix("hi_33_");
    java.lang.String var11 = var2.getAttrValueOrNull("", "4444444444");
    java.lang.String var13 = var2.getAttributeNamespaceURI((-1));
    var2.setPublicId("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    java.lang.String var17 = var2.lookupNamespacePrefix("#");
    
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
    assertNull(var17);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test413");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "_52_");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test414");


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
    org.apache.tools.ant.Target var32 = var8.getOwningTarget();
    var8.setTaskType("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
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
    assertNull(var32);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test415");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setTargetURL("4444444444");
    var0.setForce(false);
    java.lang.String var12 = var0.getTaskName();
    var0.log("nu.staldal.lagoon.core.AuthenticationException", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test416");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.beforeBuild();
    var0.beforeBuild();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.hasBeenUpdated(1433461940000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test417");


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
    boolean var25 = var2.getPreserveSpace();
    java.lang.String var27 = var2.lookupNamespaceURI("nu.staldal.lagoon.util.TemplateException: hi_33_");
    
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
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test418");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    var0.init();
    java.lang.String var3 = var0.getParam("hi!");
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated(1433461967000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test419");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "hi!");
    var0.skippedEntity("nu.staldal.ftp.FTPException: hi!");
    var0.skippedEntity("nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test420");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    java.lang.Throwable[] var12 = var8.getSuppressed();
    java.lang.Throwable[] var13 = var8.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var15 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var16 = var15.toString();
    var8.addSuppressed((java.lang.Throwable)var15);
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var21 = new nu.staldal.ftp.FTPException("hi!");
    var18.log("", (java.lang.Throwable)var21, 10);
    org.apache.tools.ant.Location var24 = var18.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var25 = var18.getRuntimeConfigurableWrapper();
    var18.setForce(false);
    org.apache.tools.ant.Location var28 = var18.getLocation();
    nu.staldal.lagoon.core.LagoonException var30 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var31 = var30.toString();
    var18.log((java.lang.Throwable)var30, 100);
    var15.addSuppressed((java.lang.Throwable)var30);
    java.lang.String var35 = var30.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var16.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var31.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var35.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test421");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.maybeConfigure();
    var0.log("4444444444", 1);
    org.apache.tools.ant.Location var5 = var0.getLocation();
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
    var0.bindToOwner((org.apache.tools.ant.Task)var16);
    var0.setPassword("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    nu.staldal.lagoon.util.TemplateException var33 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    var0.log((java.lang.Throwable)var33, 100);
    
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

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test422");


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
    var23.processingInstruction("nu.staldal.lagoon.core.LagoonException~ ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var28 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var23, false);
    nu.staldal.xtree.ProcessingInstruction var31 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var32 = var31.getValue();
    java.lang.String var33 = var31.getValue();
    var31.setColumn(100);
    var31.setColumn(10);
    var23.setDocumentLocator((org.xml.sax.Locator)var31);
    int var39 = var31.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var32.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var33.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 10);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test423");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    var4.setLine((-1));
    nu.staldal.xtree.Element var9 = var4.getFirstChildElementOrNull("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var4.addNamespaceMapping("hi!", "nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    java.lang.String var14 = var4.lookupNamespaceURI("_32__32__32__32__32__32__32__32__32__32_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var17 = var4.getAttrValue("nu.staldal.ftp.FTPException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_ftp_46_FTPException_126__126__32_hi_33_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test424");


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
    nu.staldal.xmlutil.ContentHandlerFixer var48 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.startDocument();
    java.lang.String var50 = var0.getEntryName();
    var0.beforeBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var54 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, true);
    
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
    assertNull(var50);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test425");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", (-1), 100);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test426");


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
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi!", "hi!");
    var27.setLine(100);
    nu.staldal.xtree.Element var34 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var37 = var34.lookupAttribute("4444444444", "hi!");
    var34.addNamespaceMapping("", "4444444444");
    java.lang.String var41 = var34.getTextContent();
    var27.insertChild((nu.staldal.xtree.Node)var34, 0);
    int var44 = var34.numberOfNamespaceMappings();
    var34.setSystemId("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    java.net.URL var47 = var34.getBaseURI();
    var18.setDocumentLocator((org.xml.sax.Locator)var34);
    nu.staldal.xmlutil.DocumentHandlerAdapter var49 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    var18.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test427");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.producer.BasicSplit var3 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var5 = new nu.staldal.xtree.Text("hi!");
    char[] var6 = var5.asCharArray();
    var3.characters(var6, 1, 10);
    var3.endElement("", "hi!", "hi!");
    var3.processingInstruction("", "hi!");
    var3.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var3.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var21 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var3);
    var21.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var25 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var21);
    var25.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.producer.BasicSplit var29 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text("hi!");
    char[] var32 = var31.asCharArray();
    var29.characters(var32, 1, 10);
    var29.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var29.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    char[] var44 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var48 = new nu.staldal.xtree.Text(var44, 1, 0, false);
    char[] var49 = var48.asCharArray();
    var29.ignorableWhitespace(var49, 0, 10);
    var25.characters(var49, 0, 100);
    var25.startDocument();
    var25.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ");
    var2.toSAX((org.xml.sax.ContentHandler)var25);
    java.lang.String var60 = var2.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var60.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test428");


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
    nu.staldal.xtree.Element var29 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var32 = var29.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var33 = new nu.staldal.xtree.TreeBuilder();
    var29.toSAX((org.xml.sax.ContentHandler)var33);
    var33.skippedEntity("hi!");
    var33.skippedEntity("hi!");
    nu.staldal.xtree.Element var41 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var33.setDocumentLocator((org.xml.sax.Locator)var41);
    var33.startDocument();
    nu.staldal.xtree.Element var44 = var33.getTree();
    var33.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~ ");
    var33.endPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    var33.endDocument();
    var33.endDocument();
    nu.staldal.xtree.Element var54 = new nu.staldal.xtree.Element("hi!", "hi!");
    var54.setSystemId("");
    java.net.URL var57 = var54.getBaseURI();
    java.lang.String var60 = var54.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var63 = new nu.staldal.xtree.Element("hi!", "hi!");
    var63.addNamespaceMapping("", "");
    var54.addChild((nu.staldal.xtree.Node)var63);
    int var68 = var63.getColumnNumber();
    java.net.URL var69 = var63.getBaseURI();
    int var70 = var63.numberOfNamespaceMappings();
    var33.setDocumentLocator((org.xml.sax.Locator)var63);
    var33.endDocument();
    var33.startPrefixMapping("aa", "aa");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.toSAX((org.xml.sax.ContentHandler)var33);
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
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 1);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test429");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~~ ");
    var0.deleteFile("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");
    boolean var11 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test430");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    java.lang.String var7 = var0.getEntryName();
    var0.afterBuild();
    boolean var10 = var0.hasBeenUpdated(10L);
    var0.afterBuild();
    boolean var13 = var0.hasBeenUpdated(1433461941000L);
    boolean var15 = var0.hasBeenUpdated(10L);
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
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test431");


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
    var1.setPassword("nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    
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

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test432");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException"+ "'", var1.equals("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException"));

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test433");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    nu.staldal.xmlutil.ContentHandlerAdapter var11 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.endElement("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test434");


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
    java.lang.String var29 = var0.getParam("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var31 = var0.getParam("nu.staldal.lagoon.core.LagoonException: hi_33_");
    nu.staldal.xtree.Text var33 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var33.setLine(1);
    char[] var36 = var33.asCharArray();
    var0.characters(var36, 2, (-1));
    var0.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____", "##");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test435");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test436");


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
    java.lang.String var59 = var42.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~ ");
    boolean var60 = var42.getPreserveSpace();
    nu.staldal.xtree.Element var63 = new nu.staldal.xtree.Element("hi!", "hi!");
    var63.setSystemId("");
    java.net.URL var66 = var63.getBaseURI();
    java.lang.String var69 = var63.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var72 = new nu.staldal.xtree.Element("hi!", "hi!");
    var72.addNamespaceMapping("", "");
    var63.addChild((nu.staldal.xtree.Node)var72);
    var63.setSystemId("");
    java.lang.String var79 = var63.getPublicId();
    int var80 = var63.getColumnNumber();
    nu.staldal.xtree.Element var81 = var63.getFirstChildElementOrNull();
    var42.addChild((nu.staldal.xtree.Node)var63);
    int var85 = var42.lookupAttribute("####################################################################################################", "nu.staldal.lagoon.core.LagoonException~~ hi____33____");
    int var86 = var42.getColumnNumber();
    
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
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == (-1));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test437");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    var0.deleteFile("hi!");
    boolean var9 = var0.isReentrant();
    nu.staldal.lagoon.core.OutputHandler var11 = var0.createFile("nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test438");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("aa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "aa"+ "'", var1.equals("aa"));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test439");


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
    var5.setSystemId("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!");
    int var28 = var5.lookupAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu__46__staldal__46__ftp__46__FTPException__126____32__hi__33__");
    
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
    assertTrue(var28 == (-1));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test440");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444", 0, 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var4.getAttrValue("nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", "nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test441");


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
    org.apache.tools.ant.Target var28 = var0.getOwningTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test442");


    char[] var2 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text(var2, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var7 = new nu.staldal.xtree.TreeBuilder();
    var7.endPrefixMapping("hi!");
    var7.endDocument();
    var7.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var6.toSAX((org.xml.sax.ContentHandler)var7);
    var7.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var7);
    nu.staldal.xtree.Element var23 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var24 = var23.getFirstChildElementOrNull();
    int var27 = var23.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var29 = var23.lookupNamespaceURI("4444444444");
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text("4444444444");
    nu.staldal.lagoon.producer.BasicSplit var32 = new nu.staldal.lagoon.producer.BasicSplit();
    var31.toSAX((org.xml.sax.ContentHandler)var32);
    var23.outputEndElement((org.xml.sax.ContentHandler)var32);
    var7.setDocumentLocator((org.xml.sax.Locator)var23);
    var23.addNamespaceMapping("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test443");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    nu.staldal.lagoon.core.LagoonContext var1 = var0.getContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.hasBeenUpdated(1433461983000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test444");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    var0.destroy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.hasBeenUpdated(1433461963000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test445");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    var2.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var8 = var2.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test446");


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
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ hi____33____");
    var0.startPrefixMapping("a", "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    
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

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test447");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.ftp.FTPException~~ hi!");
    nu.staldal.lagoon.util.TemplateException var2 = new nu.staldal.lagoon.util.TemplateException();
    nu.staldal.lagoon.util.TemplateException var3 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var2);
    nu.staldal.lagoon.core.LagoonException var5 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.util.TemplateException: ");
    var3.addSuppressed((java.lang.Throwable)var5);
    java.lang.Exception var7 = var5.getException();
    nu.staldal.ftp.FTPException var9 = new nu.staldal.ftp.FTPException("nu.staldal.lagoon.util.TemplateException: ");
    java.lang.Throwable[] var10 = var9.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var11 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var9);
    var5.addSuppressed((java.lang.Throwable)var11);
    var1.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var14 = var11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var14.equals("nu.staldal.lagoon.util.TemplateException"));

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test448");


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
    var22.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_");
    
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

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test449");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var2 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var0.afterBuild();
    int var4 = var0.getPosition();
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var7.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var12 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var7, false, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test450");


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
    java.lang.String var30 = var0.getParam("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var34 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.producer.BasicSplit var38 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var40 = new nu.staldal.xtree.Text("hi!");
    char[] var41 = var40.asCharArray();
    var38.characters(var41, 1, 10);
    var38.endElement("", "hi!", "hi!");
    var38.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var52 = new nu.staldal.xtree.Text("");
    char[] var53 = var52.asCharArray();
    char[] var54 = var52.asCharArray();
    char[] var55 = var52.asCharArray();
    var38.characters(var55, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var59 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var38);
    nu.staldal.xmlutil.DocumentHandlerAdapter var60 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var59);
    nu.staldal.xtree.Element var63 = new nu.staldal.xtree.Element("hi!", "hi!");
    var63.setSystemId("");
    java.net.URL var66 = var63.getBaseURI();
    java.lang.String var69 = var63.getAttrValueOrNull("", "");
    var60.setDocumentLocator((org.xml.sax.Locator)var63);
    var60.startDocument();
    var60.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.producer.IslandSplit var74 = new nu.staldal.lagoon.producer.IslandSplit();
    var74.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var77 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var74, true);
    char[] var80 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var84 = new nu.staldal.xtree.Text(var80, 1, 0, false);
    var77.setDocumentLocator((org.xml.sax.Locator)var84);
    java.lang.String var87 = var84.lookupNamespacePrefix("                                                                                                    ");
    var60.setDocumentLocator((org.xml.sax.Locator)var84);
    var37.addChild((nu.staldal.xtree.Node)var84);
    char[] var90 = var84.asCharArray();
    char[] var91 = var84.asCharArray();
    var34.ignorableWhitespace(var91, 2, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test451");


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
    boolean var33 = var2.getPreserveSpace();
    nu.staldal.xtree.Element var34 = var2.getFirstChildElement();
    java.lang.String var36 = var34.lookupNamespaceURI("aaaaaaaaaa");
    boolean var37 = var34.getPreserveSpace();
    
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
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test452");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    java.lang.String var6 = var0.getTaskType();
    var0.log("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
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
    var18.log("hi!");
    org.apache.tools.ant.RuntimeConfigurable var30 = var18.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test453");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xtree.Element var8 = new nu.staldal.xtree.Element("", "hi!", 10);
    var8.setSystemId("hi!");
    java.lang.String var11 = var8.getSystemId();
    var4.setDocumentLocator((org.xml.sax.Locator)var8);
    nu.staldal.xmlutil.ContentHandlerFixer var15 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4, false, true);
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("hi!", "hi!");
    var18.setLine(100);
    java.lang.String var22 = var18.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var25 = var18.lookupAttribute("hi!", "");
    int var28 = var18.lookupAttribute("                                                                                                    ", "nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.xtree.Element var31 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var32 = var31.getLineNumber();
    var31.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var38 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var39 = var38.getLineNumber();
    var38.addNamespaceMapping("", "");
    var31.addChild((nu.staldal.xtree.Node)var38);
    nu.staldal.xtree.NodeWithChildren var44 = var31.getParent();
    boolean var45 = var31.getPreserveSpace();
    var31.setPublicId("4444444444");
    nu.staldal.xtree.Element var48 = var31.getFirstChildElement();
    var18.addChild((nu.staldal.xtree.Node)var48);
    nu.staldal.xtree.Element var50 = var18.getFirstChildElement();
    var4.setDocumentLocator((org.xml.sax.Locator)var50);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var53 = var50.removeChild(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test454");


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
    java.lang.String var59 = var42.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~ ");
    boolean var60 = var42.getPreserveSpace();
    nu.staldal.xtree.Element var63 = new nu.staldal.xtree.Element("hi!", "hi!");
    var63.setSystemId("");
    java.net.URL var66 = var63.getBaseURI();
    java.lang.String var69 = var63.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var72 = new nu.staldal.xtree.Element("hi!", "hi!");
    var72.addNamespaceMapping("", "");
    var63.addChild((nu.staldal.xtree.Node)var72);
    var63.setSystemId("");
    java.lang.String var79 = var63.getPublicId();
    int var80 = var63.getColumnNumber();
    nu.staldal.xtree.Element var81 = var63.getFirstChildElementOrNull();
    var42.addChild((nu.staldal.xtree.Node)var63);
    int var85 = var42.lookupAttribute("####################################################################################################", "nu.staldal.lagoon.core.LagoonException~~ hi____33____");
    java.lang.String var86 = var42.getLocalName();
    boolean var87 = var42.getPreserveSpace();
    
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
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var86 + "' != '" + "hi!"+ "'", var86.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == false);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test455");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    org.apache.tools.ant.Target var8 = var0.getOwningTarget();
    var0.setTaskName("nu.staldal.lagoon.core.LagoonException~ 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test456");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    var2.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: ", "hi!");
    java.lang.String var10 = var2.getNamespaceURI();
    nu.staldal.xtree.TreeBuilder var11 = new nu.staldal.xtree.TreeBuilder();
    var11.endPrefixMapping("hi!");
    var11.endDocument();
    var11.startDocument();
    var11.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "hi!");
    var11.skippedEntity("nu.staldal.ftp.FTPException: hi!");
    var2.toSAX((org.xml.sax.ContentHandler)var11);
    java.lang.String var22 = var2.getPublicId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test457");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    var9.addNamespaceMapping("", "4444444444");
    java.lang.String var16 = var9.getTextContent();
    var2.insertChild((nu.staldal.xtree.Node)var9, 0);
    int var19 = var9.numberOfNamespaceMappings();
    var9.setSystemId("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    nu.staldal.xtree.NodeWithChildren var22 = var9.getParent();
    boolean var23 = var22.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test458");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xtree.Element var8 = new nu.staldal.xtree.Element("", "hi!", 10);
    var8.setSystemId("hi!");
    java.lang.String var11 = var8.getSystemId();
    var4.setDocumentLocator((org.xml.sax.Locator)var8);
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4, false);
    nu.staldal.xmlutil.ContentHandlerAdapter var15 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var4);
    nu.staldal.xmlutil.ContentHandlerFixer var16 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4);
    var16.endPrefixMapping("          ");
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("hi!", "hi!");
    var21.setSystemId("");
    java.net.URL var24 = var21.getBaseURI();
    java.lang.String var27 = var21.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("hi!", "hi!");
    var30.addNamespaceMapping("", "");
    var21.addChild((nu.staldal.xtree.Node)var30);
    java.lang.String var37 = var30.getInheritedAttribute("", "hi!");
    int var38 = var30.getColumnNumber();
    java.lang.String var39 = var30.getNamespaceURI();
    int var42 = var30.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var16.setDocumentLocator((org.xml.sax.Locator)var30);
    nu.staldal.xmlutil.ContentHandlerFixer var45 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var16, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "hi!"+ "'", var39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test459");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.hasBeenUpdated(1433461966000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test460");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var3 = var2.getPreserveSpace();
    var2.addAttribute("hi_33_", "nu.staldal.lagoon.core.LagoonException: ", "4444444444", "4444444444");
    var2.addNamespaceMapping("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    java.lang.String var12 = var2.getLocalName();
    java.net.URL var13 = var2.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test461");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    var9.addNamespaceMapping("", "4444444444");
    java.lang.String var16 = var9.getTextContent();
    var2.insertChild((nu.staldal.xtree.Node)var9, 0);
    boolean var19 = var9.getPreserveSpace();
    java.lang.String var20 = var9.getTextContentOrNull();
    int var23 = var9.lookupAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test462");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    int var11 = var0.getPosition();
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
    assertTrue(var11 == 0);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test463");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.AuthenticationMissingException", "");
    boolean var3 = var2.isWhitespaceNode();
    var2.setPublicId("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!");
    java.lang.String var6 = var2.getTarget();
    boolean var7 = var2.isWhitespaceNode();
    nu.staldal.lagoon.producer.BasicSplit var8 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var10 = new nu.staldal.xtree.Text("hi!");
    char[] var11 = var10.asCharArray();
    var8.characters(var11, 1, 10);
    var8.endElement("", "hi!", "hi!");
    var8.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var22 = new nu.staldal.xtree.Text("");
    char[] var23 = var22.asCharArray();
    char[] var24 = var22.asCharArray();
    char[] var25 = var22.asCharArray();
    var8.characters(var25, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var29 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    nu.staldal.xmlutil.DocumentHandlerAdapter var30 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var29);
    nu.staldal.xtree.Element var33 = new nu.staldal.xtree.Element("hi!", "hi!");
    var33.setSystemId("");
    java.net.URL var36 = var33.getBaseURI();
    java.lang.String var39 = var33.getAttrValueOrNull("", "");
    var30.setDocumentLocator((org.xml.sax.Locator)var33);
    nu.staldal.xtree.Text var42 = new nu.staldal.xtree.Text("");
    char[] var43 = var42.asCharArray();
    char[] var44 = var42.asCharArray();
    var30.characters(var44, 100, 100);
    nu.staldal.xtree.Element var50 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var51 = var50.getLineNumber();
    var50.setPublicId("");
    int var54 = var50.getLineNumber();
    java.lang.String var56 = var50.lookupNamespacePrefix("hi_33_");
    var30.setDocumentLocator((org.xml.sax.Locator)var50);
    nu.staldal.lagoon.producer.BasicSplit var58 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var60 = new nu.staldal.xtree.Text("hi!");
    char[] var61 = var60.asCharArray();
    var58.characters(var61, 1, 10);
    var58.endElement("", "hi!", "hi!");
    var58.processingInstruction("", "hi!");
    var58.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    char[] var77 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var81 = new nu.staldal.xtree.Text(var77, 1, 0, false);
    var58.characters(var77, 1, (-1));
    var30.ignorableWhitespace(var77, 1, 0);
    var30.processingInstruction("          ", "                                                                                                    ");
    var2.toSAX((org.xml.sax.ContentHandler)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "nu.staldal.lagoon.core.AuthenticationMissingException"+ "'", var6.equals("nu.staldal.lagoon.core.AuthenticationMissingException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test464");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    var0.afterBuild();
    java.util.Enumeration var2 = var0.getParamNames();
    var0.afterBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test465");


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
    int var21 = var2.getColumnNumber();
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
    var2.outputStartElement((org.xml.sax.ContentHandler)var22);
    nu.staldal.lagoon.core.XMLStreamProducer var44 = var22.getNext();
    nu.staldal.lagoon.core.XMLStreamProducer var45 = var22.getNext();
    var22.endElement("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!");
    var52.setSystemId("");
    java.net.URL var55 = var52.getBaseURI();
    java.lang.String var58 = var52.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var61 = new nu.staldal.xtree.Element("hi!", "hi!");
    var61.addNamespaceMapping("", "");
    var52.addChild((nu.staldal.xtree.Node)var61);
    var52.setSystemId("");
    var52.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "a");
    java.lang.String var72 = var52.lookupNamespaceURI("nu.staldal.ftp.FTPException:  ");
    var22.setDocumentLocator((org.xml.sax.Locator)var52);
    
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
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test466");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var75 = var56.getFirstChildElement("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:                                                                                                     ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test467");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var17 = var11.getAttrValueOrNull("4444444444");
    java.lang.String var19 = var11.lookupNamespaceURI("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var22 = var11.getInheritedAttribute("nu.staldal.ftp.FTPException~~~~ hi!", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test468");


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
    nu.staldal.xmlutil.ContentHandlerAdapter var25 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var15);
    nu.staldal.xtree.Text var27 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var27.setLine(1);
    char[] var30 = var27.asCharArray();
    var25.ignorableWhitespace(var30, 10, 0);
    var25.endDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.endElement("nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test469");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    var0.startPrefixMapping("4444444444", "                                                                                                    ");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    nu.staldal.xtree.Element var17 = new nu.staldal.xtree.Element("hi!", "hi!");
    var17.setSystemId("");
    java.net.URL var20 = var17.getBaseURI();
    java.lang.String var23 = var17.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("hi!", "hi!");
    var26.addNamespaceMapping("", "");
    var17.addChild((nu.staldal.xtree.Node)var26);
    var17.setSystemId("");
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var36 = var35.getLineNumber();
    var35.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var43 = var42.getLineNumber();
    var42.addNamespaceMapping("", "");
    var35.addChild((nu.staldal.xtree.Node)var42);
    var17.insertChild((nu.staldal.xtree.Node)var35, 0);
    java.lang.String var51 = var17.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var54 = var17.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var55 = var17.getNamespaceURI();
    java.lang.String var57 = var17.getAttributeType((-1));
    var0.setDocumentLocator((org.xml.sax.Locator)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.removeAttribute(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "hi!"+ "'", var55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test470");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test471");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("hi_33_", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var3 = var2.getTarget();
    java.lang.String var4 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi_33_"+ "'", var3.equals("hi_33_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test472");


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
    nu.staldal.xmlutil.ContentHandlerFixer var64 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    var64.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var64.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    
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

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test473");


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
    var9.log("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", 0);
    org.apache.tools.ant.Location var30 = var9.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test474");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    var0.init();
    var0.beforeBuild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.hasBeenUpdated(1433461947000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test475");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.util.TemplateException var2 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test476");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    var0.setTargetURL("nu.staldal.lagoon.util.TemplateException");
    var0.setTaskName("hi!");
    var0.setTargetURL("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    org.apache.tools.ant.Target var8 = var0.getOwningTarget();
    var0.log("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!", 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test477");


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
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test478");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.endElement("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "####################################################################################################", "");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test479");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.init();
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var8 = new nu.staldal.lagoon.LagoonAntTask();
    var7.bindToOwner((org.apache.tools.ant.Task)var8);
    var7.setForce(true);
    java.lang.String var12 = var7.getTaskName();
    var7.setTaskType("4444444444");
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var16 = new nu.staldal.lagoon.LagoonAntTask();
    var15.bindToOwner((org.apache.tools.ant.Task)var16);
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var21 = new nu.staldal.ftp.FTPException("hi!");
    var18.log("", (java.lang.Throwable)var21, 10);
    org.apache.tools.ant.Location var24 = var18.getLocation();
    var15.setLocation(var24);
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    var26.bindToOwner((org.apache.tools.ant.Task)var27);
    var26.setForce(true);
    java.lang.String var31 = var26.getTaskName();
    var26.setTaskType("4444444444");
    var26.maybeConfigure();
    var15.bindToOwner((org.apache.tools.ant.Task)var26);
    var7.bindToOwner((org.apache.tools.ant.Task)var26);
    org.apache.tools.ant.Location var37 = var7.getLocation();
    java.lang.String var38 = var7.getTaskType();
    java.lang.String var39 = var7.getDescription();
    org.apache.tools.ant.Location var40 = var7.getLocation();
    var7.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", (-1));
    nu.staldal.lagoon.LagoonAntTask var44 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var45 = var44.getDescription();
    java.lang.String var46 = var44.getDescription();
    nu.staldal.lagoon.LagoonAntTask var47 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var48 = new nu.staldal.lagoon.LagoonAntTask();
    var47.bindToOwner((org.apache.tools.ant.Task)var48);
    var47.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var52 = new nu.staldal.lagoon.LagoonAntTask();
    var52.setPassword("");
    var47.bindToOwner((org.apache.tools.ant.Task)var52);
    org.apache.tools.ant.Project var56 = var47.getProject();
    org.apache.tools.ant.Project var57 = var47.getProject();
    org.apache.tools.ant.RuntimeConfigurable var58 = var47.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Location var59 = var47.getLocation();
    var44.setLocation(var59);
    var7.setLocation(var59);
    var1.setLocation(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "4444444444"+ "'", var38.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test480");


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
    var0.endElement("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_", "nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    nu.staldal.lagoon.core.LagoonContext var67 = var0.getContext();
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: hi_33_");
    var0.skippedEntity("nu.staldal.ftp.FTPException~ hi!");
    
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
    assertNull(var67);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test481");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var5 = var2.lookupAttribute("hi_33_", "hi_33_");
    var2.setPublicId("");
    java.lang.String var9 = var2.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException~ ");
    int var12 = var2.lookupAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test482");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.util.TemplateException: ", "hi_33_");
    nu.staldal.lagoon.producer.BasicSplit var3 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var5 = new nu.staldal.xtree.Text("hi!");
    char[] var6 = var5.asCharArray();
    var3.characters(var6, 1, 10);
    var3.startDocument();
    nu.staldal.xtree.ProcessingInstruction var13 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var14 = var13.getPublicId();
    java.lang.String var17 = var13.getInheritedAttribute("", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var3.setDocumentLocator((org.xml.sax.Locator)var13);
    var2.toSAX((org.xml.sax.ContentHandler)var3);
    java.net.URL var20 = var2.getBaseURI();
    nu.staldal.lagoon.producer.BasicSplit var21 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("hi!");
    char[] var24 = var23.asCharArray();
    var21.characters(var24, 1, 10);
    var21.endElement("", "hi!", "hi!");
    var21.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var34 = new nu.staldal.lagoon.producer.IslandSplit();
    var34.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var37 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var34, true);
    char[] var40 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var44 = new nu.staldal.xtree.Text(var40, 1, 0, false);
    var37.setDocumentLocator((org.xml.sax.Locator)var44);
    char[] var46 = var44.asCharArray();
    var21.characters(var46, 10, 0);
    var21.processingInstruction("hi!", "hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var53 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var21);
    var2.toSAX((org.xml.sax.ContentHandler)var21);
    java.lang.String var56 = var21.getParam("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test483");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", 100, "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu__46__staldal__46__lagoon__46__util__46__TemplateException", "nu.staldal.lagoon.core.LagoonException: hi_33_");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test484");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", (-1), (-1));
    int var5 = var4.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test485");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    var2.setSystemId("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    java.lang.String var12 = var2.getAttrValueOrNull("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_", "nu.staldal.ftp.FTPException~~~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test486");


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
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var24 = new nu.staldal.lagoon.LagoonAntTask();
    var23.bindToOwner((org.apache.tools.ant.Task)var24);
    var23.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    var28.setPassword("");
    var23.bindToOwner((org.apache.tools.ant.Task)var28);
    org.apache.tools.ant.Project var32 = var23.getProject();
    org.apache.tools.ant.Project var33 = var23.getProject();
    org.apache.tools.ant.Location var34 = var23.getLocation();
    var10.setLocation(var34);
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
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test487");


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
    nu.staldal.xtree.Node var51 = var33.removeChild(0);
    var33.setSystemId("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!");
    
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
    assertNotNull(var51);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test488");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi____33____", "aaaaaaaaaa");

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test489");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.startPrefixMapping("                                                                                                    ", "nu.staldal.lagoon.util.TemplateException: ");
    var0.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.processingInstruction("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test490");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("hi!", "hi!");
    var10.setLine(100);
    int var13 = var10.numberOfNamespaceMappings();
    var0.setDocumentLocator((org.xml.sax.Locator)var10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
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

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test491");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.ftp.FTPException~~ hi!");
    java.lang.String var2 = var1.toString();
    java.lang.Throwable[] var3 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!"+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test492");


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
    nu.staldal.xmlutil.ContentHandlerFixer var48 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var48.processingInstruction("nu.staldal.lagoon.core.LagoonException: hi_33_", "nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
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

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test493");


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
    nu.staldal.xmlutil.ContentHandlerFixer var29 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test494");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    nu.staldal.lagoon.core.OutputHandler var8 = var0.createFile("4444444444");
    boolean var9 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461991000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test495");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    java.lang.String var10 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var11 = var2.getBaseURI();
    int var12 = var2.numberOfChildren();
    nu.staldal.xtree.Element var15 = new nu.staldal.xtree.Element("hi!", "hi!");
    var15.setSystemId("");
    java.net.URL var18 = var15.getBaseURI();
    java.lang.String var21 = var15.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.addNamespaceMapping("", "");
    var15.addChild((nu.staldal.xtree.Node)var24);
    var15.setSystemId("");
    var15.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var38 = var15.getAttrValueOrNull("4444444444", "4444444444");
    java.lang.String var39 = var15.getSystemId();
    int var40 = var15.getLineNumber();
    var15.addNamespaceMapping("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var45 = var15.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var46 = var15.getPreserveSpace();
    var2.addChild((nu.staldal.xtree.Node)var15);
    int var48 = var2.getLineNumber();
    
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + ""+ "'", var39.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test496");


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
    java.lang.String var91 = var44.toString();
    
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
    assertTrue("'" + var91 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var91.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test497");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.lang.String var6 = var3.getSystemId();
    int var7 = var3.getColumnNumber();
    java.lang.String var9 = var3.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.removeAttribute(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test498");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var12 = var0.hasBeenUpdated(1433461987000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test499");


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
    var20.startDocument();
    var20.startPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException~~ ");
    var20.startPrefixMapping("nu.staldal.ftp.FTPException:                                                                                                     ", "_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest9.test500");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    var9.addNamespaceMapping("", "4444444444");
    java.lang.String var16 = var9.getTextContent();
    var2.insertChild((nu.staldal.xtree.Node)var9, 0);
    java.net.URL var19 = var2.getBaseURI();
    java.lang.String var21 = var2.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var2.setColumn(100);
    int var24 = var2.getLineNumber();
    var2.setPublicId("44");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var28 = var2.getAttributeLocalName(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100);

  }

}
