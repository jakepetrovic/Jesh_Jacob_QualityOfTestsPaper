package randoop;

import junit.framework.*;

public class RandoopTest11 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test1");


    nu.staldal.lagoon.producer.XMLFormatter var0 = new nu.staldal.lagoon.producer.XMLFormatter();
    var0.init();
    var0.afterBuild();
    var0.init();
    var0.init();

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test2");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var10 = var4.lookupNamespaceURI("4444444444");
    java.net.URL var11 = var4.getBaseURI();
    java.lang.String var13 = var4.lookupNamespaceURI("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    nu.staldal.xtree.NodeWithChildren var14 = var4.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test3");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    java.lang.String var2 = var0.getParam("4444444444");
    var0.afterBuild();
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test4");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var8 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var8.endDocument();
    var8.endDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var11 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var8);
    var11.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__32_hi________________________________33________________________________", "nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:                                                                                                     ");

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test5");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setTargetURL("4444444444");
    java.lang.String var10 = var0.getTaskName();
    java.lang.String var11 = var0.getDescription();
    nu.staldal.lagoon.util.TemplateException var14 = new nu.staldal.lagoon.util.TemplateException("");
    java.lang.String var15 = var14.toString();
    java.lang.Throwable[] var16 = var14.getSuppressed();
    java.lang.Exception var17 = var14.getException();
    java.lang.Throwable[] var18 = var14.getSuppressed();
    var0.log("          ", (java.lang.Throwable)var14, (-1));
    var0.setForce(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "nu.staldal.lagoon.util.TemplateException: "+ "'", var15.equals("nu.staldal.lagoon.util.TemplateException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test6");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", "nu.staldal.ftp.FTPException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test7");


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
    var22.skippedEntity("hi_33_");
    var22.endPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var60 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, false);
    var60.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var64 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var60, false, true);
    nu.staldal.lagoon.producer.BasicSplit var65 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var67 = new nu.staldal.xtree.Text("hi!");
    char[] var68 = var67.asCharArray();
    var65.characters(var68, 1, 10);
    var65.endElement("", "hi!", "hi!");
    var65.processingInstruction("", "hi!");
    var65.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var65.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var83 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var65);
    var83.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.Text var88 = new nu.staldal.xtree.Text("");
    char[] var89 = var88.asCharArray();
    boolean var90 = var88.isWhitespaceNode();
    char[] var91 = var88.asCharArray();
    var83.setDocumentLocator((org.xml.sax.Locator)var88);
    int var93 = var88.getColumnNumber();
    var88.setSystemId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    char[] var96 = var88.asCharArray();
    var64.characters(var96, 1, 100);
    
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
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test8");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_");

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test9");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("aa", " ");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test10");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "aa", 1);
    var3.setLine(1);
    int var6 = var3.numberOfNamespaceMappings();
    java.lang.String var7 = var3.getTextContent();
    java.net.URL var8 = var3.getBaseURI();
    int var9 = var3.getLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test11");


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
    nu.staldal.xtree.Element var57 = new nu.staldal.xtree.Element("hi!", "hi!");
    var57.setSystemId("");
    java.net.URL var60 = var57.getBaseURI();
    java.lang.String var63 = var57.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var66 = new nu.staldal.xtree.Element("hi!", "hi!");
    var66.addNamespaceMapping("", "");
    var57.addChild((nu.staldal.xtree.Node)var66);
    nu.staldal.xtree.Element var73 = new nu.staldal.xtree.Element("hi!", "hi!");
    var73.setSystemId("");
    java.net.URL var76 = var73.getBaseURI();
    java.lang.String var79 = var73.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var82 = new nu.staldal.xtree.Element("hi!", "hi!");
    var82.addNamespaceMapping("", "");
    var73.addChild((nu.staldal.xtree.Node)var82);
    int var87 = var82.getColumnNumber();
    java.lang.String var89 = var82.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var82.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var57.addChild((nu.staldal.xtree.Node)var82);
    var52.setDocumentLocator((org.xml.sax.Locator)var82);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var97 = var82.getFirstChildElement();
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
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var89);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test12");


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
    var0.afterBuild();
    var0.afterBuild();
    var0.beforeBuild();
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    nu.staldal.lagoon.producer.BasicSplit var51 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var53 = new nu.staldal.xtree.Text("hi!");
    char[] var54 = var53.asCharArray();
    var51.characters(var54, 1, 10);
    var51.endElement("", "hi!", "hi!");
    var51.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var65 = new nu.staldal.xtree.Text("");
    char[] var66 = var65.asCharArray();
    char[] var67 = var65.asCharArray();
    char[] var68 = var65.asCharArray();
    char[] var69 = var65.asCharArray();
    var51.ignorableWhitespace(var69, 1, 100);
    var0.ignorableWhitespace(var69, (-1), 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var76 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
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
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test13");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    org.apache.tools.ant.Target var7 = var0.getOwningTarget();
    org.apache.tools.ant.Location var8 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test14");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.lagoon.core.OutputHandler var10 = var0.createFile("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    boolean var11 = var0.isReentrant();
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
    assertTrue(var11 == true);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test15");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException", "aaaaaaaaaa", 100, 0);
    java.lang.String var7 = var4.getInheritedAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____", "                                                                                                    ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test16");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    char[] var3 = var1.asCharArray();
    char[] var4 = var1.asCharArray();
    boolean var5 = var1.isWhitespaceNode();
    var1.setColumn(0);
    boolean var8 = var1.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test17");


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
    var0.processingInstruction("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____", "nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var55 = var52.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var56 = new nu.staldal.xtree.TreeBuilder();
    var52.toSAX((org.xml.sax.ContentHandler)var56);
    nu.staldal.xtree.Element var58 = var56.getTree();
    var56.endPrefixMapping("hi!");
    var56.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var64 = new nu.staldal.xtree.Text("");
    char[] var65 = var64.asCharArray();
    char[] var66 = var64.asCharArray();
    var56.setDocumentLocator((org.xml.sax.Locator)var64);
    java.net.URL var68 = var64.getBaseURI();
    java.lang.String var70 = var64.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~ hi__33__");
    char[] var71 = var64.asCharArray();
    var0.characters(var71, (-1), (-1));
    
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
    assertTrue(var55 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test18");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    var4.addNamespaceMapping("", "4444444444");
    nu.staldal.xtree.Element var15 = new nu.staldal.xtree.Element("nu.staldal.ftp.FTPException:                                                                                                     ", "nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________", 10, 100);
    var4.addChild((nu.staldal.xtree.Node)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test19");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test20");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.util.TemplateException~ ");

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test21");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    nu.staldal.xtree.NodeWithChildren var4 = var2.getParent();
    var2.setSystemId("nu.staldal.lagoon.util.TemplateException");
    java.lang.String var8 = var2.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var10 = var2.getAttributeType(0);
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

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test22");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", 0);
    java.net.URL var4 = var3.getBaseURI();
    var3.setSystemId("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var7 = var3.getPreserveSpace();
    java.net.URL var8 = var3.getBaseURI();
    java.lang.String var9 = var3.getTextContent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test23");


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
    java.lang.String var47 = var35.toString();
    
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
    assertTrue("'" + var47 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var47.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test24");


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
    int var25 = var2.lookupAttribute("nu.staldal.lagoon.util.TemplateException: ", "hi!");
    java.lang.String var27 = var2.getAttrValueOrNull("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");
    
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
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test25");


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
    int var57 = var54.numberOfAttributes();
    java.net.URL var58 = var54.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var59 = var54.getFirstChildElement();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
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
    assertTrue("'" + var55 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var55.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test26");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    var4.addNamespaceMapping("", "4444444444");
    var4.addAttribute("", "nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var4.setColumn(100);
    boolean var18 = var4.getPreserveSpace();
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("hi!", "hi!");
    var21.setSystemId("");
    java.net.URL var24 = var21.getBaseURI();
    java.lang.String var27 = var21.getAttrValueOrNull("", "");
    java.lang.String var28 = var21.getTextContent();
    var21.setColumn(100);
    java.lang.String var31 = var21.getTextContent();
    java.lang.String var34 = var21.getInheritedAttribute("                                                                                                    ", "a");
    java.net.URL var35 = var21.getBaseURI();
    boolean var36 = var21.getPreserveSpace();
    var4.addChild((nu.staldal.xtree.Node)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test27");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    java.lang.String var7 = var2.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: ");
    int var8 = var2.numberOfAttributes();
    java.lang.String var10 = var2.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException");
    java.lang.String var11 = var2.getSystemId();
    nu.staldal.lagoon.producer.IslandSplit var12 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var13 = var12.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var12);
    var14.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("", "hi!", 10);
    java.lang.String var21 = var20.getTextContentOrNull();
    var14.setDocumentLocator((org.xml.sax.Locator)var20);
    int var23 = var20.getColumnNumber();
    java.lang.String var25 = var20.lookupNamespaceURI("##");
    var2.addChild((nu.staldal.xtree.Node)var20);
    java.lang.String var27 = var20.getTextContentOrNull();
    boolean var28 = var20.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var31 = var20.getAttrValue("  ", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test28");


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
    var0.log("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 100);
    
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

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test29");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.core.LagoonException var9 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var0.log("4444444444", (java.lang.Throwable)var9, 100);
    java.lang.String var12 = var9.toString();
    java.lang.String var13 = var9.toString();
    java.lang.String var14 = var9.toString();
    java.lang.String var15 = var9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var12.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var13.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var14.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var15.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test30");


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
    var2.addNamespaceMapping("", "nu.staldal.lagoon.core.LagoonException: ");
    int var22 = var2.numberOfChildren();
    java.net.URL var23 = var2.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var25 = var2.getAttributeValue(0);
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
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test31");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    boolean var3 = var1.isWhitespaceNode();
    char[] var4 = var1.asCharArray();
    var1.setPublicId("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    boolean var7 = var1.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test32");


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
    char[] var70 = var67.asCharArray();
    
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
    assertNotNull(var70);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test33");


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
    java.lang.String var57 = var2.getTarget();
    java.lang.String var59 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444");
    
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
    assertTrue("'" + var57 + "' != '" + ""+ "'", var57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test34");


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
    var22.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.TreeBuilder var38 = new nu.staldal.xtree.TreeBuilder();
    var38.endPrefixMapping("hi!");
    var38.endDocument();
    var38.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    nu.staldal.xtree.Text var46 = new nu.staldal.xtree.Text("");
    char[] var47 = var46.asCharArray();
    char[] var48 = var46.asCharArray();
    char[] var49 = var46.asCharArray();
    var38.ignorableWhitespace(var49, 1, 100);
    var22.characters(var49, 0, 100);
    var22.processingInstruction("nu.staldal.lagoon.util.TemplateException~ ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var22.skippedEntity(" ");
    var22.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    
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
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test35");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__", 10, "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu.staldal.lagoon.core.LagoonException~~ hi____33____", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test36");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("                                                                                                    ");
    var0.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var17 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    var0.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test37");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    java.lang.String var6 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var9 = var2.lookupAttribute("hi!", "");
    int var12 = var2.lookupAttribute("                                                                                                    ", "nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var14 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    var2.addAttribute("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException", "nu__46__staldal__46__ftp__46__FTPException__126____32__hi__33__", "nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test38");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    char[] var3 = var1.asCharArray();
    char[] var4 = var1.asCharArray();
    java.lang.String var5 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test39");


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
    nu.staldal.xtree.Text var30 = new nu.staldal.xtree.Text("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.lagoon.producer.BasicSplit var31 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var33 = new nu.staldal.xtree.Text("hi!");
    char[] var34 = var33.asCharArray();
    var31.characters(var34, 1, 10);
    var31.endElement("", "hi!", "hi!");
    var31.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var45 = new nu.staldal.xtree.Text("");
    char[] var46 = var45.asCharArray();
    char[] var47 = var45.asCharArray();
    char[] var48 = var45.asCharArray();
    char[] var49 = var45.asCharArray();
    var31.ignorableWhitespace(var49, 1, 100);
    nu.staldal.xmlutil.ContentHandlerFixer var53 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var31);
    var30.toSAX((org.xml.sax.ContentHandler)var31);
    nu.staldal.lagoon.core.XMLStreamProducer var55 = var31.getNext();
    var31.afterBuild();
    var23.toSAX((org.xml.sax.ContentHandler)var31);
    boolean var58 = var23.isWhitespaceNode();
    java.lang.String var59 = var23.getValue();
    nu.staldal.lagoon.producer.BasicSplit var60 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var62 = new nu.staldal.xtree.Text("hi!");
    char[] var63 = var62.asCharArray();
    var60.characters(var63, 1, 10);
    var60.endElement("", "hi!", "hi!");
    var60.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var74 = new nu.staldal.xtree.Text("");
    char[] var75 = var74.asCharArray();
    char[] var76 = var74.asCharArray();
    char[] var77 = var74.asCharArray();
    var60.characters(var77, 10, 0);
    var60.endElement("                                                                                                    ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.util.TemplateException: ");
    var60.skippedEntity("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var23.toSAX((org.xml.sax.ContentHandler)var60);
    var60.skippedEntity("##########");
    
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
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + ""+ "'", var59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test40");


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
    nu.staldal.lagoon.producer.BasicSplit var29 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text("hi!");
    char[] var32 = var31.asCharArray();
    var29.characters(var32, 1, 10);
    var29.endElement("", "hi!", "hi!");
    var29.processingInstruction("", "hi!");
    nu.staldal.xtree.Text var44 = new nu.staldal.xtree.Text("");
    char[] var45 = var44.asCharArray();
    char[] var46 = var44.asCharArray();
    var29.ignorableWhitespace(var46, 10, 0);
    java.lang.String var51 = var29.getParam("");
    nu.staldal.xtree.Element var54 = new nu.staldal.xtree.Element("hi!", "hi!");
    var54.setSystemId("");
    java.net.URL var57 = var54.getBaseURI();
    java.lang.String var60 = var54.getAttrValueOrNull("", "");
    java.lang.String var61 = var54.getTextContent();
    java.lang.String var63 = var54.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var66 = new nu.staldal.xtree.Element("hi!", "hi!");
    var66.setSystemId("");
    java.net.URL var69 = var66.getBaseURI();
    java.lang.String var72 = var66.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var75 = new nu.staldal.xtree.Element("hi!", "hi!");
    var75.addNamespaceMapping("", "");
    var66.addChild((nu.staldal.xtree.Node)var75);
    java.lang.String var82 = var75.getInheritedAttribute("", "hi!");
    var54.addChild((nu.staldal.xtree.Node)var75);
    var75.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "                                                                                                    ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var29.setDocumentLocator((org.xml.sax.Locator)var75);
    var28.setDocumentLocator((org.xml.sax.Locator)var75);
    var28.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + ""+ "'", var61.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test41");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.log("nu.staldal.lagoon.util.TemplateException", 0);
    java.lang.String var9 = var0.getDescription();
    nu.staldal.lagoon.core.AuthenticationMissingException var11 = new nu.staldal.lagoon.core.AuthenticationMissingException();
    java.lang.Throwable[] var12 = var11.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var13 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var11);
    java.lang.Exception var14 = var13.getException();
    var0.log("nu.staldal.lagoon.core.LagoonException: 4444444444", (java.lang.Throwable)var14, 0);
    nu.staldal.lagoon.util.TemplateException var18 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.Throwable[] var19 = var18.getSuppressed();
    var0.log((java.lang.Throwable)var18, 10);
    var0.setForce(true);
    var0.setTargetURL("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    var0.setTargetURL("nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var31 = new nu.staldal.ftp.FTPException("hi!");
    var28.log("", (java.lang.Throwable)var31, 10);
    org.apache.tools.ant.Location var34 = var28.getLocation();
    nu.staldal.lagoon.core.AuthenticationMissingException var35 = new nu.staldal.lagoon.core.AuthenticationMissingException();
    var28.log((java.lang.Throwable)var35, 10);
    var28.setTaskName("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var0.bindToOwner((org.apache.tools.ant.Task)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test42");


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
    var28.startDocument();
    
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

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test43");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    java.util.Enumeration var6 = var0.getParamNames();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var0.hasBeenUpdated(1433461986000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test44");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    java.lang.String var2 = var0.getParam("4444444444");
    var0.afterBuild();
    var0.beforeBuild();
    var0.afterBuild();
    boolean var7 = var0.hasBeenUpdated(1433461941000L);
    boolean var9 = var0.hasBeenUpdated(1433461980000L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var10 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test45");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("", "nu.staldal.lagoon.util.TemplateException", 0, 100);
    java.lang.String var5 = var4.getTextContentOrNull();
    java.lang.String var8 = var4.getAttrValueOrNull("nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.util.TemplateException~~ ");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var12 = var11.getLineNumber();
    nu.staldal.xtree.NodeWithChildren var13 = var11.getParent();
    var11.setSystemId("nu.staldal.lagoon.util.TemplateException");
    var11.setSystemId("aa");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var19 = var4.replaceChild((nu.staldal.xtree.Node)var11, 2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test46");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.hasBeenUpdated(1433461950000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test47");


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
    nu.staldal.xmlutil.DocumentHandlerAdapter var72 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    var72.endPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
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

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test48");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("", "hi!");
    java.lang.String var3 = var2.getValue();
    var2.setSystemId("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var6 = var2.getValue();
    java.lang.String var7 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test49");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    var4.addAttribute("hi!", "", "hi!", "");
    java.lang.String var10 = var4.getTextContentOrNull();
    int var13 = var4.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", "nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var15 = var4.lookupNamespacePrefix("##");
    java.lang.String var17 = var4.lookupNamespacePrefix("nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var19 = var4.getAttributeNamespaceURI(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test50");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("4444444444");
    nu.staldal.lagoon.util.TemplateException var2 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);
    java.lang.Exception var3 = var2.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test51");


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
    var0.skippedEntity("");
    java.lang.String var25 = var0.getParam("");
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "", 1, 0);
    var0.setDocumentLocator((org.xml.sax.Locator)var30);
    char[] var34 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var38 = new nu.staldal.xtree.Text(var34, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var39 = new nu.staldal.xtree.TreeBuilder();
    var39.endPrefixMapping("hi!");
    var39.endDocument();
    var39.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var38.toSAX((org.xml.sax.ContentHandler)var39);
    var39.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    nu.staldal.xtree.TreeBuilder var50 = new nu.staldal.xtree.TreeBuilder();
    var50.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var55 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var50, false, false);
    nu.staldal.xtree.Text var57 = new nu.staldal.xtree.Text("");
    char[] var58 = var57.asCharArray();
    boolean var59 = var57.isWhitespaceNode();
    char[] var60 = var57.asCharArray();
    var50.ignorableWhitespace(var60, 0, 10);
    var39.ignorableWhitespace(var60, 10, 0);
    var39.endDocument();
    nu.staldal.xtree.Text var69 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var71 = var69.lookupNamespaceURI("");
    char[] var72 = var69.asCharArray();
    var39.ignorableWhitespace(var72, 1, 2);
    var0.ignorableWhitespace(var72, 1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test52");


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
    nu.staldal.lagoon.LagoonAntTask var50 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var53 = new nu.staldal.ftp.FTPException("hi!");
    var50.log("", (java.lang.Throwable)var53, 10);
    org.apache.tools.ant.Location var56 = var50.getLocation();
    nu.staldal.lagoon.core.LagoonException var59 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var50.log("4444444444", (java.lang.Throwable)var59, 100);
    nu.staldal.lagoon.util.TemplateException var62 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var59);
    var0.log("4444444444", (java.lang.Throwable)var62, 2);
    java.lang.Throwable[] var65 = var62.getSuppressed();
    
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
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test53");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var11 = var2.getAttributeValue(2);
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

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test54");


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
    java.lang.String var43 = var21.getParam("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    
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
    assertNull(var43);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test55");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var8 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var0.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.producer.BasicSplit var11 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var13 = new nu.staldal.xtree.Text("hi!");
    char[] var14 = var13.asCharArray();
    var11.characters(var14, 1, 10);
    var11.endElement("", "hi!", "hi!");
    var11.processingInstruction("", "hi!");
    var11.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var11.startDocument();
    var11.beforeBuild();
    nu.staldal.xtree.Text var31 = new nu.staldal.xtree.Text("");
    char[] var32 = var31.asCharArray();
    char[] var33 = var31.asCharArray();
    var11.ignorableWhitespace(var33, 0, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.characters(var33, 2, 2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test56");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var2, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var7, false, true);
    var1.toSAX((org.xml.sax.ContentHandler)var10);
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var19 = var16.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var20 = new nu.staldal.xtree.TreeBuilder();
    var16.toSAX((org.xml.sax.ContentHandler)var20);
    var20.skippedEntity("hi!");
    var20.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var26 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var20);
    var26.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var26.endPrefixMapping("hi!");
    var26.skippedEntity("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    nu.staldal.xtree.ProcessingInstruction var35 = new nu.staldal.xtree.ProcessingInstruction("", "hi!");
    java.lang.String var36 = var35.getValue();
    java.lang.String var37 = var35.getValue();
    java.lang.String var39 = var35.lookupNamespacePrefix("");
    var26.setDocumentLocator((org.xml.sax.Locator)var35);
    nu.staldal.xtree.TreeBuilder var41 = new nu.staldal.xtree.TreeBuilder();
    var41.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var46 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var41, false, true);
    var41.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var49 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var41);
    var49.endDocument();
    var49.endDocument();
    nu.staldal.xtree.TreeBuilder var52 = new nu.staldal.xtree.TreeBuilder();
    var52.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var57 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var52, false, false);
    var52.skippedEntity("nu.staldal.lagoon.util.TemplateException");
    var52.startDocument();
    nu.staldal.xtree.TreeBuilder var61 = new nu.staldal.xtree.TreeBuilder();
    var61.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var66 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var61, false, true);
    var61.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var69 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var61);
    var69.endDocument();
    nu.staldal.lagoon.producer.BasicSplit var71 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var73 = new nu.staldal.xtree.Text("hi!");
    char[] var74 = var73.asCharArray();
    var71.characters(var74, 1, 10);
    var69.ignorableWhitespace(var74, 0, 1);
    var52.ignorableWhitespace(var74, 10, 0);
    var49.ignorableWhitespace(var74, 0, (-1));
    var26.ignorableWhitespace(var74, 1, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.characters(var74, (-1), 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "hi!"+ "'", var36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "hi!"+ "'", var37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test57");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    var4.addNamespaceMapping("", "4444444444");
    java.lang.String var11 = var4.getTextContentOrNull();
    nu.staldal.xtree.Element var14 = var4.getFirstChildElementOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var15 = var4.getNamespaceURI();
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var23 = var20.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var24 = new nu.staldal.xtree.TreeBuilder();
    var20.toSAX((org.xml.sax.ContentHandler)var24);
    var24.skippedEntity("hi!");
    var24.skippedEntity("hi!");
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var24.setDocumentLocator((org.xml.sax.Locator)var32);
    var24.endDocument();
    nu.staldal.xtree.Element var35 = var24.getTree();
    nu.staldal.lagoon.producer.BasicSplit var36 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var38 = new nu.staldal.xtree.Text("hi!");
    char[] var39 = var38.asCharArray();
    var36.characters(var39, 1, 10);
    var36.endElement("", "hi!", "hi!");
    var36.processingInstruction("", "hi!");
    var36.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var36.startDocument();
    var36.skippedEntity("4444444444");
    java.util.Enumeration var56 = var36.getParamNames();
    nu.staldal.xtree.Element var59 = new nu.staldal.xtree.Element("hi!", "hi!");
    var59.setSystemId("");
    java.net.URL var62 = var59.getBaseURI();
    java.lang.String var65 = var59.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var68 = new nu.staldal.xtree.Element("hi!", "hi!");
    var68.addNamespaceMapping("", "");
    var59.addChild((nu.staldal.xtree.Node)var68);
    int var73 = var68.getColumnNumber();
    java.lang.String var75 = var68.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var68.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var36.setDocumentLocator((org.xml.sax.Locator)var68);
    var36.afterBuild();
    var36.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var35.toSAX((org.xml.sax.ContentHandler)var36);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var87 = var4.replaceChild((nu.staldal.xtree.Node)var35, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "4444444444"+ "'", var15.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test58");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.endPrefixMapping("hi_33_");
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    var0.skippedEntity("nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.processingInstruction("nu.staldal.lagoon.core.AuthenticationException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test59");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    java.lang.String var18 = var2.getAttrValueOrNull("", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.xtree.Element var21 = var2.getFirstChildElementOrNull("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var23 = var2.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test60");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var3 = var2.getPreserveSpace();
    var2.addAttribute("hi_33_", "nu.staldal.lagoon.core.LagoonException: ", "4444444444", "4444444444");
    int var9 = var2.getLineNumber();
    java.lang.String var10 = var2.getLocalName();
    var2.setSystemId("nu.staldal.lagoon.core.LagoonException~~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test61");


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
    nu.staldal.xmlutil.ContentHandlerFixer var65 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var42, true, false);
    nu.staldal.xtree.Text var67 = new nu.staldal.xtree.Text("hi!");
    char[] var68 = var67.asCharArray();
    var42.characters(var68, 10, 100);
    var22.ignorableWhitespace(var68, 10, 0);
    
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
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test62");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException: 4444444444");

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test63");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test64");


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
      var8.processingInstruction("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test65");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    int var8 = var4.numberOfNamespaceMappings();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var10 = var4.removeChild((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test66");


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
    nu.staldal.lagoon.LagoonAntTask var74 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var75 = new nu.staldal.lagoon.LagoonAntTask();
    var74.bindToOwner((org.apache.tools.ant.Task)var75);
    nu.staldal.lagoon.LagoonAntTask var77 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var80 = new nu.staldal.ftp.FTPException("hi!");
    var77.log("", (java.lang.Throwable)var80, 10);
    org.apache.tools.ant.Location var83 = var77.getLocation();
    var74.setLocation(var83);
    org.apache.tools.ant.Location var85 = var74.getLocation();
    var0.bindToOwner((org.apache.tools.ant.Task)var74);
    java.lang.String var87 = var0.getTaskType();
    org.apache.tools.ant.Target var88 = var0.getOwningTarget();
    var0.log("nu.staldal.lagoon.util.TemplateException~ ", (-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test67");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    long var8 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.core.OutputHandler var10 = var0.createFile("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.core.OutputHandler var12 = var0.createFile("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    long var14 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461995000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1433461983000L);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test68");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    int var6 = var2.getLineNumber();
    java.lang.String var8 = var2.lookupNamespacePrefix("hi_33_");
    java.lang.String var11 = var2.getAttrValueOrNull("", "4444444444");
    nu.staldal.xtree.Element var15 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    var2.addChild((nu.staldal.xtree.Node)var15);
    java.lang.String var18 = var2.getAttributeLocalName((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var20 = var2.getAttributeValue(0);
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
    assertNull(var18);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test69");


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
    var19.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var54 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test70");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    java.lang.String var3 = var0.getDescription();
    java.lang.String var4 = var0.getTaskName();
    var0.setDescription("          ");
    org.apache.tools.ant.Project var7 = var0.getProject();
    java.lang.String var8 = var0.getTaskType();
    var0.setForce(false);
    var0.setForce(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test71");


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
    int var59 = var20.numberOfNamespaceMappings();
    java.lang.String var60 = var20.getPublicId();
    int var61 = var20.numberOfAttributes();
    
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
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test72");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.log("");
    java.lang.Object var5 = var0.clone();
    var0.maybeConfigure();
    java.lang.String var7 = var0.getTaskType();
    org.apache.tools.ant.Location var8 = var0.getLocation();
    var0.setForce(true);
    var0.log("                                                                                                    ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test73");


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
    nu.staldal.lagoon.producer.IslandSplit var38 = new nu.staldal.lagoon.producer.IslandSplit();
    var38.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var41 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var38, true);
    char[] var44 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var48 = new nu.staldal.xtree.Text(var44, 1, 0, false);
    var41.setDocumentLocator((org.xml.sax.Locator)var48);
    java.lang.String var51 = var48.lookupNamespacePrefix("                                                                                                    ");
    java.lang.String var52 = var48.getValue();
    var48.setPublicId("_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var27.insertChild((nu.staldal.xtree.Node)var48, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + ""+ "'", var52.equals(""));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test74");


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
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var20 = var19.getLineNumber();
    var19.setPublicId("");
    java.lang.String var25 = var19.getInheritedAttribute("", "4444444444");
    int var26 = var19.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var27 = new nu.staldal.xtree.TreeBuilder();
    var27.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var32 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var27, false, false);
    var19.toSAX((org.xml.sax.ContentHandler)var32);
    nu.staldal.xmlutil.ContentHandlerFixer var35 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var32, true);
    nu.staldal.xtree.Element var40 = new nu.staldal.xtree.Element("hi!", "", 10, 0);
    var32.setDocumentLocator((org.xml.sax.Locator)var40);
    nu.staldal.xmlutil.ContentHandlerAdapter var42 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var32);
    nu.staldal.xtree.Text var44 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var44.setLine(1);
    char[] var47 = var44.asCharArray();
    var42.ignorableWhitespace(var47, 10, 0);
    var42.endDocument();
    char[] var54 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var58 = new nu.staldal.xtree.Text(var54, 1, 0, false);
    char[] var59 = var58.asCharArray();
    char[] var60 = var58.asCharArray();
    var42.ignorableWhitespace(var60, 1, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.characters(var60, (-1), (-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test75");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException~ ", "_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_", 2, 2);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test76");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    java.lang.String var3 = var2.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"+ "'", var3.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test77");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.util.TemplateException", 0, 10);
    var4.setColumn(2);
    java.lang.String var7 = var4.getTextContentOrNull();
    java.lang.String var8 = var4.getNamespaceURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var10 = var4.getNamespaceMapping(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var8.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test78");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    nu.staldal.lagoon.core.LagoonContext var1 = var0.getContext();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.hasBeenUpdated(1L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test79");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.destroy();
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

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test80");


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
    var33.reconfigure();
    
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

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test81");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ");

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test82");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    var0.setTaskName("4444444444");
    java.lang.Object var9 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test83");


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
    java.lang.String var41 = var11.getTextContent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var43 = var11.getAttributeValue(10);
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
    assertTrue("'" + var41 + "' != '" + ""+ "'", var41.equals(""));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test84");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    var2.addAttribute("hi!", "hi!", "hi!", "");
    int var25 = var2.lookupAttribute("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    java.lang.String var29 = var28.getTextContent();
    java.lang.String var30 = var28.getSystemId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertChild((nu.staldal.xtree.Node)var28, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test85");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    boolean var3 = var1.isWhitespaceNode();
    char[] var4 = var1.asCharArray();
    boolean var5 = var1.getPreserveSpace();
    java.lang.String var6 = var1.getValue();
    nu.staldal.lagoon.producer.BasicSplit var7 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var9 = new nu.staldal.xtree.Text("hi!");
    char[] var10 = var9.asCharArray();
    var7.characters(var10, 1, 10);
    var7.endElement("", "hi!", "hi!");
    var7.processingInstruction("", "hi!");
    var7.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("hi!", "hi!");
    var26.setSystemId("");
    java.net.URL var29 = var26.getBaseURI();
    java.lang.String var32 = var26.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("hi!", "hi!");
    var35.addNamespaceMapping("", "");
    var26.addChild((nu.staldal.xtree.Node)var35);
    java.lang.String var41 = var35.getAttrValueOrNull("");
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
    var35.addChild((nu.staldal.xtree.Node)var44);
    var44.setLine((-1));
    int var80 = var44.getLineNumber();
    var7.setDocumentLocator((org.xml.sax.Locator)var44);
    var7.processingInstruction("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var7.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var7.processingInstruction("", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.xtree.Text var91 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var93 = var91.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    char[] var94 = var91.asCharArray();
    var7.characters(var94, 100, 1);
    nu.staldal.lagoon.core.XMLStreamProducer var98 = var7.getNext();
    var1.toSAX((org.xml.sax.ContentHandler)var7);
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test86");


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
    java.lang.String var35 = var32.getValue();
    boolean var36 = var32.isWhitespaceNode();
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
    var37.endElement("                                                                                                    ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.util.TemplateException: ");
    var37.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var32.toSAX((org.xml.sax.ContentHandler)var37);
    java.lang.String var65 = var32.getValue();
    
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
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + ""+ "'", var65.equals(""));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test87");


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
    java.lang.String var35 = var12.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test88");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.maybeConfigure();
    var0.log("4444444444", 1);
    java.lang.String var5 = var0.getDescription();
    org.apache.tools.ant.RuntimeConfigurable var6 = var0.getRuntimeConfigurableWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test89");


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
    var8.skippedEntity("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    var8.startDocument();
    var8.endDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test90");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    java.lang.Exception var4 = var1.getException();
    java.lang.Exception var5 = var1.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var3.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test91");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.close();
    boolean var6 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test92");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.destroy();
    var0.startDocument();
    int var19 = var0.getPosition();
    nu.staldal.lagoon.producer.BasicSplit var20 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var22 = new nu.staldal.xtree.Text("hi!");
    char[] var23 = var22.asCharArray();
    var20.characters(var23, 1, 10);
    var20.endElement("", "hi!", "hi!");
    var20.processingInstruction("", "hi!");
    var20.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    char[] var39 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var43 = new nu.staldal.xtree.Text(var39, 1, 0, false);
    var20.characters(var39, 1, (-1));
    var0.ignorableWhitespace(var39, 100, 1);
    nu.staldal.xtree.Text var51 = new nu.staldal.xtree.Text("");
    char[] var52 = var51.asCharArray();
    char[] var53 = var51.asCharArray();
    char[] var54 = var51.asCharArray();
    boolean var55 = var51.isWhitespaceNode();
    var51.setColumn(0);
    char[] var58 = var51.asCharArray();
    var0.ignorableWhitespace(var58, 0, 0);
    var0.afterBuild();
    var0.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test93");


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
    java.lang.String var17 = var4.getTextContent();
    
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
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test94");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    var2.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var2.endPrefixMapping("");
    var2.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "4");
    var2.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.endElement("nu.staldal.ftp.FTPException~                                                                                                     ", "_52_", "44");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test95");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("aa", "nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    java.lang.String var4 = var2.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
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
    nu.staldal.xmlutil.ContentHandlerAdapter var26 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var5);
    nu.staldal.xmlutil.DocumentHandlerAdapter var27 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var26);
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("hi!", "hi!");
    var30.setSystemId("");
    java.net.URL var33 = var30.getBaseURI();
    java.lang.String var36 = var30.getAttrValueOrNull("", "");
    var27.setDocumentLocator((org.xml.sax.Locator)var30);
    var27.startDocument();
    var27.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.producer.IslandSplit var41 = new nu.staldal.lagoon.producer.IslandSplit();
    var41.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var44 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var41, true);
    char[] var47 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var51 = new nu.staldal.xtree.Text(var47, 1, 0, false);
    var44.setDocumentLocator((org.xml.sax.Locator)var51);
    java.lang.String var54 = var51.lookupNamespacePrefix("                                                                                                    ");
    var27.setDocumentLocator((org.xml.sax.Locator)var51);
    var27.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var27.processingInstruction("aa", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    var27.endPrefixMapping("4444444444");
    nu.staldal.xtree.Text var65 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var67 = var65.lookupNamespaceURI("");
    char[] var68 = var65.asCharArray();
    var27.ignorableWhitespace(var68, 1, 1);
    var27.processingInstruction("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var75 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var27);
    var2.toSAX((org.xml.sax.ContentHandler)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test96");


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
    var0.reconfigure();
    var0.setTaskType("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test97");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    boolean var3 = var2.isWhitespaceNode();
    int var4 = var2.numberOfChildren();
    int var5 = var2.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test98");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    nu.staldal.lagoon.core.OutputHandler var8 = var0.createFile("4444444444");
    long var10 = var0.fileLastModified("hi!");
    long var12 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    long var14 = var0.fileLastModified("nu.staldal.ftp.FTPException: 4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461996000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1433461995000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0L);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test99");


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
    var11.setPublicId("nu.staldal.ftp.FTPException: hi!");
    boolean var41 = var11.getPreserveSpace();
    java.lang.String var42 = var11.getSystemId();
    var11.setLine(100);
    
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
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test100");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    var1.log("hi!", 100);
    java.lang.String var8 = var1.getDescription();
    org.apache.tools.ant.Project var9 = var1.getProject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test101");


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
    java.lang.String var30 = var11.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException~~ ");
    java.lang.String var32 = var11.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
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
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test102");


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
    nu.staldal.xtree.Text var24 = new nu.staldal.xtree.Text("4444444444");
    var22.setDocumentLocator((org.xml.sax.Locator)var24);
    var22.skippedEntity("aa");
    var22.endPrefixMapping("nu.staldal.lagoon.util.TemplateException");
    var22.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test103");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4", "nu.staldal.lagoon.core.LagoonException~~ ", 10);
    nu.staldal.lagoon.producer.BasicSplit var4 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text("hi!");
    char[] var7 = var6.asCharArray();
    var4.characters(var7, 1, 10);
    var4.endElement("", "hi!", "hi!");
    var4.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var18 = new nu.staldal.xtree.Text("");
    char[] var19 = var18.asCharArray();
    char[] var20 = var18.asCharArray();
    char[] var21 = var18.asCharArray();
    char[] var22 = var18.asCharArray();
    var4.ignorableWhitespace(var22, 1, 100);
    nu.staldal.xmlutil.ContentHandlerFixer var26 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4);
    var4.destroy();
    var4.endElement("####################################################################################################", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    nu.staldal.lagoon.core.LagoonContext var32 = var4.getContext();
    var4.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var3.outputEndElement((org.xml.sax.ContentHandler)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test104");


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
    var11.setPublicId("nu.staldal.ftp.FTPException: hi!");
    boolean var41 = var11.getPreserveSpace();
    java.lang.String var42 = var11.getSystemId();
    var11.addAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "##########", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
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
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test105");


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
    nu.staldal.lagoon.producer.BasicSplit var38 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var40 = new nu.staldal.xtree.Text("hi!");
    char[] var41 = var40.asCharArray();
    var38.characters(var41, 1, 10);
    var38.endElement("", "hi!", "hi!");
    java.lang.String var50 = var38.getParam("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.producer.BasicSplit var51 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var53 = new nu.staldal.xtree.Text("hi!");
    char[] var54 = var53.asCharArray();
    var51.characters(var54, 1, 10);
    var51.endElement("", "hi!", "hi!");
    var51.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var65 = new nu.staldal.xtree.Text("");
    char[] var66 = var65.asCharArray();
    char[] var67 = var65.asCharArray();
    char[] var68 = var65.asCharArray();
    var51.characters(var68, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var72 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var51);
    nu.staldal.xmlutil.DocumentHandlerAdapter var73 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var72);
    nu.staldal.xtree.Element var76 = new nu.staldal.xtree.Element("hi!", "hi!");
    var76.setSystemId("");
    java.net.URL var79 = var76.getBaseURI();
    java.lang.String var82 = var76.getAttrValueOrNull("", "");
    var73.setDocumentLocator((org.xml.sax.Locator)var76);
    var73.startDocument();
    char[] var85 = new char[] { };
    var73.characters(var85, 100, (-1));
    var38.characters(var85, 100, 100);
    var21.ignorableWhitespace(var85, 2, 10);
    
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
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test106");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    var0.setTargetURL("nu.staldal.lagoon.util.TemplateException");
    var0.setTaskName("hi!");
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.log("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test107");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    org.apache.tools.ant.Location var10 = var0.getLocation();
    var0.log("nu.staldal.lagoon.util.TemplateException", (-1));
    var0.reconfigure();
    java.lang.String var15 = var0.getDescription();
    var0.setTaskType("nu.staldal.lagoon.util.TemplateException: hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test108");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("", "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test109");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~~ ");
    long var10 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var0.close();
    boolean var12 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test110");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    boolean var8 = var0.hasBeenUpdated(1433461930000L);
    var0.afterBuild();
    boolean var11 = var0.hasBeenUpdated(1433461940000L);
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
    assertTrue(var11 == true);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test111");


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
    nu.staldal.xtree.Element var33 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var34 = var33.getLineNumber();
    nu.staldal.xtree.NodeWithChildren var35 = var33.getParent();
    var33.setSystemId("nu.staldal.lagoon.util.TemplateException");
    var33.setSystemId("aa");
    var2.insertChild((nu.staldal.xtree.Node)var33, 0);
    
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
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test112");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    org.apache.tools.ant.Location var10 = var0.getLocation();
    var0.log("nu.staldal.lagoon.util.TemplateException", (-1));
    java.lang.String var14 = var0.getDescription();
    var0.setPassword("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var17 = var0.getTaskType();
    java.lang.String var18 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test113");


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
    java.lang.Exception var20 = var15.getException();
    java.lang.String var21 = var15.toString();
    java.lang.Exception var22 = var15.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var21.equals("nu.staldal.lagoon.util.TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test114");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    var9.addNamespaceMapping("", "4444444444");
    java.lang.String var16 = var9.getTextContent();
    var2.insertChild((nu.staldal.xtree.Node)var9, 0);
    int var19 = var9.numberOfNamespaceMappings();
    java.lang.String var20 = var9.getSystemId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var21 = var9.getFirstChildElement();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test115");


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
    nu.staldal.xtree.Element var86 = var9.getFirstChildElementOrNull("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    
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
    assertNull(var86);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test116");


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
    int var27 = var11.numberOfChildren();
    int var28 = var11.numberOfAttributes();
    
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
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test117");


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
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi!", "hi!");
    var32.setSystemId("");
    java.net.URL var35 = var32.getBaseURI();
    java.lang.String var38 = var32.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var41 = new nu.staldal.xtree.Element("hi!", "hi!");
    var41.addNamespaceMapping("", "");
    var32.addChild((nu.staldal.xtree.Node)var41);
    nu.staldal.xtree.Element var46 = var32.getFirstChildElement();
    int var47 = var32.numberOfChildren();
    var4.setDocumentLocator((org.xml.sax.Locator)var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.endElement("nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "4444444444", "nu.staldal.lagoon.core.LagoonException~~ hi____33____");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test118");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    java.lang.String var7 = var0.getEntryName();
    boolean var9 = var0.hasBeenUpdated(10L);
    boolean var11 = var0.hasBeenUpdated(1433461928000L);
    var0.afterBuild();
    boolean var14 = var0.hasBeenUpdated(1433461992000L);
    
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
    assertTrue(var14 == true);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test119");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    var0.init();
    var0.init();
    java.lang.String var5 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test120");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    var0.beforeBuild();
    java.lang.String var2 = var0.getEntryName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.hasBeenUpdated(1433461945000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test121");


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
    nu.staldal.xtree.Element var24 = var5.getFirstChildElement();
    boolean var25 = var24.isWhitespaceNode();
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test122");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var2 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var0.afterBuild();
    int var4 = var0.getPosition();
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, false);
    var0.destroy();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var11 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test123");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var5 = var2.lookupAttribute("hi!", "hi!");
    int var6 = var2.numberOfAttributes();
    java.lang.String var8 = var2.lookupNamespaceURI("4444444444");
    nu.staldal.xtree.NodeWithChildren var9 = var2.getParent();
    nu.staldal.lagoon.producer.BasicSplit var10 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("hi!");
    char[] var13 = var12.asCharArray();
    var10.characters(var13, 1, 10);
    var10.endElement("", "hi!", "hi!");
    var10.processingInstruction("", "hi!");
    var10.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var10.startDocument();
    var10.skippedEntity("4444444444");
    var10.skippedEntity("hi!");
    var10.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var35 = var10.getEntryName();
    var10.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    var2.toSAX((org.xml.sax.ContentHandler)var10);
    var10.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test124");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var11 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8, true, false);
    var8.startDocument();
    var8.endDocument();
    var8.startPrefixMapping("hi__33__", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    var8.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    var8.endDocument();
    nu.staldal.lagoon.producer.BasicSplit var21 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("hi!");
    char[] var24 = var23.asCharArray();
    var21.characters(var24, 1, 10);
    var21.endElement("", "hi!", "hi!");
    var21.processingInstruction("", "hi!");
    var21.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var21.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var39 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var21);
    java.util.Enumeration var40 = var21.getParamNames();
    nu.staldal.xtree.Element var43 = new nu.staldal.xtree.Element("hi!", "hi!");
    var43.setLine(100);
    java.lang.String var47 = var43.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var21.setDocumentLocator((org.xml.sax.Locator)var43);
    char[] var51 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var55 = new nu.staldal.xtree.Text(var51, 1, 0, false);
    var21.characters(var51, 1, 2);
    var8.ignorableWhitespace(var51, 1, 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test125");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "          "+ "'", var1.equals("          "));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test126");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.endDocument();
    var8.startDocument();
    nu.staldal.xtree.Element var12 = var8.getTree();
    var8.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test127");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    var0.startDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var9 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test128");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    java.lang.String var4 = var3.getLocalName();
    java.lang.String var6 = var3.getAttrValueOrNull("4444444444");
    nu.staldal.xtree.Element var9 = var3.getFirstChildElementOrNull("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    int var10 = var3.numberOfChildren();
    nu.staldal.lagoon.producer.BasicSplit var11 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var13 = new nu.staldal.xtree.Text("hi!");
    char[] var14 = var13.asCharArray();
    var11.characters(var14, 1, 10);
    var11.endElement("", "hi!", "hi!");
    var11.processingInstruction("", "hi!");
    var11.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Text var29 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var30 = var29.getValue();
    char[] var31 = var29.asCharArray();
    var11.characters(var31, 10, (-1));
    java.lang.String var36 = var11.getParam("nu.staldal.lagoon.util.TemplateException");
    int var37 = var11.getPosition();
    var11.destroy();
    var3.toSAX((org.xml.sax.ContentHandler)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var40 = var3.getFirstChildElement();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test129");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    java.lang.String var18 = var2.getAttrValueOrNull("", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    int var21 = var2.lookupAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var22 = var2.getPublicId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var25 = var2.getAttrValue("nu.staldal.ftp.FTPException~~~~ hi!", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
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
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test130");


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
    var49.setTargetURL("nu.staldal.lagoon.core.LagoonException: ");
    var0.bindToOwner((org.apache.tools.ant.Task)var49);
    var49.maybeConfigure();
    
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

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test131");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 1);
    var3.setPublicId("nu.staldal.lagoon.core.LagoonException: ");
    int var6 = var3.numberOfChildren();
    int var9 = var3.lookupAttribute("4", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    var3.addNamespaceMapping("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    boolean var13 = var3.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test132");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    var0.maybeConfigure();
    java.lang.String var3 = var0.getDescription();
    var0.log("nu.staldal.lagoon.core.LagoonException~ 4444444444", 100);
    java.lang.String var7 = var0.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test133");


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
    java.lang.String var18 = var2.getNamespaceURI();
    nu.staldal.xtree.ProcessingInstruction var21 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    var21.setPublicId("");
    int var24 = var21.getLineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var26 = var2.replaceChild((nu.staldal.xtree.Node)var21, 0);
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
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test134");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xtree.Element var8 = new nu.staldal.xtree.Element("", "hi!", 10);
    var8.setSystemId("hi!");
    java.lang.String var11 = var8.getSystemId();
    var4.setDocumentLocator((org.xml.sax.Locator)var8);
    var8.setLine(100);
    nu.staldal.xtree.Element var17 = var8.getFirstChildElementOrNull("_32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    boolean var18 = var8.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test135");


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
    java.lang.String var29 = var22.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~ ");
    int var30 = var22.numberOfChildren();
    int var31 = var22.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test136");


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
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    var28.bindToOwner((org.apache.tools.ant.Task)var29);
    var29.log("hi!");
    java.lang.String var33 = var29.getTaskName();
    var29.init();
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var39 = new nu.staldal.ftp.FTPException("hi!");
    var36.log("", (java.lang.Throwable)var39, 10);
    var29.log("hi!", (java.lang.Throwable)var39, 0);
    org.apache.tools.ant.Project var44 = var29.getProject();
    var29.setTaskName("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var10.bindToOwner((org.apache.tools.ant.Task)var29);
    var10.maybeConfigure();
    var10.setTaskType("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    
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
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test137");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    java.lang.String var10 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var11 = var2.getBaseURI();
    int var12 = var2.numberOfChildren();
    java.lang.String var13 = var2.getTextContentOrNull();
    nu.staldal.xtree.NodeWithChildren var14 = var2.getParent();
    nu.staldal.xtree.Element var15 = var2.getFirstChildElementOrNull();
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test138");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4", "nu.staldal.lagoon.core.LagoonException~~ ", 10);
    java.lang.String var4 = var3.getSystemId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test139");


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
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var20 = new nu.staldal.ftp.FTPException("hi!");
    var17.log("", (java.lang.Throwable)var20, 10);
    org.apache.tools.ant.Location var23 = var17.getLocation();
    nu.staldal.lagoon.core.LagoonException var26 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var17.log("4444444444", (java.lang.Throwable)var26, 100);
    org.apache.tools.ant.RuntimeConfigurable var29 = var17.getRuntimeConfigurableWrapper();
    nu.staldal.lagoon.LagoonAntTask var30 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var33 = new nu.staldal.ftp.FTPException("hi!");
    var30.log("", (java.lang.Throwable)var33, 10);
    org.apache.tools.ant.Project var36 = var30.getProject();
    nu.staldal.lagoon.util.TemplateException var38 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var39 = var38.getException();
    var30.log("", (java.lang.Throwable)var38, (-1));
    java.lang.Throwable[] var42 = var38.getSuppressed();
    java.lang.Throwable[] var43 = var38.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var45 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var46 = var45.toString();
    var38.addSuppressed((java.lang.Throwable)var45);
    nu.staldal.lagoon.LagoonAntTask var48 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var51 = new nu.staldal.ftp.FTPException("hi!");
    var48.log("", (java.lang.Throwable)var51, 10);
    org.apache.tools.ant.Location var54 = var48.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var55 = var48.getRuntimeConfigurableWrapper();
    var48.setForce(false);
    org.apache.tools.ant.Location var58 = var48.getLocation();
    nu.staldal.lagoon.core.LagoonException var60 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var61 = var60.toString();
    var48.log((java.lang.Throwable)var60, 100);
    var45.addSuppressed((java.lang.Throwable)var60);
    var17.log((java.lang.Throwable)var45, 10);
    nu.staldal.lagoon.util.TemplateException var67 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var45);
    java.lang.String var68 = var45.toString();
    nu.staldal.lagoon.LagoonAntTask var69 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var72 = new nu.staldal.ftp.FTPException("hi!");
    var69.log("", (java.lang.Throwable)var72, 10);
    org.apache.tools.ant.Location var75 = var69.getLocation();
    nu.staldal.lagoon.core.LagoonException var78 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var69.log("4444444444", (java.lang.Throwable)var78, 100);
    java.lang.String var81 = var78.toString();
    nu.staldal.lagoon.util.TemplateException var82 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var78);
    var45.addSuppressed((java.lang.Throwable)var82);
    var0.log(" ", (java.lang.Throwable)var45, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var46.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var61.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var68.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var81.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test140");


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
    var0.reconfigure();
    
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

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test141");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    java.lang.Object var12 = var0.clone();
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    var13.maybeConfigure();
    var13.log("4444444444", 1);
    var13.setTargetURL("hi_33_");
    var13.setForce(false);
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var25 = new nu.staldal.ftp.FTPException("hi!");
    var22.log("", (java.lang.Throwable)var25, 10);
    nu.staldal.lagoon.util.TemplateException var28 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var25);
    var13.log((java.lang.Throwable)var25, 100);
    var0.log((java.lang.Throwable)var25, 10);
    java.lang.Object var33 = var0.clone();
    org.apache.tools.ant.Location var34 = var0.getLocation();
    org.apache.tools.ant.Target var35 = var0.getOwningTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test142");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("##");
    java.lang.String var2 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "##"+ "'", var2.equals("##"));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test143");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xtree.Text var7 = new nu.staldal.xtree.Text("");
    char[] var8 = var7.asCharArray();
    boolean var9 = var7.isWhitespaceNode();
    char[] var10 = var7.asCharArray();
    var0.ignorableWhitespace(var10, 0, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var17 = new nu.staldal.xtree.Text(var10, 10, 1, false);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test144");


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
    nu.staldal.lagoon.core.XMLStreamProducer var55 = var0.getNext();
    var0.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "  ");
    
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
    assertNull(var55);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test145");


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
    nu.staldal.lagoon.LagoonAntTask var78 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var79 = new nu.staldal.lagoon.LagoonAntTask();
    var78.bindToOwner((org.apache.tools.ant.Task)var79);
    var78.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var83 = new nu.staldal.lagoon.LagoonAntTask();
    var83.setPassword("");
    var78.bindToOwner((org.apache.tools.ant.Task)var83);
    org.apache.tools.ant.Project var87 = var78.getProject();
    org.apache.tools.ant.Project var88 = var78.getProject();
    org.apache.tools.ant.RuntimeConfigurable var89 = var78.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Location var90 = var78.getLocation();
    var36.setLocation(var90);
    
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
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test146");


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
    var22.processingInstruction("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test147");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    int var13 = var4.lookupAttribute("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException");
    int var14 = var4.getColumnNumber();
    java.lang.String var16 = var4.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var19 = var4.getAttrValue("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "_32__32__32__32__32__32__32__32__32__32_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test148");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    var0.beforeBuild();
    java.lang.String var2 = var0.getEntryName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.hasBeenUpdated(1433461995000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test149");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", 0, 10);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test150");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "", 1, 0);
    var4.setLine(2);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test151");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.core.LagoonException~~ hi____33____", 0);
    java.lang.String var4 = var3.getNamespaceURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_"+ "'", var4.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_"));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test152");


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
    var0.log("nu.staldal.ftp.FTPException~~ hi!", 2);
    
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

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test153");


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
    int var78 = var75.numberOfChildren();
    nu.staldal.xtree.ProcessingInstruction var81 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    java.lang.String var82 = var81.getValue();
    nu.staldal.xtree.Node var84 = var75.replaceChild((nu.staldal.xtree.Node)var81, 0);
    
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
    assertTrue(var78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_"+ "'", var82.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test154");


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
    nu.staldal.xtree.Element var57 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var58 = var57.getFirstChildElementOrNull();
    int var61 = var57.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var57.addAttribute("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException~~ ");
    var22.setDocumentLocator((org.xml.sax.Locator)var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == (-1));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test155");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    java.lang.String var10 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var11 = var2.getBaseURI();
    int var12 = var2.numberOfChildren();
    java.lang.String var13 = var2.getTextContentOrNull();
    int var16 = var2.lookupAttribute("hi!", "nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var18 = var2.getAttributeType((-1));
    int var21 = var2.lookupAttribute("_52_", "_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_");
    nu.staldal.xtree.ProcessingInstruction var24 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var25 = var24.getLineNumber();
    java.lang.String var26 = var24.getValue();
    java.lang.String var27 = var24.getTarget();
    java.lang.String var28 = var24.getTarget();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var30 = var2.replaceChild((nu.staldal.xtree.Node)var24, 100);
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var26.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var27.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var28.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test156");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    var0.beforeBuild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.hasBeenUpdated(1433461990000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test157");


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
    nu.staldal.xtree.Element var40 = new nu.staldal.xtree.Element("hi!", "hi!");
    var40.setSystemId("");
    java.net.URL var43 = var40.getBaseURI();
    java.lang.String var46 = var40.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var49 = new nu.staldal.xtree.Element("hi!", "hi!");
    var49.addNamespaceMapping("", "");
    var40.addChild((nu.staldal.xtree.Node)var49);
    var40.setSystemId("");
    var40.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var63 = var40.getAttrValueOrNull("4444444444", "4444444444");
    var40.addAttribute("hi!", "hi!", "", "hi!");
    java.net.URL var69 = var40.getBaseURI();
    nu.staldal.xtree.Node var71 = var40.getChild(0);
    java.lang.String var73 = var40.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    java.lang.String var74 = var40.getTextContentOrNull();
    var22.setDocumentLocator((org.xml.sax.Locator)var40);
    var22.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~~ hi____33____");
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
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test158");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    var2.setColumn(10);
    java.lang.String var10 = var2.getAttrValueOrNull("", "hi!");
    boolean var11 = var2.getPreserveSpace();
    nu.staldal.xtree.Element var14 = new nu.staldal.xtree.Element("hi!", "hi!");
    var14.setLine(100);
    int var17 = var14.numberOfNamespaceMappings();
    nu.staldal.xtree.Element var18 = var14.getFirstChildElementOrNull();
    java.lang.String var21 = var14.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var2.addChild((nu.staldal.xtree.Node)var14);
    java.lang.String var23 = var14.getSystemId();
    var14.addAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.ftp.FTPException~ hi!", " ");
    int var31 = var14.lookupAttribute("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test159");


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
    nu.staldal.xmlutil.ContentHandlerFixer var64 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var60, true, true);
    
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

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test160");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.util.TemplateException: nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____"+ "'", var2.equals("nu.staldal.lagoon.util.TemplateException: nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____"));

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test161");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi_33_");
    int var2 = var1.getLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == (-1));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test162");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    org.apache.tools.ant.Target var9 = var5.getOwningTarget();
    var5.setPassword("hi!");
    var5.setForce(false);
    var5.log("_52_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test163");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("4", "##");
    int var5 = var2.lookupAttribute("_32__32__32__32__32__32__32__32__32__32_", "nu.staldal.ftp.FTPException:                                                                                                     ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var2.getAttributeType(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test164");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var0.skippedEntity("nu.staldal.ftp.FTPException:                                                                                                     ");
    nu.staldal.lagoon.producer.BasicSplit var9 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var11 = new nu.staldal.xtree.Text("hi!");
    char[] var12 = var11.asCharArray();
    var9.characters(var12, 1, 10);
    var9.endElement("", "hi!", "hi!");
    var9.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("");
    char[] var24 = var23.asCharArray();
    char[] var25 = var23.asCharArray();
    char[] var26 = var23.asCharArray();
    var9.characters(var26, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var30 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var9);
    nu.staldal.xmlutil.DocumentHandlerAdapter var31 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var30);
    nu.staldal.xtree.Element var34 = new nu.staldal.xtree.Element("hi!", "hi!");
    var34.setSystemId("");
    java.net.URL var37 = var34.getBaseURI();
    java.lang.String var40 = var34.getAttrValueOrNull("", "");
    var31.setDocumentLocator((org.xml.sax.Locator)var34);
    var31.startDocument();
    var31.endPrefixMapping("nu.staldal.lagoon.core.AuthenticationMissingException");
    var31.skippedEntity("hi_33_");
    nu.staldal.lagoon.producer.BasicSplit var47 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var49 = new nu.staldal.xtree.Text("hi!");
    char[] var50 = var49.asCharArray();
    var47.characters(var50, 1, 10);
    var47.endElement("", "hi!", "hi!");
    var47.processingInstruction("", "hi!");
    var47.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xmlutil.ContentHandlerAdapter var64 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var47);
    nu.staldal.xtree.Text var66 = new nu.staldal.xtree.Text("");
    char[] var67 = var66.asCharArray();
    char[] var68 = var66.asCharArray();
    char[] var69 = var66.asCharArray();
    var64.ignorableWhitespace(var69, (-1), 10);
    var31.characters(var69, 0, 0);
    var0.ignorableWhitespace(var69, (-1), 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var82 = new nu.staldal.xtree.Text(var69, 0, (-1), true);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test165");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.beforeBuild();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.hasBeenUpdated(1433461982000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test166");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    var4.setSystemId("hi!");
    int var8 = var4.getLineNumber();
    int var9 = var4.numberOfChildren();
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var13 = var12.getLineNumber();
    java.lang.String var14 = var12.getSystemId();
    var12.addAttribute("", "hi!", "", "hi!");
    java.lang.String var22 = var12.getInheritedAttribute("hi!", "4444444444");
    java.lang.String var24 = var12.lookupNamespaceURI("");
    var4.addChild((nu.staldal.xtree.Node)var12);
    boolean var26 = var12.isWhitespaceNode();
    nu.staldal.xtree.Element var29 = var12.getFirstChildElementOrNull("nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var31 = var12.getAttrValue("nu.staldal.lagoon.core.LagoonException: aa");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test167");


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
    java.lang.String var78 = var75.getSystemId();
    java.lang.String var81 = var75.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________", "nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    
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
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test168");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.close();
    boolean var6 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~ ");
    var0.close();
    nu.staldal.lagoon.core.OutputHandler var11 = var0.createFile("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test169");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("4");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var3 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);
    java.lang.Throwable[] var4 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test170");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test171");


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
    int var29 = var11.numberOfNamespaceMappings();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var31 = var11.getAttributeType(100);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test172");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    var0.deleteFile("hi!");
    boolean var9 = var0.isReentrant();
    var0.deleteFile("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    long var13 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1433461969000L);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test173");


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
    var22.skippedEntity("hi_33_");
    nu.staldal.lagoon.producer.BasicSplit var57 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var59 = new nu.staldal.xtree.Text("hi!");
    char[] var60 = var59.asCharArray();
    var57.characters(var60, 1, 10);
    var57.endElement("", "hi!", "hi!");
    var57.processingInstruction("", "hi!");
    var57.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var57.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var75 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var57);
    var75.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.Text var80 = new nu.staldal.xtree.Text("");
    char[] var81 = var80.asCharArray();
    boolean var82 = var80.isWhitespaceNode();
    char[] var83 = var80.asCharArray();
    var75.setDocumentLocator((org.xml.sax.Locator)var80);
    int var85 = var80.getColumnNumber();
    var80.setSystemId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    char[] var88 = var80.asCharArray();
    var22.characters(var88, 1, 100);
    var22.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");
    
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
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test174");


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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test175");


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
    java.lang.Exception var46 = var35.getException();
    
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
    assertNull(var46);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test176");


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
    var88.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
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

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test177");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xtree.Element var8 = new nu.staldal.xtree.Element("", "hi!", 10);
    var8.setSystemId("hi!");
    java.lang.String var11 = var8.getSystemId();
    var4.setDocumentLocator((org.xml.sax.Locator)var8);
    var8.setLine(100);
    java.lang.String var15 = var8.getTextContentOrNull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var17 = var8.getAttributeLocalName(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test178");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test179");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("aa", "nu.staldal.lagoon.core.AuthenticationMissingException");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test180");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    java.lang.String var7 = var0.getParam("4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.hasBeenUpdated(1433461943000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test181");


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
    java.lang.String var29 = var22.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~ ");
    java.lang.String var31 = var22.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException~ hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test182");


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
    java.lang.String var47 = var38.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
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
    assertNull(var47);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test183");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    var5.endPrefixMapping("4444444444");
    var5.startPrefixMapping("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException: ");
    var5.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test184");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_ftp_46_FTPException_126__126__32_hi_33_");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test185");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var2 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var3 = var0.getNext();
    var0.destroy();
    var0.init();
    var0.init();
    nu.staldal.lagoon.core.LagoonContext var7 = var0.getContext();
    int var8 = var0.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test186");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.processingInstruction("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test187");


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
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("", "hi!", 10);
    var45.setSystemId("hi!");
    java.net.URL var48 = var45.getBaseURI();
    var4.addChild((nu.staldal.xtree.Node)var45);
    int var50 = var45.getColumnNumber();
    
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
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test188");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    boolean var7 = var0.isReentrant();
    boolean var8 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    long var12 = var0.fileLastModified("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    boolean var13 = var0.needPassword();
    
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
    assertTrue(var12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test189");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    java.lang.String var4 = var3.getLocalName();
    java.lang.String var5 = var3.getNamespaceURI();
    java.lang.String var6 = var3.getTextContentOrNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var5.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test190");


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
    nu.staldal.xtree.Element var32 = new nu.staldal.xtree.Element("hi!", "hi!");
    var32.setSystemId("");
    java.net.URL var35 = var32.getBaseURI();
    java.lang.String var38 = var32.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var41 = new nu.staldal.xtree.Element("hi!", "hi!");
    var41.addNamespaceMapping("", "");
    var32.addChild((nu.staldal.xtree.Node)var41);
    nu.staldal.xtree.Element var46 = var32.getFirstChildElement();
    int var47 = var32.numberOfChildren();
    var4.setDocumentLocator((org.xml.sax.Locator)var32);
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    nu.staldal.xtree.TreeBuilder var53 = new nu.staldal.xtree.TreeBuilder();
    var53.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var58 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var53, false, false);
    var53.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var63 = new nu.staldal.xtree.Element("hi!", "hi!");
    var63.setLine(100);
    int var66 = var63.numberOfNamespaceMappings();
    var53.setDocumentLocator((org.xml.sax.Locator)var63);
    var53.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var52.toSAX((org.xml.sax.ContentHandler)var53);
    var53.startPrefixMapping("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var53.endPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var53.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ ");
    var53.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var53.startDocument();
    nu.staldal.xtree.Text var83 = new nu.staldal.xtree.Text("##");
    var53.setDocumentLocator((org.xml.sax.Locator)var83);
    var32.addChild((nu.staldal.xtree.Node)var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test191");


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
    var0.setDescription("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test192");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    boolean var7 = var0.needPassword();
    long var9 = var0.fileLastModified("hi_33_");
    nu.staldal.lagoon.core.OutputHandler var11 = var0.createFile("hi_33_");
    boolean var12 = var0.needPassword();
    boolean var13 = var0.needPassword();
    nu.staldal.lagoon.core.OutputHandler var15 = var0.createFile("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    boolean var16 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461996000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1433461994000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test193");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("");
    char[] var13 = var12.asCharArray();
    char[] var14 = var12.asCharArray();
    var0.ignorableWhitespace(var14, 100, 2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text(var14, 1, 2, true);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test194");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test195");


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
    var4.skippedEntity("nu__46__staldal__46__ftp__46__FTPException__58____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test196");


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
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var37 = new nu.staldal.lagoon.LagoonAntTask();
    var36.bindToOwner((org.apache.tools.ant.Task)var37);
    var36.setForce(true);
    java.lang.String var41 = var36.getTaskName();
    var36.setTaskType("4444444444");
    java.lang.Object var44 = var36.clone();
    java.lang.Object var45 = var36.clone();
    nu.staldal.lagoon.util.TemplateException var47 = new nu.staldal.lagoon.util.TemplateException("hi!");
    var36.log((java.lang.Throwable)var47, (-1));
    var35.addSuppressed((java.lang.Throwable)var47);
    
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
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test197");


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
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var30 = new nu.staldal.lagoon.LagoonAntTask();
    var29.bindToOwner((org.apache.tools.ant.Task)var30);
    var29.setForce(true);
    var29.setTaskName("");
    var29.log("nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
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
    var29.log((java.lang.Throwable)var51, 0);
    var23.addSuppressed((java.lang.Throwable)var51);
    java.lang.String var58 = var51.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var52.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var58.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test198");


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
    nu.staldal.xmlutil.ContentHandlerAdapter var90 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var89);
    var90.startDocument();
    var90.startDocument();
    
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

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test199");


    nu.staldal.lagoon.producer.XMLFormatter var0 = new nu.staldal.lagoon.producer.XMLFormatter();
    var0.destroy();
    var0.beforeBuild();
    var0.init();
    nu.staldal.lagoon.core.LagoonContext var4 = var0.getContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test200");


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
    int var76 = var64.numberOfAttributes();
    java.lang.String var77 = var64.getNamespaceURI();
    
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
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "hi!"+ "'", var77.equals("hi!"));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test201");


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
    java.lang.String var30 = var2.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Element var31 = var2.getFirstChildElement();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test202");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu.staldal.lagoon.util.TemplateException: nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test203");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    boolean var8 = var0.hasBeenUpdated((-1L));
    int var9 = var0.getPosition();
    boolean var11 = var0.hasBeenUpdated(1433461946000L);
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

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test204");


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
    nu.staldal.xtree.NodeWithChildren var50 = var33.getParent();
    nu.staldal.xtree.Element var51 = var33.getFirstChildElement();
    var51.setSystemId("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    int var54 = var51.getLineNumber();
    var51.addAttribute("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", "hi_33_", "nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:                                                                                                     ");
    
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
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == (-1));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test205");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated(1433461972000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test206");


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
    var9.setTaskType("_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_");
    nu.staldal.lagoon.LagoonAntTask var24 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var27 = new nu.staldal.ftp.FTPException("hi!");
    var24.log("", (java.lang.Throwable)var27, 10);
    org.apache.tools.ant.Location var30 = var24.getLocation();
    nu.staldal.lagoon.core.LagoonException var33 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var24.log("4444444444", (java.lang.Throwable)var33, 100);
    var24.init();
    var9.bindToOwner((org.apache.tools.ant.Task)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test207");


    nu.staldal.lagoon.producer.XMLFormatter var0 = new nu.staldal.lagoon.producer.XMLFormatter();
    var0.destroy();
    int var2 = var0.getPosition();
    var0.init();
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    var0.init();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test208");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException~~ ", 10, 100);
    java.lang.String var6 = var4.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    java.lang.String var7 = var4.getLocalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "nu.staldal.lagoon.core.LagoonException~~ "+ "'", var7.equals("nu.staldal.lagoon.core.LagoonException~~ "));

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test209");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444"));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test210");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("hi_33_");
    nu.staldal.lagoon.util.TemplateException var2 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var1);
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.LagoonException: hi_33_"+ "'", var3.equals("nu.staldal.lagoon.core.LagoonException: hi_33_"));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test211");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("nu.staldal.lagoon.util.TemplateException: aa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test212");


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
    var0.skippedEntity("");
    java.lang.String var25 = var0.getParam("");
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "", 1, 0);
    var0.setDocumentLocator((org.xml.sax.Locator)var30);
    var0.skippedEntity(" ");
    var0.beforeBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test213");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    java.lang.String var6 = var0.getDescription();
    nu.staldal.lagoon.LagoonAntTask var7 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var10 = new nu.staldal.ftp.FTPException("hi!");
    var7.log("", (java.lang.Throwable)var10, 10);
    var7.init();
    var7.init();
    java.lang.Object var15 = var7.clone();
    var7.init();
    var7.log("nu.staldal.lagoon.util.TemplateException: ");
    var0.bindToOwner((org.apache.tools.ant.Task)var7);
    java.lang.Object var20 = var7.clone();
    nu.staldal.lagoon.LagoonAntTask var21 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var22 = new nu.staldal.lagoon.LagoonAntTask();
    var21.bindToOwner((org.apache.tools.ant.Task)var22);
    var22.setForce(false);
    var7.bindToOwner((org.apache.tools.ant.Task)var22);
    var22.setTaskType("nu__46__staldal__46__ftp__46__FTPException__126____32__hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test214");


    nu.staldal.lagoon.producer.FOPFormatter var0 = new nu.staldal.lagoon.producer.FOPFormatter();
    java.lang.String var1 = var0.getEntryName();
    int var2 = var0.getPosition();
    java.lang.String var3 = var0.getEntryName();
    var0.beforeBuild();
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
    assertNull(var3);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test215");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    var0.init();
    nu.staldal.xmlutil.ContentHandlerFixer var6 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.init();
    java.util.Enumeration var8 = var0.getParamNames();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test216");


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
    java.lang.String var42 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    int var43 = var2.getLineNumber();
    
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
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == (-1));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test217");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var5 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var2.getAttributeLocalName(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test218");


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
    java.net.URL var28 = var2.getBaseURI();
    int var29 = var2.getLineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var31 = var2.removeChild((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test219");


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
    java.lang.String var67 = var21.getTextContent();
    
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
    assertTrue("'" + var67 + "' != '" + ""+ "'", var67.equals(""));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test220");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test221");


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
    java.lang.String var32 = var10.getDescription();
    nu.staldal.lagoon.util.TemplateException var34 = new nu.staldal.lagoon.util.TemplateException();
    var10.log("nu_46_staldal_46_lagoon_46_util_46_TemplateException", (java.lang.Throwable)var34, (-1));
    nu.staldal.lagoon.core.LagoonException var38 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.Exception var39 = var38.getException();
    var10.log((java.lang.Throwable)var38, 2);
    nu.staldal.lagoon.LagoonAntTask var42 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var43 = var42.getDescription();
    java.lang.Object var44 = var42.clone();
    org.apache.tools.ant.RuntimeConfigurable var45 = var42.getRuntimeConfigurableWrapper();
    var10.setRuntimeConfigurableWrapper(var45);
    
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
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test222");


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
    nu.staldal.lagoon.util.TemplateException var18 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var19 = var18.getException();
    nu.staldal.lagoon.util.TemplateException var20 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var18);
    java.lang.Throwable[] var21 = var20.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var20);
    java.lang.String var23 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "nu.staldal.lagoon.core.LagoonException: hi_33_"+ "'", var23.equals("nu.staldal.lagoon.core.LagoonException: hi_33_"));

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test223");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", 0);
    java.net.URL var4 = var3.getBaseURI();
    var3.setColumn(2);
    java.net.URL var7 = var3.getBaseURI();
    java.lang.String var10 = var3.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.xtree.Element var13 = new nu.staldal.xtree.Element("hi!", "hi!");
    var13.setLine(100);
    nu.staldal.xtree.Element var20 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var23 = var20.lookupAttribute("4444444444", "hi!");
    var20.addNamespaceMapping("", "4444444444");
    java.lang.String var27 = var20.getTextContent();
    var13.insertChild((nu.staldal.xtree.Node)var20, 0);
    java.net.URL var30 = var13.getBaseURI();
    int var31 = var13.getColumnNumber();
    int var32 = var13.numberOfChildren();
    var3.insertChild((nu.staldal.xtree.Node)var13, 0);
    var3.setSystemId("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var37 = var3.getTextContent();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test224");


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
    var12.setTargetURL("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test225");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    var0.skippedEntity("");
    var0.afterBuild();
    var0.endElement("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test226");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test227");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    var0.afterBuild();
    boolean var3 = var0.hasBeenUpdated(10L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated(1433461927000L);
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
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test228");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    var0.endDocument();
    var0.endDocument();

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test229");


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
    java.lang.String var24 = var11.getAttributeType((-1));
    java.lang.String var26 = var11.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    var11.setPublicId("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    
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
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test230");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    long var8 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.core.OutputHandler var10 = var0.createFile("nu.staldal.lagoon.util.TemplateException");
    var0.deleteFile("hi_33_");
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    boolean var15 = var0.isReentrant();
    boolean var16 = var0.isReentrant();
    var0.deleteFile("####################################################################################################");
    boolean var19 = var0.isReentrant();
    boolean var20 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461996000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test231");


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
    var21.endElement("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.ftp.FTPException~~ hi!", "aaaaaaaaaa");
    var21.skippedEntity("nu.staldal.lagoon.util.TemplateException~ ");
    var21.skippedEntity("nu.staldal.lagoon.util.TemplateException: aa");
    var21.afterBuild();
    
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

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test232");


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
    nu.staldal.lagoon.producer.BasicSplit var23 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var25 = new nu.staldal.xtree.Text("hi!");
    char[] var26 = var25.asCharArray();
    var23.characters(var26, 1, 10);
    var23.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var33 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var23, true);
    nu.staldal.xmlutil.ContentHandlerAdapter var34 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var23);
    var34.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    char[] var40 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var44 = new nu.staldal.xtree.Text(var40, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var45 = new nu.staldal.xtree.TreeBuilder();
    var45.endPrefixMapping("hi!");
    var45.endDocument();
    var45.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var44.toSAX((org.xml.sax.ContentHandler)var45);
    var45.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    char[] var58 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var62 = new nu.staldal.xtree.Text(var58, 1, 0, false);
    char[] var63 = var62.asCharArray();
    var45.ignorableWhitespace(var63, 10, 10);
    var34.ignorableWhitespace(var63, 100, 10);
    var0.characters(var63, 2, 0);
    var0.startDocument();
    nu.staldal.lagoon.core.XMLStreamProducer var74 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test233");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.XMLStreamProducer var4 = var0.getNext();
    boolean var6 = var0.hasBeenUpdated((-1L));
    boolean var8 = var0.hasBeenUpdated(1433461930000L);
    var0.afterBuild();
    nu.staldal.lagoon.core.LagoonContext var10 = var0.getContext();
    var0.afterBuild();
    boolean var13 = var0.hasBeenUpdated(1433461947000L);
    nu.staldal.lagoon.core.XMLStreamProducer var14 = var0.getNext();
    int var15 = var0.getPosition();
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test234");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    java.lang.String var10 = var2.getSystemId();
    var2.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444", "                                                                                                    ");
    java.lang.String var18 = var2.getInheritedAttribute("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.net.URL var19 = var2.getBaseURI();
    int var22 = var2.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var23 = var2.getTextContent();
    boolean var24 = var2.getPreserveSpace();
    
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
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test235");


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
    var22.skippedEntity("hi_33_");
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
    var22.ignorableWhitespace(var76, 0, 100);
    var22.skippedEntity("hi_33_");
    nu.staldal.xmlutil.ContentHandlerAdapter var89 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var22);
    nu.staldal.xmlutil.DocumentHandlerAdapter var90 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var89);
    nu.staldal.xtree.Element var93 = new nu.staldal.xtree.Element("hi!", "hi!");
    var93.setSystemId("");
    java.lang.String var97 = var93.getAttributeLocalName((-1));
    java.lang.String var98 = var93.getNamespaceURI();
    var90.setDocumentLocator((org.xml.sax.Locator)var93);
    
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
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var97);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var98 + "' != '" + "hi!"+ "'", var98.equals("hi!"));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test236");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    var2.setColumn((-1));
    java.net.URL var12 = var2.getBaseURI();
    int var13 = var2.numberOfNamespaceMappings();
    java.lang.String var14 = var2.getTextContentOrNull();
    var2.setSystemId("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    java.lang.String var18 = var2.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.xtree.ProcessingInstruction var21 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    var21.setColumn(10);
    var2.addChild((nu.staldal.xtree.Node)var21);
    java.lang.String var25 = var21.getTarget();
    
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
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ "+ "'", var25.equals("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ "));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test237");


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
    java.lang.String var28 = var11.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.producer.IslandSplit var29 = new nu.staldal.lagoon.producer.IslandSplit();
    var29.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var33 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var29, false, false);
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("", "hi!", 10);
    var37.setSystemId("hi!");
    java.lang.String var40 = var37.getSystemId();
    var33.setDocumentLocator((org.xml.sax.Locator)var37);
    nu.staldal.xmlutil.ContentHandlerFixer var44 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var33, false, true);
    nu.staldal.lagoon.producer.BasicSplit var45 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var47 = new nu.staldal.xtree.Text("hi!");
    char[] var48 = var47.asCharArray();
    var45.characters(var48, 1, 10);
    var45.endElement("", "hi!", "hi!");
    var45.processingInstruction("", "hi!");
    var45.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var45.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var63 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var45);
    var63.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.DocumentHandlerAdapter var67 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var63);
    nu.staldal.xtree.Text var69 = new nu.staldal.xtree.Text("4444444444");
    var67.setDocumentLocator((org.xml.sax.Locator)var69);
    var44.setDocumentLocator((org.xml.sax.Locator)var69);
    int var72 = var69.getColumnNumber();
    int var73 = var69.getLineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.insertChild((nu.staldal.xtree.Node)var69, (-1));
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
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == (-1));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test238");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ hi__33__", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", 0);
    nu.staldal.xtree.Element var8 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var9 = var8.getFirstChildElementOrNull();
    int var12 = var8.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var14 = var8.lookupNamespaceURI("4444444444");
    nu.staldal.xtree.Text var16 = new nu.staldal.xtree.Text("4444444444");
    nu.staldal.lagoon.producer.BasicSplit var17 = new nu.staldal.lagoon.producer.BasicSplit();
    var16.toSAX((org.xml.sax.ContentHandler)var17);
    var8.outputEndElement((org.xml.sax.ContentHandler)var17);
    var17.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var21 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var17);
    nu.staldal.xmlutil.ContentHandlerFixer var22 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.outputEndElement((org.xml.sax.ContentHandler)var22);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test239");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var17 = var11.getAttributeType(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test240");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    nu.staldal.lagoon.core.LagoonContext var1 = var0.getContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var2 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test241");


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
    java.lang.String var22 = var2.getTextContentOrNull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var24 = var2.getAttributeType(10);
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
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test242");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("_32__32__32__32__32__32__32__32__32__32_", 100, "aa", "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________", "hi__33__");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test243");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    int var6 = var0.getPosition();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test244");


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
    var32.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    
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

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test245");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    org.apache.tools.ant.Target var7 = var0.getOwningTarget();
    var0.log("hi!");
    var0.setTargetURL("nu.staldal.lagoon.util.TemplateException");
    var0.maybeConfigure();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test246");


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
    nu.staldal.xmlutil.ContentHandlerAdapter var19 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.endElement("__52__", "nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
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

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test247");


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
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    var26.bindToOwner((org.apache.tools.ant.Task)var27);
    var26.setForce(true);
    java.lang.String var31 = var26.getTaskName();
    var26.log("nu.staldal.lagoon.util.TemplateException", 0);
    var26.maybeConfigure();
    var10.bindToOwner((org.apache.tools.ant.Task)var26);
    org.apache.tools.ant.RuntimeConfigurable var37 = var26.getRuntimeConfigurableWrapper();
    nu.staldal.lagoon.LagoonAntTask var38 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var41 = new nu.staldal.ftp.FTPException("hi!");
    var38.log("", (java.lang.Throwable)var41, 10);
    org.apache.tools.ant.Location var44 = var38.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var45 = var38.getRuntimeConfigurableWrapper();
    var38.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var48 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var51 = new nu.staldal.ftp.FTPException("hi!");
    var48.log("", (java.lang.Throwable)var51, 10);
    org.apache.tools.ant.Project var54 = var48.getProject();
    nu.staldal.lagoon.util.TemplateException var56 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var57 = var56.getException();
    var48.log("", (java.lang.Throwable)var56, (-1));
    var38.bindToOwner((org.apache.tools.ant.Task)var48);
    org.apache.tools.ant.Project var61 = var38.getProject();
    org.apache.tools.ant.Target var62 = var38.getOwningTarget();
    java.lang.String var63 = var38.getDescription();
    var26.bindToOwner((org.apache.tools.ant.Task)var38);
    
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
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test248");


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
    var28.startDocument();
    var28.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test249");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_"+ "'", var2.equals("_35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35__35_"));

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test250");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("                                                                                                    ");
    java.lang.String var2 = var1.toString();
    java.lang.Exception var3 = var1.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException:                                                                                                     "+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException:                                                                                                     "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test251");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("##", "44");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var2.getAttrValue("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test252");


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
    var20.startPrefixMapping("__35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35__", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test253");


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
    var21.endElement("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.ftp.FTPException~~ hi!", "aaaaaaaaaa");
    var21.processingInstruction("nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    
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

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test254");


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
    java.lang.String var30 = var11.lookupNamespaceURI("4444444444");
    var11.addAttribute("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "hi____33____", "nu.staldal.lagoon.core.LagoonException: aa", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException");
    
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
    assertNull(var30);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test255");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", 100, "nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444", "nu.staldal.lagoon.util.TemplateException~ ");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test256");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getValue();
    java.lang.String var5 = var2.getValue();
    var2.setSystemId(".");
    java.lang.String var8 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var5.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var8.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test257");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.util.TemplateException~~ ", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test258");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", 0, "nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", "##########", "nu.staldal.lagoon.util.TemplateException: nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test259");


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
    org.apache.tools.ant.Target var25 = var9.getOwningTarget();
    var9.init();
    org.apache.tools.ant.Project var27 = var9.getProject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test260");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test261");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    var2.addAttribute("hi!", "hi!", "hi!", "");
    int var23 = var2.numberOfNamespaceMappings();
    int var24 = var2.numberOfAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test262");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    int var13 = var4.lookupAttribute("", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String var15 = var4.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var18 = var4.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444", "nu.staldal.lagoon.util.TemplateException~~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test263");


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
      java.lang.String var23 = var2.getAttributeLocalName(1);
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
    assertNull(var21);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test264");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.destroy();
    var0.startDocument();
    int var19 = var0.getPosition();
    nu.staldal.lagoon.producer.BasicSplit var20 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var22 = new nu.staldal.xtree.Text("hi!");
    char[] var23 = var22.asCharArray();
    var20.characters(var23, 1, 10);
    var20.endElement("", "hi!", "hi!");
    var20.processingInstruction("", "hi!");
    var20.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    char[] var39 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var43 = new nu.staldal.xtree.Text(var39, 1, 0, false);
    var20.characters(var39, 1, (-1));
    var0.ignorableWhitespace(var39, 100, 1);
    var0.skippedEntity("####################################################################################################");
    nu.staldal.xtree.Element var54 = new nu.staldal.xtree.Element("hi!", "hi!");
    var54.setSystemId("");
    java.net.URL var57 = var54.getBaseURI();
    java.lang.String var60 = var54.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var63 = new nu.staldal.xtree.Element("hi!", "hi!");
    var63.addNamespaceMapping("", "");
    var54.addChild((nu.staldal.xtree.Node)var63);
    java.lang.String var69 = var63.getAttrValueOrNull("4444444444");
    int var70 = var63.numberOfChildren();
    boolean var71 = var63.getPreserveSpace();
    java.net.URL var72 = var63.getBaseURI();
    var0.setDocumentLocator((org.xml.sax.Locator)var63);
    nu.staldal.lagoon.core.XMLStreamProducer var74 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test265");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    java.lang.String var3 = var2.getTextContent();
    java.lang.String var4 = var2.getSystemId();
    java.lang.String var6 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var8 = var2.lookupNamespaceURI("#");
    java.lang.String var11 = var2.getInheritedAttribute("_32_", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test266");


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
    nu.staldal.xtree.Element var26 = var5.getFirstChildElementOrNull();
    var26.setLine(2);
    
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
    assertNotNull(var26);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test267");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    java.lang.String var3 = var1.getValue();
    java.lang.String var4 = var1.getValue();
    var1.setPublicId("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    var1.setLine(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test268");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.hasBeenUpdated(1433461968000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test269");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    nu.staldal.lagoon.util.TemplateException var8 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var9 = var8.getException();
    var0.log("", (java.lang.Throwable)var8, (-1));
    var0.setPassword("nu.staldal.lagoon.util.TemplateException: ");
    java.lang.Object var14 = var0.clone();
    nu.staldal.lagoon.LagoonAntTask var15 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var16 = new nu.staldal.lagoon.LagoonAntTask();
    var15.bindToOwner((org.apache.tools.ant.Task)var16);
    var16.log("hi!");
    java.lang.String var20 = var16.getTaskName();
    var16.init();
    org.apache.tools.ant.Location var22 = var16.getLocation();
    var16.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var16.log("", (-1));
    var0.bindToOwner((org.apache.tools.ant.Task)var16);
    var0.setDescription("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    java.lang.Object var31 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test270");


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
    var0.characters(var87, 100, 2);
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var95 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var95.endPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    var95.endPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
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

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test271");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("aa");
    nu.staldal.lagoon.core.AuthenticationException var2 = new nu.staldal.lagoon.core.AuthenticationException();
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var6 = new nu.staldal.ftp.FTPException("hi!");
    var3.log("", (java.lang.Throwable)var6, 10);
    var3.init();
    var3.init();
    java.lang.Object var11 = var3.clone();
    var3.init();
    java.lang.Object var13 = var3.clone();
    nu.staldal.lagoon.core.LagoonException var15 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var16 = var15.toString();
    var3.log((java.lang.Throwable)var15, 10);
    java.lang.Throwable[] var19 = var15.getSuppressed();
    var2.addSuppressed((java.lang.Throwable)var15);
    var1.addSuppressed((java.lang.Throwable)var15);
    java.lang.Throwable[] var22 = var1.getSuppressed();
    nu.staldal.lagoon.LagoonAntTask var23 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var26 = new nu.staldal.ftp.FTPException("hi!");
    var23.log("", (java.lang.Throwable)var26, 10);
    org.apache.tools.ant.Location var29 = var23.getLocation();
    nu.staldal.lagoon.core.LagoonException var32 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var23.log("4444444444", (java.lang.Throwable)var32, 100);
    java.lang.String var35 = var32.toString();
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var39 = new nu.staldal.ftp.FTPException("hi!");
    var36.log("", (java.lang.Throwable)var39, 10);
    org.apache.tools.ant.Project var42 = var36.getProject();
    nu.staldal.lagoon.util.TemplateException var44 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var45 = var44.getException();
    var36.log("", (java.lang.Throwable)var44, (-1));
    java.lang.Throwable[] var48 = var44.getSuppressed();
    java.lang.Throwable[] var49 = var44.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var51 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var52 = var51.toString();
    var44.addSuppressed((java.lang.Throwable)var51);
    var32.addSuppressed((java.lang.Throwable)var51);
    java.lang.String var55 = var32.toString();
    var1.addSuppressed((java.lang.Throwable)var32);
    java.lang.String var57 = var32.toString();
    nu.staldal.lagoon.core.LagoonException var59 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException~ ");
    var32.addSuppressed((java.lang.Throwable)var59);
    java.lang.Exception var61 = var59.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var16.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var35.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var52.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var55.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var57.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test272");


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
    var18.processingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Text var50 = new nu.staldal.xtree.Text("");
    char[] var51 = var50.asCharArray();
    char[] var52 = var50.asCharArray();
    char[] var53 = var50.asCharArray();
    char[] var54 = var50.asCharArray();
    java.lang.String var55 = var50.getSystemId();
    char[] var56 = var50.asCharArray();
    var18.characters(var56, (-1), 2);
    nu.staldal.xtree.Element var62 = new nu.staldal.xtree.Element("hi!", "hi!");
    var62.setSystemId("");
    java.net.URL var65 = var62.getBaseURI();
    java.lang.String var68 = var62.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var71 = new nu.staldal.xtree.Element("hi!", "hi!");
    var71.addNamespaceMapping("", "");
    var62.addChild((nu.staldal.xtree.Node)var71);
    var71.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var71.setLine(1);
    java.lang.String var84 = var71.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    var71.setPublicId("nu.staldal.ftp.FTPException~~ hi!");
    java.lang.String var88 = var71.lookupNamespacePrefix("nu.staldal.lagoon.core.AuthenticationException");
    var18.setDocumentLocator((org.xml.sax.Locator)var71);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test273");


    char[] var2 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text(var2, 1, 0, false);
    java.net.URL var7 = var6.getBaseURI();
    var6.setLine(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test274");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8, true, true);
    var14.endDocument();
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("hi!", "hi!");
    var18.setSystemId("");
    java.net.URL var21 = var18.getBaseURI();
    java.lang.String var24 = var18.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi!", "hi!");
    var27.addNamespaceMapping("", "");
    var18.addChild((nu.staldal.xtree.Node)var27);
    nu.staldal.xtree.Element var34 = new nu.staldal.xtree.Element("hi!", "hi!");
    var34.setSystemId("");
    java.net.URL var37 = var34.getBaseURI();
    java.lang.String var40 = var34.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var43 = new nu.staldal.xtree.Element("hi!", "hi!");
    var43.addNamespaceMapping("", "");
    var34.addChild((nu.staldal.xtree.Node)var43);
    int var48 = var43.getColumnNumber();
    java.lang.String var50 = var43.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var43.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var18.addChild((nu.staldal.xtree.Node)var43);
    nu.staldal.xtree.Element var59 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var60 = var59.getPreserveSpace();
    var59.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "4444444444", "nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var43.addChild((nu.staldal.xtree.Node)var59);
    java.lang.String var68 = var43.lookupNamespaceURI(" ");
    boolean var69 = var43.getPreserveSpace();
    var43.setSystemId("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    var14.setDocumentLocator((org.xml.sax.Locator)var43);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.endElement("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.ftp.FTPException:                                                                                                     ", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test275");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    var0.log("");
    java.lang.Object var5 = var0.clone();
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.util.TemplateException var9 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException: ");
    var0.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", (java.lang.Throwable)var9, (-1));
    nu.staldal.lagoon.core.AuthenticationException var12 = new nu.staldal.lagoon.core.AuthenticationException();
    var9.addSuppressed((java.lang.Throwable)var12);
    nu.staldal.lagoon.util.TemplateException var14 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test276");


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
    var22.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_", "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    
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

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test277");


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
    nu.staldal.lagoon.LagoonAntTask var12 = new nu.staldal.lagoon.LagoonAntTask();
    var12.setPassword("");
    var7.bindToOwner((org.apache.tools.ant.Task)var12);
    org.apache.tools.ant.Project var16 = var7.getProject();
    org.apache.tools.ant.Project var17 = var7.getProject();
    org.apache.tools.ant.Location var18 = var7.getLocation();
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var20 = new nu.staldal.lagoon.LagoonAntTask();
    var19.bindToOwner((org.apache.tools.ant.Task)var20);
    var20.log("hi!");
    java.lang.String var24 = var20.getTaskName();
    var20.init();
    org.apache.tools.ant.Location var26 = var20.getLocation();
    var7.setLocation(var26);
    org.apache.tools.ant.Location var28 = var7.getLocation();
    var1.setLocation(var28);
    org.apache.tools.ant.RuntimeConfigurable var30 = var1.getRuntimeConfigurableWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test278");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu__46__staldal__46__lagoon__46__util__46__TemplateException");

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test279");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ "'", var1.equals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test280");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var43 = var40.getNamespaceMapping(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test281");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    java.lang.String var2 = var0.getParam("4444444444");
    var0.afterBuild();
    boolean var5 = var0.hasBeenUpdated((-1L));
    boolean var7 = var0.hasBeenUpdated((-1L));
    boolean var9 = var0.hasBeenUpdated(1433461963000L);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test282");


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
    nu.staldal.xmlutil.ContentHandlerFixer var26 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test283");


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
    java.lang.String var22 = var11.getTextContent();
    java.lang.String var24 = var11.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    
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
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test284");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("_52_", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 10, 0);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test285");


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
    var0.setForce(true);
    
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

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test286");


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
    nu.staldal.xtree.Text var30 = new nu.staldal.xtree.Text(var19, 0, 0, false);
    char[] var31 = var30.asCharArray();
    var30.setSystemId("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test287");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    java.lang.String var4 = var3.getLocalName();
    java.lang.String var6 = var3.getAttrValueOrNull("4444444444");
    var3.addAttribute("          ", "                                                                                                    ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "hi!");
    java.lang.String var14 = var3.getAttrValueOrNull("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    java.lang.String var15 = var3.getLocalName();
    var3.setLine(2);
    java.lang.String var19 = var3.lookupNamespacePrefix("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var15.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test288");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    var0.init();
    var0.init();
    var0.beforeBuild();
    nu.staldal.lagoon.core.LagoonContext var4 = var0.getContext();
    nu.staldal.lagoon.core.ByteStreamProducer var5 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var6 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var7 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test289");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    boolean var1 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.lagoon.core.OutputHandler var5 = var0.createFile("nu.staldal.lagoon.core.LagoonException: hi_33_");
    var0.close();
    boolean var7 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test290");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", 10, 0);
    boolean var5 = var4.getPreserveSpace();
    java.lang.String var6 = var4.getNamespaceURI();
    java.lang.String var7 = var4.getLocalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException"+ "'", var6.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_"+ "'", var7.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_"));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test291");


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
    nu.staldal.xtree.TreeBuilder var29 = new nu.staldal.xtree.TreeBuilder();
    var29.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var34 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var29, false, true);
    var29.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var37 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var29);
    var37.endDocument();
    nu.staldal.lagoon.producer.BasicSplit var39 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var41 = new nu.staldal.xtree.Text("hi!");
    char[] var42 = var41.asCharArray();
    var39.characters(var42, 1, 10);
    var37.ignorableWhitespace(var42, 0, 1);
    var4.characters(var42, 0, 0);
    var4.startPrefixMapping("nu.staldal.ftp.FTPException: hi!", "4444444444");
    nu.staldal.xtree.Element var55 = var4.getTree();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test292");


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
    var5.startDocument();
    
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

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test293");


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
    int var20 = var2.getLineNumber();
    nu.staldal.lagoon.producer.BasicSplit var21 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("hi!");
    char[] var24 = var23.asCharArray();
    var21.characters(var24, 1, 10);
    var21.endElement("", "hi!", "hi!");
    var21.processingInstruction("", "hi!");
    var21.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var21.startDocument();
    var21.skippedEntity("4444444444");
    java.util.Enumeration var41 = var21.getParamNames();
    nu.staldal.xtree.Element var44 = new nu.staldal.xtree.Element("hi!", "hi!");
    var44.setSystemId("");
    java.net.URL var47 = var44.getBaseURI();
    java.lang.String var50 = var44.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var53 = new nu.staldal.xtree.Element("hi!", "hi!");
    var53.addNamespaceMapping("", "");
    var44.addChild((nu.staldal.xtree.Node)var53);
    int var58 = var53.getColumnNumber();
    java.lang.String var60 = var53.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: ");
    var53.addAttribute("hi_33_", "4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    var21.setDocumentLocator((org.xml.sax.Locator)var53);
    nu.staldal.xmlutil.ContentHandlerFixer var69 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var21, false, true);
    var21.skippedEntity("nu.staldal.lagoon.core.AuthenticationMissingException");
    var21.beforeBuild();
    var2.outputEndElement((org.xml.sax.ContentHandler)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var21.init();
      fail("Expected exception of type nu.staldal.lagoon.core.LagoonException");
    } catch (nu.staldal.lagoon.core.LagoonException e) {
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
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test294");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException: ");
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.core.OutputHandler var12 = var0.createFile("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test295");


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
    var0.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test296");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.ftp.FTPException~ hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 0, 2);
    var4.setPublicId("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444");

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test297");


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
    boolean var29 = var1.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi!"+ "'", var2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test298");


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
    boolean var20 = var4.getPreserveSpace();
    
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
    assertTrue(var20 == false);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test299");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    nu.staldal.xtree.Element var16 = var2.getFirstChildElement();
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    var19.setSystemId("");
    java.net.URL var22 = var19.getBaseURI();
    java.lang.String var25 = var19.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    var28.addNamespaceMapping("", "");
    var19.addChild((nu.staldal.xtree.Node)var28);
    java.lang.String var33 = var19.getNamespaceURI();
    java.net.URL var34 = var19.getBaseURI();
    java.lang.String var35 = var19.getLocalName();
    int var36 = var19.getColumnNumber();
    var16.addChild((nu.staldal.xtree.Node)var19);
    nu.staldal.xtree.Element var40 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var41 = var40.getLineNumber();
    var40.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var47 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var48 = var47.getLineNumber();
    var47.addNamespaceMapping("", "");
    var40.addChild((nu.staldal.xtree.Node)var47);
    nu.staldal.xtree.NodeWithChildren var53 = var40.getParent();
    boolean var54 = var40.getPreserveSpace();
    var40.setPublicId("4444444444");
    nu.staldal.xtree.Element var57 = var40.getFirstChildElement();
    nu.staldal.xtree.Element var62 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", 10, 0);
    nu.staldal.xtree.Node var64 = var40.replaceChild((nu.staldal.xtree.Node)var62, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var66 = var19.replaceChild((nu.staldal.xtree.Node)var62, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test300");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "hi!");
    var0.skippedEntity("nu.staldal.ftp.FTPException: hi!");
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
    nu.staldal.xtree.TreeBuilder var30 = new nu.staldal.xtree.TreeBuilder();
    var30.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var35 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var30, false, true);
    var12.toSAX((org.xml.sax.ContentHandler)var30);
    java.lang.String var37 = var12.getSystemId();
    int var40 = var12.lookupAttribute("nu.staldal.lagoon.util.TemplateException: hi_33_", "####################################################################################################");
    var0.setDocumentLocator((org.xml.sax.Locator)var12);
    
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
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test301");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test302");


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
    var45.startDocument();
    char[] var57 = new char[] { };
    var45.characters(var57, 100, (-1));
    var0.ignorableWhitespace(var57, 0, 10);
    var0.endElement("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.lagoon.core.XMLStreamProducer var68 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var70 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    var0.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var73 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
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
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test303");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    var0.setDescription("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.setTargetURL("nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test304");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    nu.staldal.xmlutil.ContentHandlerFixer var13 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var10, false, true);
    var10.startPrefixMapping("_52_444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test305");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var10 = var9.getLineNumber();
    var9.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var9);
    nu.staldal.xtree.NodeWithChildren var15 = var2.getParent();
    nu.staldal.xtree.Text var17 = new nu.staldal.xtree.Text("");
    nu.staldal.xtree.TreeBuilder var18 = new nu.staldal.xtree.TreeBuilder();
    var18.endPrefixMapping("hi!");
    var17.toSAX((org.xml.sax.ContentHandler)var18);
    var18.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var18.endPrefixMapping("");
    var18.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "4");
    var18.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var2.outputStartElement((org.xml.sax.ContentHandler)var18);
    var18.endElement("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.ProcessingInstruction var39 = new nu.staldal.xtree.ProcessingInstruction("", "hi!");
    java.lang.String var40 = var39.getValue();
    java.lang.String var41 = var39.getValue();
    java.lang.String var43 = var39.lookupNamespacePrefix("");
    java.lang.String var44 = var39.getValue();
    java.lang.String var45 = var39.getValue();
    var18.setDocumentLocator((org.xml.sax.Locator)var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "hi!"+ "'", var44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "hi!"+ "'", var45.equals("hi!"));

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test306");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu__46__staldal__46__lagoon__46__util__46__TemplateException");

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test307");


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
    var0.startDocument();
    var0.afterBuild();
    var0.endElement("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", " ");
    int var65 = var0.getPosition();
    var0.beforeBuild();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test308");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    var2.addAttribute("hi!", "hi!", "hi!", "");
    int var25 = var2.lookupAttribute("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    int var26 = var2.numberOfChildren();
    nu.staldal.xtree.Element var29 = var2.getFirstChildElementOrNull("hi_33_", "nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    var2.setSystemId("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test309");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    org.apache.tools.ant.Target var7 = var0.getOwningTarget();
    var0.setPassword("hi!");
    org.apache.tools.ant.Location var10 = var0.getLocation();
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var14 = new nu.staldal.ftp.FTPException("hi!");
    var11.log("", (java.lang.Throwable)var14, 10);
    org.apache.tools.ant.Location var17 = var11.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var18 = var11.getRuntimeConfigurableWrapper();
    var11.setTargetURL("4444444444");
    java.lang.String var21 = var11.getTaskName();
    java.lang.String var22 = var11.getDescription();
    nu.staldal.ftp.FTPException var25 = new nu.staldal.ftp.FTPException("hi!");
    var11.log("4444444444", (java.lang.Throwable)var25, 100);
    org.apache.tools.ant.Project var28 = var11.getProject();
    var0.bindToOwner((org.apache.tools.ant.Task)var11);
    var0.maybeConfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test310");


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
    var18.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.util.TemplateException: ");
    var18.startDocument();
    nu.staldal.xtree.Text var63 = new nu.staldal.xtree.Text("");
    char[] var64 = var63.asCharArray();
    char[] var65 = var63.asCharArray();
    char[] var66 = var63.asCharArray();
    char[] var67 = var63.asCharArray();
    var18.ignorableWhitespace(var67, 100, 10);
    var18.startDocument();
    
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
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test311");


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
    nu.staldal.xtree.Element var29 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    var29.setColumn(0);
    java.lang.String var32 = var29.getTextContentOrNull();
    var8.setDocumentLocator((org.xml.sax.Locator)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var35 = var29.getNamespaceMapping(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test312");


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
    nu.staldal.xtree.TreeBuilder var29 = new nu.staldal.xtree.TreeBuilder();
    var29.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var34 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var29, false, true);
    var29.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var37 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var29);
    var37.endDocument();
    nu.staldal.lagoon.producer.BasicSplit var39 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var41 = new nu.staldal.xtree.Text("hi!");
    char[] var42 = var41.asCharArray();
    var39.characters(var42, 1, 10);
    var37.ignorableWhitespace(var42, 0, 1);
    var4.characters(var42, 0, 0);
    var4.startPrefixMapping("nu.staldal.ftp.FTPException: hi!", "4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var57 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4, false, true);
    nu.staldal.xmlutil.ContentHandlerAdapter var58 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var57);
    var58.endDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test313");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.lang.String var6 = var3.getSystemId();
    int var7 = var3.getColumnNumber();
    java.lang.String var8 = var3.getTextContent();
    java.net.URL var9 = var3.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var11 = var3.getChild(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test314");


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
    var0.reconfigure();
    java.lang.String var17 = var0.getDescription();
    org.apache.tools.ant.Location var18 = var0.getLocation();
    var0.setTaskName("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_");
    
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
    assertNotNull(var18);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test315");


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
    var38.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var40 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test316");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    var4.addAttribute("hi!", "", "hi!", "");
    java.lang.String var10 = var4.getTextContentOrNull();
    int var13 = var4.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", "nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var15 = var4.lookupNamespacePrefix("##");
    java.lang.String var17 = var4.lookupNamespacePrefix("nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    nu.staldal.xtree.Element var18 = var4.getFirstChildElementOrNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test317");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test318");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var24 = var11.getNamespaceMapping((-1));
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

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test319");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var62 = var48.getAttributeType(100);
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

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test320");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.net.URL var9 = var4.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var11 = var4.getNamespaceMapping((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test321");


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
    nu.staldal.lagoon.core.XMLStreamProducer var55 = var0.getNext();
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test322");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.startPrefixMapping("                                                                                                    ", "nu.staldal.lagoon.util.TemplateException: ");
    var0.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
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
    var33.endPrefixMapping("nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.xtree.Text var48 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var48.setLine(1);
    char[] var51 = var48.asCharArray();
    char[] var52 = var48.asCharArray();
    var33.characters(var52, 0, 100);
    var0.ignorableWhitespace(var52, 0, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var62 = new nu.staldal.xtree.Text(var52, (-1), (-1), true);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test323");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xtree.Element var8 = new nu.staldal.xtree.Element("", "hi!", 10);
    var8.setSystemId("hi!");
    java.lang.String var11 = var8.getSystemId();
    var4.setDocumentLocator((org.xml.sax.Locator)var8);
    int var13 = var8.numberOfChildren();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test324");


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
    int var34 = var11.lookupAttribute("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException~ hi__33__");
    
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
    assertTrue(var34 == (-1));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test325");


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
    java.lang.String var76 = var72.toString();
    
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
    assertTrue("'" + var76 + "' != '" + "nu.staldal.lagoon.util.TemplateException: hi!"+ "'", var76.equals("nu.staldal.lagoon.util.TemplateException: hi!"));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test326");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    java.lang.Object var2 = var0.clone();
    var0.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.log("", (-1));
    nu.staldal.lagoon.LagoonAntTask var8 = new nu.staldal.lagoon.LagoonAntTask();
    var8.setPassword("");
    var8.setForce(false);
    org.apache.tools.ant.Target var13 = var8.getOwningTarget();
    var8.maybeConfigure();
    var8.log("nu.staldal.lagoon.core.LagoonException: 4444444444");
    org.apache.tools.ant.Location var17 = var8.getLocation();
    var0.bindToOwner((org.apache.tools.ant.Task)var8);
    var0.reconfigure();
    var0.setPassword("nu.staldal.lagoon.core.AuthenticationException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test327");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    var0.afterBuild();
    java.util.Enumeration var5 = var0.getParamNames();
    var0.afterBuild();
    nu.staldal.lagoon.core.XMLStreamProducer var7 = var0.getNext();
    java.lang.String var9 = var0.getParam("                                                                                                    ");
    var0.afterBuild();
    var0.afterBuild();
    nu.staldal.lagoon.core.LagoonContext var12 = var0.getContext();
    boolean var14 = var0.hasBeenUpdated(1433461979000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test328");


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
    org.apache.tools.ant.RuntimeConfigurable var33 = var0.getRuntimeConfigurableWrapper();
    var0.setPassword("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.log("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", 2);
    
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
    assertNotNull(var33);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test329");


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
    java.lang.String var24 = var2.getAttributeLocalName((-1));
    
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
    assertNull(var24);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test330");


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
    java.lang.String var18 = var2.getNamespaceURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var21 = var2.getFirstChildElement("nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_");
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
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test331");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException", "nu.staldal.ftp.FTPException~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException"+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException"));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test332");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test333");


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
    var0.setDescription("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    
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

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test334");


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
    int var21 = var2.numberOfNamespaceMappings();
    
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
    assertTrue(var21 == 0);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test335");


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
    java.lang.String var43 = var27.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    
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
    assertNull(var43);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test336");


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
    nu.staldal.xtree.Text var30 = new nu.staldal.xtree.Text(var19, 0, 0, false);
    java.lang.String var31 = var30.getValue();
    boolean var32 = var30.isWhitespaceNode();
    boolean var33 = var30.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test337");


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
    java.lang.String var39 = var33.getInheritedAttribute("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test338");


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
    java.lang.String var59 = var20.getLocalName();
    int var60 = var20.numberOfChildren();
    java.lang.String var61 = var20.getLocalName();
    
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
    assertTrue("'" + var59 + "' != '" + "hi!"+ "'", var59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test339");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.afterBuild();
    var0.init();
    var0.init();
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test340");


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
    int var21 = var17.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    java.lang.String var22 = var17.getLocalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + " "+ "'", var22.equals(" "));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test341");


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
    nu.staldal.xmlutil.ContentHandlerFixer var37 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, true);
    var5.beforeBuild();
    nu.staldal.lagoon.core.XMLStreamProducer var39 = var5.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test342");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test343");


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
    var22.startPrefixMapping("a", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var22.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
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

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test344");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    java.lang.String var7 = var2.getAttrValueOrNull("");
    var2.setColumn((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test345");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ "+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ "));

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test346");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    var0.beforeBuild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.hasBeenUpdated(1433461975000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test347");


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
    nu.staldal.lagoon.util.TemplateException var54 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var39);
    java.lang.Exception var55 = var54.getException();
    nu.staldal.lagoon.LagoonAntTask var56 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var59 = new nu.staldal.ftp.FTPException("hi!");
    var56.log("", (java.lang.Throwable)var59, 10);
    org.apache.tools.ant.Location var62 = var56.getLocation();
    nu.staldal.lagoon.core.LagoonException var65 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var56.log("4444444444", (java.lang.Throwable)var65, 100);
    java.lang.String var68 = var65.toString();
    java.lang.String var69 = var65.toString();
    java.lang.String var70 = var65.toString();
    nu.staldal.lagoon.util.TemplateException var71 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var65);
    var55.addSuppressed((java.lang.Throwable)var65);
    
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
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var68.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var69.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var70.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test348");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    var4.setColumn(0);
    nu.staldal.xtree.Element var7 = var4.getFirstChildElementOrNull();
    int var8 = var4.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test349");


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
    var22.startPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var22.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ");
    var22.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var22.processingInstruction("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    
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

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test350");


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
    var17.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ hi__33__");
    var17.endPrefixMapping("                                                                                                    ");
    var17.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    
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

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test351");


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
    var0.init();
    var0.log("nu_46_staldal_46_lagoon_46_util_46_TemplateException", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test352");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var14 = var0.hasBeenUpdated(1433461948000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test353");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.init();
    org.apache.tools.ant.Location var7 = var1.getLocation();
    var1.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var1.init();
    var1.maybeConfigure();
    org.apache.tools.ant.Project var12 = var1.getProject();
    java.lang.String var13 = var1.getTaskName();
    var1.setTaskType("nu________46________staldal________46________lagoon________46________core________46________AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test354");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var5.startPrefixMapping("                                                                                                    ", "hi!");
    var5.startPrefixMapping("          ", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    var5.startPrefixMapping("          ", "nu.staldal.lagoon.util.TemplateException");
    var5.startPrefixMapping("##", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.xmlutil.ContentHandlerAdapter var18 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var5);
    nu.staldal.lagoon.producer.BasicSplit var19 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text("hi!");
    char[] var22 = var21.asCharArray();
    var19.characters(var22, 1, 10);
    var19.endElement("", "hi!", "hi!");
    var19.processingInstruction("", "hi!");
    var19.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var38 = new nu.staldal.xtree.Element("hi!", "hi!");
    var38.setSystemId("");
    java.net.URL var41 = var38.getBaseURI();
    java.lang.String var44 = var38.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var47 = new nu.staldal.xtree.Element("hi!", "hi!");
    var47.addNamespaceMapping("", "");
    var38.addChild((nu.staldal.xtree.Node)var47);
    java.lang.String var53 = var47.getAttrValueOrNull("");
    nu.staldal.xtree.Element var56 = new nu.staldal.xtree.Element("hi!", "hi!");
    var56.setSystemId("");
    java.net.URL var59 = var56.getBaseURI();
    java.lang.String var62 = var56.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var65 = new nu.staldal.xtree.Element("hi!", "hi!");
    var65.addNamespaceMapping("", "");
    var56.addChild((nu.staldal.xtree.Node)var65);
    var56.setSystemId("");
    nu.staldal.xtree.Element var74 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var75 = var74.getLineNumber();
    var74.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var81 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var82 = var81.getLineNumber();
    var81.addNamespaceMapping("", "");
    var74.addChild((nu.staldal.xtree.Node)var81);
    var56.insertChild((nu.staldal.xtree.Node)var74, 0);
    var47.addChild((nu.staldal.xtree.Node)var56);
    var56.setLine((-1));
    int var92 = var56.getLineNumber();
    var19.setDocumentLocator((org.xml.sax.Locator)var56);
    nu.staldal.xtree.Element var94 = var56.getFirstChildElementOrNull();
    nu.staldal.xtree.NodeWithChildren var95 = var56.getParent();
    var5.setDocumentLocator((org.xml.sax.Locator)var95);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var95);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test355");


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
    var0.endDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test356");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test357");


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
    var22.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.ftp.FTPException~                                                                                                     ");
    
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

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test358");


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
    nu.staldal.xmlutil.ContentHandlerFixer var33 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var0.skippedEntity("nu.staldal.lagoon.core.AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test359");


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
    java.util.Enumeration var25 = var8.getParamNames();
    nu.staldal.xmlutil.ContentHandlerAdapter var26 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    var1.toSAX((org.xml.sax.ContentHandler)var8);
    
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
    assertNotNull(var25);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test360");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException");
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    var10.skippedEntity("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test361");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    int var4 = var0.getPosition();
    java.lang.String var5 = var0.getEntryName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test362");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException~~ nu____46____staldal____46____lagoon____46____core____46____LagoonException____58________32____4444444444");
    java.lang.String var4 = var1.getInheritedAttribute("nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", "nu.staldal.lagoon.core.LagoonException~~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test363");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.AuthenticationMissingException", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationException", 2, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var6 = var4.getAttributeLocalName(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test364");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    java.util.Enumeration var1 = var0.getParamNames();
    java.util.Enumeration var2 = var0.getParamNames();
    java.lang.String var3 = var0.getEntryName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test365");


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
    nu.staldal.xtree.Element var59 = var8.getTree();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var61 = var59.getChild(2);
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
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test366");


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
    var5.startPrefixMapping("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.core.LagoonException~~                                                                                                     ", "nu.staldal.lagoon.util.TemplateException: hi_33_");
    
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

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test367");


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
    var4.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerAdapter var32 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test368");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_");
    java.lang.Exception var2 = var1.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test369");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__util__46__TemplateException", "nu.staldal.ftp.FTPException~ hi!", 2, (-1));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test370");


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

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test371");


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
    java.lang.String var27 = var5.getInheritedAttribute("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException");
    java.lang.String var30 = var5.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
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
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test372");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test373");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    org.apache.tools.ant.Project var9 = var0.getProject();
    org.apache.tools.ant.Project var10 = var0.getProject();
    org.apache.tools.ant.RuntimeConfigurable var11 = var0.getRuntimeConfigurableWrapper();
    java.lang.String var12 = var0.getTaskType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test374");


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
    java.lang.String var33 = var8.getTaskType();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test375");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_", "nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_"+ "'", var2.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_"));

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test376");


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
    var15.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    
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

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test377");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("##########");
    java.lang.Exception var2 = var1.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test378");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    org.apache.tools.ant.Target var6 = var1.getOwningTarget();
    var1.log("hi!", 1);
    var1.log("nu.staldal.lagoon.core.LagoonException~ ", 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test379");


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
    var18.processingInstruction("nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.core.AuthenticationMissingException");
    var18.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test380");


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
    var0.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    var0.endElement("                                                                                                    ", "__52__", "nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ ");
    var0.afterBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test381");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var73 = var28.getTextContent();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
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

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test382");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    var2.addAttribute("", "hi!", "", "hi!");
    java.lang.String var12 = var2.getInheritedAttribute("hi!", "4444444444");
    nu.staldal.xtree.NodeWithChildren var13 = var2.getParent();
    java.lang.String var16 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException~ ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var18 = var2.getAttributeLocalName(2);
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test383");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    var9.addNamespaceMapping("", "4444444444");
    java.lang.String var16 = var9.getTextContent();
    var2.insertChild((nu.staldal.xtree.Node)var9, 0);
    boolean var19 = var9.getPreserveSpace();
    java.lang.String var20 = var9.getTextContentOrNull();
    java.net.URL var21 = var9.getBaseURI();
    int var22 = var9.numberOfAttributes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var24 = var9.getAttrValue("_32_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test384");


    nu.staldal.lagoon.filestorage.FTPFileStorage var0 = new nu.staldal.lagoon.filestorage.FTPFileStorage();
    boolean var1 = var0.isReentrant();
    boolean var2 = var0.isReentrant();
    boolean var3 = var0.isReentrant();
    boolean var4 = var0.needPassword();
    boolean var5 = var0.needPassword();
    boolean var6 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test385");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    var2.setColumn((-1));
    java.net.URL var12 = var2.getBaseURI();
    int var13 = var2.numberOfNamespaceMappings();
    java.lang.String var14 = var2.getTextContentOrNull();
    var2.setSystemId("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    nu.staldal.lagoon.producer.BasicSplit var17 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var19 = new nu.staldal.xtree.Text("hi!");
    char[] var20 = var19.asCharArray();
    var17.characters(var20, 1, 10);
    var17.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var17.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var2.outputStartElement((org.xml.sax.ContentHandler)var17);
    var17.startDocument();
    var17.endElement(" ", "nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var34 = var17.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
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
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test386");


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
    var0.skippedEntity("hi__33__");
    var0.skippedEntity("");
    nu.staldal.xmlutil.ContentHandlerFixer var30 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, false);
    java.util.Enumeration var31 = var0.getParamNames();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test387");


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
    var23.log("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~                                                                                                     ", 1);
    
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

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test388");


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
    var16.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var30 = new nu.staldal.xtree.Text("");
    char[] var31 = var30.asCharArray();
    char[] var32 = var30.asCharArray();
    char[] var33 = var30.asCharArray();
    var16.characters(var33, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var37 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var16);
    nu.staldal.xmlutil.DocumentHandlerAdapter var38 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var37);
    nu.staldal.xtree.Element var41 = new nu.staldal.xtree.Element("hi!", "hi!");
    var41.setSystemId("");
    java.net.URL var44 = var41.getBaseURI();
    java.lang.String var47 = var41.getAttrValueOrNull("", "");
    var38.setDocumentLocator((org.xml.sax.Locator)var41);
    var38.startDocument();
    char[] var50 = new char[] { };
    var38.characters(var50, 100, (-1));
    var38.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var55 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var38);
    var38.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var38.endPrefixMapping("");
    var38.endPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
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
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test389");


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
    nu.staldal.xmlutil.ContentHandlerFixer var52 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var22, false, true);
    var52.startDocument();
    var52.startDocument();
    var52.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerAdapter var58 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var52);
    var58.processingInstruction("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    
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

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test390");


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
    int var59 = var20.numberOfNamespaceMappings();
    java.lang.String var60 = var20.getPublicId();
    nu.staldal.xtree.Element var63 = var20.getFirstChildElementOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_", "");
    
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
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test391");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.close();
    long var7 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.OutputHandler var9 = var0.createFile("");
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1433461967000L);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test392");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    var2.setColumn(1);
    var2.setSystemId("nu.staldal.lagoon.util.TemplateException~ nu.staldal.ftp.FTPException~ hi!");
    java.lang.String var7 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "4444444444"+ "'", var7.equals("4444444444"));

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test393");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.endElement("hi!", "                                                                                                    ", "nu.staldal.lagoon.core.LagoonException~~ ");
    nu.staldal.xmlutil.ContentHandlerFixer var16 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    nu.staldal.xmlutil.ContentHandlerFixer var18 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test394");


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
    java.lang.String var42 = var20.getDescription();
    nu.staldal.lagoon.LagoonAntTask var43 = new nu.staldal.lagoon.LagoonAntTask();
    var43.setPassword("");
    java.lang.String var46 = var43.getDescription();
    org.apache.tools.ant.RuntimeConfigurable var47 = var43.getRuntimeConfigurableWrapper();
    var20.setRuntimeConfigurableWrapper(var47);
    var20.setTargetURL("a");
    
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
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test395");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.util.TemplateException: ", (-1));
    java.lang.String var5 = var3.getAttrValueOrNull("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var7 = var3.removeChild(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test396");


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
    var2.addNamespaceMapping("          ", "nu_46_staldal_46_ftp_46_FTPException_58__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
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

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test397");


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
    var22.skippedEntity("nu.staldal.ftp.FTPException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    var22.endPrefixMapping("nu.staldal.lagoon.util.TemplateException: aa");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test398");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    java.lang.String var12 = var4.getAttributeLocalName((-1));
    java.net.URL var13 = var4.getBaseURI();
    java.lang.String var14 = var4.getNamespaceURI();
    java.lang.String var16 = var4.getAttributeType((-1));
    
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

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test399");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.ftp.FTPException~~~~ hi!");
    java.lang.String var2 = var1.getValue();
    var1.setSystemId("nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.ftp.FTPException~~~~ hi!"+ "'", var2.equals("nu.staldal.ftp.FTPException~~~~ hi!"));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test400");


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
    nu.staldal.lagoon.producer.BasicSplit var21 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("hi!");
    char[] var24 = var23.asCharArray();
    var21.characters(var24, 1, 10);
    var21.endElement("", "hi!", "hi!");
    var21.processingInstruction("", "hi!");
    var21.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.util.Enumeration var38 = var21.getParamNames();
    nu.staldal.xmlutil.ContentHandlerAdapter var39 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var21);
    var39.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var41 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var39);
    nu.staldal.xtree.Text var43 = new nu.staldal.xtree.Text("");
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
    nu.staldal.xmlutil.ContentHandlerAdapter var65 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var44);
    nu.staldal.xmlutil.DocumentHandlerAdapter var66 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var65);
    nu.staldal.xtree.Element var69 = new nu.staldal.xtree.Element("hi!", "hi!");
    var69.setSystemId("");
    java.net.URL var72 = var69.getBaseURI();
    java.lang.String var75 = var69.getAttrValueOrNull("", "");
    var66.setDocumentLocator((org.xml.sax.Locator)var69);
    var66.startDocument();
    char[] var78 = new char[] { };
    var66.characters(var78, 100, (-1));
    var66.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var83 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var66);
    var66.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var43.toSAX((org.xml.sax.ContentHandler)var66);
    char[] var87 = var43.asCharArray();
    var41.characters(var87, 1, 0);
    var20.ignorableWhitespace(var87, 0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test401");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    var0.skippedEntity("4444444444");
    var0.endElement("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    nu.staldal.xmlutil.ContentHandlerFixer var26 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test402");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.lagoon.util.TemplateException: nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test403");


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
    boolean var58 = var55.getPreserveSpace();
    int var59 = var55.getColumnNumber();
    boolean var60 = var55.isWhitespaceNode();
    
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
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test404");


    char[] var2 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text(var2, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var7 = new nu.staldal.xtree.TreeBuilder();
    var7.endPrefixMapping("hi!");
    var7.endDocument();
    var7.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var6.toSAX((org.xml.sax.ContentHandler)var7);
    var7.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var7.skippedEntity("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var7.endDocument();
    var7.endPrefixMapping("hi!");
    var7.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.endElement("nu__46__staldal__46__lagoon__46__util__46__TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:                                                                                                     ");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test405");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 1);
    var3.setPublicId("nu.staldal.lagoon.core.LagoonException: ");
    int var6 = var3.numberOfChildren();
    int var9 = var3.lookupAttribute("4", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    var3.addNamespaceMapping("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var14 = var3.removeChild(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test406");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("hi_33_");
    var0.destroy();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.hasBeenUpdated(0L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test407");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    int var8 = var4.lookupAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var10 = var4.lookupNamespaceURI("4444444444");
    java.lang.String var12 = var4.lookupNamespacePrefix("4444444444");
    java.lang.String var15 = var4.getAttrValueOrNull("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var16 = var4.getTextContentOrNull();
    boolean var17 = var4.isWhitespaceNode();
    
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
    assertTrue(var17 == false);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test408");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Text var18 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var19 = var18.getValue();
    char[] var20 = var18.asCharArray();
    var0.characters(var20, 10, (-1));
    var0.endElement("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.AuthenticationMissingException");
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test409");


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
    var0.setTaskName("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    var0.setTaskName("nu.staldal.lagoon.util.TemplateException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test410");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var1.setLine(1);
    java.lang.String var6 = var1.getInheritedAttribute("4444444444", "hi!");
    char[] var7 = var1.asCharArray();
    boolean var8 = var1.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test411");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test412");


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
    java.lang.String var32 = var8.getDescription();
    java.lang.String var33 = var8.getTaskName();
    var8.maybeConfigure();
    var8.log("nu__46__staldal__46__lagoon__46__util__46__TemplateException");
    var8.reconfigure();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test413");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    nu.staldal.lagoon.core.OutputHandler var8 = var0.createFile("4444444444");
    long var10 = var0.fileLastModified("hi!");
    var0.close();
    boolean var12 = var0.isReentrant();
    var0.deleteFile("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    boolean var15 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461998000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test414");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.setTaskType("hi!");
    java.lang.String var8 = var1.getTaskType();
    var1.init();
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var14 = new nu.staldal.ftp.FTPException("hi!");
    var11.log("", (java.lang.Throwable)var14, 10);
    org.apache.tools.ant.Location var17 = var11.getLocation();
    nu.staldal.lagoon.core.LagoonException var20 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var11.log("4444444444", (java.lang.Throwable)var20, 100);
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.toString();
    java.lang.String var25 = var20.toString();
    java.lang.Throwable[] var26 = var20.getSuppressed();
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var28 = new nu.staldal.lagoon.LagoonAntTask();
    var27.bindToOwner((org.apache.tools.ant.Task)var28);
    nu.staldal.lagoon.LagoonAntTask var31 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var34 = new nu.staldal.ftp.FTPException("hi!");
    var31.log("", (java.lang.Throwable)var34, 10);
    org.apache.tools.ant.Location var37 = var31.getLocation();
    nu.staldal.lagoon.core.LagoonException var40 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var31.log("4444444444", (java.lang.Throwable)var40, 100);
    java.lang.String var43 = var40.toString();
    nu.staldal.lagoon.LagoonAntTask var44 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var47 = new nu.staldal.ftp.FTPException("hi!");
    var44.log("", (java.lang.Throwable)var47, 10);
    org.apache.tools.ant.Project var50 = var44.getProject();
    nu.staldal.lagoon.util.TemplateException var52 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var53 = var52.getException();
    var44.log("", (java.lang.Throwable)var52, (-1));
    java.lang.Throwable[] var56 = var52.getSuppressed();
    java.lang.Throwable[] var57 = var52.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var59 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var60 = var59.toString();
    var52.addSuppressed((java.lang.Throwable)var59);
    var40.addSuppressed((java.lang.Throwable)var59);
    var27.log("4444444444", (java.lang.Throwable)var59, (-1));
    var20.addSuppressed((java.lang.Throwable)var59);
    java.lang.Throwable[] var66 = var20.getSuppressed();
    var1.log("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:                                                                                                     ", (java.lang.Throwable)var20, 2);
    java.lang.String var69 = var1.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var23.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var24.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var25.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var43.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var60.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test415");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.core.LagoonException: nu.staldal.ftp.FTPException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.core.LagoonException~ nu.staldal.ftp.FTPException~                                                                                                     "+ "'", var1.equals("nu.staldal.lagoon.core.LagoonException~ nu.staldal.ftp.FTPException~                                                                                                     "));

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test416");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var8 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var0.startDocument();
    nu.staldal.xmlutil.ContentHandlerFixer var11 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test417");


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
    java.lang.String var22 = var19.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    java.lang.String var24 = var19.lookupNamespacePrefix("nu.staldal.ftp.FTPException: hi!");
    java.lang.String var25 = var19.getTextContentOrNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test418");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    var2.addAttribute("hi!", "hi!", "hi!", "");
    java.lang.String var25 = var2.getAttrValueOrNull("          ", "");
    int var28 = var2.lookupAttribute("nu.staldal.lagoon.util.TemplateException: hi_33_", "nu.staldal.ftp.FTPException~~~~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test419");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    nu.staldal.lagoon.core.LagoonContext var4 = var0.getContext();
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
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test420");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, true);
    char[] var11 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var15 = new nu.staldal.xtree.Text(var11, 1, 0, false);
    java.lang.String var16 = var15.getPublicId();
    java.lang.String var17 = var15.getValue();
    char[] var20 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var24 = new nu.staldal.xtree.Text(var20, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var25 = new nu.staldal.xtree.TreeBuilder();
    var25.endPrefixMapping("hi!");
    var25.endDocument();
    var25.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var24.toSAX((org.xml.sax.ContentHandler)var25);
    var25.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var15.toSAX((org.xml.sax.ContentHandler)var25);
    java.lang.String var37 = var15.getValue();
    var15.setColumn(10);
    boolean var40 = var15.getPreserveSpace();
    nu.staldal.lagoon.producer.BasicSplit var41 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var43 = new nu.staldal.xtree.Text("hi!");
    char[] var44 = var43.asCharArray();
    var41.characters(var44, 1, 10);
    var41.endElement("", "hi!", "hi!");
    var41.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var54 = new nu.staldal.lagoon.producer.IslandSplit();
    var54.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var57 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var54, true);
    char[] var60 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var64 = new nu.staldal.xtree.Text(var60, 1, 0, false);
    var57.setDocumentLocator((org.xml.sax.Locator)var64);
    char[] var66 = var64.asCharArray();
    var41.characters(var66, 10, 0);
    var41.processingInstruction("hi!", "hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var73 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var41);
    nu.staldal.xtree.Text var75 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var76 = var75.getValue();
    char[] var77 = var75.asCharArray();
    var41.ignorableWhitespace(var77, 100, 2);
    var15.toSAX((org.xml.sax.ContentHandler)var41);
    var5.setDocumentLocator((org.xml.sax.Locator)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + ""+ "'", var37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "hi!"+ "'", var76.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test421");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var65 = var52.getAttrValue("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
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
    assertTrue("'" + var61 + "' != '" + "hi!"+ "'", var61.equals("hi!"));

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test422");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    nu.staldal.lagoon.core.LagoonContext var1 = var0.getContext();
    var0.init();
    java.lang.String var3 = var0.getEntryName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.hasBeenUpdated(1433461941000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test423");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setTaskType("nu.staldal.lagoon.util.TemplateException");
    java.lang.String var10 = var0.getTaskName();
    var0.setTargetURL("nu.staldal.lagoon.util.TemplateException~ nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    var0.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test424");


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
    var0.skippedEntity("");
    java.lang.String var25 = var0.getParam("");
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "", 1, 0);
    var0.setDocumentLocator((org.xml.sax.Locator)var30);
    nu.staldal.lagoon.producer.BasicSplit var32 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var34 = new nu.staldal.xtree.Text("hi!");
    char[] var35 = var34.asCharArray();
    var32.characters(var35, 1, 10);
    var32.endElement("", "hi!", "hi!");
    var32.processingInstruction("", "hi!");
    var32.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var32.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var50 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var32);
    var50.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.Text var55 = new nu.staldal.xtree.Text("");
    char[] var56 = var55.asCharArray();
    boolean var57 = var55.isWhitespaceNode();
    char[] var58 = var55.asCharArray();
    var50.setDocumentLocator((org.xml.sax.Locator)var55);
    int var60 = var55.getColumnNumber();
    var55.setSystemId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    char[] var63 = var55.asCharArray();
    var0.ignorableWhitespace(var63, 0, 10);
    java.lang.String var68 = var0.getParam("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test425");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    boolean var2 = var0.hasBeenUpdated(1L);
    var0.afterBuild();
    var0.afterBuild();
    nu.staldal.lagoon.core.LagoonContext var5 = var0.getContext();
    java.lang.String var7 = var0.getParam("nu____46____staldal____46____lagoon____46____core____46____AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test426");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var34.processingInstruction("nu.staldal.lagoon.core.LagoonException~~ ", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: hi_33_");
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

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test427");


    char[] var2 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var6 = new nu.staldal.xtree.Text(var2, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var7 = new nu.staldal.xtree.TreeBuilder();
    var7.endPrefixMapping("hi!");
    var7.endDocument();
    var7.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var6.toSAX((org.xml.sax.ContentHandler)var7);
    boolean var15 = var6.isWhitespaceNode();
    char[] var16 = var6.asCharArray();
    boolean var17 = var6.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test428");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.startPrefixMapping("                                                                                                    ", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var12 = var11.getLineNumber();
    java.lang.String var13 = var11.getSystemId();
    nu.staldal.xtree.TreeBuilder var14 = new nu.staldal.xtree.TreeBuilder();
    var14.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var19 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var14, false, false);
    var11.toSAX((org.xml.sax.ContentHandler)var14);
    var14.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var14.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    nu.staldal.xtree.Element var28 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var29 = var28.getLineNumber();
    var28.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var35 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var36 = var35.getLineNumber();
    var35.addNamespaceMapping("", "");
    var28.addChild((nu.staldal.xtree.Node)var35);
    nu.staldal.xtree.NodeWithChildren var41 = var28.getParent();
    nu.staldal.xtree.Element var44 = var28.getFirstChildElementOrNull("hi!", "4444444444");
    int var45 = var28.numberOfNamespaceMappings();
    int var46 = var28.numberOfNamespaceMappings();
    nu.staldal.xtree.Element var47 = var28.getFirstChildElementOrNull();
    var14.setDocumentLocator((org.xml.sax.Locator)var47);
    nu.staldal.xtree.Element var49 = var14.getTree();
    nu.staldal.xtree.Element var50 = var14.getTree();
    nu.staldal.xtree.Element var55 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var58 = var55.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var59 = new nu.staldal.xtree.TreeBuilder();
    var55.toSAX((org.xml.sax.ContentHandler)var59);
    var59.skippedEntity("hi!");
    var59.skippedEntity("hi!");
    nu.staldal.xtree.Element var67 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var59.setDocumentLocator((org.xml.sax.Locator)var67);
    var59.startDocument();
    nu.staldal.xtree.Element var70 = var59.getTree();
    nu.staldal.xmlutil.ContentHandlerAdapter var71 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var59);
    var59.endDocument();
    nu.staldal.xtree.TreeBuilder var73 = new nu.staldal.xtree.TreeBuilder();
    var73.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var78 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var73, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var81 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var78, false, true);
    nu.staldal.xtree.Text var83 = new nu.staldal.xtree.Text("4444444444");
    int var84 = var83.getColumnNumber();
    var78.setDocumentLocator((org.xml.sax.Locator)var83);
    char[] var86 = var83.asCharArray();
    var59.ignorableWhitespace(var86, 1, (-1));
    var14.ignorableWhitespace(var86, 2, 1);
    var0.ignorableWhitespace(var86, 0, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test429");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient(" ", 10, "nu.staldal.lagoon.core.LagoonException~~~~ nu.staldal.lagoon.util.TemplateException", "#", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__util__46__TemplateException__58____32__");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test430");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    int var16 = var11.getColumnNumber();
    java.lang.String var18 = var11.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var19 = var11.getLocalName();
    java.lang.String var20 = var11.getTextContentOrNull();
    nu.staldal.lagoon.producer.BasicSplit var21 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("hi!");
    char[] var24 = var23.asCharArray();
    var21.characters(var24, 1, 10);
    var21.startDocument();
    nu.staldal.xtree.ProcessingInstruction var31 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var32 = var31.getPublicId();
    java.lang.String var35 = var31.getInheritedAttribute("", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var21.setDocumentLocator((org.xml.sax.Locator)var31);
    var11.addChild((nu.staldal.xtree.Node)var31);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var39 = var11.getAttributeValue(10);
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test431");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_hi____33____", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", 100);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test432");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.setPublicId("");
    int var9 = var5.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var5);
    var0.startDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.core.LagoonException~ 4444444444");
    char[] var17 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var21 = new nu.staldal.xtree.Text(var17, 1, 0, false);
    java.lang.String var22 = var21.getPublicId();
    java.lang.String var23 = var21.getValue();
    char[] var26 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var30 = new nu.staldal.xtree.Text(var26, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var31 = new nu.staldal.xtree.TreeBuilder();
    var31.endPrefixMapping("hi!");
    var31.endDocument();
    var31.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var30.toSAX((org.xml.sax.ContentHandler)var31);
    var31.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var21.toSAX((org.xml.sax.ContentHandler)var31);
    java.lang.String var43 = var21.getValue();
    var21.setColumn(10);
    boolean var46 = var21.getPreserveSpace();
    char[] var47 = var21.asCharArray();
    var0.ignorableWhitespace(var47, 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + ""+ "'", var43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test433");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("_32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test434");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.processingInstruction("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test435");


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
    var22.setLine(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test436");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, true);
    var8.skippedEntity("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    nu.staldal.xmlutil.ContentHandlerFixer var12 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8, false);
    nu.staldal.xtree.TreeBuilder var13 = new nu.staldal.xtree.TreeBuilder();
    var13.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var18 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var13, false, false);
    var13.startPrefixMapping("                                                                                                    ", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("");
    char[] var24 = var23.asCharArray();
    boolean var25 = var23.isWhitespaceNode();
    char[] var26 = var23.asCharArray();
    boolean var27 = var23.getPreserveSpace();
    char[] var28 = var23.asCharArray();
    var13.ignorableWhitespace(var28, 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.characters(var28, (-1), 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test437");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    int var13 = var4.lookupAttribute("", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String var15 = var4.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var18 = var4.lookupAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test438");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~~ ");
    long var10 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var0.close();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    boolean var14 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test439");


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
    nu.staldal.xmlutil.ContentHandlerFixer var28 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var23, true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test440");


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
    var0.log("nu.staldal.lagoon.util.TemplateException: ");
    org.apache.tools.ant.Target var33 = var0.getOwningTarget();
    var0.setDescription("nu.staldal.lagoon.util.TemplateException~~ ");
    java.lang.Object var36 = var0.clone();
    org.apache.tools.ant.Target var37 = var0.getOwningTarget();
    
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
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test441");


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
    java.lang.Object var89 = var0.clone();
    
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

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test442");


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
    int var27 = var11.lookupAttribute("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var30 = var11.getAttrValue("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException: hi_33_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test443");


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
    org.apache.tools.ant.RuntimeConfigurable var44 = var9.getRuntimeConfigurableWrapper();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test444");


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
    var0.reconfigure();
    org.apache.tools.ant.Project var60 = var0.getProject();
    
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
    assertNull(var60);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test445");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", 1, 0);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var13 = new nu.staldal.xtree.TreeBuilder();
    var9.toSAX((org.xml.sax.ContentHandler)var13);
    var13.skippedEntity("hi!");
    var13.skippedEntity("hi!");
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var13.setDocumentLocator((org.xml.sax.Locator)var21);
    var13.startDocument();
    nu.staldal.xtree.Element var24 = var13.getTree();
    var13.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~ ");
    var13.endPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    var13.endDocument();
    var13.endDocument();
    nu.staldal.xtree.Element var34 = new nu.staldal.xtree.Element("hi!", "hi!");
    var34.setSystemId("");
    java.net.URL var37 = var34.getBaseURI();
    java.lang.String var40 = var34.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var43 = new nu.staldal.xtree.Element("hi!", "hi!");
    var43.addNamespaceMapping("", "");
    var34.addChild((nu.staldal.xtree.Node)var43);
    int var48 = var43.getColumnNumber();
    java.net.URL var49 = var43.getBaseURI();
    int var50 = var43.numberOfNamespaceMappings();
    var13.setDocumentLocator((org.xml.sax.Locator)var43);
    int var52 = var43.numberOfChildren();
    var4.addChild((nu.staldal.xtree.Node)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test446");


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
    var0.setPassword("nu_46_staldal_46_ftp_46_FTPException_126__126__126__126__32_hi_33_");
    nu.staldal.lagoon.LagoonAntTask var19 = new nu.staldal.lagoon.LagoonAntTask();
    var19.setPassword("");
    var19.setForce(false);
    org.apache.tools.ant.Target var24 = var19.getOwningTarget();
    var19.maybeConfigure();
    var19.log("nu.staldal.lagoon.core.LagoonException: 4444444444");
    org.apache.tools.ant.Location var28 = var19.getLocation();
    var0.setLocation(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test447");


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

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test448");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_"+ "'", var2.equals("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_"));

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test449");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.lang.String var6 = var3.getSystemId();
    int var7 = var3.getColumnNumber();
    java.lang.String var9 = var3.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.NodeWithChildren var10 = var3.getParent();
    java.lang.String var12 = var3.getAttributeNamespaceURI((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var14 = var3.removeChild(10);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test450");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    java.lang.String var2 = var0.getParam("4444444444");
    var0.afterBuild();
    var0.beforeBuild();
    var0.afterBuild();
    boolean var7 = var0.hasBeenUpdated((-1L));
    var0.destroy();
    boolean var10 = var0.hasBeenUpdated(1433461967000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test451");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    nu.staldal.lagoon.core.ByteStreamProducer var1 = var0.getNext();
    var0.init();
    var0.init();
    var0.init();
    var0.beforeBuild();
    var0.afterBuild();
    int var7 = var0.getPosition();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test452");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException(".");

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test453");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    java.lang.String var4 = var3.getLocalName();
    java.lang.String var6 = var3.getAttrValueOrNull("4444444444");
    var3.addAttribute("          ", "                                                                                                    ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "hi!");
    java.lang.String var13 = var3.getAttributeValue((-1));
    var3.addAttribute("                                                                                                    ", "nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var21 = var3.getAttrValueOrNull("nu.staldal.ftp.FTPException: 4", "nu.staldal.ftp.FTPException:  ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test454");


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
    java.lang.Object var19 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test455");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test456");


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
    boolean var12 = var0.needPassword();
    
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
    assertTrue(var12 == true);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test457");


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
    int var21 = var2.numberOfNamespaceMappings();
    java.lang.String var23 = var2.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_");
    boolean var24 = var2.getPreserveSpace();
    int var25 = var2.numberOfAttributes();
    
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
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test458");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_126__32_", 1, 0);
    java.net.URL var5 = var4.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test459");


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
    nu.staldal.lagoon.LagoonAntTask var29 = new nu.staldal.lagoon.LagoonAntTask();
    var28.bindToOwner((org.apache.tools.ant.Task)var29);
    var29.log("hi!");
    java.lang.String var33 = var29.getTaskName();
    var29.init();
    nu.staldal.lagoon.LagoonAntTask var36 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var39 = new nu.staldal.ftp.FTPException("hi!");
    var36.log("", (java.lang.Throwable)var39, 10);
    var29.log("hi!", (java.lang.Throwable)var39, 0);
    org.apache.tools.ant.Project var44 = var29.getProject();
    var29.setTaskName("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var10.bindToOwner((org.apache.tools.ant.Task)var29);
    java.lang.String var48 = var10.getTaskName();
    org.apache.tools.ant.Project var49 = var10.getProject();
    
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
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var48.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test460");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    var2.setSystemId("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var12 = var2.getAttrValue("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.util.TemplateException: nu____46____staldal____46____lagoon____46____core____46____LagoonException____126________126________32____");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test461");


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
    var0.endElement("nu.staldal.ftp.FTPException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", ".", "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    nu.staldal.xtree.ProcessingInstruction var35 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "44");
    var0.setDocumentLocator((org.xml.sax.Locator)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test462");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    var0.beforeBuild();
    java.lang.String var2 = var0.getEntryName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.hasBeenUpdated(1433461943000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test463");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_util_46_TemplateException");

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test464");


    nu.staldal.lagoon.filestorage.SSHFileStorage var0 = new nu.staldal.lagoon.filestorage.SSHFileStorage();
    boolean var1 = var0.isReentrant();
    boolean var2 = var0.needPassword();
    boolean var3 = var0.needPassword();
    boolean var4 = var0.needPassword();
    boolean var5 = var0.isReentrant();
    boolean var6 = var0.isReentrant();
    boolean var7 = var0.needPassword();
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
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test465");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var1.setLine(1);
    java.lang.String var6 = var1.getInheritedAttribute("4444444444", "hi!");
    java.lang.String var7 = var1.getSystemId();
    var1.setColumn(10);
    java.lang.String var11 = var1.lookupNamespacePrefix("_32__32__32__32__32__32__32__32__32__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test466");


    nu.staldal.lagoon.producer.LSPTransformer var0 = new nu.staldal.lagoon.producer.LSPTransformer();
    boolean var2 = var0.hasBeenUpdated(1L);
    var0.beforeBuild();
    boolean var5 = var0.hasBeenUpdated(0L);
    boolean var7 = var0.hasBeenUpdated(1433461944000L);
    boolean var9 = var0.hasBeenUpdated(1433461968000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test467");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.endDocument();
    var8.startDocument();
    var8.startPrefixMapping("4444444444", "4444444444");
    nu.staldal.xtree.Element var15 = var8.getTree();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test468");


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
    var51.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", "nu.staldal.lagoon.util.TemplateException");
    var51.startDocument();
    
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

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test469");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var27 = var23.getAttributeValue(10);
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

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test470");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    var0.destroy();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated(1433461955000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test471");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("nu_46_staldal_46_lagoon_46_core_46_AuthenticationException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test472");


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
    nu.staldal.xtree.Element var45 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var46 = var45.getLineNumber();
    var45.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var52 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var53 = var52.getLineNumber();
    var52.addNamespaceMapping("", "");
    var45.addChild((nu.staldal.xtree.Node)var52);
    nu.staldal.xtree.NodeWithChildren var58 = var45.getParent();
    boolean var59 = var45.getPreserveSpace();
    boolean var60 = var45.getPreserveSpace();
    java.lang.String var63 = var45.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    boolean var64 = var45.isWhitespaceNode();
    int var65 = var45.getLineNumber();
    var45.setSystemId("####################################################################################################");
    boolean var68 = var45.getPreserveSpace();
    var36.setDocumentLocator((org.xml.sax.Locator)var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test473");


    nu.staldal.lagoon.producer.FOPFormatter var0 = new nu.staldal.lagoon.producer.FOPFormatter();
    java.lang.String var1 = var0.getEntryName();
    int var2 = var0.getPosition();
    int var3 = var0.getPosition();
    var0.afterBuild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var5 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test474");


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
    var32.endPrefixMapping("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    var32.startDocument();
    var32.processingInstruction("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test475");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", (-1), 1);
    java.lang.String var7 = var4.getInheritedAttribute("####################################################################################################", "__35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35____35__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test476");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", (-1));
    java.lang.String var6 = var3.getAttrValueOrNull("", "nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test477");


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
    boolean var70 = var1.isWhitespaceNode();
    
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
    assertTrue(var70 == false);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test478");


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
    nu.staldal.lagoon.LagoonAntTask var38 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var39 = new nu.staldal.lagoon.LagoonAntTask();
    var38.bindToOwner((org.apache.tools.ant.Task)var39);
    var38.setForce(true);
    java.lang.String var43 = var38.getTaskName();
    var38.setTaskType("4444444444");
    nu.staldal.lagoon.LagoonAntTask var46 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var47 = new nu.staldal.lagoon.LagoonAntTask();
    var46.bindToOwner((org.apache.tools.ant.Task)var47);
    nu.staldal.lagoon.LagoonAntTask var49 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var52 = new nu.staldal.ftp.FTPException("hi!");
    var49.log("", (java.lang.Throwable)var52, 10);
    org.apache.tools.ant.Location var55 = var49.getLocation();
    var46.setLocation(var55);
    nu.staldal.lagoon.LagoonAntTask var57 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var58 = new nu.staldal.lagoon.LagoonAntTask();
    var57.bindToOwner((org.apache.tools.ant.Task)var58);
    var57.setForce(true);
    java.lang.String var62 = var57.getTaskName();
    var57.setTaskType("4444444444");
    var57.maybeConfigure();
    var46.bindToOwner((org.apache.tools.ant.Task)var57);
    var38.bindToOwner((org.apache.tools.ant.Task)var57);
    org.apache.tools.ant.Location var68 = var38.getLocation();
    java.lang.String var69 = var38.getTaskType();
    java.lang.String var70 = var38.getDescription();
    org.apache.tools.ant.Location var71 = var38.getLocation();
    var38.log("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", (-1));
    nu.staldal.lagoon.LagoonAntTask var75 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var76 = var75.getDescription();
    java.lang.String var77 = var75.getDescription();
    nu.staldal.lagoon.LagoonAntTask var78 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var79 = new nu.staldal.lagoon.LagoonAntTask();
    var78.bindToOwner((org.apache.tools.ant.Task)var79);
    var78.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var83 = new nu.staldal.lagoon.LagoonAntTask();
    var83.setPassword("");
    var78.bindToOwner((org.apache.tools.ant.Task)var83);
    org.apache.tools.ant.Project var87 = var78.getProject();
    org.apache.tools.ant.Project var88 = var78.getProject();
    org.apache.tools.ant.RuntimeConfigurable var89 = var78.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Location var90 = var78.getLocation();
    var75.setLocation(var90);
    var38.setLocation(var90);
    var0.setLocation(var90);
    var0.setTargetURL("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
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
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "4444444444"+ "'", var69.equals("4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var87);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test479");


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
    int var76 = var64.numberOfAttributes();
    nu.staldal.xtree.Element var79 = var64.getFirstChildElementOrNull("nu.staldal.ftp.FTPException: hi!", "nu.staldal.ftp.FTPException:                                                                                                     ");
    var64.setLine(2);
    nu.staldal.xtree.Element var82 = var64.getFirstChildElementOrNull();
    
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
    assertTrue(var76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var82);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test480");


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
    var15.endDocument();
    var15.endDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test481");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test482");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.endPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.lagoon.producer.BasicSplit var8 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var10 = new nu.staldal.xtree.Text("hi!");
    char[] var11 = var10.asCharArray();
    var8.characters(var11, 1, 10);
    var8.endElement("", "hi!", "hi!");
    var8.processingInstruction("", "hi!");
    var8.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var8.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var26 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    var26.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var30 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var26);
    nu.staldal.xmlutil.DocumentHandlerAdapter var31 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var26);
    var26.processingInstruction("hi!", "nu.staldal.lagoon.core.LagoonException: 4444444444");
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
    nu.staldal.xtree.Text var69 = new nu.staldal.xtree.Text("");
    char[] var70 = var69.asCharArray();
    char[] var71 = var69.asCharArray();
    var57.characters(var71, 100, 100);
    var26.characters(var71, 0, 10);
    var0.ignorableWhitespace(var71, (-1), 10);
    nu.staldal.xtree.TreeBuilder var81 = new nu.staldal.xtree.TreeBuilder();
    var81.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var86 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var81, false, false);
    nu.staldal.xtree.Text var88 = new nu.staldal.xtree.Text("");
    char[] var89 = var88.asCharArray();
    boolean var90 = var88.isWhitespaceNode();
    char[] var91 = var88.asCharArray();
    var81.ignorableWhitespace(var91, 0, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.characters(var91, 1, 0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
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
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test483");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var5 = var2.lookupAttribute("hi_33_", "hi_33_");
    boolean var6 = var2.getPreserveSpace();
    boolean var7 = var2.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test484");


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
    boolean var20 = var2.isWhitespaceNode();
    int var21 = var2.numberOfChildren();
    java.lang.String var24 = var2.getAttrValueOrNull("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    java.lang.String var26 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    
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
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test485");


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
    nu.staldal.xmlutil.ContentHandlerFixer var95 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8, true, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.endElement("nu.staldal.ftp.FTPException: 4", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__126__32_hi________________________________33________________________________");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
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

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test486");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    long var8 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.core.OutputHandler var10 = var0.createFile("nu.staldal.lagoon.util.TemplateException");
    var0.deleteFile("hi_33_");
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    boolean var15 = var0.isReentrant();
    var0.close();
    long var18 = var0.fileLastModified("4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461998000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1433461998000L);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test487");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    java.util.Enumeration var1 = var0.getParamNames();
    var0.endPrefixMapping("");
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ");
    nu.staldal.lagoon.core.XMLStreamProducer var6 = var0.getNext();
    int var7 = var0.getPosition();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var8 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test488");


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
    java.lang.String var50 = var28.toString();
    java.lang.Exception var51 = var28.getException();
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
    assertTrue("'" + var50 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var50.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var52.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var53.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test489");


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
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("hi!", "hi!");
    var18.setSystemId("");
    java.net.URL var21 = var18.getBaseURI();
    java.lang.String var23 = var18.getAttrValueOrNull("hi_33_");
    java.lang.String var26 = var18.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var27 = var18.getBaseURI();
    int var28 = var18.numberOfChildren();
    java.lang.String var29 = var18.getTextContentOrNull();
    int var32 = var18.lookupAttribute("hi!", "nu.staldal.lagoon.core.AuthenticationMissingException");
    var0.setDocumentLocator((org.xml.sax.Locator)var18);
    int var34 = var18.numberOfAttributes();
    java.net.URL var35 = var18.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test490");


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
    java.lang.String var42 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    java.lang.String var45 = var2.getInheritedAttribute("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var46 = var2.getTextContent();
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
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test491");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    var2.setSystemId("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    nu.staldal.lagoon.producer.BasicSplit var10 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("hi!");
    char[] var13 = var12.asCharArray();
    var10.characters(var13, 1, 10);
    var10.startDocument();
    nu.staldal.xtree.ProcessingInstruction var20 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var21 = var20.getPublicId();
    java.lang.String var24 = var20.getInheritedAttribute("", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var10.setDocumentLocator((org.xml.sax.Locator)var20);
    nu.staldal.lagoon.producer.BasicSplit var26 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var28 = new nu.staldal.xtree.Text("hi!");
    char[] var29 = var28.asCharArray();
    var26.characters(var29, 1, 10);
    var26.endElement("", "hi!", "hi!");
    var26.processingInstruction("", "hi!");
    var26.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var26.startDocument();
    var26.skippedEntity("4444444444");
    java.util.Enumeration var46 = var26.getParamNames();
    int var47 = var26.getPosition();
    var26.startDocument();
    var26.endElement("nu.staldal.lagoon.util.TemplateException", "                                                                                                    ", "                                                                                                    ");
    var20.toSAX((org.xml.sax.ContentHandler)var26);
    var26.destroy();
    var2.outputEndElement((org.xml.sax.ContentHandler)var26);
    int var58 = var2.lookupAttribute("nu.staldal.ftp.FTPException~ hi!", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.ftp.FTPException~                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == (-1));

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test492");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeAttribute(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test493");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.ftp.FTPException: hi!", "nu.staldal.ftp.FTPException~~ hi!", 1);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test494");


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
    java.lang.String var35 = var26.getNamespaceURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var37 = var26.getAttributeNamespaceURI(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test495");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var2 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var0.afterBuild();
    int var4 = var0.getPosition();
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, false);
    var0.destroy();
    var0.afterBuild();
    var0.endPrefixMapping("hi__33__");
    var0.afterBuild();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test496");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.util.TemplateException: nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException"+ "'", var2.equals("nu.staldal.lagoon.util.TemplateException: nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException"));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test497");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", 0);
    java.net.URL var4 = var3.getBaseURI();
    var3.setSystemId("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var7 = var3.getPreserveSpace();
    var3.setPublicId("nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test498");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.init();
    org.apache.tools.ant.Location var7 = var1.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var8 = var1.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Project var9 = var1.getProject();
    java.lang.String var10 = var1.getTaskName();
    java.lang.String var11 = var1.getTaskName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test499");


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
    nu.staldal.xmlutil.ContentHandlerAdapter var20 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    var20.endDocument();
    char[] var24 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var28 = new nu.staldal.xtree.Text(var24, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var29 = new nu.staldal.xtree.TreeBuilder();
    var29.endPrefixMapping("hi!");
    var29.endDocument();
    var29.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var28.toSAX((org.xml.sax.ContentHandler)var29);
    boolean var37 = var28.isWhitespaceNode();
    char[] var38 = var28.asCharArray();
    var20.ignorableWhitespace(var38, 10, 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest11.test500");


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
    nu.staldal.lagoon.LagoonAntTask var25 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var28 = new nu.staldal.ftp.FTPException("hi!");
    var25.log("", (java.lang.Throwable)var28, 10);
    org.apache.tools.ant.Project var31 = var25.getProject();
    nu.staldal.lagoon.util.TemplateException var33 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var34 = var33.getException();
    var25.log("", (java.lang.Throwable)var33, (-1));
    nu.staldal.lagoon.LagoonAntTask var37 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var40 = new nu.staldal.ftp.FTPException("hi!");
    var37.log("", (java.lang.Throwable)var40, 10);
    nu.staldal.lagoon.util.TemplateException var43 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var40);
    nu.staldal.lagoon.util.TemplateException var44 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var40);
    var33.addSuppressed((java.lang.Throwable)var40);
    var18.addSuppressed((java.lang.Throwable)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var21.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

}
