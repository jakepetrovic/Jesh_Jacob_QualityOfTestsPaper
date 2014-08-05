/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.device;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import net.sf.lavalamp.device.TimeOfDay;

public class TimeOfDayEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 net.sf.lavalamp.device.TimeOfDay.compareTo(Lnet/sf/lavalamp/device/TimeOfDay;)I: I11 Branch 1 IFEQ L22 - false
   * 2 net.sf.lavalamp.device.TimeOfDay.getHours()Ljava/lang/Integer;: root-Branch
   * 3 net.sf.lavalamp.device.TimeOfDay.<init>(II)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0);
      Integer integer0 = timeOfDay0.getHours();
      TimeOfDay timeOfDay1 = new TimeOfDay(1057, (int) integer0);
      assertNotNull(timeOfDay1);
      
      int int0 = timeOfDay0.compareTo(timeOfDay1);
      assertEquals("0:0", timeOfDay0.toString());
      assertEquals((-1), int0);
      assertEquals("1057:0", timeOfDay1.toString());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.TimeOfDay.getMinutes()Ljava/lang/Integer;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0);
      Integer integer0 = timeOfDay0.getMinutes();
      assertEquals("0:0", timeOfDay0.toString());
      assertEquals(0, (int)integer0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.TimeOfDay.toString()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0);
      String string0 = timeOfDay0.toString();
      assertNotNull(string0);
      assertEquals("0:0", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.TimeOfDay.hashCode()I: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0);
      int int0 = timeOfDay0.hashCode();
      assertEquals(0, int0);
      assertEquals("0:0", timeOfDay0.toString());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.TimeOfDay.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      } catch(StringIndexOutOfBoundsException e) {
        /*
         * String index out of range: 2
         */
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.TimeOfDay.compareTo(Lnet/sf/lavalamp/device/TimeOfDay;)I: I11 Branch 1 IFEQ L22 - true
   */
  @Test
  public void test5()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0);
      int int0 = timeOfDay0.compareTo(timeOfDay0);
      assertEquals(0, int0);
      assertEquals("0:0", timeOfDay0.toString());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.device.TimeOfDay.equals(Ljava/lang/Object;)Z: I4 Branch 2 IF_ACMPNE L52 - true
   * 2 net.sf.lavalamp.device.TimeOfDay.equals(Ljava/lang/Object;)Z: I12 Branch 3 IFNONNULL L54 - false
   */
  @Test
  public void test6()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0);
      boolean boolean0 = timeOfDay0.equals((Object) null);
      assertEquals("0:0", timeOfDay0.toString());
      assertEquals(false, boolean0);
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * 1 net.sf.lavalamp.device.TimeOfDay.equals(Ljava/lang/Object;)Z: I12 Branch 3 IFNONNULL L54 - true
   * 2 net.sf.lavalamp.device.TimeOfDay.equals(Ljava/lang/Object;)Z: I23 Branch 4 IF_ACMPEQ L56 - true
   * 3 net.sf.lavalamp.device.TimeOfDay.equals(Ljava/lang/Object;)Z: I40 Branch 5 IFNE L59 - false
   * 4 net.sf.lavalamp.device.TimeOfDay.getHours()Ljava/lang/Integer;: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0);
      Integer integer0 = timeOfDay0.getHours();
      TimeOfDay timeOfDay1 = new TimeOfDay(1057, (int) integer0);
      assertNotNull(timeOfDay1);
      
      boolean boolean0 = timeOfDay0.equals((Object) timeOfDay1);
      assertEquals("1057:0", timeOfDay1.toString());
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.TimeOfDay.equals(Ljava/lang/Object;)Z: I23 Branch 4 IF_ACMPEQ L56 - false
   */
  @Test
  public void test8()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 1);
      boolean boolean0 = timeOfDay0.equals((Object) "0");
      assertEquals("0:1", timeOfDay0.toString());
      assertEquals(false, boolean0);
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * 1 net.sf.lavalamp.device.TimeOfDay.equals(Ljava/lang/Object;)Z: I40 Branch 5 IFNE L59 - true
   * 2 net.sf.lavalamp.device.TimeOfDay.equals(Ljava/lang/Object;)Z: I52 Branch 6 IFNE L61 - true
   * 3 net.sf.lavalamp.device.TimeOfDay.equals(Ljava/lang/Object;)Z: I4 Branch 2 IF_ACMPNE L52 - false
   */
  @Test
  public void test9()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0);
      TimeOfDay timeOfDay1 = new TimeOfDay(0, 0);
      boolean boolean0 = timeOfDay0.equals((Object) timeOfDay1);
      assertEquals("0:0", timeOfDay1.toString());
      assertEquals(true, boolean0);
  }

  //Test case number: 10
  /*
   * 6 covered goals:
   * 1 net.sf.lavalamp.device.TimeOfDay.equals(Ljava/lang/Object;)Z: I52 Branch 6 IFNE L61 - false
   * 2 net.sf.lavalamp.device.TimeOfDay.<init>(II)V: root-Branch
   * 3 net.sf.lavalamp.device.TimeOfDay.equals(Ljava/lang/Object;)Z: I4 Branch 2 IF_ACMPNE L52 - true
   * 4 net.sf.lavalamp.device.TimeOfDay.equals(Ljava/lang/Object;)Z: I12 Branch 3 IFNONNULL L54 - true
   * 5 net.sf.lavalamp.device.TimeOfDay.equals(Ljava/lang/Object;)Z: I23 Branch 4 IF_ACMPEQ L56 - true
   * 6 net.sf.lavalamp.device.TimeOfDay.equals(Ljava/lang/Object;)Z: I40 Branch 5 IFNE L59 - true
   */
  @Test
  public void test10()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0);
      TimeOfDay timeOfDay1 = new TimeOfDay(0, (-1));
      boolean boolean0 = timeOfDay0.equals((Object) timeOfDay1);
      assertEquals(false, boolean0);
      assertEquals("0:-1", timeOfDay1.toString());
  }
}