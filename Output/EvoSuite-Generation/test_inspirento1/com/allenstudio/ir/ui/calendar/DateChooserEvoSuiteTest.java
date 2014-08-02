/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.ui.calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.allenstudio.ir.event.DateChooserListener;
import com.allenstudio.ir.ui.calendar.DateChooser;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JProgressBar;

public class DateChooserEvoSuiteTest {


  //Test case number: 0
  /*
   * 11 covered goals:
   * 1 com.allenstudio.ir.ui.calendar.DateChooser.addDateChooserListener(Lcom/allenstudio/ir/event/DateChooserListener;)V: root-Branch
   * 2 com.allenstudio.ir.ui.calendar.DateChooser.initActions()V: root-Branch
   * 3 com.allenstudio.ir.ui.calendar.DateChooser.initComponents()V: root-Branch
   * 4 com.allenstudio.ir.ui.calendar.DateChooser.getCurrent()Ljava/util/Calendar;: root-Branch
   * 5 com.allenstudio.ir.ui.calendar.DateChooser.<init>()V: root-Branch
   * 6 com.allenstudio.ir.ui.calendar.DateChooser.getDefaultMonthNames()[Ljava/lang/String;: I24 Branch 4 IF_ICMPGE L205 - true
   * 7 com.allenstudio.ir.ui.calendar.DateChooser.getDefaultMonthNames()[Ljava/lang/String;: I24 Branch 4 IF_ICMPGE L205 - false
   * 8 com.allenstudio.ir.ui.calendar.DateChooser.updateCurrent()V: I4 Branch 3 IFNONNULL L188 - false
   * 9 com.allenstudio.ir.ui.calendar.DateChooser$2.<init>(Lcom/allenstudio/ir/ui/calendar/DateChooser;)V: root-Branch
   * 10 com.allenstudio.ir.ui.calendar.DateChooser$3.<init>(Lcom/allenstudio/ir/ui/calendar/DateChooser;)V: root-Branch
   * 11 com.allenstudio.ir.ui.calendar.DateChooser$4.<init>(Lcom/allenstudio/ir/ui/calendar/DateChooser;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DateChooser dateChooser0 = new DateChooser();
      dateChooser0.addDateChooserListener((DateChooserListener) null);
      assertEquals(true, dateChooser0.isFocusable());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.calendar.DateChooser.getDateChooserListener()Lcom/allenstudio/ir/event/DateChooserListener;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DateChooser dateChooser0 = new DateChooser();
      DateChooserListener dateChooserListener0 = dateChooser0.getDateChooserListener();
      assertNull(dateChooserListener0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.calendar.DateChooser.removeDateChooserListener()V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DateChooser dateChooser0 = new DateChooser();
      dateChooser0.removeDateChooserListener();
      assertEquals(true, dateChooser0.getFocusTraversalKeysEnabled());
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 com.allenstudio.ir.ui.calendar.DateChooser.monthChanged()V: root-Branch
   * 2 com.allenstudio.ir.ui.calendar.DateChooser$5.<init>(Lcom/allenstudio/ir/ui/calendar/DateChooser;Ljava/util/Calendar;)V: root-Branch
   * 3 com.allenstudio.ir.ui.calendar.DateChooser.updateCurrent()V: I4 Branch 3 IFNONNULL L188 - true
   */
  @Test
  public void test3()  throws Throwable  {
      DateChooser dateChooser0 = new DateChooser();
      dateChooser0.monthChanged();
      assertEquals(false, dateChooser0.isFocusTraversalPolicySet());
  }

  //Test case number: 4
  /*
   * 11 covered goals:
   * 1 com.allenstudio.ir.ui.calendar.DateChooser.fireDateChanged(Ljava/lang/Object;Ljava/util/Calendar;Ljava/util/Calendar;)V: I4 Branch 2 IFNULL L174 - true
   * 2 com.allenstudio.ir.ui.calendar.DateChooser.initActions()V: root-Branch
   * 3 com.allenstudio.ir.ui.calendar.DateChooser.initComponents()V: root-Branch
   * 4 com.allenstudio.ir.ui.calendar.DateChooser.getCurrent()Ljava/util/Calendar;: root-Branch
   * 5 com.allenstudio.ir.ui.calendar.DateChooser.<init>()V: root-Branch
   * 6 com.allenstudio.ir.ui.calendar.DateChooser.getDefaultMonthNames()[Ljava/lang/String;: I24 Branch 4 IF_ICMPGE L205 - true
   * 7 com.allenstudio.ir.ui.calendar.DateChooser.getDefaultMonthNames()[Ljava/lang/String;: I24 Branch 4 IF_ICMPGE L205 - false
   * 8 com.allenstudio.ir.ui.calendar.DateChooser.updateCurrent()V: I4 Branch 3 IFNONNULL L188 - false
   * 9 com.allenstudio.ir.ui.calendar.DateChooser$2.<init>(Lcom/allenstudio/ir/ui/calendar/DateChooser;)V: root-Branch
   * 10 com.allenstudio.ir.ui.calendar.DateChooser$3.<init>(Lcom/allenstudio/ir/ui/calendar/DateChooser;)V: root-Branch
   * 11 com.allenstudio.ir.ui.calendar.DateChooser$4.<init>(Lcom/allenstudio/ir/ui/calendar/DateChooser;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      DateChooser dateChooser0 = new DateChooser();
      assertNotNull(dateChooser0);
      
      JProgressBar jProgressBar0 = new JProgressBar();
      Locale locale0 = jProgressBar0.getLocale();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(locale0);
      dateChooser0.fireDateChanged((Object) "ToolTipText", (Calendar) gregorianCalendar0, (Calendar) gregorianCalendar0);
      assertEquals("java.util.GregorianCalendar[time=1398592360119,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=27,DAY_OF_YEAR=117,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=3,HOUR_OF_DAY=3,MINUTE=52,SECOND=40,MILLISECOND=119,ZONE_OFFSET=-25200000,DST_OFFSET=3600000]", gregorianCalendar0.toString());
      assertEquals(1398592360119L, gregorianCalendar0.getTimeInMillis());
  }
}
