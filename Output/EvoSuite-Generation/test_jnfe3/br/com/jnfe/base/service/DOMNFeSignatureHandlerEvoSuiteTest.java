/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import br.com.jnfe.base.service.DOMNFeSignatureHandler;
import br.com.jnfe.base.service.SecurityHandler;
import br.com.jnfe.base.service.SignatureBuilder;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMStructure;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class DOMNFeSignatureHandlerEvoSuiteTest {


  //Test case number: 0
  /*
   * 5 covered goals:
   * 1 br.com.jnfe.base.service.DOMNFeSignatureHandler$1.<init>(Lbr/com/jnfe/base/service/DOMNFeSignatureHandler;)V: root-Branch
   * 2 br.com.jnfe.base.service.DOMNFeSignatureHandler.<init>()V: root-Branch
   * 3 br.com.jnfe.base.service.DOMNFeSignatureHandler.sign(Ljavax/xml/crypto/XMLStructure;Ljava/lang/String;)V: I27 Branch 1 IFNULL L50 - false
   * 4 br.com.jnfe.base.service.DOMNFeSignatureHandler.sign(Ljavax/xml/crypto/XMLStructure;Ljava/lang/String;)V: I30 Branch 2 IFLE L50 - false
   * 5 br.com.jnfe.base.service.DOMNFeSignatureHandler.sign(Ljavax/xml/crypto/XMLStructure;Ljava/lang/String;)V: I39 Branch 3 IF_ICMPGE L51 - false
   */
  @Test
  public void test0()  throws Throwable  {
      DOMNFeSignatureHandler dOMNFeSignatureHandler0 = new DOMNFeSignatureHandler();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("7}piJs.rteeC");
      DOMStructure dOMStructure0 = new DOMStructure((Node) iIOMetadataNode0);
      try {
        dOMNFeSignatureHandler0.sign((XMLStructure) dOMStructure0, "7}piJs.rteeC");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.service.DOMNFeSignatureHandler.setSecurityHandler(Lbr/com/jnfe/base/service/SecurityHandler;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DOMNFeSignatureHandler dOMNFeSignatureHandler0 = new DOMNFeSignatureHandler();
      dOMNFeSignatureHandler0.setSecurityHandler((SecurityHandler) null);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 br.com.jnfe.base.service.DOMNFeSignatureHandler.setSignatureBuilder(Lbr/com/jnfe/base/service/SignatureBuilder;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DOMNFeSignatureHandler dOMNFeSignatureHandler0 = new DOMNFeSignatureHandler();
      dOMNFeSignatureHandler0.setSignatureBuilder((SignatureBuilder<Element>) null);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 br.com.jnfe.base.service.DOMNFeSignatureHandler.sign(Ljavax/xml/crypto/XMLStructure;Ljava/lang/String;)V: I30 Branch 2 IFLE L50 - true
   * 2 br.com.jnfe.base.service.DOMNFeSignatureHandler.<init>()V: root-Branch
   * 3 br.com.jnfe.base.service.DOMNFeSignatureHandler.sign(Ljavax/xml/crypto/XMLStructure;Ljava/lang/String;)V: I27 Branch 1 IFNULL L50 - false
   */
  @Test
  public void test3()  throws Throwable  {
      DOMNFeSignatureHandler dOMNFeSignatureHandler0 = new DOMNFeSignatureHandler();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("7}piJs.rteeC");
      DOMStructure dOMStructure0 = new DOMStructure((Node) iIOMetadataNode0);
      dOMNFeSignatureHandler0.sign((XMLStructure) dOMStructure0, "VV|`A9kB");
  }
}
