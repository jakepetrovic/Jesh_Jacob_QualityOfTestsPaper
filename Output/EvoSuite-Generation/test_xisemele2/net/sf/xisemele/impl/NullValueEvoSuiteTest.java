/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xisemele.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import net.sf.xisemele.exception.FormatterNotConfiguredException;
import net.sf.xisemele.impl.NullValue;

public class NullValueEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.equals(Ljava/lang/Object;)Z: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      boolean boolean0 = nullValue0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.asShort()Ljava/lang/Short;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      nullValue0.asShort();
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.asDate()Ljava/util/Date;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      Date date0 = nullValue0.asDate();
      assertNull(date0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.asBoolean()Ljava/lang/Boolean;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      nullValue0.asBoolean();
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.asBigDecimal()Ljava/math/BigDecimal;: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      BigDecimal bigDecimal0 = nullValue0.asBigDecimal();
      assertNull(bigDecimal0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.asDate(Ljava/lang/String;)Ljava/util/Date;: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      Date date0 = nullValue0.asDate((String) null);
      assertNull(date0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.asType(Ljava/lang/Class;)Ljava/lang/Object;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      Class<?> class0 = NullValue.class;
      nullValue0.asType((Class<Integer>) class0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.asBigInteger()Ljava/math/BigInteger;: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      BigInteger bigInteger0 = nullValue0.asBigInteger();
      assertNull(bigInteger0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.asLong()Ljava/lang/Long;: root-Branch
   */
  @Test
  public void test8()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      nullValue0.asLong();
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.hashCode()I: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      int int0 = nullValue0.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.asFloat()Ljava/lang/Float;: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      nullValue0.asFloat();
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.asInteger()Ljava/lang/Integer;: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      nullValue0.asInteger();
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.asString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      String string0 = nullValue0.asString();
      assertNull(string0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.asByte()Ljava/lang/Byte;: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      nullValue0.asByte();
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.asDouble()Ljava/lang/Double;: root-Branch
   */
  @Test
  public void test14()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      nullValue0.asDouble();
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.NullValue.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test15()  throws Throwable  {
      NullValue nullValue0 = NullValue.INSTANCE;
      String string0 = nullValue0.toString();
      assertNull(string0);
  }
}