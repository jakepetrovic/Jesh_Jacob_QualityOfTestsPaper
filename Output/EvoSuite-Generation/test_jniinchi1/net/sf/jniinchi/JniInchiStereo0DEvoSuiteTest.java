/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_PARITY;
import net.sf.jniinchi.INCHI_STEREOTYPE;
import net.sf.jniinchi.JniInchiAtom;
import net.sf.jniinchi.JniInchiStereo0D;

public class JniInchiStereo0DEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/INCHI_PARITY;)Lnet/sf/jniinchi/JniInchiStereo0D;: root-Branch
   * 2 net.sf.jniinchi.JniInchiStereo0D.<init>(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/INCHI_STEREOTYPE;Lnet/sf/jniinchi/INCHI_PARITY;)V: root-Branch
   * 3 net.sf.jniinchi.JniInchiStereo0D.getParity()Lnet/sf/jniinchi/INCHI_PARITY;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      INCHI_STEREOTYPE iNCHI_STEREOTYPE0 = INCHI_STEREOTYPE.DOUBLEBOND;
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.EVEN;
      JniInchiStereo0D jniInchiStereo0D0 = new JniInchiStereo0D((JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, iNCHI_STEREOTYPE0, iNCHI_PARITY0);
      INCHI_PARITY iNCHI_PARITY1 = jniInchiStereo0D0.getParity();
      JniInchiStereo0D jniInchiStereo0D1 = JniInchiStereo0D.createNewDoublebondStereo0D((JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, iNCHI_PARITY1);
      assertEquals(2, jniInchiStereo0D1.getInchiParity());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getNeighbor(I)Lnet/sf/jniinchi/JniInchiAtom;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.NONE;
      JniInchiStereo0D jniInchiStereo0D0 = JniInchiStereo0D.createNewDoublebondStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_PARITY0);
      assertNotNull(jniInchiStereo0D0);
      
      JniInchiAtom jniInchiAtom1 = jniInchiStereo0D0.getNeighbor(0);
      assertEquals("InChI Stereo0D: - [,,,] Type::DOUBLEBOND // Parity:NONE", jniInchiStereo0D0.getDebugString());
      assertNotNull(jniInchiAtom1);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getStereoType()Lnet/sf/jniinchi/INCHI_STEREOTYPE;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.NONE;
      JniInchiStereo0D jniInchiStereo0D0 = JniInchiStereo0D.createNewDoublebondStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_PARITY0);
      assertNotNull(jniInchiStereo0D0);
      
      jniInchiStereo0D0.getStereoType();
      assertEquals("InChI Stereo0D: - [,,,] Type::DOUBLEBOND // Parity:NONE", jniInchiStereo0D0.getDebugString());
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 net.sf.jniinchi.JniInchiStereo0D.debug()V: root-Branch
   * 2 net.sf.jniinchi.JniInchiStereo0D.getDebugString()Ljava/lang/String;: I9 Branch 1 IFNONNULL L150 - true
   * 3 net.sf.jniinchi.JniInchiStereo0D.<init>(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;II)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom((-1.0), (-1.0), (-1.0), "y#}-v7%");
      JniInchiStereo0D jniInchiStereo0D0 = new JniInchiStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, (-1), (-1));
      assertNotNull(jniInchiStereo0D0);
      
      jniInchiStereo0D0.debug();
      assertEquals("InChI Stereo0D: y#}-v7% [y#}-v7%,y#}-v7%,y#}-v7%,y#}-v7%] Type::null // Parity:null", jniInchiStereo0D0.getDebugString());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getNeighbors()[Lnet/sf/jniinchi/JniInchiAtom;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      INCHI_STEREOTYPE iNCHI_STEREOTYPE0 = INCHI_STEREOTYPE.TETRAHEDRAL;
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.ODD;
      JniInchiStereo0D jniInchiStereo0D0 = new JniInchiStereo0D((JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, iNCHI_STEREOTYPE0, iNCHI_PARITY0);
      JniInchiAtom[] jniInchiAtomArray0 = jniInchiStereo0D0.getNeighbors();
      assertNotNull(jniInchiAtomArray0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getDisconnectedParity()Lnet/sf/jniinchi/INCHI_PARITY;: root-Branch
   * 2 net.sf.jniinchi.JniInchiStereo0D.<init>(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;II)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom((-1.0), (-1.0), (-1.0), "y#}-v7%");
      JniInchiStereo0D jniInchiStereo0D0 = new JniInchiStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, (-1), (-1));
      INCHI_PARITY iNCHI_PARITY0 = jniInchiStereo0D0.getDisconnectedParity();
      assertEquals(0, iNCHI_PARITY0.getIndx());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getInchiParity()I: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.UNKNOWN;
      JniInchiStereo0D jniInchiStereo0D0 = JniInchiStereo0D.createNewDoublebondStereo0D((JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, iNCHI_PARITY0);
      assertNotNull(jniInchiStereo0D0);
      
      int int0 = jniInchiStereo0D0.getInchiParity();
      assertEquals(3, int0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getInchiStereoType()I: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      INCHI_STEREOTYPE iNCHI_STEREOTYPE0 = INCHI_STEREOTYPE.DOUBLEBOND;
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.EVEN;
      JniInchiStereo0D jniInchiStereo0D0 = new JniInchiStereo0D((JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, iNCHI_STEREOTYPE0, iNCHI_PARITY0);
      assertNotNull(jniInchiStereo0D0);
      
      int int0 = jniInchiStereo0D0.getInchiStereoType();
      assertEquals(1, int0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.setDisconnectedParity(Lnet/sf/jniinchi/INCHI_PARITY;)V: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      INCHI_STEREOTYPE iNCHI_STEREOTYPE0 = INCHI_STEREOTYPE.TETRAHEDRAL;
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.ODD;
      JniInchiStereo0D jniInchiStereo0D0 = new JniInchiStereo0D((JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, iNCHI_STEREOTYPE0, iNCHI_PARITY0);
      jniInchiStereo0D0.setDisconnectedParity(iNCHI_PARITY0);
      assertEquals(INCHI_PARITY.ODD, jniInchiStereo0D0.getParity());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getCentralAtom()Lnet/sf/jniinchi/JniInchiAtom;: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      INCHI_STEREOTYPE iNCHI_STEREOTYPE0 = INCHI_STEREOTYPE.DOUBLEBOND;
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.EVEN;
      JniInchiStereo0D jniInchiStereo0D0 = new JniInchiStereo0D((JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, iNCHI_STEREOTYPE0, iNCHI_PARITY0);
      JniInchiAtom jniInchiAtom0 = jniInchiStereo0D0.getCentralAtom();
      assertNull(jniInchiAtom0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.createNewTetrahedralStereo0D(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/INCHI_PARITY;)Lnet/sf/jniinchi/JniInchiStereo0D;: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.ODD;
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      JniInchiStereo0D jniInchiStereo0D0 = JniInchiStereo0D.createNewTetrahedralStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_PARITY0);
      assertNotNull(jniInchiStereo0D0);
      assertEquals("InChI Stereo0D:  [,,,] Type::TETRAHEDRAL // Parity:ODD", jniInchiStereo0D0.getDebugString());
  }

  //Test case number: 11
  /*
   * 3 covered goals:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getDebugString()Ljava/lang/String;: I9 Branch 1 IFNONNULL L150 - false
   * 2 net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/INCHI_PARITY;)Lnet/sf/jniinchi/JniInchiStereo0D;: root-Branch
   * 3 net.sf.jniinchi.JniInchiStereo0D.<init>(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/INCHI_STEREOTYPE;Lnet/sf/jniinchi/INCHI_PARITY;)V: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.NONE;
      JniInchiStereo0D jniInchiStereo0D0 = JniInchiStereo0D.createNewDoublebondStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_PARITY0);
      assertNotNull(jniInchiStereo0D0);
      
      String string0 = jniInchiStereo0D0.getDebugString();
      assertNotNull(string0);
      assertEquals("InChI Stereo0D: - [,,,] Type::DOUBLEBOND // Parity:NONE", string0);
  }
}
