/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_BOND_STEREO;
import net.sf.jniinchi.INCHI_BOND_TYPE;
import net.sf.jniinchi.JniInchiAtom;
import net.sf.jniinchi.JniInchiBond;

public class JniInchiBondEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiBond.<init>(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;II)V: root-Branch
   * 2 net.sf.jniinchi.JniInchiBond.<init>(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/INCHI_BOND_TYPE;Lnet/sf/jniinchi/INCHI_BOND_STEREO;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, 918, 918);
      assertNull(jniInchiBond0.getBondStereo());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiBond.<init>(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/INCHI_BOND_TYPE;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.DOUBLE;
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0);
      assertEquals("InChI Bond: - // Type: DOUBLE // Stereo: NONE", jniInchiBond0.getDebugString());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiBond.getTargetAtom()Lnet/sf/jniinchi/JniInchiAtom;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.DOUBLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond((JniInchiAtom) null, (JniInchiAtom) null, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      JniInchiAtom jniInchiAtom0 = jniInchiBond0.getTargetAtom();
      assertNull(jniInchiAtom0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiBond.getOriginAtom()Lnet/sf/jniinchi/JniInchiAtom;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.DOUBLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond((JniInchiAtom) null, (JniInchiAtom) null, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      JniInchiAtom jniInchiAtom0 = jniInchiBond0.getOriginAtom();
      assertNull(jniInchiAtom0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiBond.debug()V: root-Branch
   * 2 net.sf.jniinchi.JniInchiBond.getDebugString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.DOUBLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond((JniInchiAtom) null, (JniInchiAtom) null, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      // Undeclared exception!
      try {
        jniInchiBond0.debug();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiBond.setStereoDefinition(Lnet/sf/jniinchi/INCHI_BOND_STEREO;)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.DOUBLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond((JniInchiAtom) null, (JniInchiAtom) null, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      jniInchiBond0.setStereoDefinition(iNCHI_BOND_STEREO0);
      assertEquals(0, jniInchiBond0.getInchiBondStereo());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiBond.getBondStereo()Lnet/sf/jniinchi/INCHI_BOND_STEREO;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.DOUBLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond((JniInchiAtom) null, (JniInchiAtom) null, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      INCHI_BOND_STEREO iNCHI_BOND_STEREO1 = jniInchiBond0.getBondStereo();
      assertEquals(INCHI_BOND_STEREO.NONE, iNCHI_BOND_STEREO1);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiBond.getBondType()Lnet/sf/jniinchi/INCHI_BOND_TYPE;: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.DOUBLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond((JniInchiAtom) null, (JniInchiAtom) null, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      INCHI_BOND_TYPE iNCHI_BOND_TYPE1 = jniInchiBond0.getBondType();
      assertSame(iNCHI_BOND_TYPE0, iNCHI_BOND_TYPE1);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiBond.getInchiBondStereo()I: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom(1.0, 1.0, 1.0, "Iso Mass:");
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.TRIPLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond(jniInchiAtom0, jniInchiAtom0, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      int int0 = jniInchiBond0.getInchiBondStereo();
      assertEquals(0, int0);
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiBond.getInchiBondType()I: root-Branch
   * 2 net.sf.jniinchi.JniInchiBond.<init>(Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/JniInchiAtom;Lnet/sf/jniinchi/INCHI_BOND_TYPE;Lnet/sf/jniinchi/INCHI_BOND_STEREO;)V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      INCHI_BOND_TYPE iNCHI_BOND_TYPE0 = INCHI_BOND_TYPE.DOUBLE;
      INCHI_BOND_STEREO iNCHI_BOND_STEREO0 = INCHI_BOND_STEREO.NONE;
      JniInchiBond jniInchiBond0 = new JniInchiBond((JniInchiAtom) null, (JniInchiAtom) null, iNCHI_BOND_TYPE0, iNCHI_BOND_STEREO0);
      int int0 = jniInchiBond0.getInchiBondType();
      assertEquals(2, int0);
  }
}
