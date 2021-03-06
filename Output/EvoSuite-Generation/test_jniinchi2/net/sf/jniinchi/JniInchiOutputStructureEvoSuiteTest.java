/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_RET;
import net.sf.jniinchi.JniInchiOutputStructure;

public class JniInchiOutputStructureEvoSuiteTest {


  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 net.sf.jniinchi.JniInchiOutputStructure.getLog()Ljava/lang/String;: root-Branch
   * 2 net.sf.jniinchi.JniInchiOutputStructure.setMessage(Ljava/lang/String;)V: root-Branch
   * 3 net.sf.jniinchi.JniInchiOutputStructure.<init>(Lnet/sf/jniinchi/INCHI_RET;)V: root-Branch
   * 4 net.sf.jniinchi.JniInchiOutputStructure.setLog(Ljava/lang/String;)V: root-Branch
   * 5 net.sf.jniinchi.JniInchiOutputStructure.setWarningFlags(JJJJ)V: root-Branch
   * 6 net.sf.jniinchi.JniInchiOutputStructure.<init>(ILjava/lang/String;Ljava/lang/String;JJJJ)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(6, "TETRAHEDRAL", "TETRAHEDRAL", (long) 1259, (long) 6, 1L, (-1L));
      String string0 = jniInchiOutputStructure0.getLog();
      assertEquals("TETRAHEDRAL", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutputStructure.getReturnStatus()Lnet/sf/jniinchi/INCHI_RET;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.WARNING;
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(iNCHI_RET0);
      INCHI_RET iNCHI_RET1 = jniInchiOutputStructure0.getReturnStatus();
      assertEquals(INCHI_RET.WARNING, iNCHI_RET1);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutputStructure.getMessage()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(6, "", "", 0L, (long) 6, 0L, 0L);
      String string0 = jniInchiOutputStructure0.getMessage();
      assertEquals("", string0);
  }

  //Test case number: 3
  /*
   * 5 covered goals:
   * 1 net.sf.jniinchi.JniInchiOutputStructure.getWarningFlags()[[J: root-Branch
   * 2 net.sf.jniinchi.JniInchiOutputStructure.setMessage(Ljava/lang/String;)V: root-Branch
   * 3 net.sf.jniinchi.JniInchiOutputStructure.setLog(Ljava/lang/String;)V: root-Branch
   * 4 net.sf.jniinchi.JniInchiOutputStructure.setWarningFlags(JJJJ)V: root-Branch
   * 5 net.sf.jniinchi.JniInchiOutputStructure.<init>(ILjava/lang/String;Ljava/lang/String;JJJJ)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(1531, "", "", (-949L), (long) 1531, 1222L, (-949L));
      long[][] longArray0 = jniInchiOutputStructure0.getWarningFlags();
      assertNotNull(longArray0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutputStructure.setWarningFlags([[J)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.WARNING;
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(iNCHI_RET0);
      long[][] longArray0 = new long[1][5];
      jniInchiOutputStructure0.setWarningFlags(longArray0);
      assertEquals(0, jniInchiOutputStructure0.getNumStereo0D());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiOutputStructure.setRetStatus(Lnet/sf/jniinchi/INCHI_RET;)V: root-Branch
   * 2 net.sf.jniinchi.JniInchiOutputStructure.<init>(Lnet/sf/jniinchi/INCHI_RET;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.WARNING;
      JniInchiOutputStructure jniInchiOutputStructure0 = new JniInchiOutputStructure(iNCHI_RET0);
      jniInchiOutputStructure0.setRetStatus(iNCHI_RET0);
      assertEquals(0, jniInchiOutputStructure0.getNumBonds());
  }
}
