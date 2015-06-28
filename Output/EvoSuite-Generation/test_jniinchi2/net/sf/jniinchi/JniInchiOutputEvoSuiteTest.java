/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_RET;
import net.sf.jniinchi.JniInchiOutput;

public class JniInchiOutputEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiOutput.getReturnStatus()Lnet/sf/jniinchi/INCHI_RET;: root-Branch
   * 2 net.sf.jniinchi.JniInchiOutput.<init>(Lnet/sf/jniinchi/INCHI_RET;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.ERROR;
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput(iNCHI_RET0, "K&H", "K&H", "UNKNOWN", "UNKNOWN");
      jniInchiOutput0.getReturnStatus();
      assertEquals("InChI_Output: ERROR/K&H/K&H/UNKNOWN/UNKNOWN", jniInchiOutput0.toString());
      assertEquals("K&H", jniInchiOutput0.getAuxInfo());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiOutput.getMessage()Ljava/lang/String;: root-Branch
   * 2 net.sf.jniinchi.JniInchiOutput.<init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput(83, "S", "S", "S", "S");
      String string0 = jniInchiOutput0.getMessage();
      assertEquals("S", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.getAuxInfo()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.OKAY;
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput(iNCHI_RET0, "&ZFtb", "&ZFtb", "&ZFtb", "&ZFtb");
      String string0 = jniInchiOutput0.getAuxInfo();
      assertEquals("&ZFtb", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput(83, "S", "S", "S", "S");
      String string0 = jniInchiOutput0.toString();
      assertEquals("InChI_Output: null/S/S/S/S", string0);
      assertNotNull(string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.getLog()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.OKAY;
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput(iNCHI_RET0, "&ZFtb", "&ZFtb", "&ZFtb", "&ZFtb");
      String string0 = jniInchiOutput0.getLog();
      assertEquals("&ZFtb", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.setInchi(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.OKAY;
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput(iNCHI_RET0, "&ZFtb", "&ZFtb", "&ZFtb", "&ZFtb");
      jniInchiOutput0.setInchi("&ZFtb");
      assertEquals(INCHI_RET.OKAY, jniInchiOutput0.getReturnStatus());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.setLog(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput(83, "S", "S", "S", "S");
      jniInchiOutput0.setLog("A|;8$8FrX\".yt_IEBM");
      assertNull(jniInchiOutput0.getReturnStatus());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.setAuxInfo(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput(83, "S", "S", "S", "S");
      jniInchiOutput0.setAuxInfo("{*d?4Q- 9AYE");
      assertEquals("{*d?4Q- 9AYE", jniInchiOutput0.getAuxInfo());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.setRetStatus(Lnet/sf/jniinchi/INCHI_RET;)V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.OKAY;
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput(iNCHI_RET0, "&ZFtb", "&ZFtb", "&ZFtb", "&ZFtb");
      jniInchiOutput0.setRetStatus(iNCHI_RET0);
      assertEquals("&ZFtb", jniInchiOutput0.getInchi());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutput.getInchi()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput(83, "S", "S", "S", "S");
      String string0 = jniInchiOutput0.getInchi();
      assertEquals("S", string0);
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * 1 net.sf.jniinchi.JniInchiOutput.setMessage(Ljava/lang/String;)V: root-Branch
   * 2 net.sf.jniinchi.JniInchiOutput.<init>(Lnet/sf/jniinchi/INCHI_RET;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * 3 net.sf.jniinchi.JniInchiOutput.<init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      JniInchiOutput jniInchiOutput0 = new JniInchiOutput(83, "S", "S", "S", "S");
      jniInchiOutput0.setMessage("SOJ<QY(.\"Uc*=n");
      assertEquals("InChI_Output: null/S/S/SOJ<QY(.\"Uc*=n/S", jniInchiOutput0.toString());
  }
}
