/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xisemele.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.Date;
import net.sf.xisemele.exception.FormatterException;
import net.sf.xisemele.impl.DateFormatter;

public class DateFormatterEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.DateFormatter.type()Ljava/lang/Class;: root-Branch
   * 2 net.sf.xisemele.impl.DateFormatter.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DateFormatter dateFormatter0 = new DateFormatter("");
      Class<Date> class0 = dateFormatter0.type();
      assertEquals(1, class0.getModifiers());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 net.sf.xisemele.impl.DateFormatter.parse(Ljava/lang/String;)Ljava/util/Date;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      DateFormatter dateFormatter0 = new DateFormatter("");
      // Undeclared exception!
      try {
        dateFormatter0.parse("X^1[x]_<,pH|J");
        fail("Expecting exception: FormatterException");
      } catch(FormatterException e) {
        /*
         * N\u00E3o foi poss\u00EDvel criar uma inst\u00E2ncia de \"java.util.Date\" para o valor \"X^1[x]_<,pH|J\"
         */
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 net.sf.xisemele.impl.DateFormatter.format(Ljava/util/Date;)Ljava/lang/String;: root-Branch
   * 2 net.sf.xisemele.impl.DateFormatter.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      DateFormatter dateFormatter0 = new DateFormatter("");
      Date date0 = new Date();
      String string0 = dateFormatter0.format(date0);
      assertNotNull(string0);
      assertEquals(1433854846090L, date0.getTime());
  }
}
