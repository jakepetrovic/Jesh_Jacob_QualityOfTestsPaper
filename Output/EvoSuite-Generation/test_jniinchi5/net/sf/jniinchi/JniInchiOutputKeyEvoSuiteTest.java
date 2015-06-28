/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_KEY;
import net.sf.jniinchi.JniInchiException;
import net.sf.jniinchi.JniInchiOutputKey;

public class JniInchiOutputKeyEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 net.sf.jniinchi.JniInchiOutputKey.getKey()Ljava/lang/String;: root-Branch
   * 2 net.sf.jniinchi.JniInchiOutputKey.<init>(Lnet/sf/jniinchi/INCHI_KEY;Ljava/lang/String;)V: I7 Branch 1 IFNONNULL L32 - true
   * 3 net.sf.jniinchi.JniInchiOutputKey.<init>(Lnet/sf/jniinchi/INCHI_KEY;Ljava/lang/String;)V: I19 Branch 2 IF_ACMPNE L36 - true
   */
  @Test
  public void test0()  throws Throwable  {
      INCHI_KEY iNCHI_KEY0 = INCHI_KEY.INVALID_INCHI;
      JniInchiOutputKey jniInchiOutputKey0 = new JniInchiOutputKey(iNCHI_KEY0, "cbJ4c9?qSu7");
      String string0 = jniInchiOutputKey0.getKey();
      assertEquals("cbJ4c9?qSu7", string0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiOutputKey.getReturnStatus()Lnet/sf/jniinchi/INCHI_KEY;: root-Branch
   * 2 net.sf.jniinchi.JniInchiOutputKey.<init>(Lnet/sf/jniinchi/INCHI_KEY;Ljava/lang/String;)V: I19 Branch 2 IF_ACMPNE L36 - true
   */
  @Test
  public void test1()  throws Throwable  {
      INCHI_KEY iNCHI_KEY0 = INCHI_KEY.INVALID_INCHI;
      JniInchiOutputKey jniInchiOutputKey0 = new JniInchiOutputKey(iNCHI_KEY0, "cbJ4c9?qSu7");
      INCHI_KEY iNCHI_KEY1 = jniInchiOutputKey0.getReturnStatus();
      assertEquals("INVALID_INCHI", iNCHI_KEY1.toString());
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 net.sf.jniinchi.JniInchiOutputKey.<init>(ILjava/lang/String;)V: root-Branch
   * 2 net.sf.jniinchi.JniInchiOutputKey.<init>(Lnet/sf/jniinchi/INCHI_KEY;Ljava/lang/String;)V: I19 Branch 2 IF_ACMPNE L36 - false
   * 3 net.sf.jniinchi.JniInchiOutputKey.<init>(Lnet/sf/jniinchi/INCHI_KEY;Ljava/lang/String;)V: I23 Branch 3 IFNONNULL L37 - true
   */
  @Test
  public void test2()  throws Throwable  {
      JniInchiOutputKey jniInchiOutputKey0 = new JniInchiOutputKey(0, "cbJ4c9?qSu7");
      assertEquals(INCHI_KEY.OK, jniInchiOutputKey0.getReturnStatus());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiOutputKey.<init>(Lnet/sf/jniinchi/INCHI_KEY;Ljava/lang/String;)V: I7 Branch 1 IFNONNULL L32 - false
   */
  @Test
  public void test3()  throws Throwable  {
      JniInchiOutputKey jniInchiOutputKey0 = null;
      try {
        jniInchiOutputKey0 = new JniInchiOutputKey(6, "EMPTY_INPUT");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * Null return status
         */
      }
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * 1 net.sf.jniinchi.JniInchiOutputKey.<init>(Lnet/sf/jniinchi/INCHI_KEY;Ljava/lang/String;)V: I23 Branch 3 IFNONNULL L37 - false
   * 2 net.sf.jniinchi.JniInchiOutputKey.<init>(Lnet/sf/jniinchi/INCHI_KEY;Ljava/lang/String;)V: I7 Branch 1 IFNONNULL L32 - true
   * 3 net.sf.jniinchi.JniInchiOutputKey.<init>(Lnet/sf/jniinchi/INCHI_KEY;Ljava/lang/String;)V: I19 Branch 2 IF_ACMPNE L36 - false
   */
  @Test
  public void test4()  throws Throwable  {
      JniInchiOutputKey jniInchiOutputKey0 = null;
      try {
        jniInchiOutputKey0 = new JniInchiOutputKey(0, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * Null InChIkey
         */
      }
  }
}
