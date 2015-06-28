/*
 * This file was automatically generated by EvoSuite
 */

package bierse.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import bierse.controller.DefaultSettingsController;
import bierse.model.Model;
import bierse.view.IDrinkSettingsView;
import bierse.view.ISettingsView;
import java.awt.event.ActionEvent;

public class DefaultSettingsControllerEvoSuiteTest {


  //Test case number: 0
  /*
   * 5 covered goals:
   * 1 bierse.controller.DefaultSettingsController.actionPerformed(Ljava/awt/event/ActionEvent;)V: I6 Branch 1 IFLE L31 - true
   * 2 bierse.controller.DefaultSettingsController.actionPerformed(Ljava/awt/event/ActionEvent;)V: I128 Branch 3 IFLE L49 - true
   * 3 bierse.controller.DefaultSettingsController.actionPerformed(Ljava/awt/event/ActionEvent;)V: I141 Branch 4 IFLE L51 - true
   * 4 bierse.controller.DefaultSettingsController.actionPerformed(Ljava/awt/event/ActionEvent;)V: I168 Branch 5 IFLE L55 - true
   * 5 bierse.controller.DefaultSettingsController.<init>(Lbierse/model/Model;Lbierse/view/ISettingsView;Lbierse/view/IDrinkSettingsView;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      ActionEvent actionEvent0 = new ActionEvent((Object) "SORT_ORDER_CHANGED", (-1611), "SORT_ORDER_CHANGED", 0);
      defaultSettingsController0.actionPerformed(actionEvent0);
      assertEquals(0, actionEvent0.getModifiers());
  }
}
