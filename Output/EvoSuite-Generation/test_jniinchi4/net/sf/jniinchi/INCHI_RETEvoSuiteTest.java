/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_RET;

public class INCHI_RETEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_RET.getIndx()I: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.ERROR;
      int int0 = iNCHI_RET0.getIndx();
      assertEquals(2, int0);
  }

  //Test case number: 1
  /*
   * 9 covered goals:
   * 1 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 1 TABLESWITCH L101 Case -2 - true
   * 2 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 2 TABLESWITCH L101 Case -1 - false
   * 3 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 3 TABLESWITCH L101 Case 0 - false
   * 4 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 4 TABLESWITCH L101 Case 1 - false
   * 5 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 5 TABLESWITCH L101 Case 2 - false
   * 6 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 6 TABLESWITCH L101 Case 3 - false
   * 7 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 7 TABLESWITCH L101 Case 4 - false
   * 8 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 8 TABLESWITCH L101 Case 5 - false
   * 9 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 9 TABLESWITCH L101 Default-Case - false
   */
  @Test
  public void test1()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue((-2));
      assertEquals(INCHI_RET.SKIP, iNCHI_RET0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 1 TABLESWITCH L101 Case -2 - false
   * 2 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 5 TABLESWITCH L101 Case 2 - true
   */
  @Test
  public void test2()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue(2);
      assertEquals(INCHI_RET.ERROR, iNCHI_RET0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 2 TABLESWITCH L101 Case -1 - true
   */
  @Test
  public void test3()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue((-1));
      assertEquals(INCHI_RET.EOF, iNCHI_RET0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 3 TABLESWITCH L101 Case 0 - true
   */
  @Test
  public void test4()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue(0);
      assertEquals(INCHI_RET.OKAY, iNCHI_RET0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 4 TABLESWITCH L101 Case 1 - true
   */
  @Test
  public void test5()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue(1);
      assertEquals(INCHI_RET.WARNING, iNCHI_RET0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 6 TABLESWITCH L101 Case 3 - true
   */
  @Test
  public void test6()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue(3);
      assertEquals(INCHI_RET.FATAL, iNCHI_RET0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 7 TABLESWITCH L101 Case 4 - true
   */
  @Test
  public void test7()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue(4);
      assertEquals(INCHI_RET.UNKNOWN, iNCHI_RET0);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 8 TABLESWITCH L101 Case 5 - true
   * 2 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 9 TABLESWITCH L101 Default-Case - false
   */
  @Test
  public void test8()  throws Throwable  {
      INCHI_RET iNCHI_RET0 = INCHI_RET.getValue(5);
      assertEquals(INCHI_RET.BUSY, iNCHI_RET0);
  }

  //Test case number: 9
  /*
   * 9 covered goals:
   * 1 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 9 TABLESWITCH L101 Default-Case - true
   * 2 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 1 TABLESWITCH L101 Case -2 - false
   * 3 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 2 TABLESWITCH L101 Case -1 - false
   * 4 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 3 TABLESWITCH L101 Case 0 - false
   * 5 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 4 TABLESWITCH L101 Case 1 - false
   * 6 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 5 TABLESWITCH L101 Case 2 - false
   * 7 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 6 TABLESWITCH L101 Case 3 - false
   * 8 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 7 TABLESWITCH L101 Case 4 - false
   * 9 net.sf.jniinchi.INCHI_RET.getValue(I)Lnet/sf/jniinchi/INCHI_RET;: I3 Branch 8 TABLESWITCH L101 Case 5 - false
   */
  @Test
  public void test9()  throws Throwable  {
      INCHI_RET.getValue(1006);
  }
}
