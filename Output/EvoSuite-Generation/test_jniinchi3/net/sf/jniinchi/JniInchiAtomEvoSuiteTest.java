/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.jniinchi;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.jniinchi.INCHI_RADICAL;
import net.sf.jniinchi.JniInchiAtom;

public class JniInchiAtomEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 net.sf.jniinchi.JniInchiAtom.getImplicitTritium()I: root-Branch
   * 2 net.sf.jniinchi.JniInchiAtom.<init>(Ljava/lang/String;)V: root-Branch
   * 3 net.sf.jniinchi.JniInchiAtom.<init>(DDDLjava/lang/String;)V: I57 Branch 1 IFNONNULL L117 - true
   */
  @Test
  public void test0()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("g");
      assertNotNull(jniInchiAtom0);
      
      int int0 = jniInchiAtom0.getImplicitTritium();
      assertEquals(0, int0);
      assertEquals("InChI Atom: g [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 net.sf.jniinchi.JniInchiAtom.setRadical(Lnet/sf/jniinchi/INCHI_RADICAL;)V: root-Branch
   * 2 net.sf.jniinchi.JniInchiAtom.getRadical()Lnet/sf/jniinchi/INCHI_RADICAL;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      assertNotNull(jniInchiAtom0);
      
      INCHI_RADICAL iNCHI_RADICAL0 = jniInchiAtom0.getRadical();
      jniInchiAtom0.setRadical(iNCHI_RADICAL0);
      assertEquals("InChI Atom:  [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
      assertEquals(0, jniInchiAtom0.getCharge());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.getY()D: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      assertNotNull(jniInchiAtom0);
      
      double double0 = jniInchiAtom0.getY();
      assertEquals("InChI Atom:  [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
      assertEquals(0.0, double0, 0.01D);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.setImplicitH(I)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      assertEquals(-1, jniInchiAtom0.getImplicitH());
      assertNotNull(jniInchiAtom0);
      
      jniInchiAtom0.setImplicitH(0);
      assertEquals(0, jniInchiAtom0.getImplicitH());
      assertEquals("InChI Atom:  [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:0 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.setImplicitProtium(I)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("g");
      assertNotNull(jniInchiAtom0);
      
      jniInchiAtom0.setImplicitProtium(1819);
      assertEquals(1819, jniInchiAtom0.getImplicitProtium());
      assertEquals("InChI Atom: g [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:1819 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.setInchiRadical(I)V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      assertEquals("InChI Atom:  [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
      assertNotNull(jniInchiAtom0);
      
      jniInchiAtom0.setInchiRadical(1577);
      assertEquals(-1, jniInchiAtom0.getImplicitH());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.getImplicitDeuterium()I: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("InChI Atom: ");
      assertNotNull(jniInchiAtom0);
      
      int int0 = jniInchiAtom0.getImplicitDeuterium();
      assertEquals("InChI Atom: InChI Atom:  [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
      assertEquals(0, int0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.getCharge()I: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("InChI Atom: ");
      assertNotNull(jniInchiAtom0);
      
      int int0 = jniInchiAtom0.getCharge();
      assertEquals(0, int0);
      assertEquals("InChI Atom: InChI Atom:  [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.getIsotopicMass()I: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("InChI Atom: ");
      assertNotNull(jniInchiAtom0);
      
      int int0 = jniInchiAtom0.getIsotopicMass();
      assertEquals("InChI Atom: InChI Atom:  [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
      assertEquals(0, int0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.setCharge(I)V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      assertNotNull(jniInchiAtom0);
      
      jniInchiAtom0.setCharge(10000);
      assertEquals("InChI Atom:  [0.0,0.0,0.0] Charge:10000 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
      assertEquals(10000, jniInchiAtom0.getCharge());
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.setIsotopicMass(I)V: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      assertNotNull(jniInchiAtom0);
      
      jniInchiAtom0.setIsotopicMass((-2045));
      assertEquals(-2045, jniInchiAtom0.getIsotopicMass());
      assertEquals("InChI Atom:  [0.0,0.0,0.0] Charge:0 // Iso Mass:-2045 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.getElementType()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("InChI Atom: ");
      assertNotNull(jniInchiAtom0);
      
      String string0 = jniInchiAtom0.getElementType();
      assertEquals("InChI Atom: InChI Atom:  [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
      assertNotNull(string0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.getX()D: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("0,@Gq");
      assertNotNull(jniInchiAtom0);
      
      double double0 = jniInchiAtom0.getX();
      assertEquals(0.0, double0, 0.01D);
      assertEquals("InChI Atom: 0,@Gq [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.setImplicitDeuterium(I)V: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      assertNotNull(jniInchiAtom0);
      
      jniInchiAtom0.setImplicitDeuterium(1577);
      assertEquals(1577, jniInchiAtom0.getImplicitDeuterium());
      assertEquals("InChI Atom:  [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:1577 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.getInchiRadical()I: root-Branch
   */
  @Test
  public void test14()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("InChI Atom: ");
      assertNotNull(jniInchiAtom0);
      
      jniInchiAtom0.getInchiRadical();
      assertEquals("InChI Atom: InChI Atom:  [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.getZ()D: root-Branch
   */
  @Test
  public void test15()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      assertNotNull(jniInchiAtom0);
      
      double double0 = jniInchiAtom0.getZ();
      assertEquals("InChI Atom:  [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
      assertEquals(0.0, double0, 0.01D);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.getImplicitProtium()I: root-Branch
   */
  @Test
  public void test16()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("NONE");
      assertNotNull(jniInchiAtom0);
      
      int int0 = jniInchiAtom0.getImplicitProtium();
      assertEquals("InChI Atom: NONE [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
      assertEquals(0, int0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.setImplicitTritium(I)V: root-Branch
   */
  @Test
  public void test17()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("");
      assertNotNull(jniInchiAtom0);
      
      jniInchiAtom0.setImplicitTritium(10000);
      assertEquals(10000, jniInchiAtom0.getImplicitTritium());
      assertEquals(0.0, jniInchiAtom0.getX(), 0.01D);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.getImplicitH()I: root-Branch
   */
  @Test
  public void test18()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("InChI Atom: ");
      assertNotNull(jniInchiAtom0);
      
      int int0 = jniInchiAtom0.getImplicitH();
      assertEquals((-1), int0);
      assertEquals("InChI Atom: InChI Atom:  [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.setIsotopicMassShift(I)V: root-Branch
   */
  @Test
  public void test19()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("gZ`");
      assertNotNull(jniInchiAtom0);
      
      jniInchiAtom0.setIsotopicMassShift(0);
      assertEquals(10000, jniInchiAtom0.getIsotopicMass());
      assertEquals("InChI Atom: gZ` [0.0,0.0,0.0] Charge:0 // Iso Mass:10000 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
  }

  //Test case number: 20
  /*
   * 4 covered goals:
   * 1 net.sf.jniinchi.JniInchiAtom.debug()V: root-Branch
   * 2 net.sf.jniinchi.JniInchiAtom.<init>(Ljava/lang/String;)V: root-Branch
   * 3 net.sf.jniinchi.JniInchiAtom.getDebugString()Ljava/lang/String;: root-Branch
   * 4 net.sf.jniinchi.JniInchiAtom.<init>(DDDLjava/lang/String;)V: I57 Branch 1 IFNONNULL L117 - true
   */
  @Test
  public void test20()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = new JniInchiAtom("gZ`");
      assertNotNull(jniInchiAtom0);
      
      jniInchiAtom0.debug();
      assertEquals("InChI Atom: gZ` [0.0,0.0,0.0] Charge:0 // Iso Mass:0 // Implicit H:-1 P:0 D:0 T:0 // Radical: NONE", jniInchiAtom0.getDebugString());
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 net.sf.jniinchi.JniInchiAtom.<init>(DDDLjava/lang/String;)V: I57 Branch 1 IFNONNULL L117 - false
   */
  @Test
  public void test21()  throws Throwable  {
      JniInchiAtom jniInchiAtom0 = null;
      try {
        jniInchiAtom0 = new JniInchiAtom((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * Chemical element must not be null
         */
      }
  }
}
