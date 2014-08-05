/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_KEY_STATUS;

public class INCHI_KEY_STATUSEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_KEY_STATUS.getIndx()I: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      INCHI_KEY_STATUS iNCHI_KEY_STATUS0 = INCHI_KEY_STATUS.INVALID_VERSION;
      int int0 = iNCHI_KEY_STATUS0.getIndx();
      assertEquals(3, int0);
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * 1 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 1 TABLESWITCH L66 Case -1 - true
   * 2 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 2 TABLESWITCH L66 Case 0 - false
   * 3 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 3 TABLESWITCH L66 Case 1 - false
   * 4 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 4 TABLESWITCH L66 Case 2 - false
   * 5 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 5 TABLESWITCH L66 Case 3 - false
   * 6 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 6 TABLESWITCH L66 Default-Case - false
   */
  @Test
  public void test1()  throws Throwable  {
      INCHI_KEY_STATUS iNCHI_KEY_STATUS0 = INCHI_KEY_STATUS.getValue((-1));
      assertEquals(INCHI_KEY_STATUS.VALID_NON_STANDARD, iNCHI_KEY_STATUS0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 1 TABLESWITCH L66 Case -1 - false
   * 2 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 6 TABLESWITCH L66 Default-Case - true
   */
  @Test
  public void test2()  throws Throwable  {
      INCHI_KEY_STATUS.getValue(1759385261);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 2 TABLESWITCH L66 Case 0 - true
   */
  @Test
  public void test3()  throws Throwable  {
      INCHI_KEY_STATUS iNCHI_KEY_STATUS0 = INCHI_KEY_STATUS.getValue(0);
      assertEquals(INCHI_KEY_STATUS.VALID_STANDARD, iNCHI_KEY_STATUS0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 3 TABLESWITCH L66 Case 1 - true
   */
  @Test
  public void test4()  throws Throwable  {
      INCHI_KEY_STATUS iNCHI_KEY_STATUS0 = INCHI_KEY_STATUS.getValue(1);
      assertEquals(INCHI_KEY_STATUS.INVALID_LENGTH, iNCHI_KEY_STATUS0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 4 TABLESWITCH L66 Case 2 - true
   * 2 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 5 TABLESWITCH L66 Case 3 - false
   */
  @Test
  public void test5()  throws Throwable  {
      INCHI_KEY_STATUS iNCHI_KEY_STATUS0 = INCHI_KEY_STATUS.getValue(2);
      assertEquals(INCHI_KEY_STATUS.INVALID_LAYOUT, iNCHI_KEY_STATUS0);
  }

  //Test case number: 6
  /*
   * 6 covered goals:
   * 1 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 5 TABLESWITCH L66 Case 3 - true
   * 2 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 1 TABLESWITCH L66 Case -1 - false
   * 3 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 2 TABLESWITCH L66 Case 0 - false
   * 4 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 3 TABLESWITCH L66 Case 1 - false
   * 5 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 4 TABLESWITCH L66 Case 2 - false
   * 6 net.sf.jniinchi.INCHI_KEY_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_KEY_STATUS;: I3 Branch 6 TABLESWITCH L66 Default-Case - false
   */
  @Test
  public void test6()  throws Throwable  {
      INCHI_KEY_STATUS iNCHI_KEY_STATUS0 = INCHI_KEY_STATUS.getValue(3);
      assertEquals(INCHI_KEY_STATUS.INVALID_VERSION, iNCHI_KEY_STATUS0);
  }
}