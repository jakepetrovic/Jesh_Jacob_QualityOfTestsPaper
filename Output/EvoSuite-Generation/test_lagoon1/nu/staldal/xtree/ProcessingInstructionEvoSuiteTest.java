/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.xtree;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import nu.staldal.xtree.ProcessingInstruction;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

public class ProcessingInstructionEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 nu.staldal.xtree.ProcessingInstruction.toSAX(Lorg/xml/sax/ContentHandler;)V: root-Branch
   * 2 nu.staldal.xtree.ProcessingInstruction.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      ProcessingInstruction processingInstruction0 = new ProcessingInstruction("$?{dV55I[FyN}$ S t", "$?{dV55I[FyN}$ S t");
      // Undeclared exception!
      try {
        processingInstruction0.toSAX((ContentHandler) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.ProcessingInstruction.getTarget()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      ProcessingInstruction processingInstruction0 = new ProcessingInstruction("$?{dV55I[FyN}$ S t", "$?{dV55I[FyN}$ S t");
      String string0 = processingInstruction0.getTarget();
      assertNotNull(string0);
      assertEquals("$?{dV55I[FyN}$ S t", processingInstruction0.getValue());
      assertEquals("$?{dV55I[FyN}$ S t", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 nu.staldal.xtree.ProcessingInstruction.getValue()Ljava/lang/String;: root-Branch
   * 2 nu.staldal.xtree.ProcessingInstruction.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      ProcessingInstruction processingInstruction0 = new ProcessingInstruction("9g\"s%?Oy0C?G{f", ":~fp&iW }uv");
      String string0 = processingInstruction0.getValue();
      assertEquals("9g\"s%?Oy0C?G{f", processingInstruction0.getTarget());
      assertNotNull(string0);
      assertEquals(":~fp&iW }uv", string0);
  }
}
