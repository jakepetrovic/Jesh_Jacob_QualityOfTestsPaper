/*
 * This file was automatically generated by EvoSuite
 */

package bierse.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import bierse.view.DefaultInfoViewMouseListener;
import java.awt.Component;
import java.awt.event.MouseEvent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class DefaultInfoViewMouseListenerEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 bierse.view.DefaultInfoViewMouseListener.mouseClicked(Ljava/awt/event/MouseEvent;)V: I5 Branch 1 IF_ICMPNE L39 - true
   * 2 bierse.view.DefaultInfoViewMouseListener.<init>(Ljavax/swing/JFrame;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DefaultInfoViewMouseListener defaultInfoViewMouseListener0 = new DefaultInfoViewMouseListener((JFrame) null);
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      MouseEvent mouseEvent0 = new MouseEvent((Component) jDesktopPane0, 1, (-963L), (-1664), 1, 600, 0, true);
      defaultInfoViewMouseListener0.mouseClicked(mouseEvent0);
      assertEquals(false, mouseEvent0.isControlDown());
  }
}
