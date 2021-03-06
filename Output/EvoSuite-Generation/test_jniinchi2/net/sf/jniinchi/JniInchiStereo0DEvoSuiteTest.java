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
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiStereo0D.createNewDoublebondStereo0D(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/INCHI_PARITY;)Lnet/sf/jniinchi/JniInchiStereo0D;: root-Branch
   * 2 net.sf.jniinchi.JniInchiStereo0D.<init>(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/INCHI_STEREOTYPE;Lnet/sf/jniinchi/INCHI_PARITY;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom(0.0, 0.0, 0.0, "iqDDiG$Sz}ZLO2");
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.UNKNOWN;
      JniInchiStereo0D jniInchiStereo0D0 = JniInchiStereo0D.createNewDoublebondStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_PARITY0);
      assertEquals("InChI Stereo0D: - [iqDDiG$Sz}ZLO2,iqDDiG$Sz}ZLO2,iqDDiG$Sz}ZLO2,iqDDiG$Sz}ZLO2] Type::DOUBLEBOND // Parity:UNKNOWN", jniInchiStereo0D0.getDebugString());
      assertNotNull(jniInchiStereo0D0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getNeighbor(I)Lnet/sf/jniinchi/JniInchiAtom;: root-Branch
   * 2 net.sf.jniinchi.JniInchiStereo0D.createNewTetrahedralStereo0D(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/INCHI_PARITY;)Lnet/sf/jniinchi/JniInchiStereo0D;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("Y7?v$7Rg");
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.UNKNOWN;
      JniInchiStereo0D jniInchiStereo0D0 = JniInchiStereo0D.createNewTetrahedralStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_PARITY0);
      assertNotNull(jniInchiStereo0D0);
      
      // Undeclared exception!
      try {
        jniInchiStereo0D0.getNeighbor((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -1
         */
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getStereoType()Lnet/sf/jniinchi/INCHI_STEREOTYPE;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom((-253.41368957923794), 0.0, 0.0, " [");
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.ODD;
      JniInchiStereo0D jniInchiStereo0D0 = JniInchiStereo0D.createNewTetrahedralStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_PARITY0);
      assertNotNull(jniInchiStereo0D0);
      
      jniInchiStereo0D0.getStereoType();
      assertEquals("InChI Stereo0D:  [ [ [, [, [, [] Type::TETRAHEDRAL // Parity:ODD", jniInchiStereo0D0.getDebugString());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiStereo0D.debug()V: root-Branch
   * 2 net.sf.jniinchi.JniInchiStereo0D.getDebugString()Ljava/lang/String;: I9 Branch 1 IFNONNULL L150 - true
   */
  @Test
  public void test3()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom((-253.41368957923794), 0.0, 0.0, " [");
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.ODD;
      JniInchiStereo0D jniInchiStereo0D0 = JniInchiStereo0D.createNewTetrahedralStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_PARITY0);
      assertNotNull(jniInchiStereo0D0);
      
      jniInchiStereo0D0.debug();
      assertEquals("InChI Stereo0D:  [ [ [, [, [, [] Type::TETRAHEDRAL // Parity:ODD", jniInchiStereo0D0.getDebugString());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getNeighbors()[Lnet/sf/jniinchi/JniInchiAtom;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom(1.0, 0.0, 0.0, "eF");
      INCHI_STEREOTYPE iNCHI_STEREOTYPE0 = INCHI_STEREOTYPE.ALLENE;
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.NONE;
      JniInchiStereo0D jniInchiStereo0D0 = new JniInchiStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_STEREOTYPE0, iNCHI_PARITY0);
      JniInchiAtom[] jniInchiAtomArray0 = jniInchiStereo0D0.getNeighbors();
      assertNotNull(jniInchiAtomArray0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getDisconnectedParity()Lnet/sf/jniinchi/INCHI_PARITY;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom(1879.2947459338616, 0.0, 0.0, "T Io|0W!BN.&");
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.UNDEFINED;
      JniInchiStereo0D jniInchiStereo0D0 = JniInchiStereo0D.createNewTetrahedralStereo0D((JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, jniInchiAtom0, jniInchiAtom0, iNCHI_PARITY0);
      INCHI_PARITY iNCHI_PARITY1 = jniInchiStereo0D0.getDisconnectedParity();
      assertEquals("NONE", iNCHI_PARITY1.name());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getInchiParity()I: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom(1.0, 0.0, 0.0, "eF");
      INCHI_STEREOTYPE iNCHI_STEREOTYPE0 = INCHI_STEREOTYPE.ALLENE;
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.NONE;
      JniInchiStereo0D jniInchiStereo0D0 = new JniInchiStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_STEREOTYPE0, iNCHI_PARITY0);
      int int0 = jniInchiStereo0D0.getInchiParity();
      assertEquals(0, int0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getParity()Lnet/sf/jniinchi/INCHI_PARITY;: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom((-253.41368957923794), 0.0, 0.0, " [");
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.ODD;
      JniInchiStereo0D jniInchiStereo0D0 = JniInchiStereo0D.createNewTetrahedralStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_PARITY0);
      assertNotNull(jniInchiStereo0D0);
      
      jniInchiStereo0D0.getParity();
      assertEquals("InChI Stereo0D:  [ [ [, [, [, [] Type::TETRAHEDRAL // Parity:ODD", jniInchiStereo0D0.getDebugString());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getInchiStereoType()I: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom((-253.41368957923794), 0.0, 0.0, " [");
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.ODD;
      JniInchiStereo0D jniInchiStereo0D0 = JniInchiStereo0D.createNewTetrahedralStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_PARITY0);
      assertNotNull(jniInchiStereo0D0);
      
      int int0 = jniInchiStereo0D0.getInchiStereoType();
      assertEquals(2, int0);
      assertEquals("InChI Stereo0D:  [ [ [, [, [, [] Type::TETRAHEDRAL // Parity:ODD", jniInchiStereo0D0.getDebugString());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiStereo0D.setDisconnectedParity(Lnet/sf/jniinchi/INCHI_PARITY;)V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom(1.0, 0.0, 0.0, "eF");
      INCHI_STEREOTYPE iNCHI_STEREOTYPE0 = INCHI_STEREOTYPE.ALLENE;
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.NONE;
      JniInchiStereo0D jniInchiStereo0D0 = new JniInchiStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_STEREOTYPE0, iNCHI_PARITY0);
      jniInchiStereo0D0.setDisconnectedParity(iNCHI_PARITY0);
      assertEquals(INCHI_PARITY.NONE, jniInchiStereo0D0.getDisconnectedParity());
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getCentralAtom()Lnet/sf/jniinchi/JniInchiAtom;: root-Branch
   * 2 net.sf.jniinchi.JniInchiStereo0D.createNewTetrahedralStereo0D(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/INCHI_PARITY;)Lnet/sf/jniinchi/JniInchiStereo0D;: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("Y7?v$7Rg");
      INCHI_PARITY iNCHI_PARITY0 = INCHI_PARITY.UNKNOWN;
      JniInchiStereo0D jniInchiStereo0D0 = JniInchiStereo0D.createNewTetrahedralStereo0D(jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, jniInchiAtom0, iNCHI_PARITY0);
      assertNotNull(jniInchiStereo0D0);
      
      JniInchiAtom jniInchiAtom1 = jniInchiStereo0D0.getCentralAtom();
      assertNotNull(jniInchiAtom1);
      assertEquals("InChI Stereo0D: Y7?v$7Rg [Y7?v$7Rg,Y7?v$7Rg,Y7?v$7Rg,Y7?v$7Rg] Type::TETRAHEDRAL // Parity:UNKNOWN", jniInchiStereo0D0.getDebugString());
  }

  //Test case number: 11
  /*
   * 4 covered goals:
   * 1 net.sf.jniinchi.JniInchiStereo0D.getDebugString()Ljava/lang/String;: I9 Branch 1 IFNONNULL L150 - false
   * 2 net.sf.jniinchi.JniInchiStereo0D.<init>(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;II)V: root-Branch
   * 3 net.sf.jniinchi.JniInchiStereo0D.debug()V: root-Branch
   * 4 net.sf.jniinchi.JniInchiStereo0D.<init>(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/INCHI_STEREOTYPE;Lnet/sf/jniinchi/INCHI_PARITY;)V: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      JniInchiStereo0D jniInchiStereo0D0 = new JniInchiStereo0D((JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (JniInchiAtom) null, (-372), (-372));
      // Undeclared exception!
      try {
        jniInchiStereo0D0.debug();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
