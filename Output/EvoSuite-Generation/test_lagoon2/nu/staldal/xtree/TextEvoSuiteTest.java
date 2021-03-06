/*
 * This file was automatically generated by EvoSuite
 */

package nu.staldal.xtree;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import nu.staldal.xtree.Text;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

public class TextEvoSuiteTest {


  //Test case number: 0
  /*
   * 6 covered goals:
   * 1 nu.staldal.xtree.Text.<init>([CIIZ)V: I17 Branch 1 IFNE L70 - false
   * 2 nu.staldal.xtree.Text.<init>([CIIZ)V: I21 Branch 2 IF_ICMPNE L70 - false
   * 3 nu.staldal.xtree.Text.<init>([CIIZ)V: I23 Branch 3 IFNE L70 - false
   * 4 nu.staldal.xtree.Text.asCharArray()[C: root-Branch
   * 5 nu.staldal.xtree.Text.<init>(Ljava/lang/String;)V: root-Branch
   * 6 nu.staldal.xtree.Text.obtainCharArray()V: I4 Branch 4 IFNONNULL L96 - false
   */
  @Test
  public void test0()  throws Throwable  {
      Text text0 = new Text("");
      char[] charArray0 = text0.asCharArray();
      assertNotNull(charArray0);
      
      Text text1 = new Text(text0.charArrayCache, 0, 0, false);
      assertNotNull(text1);
      assertEquals(true, text0.isWhitespaceNode());
      assertEquals("", text0.getValue());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.Text.getValue()Ljava/lang/String;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      Text text0 = new Text("");
      String string0 = text0.getValue();
      assertNotNull(string0);
      assertEquals("", string0);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 nu.staldal.xtree.Text.isWhitespaceNode()Z: I17 Branch 6 IF_ICMPLE L123 - true
   * 2 nu.staldal.xtree.Text.<init>([CIIZ)V: I17 Branch 1 IFNE L70 - true
   * 3 nu.staldal.xtree.Text.isWhitespaceNode()Z: I9 Branch 5 IF_ICMPGE L121 - true
   * 4 nu.staldal.xtree.Text.isWhitespaceNode()Z: I9 Branch 5 IF_ICMPGE L121 - false
   */
  @Test
  public void test2()  throws Throwable  {
      char[] charArray0 = new char[3];
      Text text0 = new Text(charArray0, 1, 1, false);
      assertNotNull(text0);
      
      boolean boolean0 = text0.isWhitespaceNode();
      assertEquals("\u0000", text0.getValue());
      assertEquals(true, boolean0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.Text.<init>([CIIZ)V: I21 Branch 2 IF_ICMPNE L70 - true
   */
  @Test
  public void test3()  throws Throwable  {
      char[] charArray0 = new char[8];
      Text text0 = new Text(charArray0, 0, 0, false);
      assertNotNull(text0);
      assertEquals("", text0.getValue());
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * 1 nu.staldal.xtree.Text.<init>([CIIZ)V: I23 Branch 3 IFNE L70 - true
   * 2 nu.staldal.xtree.Text.<init>([CIIZ)V: I17 Branch 1 IFNE L70 - false
   * 3 nu.staldal.xtree.Text.<init>([CIIZ)V: I21 Branch 2 IF_ICMPNE L70 - false
   */
  @Test
  public void test4()  throws Throwable  {
      Text text0 = new Text("");
      char[] charArray0 = text0.asCharArray();
      assertNotNull(charArray0);
      
      Text text1 = new Text(text0.charArrayCache, 0, 0, true);
      assertNotNull(text1);
      assertEquals("", text0.getValue());
      assertEquals(true, text0.isWhitespaceNode());
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * 1 nu.staldal.xtree.Text.obtainCharArray()V: I4 Branch 4 IFNONNULL L96 - true
   * 2 nu.staldal.xtree.Text.asCharArray()[C: root-Branch
   * 3 nu.staldal.xtree.Text.toSAX(Lorg/xml/sax/ContentHandler;)V: root-Branch
   * 4 nu.staldal.xtree.Text.obtainCharArray()V: I4 Branch 4 IFNONNULL L96 - false
   */
  @Test
  public void test5()  throws Throwable  {
      Text text0 = new Text("3@D-=v f3$rk+teF");
      char[] charArray0 = text0.asCharArray();
      assertNotNull(charArray0);
      
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      text0.toSAX((ContentHandler) xMLFilterImpl0);
      assertEquals("3@D-=v f3$rk+teF", text0.getValue());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 nu.staldal.xtree.Text.isWhitespaceNode()Z: I9 Branch 5 IF_ICMPGE L121 - true
   */
  @Test
  public void test6()  throws Throwable  {
      Text text0 = new Text("");
      boolean boolean0 = text0.isWhitespaceNode();
      assertEquals(true, boolean0);
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * 1 nu.staldal.xtree.Text.isWhitespaceNode()Z: I9 Branch 5 IF_ICMPGE L121 - false
   * 2 nu.staldal.xtree.Text.isWhitespaceNode()Z: I17 Branch 6 IF_ICMPLE L123 - false
   * 3 nu.staldal.xtree.Text.<init>(Ljava/lang/String;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      Text text0 = new Text("!");
      boolean boolean0 = text0.isWhitespaceNode();
      assertEquals(false, boolean0);
      assertEquals("!", text0.getValue());
  }
}
