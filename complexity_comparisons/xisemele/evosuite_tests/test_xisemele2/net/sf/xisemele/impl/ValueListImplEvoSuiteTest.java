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
import java.util.LinkedList;
import java.util.List;
import net.sf.xisemele.api.Value;
import net.sf.xisemele.exception.FormatterNotConfiguredException;
import net.sf.xisemele.impl.ValueListImpl;

public class ValueListImplEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValueListImpl.asByte()Ljava/util/List;: I15 Branch 1 IFEQ L45 - true
   * 2 net.sf.xisemele.impl.ValueListImpl.<init>(Ljava/util/List;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      List<Byte> list0 = valueListImpl0.asByte();
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asByte()Ljava/util/List;: I15 Branch 1 IFEQ L45 - false
   */
  @Test
  public void test1()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      linkedList0.add((Value) null);
      // Undeclared exception!
      try {
        valueListImpl0.asByte();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asShort()Ljava/util/List;: I15 Branch 2 IFEQ L56 - true
   */
  @Test
  public void test2()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      List<Short> list0 = valueListImpl0.asShort();
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asShort()Ljava/util/List;: I15 Branch 2 IFEQ L56 - false
   */
  @Test
  public void test3()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      linkedList0.add((Value) null);
      // Undeclared exception!
      try {
        valueListImpl0.asShort();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asInteger()Ljava/util/List;: I15 Branch 3 IFEQ L67 - true
   */
  @Test
  public void test4()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      List<Integer> list0 = valueListImpl0.asInteger();
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asInteger()Ljava/util/List;: I15 Branch 3 IFEQ L67 - false
   */
  @Test
  public void test5()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      linkedList0.add((Value) null);
      // Undeclared exception!
      try {
        valueListImpl0.asInteger();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asLong()Ljava/util/List;: I15 Branch 4 IFEQ L78 - true
   */
  @Test
  public void test6()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      List<Long> list0 = valueListImpl0.asLong();
      assertEquals(0, list0.size());
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asLong()Ljava/util/List;: I15 Branch 4 IFEQ L78 - false
   */
  @Test
  public void test7()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      linkedList0.add((Value) null);
      // Undeclared exception!
      try {
        valueListImpl0.asLong();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asFloat()Ljava/util/List;: I15 Branch 5 IFEQ L89 - true
   */
  @Test
  public void test8()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      List<Float> list0 = valueListImpl0.asFloat();
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asFloat()Ljava/util/List;: I15 Branch 5 IFEQ L89 - false
   */
  @Test
  public void test9()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      linkedList0.add((Value) null);
      // Undeclared exception!
      try {
        valueListImpl0.asFloat();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asDouble()Ljava/util/List;: I15 Branch 6 IFEQ L100 - true
   */
  @Test
  public void test10()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      List<Double> list0 = valueListImpl0.asDouble();
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asDouble()Ljava/util/List;: I15 Branch 6 IFEQ L100 - false
   */
  @Test
  public void test11()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      linkedList0.add((Value) null);
      // Undeclared exception!
      try {
        valueListImpl0.asDouble();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asBigInteger()Ljava/util/List;: I15 Branch 7 IFEQ L111 - true
   */
  @Test
  public void test12()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      List<BigInteger> list0 = valueListImpl0.asBigInteger();
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asBigInteger()Ljava/util/List;: I15 Branch 7 IFEQ L111 - false
   */
  @Test
  public void test13()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      linkedList0.addLast((Value) null);
      // Undeclared exception!
      try {
        valueListImpl0.asBigInteger();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asBigDecimal()Ljava/util/List;: I15 Branch 8 IFEQ L122 - true
   */
  @Test
  public void test14()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      List<BigDecimal> list0 = valueListImpl0.asBigDecimal();
      assertEquals(0, list0.size());
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asBigDecimal()Ljava/util/List;: I15 Branch 8 IFEQ L122 - false
   */
  @Test
  public void test15()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      linkedList0.addLast((Value) null);
      // Undeclared exception!
      try {
        valueListImpl0.asBigDecimal();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asBoolean()Ljava/util/List;: I15 Branch 9 IFEQ L133 - true
   */
  @Test
  public void test16()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      List<Boolean> list0 = valueListImpl0.asBoolean();
      assertEquals(0, list0.size());
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asBoolean()Ljava/util/List;: I15 Branch 9 IFEQ L133 - false
   */
  @Test
  public void test17()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      linkedList0.addLast((Value) null);
      // Undeclared exception!
      try {
        valueListImpl0.asBoolean();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asString()Ljava/util/List;: I15 Branch 10 IFEQ L144 - true
   */
  @Test
  public void test18()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      List<String> list0 = valueListImpl0.asString();
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asString()Ljava/util/List;: I15 Branch 10 IFEQ L144 - false
   */
  @Test
  public void test19()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      linkedList0.addLast((Value) null);
      // Undeclared exception!
      try {
        valueListImpl0.asString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asDate()Ljava/util/List;: I15 Branch 11 IFEQ L155 - true
   */
  @Test
  public void test20()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      List<Date> list0 = valueListImpl0.asDate();
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asDate()Ljava/util/List;: I15 Branch 11 IFEQ L155 - false
   */
  @Test
  public void test21()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      linkedList0.add((Value) null);
      // Undeclared exception!
      try {
        valueListImpl0.asDate();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asDate(Ljava/lang/String;)Ljava/util/List;: I15 Branch 12 IFEQ L166 - true
   */
  @Test
  public void test22()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      List<Date> list0 = valueListImpl0.asDate("");
      assertEquals(0, list0.size());
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asDate(Ljava/lang/String;)Ljava/util/List;: I15 Branch 12 IFEQ L166 - false
   */
  @Test
  public void test23()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      linkedList0.add((Value) null);
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      // Undeclared exception!
      try {
        valueListImpl0.asDate("G");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.ValueListImpl.asType(Ljava/lang/Class;)Ljava/util/List;: I15 Branch 13 IFEQ L177 - true
   */
  @Test
  public void test24()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      Class<?> class0 = ValueListImpl.class;
      List<BigInteger> list0 = valueListImpl0.asType((Class<BigInteger>) class0);
      assertEquals(0, list0.size());
  }

  //Test case number: 25
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.ValueListImpl.asType(Ljava/lang/Class;)Ljava/util/List;: I15 Branch 13 IFEQ L177 - false
   * 2 net.sf.xisemele.impl.ValueListImpl.<init>(Ljava/util/List;)V: root-Branch
   */
  @Test
  public void test25()  throws Throwable  {
      LinkedList<Value> linkedList0 = new LinkedList<Value>();
      ValueListImpl valueListImpl0 = new ValueListImpl((List<Value>) linkedList0);
      linkedList0.addLast((Value) null);
      Class<?> class0 = ValueListImpl.class;
      // Undeclared exception!
      try {
        valueListImpl0.asType((Class<Object>) class0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
