/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_STATUS;

public class INCHI_STATUSEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_STATUS.getIndx()I: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      INCHI_STATUS iNCHI_STATUS0 = INCHI_STATUS.INVALID_LAYOUT;
      int int0 = iNCHI_STATUS0.getIndx();
      assertEquals(3, int0);
  }

  //Test case number: 1
  /*
   * 7 covered goals:
   * 1 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 1 TABLESWITCH L51 Case -1 - true
   * 2 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 2 TABLESWITCH L51 Case 0 - false
   * 3 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 3 TABLESWITCH L51 Case 1 - false
   * 4 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 4 TABLESWITCH L51 Case 2 - false
   * 5 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 5 TABLESWITCH L51 Case 3 - false
   * 6 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 6 TABLESWITCH L51 Case 4 - false
   * 7 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 7 TABLESWITCH L51 Default-Case - false
   */
  @Test
  public void test1()  throws Throwable  {
      INCHI_STATUS iNCHI_STATUS0 = INCHI_STATUS.getValue((-1));
      assertEquals(INCHI_STATUS.VALID_NON_STANDARD, iNCHI_STATUS0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 1 TABLESWITCH L51 Case -1 - false
   * 2 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 4 TABLESWITCH L51 Case 2 - true
   */
  @Test
  public void test2()  throws Throwable  {
      INCHI_STATUS iNCHI_STATUS0 = INCHI_STATUS.getValue(2);
      assertEquals(INCHI_STATUS.INVALID_VERSION, iNCHI_STATUS0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 2 TABLESWITCH L51 Case 0 - true
   */
  @Test
  public void test3()  throws Throwable  {
      INCHI_STATUS iNCHI_STATUS0 = INCHI_STATUS.getValue(0);
      assertEquals(INCHI_STATUS.VALID_STANDARD, iNCHI_STATUS0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 3 TABLESWITCH L51 Case 1 - true
   */
  @Test
  public void test4()  throws Throwable  {
      INCHI_STATUS iNCHI_STATUS0 = INCHI_STATUS.getValue(1);
      assertEquals(INCHI_STATUS.INVALID_PREFIX, iNCHI_STATUS0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 5 TABLESWITCH L51 Case 3 - true
   */
  @Test
  public void test5()  throws Throwable  {
      INCHI_STATUS iNCHI_STATUS0 = INCHI_STATUS.getValue(3);
      assertEquals(INCHI_STATUS.INVALID_LAYOUT, iNCHI_STATUS0);
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 6 TABLESWITCH L51 Case 4 - true
   * 2 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 7 TABLESWITCH L51 Default-Case - false
   */
  @Test
  public void test6()  throws Throwable  {
      INCHI_STATUS iNCHI_STATUS0 = INCHI_STATUS.getValue(4);
      assertEquals(INCHI_STATUS.FAIL_I2I, iNCHI_STATUS0);
  }

  //Test case number: 7
  /*
   * 7 covered goals:
   * 1 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 7 TABLESWITCH L51 Default-Case - true
   * 2 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 1 TABLESWITCH L51 Case -1 - false
   * 3 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 2 TABLESWITCH L51 Case 0 - false
   * 4 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 3 TABLESWITCH L51 Case 1 - false
   * 5 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 4 TABLESWITCH L51 Case 2 - false
   * 6 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 5 TABLESWITCH L51 Case 3 - false
   * 7 net.sf.jniinchi.INCHI_STATUS.getValue(I)Lnet/sf/jniinchi/INCHI_STATUS;: I3 Branch 6 TABLESWITCH L51 Case 4 - false
   */
  @Test
  public void test7()  throws Throwable  {
      INCHI_STATUS.getValue(610908950);
  }
}
