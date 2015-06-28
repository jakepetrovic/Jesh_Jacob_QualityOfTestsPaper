package randoop;

import junit.framework.*;

public class RandoopTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test1");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    var2.addAttribute("", "hi!", "", "hi!");
    var2.setColumn(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var13 = var2.getChild(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test2");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    var2.setColumn((-1));
    java.lang.String var12 = var2.getLocalName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var2.getAttrValue(" ");
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test3");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("hi_33_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.hasBeenUpdated(0L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test4");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test5");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    java.lang.String var12 = var4.getAttributeLocalName((-1));
    java.net.URL var13 = var4.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.removeAttribute(0);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test6");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var8 = new nu.staldal.xtree.Element("hi!", "hi!");
    var8.setSystemId("");
    java.net.URL var11 = var8.getBaseURI();
    java.lang.String var14 = var8.getAttrValueOrNull("", "");
    java.lang.String var15 = var8.getTextContent();
    java.lang.String var16 = var8.getNamespaceURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var18 = var2.replaceChild((nu.staldal.xtree.Node)var8, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test7");


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

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test8");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("hi_33_");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    java.lang.Exception var3 = var1.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test9");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test10");


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
    nu.staldal.xtree.Element var85 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "", 1, 0);
    nu.staldal.xtree.Element var86 = var85.getFirstChildElementOrNull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var88 = var75.replaceChild((nu.staldal.xtree.Node)var85, 2);
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
    assertTrue("'" + var76 + "' != '" + "hi!"+ "'", var76.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var86);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test11");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    var4.setSystemId("hi!");
    int var8 = var4.getLineNumber();
    boolean var9 = var4.isWhitespaceNode();
    java.lang.String var10 = var4.getPublicId();
    nu.staldal.xtree.Element var13 = new nu.staldal.xtree.Element("hi!", "hi!");
    var13.setSystemId("");
    java.net.URL var16 = var13.getBaseURI();
    java.lang.String var19 = var13.getAttrValueOrNull("", "");
    java.lang.String var20 = var13.getTextContent();
    java.lang.String var22 = var13.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("hi!", "hi!");
    var25.setSystemId("");
    java.net.URL var28 = var25.getBaseURI();
    java.lang.String var31 = var25.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var34 = new nu.staldal.xtree.Element("hi!", "hi!");
    var34.addNamespaceMapping("", "");
    var25.addChild((nu.staldal.xtree.Node)var34);
    java.lang.String var41 = var34.getInheritedAttribute("", "hi!");
    var13.addChild((nu.staldal.xtree.Node)var34);
    var34.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "                                                                                                    ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.insertChild((nu.staldal.xtree.Node)var34, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test12");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var45 = var27.getChild(1);
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

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test13");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.util.TemplateException: ", "hi_33_");
    boolean var3 = var2.getPreserveSpace();
    java.lang.String var4 = var2.getTarget();
    java.lang.String var5 = var2.getValue();
    var2.setPublicId("nu.staldal.lagoon.core.LagoonException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.util.TemplateException: "+ "'", var4.equals("nu.staldal.lagoon.util.TemplateException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi_33_"+ "'", var5.equals("hi_33_"));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test14");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.setPublicId("");
    int var9 = var5.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var11 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test15");


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
    var34.startDocument();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test16");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("hi_33_");
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.hasBeenUpdated(1L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test17");


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
    nu.staldal.lagoon.util.TemplateException var22 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test18");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var8 = var2.getFirstChildElement("nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test19");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var37 = var23.getFirstChildElement();
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test20");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var5 = var2.lookupAttribute("hi!", "hi!");
    int var6 = var2.getLineNumber();
    boolean var7 = var2.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = var2.getAttrValue("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test21");


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
    nu.staldal.lagoon.producer.BasicSplit var37 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var39 = new nu.staldal.xtree.Text("hi!");
    char[] var40 = var39.asCharArray();
    var37.characters(var40, 1, 10);
    var37.endElement("", "hi!", "hi!");
    var37.processingInstruction("", "hi!");
    var37.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var37.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var55 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var37);
    var55.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.Text var60 = new nu.staldal.xtree.Text("");
    char[] var61 = var60.asCharArray();
    boolean var62 = var60.isWhitespaceNode();
    char[] var63 = var60.asCharArray();
    var55.setDocumentLocator((org.xml.sax.Locator)var60);
    nu.staldal.lagoon.producer.BasicSplit var65 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var67 = new nu.staldal.xtree.Text("hi!");
    char[] var68 = var67.asCharArray();
    var65.characters(var68, 1, 10);
    var65.endElement("", "hi!", "hi!");
    var65.processingInstruction("", "hi!");
    var65.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var65.startDocument();
    var65.beforeBuild();
    nu.staldal.xtree.Text var85 = new nu.staldal.xtree.Text("");
    char[] var86 = var85.asCharArray();
    char[] var87 = var85.asCharArray();
    var65.ignorableWhitespace(var87, 0, 100);
    var55.characters(var87, 0, 0);
    var22.ignorableWhitespace(var87, (-1), 2);
    var22.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    
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
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test22");


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
    var2.addNamespaceMapping("4", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    nu.staldal.xtree.TreeBuilder var27 = new nu.staldal.xtree.TreeBuilder();
    var27.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var32 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var27, false, false);
    var27.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var37 = new nu.staldal.xtree.Element("hi!", "hi!");
    var37.setLine(100);
    int var40 = var37.numberOfNamespaceMappings();
    var27.setDocumentLocator((org.xml.sax.Locator)var37);
    var27.skippedEntity("nu.staldal.lagoon.core.LagoonException: ");
    var26.toSAX((org.xml.sax.ContentHandler)var27);
    var27.startPrefixMapping("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var27.endPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.xmlutil.ContentHandlerFixer var50 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.outputEndElement((org.xml.sax.ContentHandler)var27);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
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
    assertTrue(var40 == 0);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test23");


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
    var0.endElement("a", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "4444444444");
    
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

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test24");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    java.lang.String var2 = var0.getParam("4444444444");
    var0.afterBuild();
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
    assertNull(var2);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test25");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test26");


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
    nu.staldal.lagoon.LagoonAntTask var18 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var21 = new nu.staldal.ftp.FTPException("hi!");
    var18.log("", (java.lang.Throwable)var21, 10);
    org.apache.tools.ant.Location var24 = var18.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var25 = var18.getRuntimeConfigurableWrapper();
    var18.setForce(false);
    org.apache.tools.ant.Location var28 = var18.getLocation();
    var0.setLocation(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test27");


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
    var11.addAttribute("4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.ftp.FTPException~ hi!", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test28");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var17 = var11.getAttrValueOrNull("");
    java.lang.String var18 = var11.getLocalName();
    int var19 = var11.getColumnNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var22 = var11.getAttrValue("nu.staldal.lagoon.core.LagoonException: 4444444444", "a");
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
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test29");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.endElement("aa", "nu.staldal.ftp.FTPException:                                                                                                     ", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test30");


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
    var22.startPrefixMapping("hi!", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    var22.endPrefixMapping("nu.staldal.lagoon.util.TemplateException");
    
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

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test31");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test32");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    var0.init();
    java.lang.String var3 = var0.getParam("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.hasBeenUpdated(100L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test33");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    java.lang.String var10 = var2.getSystemId();
    var2.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444", "                                                                                                    ");
    boolean var16 = var2.getPreserveSpace();
    java.lang.String var17 = var2.getSystemId();
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
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test34");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.lagoon.core.XMLStreamProducer var2 = var0.getNext();
    java.lang.String var3 = var0.getEntryName();
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    nu.staldal.xtree.Text var7 = new nu.staldal.xtree.Text("");
    char[] var8 = var7.asCharArray();
    java.lang.String var9 = var7.getValue();
    char[] var10 = var7.asCharArray();
    var5.setDocumentLocator((org.xml.sax.Locator)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test35");


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
    boolean var59 = var27.getPreserveSpace();
    
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

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test36");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ ", "hi!", 100);
    java.lang.String var4 = var3.getTextContent();
    nu.staldal.xtree.Element var7 = var3.getFirstChildElementOrNull("nu.staldal.ftp.FTPException~ hi!", "nu.staldal.ftp.FTPException~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test37");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var23 = var2.getAttributeLocalName(100);
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

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test38");


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
    java.lang.String var28 = var1.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException: ");
    int var29 = var1.getLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test39");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444"+ "'", var1.equals("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444"));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test40");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var25 = var5.getAttrValue("nu.staldal.lagoon.core.LagoonException~ hi__33__");
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
    assertNotNull(var23);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test41");


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
    nu.staldal.lagoon.producer.BasicSplit var26 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var28 = new nu.staldal.xtree.Text("hi!");
    char[] var29 = var28.asCharArray();
    var26.characters(var29, 1, 10);
    var26.endElement("", "hi!", "hi!");
    var26.processingInstruction("", "hi!");
    var26.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xmlutil.ContentHandlerAdapter var43 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var26);
    nu.staldal.lagoon.producer.BasicSplit var44 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var46 = new nu.staldal.xtree.Text("hi!");
    char[] var47 = var46.asCharArray();
    var44.characters(var47, 1, 10);
    var44.endElement("", "hi!", "hi!");
    var44.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var57 = new nu.staldal.lagoon.producer.IslandSplit();
    var57.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var60 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var57, true);
    char[] var63 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var67 = new nu.staldal.xtree.Text(var63, 1, 0, false);
    var60.setDocumentLocator((org.xml.sax.Locator)var67);
    char[] var69 = var67.asCharArray();
    var44.characters(var69, 10, 0);
    var43.ignorableWhitespace(var69, 0, (-1));
    var25.ignorableWhitespace(var69, 1, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.endElement("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
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
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test42");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var90 = new nu.staldal.xtree.Text(var83, 2, 100, false);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test43");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test44");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.init();
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
    assertNull(var1);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test45");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("", "nu.staldal.ftp.FTPException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test46");


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
    java.lang.String var25 = var0.getParam("nu.staldal.lagoon.core.LagoonException~ hi__33__");
    
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
    assertNull(var25);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test47");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.core.AuthenticationMissingException var7 = new nu.staldal.lagoon.core.AuthenticationMissingException();
    var0.log((java.lang.Throwable)var7, 10);
    java.lang.String var10 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "nu.staldal.lagoon.core.AuthenticationMissingException"+ "'", var10.equals("nu.staldal.lagoon.core.AuthenticationMissingException"));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test48");


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
    java.lang.String var76 = var37.lookupNamespaceURI("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var78 = var37.getNamespaceMapping(1);
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
    assertTrue("'" + var76 + "' != '" + ""+ "'", var76.equals(""));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test49");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    nu.staldal.xtree.Element var16 = var2.getFirstChildElement();
    var2.setPublicId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var20 = var2.getNamespaceMapping(10);
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

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test50");


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
      var0.init();
      fail("Expected exception of type nu.staldal.lagoon.core.LagoonException");
    } catch (nu.staldal.lagoon.core.LagoonException e) {
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

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test51");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.endElement("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "a", "nu.staldal.ftp.FTPException: hi!");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test52");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException~~ ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    boolean var3 = var2.isWhitespaceNode();
    java.lang.String var4 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException"+ "'", var4.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException"));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test53");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.setTaskType("hi!");
    var1.setDescription("hi!");
    var1.setDescription("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    var1.setTaskType("nu.staldal.lagoon.core.LagoonException~~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test54");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test55");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    java.lang.String var12 = var4.getAttributeLocalName((-1));
    java.net.URL var13 = var4.getBaseURI();
    nu.staldal.xtree.Element var16 = var4.getFirstChildElementOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "aa");
    java.lang.String var19 = var4.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var21 = var4.getAttributeNamespaceURI(100);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test56");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var21 = var2.getAttributeLocalName(1);
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

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test57");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    int var5 = var2.numberOfNamespaceMappings();
    java.lang.String var6 = var2.getNamespaceURI();
    nu.staldal.xtree.Element var7 = var2.getFirstChildElementOrNull();
    java.net.URL var8 = var2.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test58");


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
    int var31 = var11.lookupAttribute("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    java.lang.String var34 = var11.getAttrValueOrNull("                                                                                                    ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    
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
    assertTrue(var31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test59");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var11.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var11.setLine(1);
    var11.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "                                                                                                    ");
    java.lang.String var26 = var11.getLocalName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var28 = var11.getAttributeValue(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test60");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(0L);
    var0.afterBuild();
    java.util.Enumeration var5 = var0.getParamNames();
    var0.afterBuild();
    nu.staldal.lagoon.core.XMLStreamProducer var7 = var0.getNext();
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
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test61");


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
    var1.setDescription("nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test62");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    nu.staldal.xmlutil.ContentHandlerFixer var2 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var0.afterBuild();
    int var4 = var0.getPosition();
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true, false);
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("hi!", "hi!");
    var10.setSystemId("");
    java.lang.String var14 = var10.getAttributeLocalName((-1));
    java.lang.String var16 = var10.lookupNamespaceURI("hi!");
    var7.setDocumentLocator((org.xml.sax.Locator)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.removeAttribute(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test63");


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
      java.lang.String[] var28 = var4.getNamespaceMapping(1);
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

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test64");


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
    var22.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: ", "");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test65");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.processingInstruction("", "hi!");
    var0.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var0.startDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var18 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test66");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    var4.setSystemId("hi!");
    int var8 = var4.getLineNumber();
    boolean var9 = var4.isWhitespaceNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var11 = var4.removeChild(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test67");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.endElement("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.ftp.FTPException: hi!", "");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test68");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("hi_33_", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi_33_"+ "'", var2.equals("hi_33_"));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test69");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var6 = var0.needPassword();
    var0.close();
    nu.staldal.lagoon.core.OutputHandler var9 = var0.createFile("hi!");
    boolean var10 = var0.needPassword();
    var0.close();
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test70");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    java.lang.String var10 = var2.getSystemId();
    var2.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444", "                                                                                                    ");
    boolean var16 = var2.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var19 = var2.getAttrValue("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
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
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test71");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "                                                                                                    ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test72");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test73");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var5 = var2.lookupAttribute("hi!", "hi!");
    int var6 = var2.numberOfAttributes();
    java.lang.String var8 = var2.lookupNamespacePrefix("hi_33_");
    var2.setSystemId("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var12 = var2.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    boolean var13 = var2.isWhitespaceNode();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removeAttribute(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test74");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setForce(false);
    org.apache.tools.ant.Location var10 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var11 = var0.getRuntimeConfigurableWrapper();
    java.lang.String var12 = var0.getDescription();
    var0.setPassword("nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test75");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var36 = var25.getChild(1);
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

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test76");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    var0.endDocument();
    var0.endDocument();
    var0.endDocument();

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test77");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException: 4444444444", 100, "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test78");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.setTaskType("4444444444");
    var0.maybeConfigure();
    var0.setTargetURL("");
    nu.staldal.lagoon.LagoonAntTask var11 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var14 = new nu.staldal.ftp.FTPException("hi!");
    var11.log("", (java.lang.Throwable)var14, 10);
    org.apache.tools.ant.Project var17 = var11.getProject();
    nu.staldal.lagoon.util.TemplateException var19 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var20 = var19.getException();
    var11.log("", (java.lang.Throwable)var19, (-1));
    java.lang.Throwable[] var23 = var19.getSuppressed();
    java.lang.Throwable[] var24 = var19.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var26 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var27 = var26.toString();
    var19.addSuppressed((java.lang.Throwable)var26);
    nu.staldal.lagoon.util.TemplateException var29 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var30 = var29.getException();
    nu.staldal.lagoon.util.TemplateException var31 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var29);
    var26.addSuppressed((java.lang.Throwable)var29);
    var0.log((java.lang.Throwable)var29, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var27.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test79");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", 100, "aa", "####################################################################################################", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test80");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    nu.staldal.lagoon.core.ByteStreamProducer var1 = var0.getNext();
    var0.init();
    var0.init();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var5 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test81");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4444444444", "", 0);
    java.lang.String var4 = var3.getTextContentOrNull();
    nu.staldal.xtree.Element var7 = var3.getFirstChildElementOrNull("", "");
    var3.setLine(2);
    nu.staldal.xtree.Element var12 = var3.getFirstChildElementOrNull("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = var3.getAttrValue("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test82");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.core.LagoonException~ hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.core.LagoonException~~ hi____33____"+ "'", var1.equals("nu.staldal.lagoon.core.LagoonException~~ hi____33____"));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test83");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.processingInstruction("nu.staldal.lagoon.core.LagoonException~ hi__33__", "##");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test84");


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
    var0.setForce(true);
    
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

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test85");


    nu.staldal.lagoon.producer.FOPFormatter var0 = new nu.staldal.lagoon.producer.FOPFormatter();
    java.lang.String var1 = var0.getEntryName();
    int var2 = var0.getPosition();
    nu.staldal.lagoon.core.XMLStreamProducer var3 = var0.getNext();
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

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test86");


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
    var0.endElement("hi_33_", "", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xtree.Element var38 = new nu.staldal.xtree.Element("hi!", "hi!");
    var38.setSystemId("");
    java.net.URL var41 = var38.getBaseURI();
    java.lang.String var44 = var38.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var47 = new nu.staldal.xtree.Element("hi!", "hi!");
    var47.addNamespaceMapping("", "");
    var38.addChild((nu.staldal.xtree.Node)var47);
    var47.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var47.setLine(1);
    var47.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "                                                                                                    ");
    java.lang.String var62 = var47.getLocalName();
    var0.setDocumentLocator((org.xml.sax.Locator)var47);
    java.lang.String var66 = var47.getInheritedAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "a");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "hi!"+ "'", var62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test87");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__"+ "'", var1.equals("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__"));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test88");


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
    assertTrue(var19 == 0);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test89");


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
    boolean var26 = var24.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test90");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.ftp.FTPException: hi!", " ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test91");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.util.TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.util.TemplateException"+ "'", var1.equals("nu.staldal.lagoon.util.TemplateException"));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test92");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var73 = var51.getSourceMan();
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

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test93");


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
    var4.addNamespaceMapping("                                                                                                    ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test94");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "");
    java.lang.String var4 = var2.lookupNamespacePrefix("                                                                                                    ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test95");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test96");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var3 = var2.getPreserveSpace();
    var2.addAttribute("hi_33_", "nu.staldal.lagoon.core.LagoonException: ", "4444444444", "4444444444");
    java.lang.String var10 = var2.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("hi!");
    java.lang.String var14 = var12.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var15 = var12.isWhitespaceNode();
    var12.setColumn(1);
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
    var60.setLine(100);
    nu.staldal.xtree.Element var67 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var70 = var67.lookupAttribute("4444444444", "hi!");
    var67.addNamespaceMapping("", "4444444444");
    java.lang.String var74 = var67.getTextContent();
    var60.insertChild((nu.staldal.xtree.Node)var67, 0);
    var40.setDocumentLocator((org.xml.sax.Locator)var67);
    var40.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ");
    var12.toSAX((org.xml.sax.ContentHandler)var40);
    var40.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    var40.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.outputEndElement((org.xml.sax.ContentHandler)var40);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
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
    assertTrue(var70 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + ""+ "'", var74.equals(""));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test97");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.beforeBuild();
    var0.afterBuild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated(100L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test98");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.hasBeenUpdated(1433461931000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test99");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var6 = new nu.staldal.ftp.FTPException("hi!");
    var3.log("", (java.lang.Throwable)var6, 10);
    org.apache.tools.ant.Location var9 = var3.getLocation();
    var0.setLocation(var9);
    var0.setTaskName("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var16 = new nu.staldal.ftp.FTPException("hi!");
    var13.log("", (java.lang.Throwable)var16, 10);
    org.apache.tools.ant.Location var19 = var13.getLocation();
    nu.staldal.lagoon.core.LagoonException var22 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var13.log("4444444444", (java.lang.Throwable)var22, 100);
    java.lang.String var25 = var22.toString();
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var29 = new nu.staldal.ftp.FTPException("hi!");
    var26.log("", (java.lang.Throwable)var29, 10);
    org.apache.tools.ant.Project var32 = var26.getProject();
    nu.staldal.lagoon.util.TemplateException var34 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var35 = var34.getException();
    var26.log("", (java.lang.Throwable)var34, (-1));
    java.lang.Throwable[] var38 = var34.getSuppressed();
    java.lang.Throwable[] var39 = var34.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var41 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var42 = var41.toString();
    var34.addSuppressed((java.lang.Throwable)var41);
    var22.addSuppressed((java.lang.Throwable)var41);
    java.lang.String var45 = var41.toString();
    java.lang.String var46 = var41.toString();
    nu.staldal.lagoon.LagoonAntTask var47 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var50 = new nu.staldal.ftp.FTPException("hi!");
    var47.log("", (java.lang.Throwable)var50, 10);
    var47.init();
    var47.init();
    java.lang.Object var55 = var47.clone();
    var47.init();
    java.lang.Object var57 = var47.clone();
    nu.staldal.lagoon.core.LagoonException var59 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var60 = var59.toString();
    var47.log((java.lang.Throwable)var59, 10);
    var41.addSuppressed((java.lang.Throwable)var59);
    var0.log((java.lang.Throwable)var41, 2);
    java.lang.Exception var66 = var41.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var25.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var42.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var45.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var46.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var60.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test100");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", (-1));
    int var6 = var3.lookupAttribute("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    java.lang.String var8 = var3.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.removeAttribute((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test101");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    int var6 = var2.getLineNumber();
    java.lang.String var8 = var2.lookupNamespacePrefix("hi_33_");
    java.lang.String var11 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    java.net.URL var12 = var2.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test102");


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
    var0.endElement("####################################################################################################", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
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
    assertNotNull(var18);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test103");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.endPrefixMapping("hi_33_");
    var0.skippedEntity("hi_33_");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.setDocumentLocator((org.xml.sax.Locator)var12);
    var0.startPrefixMapping("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.endElement("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test104");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("                                                                                                    ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "                                                                                                    "+ "'", var2.equals("                                                                                                    "));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test105");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    boolean var2 = var0.hasBeenUpdated(1L);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.init();
      fail("Expected exception of type nu.staldal.lagoon.core.LagoonException");
    } catch (nu.staldal.lagoon.core.LagoonException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test106");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test107");


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
    var42.skippedEntity("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
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

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test108");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    var4.setSystemId("hi!");
    int var8 = var4.getLineNumber();
    boolean var9 = var4.isWhitespaceNode();
    java.lang.String var10 = var4.getPublicId();
    boolean var11 = var4.getPreserveSpace();
    nu.staldal.xtree.NodeWithChildren var12 = var4.getParent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var4.getAttrValue("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test109");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4444444444", "", 0);
    java.lang.String var4 = var3.getTextContentOrNull();
    nu.staldal.xtree.Element var7 = var3.getFirstChildElementOrNull("", "");
    var3.setLine(2);
    nu.staldal.xtree.Element var12 = var3.getFirstChildElementOrNull("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var14 = var3.getChild(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test110");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var8 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var8.endDocument();
    var8.startDocument();
    nu.staldal.xmlutil.DocumentHandlerAdapter var11 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var8);
    var8.endDocument();
    nu.staldal.xtree.Text var14 = new nu.staldal.xtree.Text("");
    char[] var15 = var14.asCharArray();
    char[] var16 = var14.asCharArray();
    char[] var17 = var14.asCharArray();
    boolean var18 = var14.isWhitespaceNode();
    var14.setColumn(0);
    char[] var21 = var14.asCharArray();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.characters(var21, 2, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test111");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("nu.staldal.ftp.FTPException~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_"+ "'", var1.equals("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_"));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test112");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    nu.staldal.lagoon.LagoonAntTask var3 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var6 = new nu.staldal.ftp.FTPException("hi!");
    var3.log("", (java.lang.Throwable)var6, 10);
    org.apache.tools.ant.Location var9 = var3.getLocation();
    var0.setLocation(var9);
    var0.setTaskName("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.LagoonAntTask var13 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var16 = new nu.staldal.ftp.FTPException("hi!");
    var13.log("", (java.lang.Throwable)var16, 10);
    org.apache.tools.ant.Location var19 = var13.getLocation();
    nu.staldal.lagoon.core.LagoonException var22 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var13.log("4444444444", (java.lang.Throwable)var22, 100);
    java.lang.String var25 = var22.toString();
    nu.staldal.lagoon.LagoonAntTask var26 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var29 = new nu.staldal.ftp.FTPException("hi!");
    var26.log("", (java.lang.Throwable)var29, 10);
    org.apache.tools.ant.Project var32 = var26.getProject();
    nu.staldal.lagoon.util.TemplateException var34 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var35 = var34.getException();
    var26.log("", (java.lang.Throwable)var34, (-1));
    java.lang.Throwable[] var38 = var34.getSuppressed();
    java.lang.Throwable[] var39 = var34.getSuppressed();
    nu.staldal.lagoon.core.LagoonException var41 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var42 = var41.toString();
    var34.addSuppressed((java.lang.Throwable)var41);
    var22.addSuppressed((java.lang.Throwable)var41);
    java.lang.String var45 = var41.toString();
    java.lang.String var46 = var41.toString();
    nu.staldal.lagoon.LagoonAntTask var47 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var50 = new nu.staldal.ftp.FTPException("hi!");
    var47.log("", (java.lang.Throwable)var50, 10);
    var47.init();
    var47.init();
    java.lang.Object var55 = var47.clone();
    var47.init();
    java.lang.Object var57 = var47.clone();
    nu.staldal.lagoon.core.LagoonException var59 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var60 = var59.toString();
    var47.log((java.lang.Throwable)var59, 10);
    var41.addSuppressed((java.lang.Throwable)var59);
    var0.log((java.lang.Throwable)var41, 2);
    java.lang.String var66 = var0.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var25.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var42.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var45.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var46.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var60.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var66);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test113");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var10 = new nu.staldal.xtree.Element("hi!", "hi!");
    var10.setLine(100);
    int var13 = var10.numberOfNamespaceMappings();
    var0.setDocumentLocator((org.xml.sax.Locator)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.processingInstruction("nu.staldal.ftp.FTPException: hi!", "nu.staldal.lagoon.core.LagoonException: 4444444444");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test114");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test115");


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
    nu.staldal.xtree.TreeBuilder var24 = new nu.staldal.xtree.TreeBuilder();
    var24.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var29 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var30 = var29.getLineNumber();
    var29.setPublicId("");
    int var33 = var29.getLineNumber();
    var24.setDocumentLocator((org.xml.sax.Locator)var29);
    java.lang.String var35 = var29.getTextContent();
    var11.addChild((nu.staldal.xtree.Node)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test116");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     "+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     "));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test117");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var4 = var0.hasBeenUpdated(1L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test118");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException:                                                                                                     ", " ");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test119");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    var0.log("");
    var0.init();

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test120");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.setTaskType("4444444444");
    var0.log("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", 0);
    var0.setTargetURL("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    var0.init();
    var0.log("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test121");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var2.setSystemId("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var18 = var2.getTextContent();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test122");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("hi!", "hi!", 0, 100);
    nu.staldal.xtree.Element var5 = var4.getFirstChildElementOrNull();
    var4.setSystemId("hi!");
    boolean var8 = var4.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test123");


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
    var20.skippedEntity("hi_33_");
    nu.staldal.lagoon.producer.BasicSplit var70 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var72 = new nu.staldal.xtree.Text("hi!");
    char[] var73 = var72.asCharArray();
    var70.characters(var73, 1, 10);
    var70.endElement("", "hi!", "hi!");
    var70.processingInstruction("", "hi!");
    nu.staldal.xtree.Text var85 = new nu.staldal.xtree.Text("");
    char[] var86 = var85.asCharArray();
    char[] var87 = var85.asCharArray();
    var70.ignorableWhitespace(var87, 10, 0);
    var20.ignorableWhitespace(var87, 100, 10);
    var20.skippedEntity(" ");
    
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
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test124");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    nu.staldal.lagoon.core.XMLStreamProducer var1 = var0.getNext();
    boolean var3 = var0.hasBeenUpdated(10L);
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

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test125");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.core.LagoonException~ hi__33__", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test126");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test127");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var2.setLine(0);
    var2.setColumn((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var2.getAttributeLocalName(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test128");


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
    nu.staldal.xtree.Element var26 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var29 = var26.lookupAttribute("4444444444", "hi!");
    java.lang.String var32 = var26.getInheritedAttribute("", "4444444444");
    int var35 = var26.lookupAttribute("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var37 = var2.replaceChild((nu.staldal.xtree.Node)var26, 10);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test129");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    java.lang.String var10 = var2.getSystemId();
    int var11 = var2.numberOfAttributes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test130");


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
    var22.processingInstruction("####################################################################################################", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    
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

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test131");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.hasBeenUpdated(1433461934000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test132");


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

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test133");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.core.LagoonException~~ hi____33____");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________"+ "'", var1.equals("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________"));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test134");


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
      java.lang.String[] var25 = var2.getNamespaceMapping(10);
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

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test135");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test136");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__"+ "'", var2.equals("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__"));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test137");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var7 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test138");


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
    nu.staldal.xtree.Element var73 = new nu.staldal.xtree.Element("", "4444444444", 100);
    int var74 = var73.numberOfChildren();
    java.lang.String var77 = var73.getInheritedAttribute("4444444444", "nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var78 = var73.getNamespaceURI();
    java.lang.String var80 = var73.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var35.insertChild((nu.staldal.xtree.Node)var73, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + ""+ "'", var78.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var80);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test139");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var79 = var75.getFirstChildElement("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", "nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
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

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test140");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.maybeConfigure();
    var0.log("4444444444", 1);
    var0.setTargetURL("hi_33_");
    var0.setPassword("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var0.setTaskType("aa");

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test141");


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
    var0.endElement("nu.staldal.lagoon.core.LagoonException: hi_33_", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
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

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test142");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var76 = var37.getAttrValue("nu.staldal.lagoon.core.AuthenticationMissingException");
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

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test143");


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
    var10.setPassword("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    
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

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test144");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    java.lang.String var4 = var3.getLocalName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var6 = var3.removeChild(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test145");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test146");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________"+ "'", var1.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test147");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.util.TemplateException", 0, 10);
    var4.setColumn(2);
    nu.staldal.xtree.Element var9 = var4.getFirstChildElementOrNull("nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("hi!", "hi!");
    var12.setSystemId("");
    java.net.URL var15 = var12.getBaseURI();
    java.lang.String var18 = var12.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("hi!", "hi!");
    var21.addNamespaceMapping("", "");
    var12.addChild((nu.staldal.xtree.Node)var21);
    var12.setSystemId("");
    java.lang.String var28 = var12.getPublicId();
    int var29 = var12.getColumnNumber();
    nu.staldal.xtree.Element var30 = var12.getFirstChildElementOrNull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var32 = var4.replaceChild((nu.staldal.xtree.Node)var30, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test148");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    java.lang.String var10 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var11 = var2.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var13 = var2.getNamespaceMapping(10);
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

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test149");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test150");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.processingInstruction("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException~~ ");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test151");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.hasBeenUpdated(1433461945000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test152");


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
    java.lang.String var39 = var14.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException~~ ");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test153");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    var2.setColumn((-1));
    java.net.URL var12 = var2.getBaseURI();
    java.lang.String var14 = var2.lookupNamespacePrefix("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    
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

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test154");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "hi__33__"+ "'", var1.equals("hi__33__"));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test155");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ ");
    var0.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "hi__33__");

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test156");


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
      java.lang.String var75 = var2.getAttributeNamespaceURI(100);
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

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test157");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("nu.staldal.lagoon.core.AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException"+ "'", var1.equals("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException"));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test158");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test159");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var5, false, true);
    nu.staldal.xtree.Text var10 = new nu.staldal.xtree.Text("4444444444");
    int var11 = var10.getColumnNumber();
    var5.setDocumentLocator((org.xml.sax.Locator)var10);
    int var13 = var10.getLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test160");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    int var13 = var4.lookupAttribute("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException");
    int var14 = var4.getColumnNumber();
    java.lang.String var16 = var4.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.xtree.Element var19 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var22 = var19.lookupAttribute("hi!", "hi!");
    nu.staldal.xtree.Element var23 = var19.getFirstChildElementOrNull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.insertChild((nu.staldal.xtree.Node)var19, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test161");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.startPrefixMapping("                                                                                                    ", "nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xtree.Text var10 = new nu.staldal.xtree.Text("");
    char[] var11 = var10.asCharArray();
    boolean var12 = var10.isWhitespaceNode();
    char[] var13 = var10.asCharArray();
    boolean var14 = var10.getPreserveSpace();
    char[] var15 = var10.asCharArray();
    var0.ignorableWhitespace(var15, 1, 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.processingInstruction("nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test162");


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
    var76.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.Text var81 = new nu.staldal.xtree.Text("");
    char[] var82 = var81.asCharArray();
    boolean var83 = var81.isWhitespaceNode();
    char[] var84 = var81.asCharArray();
    var76.setDocumentLocator((org.xml.sax.Locator)var81);
    char[] var86 = var81.asCharArray();
    var18.characters(var86, 1, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var93 = new nu.staldal.xtree.Text(var86, 2, (-1), true);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test163");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    var2.endPrefixMapping("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var2.endPrefixMapping("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var10 = var2.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test164");


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
    boolean var31 = var12.isWhitespaceNode();
    
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
    assertTrue(var31 == false);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test165");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    var2.setColumn(100);
    boolean var12 = var2.getPreserveSpace();
    var2.addNamespaceMapping("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu.staldal.ftp.FTPException~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test166");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu_46_staldal_46_lagoon_46_util_46_TemplateException");

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test167");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.removeAttribute((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test168");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    var0.skippedEntity("                                                                                                    ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var13 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test169");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    org.apache.tools.ant.Target var9 = var0.getOwningTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test170");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.ftp.FTPException:                                                                                                     ", 100, "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException~ hi__33__");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test171");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    int var6 = var2.getLineNumber();
    var2.setPublicId("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var10 = var2.getChild(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test172");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var4 = var2.getAttributeValue(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test173");


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
    var21.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var40 = new nu.staldal.xtree.Element("hi!", "hi!");
    var40.setSystemId("");
    java.net.URL var43 = var40.getBaseURI();
    java.lang.String var46 = var40.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var49 = new nu.staldal.xtree.Element("hi!", "hi!");
    var49.addNamespaceMapping("", "");
    var40.addChild((nu.staldal.xtree.Node)var49);
    java.lang.String var55 = var49.getAttrValueOrNull("");
    nu.staldal.xtree.Element var58 = new nu.staldal.xtree.Element("hi!", "hi!");
    var58.setSystemId("");
    java.net.URL var61 = var58.getBaseURI();
    java.lang.String var64 = var58.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var67 = new nu.staldal.xtree.Element("hi!", "hi!");
    var67.addNamespaceMapping("", "");
    var58.addChild((nu.staldal.xtree.Node)var67);
    var58.setSystemId("");
    nu.staldal.xtree.Element var76 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var77 = var76.getLineNumber();
    var76.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var83 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var84 = var83.getLineNumber();
    var83.addNamespaceMapping("", "");
    var76.addChild((nu.staldal.xtree.Node)var83);
    var58.insertChild((nu.staldal.xtree.Node)var76, 0);
    var49.addChild((nu.staldal.xtree.Node)var58);
    var58.setLine((-1));
    int var94 = var58.getLineNumber();
    var21.setDocumentLocator((org.xml.sax.Locator)var58);
    nu.staldal.xtree.Element var96 = var58.getFirstChildElementOrNull();
    java.lang.String var98 = var58.lookupNamespacePrefix("hi_33_");
    var20.setDocumentLocator((org.xml.sax.Locator)var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var98);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test174");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("nu.staldal.lagoon.core.LagoonException: 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test175");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    java.lang.String var7 = var0.getParam("4444444444");
    var0.init();
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

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test176");


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
    var5.endElement("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.processingInstruction("aa", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
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

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test177");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444"+ "'", var1.equals("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444"));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test178");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    var0.beforeBuild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.hasBeenUpdated(1433461945000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test179");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var25 = var2.getFirstChildElement("nu.staldal.lagoon.core.LagoonException~ hi__33__", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test180");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.lang.String var6 = var3.getSystemId();
    int var7 = var3.getColumnNumber();
    java.lang.String var9 = var3.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("hi!", "hi!");
    var12.setSystemId("");
    java.net.URL var15 = var12.getBaseURI();
    java.lang.String var18 = var12.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("hi!", "hi!");
    var21.addNamespaceMapping("", "");
    var12.addChild((nu.staldal.xtree.Node)var21);
    java.lang.String var28 = var21.getInheritedAttribute("", "hi!");
    int var29 = var21.getLineNumber();
    var21.setSystemId("nu.staldal.lagoon.core.LagoonException: 4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var33 = var3.replaceChild((nu.staldal.xtree.Node)var21, 1);
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == (-1));

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test181");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", " ", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var3.getAttrValue("nu.staldal.lagoon.core.LagoonException~~ hi____33____");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test182");


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
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test183");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("hi_33_");
    var0.destroy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.hasBeenUpdated(1433461943000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test184");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException", "nu.staldal.ftp.FTPException:                                                                                                     ");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test185");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.addNamespaceMapping("", "");
    boolean var7 = var2.getPreserveSpace();
    var2.setPublicId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test186");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    var5.startPrefixMapping("                                                                                                    ", "hi!");
    var5.startPrefixMapping("          ", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    var5.startPrefixMapping("          ", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xmlutil.ContentHandlerAdapter var15 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var5);
    var5.startPrefixMapping("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.ftp.FTPException~ hi!");

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test187");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    var4.addNamespaceMapping("", "4444444444");
    java.lang.String var11 = var4.getTextContent();
    var4.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "");
    java.lang.String var15 = var4.getNamespaceURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "4444444444"+ "'", var15.equals("4444444444"));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test188");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.init();
    var0.setTaskType("nu.staldal.lagoon.core.LagoonException: hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test189");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ", 0, "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test190");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "aa", 1);
    boolean var4 = var3.getPreserveSpace();
    int var5 = var3.getColumnNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test191");


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
    nu.staldal.lagoon.LagoonAntTask var17 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var20 = new nu.staldal.ftp.FTPException("hi!");
    var17.log("", (java.lang.Throwable)var20, 10);
    org.apache.tools.ant.Location var23 = var17.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var24 = var17.getRuntimeConfigurableWrapper();
    var17.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var27 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var30 = new nu.staldal.ftp.FTPException("hi!");
    var27.log("", (java.lang.Throwable)var30, 10);
    org.apache.tools.ant.Project var33 = var27.getProject();
    nu.staldal.lagoon.util.TemplateException var35 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var36 = var35.getException();
    var27.log("", (java.lang.Throwable)var35, (-1));
    var17.bindToOwner((org.apache.tools.ant.Task)var27);
    org.apache.tools.ant.Location var40 = var27.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var41 = var27.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Location var42 = var27.getLocation();
    nu.staldal.lagoon.LagoonAntTask var43 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var44 = new nu.staldal.lagoon.LagoonAntTask();
    var43.bindToOwner((org.apache.tools.ant.Task)var44);
    var43.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var48 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var51 = new nu.staldal.ftp.FTPException("hi!");
    var48.log("", (java.lang.Throwable)var51, 10);
    org.apache.tools.ant.Location var54 = var48.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var55 = var48.getRuntimeConfigurableWrapper();
    var48.setForce(false);
    org.apache.tools.ant.Location var58 = var48.getLocation();
    var48.log("nu.staldal.lagoon.util.TemplateException", (-1));
    java.lang.String var62 = var48.getDescription();
    org.apache.tools.ant.Location var63 = var48.getLocation();
    var43.setLocation(var63);
    nu.staldal.lagoon.LagoonAntTask var65 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var68 = new nu.staldal.ftp.FTPException("hi!");
    var65.log("", (java.lang.Throwable)var68, 10);
    org.apache.tools.ant.Location var71 = var65.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var72 = var65.getRuntimeConfigurableWrapper();
    var65.setTargetURL("4444444444");
    nu.staldal.lagoon.LagoonAntTask var75 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var78 = new nu.staldal.ftp.FTPException("hi!");
    var75.log("", (java.lang.Throwable)var78, 10);
    org.apache.tools.ant.Project var81 = var75.getProject();
    nu.staldal.lagoon.util.TemplateException var83 = new nu.staldal.lagoon.util.TemplateException();
    java.lang.Exception var84 = var83.getException();
    var75.log("", (java.lang.Throwable)var83, (-1));
    var65.bindToOwner((org.apache.tools.ant.Task)var75);
    org.apache.tools.ant.Location var88 = var75.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var89 = var75.getRuntimeConfigurableWrapper();
    var43.setRuntimeConfigurableWrapper(var89);
    var27.setRuntimeConfigurableWrapper(var89);
    var0.setRuntimeConfigurableWrapper(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test192");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Project var6 = var0.getProject();
    java.lang.String var7 = var0.getTaskType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test193");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    nu.staldal.xtree.NodeWithChildren var5 = var2.getParent();
    java.lang.String var6 = var2.getTextContentOrNull();
    nu.staldal.xtree.Element var7 = var2.getFirstChildElementOrNull();
    int var10 = var2.lookupAttribute("####################################################################################################", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    nu.staldal.xtree.Element var13 = new nu.staldal.xtree.Element("hi!", "hi!");
    var13.setSystemId("");
    java.net.URL var16 = var13.getBaseURI();
    java.lang.String var19 = var13.getAttrValueOrNull("", "");
    java.lang.String var20 = var13.getTextContent();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var22 = var2.replaceChild((nu.staldal.xtree.Node)var13, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test194");


    nu.staldal.lagoon.producer.BasicSplit var0 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var2 = new nu.staldal.xtree.Text("hi!");
    char[] var3 = var2.asCharArray();
    var0.characters(var3, 1, 10);
    var0.endElement("", "hi!", "hi!");
    int var11 = var0.getPosition();
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

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test195");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    java.lang.String var2 = var0.getParam("4444444444");
    var0.afterBuild();
    boolean var5 = var0.hasBeenUpdated((-1L));
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

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test196");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.endElement("nu.staldal.ftp.FTPException~ hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________", " ");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test197");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    var0.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    nu.staldal.xmlutil.ContentHandlerFixer var6 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    var6.endPrefixMapping("hi__33__");

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test198");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var11.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    var11.setLine(1);
    var11.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "                                                                                                    ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var27 = var11.getChild(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test199");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "4444444444", 100);
    var3.setSystemId("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var3.getAttributeType(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test200");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.endPrefixMapping("hi_33_");
    var0.skippedEntity("hi_33_");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var0.setDocumentLocator((org.xml.sax.Locator)var12);
    nu.staldal.xtree.NodeWithChildren var14 = var12.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test201");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.close();
    boolean var6 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~ ");
    var0.close();
    boolean var10 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test202");


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

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test203");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    var4.addAttribute("hi!", "", "hi!", "");
    int var10 = var4.getColumnNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var12 = var4.getNamespaceMapping(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test204");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.core.LagoonException~~ ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test205");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    nu.staldal.xtree.Element var16 = var2.getFirstChildElement();
    var2.setPublicId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xtree.Element var21 = var2.getFirstChildElementOrNull("nu.staldal.lagoon.core.LagoonException: hi_33_", "nu.staldal.lagoon.core.LagoonException~ hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test206");


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
    java.lang.String var25 = var0.getParam("nu.staldal.lagoon.core.LagoonException~ hi__33__");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var26 = var0.getSourceMan();
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test207");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.util.TemplateException", 0);
    java.net.URL var4 = var3.getBaseURI();
    boolean var5 = var3.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var7 = var3.getAttributeNamespaceURI(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test208");


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
    nu.staldal.xtree.Element var35 = var2.getFirstChildElement();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var36 = var2.getTextContent();
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
    assertNotNull(var35);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test209");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var6 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: 4444444444");
    boolean var9 = var0.isReentrant();
    long var11 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    var0.close();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0L);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test210");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    long var6 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException~~ ");
    boolean var7 = var0.needPassword();
    boolean var8 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test211");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("hi_33_");
    var0.init();
    var0.init();
    var0.init();
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
    assertNull(var2);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test212");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test213");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.processingInstruction("hi!", "hi_33_");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test214");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "aa", 1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var3.getAttributeNamespaceURI(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test215");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", 1, (-1));
    var4.setColumn((-1));

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test216");


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
    var9.setTargetURL("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException~ ");
    org.apache.tools.ant.Target var22 = var9.getOwningTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test217");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    var0.endDocument();
    var0.endDocument();
    nu.staldal.lagoon.producer.BasicSplit var10 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var12 = new nu.staldal.xtree.Text("hi!");
    char[] var13 = var12.asCharArray();
    var10.characters(var13, 1, 10);
    var10.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var10.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    nu.staldal.xmlutil.ContentHandlerAdapter var23 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var10);
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
    nu.staldal.xmlutil.DocumentHandlerAdapter var46 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var45);
    nu.staldal.xtree.Element var49 = new nu.staldal.xtree.Element("hi!", "hi!");
    var49.setSystemId("");
    java.net.URL var52 = var49.getBaseURI();
    java.lang.String var55 = var49.getAttrValueOrNull("", "");
    var46.setDocumentLocator((org.xml.sax.Locator)var49);
    nu.staldal.xtree.Text var58 = new nu.staldal.xtree.Text("");
    char[] var59 = var58.asCharArray();
    char[] var60 = var58.asCharArray();
    var46.characters(var60, 100, 100);
    var23.characters(var60, 100, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.characters(var60, 100, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test218");


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
    nu.staldal.lagoon.producer.BasicSplit var41 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var43 = new nu.staldal.xtree.Text("hi!");
    char[] var44 = var43.asCharArray();
    var41.characters(var44, 1, 10);
    var41.endElement("", "hi!", "hi!");
    var41.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var55 = new nu.staldal.xtree.Text("");
    char[] var56 = var55.asCharArray();
    char[] var57 = var55.asCharArray();
    char[] var58 = var55.asCharArray();
    var41.characters(var58, 10, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var27.characters(var58, 1, 2);
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
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test219");


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
      boolean var9 = var0.hasBeenUpdated((-1L));
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test220");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test221");


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
    var5.log("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test222");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.util.TemplateException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test223");


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
    var2.startDocument();
    
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

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test224");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getSystemId();
    var2.addAttribute("", "hi!", "", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var11 = var2.getChild(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test225");


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
    nu.staldal.lagoon.producer.BasicSplit var75 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var77 = new nu.staldal.xtree.Text("hi!");
    char[] var78 = var77.asCharArray();
    var75.characters(var78, 1, 10);
    var75.endElement("", "hi!", "hi!");
    var75.processingInstruction("", "hi!");
    nu.staldal.xtree.Text var90 = new nu.staldal.xtree.Text("");
    char[] var91 = var90.asCharArray();
    char[] var92 = var90.asCharArray();
    var75.ignorableWhitespace(var92, 10, 0);
    var0.ignorableWhitespace(var92, 1, 100);
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
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test226");


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
    var2.addNamespaceMapping("4", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    java.net.URL var23 = var2.getBaseURI();
    
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
    assertNull(var23);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test227");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    var0.endDocument();
    var0.endDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var10 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test228");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test229");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    nu.staldal.lagoon.LagoonAntTask var5 = new nu.staldal.lagoon.LagoonAntTask();
    var5.setPassword("");
    var0.bindToOwner((org.apache.tools.ant.Task)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test230");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.hasBeenUpdated(1433461943000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test231");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test232");


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
    java.lang.String var34 = var23.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    
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
    assertNull(var34);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test233");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var3 = var2.getPublicId();
    java.lang.String var6 = var2.getInheritedAttribute("", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var2.setPublicId("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var2.setPublicId("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test234");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    int var3 = var2.getLineNumber();
    java.lang.String var4 = var2.getValue();
    java.lang.String var5 = var2.getValue();
    boolean var6 = var2.getPreserveSpace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var5.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test235");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException~~ ");

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test236");


    nu.staldal.lagoon.producer.XSLTransformer var0 = new nu.staldal.lagoon.producer.XSLTransformer();
    java.lang.String var2 = var0.getParam("4444444444");
    boolean var4 = var0.hasBeenUpdated(1433461942000L);
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
    assertTrue(var4 == true);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test237");


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
    nu.staldal.xtree.Element var27 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var28 = var27.getLineNumber();
    var27.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var34 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var35 = var34.getLineNumber();
    var34.addNamespaceMapping("", "");
    var27.addChild((nu.staldal.xtree.Node)var34);
    nu.staldal.xtree.NodeWithChildren var40 = var27.getParent();
    java.lang.String var43 = var27.getAttrValueOrNull("", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var20.insertChild((nu.staldal.xtree.Node)var27, 2);
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test238");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.lang.String var6 = var2.getAttributeLocalName((-1));
    java.lang.String var8 = var2.lookupNamespaceURI("hi!");
    var2.addAttribute("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = var2.getAttrValue("nu.staldal.lagoon.util.TemplateException: ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test239");


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
    java.lang.String var27 = var23.lookupNamespaceURI("nu.staldal.lagoon.core.LagoonException: 4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var28 = var23.getFirstChildElement();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
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

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test240");


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
    var0.reconfigure();
    
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

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test241");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.beforeBuild();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated(1433461928000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test242");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    var4.addNamespaceMapping("", "4444444444");
    java.lang.String var11 = var4.getTextContent();
    java.net.URL var12 = var4.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var4.getAttributeLocalName(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test243");


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
    boolean var35 = var32.isWhitespaceNode();
    java.lang.String var36 = var32.getSystemId();
    
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
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test244");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", 1, "nu.staldal.ftp.FTPException:                                                                                                     ", "nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test245");


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
    java.lang.String var31 = var0.getParam("nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test246");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    var1.init();
    org.apache.tools.ant.Location var7 = var1.getLocation();
    var1.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    var1.log("", (-1));
    java.lang.String var13 = var1.getTaskType();
    var1.setForce(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test247");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("          ", 1, "hi__33__", "nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test248");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    nu.staldal.lagoon.core.OutputHandler var8 = var0.createFile("4444444444");
    long var10 = var0.fileLastModified("hi!");
    var0.close();
    long var13 = var0.fileLastModified("a");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.OutputHandler var15 = var0.createFile(" ");
      fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461948000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1433461947000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0L);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test249");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var24 = var23.getFirstChildElement();
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
    assertNotNull(var23);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test250");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    java.lang.String var1 = var0.getDescription();
    var0.setTargetURL("nu.staldal.lagoon.util.TemplateException");
    var0.setTaskName("hi!");
    var0.setTargetURL("nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
    var0.setForce(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test251");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xtree.Element var16 = new nu.staldal.xtree.Element("hi_33_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    var8.setDocumentLocator((org.xml.sax.Locator)var16);
    nu.staldal.xtree.Element var18 = var8.getTree();
    nu.staldal.xtree.Element var21 = new nu.staldal.xtree.Element("hi!", "hi!");
    var21.setSystemId("");
    java.net.URL var24 = var21.getBaseURI();
    java.lang.String var27 = var21.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var30 = new nu.staldal.xtree.Element("hi!", "hi!");
    var30.addNamespaceMapping("", "");
    var21.addChild((nu.staldal.xtree.Node)var30);
    var21.setSystemId("");
    java.lang.String var37 = var21.getPublicId();
    int var38 = var21.getColumnNumber();
    nu.staldal.xtree.Element var39 = var21.getFirstChildElementOrNull();
    boolean var40 = var39.getPreserveSpace();
    var8.setDocumentLocator((org.xml.sax.Locator)var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test252");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.util.TemplateException: ", "4");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test253");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    java.lang.String var10 = var2.getSystemId();
    var2.addAttribute("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444", "                                                                                                    ");
    boolean var16 = var2.getPreserveSpace();
    java.lang.String var17 = var2.getSystemId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var19 = var2.getAttributeType(1);
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
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test254");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.util.TemplateException", 0);
    java.lang.String var5 = var3.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test255");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.ftp.FTPException~ hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.ftp.FTPException~~ hi!"+ "'", var1.equals("nu.staldal.ftp.FTPException~~ hi!"));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test256");


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
    org.apache.tools.ant.Target var13 = var0.getOwningTarget();
    var0.log(" ", 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test257");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var5.startDocument();
    var5.endDocument();

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test258");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var1.log("hi!");
    java.lang.String var5 = var1.getTaskName();
    java.lang.String var6 = var1.getTaskType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test259");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var3.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test260");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException"+ "'", var1.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException"));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test261");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + ""+ "'", var2.equals(""));

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test262");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test263");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var3 = var2.getPublicId();
    java.lang.String var4 = var2.getValue();
    java.lang.String var5 = var2.getValue();
    java.lang.String var6 = var2.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var5.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var6.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test264");


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
    var22.endPrefixMapping("hi!");
    var22.startPrefixMapping("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var22.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
    
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

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test265");


    java.lang.String var2 = nu.staldal.util.Utils.nChars(10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "aaaaaaaaaa"+ "'", var2.equals("aaaaaaaaaa"));

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test266");


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
    char[] var58 = new char[] { '#', ' '};
    var22.ignorableWhitespace(var58, 2, 100);
    nu.staldal.xtree.Element var64 = new nu.staldal.xtree.Element("hi!", "hi!");
    var64.setSystemId("");
    java.net.URL var67 = var64.getBaseURI();
    java.lang.String var70 = var64.getAttrValueOrNull("", "");
    java.lang.String var71 = var64.getTextContent();
    java.lang.String var72 = var64.getNamespaceURI();
    var22.setDocumentLocator((org.xml.sax.Locator)var64);
    
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
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + ""+ "'", var71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test267");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var5 = var3.getAttributeValue(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test268");


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
    nu.staldal.xmlutil.ContentHandlerAdapter var32 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var14);
    var32.startDocument();
    var32.processingInstruction("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var37 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var32);
    char[] var41 = new char[] { '4', '4', 'a'};
    var37.characters(var41, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.characters(var41, 100, 100);
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
    assertNotNull(var41);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test269");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var12 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8);
    var12.startDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.endElement("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test270");


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
    java.lang.Object var21 = var10.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test271");


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
    java.net.URL var31 = var24.getBaseURI();
    nu.staldal.xtree.ProcessingInstruction var34 = new nu.staldal.xtree.ProcessingInstruction("4444444444", "hi!");
    java.lang.String var37 = var34.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var38 = var34.getValue();
    java.lang.String var39 = var34.getTarget();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var24.insertChild((nu.staldal.xtree.Node)var34, 1);
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
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "4444444444"+ "'", var39.equals("4444444444"));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test272");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.close();
    boolean var6 = var0.isReentrant();
    boolean var7 = var0.needPassword();
    boolean var8 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test273");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    var0.startPrefixMapping("4444444444", "                                                                                                    ");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false);
    nu.staldal.xtree.Element var17 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var18 = var17.getLineNumber();
    var17.setPublicId("");
    java.lang.String var23 = var17.getInheritedAttribute("", "4444444444");
    int var24 = var17.numberOfChildren();
    nu.staldal.xtree.TreeBuilder var25 = new nu.staldal.xtree.TreeBuilder();
    var25.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var30 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var25, false, false);
    var17.toSAX((org.xml.sax.ContentHandler)var30);
    nu.staldal.xmlutil.ContentHandlerFixer var33 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var30, true);
    nu.staldal.xtree.Element var38 = new nu.staldal.xtree.Element("hi!", "", 10, 0);
    var30.setDocumentLocator((org.xml.sax.Locator)var38);
    nu.staldal.lagoon.producer.BasicSplit var40 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var42 = new nu.staldal.xtree.Text("hi!");
    char[] var43 = var42.asCharArray();
    var40.characters(var43, 1, 10);
    var40.endElement("", "hi!", "hi!");
    nu.staldal.xtree.TreeBuilder var51 = new nu.staldal.xtree.TreeBuilder();
    var51.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var56 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var51, false, false);
    nu.staldal.xtree.Text var58 = new nu.staldal.xtree.Text("");
    char[] var59 = var58.asCharArray();
    boolean var60 = var58.isWhitespaceNode();
    char[] var61 = var58.asCharArray();
    var51.ignorableWhitespace(var61, 0, 10);
    var40.characters(var61, 1, 10);
    var30.ignorableWhitespace(var61, 2, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.characters(var61, 2, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test274");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.hasBeenUpdated(1433461942000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test275");


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
    int var31 = var11.lookupAttribute("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var11.addNamespaceMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.core.LagoonException: ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var36 = var11.getAttributeLocalName(2);
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
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == (-1));

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test276");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.hasBeenUpdated(1433461943000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test277");


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
    var19.setColumn(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test278");


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
    var9.init();
    
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

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test279");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.lang.String var6 = var3.getSystemId();
    var3.setColumn(10);
    int var11 = var3.lookupAttribute("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var12 = var3.getSystemId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test280");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    org.apache.tools.ant.Project var8 = var0.getProject();
    var0.setTargetURL("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.Object var11 = var0.clone();
    org.apache.tools.ant.Project var12 = var0.getProject();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test281");


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
    java.lang.String var29 = var25.getTarget();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test282");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.ftp.FTPException: hi!", 100, "hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test283");


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
    java.lang.String var53 = var33.lookupNamespacePrefix("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
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
    assertNull(var53);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test284");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var3 = var2.getLineNumber();
    var2.setPublicId("");
    int var6 = var2.getLineNumber();
    java.lang.String var8 = var2.lookupNamespacePrefix("hi_33_");
    java.lang.String var11 = var2.getAttrValueOrNull("", "4444444444");
    nu.staldal.xtree.Element var15 = new nu.staldal.xtree.Element("hi!", "hi!", (-1));
    var2.addChild((nu.staldal.xtree.Node)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var17 = var15.getFirstChildElement();
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
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

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test285");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.endElement("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.ftp.FTPException~ hi!", "nu.staldal.ftp.FTPException: hi!");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test286");


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
    nu.staldal.xtree.TreeBuilder var37 = new nu.staldal.xtree.TreeBuilder();
    var37.endPrefixMapping("hi!");
    var37.endDocument();
    var37.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    nu.staldal.xtree.Text var45 = new nu.staldal.xtree.Text("");
    char[] var46 = var45.asCharArray();
    char[] var47 = var45.asCharArray();
    char[] var48 = var45.asCharArray();
    var37.ignorableWhitespace(var48, 1, 100);
    nu.staldal.xmlutil.ContentHandlerAdapter var52 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var37);
    var37.endDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var31.toSAX((org.xml.sax.ContentHandler)var37);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
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
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test287");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", (-1));
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
    var4.characters(var21, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var25 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var4);
    nu.staldal.xmlutil.DocumentHandlerAdapter var26 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var25);
    nu.staldal.xtree.Element var29 = new nu.staldal.xtree.Element("hi!", "hi!");
    var29.setSystemId("");
    java.net.URL var32 = var29.getBaseURI();
    java.lang.String var35 = var29.getAttrValueOrNull("", "");
    var26.setDocumentLocator((org.xml.sax.Locator)var29);
    nu.staldal.xtree.Text var38 = new nu.staldal.xtree.Text("");
    char[] var39 = var38.asCharArray();
    char[] var40 = var38.asCharArray();
    var26.characters(var40, 100, 100);
    nu.staldal.xtree.Element var46 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var47 = var46.getLineNumber();
    var46.setPublicId("");
    int var50 = var46.getLineNumber();
    java.lang.String var52 = var46.lookupNamespacePrefix("hi_33_");
    var26.setDocumentLocator((org.xml.sax.Locator)var46);
    var26.skippedEntity("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    var26.startDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.outputEndElement((org.xml.sax.ContentHandler)var26);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test288");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    java.lang.String var6 = var0.getEntryName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.hasBeenUpdated(1433461942000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test289");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.Element var10 = var4.getFirstChildElementOrNull("", "");
    java.lang.String var11 = var4.getLocalName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "4444444444"+ "'", var11.equals("4444444444"));

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test290");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    boolean var7 = var0.needPassword();
    nu.staldal.lagoon.core.OutputHandler var9 = var0.createFile("nu.staldal.lagoon.util.TemplateException: ");
    boolean var10 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461948000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test291");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("aa", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", (-1), 10);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test292");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test293");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("hi__33__", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test294");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    java.lang.String var3 = var0.getDescription();
    java.lang.String var4 = var0.getTaskName();
    var0.setDescription("          ");
    org.apache.tools.ant.Project var7 = var0.getProject();
    var0.setTaskType("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test295");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    var11.addAttribute("4444444444", "", "nu.staldal.lagoon.util.TemplateException", "");
    java.lang.String[] var22 = var11.getNamespaceMapping(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.removeAttribute(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test296");


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
    int var23 = var4.numberOfAttributes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var26 = var4.getFirstChildElement("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
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

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test297");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8);
    var14.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var14.startDocument();
    var14.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test298");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("4444444444", "hi!");
    nu.staldal.xtree.NodeWithChildren var3 = var2.getParent();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test299");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var29 = var11.getChild(0);
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

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test300");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    var9.addNamespaceMapping("", "4444444444");
    java.lang.String var16 = var9.getTextContent();
    var2.insertChild((nu.staldal.xtree.Node)var9, 0);
    int var19 = var9.numberOfNamespaceMappings();
    java.lang.String var20 = var9.getSystemId();
    nu.staldal.xtree.Element var25 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var28 = var25.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var29 = new nu.staldal.xtree.TreeBuilder();
    var25.toSAX((org.xml.sax.ContentHandler)var29);
    var29.skippedEntity("hi!");
    var29.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var35 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.outputStartElement((org.xml.sax.ContentHandler)var29);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == (-1));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test301");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    java.lang.String var10 = var2.getNamespaceURI();
    nu.staldal.xtree.NodeWithChildren var11 = var2.getParent();
    java.lang.String var14 = var2.getInheritedAttribute("hi_33_", "hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var16 = var2.getAttributeNamespaceURI(10);
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
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test302");


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
    nu.staldal.xtree.TreeBuilder var24 = new nu.staldal.xtree.TreeBuilder();
    var24.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var29 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var24, false, false);
    var24.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Element var34 = new nu.staldal.xtree.Element("hi!", "hi!");
    var34.setLine(100);
    int var37 = var34.numberOfNamespaceMappings();
    var24.setDocumentLocator((org.xml.sax.Locator)var34);
    var24.skippedEntity("                                                                                                    ");
    var24.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.outputEndElement((org.xml.sax.ContentHandler)var24);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
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
    assertTrue(var37 == 0);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test303");


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
      boolean var9 = var0.hasBeenUpdated(10L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test304");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    var1.toSAX((org.xml.sax.ContentHandler)var2);
    var2.startDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.endElement("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test305");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test306");


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
    nu.staldal.xtree.NodeWithChildren var40 = var2.getParent();
    var2.addAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "                                                                                                    ", "hi!", "nu.staldal.lagoon.core.LagoonException~ ");
    boolean var46 = var2.getPreserveSpace();
    nu.staldal.xtree.TreeBuilder var47 = new nu.staldal.xtree.TreeBuilder();
    var47.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var52 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var47, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var55 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var52, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var58 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var55, true, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.outputEndElement((org.xml.sax.ContentHandler)var58);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
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
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test307");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test308");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    java.lang.String var7 = var0.getParam("4444444444");
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var11 = var0.hasBeenUpdated(1433461927000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test309");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    var0.startPrefixMapping("4444444444", "                                                                                                    ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.endElement("hi!", "nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test310");


    boolean var1 = nu.staldal.util.Utils.absoluteURL("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test311");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var28 = var5.getFirstChildElement("                                                                                                    ", "nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
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
    assertTrue(var25 == 1);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test312");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    var0.init();
    java.lang.String var3 = var0.getParam("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.hasBeenUpdated(1433461941000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test313");


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
    java.lang.String var20 = var9.getDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test314");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var28 = var11.getFirstChildElement();
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
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1));

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test315");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var0.skippedEntity("nu.staldal.lagoon.core.LagoonException~~ ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.processingInstruction("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.ftp.FTPException~~ hi!");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test316");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    var0.close();
    boolean var6 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~ ");
    var0.close();
    var0.deleteFile("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test317");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", (-1));
    java.lang.String var5 = var3.lookupNamespaceURI("          ");
    nu.staldal.lagoon.producer.IslandSplit var6 = new nu.staldal.lagoon.producer.IslandSplit();
    var6.destroy();
    var6.afterBuild();
    var6.init();
    var6.beforeBuild();
    nu.staldal.lagoon.core.XMLStreamProducer var11 = var6.getNext();
    java.util.Enumeration var12 = var6.getParamNames();
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var6, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.outputEndElement((org.xml.sax.ContentHandler)var14);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test318");


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
    int var34 = var4.numberOfAttributes();
    nu.staldal.xtree.ProcessingInstruction var37 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var38 = var37.getPublicId();
    java.lang.String var39 = var37.getValue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var41 = var4.replaceChild((nu.staldal.xtree.Node)var37, 100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var39.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test319");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu.staldal.ftp.FTPException~ hi!", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.ftp.FTPException~ hi!"+ "'", var2.equals("nu.staldal.ftp.FTPException~ hi!"));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test320");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.endElement("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
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

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test321");


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
    nu.staldal.lagoon.core.LagoonContext var73 = var51.getContext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var51.init();
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
    assertNull(var73);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test322");


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
    nu.staldal.xtree.TreeBuilder var21 = new nu.staldal.xtree.TreeBuilder();
    var21.endPrefixMapping("hi!");
    var21.endDocument();
    var21.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    nu.staldal.xtree.Text var29 = new nu.staldal.xtree.Text("");
    char[] var30 = var29.asCharArray();
    char[] var31 = var29.asCharArray();
    char[] var32 = var29.asCharArray();
    var21.ignorableWhitespace(var32, 1, 100);
    var18.ignorableWhitespace(var32, 10, (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var42 = new nu.staldal.xtree.Text(var32, 100, 100, true);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test323");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    nu.staldal.xtree.TreeBuilder var2 = new nu.staldal.xtree.TreeBuilder();
    var2.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var7 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var2, false, true);
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var7, false, true);
    var1.toSAX((org.xml.sax.ContentHandler)var10);
    java.lang.String var12 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test324");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.util.TemplateException: ", "##", 2);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test325");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("4444444444", "nu.staldal.lagoon.core.AuthenticationMissingException");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test326");


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
    int var61 = var46.lookupAttribute("##", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var63 = var46.getChild((-1));
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
    assertTrue(var61 == (-1));

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test327");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    var8.skippedEntity("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.processingInstruction("4444444444", "aa");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test328");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.skippedEntity("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.endElement("aaaaaaaaaa", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test329");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4444444444", "nu.staldal.lagoon.util.TemplateException: ", 1);
    int var4 = var3.getLineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var6 = var3.getChild(2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test330");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________"+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________"));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test331");


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
    nu.staldal.xtree.Element var30 = var2.getFirstChildElementOrNull("nu.staldal.lagoon.core.LagoonException~~ ", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var32 = var2.getAttributeLocalName(2);
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
    assertNull(var30);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test332");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "4"+ "'", var1.equals("4"));

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test333");


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
    var28.init();
    
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

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test334");


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
    int var27 = var4.numberOfAttributes();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test335");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("nu.staldal.lagoon.core.LagoonException~ hi__33__");

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test336");


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
    var48.startPrefixMapping("nu.staldal.ftp.FTPException~ hi!", "nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
    
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

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test337");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    boolean var3 = var1.isWhitespaceNode();
    char[] var4 = var1.asCharArray();
    char[] var7 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var11 = new nu.staldal.xtree.Text(var7, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var12 = new nu.staldal.xtree.TreeBuilder();
    var12.endPrefixMapping("hi!");
    var12.endDocument();
    var12.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var11.toSAX((org.xml.sax.ContentHandler)var12);
    var12.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var12.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var25 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var12);
    nu.staldal.lagoon.producer.BasicSplit var26 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var28 = new nu.staldal.xtree.Text("hi!");
    char[] var29 = var28.asCharArray();
    var26.characters(var29, 1, 10);
    var26.endElement("", "hi!", "hi!");
    var26.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var40 = new nu.staldal.xtree.Text("");
    char[] var41 = var40.asCharArray();
    char[] var42 = var40.asCharArray();
    char[] var43 = var40.asCharArray();
    var26.characters(var43, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var47 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var26);
    nu.staldal.xmlutil.DocumentHandlerAdapter var48 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var47);
    nu.staldal.xtree.Element var51 = new nu.staldal.xtree.Element("hi!", "hi!");
    var51.setSystemId("");
    java.net.URL var54 = var51.getBaseURI();
    java.lang.String var57 = var51.getAttrValueOrNull("", "");
    var48.setDocumentLocator((org.xml.sax.Locator)var51);
    nu.staldal.xtree.Text var60 = new nu.staldal.xtree.Text("");
    char[] var61 = var60.asCharArray();
    char[] var62 = var60.asCharArray();
    var48.characters(var62, 100, 100);
    nu.staldal.xtree.Element var68 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var69 = var68.getLineNumber();
    var68.setPublicId("");
    int var72 = var68.getLineNumber();
    java.lang.String var74 = var68.lookupNamespacePrefix("hi_33_");
    var48.setDocumentLocator((org.xml.sax.Locator)var68);
    nu.staldal.xmlutil.ContentHandlerFixer var78 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var48, false, false);
    nu.staldal.xtree.Text var80 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var80.setLine(1);
    char[] var83 = var80.asCharArray();
    char[] var84 = var80.asCharArray();
    var48.characters(var84, 100, 1);
    var12.ignorableWhitespace(var84, 1, 0);
    var1.toSAX((org.xml.sax.ContentHandler)var12);
    nu.staldal.xmlutil.ContentHandlerAdapter var92 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.processingInstruction("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test338");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.hasBeenUpdated(1433461931000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test339");


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
      nu.staldal.xtree.Text var17 = new nu.staldal.xtree.Text(var10, 2, 1, false);
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

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test340");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.ftp.FTPException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test341");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    var8.endDocument();
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
    nu.staldal.lagoon.producer.BasicSplit var34 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var36 = new nu.staldal.xtree.Text("hi!");
    char[] var37 = var36.asCharArray();
    var34.characters(var37, 1, 10);
    var34.endElement("", "hi!", "hi!");
    var34.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var48 = new nu.staldal.xtree.Text("");
    char[] var49 = var48.asCharArray();
    char[] var50 = var48.asCharArray();
    char[] var51 = var48.asCharArray();
    var34.characters(var51, 10, 0);
    var33.ignorableWhitespace(var51, 10, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.characters(var51, 2, 1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test342");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4444444444", "", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var6 = var3.getFirstChildElement("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test343");


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
    var0.processingInstruction("nu.staldal.lagoon.core.LagoonException~ ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
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

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test344");


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
    var0.setForce(true);
    var0.log("nu.staldal.lagoon.core.LagoonException: 4444444444", 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test345");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    java.lang.String var5 = var0.getTaskName();
    var0.log("nu.staldal.lagoon.util.TemplateException", 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test346");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    int var5 = var2.numberOfNamespaceMappings();
    java.net.URL var6 = var2.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var2.getAttributeNamespaceURI(0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test347");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var0.deleteFile("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    boolean var8 = var0.needPassword();
    boolean var9 = var0.isReentrant();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test348");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated(1433461928000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test349");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var5 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var6 = var5.getLineNumber();
    var5.setPublicId("");
    int var9 = var5.getLineNumber();
    var0.setDocumentLocator((org.xml.sax.Locator)var5);
    nu.staldal.xmlutil.ContentHandlerFixer var11 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var12 = var0.getTree();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test350");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    nu.staldal.xmlutil.ContentHandlerAdapter var11 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________", "a");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test351");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var24 = var19.getAttributeValue(10);
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test352");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.endElement("nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test353");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    char[] var6 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var10 = new nu.staldal.xtree.Text(var6, 1, 0, false);
    var3.setDocumentLocator((org.xml.sax.Locator)var10);
    char[] var12 = var10.asCharArray();
    boolean var13 = var10.isWhitespaceNode();
    nu.staldal.lagoon.producer.BasicSplit var14 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var16 = new nu.staldal.xtree.Text("hi!");
    char[] var17 = var16.asCharArray();
    var14.characters(var17, 1, 10);
    var14.endElement("", "hi!", "hi!");
    var14.processingInstruction("", "hi!");
    var14.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var14.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var32 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var14);
    var32.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException");
    nu.staldal.xtree.Element var38 = new nu.staldal.xtree.Element("hi!", "hi!");
    var38.setLine(100);
    java.lang.String var42 = var38.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.net.URL var43 = var38.getBaseURI();
    var32.setDocumentLocator((org.xml.sax.Locator)var38);
    nu.staldal.lagoon.producer.BasicSplit var45 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var47 = new nu.staldal.xtree.Text("hi!");
    char[] var48 = var47.asCharArray();
    var45.characters(var48, 1, 10);
    var45.endElement("", "hi!", "hi!");
    var45.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.lagoon.producer.IslandSplit var58 = new nu.staldal.lagoon.producer.IslandSplit();
    var58.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var61 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var58, true);
    char[] var64 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var68 = new nu.staldal.xtree.Text(var64, 1, 0, false);
    var61.setDocumentLocator((org.xml.sax.Locator)var68);
    char[] var70 = var68.asCharArray();
    var45.characters(var70, 10, 0);
    var32.characters(var70, (-1), 100);
    nu.staldal.xmlutil.DocumentHandlerAdapter var77 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var32);
    var77.startDocument();
    var10.toSAX((org.xml.sax.ContentHandler)var77);
    java.lang.String var80 = var10.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + ""+ "'", var80.equals(""));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test354");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    int var13 = var4.lookupAttribute("", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String var15 = var4.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var16 = var4.getPublicId();
    nu.staldal.xtree.Element var17 = var4.getFirstChildElementOrNull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test355");


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
    java.net.URL var50 = var33.getBaseURI();
    int var51 = var33.numberOfAttributes();
    
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
    assertTrue(var51 == 0);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test356");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    var0.beforeBuild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.hasBeenUpdated(100L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test357");


    nu.staldal.xtree.ProcessingInstruction var2 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var3 = var2.getValue();
    java.lang.String var4 = var2.getValue();
    java.lang.String var5 = var2.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var3.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var4.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var5.equals("nu.staldal.lagoon.core.LagoonException: "));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test358");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.lagoon.core.SourceManager var21 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test359");


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
    java.lang.String var28 = var11.lookupNamespacePrefix("4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var31 = var11.getAttrValue("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu.staldal.lagoon.core.AuthenticationMissingException");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
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
    assertNull(var28);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test360");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    var8.endDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.endElement("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException~~ nu.staldal.lagoon.util.TemplateException");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test361");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "hi!");
    var0.startDocument();

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test362");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    boolean var3 = var0.needPassword();
    boolean var4 = var0.isReentrant();
    var0.deleteFile("nu.staldal.lagoon.util.TemplateException");
    var0.deleteFile("nu.staldal.lagoon.core.LagoonException~~ ");
    boolean var9 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test363");


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
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test364");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    var0.destroy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.hasBeenUpdated(1433461943000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test365");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    var0.setPassword("");
    java.lang.Object var3 = var0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test366");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.beforeBuild();
    var0.afterBuild();
    java.lang.String var6 = var0.getEntryName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var0.hasBeenUpdated(10L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test367");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", (-1));
    java.net.URL var4 = var3.getBaseURI();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test368");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("");
    char[] var2 = var1.asCharArray();
    boolean var3 = var1.isWhitespaceNode();
    char[] var4 = var1.asCharArray();
    char[] var7 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var11 = new nu.staldal.xtree.Text(var7, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var12 = new nu.staldal.xtree.TreeBuilder();
    var12.endPrefixMapping("hi!");
    var12.endDocument();
    var12.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var11.toSAX((org.xml.sax.ContentHandler)var12);
    var12.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var12.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var25 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var12);
    nu.staldal.lagoon.producer.BasicSplit var26 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var28 = new nu.staldal.xtree.Text("hi!");
    char[] var29 = var28.asCharArray();
    var26.characters(var29, 1, 10);
    var26.endElement("", "hi!", "hi!");
    var26.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    nu.staldal.xtree.Text var40 = new nu.staldal.xtree.Text("");
    char[] var41 = var40.asCharArray();
    char[] var42 = var40.asCharArray();
    char[] var43 = var40.asCharArray();
    var26.characters(var43, 10, 0);
    nu.staldal.xmlutil.ContentHandlerAdapter var47 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var26);
    nu.staldal.xmlutil.DocumentHandlerAdapter var48 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var47);
    nu.staldal.xtree.Element var51 = new nu.staldal.xtree.Element("hi!", "hi!");
    var51.setSystemId("");
    java.net.URL var54 = var51.getBaseURI();
    java.lang.String var57 = var51.getAttrValueOrNull("", "");
    var48.setDocumentLocator((org.xml.sax.Locator)var51);
    nu.staldal.xtree.Text var60 = new nu.staldal.xtree.Text("");
    char[] var61 = var60.asCharArray();
    char[] var62 = var60.asCharArray();
    var48.characters(var62, 100, 100);
    nu.staldal.xtree.Element var68 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var69 = var68.getLineNumber();
    var68.setPublicId("");
    int var72 = var68.getLineNumber();
    java.lang.String var74 = var68.lookupNamespacePrefix("hi_33_");
    var48.setDocumentLocator((org.xml.sax.Locator)var68);
    nu.staldal.xmlutil.ContentHandlerFixer var78 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var48, false, false);
    nu.staldal.xtree.Text var80 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var80.setLine(1);
    char[] var83 = var80.asCharArray();
    char[] var84 = var80.asCharArray();
    var48.characters(var84, 100, 1);
    var12.ignorableWhitespace(var84, 1, 0);
    var1.toSAX((org.xml.sax.ContentHandler)var12);
    nu.staldal.xmlutil.ContentHandlerAdapter var92 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var92.processingInstruction("aa", "hi_33_");
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test369");


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
    var8.endDocument();
    nu.staldal.lagoon.producer.BasicSplit var27 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var29 = new nu.staldal.xtree.Text("hi!");
    char[] var30 = var29.asCharArray();
    var27.characters(var30, 1, 10);
    var27.endElement("", "hi!", "hi!");
    var27.processingInstruction("", "hi!");
    var27.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var27.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var45 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var27);
    var45.processingInstruction("", "nu.staldal.lagoon.util.TemplateException: ");
    var45.startDocument();
    char[] var52 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var56 = new nu.staldal.xtree.Text(var52, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var57 = new nu.staldal.xtree.TreeBuilder();
    var57.endPrefixMapping("hi!");
    var57.endDocument();
    var57.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var56.toSAX((org.xml.sax.ContentHandler)var57);
    var57.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    char[] var70 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var74 = new nu.staldal.xtree.Text(var70, 1, 0, false);
    char[] var75 = var74.asCharArray();
    var57.ignorableWhitespace(var75, 10, 10);
    var45.ignorableWhitespace(var75, 0, 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.characters(var75, 10, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test370");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var39 = var23.getFirstChildElement();
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test371");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.lang.String var6 = var3.getSystemId();
    int var7 = var3.getColumnNumber();
    java.lang.String var8 = var3.getTextContent();
    java.net.URL var9 = var3.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var11 = var3.getNamespaceMapping(1);
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

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test372");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 1);
    var3.setPublicId("nu.staldal.lagoon.core.LagoonException: ");
    java.lang.String var8 = var3.getInheritedAttribute("nu.staldal.ftp.FTPException: hi!", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    nu.staldal.xtree.Element var12 = new nu.staldal.xtree.Element("aa", "nu_46_staldal_46_lagoon_46_util_46_TemplateException", 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.insertChild((nu.staldal.xtree.Node)var12, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test373");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.hasBeenUpdated(1433461940000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test374");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var12 = var4.getAttributeValue(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test375");


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
    var0.setDescription("hi!");
    org.apache.tools.ant.Location var33 = var0.getLocation();
    
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
    assertNotNull(var33);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test376");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.hasBeenUpdated(1433461931000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test377");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.endElement("nu.staldal.lagoon.core.AuthenticationMissingException", "nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test378");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("4", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "4"+ "'", var2.equals("4"));

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test379");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    org.apache.tools.ant.Target var7 = var0.getOwningTarget();
    var0.log("hi!");
    java.lang.String var10 = var0.getDescription();
    var0.reconfigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test380");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    org.apache.tools.ant.Target var7 = var0.getOwningTarget();
    var0.setPassword("hi!");
    var0.setTargetURL("");
    var0.setForce(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test381");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.processingInstruction("                                                                                                    ", "nu.staldal.lagoon.core.LagoonException:                                                                                                     ");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test382");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException(" ");

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test383");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.skippedEntity("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.processingInstruction("hi__33__", "nu.staldal.lagoon.core.LagoonException: 4444444444");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test384");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.util.TemplateException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.util.TemplateException~ "+ "'", var1.equals("nu.staldal.lagoon.util.TemplateException~ "));

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test385");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var3 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, true);
    var0.beforeBuild();
    var0.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    var0.init();
    nu.staldal.xmlutil.ContentHandlerFixer var8 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test386");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var12 = var9.lookupAttribute("4444444444", "hi!");
    var9.addNamespaceMapping("", "4444444444");
    java.lang.String var16 = var9.getTextContent();
    var2.insertChild((nu.staldal.xtree.Node)var9, 0);
    boolean var19 = var9.getPreserveSpace();
    java.lang.String var20 = var9.getTextContentOrNull();
    nu.staldal.lagoon.producer.IslandSplit var21 = new nu.staldal.lagoon.producer.IslandSplit();
    var21.destroy();
    var21.afterBuild();
    nu.staldal.xmlutil.ContentHandlerFixer var24 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var21);
    nu.staldal.xmlutil.ContentHandlerFixer var26 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var21, true);
    var26.endPrefixMapping("4444444444");
    var26.endPrefixMapping("hi!");
    nu.staldal.xtree.Element var33 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var34 = var33.getLineNumber();
    var33.addNamespaceMapping("", "");
    nu.staldal.xtree.Element var40 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var41 = var40.getLineNumber();
    var40.addNamespaceMapping("", "");
    var33.addChild((nu.staldal.xtree.Node)var40);
    nu.staldal.xtree.NodeWithChildren var46 = var33.getParent();
    nu.staldal.xtree.Element var49 = var33.getFirstChildElementOrNull("hi!", "4444444444");
    int var50 = var33.numberOfNamespaceMappings();
    var26.setDocumentLocator((org.xml.sax.Locator)var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.insertChild((nu.staldal.xtree.Node)var33, (-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    assertTrue(var34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test387");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    int var19 = var11.getColumnNumber();
    int var20 = var11.getLineNumber();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test388");


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
    nu.staldal.lagoon.LagoonAntTask var67 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var70 = new nu.staldal.ftp.FTPException("hi!");
    var67.log("", (java.lang.Throwable)var70, 10);
    var67.init();
    org.apache.tools.ant.Project var74 = var67.getProject();
    nu.staldal.lagoon.LagoonAntTask var76 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var79 = new nu.staldal.ftp.FTPException("hi!");
    var76.log("", (java.lang.Throwable)var79, 10);
    nu.staldal.lagoon.util.TemplateException var82 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var79);
    var67.log("", (java.lang.Throwable)var82, 100);
    java.lang.Throwable[] var85 = var82.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var86 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var82);
    java.lang.Exception var87 = var82.getException();
    var65.addSuppressed((java.lang.Throwable)var82);
    
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
    assertNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var87);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test389");


    nu.staldal.lagoon.producer.LSSITransformer var0 = new nu.staldal.lagoon.producer.LSSITransformer();
    java.lang.String var2 = var0.getParam("");
    int var3 = var0.getPosition();
    var0.destroy();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var6 = var0.hasBeenUpdated((-1L));
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test390");


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
    nu.staldal.xtree.Element var49 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ", "nu.staldal.ftp.FTPException:                                                                                                     ", 2, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var51 = var41.replaceChild((nu.staldal.xtree.Node)var49, 10);
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
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test391");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.log("");
    var0.log("nu.staldal.lagoon.util.TemplateException: ");
    org.apache.tools.ant.Location var7 = var0.getLocation();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test392");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    var8.endPrefixMapping("hi!");
    var8.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "4444444444");
    nu.staldal.xtree.TreeBuilder var16 = new nu.staldal.xtree.TreeBuilder();
    var16.endPrefixMapping("hi!");
    var16.skippedEntity("hi!");
    nu.staldal.lagoon.producer.BasicSplit var21 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var23 = new nu.staldal.xtree.Text("hi!");
    char[] var24 = var23.asCharArray();
    var21.characters(var24, 1, 10);
    var21.endElement("", "hi!", "hi!");
    var21.processingInstruction("", "hi!");
    var21.processingInstruction("4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    var21.startDocument();
    nu.staldal.xmlutil.ContentHandlerAdapter var39 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var21);
    var39.processingInstruction("hi!", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var43 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var39);
    var43.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.producer.BasicSplit var47 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var49 = new nu.staldal.xtree.Text("hi!");
    char[] var50 = var49.asCharArray();
    var47.characters(var50, 1, 10);
    var47.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var47.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    char[] var62 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var66 = new nu.staldal.xtree.Text(var62, 1, 0, false);
    char[] var67 = var66.asCharArray();
    var47.ignorableWhitespace(var67, 0, 10);
    var43.characters(var67, 0, 100);
    var16.ignorableWhitespace(var67, 10, 1);
    var8.ignorableWhitespace(var67, 0, 10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var83 = new nu.staldal.xtree.Text(var67, 2, 0, false);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test393");


    nu.staldal.ftp.FTPException var1 = new nu.staldal.ftp.FTPException("##");

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test394");


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
      nu.staldal.xtree.Text var60 = new nu.staldal.xtree.Text(var50, (-1), 100, true);
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

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test395");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    var2.setPublicId("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var9 = var2.getInheritedAttribute("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test396");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    nu.staldal.xtree.Element var10 = var8.getTree();
    var8.endDocument();
    nu.staldal.xtree.Element var12 = var8.getTree();
    nu.staldal.xtree.Element var13 = var8.getTree();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var15 = var13.getAttributeType(1);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test397");


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
    org.apache.tools.ant.Project var49 = var0.getProject();
    
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
    assertNull(var49);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test398");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("hi!");
    char[] var2 = var1.asCharArray();
    java.lang.String var3 = var1.getValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi!"+ "'", var3.equals("hi!"));

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test399");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var55 = var11.getAttributeType(2);
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

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test400");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.execute();
      fail("Expected exception of type org.apache.tools.ant.BuildException");
    } catch (org.apache.tools.ant.BuildException e) {
      // Expected exception.
    }

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test401");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    var0.init();
    java.util.Enumeration var5 = var0.getParamNames();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var9 = var0.hasBeenUpdated(1433461940000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test402");


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
    var18.processingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    nu.staldal.xmlutil.DocumentHandlerAdapter var97 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var18);
    var97.startDocument();
    
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

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test403");


    nu.staldal.lagoon.core.AuthenticationMissingException var0 = new nu.staldal.lagoon.core.AuthenticationMissingException();
    java.lang.Throwable[] var1 = var0.getSuppressed();
    nu.staldal.lagoon.util.TemplateException var2 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var0);
    java.lang.Exception var3 = var2.getException();
    java.lang.Exception var4 = var2.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test404");


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
    var49.endDocument();
    
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

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test405");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var22 = var2.getTextContent();
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

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test406");


    nu.staldal.lagoon.producer.IslandSplit var0 = new nu.staldal.lagoon.producer.IslandSplit();
    var0.destroy();
    nu.staldal.xmlutil.ContentHandlerFixer var4 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, false);
    nu.staldal.xtree.Element var8 = new nu.staldal.xtree.Element("", "hi!", 10);
    var8.setSystemId("hi!");
    java.lang.String var11 = var8.getSystemId();
    var4.setDocumentLocator((org.xml.sax.Locator)var8);
    nu.staldal.xmlutil.ContentHandlerFixer var14 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var4, false);
    nu.staldal.xmlutil.ContentHandlerAdapter var15 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var4);
    var4.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "4");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test407");


    nu.staldal.lagoon.util.TemplateException var1 = new nu.staldal.lagoon.util.TemplateException("nu.staldal.ftp.FTPException:                                                                                                     ");

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test408");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    java.lang.String var6 = var2.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException: 4444444444");
    java.lang.String var7 = var2.getTextContent();
    boolean var8 = var2.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var11 = var2.getFirstChildElement("####################################################################################################", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test409");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    nu.staldal.lagoon.util.TemplateException var6 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var3);
    java.lang.Exception var7 = var6.getException();
    java.lang.String var8 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "nu.staldal.ftp.FTPException: hi!"+ "'", var8.equals("nu.staldal.ftp.FTPException: hi!"));

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test410");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", 0);
    nu.staldal.xtree.Element var6 = var3.getFirstChildElementOrNull("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "aaaaaaaaaa");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test411");


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
    int var76 = var75.numberOfChildren();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var77 = var75.getTextContent();
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
    assertTrue(var76 == 1);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test412");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    java.lang.String var7 = var2.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu.staldal.lagoon.core.LagoonException: ");
    int var8 = var2.numberOfAttributes();
    java.lang.String var10 = var2.lookupNamespacePrefix("nu.staldal.lagoon.util.TemplateException");
    java.lang.String var11 = var2.getSystemId();
    nu.staldal.xtree.Element var15 = new nu.staldal.xtree.Element("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444", (-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var17 = var2.replaceChild((nu.staldal.xtree.Node)var15, 1);
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
    assertNull(var11);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test413");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    nu.staldal.xtree.TreeBuilder var8 = new nu.staldal.xtree.TreeBuilder();
    var4.toSAX((org.xml.sax.ContentHandler)var8);
    var8.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var12 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var8);
    char[] var15 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var19 = new nu.staldal.xtree.Text(var15, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var20 = new nu.staldal.xtree.TreeBuilder();
    var20.endPrefixMapping("hi!");
    var20.endDocument();
    var20.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var19.toSAX((org.xml.sax.ContentHandler)var20);
    var20.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    char[] var33 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var37 = new nu.staldal.xtree.Text(var33, 1, 0, false);
    char[] var38 = var37.asCharArray();
    var20.ignorableWhitespace(var38, 10, 10);
    var12.ignorableWhitespace(var38, 1, 10);
    var12.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test414");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________"+ "'", var1.equals("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________"));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test415");


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
    var22.startPrefixMapping("hi_33_", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    var22.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");
    
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

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test416");


    boolean var1 = nu.staldal.lagoon.util.Wildcard.isWildcard("nu_46_staldal_46_lagoon_46_util_46_TemplateException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test417");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("hi_33_", "nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "hi_33_"+ "'", var2.equals("hi_33_"));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test418");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException"+ "'", var1.equals("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException"));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test419");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    boolean var3 = var2.getPreserveSpace();
    var2.addAttribute("hi_33_", "nu.staldal.lagoon.core.LagoonException: ", "4444444444", "4444444444");
    java.lang.String var9 = var2.getNamespaceURI();
    int var10 = var2.numberOfNamespaceMappings();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test420");


    nu.staldal.lagoon.producer.FileSource var0 = new nu.staldal.lagoon.producer.FileSource();
    java.lang.String var1 = var0.getEntryName();
    var0.init();
    var0.init();
    var0.beforeBuild();
    var0.afterBuild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var7 = var0.hasBeenUpdated(1433461946000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test421");


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
    nu.staldal.lagoon.util.TemplateException var58 = new nu.staldal.lagoon.util.TemplateException((java.lang.Exception)var23);
    
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

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test422");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    boolean var7 = var0.isReentrant();
    boolean var8 = var0.needPassword();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461950000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test423");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    nu.staldal.xtree.Text var8 = new nu.staldal.xtree.Text("");
    char[] var9 = var8.asCharArray();
    char[] var10 = var8.asCharArray();
    char[] var11 = var8.asCharArray();
    var0.ignorableWhitespace(var11, 1, 100);
    nu.staldal.xtree.Element var17 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: ", "hi_33_");
    var0.setDocumentLocator((org.xml.sax.Locator)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.processingInstruction("nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__126__126__32_hi________33________", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test424");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("a", "nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test425");


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
    java.lang.String var26 = var2.getPublicId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var29 = var2.getFirstChildElement("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "4444444444"+ "'", var26.equals("4444444444"));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test426");


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
    var63.setLine(100);
    nu.staldal.xtree.Element var70 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var73 = var70.lookupAttribute("4444444444", "hi!");
    var70.addNamespaceMapping("", "4444444444");
    java.lang.String var77 = var70.getTextContent();
    var63.insertChild((nu.staldal.xtree.Node)var70, 0);
    var43.setDocumentLocator((org.xml.sax.Locator)var70);
    var0.setDocumentLocator((org.xml.sax.Locator)var70);
    java.lang.String var83 = var70.lookupNamespacePrefix("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
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
    assertTrue(var73 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + ""+ "'", var77.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var83);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test427");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_"+ "'", var1.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_"));

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test428");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.lagoon.LagoonAntTask var1 = new nu.staldal.lagoon.LagoonAntTask();
    var0.bindToOwner((org.apache.tools.ant.Task)var1);
    var0.setForce(true);
    var0.setTaskName("");
    var0.log("nu.staldal.lagoon.core.LagoonException: 4444444444", 10);
    var0.setPassword("nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__");

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test429");


    nu.staldal.lagoon.producer.FOPFormatter var0 = new nu.staldal.lagoon.producer.FOPFormatter();
    java.lang.String var1 = var0.getEntryName();
    int var2 = var0.getPosition();
    var0.destroy();
    nu.staldal.lagoon.core.LagoonContext var4 = var0.getContext();
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

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test430");


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
      boolean var8 = var0.hasBeenUpdated(1433461932000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test431");


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
    var0.setPassword("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
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

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test432");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    var4.addAttribute("hi!", "", "hi!", "");
    java.lang.String var10 = var4.getTextContentOrNull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var12 = var4.getAttrValue("nu.staldal.ftp.FTPException~~ hi!");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test433");


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
    var38.processingInstruction("nu_46_staldal_46_lagoon_46_util_46_TemplateException", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_");
    nu.staldal.xmlutil.DocumentHandlerAdapter var43 = new nu.staldal.xmlutil.DocumentHandlerAdapter((org.xml.sax.DocumentHandler)var38);
    char[] var47 = new char[] { '4', '4', 'a'};
    var43.characters(var47, (-1), 0);
    var18.ignorableWhitespace(var47, (-1), 0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Text var57 = new nu.staldal.xtree.Text(var47, 10, 1, false);
      fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test434");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var17 = var2.lookupNamespaceURI("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.lang.String var18 = var2.getLocalName();
    var2.setLine((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test435");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    var0.endDocument();
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var0.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.AuthenticationMissingException");
    nu.staldal.xmlutil.ContentHandlerFixer var10 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0);
    char[] var13 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var17 = new nu.staldal.xtree.Text(var13, 1, 0, false);
    nu.staldal.xtree.TreeBuilder var18 = new nu.staldal.xtree.TreeBuilder();
    var18.endPrefixMapping("hi!");
    var18.endDocument();
    var18.startPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "hi_33_");
    var17.toSAX((org.xml.sax.ContentHandler)var18);
    var18.startPrefixMapping("nu.staldal.lagoon.util.TemplateException", "");
    var18.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.xmlutil.ContentHandlerFixer var31 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var18);
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
    nu.staldal.xtree.Text var86 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var86.setLine(1);
    char[] var89 = var86.asCharArray();
    char[] var90 = var86.asCharArray();
    var54.characters(var90, 100, 1);
    var18.ignorableWhitespace(var90, 1, 0);
    var0.characters(var90, 0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
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
    assertNotNull(var89);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test436");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var11 = new nu.staldal.xtree.Element("hi!", "hi!");
    var11.addNamespaceMapping("", "");
    var2.addChild((nu.staldal.xtree.Node)var11);
    java.lang.String var18 = var11.getInheritedAttribute("", "hi!");
    int var19 = var11.getLineNumber();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var21 = var11.getAttributeNamespaceURI(1);
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

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test437");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("", "hi!", 10);
    var3.setSystemId("hi!");
    java.lang.String var7 = var3.lookupNamespaceURI("4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var9 = var3.getAttrValue("");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test438");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("nu__46__staldal__46__lagoon__46__core__46__AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test439");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var8 = var2.getAttrValueOrNull("", "");
    java.lang.String var9 = var2.getTextContent();
    var2.setColumn((-1));
    java.net.URL var12 = var2.getBaseURI();
    nu.staldal.xtree.TreeBuilder var13 = new nu.staldal.xtree.TreeBuilder();
    var13.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var18 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var13, false, false);
    var13.endPrefixMapping("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var13.skippedEntity("");
    var13.skippedEntity("nu.staldal.lagoon.core.LagoonException~ nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.outputEndElement((org.xml.sax.ContentHandler)var13);
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
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

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test440");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    var0.beforeBuild();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.hasBeenUpdated(1433461933000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test441");


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
    var0.afterBuild();
    var0.skippedEntity("hi__33__");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test442");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    org.apache.tools.ant.RuntimeConfigurable var7 = var0.getRuntimeConfigurableWrapper();
    var0.setTargetURL("4444444444");
    java.lang.String var10 = var0.getTaskName();
    nu.staldal.lagoon.util.TemplateException var12 = new nu.staldal.lagoon.util.TemplateException("hi_33_");
    var0.log((java.lang.Throwable)var12, 0);
    java.lang.String var15 = var0.getTaskType();
    org.apache.tools.ant.Location var16 = var0.getLocation();
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test443");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.util.TemplateException: nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"+ "'", var2.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"));

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test444");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL(" ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test445");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("4444444444", "", 0);
    java.lang.String var4 = var3.getTextContentOrNull();
    var3.setLine(10);
    var3.addNamespaceMapping("nu.staldal.lagoon.core.LagoonException: 4444444444", "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var11 = var3.getChild(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test446");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.hasBeenUpdated(1433461941000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test447");


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
    var0.endElement("                                                                                                    ", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__126____126____32__", "nu.staldal.ftp.FTPException:  ");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test448");


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
    var7.endDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var37 = var7.getTree();
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

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test449");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException~ ", "nu.staldal.lagoon.core.LagoonException: ", 100, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var6 = var4.getChild(10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test451");


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
    boolean var28 = var2.getPreserveSpace();
    
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
    assertTrue(var28 == false);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test452");


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
    boolean var15 = var0.hasBeenUpdated(1433461949000L);
    
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

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test453");


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
    java.lang.String var18 = var0.getTaskType();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test454");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException~ nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test455");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("4");
    boolean var2 = var1.isWhitespaceNode();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test456");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var20 = var2.getAttributeNamespaceURI(1);
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

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test457");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu.staldal.lagoon.core.LagoonException~ hi__33__", "nu.staldal.lagoon.core.LagoonException: ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException~ hi__33__"+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException~ hi__33__"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test458");


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
    var0.skippedEntity("hi_33_");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var39 = var0.getTree();
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

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test459");


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
    int var44 = var2.getLineNumber();
    
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
    assertTrue(var44 == (-1));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test460");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", 0, "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________", "nu.staldal.lagoon.core.LagoonException: nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__", "nu.staldal.lagoon.util.TemplateException~ ");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test461");


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
    nu.staldal.xtree.Element var20 = var8.getTree();
    java.lang.String var22 = var20.getAttrValueOrNull("          ");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test462");


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
    java.lang.String var56 = var1.getValue();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"+ "'", var56.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test463");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444"+ "'", var1.equals("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444"));

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test464");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.hasBeenUpdated(1433461948000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test465");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_", 10, "nu.staldal.ftp.FTPException:  ", "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu_46_staldal_46_lagoon_46_util_46_TemplateException");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test466");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: 4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"+ "'", var1.equals("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444"));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test467");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    java.lang.String var12 = var4.getAttributeLocalName((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String[] var14 = var4.getNamespaceMapping((-1));
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

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test468");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.processingInstruction("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test469");


    nu.staldal.lagoon.producer.XMLParse var0 = new nu.staldal.lagoon.producer.XMLParse();
    var0.init();
    nu.staldal.lagoon.core.ByteStreamProducer var2 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var3 = var0.getNext();
    nu.staldal.lagoon.core.ByteStreamProducer var4 = var0.getNext();
    var0.init();
    java.util.Enumeration var6 = var0.getParamNames();
    nu.staldal.lagoon.core.ByteStreamProducer var7 = var0.getNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test470");


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
      nu.staldal.lagoon.core.SourceManager var61 = var0.getSourceMan();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
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

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test471");


    nu.staldal.lagoon.producer.FileRead var0 = new nu.staldal.lagoon.producer.FileRead();
    var0.init();
    var0.init();
    var0.init();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var5 = var0.hasBeenUpdated(1433461955000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test472");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("nu.staldal.lagoon.core.LagoonException: 4444444444", "aa", 1);
    boolean var4 = var3.getPreserveSpace();
    nu.staldal.xtree.ProcessingInstruction var7 = new nu.staldal.xtree.ProcessingInstruction("nu.staldal.lagoon.core.LagoonException: ", "nu.staldal.lagoon.core.LagoonException: ");
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
    var30.startPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.producer.BasicSplit var34 = new nu.staldal.lagoon.producer.BasicSplit();
    nu.staldal.xtree.Text var36 = new nu.staldal.xtree.Text("hi!");
    char[] var37 = var36.asCharArray();
    var34.characters(var37, 1, 10);
    var34.skippedEntity("nu.staldal.lagoon.core.LagoonException: 4444444444");
    var34.endElement("hi_33_", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "4444444444");
    char[] var49 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var53 = new nu.staldal.xtree.Text(var49, 1, 0, false);
    char[] var54 = var53.asCharArray();
    var34.ignorableWhitespace(var54, 0, 10);
    var30.characters(var54, 0, 100);
    var30.startDocument();
    var30.endPrefixMapping("nu.staldal.lagoon.core.LagoonException~ ");
    var7.toSAX((org.xml.sax.ContentHandler)var30);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.outputStartElement((org.xml.sax.ContentHandler)var30);
      fail("Expected exception of type java.lang.Error");
    } catch (java.lang.Error e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test473");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setLine(100);
    java.lang.String var6 = var2.lookupNamespacePrefix("                                                                                                    ");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Node var8 = var2.removeChild(100);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test474");


    nu.staldal.lagoon.core.LagoonException var1 = new nu.staldal.lagoon.core.LagoonException("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: ");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: "+ "'", var2.equals("nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.util.TemplateException: "));

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test475");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    int var5 = var2.lookupAttribute("hi!", "hi!");
    nu.staldal.xtree.Element var6 = var2.getFirstChildElementOrNull();
    nu.staldal.xtree.Element var9 = new nu.staldal.xtree.Element("hi!", "hi!");
    var9.setSystemId("");
    java.net.URL var12 = var9.getBaseURI();
    java.lang.String var15 = var9.getAttrValueOrNull("", "");
    nu.staldal.xtree.Element var18 = new nu.staldal.xtree.Element("hi!", "hi!");
    var18.addNamespaceMapping("", "");
    var9.addChild((nu.staldal.xtree.Node)var18);
    java.lang.String var25 = var18.getInheritedAttribute("", "hi!");
    int var26 = var18.getColumnNumber();
    java.lang.String var27 = var18.getNamespaceURI();
    java.lang.String var30 = var18.getInheritedAttribute("nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_126__126__32_");
    java.lang.String var33 = var18.getInheritedAttribute("hi_33_", "nu.staldal.lagoon.util.TemplateException");
    boolean var34 = var18.getPreserveSpace();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.insertChild((nu.staldal.xtree.Node)var18, 10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test476");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var5 = new nu.staldal.ftp.FTPClient("nu.staldal.lagoon.core.LagoonException: hi_33_", 10, "nu.staldal.lagoon.core.LagoonException: nu.staldal.lagoon.core.LagoonException:                                                                                                     ", "nu.staldal.lagoon.core.LagoonException~ hi__33__", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
      fail("Expected exception of type java.net.UnknownHostException");
    } catch (java.net.UnknownHostException e) {
      // Expected exception.
    }

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test477");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.AuthenticationMissingException");
    java.lang.String var2 = var1.getValue();
    var1.setLine(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.core.AuthenticationMissingException"+ "'", var2.equals("nu.staldal.lagoon.core.AuthenticationMissingException"));

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test478");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var49 = var2.getAttributeNamespaceURI(100);
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

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test479");


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
    var0.init();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test480");


    java.lang.String var1 = nu.staldal.util.Utils.encodePath("nu.staldal.lagoon.core.LagoonException~~~~~~~~ hi________________33________________");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________"+ "'", var1.equals("nu.staldal.lagoon.core.LagoonException~~~~~~~~~~~~~~~~ hi________________________________33________________________________"));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test481");


    nu.staldal.xtree.Element var4 = new nu.staldal.xtree.Element("4444444444", "4444444444", 10, 10);
    int var7 = var4.lookupAttribute("4444444444", "hi!");
    java.lang.String var10 = var4.getInheritedAttribute("", "4444444444");
    int var13 = var4.lookupAttribute("nu.staldal.lagoon.util.TemplateException", "nu.staldal.lagoon.util.TemplateException");
    java.lang.String var14 = var4.getPublicId();
    java.lang.String var17 = var4.getAttrValueOrNull("nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444", "nu.staldal.lagoon.core.LagoonException: hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test482");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.matchWildcard("nu.staldal.ftp.FTPException:                                                                                                     ", "nu.staldal.ftp.FTPException: hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test483");


    nu.staldal.lagoon.producer.DirSource var0 = new nu.staldal.lagoon.producer.DirSource();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var2 = var0.hasBeenUpdated(1433461946000L);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test484");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!", "nu.staldal.lagoon.core.LagoonException~~~~ hi________33________");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!"+ "'", var2.equals("nu.staldal.lagoon.util.TemplateException: nu.staldal.ftp.FTPException: hi!"));

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test485");


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
    var22.processingInstruction("          ", "                                                                                                    ");
    char[] var85 = new char[] { '#', '#'};
    nu.staldal.xtree.Text var89 = new nu.staldal.xtree.Text(var85, 1, 0, false);
    char[] var90 = var89.asCharArray();
    var22.setDocumentLocator((org.xml.sax.Locator)var89);
    var22.endPrefixMapping("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    
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
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test486");


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
    var20.addNamespaceMapping("nu.staldal.ftp.FTPException~ hi!", "nu.staldal.lagoon.core.LagoonException: 4444444444");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var59 = var20.getAttributeValue(2);
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

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test487");


    nu.staldal.xtree.Element var2 = new nu.staldal.xtree.Element("hi!", "hi!");
    var2.setSystemId("");
    java.net.URL var5 = var2.getBaseURI();
    java.lang.String var7 = var2.getAttrValueOrNull("hi_33_");
    java.lang.String var10 = var2.getAttrValueOrNull("nu.staldal.lagoon.core.LagoonException: ", "nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    java.net.URL var11 = var2.getBaseURI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var14 = var2.getAttrValue("nu.staldal.lagoon.core.LagoonException~~ hi____33____", "nu.staldal.ftp.FTPException~~ hi!");
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

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test488");


    nu.staldal.lagoon.LagoonAntTask var0 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var3 = new nu.staldal.ftp.FTPException("hi!");
    var0.log("", (java.lang.Throwable)var3, 10);
    org.apache.tools.ant.Location var6 = var0.getLocation();
    nu.staldal.lagoon.core.LagoonException var9 = new nu.staldal.lagoon.core.LagoonException("4444444444");
    var0.log("4444444444", (java.lang.Throwable)var9, 100);
    java.lang.String var12 = var9.toString();
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
    var9.addSuppressed((java.lang.Throwable)var28);
    java.lang.String var32 = var28.toString();
    java.lang.String var33 = var28.toString();
    nu.staldal.lagoon.LagoonAntTask var34 = new nu.staldal.lagoon.LagoonAntTask();
    nu.staldal.ftp.FTPException var37 = new nu.staldal.ftp.FTPException("hi!");
    var34.log("", (java.lang.Throwable)var37, 10);
    var34.init();
    var34.init();
    java.lang.Object var42 = var34.clone();
    var34.init();
    java.lang.Object var44 = var34.clone();
    nu.staldal.lagoon.core.LagoonException var46 = new nu.staldal.lagoon.core.LagoonException("");
    java.lang.String var47 = var46.toString();
    var34.log((java.lang.Throwable)var46, 10);
    var28.addSuppressed((java.lang.Throwable)var46);
    java.lang.Exception var51 = var46.getException();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "nu.staldal.lagoon.core.LagoonException: 4444444444"+ "'", var12.equals("nu.staldal.lagoon.core.LagoonException: 4444444444"));
    
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
    assertTrue("'" + var32 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var32.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var33.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "nu.staldal.lagoon.core.LagoonException: "+ "'", var47.equals("nu.staldal.lagoon.core.LagoonException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test489");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException~~ ");
    var1.setPublicId("aa");

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test490");


    java.lang.String var1 = nu.staldal.util.Utils.encodePathAsIdentifier("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_"+ "'", var1.equals("nu_46_staldal_46_lagoon_46_util_46_TemplateException_58__32_nu_46_staldal_46_ftp_46_FTPException_58__32_hi_33_"));

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test491");


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
    java.lang.Object var28 = var11.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test492");


    nu.staldal.xtree.Element var3 = new nu.staldal.xtree.Element("hi!", "hi!", 0);
    var3.setPublicId("nu.staldal.lagoon.core.LagoonException~~ hi____33____");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var8 = var3.getAttrValue("nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444", "nu.staldal.ftp.FTPException:                                                                                                     ");
      fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test493");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var28 = var2.getFirstChildElement("nu.staldal.lagoon.util.TemplateException", "nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__nu__46__staldal__46__lagoon__46__core__46__LagoonException__58____32__4444444444");
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test494");


    boolean var1 = nu.staldal.util.Utils.pseudoAbsoluteURL("nu_46_staldal_46_ftp_46_FTPException_126__32_hi_33_");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test495");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.xtree.Element var22 = var2.getFirstChildElement("##", "nu.staldal.lagoon.util.TemplateException: ");
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
    assertNotNull(var19);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test496");


    java.lang.String var2 = nu.staldal.lagoon.util.Wildcard.instantiateWildcard("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_", "nu.staldal.lagoon.core.LagoonException: nu_46_staldal_46_lagoon_46_core_46_LagoonException_58__32_4444444444");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_"+ "'", var2.equals("_32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32__32_"));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test497");


    nu.staldal.lagoon.filestorage.LocalFileStorage var0 = new nu.staldal.lagoon.filestorage.LocalFileStorage();
    nu.staldal.lagoon.core.OutputHandler var2 = var0.createFile("4444444444");
    long var4 = var0.fileLastModified("4444444444");
    nu.staldal.lagoon.core.OutputHandler var6 = var0.createFile("4444444444");
    long var8 = var0.fileLastModified("nu.staldal.lagoon.core.LagoonException: ");
    nu.staldal.lagoon.core.OutputHandler var10 = var0.createFile("nu.staldal.lagoon.util.TemplateException");
    long var12 = var0.fileLastModified("nu_46_staldal_46_lagoon_46_core_46_AuthenticationMissingException");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1433461956000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1433461948000L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0L);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test498");


    nu.staldal.xtree.TreeBuilder var0 = new nu.staldal.xtree.TreeBuilder();
    var0.endPrefixMapping("hi!");
    nu.staldal.xmlutil.ContentHandlerFixer var5 = new nu.staldal.xmlutil.ContentHandlerFixer((org.xml.sax.ContentHandler)var0, false, true);
    var0.skippedEntity("nu.staldal.lagoon.util.TemplateException: ");
    nu.staldal.xmlutil.ContentHandlerAdapter var8 = new nu.staldal.xmlutil.ContentHandlerAdapter((org.xml.sax.ContentHandler)var0);
    var8.endDocument();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.processingInstruction("aa", "nu.staldal.lagoon.core.LagoonException~~ hi____33____");
      fail("Expected exception of type java.util.EmptyStackException");
    } catch (java.util.EmptyStackException e) {
      // Expected exception.
    }

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test499");


    nu.staldal.xtree.Text var1 = new nu.staldal.xtree.Text("nu.staldal.lagoon.core.LagoonException~ hi__33__");

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest2.test500");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      nu.staldal.ftp.FTPClient var2 = new nu.staldal.ftp.FTPClient("          ", "                                                                                                    ");
      fail("Expected exception of type java.net.MalformedURLException");
    } catch (java.net.MalformedURLException e) {
      // Expected exception.
    }

  }

}
