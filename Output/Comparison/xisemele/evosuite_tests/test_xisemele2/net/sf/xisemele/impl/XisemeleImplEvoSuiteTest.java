/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xisemele.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.xisemele.impl.Factory;
import net.sf.xisemele.impl.FormatterProvider;
import net.sf.xisemele.impl.XisemeleImpl;

public class XisemeleImplEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.XisemeleImpl.<init>(Lnet/sf/xisemele/impl/Factory;Lnet/sf/xisemele/impl/FormatterProvider;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      XisemeleImpl xisemeleImpl0 = null;
      try {
        xisemeleImpl0 = new XisemeleImpl((Factory) null, (FormatterProvider) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}