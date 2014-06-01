/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xisemele.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.xisemele.exception.InvalidNameException;
import net.sf.xisemele.impl.Factory;
import net.sf.xisemele.impl.ValidationsImpl;

public class ValidationsImplEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 net.sf.xisemele.impl.ValidationsImpl.assertNotNull([Ljava/lang/Object;)V: I8 Branch 1 IF_ICMPGE L43 - true
   * 2 net.sf.xisemele.impl.ValidationsImpl.assertNotNull([Ljava/lang/Object;)V: I8 Branch 1 IF_ICMPGE L43 - false
   * 3 net.sf.xisemele.impl.ValidationsImpl.assertNotNull([Ljava/lang/Object;)V: I14 Branch 2 IFNONNULL L44 - true
   * 4 net.sf.xisemele.impl.ValidationsImpl.<init>(Lnet/sf/xisemele/impl/Factory;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ValidationsImpl validationsImpl0 = new ValidationsImpl((Factory) null);
      Object[] objectArray0 = new Object[7];
      objectArray0[1] = (Object) validationsImpl0;
      objectArray0[3] = (Object) validationsImpl0;
      objectArray0[5] = (Object) validationsImpl0;
      validationsImpl0.assertNotNull(objectArray0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValidationsImpl.assertNotNull([Ljava/lang/Object;)V: I14 Branch 2 IFNONNULL L44 - false
   * 2 net.sf.xisemele.impl.ValidationsImpl.assertNotNull([Ljava/lang/Object;)V: I8 Branch 1 IF_ICMPGE L43 - false
   */
  @Test
  public void test1()  throws Throwable  {
      ValidationsImpl validationsImpl0 = new ValidationsImpl((Factory) null);
      Object[] objectArray0 = new Object[4];
      try {
        validationsImpl0.assertNotNull(objectArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValidationsImpl.assertValidName(Ljava/lang/String;)V: I7 Branch 3 IFGT L55 - true
   */
  @Test
  public void test2()  throws Throwable  {
      ValidationsImpl validationsImpl0 = new ValidationsImpl((Factory) null);
      validationsImpl0.assertValidName("H7W90");
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValidationsImpl.assertValidName(Ljava/lang/String;)V: I7 Branch 3 IFGT L55 - false
   */
  @Test
  public void test3()  throws Throwable  {
      ValidationsImpl validationsImpl0 = new ValidationsImpl((Factory) null);
      try {
        validationsImpl0.assertValidName("");
        fail("Expecting exception: InvalidNameException");
      } catch(InvalidNameException e) {
        /*
         * O nome \"\" n\u00E3o \u00E9 v\u00E1lido
         */
      }
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * 1 net.sf.xisemele.impl.ValidationsImpl.getFirstNotNull([Ljava/lang/Object;)Ljava/lang/Object;: I14 Branch 4 IF_ICMPGE L64 - true
   * 2 net.sf.xisemele.impl.ValidationsImpl.getFirstNotNull([Ljava/lang/Object;)Ljava/lang/Object;: I14 Branch 4 IF_ICMPGE L64 - false
   * 3 net.sf.xisemele.impl.ValidationsImpl.getFirstNotNull([Ljava/lang/Object;)Ljava/lang/Object;: I22 Branch 5 IFNULL L65 - true
   */
  @Test
  public void test4()  throws Throwable  {
      ValidationsImpl validationsImpl0 = new ValidationsImpl((Factory) null);
      Object[] objectArray0 = new Object[1];
      Object object0 = validationsImpl0.getFirstNotNull(objectArray0);
      assertNull(object0);
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 net.sf.xisemele.impl.ValidationsImpl.getFirstNotNull([Ljava/lang/Object;)Ljava/lang/Object;: I22 Branch 5 IFNULL L65 - false
   * 2 net.sf.xisemele.impl.ValidationsImpl.<init>(Lnet/sf/xisemele/impl/Factory;)V: root-Branch
   * 3 net.sf.xisemele.impl.ValidationsImpl.getFirstNotNull([Ljava/lang/Object;)Ljava/lang/Object;: I14 Branch 4 IF_ICMPGE L64 - false
   */
  @Test
  public void test5()  throws Throwable  {
      ValidationsImpl validationsImpl0 = new ValidationsImpl((Factory) null);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      String string0 = validationsImpl0.getFirstNotNull(stringArray0);
      assertEquals("", string0);
  }
}
