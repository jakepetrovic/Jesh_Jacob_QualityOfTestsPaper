/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_STEREOTYPE;

public class INCHI_STEREOTYPEEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_STEREOTYPE.getIndx()I: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      INCHI_STEREOTYPE iNCHI_STEREOTYPE0 = INCHI_STEREOTYPE.ALLENE;
      int int0 = iNCHI_STEREOTYPE0.getIndx();
      assertEquals(3, int0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 1 TABLESWITCH L68 Case 0 - true
   * 2 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 2 TABLESWITCH L68 Case 1 - false
   * 3 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 3 TABLESWITCH L68 Case 2 - false
   * 4 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 4 TABLESWITCH L68 Case 3 - false
   * 5 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 5 TABLESWITCH L68 Default-Case - false
   */
  @Test
  public void test1()  throws Throwable  {
      INCHI_STEREOTYPE iNCHI_STEREOTYPE0 = INCHI_STEREOTYPE.getValue(0);
      assertEquals(INCHI_STEREOTYPE.NONE, iNCHI_STEREOTYPE0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 1 TABLESWITCH L68 Case 0 - false
   * 2 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 5 TABLESWITCH L68 Default-Case - true
   */
  @Test
  public void test2()  throws Throwable  {
      INCHI_STEREOTYPE.getValue(1213);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 2 TABLESWITCH L68 Case 1 - true
   */
  @Test
  public void test3()  throws Throwable  {
      INCHI_STEREOTYPE iNCHI_STEREOTYPE0 = INCHI_STEREOTYPE.getValue(1);
      assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, iNCHI_STEREOTYPE0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 3 TABLESWITCH L68 Case 2 - true
   * 2 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 4 TABLESWITCH L68 Case 3 - false
   */
  @Test
  public void test4()  throws Throwable  {
      INCHI_STEREOTYPE iNCHI_STEREOTYPE0 = INCHI_STEREOTYPE.getValue(2);
      assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, iNCHI_STEREOTYPE0);
  }

  //Test case number: 5
  /*
   * 5 covered goals:
   * 1 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 4 TABLESWITCH L68 Case 3 - true
   * 2 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 1 TABLESWITCH L68 Case 0 - false
   * 3 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 2 TABLESWITCH L68 Case 1 - false
   * 4 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 3 TABLESWITCH L68 Case 2 - false
   * 5 net.sf.jniinchi.INCHI_STEREOTYPE.getValue(I)Lnet/sf/jniinchi/INCHI_STEREOTYPE;: I3 Branch 5 TABLESWITCH L68 Default-Case - false
   */
  @Test
  public void test5()  throws Throwable  {
      INCHI_STEREOTYPE iNCHI_STEREOTYPE0 = INCHI_STEREOTYPE.getValue(3);
      assertEquals(INCHI_STEREOTYPE.ALLENE, iNCHI_STEREOTYPE0);
  }
}