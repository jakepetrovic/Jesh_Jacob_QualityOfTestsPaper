package randoop;

import junit.framework.*;

public class RandoopTest22 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test1");


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
    var8.endDocument();
    nu.staldal.lagoon.producer.BasicSplit var18 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var20 = new nu.staldal.xtree.Text("hi!");
    char[] var21 = var20.asCharArray();
    var18.characters(var21, 1, 10);
    var18.endElement("", "hi!", "hi!");
    var18.processingInstruction("", "hi!");
    var18.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var18.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var36 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var18);
    var36.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("hi!", "hi!");
    var42.setLine(100);
    java.lang.String var46 = var42.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.net.URL var47 = var42.getBaseURI();
    var36.setDocumentLocator((org.xml.sax.Locator)var42);
    nu.staldal.lagoon.producer.BasicSplit var49 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var51 = new nu.staldal.xtree.Text("hi!");
    char[] var52 = var51.asCharArray();
    var49.characters(var52, 1, 10);
    var49.endElement("", "hi!", "hi!");
    var49.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var62 = new nu.staldal.lagoon.producer.IslandSplit();
    var62.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var65 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var62, true);
    char[] var68 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var72 = new nu.staldal.xtree.Text(var68, 1, 0, false);
    var65.setDocumentLocator((org.xml.sax.Locator)var72);
    char[] var74 = var72.asCharArray();
    var49.characters(var74, 10, 0);
    var36.characters(var74, (-1), 100);
    nu.staldal.xmlutil.DocumentHandlerAdapter var81 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var36);
    var81.startDocument();
    nu.staldal.xtree.Text var84 = new nu.staldal.xtree.Text("");
    char[] var85 = var84.asCharArray();
    char[] var86 = var84.asCharArray();
    char[] var87 = var84.asCharArray();
    char[] var88 = var84.asCharArray();
    java.lang.String var89 = var84.getSystemId();
    char[] var90 = var84.asCharArray();
    var81.characters(var90, 1, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.characters(var90, 100, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test2");


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
    var0.reconfigure();
    
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

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test3");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_", "nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_", (-1));
    var3.setLine(0);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test4");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    java.lang.String var7 = var0.getTaskName();
    var0.log("nu__46__staldal__46__lagoon__46__util__46__TemplateException__126____32__", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test5");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xtree.Element var8 = new nu.staldal.xtree.Element("", "hi!", 10);
    var8.setSystemId("hi!");
    java.lang.String var11 = var8.getSystemId();
    var4.setDocumentLocator((org.xml.sax.Locator)var8);
    var8.setLine(100);
    java.lang.String var15 = var8.getTextContentOrNull();
    java.net.URL var16 = var8.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test6");


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
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var18 = new nu.staldal.ftp.FTPException("hi!");
    var15.log("", (java.lang.Throwable)var18, 10);
    org.apache.tools.ant.Project var21 = var15.getProject();
    nu.staldal.lagoon.util.TemplateException var23 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var24 = var23.getException();
    var15.log("", (java.lang.Throwable)var23, (-1));
    var5.log((java.lang.Throwable)var23, 100);
    var5.setPassword("_32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test7");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xtree.Element var8 = new nu.staldal.xtree.Element("", "hi!", 10);
    var8.setSystemId("hi!");
    java.lang.String var11 = var8.getSystemId();
    var4.setDocumentLocator((org.xml.sax.Locator)var8);
    var8.setLine(100);
    nu.staldal.xtree.Element var15 = var8.getFirstChildElementOrNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test8");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.BasicSplit var3 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var5 = new nu.staldal.xtree.Text("hi!");
    char[] var6 = var5.asCharArray();
    var3.characters(var6, 1, 10);
    var3.endElement("", "hi!", "hi!");
    var3.processingInstruction("", "hi!");
    var3.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var3.startDocument();
    var3.skippedEntity("4444444444");
    java.util.Enumeration var23 = var3.getParamNames();
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("hi!", "hi!");
    var26.setSystemId("");
    java.net.URL var29 = var26.getBaseURI();
    java.lang.String var32 = var26.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("hi!", "hi!");
    var35.addNamespaceMapping("", "");
    var26.addChild((nu.staldal.xtree.Node)var35);
    int var40 = var35.getColumnNumber();
    java.lang.String var42 = var35.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var35.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var3.setDocumentLocator((org.xml.sax.Locator)var35);
    nu.staldal.xtree.ProcessingInstruction var51 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.util.TemplateException: ", "hi_33_");
    boolean var52 = var51.getPreserveSpace();
    var3.setDocumentLocator((org.xml.sax.Locator)var51);
    var2.toSAX((org.xml.sax.ContentHandler)var3);
    java.lang.String var55 = var2.getTarget();
    java.lang.String var57 = var2.lookupNamespacePrefix("nu.staldal.ftp.FTPException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var55.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test9");


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
    java.net.URL var45 = var14.getBaseURI();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test10");


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
    java.lang.String var19 = var2.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_aa");
    nu.staldal.xtree.Element var22 = var2.getFirstChildElementOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test11");


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
    nu.staldal.xmlutil.ContentHandlerAdapter var38 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var38.startDocument();
    nu.staldal.xtree.TreeBuilder var40 = new nu.staldal.xtree.TreeBuilder();
    var40.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var45 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var40, false, false);
    nu.staldal.xtree.Element var48 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var45.setDocumentLocator((org.xml.sax.Locator)var48);
    nu.staldal.xtree.Text var51 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException~~ ");
    char[] var52 = var51.asCharArray();
    var45.characters(var52, 10, 1);
    var38.characters(var52, 0, 2);
    
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
    assertNotNull(var52);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test12");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    var1.log("hi!", 100);
    var1.maybeConfigure();
    java.lang.String var9 = var1.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test13");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.AuthenticationMissingException", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationException", 2, 100);
    java.lang.String var5 = var4.getTextContent();
    nu.staldal.xtree.Text var7 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var9 = var7.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    char[] var10 = var7.asCharArray();
    java.lang.String var11 = var7.getValue();
    nu.staldal.lagoon.producer.BasicSplit var12 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("hi!");
    char[] var15 = var14.asCharArray();
    var12.characters(var15, 1, 10);
    var12.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var12.skippedEntity("hi!");
    var12.processingInstruction("nu.staldal.ftp.FTPException: hi!", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    var7.toSAX((org.xml.sax.ContentHandler)var12);
    nu.staldal.xmlutil.ContentHandlerFixer var27 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var12);
    var4.toSAX((org.xml.sax.ContentHandler)var12);
    var12.endElement("nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", "nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var11.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test14");


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
    var18.processingInstruction("nu.staldal.ftp.FTPException~ hi!", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var18.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.LagoonException~ ");
    var18.startDocument();
    
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

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test15");


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
    var0.startDocument();
    nu.staldal.lagoon.producer.IslandSplit var19 = new nu.staldal.lagoon.producer.IslandSplit();
    var19.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var23 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var19, false, false);
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("", "hi!", 10);
    var27.setSystemId("hi!");
    java.lang.String var30 = var27.getSystemId();
    var23.setDocumentLocator((org.xml.sax.Locator)var27);
    var27.addAttribute("nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.util.TemplateException: ", "nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________");
    int var37 = var27.numberOfChildren();
    java.lang.String var38 = var27.getLocalName();
    var27.setPublicId("          ");
    var0.setDocumentLocator((org.xml.sax.Locator)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test16");


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
    nu.staldal.lagoon.util.TemplateException var16 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var11);
    java.lang.String var17 = var11.toString();
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var21 = new nu.staldal.ftp.FTPException("hi!");
    var18.log("", (java.lang.Throwable)var21, 10);
    org.apache.tools.ant.Location var24 = var18.getLocation();
    nu.staldal.lagoon.core.LagoonException var27 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var18.log("4444444444", (java.lang.Throwable)var27, 100);
    org.apache.tools.ant.RuntimeConfigurable var30 = var18.getRuntimeConfigurableWrapper();
    nu.staldal.lagoon.LagoonAntTask var31 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var34 = new nu.staldal.ftp.FTPException("hi!");
    var31.log("", (java.lang.Throwable)var34, 10);
    org.apache.tools.ant.Project var37 = var31.getProject();
    nu.staldal.lagoon.util.TemplateException var39 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var40 = var39.getException();
    var31.log("", (java.lang.Throwable)var39, (-1));
    java.lang.Throwable[] var43 = var39.getSuppressed();
    java.lang.Throwable[] var44 = var39.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var46 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var47 = var46.toString();
    var39.addSuppressed((java.lang.Throwable)var46);
    nu.staldal.lagoon.LagoonAntTask var49 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var52 = new nu.staldal.ftp.FTPException("hi!");
    var49.log("", (java.lang.Throwable)var52, 10);
    org.apache.tools.ant.Location var55 = var49.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var56 = var49.getRuntimeConfigurableWrapper();
    var49.setForce(false);
    org.apache.tools.ant.Location var59 = var49.getLocation();
    nu.staldal.lagoon.core.LagoonException var61 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var62 = var61.toString();
    var49.log((java.lang.Throwable)var61, 100);
    var46.addSuppressed((java.lang.Throwable)var61);
    var18.log((java.lang.Throwable)var46, 10);
    nu.staldal.lagoon.util.TemplateException var68 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var46);
    java.lang.String var69 = var46.toString();
    nu.staldal.lagoon.LagoonAntTask var70 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var73 = new nu.staldal.ftp.FTPException("hi!");
    var70.log("", (java.lang.Throwable)var73, 10);
    org.apache.tools.ant.Location var76 = var70.getLocation();
    nu.staldal.lagoon.core.LagoonException var79 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var70.log("4444444444", (java.lang.Throwable)var79, 100);
    java.lang.String var82 = var79.toString();
    nu.staldal.lagoon.util.TemplateException var83 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var79);
    var46.addSuppressed((java.lang.Throwable)var83);
    nu.staldal.lagoon.util.TemplateException var86 = new nu.staldal.lagoon.util.TemplateException("aa");
    var46.addSuppressed((java.lang.Throwable)var86);
    java.lang.Throwable[] var88 = var86.getSuppressed();
    var11.addSuppressed((java.lang.Throwable)var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "nu.staldal.ftp.FTPException: hi!"+ "'", var17.equals("nu.staldal.ftp.FTPException: hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var47.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var62.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var69.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var82.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test17");


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
    var20.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var25 = new nu.staldal.lagoon.LagoonAntTask();
    var25.setPassword("");
    var20.bindToOwner((org.apache.tools.ant.Task)var25);
    org.apache.tools.ant.Target var29 = var25.getOwningTarget();
    var25.setPassword("hi!");
    var0.bindToOwner((org.apache.tools.ant.Task)var25);
    org.apache.tools.ant.Location var33 = var0.getLocation();
    nu.staldal.lagoon.LagoonAntTask var34 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var37 = new nu.staldal.ftp.FTPException("hi!");
    var34.log("", (java.lang.Throwable)var37, 10);
    org.apache.tools.ant.Location var40 = var34.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var41 = var34.getRuntimeConfigurableWrapper();
    var34.setForce(false);
    org.apache.tools.ant.Location var44 = var34.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var45 = var34.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Location var46 = var34.getLocation();
    nu.staldal.lagoon.LagoonAntTask var47 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var50 = new nu.staldal.ftp.FTPException("hi!");
    var47.log("", (java.lang.Throwable)var50, 10);
    org.apache.tools.ant.Project var53 = var47.getProject();
    nu.staldal.lagoon.util.TemplateException var55 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var56 = var55.getException();
    var47.log("", (java.lang.Throwable)var55, (-1));
    var47.setPassword("nu.staldal.lagoon.util.TemplateException: ");
    var47.maybeConfigure();
    org.apache.tools.ant.Location var62 = var47.getLocation();
    var47.setTaskName("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.LagoonAntTask var65 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var68 = new nu.staldal.ftp.FTPException("hi!");
    var65.log("", (java.lang.Throwable)var68, 10);
    var65.init();
    var65.init();
    nu.staldal.lagoon.LagoonAntTask var73 = new nu.staldal.lagoon.LagoonAntTask();
    var73.maybeConfigure();
    var73.log("4444444444", 1);
    var73.setTargetURL("hi_33_");
    nu.staldal.lagoon.LagoonAntTask var80 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var83 = new nu.staldal.ftp.FTPException("hi!");
    var80.log("", (java.lang.Throwable)var83, 10);
    org.apache.tools.ant.Project var86 = var80.getProject();
    nu.staldal.lagoon.util.TemplateException var88 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var89 = var88.getException();
    var80.log("", (java.lang.Throwable)var88, (-1));
    java.lang.Throwable[] var92 = var88.getSuppressed();
    var73.log((java.lang.Throwable)var88, 0);
    org.apache.tools.ant.RuntimeConfigurable var95 = var73.getRuntimeConfigurableWrapper();
    var65.setRuntimeConfigurableWrapper(var95);
    var47.setRuntimeConfigurableWrapper(var95);
    var34.setRuntimeConfigurableWrapper(var95);
    var0.setRuntimeConfigurableWrapper(var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
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
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test18");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    var2.addAttribute("", "hi!", "", "hi!");
    java.lang.String var12 = var2.getInheritedAttribute("hi!", "4444444444");
    java.lang.String var14 = var2.lookupNamespaceURI("");
    java.net.URL var15 = var2.getBaseURI();
    java.net.URL var16 = var2.getBaseURI();
    
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

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test19");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var3 = var2.getValue();
    java.lang.String var5 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var6 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var3.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var6.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test20");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("_32__32__32__32__32__32__32__32__32__32_");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.util.TemplateException: _32__32__32__32__32__32__32__32__32__32_"+ "'", var2.equals("nu.staldal.lagoon.util.TemplateException: _32__32__32__32__32__32__32__32__32__32_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.util.TemplateException: _32__32__32__32__32__32__32__32__32__32_"+ "'", var3.equals("nu.staldal.lagoon.util.TemplateException: _32__32__32__32__32__32__32__32__32__32_"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test21");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.ftp.FTPException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test22");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    org.apache.tools.ant.Target var6 = var1.getOwningTarget();
    java.lang.String var7 = var1.getTaskType();
    org.apache.tools.ant.Target var8 = var1.getOwningTarget();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    var9.bindToOwner((org.apache.tools.ant.Task)var10);
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var15 = new nu.staldal.ftp.FTPException("hi!");
    var12.log("", (java.lang.Throwable)var15, 10);
    org.apache.tools.ant.Location var18 = var12.getLocation();
    var9.setLocation(var18);
    org.apache.tools.ant.Location var20 = var9.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var21 = var9.getRuntimeConfigurableWrapper();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    var22.bindToOwner((org.apache.tools.ant.Task)var23);
    var22.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    var27.setPassword("");
    var22.bindToOwner((org.apache.tools.ant.Task)var27);
    org.apache.tools.ant.Project var31 = var22.getProject();
    org.apache.tools.ant.Project var32 = var22.getProject();
    org.apache.tools.ant.Location var33 = var22.getLocation();
    nu.staldal.lagoon.LagoonAntTask var34 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var35 = new nu.staldal.lagoon.LagoonAntTask();
    var34.bindToOwner((org.apache.tools.ant.Task)var35);
    var35.log("hi!");
    java.lang.String var39 = var35.getTaskName();
    var35.init();
    org.apache.tools.ant.Location var41 = var35.getLocation();
    var22.setLocation(var41);
    var9.setLocation(var41);
    var1.setLocation(var41);
    java.lang.String var45 = var1.getTaskType();
    var1.setForce(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test23");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    java.lang.String var7 = var2.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: ");
    var2.setSystemId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    int var10 = var2.getLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test24");


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
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
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

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test25");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 10);
    int var4 = var3.getLineNumber();
    var3.addNamespaceMapping(".", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test26");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    var0.setForce(false);
    org.apache.tools.ant.Target var5 = var0.getOwningTarget();
    var0.maybeConfigure();
    var0.log("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var12 = new nu.staldal.ftp.FTPException("hi!");
    var9.log("", (java.lang.Throwable)var12, 10);
    org.apache.tools.ant.Location var15 = var9.getLocation();
    nu.staldal.lagoon.core.LagoonException var18 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var9.log("4444444444", (java.lang.Throwable)var18, 100);
    java.lang.String var21 = var18.toString();
    java.lang.Exception var22 = var18.getException();
    var0.log((java.lang.Throwable)var18, 1);
    var0.log("nu.staldal.lagoon.util.TemplateException", 2);
    java.lang.String var28 = var0.getDescription();
    java.lang.String var29 = var0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var21.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test27");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", 10, 0);
    int var7 = var4.lookupAttribute("          ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    java.lang.String var9 = var4.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: hi!");
    nu.staldal.lagoon.producer.BasicSplit var10 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("hi!");
    char[] var13 = var12.asCharArray();
    var10.characters(var13, 1, 10);
    var10.endElement("", "hi!", "hi!");
    var10.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var24 = new nu.staldal.xtree.Text("");
    char[] var25 = var24.asCharArray();
    char[] var26 = var24.asCharArray();
    char[] var27 = var24.asCharArray();
    var10.characters(var27, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var31 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var10);
    nu.staldal.xmlutil.DocumentHandlerAdapter var32 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var31);
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("hi!", "hi!");
    var35.setSystemId("");
    java.net.URL var38 = var35.getBaseURI();
    java.lang.String var41 = var35.getAttrValueOrNull("", "");
    var32.setDocumentLocator((org.xml.sax.Locator)var35);
    var32.startDocument();
    char[] var44 = new char[] { };
    var32.characters(var44, 100, (-1));
    var32.startDocument();
    nu.staldal.xtree.Element var51 = new nu.staldal.xtree.Element("hi!", "hi!");
    var51.setSystemId("");
    java.net.URL var54 = var51.getBaseURI();
    java.lang.String var57 = var51.getAttrValueOrNull("", "");
    java.lang.String var58 = var51.getTextContent();
    var51.setColumn(100);
    java.lang.String var61 = var51.getTextContent();
    var32.setDocumentLocator((org.xml.sax.Locator)var51);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.toSAX((org.xml.sax.ContentHandler)var32);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + ""+ "'", var58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test28");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.log("nu.staldal.lagoon.util.TemplateException", 0);
    java.lang.String var9 = var0.getDescription();
    var0.setTaskName("nu.staldal.lagoon.core.AuthenticationException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test29");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    long var8 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: ");
    var0.close();
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462024000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1433462019000L);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test30");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    var0.setPassword("nu.staldal.lagoon.util.TemplateException: ");
    var0.maybeConfigure();
    org.apache.tools.ant.Location var15 = var0.getLocation();
    nu.staldal.lagoon.LagoonAntTask var16 = new nu.staldal.lagoon.LagoonAntTask();
    var16.setPassword("");
    var16.log("");
    var0.bindToOwner((org.apache.tools.ant.Task)var16);
    org.apache.tools.ant.Project var22 = var0.getProject();
    var0.setTaskType("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test31");


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
    boolean var24 = var5.isWhitespaceNode();
    boolean var25 = var5.getPreserveSpace();
    int var26 = var5.numberOfChildren();
    
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
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test32");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32__32__32__32__32__32__32__32__32__32__32_"+ "'", var2.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32__32__32__32__32__32__32__32__32__32__32_"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test33");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    var0.setForce(false);
    org.apache.tools.ant.Target var5 = var0.getOwningTarget();
    nu.staldal.lagoon.LagoonAntTask var6 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var7 = var6.getDescription();
    nu.staldal.lagoon.LagoonAntTask var8 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    var8.bindToOwner((org.apache.tools.ant.Task)var9);
    var8.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    var13.setPassword("");
    var8.bindToOwner((org.apache.tools.ant.Task)var13);
    org.apache.tools.ant.Project var17 = var8.getProject();
    org.apache.tools.ant.Project var18 = var8.getProject();
    org.apache.tools.ant.RuntimeConfigurable var19 = var8.getRuntimeConfigurableWrapper();
    var6.setRuntimeConfigurableWrapper(var19);
    var0.setRuntimeConfigurableWrapper(var19);
    var0.reconfigure();
    var0.setDescription("_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    java.lang.String var25 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test34");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var2, false, true);
    var2.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var10 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var2);
    var2.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    java.lang.String var14 = var1.getValue();
    nu.staldal.lagoon.producer.BasicSplit var15 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var17 = new nu.staldal.xtree.Text("hi!");
    char[] var18 = var17.asCharArray();
    var15.characters(var18, 1, 10);
    var15.endElement("", "hi!", "hi!");
    var15.processingInstruction("", "hi!");
    var15.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var15.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var33 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var15);
    java.util.Enumeration var34 = var15.getParamNames();
    nu.staldal.lagoon.producer.IslandSplit var35 = new nu.staldal.lagoon.producer.IslandSplit();
    var35.destroy();
    var35.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var38 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var35);
    nu.staldal.xmlutil.ContentHandlerFixer var40 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var35, true);
    var40.endPrefixMapping("4444444444");
    var40.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var47 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var48 = var47.getLineNumber();
    var47.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var54 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var55 = var54.getLineNumber();
    var54.addNamespaceMapping("", "");
    var47.addChild((nu.staldal.xtree.Node)var54);
    nu.staldal.xtree.NodeWithChildren var60 = var47.getParent();
    nu.staldal.xtree.Element var63 = var47.getFirstChildElementOrNull("hi!", "4444444444");
    int var64 = var47.numberOfNamespaceMappings();
    var40.setDocumentLocator((org.xml.sax.Locator)var47);
    nu.staldal.xtree.Element var66 = var47.getFirstChildElement();
    var15.setDocumentLocator((org.xml.sax.Locator)var66);
    var15.endElement("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var15.endElement("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    var1.toSAX((org.xml.sax.ContentHandler)var15);
    var15.processingInstruction("nu.staldal.lagoon.util.TemplateException~ hi!", "nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test35");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var9 = var4.removeChild(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test36");


    nu.staldal.lagoon.filestorage.SSHFileStorage var0 = new nu.staldal.lagoon.filestorage.SSHFileStorage();
    boolean var1 = var0.isReentrant();
    boolean var2 = var0.needPassword();
    boolean var3 = var0.needPassword();
    boolean var4 = var0.needPassword();
    boolean var5 = var0.isReentrant();
    boolean var6 = var0.isReentrant();
    boolean var7 = var0.isReentrant();
    boolean var8 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test37");


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
    boolean var69 = var45.isWhitespaceNode();
    nu.staldal.xtree.Element var70 = var45.getFirstChildElement();
    
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
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test38");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var3.equals("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test39");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    int var6 = var2.getLineNumber();
    java.lang.String var8 = var2.lookupNamespacePrefix("hi_33_");
    java.lang.String var10 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var12 = var2.lookupNamespaceURI("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test40");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var4 = var0.getParamNames();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated(100L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test41");


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
    nu.staldal.xtree.Text var46 = new nu.staldal.xtree.Text("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    boolean var47 = var46.isWhitespaceNode();
    char[] var48 = var46.asCharArray();
    var32.ignorableWhitespace(var48, 1, 10);
    
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
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test42");


    nu.staldal.lagoon.filestorage.FTPFileStorage var0 = new nu.staldal.lagoon.filestorage.FTPFileStorage();
    boolean var1 = var0.isReentrant();
    boolean var2 = var0.isReentrant();
    boolean var3 = var0.isReentrant();
    boolean var4 = var0.isReentrant();
    boolean var5 = var0.isReentrant();
    boolean var6 = var0.needPassword();
    boolean var7 = var0.needPassword();
    boolean var8 = var0.isReentrant();
    boolean var9 = var0.needPassword();
    boolean var10 = var0.isReentrant();
    boolean var11 = var0.needPassword();
    boolean var12 = var0.isReentrant();
    boolean var13 = var0.isReentrant();
    boolean var14 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test43");


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
    var4.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_AuthenticationException");
    var4.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.endElement("a", "nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "nu__46__staldal__46__lagoon__46__util__46__TemplateException__126____32__");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test44");


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
    nu.staldal.lagoon.core.XMLStreamProducer var49 = var0.getNext();
    
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
    assertNull(var49);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test45");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startDocument();
    var0.startDocument();
    var0.endDocument();
    var0.startDocument();
    var0.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var13 = new nu.staldal.xtree.Element("", "hi!", 1);
    java.lang.String var16 = var13.getInheritedAttribute("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    java.lang.String var18 = var13.lookupNamespaceURI("                                                                                                    ");
    int var19 = var13.numberOfAttributes();
    var0.setDocumentLocator((org.xml.sax.Locator)var13);
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException", "4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test46");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    var0.setForce(false);
    org.apache.tools.ant.Target var5 = var0.getOwningTarget();
    var0.log("a");
    org.apache.tools.ant.Location var8 = var0.getLocation();
    var0.maybeConfigure();
    java.lang.Object var10 = var0.clone();
    var0.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.setTaskName("#");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test47");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4444444444", "", 0);
    java.lang.String var4 = var3.getTextContentOrNull();
    nu.staldal.xtree.Element var7 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var8 = var7.getPreserveSpace();
    var7.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "4444444444", "nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var16 = var7.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException");
    var3.addChild((nu.staldal.xtree.Node)var7);
    java.lang.String var19 = var7.getAttributeType((-1));
    java.lang.String var20 = var7.getPublicId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test48");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    java.util.Enumeration var1 = var0.getParamNames();
    var0.endPrefixMapping("");
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ");
    nu.staldal.lagoon.core.XMLStreamProducer var6 = var0.getNext();
    var0.endPrefixMapping("aa");
    var0.beforeBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test49");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("##");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test50");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException");
    boolean var2 = var1.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test51");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var3 = var2.getValue();
    var2.setColumn(10);
    java.lang.String var6 = var2.getTarget();
    java.lang.String var7 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var3.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var6.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var7.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test52");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test53");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_AuthenticationException", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", 2, 100);
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var8 = var6.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var9 = var6.isWhitespaceNode();
    var6.setColumn(1);
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
    nu.staldal.xtree.Text var46 = new nu.staldal.xtree.Text("");
    char[] var47 = var46.asCharArray();
    char[] var48 = var46.asCharArray();
    var34.characters(var48, 100, 100);
    nu.staldal.xtree.Element var54 = new nu.staldal.xtree.Element("hi!", "hi!");
    var54.setLine(100);
    nu.staldal.xtree.Element var61 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var64 = var61.lookupAttribute("4444444444", "hi!");
    var61.addNamespaceMapping("", "4444444444");
    java.lang.String var68 = var61.getTextContent();
    var54.insertChild((nu.staldal.xtree.Node)var61, 0);
    var34.setDocumentLocator((org.xml.sax.Locator)var61);
    var34.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ");
    var6.toSAX((org.xml.sax.ContentHandler)var34);
    java.lang.String var77 = var6.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ", "4444444444");
    java.lang.String var79 = var6.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.insertChild((nu.staldal.xtree.Node)var6, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
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
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + ""+ "'", var68.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test54");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 1);
    java.lang.String var6 = var3.getAttrValueOrNull("hi!", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var8 = var3.lookupNamespaceURI("                                                                                                    ");
    var3.addNamespaceMapping("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException~ ");
    int var12 = var3.numberOfAttributes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var14 = var3.removeChild(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test55");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    boolean var2 = var0.hasBeenUpdated(1L);
    boolean var4 = var0.hasBeenUpdated(0L);
    var0.beforeBuild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var6 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test56");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    java.lang.String var7 = var0.getEntryName();
    var0.afterBuild();
    boolean var10 = var0.hasBeenUpdated(10L);
    var0.afterBuild();
    nu.staldal.lagoon.core.LagoonContext var12 = var0.getContext();
    nu.staldal.lagoon.core.XMLStreamProducer var13 = var0.getNext();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test57");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.ftp.FTPException~ hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 0, 2);
    java.lang.String var6 = var4.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____");
    java.net.URL var7 = var4.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test58");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", 2, 10);
    nu.staldal.xtree.Element var7 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var8 = var7.getLineNumber();
    var7.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var14 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var15 = var14.getLineNumber();
    var14.addNamespaceMapping("", "");
    var7.addChild((nu.staldal.xtree.Node)var14);
    java.lang.String var21 = var7.lookupNamespaceURI("nu.staldal.ftp.FTPException:                                                                                                     ");
    int var24 = var7.lookupAttribute("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!", "nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________");
    var7.setSystemId("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    var4.addChild((nu.staldal.xtree.Node)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test59");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.Object var8 = var0.clone();
    var0.init();
    java.lang.Object var10 = var0.clone();
    java.lang.Object var11 = var0.clone();
    java.lang.Object var12 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test60");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    var9.addNamespaceMapping("", "4444444444");
    java.lang.String var16 = var9.getTextContent();
    var2.insertChild((nu.staldal.xtree.Node)var9, 0);
    var9.addAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    java.lang.String var26 = var9.getInheritedAttribute("hi!", "hi!");
    var9.setColumn(2);
    java.lang.String var31 = var9.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~ hi__33__", "hi_33_");
    var9.setLine(2);
    var9.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____", "nu.staldal.ftp.FTPException~ hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var38 = var9.removeChild(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test61");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_ftp_46_FTPException_126__126__32_hi_33_");

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test62");


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
    java.lang.String var57 = var41.lookupNamespaceURI("nu.staldal.ftp.FTPException:  ");
    java.lang.String var59 = var41.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
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
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test63");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    java.lang.String var9 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ", "nu.staldal.ftp.FTPException~~~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test64");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test65");


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
    boolean var59 = var46.getPreserveSpace();
    java.net.URL var60 = var46.getBaseURI();
    int var63 = var46.lookupAttribute("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    int var64 = var46.numberOfAttributes();
    
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
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test66");


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
    nu.staldal.xtree.Element var43 = var5.getTree();
    nu.staldal.xtree.Element var44 = var43.getFirstChildElementOrNull();
    
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
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test67");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__util__46__TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", (-1), 2);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test68");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi_33_", "                                                                                                    ", (-1));
    nu.staldal.lagoon.producer.BasicSplit var4 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text("hi!");
    char[] var7 = var6.asCharArray();
    var4.characters(var7, 1, 10);
    var4.endElement("", "hi!", "hi!");
    var4.processingInstruction("", "hi!");
    var4.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var4.startDocument();
    var4.processingInstruction("4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var27 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4, true, false);
    nu.staldal.xmlutil.ContentHandlerFixer var30 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4, false, true);
    var3.outputStartElement((org.xml.sax.ContentHandler)var4);
    nu.staldal.xmlutil.ContentHandlerFixer var34 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4, false, true);
    var34.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test69");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("hi_33_", "nu.staldal.lagoon.core.LagoonException: ");
    int var3 = var2.getLineNumber();
    nu.staldal.xtree.Text var5 = new nu.staldal.xtree.Text("");
    char[] var6 = var5.asCharArray();
    char[] var7 = var5.asCharArray();
    char[] var8 = var5.asCharArray();
    boolean var9 = var5.isWhitespaceNode();
    nu.staldal.lagoon.producer.BasicSplit var10 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("hi!");
    char[] var13 = var12.asCharArray();
    var10.characters(var13, 1, 10);
    var10.endElement("", "hi!", "hi!");
    var10.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var24 = new nu.staldal.xtree.Text("");
    char[] var25 = var24.asCharArray();
    char[] var26 = var24.asCharArray();
    char[] var27 = var24.asCharArray();
    var10.characters(var27, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var31 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var10);
    nu.staldal.xmlutil.DocumentHandlerAdapter var32 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var31);
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("hi!", "hi!");
    var35.setSystemId("");
    java.net.URL var38 = var35.getBaseURI();
    java.lang.String var41 = var35.getAttrValueOrNull("", "");
    var32.setDocumentLocator((org.xml.sax.Locator)var35);
    nu.staldal.xtree.Text var44 = new nu.staldal.xtree.Text("");
    char[] var45 = var44.asCharArray();
    char[] var46 = var44.asCharArray();
    var32.characters(var46, 100, 100);
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var53 = var52.getLineNumber();
    var52.setPublicId("");
    int var56 = var52.getLineNumber();
    java.lang.String var58 = var52.lookupNamespacePrefix("hi_33_");
    var32.setDocumentLocator((org.xml.sax.Locator)var52);
    nu.staldal.xmlutil.ContentHandlerFixer var62 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var32, false, false);
    var5.toSAX((org.xml.sax.ContentHandler)var62);
    nu.staldal.xtree.Text var65 = new nu.staldal.xtree.Text("");
    char[] var66 = var65.asCharArray();
    var62.characters(var66, 1, 2);
    var2.toSAX((org.xml.sax.ContentHandler)var62);
    java.lang.String var71 = var2.getValue();
    java.lang.String var72 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var71.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var72.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test70");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:                                                                                                     ", "nu__46__staldal__46__ftp__46__FTPException__126____32__hi__33__");
    int var3 = var2.getColumnNumber();
    java.net.URL var4 = var2.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test71");


    nu.staldal.lagoon.producer.XMLFormatter var0 = new nu.staldal.lagoon.producer.XMLFormatter();
    java.util.Enumeration var1 = var0.getParamNames();
    var0.init();
    var0.init();
    var0.init();
    var0.destroy();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test72");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    java.lang.String var3 = var2.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var3.equals("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test73");


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
    nu.staldal.xtree.Element var23 = var11.getFirstChildElementOrNull("nu.staldal.lagoon.core.LagoonException: ", "4444444444");
    java.lang.String var24 = var11.getTextContent();
    java.lang.String var26 = var11.lookupNamespaceURI("##########");
    
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
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test74");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.ftp.FTPException: 4", 10, (-1));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test75");


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
    var0.endPrefixMapping("_32_");
    nu.staldal.xtree.Element var43 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var44 = var43.getLineNumber();
    var43.addNamespaceMapping("", "");
    boolean var48 = var43.getPreserveSpace();
    java.lang.String var51 = var43.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.endElement("nu.staldal.ftp.FTPException~~~~~~~~ hi!", "nu.staldal.ftp.FTPException: 4", "____32________32________32________32________32________32________32________32________32________32____");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test76");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    java.lang.Object var12 = var0.clone();
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var14 = var13.getDescription();
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var16 = new nu.staldal.lagoon.LagoonAntTask();
    var15.bindToOwner((org.apache.tools.ant.Task)var16);
    var15.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    var20.setPassword("");
    var15.bindToOwner((org.apache.tools.ant.Task)var20);
    org.apache.tools.ant.Project var24 = var15.getProject();
    org.apache.tools.ant.Project var25 = var15.getProject();
    org.apache.tools.ant.RuntimeConfigurable var26 = var15.getRuntimeConfigurableWrapper();
    var13.setRuntimeConfigurableWrapper(var26);
    var0.setRuntimeConfigurableWrapper(var26);
    var0.setForce(true);
    org.apache.tools.ant.Project var31 = var0.getProject();
    java.lang.String var32 = var0.getTaskType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test77");


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
    var22.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var22.startDocument();
    var22.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    
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

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test78");


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
    var0.endDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test79");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    boolean var1 = var0.needPassword();
    var0.close();
    boolean var3 = var0.isReentrant();
    boolean var4 = var0.isReentrant();
    boolean var5 = var0.needPassword();
    var0.close();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    nu.staldal.lagoon.core.OutputHandler var10 = var0.createFile("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    boolean var11 = var0.isReentrant();
    var0.deleteFile("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test80");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.lagoon.producer.BasicSplit var3 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var5 = new nu.staldal.xtree.Text("hi!");
    char[] var6 = var5.asCharArray();
    var3.characters(var6, 1, 10);
    var3.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var3.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var2.outputEndElement((org.xml.sax.ContentHandler)var3);
    var3.destroy();
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.TreeBuilder var21 = new nu.staldal.xtree.TreeBuilder();
    var21.endPrefixMapping("hi!");
    var21.endDocument();
    var21.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    nu.staldal.xtree.Text var29 = new nu.staldal.xtree.Text("");
    char[] var30 = var29.asCharArray();
    char[] var31 = var29.asCharArray();
    char[] var32 = var29.asCharArray();
    var21.ignorableWhitespace(var32, 1, 100);
    var20.outputStartElement((org.xml.sax.ContentHandler)var21);
    java.lang.String var38 = var20.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var39 = var20.numberOfChildren();
    java.lang.String var41 = var20.lookupNamespacePrefix("nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    var3.setDocumentLocator((org.xml.sax.Locator)var20);
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "hi!");
    var45.setSystemId("");
    java.net.URL var48 = var45.getBaseURI();
    java.lang.String var51 = var45.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var54 = new nu.staldal.xtree.Element("hi!", "hi!");
    var54.addNamespaceMapping("", "");
    var45.addChild((nu.staldal.xtree.Node)var54);
    var45.setSystemId("");
    var45.addNamespaceMapping("4444444444", "4444444444");
    java.lang.String var66 = var45.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var68 = var20.replaceChild((nu.staldal.xtree.Node)var45, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test81");


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
    var0.setTargetURL("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    var0.maybeConfigure();
    nu.staldal.lagoon.core.LagoonException var39 = new nu.staldal.lagoon.core.LagoonException("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    var0.log("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", (java.lang.Throwable)var39, 2);
    var0.setPassword("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ");
    
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

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test82");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    boolean var1 = var0.needPassword();
    var0.close();
    boolean var3 = var0.isReentrant();
    boolean var4 = var0.isReentrant();
    boolean var5 = var0.needPassword();
    var0.close();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    nu.staldal.lagoon.core.OutputHandler var10 = var0.createFile("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test83");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    var4.addNamespaceMapping("", "4444444444");
    var4.addAttribute("", "nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var4.setColumn(100);
    boolean var18 = var4.getPreserveSpace();
    java.lang.String var19 = var4.getPublicId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var22 = var4.getFirstChildElement("                                                                                                    ", "44");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test84");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    boolean var7 = var2.getPreserveSpace();
    var2.setColumn((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = var2.getAttributeLocalName(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test85");


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
    nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var21.setLine(1);
    java.lang.String var26 = var21.getInheritedAttribute("4444444444", "hi!");
    java.lang.String var27 = var21.getSystemId();
    var21.setColumn(10);
    boolean var30 = var21.isWhitespaceNode();
    var2.setDocumentLocator((org.xml.sax.Locator)var21);
    
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
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test86");


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
    var11.setPublicId("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Element var30 = var11.getFirstChildElementOrNull();
    var11.setSystemId("hi__33__");
    
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
    assertNull(var30);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test87");


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
    var0.setTargetURL("4444444444");
    java.lang.Object var27 = var0.clone();
    var0.init();
    
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
    assertNotNull(var27);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test88");


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
    java.lang.String var52 = var27.lookupNamespaceURI(" ");
    boolean var53 = var27.getPreserveSpace();
    var27.setSystemId("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var57 = var27.getChild(10);
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
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test89");


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
    nu.staldal.xmlutil.ContentHandlerFixer var18 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var17);
    var18.endPrefixMapping("nu__46__staldal__46__lagoon__46__util__46__TemplateException");
    var18.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test90");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    java.lang.String var7 = var2.getAttrValueOrNull("");
    var2.setPublicId("hi_33_");
    int var10 = var2.numberOfAttributes();
    var2.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", ".");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var14 = var2.getFirstChildElement();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test91");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException", 0, 2);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test92");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, true);
    var5.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.xtree.Text var13 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var15 = var13.lookupNamespaceURI("");
    char[] var16 = var13.asCharArray();
    boolean var17 = var13.isWhitespaceNode();
    var5.setDocumentLocator((org.xml.sax.Locator)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.processingInstruction(".", "44");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test93");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "                                                                                                    ");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test94");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:  ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.core.LagoonException~ nu.staldal.ftp.FTPException~  "+ "'", var1.equals("nu.staldal.lagoon.core.LagoonException~ nu.staldal.ftp.FTPException~  "));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test95");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    org.apache.tools.ant.Location var10 = var0.getLocation();
    var0.log("nu.staldal.lagoon.util.TemplateException", (-1));
    var0.setTaskType("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.log("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", 0);
    var0.log("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", 10);
    org.apache.tools.ant.Target var22 = var0.getOwningTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test96");


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
    char[] var29 = var23.asCharArray();
    boolean var30 = var23.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test97");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    var0.setForce(false);
    org.apache.tools.ant.Target var5 = var0.getOwningTarget();
    var0.maybeConfigure();
    var0.setTaskType("nu.staldal.ftp.FTPException: aaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test98");


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
    nu.staldal.lagoon.LagoonAntTask var14 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var15 = var14.getDescription();
    java.lang.String var16 = var14.getDescription();
    var5.bindToOwner((org.apache.tools.ant.Task)var14);
    var14.setPassword("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    var14.setTaskName("nu.staldal.lagoon.util.TemplateException: hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test99");


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
    java.lang.String var67 = var12.getDescription();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_"+ "'", var67.equals("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_"));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test100");


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
    var7.endDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test101");


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
    java.net.URL var72 = var67.getBaseURI();
    int var73 = var67.numberOfChildren();
    var67.setSystemId("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
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
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test102");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    java.util.Enumeration var1 = var0.getParamNames();
    var0.endPrefixMapping("");
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ");
    nu.staldal.lagoon.core.XMLStreamProducer var6 = var0.getNext();
    var0.endPrefixMapping("aa");
    var0.endPrefixMapping("                                                                                                    ");
    var0.destroy();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test103");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    nu.staldal.xtree.Element var15 = new nu.staldal.xtree.Element("hi!", "hi!");
    var15.setSystemId("");
    java.net.URL var18 = var15.getBaseURI();
    java.lang.String var21 = var15.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.addNamespaceMapping("", "");
    var15.addChild((nu.staldal.xtree.Node)var24);
    int var29 = var24.getColumnNumber();
    java.lang.String var31 = var24.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var33 = var24.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var36 = var24.getFirstChildElementOrNull("nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.util.TemplateException: ");
    var0.setDocumentLocator((org.xml.sax.Locator)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var39 = var24.getChild(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test104");


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
    var0.setTaskName("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    java.lang.String var37 = var0.getTaskName();
    
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
    assertTrue("'" + var37 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var37.equals("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test105");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 0);
    java.lang.String var4 = var3.getTextContentOrNull();
    nu.staldal.xtree.Element var7 = var3.getFirstChildElementOrNull("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "aaaaaaaaaa");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var9 = var3.getNamespaceMapping((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test106");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.endDocument();
    var8.startDocument();
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
    var34.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException: ");
    var34.processingInstruction("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var42 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var34, true);
    nu.staldal.xtree.Text var44 = new nu.staldal.xtree.Text("");
    nu.staldal.xtree.TreeBuilder var45 = new nu.staldal.xtree.TreeBuilder();
    var45.endPrefixMapping("hi!");
    var44.toSAX((org.xml.sax.ContentHandler)var45);
    var45.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var45.endPrefixMapping("");
    var45.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "4");
    var45.startDocument();
    nu.staldal.xtree.Text var58 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var58.setLine(1);
    char[] var61 = var58.asCharArray();
    var45.characters(var61, 2, 1);
    var34.characters(var61, (-1), 10);
    var8.ignorableWhitespace(var61, (-1), 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test107");


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
    java.util.Enumeration var23 = var6.getParamNames();
    var6.endElement("nu.staldal.lagoon.util.TemplateException", "4444444444", "nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.lagoon.producer.BasicSplit var28 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var30 = new nu.staldal.xtree.Text("hi!");
    char[] var31 = var30.asCharArray();
    var28.characters(var31, 1, 10);
    var28.endElement("", "hi!", "hi!");
    var28.processingInstruction("", "hi!");
    var28.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var28.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var46 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var28);
    var46.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.DocumentHandlerAdapter var50 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var46);
    nu.staldal.xtree.Text var52 = new nu.staldal.xtree.Text("4444444444");
    var50.setDocumentLocator((org.xml.sax.Locator)var52);
    nu.staldal.xtree.Text var55 = new nu.staldal.xtree.Text("");
    char[] var56 = var55.asCharArray();
    boolean var57 = var55.isWhitespaceNode();
    char[] var58 = var55.asCharArray();
    var50.ignorableWhitespace(var58, (-1), 0);
    var6.characters(var58, 1, (-1));
    var6.startDocument();
    java.util.Enumeration var66 = var6.getParamNames();
    var2.toSAX((org.xml.sax.ContentHandler)var6);
    nu.staldal.xtree.Element var70 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var71 = var70.getLineNumber();
    java.lang.String var72 = var70.getSystemId();
    var70.addAttribute("", "hi!", "", "hi!");
    var70.setColumn(1);
    var70.addAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________", "aaaaaaaaaa", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException: ");
    var6.setDocumentLocator((org.xml.sax.Locator)var70);
    nu.staldal.xtree.NodeWithChildren var86 = var70.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test108");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    int var5 = var2.numberOfNamespaceMappings();
    java.lang.String var6 = var2.getNamespaceURI();
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.util.TemplateException", 0);
    java.net.URL var11 = var10.getBaseURI();
    var2.addChild((nu.staldal.xtree.Node)var10);
    int var15 = var2.lookupAttribute("nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    java.lang.String var16 = var2.getSystemId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test109");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    org.apache.tools.ant.Location var10 = var0.getLocation();
    var0.log("nu.staldal.lagoon.util.TemplateException", (-1));
    java.lang.String var14 = var0.getDescription();
    org.apache.tools.ant.Location var15 = var0.getLocation();
    java.lang.String var16 = var0.getTaskType();
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    var17.bindToOwner((org.apache.tools.ant.Task)var18);
    var18.log("hi!");
    java.lang.String var22 = var18.getTaskName();
    var18.setTaskType("hi!");
    var18.setDescription("hi!");
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    var27.setPassword("");
    var27.setForce(false);
    org.apache.tools.ant.Target var32 = var27.getOwningTarget();
    var27.maybeConfigure();
    org.apache.tools.ant.RuntimeConfigurable var34 = var27.getRuntimeConfigurableWrapper();
    var18.setRuntimeConfigurableWrapper(var34);
    var0.bindToOwner((org.apache.tools.ant.Task)var18);
    var0.log("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 10);
    org.apache.tools.ant.Target var40 = var0.getOwningTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test110");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    var0.init();
    var0.beforeBuild();
    var0.endPrefixMapping("nu.staldal.lagoon.util.TemplateException");
    var0.init();
    var0.init();
    var0.init();
    var0.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test111");


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
    nu.staldal.xtree.Element var63 = new nu.staldal.xtree.Element("hi!", "hi!");
    var63.setLine(100);
    java.lang.String var68 = var63.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: ");
    int var69 = var63.numberOfAttributes();
    java.lang.String var71 = var63.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException");
    java.lang.String var72 = var63.getTextContentOrNull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var74 = var20.replaceChild((nu.staldal.xtree.Node)var63, (-1));
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
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "hi!"+ "'", var60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + ""+ "'", var72.equals(""));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test112");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_"+ "'", var2.equals("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_"));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test113");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.processingInstruction("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test114");


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
    var22.startDocument();
    var22.startDocument();
    var22.startDocument();
    nu.staldal.xtree.Text var67 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    java.lang.String var68 = var67.getValue();
    var22.setDocumentLocator((org.xml.sax.Locator)var67);
    java.lang.String var70 = var67.getValue();
    
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
    assertTrue("'" + var68 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     "+ "'", var68.equals("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     "+ "'", var70.equals("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     "));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test115");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.Object var8 = var0.clone();
    var0.init();
    var0.setDescription("hi!");
    var0.setPassword("nu.staldal.lagoon.core.AuthenticationException");
    org.apache.tools.ant.RuntimeConfigurable var14 = var0.getRuntimeConfigurableWrapper();
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var18 = new nu.staldal.ftp.FTPException("hi!");
    var15.log("", (java.lang.Throwable)var18, 10);
    org.apache.tools.ant.Location var21 = var15.getLocation();
    nu.staldal.lagoon.core.AuthenticationMissingException var22 = new nu.staldal.lagoon.core.AuthenticationMissingException();
    var15.log((java.lang.Throwable)var22, 10);
    var15.setDescription("4444444444");
    java.lang.String var27 = var15.getTaskType();
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    var28.bindToOwner((org.apache.tools.ant.Task)var29);
    var28.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var33 = new nu.staldal.lagoon.LagoonAntTask();
    var33.setPassword("");
    var28.bindToOwner((org.apache.tools.ant.Task)var33);
    org.apache.tools.ant.Project var37 = var28.getProject();
    org.apache.tools.ant.Project var38 = var28.getProject();
    var28.setTaskType("####################################################################################################");
    org.apache.tools.ant.Location var41 = var28.getLocation();
    var15.setLocation(var41);
    var0.setLocation(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test116");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    java.util.Enumeration var1 = var0.getParamNames();
    java.lang.String var3 = var0.getParam("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__32_hi________________________________33________________________________");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var4 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test117");


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
    int var24 = var2.numberOfChildren();
    var2.setLine(0);
    nu.staldal.xtree.Element var29 = new nu.staldal.xtree.Element("hi!", "hi!");
    var29.setLine(100);
    nu.staldal.xtree.Element var36 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var39 = var36.lookupAttribute("4444444444", "hi!");
    var36.addNamespaceMapping("", "4444444444");
    java.lang.String var43 = var36.getTextContent();
    var29.insertChild((nu.staldal.xtree.Node)var36, 0);
    java.net.URL var46 = var29.getBaseURI();
    int var47 = var29.getColumnNumber();
    nu.staldal.xtree.Element var48 = var29.getFirstChildElement();
    java.lang.String var50 = var48.getAttributeNamespaceURI((-1));
    var2.addChild((nu.staldal.xtree.Node)var48);
    java.lang.String var52 = var48.getTextContent();
    
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
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test118");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    boolean var2 = var0.hasBeenUpdated(1L);
    var0.afterBuild();
    boolean var5 = var0.hasBeenUpdated(1433461977000L);
    var0.afterBuild();
    boolean var8 = var0.hasBeenUpdated(1433461979000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test119");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("__32____32____32____32____32____32____32____32____32____32__");

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test120");


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
    var0.setDescription("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test121");


    nu.staldal.lagoon.filestorage.SSHFileStorage var0 = new nu.staldal.lagoon.filestorage.SSHFileStorage();
    boolean var1 = var0.isReentrant();
    boolean var2 = var0.needPassword();
    boolean var3 = var0.needPassword();
    boolean var4 = var0.needPassword();
    boolean var5 = var0.isReentrant();
    boolean var6 = var0.needPassword();
    boolean var7 = var0.needPassword();
    boolean var8 = var0.needPassword();
    boolean var9 = var0.isReentrant();
    boolean var10 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test122");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.lang.String var7 = var3.lookupNamespaceURI("4444444444");
    boolean var8 = var3.getPreserveSpace();
    java.lang.String var10 = var3.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.removeAttribute(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test123");


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
    var0.setTaskName("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    org.apache.tools.ant.RuntimeConfigurable var34 = var0.getRuntimeConfigurableWrapper();
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
    java.lang.String var58 = var45.getTaskType();
    var45.reconfigure();
    nu.staldal.lagoon.LagoonAntTask var60 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var61 = new nu.staldal.lagoon.LagoonAntTask();
    var60.bindToOwner((org.apache.tools.ant.Task)var61);
    nu.staldal.lagoon.LagoonAntTask var63 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var66 = new nu.staldal.ftp.FTPException("hi!");
    var63.log("", (java.lang.Throwable)var66, 10);
    org.apache.tools.ant.Location var69 = var63.getLocation();
    var60.setLocation(var69);
    org.apache.tools.ant.Location var71 = var60.getLocation();
    var45.setLocation(var71);
    var0.setLocation(var71);
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test124");


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

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test125");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    boolean var2 = var0.hasBeenUpdated(1L);
    var0.afterBuild();
    var0.afterBuild();
    var0.afterBuild();
    var0.afterBuild();
    var0.afterBuild();
    var0.afterBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test126");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    java.lang.String var6 = var1.getTaskName();
    nu.staldal.lagoon.core.LagoonException var8 = new nu.staldal.lagoon.core.LagoonException("a");
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var12 = new nu.staldal.ftp.FTPException("hi!");
    var9.log("", (java.lang.Throwable)var12, 10);
    org.apache.tools.ant.Project var15 = var9.getProject();
    nu.staldal.lagoon.util.TemplateException var17 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var18 = var17.getException();
    var9.log("", (java.lang.Throwable)var17, (-1));
    java.lang.Throwable[] var21 = var17.getSuppressed();
    java.lang.Throwable[] var22 = var17.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var24 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var25 = var24.toString();
    var17.addSuppressed((java.lang.Throwable)var24);
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var30 = new nu.staldal.ftp.FTPException("hi!");
    var27.log("", (java.lang.Throwable)var30, 10);
    org.apache.tools.ant.Location var33 = var27.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var34 = var27.getRuntimeConfigurableWrapper();
    var27.setForce(false);
    org.apache.tools.ant.Location var37 = var27.getLocation();
    nu.staldal.lagoon.core.LagoonException var39 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var40 = var39.toString();
    var27.log((java.lang.Throwable)var39, 100);
    var24.addSuppressed((java.lang.Throwable)var39);
    var8.addSuppressed((java.lang.Throwable)var39);
    var1.log((java.lang.Throwable)var39, 100);
    nu.staldal.lagoon.LagoonAntTask var47 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var50 = new nu.staldal.ftp.FTPException("hi!");
    var47.log("", (java.lang.Throwable)var50, 10);
    var47.init();
    var47.init();
    java.lang.Object var55 = var47.clone();
    var47.init();
    var47.init();
    nu.staldal.lagoon.LagoonAntTask var58 = new nu.staldal.lagoon.LagoonAntTask();
    var58.maybeConfigure();
    var58.log("4444444444", 1);
    var58.reconfigure();
    var47.bindToOwner((org.apache.tools.ant.Task)var58);
    var58.setTargetURL("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    nu.staldal.lagoon.LagoonAntTask var67 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var70 = new nu.staldal.ftp.FTPException("hi!");
    var67.log("", (java.lang.Throwable)var70, 10);
    var67.init();
    var67.init();
    java.lang.String var75 = var67.getDescription();
    nu.staldal.lagoon.LagoonAntTask var76 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var79 = new nu.staldal.ftp.FTPException("hi!");
    var76.log("", (java.lang.Throwable)var79, 10);
    org.apache.tools.ant.Project var82 = var76.getProject();
    var67.bindToOwner((org.apache.tools.ant.Task)var76);
    var76.setTaskType("nu.staldal.lagoon.core.LagoonException: ");
    var76.log("hi!");
    var76.init();
    var76.log("          ", 1);
    var76.setTaskName("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    org.apache.tools.ant.RuntimeConfigurable var94 = var76.getRuntimeConfigurableWrapper();
    var58.setRuntimeConfigurableWrapper(var94);
    var1.setRuntimeConfigurableWrapper(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var25.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var40.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test127");


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
    java.lang.String var22 = var17.getSystemId();
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
    var45.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException: ");
    var45.processingInstruction("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var53 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var45, true);
    nu.staldal.xtree.Text var55 = new nu.staldal.xtree.Text("");
    nu.staldal.xtree.TreeBuilder var56 = new nu.staldal.xtree.TreeBuilder();
    var56.endPrefixMapping("hi!");
    var55.toSAX((org.xml.sax.ContentHandler)var56);
    var56.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var56.endPrefixMapping("");
    var56.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "4");
    var56.startDocument();
    nu.staldal.xtree.Text var69 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var69.setLine(1);
    char[] var72 = var69.asCharArray();
    var56.characters(var72, 2, 1);
    var45.characters(var72, (-1), 10);
    var17.toSAX((org.xml.sax.ContentHandler)var45);
    
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
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test128");


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
    var0.maybeConfigure();
    
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

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test129");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    var2.setSystemId("nu.staldal.lagoon.util.TemplateException");
    java.lang.String var8 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    int var9 = var2.numberOfChildren();
    int var10 = var2.getLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test130");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    java.lang.String var12 = var4.getAttributeLocalName((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var4.getAttributeLocalName(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test131");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("_35__35__35__35__35__35__35__35__35__35_");

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test132");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    var4.setSystemId("hi!");
    int var8 = var4.getLineNumber();
    boolean var9 = var4.isWhitespaceNode();
    java.lang.String var10 = var4.getPublicId();
    boolean var11 = var4.getPreserveSpace();
    nu.staldal.xtree.NodeWithChildren var12 = var4.getParent();
    java.lang.String var15 = var4.getInheritedAttribute("hi!", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String var16 = var4.getTextContentOrNull();
    java.lang.String var18 = var4.lookupNamespacePrefix("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
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
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test133");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.core.LagoonException var9 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var0.log("4444444444", (java.lang.Throwable)var9, 100);
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    var12.bindToOwner((org.apache.tools.ant.Task)var13);
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var18 = new nu.staldal.ftp.FTPException("hi!");
    var15.log("", (java.lang.Throwable)var18, 10);
    org.apache.tools.ant.Location var21 = var15.getLocation();
    var12.setLocation(var21);
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var24 = new nu.staldal.lagoon.LagoonAntTask();
    var23.bindToOwner((org.apache.tools.ant.Task)var24);
    var23.setForce(true);
    java.lang.String var28 = var23.getTaskName();
    var23.setTaskType("4444444444");
    var23.maybeConfigure();
    var12.bindToOwner((org.apache.tools.ant.Task)var23);
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
    org.apache.tools.ant.Project var57 = var43.getProject();
    nu.staldal.ftp.FTPException var59 = new nu.staldal.ftp.FTPException("4444444444");
    nu.staldal.ftp.FTPException var61 = new nu.staldal.ftp.FTPException("hi!");
    var59.addSuppressed((java.lang.Throwable)var61);
    nu.staldal.lagoon.util.TemplateException var63 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var61);
    var43.log((java.lang.Throwable)var61, (-1));
    var23.log((java.lang.Throwable)var61, (-1));
    var23.setTargetURL("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.util.TemplateException var72 = new nu.staldal.lagoon.util.TemplateException("hi!");
    var23.log("nu.staldal.lagoon.core.LagoonException~ ", (java.lang.Throwable)var72, (-1));
    var9.addSuppressed((java.lang.Throwable)var72);
    java.lang.Exception var76 = var9.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
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
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test134");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var2 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var0.afterBuild();
    var0.init();
    var0.endPrefixMapping("a");
    nu.staldal.lagoon.core.LagoonContext var7 = var0.getContext();
    var0.beforeBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test135");


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
    var0.endElement("nu.staldal.ftp.FTPException:           ", "nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_");
    var0.endElement("nu.staldal.lagoon.core.LagoonException~ 4444444444", "", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test136");


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
    int var25 = var5.getColumnNumber();
    boolean var26 = var5.getPreserveSpace();
    
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
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test137");


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
    boolean var45 = var14.isWhitespaceNode();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test138");


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
    var0.endElement("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_", "nu.staldal.lagoon.util.TemplateException: hi_33_", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    int var29 = var0.getPosition();
    
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
    assertTrue(var29 == 0);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test139");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var16 = var2.getNamespaceURI();
    java.net.URL var17 = var2.getBaseURI();
    java.net.URL var18 = var2.getBaseURI();
    java.lang.String var19 = var2.getPublicId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test140");


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
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var26 = var25.getFirstChildElementOrNull();
    java.lang.String var29 = var25.getAttrValueOrNull("4444444444", "4444444444");
    boolean var30 = var25.getPreserveSpace();
    var14.setDocumentLocator((org.xml.sax.Locator)var25);
    var14.endPrefixMapping("nu.staldal.ftp.FTPException: hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.endElement("nu__46__staldal__46__lagoon__46__util__46__TemplateException__126____32__", "_52_", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test141");


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
    var5.setTaskName("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    var5.setTaskType("nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    java.lang.String var19 = var5.getTaskType();
    java.lang.Object var20 = var5.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________"+ "'", var19.equals("nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test142");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var10 = var4.lookupNamespaceURI("4444444444");
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("4444444444");
    nu.staldal.lagoon.producer.BasicSplit var13 = new nu.staldal.lagoon.producer.BasicSplit();
    var12.toSAX((org.xml.sax.ContentHandler)var13);
    var4.outputEndElement((org.xml.sax.ContentHandler)var13);
    var13.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var18 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var13, true);
    nu.staldal.xmlutil.ContentHandlerAdapter var19 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test143");


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
    java.lang.String var48 = var32.getAttributeValue((-1));
    java.net.URL var49 = var32.getBaseURI();
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!");
    var52.setSystemId("");
    java.net.URL var55 = var52.getBaseURI();
    java.lang.String var58 = var52.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var61 = new nu.staldal.xtree.Element("hi!", "hi!");
    var61.addNamespaceMapping("", "");
    var52.addChild((nu.staldal.xtree.Node)var61);
    var61.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var61.setLine(1);
    nu.staldal.xtree.Element var77 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var80 = var77.lookupAttribute("4444444444", "hi!");
    java.lang.String var83 = var77.getInheritedAttribute("", "4444444444");
    int var86 = var77.lookupAttribute("", "nu.staldal.lagoon.util.TemplateException");
    var61.addChild((nu.staldal.xtree.Node)var77);
    int var88 = var61.numberOfAttributes();
    var61.setLine((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var32.insertChild((nu.staldal.xtree.Node)var61, 2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 1);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test144");


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
    var0.init();
    var0.setForce(true);
    java.lang.String var18 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test145");


    nu.staldal.xtree.XTreeXMLDataContentHandler var0 = new nu.staldal.xtree.XTreeXMLDataContentHandler();
    java.awt.datatransfer.DataFlavor[] var1 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var2 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var3 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var4 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var5 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var6 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var7 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var8 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var9 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var10 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var11 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var12 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var13 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var14 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var15 = var0.getTransferDataFlavors();
    java.awt.datatransfer.DataFlavor[] var16 = var0.getTransferDataFlavors();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test146");


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
    nu.staldal.xmlutil.ContentHandlerFixer var49 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var21);
    var21.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test147");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 2, 0);
    int var5 = var4.numberOfAttributes();
    java.lang.String var6 = var4.getPublicId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test148");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.endPrefixMapping("hi_33_");
    var0.skippedEntity("hi_33_");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.setDocumentLocator((org.xml.sax.Locator)var12);
    var0.startPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("          ");
    var0.startDocument();
    var0.skippedEntity("nu.staldal.ftp.FTPException: 4");

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test149");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.setTargetURL("4444444444");
    java.lang.String var8 = var0.getTaskType();
    var0.setDescription("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test150");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("__52__", "nu____46____staldal____46____ftp____46____FTPException____126________32____hi____33____");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test151");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    boolean var8 = var0.hasBeenUpdated(1433461930000L);
    var0.afterBuild();
    var0.afterBuild();
    var0.afterBuild();
    var0.afterBuild();
    var0.afterBuild();
    boolean var15 = var0.hasBeenUpdated(1433461940000L);
    
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
    assertTrue(var15 == true);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test152");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var10 = var4.lookupNamespaceURI("4444444444");
    java.lang.String var12 = var4.lookupNamespacePrefix("4444444444");
    java.lang.String var15 = var4.getAttrValueOrNull("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.NodeWithChildren var16 = var4.getParent();
    
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
    assertNull(var16);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test153");


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
    boolean var29 = var23.isWhitespaceNode();
    java.lang.String var30 = var23.getValue();
    
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
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test154");


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
    var0.beforeBuild();
    var0.beforeBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test155");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", "nu.staldal.lagoon.core.AuthenticationException");
    nu.staldal.xtree.NodeWithChildren var3 = var2.getParent();
    var2.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", "_52_");
    nu.staldal.xtree.NodeWithChildren var7 = var2.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test156");


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
    boolean var42 = var2.getPreserveSpace();
    int var45 = var2.lookupAttribute("hi!", "nu.staldal.lagoon.util.TemplateException: ");
    int var48 = var2.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_AuthenticationException", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeAttribute(100);
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
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test157");


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
    var16.endPrefixMapping("nu.staldal.lagoon.util.TemplateException~ ");
    var16.endDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test158");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    var0.destroy();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    var0.init();

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test159");


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
    var0.afterBuild();
    var0.endElement("                                                                                                    ", "nu.staldal.lagoon.core.LagoonException~~ hi____33____", "####################################################################################################");
    nu.staldal.xtree.Element var42 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    var42.addAttribute("hi!", "", "hi!", "");
    int var48 = var42.getColumnNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var42);
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!");
    var52.setLine(100);
    java.lang.String var56 = var52.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var59 = var52.lookupAttribute("hi!", "");
    int var62 = var52.lookupAttribute("                                                                                                    ", "nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var64 = var52.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.setDocumentLocator((org.xml.sax.Locator)var52);
    var0.beforeBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test160");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    var0.init();
    java.lang.Object var8 = var0.clone();
    var0.init();
    var0.setDescription("hi!");
    var0.log("4444444444", 100);
    var0.setTaskName("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    org.apache.tools.ant.Target var17 = var0.getOwningTarget();
    org.apache.tools.ant.Project var18 = var0.getProject();
    nu.staldal.lagoon.core.LagoonException var20 = new nu.staldal.lagoon.core.LagoonException("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.Exception var21 = var20.getException();
    java.lang.String var22 = var20.toString();
    nu.staldal.lagoon.util.TemplateException var23 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var20);
    var0.log((java.lang.Throwable)var23, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"+ "'", var22.equals("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"));

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test161");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    java.util.Enumeration var1 = var0.getParamNames();
    boolean var3 = var0.hasBeenUpdated(0L);
    boolean var5 = var0.hasBeenUpdated(1433461931000L);
    boolean var7 = var0.hasBeenUpdated(0L);
    boolean var9 = var0.hasBeenUpdated(1433461932000L);
    boolean var11 = var0.hasBeenUpdated(1433461967000L);
    boolean var13 = var0.hasBeenUpdated(100L);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test162");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setTargetURL("4444444444");
    var0.setForce(false);
    var0.reconfigure();
    var0.setTaskName("nu.staldal.ftp.FTPException~                                                                                                     ");
    var0.maybeConfigure();
    var0.setTargetURL("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test163");


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
    java.lang.String var30 = var11.lookupNamespaceURI("nu.staldal.ftp.FTPException~~ hi!");
    java.lang.String var33 = var11.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException~~ hi____33____", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var36 = var11.getAttrValueOrNull("nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var38 = var11.getAttrValue("nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
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
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test164");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    boolean var2 = var0.hasBeenUpdated(1L);
    var0.beforeBuild();
    boolean var5 = var0.hasBeenUpdated(1433461928000L);
    var0.beforeBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test165");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    java.lang.String var7 = var0.getEntryName();
    var0.afterBuild();
    boolean var10 = var0.hasBeenUpdated(1433461934000L);
    boolean var12 = var0.hasBeenUpdated(1433461971000L);
    var0.afterBuild();
    nu.staldal.lagoon.core.XMLStreamProducer var14 = var0.getNext();
    
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
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test166");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    java.lang.String var2 = var0.getParam("4444444444");
    var0.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test167");


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
    nu.staldal.lagoon.core.LagoonContext var10 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test168");


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
    var21.afterBuild();
    var21.processingInstruction("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!", "nu.staldal.ftp.FTPException~~~~ hi!");
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

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test169");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    var2.addAttribute("", "hi!", "", "hi!");
    java.lang.String var12 = var2.getInheritedAttribute("hi!", "4444444444");
    java.lang.String var14 = var2.lookupNamespaceURI("");
    nu.staldal.xtree.ProcessingInstruction var17 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    var2.addChild((nu.staldal.xtree.Node)var17);
    java.net.URL var19 = var2.getBaseURI();
    java.net.URL var20 = var2.getBaseURI();
    java.net.URL var21 = var2.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test170");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xtree.Text var7 = new nu.staldal.xtree.Text("");
    char[] var8 = var7.asCharArray();
    boolean var9 = var7.isWhitespaceNode();
    char[] var10 = var7.asCharArray();
    var0.ignorableWhitespace(var10, 0, 10);
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    char[] var17 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text(var17, 1, 0, false);
    char[] var22 = var21.asCharArray();
    char[] var23 = var21.asCharArray();
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
    nu.staldal.xmlutil.DocumentHandlerAdapter var47 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var42);
    nu.staldal.xmlutil.DocumentHandlerAdapter var48 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var42);
    var21.toSAX((org.xml.sax.ContentHandler)var48);
    var48.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.util.TemplateException");
    var48.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_ftp_46_FTPException_126__126__32_hi_33_", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");
    nu.staldal.lagoon.producer.BasicSplit var56 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var58 = new nu.staldal.xtree.Text("hi!");
    char[] var59 = var58.asCharArray();
    var56.characters(var59, 1, 10);
    var56.endElement("", "hi!", "hi!");
    var56.processingInstruction("", "hi!");
    nu.staldal.xtree.Text var71 = new nu.staldal.xtree.Text("");
    char[] var72 = var71.asCharArray();
    char[] var73 = var71.asCharArray();
    var56.ignorableWhitespace(var73, 10, 0);
    var56.endElement("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: ", "4444444444");
    var56.skippedEntity("4444444444");
    var56.afterBuild();
    var56.skippedEntity("nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    nu.staldal.xtree.Text var87 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException~~ ");
    char[] var88 = var87.asCharArray();
    var56.ignorableWhitespace(var88, 0, (-1));
    var48.ignorableWhitespace(var88, 1, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.characters(var88, (-1), (-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test171");


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
    var52.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    var52.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var82 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var52, false, false);
    
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

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test172");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var2, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var7, false, true);
    var1.toSAX((org.xml.sax.ContentHandler)var10);
    var10.startDocument();
    nu.staldal.xtree.Element var15 = new nu.staldal.xtree.Element("hi!", "hi!");
    var15.setSystemId("");
    java.net.URL var18 = var15.getBaseURI();
    java.lang.String var21 = var15.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.addNamespaceMapping("", "");
    var15.addChild((nu.staldal.xtree.Node)var24);
    java.lang.String var31 = var24.getInheritedAttribute("", "hi!");
    java.lang.String var33 = var24.getAttrValueOrNull("4444444444");
    int var34 = var24.numberOfAttributes();
    int var35 = var24.numberOfNamespaceMappings();
    java.lang.String var36 = var24.getNamespaceURI();
    var10.setDocumentLocator((org.xml.sax.Locator)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test173");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.removeAttribute(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test174");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    int var4 = var3.numberOfAttributes();
    java.lang.String var5 = var3.getLocalName();
    java.lang.String var6 = var3.getNamespaceURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test175");


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
    java.lang.String var73 = var48.getEntryName();
    nu.staldal.xtree.Element var76 = new nu.staldal.xtree.Element("hi!", "hi!");
    var76.setSystemId("");
    java.net.URL var79 = var76.getBaseURI();
    int var80 = var76.numberOfNamespaceMappings();
    java.lang.String var83 = var76.getInheritedAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    var76.setColumn((-1));
    var48.setDocumentLocator((org.xml.sax.Locator)var76);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var88 = var76.getAttributeNamespaceURI(100);
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
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test176");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    java.util.Enumeration var1 = var0.getParamNames();
    boolean var3 = var0.hasBeenUpdated(0L);
    var0.beforeBuild();
    boolean var6 = var0.hasBeenUpdated(1433461932000L);
    nu.staldal.lagoon.core.LagoonContext var7 = var0.getContext();
    nu.staldal.lagoon.core.XMLStreamProducer var8 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test177");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu__46__staldal__46__ftp__46__FTPException__126____32__hi__33__", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test178");


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
    var0.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test179");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ 4444444444", "nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.removeAttribute(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test180");


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
    var0.setTaskName("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
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

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test181");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~~ ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    java.lang.String var3 = var2.getValue();
    nu.staldal.lagoon.producer.BasicSplit var4 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text("hi!");
    char[] var7 = var6.asCharArray();
    var4.characters(var7, 1, 10);
    var4.endElement("", "hi!", "hi!");
    var4.processingInstruction("", "hi!");
    var4.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var4.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var22 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var4);
    java.util.Enumeration var23 = var4.getParamNames();
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("hi!", "hi!");
    var26.setLine(100);
    java.lang.String var30 = var26.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var4.setDocumentLocator((org.xml.sax.Locator)var26);
    char[] var34 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var38 = new nu.staldal.xtree.Text(var34, 1, 0, false);
    var4.characters(var34, 1, 2);
    var2.toSAX((org.xml.sax.ContentHandler)var4);
    var4.endElement("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException"+ "'", var3.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test182");


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
    boolean var20 = var2.getPreserveSpace();
    java.lang.String var22 = var2.getAttributeValue((-1));
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test183");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(10L);
    boolean var5 = var0.hasBeenUpdated(1433461930000L);
    boolean var7 = var0.hasBeenUpdated(10L);
    nu.staldal.lagoon.core.LagoonContext var8 = var0.getContext();
    boolean var10 = var0.hasBeenUpdated(1433461933000L);
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
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test184");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    var2.addAttribute("", "hi!", "", "hi!");
    java.lang.String var12 = var2.getInheritedAttribute("hi!", "4444444444");
    java.lang.String var14 = var2.lookupNamespaceURI("");
    nu.staldal.xtree.ProcessingInstruction var17 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    var2.addChild((nu.staldal.xtree.Node)var17);
    java.net.URL var19 = var2.getBaseURI();
    java.net.URL var20 = var2.getBaseURI();
    nu.staldal.xtree.NodeWithChildren var21 = var2.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test185");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    var2.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "a");
    boolean var21 = var2.isWhitespaceNode();
    java.lang.String var23 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test186");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4", "nu.staldal.lagoon.core.LagoonException~~ ", 10);
    boolean var4 = var3.isWhitespaceNode();
    java.lang.String var7 = var3.getInheritedAttribute("nu.staldal.lagoon.core.AuthenticationException", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    nu.staldal.xtree.Element var8 = var3.getFirstChildElementOrNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test187");


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
    java.util.Enumeration var23 = var0.getParamNames();
    nu.staldal.lagoon.producer.BasicSplit var24 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var26 = new nu.staldal.xtree.Text("hi!");
    char[] var27 = var26.asCharArray();
    var24.characters(var27, 1, 10);
    var24.endElement("", "hi!", "hi!");
    var24.processingInstruction("", "hi!");
    var24.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.util.Enumeration var41 = var24.getParamNames();
    var24.endElement("nu.staldal.lagoon.util.TemplateException", "4444444444", "nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.lagoon.producer.BasicSplit var46 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var48 = new nu.staldal.xtree.Text("hi!");
    char[] var49 = var48.asCharArray();
    var46.characters(var49, 1, 10);
    var46.endElement("", "hi!", "hi!");
    var46.processingInstruction("", "hi!");
    var46.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var46.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var64 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var46);
    var64.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.DocumentHandlerAdapter var68 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var64);
    nu.staldal.xtree.Text var70 = new nu.staldal.xtree.Text("4444444444");
    var68.setDocumentLocator((org.xml.sax.Locator)var70);
    nu.staldal.xtree.Text var73 = new nu.staldal.xtree.Text("");
    char[] var74 = var73.asCharArray();
    boolean var75 = var73.isWhitespaceNode();
    char[] var76 = var73.asCharArray();
    var68.ignorableWhitespace(var76, (-1), 0);
    var24.characters(var76, 1, (-1));
    var0.ignorableWhitespace(var76, 10, 2);
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
    var0.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test188");


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
    boolean var23 = var2.isWhitespaceNode();
    java.lang.String var24 = var2.getSystemId();
    
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
    assertNull(var24);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test189");


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
    org.apache.tools.ant.Project var21 = var1.getProject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test190");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.lagoon.producer.BasicSplit var10 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("hi!");
    char[] var13 = var12.asCharArray();
    var10.characters(var13, 1, 10);
    var10.endElement("", "hi!", "hi!");
    var10.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var24 = new nu.staldal.xtree.Text("");
    char[] var25 = var24.asCharArray();
    char[] var26 = var24.asCharArray();
    char[] var27 = var24.asCharArray();
    var10.characters(var27, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var31 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var10);
    nu.staldal.xmlutil.DocumentHandlerAdapter var32 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var31);
    var32.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException: ");
    var32.processingInstruction("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var40 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var32, true);
    nu.staldal.xtree.Text var42 = new nu.staldal.xtree.Text("");
    nu.staldal.xtree.TreeBuilder var43 = new nu.staldal.xtree.TreeBuilder();
    var43.endPrefixMapping("hi!");
    var42.toSAX((org.xml.sax.ContentHandler)var43);
    var43.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var43.endPrefixMapping("");
    var43.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "4");
    var43.startDocument();
    nu.staldal.xtree.Text var56 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var56.setLine(1);
    char[] var59 = var56.asCharArray();
    var43.characters(var59, 2, 1);
    var32.characters(var59, (-1), 10);
    var8.ignorableWhitespace(var59, 100, 2);
    nu.staldal.xtree.TreeBuilder var69 = new nu.staldal.xtree.TreeBuilder();
    var69.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var74 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var69, false, false);
    nu.staldal.xtree.Element var77 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var74.setDocumentLocator((org.xml.sax.Locator)var77);
    var74.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Text var83 = new nu.staldal.xtree.Text("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    char[] var84 = var83.asCharArray();
    var74.ignorableWhitespace(var84, 100, 0);
    var8.characters(var84, 100, 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.processingInstruction("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ ", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationException");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test191");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var4 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test192");


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
    boolean var19 = var2.getPreserveSpace();
    java.lang.String var21 = var2.lookupNamespaceURI("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    int var22 = var2.numberOfChildren();
    java.lang.String var25 = var2.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test193");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("hi!", "hi!");
    var10.setLine(100);
    int var13 = var10.numberOfNamespaceMappings();
    var0.setDocumentLocator((org.xml.sax.Locator)var10);
    var0.startDocument();
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.util.TemplateException: ", (-1));
    java.lang.String var23 = var21.getAttrValueOrNull("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    var0.setDocumentLocator((org.xml.sax.Locator)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test194");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var43 = var19.getAttributeType(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test195");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "hi_33_");
    int var3 = var2.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test196");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    java.lang.String var10 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var11 = var2.getBaseURI();
    int var12 = var2.numberOfChildren();
    java.lang.String var14 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
    
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
    assertNull(var14);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test197");


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
    var27.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("", "4444444444", 100);
    int var47 = var46.numberOfChildren();
    int var48 = var46.numberOfAttributes();
    var27.setDocumentLocator((org.xml.sax.Locator)var46);
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!");
    var52.setSystemId("");
    java.net.URL var55 = var52.getBaseURI();
    java.lang.String var58 = var52.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var61 = new nu.staldal.xtree.Element("hi!", "hi!");
    var61.addNamespaceMapping("", "");
    var52.addChild((nu.staldal.xtree.Node)var61);
    java.lang.String var68 = var61.getInheritedAttribute("", "hi!");
    int var69 = var61.getColumnNumber();
    nu.staldal.xtree.Element var72 = var61.getFirstChildElementOrNull("hi!", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var76 = new nu.staldal.xtree.Element("", "hi!", 10);
    var76.setSystemId("hi!");
    java.lang.String var79 = var76.getSystemId();
    var61.addChild((nu.staldal.xtree.Node)var76);
    java.lang.String var82 = var61.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var84 = var46.replaceChild((nu.staldal.xtree.Node)var61, 2);
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
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "hi!"+ "'", var79.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test198");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.hasBeenUpdated(1433461933000L);
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

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test199");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    java.lang.String var3 = var0.getDescription();
    java.lang.String var4 = var0.getTaskName();
    var0.init();
    org.apache.tools.ant.Location var6 = var0.getLocation();
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
    var7.reconfigure();
    var7.init();
    org.apache.tools.ant.Location var41 = var7.getLocation();
    var0.setLocation(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
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
    assertNotNull(var41);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test200");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var8 = var4.getSystemId();
    java.lang.String var9 = var4.getTextContent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeAttribute((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test201");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.ftp.FTPException~~~~~~~~ hi!", "_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_", 0, 1);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test202");


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
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    boolean var19 = var0.needPassword();
    boolean var20 = var0.needPassword();
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462024000L);
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test203");


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
    int var28 = var23.getColumnNumber();
    var23.setSystemId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    boolean var31 = var23.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test204");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu____46____staldal____46____ftp____46____FTPException____126________32____hi____33____", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test205");


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
    java.net.URL var55 = var33.getBaseURI();
    java.lang.String var58 = var33.getInheritedAttribute("nu.staldal.lagoon.util.TemplateException", "##");
    int var59 = var33.numberOfChildren();
    
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
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test206");


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
    java.lang.String var39 = var27.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
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
    assertNull(var39);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test207");


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
    var0.skippedEntity("nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.xtree.Element var54 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    java.lang.String var55 = var54.getLocalName();
    var0.setDocumentLocator((org.xml.sax.Locator)var54);
    nu.staldal.xtree.Element var57 = var54.getFirstChildElementOrNull();
    java.net.URL var58 = var54.getBaseURI();
    
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
    assertTrue("'" + var55 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var55.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test208");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var2, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var7, false, true);
    var1.toSAX((org.xml.sax.ContentHandler)var10);
    var10.startDocument();
    var10.endDocument();
    var10.endDocument();

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test209");


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
    int var29 = var28.getLineNumber();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test210");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    java.util.Enumeration var1 = var0.getParamNames();
    java.lang.String var3 = var0.getParam("hi!");
    boolean var5 = var0.hasBeenUpdated(10L);
    boolean var7 = var0.hasBeenUpdated(10L);
    boolean var9 = var0.hasBeenUpdated(1433461932000L);
    boolean var11 = var0.hasBeenUpdated(1433461930000L);
    nu.staldal.lagoon.core.XMLStreamProducer var12 = var0.getNext();
    boolean var14 = var0.hasBeenUpdated(1433461944000L);
    boolean var16 = var0.hasBeenUpdated(1433461978000L);
    var0.beforeBuild();
    
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

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test211");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__32_hi________________________________33________________________________", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var3 = var2.getFirstChildElement();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test212");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    int var13 = var4.lookupAttribute("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException");
    int var14 = var4.getColumnNumber();
    java.lang.String var16 = var4.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var19 = var4.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    int var20 = var4.numberOfAttributes();
    int var21 = var4.numberOfNamespaceMappings();
    java.lang.String var22 = var4.getNamespaceURI();
    
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "4444444444"+ "'", var22.equals("4444444444"));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test213");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", 100);
    java.lang.String var6 = var3.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.ftp.FTPException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test214");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    int var5 = var2.numberOfNamespaceMappings();
    java.lang.String var7 = var2.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    int var8 = var2.numberOfAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test215");


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
    var5.endElement("nu.staldal.ftp.FTPException:  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    nu.staldal.lagoon.core.XMLStreamProducer var59 = var5.getNext();
    var5.endElement("nu_46_staldal_46_lagoon_46_core_46_AuthenticationException", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test216");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.beforeBuild();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.hasBeenUpdated(1433461993000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test217");


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
    java.lang.String var28 = var11.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test218");


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
    nu.staldal.lagoon.producer.BasicSplit var28 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var30 = new nu.staldal.xtree.Text("hi!");
    char[] var31 = var30.asCharArray();
    var28.characters(var31, 1, 10);
    var28.endElement("", "hi!", "hi!");
    var28.processingInstruction("", "hi!");
    var28.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var28.startDocument();
    var28.beforeBuild();
    nu.staldal.xtree.Text var48 = new nu.staldal.xtree.Text("");
    char[] var49 = var48.asCharArray();
    char[] var50 = var48.asCharArray();
    var28.ignorableWhitespace(var50, 0, 100);
    var18.characters(var50, 0, 0);
    nu.staldal.xtree.Element var59 = new nu.staldal.xtree.Element("hi!", "hi!");
    var59.setSystemId("");
    java.net.URL var62 = var59.getBaseURI();
    java.lang.String var65 = var59.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var68 = new nu.staldal.xtree.Element("hi!", "hi!");
    var68.addNamespaceMapping("", "");
    var59.addChild((nu.staldal.xtree.Node)var68);
    var68.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var68.setLine(1);
    boolean var80 = var68.getPreserveSpace();
    int var81 = var68.getLineNumber();
    var68.setSystemId("4444444444");
    java.lang.String var85 = var68.lookupNamespacePrefix("4444444444");
    var18.setDocumentLocator((org.xml.sax.Locator)var68);
    java.lang.String var87 = var68.getTextContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + ""+ "'", var87.equals(""));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test219");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.net.URL var6 = var3.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var3.getAttrValue("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test220");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_"+ "'", var1.equals("nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_"));

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test221");


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
    nu.staldal.xtree.NodeWithChildren var21 = var4.getParent();
    int var22 = var4.numberOfAttributes();
    var4.setLine(1);
    nu.staldal.xtree.NodeWithChildren var25 = var4.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test222");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.maybeConfigure();
    var0.log("4444444444", 1);
    var0.setTargetURL("hi_33_");
    java.lang.String var7 = var0.getTaskName();
    java.lang.String var8 = var0.getTaskType();
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    var9.bindToOwner((org.apache.tools.ant.Task)var10);
    var10.log("hi!");
    var10.log("hi!", 100);
    java.lang.String var17 = var10.getTaskName();
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var21 = new nu.staldal.ftp.FTPException("hi!");
    var18.log("", (java.lang.Throwable)var21, 10);
    org.apache.tools.ant.Location var24 = var18.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var25 = var18.getRuntimeConfigurableWrapper();
    var18.setForce(false);
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var31 = new nu.staldal.ftp.FTPException("hi!");
    var28.log("", (java.lang.Throwable)var31, 10);
    var28.init();
    var28.init();
    java.lang.Object var36 = var28.clone();
    var28.init();
    var18.bindToOwner((org.apache.tools.ant.Task)var28);
    nu.staldal.lagoon.LagoonAntTask var39 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var42 = new nu.staldal.ftp.FTPException("hi!");
    var39.log("", (java.lang.Throwable)var42, 10);
    org.apache.tools.ant.Location var45 = var39.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var46 = var39.getRuntimeConfigurableWrapper();
    var39.setForce(false);
    org.apache.tools.ant.Location var49 = var39.getLocation();
    nu.staldal.lagoon.core.LagoonException var51 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var52 = var51.toString();
    var39.log((java.lang.Throwable)var51, 100);
    org.apache.tools.ant.Location var55 = var39.getLocation();
    var18.setLocation(var55);
    var10.setLocation(var55);
    var0.setLocation(var55);
    java.lang.String var59 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var52.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test223");


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
    var21.skippedEntity("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_aa");
    
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

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test224");


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
    nu.staldal.xmlutil.ContentHandlerAdapter var20 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var3);
    nu.staldal.lagoon.producer.BasicSplit var21 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("hi!");
    char[] var24 = var23.asCharArray();
    var21.characters(var24, 1, 10);
    var21.endElement("", "hi!", "hi!");
    var21.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var35 = new nu.staldal.xtree.Text("");
    char[] var36 = var35.asCharArray();
    char[] var37 = var35.asCharArray();
    char[] var38 = var35.asCharArray();
    var21.characters(var38, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var42 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var21);
    nu.staldal.xmlutil.DocumentHandlerAdapter var43 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var42);
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "hi!");
    var46.setSystemId("");
    java.net.URL var49 = var46.getBaseURI();
    java.lang.String var52 = var46.getAttrValueOrNull("", "");
    var43.setDocumentLocator((org.xml.sax.Locator)var46);
    nu.staldal.xtree.Text var55 = new nu.staldal.xtree.Text("");
    char[] var56 = var55.asCharArray();
    char[] var57 = var55.asCharArray();
    var43.characters(var57, 100, 100);
    nu.staldal.xtree.Element var63 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var64 = var63.getLineNumber();
    var63.setPublicId("");
    int var67 = var63.getLineNumber();
    java.lang.String var69 = var63.lookupNamespacePrefix("hi_33_");
    var43.setDocumentLocator((org.xml.sax.Locator)var63);
    var43.processingInstruction("", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var43.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var78 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var43, false, false);
    nu.staldal.xtree.Text var80 = new nu.staldal.xtree.Text("");
    char[] var81 = var80.asCharArray();
    var43.characters(var81, 0, 10);
    var3.characters(var81, 0, (-1));
    var3.afterBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test225");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    var9.addNamespaceMapping("", "4444444444");
    java.lang.String var16 = var9.getTextContent();
    var2.insertChild((nu.staldal.xtree.Node)var9, 0);
    var9.addAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var9.setPublicId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    int var28 = var9.lookupAttribute("nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____");
    java.net.URL var29 = var9.getBaseURI();
    int var30 = var9.numberOfNamespaceMappings();
    java.lang.String var32 = var9.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test226");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", 1, 0);
    nu.staldal.xtree.Element var7 = new nu.staldal.xtree.Element("hi!", "hi!");
    var7.setSystemId("");
    java.net.URL var10 = var7.getBaseURI();
    java.lang.String var13 = var7.getAttrValueOrNull("", "");
    java.lang.String var16 = var7.getAttrValueOrNull("hi_33_", "4444444444");
    var4.addChild((nu.staldal.xtree.Node)var7);
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("_32_", "nu.staldal.lagoon.util.TemplateException: ");
    var4.addChild((nu.staldal.xtree.Node)var20);
    boolean var22 = var20.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test227");


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
    java.lang.String var35 = var34.getTextContentOrNull();
    java.lang.String var37 = var34.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________");
    int var38 = var34.numberOfNamespaceMappings();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test228");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var18 = var0.getParam("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var21 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test229");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    java.lang.String var4 = var3.getLocalName();
    java.lang.String var7 = var3.getInheritedAttribute("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.ftp.FTPException:  ");
    java.lang.String var9 = var3.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException~ ");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("hi!", "hi!");
    var12.setSystemId("");
    java.net.URL var15 = var12.getBaseURI();
    java.lang.String var18 = var12.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("hi!", "hi!");
    var21.addNamespaceMapping("", "");
    var12.addChild((nu.staldal.xtree.Node)var21);
    boolean var26 = var12.getPreserveSpace();
    nu.staldal.xtree.Node var28 = var12.getChild(0);
    int var29 = var12.getLineNumber();
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    var12.insertChild((nu.staldal.xtree.Node)var31, 0);
    java.lang.String var34 = var31.getValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var36 = var3.replaceChild((nu.staldal.xtree.Node)var31, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!"+ "'", var34.equals("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!"));

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test230");


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
    java.util.Enumeration var94 = var0.getParamNames();
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException~ ");
    
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
    assertNotNull(var94);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test231");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Project var8 = var0.getProject();
    var0.setForce(false);
    var0.setTargetURL("##########");
    var0.maybeConfigure();
    var0.setForce(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test232");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.init();
    var0.endPrefixMapping("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.lagoon.producer.BasicSplit var8 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var10 = new nu.staldal.xtree.Text("hi!");
    char[] var11 = var10.asCharArray();
    var8.characters(var11, 1, 10);
    var8.endElement("", "hi!", "hi!");
    var8.processingInstruction("", "hi!");
    var8.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var8.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var26 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    java.util.Enumeration var27 = var8.getParamNames();
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("hi!", "hi!");
    var30.setLine(100);
    java.lang.String var34 = var30.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var8.setDocumentLocator((org.xml.sax.Locator)var30);
    java.lang.String var37 = var30.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~ ");
    var7.setDocumentLocator((org.xml.sax.Locator)var30);
    java.lang.String var40 = var30.lookupNamespaceURI("44");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var43 = var30.getAttrValue("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:  ", "nu.staldal.lagoon.core.LagoonException: aa");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test233");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getValue();
    java.lang.String var5 = var2.getValue();
    var2.setLine(2);
    java.lang.String var8 = var2.getTarget();
    java.lang.String var11 = var2.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.ftp.FTPException~  ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var5.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var8.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test234");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu.staldal.lagoon.core.LagoonException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var2.getAttrValue("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test235");


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
    java.lang.String var92 = var84.getTextContentOrNull();
    java.lang.String var94 = var84.getAttrValueOrNull("##");
    
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
    assertTrue("'" + var92 + "' != '" + ""+ "'", var92.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var94);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test236");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var3 = var1.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var4 = var1.getValue();
    boolean var5 = var1.isWhitespaceNode();
    boolean var6 = var1.isWhitespaceNode();
    var1.setColumn(2);
    char[] var9 = var1.asCharArray();
    char[] var10 = var1.asCharArray();
    char[] var11 = var1.asCharArray();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test237");


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
    var22.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.Element var60 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ", "##", 10, 0);
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

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test238");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setDescription("4444444444");
    var0.init();
    nu.staldal.lagoon.LagoonAntTask var4 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var7 = new nu.staldal.ftp.FTPException("hi!");
    var4.log("", (java.lang.Throwable)var7, 10);
    org.apache.tools.ant.Location var10 = var4.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var11 = var4.getRuntimeConfigurableWrapper();
    var4.setForce(false);
    nu.staldal.lagoon.util.TemplateException var15 = new nu.staldal.lagoon.util.TemplateException("4444444444");
    var4.log((java.lang.Throwable)var15, 1);
    org.apache.tools.ant.RuntimeConfigurable var18 = var4.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var18);
    org.apache.tools.ant.Target var20 = var0.getOwningTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test239");


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
    int var24 = var2.numberOfChildren();
    var2.setLine(0);
    nu.staldal.xtree.Element var29 = new nu.staldal.xtree.Element("hi!", "hi!");
    var29.setLine(100);
    nu.staldal.xtree.Element var36 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var39 = var36.lookupAttribute("4444444444", "hi!");
    var36.addNamespaceMapping("", "4444444444");
    java.lang.String var43 = var36.getTextContent();
    var29.insertChild((nu.staldal.xtree.Node)var36, 0);
    java.net.URL var46 = var29.getBaseURI();
    int var47 = var29.getColumnNumber();
    nu.staldal.xtree.Element var48 = var29.getFirstChildElement();
    java.lang.String var50 = var48.getAttributeNamespaceURI((-1));
    var2.addChild((nu.staldal.xtree.Node)var48);
    boolean var52 = var48.getPreserveSpace();
    
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
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test240");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    var0.close();
    boolean var8 = var0.isReentrant();
    boolean var9 = var0.isReentrant();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.OutputHandler var11 = var0.createFile("_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462025000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test241");


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
    var9.setTaskName("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    java.lang.String var21 = var9.getTaskType();
    org.apache.tools.ant.Target var22 = var9.getOwningTarget();
    var9.setTaskName("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var21.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test242");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    char[] var3 = var1.asCharArray();
    char[] var4 = var1.asCharArray();
    boolean var5 = var1.isWhitespaceNode();
    int var6 = var1.getColumnNumber();
    boolean var7 = var1.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test243");


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
    char[] var27 = var1.asCharArray();
    char[] var28 = var1.asCharArray();
    java.lang.String var29 = var1.getValue();
    boolean var30 = var1.isWhitespaceNode();
    boolean var31 = var1.isWhitespaceNode();
    java.lang.String var32 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test244");


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
    var12.setTaskType("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    var12.setTargetURL("##");
    var12.setPassword("nu.staldal.ftp.FTPException:           ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test245");


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

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test246");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    var9.setSystemId("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    nu.staldal.lagoon.producer.BasicSplit var12 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("hi!");
    char[] var15 = var14.asCharArray();
    var12.characters(var15, 1, 10);
    var12.endElement("", "hi!", "hi!");
    var12.processingInstruction("", "hi!");
    nu.staldal.xtree.Text var27 = new nu.staldal.xtree.Text("");
    char[] var28 = var27.asCharArray();
    char[] var29 = var27.asCharArray();
    var12.ignorableWhitespace(var29, 10, 0);
    java.lang.String var34 = var12.getParam("");
    nu.staldal.lagoon.producer.BasicSplit var35 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var37 = new nu.staldal.xtree.Text("hi!");
    char[] var38 = var37.asCharArray();
    var35.characters(var38, 1, 10);
    var35.endElement("", "hi!", "hi!");
    var35.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var49 = new nu.staldal.xtree.Text("");
    char[] var50 = var49.asCharArray();
    char[] var51 = var49.asCharArray();
    char[] var52 = var49.asCharArray();
    var35.characters(var52, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var56 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var35);
    nu.staldal.xmlutil.DocumentHandlerAdapter var57 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var56);
    nu.staldal.xtree.Element var60 = new nu.staldal.xtree.Element("hi!", "hi!");
    var60.setSystemId("");
    java.net.URL var63 = var60.getBaseURI();
    java.lang.String var66 = var60.getAttrValueOrNull("", "");
    var57.setDocumentLocator((org.xml.sax.Locator)var60);
    var57.startDocument();
    char[] var69 = new char[] { };
    var57.characters(var69, 100, (-1));
    var12.ignorableWhitespace(var69, 0, 10);
    nu.staldal.lagoon.core.XMLStreamProducer var76 = var12.getNext();
    var9.outputEndElement((org.xml.sax.ContentHandler)var12);
    java.lang.String var78 = var9.getPublicId();
    var9.setColumn(1);
    var5.setDocumentLocator((org.xml.sax.Locator)var9);
    java.lang.String var83 = var9.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    boolean var84 = var9.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test247");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 0);
    java.lang.String var4 = var3.getTextContentOrNull();
    nu.staldal.xtree.Element var7 = var3.getFirstChildElementOrNull("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "aaaaaaaaaa");
    int var8 = var3.numberOfChildren();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test248");


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
    var2.beforeBuild();
    var2.startDocument();
    nu.staldal.lagoon.core.XMLStreamProducer var28 = var2.getNext();
    nu.staldal.lagoon.producer.BasicSplit var29 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text("hi!");
    char[] var32 = var31.asCharArray();
    var29.characters(var32, 1, 10);
    var29.endElement("", "hi!", "hi!");
    var29.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var42 = new nu.staldal.lagoon.producer.IslandSplit();
    var42.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var45 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var42, true);
    char[] var48 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var52 = new nu.staldal.xtree.Text(var48, 1, 0, false);
    var45.setDocumentLocator((org.xml.sax.Locator)var52);
    char[] var54 = var52.asCharArray();
    var29.characters(var54, 10, 0);
    var29.processingInstruction("hi!", "hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var61 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var29);
    nu.staldal.xmlutil.ContentHandlerFixer var62 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var61);
    nu.staldal.xtree.Element var65 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var66 = var65.getLineNumber();
    var65.setPublicId("");
    java.lang.String var71 = var65.getInheritedAttribute("", "4444444444");
    int var72 = var65.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var73 = new nu.staldal.xtree.TreeBuilder();
    var73.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var78 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var73, false, false);
    var65.toSAX((org.xml.sax.ContentHandler)var78);
    nu.staldal.xmlutil.ContentHandlerFixer var81 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var78, true);
    nu.staldal.xtree.Text var83 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var85 = var83.lookupNamespaceURI("");
    char[] var86 = var83.asCharArray();
    var78.ignorableWhitespace(var86, 0, 100);
    var62.ignorableWhitespace(var86, 100, (-1));
    var2.characters(var86, 100, 2);
    
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
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test249");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    int var7 = var0.getPosition();
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.producer.BasicSplit var10 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("hi!");
    char[] var13 = var12.asCharArray();
    var10.characters(var13, 1, 10);
    var10.endElement("", "hi!", "hi!");
    var10.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var23 = new nu.staldal.lagoon.producer.IslandSplit();
    var23.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var26 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var23, true);
    char[] var29 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var33 = new nu.staldal.xtree.Text(var29, 1, 0, false);
    var26.setDocumentLocator((org.xml.sax.Locator)var33);
    char[] var35 = var33.asCharArray();
    var10.characters(var35, 10, 0);
    var0.characters(var35, 10, 2);
    nu.staldal.xmlutil.ContentHandlerAdapter var42 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test250");


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
    var0.log("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", 2);
    var0.setDescription("nu.staldal.lagoon.core.LagoonException~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test251");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu.staldal.ftp.FTPException: nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test252");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    java.lang.String var6 = var1.getTaskName();
    nu.staldal.lagoon.core.LagoonException var8 = new nu.staldal.lagoon.core.LagoonException("a");
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var12 = new nu.staldal.ftp.FTPException("hi!");
    var9.log("", (java.lang.Throwable)var12, 10);
    org.apache.tools.ant.Project var15 = var9.getProject();
    nu.staldal.lagoon.util.TemplateException var17 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var18 = var17.getException();
    var9.log("", (java.lang.Throwable)var17, (-1));
    java.lang.Throwable[] var21 = var17.getSuppressed();
    java.lang.Throwable[] var22 = var17.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var24 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var25 = var24.toString();
    var17.addSuppressed((java.lang.Throwable)var24);
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var30 = new nu.staldal.ftp.FTPException("hi!");
    var27.log("", (java.lang.Throwable)var30, 10);
    org.apache.tools.ant.Location var33 = var27.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var34 = var27.getRuntimeConfigurableWrapper();
    var27.setForce(false);
    org.apache.tools.ant.Location var37 = var27.getLocation();
    nu.staldal.lagoon.core.LagoonException var39 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var40 = var39.toString();
    var27.log((java.lang.Throwable)var39, 100);
    var24.addSuppressed((java.lang.Throwable)var39);
    var8.addSuppressed((java.lang.Throwable)var39);
    var1.log((java.lang.Throwable)var39, 100);
    java.lang.String var47 = var39.toString();
    java.lang.Exception var48 = var39.getException();
    java.lang.Exception var49 = var39.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var25.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var40.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var47.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test253");


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
    java.lang.String var20 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi_33_"+ "'", var20.equals("hi_33_"));

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test254");


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
    var5.setSystemId("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    
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

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test255");


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
    var0.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", (-1));
    org.apache.tools.ant.RuntimeConfigurable var37 = var0.getRuntimeConfigurableWrapper();
    
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
    assertNotNull(var37);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test256");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    var0.log("");
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    var9.maybeConfigure();
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var14 = new nu.staldal.ftp.FTPException("hi!");
    var11.log("", (java.lang.Throwable)var14, 10);
    org.apache.tools.ant.Location var17 = var11.getLocation();
    nu.staldal.lagoon.core.LagoonException var20 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var11.log("4444444444", (java.lang.Throwable)var20, 100);
    org.apache.tools.ant.RuntimeConfigurable var23 = var11.getRuntimeConfigurableWrapper();
    var9.setRuntimeConfigurableWrapper(var23);
    var0.setRuntimeConfigurableWrapper(var23);
    var0.setDescription("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.reconfigure();
    org.apache.tools.ant.Location var29 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test257");


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
    int var65 = var46.numberOfAttributes();
    java.lang.String var67 = var46.getAttributeValue((-1));
    
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
    assertTrue(var65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test258");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    var0.init();
    var0.init();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var4 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var5 = var0.getNext();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var7 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var8 = var0.getNext();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test259");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_");

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test260");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "", 100);
    boolean var4 = var3.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test261");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test262");


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
    var22.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    var22.skippedEntity("nu.staldal.lagoon.util.TemplateException: hi!");
    var22.skippedEntity("nu.staldal.lagoon.util.TemplateException");
    
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

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test263");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.endDocument();
    var8.startDocument();
    nu.staldal.xtree.Element var12 = var8.getTree();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.endElement("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.LagoonException~~ hi____33____");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test264");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________", 1, 2);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test265");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var2.setLine(0);
    var2.setSystemId("a");
    java.lang.String var8 = var2.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test266");


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
    nu.staldal.lagoon.producer.BasicSplit var23 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var25 = new nu.staldal.xtree.Text("hi!");
    char[] var26 = var25.asCharArray();
    var23.characters(var26, 1, 10);
    var0.characters(var26, 0, (-1));
    java.lang.String var33 = var0.getEntryName();
    var0.afterBuild();
    var0.startDocument();
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test267");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    var0.setPassword("nu.staldal.lagoon.util.TemplateException: ");
    var0.maybeConfigure();
    org.apache.tools.ant.Location var15 = var0.getLocation();
    var0.setTaskName("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var21 = new nu.staldal.ftp.FTPException("hi!");
    var18.log("", (java.lang.Throwable)var21, 10);
    var18.init();
    var18.init();
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    var26.maybeConfigure();
    var26.log("4444444444", 1);
    var26.setTargetURL("hi_33_");
    nu.staldal.lagoon.LagoonAntTask var33 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var36 = new nu.staldal.ftp.FTPException("hi!");
    var33.log("", (java.lang.Throwable)var36, 10);
    org.apache.tools.ant.Project var39 = var33.getProject();
    nu.staldal.lagoon.util.TemplateException var41 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var42 = var41.getException();
    var33.log("", (java.lang.Throwable)var41, (-1));
    java.lang.Throwable[] var45 = var41.getSuppressed();
    var26.log((java.lang.Throwable)var41, 0);
    org.apache.tools.ant.RuntimeConfigurable var48 = var26.getRuntimeConfigurableWrapper();
    var18.setRuntimeConfigurableWrapper(var48);
    var0.setRuntimeConfigurableWrapper(var48);
    var0.setDescription("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test268");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test269");


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
    var2.setPublicId("nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var28 = var2.getInheritedAttribute("44", "nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
    
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
    assertNull(var28);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test270");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    var3.setSystemId("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    nu.staldal.lagoon.producer.BasicSplit var6 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var8 = new nu.staldal.xtree.Text("hi!");
    char[] var9 = var8.asCharArray();
    var6.characters(var9, 1, 10);
    var6.endElement("", "hi!", "hi!");
    var6.processingInstruction("", "hi!");
    nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text("");
    char[] var22 = var21.asCharArray();
    char[] var23 = var21.asCharArray();
    var6.ignorableWhitespace(var23, 10, 0);
    java.lang.String var28 = var6.getParam("");
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
    var51.startDocument();
    char[] var63 = new char[] { };
    var51.characters(var63, 100, (-1));
    var6.ignorableWhitespace(var63, 0, 10);
    nu.staldal.lagoon.core.XMLStreamProducer var70 = var6.getNext();
    var3.outputEndElement((org.xml.sax.ContentHandler)var6);
    java.lang.String var72 = var3.getPublicId();
    var3.setColumn(1);
    int var75 = var3.numberOfAttributes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var77 = var3.removeChild(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
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
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 0);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test271");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "", 10, 0);
    java.lang.String var6 = var4.lookupNamespaceURI("_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var4.setColumn(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test272");


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
    nu.staldal.xtree.Element var53 = new nu.staldal.xtree.Element("hi!", "hi!");
    var53.setSystemId("");
    java.net.URL var56 = var53.getBaseURI();
    java.lang.String var59 = var53.getAttrValueOrNull("", "");
    java.lang.String var60 = var53.getTextContent();
    var53.setColumn(100);
    boolean var63 = var53.getPreserveSpace();
    boolean var64 = var53.getPreserveSpace();
    var53.setPublicId("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var21.setDocumentLocator((org.xml.sax.Locator)var53);
    boolean var68 = var53.getPreserveSpace();
    
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
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + ""+ "'", var60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test273");


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
    java.lang.String var32 = var0.getTaskType();
    java.lang.String var33 = var0.getDescription();
    
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
    assertNull(var33);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test274");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    int var19 = var11.getColumnNumber();
    java.lang.String var21 = var11.getAttrValueOrNull(" ");
    var11.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    int var27 = var11.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_AuthenticationException", "nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var30 = var11.getFirstChildElement("nu.staldal.lagoon.util.TemplateException: aa", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
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
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test275");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException~~ ", "nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__nu__46__staldal__46__ftp__46__FTPException__58____32__hi__33__", 2);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test276");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    long var8 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: ");
    var0.close();
    nu.staldal.lagoon.core.OutputHandler var11 = var0.createFile("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    boolean var12 = var0.needPassword();
    boolean var13 = var0.isReentrant();
    nu.staldal.lagoon.core.OutputHandler var15 = var0.createFile("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    boolean var16 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462025000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1433462019000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test277");


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
    var26.setSystemId("");
    java.net.URL var29 = var26.getBaseURI();
    java.lang.String var32 = var26.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("hi!", "hi!");
    var35.addNamespaceMapping("", "");
    var26.addChild((nu.staldal.xtree.Node)var35);
    java.lang.String var42 = var35.getInheritedAttribute("", "hi!");
    int var43 = var35.getColumnNumber();
    java.lang.String var44 = var35.getNamespaceURI();
    int var47 = var35.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var23.setDocumentLocator((org.xml.sax.Locator)var35);
    var23.endPrefixMapping("4");
    var23.processingInstruction(".", "hi____33____");
    var23.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test278");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    boolean var3 = var2.isWhitespaceNode();
    var2.setColumn(10);
    nu.staldal.lagoon.producer.BasicSplit var6 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var8 = new nu.staldal.xtree.Text("hi!");
    char[] var9 = var8.asCharArray();
    var6.characters(var9, 1, 10);
    var6.endElement("", "hi!", "hi!");
    var6.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var19 = new nu.staldal.lagoon.producer.IslandSplit();
    var19.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var22 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var19, true);
    char[] var25 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var29 = new nu.staldal.xtree.Text(var25, 1, 0, false);
    var22.setDocumentLocator((org.xml.sax.Locator)var29);
    char[] var31 = var29.asCharArray();
    var6.characters(var31, 10, 0);
    nu.staldal.xmlutil.ContentHandlerFixer var37 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var6, false, false);
    nu.staldal.xmlutil.ContentHandlerFixer var40 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var6, true, false);
    var2.toSAX((org.xml.sax.ContentHandler)var40);
    var2.setLine(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test279");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:                                                                                                     ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test280");


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
    boolean var27 = var23.isWhitespaceNode();
    var23.setColumn(0);
    char[] var30 = var23.asCharArray();
    int var31 = var23.getColumnNumber();
    java.lang.String var33 = var23.lookupNamespacePrefix("nu.staldal.ftp.FTPException~~ hi!");
    char[] var34 = var23.asCharArray();
    boolean var35 = var23.isWhitespaceNode();
    var18.setDocumentLocator((org.xml.sax.Locator)var23);
    boolean var37 = var23.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test281");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    boolean var2 = var1.isWhitespaceNode();
    boolean var3 = var1.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test282");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    var2.addNamespaceMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test283");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__32_hi________________________________33________________________________");

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test284");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var6 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test285");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    var9.addNamespaceMapping("", "4444444444");
    java.lang.String var16 = var9.getTextContent();
    var2.insertChild((nu.staldal.xtree.Node)var9, 0);
    boolean var19 = var9.getPreserveSpace();
    var9.addNamespaceMapping("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var24 = var9.getAttributeType((-1));
    java.lang.String var25 = var9.getSystemId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test286");


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
    var4.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_AuthenticationException");
    var4.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Text var22 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    char[] var23 = var22.asCharArray();
    var4.ignorableWhitespace(var23, 1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test287");


    nu.staldal.lagoon.core.AuthenticationMissingException var0 = new nu.staldal.lagoon.core.AuthenticationMissingException();
    java.lang.Throwable[] var1 = var0.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var2 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var0);
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.AuthenticationMissingException"+ "'", var3.equals("nu.staldal.lagoon.core.AuthenticationMissingException"));

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test288");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    var0.beforeBuild();
    var0.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test289");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8);
    var14.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var14.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var20 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var14, false, false);
    var14.startDocument();
    var14.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test290");


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
    java.util.Enumeration var21 = var0.getParamNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test291");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test292");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.Exception var2 = var1.getException();
    java.lang.Exception var3 = var1.getException();
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test293");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test294");


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
    var0.log("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 2);
    java.lang.String var20 = var0.getTaskName();
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    var21.bindToOwner((org.apache.tools.ant.Task)var22);
    var21.setForce(true);
    java.lang.String var26 = var21.getTaskName();
    var21.setTaskType("4444444444");
    var21.log("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", 0);
    var21.setTargetURL("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    var21.init();
    nu.staldal.lagoon.LagoonAntTask var35 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var38 = new nu.staldal.ftp.FTPException("hi!");
    var35.log("", (java.lang.Throwable)var38, 10);
    var35.init();
    var35.init();
    java.lang.String var43 = var35.getDescription();
    nu.staldal.lagoon.LagoonAntTask var44 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var47 = new nu.staldal.ftp.FTPException("hi!");
    var44.log("", (java.lang.Throwable)var47, 10);
    org.apache.tools.ant.Project var50 = var44.getProject();
    var35.bindToOwner((org.apache.tools.ant.Task)var44);
    var44.setTaskType("nu.staldal.lagoon.core.LagoonException: ");
    var44.setTargetURL("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var44.setPassword("nu.staldal.lagoon.core.AuthenticationMissingException");
    var21.bindToOwner((org.apache.tools.ant.Task)var44);
    var44.maybeConfigure();
    org.apache.tools.ant.RuntimeConfigurable var60 = var44.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var60);
    nu.staldal.lagoon.core.LagoonException var63 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException: aa");
    var0.log((java.lang.Throwable)var63, 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test295");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    java.lang.String var6 = var0.getDescription();
    var0.setPassword("nu.staldal.lagoon.core.LagoonException: ");
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test296");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.util.TemplateException: hi!");
    nu.staldal.lagoon.producer.BasicSplit var2 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var4 = new nu.staldal.xtree.Text("hi!");
    char[] var5 = var4.asCharArray();
    var2.characters(var5, 1, 10);
    var2.endElement("", "hi!", "hi!");
    var2.processingInstruction("", "hi!");
    var2.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("hi!", "hi!");
    var21.setSystemId("");
    java.net.URL var24 = var21.getBaseURI();
    java.lang.String var27 = var21.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("hi!", "hi!");
    var30.addNamespaceMapping("", "");
    var21.addChild((nu.staldal.xtree.Node)var30);
    java.lang.String var36 = var30.getAttrValueOrNull("");
    nu.staldal.xtree.Element var39 = new nu.staldal.xtree.Element("hi!", "hi!");
    var39.setSystemId("");
    java.net.URL var42 = var39.getBaseURI();
    java.lang.String var45 = var39.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var48 = new nu.staldal.xtree.Element("hi!", "hi!");
    var48.addNamespaceMapping("", "");
    var39.addChild((nu.staldal.xtree.Node)var48);
    var39.setSystemId("");
    nu.staldal.xtree.Element var57 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var58 = var57.getLineNumber();
    var57.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var64 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var65 = var64.getLineNumber();
    var64.addNamespaceMapping("", "");
    var57.addChild((nu.staldal.xtree.Node)var64);
    var39.insertChild((nu.staldal.xtree.Node)var57, 0);
    var30.addChild((nu.staldal.xtree.Node)var39);
    var39.setLine((-1));
    int var75 = var39.getLineNumber();
    var2.setDocumentLocator((org.xml.sax.Locator)var39);
    nu.staldal.xtree.TreeBuilder var77 = new nu.staldal.xtree.TreeBuilder();
    var77.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var82 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var83 = var82.getLineNumber();
    var82.setPublicId("");
    int var86 = var82.getLineNumber();
    var77.setDocumentLocator((org.xml.sax.Locator)var82);
    var77.startDocument();
    var77.skippedEntity("                                                                                                    ");
    var39.outputStartElement((org.xml.sax.ContentHandler)var77);
    var77.skippedEntity("_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var1.toSAX((org.xml.sax.ContentHandler)var77);
    var77.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == (-1));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test297");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    java.lang.String var6 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var7 = var2.getTextContent();
    java.lang.String var10 = var2.getInheritedAttribute("hi_33_", "hi!");
    var2.addNamespaceMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException~~ ");
    int var14 = var2.getLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test298");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    nu.staldal.lagoon.core.OutputHandler var8 = var0.createFile("4444444444");
    long var10 = var0.fileLastModified("hi!");
    long var12 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    boolean var15 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    boolean var18 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462025000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1433462023000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test299");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, true);
    nu.staldal.xtree.Text var10 = new nu.staldal.xtree.Text("4444444444");
    int var11 = var10.getColumnNumber();
    var5.setDocumentLocator((org.xml.sax.Locator)var10);
    var5.endDocument();
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var17 = var16.getLineNumber();
    java.lang.String var18 = var16.getSystemId();
    var16.addAttribute("", "hi!", "", "hi!");
    java.lang.String var26 = var16.getInheritedAttribute("hi!", "4444444444");
    java.lang.String var28 = var16.lookupNamespaceURI("");
    nu.staldal.xtree.ProcessingInstruction var31 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    var16.addChild((nu.staldal.xtree.Node)var31);
    var5.setDocumentLocator((org.xml.sax.Locator)var31);
    var5.startPrefixMapping("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!");
    var5.skippedEntity("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test300");


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
    var34.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
    
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

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test301");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var3 = var2.getPreserveSpace();
    var2.addAttribute("hi_33_", "nu.staldal.lagoon.core.LagoonException: ", "4444444444", "4444444444");
    java.lang.String var10 = var2.getAttributeValue(0);
    nu.staldal.xtree.TreeBuilder var11 = new nu.staldal.xtree.TreeBuilder();
    var11.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var16 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var11, false, true);
    var16.startPrefixMapping("nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var20 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var16);
    var2.toSAX((org.xml.sax.ContentHandler)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "4444444444"+ "'", var10.equals("4444444444"));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test302");


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
    java.lang.String var26 = var2.getNamespaceURI();
    java.lang.String var27 = var2.getNamespaceURI();
    java.net.URL var28 = var2.getBaseURI();
    var2.addAttribute("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_");
    var2.setLine(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test303");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu_46_staldal_46_lagoon_46_core_46_AuthenticationException");

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test304");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    var0.beforeBuild();
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    var0.init();
    var0.init();
    var0.beforeBuild();

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test305");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_ftp_46_FTPException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.ftp.FTPException:                                                                                                     ");

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test306");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    int var19 = var11.getLineNumber();
    var11.setSystemId("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var23 = var11.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
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

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test307");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    var5.setDescription("hi_33_");
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    var11.maybeConfigure();
    var11.log("4444444444", 1);
    var11.setTargetURL("hi_33_");
    var11.setPassword("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var5.bindToOwner((org.apache.tools.ant.Task)var11);
    var5.setTaskName("nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_");

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test308");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    var4.setSystemId("hi!");
    int var8 = var4.getLineNumber();
    boolean var9 = var4.isWhitespaceNode();
    java.lang.String var10 = var4.getNamespaceURI();
    java.lang.String var11 = var4.getTextContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test309");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4", "nu.staldal.lagoon.core.LagoonException~~ ", 10);
    java.lang.String var6 = var3.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Element var9 = var3.getFirstChildElementOrNull("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    int var10 = var3.numberOfNamespaceMappings();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test310");


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
    var22.startDocument();
    var22.processingInstruction("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__util__46__TemplateException__126____32__", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    
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

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test311");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var3 = var2.getPublicId();
    java.lang.String var6 = var2.getInheritedAttribute("", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var2.setPublicId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var10 = var2.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test312");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.ftp.FTPException:           ");

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test313");


    nu.staldal.lagoon.producer.XMLFormatter var0 = new nu.staldal.lagoon.producer.XMLFormatter();
    var0.destroy();
    var0.beforeBuild();
    var0.init();
    var0.init();

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test314");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var2 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var0.afterBuild();
    int var4 = var0.getPosition();
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, false);
    var0.destroy();
    var0.afterBuild();
    var0.endPrefixMapping("hi__33__");
    var0.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test315");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("##");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "##"+ "'", var1.equals("##"));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test316");


    nu.staldal.lagoon.filestorage.SSHFileStorage var0 = new nu.staldal.lagoon.filestorage.SSHFileStorage();
    boolean var1 = var0.isReentrant();
    boolean var2 = var0.needPassword();
    boolean var3 = var0.isReentrant();
    boolean var4 = var0.needPassword();
    boolean var5 = var0.isReentrant();
    boolean var6 = var0.needPassword();
    boolean var7 = var0.isReentrant();
    boolean var8 = var0.needPassword();
    boolean var9 = var0.isReentrant();
    boolean var10 = var0.isReentrant();
    boolean var11 = var0.isReentrant();
    boolean var12 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test317");


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
    java.net.URL var20 = var19.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var22 = var19.getAttributeNamespaceURI(100);
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
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test318");


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
    nu.staldal.ftp.FTPException var28 = new nu.staldal.ftp.FTPException("hi!");
    var25.log("", (java.lang.Throwable)var28, 10);
    org.apache.tools.ant.Project var31 = var25.getProject();
    var25.setTaskName("                                                                                                    ");
    var25.init();
    nu.staldal.lagoon.LagoonAntTask var35 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    var35.bindToOwner((org.apache.tools.ant.Task)var36);
    var35.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var40 = new nu.staldal.lagoon.LagoonAntTask();
    var40.setPassword("");
    var35.bindToOwner((org.apache.tools.ant.Task)var40);
    org.apache.tools.ant.Project var44 = var35.getProject();
    org.apache.tools.ant.Project var45 = var35.getProject();
    var35.log("");
    var35.log("nu.staldal.lagoon.core.LagoonException: ");
    var25.bindToOwner((org.apache.tools.ant.Task)var35);
    nu.staldal.lagoon.LagoonAntTask var51 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var52 = new nu.staldal.lagoon.LagoonAntTask();
    var51.bindToOwner((org.apache.tools.ant.Task)var52);
    var52.log("hi!");
    java.lang.String var56 = var52.getTaskName();
    var52.init();
    org.apache.tools.ant.Location var58 = var52.getLocation();
    var25.setLocation(var58);
    org.apache.tools.ant.Project var60 = var25.getProject();
    org.apache.tools.ant.Location var61 = var25.getLocation();
    var0.setLocation(var61);
    
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
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test319");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("_32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test320");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    var0.init();
    var0.init();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test321");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 10, "nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test322");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_aa");

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test323");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    var0.setForce(false);
    org.apache.tools.ant.Location var5 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test324");


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
    var4.endPrefixMapping("_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_");
    var4.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test325");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    int var7 = var0.getPosition();
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var0.endElement("nu.staldal.ftp.FTPException:  ", "nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "nu.staldal.lagoon.util.TemplateException");
    int var14 = var0.getPosition();
    java.lang.String var15 = var0.getEntryName();
    java.util.Enumeration var16 = var0.getParamNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test326");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~ hi____33____", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", 100);
    java.lang.String var5 = var3.lookupNamespacePrefix("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var3.getAttributeNamespaceURI(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test327");


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
    nu.staldal.lagoon.LagoonAntTask var47 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var48 = var47.getDescription();
    java.lang.Object var49 = var47.clone();
    var28.bindToOwner((org.apache.tools.ant.Task)var47);
    nu.staldal.lagoon.LagoonAntTask var51 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var52 = new nu.staldal.lagoon.LagoonAntTask();
    var51.bindToOwner((org.apache.tools.ant.Task)var52);
    var52.log("hi!");
    java.lang.String var56 = var52.getTaskName();
    var52.init();
    org.apache.tools.ant.Location var58 = var52.getLocation();
    var52.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var52.log("", (-1));
    nu.staldal.lagoon.util.TemplateException var66 = new nu.staldal.lagoon.util.TemplateException("hi_33_");
    var52.log("", (java.lang.Throwable)var66, (-1));
    java.lang.String var69 = var66.toString();
    var47.log((java.lang.Throwable)var66, (-1));
    
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
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "nu.staldal.lagoon.util.TemplateException: hi_33_"+ "'", var69.equals("nu.staldal.lagoon.util.TemplateException: hi_33_"));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test328");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    org.apache.tools.ant.Project var7 = var0.getProject();
    java.lang.String var8 = var0.getDescription();
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test329");


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
    var18.setPublicId("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var59 = var18.getChild(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test330");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException~ ", "  ");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test331");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.setTaskType("4444444444");
    var0.maybeConfigure();
    var0.log("nu.staldal.lagoon.util.TemplateException: ");
    var0.init();
    var0.setTaskType("nu__46__staldal__46__lagoon__46__util__46__TemplateException__126____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test332");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.util.TemplateException", 0);
    java.net.URL var4 = var3.getBaseURI();
    boolean var5 = var3.getPreserveSpace();
    java.lang.String var6 = var3.getSystemId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test333");


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
    var22.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    nu.staldal.xmlutil.ContentHandlerFixer var67 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, true);
    
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

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test334");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", (-1));
    nu.staldal.xtree.Element var7 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.util.TemplateException", 0);
    nu.staldal.xtree.NodeWithChildren var8 = var7.getParent();
    int var9 = var7.numberOfChildren();
    var7.addNamespaceMapping("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", "nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    java.net.URL var13 = var7.getBaseURI();
    var3.addChild((nu.staldal.xtree.Node)var7);
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("", "hi!", 10);
    var18.setSystemId("hi!");
    java.lang.String var22 = var18.lookupNamespaceURI("4444444444");
    boolean var23 = var18.getPreserveSpace();
    java.net.URL var24 = var18.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var26 = var7.replaceChild((nu.staldal.xtree.Node)var18, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test335");


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
    var0.startDocument();
    var0.beforeBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test336");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var2 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var3 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var4 = var0.getNext();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var9 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test337");


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
    var0.processingInstruction("nu.staldal.lagoon.core.LagoonException: hi_33_", "          ");
    nu.staldal.xmlutil.ContentHandlerFixer var54 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    var54.endPrefixMapping("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Element var61 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    var61.setLine((-1));
    java.lang.String var65 = var61.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    int var66 = var61.numberOfAttributes();
    java.net.URL var67 = var61.getBaseURI();
    var54.setDocumentLocator((org.xml.sax.Locator)var61);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var70 = var61.getAttributeType(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test338");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi__33__", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", (-1), (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var6 = var4.removeChild(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test339");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    java.lang.String var6 = var0.getEntryName();
    nu.staldal.lagoon.core.LagoonContext var7 = var0.getContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.hasBeenUpdated(1433461956000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test340");


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
    boolean var76 = var75.getPreserveSpace();
    nu.staldal.xtree.NodeWithChildren var77 = var75.getParent();
    java.lang.String var80 = var77.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    java.lang.String var81 = var77.getSystemId();
    
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
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + ""+ "'", var81.equals(""));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test341");


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
    var23.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "                                                                                                    ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var23.setColumn(1);
    boolean var39 = var23.getPreserveSpace();
    
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
    assertTrue(var39 == false);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test342");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    java.lang.String var6 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var9 = var2.lookupAttribute("hi!", "");
    java.lang.String var11 = var2.lookupNamespaceURI("hi_33_");
    java.lang.String var13 = var2.lookupNamespaceURI("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test343");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.log("");
    org.apache.tools.ant.Target var5 = var0.getOwningTarget();
    org.apache.tools.ant.Target var6 = var0.getOwningTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test344");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("4444444444");
    nu.staldal.lagoon.producer.BasicSplit var2 = new nu.staldal.lagoon.producer.BasicSplit();
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    nu.staldal.xtree.Element var8 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var11 = var8.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var12 = new nu.staldal.xtree.TreeBuilder();
    var8.toSAX((org.xml.sax.ContentHandler)var12);
    var12.skippedEntity("hi!");
    var12.skippedEntity("hi!");
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var12.setDocumentLocator((org.xml.sax.Locator)var20);
    nu.staldal.xtree.Element var22 = var12.getTree();
    java.lang.String var23 = var22.getTextContent();
    var2.setDocumentLocator((org.xml.sax.Locator)var22);
    nu.staldal.xtree.Element var27 = var22.getFirstChildElementOrNull("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", " ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var29 = var22.getAttributeType(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test345");


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
    java.lang.String var12 = var0.getParam("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var0.hasBeenUpdated(1433462014000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test346");


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
    char[] var74 = var70.asCharArray();
    var56.ignorableWhitespace(var74, 1, 100);
    nu.staldal.xmlutil.ContentHandlerFixer var78 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var56);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var20.outputEndElement((org.xml.sax.ContentHandler)var78);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
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
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test347");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    var0.init();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    nu.staldal.lagoon.core.LagoonContext var6 = var0.getContext();
    nu.staldal.lagoon.core.XMLStreamProducer var7 = var0.getNext();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.hasBeenUpdated(1433462000000L);
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
    assertNull(var7);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test348");


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
    java.lang.String var51 = var49.getPublicId();
    
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
    assertNull(var51);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test349");


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
    java.lang.String var41 = var27.getNamespaceURI();
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("", "hi!", 10);
    var45.setSystemId("hi!");
    java.lang.String var48 = var45.getSystemId();
    int var49 = var45.getColumnNumber();
    java.lang.String var51 = var45.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    java.net.URL var52 = var45.getBaseURI();
    var27.addChild((nu.staldal.xtree.Node)var45);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var55 = var27.removeChild(1);
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
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test350");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    var0.setForce(false);
    org.apache.tools.ant.Target var5 = var0.getOwningTarget();
    var0.maybeConfigure();
    var0.log("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.LagoonAntTask var9 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var12 = new nu.staldal.ftp.FTPException("hi!");
    var9.log("", (java.lang.Throwable)var12, 10);
    org.apache.tools.ant.Location var15 = var9.getLocation();
    nu.staldal.lagoon.core.LagoonException var18 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var9.log("4444444444", (java.lang.Throwable)var18, 100);
    java.lang.String var21 = var18.toString();
    java.lang.Exception var22 = var18.getException();
    var0.log((java.lang.Throwable)var18, 1);
    var0.log("nu.staldal.lagoon.util.TemplateException", 2);
    var0.log("          ");
    java.lang.String var30 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var31 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    var31.bindToOwner((org.apache.tools.ant.Task)var32);
    var32.log("hi!");
    java.lang.String var36 = var32.getTaskName();
    org.apache.tools.ant.Target var37 = var32.getOwningTarget();
    var32.log("hi!", 1);
    org.apache.tools.ant.Location var41 = var32.getLocation();
    var0.setLocation(var41);
    java.lang.String var43 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var21.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test351");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTargetURL("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    java.lang.String var7 = var0.getTaskType();
    var0.maybeConfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test352");


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
    nu.staldal.xtree.TreeBuilder var55 = new nu.staldal.xtree.TreeBuilder();
    var55.endPrefixMapping("hi!");
    var55.endDocument();
    var55.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    nu.staldal.xtree.Text var63 = new nu.staldal.xtree.Text("");
    char[] var64 = var63.asCharArray();
    char[] var65 = var63.asCharArray();
    char[] var66 = var63.asCharArray();
    var55.ignorableWhitespace(var66, 1, 100);
    var27.characters(var66, 10, 2);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test353");


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
    java.lang.String var32 = var7.lookupNamespaceURI("nu____46____staldal____46____ftp____46____FTPException____126________32____hi____33____");
    
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
    assertNull(var32);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test354");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    boolean var1 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.core.OutputHandler var5 = var0.createFile("nu.staldal.lagoon.core.LagoonException: hi_33_");
    nu.staldal.lagoon.core.OutputHandler var7 = var0.createFile("                                                                                                    ");
    nu.staldal.lagoon.core.OutputHandler var9 = var0.createFile("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!");
    long var11 = var0.fileLastModified("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test355");


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
    var14.startDocument();
    var14.endDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test356");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    int var5 = var2.numberOfNamespaceMappings();
    boolean var6 = var2.getPreserveSpace();
    java.lang.String var9 = var2.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________");
    int var10 = var2.numberOfNamespaceMappings();
    var2.setColumn(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test357");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var3 = var2.getValue();
    var2.setPublicId("");
    java.lang.String var7 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var8.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var13 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8, false, false);
    var8.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("hi!", "hi!");
    var18.setLine(100);
    int var21 = var18.numberOfNamespaceMappings();
    var8.setDocumentLocator((org.xml.sax.Locator)var18);
    var8.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var8.endPrefixMapping("##########");
    var8.skippedEntity("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.toSAX((org.xml.sax.ContentHandler)var8);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var3.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test358");


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
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    var0.startDocument();
    nu.staldal.xtree.Element var22 = new nu.staldal.xtree.Element("hi!", "hi!");
    var22.setSystemId("");
    java.net.URL var25 = var22.getBaseURI();
    java.lang.String var28 = var22.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var31 = new nu.staldal.xtree.Element("hi!", "hi!");
    var31.addNamespaceMapping("", "");
    var22.addChild((nu.staldal.xtree.Node)var31);
    java.lang.String var37 = var31.getAttrValueOrNull("");
    nu.staldal.xtree.Element var40 = new nu.staldal.xtree.Element("hi!", "hi!");
    var40.setSystemId("");
    java.net.URL var43 = var40.getBaseURI();
    java.lang.String var46 = var40.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var49 = new nu.staldal.xtree.Element("hi!", "hi!");
    var49.addNamespaceMapping("", "");
    var40.addChild((nu.staldal.xtree.Node)var49);
    var40.setSystemId("");
    nu.staldal.xtree.Element var58 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var59 = var58.getLineNumber();
    var58.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var65 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var66 = var65.getLineNumber();
    var65.addNamespaceMapping("", "");
    var58.addChild((nu.staldal.xtree.Node)var65);
    var40.insertChild((nu.staldal.xtree.Node)var58, 0);
    var31.addChild((nu.staldal.xtree.Node)var40);
    int var74 = var31.getColumnNumber();
    java.lang.String var77 = var31.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "          ");
    var0.setDocumentLocator((org.xml.sax.Locator)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test359");


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
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", 1, (-1));
    var23.addChild((nu.staldal.xtree.Node)var28);
    java.net.URL var30 = var23.getBaseURI();
    var23.setColumn(2);
    
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
    assertNull(var30);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test360");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    nu.staldal.xmlutil.ContentHandlerAdapter var11 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    nu.staldal.xmlutil.DocumentHandlerAdapter var12 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var11);
    var12.endPrefixMapping("nu.staldal.lagoon.util.TemplateException~ hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test361");


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
    java.lang.Object var35 = var0.clone();
    nu.staldal.lagoon.util.TemplateException var37 = new nu.staldal.lagoon.util.TemplateException();
    nu.staldal.lagoon.util.TemplateException var38 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var37);
    java.lang.Exception var39 = var38.getException();
    nu.staldal.lagoon.util.TemplateException var40 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var38);
    nu.staldal.lagoon.LagoonAntTask var41 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var42 = new nu.staldal.lagoon.LagoonAntTask();
    var41.bindToOwner((org.apache.tools.ant.Task)var42);
    nu.staldal.lagoon.LagoonAntTask var45 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var48 = new nu.staldal.ftp.FTPException("hi!");
    var45.log("", (java.lang.Throwable)var48, 10);
    org.apache.tools.ant.Location var51 = var45.getLocation();
    nu.staldal.lagoon.core.LagoonException var54 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var45.log("4444444444", (java.lang.Throwable)var54, 100);
    java.lang.String var57 = var54.toString();
    nu.staldal.lagoon.LagoonAntTask var58 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var61 = new nu.staldal.ftp.FTPException("hi!");
    var58.log("", (java.lang.Throwable)var61, 10);
    org.apache.tools.ant.Project var64 = var58.getProject();
    nu.staldal.lagoon.util.TemplateException var66 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var67 = var66.getException();
    var58.log("", (java.lang.Throwable)var66, (-1));
    java.lang.Throwable[] var70 = var66.getSuppressed();
    java.lang.Throwable[] var71 = var66.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var73 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var74 = var73.toString();
    var66.addSuppressed((java.lang.Throwable)var73);
    var54.addSuppressed((java.lang.Throwable)var73);
    var41.log("4444444444", (java.lang.Throwable)var73, (-1));
    java.lang.String var79 = var73.toString();
    nu.staldal.lagoon.util.TemplateException var80 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var73);
    java.lang.Exception var81 = var73.getException();
    nu.staldal.lagoon.util.TemplateException var82 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var73);
    var40.addSuppressed((java.lang.Throwable)var73);
    var0.log("nu.staldal.lagoon.util.TemplateException: ", (java.lang.Throwable)var40, (-1));
    java.lang.Throwable[] var86 = var40.getSuppressed();
    
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
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var57.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var74.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var79.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test362");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    var0.setForce(false);
    org.apache.tools.ant.Target var5 = var0.getOwningTarget();
    var0.maybeConfigure();
    var0.setTargetURL("4444444444");
    var0.setDescription("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.setTaskName("##");
    java.lang.String var13 = var0.getTaskType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test363");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var8 = var7.getDescription();
    java.lang.Object var9 = var7.clone();
    org.apache.tools.ant.RuntimeConfigurable var10 = var7.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test364");


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
    nu.staldal.lagoon.LagoonAntTask var32 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var33 = new nu.staldal.lagoon.LagoonAntTask();
    var32.bindToOwner((org.apache.tools.ant.Task)var33);
    nu.staldal.lagoon.LagoonAntTask var35 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var38 = new nu.staldal.ftp.FTPException("hi!");
    var35.log("", (java.lang.Throwable)var38, 10);
    org.apache.tools.ant.Location var41 = var35.getLocation();
    var32.setLocation(var41);
    nu.staldal.lagoon.LagoonAntTask var43 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var44 = new nu.staldal.lagoon.LagoonAntTask();
    var43.bindToOwner((org.apache.tools.ant.Task)var44);
    var43.setForce(true);
    java.lang.String var48 = var43.getTaskName();
    var43.setTaskType("4444444444");
    var43.maybeConfigure();
    var32.bindToOwner((org.apache.tools.ant.Task)var43);
    nu.staldal.lagoon.LagoonAntTask var53 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var56 = new nu.staldal.ftp.FTPException("hi!");
    var53.log("", (java.lang.Throwable)var56, 10);
    org.apache.tools.ant.Location var59 = var53.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var60 = var53.getRuntimeConfigurableWrapper();
    var53.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var63 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var66 = new nu.staldal.ftp.FTPException("hi!");
    var63.log("", (java.lang.Throwable)var66, 10);
    org.apache.tools.ant.Project var69 = var63.getProject();
    nu.staldal.lagoon.util.TemplateException var71 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var72 = var71.getException();
    var63.log("", (java.lang.Throwable)var71, (-1));
    var53.bindToOwner((org.apache.tools.ant.Task)var63);
    org.apache.tools.ant.Location var76 = var63.getLocation();
    org.apache.tools.ant.Project var77 = var63.getProject();
    nu.staldal.ftp.FTPException var79 = new nu.staldal.ftp.FTPException("4444444444");
    nu.staldal.ftp.FTPException var81 = new nu.staldal.ftp.FTPException("hi!");
    var79.addSuppressed((java.lang.Throwable)var81);
    nu.staldal.lagoon.util.TemplateException var83 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var81);
    var63.log((java.lang.Throwable)var81, (-1));
    var43.log((java.lang.Throwable)var81, (-1));
    var43.setTargetURL("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.util.TemplateException var92 = new nu.staldal.lagoon.util.TemplateException("hi!");
    var43.log("nu.staldal.lagoon.core.LagoonException~ ", (java.lang.Throwable)var92, (-1));
    var0.log("#", (java.lang.Throwable)var92, 100);
    java.lang.Throwable[] var97 = var92.getSuppressed();
    java.lang.Throwable[] var98 = var92.getSuppressed();
    java.lang.Exception var99 = var92.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var99);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test365");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.setPublicId("");
    int var9 = var5.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var5);
    var5.addAttribute("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException~ 4444444444", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test366");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "_32_", 100, 1);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test367");


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
    boolean var42 = var2.getPreserveSpace();
    java.lang.String var43 = var2.getNamespaceURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var45 = var2.getAttributeType(100);
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
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "hi!"+ "'", var43.equals("hi!"));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test368");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.core.LagoonException~~~~                                                                                                     ", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ ", 10);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test369");


    nu.staldal.lagoon.producer.XMLFormatter var0 = new nu.staldal.lagoon.producer.XMLFormatter();
    var0.destroy();
    nu.staldal.lagoon.core.XMLStreamProducer var2 = var0.getNext();
    var0.init();
    java.util.Enumeration var4 = var0.getParamNames();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test370");


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
    var23.setColumn((-1));
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("nu.staldal.ftp.FTPException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.core.LagoonException: nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException", 0, 1);
    var23.addChild((nu.staldal.xtree.Node)var30);
    
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

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test371");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: ");

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test372");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.core.LagoonException~~~~                                                                                                     ", "nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test373");


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
    var19.setTaskName("nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test374");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test375");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException", 100);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test376");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException"+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException"));

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test377");


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
    nu.staldal.lagoon.producer.BasicSplit var57 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var59 = new nu.staldal.xtree.Text("hi!");
    char[] var60 = var59.asCharArray();
    var57.characters(var60, 1, 10);
    var57.endElement("", "hi!", "hi!");
    var57.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var70 = new nu.staldal.lagoon.producer.IslandSplit();
    var70.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var73 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var70, true);
    char[] var76 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var80 = new nu.staldal.xtree.Text(var76, 1, 0, false);
    var73.setDocumentLocator((org.xml.sax.Locator)var80);
    char[] var82 = var80.asCharArray();
    var57.characters(var82, 10, 0);
    var13.characters(var82, 10, (-1));
    var13.startDocument();
    var13.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test378");


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
    var9.maybeConfigure();
    var9.setTaskType("4");
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var23 = new nu.staldal.ftp.FTPException("hi!");
    var20.log("", (java.lang.Throwable)var23, 10);
    var20.init();
    var20.init();
    java.lang.String var28 = var20.getDescription();
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var32 = new nu.staldal.ftp.FTPException("hi!");
    var29.log("", (java.lang.Throwable)var32, 10);
    org.apache.tools.ant.Project var35 = var29.getProject();
    var20.bindToOwner((org.apache.tools.ant.Task)var29);
    var20.log("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 2);
    java.lang.String var40 = var20.getTaskName();
    var9.bindToOwner((org.apache.tools.ant.Task)var20);
    nu.staldal.lagoon.LagoonAntTask var42 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var43 = var42.getDescription();
    nu.staldal.lagoon.LagoonAntTask var44 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var45 = new nu.staldal.lagoon.LagoonAntTask();
    var44.bindToOwner((org.apache.tools.ant.Task)var45);
    var44.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var49 = new nu.staldal.lagoon.LagoonAntTask();
    var49.setPassword("");
    var44.bindToOwner((org.apache.tools.ant.Task)var49);
    org.apache.tools.ant.Project var53 = var44.getProject();
    org.apache.tools.ant.Project var54 = var44.getProject();
    org.apache.tools.ant.RuntimeConfigurable var55 = var44.getRuntimeConfigurableWrapper();
    var42.setRuntimeConfigurableWrapper(var55);
    var42.maybeConfigure();
    var42.log("4444444444");
    nu.staldal.lagoon.LagoonAntTask var61 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var64 = new nu.staldal.ftp.FTPException("hi!");
    var61.log("", (java.lang.Throwable)var64, 10);
    org.apache.tools.ant.Project var67 = var61.getProject();
    nu.staldal.lagoon.util.TemplateException var69 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var70 = var69.getException();
    var61.log("", (java.lang.Throwable)var69, (-1));
    java.lang.Throwable[] var73 = var69.getSuppressed();
    java.lang.Throwable[] var74 = var69.getSuppressed();
    var42.log("                                                                                                    ", (java.lang.Throwable)var69, 10);
    org.apache.tools.ant.Project var77 = var42.getProject();
    org.apache.tools.ant.Location var78 = var42.getLocation();
    var9.setLocation(var78);
    org.apache.tools.ant.Location var80 = var9.getLocation();
    var9.setTaskName("nu.staldal.ftp.FTPException: nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    java.lang.Object var83 = var9.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test379");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var0.destroy();
    var0.init();
    int var6 = var0.getPosition();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test380");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTargetURL("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    java.lang.String var7 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test381");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    boolean var3 = var1.isWhitespaceNode();
    char[] var4 = var1.asCharArray();
    boolean var5 = var1.getPreserveSpace();
    java.lang.String var6 = var1.getValue();
    int var7 = var1.getColumnNumber();
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var8.endPrefixMapping("hi!");
    var8.endDocument();
    var8.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    nu.staldal.xtree.Text var16 = new nu.staldal.xtree.Text("");
    char[] var17 = var16.asCharArray();
    char[] var18 = var16.asCharArray();
    char[] var19 = var16.asCharArray();
    var8.ignorableWhitespace(var19, 1, 100);
    nu.staldal.xmlutil.ContentHandlerAdapter var23 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    var8.endDocument();
    var8.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.AuthenticationMissingException");
    var8.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~~ ", "##########");
    var1.toSAX((org.xml.sax.ContentHandler)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.endElement("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test382");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var2.setSystemId("nu.staldal.lagoon.core.LagoonException: hi!");

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test383");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    java.lang.String var6 = var0.getTaskType();
    var0.setDescription("");
    var0.setTaskName("hi!");
    java.lang.Object var11 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test384");


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
    nu.staldal.lagoon.core.XMLStreamProducer var51 = var28.getNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var28.init();
      fail("Expected exception of type nu.staldal.lagoon.core.LagoonException");
    } catch (nu.staldal.lagoon.core.LagoonException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test385");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test386");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test387");


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
    int var21 = var17.getLineNumber();
    java.lang.String var22 = var17.getValue();
    int var23 = var17.getColumnNumber();
    var17.setSystemId("nu.staldal.ftp.FTPException: nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: hi_33_");
    
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
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "4444444444"+ "'", var22.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test388");


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
    var9.setTaskName("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    java.lang.Object var21 = var9.clone();
    nu.staldal.lagoon.util.TemplateException var24 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    var9.log("44", (java.lang.Throwable)var24, 2);
    org.apache.tools.ant.RuntimeConfigurable var27 = var9.getRuntimeConfigurableWrapper();
    var9.log("hi____33____", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test389");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var6 = new nu.staldal.ftp.FTPException("hi!");
    var3.log("", (java.lang.Throwable)var6, 10);
    org.apache.tools.ant.Location var9 = var3.getLocation();
    var0.setLocation(var9);
    org.apache.tools.ant.Location var11 = var0.getLocation();
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    var12.setPassword("");
    var12.setForce(false);
    org.apache.tools.ant.Target var17 = var12.getOwningTarget();
    var12.maybeConfigure();
    org.apache.tools.ant.RuntimeConfigurable var19 = var12.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var19);
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var24 = new nu.staldal.ftp.FTPException("hi!");
    var21.log("", (java.lang.Throwable)var24, 10);
    org.apache.tools.ant.Location var27 = var21.getLocation();
    nu.staldal.lagoon.core.LagoonException var30 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var21.log("4444444444", (java.lang.Throwable)var30, 100);
    java.lang.String var33 = var30.toString();
    java.lang.String var34 = var30.toString();
    java.lang.String var35 = var30.toString();
    var0.log((java.lang.Throwable)var30, 0);
    var0.log("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", 2);
    nu.staldal.lagoon.LagoonAntTask var41 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var44 = new nu.staldal.ftp.FTPException("hi!");
    var41.log("", (java.lang.Throwable)var44, 10);
    java.lang.String var47 = var41.getDescription();
    nu.staldal.lagoon.LagoonAntTask var48 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var51 = new nu.staldal.ftp.FTPException("hi!");
    var48.log("", (java.lang.Throwable)var51, 10);
    org.apache.tools.ant.Location var54 = var48.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var55 = var48.getRuntimeConfigurableWrapper();
    var48.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var58 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var61 = new nu.staldal.ftp.FTPException("hi!");
    var58.log("", (java.lang.Throwable)var61, 10);
    org.apache.tools.ant.Project var64 = var58.getProject();
    nu.staldal.lagoon.util.TemplateException var66 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var67 = var66.getException();
    var58.log("", (java.lang.Throwable)var66, (-1));
    var48.bindToOwner((org.apache.tools.ant.Task)var58);
    org.apache.tools.ant.Location var71 = var58.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var72 = var58.getRuntimeConfigurableWrapper();
    var41.setRuntimeConfigurableWrapper(var72);
    java.lang.String var74 = var41.getTaskType();
    var0.bindToOwner((org.apache.tools.ant.Task)var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var41.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var33.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var34.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var35.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test390");


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
    java.lang.String var25 = var2.lookupNamespacePrefix("nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__");
    java.lang.String var26 = var2.getPublicId();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "4444444444"+ "'", var26.equals("4444444444"));

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test391");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.core.OutputHandler var4 = var0.createFile("nu.staldal.lagoon.util.TemplateException: ");
    long var6 = var0.fileLastModified("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.core.OutputHandler var8 = var0.createFile("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    long var10 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    boolean var11 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1433462025000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1433462023000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test392");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test393");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    java.util.Enumeration var1 = var0.getParamNames();
    java.lang.String var3 = var0.getParam("hi!");
    boolean var5 = var0.hasBeenUpdated(10L);
    boolean var7 = var0.hasBeenUpdated(10L);
    boolean var9 = var0.hasBeenUpdated(1433461932000L);
    boolean var11 = var0.hasBeenUpdated(1433461930000L);
    boolean var13 = var0.hasBeenUpdated(1433462017000L);
    
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

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test394");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    var0.skippedEntity("");
    nu.staldal.xmlutil.ContentHandlerFixer var21 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    var24.setSystemId("");
    java.net.URL var27 = var24.getBaseURI();
    java.lang.String var30 = var24.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var33 = new nu.staldal.xtree.Element("hi!", "hi!");
    var33.addNamespaceMapping("", "");
    var24.addChild((nu.staldal.xtree.Node)var33);
    int var38 = var33.getColumnNumber();
    java.lang.String var40 = var33.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    int var43 = var33.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.setDocumentLocator((org.xml.sax.Locator)var33);
    java.lang.String var46 = var0.getParam("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test395");


    nu.staldal.lagoon.filestorage.SSHFileStorage var0 = new nu.staldal.lagoon.filestorage.SSHFileStorage();
    boolean var1 = var0.isReentrant();
    boolean var2 = var0.isReentrant();
    boolean var3 = var0.isReentrant();
    boolean var4 = var0.needPassword();
    boolean var5 = var0.isReentrant();
    boolean var6 = var0.needPassword();
    boolean var7 = var0.isReentrant();
    boolean var8 = var0.isReentrant();
    boolean var9 = var0.needPassword();
    boolean var10 = var0.needPassword();
    
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
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test396");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "");
    java.lang.String var3 = var2.getNamespaceURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var2.getAttrValue("nu.staldal.lagoon.core.LagoonException: 4444444444", "_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_"+ "'", var3.equals("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_"));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test397");


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
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    var26.bindToOwner((org.apache.tools.ant.Task)var27);
    var27.log("hi!");
    java.lang.String var31 = var27.getTaskName();
    var27.init();
    org.apache.tools.ant.Location var33 = var27.getLocation();
    var0.setLocation(var33);
    org.apache.tools.ant.Project var35 = var0.getProject();
    var0.setTaskType("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var0.log(".", 100);
    nu.staldal.lagoon.LagoonAntTask var41 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var42 = new nu.staldal.lagoon.LagoonAntTask();
    var41.bindToOwner((org.apache.tools.ant.Task)var42);
    var41.setForce(true);
    var41.setTaskName("");
    var41.log("");
    nu.staldal.lagoon.LagoonAntTask var50 = new nu.staldal.lagoon.LagoonAntTask();
    var50.maybeConfigure();
    nu.staldal.lagoon.LagoonAntTask var52 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var55 = new nu.staldal.ftp.FTPException("hi!");
    var52.log("", (java.lang.Throwable)var55, 10);
    org.apache.tools.ant.Location var58 = var52.getLocation();
    nu.staldal.lagoon.core.LagoonException var61 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var52.log("4444444444", (java.lang.Throwable)var61, 100);
    org.apache.tools.ant.RuntimeConfigurable var64 = var52.getRuntimeConfigurableWrapper();
    var50.setRuntimeConfigurableWrapper(var64);
    var41.setRuntimeConfigurableWrapper(var64);
    var0.setRuntimeConfigurableWrapper(var64);
    org.apache.tools.ant.RuntimeConfigurable var68 = var0.getRuntimeConfigurableWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test398");


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
    var22.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var22.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32__32__32__32__32__32__32__32__32__32__32_");
    
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

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test399");


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
    int var85 = var63.lookupAttribute("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__");
    
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

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test400");


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
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var25 = var24.getLineNumber();
    var24.setPublicId("");
    java.lang.String var30 = var24.getInheritedAttribute("", "4444444444");
    int var31 = var24.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var32 = new nu.staldal.xtree.TreeBuilder();
    var32.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var37 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var32, false, false);
    var24.toSAX((org.xml.sax.ContentHandler)var37);
    nu.staldal.xmlutil.ContentHandlerFixer var40 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var37, true);
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "", 10, 0);
    var37.setDocumentLocator((org.xml.sax.Locator)var45);
    nu.staldal.xmlutil.ContentHandlerAdapter var47 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var37);
    nu.staldal.xtree.Text var49 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var49.setLine(1);
    char[] var52 = var49.asCharArray();
    var47.ignorableWhitespace(var52, 10, 0);
    var8.characters(var52, 2, 0);
    var8.startPrefixMapping("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_aa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test401");


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
    nu.staldal.lagoon.core.LagoonContext var23 = var0.getContext();
    java.lang.String var24 = var0.getEntryName();
    
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
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test402");


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
    nu.staldal.ftp.FTPException var19 = new nu.staldal.ftp.FTPException("nu.staldal.lagoon.core.LagoonException: ");
    var1.log((java.lang.Throwable)var19, 10);
    nu.staldal.lagoon.core.AuthenticationException var22 = new nu.staldal.lagoon.core.AuthenticationException();
    java.lang.Throwable[] var23 = var22.getSuppressed();
    var19.addSuppressed((java.lang.Throwable)var22);
    nu.staldal.lagoon.LagoonAntTask var25 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var28 = new nu.staldal.ftp.FTPException("hi!");
    var25.log("", (java.lang.Throwable)var28, 10);
    org.apache.tools.ant.Location var31 = var25.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var32 = var25.getRuntimeConfigurableWrapper();
    var25.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var35 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var38 = new nu.staldal.ftp.FTPException("hi!");
    var35.log("", (java.lang.Throwable)var38, 10);
    org.apache.tools.ant.Project var41 = var35.getProject();
    nu.staldal.lagoon.util.TemplateException var43 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var44 = var43.getException();
    var35.log("", (java.lang.Throwable)var43, (-1));
    var25.bindToOwner((org.apache.tools.ant.Task)var35);
    java.lang.String var48 = var35.getTaskType();
    nu.staldal.lagoon.core.LagoonException var51 = new nu.staldal.lagoon.core.LagoonException("                                                                                                    ");
    nu.staldal.lagoon.util.TemplateException var52 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var51);
    java.lang.Exception var53 = var52.getException();
    var35.log("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", (java.lang.Throwable)var52, 0);
    java.lang.Throwable[] var56 = var52.getSuppressed();
    java.lang.Throwable[] var57 = var52.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var58 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var52);
    java.lang.Exception var59 = var52.getException();
    var22.addSuppressed((java.lang.Throwable)var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test403");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 1);
    java.lang.String var6 = var3.getAttrValueOrNull("hi!", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var8 = var3.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var3.addNamespaceMapping("hi!", "4444444444");
    java.lang.String var14 = var3.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.removeAttribute(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test404");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException"+ "'", var1.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException"));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test405");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test406");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    nu.staldal.lagoon.core.ByteStreamProducer var1 = var0.getNext();
    nu.staldal.lagoon.core.LagoonContext var2 = var0.getContext();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test407");


    char[] var2 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text(var2, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var7 = new nu.staldal.xtree.TreeBuilder();
    var7.endPrefixMapping("hi!");
    var7.endDocument();
    var7.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var6.toSAX((org.xml.sax.ContentHandler)var7);
    var7.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var7.skippedEntity("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var7.startPrefixMapping("nu.staldal.ftp.FTPException~ hi!", "nu.staldal.lagoon.core.LagoonException: aa");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var23 = var7.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test408");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    var0.log("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!", 10);
    java.lang.String var12 = var0.getTaskType();
    org.apache.tools.ant.RuntimeConfigurable var13 = var0.getRuntimeConfigurableWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test409");


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
    var0.setTargetURL("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    var0.setForce(true);
    
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

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test410");


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
    java.lang.String var23 = var19.getTextContentOrNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "4444444444"+ "'", var22.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test411");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    boolean var5 = var0.isReentrant();
    nu.staldal.lagoon.core.OutputHandler var7 = var0.createFile("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    var0.close();
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462025000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test412");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("");
    java.lang.String var2 = var1.toString();
    java.lang.Throwable[] var3 = var1.getSuppressed();
    java.lang.Exception var4 = var1.getException();
    java.lang.Throwable[] var5 = var1.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var6 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);
    nu.staldal.lagoon.util.TemplateException var7 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.util.TemplateException: "+ "'", var2.equals("nu.staldal.lagoon.util.TemplateException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test413");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    var0.close();
    boolean var8 = var0.isReentrant();
    nu.staldal.lagoon.core.OutputHandler var10 = var0.createFile("hi!");
    long var12 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException~~ hi____33____");
    nu.staldal.lagoon.core.OutputHandler var14 = var0.createFile("nu.staldal.lagoon.core.LagoonException~ hi__33__");
    var0.deleteFile("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    boolean var17 = var0.isReentrant();
    boolean var18 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433462025000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1433462023000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test414");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(10L);
    boolean var5 = var0.hasBeenUpdated(1433461930000L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var6 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test415");


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
    org.apache.tools.ant.RuntimeConfigurable var49 = var0.getRuntimeConfigurableWrapper();
    
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
    assertNotNull(var49);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test416");


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
    java.lang.String var33 = var2.getNamespaceURI();
    java.lang.String var34 = var2.getLocalName();
    nu.staldal.xtree.TreeBuilder var35 = new nu.staldal.xtree.TreeBuilder();
    var35.endPrefixMapping("hi!");
    var35.endDocument();
    var35.startDocument();
    var2.toSAX((org.xml.sax.ContentHandler)var35);
    java.lang.String var41 = var2.getNamespaceURI();
    nu.staldal.xtree.Element var44 = new nu.staldal.xtree.Element("hi!", "hi!");
    var44.setLine(100);
    java.lang.String var48 = var44.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var51 = var44.lookupAttribute("hi!", "");
    int var54 = var44.lookupAttribute("                                                                                                    ", "nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var56 = var44.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    var2.addChild((nu.staldal.xtree.Node)var44);
    nu.staldal.xtree.NodeWithChildren var58 = var44.getParent();
    
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
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test417");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    var0.init();
    java.lang.String var6 = var0.getEntryName();
    java.lang.String var8 = var0.getParam("          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test418");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    boolean var2 = var0.hasBeenUpdated(0L);
    var0.beforeBuild();
    java.lang.String var4 = var0.getEntryName();
    boolean var6 = var0.hasBeenUpdated(1433461965000L);
    boolean var8 = var0.hasBeenUpdated(1433461971000L);
    boolean var10 = var0.hasBeenUpdated(1433461967000L);
    int var11 = var0.getPosition();
    
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
    assertTrue(var11 == 0);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test419");


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
    var16.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: ");
    var16.endElement("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "nu.staldal.lagoon.core.LagoonException~~ ");
    
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

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test420");


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
    var0.init();
    var0.setTargetURL("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444");
    java.lang.String var24 = var0.getTaskName();
    var0.init();
    var0.setPassword("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test421");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    boolean var3 = var2.isWhitespaceNode();
    var2.setColumn(10);
    java.lang.String var6 = var2.getTarget();
    java.lang.String var7 = var2.getSystemId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var6.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test422");


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
    java.lang.String var26 = var1.getValue();
    java.lang.String var27 = var1.getValue();
    
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
    assertTrue("'" + var26 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"+ "'", var26.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"+ "'", var27.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test423");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.util.TemplateException: nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException~~ ");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test424");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    nu.staldal.lagoon.core.ByteStreamProducer var1 = var0.getNext();
    var0.init();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var4 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var5 = var0.getNext();
    var0.init();
    var0.init();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var9 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var10 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test425");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("", "hi!");
    java.lang.String var3 = var2.getValue();
    java.lang.String var5 = var2.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var6 = var2.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test426");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("hi!", "hi!");
    var10.setLine(100);
    int var13 = var10.numberOfNamespaceMappings();
    var0.setDocumentLocator((org.xml.sax.Locator)var10);
    nu.staldal.xtree.Element var17 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", " ");
    var0.setDocumentLocator((org.xml.sax.Locator)var17);
    var17.addNamespaceMapping("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!", "nu.staldal.lagoon.util.TemplateException: hi_33_");
    java.lang.String var23 = var17.lookupNamespaceURI("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test427");


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
    var20.processingInstruction("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "4");
    var20.endPrefixMapping("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test428");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    char[] var3 = var1.asCharArray();
    char[] var4 = var1.asCharArray();
    boolean var5 = var1.isWhitespaceNode();
    var1.setColumn(100);
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var15 = var12.lookupAttribute("4444444444", "hi!");
    java.lang.String var18 = var12.getInheritedAttribute("", "4444444444");
    nu.staldal.lagoon.producer.BasicSplit var19 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text("hi!");
    char[] var22 = var21.asCharArray();
    var19.characters(var22, 1, 10);
    var19.endElement("", "hi!", "hi!");
    var19.processingInstruction("", "hi!");
    var19.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var19.startDocument();
    var12.outputEndElement((org.xml.sax.ContentHandler)var19);
    nu.staldal.xmlutil.ContentHandlerFixer var38 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var19);
    var1.toSAX((org.xml.sax.ContentHandler)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test429");


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
    nu.staldal.xmlutil.ContentHandlerFixer var35 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var35.skippedEntity("##");
    nu.staldal.xmlutil.ContentHandlerAdapter var38 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var35);
    nu.staldal.xmlutil.ContentHandlerFixer var40 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var35, false);
    var40.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var40.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test430");


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
    java.lang.String var58 = var20.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ");
    
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
    assertNull(var58);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test431");


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
    nu.staldal.xtree.Element var48 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var51 = var48.lookupAttribute("hi!", "hi!");
    int var52 = var48.numberOfAttributes();
    java.lang.String var54 = var48.lookupNamespacePrefix("hi_33_");
    var48.setSystemId("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var58 = var48.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    boolean var59 = var48.isWhitespaceNode();
    var0.setDocumentLocator((org.xml.sax.Locator)var48);
    var0.skippedEntity(" ");
    
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
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test432");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    org.apache.tools.ant.Location var10 = var0.getLocation();
    var0.log("nu.staldal.lagoon.util.TemplateException", (-1));
    java.lang.String var14 = var0.getDescription();
    var0.setTaskName("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.setForce(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test433");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.destroy();
    java.lang.String var5 = var0.getEntryName();
    var0.destroy();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test434");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException", "hi!", (-1), 100);
    java.lang.String var5 = var4.getSystemId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test435");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("hi_33_", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var3 = var2.getTarget();
    java.lang.String var4 = var2.getTarget();
    java.net.URL var5 = var2.getBaseURI();
    boolean var6 = var2.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi_33_"+ "'", var3.equals("hi_33_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi_33_"+ "'", var4.equals("hi_33_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test436");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.beforeBuild();
    var0.init();
    java.util.Enumeration var4 = var0.getParamNames();
    var0.afterBuild();
    nu.staldal.lagoon.core.LagoonContext var6 = var0.getContext();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test437");


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
    var0.setTaskType("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var23 = new nu.staldal.ftp.FTPException("hi!");
    var20.log("", (java.lang.Throwable)var23, 10);
    org.apache.tools.ant.Location var26 = var20.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var27 = var20.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Project var28 = var20.getProject();
    var20.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.Object var31 = var20.clone();
    nu.staldal.lagoon.util.TemplateException var32 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var33 = var32.getException();
    nu.staldal.lagoon.util.TemplateException var34 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var32);
    var20.log((java.lang.Throwable)var32, 100);
    nu.staldal.lagoon.util.TemplateException var37 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var32);
    var0.log((java.lang.Throwable)var32, 10);
    java.lang.Exception var40 = var32.getException();
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test438");


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
    nu.staldal.lagoon.LagoonAntTask var34 = new nu.staldal.lagoon.LagoonAntTask();
    var34.setPassword("");
    var34.setForce(false);
    org.apache.tools.ant.Target var39 = var34.getOwningTarget();
    var34.maybeConfigure();
    var34.log("nu.staldal.lagoon.core.LagoonException: 4444444444");
    org.apache.tools.ant.Location var43 = var34.getLocation();
    var5.setLocation(var43);
    var5.reconfigure();
    var5.init();
    
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
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test439");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.setTaskType("4444444444");
    var0.maybeConfigure();
    var0.setTargetURL("");
    java.lang.Object var11 = var0.clone();
    org.apache.tools.ant.RuntimeConfigurable var12 = var0.getRuntimeConfigurableWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test440");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xtree.Element var8 = new nu.staldal.xtree.Element("", "hi!", 10);
    var8.setSystemId("hi!");
    java.lang.String var11 = var8.getSystemId();
    var4.setDocumentLocator((org.xml.sax.Locator)var8);
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4, false);
    nu.staldal.xmlutil.ContentHandlerAdapter var15 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var4);
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var19 = var18.getLineNumber();
    var18.addNamespaceMapping("", "");
    var15.setDocumentLocator((org.xml.sax.Locator)var18);
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var31 = var28.lookupAttribute("4444444444", "hi!");
    java.lang.String var34 = var28.getInheritedAttribute("", "4444444444");
    int var37 = var28.lookupAttribute("", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String var39 = var28.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var40 = var28.getLocalName();
    var15.setDocumentLocator((org.xml.sax.Locator)var28);
    java.lang.String var42 = var28.getTextContent();
    var28.setPublicId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__32_hi________________________________33________________________________");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "4444444444"+ "'", var40.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test441");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    var0.startPrefixMapping("4444444444", "                                                                                                    ");
    var0.endDocument();
    var0.startDocument();
    nu.staldal.xtree.Text var16 = new nu.staldal.xtree.Text("");
    char[] var17 = var16.asCharArray();
    char[] var18 = var16.asCharArray();
    nu.staldal.lagoon.producer.BasicSplit var19 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text("hi!");
    char[] var22 = var21.asCharArray();
    var19.characters(var22, 1, 10);
    var19.endElement("", "hi!", "hi!");
    var19.processingInstruction("", "hi!");
    var19.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var19.startDocument();
    var19.skippedEntity("4444444444");
    var19.skippedEntity("hi!");
    var16.toSAX((org.xml.sax.ContentHandler)var19);
    java.lang.String var43 = var16.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException: ");
    char[] var44 = var16.asCharArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.characters(var44, 100, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test442");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    java.lang.String var3 = var2.getValue();
    var2.setPublicId("          ");
    boolean var6 = var2.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_"+ "'", var3.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test443");


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
    nu.staldal.xmlutil.DocumentHandlerAdapter var55 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var53);
    var55.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu.staldal.lagoon.core.LagoonException~ ");
    
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

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test444");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    int var16 = var11.getColumnNumber();
    java.lang.String var18 = var11.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var11.addAttribute("nu.staldal.lagoon.util.TemplateException", "hi!", "nu.staldal.lagoon.core.LagoonException: ", "hi_33_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var25 = var11.getAttributeNamespaceURI(100);
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

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test445");


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
    org.apache.tools.ant.Target var28 = var0.getOwningTarget();
    java.lang.Object var29 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test446");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    var0.init();
    java.lang.String var7 = var0.getDescription();
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test447");


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
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi!", "hi!");
    var32.setLine(100);
    nu.staldal.xtree.Element var39 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var42 = var39.lookupAttribute("4444444444", "hi!");
    var39.addNamespaceMapping("", "4444444444");
    java.lang.String var46 = var39.getTextContent();
    var32.insertChild((nu.staldal.xtree.Node)var39, 0);
    int var49 = var39.numberOfNamespaceMappings();
    var0.setDocumentLocator((org.xml.sax.Locator)var39);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + ""+ "'", var46.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test448");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", 0);
    java.net.URL var4 = var3.getBaseURI();
    var3.setSystemId("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var7 = var3.getPreserveSpace();
    java.net.URL var8 = var3.getBaseURI();
    var3.setColumn(0);
    var3.setPublicId("nu.staldal.lagoon.util.TemplateException: hi_33_");
    java.lang.String var15 = var3.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_aa", "hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test449");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8);
    var8.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    var19.setSystemId("");
    java.net.URL var22 = var19.getBaseURI();
    java.lang.String var25 = var19.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    var28.addNamespaceMapping("", "");
    var19.addChild((nu.staldal.xtree.Node)var28);
    var19.setSystemId("");
    var19.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var42 = var19.getAttrValueOrNull("4444444444", "4444444444");
    java.lang.String var43 = var19.getSystemId();
    int var44 = var19.getLineNumber();
    var8.setDocumentLocator((org.xml.sax.Locator)var19);
    nu.staldal.xmlutil.ContentHandlerFixer var48 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == (-1));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test450");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var6 = new nu.staldal.ftp.FTPException("hi!");
    var3.log("", (java.lang.Throwable)var6, 10);
    org.apache.tools.ant.Location var9 = var3.getLocation();
    var0.setLocation(var9);
    org.apache.tools.ant.Location var11 = var0.getLocation();
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    var12.setPassword("");
    var12.setForce(false);
    org.apache.tools.ant.Target var17 = var12.getOwningTarget();
    var12.maybeConfigure();
    org.apache.tools.ant.RuntimeConfigurable var19 = var12.getRuntimeConfigurableWrapper();
    var0.setRuntimeConfigurableWrapper(var19);
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var24 = new nu.staldal.ftp.FTPException("hi!");
    var21.log("", (java.lang.Throwable)var24, 10);
    org.apache.tools.ant.Location var27 = var21.getLocation();
    nu.staldal.lagoon.core.LagoonException var30 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var21.log("4444444444", (java.lang.Throwable)var30, 100);
    java.lang.String var33 = var30.toString();
    java.lang.String var34 = var30.toString();
    java.lang.String var35 = var30.toString();
    var0.log((java.lang.Throwable)var30, 0);
    java.lang.String var38 = var30.toString();
    nu.staldal.lagoon.util.TemplateException var40 = new nu.staldal.lagoon.util.TemplateException("");
    java.lang.String var41 = var40.toString();
    java.lang.Throwable[] var42 = var40.getSuppressed();
    java.lang.Exception var43 = var40.getException();
    java.lang.Throwable[] var44 = var40.getSuppressed();
    var30.addSuppressed((java.lang.Throwable)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var33.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var34.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var35.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var38.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "nu.staldal.lagoon.util.TemplateException: "+ "'", var41.equals("nu.staldal.lagoon.util.TemplateException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test451");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    nu.staldal.xmlutil.ContentHandlerAdapter var11 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var19 = var16.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var20 = new nu.staldal.xtree.TreeBuilder();
    var16.toSAX((org.xml.sax.ContentHandler)var20);
    var20.skippedEntity("hi!");
    var20.skippedEntity("hi!");
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var20.setDocumentLocator((org.xml.sax.Locator)var28);
    var20.endDocument();
    nu.staldal.xtree.Element var31 = var20.getTree();
    nu.staldal.lagoon.producer.BasicSplit var32 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var34 = new nu.staldal.xtree.Text("hi!");
    char[] var35 = var34.asCharArray();
    var32.characters(var35, 1, 10);
    var32.endElement("", "hi!", "hi!");
    var32.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var46 = new nu.staldal.xtree.Text("");
    char[] var47 = var46.asCharArray();
    char[] var48 = var46.asCharArray();
    char[] var49 = var46.asCharArray();
    var32.characters(var49, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var53 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var32);
    nu.staldal.xmlutil.DocumentHandlerAdapter var54 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var53);
    nu.staldal.xtree.Element var57 = new nu.staldal.xtree.Element("hi!", "hi!");
    var57.setSystemId("");
    java.net.URL var60 = var57.getBaseURI();
    java.lang.String var63 = var57.getAttrValueOrNull("", "");
    var54.setDocumentLocator((org.xml.sax.Locator)var57);
    nu.staldal.xtree.Text var66 = new nu.staldal.xtree.Text("");
    char[] var67 = var66.asCharArray();
    char[] var68 = var66.asCharArray();
    var54.characters(var68, 100, 100);
    nu.staldal.xtree.Element var74 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var75 = var74.getLineNumber();
    var74.setPublicId("");
    int var78 = var74.getLineNumber();
    java.lang.String var80 = var74.lookupNamespacePrefix("hi_33_");
    var54.setDocumentLocator((org.xml.sax.Locator)var74);
    nu.staldal.xmlutil.ContentHandlerFixer var84 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var54, false, false);
    nu.staldal.xtree.Text var86 = new nu.staldal.xtree.Text("");
    char[] var87 = var86.asCharArray();
    var54.ignorableWhitespace(var87, 10, 1);
    var20.ignorableWhitespace(var87, 100, 1);
    var11.ignorableWhitespace(var87, 10, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.processingInstruction("nu.staldal.lagoon.util.TemplateException: _32__32__32__32__32__32__32__32__32__32_", "nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test452");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test453");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.util.TemplateException", 0, 1);
    boolean var5 = var4.getPreserveSpace();
    java.net.URL var6 = var4.getBaseURI();
    java.lang.String var7 = var4.getSystemId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test454");


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
    java.lang.Throwable[] var38 = var32.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var40 = new nu.staldal.lagoon.util.TemplateException("");
    java.lang.String var41 = var40.toString();
    java.lang.Throwable[] var42 = var40.getSuppressed();
    var32.addSuppressed((java.lang.Throwable)var40);
    nu.staldal.lagoon.core.LagoonException var45 = new nu.staldal.lagoon.core.LagoonException("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var46 = var45.toString();
    var32.addSuppressed((java.lang.Throwable)var45);
    
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
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "nu.staldal.lagoon.util.TemplateException: "+ "'", var41.equals("nu.staldal.lagoon.util.TemplateException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"+ "'", var46.equals("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test455");


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
    java.lang.String var14 = var0.getTaskType();
    org.apache.tools.ant.Target var15 = var0.getOwningTarget();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test456");


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
    nu.staldal.lagoon.core.LagoonContext var86 = var0.getContext();
    
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
    assertNull(var86);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test457");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    org.apache.tools.ant.Target var6 = var1.getOwningTarget();
    java.lang.String var7 = var1.getTaskType();
    org.apache.tools.ant.Target var8 = var1.getOwningTarget();
    org.apache.tools.ant.Project var9 = var1.getProject();
    var1.setDescription("##########");
    org.apache.tools.ant.RuntimeConfigurable var12 = var1.getRuntimeConfigurableWrapper();
    var1.setPassword("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    
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
    assertNotNull(var12);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test458");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    int var3 = var0.getPosition();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test459");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~ hi____33____", "nu.staldal.lagoon.core.LagoonException~ ", (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var7 = var4.getFirstChildElement("____32________32________32________32________32________32________32________32________32________32____", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test460");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    java.lang.Object var12 = var0.clone();
    nu.staldal.ftp.FTPException var14 = new nu.staldal.ftp.FTPException("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var0.log((java.lang.Throwable)var14, (-1));
    java.lang.String var17 = var14.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "nu.staldal.ftp.FTPException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException"+ "'", var17.equals("nu.staldal.ftp.FTPException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException"));

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test461");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.ftp.FTPException~ hi!");
    java.lang.Exception var2 = var1.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test462");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: hi_33_", "nu.staldal.lagoon.util.TemplateException: nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", 2);
    nu.staldal.lagoon.producer.BasicSplit var4 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text("hi!");
    char[] var7 = var6.asCharArray();
    var4.characters(var7, 1, 10);
    var4.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var4.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var4.destroy();
    var3.outputEndElement((org.xml.sax.ContentHandler)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test463");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    nu.staldal.lagoon.core.ByteStreamProducer var1 = var0.getNext();
    var0.init();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var4 = var0.getNext();
    java.util.Enumeration var5 = var0.getParamNames();
    var0.init();
    nu.staldal.lagoon.core.LagoonContext var7 = var0.getContext();
    nu.staldal.lagoon.core.ByteStreamProducer var8 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test464");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var10 = var4.lookupNamespaceURI("4444444444");
    java.lang.String var12 = var4.lookupNamespacePrefix("4444444444");
    java.lang.String var15 = var4.getAttrValueOrNull("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var16 = var4.getTextContentOrNull();
    java.lang.String var17 = var4.getNamespaceURI();
    int var18 = var4.getLineNumber();
    java.net.URL var19 = var4.getBaseURI();
    
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
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test465");


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
    var18.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.AuthenticationMissingException");
    var18.startDocument();
    nu.staldal.xtree.ProcessingInstruction var28 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.producer.BasicSplit var29 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text("hi!");
    char[] var32 = var31.asCharArray();
    var29.characters(var32, 1, 10);
    var29.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var29.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var29.endElement("hi!", "                                                                                                    ", "nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.xmlutil.ContentHandlerFixer var45 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var29, true);
    var28.toSAX((org.xml.sax.ContentHandler)var45);
    nu.staldal.xmlutil.ContentHandlerAdapter var47 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var45);
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var55 = var52.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var56 = new nu.staldal.xtree.TreeBuilder();
    var52.toSAX((org.xml.sax.ContentHandler)var56);
    var56.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var60 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var56);
    char[] var63 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var67 = new nu.staldal.xtree.Text(var63, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var68 = new nu.staldal.xtree.TreeBuilder();
    var68.endPrefixMapping("hi!");
    var68.endDocument();
    var68.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var67.toSAX((org.xml.sax.ContentHandler)var68);
    var68.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    char[] var81 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var85 = new nu.staldal.xtree.Text(var81, 1, 0, false);
    char[] var86 = var85.asCharArray();
    var68.ignorableWhitespace(var86, 10, 10);
    var60.ignorableWhitespace(var86, 1, 10);
    var47.characters(var86, 1, 100);
    var18.characters(var86, 100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test466");


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
    java.lang.String var27 = var23.getAttributeNamespaceURI((-1));
    int var28 = var23.numberOfAttributes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var30 = var23.getAttributeValue(0);
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
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test467");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setDescription("4444444444");
    java.lang.String var3 = var0.getTaskName();
    nu.staldal.lagoon.LagoonAntTask var4 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var4.bindToOwner((org.apache.tools.ant.Task)var5);
    var4.log("");
    java.lang.Object var9 = var4.clone();
    nu.staldal.lagoon.LagoonAntTask var10 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var13 = new nu.staldal.ftp.FTPException("hi!");
    var10.log("", (java.lang.Throwable)var13, 10);
    org.apache.tools.ant.Location var16 = var10.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var17 = var10.getRuntimeConfigurableWrapper();
    var10.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var23 = new nu.staldal.ftp.FTPException("hi!");
    var20.log("", (java.lang.Throwable)var23, 10);
    org.apache.tools.ant.Project var26 = var20.getProject();
    nu.staldal.lagoon.util.TemplateException var28 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var29 = var28.getException();
    var20.log("", (java.lang.Throwable)var28, (-1));
    var10.bindToOwner((org.apache.tools.ant.Task)var20);
    org.apache.tools.ant.Location var33 = var20.getLocation();
    var4.setLocation(var33);
    nu.staldal.lagoon.LagoonAntTask var35 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var38 = new nu.staldal.ftp.FTPException("hi!");
    var35.log("", (java.lang.Throwable)var38, 10);
    org.apache.tools.ant.Location var41 = var35.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var42 = var35.getRuntimeConfigurableWrapper();
    var35.setForce(false);
    org.apache.tools.ant.Location var45 = var35.getLocation();
    nu.staldal.lagoon.core.LagoonException var47 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var48 = var47.toString();
    var35.log((java.lang.Throwable)var47, 100);
    org.apache.tools.ant.Location var51 = var35.getLocation();
    var4.setLocation(var51);
    java.lang.String var53 = var4.getDescription();
    var0.bindToOwner((org.apache.tools.ant.Task)var4);
    var0.setDescription("nu.staldal.ftp.FTPException~~~~ hi!");
    var0.setTargetURL("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    org.apache.tools.ant.Project var59 = var0.getProject();
    nu.staldal.lagoon.LagoonAntTask var61 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var64 = new nu.staldal.ftp.FTPException("hi!");
    var61.log("", (java.lang.Throwable)var64, 10);
    var61.init();
    org.apache.tools.ant.Project var68 = var61.getProject();
    nu.staldal.lagoon.LagoonAntTask var70 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var73 = new nu.staldal.ftp.FTPException("hi!");
    var70.log("", (java.lang.Throwable)var73, 10);
    nu.staldal.lagoon.util.TemplateException var76 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var73);
    var61.log("", (java.lang.Throwable)var76, 100);
    java.lang.Throwable[] var79 = var76.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var80 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var76);
    java.lang.Exception var81 = var76.getException();
    java.lang.String var82 = var76.toString();
    var0.log("nu.staldal.lagoon.util.TemplateException: aa", (java.lang.Throwable)var76, (-1));
    nu.staldal.lagoon.util.TemplateException var85 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var48.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var82.equals("nu.staldal.lagoon.util.TemplateException"));

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test468");


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
    nu.staldal.xmlutil.ContentHandlerFixer var35 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var35.skippedEntity("##");
    nu.staldal.xmlutil.ContentHandlerAdapter var38 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var35);
    nu.staldal.xmlutil.ContentHandlerFixer var40 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var35, false);
    var40.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var40.endPrefixMapping("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test469");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.util.TemplateException: ", "hi_33_");
    boolean var3 = var2.getPreserveSpace();
    nu.staldal.xtree.Text var5 = new nu.staldal.xtree.Text("");
    nu.staldal.xtree.TreeBuilder var6 = new nu.staldal.xtree.TreeBuilder();
    var6.endPrefixMapping("hi!");
    var5.toSAX((org.xml.sax.ContentHandler)var6);
    var6.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var6.endPrefixMapping("");
    var6.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "4");
    var6.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    var6.endPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.toSAX((org.xml.sax.ContentHandler)var6);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test470");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    java.lang.String var3 = var1.getValue();
    boolean var4 = var1.isWhitespaceNode();
    boolean var5 = var1.isWhitespaceNode();
    java.lang.String var6 = var1.getValue();
    int var7 = var1.getColumnNumber();
    java.lang.String var8 = var1.getValue();
    boolean var9 = var1.getPreserveSpace();
    
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
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test471");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    nu.staldal.lagoon.util.TemplateException var11 = new nu.staldal.lagoon.util.TemplateException("4444444444");
    var0.log((java.lang.Throwable)var11, 1);
    org.apache.tools.ant.RuntimeConfigurable var14 = var0.getRuntimeConfigurableWrapper();
    java.lang.String var15 = var0.getDescription();
    var0.reconfigure();
    nu.staldal.lagoon.core.LagoonException var18 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.ftp.FTPException~~ hi!");
    var0.log((java.lang.Throwable)var18, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test472");


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
    nu.staldal.lagoon.LagoonAntTask var16 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var19 = new nu.staldal.ftp.FTPException("hi!");
    var16.log("", (java.lang.Throwable)var19, 10);
    var16.init();
    var16.init();
    java.lang.String var24 = var16.getDescription();
    nu.staldal.lagoon.LagoonAntTask var25 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var28 = new nu.staldal.ftp.FTPException("hi!");
    var25.log("", (java.lang.Throwable)var28, 10);
    org.apache.tools.ant.Project var31 = var25.getProject();
    var16.bindToOwner((org.apache.tools.ant.Task)var25);
    var25.setTaskType("nu.staldal.lagoon.core.LagoonException: ");
    var25.log("hi!");
    var25.init();
    nu.staldal.lagoon.LagoonAntTask var38 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var41 = new nu.staldal.ftp.FTPException("hi!");
    var38.log("", (java.lang.Throwable)var41, 10);
    java.lang.String var44 = var38.getDescription();
    nu.staldal.lagoon.LagoonAntTask var45 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var48 = new nu.staldal.ftp.FTPException("hi!");
    var45.log("", (java.lang.Throwable)var48, 10);
    org.apache.tools.ant.Location var51 = var45.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var52 = var45.getRuntimeConfigurableWrapper();
    var45.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var55 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var58 = new nu.staldal.ftp.FTPException("hi!");
    var55.log("", (java.lang.Throwable)var58, 10);
    org.apache.tools.ant.Project var61 = var55.getProject();
    nu.staldal.lagoon.util.TemplateException var63 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var64 = var63.getException();
    var55.log("", (java.lang.Throwable)var63, (-1));
    var45.bindToOwner((org.apache.tools.ant.Task)var55);
    org.apache.tools.ant.Location var68 = var55.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var69 = var55.getRuntimeConfigurableWrapper();
    var38.setRuntimeConfigurableWrapper(var69);
    var25.setRuntimeConfigurableWrapper(var69);
    var0.setRuntimeConfigurableWrapper(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test473");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    var4.addAttribute("hi!", "", "hi!", "");
    int var10 = var4.getColumnNumber();
    java.lang.String var12 = var4.getAttributeNamespaceURI((-1));
    var4.setSystemId(" ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var15 = var4.getFirstChildElement();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test474");


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
    nu.staldal.xmlutil.ContentHandlerFixer var18 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var17);
    nu.staldal.xtree.TreeBuilder var19 = new nu.staldal.xtree.TreeBuilder();
    var19.endPrefixMapping("hi!");
    var19.endDocument();
    var19.startDocument();
    var19.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "hi!");
    nu.staldal.lagoon.producer.BasicSplit var27 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var29 = new nu.staldal.xtree.Text("hi!");
    char[] var30 = var29.asCharArray();
    var27.characters(var30, 1, 10);
    var27.endElement("", "hi!", "hi!");
    var27.processingInstruction("", "hi!");
    var27.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    char[] var46 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var50 = new nu.staldal.xtree.Text(var46, 1, 0, false);
    var27.characters(var46, 1, (-1));
    var19.characters(var46, 0, 1);
    var17.characters(var46, 2, 0);
    var17.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    var17.skippedEntity("nu.staldal.ftp.FTPException~~~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test475");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    nu.staldal.lagoon.core.ByteStreamProducer var1 = var0.getNext();
    var0.init();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var4 = var0.getNext();
    java.util.Enumeration var5 = var0.getParamNames();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var7 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test476");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.lang.String var6 = var3.getSystemId();
    var3.setSystemId("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var11 = var3.getFirstChildElement("nu____46____staldal____46____ftp____46____FTPException____126________32____hi____33____", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test477");


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
    java.lang.String var33 = var2.getNamespaceURI();
    nu.staldal.xtree.Element var36 = var2.getFirstChildElementOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    int var37 = var2.getLineNumber();
    boolean var38 = var2.getPreserveSpace();
    java.lang.String var40 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    
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
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test478");


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
    java.util.Enumeration var27 = var4.getParamNames();
    var4.skippedEntity("a");
    var4.skippedEntity("nu__46__staldal__46__ftp__46__FTPException__126____32__hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test479");


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
    java.lang.String var38 = var2.getAttrValueOrNull("hi!");
    java.lang.String var41 = var2.getAttrValueOrNull("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!", "          ");
    java.lang.String var42 = var2.getTextContentOrNull();
    
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
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + ""+ "'", var42.equals(""));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test480");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("_52_", "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test481");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var11 = var2.getAttrValueOrNull("hi_33_", "4444444444");
    var2.addNamespaceMapping("____32________32________32________32________32________32________32________32________32________32____", "nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException~~ hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var16 = var2.removeChild(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test482");


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
    var23.skippedEntity("nu.staldal.ftp.FTPException: hi!");
    var23.startPrefixMapping("nu.staldal.ftp.FTPException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test483");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    int var7 = var0.getPosition();
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.core.XMLStreamProducer var10 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test484");


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
    var8.endDocument();
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "                                                                                                    ");
    var8.setDocumentLocator((org.xml.sax.Locator)var20);
    boolean var22 = var20.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test485");


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
    var0.skippedEntity("4444444444");
    var0.processingInstruction("nu.staldal.lagoon.core.LagoonException~ 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test486");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("", "hi_33_");
    java.lang.String var3 = var2.getTextContentOrNull();
    nu.staldal.xtree.Element var6 = var2.getFirstChildElementOrNull("nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    int var7 = var2.numberOfNamespaceMappings();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var10 = var2.getFirstChildElement("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test487");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_"+ "'", var2.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_"));

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test488");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    var2.setColumn(100);
    boolean var12 = var2.getPreserveSpace();
    boolean var13 = var2.getPreserveSpace();
    var2.setPublicId("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    boolean var16 = var2.getPreserveSpace();
    
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
    assertTrue(var16 == false);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test489");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_"+ "'", var2.equals("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_"+ "'", var3.equals("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_"));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test490");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("", "hi!");
    java.lang.String var3 = var2.getTarget();
    java.lang.String var4 = var2.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test491");


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
    java.lang.String var56 = var20.getAttributeValue((-1));
    nu.staldal.xtree.Element var57 = var20.getFirstChildElement();
    java.net.URL var58 = var20.getBaseURI();
    
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
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test492");


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
    var10.setTargetURL("nu.staldal.lagoon.core.LagoonException: ");
    var10.setTargetURL("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    org.apache.tools.ant.Location var31 = var10.getLocation();
    
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
    assertNotNull(var31);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test493");


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
    nu.staldal.xtree.NodeWithChildren var21 = var4.getParent();
    int var22 = var4.numberOfAttributes();
    java.lang.String var25 = var4.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", "nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__nu__46__staldal__46__ftp__46__FTPException__58____32__hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test494");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.core.LagoonException var9 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var0.log("4444444444", (java.lang.Throwable)var9, 100);
    var0.setTaskName("");
    var0.setForce(true);
    var0.setForce(true);
    var0.setPassword("nu.staldal.lagoon.core.LagoonException~~ hi____33____");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test495");


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
    java.lang.String var31 = var29.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var31.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test496");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.util.TemplateException", 0);
    java.net.URL var4 = var3.getBaseURI();
    nu.staldal.xtree.TreeBuilder var5 = new nu.staldal.xtree.TreeBuilder();
    var5.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, false);
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("");
    char[] var13 = var12.asCharArray();
    boolean var14 = var12.isWhitespaceNode();
    char[] var15 = var12.asCharArray();
    var5.ignorableWhitespace(var15, 0, 10);
    var5.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Element var24 = new nu.staldal.xtree.Element("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##", 100);
    var5.setDocumentLocator((org.xml.sax.Locator)var24);
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var29 = var28.getLineNumber();
    var28.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var36 = var35.getLineNumber();
    var35.addNamespaceMapping("", "");
    var28.addChild((nu.staldal.xtree.Node)var35);
    nu.staldal.xtree.NodeWithChildren var41 = var28.getParent();
    boolean var42 = var28.getPreserveSpace();
    var28.setPublicId("4444444444");
    java.lang.String var45 = var28.getLocalName();
    var28.addNamespaceMapping("          ", "nu.staldal.lagoon.util.TemplateException");
    int var51 = var28.lookupAttribute("nu.staldal.lagoon.util.TemplateException: ", "hi!");
    java.lang.String var52 = var28.getPublicId();
    var5.setDocumentLocator((org.xml.sax.Locator)var28);
    var3.addChild((nu.staldal.xtree.Node)var28);
    nu.staldal.xtree.Element var57 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var58 = var57.getLineNumber();
    java.lang.String var59 = var57.getSystemId();
    nu.staldal.xtree.TreeBuilder var60 = new nu.staldal.xtree.TreeBuilder();
    var60.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var65 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var60, false, false);
    var57.toSAX((org.xml.sax.ContentHandler)var60);
    var60.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var60.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    var60.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_ftp_46_FTPException_126__126__32_hi_33_", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var28.toSAX((org.xml.sax.ContentHandler)var60);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "4444444444"+ "'", var52.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test497");


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
    nu.staldal.xtree.Text var54 = new nu.staldal.xtree.Text("");
    char[] var55 = var54.asCharArray();
    var22.ignorableWhitespace(var55, 10, 1);
    nu.staldal.xmlutil.ContentHandlerFixer var59 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22);
    nu.staldal.xmlutil.ContentHandlerFixer var62 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var59, false, true);
    var59.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: _32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
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

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test498");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var2 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test499");


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
    nu.staldal.xtree.Element var23 = new nu.staldal.xtree.Element("hi!", "hi!");
    var23.setSystemId("");
    java.net.URL var26 = var23.getBaseURI();
    java.lang.String var29 = var23.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi!", "hi!");
    var32.addNamespaceMapping("", "");
    var23.addChild((nu.staldal.xtree.Node)var32);
    var23.setSystemId("");
    var23.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var46 = var23.getAttrValueOrNull("4444444444", "4444444444");
    java.lang.String var47 = var23.getNamespaceURI();
    int var48 = var23.numberOfChildren();
    var0.setDocumentLocator((org.xml.sax.Locator)var23);
    java.lang.String var51 = var23.getAttributeLocalName((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "hi!"+ "'", var47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest22.test500");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    java.lang.String var2 = var0.getParam("4444444444");
    var0.afterBuild();
    boolean var5 = var0.hasBeenUpdated((-1L));
    nu.staldal.lagoon.core.LagoonContext var6 = var0.getContext();
    var0.afterBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

}
