/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xisemele.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.util.Date;
import net.sf.xisemele.exception.FormatterNotConfiguredException;
import net.sf.xisemele.impl.Factory;
import net.sf.xisemele.impl.FormatterProvider;
import net.sf.xisemele.impl.ValueImpl;

public class ValueImplEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 net.sf.xisemele.impl.ValueImpl$2.<init>(Lnet/sf/xisemele/impl/ValueImpl;)V: root-Branch
   * 2 net.sf.xisemele.impl.ValueImpl.<init>(Lnet/sf/xisemele/impl/Factory;Lnet/sf/xisemele/impl/FormatterProvider;Ljava/lang/String;)V: root-Branch
   * 3 net.sf.xisemele.impl.ValueImpl.asShort()Ljava/lang/Short;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, (String) null);
      // Undeclared exception!
      try {
        valueImpl0.asShort();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValueImpl$1.<init>(Lnet/sf/xisemele/impl/ValueImpl;)V: root-Branch
   * 2 net.sf.xisemele.impl.ValueImpl.asByte()Ljava/lang/Byte;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "k");
      // Undeclared exception!
      try {
        valueImpl0.asByte();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValueImpl$12.<init>(Lnet/sf/xisemele/impl/ValueImpl;Ljava/lang/Class;)V: root-Branch
   * 2 net.sf.xisemele.impl.ValueImpl.asType(Ljava/lang/Class;)Ljava/lang/Object;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "X1-<j]r");
      Class<?> class0 = Object.class;
      // Undeclared exception!
      try {
        valueImpl0.asType((Class<Date>) class0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValueImpl$4.<init>(Lnet/sf/xisemele/impl/ValueImpl;)V: root-Branch
   * 2 net.sf.xisemele.impl.ValueImpl.asLong()Ljava/lang/Long;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "FgB;ZugLRU=gd");
      // Undeclared exception!
      try {
        valueImpl0.asLong();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValueImpl$11.<init>(Lnet/sf/xisemele/impl/ValueImpl;)V: root-Branch
   * 2 net.sf.xisemele.impl.ValueImpl.asDate()Ljava/util/Date;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "");
      // Undeclared exception!
      try {
        valueImpl0.asDate();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValueImpl$3.<init>(Lnet/sf/xisemele/impl/ValueImpl;)V: root-Branch
   * 2 net.sf.xisemele.impl.ValueImpl.asInteger()Ljava/lang/Integer;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "Yl]G3L,+]#f");
      // Undeclared exception!
      try {
        valueImpl0.asInteger();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValueImpl$10.<init>(Lnet/sf/xisemele/impl/ValueImpl;)V: root-Branch
   * 2 net.sf.xisemele.impl.ValueImpl.asString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "");
      // Undeclared exception!
      try {
        valueImpl0.asString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValueImpl$6.<init>(Lnet/sf/xisemele/impl/ValueImpl;)V: root-Branch
   * 2 net.sf.xisemele.impl.ValueImpl.asDouble()Ljava/lang/Double;: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "");
      // Undeclared exception!
      try {
        valueImpl0.asDouble();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValueImpl$5.<init>(Lnet/sf/xisemele/impl/ValueImpl;)V: root-Branch
   * 2 net.sf.xisemele.impl.ValueImpl.asFloat()Ljava/lang/Float;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "F1_kt*(t");
      // Undeclared exception!
      try {
        valueImpl0.asFloat();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValueImpl$8.<init>(Lnet/sf/xisemele/impl/ValueImpl;)V: root-Branch
   * 2 net.sf.xisemele.impl.ValueImpl.asBigDecimal()Ljava/math/BigDecimal;: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "");
      // Undeclared exception!
      try {
        valueImpl0.asBigDecimal();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValueImpl$7.<init>(Lnet/sf/xisemele/impl/ValueImpl;)V: root-Branch
   * 2 net.sf.xisemele.impl.ValueImpl.asBigInteger()Ljava/math/BigInteger;: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "messages");
      // Undeclared exception!
      try {
        valueImpl0.asBigInteger();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValueImpl$9.<init>(Lnet/sf/xisemele/impl/ValueImpl;)V: root-Branch
   * 2 net.sf.xisemele.impl.ValueImpl.asBoolean()Ljava/lang/Boolean;: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "[m)o");
      // Undeclared exception!
      try {
        valueImpl0.asBoolean();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueImpl.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "");
      String string0 = valueImpl0.toString();
      assertEquals("", string0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueImpl.hashCode()I: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "FgB;ZugLRU=gd");
      int int0 = valueImpl0.hashCode();
      assertEquals(1764115389, int0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueImpl.asDate(Ljava/lang/String;)Ljava/util/Date;: root-Branch
   */
  @Test
  public void test14()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "");
      // Undeclared exception!
      try {
        valueImpl0.asDate("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueImpl.equals(Ljava/lang/Object;)Z: I4 Branch 1 IFEQ L213 - true
   */
  @Test
  public void test15()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "");
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      boolean boolean0 = valueImpl0.equals((Object) bigDecimal0);
      assertEquals(false, boolean0);
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValueImpl.equals(Ljava/lang/Object;)Z: I4 Branch 1 IFEQ L213 - false
   * 2 net.sf.xisemele.impl.ValueImpl.<init>(Lnet/sf/xisemele/impl/Factory;Lnet/sf/xisemele/impl/FormatterProvider;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test16()  throws Throwable  {
      ValueImpl valueImpl0 = new ValueImpl((Factory) null, (FormatterProvider) null, "Yl]G3L,+]#f");
      boolean boolean0 = valueImpl0.equals((Object) valueImpl0);
      assertEquals(true, boolean0);
  }
}
