/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.lavalamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import net.sf.lavalamp.LavaLogger;

public class LavaLoggerEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 net.sf.lavalamp.LavaLogger.info(Ljava/util/Calendar;Ljava/lang/String;)V: root-Branch
   * 2 net.sf.lavalamp.LavaLogger.<init>()V: root-Branch
   * 3 net.sf.lavalamp.LavaLogger.info(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      LavaLogger lavaLogger0 = new LavaLogger();
      // Undeclared exception!
      try {
        lavaLogger0.info(" [PyUjoxHLc=d#T?");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.LavaLogger.error(Ljava/lang/Throwable;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      LavaLogger lavaLogger0 = new LavaLogger();
      // Undeclared exception!
      try {
        lavaLogger0.error((Throwable) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.LavaLogger.error(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      LavaLogger lavaLogger0 = new LavaLogger();
      lavaLogger0.error(" ");
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.LavaLogger.setOut(Ljava/io/PrintStream;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      LavaLogger.setOut((PrintStream) null);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.LavaLogger.setDebug(Z)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      LavaLogger.setDebug(false);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.LavaLogger.debug(Ljava/util/Calendar;Ljava/lang/String;)V: I3 Branch 2 IFEQ L46 - true
   * 2 net.sf.lavalamp.LavaLogger.<init>()V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      LavaLogger lavaLogger0 = new LavaLogger();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      lavaLogger0.debug((Calendar) gregorianCalendar0, (String) null);
      assertEquals(1398579219726L, gregorianCalendar0.getTimeInMillis());
      assertEquals("java.util.GregorianCalendar[time=1398579219726,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=27,DAY_OF_YEAR=117,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=13,SECOND=39,MILLISECOND=726,ZONE_OFFSET=-25200000,DST_OFFSET=3600000]", gregorianCalendar0.toString());
  }
}