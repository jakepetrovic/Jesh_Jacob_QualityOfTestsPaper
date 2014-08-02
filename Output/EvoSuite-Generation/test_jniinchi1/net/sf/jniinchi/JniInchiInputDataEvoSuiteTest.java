/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.JniInchiInput;
import net.sf.jniinchi.JniInchiInputData;

public class JniInchiInputDataEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiInputData.getInput()Lnet/sf/jniinchi/JniInchiInput;: root-Branch
   * 2 net.sf.jniinchi.JniInchiInputData.<init>(ILnet/sf/jniinchi/JniInchiInput;ILjava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData(1521, (JniInchiInput) null, 655, "]xm@w*Nhw<@.*");
      JniInchiInput jniInchiInput0 = jniInchiInputData0.getInput();
      assertNull(jniInchiInput0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiInputData.getReturnValue()Lnet/sf/jniinchi/INCHI_RET;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData(1521, (JniInchiInput) null, 655, "]xm@w*Nhw<@.*");
      jniInchiInputData0.getReturnValue();
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiInputData.getErrorMessage()Ljava/lang/String;: root-Branch
   * 2 net.sf.jniinchi.JniInchiInputData.<init>(ILnet/sf/jniinchi/JniInchiInput;ILjava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData(1521, (JniInchiInput) null, 655, "]xm@w*Nhw<@.*");
      String string0 = jniInchiInputData0.getErrorMessage();
      assertEquals("]xm@w*Nhw<@.*", string0);
  }
}
