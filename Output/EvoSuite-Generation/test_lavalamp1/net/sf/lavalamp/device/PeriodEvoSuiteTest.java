/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.device;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import net.sf.lavalamp.device.Period;
import net.sf.lavalamp.device.TimeOfDay;

public class PeriodEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 net.sf.lavalamp.device.Period.isInPeriod(Ljava/util/Calendar;)Z: I19 Branch 1 IFGE L28 - true
   * 2 net.sf.lavalamp.device.Period.isInPeriod(Ljava/util/Calendar;)Z: I33 Branch 2 IFNE L30 - true
   * 3 net.sf.lavalamp.device.Period.<init>(Lnet/sf/lavalamp/device/TimeOfDay;Lnet/sf/lavalamp/device/TimeOfDay;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-249), 0);
      Period period0 = new Period(timeOfDay0, timeOfDay0);
      Integer integer0 = timeOfDay0.getMinutes();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-249), 12, (int) integer0, 12, (-249));
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals(false, boolean0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 net.sf.lavalamp.device.Period.isInPeriod(Ljava/util/Calendar;)Z: I19 Branch 1 IFGE L28 - false
   * 2 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I3 Branch 7 IFNE L47 - false
   * 3 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I9 Branch 8 IFLT L47 - true
   * 4 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I20 Branch 9 IFLE L48 - false
   * 5 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I25 Branch 10 IFGE L48 - true
   */
  @Test
  public void test1()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-249), 0);
      Integer integer0 = timeOfDay0.getMinutes();
      TimeOfDay timeOfDay1 = new TimeOfDay((-249), 12);
      Period period0 = new Period(timeOfDay0, timeOfDay1);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-249), 12, (int) integer0, 12, (-249));
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals(false, boolean0);
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * 1 net.sf.lavalamp.device.Period.isInPeriod(Ljava/util/Calendar;)Z: I33 Branch 2 IFNE L30 - false
   * 2 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I3 Branch 3 IFNE L38 - false
   * 3 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I9 Branch 4 IFGT L38 - true
   * 4 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I20 Branch 5 IFGT L39 - false
   * 5 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I25 Branch 6 IFGE L39 - true
   */
  @Test
  public void test2()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-249), 0);
      Integer integer0 = timeOfDay0.getMinutes();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-249), 12, (int) integer0, 12, (-249));
      TimeOfDay timeOfDay1 = new TimeOfDay(12, 12);
      Period period0 = new Period(timeOfDay1, timeOfDay0);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I20 Branch 5 IFGT L39 - true
   */
  @Test
  public void test3()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-249), 0);
      Integer integer0 = timeOfDay0.getMinutes();
      TimeOfDay timeOfDay1 = new TimeOfDay((-249), 12);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-249), 12, (int) integer0, 12, (-249));
      Period period0 = new Period(timeOfDay1, timeOfDay0);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals(true, boolean0);
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * 1 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I25 Branch 6 IFGE L39 - false
   * 2 net.sf.lavalamp.device.Period.isInPeriod(Ljava/util/Calendar;)Z: I19 Branch 1 IFGE L28 - true
   * 3 net.sf.lavalamp.device.Period.isInPeriod(Ljava/util/Calendar;)Z: I33 Branch 2 IFNE L30 - false
   * 4 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I3 Branch 3 IFNE L38 - false
   * 5 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I9 Branch 4 IFGT L38 - true
   * 6 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I20 Branch 5 IFGT L39 - false
   */
  @Test
  public void test4()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(1873, 12);
      TimeOfDay timeOfDay1 = new TimeOfDay(1873, 1873);
      Integer integer0 = timeOfDay1.getMinutes();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1873, 12, 1873, (int) integer0, (int) integer0, 12);
      Period period0 = new Period(timeOfDay1, timeOfDay0);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals(true, boolean0);
  }

  //Test case number: 5
  /*
   * 5 covered goals:
   * 1 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I20 Branch 9 IFLE L48 - true
   * 2 net.sf.lavalamp.device.Period.<init>(Lnet/sf/lavalamp/device/TimeOfDay;Lnet/sf/lavalamp/device/TimeOfDay;)V: root-Branch
   * 3 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I3 Branch 7 IFNE L47 - false
   * 4 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I9 Branch 8 IFLT L47 - true
   * 5 net.sf.lavalamp.device.Period.isInPeriod(Ljava/util/Calendar;)Z: I19 Branch 1 IFGE L28 - false
   */
  @Test
  public void test5()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(1873, 12);
      TimeOfDay timeOfDay1 = new TimeOfDay(1873, 1873);
      Integer integer0 = timeOfDay1.getMinutes();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1873, 12, 1873, (int) integer0, (int) integer0, 12);
      Period period0 = new Period(timeOfDay0, timeOfDay1);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals(false, boolean0);
  }
}
