/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_RET;
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
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData(0, (JniInchiInput) null, 1, "*}kLIi2d30");
      jniInchiInputData0.getInput();
      assertEquals(INCHI_RET.OKAY, jniInchiInputData0.getReturnValue());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiInputData.getReturnValue()Lnet/sf/jniinchi/INCHI_RET;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData(0, (JniInchiInput) null, 1, "*}kLIi2d30");
      INCHI_RET iNCHI_RET0 = jniInchiInputData0.getReturnValue();
      assertEquals(INCHI_RET.OKAY, iNCHI_RET0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiInputData.getErrorMessage()Ljava/lang/String;: root-Branch
   * 2 net.sf.jniinchi.JniInchiInputData.<init>(ILnet/sf/jniinchi/JniInchiInput;ILjava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      JniInchiInput jniInchiInput0 = new JniInchiInput();
      JniInchiInputData jniInchiInputData0 = new JniInchiInputData(1585, jniInchiInput0, (-6), "|");
      String string0 = jniInchiInputData0.getErrorMessage();
      assertEquals("|", string0);
  }
}
