/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_RADICAL;

public class INCHI_RADICALEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_RADICAL.getIndx()I: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.DOUBLET;
      int int0 = iNCHI_RADICAL0.getIndx();
      assertEquals(2, int0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 1 TABLESWITCH L71 Case 0 - true
   * 2 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 2 TABLESWITCH L71 Case 1 - false
   * 3 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 3 TABLESWITCH L71 Case 2 - false
   * 4 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 4 TABLESWITCH L71 Case 3 - false
   * 5 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 5 TABLESWITCH L71 Default-Case - false
   */
  @Test
  public void test1()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.getValue(0);
      assertEquals(INCHI_RADICAL.NONE, iNCHI_RADICAL0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 1 TABLESWITCH L71 Case 0 - false
   * 2 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 3 TABLESWITCH L71 Case 2 - true
   */
  @Test
  public void test2()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.getValue(2);
      assertEquals(INCHI_RADICAL.DOUBLET, iNCHI_RADICAL0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 2 TABLESWITCH L71 Case 1 - true
   */
  @Test
  public void test3()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.getValue(1);
      assertEquals(INCHI_RADICAL.SINGLET, iNCHI_RADICAL0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 4 TABLESWITCH L71 Case 3 - true
   * 2 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 5 TABLESWITCH L71 Default-Case - false
   */
  @Test
  public void test4()  throws Throwable  {
      INCHI_RADICAL iNCHI_RADICAL0 = INCHI_RADICAL.getValue(3);
      assertEquals(INCHI_RADICAL.TRIPLET, iNCHI_RADICAL0);
  }

  //Test case number: 5
  /*
   * 5 covered goals:
   * 1 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 5 TABLESWITCH L71 Default-Case - true
   * 2 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 1 TABLESWITCH L71 Case 0 - false
   * 3 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 2 TABLESWITCH L71 Case 1 - false
   * 4 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 3 TABLESWITCH L71 Case 2 - false
   * 5 net.sf.jniinchi.INCHI_RADICAL.getValue(I)Lnet/sf/jniinchi/INCHI_RADICAL;: I3 Branch 4 TABLESWITCH L71 Case 3 - false
   */
  @Test
  public void test5()  throws Throwable  {
      INCHI_RADICAL.getValue(37);
  }
}
