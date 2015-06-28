/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp.device;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
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
      TimeOfDay timeOfDay0 = new TimeOfDay((-233), (-233));
      Integer integer0 = timeOfDay0.getMinutes();
      Period period0 = new Period(timeOfDay0, timeOfDay0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1, 1, (int) integer0);
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
   * 5 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I25 Branch 10 IFGE L48 - false
   */
  @Test
  public void test1()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-233), (-233));
      Integer integer0 = timeOfDay0.getMinutes();
      TimeOfDay timeOfDay1 = new TimeOfDay(1, 1);
      Period period0 = new Period(timeOfDay0, timeOfDay1);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1, 1, (int) integer0);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals(true, boolean0);
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
      TimeOfDay timeOfDay0 = new TimeOfDay((-233), (-233));
      Integer integer0 = timeOfDay0.getMinutes();
      TimeOfDay timeOfDay1 = new TimeOfDay(1, 1);
      Period period0 = new Period(timeOfDay1, timeOfDay0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(1, 1, (int) integer0);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 5 covered goals:
   * 1 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I20 Branch 5 IFGT L39 - true
   * 2 net.sf.lavalamp.device.Period.isInPeriod(Ljava/util/Calendar;)Z: I19 Branch 1 IFGE L28 - true
   * 3 net.sf.lavalamp.device.Period.isInPeriod(Ljava/util/Calendar;)Z: I33 Branch 2 IFNE L30 - false
   * 4 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I3 Branch 3 IFNE L38 - false
   * 5 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I9 Branch 4 IFGT L38 - true
   */
  @Test
  public void test3()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-233), (-233));
      TimeOfDay timeOfDay1 = new TimeOfDay(1, 1);
      Locale locale0 = Locale.forLanguageTag("-233:-233");
      Period period0 = new Period(timeOfDay1, timeOfDay0);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1433718762157,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2015,MONTH=5,WEEK_OF_YEAR=24,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=158,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=5,HOUR_OF_DAY=17,MINUTE=12,SECOND=42,MILLISECOND=157,ZONE_OFFSET=-25200000,DST_OFFSET=3600000]", gregorianCalendar0.toString());
      assertEquals(true, boolean0);
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * 1 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I25 Branch 10 IFGE L48 - true
   * 2 net.sf.lavalamp.device.Period.<init>(Lnet/sf/lavalamp/device/TimeOfDay;Lnet/sf/lavalamp/device/TimeOfDay;)V: root-Branch
   * 3 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I3 Branch 7 IFNE L47 - false
   * 4 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I9 Branch 8 IFLT L47 - true
   * 5 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I20 Branch 9 IFLE L48 - false
   * 6 net.sf.lavalamp.device.Period.isInPeriod(Ljava/util/Calendar;)Z: I19 Branch 1 IFGE L28 - false
   */
  @Test
  public void test4()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-233), (-233));
      TimeOfDay timeOfDay1 = new TimeOfDay(1, 1);
      Locale locale0 = Locale.forLanguageTag("-233:-233");
      Period period0 = new Period(timeOfDay0, timeOfDay1);
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals(1433718766951L, gregorianCalendar0.getTimeInMillis());
      assertEquals(false, boolean0);
  }
}
