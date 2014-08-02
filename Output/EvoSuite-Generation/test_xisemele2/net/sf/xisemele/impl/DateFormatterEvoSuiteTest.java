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
      assertEquals("java.util.Date", class0.getCanonicalName());
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
        dateFormatter0.parse("");
        fail("Expecting exception: FormatterException");
      } catch(FormatterException e) {
        /*
         * N\u00E3o foi poss\u00EDvel criar uma inst\u00E2ncia de \"java.util.Date\" para o valor \"\"
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
      Date date0 = new Date(0L);
      String string0 = dateFormatter0.format(date0);
      assertEquals("", string0);
  }
}
