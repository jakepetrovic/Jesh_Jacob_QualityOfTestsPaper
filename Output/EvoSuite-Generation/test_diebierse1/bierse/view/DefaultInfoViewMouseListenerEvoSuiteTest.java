/*
 * This file was automatically generated by EvoSuite
 */

package bierse.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import bierse.view.DefaultInfoViewMouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class DefaultInfoViewMouseListenerEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 bierse.view.DefaultInfoViewMouseListener.mouseDragged(Ljava/awt/event/MouseEvent;)V: root-Branch
   * 2 bierse.view.DefaultInfoViewMouseListener.<init>(Ljavax/swing/JFrame;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DefaultInfoViewMouseListener defaultInfoViewMouseListener0 = new DefaultInfoViewMouseListener((JFrame) null);
      // Undeclared exception!
      try {
        defaultInfoViewMouseListener0.mouseDragged((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}