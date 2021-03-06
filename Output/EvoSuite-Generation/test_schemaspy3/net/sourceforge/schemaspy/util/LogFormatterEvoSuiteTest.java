/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import net.sourceforge.schemaspy.util.LogFormatter;

public class LogFormatterEvoSuiteTest {


  //Test case number: 0
  /*
   * 5 covered goals:
   * 1 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I69 Branch 1 IF_ICMPLE L96 - true
   * 2 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I86 Branch 2 IF_ICMPGE L99 - true
   * 3 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I86 Branch 2 IF_ICMPGE L99 - false
   * 4 net.sourceforge.schemaspy.util.LogFormatter.format(Ljava/util/logging/LogRecord;)Ljava/lang/String;: I110 Branch 3 IFNULL L105 - true
   * 5 net.sourceforge.schemaspy.util.LogFormatter.<init>()V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      LogFormatter logFormatter0 = new LogFormatter();
      assertNotNull(logFormatter0);
      
      Level level0 = Level.CONFIG;
      LogRecord logRecord0 = new LogRecord(level0, "");
      // Undeclared exception!
      try {
        logFormatter0.format(logRecord0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
