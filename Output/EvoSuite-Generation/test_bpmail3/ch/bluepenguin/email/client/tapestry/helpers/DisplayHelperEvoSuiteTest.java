/*
 * This file was automatically generated by EvoSuite
 */

package ch.bluepenguin.email.client.tapestry.helpers;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import ch.bluepenguin.email.client.tapestry.helpers.DisplayHelper;
import java.util.Date;
import java.util.Locale;

public class DisplayHelperEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 ch.bluepenguin.email.client.tapestry.helpers.DisplayHelper.getSeparator()Ljava/lang/String;: root-Branch
   * 2 ch.bluepenguin.email.client.tapestry.helpers.DisplayHelper.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DisplayHelper displayHelper0 = new DisplayHelper();
      String string0 = displayHelper0.getSeparator();
      assertEquals(",", string0);
      assertNotNull(string0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 ch.bluepenguin.email.client.tapestry.helpers.DisplayHelper.setMyLocale(Ljava/util/Locale;)V: root-Branch
   * 2 ch.bluepenguin.email.client.tapestry.helpers.DisplayHelper.getMyLocale()Ljava/util/Locale;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DisplayHelper displayHelper0 = new DisplayHelper();
      Locale locale0 = displayHelper0.getMyLocale();
      assertNotNull(locale0);
      
      displayHelper0.setMyLocale(locale0);
      assertEquals(",", displayHelper0.getSeparator());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 ch.bluepenguin.email.client.tapestry.helpers.DisplayHelper.setSeparator(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DisplayHelper displayHelper0 = new DisplayHelper();
      displayHelper0.setSeparator("ba");
      assertEquals("ba", displayHelper0.getSeparator());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 ch.bluepenguin.email.client.tapestry.helpers.DisplayHelper.returnFormattedDate(Ljava/util/Date;)Ljava/lang/String;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      DisplayHelper displayHelper0 = new DisplayHelper();
      Date date0 = new Date();
      String string0 = displayHelper0.returnFormattedDate(date0);
      assertEquals(1433934732359L, date0.getTime());
      assertEquals("6/10/15", string0);
  }

  //Test case number: 4
  /*
   * 5 covered goals:
   * 1 ch.bluepenguin.email.client.tapestry.helpers.DisplayHelper.returnStringList([Ljava/lang/String;)Ljava/lang/String;: I14 Branch 1 IF_ICMPGE L24 - true
   * 2 ch.bluepenguin.email.client.tapestry.helpers.DisplayHelper.returnStringList([Ljava/lang/String;)Ljava/lang/String;: I14 Branch 1 IF_ICMPGE L24 - false
   * 3 ch.bluepenguin.email.client.tapestry.helpers.DisplayHelper.returnStringList([Ljava/lang/String;)Ljava/lang/String;: I30 Branch 2 IF_ICMPGE L26 - true
   * 4 ch.bluepenguin.email.client.tapestry.helpers.DisplayHelper.returnStringList([Ljava/lang/String;)Ljava/lang/String;: I30 Branch 2 IF_ICMPGE L26 - false
   * 5 ch.bluepenguin.email.client.tapestry.helpers.DisplayHelper.<init>()V: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      DisplayHelper displayHelper0 = new DisplayHelper();
      String[] stringArray0 = new String[7];
      String string0 = displayHelper0.returnStringList(stringArray0);
      assertNotNull(string0);
      assertEquals("null,null,null,null,null,null,null", string0);
  }
}
