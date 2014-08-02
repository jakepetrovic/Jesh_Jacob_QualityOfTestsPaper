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
import java.util.TimeZone;
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
      TimeOfDay timeOfDay0 = new TimeOfDay((-131), (-131));
      Locale locale0 = Locale.KOREAN;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      Period period0 = new Period(timeOfDay0, timeOfDay0);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1398574950705,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=3,WEEK_OF_YEAR=17,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=116,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=2,SECOND=30,MILLISECOND=705,ZONE_OFFSET=-25200000,DST_OFFSET=3600000]", gregorianCalendar0.toString());
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
      TimeOfDay timeOfDay0 = new TimeOfDay((-131), (-131));
      Locale locale0 = Locale.KOREAN;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      TimeOfDay timeOfDay1 = new TimeOfDay((-131), 0);
      Period period0 = new Period(timeOfDay0, timeOfDay1);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1398574953651,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=3,WEEK_OF_YEAR=17,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=116,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=2,SECOND=33,MILLISECOND=651,ZONE_OFFSET=-25200000,DST_OFFSET=3600000]", gregorianCalendar0.toString());
      assertEquals(false, boolean0);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 net.sf.lavalamp.device.Period.isInPeriod(Ljava/util/Calendar;)Z: I33 Branch 2 IFNE L30 - false
   * 2 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I3 Branch 3 IFNE L38 - false
   * 3 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I9 Branch 4 IFGT L38 - true
   * 4 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I20 Branch 5 IFGT L39 - true
   */
  @Test
  public void test2()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-131), (-131));
      Locale locale0 = Locale.KOREAN;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      TimeOfDay timeOfDay1 = new TimeOfDay((-131), 0);
      Period period0 = new Period(timeOfDay1, timeOfDay0);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals(1398574957558L, gregorianCalendar0.getTimeInMillis());
      assertEquals(true, boolean0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I20 Branch 5 IFGT L39 - false
   * 2 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I25 Branch 6 IFGE L39 - false
   */
  @Test
  public void test3()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(761, 761);
      Locale locale0 = Locale.getDefault();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      TimeOfDay timeOfDay1 = new TimeOfDay(761, 0);
      Period period0 = new Period(timeOfDay0, timeOfDay1);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals(1398574962398L, gregorianCalendar0.getTimeInMillis());
      assertEquals(true, boolean0);
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * 1 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I25 Branch 6 IFGE L39 - true
   * 2 net.sf.lavalamp.device.Period.isInPeriod(Ljava/util/Calendar;)Z: I19 Branch 1 IFGE L28 - true
   * 3 net.sf.lavalamp.device.Period.isInPeriod(Ljava/util/Calendar;)Z: I33 Branch 2 IFNE L30 - false
   * 4 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I3 Branch 3 IFNE L38 - false
   * 5 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I9 Branch 4 IFGT L38 - true
   * 6 net.sf.lavalamp.device.Period.isInPeriodWhenEndIsNextDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I20 Branch 5 IFGT L39 - false
   */
  @Test
  public void test4()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      TimeOfDay timeOfDay0 = new TimeOfDay(1168, 1168);
      TimeOfDay timeOfDay1 = new TimeOfDay((-1), (-1));
      Period period0 = new Period(timeOfDay0, timeOfDay1);
      Locale locale0 = Locale.CANADA;
      GregorianCalendar gregorianCalendar0 = (GregorianCalendar)Calendar.getInstance(timeZone0, locale0);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals(1398574967675L, gregorianCalendar0.getTimeInMillis());
      assertEquals(false, boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I20 Branch 9 IFLE L48 - true
   */
  @Test
  public void test5()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(761, 761);
      Locale locale0 = Locale.getDefault();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      TimeOfDay timeOfDay1 = new TimeOfDay(761, 0);
      Period period0 = new Period(timeOfDay1, timeOfDay0);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals(1398574971957L, gregorianCalendar0.getTimeInMillis());
      assertEquals(false, boolean0);
  }

  //Test case number: 6
  /*
   * 6 covered goals:
   * 1 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I25 Branch 10 IFGE L48 - false
   * 2 net.sf.lavalamp.device.Period.<init>(Lnet/sf/lavalamp/device/TimeOfDay;Lnet/sf/lavalamp/device/TimeOfDay;)V: root-Branch
   * 3 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I3 Branch 7 IFNE L47 - false
   * 4 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I9 Branch 8 IFLT L47 - true
   * 5 net.sf.lavalamp.device.Period.isInPeriodWhenStartAndEndOnSameDay(Lnet/sf/lavalamp/device/TimeOfDay;)Z: I20 Branch 9 IFLE L48 - false
   * 6 net.sf.lavalamp.device.Period.isInPeriod(Ljava/util/Calendar;)Z: I19 Branch 1 IFGE L28 - false
   */
  @Test
  public void test6()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      TimeOfDay timeOfDay0 = new TimeOfDay(1168, 1168);
      TimeOfDay timeOfDay1 = new TimeOfDay((-1), (-1));
      Period period0 = new Period(timeOfDay1, timeOfDay0);
      Locale locale0 = Locale.CANADA;
      GregorianCalendar gregorianCalendar0 = (GregorianCalendar)Calendar.getInstance(timeZone0, locale0);
      boolean boolean0 = period0.isInPeriod((Calendar) gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1398574975373,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=3,WEEK_OF_YEAR=17,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=116,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=2,SECOND=55,MILLISECOND=373,ZONE_OFFSET=-25200000,DST_OFFSET=3600000]", gregorianCalendar0.toString());
      assertEquals(true, boolean0);
  }
}
