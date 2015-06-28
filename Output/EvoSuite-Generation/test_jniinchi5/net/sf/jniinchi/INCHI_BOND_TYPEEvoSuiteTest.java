/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_BOND_TYPE;

public class INCHI_BOND_TYPEEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_BOND_TYPE.getIndx()I: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.ALTERN;
      int int0 = iNCHI_BOND_TYPE0.getIndx();
      assertEquals(4, int0);
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * 1 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 1 TABLESWITCH L70 Case 0 - true
   * 2 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 2 TABLESWITCH L70 Case 1 - false
   * 3 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 3 TABLESWITCH L70 Case 2 - false
   * 4 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 4 TABLESWITCH L70 Case 3 - false
   * 5 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 5 TABLESWITCH L70 Case 4 - false
   * 6 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 6 TABLESWITCH L70 Default-Case - false
   */
  @Test
  public void test1()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.getValue(0);
      assertEquals(INCHI_BOND_TYPE.NONE, iNCHI_BOND_TYPE0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 1 TABLESWITCH L70 Case 0 - false
   * 2 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 4 TABLESWITCH L70 Case 3 - true
   */
  @Test
  public void test2()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.getValue(3);
      assertEquals(INCHI_BOND_TYPE.TRIPLE, iNCHI_BOND_TYPE0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 2 TABLESWITCH L70 Case 1 - true
   */
  @Test
  public void test3()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.getValue(1);
      assertEquals(INCHI_BOND_TYPE.SINGLE, iNCHI_BOND_TYPE0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 3 TABLESWITCH L70 Case 2 - true
   */
  @Test
  public void test4()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.getValue(2);
      assertEquals(INCHI_BOND_TYPE.DOUBLE, iNCHI_BOND_TYPE0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 5 TABLESWITCH L70 Case 4 - true
   * 2 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 6 TABLESWITCH L70 Default-Case - false
   */
  @Test
  public void test5()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.getValue(4);
      assertEquals(INCHI_BOND_TYPE.ALTERN, iNCHI_BOND_TYPE0);
  }

  //Test case number: 6
  /*
   * 6 covered goals:
   * 1 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 6 TABLESWITCH L70 Default-Case - true
   * 2 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 1 TABLESWITCH L70 Case 0 - false
   * 3 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 2 TABLESWITCH L70 Case 1 - false
   * 4 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 3 TABLESWITCH L70 Case 2 - false
   * 5 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 4 TABLESWITCH L70 Case 3 - false
   * 6 net.sf.jniinchi.INCHI_BOND_TYPE.getValue(I)Lnet/sf/jniinchi/INCHI_BOND_TYPE;: I3 Branch 5 TABLESWITCH L70 Case 4 - false
   */
  @Test
  public void test6()  throws Throwable  {
      INCHI_BOND_TYPE.getValue((-1697));
  }
}
