/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.IOException;
import net.sourceforge.schemaspy.util.LineWriter;
import net.sourceforge.schemaspy.view.HtmlRoutinesPage;

public class HtmlRoutinesPageEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.view.HtmlRoutinesPage.isRoutinesPage()Z: root-Branch
   * 2 net.sourceforge.schemaspy.view.HtmlRoutinesPage.getInstance()Lnet/sourceforge/schemaspy/view/HtmlRoutinesPage;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      HtmlRoutinesPage htmlRoutinesPage0 = HtmlRoutinesPage.getInstance();
      assertNotNull(htmlRoutinesPage0);
      
      boolean boolean0 = htmlRoutinesPage0.isRoutinesPage();
      assertEquals(true, boolean0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.view.HtmlRoutinesPage.writeFooter(Lnet/sourceforge/schemaspy/util/LineWriter;)V: root-Branch
   * 2 net.sourceforge.schemaspy.view.HtmlRoutinesPage.getInstance()Lnet/sourceforge/schemaspy/view/HtmlRoutinesPage;: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      HtmlRoutinesPage htmlRoutinesPage0 = HtmlRoutinesPage.getInstance();
      // Undeclared exception!
      try {
        htmlRoutinesPage0.writeFooter((LineWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
