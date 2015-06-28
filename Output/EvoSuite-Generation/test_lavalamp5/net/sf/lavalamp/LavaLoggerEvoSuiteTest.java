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
   * 1 covered goal:
   * 1 net.sf.lavalamp.LavaLogger.setErr(Ljava/io/PrintStream;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      LavaLogger.setErr((PrintStream) null);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 net.sf.lavalamp.LavaLogger.info(Ljava/util/Calendar;Ljava/lang/String;)V: root-Branch
   * 2 net.sf.lavalamp.LavaLogger.<init>()V: root-Branch
   * 3 net.sf.lavalamp.LavaLogger.info(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      LavaLogger lavaLogger0 = new LavaLogger();
      // Undeclared exception!
      try {
        lavaLogger0.info((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.LavaLogger.debug(Ljava/lang/String;)V: root-Branch
   * 2 net.sf.lavalamp.LavaLogger.debug(Ljava/util/Calendar;Ljava/lang/String;)V: I3 Branch 2 IFEQ L46 - true
   */
  @Test
  public void test2()  throws Throwable  {
      LavaLogger lavaLogger0 = new LavaLogger();
      lavaLogger0.debug("14dDt.N_X41Cr*jY");
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.LavaLogger.error(Ljava/lang/Throwable;)V: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      LavaLogger lavaLogger0 = new LavaLogger();
      // Undeclared exception!
      try {
        lavaLogger0.error((Throwable) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.LavaLogger.error(Ljava/util/Calendar;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      LavaLogger lavaLogger0 = new LavaLogger();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      // Undeclared exception!
      try {
        lavaLogger0.error((Calendar) gregorianCalendar0, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 net.sf.lavalamp.LavaLogger.error(Ljava/lang/String;)V: root-Branch
   * 2 net.sf.lavalamp.LavaLogger.<init>()V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      LavaLogger lavaLogger0 = new LavaLogger();
      // Undeclared exception!
      try {
        lavaLogger0.error(";");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.LavaLogger.setOut(Ljava/io/PrintStream;)V: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      LavaLogger.setOut((PrintStream) null);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 net.sf.lavalamp.LavaLogger.setDebug(Z)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      LavaLogger.setDebug(false);
  }
}
