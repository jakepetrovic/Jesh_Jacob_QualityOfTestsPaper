/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xisemele.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.xisemele.impl.MessageImpl;

public class MessageImplEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.MessageImpl.getMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   * 2 net.sf.xisemele.impl.MessageImpl.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      MessageImpl messageImpl0 = new MessageImpl();
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try {
        messageImpl0.getMessage((String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
