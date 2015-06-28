/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.schemaspy.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Collection;
import java.util.TreeSet;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.util.LineWriter;
import net.sourceforge.schemaspy.view.TextFormatter;

public class TextFormatterEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 net.sourceforge.schemaspy.view.TextFormatter.write(Ljava/util/Collection;ZLnet/sourceforge/schemaspy/util/LineWriter;)V: I8 Branch 1 IFEQ L40 - true
   * 2 net.sourceforge.schemaspy.view.TextFormatter.getInstance()Lnet/sourceforge/schemaspy/view/TextFormatter;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      TextFormatter textFormatter0 = TextFormatter.getInstance();
      TreeSet<Table> treeSet0 = new TreeSet<Table>();
      textFormatter0.write((Collection<Table>) treeSet0, false, (LineWriter) null);
      assertEquals("[]", treeSet0.toString());
  }
}
