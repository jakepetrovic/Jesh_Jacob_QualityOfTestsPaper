/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.swing;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.DefaultFormatterFactory;
import org.databene.jdbacl.swing.TextFieldValueProvider;

public class TextFieldValueProviderEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 org.databene.jdbacl.swing.TextFieldValueProvider.getValue()Ljava/lang/String;: root-Branch
   * 2 org.databene.jdbacl.swing.TextFieldValueProvider.<init>(Ljavax/swing/JTextField;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      DefaultFormatterFactory defaultFormatterFactory0 = new DefaultFormatterFactory();
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField((JFormattedTextField.AbstractFormatterFactory) defaultFormatterFactory0, (Object) null);
      TextFieldValueProvider textFieldValueProvider0 = new TextFieldValueProvider((JTextField) jFormattedTextField0);
      String string0 = textFieldValueProvider0.getValue();
      assertEquals("", string0);
  }
}
