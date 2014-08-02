/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.ui.calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.allenstudio.ir.ui.calendar.MonthlyCalendar;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.GregorianCalendar;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class MonthlyCalendarEvoSuiteTest {


  //Test case number: 0
  /*
   * 13 covered goals:
   * 1 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setHighlightForeground(Ljava/awt/Color;)V: root-Branch
   * 2 com.allenstudio.ir.ui.calendar.MonthlyCalendar.getHeaderForeground()Ljava/awt/Color;: root-Branch
   * 3 com.allenstudio.ir.ui.calendar.MonthlyCalendar.<init>()V: root-Branch
   * 4 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I19 Branch 12 IF_ICMPNE L246 - true
   * 5 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I65 Branch 14 IFEQ L256 - false
   * 6 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I88 Branch 15 IF_ICMPGE L261 - true
   * 7 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I88 Branch 15 IF_ICMPGE L261 - false
   * 8 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I107 Branch 16 IF_ICMPGE L264 - true
   * 9 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I107 Branch 16 IF_ICMPGE L264 - false
   * 10 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I132 Branch 17 IF_ICMPGE L267 - true
   * 11 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I132 Branch 17 IF_ICMPGE L267 - false
   * 12 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setMouseListeningEnabled(Z)V: I3 Branch 1 IFEQ L176 - false
   * 13 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setMouseListeningEnabled(Z)V: I6 Branch 2 IFNE L176 - false
   */
  @Test
  public void test0()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      Color color0 = monthlyCalendar0.getHeaderForeground();
      assertNotNull(color0);
      
      monthlyCalendar0.setHighlightForeground(color0);
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(4, monthlyCalendar0.getMonth());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals(-2562824, color0.getRGB());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.calendar.MonthlyCalendar.getMouseListeningEnabled()Z: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      boolean boolean0 = monthlyCalendar0.getMouseListeningEnabled();
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertEquals(true, boolean0);
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(4, monthlyCalendar0.getMonth());
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * 1 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setBorder(Ljavax/swing/border/Border;)V: root-Branch
   * 2 com.allenstudio.ir.ui.calendar.MonthlyCalendar.resize()V: I8 Branch 19 IFNULL L400 - false
   * 3 com.allenstudio.ir.ui.calendar.MonthlyCalendar.resize()V: I63 Branch 20 IFNONNULL L409 - false
   */
  @Test
  public void test2()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
      assertNotNull(monthlyCalendar0);
      
      EtchedBorder etchedBorder0 = new EtchedBorder();
      monthlyCalendar0.setBorder((Border) etchedBorder0);
      assertEquals(4, monthlyCalendar0.getMonth());
      assertEquals(2014, monthlyCalendar0.getYear());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setMonth(I)V: I4 Branch 7 IF_ICMPLT L216 - false
   * 2 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setMonth(I)V: I7 Branch 8 IF_ICMPLE L216 - false
   */
  @Test
  public void test3()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      // Undeclared exception!
      try {
        monthlyCalendar0.setMonth(1909);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Invalid month specified!
         */
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(II)V: I5 Branch 10 IF_ICMPNE L232 - true
   */
  @Test
  public void test4()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      monthlyCalendar0.setYearMonth(821, 821);
      assertEquals(889, monthlyCalendar0.getYear());
      assertEquals(5, monthlyCalendar0.getMonth());
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 com.allenstudio.ir.ui.calendar.MonthlyCalendar.resize()V: I8 Branch 19 IFNULL L400 - true
   * 2 com.allenstudio.ir.ui.calendar.MonthlyCalendar.resize()V: I63 Branch 20 IFNONNULL L409 - true
   * 3 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setHeaderComponent(Ljavax/swing/JComponent;)V: I12 Branch 21 IFNULL L439 - false
   */
  @Test
  public void test5()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      JCheckBox jCheckBox0 = new JCheckBox();
      monthlyCalendar0.setHeaderComponent((JComponent) jCheckBox0);
      assertEquals(21, jCheckBox0.getHeight());
      assertEquals(2014, monthlyCalendar0.getYear());
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 com.allenstudio.ir.ui.calendar.MonthlyCalendar.paintComponent(Ljava/awt/Graphics;)V: I9 Branch 22 IFNONNULL L468 - false
   * 2 com.allenstudio.ir.ui.calendar.MonthlyCalendar.paintComponent(Ljava/awt/Graphics;)V: I17 Branch 23 IF_ICMPGE L469 - false
   * 3 com.allenstudio.ir.ui.calendar.MonthlyCalendar.paintComponent(Ljava/awt/Graphics;)V: I22 Branch 24 IFEQ L471 - false
   * 4 com.allenstudio.ir.ui.calendar.MonthlyCalendar.paintSymbol(Ljava/awt/Graphics;Ljava/awt/Font;Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;IIII)V: I3 Branch 40 IFNONNULL L526 - true
   */
  @Test
  public void test6()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      // Undeclared exception!
      try {
        monthlyCalendar0.paintComponent((Graphics) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * 1 com.allenstudio.ir.ui.calendar.MonthlyCalendar.getSelectedDate()Ljava/util/Calendar;: I34 Branch 41 IF_ICMPLE L561 - false
   * 2 com.allenstudio.ir.ui.calendar.MonthlyCalendar.getDayOfMonth(II)I: I58 Branch 57 IFNE L704 - true
   * 3 com.allenstudio.ir.ui.calendar.MonthlyCalendar.getDayOfMonth(II)I: I67 Branch 59 IFNE L704 - true
   */
  @Test
  public void test7()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      GregorianCalendar gregorianCalendar0 = (GregorianCalendar)monthlyCalendar0.getSelectedDate();
      assertEquals(30, monthlyCalendar0.getSelectedDay());
      assertEquals("java.util.GregorianCalendar[time=1398854490208,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"America/Denver\",offset=-25200000,dstSavings=3600000,useDaylight=true,transitions=157,lastRule=java.util.SimpleTimeZone[id=America/Denver,offset=-25200000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=3,WEEK_OF_YEAR=18,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=120,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=41,SECOND=30,MILLISECOND=208,ZONE_OFFSET=-25200000,DST_OFFSET=3600000]", gregorianCalendar0.toString());
  }

  //Test case number: 8
  /*
   * 6 covered goals:
   * 1 com.allenstudio.ir.ui.calendar.MonthlyCalendar.mouseDragged(Ljava/awt/event/MouseEvent;)V: I5 Branch 50 IF_ACMPEQ L665 - true
   * 2 com.allenstudio.ir.ui.calendar.MonthlyCalendar.mousePositionChanged(Ljava/awt/event/MouseEvent;)V: I36 Branch 51 IFLT L678 - false
   * 3 com.allenstudio.ir.ui.calendar.MonthlyCalendar.mousePositionChanged(Ljava/awt/event/MouseEvent;)V: I39 Branch 52 IF_ICMPGE L678 - false
   * 4 com.allenstudio.ir.ui.calendar.MonthlyCalendar.mousePositionChanged(Ljava/awt/event/MouseEvent;)V: I41 Branch 53 IFLT L678 - false
   * 5 com.allenstudio.ir.ui.calendar.MonthlyCalendar.mousePositionChanged(Ljava/awt/event/MouseEvent;)V: I44 Branch 54 IF_ICMPLT L678 - false
   * 6 com.allenstudio.ir.ui.calendar.MonthlyCalendar.mousePositionChanged(Ljava/awt/event/MouseEvent;)V: I50 Branch 55 IF_ICMPEQ L679 - true
   */
  @Test
  public void test8()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) monthlyCalendar0, 1756, 0L, 96, 96, 1756, 96, 36, 30, false, 96, 1756, 1756);
      monthlyCalendar0.mouseDragged((MouseEvent) mouseWheelEvent0);
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals(4, monthlyCalendar0.getMonth());
      assertEquals(true, monthlyCalendar0.getMouseListeningEnabled());
      assertEquals("com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", monthlyCalendar0.toString());
  }

  //Test case number: 9
  /*
   * 15 covered goals:
   * 1 com.allenstudio.ir.ui.calendar.MonthlyCalendar.mousePositionChanged(Ljava/awt/event/MouseEvent;)V: I39 Branch 52 IF_ICMPGE L678 - true
   * 2 com.allenstudio.ir.ui.calendar.MonthlyCalendar.<init>()V: root-Branch
   * 3 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I19 Branch 12 IF_ICMPNE L246 - true
   * 4 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I65 Branch 14 IFEQ L256 - false
   * 5 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I88 Branch 15 IF_ICMPGE L261 - true
   * 6 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I88 Branch 15 IF_ICMPGE L261 - false
   * 7 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I107 Branch 16 IF_ICMPGE L264 - true
   * 8 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I107 Branch 16 IF_ICMPGE L264 - false
   * 9 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I132 Branch 17 IF_ICMPGE L267 - true
   * 10 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setYearMonth(Ljava/util/Calendar;)V: I132 Branch 17 IF_ICMPGE L267 - false
   * 11 com.allenstudio.ir.ui.calendar.MonthlyCalendar.mousePositionChanged(Ljava/awt/event/MouseEvent;)V: I36 Branch 51 IFLT L678 - false
   * 12 com.allenstudio.ir.ui.calendar.MonthlyCalendar.mousePositionChanged(Ljava/awt/event/MouseEvent;)V: I50 Branch 55 IF_ICMPEQ L679 - true
   * 13 com.allenstudio.ir.ui.calendar.MonthlyCalendar.mouseDragged(Ljava/awt/event/MouseEvent;)V: I5 Branch 50 IF_ACMPEQ L665 - true
   * 14 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setMouseListeningEnabled(Z)V: I3 Branch 1 IFEQ L176 - false
   * 15 com.allenstudio.ir.ui.calendar.MonthlyCalendar.setMouseListeningEnabled(Z)V: I6 Branch 2 IFNE L176 - false
   */
  @Test
  public void test9()  throws Throwable  {
      MonthlyCalendar monthlyCalendar0 = new MonthlyCalendar();
      assertNotNull(monthlyCalendar0);
      
      MouseEvent mouseEvent0 = new MouseEvent((Component) monthlyCalendar0, 0, (long) 0, 0, 829, 29, 829, true);
      monthlyCalendar0.mouseDragged(mouseEvent0);
      assertEquals(4, monthlyCalendar0.getMonth());
      assertEquals(2014, monthlyCalendar0.getYear());
      assertEquals("java.awt.event.MouseEvent[unknown type,(829,29),absolute(0,0),button=0,clickCount=829] on com.allenstudio.ir.ui.calendar.MonthlyCalendar[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=java.awt.Dimension[width=189,height=140]]", mouseEvent0.toString());
  }
}
