/*
 * This file was automatically generated by EvoSuite
 */

package bierse.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import bierse.controller.DefaultMenuController;
import bierse.model.Model;
import bierse.view.IDrinkSellView;
import java.awt.event.ActionEvent;

public class DefaultMenuControllerEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 bierse.controller.DefaultMenuController.actionPerformed(Ljava/awt/event/ActionEvent;)V: I6 Branch 1 IFLE L23 - true
   * 2 bierse.controller.DefaultMenuController.actionPerformed(Ljava/awt/event/ActionEvent;)V: I18 Branch 2 IFLE L25 - true
   * 3 bierse.controller.DefaultMenuController.<init>(Lbierse/model/Model;Lbierse/view/IDrinkSellView;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DefaultMenuController defaultMenuController0 = new DefaultMenuController((Model) null, (IDrinkSellView) null);
      ActionEvent actionEvent0 = new ActionEvent((Object) "borderPainted", 0, "borderPainted");
      defaultMenuController0.actionPerformed(actionEvent0);
      assertEquals(0L, actionEvent0.getWhen());
  }
}
