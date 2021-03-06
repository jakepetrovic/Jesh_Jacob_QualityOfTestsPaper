/*
 * This file was automatically generated by EvoSuite
 */

package com.allenstudio.ir.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import com.allenstudio.ir.ui.UIResources;
import java.util.MissingResourceException;

public class UIResourcesEvoSuiteTest {


  //Test case number: 0
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.UIResources.getString(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        UIResources.getString("y=>`-(%XRK/2UZc\"");
        fail("Expecting exception: MissingResourceException");
      } catch(MissingResourceException e) {
        /*
         * Can't find resource for bundle java.util.PropertyResourceBundle, key y=>`-(%XRK/2UZc\"
         */
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 com.allenstudio.ir.ui.UIResources.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      UIResources uIResources0 = new UIResources();
      assertNotNull(uIResources0);
  }
}
